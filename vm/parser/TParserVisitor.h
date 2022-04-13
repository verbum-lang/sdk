
// Generated from ./TParser.g4 by ANTLR 4.9.2

#pragma once


#include "antlr4-runtime.h"
#include "TParser.h"


namespace verbum {

/**
 * This class defines an abstract visitor for a parse tree
 * produced by TParser.
 */
class  TParserVisitor : public antlr4::tree::AbstractParseTreeVisitor {
public:

  /**
   * Visit parse trees produced by TParser.
   */
    virtual antlrcpp::Any visitMain(TParser::MainContext *context) = 0;

    virtual antlrcpp::Any visitFileContent(TParser::FileContentContext *context) = 0;

    virtual antlrcpp::Any visitSentence(TParser::SentenceContext *context) = 0;

    virtual antlrcpp::Any visitLiveToken(TParser::LiveTokenContext *context) = 0;

    virtual antlrcpp::Any visitBreakFor(TParser::BreakForContext *context) = 0;

    virtual antlrcpp::Any visitNextFor(TParser::NextForContext *context) = 0;

    virtual antlrcpp::Any visitUse(TParser::UseContext *context) = 0;

    virtual antlrcpp::Any visitUseValue(TParser::UseValueContext *context) = 0;

    virtual antlrcpp::Any visitUseString(TParser::UseStringContext *context) = 0;

    virtual antlrcpp::Any visitVariable(TParser::VariableContext *context) = 0;

    virtual antlrcpp::Any visitVariableModes(TParser::VariableModesContext *context) = 0;

    virtual antlrcpp::Any visitVariableModesBkp(TParser::VariableModesBkpContext *context) = 0;

    virtual antlrcpp::Any visitVariableMembers(TParser::VariableMembersContext *context) = 0;

    virtual antlrcpp::Any visitVariableDefinition(TParser::VariableDefinitionContext *context) = 0;

    virtual antlrcpp::Any visitVariableDefinitionGeneral(TParser::VariableDefinitionGeneralContext *context) = 0;

    virtual antlrcpp::Any visitIndexArray(TParser::IndexArrayContext *context) = 0;

    virtual antlrcpp::Any visitIndexArrayElements(TParser::IndexArrayElementsContext *context) = 0;

    virtual antlrcpp::Any visitAssociativeArray(TParser::AssociativeArrayContext *context) = 0;

    virtual antlrcpp::Any visitAssociativeArrayElements(TParser::AssociativeArrayElementsContext *context) = 0;

    virtual antlrcpp::Any visitOperationBlock(TParser::OperationBlockContext *context) = 0;

    virtual antlrcpp::Any visitOperationElements(TParser::OperationElementsContext *context) = 0;

    virtual antlrcpp::Any visitOperationValue(TParser::OperationValueContext *context) = 0;

    virtual antlrcpp::Any visitFirstIncDec(TParser::FirstIncDecContext *context) = 0;

    virtual antlrcpp::Any visitLastIncDec(TParser::LastIncDecContext *context) = 0;

    virtual antlrcpp::Any visitCallingFunction(TParser::CallingFunctionContext *context) = 0;

    virtual antlrcpp::Any visitFunctionCall(TParser::FunctionCallContext *context) = 0;

    virtual antlrcpp::Any visitFunctionCallParamAC(TParser::FunctionCallParamACContext *context) = 0;

    virtual antlrcpp::Any visitMethodCascadingModes(TParser::MethodCascadingModesContext *context) = 0;

    virtual antlrcpp::Any visitFunctionCallCascading(TParser::FunctionCallCascadingContext *context) = 0;

    virtual antlrcpp::Any visitFunctionCallCascadingItem(TParser::FunctionCallCascadingItemContext *context) = 0;

    virtual antlrcpp::Any visitIdentifierB(TParser::IdentifierBContext *context) = 0;

    virtual antlrcpp::Any visitPointSeparator(TParser::PointSeparatorContext *context) = 0;

    virtual antlrcpp::Any visitFunctionCallParam(TParser::FunctionCallParamContext *context) = 0;

    virtual antlrcpp::Any visitFunctionCallParamElements(TParser::FunctionCallParamElementsContext *context) = 0;

    virtual antlrcpp::Any visitConditionalExpression(TParser::ConditionalExpressionContext *context) = 0;

    virtual antlrcpp::Any visitConditionalExpressionStructBlock(TParser::ConditionalExpressionStructBlockContext *context) = 0;

    virtual antlrcpp::Any visitIfElementUnique(TParser::IfElementUniqueContext *context) = 0;

    virtual antlrcpp::Any visitElifElements(TParser::ElifElementsContext *context) = 0;

