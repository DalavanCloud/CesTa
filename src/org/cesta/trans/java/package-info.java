/**
 * Classes for Java transformations.
 * 
 * <p>The package contains useful abstract class
 * {@link org.cesta.trans.java.AbstractRewriteTransformation} and one class
 * named after transformation for each Java transformation</p>
 * <h2>Adding a new Java transformation</h2><p>
 * Perform the following steps to add a new transformation:<ol>
 * <li>Write a grammar matching code you want to transform, create new nodes if
 * needed and call your actions on it</li>
 * <li>Create templates for the transformed code to be able to easily modify it
 * without changing the grammars</li>
 * <li>Configure Ant to automatically generate parsers from your grammars</li>
 * <li>Create a transformation class to transform files using the parsers
 * generated from your grammars</li>
 * <li>Write some tests containing expressions to transform</li>
 * <li>Configure Ant to transform test classes using the new transformation</li>
 * </ol></p><h3>Writing a grammar</h3><p>
 * Use <code>JavaTreeParser.g</code> as a pattern for your tree grammar. You can
 * import this grammar not to copy all the rules and make the code much shorter.
 * Set {@link org.cesta.parsers.java.AbstractTreeParser} as a super class of the
 * generated parser. An example grammar of "MyTransformation" could be:
 * <code><pre>
 * tree grammar MyTransformationParser;
 *
 * options {
 *     superClass = AbstractTreeParser;
 *     backtrack = true;
 *     memoize = true;
 *     tokenVocab = Java;
 *     ASTLabelType = CommonTree;
 *     output = template;
 *     rewrite = true;
 *     }
 *     
 * import JavaTreeParser;
 *     
 * {@literal @}treeparser::header {
 *     package org.cesta.parsers.java;
 *     // add imports for your code
 * }
 *     
 * {@literal @}treeparser::members {
 *     // code to be add to the generated parser
 * }
 *     
 * // Starting point for parsing a Java file.
 * javaSource
 *     :   ^(JAVA_SOURCE annotationList packageDeclaration? importDeclaration* typeDeclaration*)
 *     ;
 * 
 * // Other rules
 * </pre></code>
 * Other rules can be copied from <code>JavaTreeParser.g</code> and modified but
 * you can create your own tree of nodes too.</p>
 * <p>If there is a lot of code you would place into members section, you can
 * create a separate class "MyTransformationMembers":
 * <code><pre>
 * public abstract class MyTransformationMembers extends AbstractTreeParser {
    
    public MyTransformationMembers(TreeNodeStream input) {
        super(input);
    }
    
    public IntegrityVariablesMembers(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }
    
    // parser members
    }
 * </pre></code> and set this class as a superclass in the grammar options</p>
 * <p>Add this code to the <code>&lt;target name="antlr-transformations"&gt;
 * </code> section in <code>build.xml</code> file with Ant settings
 * to generate parser <code>MyTransformationParser.java</code> automatically:
 * <code><pre>
 * &lt;antlr3-compile grammar.name="MyTransformationParser.g"
 *     grammar.package="org.cesta.grammars.java"
 *     parser.package="org.cesta.parsers.java.generated"/&gt;
 * </pre></code></p><h3>Creating a transformation class</h3><p>
 * A transformation class for a transformation "MyTransformation" using
 * one parser can look like this:<code><pre>
 * package org.cesta.trans.java;
 *
 * import java.util.Map;
 * import org.antlr.runtime.RecognitionException;
 * import org.antlr.runtime.tree.TreeNodeStream;
 * import org.cesta.parsers.java.generated.MyTransformationParser;
 * import org.cesta.trans.TransformationException;
 * import org.cesta.types.MappedFile;
 * 
 * public class MyTransformation extends AbstractRewriteTransformation {
 * 
 *     {@literal @}Override
 *     public void transform(MappedFile filePair) throws TransformationException {
 *      
 *         TreeNodeStream nodes = prepareTreeNodeStream(filePair);
 *         logger.fine("Calling MyTransformation tree parser");
 *         try {
 *             MyTransformationParser parser = new MyTransformationParser(nodes);
 *             parser.setParams(getParams());
 *             parser.setDefaultTemplateLib();
 *             parser.javaSource();
 *         } catch (RecognitionException ex){
 *             throw new TransformationException("Parser could not process file.", ex);
 *         }
 *         writeTo(filePair);
 *     }
 * }
 * </pre></code>You can use
 * {@link org.cesta.trans.java.AbstractRewriteTransformation#prepareTreeNodeStream()}
 * when two (or more) parsers are used as in
 * {@link org.cesta.trans.java.IfSwitchReplacement}. Override the method
 * {@link org.cesta.trans.java.AbstractRewriteTransformation#getDefaultParams}
 * to set the default parameters of the transformation.</p>
 */
package org.cesta.trans.java;
