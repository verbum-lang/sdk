
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

  virtual antlrcpp::Any visitVisibilityItems(TParser::VisibilityItemsContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitMethodVisibility(TParser::MethodVisibilityContext *ctx) override {
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
