package org.cesta.parsers.java;

import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.TreeNodeStream;
import org.antlr.stringtemplate.StringTemplate;

/**
 * Class containing pure Java methods for IntegrityVariables transformation.
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
    
    // TODO: add Javadoc
    
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

    public void addImports(CommonTree tree) {
            if (tree != null) {
                getLogger().finer("Adding additional imports");
                StringTemplate st = getTemplateLib().getInstanceOf("additionalImports");
                tokens.insertBefore(tree.getTokenStartIndex(), st);
            }
    }

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

    public boolean replaceType(CommonTree tree, String type) {
        // TODO: check variables instead of a type only
        if (!isSupportedType(type)) {
            return false;
        }
        StringTemplate st = getTemplateLib().getInstanceOf("resistantType_" + type);
        replaceTree(st.toString(), tree);
        return true;
    }

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

    public void setResistantType(String expression, Variable var, CommonTree tree) {
        if (!var.shouldBeTransformed()) {
            return;
        }
        StringTemplate st = getTemplateLib().getInstanceOf("set_" + var.getType());
        st.setAttribute("value", expression);
        replaceTree(st.toString(), tree);
    }

    public void setPreIncDec(Variable var, String sign, CommonTree tree) {
        if (!var.shouldBeTransformed()) {
            return;
        }
        StringTemplate st = getTemplateLib().getInstanceOf("unwrapPreIncrementation_" + var.getType());
        st.setAttribute("variable", var.getName());
        st.setAttribute("sign", sign);
        replaceTree(st.toString(), tree);
    }

    public void setPostIncDec(Variable var, String sign, CommonTree tree) {
        if (!var.shouldBeTransformed()) {
            return;
        }
        StringTemplate st = getTemplateLib().getInstanceOf("unwrapPostIncrementation_" + var.getType());
        st.setAttribute("variable", var.getName());
        st.setAttribute("sign", sign);
        replaceTree(st.toString(), tree);
    }

    public void getResistantType(String expression, Variable var, CommonTree tree) {
        if (var == null) { // the identifier is not a variable
            System.out.println("null variable: " + expression);
            return;
        }
        if (!var.shouldBeTransformed()) {
            return;
        }
        StringTemplate st = getTemplateLib().getInstanceOf("get_" + var.getType());
        st.setAttribute("value", expression);
        replaceTree(st.toString(), tree);
    }

    public void replaceTree(String str, CommonTree tree) {
        tokens.replace(tree.getTokenStartIndex(), tree.getTokenStopIndex(), str);
    }
}
