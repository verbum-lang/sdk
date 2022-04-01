
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

  virtual antlrcpp::Any visitLiveToken(TParser::LiveTokenContext *ctx) override {
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

  virtual antlrcpp::Any visitOperationBlock(TParser::OperationBlockContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitOperationElements(TParser::OperationElementsContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitOperationValue(TParser::OperationValueContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitFirstIncDec(TParser::FirstIncDecContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitLastIncDec(TParser::LastIncDecContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitCallingFunction(TParser::CallingFunctionContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitFunctionCall(TParser::FunctionCallContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitIdentifierB(TParser::IdentifierBContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitFunctionCallParam(TParser::FunctionCallParamContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitFunctionCallParamElements(TParser::FunctionCallParamElementsContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitConditionalExpression(TParser::ConditionalExpressionContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitBlockElements(TParser::BlockElementsContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitIfConditions(TParser::IfConditionsContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitElifConditions(TParser::ElifConditionsContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitElseConditions(TParser::ElseConditionsContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitBlockElementsLimited(TParser::BlockElementsLimitedContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitConditionalExpressionElements(TParser::ConditionalExpressionElementsContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitConditionalExpElementsValue(TParser::ConditionalExpElementsValueContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitConditionExpBlock(TParser::ConditionExpBlockContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitConditionalExpValue(TParser::ConditionalExpValueContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitGeneralValue(TParser::GeneralValueContext *ctx) override {
    return visitChildren(ctx);
  }


};

}  // namespace verbum
