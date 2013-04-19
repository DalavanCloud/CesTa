/*
    Author: David Formanek

    some info
*/

tree grammar CSharp4Tree;

options {
    backtrack = true; 
    memoize = true;
    language = Java;
    //tokenVocab = CSharp4AST; // ignored when imported
    ASTLabelType = CommonTree;
    output = template;
    rewrite = true; // rewrites are performed (TokenRewriteStream is used)
}


//B.2 Syntactic grammar

//B.2.1 Basic concepts

/** namespace_or_type_name */
namespace_name 
    :    namespace_or_type_name
    ;

type_name 
    :    namespace_or_type_name
    ;

// added by chw
namespace_or_type_name
    :    ^(NAMESPACE_OR_TYPE_NAME  namespace_or_type_name2)
    ;

namespace_or_type_name2
    :    ( IDENTIFIER type_argument_list_opt | qualified_alias_member )
         namespace_part*
    ;

/* added by chw to solve a bug: IDENTIFIER of namespace_or_type_name2 is correctly parsed
    but not inserted into the AST */
namespace_part
    :    ^(NAMESPACE_OR_TYPE_PART IDENTIFIER type_argument_list_opt?)
    ;

/** represents type_argument_list? */
// added by chw
// ???
//type_argument_list_opt
//    : (type_argument_list) => type_argument_list  //-> ^(TYPE_ARGUMENT_LIST type_argument_list)
//    | /* empty */ //-> ^(TYPE_ARGUMENT_LIST /* empty */)
//    ;
type_argument_list_opt
    :    type_argument_list
    ;

//B.2.2 Types

type
    :    ^(TYPE type2)
    ;

// added by chw
// ???
type2
    :    base_type ( INTERR | rank_specifier | STAR)*
    ;

// added by chw
base_type
    :    simple_type
    |    class_type  // represents types: enum, class, interface, delegate, type_parameter
    |    VOID STAR
    ;

/** primitive types */
simple_type 
    :    numeric_type
    |    BOOL
    ;

numeric_type 
    :    integral_type
    |    floating_point_type
    |    DECIMAL
    ;

integral_type 
    :    SBYTE
    |    BYTE
    |    SHORT
    |    USHORT
    |    INT
    |    UINT
    |    LONG
    |    ULONG
    |    CHAR
    ;

floating_point_type 
    :    FLOAT
    |    DOUBLE
    ;

nullable_type 
    :    non_nullable_value_type INTERR
    ;

// type without INTERR; undocumented but VS checks for this constraint
// ???
non_nullable_value_type 
    : base_type (rank_specifier | STAR)*
    ;

// ???
reference_type 
    :    ( simple_type | class_type | VOID STAR )
         ((STAR | INTERR)* rank_specifier)+
    ;

/** type_name, OBJECT, "dynamic", STRING */
class_type 
    :    type_name
    |    OBJECT
    |    dynamic_contextual_keyword
    |    STRING
    ;

/** type_name */
interface_type 
    :    type_name
    ;

/** type_name */
delegate_type 
    :    type_name
    ;

type_argument_list 
    :    ^(TYPE_ARGUMENT_LIST type_arguments)
    ;

type_arguments 
    :    type_argument type_argument*
    ;

type_argument 
    :    type
    ;

// added by chw
type_void
    :    ^(TYPE VOID)
    ;

//B.2.3 Variables

/** expression */
variable_reference 
    :    expression
    ;

//B.2.4 Expressions

argument_list 
    :    argument+
    ;

argument
    :    ^(ARGUMENT argument_name? argument_value)
    ;

argument_name
    :    IDENTIFIER
    ;

argument_value 
    :    ^(ARGUMENT_VALUE argument_value2)
    ;

argument_value2
    :    expression
    |    REF variable_reference
    |    OUT variable_reference
    ;

// ???
primary_expression 
    :    primary_expression_start
         ( ^(bracket_expression primary_expression) )*
         ( 
             ( ^(MEMBER_ACCESS primary_expression member_access2)
             | ^(METHOD_INVOCATION primary_expression method_invocation2?)
             | ^(POST_INC primary_expression)
             | ^(POST_DEC primary_expression)
             | primary_expression ^(OP_PTR  IDENTIFIER)
             )

	    ( ^(bracket_expression  primary_expression) )*
         )*
    ;

// ???
primary_expression_start
    :    literal
    |    simple_name
    |    parenthesized_expression
    |    predefined_type // member_access
    |    qualified_alias_member  // member_access
    |    this_access
    |    base_access
    |    ^(object_creation_expression2 NEW type)
    |    NEW ( type ( object_or_collection_initializer
                    | OPEN_BRACKET expression_list CLOSE_BRACKET
                      rank_specifiers? array_initializer?
                    | rank_specifiers array_initializer
                    )
              | anonymous_object_initializer
              | rank_specifier array_initializer
              )
    |    typeof_expression
    |    checked_expression
    |    unchecked_expression
    |    default_value_expression
    |    anonymous_method_expression
//    |    sizeof_expression
    ;

bracket_expression
    :    ^(ARRAY_ACCESS expression_list)
    ;


/** IDENTIFIER type_argument_list? <br>
  (only used in primary_expression_start)
*/
simple_name 
    :    ^(SIMPLE_NAME IDENTIFIER type_argument_list_opt?)
    ;

/** OPEN_PARENS expression CLOSE_PARENS */
parenthesized_expression 
    :    expression
    ;

/** primary_expression */
member_access 
    :    primary_expression
    ;

predefined_type 
    :    BOOL
    |    BYTE
    |    CHAR
    |    DECIMAL
    |    DOUBLE
    |    FLOAT
    |    INT
    |    LONG
    |    OBJECT
    |    SBYTE
    |    SHORT
    |    STRING
    |    UINT
    |    ULONG
    |    USHORT
    ;

expression_list 
    :    expression (COMMA expression)*
    ;

this_access 
    :    THIS
    ;

/** BASE and more */
base_access
    :    BASE IDENTIFIER type_argument_list_opt
    |    BASE OPEN_BRACKET expression_list CLOSE_BRACKET
    ;

/** NEW type (OPEN_PARENS ... | OPEN_BRACE ...) */
object_creation_expression 
    :    NEW type ( OPEN_PARENS argument_list? CLOSE_PARENS
                    object_or_collection_initializer?
                  | object_or_collection_initializer
                  )
    ;

/** starts with OPEN_BRACE */
object_or_collection_initializer 
    :    object_initializer
    |    collection_initializer
    ;

