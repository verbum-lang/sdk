
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

  virtual antlrcpp::Any visitFileContent(TParser::FileContentContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitSentence(TParser::SentenceContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitLiveTokens(TParser::LiveTokensContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitComment(TParser::CommentContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitUse(TParser::UseContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitUseValue(TParser::UseValueContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitUseString(TParser::UseStringContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitVariable(TParser::VariableContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitVariableMembers(TParser::VariableMembersContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitVariableDefinition(TParser::VariableDefinitionContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitVariableValue(TParser::VariableValueContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitIndexArray(TParser::IndexArrayContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitArrayElements(TParser::ArrayElementsContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitGeneralValue(TParser::GeneralValueContext *ctx) override {
    return visitChildren(ctx);
  }


};

}  // namespace verbum
