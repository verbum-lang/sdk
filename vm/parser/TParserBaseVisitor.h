
// Generated from ./TParser.g4 by ANTLR 4.9.2

#pragma once


#include "antlr4-runtime.h"
#include "TParserVisitor.h"


namespace verbum {

/**
 * This class provides an empty implementation of TParserVisitor, which can be
 * extended to create a visitor which only needs to handle a subset of the available methods.
 */
class  TParserBaseVisitor : public TParserVisitor {
public:

  virtual antlrcpp::Any visitMain(TParser::MainContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitSentences(TParser::SentencesContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitStatements(TParser::StatementsContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitBlockUse(TParser::BlockUseContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitUseValue(TParser::UseValueContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitUseString(TParser::UseStringContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitBlockVariable(TParser::BlockVariableContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitVariableItem(TParser::VariableItemContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitVariablePrefixModes(TParser::VariablePrefixModesContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitFunctionCall(TParser::FunctionCallContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitFunctionCallParam(TParser::FunctionCallParamContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitFunctionCallParamElements(TParser::FunctionCallParamElementsContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitBlockRet(TParser::BlockRetContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitBlockConditional(TParser::BlockConditionalContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitIfElementUnique(TParser::IfElementUniqueContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitElifElements(TParser::ElifElementsContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitElifElementUnique(TParser::ElifElementUniqueContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitElseElementUnique(TParser::ElseElementUniqueContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitConditionalBlockExpression(TParser::ConditionalBlockExpressionContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitConditionalBlockElements(TParser::ConditionalBlockElementsContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitBlockLoop(TParser::BlockLoopContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitLoopBlockElements(TParser::LoopBlockElementsContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitLoopComplete(TParser::LoopCompleteContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitLoopConditional(TParser::LoopConditionalContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitLoopInfinite(TParser::LoopInfiniteContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitEndOne(TParser::EndOneContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitEndTwo(TParser::EndTwoContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitLoopOneMembers(TParser::LoopOneMembersContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitLoopTwoMembers(TParser::LoopTwoMembersContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitLoopThreeMembers(TParser::LoopThreeMembersContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitLoopThreeMembersValues(TParser::LoopThreeMembersValuesContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitBlockBreak(TParser::BlockBreakContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitBlockNext(TParser::BlockNextContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitBlockTryCatch(TParser::BlockTryCatchContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitTryUniqueElement(TParser::TryUniqueElementContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitCatchUniqueElement(TParser::CatchUniqueElementContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitTryCatchElements(TParser::TryCatchElementsContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitBlockFunction(TParser::BlockFunctionContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitBlockFunctionDeclarationAttr(TParser::BlockFunctionDeclarationAttrContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitFunctionParam(TParser::FunctionParamContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitFunctionAnonymousParam(TParser::FunctionAnonymousParamContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitFunctionCodeBlock(TParser::FunctionCodeBlockContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitBlockInterface(TParser::BlockInterfaceContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitInterfaceCodeBlock(TParser::InterfaceCodeBlockContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitBlockAbstraction(TParser::BlockAbstractionContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitAbstractionCodeBlock(TParser::AbstractionCodeBlockContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitBlockClass(TParser::BlockClassContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitBlockClassDeclarationAttr(TParser::BlockClassDeclarationAttrContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitClassCommonDef(TParser::ClassCommonDefContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitClassAnonymousParam(TParser::ClassAnonymousParamContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitClassCodeBlock(TParser::ClassCodeBlockContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitBlockArray(TParser::BlockArrayContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitIndexArray(TParser::IndexArrayContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitIndexArrayElements(TParser::IndexArrayElementsContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitAssociativeArray(TParser::AssociativeArrayContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitAssociativeArrayElements(TParser::AssociativeArrayElementsContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitBlockLambdaFunctions(TParser::BlockLambdaFunctionsContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitLambdaFnParams(TParser::LambdaFnParamsContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitLambdaFnCodeBlock(TParser::LambdaFnCodeBlockContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitBlockClassConstructor(TParser::BlockClassConstructorContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitBlockFunctionCall(TParser::BlockFunctionCallContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitFunctionCallElements(TParser::FunctionCallElementsContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitBlockAnonymousObject(TParser::BlockAnonymousObjectContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitBlockAttribution(TParser::BlockAttributionContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitAttributionElements(TParser::AttributionElementsContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitBlockMultipleAssignments(TParser::BlockMultipleAssignmentsContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitVariableMultipleAssignmentsModes(TParser::VariableMultipleAssignmentsModesContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitBlockAccessArrayElements(TParser::BlockAccessArrayElementsContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitArrayAccessElements(TParser::ArrayAccessElementsContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitArrayAccessElementsItems(TParser::ArrayAccessElementsItemsContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitAccessBlockAr(TParser::AccessBlockArContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitArrayIndexAccess(TParser::ArrayIndexAccessContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitFirstIncDec(TParser::FirstIncDecContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitLastIncDec(TParser::LastIncDecContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitBlockPermissionTokens(TParser::BlockPermissionTokensContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitCodeBlockFlowControl(TParser::CodeBlockFlowControlContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitCodeBlockFlowControlElements(TParser::CodeBlockFlowControlElementsContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitCodeBlockControl(TParser::CodeBlockControlContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitGeneralValue(TParser::GeneralValueContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitGeneralValueBlock(TParser::GeneralValueBlockContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitGeneralValueItems(TParser::GeneralValueItemsContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitGeneralValueElements(TParser::GeneralValueElementsContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitIdentifier(TParser::IdentifierContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitIdentifierB(TParser::IdentifierBContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitIdentifierC(TParser::IdentifierCContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitIdentifierD(TParser::IdentifierDContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitIncDecOperatorsA(TParser::IncDecOperatorsAContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitIncDecOperatorsB(TParser::IncDecOperatorsBContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitOpenOpA(TParser::OpenOpAContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitCloseOpA(TParser::CloseOpAContext *ctx) override {
    return visitChildren(ctx);
  }


};

}  // namespace verbum