/** starts with OPEN_BRACE */
object_initializer 
    :    OPEN_BRACE CLOSE_BRACE
    |    OPEN_BRACE member_initializer_list COMMA? CLOSE_BRACE
    ;

member_initializer_list 
    :    member_initializer (COMMA member_initializer)*
    ;

member_initializer 
    :    IDENTIFIER ASSIGNMENT initializer_value
    ;

initializer_value 
    :    expression
    |    object_or_collection_initializer
    ;

/** starts with OPEN_BRACE */
collection_initializer 
    :    OPEN_BRACE element_initializer_list COMMA? CLOSE_BRACE
    ;

element_initializer_list 
    :    element_initializer (COMMA element_initializer)*
    ;

element_initializer 
    :    non_assignment_expression
    |    OPEN_BRACE expression_list CLOSE_BRACE
    ;

array_creation_expression 
    :    NEW ( array_type array_initializer
             | non_array_type OPEN_BRACKET expression_list CLOSE_BRACKET
               rank_specifiers? array_initializer?
             | rank_specifier array_initializer
             )
    ;

/** NEW delegate_type OPEN_PARENS expression CLOSE_PARENS */
delegate_creation_expression 
    :    NEW delegate_type OPEN_PARENS expression CLOSE_PARENS
    ;

/** starts with NEW OPEN_BRACE */
anonymous_object_creation_expression 
    :    NEW anonymous_object_initializer
    ;

/** starts with OPEN_BRACE */
anonymous_object_initializer 
    :    OPEN_BRACE CLOSE_BRACE
    |    OPEN_BRACE member_declarator_list COMMA? CLOSE_BRACE
    ;

member_declarator_list 
    :    member_declarator (COMMA member_declarator)*
    ;

member_declarator 
    :    primary_expression
    |    IDENTIFIER ASSIGNMENT expression
    ;

typeof_expression 
    :    TYPEOF OPEN_PARENS
	 ( unbound_type_name CLOSE_PARENS
	 | type CLOSE_PARENS
	 | VOID CLOSE_PARENS
	 )
    ;

unbound_type_name 
    :    IDENTIFIER ( generic_dimension_specifier?
                    | DOUBLE_COLON IDENTIFIER generic_dimension_specifier?
                    )
         (DOT IDENTIFIER generic_dimension_specifier?)*
    ;

generic_dimension_specifier 
    :    LT commas? GT
    ;

commas 
    :    COMMA+
    ;

checked_expression 
    :    ^(CHECKED expression)
    ;

unchecked_expression 
    :    ^(UNCHECKED expression)
    ;

default_value_expression 
    :    ^(DEFAULT type)
    ;

unary_expression 
    :    ^(UNARY_EXPRESSION unary_expression2)
    ;

unary_expression2
    :    cast_expression
    |    primary_expression
    |    PLUS unary_expression
    |    MINUS unary_expression
    |    ^(BOOL_NOT unary_expression)
    |    TILDE unary_expression
    |    pre_increment_expression
    |    pre_decrement_expression
//    |    unary_expression_unsafe
    ;

// The sequence of tokens is correct grammar for a type, and the token immediately
// following the closing parentheses is the token TILDE, the token BANG, the token OPEN_PARENS,
// an IDENTIFIER, a literal, or any keyword except AS and IS.
scan_for_cast_generic_precedence
    :    OPEN_PARENS type CLOSE_PARENS cast_disambiguation_token
    ;

// One of these tokens must follow a valid cast in an expression, in order to
// eliminate a grammar ambiguity.
cast_disambiguation_token
    : (TILDE | BANG | OPEN_PARENS | IDENTIFIER | literal | ABSTRACT | BASE | BOOL | BREAK | BYTE | CASE | CATCH
    | CHAR | CHECKED | CLASS | CONST | CONTINUE | DECIMAL | DEFAULT | DELEGATE | DO | DOUBLE | ELSE | ENUM
    | EVENT | EXPLICIT | EXTERN | FINALLY | /*FIXED |*/ FLOAT | FOR | FOREACH | GOTO | IF | IMPLICIT | IN | INT
    | INTERFACE | INTERNAL | LOCK | LONG | NAMESPACE | NEW | OBJECT | OPERATOR | OUT | OVERRIDE | PARAMS
    | PRIVATE | PROTECTED | PUBLIC | READONLY | REF | RETURN | SBYTE | SEALED | SHORT | SIZEOF | STACKALLOC
    | STATIC | STRING | STRUCT | SWITCH | THIS | THROW | TRY | TYPEOF | UINT | ULONG | UNCHECKED | UNSAFE
    | USHORT | USING | VIRTUAL | VOID | VOLATILE | WHILE
    )
    ;

pre_increment_expression 
    :    OP_INC unary_expression
    ;

pre_decrement_expression 
    :    OP_DEC unary_expression
    ;

cast_expression 
    :    ^(CAST_EXPRESSION type unary_expression)
    ;

// ???
multiplicative_expression 
    :    unary_expression
         ( ^(STAR multiplicative_expression unary_expression)
         | ^(DIV multiplicative_expression unary_expression)
         | ^(PERCENT multiplicative_expression unary_expression)
         )*
    ;

additive_expression 
    :    multiplicative_expression
         ( ^(PLUS additive_expression multiplicative_expression)
         | ^(MINUS additive_expression multiplicative_expression)
         )*
    ;

shift_expression 
    :    additive_expression
         ( ^(OP_LEFT_SHIFT shift_expression additive_expression)
         | ^(right_shift shift_expression additive_expression)
         )*
    ;

relational_expression 
    :    shift_expression
         ( ^(LT relational_expression shift_expression)
         | ^(GT relational_expression shift_expression)
         | ^(OP_LE relational_expression shift_expression)
         | ^(OP_GE relational_expression shift_expression)
         | ^(IS relational_expression isType)
         | ^(AS relational_expression type)
         )*
    ;

// added by chw
isType
    :    non_nullable_value_type INTERR?
    ;

is_disambiguation_token
    :    CLOSE_PARENS
    | OP_AND
    | OP_OR
    | INTERR
    ;

equality_expression 
    :    relational_expression
         ( ^(OP_EQ equality_expression relational_expression)
         | ^(OP_NE equality_expression relational_expression)
         )*
    ;

and_expression 
    :    equality_expression
         ( ^(AMP and_expression equality_expression)
         )*
    ;

exclusive_or_expression 
    :    and_expression
         ( ^(CARET exclusive_or_expression and_expression)
         )*
    ;

inclusive_or_expression 
    :    exclusive_or_expression
         ( ^(BITWISE_OR inclusive_or_expression exclusive_or_expression)
         )*
    ;

