
// Generated from ./TParser.g4 by ANTLR 4.9.2

#pragma once


#include "antlr4-runtime.h"


  #ifndef _WIN32
  #pragma GCC diagnostic ignored "-Wunused-parameter"
  #endif


namespace verbum {


class  TParser : public antlr4::Parser {
public:
  enum {
    Use = 1, Var = 2, Bool = 3, End = 4, Attr = 5, TwoPoint = 6, Separator = 7, 
    OpenArIndex = 8, CloseArIndex = 9, OpenBlock = 10, CloseBlock = 11, 
    OpenOp = 12, CloseOp = 13, ArithmeticOperator = 14, IncDecOperators = 15, 
    Identifier = 16, IDPrefix = 17, TypeSpec = 18, String = 19, Integer = 20, 
    Float = 21, Whitespace = 22, Newline = 23, Words = 24, BlockComment = 25, 
    LineComment = 26
  };

  enum {
    RuleMain = 0, RuleFileContent = 1, RuleSentence = 2, RuleLiveTokens = 3, 
    RuleUse = 4, RuleUseValue = 5, RuleUseString = 6, RuleVariable = 7, 
    RuleVariableMembers = 8, RuleVariableDefinition = 9, RuleVariableValue = 10, 
    RuleIndexArray = 11, RuleIndexArrayElements = 12, RuleAssociativeArray = 13, 
    RuleAssociativeArrayElements = 14, RuleOperationBlock = 15, RuleOperationElements = 16, 
    RuleOperationValue = 17, RuleGeneralValue = 18
  };

  explicit TParser(antlr4::TokenStream *input);
  ~TParser();

  virtual std::string getGrammarFileName() const override;
  virtual const antlr4::atn::ATN& getATN() const override { return _atn; };
  virtual const std::vector<std::string>& getTokenNames() const override { return _tokenNames; }; // deprecated: use vocabulary instead.
  virtual const std::vector<std::string>& getRuleNames() const override;
  virtual antlr4::dfa::Vocabulary& getVocabulary() const override;


  class MainContext;
  class FileContentContext;
  class SentenceContext;
  class LiveTokensContext;
  class UseContext;
  class UseValueContext;
  class UseStringContext;
  class VariableContext;
  class VariableMembersContext;
  class VariableDefinitionContext;
  class VariableValueContext;
  class IndexArrayContext;
  class IndexArrayElementsContext;
  class AssociativeArrayContext;
  class AssociativeArrayElementsContext;
  class OperationBlockContext;
  class OperationElementsContext;
  class OperationValueContext;
  class GeneralValueContext; 

  class  MainContext : public antlr4::ParserRuleContext {
  public:
    MainContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    FileContentContext *fileContent();
    antlr4::tree::TerminalNode *EOF();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  MainContext* main();

  class  FileContentContext : public antlr4::ParserRuleContext {
  public:
    FileContentContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    FileContentContext *fileContent();
    SentenceContext *sentence();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  FileContentContext* fileContent();
  FileContentContext* fileContent(int precedence);
  class  SentenceContext : public antlr4::ParserRuleContext {
  public:
    SentenceContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    LiveTokensContext *liveTokens();
    UseContext *use();
    VariableContext *variable();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  SentenceContext* sentence();

  class  LiveTokensContext : public antlr4::ParserRuleContext {
  public:
    LiveTokensContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Newline();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  LiveTokensContext* liveTokens();

  class  UseContext : public antlr4::ParserRuleContext {
  public:
    UseContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Use();
    UseValueContext *useValue();
    antlr4::tree::TerminalNode *End();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  UseContext* use();

  class  UseValueContext : public antlr4::ParserRuleContext {
  public:
    UseValueContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    UseStringContext *useString();
    antlr4::tree::TerminalNode *Separator();
    UseValueContext *useValue();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  UseValueContext* useValue();

  class  UseStringContext : public antlr4::ParserRuleContext {
  public:
    UseStringContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *String();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  UseStringContext* useString();

  class  VariableContext : public antlr4::ParserRuleContext {
  public:
    VariableContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Var();
    VariableMembersContext *variableMembers();
    antlr4::tree::TerminalNode *End();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  VariableContext* variable();

