
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

  virtual antlrcpp::Any visitBlockCode(TParser::BlockCodeContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitBlockComments(TParser::BlockCommentsContext *ctx) override {
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

  virtual antlrcpp::Any visitFunctionCallPrefix(TParser::FunctionCallPrefixContext *ctx) override {
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

  virtual antlrcpp::Any visitFunctionParam(TParser::FunctionParamContext *ctx) override {
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

  virtual antlrcpp::Any visitClassCodeBlock(TParser::ClassCodeBlockContext *ctx) override {
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

  virtual antlrcpp::Any visitIncDecOperatorsA(TParser::IncDecOperatorsAContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitIncDecOperatorsB(TParser::IncDecOperatorsBContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitBlockLiveTokens(TParser::BlockLiveTokensContext *ctx) override {
    return visitChildren(ctx);
  }


};

}  // namespace verbum