conditional_and_expression 
    :     inclusive_or_expression
          ( ^(OP_AND conditional_and_expression inclusive_or_expression)
          )*
    ;

conditional_or_expression 
    :    conditional_and_expression
         ( ^(OP_OR conditional_or_expression conditional_and_expression)
         )*
    ;

null_coalescing_expression
    :    conditional_or_expression
    |    ^(OP_COALESCING conditional_or_expression null_coalescing_expression)
    ;

/** starts with unary_expression */
conditional_expression
    :    null_coalescing_expression
         ( ^(CONDITIONAL_EXPRESSION ^(THEN expression) ^(ELSE expression)) )?
    ;

/** starts with OPEN_PARENS or IDENTIFIER */
lambda_expression 
    :    anonymous_function_signature right_arrow anonymous_function_body
    ;

/** starts with DELEGATE */
anonymous_method_expression 
    :    ^(DELEGATE explicit_anonymous_function_signature? block)
    ;

/** starts with OPEN_PARENS or IDENTIFIER */
anonymous_function_signature 
    :    OPEN_PARENS CLOSE_PARENS
    |    OPEN_PARENS explicit_anonymous_function_parameter_list CLOSE_PARENS
    |    OPEN_PARENS implicit_anonymous_function_parameter_list CLOSE_PARENS
    |    implicit_anonymous_function_parameter
    ;

explicit_anonymous_function_signature 
    :    OPEN_PARENS explicit_anonymous_function_parameter_list? CLOSE_PARENS
    ;

explicit_anonymous_function_parameter_list 
    :    explicit_anonymous_function_parameter
         (COMMA explicit_anonymous_function_parameter)*
    ;

explicit_anonymous_function_parameter 
    :    anonymous_function_parameter_modifier? type IDENTIFIER
    ;

anonymous_function_parameter_modifier 
    :    REF
    |    OUT
    ;

implicit_anonymous_function_signature 
    :    OPEN_PARENS implicit_anonymous_function_parameter_list? CLOSE_PARENS
    |    implicit_anonymous_function_parameter
    ;

implicit_anonymous_function_parameter_list 
    :    implicit_anonymous_function_parameter
         (COMMA implicit_anonymous_function_parameter)*
    ;

/** IDENTIFIER */
implicit_anonymous_function_parameter 
    :    IDENTIFIER
    ;

anonymous_function_body 
    :    expression
    |    block
    ;

/** starts with from_contextual_keyword */
query_expression 
    :    from_clause query_body
    ;

from_clause 
    :    from_contextual_keyword type? IDENTIFIER IN expression
    ;

query_body 
    :    query_body_clauses? select_or_group_clause query_continuation?
    ;

query_body_clauses 
    :    query_body_clause query_body_clause*
    ;

query_body_clause 
    :    from_clause
    |    let_clause
    |    where_clause
    |    combined_join_clause
    |    orderby_clause
    ;

let_clause 
    :    let_contextual_keyword IDENTIFIER ASSIGNMENT expression
    ;

where_clause 
    :    where_contextual_keyword boolean_expression
    ;

join_clause 
    :    join_contextual_keyword type? IDENTIFIER IN
         expression on_contextual_keyword expression equals_contextual_keyword
         expression
    ;

join_into_clause 
    :    join_contextual_keyword type? IDENTIFIER IN
         expression on_contextual_keyword expression equals_contextual_keyword
         expression into_contextual_keyword IDENTIFIER
    ;

// added by chw
combined_join_clause
    :    join_contextual_keyword type? IDENTIFIER IN expression
         on_contextual_keyword expression equals_contextual_keyword
         expression (into_contextual_keyword IDENTIFIER)?
    ;

orderby_clause 
    :    orderby_contextual_keyword orderings
    ;

orderings 
    :    ordering (COMMA  ordering)*
    ;

ordering 
    :    expression ordering_direction?
    ;

ordering_direction 
    :    ascending_contextual_keyword
    |    descending_contextual_keyword
    ;

select_or_group_clause 
    :    select_clause
    |    group_clause
    ;

select_clause 
    :    select_contextual_keyword expression
    ;

group_clause 
    :    group_contextual_keyword expression by_contextual_keyword expression
    ;

/** starts with into_contextual_keyword */
query_continuation 
    :    into_contextual_keyword IDENTIFIER query_body
    ;

/** starts with unary_expression */
assignment 
    :    ^(assignment_operator unary_expression expression)
    ;

assignment_operator
    :    ^(ASSIGNMENT_OPERATOR assignment_operator2)
    ;

assignment_operator2
    :    ASSIGNMENT
    |    OP_ADD_ASSIGNMENT
    |    OP_SUB_ASSIGNMENT
    |    OP_MULT_ASSIGNMENT
    |    OP_DIV_ASSIGNMENT
    |    OP_MOD_ASSIGNMENT
    |    OP_AND_ASSIGNMENT
    |    OP_OR_ASSIGNMENT
    |    OP_XOR_ASSIGNMENT
    |    OP_LEFT_SHIFT_ASSIGNMENT
    |    right_shift_assignment
    ;

expression 
    :    assignment
    |    non_assignment_expression
    ;

non_assignment_expression
    :    lambda_expression
    |    query_expression
    |    conditional_expression
    ;

constant_expression 
    :    expression
    ;

boolean_expression 
    :    expression
    ;

//B.2.5 Statements
statement 
    :    labeled_statement
    |    declaration_statement
    |    embedded_statement
    ;

embedded_statement 
    :    block
    |    empty_statement
    |    expression_statement
    |    selection_statement
    |    iteration_statement
    |    jump_statement
    |    try_statement
    |    checked_statement
    |    unchecked_statement
    |    lock_statement
    |    using_statement
    |    yield_statement
 //   |    embedded_statement_unsafe
    ;

/** starts with OPEN_BRACE */
block 
    :    ^(BLOCK statement_list?)
    ;

statement_list 
    :    statement+
    ;

empty_statement 
    :    SEMICOLON
    ;

/** starts with IDENTIFIER COLON */
labeled_statement 
    :    ^(LABELED_STATEMENT IDENTIFIER statement)
    ;

/** starts with type, VAR, or CONST */
declaration_statement 
    :    local_variable_declaration
    |    local_constant_declaration
    ;

local_variable_declaration 
    :    local_variable_declarators
    ;

local_variable_type 
    :    type // includes 'var'
    ;

/** starts with IDENTIFIER */
local_variable_declarators 
    :    ( ^(LOCAL_VARIABLE_DECLARATOR local_variable_declarator) )+
    ;

local_variable_declarator 
    :    IDENTIFIER local_variable_initializer?
    ;

