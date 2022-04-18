
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

    virtual antlrcpp::Any visitSentences(TParser::SentencesContext *context) = 0;

    virtual antlrcpp::Any visitStatements(TParser::StatementsContext *context) = 0;

    virtual antlrcpp::Any visitBlockCode(TParser::BlockCodeContext *context) = 0;

    virtual antlrcpp::Any visitBlockUse(TParser::BlockUseContext *context) = 0;

    virtual antlrcpp::Any visitUseValue(TParser::UseValueContext *context) = 0;

    virtual antlrcpp::Any visitUseString(TParser::UseStringContext *context) = 0;

    virtual antlrcpp::Any visitBlockVariable(TParser::BlockVariableContext *context) = 0;

    virtual antlrcpp::Any visitVariableItem(TParser::VariableItemContext *context) = 0;

    virtual antlrcpp::Any visitVariablePrefixModes(TParser::VariablePrefixModesContext *context) = 0;

    virtual antlrcpp::Any visitFunctionCall(TParser::FunctionCallContext *context) = 0;

    virtual antlrcpp::Any visitFunctionCallPrefix(TParser::FunctionCallPrefixContext *context) = 0;

    virtual antlrcpp::Any visitFunctionCallParam(TParser::FunctionCallParamContext *context) = 0;

    virtual antlrcpp::Any visitFunctionCallParamElements(TParser::FunctionCallParamElementsContext *context) = 0;

    virtual antlrcpp::Any visitBlockRet(TParser::BlockRetContext *context) = 0;

    virtual antlrcpp::Any visitBlockConditional(TParser::BlockConditionalContext *context) = 0;

    virtual antlrcpp::Any visitIfElementUnique(TParser::IfElementUniqueContext *context) = 0;

    virtual antlrcpp::Any visitElifElements(TParser::ElifElementsContext *context) = 0;

    virtual antlrcpp::Any visitElifElementUnique(TParser::ElifElementUniqueContext *context) = 0;

    virtual antlrcpp::Any visitElseElementUnique(TParser::ElseElementUniqueContext *context) = 0;

    virtual antlrcpp::Any visitConditionalBlockExpression(TParser::ConditionalBlockExpressionContext *context) = 0;

    virtual antlrcpp::Any visitConditionalBlockElements(TParser::ConditionalBlockElementsContext *context) = 0;

    virtual antlrcpp::Any visitBlockLoop(TParser::BlockLoopContext *context) = 0;

    virtual antlrcpp::Any visitLoopBlockElements(TParser::LoopBlockElementsContext *context) = 0;

    virtual antlrcpp::Any visitLoopComplete(TParser::LoopCompleteContext *context) = 0;

    virtual antlrcpp::Any visitLoopConditional(TParser::LoopConditionalContext *context) = 0;

    virtual antlrcpp::Any visitLoopInfinite(TParser::LoopInfiniteContext *context) = 0;

    virtual antlrcpp::Any visitEndOne(TParser::EndOneContext *context) = 0;

    virtual antlrcpp::Any visitEndTwo(TParser::EndTwoContext *context) = 0;

    virtual antlrcpp::Any visitLoopOneMembers(TParser::LoopOneMembersContext *context) = 0;

    virtual antlrcpp::Any visitLoopTwoMembers(TParser::LoopTwoMembersContext *context) = 0;

    virtual antlrcpp::Any visitLoopThreeMembers(TParser::LoopThreeMembersContext *context) = 0;

    virtual antlrcpp::Any visitLoopThreeMembersValues(TParser::LoopThreeMembersValuesContext *context) = 0;

    virtual antlrcpp::Any visitBlockBreak(TParser::BlockBreakContext *context) = 0;

    virtual antlrcpp::Any visitBlockNext(TParser::BlockNextContext *context) = 0;

    virtual antlrcpp::Any visitBlockTryCatch(TParser::BlockTryCatchContext *context) = 0;

    virtual antlrcpp::Any visitTryUniqueElement(TParser::TryUniqueElementContext *context) = 0;

    virtual antlrcpp::Any visitCatchUniqueElement(TParser::CatchUniqueElementContext *context) = 0;

    virtual antlrcpp::Any visitTryCatchElements(TParser::TryCatchElementsContext *context) = 0;

    virtual antlrcpp::Any visitBlockFunction(TParser::BlockFunctionContext *context) = 0;

    virtual antlrcpp::Any visitBlockFunctionDeclarationAttr(TParser::BlockFunctionDeclarationAttrContext *context) = 0;

    virtual antlrcpp::Any visitFunctionParam(TParser::FunctionParamContext *context) = 0;

    virtual antlrcpp::Any visitFunctionAnonymousParam(TParser::FunctionAnonymousParamContext *context) = 0;

    virtual antlrcpp::Any visitFunctionCodeBlock(TParser::FunctionCodeBlockContext *context) = 0;

    virtual antlrcpp::Any visitBlockInterface(TParser::BlockInterfaceContext *context) = 0;

    virtual antlrcpp::Any visitInterfaceCodeBlock(TParser::InterfaceCodeBlockContext *context) = 0;

    virtual antlrcpp::Any visitBlockAbstraction(TParser::BlockAbstractionContext *context) = 0;

    virtual antlrcpp::Any visitAbstractionCodeBlock(TParser::AbstractionCodeBlockContext *context) = 0;

    virtual antlrcpp::Any visitBlockClass(TParser::BlockClassContext *context) = 0;

    virtual antlrcpp::Any visitBlockClassDeclarationAttr(TParser::BlockClassDeclarationAttrContext *context) = 0;

    virtual antlrcpp::Any visitClassAnonymousParam(TParser::ClassAnonymousParamContext *context) = 0;

    virtual antlrcpp::Any visitClassCodeBlock(TParser::ClassCodeBlockContext *context) = 0;

    virtual antlrcpp::Any visitBlockArray(TParser::BlockArrayContext *context) = 0;

    virtual antlrcpp::Any visitIndexArray(TParser::IndexArrayContext *context) = 0;

    virtual antlrcpp::Any visitIndexArrayElements(TParser::IndexArrayElementsContext *context) = 0;

    virtual antlrcpp::Any visitAssociativeArray(TParser::AssociativeArrayContext *context) = 0;

    virtual antlrcpp::Any visitAssociativeArrayElements(TParser::AssociativeArrayElementsContext *context) = 0;

    virtual antlrcpp::Any visitBlockLambdaFunctions(TParser::BlockLambdaFunctionsContext *context) = 0;

    virtual antlrcpp::Any visitLambdaFnParams(TParser::LambdaFnParamsContext *context) = 0;

    virtual antlrcpp::Any visitLambdaFnCodeBlock(TParser::LambdaFnCodeBlockContext *context) = 0;

    virtual antlrcpp::Any visitBlockClassConstructor(TParser::BlockClassConstructorContext *context) = 0;

    virtual antlrcpp::Any visitBlockFunctionCall(TParser::BlockFunctionCallContext *context) = 0;

    virtual antlrcpp::Any visitFunctionCallElements(TParser::FunctionCallElementsContext *context) = 0;

    virtual antlrcpp::Any visitBlockAttribution(TParser::BlockAttributionContext *context) = 0;

    virtual antlrcpp::Any visitAttributionElements(TParser::AttributionElementsContext *context) = 0;

    virtual antlrcpp::Any visitBlockMultipleAssignments(TParser::BlockMultipleAssignmentsContext *context) = 0;

    virtual antlrcpp::Any visitVariableMultipleAssignmentsModes(TParser::VariableMultipleAssignmentsModesContext *context) = 0;

    virtual antlrcpp::Any visitBlockAccessArrayElements(TParser::BlockAccessArrayElementsContext *context) = 0;

    virtual antlrcpp::Any visitArrayAccessElements(TParser::ArrayAccessElementsContext *context) = 0;

    virtual antlrcpp::Any visitArrayAccessElementsItems(TParser::ArrayAccessElementsItemsContext *context) = 0;

    virtual antlrcpp::Any visitAccessBlockAr(TParser::AccessBlockArContext *context) = 0;

    virtual antlrcpp::Any visitArrayIndexAccess(TParser::ArrayIndexAccessContext *context) = 0;

    virtual antlrcpp::Any visitFirstIncDec(TParser::FirstIncDecContext *context) = 0;

    virtual antlrcpp::Any visitLastIncDec(TParser::LastIncDecContext *context) = 0;

    virtual antlrcpp::Any visitBlockPermissionTokens(TParser::BlockPermissionTokensContext *context) = 0;

    virtual antlrcpp::Any visitCodeBlockFlowControl(TParser::CodeBlockFlowControlContext *context) = 0;

    virtual antlrcpp::Any visitCodeBlockFlowControlElements(TParser::CodeBlockFlowControlElementsContext *context) = 0;

    virtual antlrcpp::Any visitCodeBlockControl(TParser::CodeBlockControlContext *context) = 0;

    virtual antlrcpp::Any visitGeneralValue(TParser::GeneralValueContext *context) = 0;

    virtual antlrcpp::Any visitGeneralValueBlock(TParser::GeneralValueBlockContext *context) = 0;

    virtual antlrcpp::Any visitGeneralValueItems(TParser::GeneralValueItemsContext *context) = 0;

    virtual antlrcpp::Any visitGeneralValueElements(TParser::GeneralValueElementsContext *context) = 0;

    virtual antlrcpp::Any visitIdentifier(TParser::IdentifierContext *context) = 0;

    virtual antlrcpp::Any visitIdentifierB(TParser::IdentifierBContext *context) = 0;

    virtual antlrcpp::Any visitIdentifierC(TParser::IdentifierCContext *context) = 0;

    virtual antlrcpp::Any visitIdentifierD(TParser::IdentifierDContext *context) = 0;

    virtual antlrcpp::Any visitIncDecOperatorsA(TParser::IncDecOperatorsAContext *context) = 0;

    virtual antlrcpp::Any visitIncDecOperatorsB(TParser::IncDecOperatorsBContext *context) = 0;

    virtual antlrcpp::Any visitOpenOpA(TParser::OpenOpAContext *context) = 0;

    virtual antlrcpp::Any visitCloseOpA(TParser::CloseOpAContext *context) = 0;


};

}  // namespace verbum
