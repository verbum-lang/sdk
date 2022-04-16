
// Generated from ./TParser.g4 by ANTLR 4.9.2

#pragma once


#include "antlr4-runtime.h"
#include "TParser.h"


namespace verbum {

/**
 * This interface defines an abstract listener for a parse tree produced by TParser.
 */
class  TParserListener : public antlr4::tree::ParseTreeListener {
public:

  virtual void enterMain(TParser::MainContext *ctx) = 0;
  virtual void exitMain(TParser::MainContext *ctx) = 0;

  virtual void enterSentences(TParser::SentencesContext *ctx) = 0;
  virtual void exitSentences(TParser::SentencesContext *ctx) = 0;

  virtual void enterStatements(TParser::StatementsContext *ctx) = 0;
  virtual void exitStatements(TParser::StatementsContext *ctx) = 0;

  virtual void enterBlockComments(TParser::BlockCommentsContext *ctx) = 0;
  virtual void exitBlockComments(TParser::BlockCommentsContext *ctx) = 0;

  virtual void enterBlockUse(TParser::BlockUseContext *ctx) = 0;
  virtual void exitBlockUse(TParser::BlockUseContext *ctx) = 0;

  virtual void enterUseValue(TParser::UseValueContext *ctx) = 0;
  virtual void exitUseValue(TParser::UseValueContext *ctx) = 0;

  virtual void enterUseString(TParser::UseStringContext *ctx) = 0;
  virtual void exitUseString(TParser::UseStringContext *ctx) = 0;

  virtual void enterBlockVariable(TParser::BlockVariableContext *ctx) = 0;
  virtual void exitBlockVariable(TParser::BlockVariableContext *ctx) = 0;

  virtual void enterVariableItem(TParser::VariableItemContext *ctx) = 0;
  virtual void exitVariableItem(TParser::VariableItemContext *ctx) = 0;

  virtual void enterVariablePrefixModes(TParser::VariablePrefixModesContext *ctx) = 0;
  virtual void exitVariablePrefixModes(TParser::VariablePrefixModesContext *ctx) = 0;

  virtual void enterVisibilityItems(TParser::VisibilityItemsContext *ctx) = 0;
  virtual void exitVisibilityItems(TParser::VisibilityItemsContext *ctx) = 0;

  virtual void enterMethodVisibility(TParser::MethodVisibilityContext *ctx) = 0;
  virtual void exitMethodVisibility(TParser::MethodVisibilityContext *ctx) = 0;

  virtual void enterFunctionCall(TParser::FunctionCallContext *ctx) = 0;
  virtual void exitFunctionCall(TParser::FunctionCallContext *ctx) = 0;

  virtual void enterFunctionCallPrefix(TParser::FunctionCallPrefixContext *ctx) = 0;
  virtual void exitFunctionCallPrefix(TParser::FunctionCallPrefixContext *ctx) = 0;

  virtual void enterFunctionCallParam(TParser::FunctionCallParamContext *ctx) = 0;
  virtual void exitFunctionCallParam(TParser::FunctionCallParamContext *ctx) = 0;

  virtual void enterFunctionCallParamElements(TParser::FunctionCallParamElementsContext *ctx) = 0;
  virtual void exitFunctionCallParamElements(TParser::FunctionCallParamElementsContext *ctx) = 0;

  virtual void enterGeneralValue(TParser::GeneralValueContext *ctx) = 0;
  virtual void exitGeneralValue(TParser::GeneralValueContext *ctx) = 0;

  virtual void enterIdentifier(TParser::IdentifierContext *ctx) = 0;
  virtual void exitIdentifier(TParser::IdentifierContext *ctx) = 0;

  virtual void enterBlockLiveTokens(TParser::BlockLiveTokensContext *ctx) = 0;
  virtual void exitBlockLiveTokens(TParser::BlockLiveTokensContext *ctx) = 0;


};

}  // namespace verbum