local_variable_initializer
    :    ^(LOCAL_VARIABLE_INITIALIZER local_variable_initializer2)
    ;

local_variable_initializer2
    :    expression
    |    array_initializer
//    |    local_variable_initializer_unsafe
    ;

// ???
local_constant_declaration 
    :    constant_declarators
    ;

expression_statement
    :    ^(EXPRESSION_STATEMENT statement_expression)
    ;

// primary_expression includes invocation_expression,
//    object_creation_expression, post_increment_expression, and post_decrement_expression
statement_expression 
    :    expression
    ;

/** if or switch */
selection_statement 
    :    if_statement
    |    switch_statement
    ;

// ???
if_statement 
    :    ^(IF ^(CONDITION boolean_expression)
              ^(THEN embedded_statement)
              ( ^(ELSE embedded_statement) )?
          )
    ;

switch_statement 
    :    ^(SWITCH OPEN_PARENS expression CLOSE_PARENS switch_block)
    ;

switch_block 
    :    OPEN_BRACE switch_sections? CLOSE_BRACE
    ;

switch_sections 
    :    switch_section+
    ;

switch_section 
    :    switch_labels statement_list
    ;

switch_labels 
    :    switch_label+
    ;

switch_label 
    :    CASE constant_expression COLON
    |    DEFAULT COLON
    ;

/** while, do, for, foreach */
iteration_statement 
    :    while_statement
    |    do_statement
    |    for_statement
    |    foreach_statement
    ;

while_statement 
    :    ^(WHILE ^(CONDITION boolean_expression)
                 ^(LOOP_BODY embedded_statement)
          )
    ;

do_statement 
    :    ^(DO ^(CONDITION boolean_expression)
              ^(LOOP_BODY embedded_statement)
          )
    ;

for_statement 
    :    ^(FOR ( ^(FOR_INITIALIZER for_initializer) )?
               ( ^(CONDITION for_condition) )?
               ( ^(FOR_ITERATOR  for_iterator) )?
               ^(LOOP_BODY embedded_statement)
          )
    ;

for_initializer 
    :    local_variable_declaration
    |    statement_expression_list
    ;

for_condition 
    :    boolean_expression
    ;

for_iterator 
    :    statement_expression_list
    ;

statement_expression_list 
    :    statement_expression (COMMA  statement_expression)*
    ;

foreach_statement 
    :    ^(FOREACH local_variable_type IDENTIFIER ^(IN expression) embedded_statement)
    ;

jump_statement 
    :    break_statement
    |    continue_statement
    |    goto_statement
    |    return_statement
    |    throw_statement
    ;

break_statement 
//    :    ^(BREAK)
    :    BREAK
    ;

continue_statement 
//    :    ^(CONTINUE)
    :    CONTINUE
    ;

goto_statement 
    :    ^(GOTO IDENTIFIER SEMICOLON)
    |    ^(GOTO CASE constant_expression SEMICOLON)
    |    ^(GOTO DEFAULT SEMICOLON)
    ;

return_statement 
    :    ^(RETURN expression?)
    ;

throw_statement 
    :    ^(THROW expression?)
    ;

try_statement 
    :    ^(TRY block catch_clauses? finally_clause?)
    ;

catch_clauses 
    :    specific_catch_clauses general_catch_clause?
    |    general_catch_clause
    ;

specific_catch_clauses 
    :    specific_catch_clause+
    ;

specific_catch_clause 
    :    ^(CATCH OPEN_PARENS class_type IDENTIFIER? CLOSE_PARENS block)
    ;

general_catch_clause 
    :    ^(CATCH block)
    ;

finally_clause 
    :    ^(FINALLY block)
    ;

checked_statement 
    :    ^(CHECKED block)
    ;

unchecked_statement 
    :    ^(UNCHECKED block)
    ;

lock_statement 
    :    ^(LOCK OPEN_PARENS expression CLOSE_PARENS embedded_statement)
    ;

using_statement 
    :    ^(USING OPEN_PARENS resource_acquisition CLOSE_PARENS embedded_statement)
    ;

resource_acquisition 
    :    local_variable_declaration
    |    expression
    ;

yield_statement 
    :    yield_contextual_keyword RETURN expression SEMICOLON
    |    yield_contextual_keyword BREAK SEMICOLON
    ;


//B.2.6 Namespaces;

// entry point
compilation_unit 
    :    extern_alias_directives? using_directives? global_attribute_section*
         namespace_member_declarations?
    ;

namespace_declaration 
    :    ^(NAMESPACE qualified_identifier namespace_body)
    ;

qualified_identifier 
    :    ^(QUALIFIED_IDENTIFIER IDENTIFIER+)
    ;

namespace_body 
    :    extern_alias_directives? using_directives? namespace_member_declarations?
    ;

extern_alias_directives
    :    ^(EXTERN_ALIAS_DIRECTIVES extern_alias_directive+)
    ;

extern_alias_directive
    :    ^(EXTERN IDENTIFIER)
    ;

using_directives 
    :    ^(USING_DIRECTIVES using_directive+)
    ;

using_directive 
    :    using_alias_directive
    |    using_namespace_directive
    ;

using_alias_directive 
    :    ^(USING_ALIAS_DIRECTIVE IDENTIFIER namespace_or_type_name)
    ;

using_namespace_directive 
    :    ^(USING_NAMESPACE_DIRECTIVE namespace_name)
    ;

namespace_member_declarations 
    :    ^(NAMESPACE_MEMBER_DECLARATIONS namespace_member_declaration+)
    ;

namespace_member_declaration 
    :    namespace_declaration
    |    type_declaration
    ;

type_declaration 
    :    ^(class_definition attributes? all_member_modifiers?)
    |    ^(struct_definition attributes? all_member_modifiers?)
    |    ^(interface_definition attributes? all_member_modifiers?)
    |    ^(enum_definition attributes? all_member_modifiers?)
    |    ^(delegate_definition attributes? all_member_modifiers?)
    ;

/** starts with IDENTIFIER DOUBLE_COLON */
qualified_alias_member 
    :    ^(QUALIFIED_ALIAS_MEMBER IDENTIFIER IDENTIFIER type_argument_list_opt?)
    ;

//B.2.7 Classes;
// not used anymore
class_declaration 
    :    attributes? class_modifiers? partial_contextual_keyword? CLASS
         IDENTIFIER type_parameter_list? class_base?
         type_parameter_constraints_clauses? class_body SEMICOLON?
    ;

class_modifiers 
    :    class_modifier ( class_modifier )*
    ;

