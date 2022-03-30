
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

  virtual void enterFileContent(TParser::FileContentContext * /*ctx*/) override { }
  virtual void exitFileContent(TParser::FileContentContext * /*ctx*/) override { }

  virtual void enterSentence(TParser::SentenceContext * /*ctx*/) override { }
  virtual void exitSentence(TParser::SentenceContext * /*ctx*/) override { }

  virtual void enterLiveTokens(TParser::LiveTokensContext * /*ctx*/) override { }
  virtual void exitLiveTokens(TParser::LiveTokensContext * /*ctx*/) override { }

  virtual void enterUse(TParser::UseContext * /*ctx*/) override { }
  virtual void exitUse(TParser::UseContext * /*ctx*/) override { }

  virtual void enterUseValue(TParser::UseValueContext * /*ctx*/) override { }
  virtual void exitUseValue(TParser::UseValueContext * /*ctx*/) override { }

  virtual void enterUseString(TParser::UseStringContext * /*ctx*/) override { }
  virtual void exitUseString(TParser::UseStringContext * /*ctx*/) override { }

  virtual void enterVariable(TParser::VariableContext * /*ctx*/) override { }
  virtual void exitVariable(TParser::VariableContext * /*ctx*/) override { }

  virtual void enterVariableMembers(TParser::VariableMembersContext * /*ctx*/) override { }
  virtual void exitVariableMembers(TParser::VariableMembersContext * /*ctx*/) override { }

  virtual void enterVariableDefinition(TParser::VariableDefinitionContext * /*ctx*/) override { }
  virtual void exitVariableDefinition(TParser::VariableDefinitionContext * /*ctx*/) override { }

  virtual void enterVariableValue(TParser::VariableValueContext * /*ctx*/) override { }
  virtual void exitVariableValue(TParser::VariableValueContext * /*ctx*/) override { }

  virtual void enterIndexArray(TParser::IndexArrayContext * /*ctx*/) override { }
  virtual void exitIndexArray(TParser::IndexArrayContext * /*ctx*/) override { }

  virtual void enterIndexArrayElements(TParser::IndexArrayElementsContext * /*ctx*/) override { }
  virtual void exitIndexArrayElements(TParser::IndexArrayElementsContext * /*ctx*/) override { }

  virtual void enterAssociativeArray(TParser::AssociativeArrayContext * /*ctx*/) override { }
  virtual void exitAssociativeArray(TParser::AssociativeArrayContext * /*ctx*/) override { }

  virtual void enterAssociativeArrayElements(TParser::AssociativeArrayElementsContext * /*ctx*/) override { }
  virtual void exitAssociativeArrayElements(TParser::AssociativeArrayElementsContext * /*ctx*/) override { }

  virtual void enterGeneralValue(TParser::GeneralValueContext * /*ctx*/) override { }
  virtual void exitGeneralValue(TParser::GeneralValueContext * /*ctx*/) override { }


  virtual void enterEveryRule(antlr4::ParserRuleContext * /*ctx*/) override { }
  virtual void exitEveryRule(antlr4::ParserRuleContext * /*ctx*/) override { }
  virtual void visitTerminal(antlr4::tree::TerminalNode * /*node*/) override { }
  virtual void visitErrorNode(antlr4::tree::ErrorNode * /*node*/) override { }

};

}  // namespace verbum
