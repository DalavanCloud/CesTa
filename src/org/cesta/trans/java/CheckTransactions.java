package org.cesta.trans.java;

import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.TreeNodeStream;
import org.cesta.parsers.java.CheckTransactionsParser;
import org.cesta.trans.TransformationException;
import org.cesta.types.MappedFile;

/**
 * This transformation is used to automatically detect and possibly repair
 * problems with code, which is executed during the transactions.
 *
 *
 * <p>Parameters:</p>
 * <table>
 *  <tr><th>Name</th><th>Type</th><th>Default</th><th>Description</th></tr>
 *  <tr>
 *      <td>nonatomicMethods</td>
 *      <td>String (special)</td>
 *      <td>Util.arrayFillNonAtomic and Util.arrayCopyNonAtomic. For details see source code."</td>
 *      <td>
 *          Qualified names of methods (regular expressions), that should be considered non-atomic ("," is delimiter).
 *          If modified variable is not in the first argument,
 *          please append correct number by ":" to the method name (first argument is 0).
 *      </td>
 *  </tr>
 * <tr>
 *      <td>startMethods</td>
 *      <td>String (regexp)</td>
 *      <td>JCSystem.beginTransaction</td>
 *      <td>
 *          Qualified name of methods, that should be considered as starts of transactions.
 *      </td>
 *  </tr>
 * <tr>
 *      <td>endMethods</td>
 *      <td>String (regexp)</td>
 *      <td>JCSystem.commitTransaction and JCSystem.abortTransaction.</td>
 *      <td>
 *          Qualified name of methods, that should be considered as ends of transactions.
 *      </td>
 *  </tr>
 * </table>
 *
 * <p>
 *  Basic parameters are inherited from {@link AbstractRewriteTransformation}.
 * </p>
 * @author Tobias Smolka
 */
public class CheckTransactions extends AbstractRewriteTransformation {

    /**
     * Transforms single file
     *
     * @param filePair File pair (input/output) to transform
     * @throws TransformationException In case transformation failed
     */
    @Override
    public void transform(MappedFile filePair) throws TransformationException {
        
        TreeNodeStream nodes = prepareTreeNodeStream(filePair);

        logger.fine("Calling CheckTransactions tree parser");
        try {
            CheckTransactionsParser checkTransactionsParser = new CheckTransactionsParser(nodes);
            checkTransactionsParser.setParams(getParams());
            checkTransactionsParser.setDefaultTemplateLib();
            checkTransactionsParser.javaSource();
        } catch (RecognitionException ex){
            throw new TransformationException("Parser could not process file.", ex);
        }

        writeTo(filePair);
    }
    /**
     * Returns default parameters
     * @return map of parameters
     */
    @Override
     public Map<String, Object> getDefaultParams(){
        Map<String, Object> params = super.getDefaultParams();
        params.put("nonatomicMethods", "javacard\\.framework\\.Util"
                + "\\.arrayFillNonAtomic,javacard\\.framework\\.Util\\.arrayCopyNonAtomic:2");
        params.put("startMethods", "javacard\\.framework\\.JCSystem\\.beginTransaction");
        params.put("endMethods", ".*(commit|abort)Transaction");
        return params;
     }
}
