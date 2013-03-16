package org.cesta.parsers.java;

import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.TreeNodeStream;
import org.antlr.stringtemplate.StringTemplate;

/**
 * Class containing pure Java methods for the IntegrityVariables transformation.
 * 
 * @author David Formanek
 */
public abstract class IntegrityVariablesMembers extends AbstractTreeParser {
    
    public IntegrityVariablesMembers(TreeNodeStream input) {
        super(input);
    }
    
    public IntegrityVariablesMembers(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }
    
    // parser members
    
    
    /**
     * Variable representation
     */
    public class Variable {
        private String name;
        private String type;

        public Variable(String name, String type) {
            this.name = name;
            this.type = type;
        }

        @Override
        public String toString() {
            return type + " " + name;
        }

        public String getType() {
            return type;
        }

        public String getName() {
            return name;
        }

        /**
         * Determine whether the variable represented by this instance is one
         * of the variables we want to transform (thus we can do it and want
         * to do it).
         * 
         * @return true if should, false otherwise
         */
        public boolean shouldBeTransformed() {
            // TODO: more considerations
            return (type != null) && isSupportedType();
        }

        public boolean isSupportedType() {
            return type.equals("boolean") || type.equals("byte");
        }
    }

    // TODO: remove
    public boolean isSupportedType(String type) {
        return type.equals("boolean") || type.equals("byte");
    }

    /**
     * Adds imports specified in "additionalImports" template.
     * 
     * @param tree place after the added imports
     */
    public void addImports(CommonTree tree) {
            if (tree != null) {
                getLogger().finer("Adding additional imports");
                StringTemplate st = getTemplateLib().getInstanceOf("additionalImports");
                tokens.insertBefore(tree.getTokenStartIndex(), st);
            }
    }

    /**
     * Adds special methods from templates to the class.
     * 
     * @param tree place before the added code
     */
    public void addCode(CommonTree tree) {
        // TODO: mask randomization
        StringTemplate st;

        st = getTemplateLib().getInstanceOf("declareBooleanSetter");
        st.setAttribute("trueValue", "0x55");
        st.setAttribute("falseValue", "0xAA");
        tokens.insertAfter(tree.getTokenStartIndex(), st);

        st = getTemplateLib().getInstanceOf("declareBooleanGetter");
        st.setAttribute("trueValue", "0x55");
        st.setAttribute("falseValue", "0xAA");
        tokens.insertAfter(tree.getTokenStartIndex(), st);

        st = getTemplateLib().getInstanceOf("declareByteSetter");
        st.setAttribute("mask", "0x55");
        tokens.insertAfter(tree.getTokenStartIndex(), st);

        st = getTemplateLib().getInstanceOf("declareByteGetter");
        st.setAttribute("mask", "0x55");
        tokens.insertAfter(tree.getTokenStartIndex(), st);

        // TODO: protection of a type short
    }

    /**
     * Replaces variable type in a declaration of a protected variable
     * according to the template.
     * 
     * @param tree tree with the old type
     * @param type the old type
     * @return true whether the type changed, false otherwise
     */
    public boolean replaceType(CommonTree tree, String type) {
        // TODO: check variables instead of a type only
        if (!isSupportedType(type)) {
            return false;
        }
        StringTemplate st = getTemplateLib().getInstanceOf("resistantType_" + type);
        replaceTree(st.toString(), tree);
        return true;
    }

    /**
     * Replaces a short assignment expression like 'left sign= right' where
     * 'left' is the name of a protected variable.
     * 
     * @param left name of the variable on the left side
     * @param right expression on the right side of assignment
     * @param sign the sign of the assignment: '+', '-', '*', '/', '&amp;',
     *        '|', '%', '&lt;&lt;&lt;', '&lt;&lt;' or '&gt;&gt;' 
     * @param var the variable from the left side
     * @param tree whole assignment tree
     */
    public void setAssign(String left, String right, String sign, Variable var, CommonTree tree) {
        if (!var.shouldBeTransformed()) {
            return;
        }
        StringTemplate st = getTemplateLib().getInstanceOf("unwrapAssign_" + var.getType());
        st.setAttribute("left", left);
        st.setAttribute("right", right);
        st.setAttribute("sign", sign);
        replaceTree(st.toString(), tree);
    }

    /**
     * Replaces simple assignment expression (only if variable is protected).
     * 
     * @param expression expression on the right side of the assignment
     * @param var the variable
     * @param tree only the right side of the assignment
     */
    public void setResistantType(String expression, Variable var, CommonTree tree) {
        if (!var.shouldBeTransformed()) {
            return;
        }
        StringTemplate st = getTemplateLib().getInstanceOf("set_" + var.getType());
        st.setAttribute("value", expression);
        replaceTree(st.toString(), tree);
    }

    /**
     * Replaces preincrementation or predecrementation of a protected variable.
     * 
     * @param var the variable which is incremented/decremented
     * @param sign '+' for incrementation, '-' for decrementation
     * @param tree whole incrementation/decrementation tree
     */
    public void setPreIncDec(Variable var, String sign, CommonTree tree) {
        if (!var.shouldBeTransformed()) {
            return;
        }
        StringTemplate st = getTemplateLib().getInstanceOf("unwrapPreIncrementation_" + var.getType());
        st.setAttribute("variable", var.getName());
        st.setAttribute("sign", sign);
        replaceTree(st.toString(), tree);
    }

    /**
     * Replaces postincrementation or postdecrementation of a protected variable.
     * 
     * @param var the variable which is incremented/decremented
     * @param sign '+' for incrementation, '-' for decrementation
     * @param tree whole incrementation/decrementation tree
     */
    public void setPostIncDec(Variable var, String sign, CommonTree tree) {
        if (!var.shouldBeTransformed()) {
            return;
        }
        // TODO: handle situations like 'a = i++'
        StringTemplate st = getTemplateLib().getInstanceOf("unwrapPostIncrementation_" + var.getType());
        st.setAttribute("variable", var.getName());
        st.setAttribute("sign", sign);
        replaceTree(st.toString(), tree);
    }

    /**
     * Adds getter to get the original value of a protected variable.
     * 
     * @param expression full variable name (primary expression)
     * @param var the variable
     * @param tree primary expression with the variable
     */
    public void getResistantType(String expression, Variable var, CommonTree tree) {
        assert var == null : "null variable"; 
        if (!var.shouldBeTransformed()) {
            return;
        }
        StringTemplate st = getTemplateLib().getInstanceOf("get_" + var.getType());
        st.setAttribute("value", expression);
        replaceTree(st.toString(), tree);
    }

    /**
     * Replaces the given tree with the given string.
     * 
     * @param str new content
     * @param tree original tree
     */
    public void replaceTree(String str, CommonTree tree) {
        tokens.replace(tree.getTokenStartIndex(), tree.getTokenStopIndex(), str);
    }
}