class_modifier 
    :    NEW
    |    PUBLIC
    |    PROTECTED
    |    INTERNAL
    |    PRIVATE
    |    ABSTRACT
    |    EALED
    |    STATIC
//    |    class_modifier_unsafe
    ;

type_parameter_list 
    :    type_parameters
    ;

type_parameters 
    :    ^(TYPE_PARAMETERS attributed_type_parameter+)
    ;

attributed_type_parameter
    :   ^(TYPE_PARAM attributes? type_parameter)
    ;

type_parameter 
    :    IDENTIFIER
    ;

// class_type includes interface_type
class_base 
    :    ^(EXTENDS_OR_IMPLEMENTS  class_type  interface_type*)
    ;

interface_type_list 
    :    ^(IMPLEMENTS interface_type+)
    ;

type_parameter_constraints_clauses 
    :    ^(TYPE_PARAMETER_CONSTRAINTS_CLAUSES type_parameter_constraints_clause+)
    ;

type_parameter_constraints_clause 
    :    ^(TYPE_PARAMETER_CONSTRAINTS_CLAUSE type_parameter type_parameter_constraints)
    ;

type_parameter_constraints 
    :    constructor_constraint
    |    primary_constraint (COMMA secondary_constraints)? (COMMA constructor_constraint)?
    ;

primary_constraint 
    :    class_type
    |    CLASS
    |    STRUCT
    ;

// interface_type includes type_parameter
secondary_constraints
    :    interface_type (COMMA interface_type)*
    ;

constructor_constraint 
    :    NEW OPEN_PARENS CLOSE_PARENS
    ;

class_body 
    :    class_member_declarations?
    ;

class_member_declarations 
    :    ^(CLASS_MEMBER_DECLARATIONS class_member_declaration+)
    ;

class_member_declaration
    :    ^(common_member_declaration attributes? all_member_modifiers?)
    |    ^(destructor_definition attributes? all_member_modifiers?)
    ;

// added by chw
// combines all available modifiers
all_member_modifiers
    :    ^(MODIFIERS all_member_modifier+)
    ;

all_member_modifier
    :    NEW
    |    PUBLIC
    |    PROTECTED
    |    INTERNAL
    |    PRIVATE
    |    READONLY
    |    VOLATILE
    |    VIRTUAL
    |    SEALED
    |    OVERRIDE
    |    ABSTRACT
    |    STATIC
    |    UNSAFE
    |    EXTERN
    |    partial_contextual_keyword
    ;

// added by chw
common_member_declaration
    :    constant_declaration2
    |    typed_member_declaration
    |    event_declaration2
    |    ^(conversion_operator_declarator operator_body)
    |    constructor_declaration2 // constructor_declaration and static_constructor_declaration
    |    ^(method_declaration2 type_void)  // we use type_void instead of VOID to switch rules
    |    class_definition
    |    struct_definition
    |    interface_definition
    |    enum_definition
    |    delegate_definition
    ;

// added by chw
typed_member_declaration
    :    ^(indexer_declaration2 interface_type type)
    |    ^(method_declaration2 type)
    |    ^(property_declaration2 type)
    |    ^(indexer_declaration2 type)
    |    ^(operator_declaration2 type)
    |    ^(field_declaration2 type)
    ;

constant_declarators
    :    ^(CONSTANT_DECLARATORS constant_declarator+)
    ;

// ??? 
constant_declarator
    :    ^(CONSTANT_DECLARATOR IDENTIFIER ^(CONSTANT_INITIALIZER constant_expression))
    ;

/** starts with IDENTIFIER */
variable_declarators
    :    variable_declarator variable_declarator*
    ;

// ???
variable_declarator
    :    ^(VARIABLE_DECLARATOR variable_declarator2)
    ;

variable_declarator2
    :    IDENTIFIER variable_initializer?
    ;

variable_initializer
    :    ^(VARIABLE_INITIALIZER  variable_initializer2)
    ;

variable_initializer2
    : expression
    | array_initializer
    ;

method_declaration 
    : method_header method_body
    ;

method_header 
    :    attributes? method_modifiers? partial_contextual_keyword? return_type
         member_name type_parameter_list? OPEN_PARENS formal_parameter_list?
         CLOSE_PARENS type_parameter_constraints_clauses?
    ;

method_modifiers 
    :    method_modifier+
    ;

method_modifier 
    :    NEW
    |    PUBLIC
    |    PROTECTED
    |    INTERNAL
    |    PRIVATE
    |    STATIC
    |    VIRTUAL
    |    SEALED
    |    OVERRIDE
    |    ABSTRACT
    |    EXTERN
//    |    method_modifier_unsafe
    ;

/** type | VOID */
return_type 
    :    type
    |    VOID
    ;

/** interface_type */
member_name 
    :    ^(MEMBER_NAME interface_type)
    ;

method_body 
    :    block
    ;

formal_parameter_list 
    :    ^(FORMAL_PARAMETER_LIST parameter_array )
    |    ^(FORMAL_PARAMETER_LIST  fixed_parameters  parameter_array?)
    ;

fixed_parameters 
    :    fixed_parameter fixed_parameter*
    ;

// ? - TODO add | '__arglist' etc.
fixed_parameter
    :    ^(FIXED_PARAMETER attributes? parameter_modifier? type IDENTIFIER default_argument?)
    |    ^(FIXED_PARAMETER arglist)
    ;

default_argument 
    :    expression
    ;

parameter_modifier 
    :    ^(PARAMETER_MODIFIER parameter_modifier2)
    ;

parameter_modifier2
    :    REF
    |    OUT
    |    THIS
    ;

parameter_array 
    :    ^(PARAMETER_ARRAY attributes? array_type IDENTIFIER)
    ;

property_declaration 
    :    attributes? property_modifiers? type member_name OPEN_BRACE
         accessor_declarations CLOSE_BRACE
    ;

property_modifiers 
    :    property_modifier+
    ;

property_modifier 
    :    NEW
    |    PUBLIC
    |    PROTECTED
    |    INTERNAL
    |    PRIVATE
    |    STATIC
    |    VIRTUAL
    |    SEALED
    |    OVERRIDE
    |    ABSTRACT
    |    EXTERN
//    |    property_modifier_unsafe
    ;

accessor_declarations 
    :    attributes? accessor_modifier? 
         ( get_contextual_keyword accessor_body set_accessor_declaration?
         | set_contextual_keyword accessor_body get_accessor_declaration? )
    ;

get_accessor_declaration 
    :    attributes? accessor_modifier? get_contextual_keyword accessor_body
    ;

set_accessor_declaration 
    :    attributes? accessor_modifier? set_contextual_keyword accessor_body
    ;

