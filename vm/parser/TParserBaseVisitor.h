
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

  virtual antlrcpp::Any visitVariableModes(TParser::VariableModesContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitVariableMembers(TParser::VariableMembersContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitVariableDefinition(TParser::VariableDefinitionContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitVariableDefinitionGeneral(TParser::VariableDefinitionGeneralContext *ctx) override {
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

  virtual antlrcpp::Any visitPointSeparator(TParser::PointSeparatorContext *ctx) override {
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

  virtual antlrcpp::Any visitConditionalBlockElements(TParser::ConditionalBlockElementsContext *ctx) override {
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

  virtual antlrcpp::Any visitCondBlockElementsLimited(TParser::CondBlockElementsLimitedContext *ctx) override {
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

  virtual antlrcpp::Any visitLoop(TParser::LoopContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitLoopExpression(TParser::LoopExpressionContext *ctx) override {
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

  virtual antlrcpp::Any visitLoopBlockElements(TParser::LoopBlockElementsContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitLoopBlockElementsLimited(TParser::LoopBlockElementsLimitedContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitRet(TParser::RetContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitRetValues(TParser::RetValuesContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitFunctions(TParser::FunctionsContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitFunctionGeneralModes(TParser::FunctionGeneralModesContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitFunctionsModes(TParser::FunctionsModesContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitFunctionMethodsModes(TParser::FunctionMethodsModesContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitMethodPerm(TParser::MethodPermContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitConstructClassMethod(TParser::ConstructClassMethodContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitInterfaceMethod(TParser::InterfaceMethodContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitFunctionCodeBlock(TParser::FunctionCodeBlockContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitFunctionParams(TParser::FunctionParamsContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitFunctionParamElements(TParser::FunctionParamElementsContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitOopGeneral(TParser::OopGeneralContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitInterfaceClass(TParser::InterfaceClassContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitInterfaceClassDefinition(TParser::InterfaceClassDefinitionContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitAbstractClass(TParser::AbstractClassContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitAbstractClassDefinition(TParser::AbstractClassDefinitionContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitClassDefination(TParser::ClassDefinationContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitClassModesGeneral(TParser::ClassModesGeneralContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitClassModes(TParser::ClassModesContext *ctx) override {
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

  virtual antlrcpp::Any visitGeneralValue(TParser::GeneralValueContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitObjIdentifierA(TParser::ObjIdentifierAContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitObjIdentifierB(TParser::ObjIdentifierBContext *ctx) override {
    return visitChildren(ctx);
  }


};

}  // namespace verbum