    virtual antlrcpp::Any visitElifElementUnique(TParser::ElifElementUniqueContext *context) = 0;

    virtual antlrcpp::Any visitElseElementUnique(TParser::ElseElementUniqueContext *context) = 0;

    virtual antlrcpp::Any visitConditionalExpressionItems(TParser::ConditionalExpressionItemsContext *context) = 0;

    virtual antlrcpp::Any visitConditionalBlockElements(TParser::ConditionalBlockElementsContext *context) = 0;

    virtual antlrcpp::Any visitConditionalBlockElsItems(TParser::ConditionalBlockElsItemsContext *context) = 0;

    virtual antlrcpp::Any visitConditionalExpressionElements(TParser::ConditionalExpressionElementsContext *context) = 0;

    virtual antlrcpp::Any visitConditionExpValue(TParser::ConditionExpValueContext *context) = 0;

    virtual antlrcpp::Any visitConditionExpBlock(TParser::ConditionExpBlockContext *context) = 0;

    virtual antlrcpp::Any visitConditionExpBlockItemValue(TParser::ConditionExpBlockItemValueContext *context) = 0;

    virtual antlrcpp::Any visitConditionExpBlockItem(TParser::ConditionExpBlockItemContext *context) = 0;

    virtual antlrcpp::Any visitConditionalExpValue(TParser::ConditionalExpValueContext *context) = 0;

    virtual antlrcpp::Any visitFunctionCallAndAttr(TParser::FunctionCallAndAttrContext *context) = 0;

    virtual antlrcpp::Any visitIdentifierAttrFn(TParser::IdentifierAttrFnContext *context) = 0;

    virtual antlrcpp::Any visitFunctionCallAttrFn(TParser::FunctionCallAttrFnContext *context) = 0;

    virtual antlrcpp::Any visitFunctionCallAttrFnItem(TParser::FunctionCallAttrFnItemContext *context) = 0;

    virtual antlrcpp::Any visitLoop(TParser::LoopContext *context) = 0;

    virtual antlrcpp::Any visitLoopExpressionItems(TParser::LoopExpressionItemsContext *context) = 0;

    virtual antlrcpp::Any visitLoopExpression(TParser::LoopExpressionContext *context) = 0;

    virtual antlrcpp::Any visitLoopInfinite(TParser::LoopInfiniteContext *context) = 0;

    virtual antlrcpp::Any visitLoopComplete(TParser::LoopCompleteContext *context) = 0;

    virtual antlrcpp::Any visitLoopConditional(TParser::LoopConditionalContext *context) = 0;

    virtual antlrcpp::Any visitEndOne(TParser::EndOneContext *context) = 0;

    virtual antlrcpp::Any visitEndTwo(TParser::EndTwoContext *context) = 0;

    virtual antlrcpp::Any visitLoopOneMembers(TParser::LoopOneMembersContext *context) = 0;

    virtual antlrcpp::Any visitLoopTwoMembers(TParser::LoopTwoMembersContext *context) = 0;

    virtual antlrcpp::Any visitLoopThreeMembers(TParser::LoopThreeMembersContext *context) = 0;

    virtual antlrcpp::Any visitLoopThreeMembersValues(TParser::LoopThreeMembersValuesContext *context) = 0;

    virtual antlrcpp::Any visitLoopBlockElements(TParser::LoopBlockElementsContext *context) = 0;

    virtual antlrcpp::Any visitLoopBlockElementsLimited(TParser::LoopBlockElementsLimitedContext *context) = 0;

    virtual antlrcpp::Any visitRet(TParser::RetContext *context) = 0;

    virtual antlrcpp::Any visitRetValues(TParser::RetValuesContext *context) = 0;

    virtual antlrcpp::Any visitFunctions(TParser::FunctionsContext *context) = 0;

    virtual antlrcpp::Any visitFunctionsModes(TParser::FunctionsModesContext *context) = 0;

    virtual antlrcpp::Any visitFunctionGeneralModes(TParser::FunctionGeneralModesContext *context) = 0;

    virtual antlrcpp::Any visitIdentifierRet(TParser::IdentifierRetContext *context) = 0;

    virtual antlrcpp::Any visitFunctionMethodsModes(TParser::FunctionMethodsModesContext *context) = 0;

    virtual antlrcpp::Any visitFunctionMethodsModesBkp(TParser::FunctionMethodsModesBkpContext *context) = 0;

    virtual antlrcpp::Any visitMethodPerm(TParser::MethodPermContext *context) = 0;

    virtual antlrcpp::Any visitVisibilityItems(TParser::VisibilityItemsContext *context) = 0;

    virtual antlrcpp::Any visitMethodVisibility(TParser::MethodVisibilityContext *context) = 0;