accessor_modifier 
    :    PROTECTED
    |    INTERNAL
    |    PRIVATE
    |    PROTECTED INTERNAL
    |    INTERNAL PROTECTED
    ;

accessor_body 
    :    block
    |    SEMICOLON
    ;

event_modifiers 
    :    event_modifier+
    ;

event_modifier 
    :    NEW
    |    PUBLIC
    |    PROTECTED
    |    INTERNAL
    |    PRIVATE
    |    STATIC
    |    VIRTUAL
    |    SEALED
    |    OVERRIDE
    |    ABSTRACT
    |    EXTERN
 //   |    event_modifier_unsafe
    ;

event_accessor_declarations 
    :    attributes?
	 ( add_contextual_keyword block remove_accessor_declaration
	 | remove_contextual_keyword block add_accessor_declaration)
    ;

add_accessor_declaration 
    :    attributes? add_contextual_keyword block
    ;

remove_accessor_declaration 
    :    attributes? remove_contextual_keyword block
    ;

indexer_declaration 
    :    attributes? indexer_modifiers? indexer_declarator OPEN_BRACE
         accessor_declarations CLOSE_BRACE
    ;

indexer_modifiers 
    :    indexer_modifier indexer_modifier*
    ;

indexer_modifier 
    :    NEW
    |    PUBLIC
    |    PROTECTED
    |    INTERNAL
    |    PRIVATE
    |    VIRTUAL
    |    SEALED
    |    OVERRIDE
    |    ABSTRACT
    |    EXTERN
 //   |    indexer_modifier_unsafe
    ;

indexer_declarator 
    :    type (interface_type DOT)? THIS OPEN_BRACKET formal_parameter_list CLOSE_BRACKET
    ;

operator_declaration 
    :    attributes? operator_modifiers operator_declarator operator_body
    ;

operator_modifiers 
    :    operator_modifier operator_modifier*
    ;

operator_modifier 
    :    PUBLIC
    |    STATIC
    |    EXTERN
//    |    operator_modifier_unsafe
    ;

operator_declarator 
    :    unary_operator_declarator
    |    binary_operator_declarator
    |    conversion_operator_declarator
    ;

unary_operator_declarator 
    :    type OPERATOR overloadable_unary_operator OPEN_PARENS type IDENTIFIER CLOSE_PARENS
    ;

overloadable_unary_operator 
    :    PLUS
    |    MINUS
    |    BANG
    |    TILDE
    |    OP_INC
    |    OP_DEC
    |    TRUE
    |    FALSE
    ;

binary_operator_declarator 
    :    type OPERATOR overloadable_binary_operator OPEN_PARENS type IDENTIFIER
         COMMA type IDENTIFIER CLOSE_PARENS
    ;

overloadable_binary_operator 
    :    PLUS
    |    MINUS
    |    STAR
    |    DIV
    |    PERCENT
    |    AMP
    |    BITWISE_OR
    |    CARET
    |    OP_LEFT_SHIFT
    |    right_shift
    |    OP_EQ
    |    OP_NE
    |    GT
    |    LT
    |    OP_GE
    |    OP_LE
    ;

// added by chw
/** includes the unary and the binary operators */
overloadable_operator
    :    PLUS
    |    MINUS
    |    BANG
    |    TILDE
    |    OP_INC
    |    OP_DEC
    |    TRUE
    |    FALSE
    |    STAR
    |    DIV
    |    PERCENT
    |    AMP
    |    BITWISE_OR
    |    CARET
    |    OP_LEFT_SHIFT
    |    right_shift
    |    OP_EQ
    |    OP_NE
    |    GT
    |    LT
    |    OP_GE
    |    OP_LE
    ;

/** starts with IMPLICIT or EXPLICIT */
conversion_operator_declarator
    :    ^(IMPLICIT OPERATOR type OPEN_PARENS type IDENTIFIER CLOSE_PARENS)
    |    ^(EXPLICIT OPERATOR type OPEN_PARENS type IDENTIFIER CLOSE_PARENS)
    ;

operator_body 
    :    block
    |    SEMICOLON
    ;

constructor_declaration 
    :    attributes? constructor_modifiers? constructor_declarator constructor_body
    ;

constructor_modifiers 
    :    constructor_modifier+
    ;

constructor_modifier 
    :    PUBLIC
    |    PROTECTED
    |    INTERNAL
    |    PRIVATE
    |    EXTERN
 //   |    constructor_modifier_unsafe
    ;

constructor_declarator 
    :    IDENTIFIER OPEN_PARENS formal_parameter_list? CLOSE_PARENS
         constructor_initializer?
    ;

constructor_initializer 
    :    COLON BASE OPEN_PARENS argument_list? CLOSE_PARENS
    |    COLON THIS OPEN_PARENS argument_list? CLOSE_PARENS
    ;

constructor_body 
    :    block
    |    SEMICOLON
    ;

/*
static_constructor_declaration 
    :    attributes? static_constructor_modifiers IDENTIFIER OPEN_PARENS
         CLOSE_PARENS static_constructor_body
    ;

*/

/*
static_constructor_modifiers 
    :    static_constructor_modifiers_unsafe
    ;
*/

static_constructor_body 
    :    block
    |    SEMICOLON
    ;

/*
destructor_declaration 
    :    destructor_declaration_unsafe
    ;
*/

destructor_body 
    :    block
    |    SEMICOLON
    ;

// added by chw
body
    :    block
    |    SEMICOLON
    ;

//B.2.8 Structs
/** is not used anymore */
struct_declaration 
    :    attributes? struct_modifiers? partial_contextual_keyword? 
	 STRUCT IDENTIFIER type_parameter_list? struct_interfaces?
         type_parameter_constraints_clauses? struct_body SEMICOLON?
    ;

struct_modifiers 
    :    struct_modifier struct_modifier*
    ;

struct_modifier 
    :    NEW
    |    PUBLIC
    |    PROTECTED
    |    INTERNAL
    |    PRIVATE
//    |    struct_modifier_unsafe
    ;

struct_interfaces 
    :    interface_type_list
    ;

struct_body 
    :    struct_member_declarations?
    ;

struct_member_declarations 
    :    ^(STRUCT_MEMBER_DECLARATIONS struct_member_declaration+)
    ;

struct_member_declaration
    :    ^(common_member_declaration attributes? all_member_modifiers?)
//    |    ^(FIXED attributes? all_member_modifiers? buffer_element_type
//           fixed_size_buffer_declarators)
    ;

//B.2.9 Arrays
/** non_array_type rank_specifiers */
array_type 
    :    ^(TYPE array_type2)
    ;

