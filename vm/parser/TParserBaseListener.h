
// Generated from ./TParser.g4 by ANTLR 4.9.2

#pragma once


#include "antlr4-runtime.h"
#include "TParserListener.h"


namespace verbum {

/**
 * This class provides an empty implementation of TParserListener,
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
class  TParserBaseListener : public TParserListener {
public:

  virtual void enterMain(TParser::MainContext * /*ctx*/) override { }
  virtual void exitMain(TParser::MainContext * /*ctx*/) override { }

  virtual void enterSentences(TParser::SentencesContext * /*ctx*/) override { }
  virtual void exitSentences(TParser::SentencesContext * /*ctx*/) override { }

  virtual void enterStatements(TParser::StatementsContext * /*ctx*/) override { }
  virtual void exitStatements(TParser::StatementsContext * /*ctx*/) override { }

  virtual void enterBlockComments(TParser::BlockCommentsContext * /*ctx*/) override { }
  virtual void exitBlockComments(TParser::BlockCommentsContext * /*ctx*/) override { }

  virtual void enterBlockUse(TParser::BlockUseContext * /*ctx*/) override { }
  virtual void exitBlockUse(TParser::BlockUseContext * /*ctx*/) override { }

  virtual void enterUseValue(TParser::UseValueContext * /*ctx*/) override { }
  virtual void exitUseValue(TParser::UseValueContext * /*ctx*/) override { }

  virtual void enterUseString(TParser::UseStringContext * /*ctx*/) override { }
  virtual void exitUseString(TParser::UseStringContext * /*ctx*/) override { }

  virtual void enterBlockVariable(TParser::BlockVariableContext * /*ctx*/) override { }
  virtual void exitBlockVariable(TParser::BlockVariableContext * /*ctx*/) override { }

  virtual void enterVariableItem(TParser::VariableItemContext * /*ctx*/) override { }
  virtual void exitVariableItem(TParser::VariableItemContext * /*ctx*/) override { }

  virtual void enterVariablePrefixModes(TParser::VariablePrefixModesContext * /*ctx*/) override { }
  virtual void exitVariablePrefixModes(TParser::VariablePrefixModesContext * /*ctx*/) override { }

  virtual void enterVisibilityItems(TParser::VisibilityItemsContext * /*ctx*/) override { }
  virtual void exitVisibilityItems(TParser::VisibilityItemsContext * /*ctx*/) override { }

  virtual void enterMethodVisibility(TParser::MethodVisibilityContext * /*ctx*/) override { }
  virtual void exitMethodVisibility(TParser::MethodVisibilityContext * /*ctx*/) override { }

  virtual void enterFunctionCall(TParser::FunctionCallContext * /*ctx*/) override { }
  virtual void exitFunctionCall(TParser::FunctionCallContext * /*ctx*/) override { }

  virtual void enterFunctionCallPrefix(TParser::FunctionCallPrefixContext * /*ctx*/) override { }
  virtual void exitFunctionCallPrefix(TParser::FunctionCallPrefixContext * /*ctx*/) override { }

  virtual void enterFunctionCallParam(TParser::FunctionCallParamContext * /*ctx*/) override { }
  virtual void exitFunctionCallParam(TParser::FunctionCallParamContext * /*ctx*/) override { }

  virtual void enterFunctionCallParamElements(TParser::FunctionCallParamElementsContext * /*ctx*/) override { }
  virtual void exitFunctionCallParamElements(TParser::FunctionCallParamElementsContext * /*ctx*/) override { }

  virtual void enterGeneralValue(TParser::GeneralValueContext * /*ctx*/) override { }
  virtual void exitGeneralValue(TParser::GeneralValueContext * /*ctx*/) override { }

  virtual void enterIdentifier(TParser::IdentifierContext * /*ctx*/) override { }
  virtual void exitIdentifier(TParser::IdentifierContext * /*ctx*/) override { }

  virtual void enterBlockLiveTokens(TParser::BlockLiveTokensContext * /*ctx*/) override { }
  virtual void exitBlockLiveTokens(TParser::BlockLiveTokensContext * /*ctx*/) override { }


  virtual void enterEveryRule(antlr4::ParserRuleContext * /*ctx*/) override { }
  virtual void exitEveryRule(antlr4::ParserRuleContext * /*ctx*/) override { }
  virtual void visitTerminal(antlr4::tree::TerminalNode * /*node*/) override { }
  virtual void visitErrorNode(antlr4::tree::ErrorNode * /*node*/) override { }

};

}  // namespace verbum
