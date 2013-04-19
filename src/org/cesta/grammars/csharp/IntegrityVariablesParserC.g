/**
 * Version of Integrity variables parser transformation for C#.
 **/
tree grammar IntegrityVariablesParserC;

options {
    superClass = TreeParser;
    backtrack = true; 
    memoize = true;
    tokenVocab = CSharp4PreProcessor;
    ASTLabelType = CommonTree;
    output = template;
    rewrite = true;
}

import CSharp4Tree;

@treeparser::header {
package org.cesta.parsers.csharp.generated;

}

@treeparser::members {	
    
}

// entry point
compilation_unit
    :    extern_alias_directives? using_directives? global_attribute_section*
         namespace_member_declarations?
    ;