array_type2
    :    base_type ((STAR | INTERR)* rank_specifier)+
    ;

/** type */
non_array_type 
    :    ^(TYPE non_array_type2)
    ;

non_array_type2 
    :    base_type (rank_specifier | INTERR | STAR)*
    ;

/** starts with OPEN_BRACKET */
rank_specifiers 
    :    rank_specifier+
    ;

/** OPEN_BRACKET dim_separators? CLOSE_BRACKET */
rank_specifier 
    :    ^(RANK_SPECIFIER dim_separators?)
    ;

dim_separators 
    :    COMMA+
    ;

/** starts with OPEN_BRACE */
array_initializer 
    :    OPEN_BRACE CLOSE_BRACE
    |    OPEN_BRACE variable_initializer_list COMMA? CLOSE_BRACE
    ;

variable_initializer_list 
    :    variable_initializer (COMMA  variable_initializer)*
    ;

//B.2.10 Interfaces
interface_declaration 
    :    attributes? interface_modifiers? partial_contextual_keyword?
         INTERFACE IDENTIFIER variant_type_parameter_list? interface_base?
         type_parameter_constraints_clauses? interface_body SEMICOLON?
    ;

interface_modifiers 
    :    interface_modifier interface_modifier*
    ;

interface_modifier 
    :    NEW
    |    PUBLIC
    |    PROTECTED
    |    INTERNAL
    |    PRIVATE
//    |    interface_modifier_unsafe
    ;

variant_type_parameter_list 
    :    variant_type_parameters
    ;

variant_type_parameters 
    :    ^(VARIANT_TYPE_PARAMETERS attributed_variance_type_parameter+)
    ;

// added by chw for modularization purposes
attributed_variance_type_parameter
    : attributes? variance_annotation? type_parameter
    ;

variance_annotation 
    :    ^(VARIANCE_ANNOTATION IN)
    |    ^(VARIANCE_ANNOTATION OUT)
    ;

interface_base 
    :    interface_type_list
    ;

interface_body 
    :    interface_member_declarations?
    ;

interface_member_declarations 
    :    ^(INTERFACE_MEMBER_DECLARATIONS interface_member_declaration+)
    ;

interface_member_declaration 
    :    ^(interface_method_declaration2 attributes? NEW? type)
    |    ^(interface_property_declaration2 attributes? NEW? type)
    |    ^(interface_indexer_declaration2 attributes? NEW? type)
    |    ^(interface_method_declaration2 attributes? NEW? type_void)
    |    ^(interface_event_declaration2 attributes? NEW?)
    ;

interface_method_declaration 
    :    attributes? NEW? return_type IDENTIFIER type_parameter_list?
         OPEN_PARENS formal_parameter_list? CLOSE_PARENS
         type_parameter_constraints_clauses? SEMICOLON
    ;

interface_property_declaration 
    :    attributes? NEW? type IDENTIFIER OPEN_BRACE interface_accessors CLOSE_BRACE
    ;

interface_accessors 
    :    attributes?
         ( get_contextual_keyword SEMICOLON (attributes? set_contextual_keyword SEMICOLON)?
         | set_contextual_keyword SEMICOLON (attributes? get_contextual_keyword SEMICOLON)? )
    ;

interface_event_declaration 
    :    attributes? NEW? EVENT type IDENTIFIER SEMICOLON
    ;

interface_indexer_declaration 
    :    attributes? NEW? type THIS OPEN_BRACKET formal_parameter_list
         CLOSE_BRACKET OPEN_BRACE interface_accessors CLOSE_BRACE
    ;

//B.2.11 Enums
enum_declaration 
    :    attributes? enum_modifiers? ENUM IDENTIFIER enum_base? enum_body SEMICOLON?
    ;

enum_base 
    :    ^(ENUM_EXTENDS integral_type)
    ;

enum_body 
    :    enum_member_declarations
    ;

enum_modifiers 
    :    enum_modifier+
    ;

enum_modifier 
    :    NEW
    |    PUBLIC
    |    PROTECTED
    |    INTERNAL
    |    PRIVATE
    ;

enum_member_declarations 
    :    ^(ENUM_MEMBER_DECLARATIONS enum_member_declaration+)
    ;

enum_member_declaration 
    :    ^(ENUM_MEMBER_DECLARATION attributes? IDENTIFIER
             ( ^(ENUM_MEMBER_INITIALIZER constant_expression) )?
          )
    ;

//B.2.12 Delegates
/** is not used anymore */
delegate_declaration 
    :    attributes? delegate_modifiers? DELEGATE return_type IDENTIFIER
         variant_type_parameter_list? OPEN_PARENS formal_parameter_list?
         CLOSE_PARENS type_parameter_constraints_clauses? SEMICOLON
    ;

delegate_modifiers 
    :    delegate_modifier delegate_modifier*
    ;

delegate_modifier 
    :    NEW
    |    PUBLIC
    |    PROTECTED
    |    INTERNAL
    |    PRIVATE
 //   |    delegate_modifier_unsafe
    ;

//B.2.13 Attributes
global_attribute_sections 
    :    global_attribute_section+
    ;

global_attribute_section 
    :    global_attribute_target_specifier attribute_list
    ;

global_attribute_target_specifier 
    :    global_attribute_target
    ;

global_attribute_target 
    :    keyword
    |    IDENTIFIER
    ;

attributes 
    :    attribute_sections
    ;

attribute_sections 
    :    ^(ATTRIBUTES attribute_section+)
    ;

attribute_section 
    :    attribute_target_specifier? attribute_list
    ;

attribute_target_specifier 
    :    ^(ATTRIBUTE_TARGET attribute_target)
    ;

attribute_target 
    :    keyword
    |    IDENTIFIER
    ;

attribute_list 
    :    ^(ATTRIBUTE_LIST  attribute+)
    ;

attribute 
    :    ^(ATTRIBUTE attribute_name attribute_arguments?)
    ;

attribute_name 
    :    ^(ATTRIBUTE_NAME type_name)
    ;

/* positional_argument_list includes named_argument_list */ 
attribute_arguments 
    :    positional_argument_list?
    ;

positional_argument_list 
    :    ^(POSITIONAL_ARGUMENT_LIST  positional_argument+)
    ;

/** expression */
positional_argument 
    :    attribute_argument_expression
    ;

/** starts with "IDENTIFIER ASSIGNMENT expression" */
named_argument_list 
    :    named_argument (COMMA named_argument)*
    ;

/** IDENTIFIER ASSIGNMENT expression */
named_argument 
    :    IDENTIFIER ASSIGNMENT attribute_argument_expression
    ;

