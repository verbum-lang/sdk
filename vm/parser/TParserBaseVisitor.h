
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

  virtual antlrcpp::Any visitGeneralValue(TParser::GeneralValueContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitBlockLiveTokens(TParser::BlockLiveTokensContext *ctx) override {
    return visitChildren(ctx);
  }


};

}  // namespace verbum
