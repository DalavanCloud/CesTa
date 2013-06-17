/**
 * Version of Integrity variables parser transformation for C#.
 **/
tree grammar IntegrityVariablesParserC;

options {
    superClass = AbstractTreeParserC;
    backtrack = true; 
    memoize = true;
    tokenVocab = CSharp4AST;
    ASTLabelType = CommonTree;
    output = template;
    rewrite = true;
}

import CSharp4Tree;

@treeparser::header {
package org.cesta.parsers.csharp.generated;

import org.cesta.parsers.csharp.AbstractTreeParserC;
}

@treeparser::members {	
    
}

csharpSource 
    :   ^(CSHARP_SOURCE /*extern_alias_directives? using_directives?
          global_attribute_section**/ namespace_member_declarations?)
    ;

// entry point
//compilation_unit
//    @init {	
//                   System.out.println("compilation_unit");
//	  }
//    :    extern_alias_directives? using_directives? global_attribute_section*
//         namespace_member_declarations?
//    :    ^(COMPILATION_UNIT extern_alias_directives? using_directives? global_attribute_section*
//         namespace_member_declarations?)
//    ;

/*
extern_alias_directives
    @init {	
                   System.out.println("extern_alias_directives");
	  }
    :    ^(EXTERN_ALIAS_DIRECTIVES extern_alias_directive+)
    ;

using_directives
    @init {	
                   System.out.println("using_directives");
	  }
    :    ^(USING_DIRECTIVES using_directive+)
    ;

global_attribute_section
    @init {	
                   System.out.println("global_attribute_section");
	  }
    :    global_attribute_target_specifier attribute_list
    ;

*/
namespace_member_declarations
    @init {	
                   System.out.println("namespace_member_declarations");
	  }
    :    ^(NAMESPACE_MEMBER_DECLARATIONS namespace_member_declaration+)
    ;

namespace_member_declaration 
    :    /*namespace_declaration
    |*/    type_declaration
    ;

//???
type_declaration 
    @init {	
                   System.out.println("type_declarations");
	  }
    :    class_definition
/*    |    struct_definition
    |    interface_definition
    |    enum_definition
    |    delegate_definition*/
    ;

class_definition
    :    ^(CLASS IDENTIFIER {System.out.println($IDENTIFIER.text);} /*type_parameter_list? class_base?
           type_parameter_constraints_clauses?*/ class_body)
    ;