attribute_argument_expression 
    :    expression
    ;


///////////////////////////////////////
// extension for unsafe code missing //
///////////////////////////////////////


// ---------------------------------- rules not defined in the original parser 


from_contextual_keyword
    :    IDENTIFIER
    ;
let_contextual_keyword
    :    IDENTIFIER
    ;
where_contextual_keyword
    :    IDENTIFIER
    ;
join_contextual_keyword
    :    IDENTIFIER
    ;
on_contextual_keyword
    :    IDENTIFIER
    ;
equals_contextual_keyword
    :    IDENTIFIER
    ;
into_contextual_keyword
    :    IDENTIFIER
    ;
orderby_contextual_keyword
    :    IDENTIFIER
    ;
ascending_contextual_keyword
    :    IDENTIFIER
    ;
descending_contextual_keyword
    :    IDENTIFIER
    ;
select_contextual_keyword
    :    IDENTIFIER
    ;
group_contextual_keyword
    :    IDENTIFIER
    ;
by_contextual_keyword
    :    IDENTIFIER
    ;
partial_contextual_keyword
    :    IDENTIFIER
    ;
alias_contextual_keyword
    :    IDENTIFIER
    ;
yield_contextual_keyword
    :    IDENTIFIER
    ;
get_contextual_keyword
    :    IDENTIFIER
    ;
set_contextual_keyword
    :    IDENTIFIER
    ;
add_contextual_keyword
    :    IDENTIFIER
    ;
remove_contextual_keyword
    :    IDENTIFIER
    ;
dynamic_contextual_keyword
    :    IDENTIFIER
    ;
arglist
    :    IDENTIFIER
    ;

right_arrow
    :    ASSIGNMENT GT
    ;

right_shift
    :    OP_RIGHT_SHIFT
    ;

right_shift_assignment
    :    OP_RIGHT_SHIFT_ASSIGNMENT
    ;

literal
    :    boolean_literal
    |    INTEGER_LITERAL
    |    REAL_LITERAL
    |    CHARACTER_LITERAL
    |    STRING_LITERAL
    |    NULL
    ;

boolean_literal
    :    TRUE
    |    FALSE
    ;

//B.1.7 Keywords
keyword
    :    ABSTRACT | AS | BASE | BOOL | BREAK | BYTE | CASE | CATCH | CHAR 
    |    CHECKED | CLASS | CONST | CONTINUE | DECIMAL | DEFAULT | DELEGATE
    |    DO | DOUBLE | ELSE | ENUM | EVENT | EXPLICIT | EXTERN | FALSE | FINALLY
    |    /*FIXED |*/ FLOAT | FOR | FOREACH | GOTO | IF | IMPLICIT | IN | INT
    |    INTERFACE | INTERNAL | IS | LOCK | LONG | NAMESPACE | NEW | NULL
    |    OBJECT | OPERATOR | OUT | OVERRIDE | PARAMS | PRIVATE | PROTECTED
    |    PUBLIC | READONLY | REF | RETURN | SBYTE | SEALED | SHORT | SIZEOF
    |    STACKALLOC | STATIC | STRING | STRUCT | SWITCH | THIS | THROW | TRUE
    |    TRY | TYPEOF | UINT | ULONG | UNCHECKED | UNSAFE | USHORT | USING
    |    VIRTUAL | VOID | VOLATILE | WHILE
    ;


// -------------------- extra rules for modularization ------------------------

class_definition
    :    ^(CLASS IDENTIFIER type_parameter_list? class_base?
           type_parameter_constraints_clauses? class_body)
    ;

struct_definition
    :    ^(STRUCT IDENTIFIER type_parameter_list? struct_interfaces?
           type_parameter_constraints_clauses? struct_body)
    ;

interface_definition
    :    ^(INTERFACE IDENTIFIER variant_type_parameter_list? interface_base?
           type_parameter_constraints_clauses? interface_body)
    ;

enum_definition
    :    ^(ENUM IDENTIFIER enum_base? enum_body)
    ;

delegate_definition
    :    ^(DELEGATE return_type IDENTIFIER variant_type_parameter_list?
           OPEN_PARENS formal_parameter_list? CLOSE_PARENS
           type_parameter_constraints_clauses?)
    ;

// ???
event_declaration2
    :    ^(EVENT variable_declarators)
    |    ^(EVENT type member_name event_accessor_declarations)
    ;

field_declaration2
    :    ^(FIELD_DECL variable_declarators)
    ;

property_declaration2
    :    ^(PROPERTY_DECL  member_name  accessor_declarations)
    ;

// ???
constant_declaration2
    :    constant_declarators
    ;

indexer_declaration2
    :    ^(INDEXER_DECL formal_parameter_list  accessor_declarations)
    ;

destructor_definition
    :    ^(TILDE IDENTIFIER destructor_body)
    ;

constructor_declaration2
    :    ^(CONSTRUCTOR_DECL IDENTIFIER formal_parameter_list?
           constructor_initializer?  body)
    ;

method_declaration2
    :    ^(METHOD_DECL method_member_name type_parameter_list?
           formal_parameter_list? type_parameter_constraints_clauses?
           method_body? )
    ;

// added by chw to allow detection of type parameters for methods
method_member_name
    :    ^(MEMBER_NAME ^(NAMESPACE_OR_TYPE_NAME method_member_name2))
    ;

method_member_name2
    :    (IDENTIFIER | IDENTIFIER DOUBLE_COLON IDENTIFIER)
         (type_argument_list_opt DOT IDENTIFIER)*
    ;

operator_declaration2
    :    ^(OPERATOR overloadable_operator ^(FIRST_OP type IDENTIFIER)
                                          ^(SECOND_OP type? IDENTIFIER?)
          operator_body)
    ;

// ???
interface_method_declaration2
    :    ^(METHOD_DECL MEMBER_NAME type_parameter_list? formal_parameter_list?
           type_parameter_constraints_clauses?)
    ;

// ???
interface_property_declaration2
    :    ^(PROPERTY_DECL MEMBER_NAME interface_accessors)
    ;

interface_event_declaration2
    :    ^(EVENT type IDENTIFIER)
    ;

interface_indexer_declaration2
    :    ^(INDEXER_DECL formal_parameter_list interface_accessors)
    ;

/** starts with DOT IDENTIFIER */
member_access2
    :    IDENTIFIER type_argument_list_opt
    ;

method_invocation2
    :    argument_list?
    ;

object_creation_expression2
    :    ^(OBJECT_CREATION_EXPRESSION argument_list? object_or_collection_initializer?)
    ;