    virtual antlrcpp::Any visitConstructClassMethod(TParser::ConstructClassMethodContext *context) = 0;

    virtual antlrcpp::Any visitInterfaceMethod(TParser::InterfaceMethodContext *context) = 0;

    virtual antlrcpp::Any visitFunctionCodeBlock(TParser::FunctionCodeBlockContext *context) = 0;

    virtual antlrcpp::Any visitFunctionCodeBlockElements(TParser::FunctionCodeBlockElementsContext *context) = 0;

    virtual antlrcpp::Any visitFunctionParams(TParser::FunctionParamsContext *context) = 0;

    virtual antlrcpp::Any visitFunctionParamsControl(TParser::FunctionParamsControlContext *context) = 0;

    virtual antlrcpp::Any visitFunctionParamElements(TParser::FunctionParamElementsContext *context) = 0;

    virtual antlrcpp::Any visitOopGeneral(TParser::OopGeneralContext *context) = 0;

    virtual antlrcpp::Any visitInterfaceClass(TParser::InterfaceClassContext *context) = 0;

    virtual antlrcpp::Any visitInterfaceClassDefinition(TParser::InterfaceClassDefinitionContext *context) = 0;

    virtual antlrcpp::Any visitInterfaceCodeBlock(TParser::InterfaceCodeBlockContext *context) = 0;

    virtual antlrcpp::Any visitAbstractClass(TParser::AbstractClassContext *context) = 0;

    virtual antlrcpp::Any visitAbstractClassDefinition(TParser::AbstractClassDefinitionContext *context) = 0;

    virtual antlrcpp::Any visitAbstractCodeBlock(TParser::AbstractCodeBlockContext *context) = 0;

    virtual antlrcpp::Any visitClassDefination(TParser::ClassDefinationContext *context) = 0;

    virtual antlrcpp::Any visitClassCodeBlock(TParser::ClassCodeBlockContext *context) = 0;

    virtual antlrcpp::Any visitClassModes(TParser::ClassModesContext *context) = 0;

    virtual antlrcpp::Any visitIdentifierC(TParser::IdentifierCContext *context) = 0;

    virtual antlrcpp::Any visitAnonymousClassCall(TParser::AnonymousClassCallContext *context) = 0;

    virtual antlrcpp::Any visitAnonymousClassCallExpr(TParser::AnonymousClassCallExprContext *context) = 0;

    virtual antlrcpp::Any visitAnonymousClass(TParser::AnonymousClassContext *context) = 0;

    virtual antlrcpp::Any visitAnonymousClassElements(TParser::AnonymousClassElementsContext *context) = 0;

    virtual antlrcpp::Any visitArrayAccessElements(TParser::ArrayAccessElementsContext *context) = 0;

    virtual antlrcpp::Any visitArrayAccessElementsItems(TParser::ArrayAccessElementsItemsContext *context) = 0;

    virtual antlrcpp::Any visitAccessBlockAr(TParser::AccessBlockArContext *context) = 0;

    virtual antlrcpp::Any visitArrayIndexAccess(TParser::ArrayIndexAccessContext *context) = 0;

    virtual antlrcpp::Any visitAnonymousFunction(TParser::AnonymousFunctionContext *context) = 0;

    virtual antlrcpp::Any visitAnFnItems(TParser::AnFnItemsContext *context) = 0;

    virtual antlrcpp::Any visitFunctionsModesFn(TParser::FunctionsModesFnContext *context) = 0;

    virtual antlrcpp::Any visitAnonymousObjectCall(TParser::AnonymousObjectCallContext *context) = 0;

    virtual antlrcpp::Any visitAnonymousObjectCallExpr(TParser::AnonymousObjectCallExprContext *context) = 0;

    virtual antlrcpp::Any visitAnonymousObject(TParser::AnonymousObjectContext *context) = 0;

    virtual antlrcpp::Any visitVariableMultipleAssignments(TParser::VariableMultipleAssignmentsContext *context) = 0;

    virtual antlrcpp::Any visitVariableMultipleAssignmentsModes(TParser::VariableMultipleAssignmentsModesContext *context) = 0;

    virtual antlrcpp::Any visitVariableMultipleAItems(TParser::VariableMultipleAItemsContext *context) = 0;

    virtual antlrcpp::Any visitGeneralValue(TParser::GeneralValueContext *context) = 0;

    virtual antlrcpp::Any visitObjIdentifierA(TParser::ObjIdentifierAContext *context) = 0;

    virtual antlrcpp::Any visitObjIdentifierB(TParser::ObjIdentifierBContext *context) = 0;


};

}  // namespace verbum