  class  VariableMembersContext : public antlr4::ParserRuleContext {
  public:
    VariableMembersContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    VariableDefinitionContext *variableDefinition();
    antlr4::tree::TerminalNode *Separator();
    VariableMembersContext *variableMembers();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  VariableMembersContext* variableMembers();

  class  VariableDefinitionContext : public antlr4::ParserRuleContext {
  public:
    VariableDefinitionContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Identifier();
    antlr4::tree::TerminalNode *Attr();
    VariableValueContext *variableValue();
    antlr4::tree::TerminalNode *TypeSpec();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  VariableDefinitionContext* variableDefinition();

  class  VariableValueContext : public antlr4::ParserRuleContext {
  public:
    VariableValueContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    GeneralValueContext *generalValue();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  VariableValueContext* variableValue();

  class  IndexArrayContext : public antlr4::ParserRuleContext {
  public:
    IndexArrayContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *OpenArIndex();
    antlr4::tree::TerminalNode *CloseArIndex();
    IndexArrayElementsContext *indexArrayElements();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  IndexArrayContext* indexArray();

  class  IndexArrayElementsContext : public antlr4::ParserRuleContext {
  public:
    IndexArrayElementsContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    GeneralValueContext *generalValue();
    antlr4::tree::TerminalNode *Separator();
    IndexArrayElementsContext *indexArrayElements();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  IndexArrayElementsContext* indexArrayElements();

  class  AssociativeArrayContext : public antlr4::ParserRuleContext {
  public:
    AssociativeArrayContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *OpenBlock();
    antlr4::tree::TerminalNode *CloseBlock();
    AssociativeArrayElementsContext *associativeArrayElements();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  AssociativeArrayContext* associativeArray();

  class  AssociativeArrayElementsContext : public antlr4::ParserRuleContext {
  public:
    AssociativeArrayElementsContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Identifier();
    antlr4::tree::TerminalNode *TwoPoint();
    GeneralValueContext *generalValue();
    antlr4::tree::TerminalNode *Separator();
    AssociativeArrayElementsContext *associativeArrayElements();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  AssociativeArrayElementsContext* associativeArrayElements();

  class  OperationBlockContext : public antlr4::ParserRuleContext {
  public:
    OperationBlockContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *OpenOp();
    OperationElementsContext *operationElements();
    antlr4::tree::TerminalNode *CloseOp();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  OperationBlockContext* operationBlock();

  class  OperationElementsContext : public antlr4::ParserRuleContext {
  public:
    OperationElementsContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    OperationValueContext *operationValue();
    OperationElementsContext *operationElements();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  OperationElementsContext* operationElements();

  class  OperationValueContext : public antlr4::ParserRuleContext {
  public:
    OperationValueContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Identifier();
    antlr4::tree::TerminalNode *ArithmeticOperator();
    antlr4::tree::TerminalNode *TypeSpec();
    antlr4::tree::TerminalNode *Integer();
    antlr4::tree::TerminalNode *Float();
    OperationBlockContext *operationBlock();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  OperationValueContext* operationValue();

  class  GeneralValueContext : public antlr4::ParserRuleContext {
  public:
    GeneralValueContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Identifier();
    antlr4::tree::TerminalNode *TypeSpec();
    antlr4::tree::TerminalNode *String();
    antlr4::tree::TerminalNode *Integer();
    antlr4::tree::TerminalNode *Float();
    antlr4::tree::TerminalNode *Bool();
    IndexArrayContext *indexArray();
    AssociativeArrayContext *associativeArray();
    OperationBlockContext *operationBlock();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  GeneralValueContext* generalValue();


  virtual bool sempred(antlr4::RuleContext *_localctx, size_t ruleIndex, size_t predicateIndex) override;
  bool fileContentSempred(FileContentContext *_localctx, size_t predicateIndex);

private:
  static std::vector<antlr4::dfa::DFA> _decisionToDFA;
  static antlr4::atn::PredictionContextCache _sharedContextCache;
  static std::vector<std::string> _ruleNames;
  static std::vector<std::string> _tokenNames;

  static std::vector<std::string> _literalNames;
  static std::vector<std::string> _symbolicNames;
  static antlr4::dfa::Vocabulary _vocabulary;
  static antlr4::atn::ATN _atn;
  static std::vector<uint16_t> _serializedATN;


  struct Initializer {
    Initializer();
  };
  static Initializer _init;
};

}  // namespace verbum
