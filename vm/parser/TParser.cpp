
// Generated from ./TParser.g4 by ANTLR 4.9.2


#include "TParserListener.h"
#include "TParserVisitor.h"

#include "TParser.h"


  #ifndef _WIN32
  #pragma GCC diagnostic ignored "-Wunused-parameter"
  #endif


using namespace antlrcpp;
using namespace verbum;
using namespace antlr4;

TParser::TParser(TokenStream *input) : Parser(input) {
  _interpreter = new atn::ParserATNSimulator(this, _atn, _decisionToDFA, _sharedContextCache);
}

TParser::~TParser() {
  delete _interpreter;
}

std::string TParser::getGrammarFileName() const {
  return "TParser.g4";
}

const std::vector<std::string>& TParser::getRuleNames() const {
  return _ruleNames;
}

dfa::Vocabulary& TParser::getVocabulary() const {
  return _vocabulary;
}


//----------------- MainContext ------------------------------------------------------------------

TParser::MainContext::MainContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::FileContentContext* TParser::MainContext::fileContent() {
  return getRuleContext<TParser::FileContentContext>(0);
}

tree::TerminalNode* TParser::MainContext::EOF() {
  return getToken(TParser::EOF, 0);
}


size_t TParser::MainContext::getRuleIndex() const {
  return TParser::RuleMain;
}

void TParser::MainContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterMain(this);
}

void TParser::MainContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitMain(this);
}


antlrcpp::Any TParser::MainContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitMain(this);
  else
    return visitor->visitChildren(this);
}

TParser::MainContext* TParser::main() {
  MainContext *_localctx = _tracker.createInstance<MainContext>(_ctx, getState());
  enterRule(_localctx, 0, TParser::RuleMain);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(198);
    fileContent();
    setState(199);
    match(TParser::EOF);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- FileContentContext ------------------------------------------------------------------

TParser::FileContentContext::FileContentContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::SentenceContext* TParser::FileContentContext::sentence() {
  return getRuleContext<TParser::SentenceContext>(0);
}

TParser::FileContentContext* TParser::FileContentContext::fileContent() {
  return getRuleContext<TParser::FileContentContext>(0);
}


size_t TParser::FileContentContext::getRuleIndex() const {
  return TParser::RuleFileContent;
}

void TParser::FileContentContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterFileContent(this);
}

void TParser::FileContentContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitFileContent(this);
}


antlrcpp::Any TParser::FileContentContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitFileContent(this);
  else
    return visitor->visitChildren(this);
}

TParser::FileContentContext* TParser::fileContent() {
  FileContentContext *_localctx = _tracker.createInstance<FileContentContext>(_ctx, getState());
  enterRule(_localctx, 2, TParser::RuleFileContent);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(206);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 0, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(201);
      sentence();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(202);
      sentence();
      setState(203);
      fileContent();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);

      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- SentenceContext ------------------------------------------------------------------

TParser::SentenceContext::SentenceContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::LiveTokenContext* TParser::SentenceContext::liveToken() {
  return getRuleContext<TParser::LiveTokenContext>(0);
}

TParser::UseContext* TParser::SentenceContext::use() {
  return getRuleContext<TParser::UseContext>(0);
}

TParser::VariableContext* TParser::SentenceContext::variable() {
  return getRuleContext<TParser::VariableContext>(0);
}

TParser::CallingFunctionContext* TParser::SentenceContext::callingFunction() {
  return getRuleContext<TParser::CallingFunctionContext>(0);
}

TParser::ConditionalExpressionContext* TParser::SentenceContext::conditionalExpression() {
  return getRuleContext<TParser::ConditionalExpressionContext>(0);
}

TParser::LoopContext* TParser::SentenceContext::loop() {
  return getRuleContext<TParser::LoopContext>(0);
}

TParser::FunctionsContext* TParser::SentenceContext::functions() {
  return getRuleContext<TParser::FunctionsContext>(0);
}

TParser::RetContext* TParser::SentenceContext::ret() {
  return getRuleContext<TParser::RetContext>(0);
}

TParser::OopGeneralContext* TParser::SentenceContext::oopGeneral() {
  return getRuleContext<TParser::OopGeneralContext>(0);
}


size_t TParser::SentenceContext::getRuleIndex() const {
  return TParser::RuleSentence;
}

void TParser::SentenceContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterSentence(this);
}

void TParser::SentenceContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitSentence(this);
}


antlrcpp::Any TParser::SentenceContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitSentence(this);
  else
    return visitor->visitChildren(this);
}

TParser::SentenceContext* TParser::sentence() {
  SentenceContext *_localctx = _tracker.createInstance<SentenceContext>(_ctx, getState());
  enterRule(_localctx, 4, TParser::RuleSentence);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(217);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 1, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(208);
      liveToken();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(209);
      use();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(210);
      variable();
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(211);
      callingFunction();
      break;
    }

    case 5: {
      enterOuterAlt(_localctx, 5);
      setState(212);
      conditionalExpression();
      break;
    }

    case 6: {
      enterOuterAlt(_localctx, 6);
      setState(213);
      loop();
      break;
    }

    case 7: {
      enterOuterAlt(_localctx, 7);
      setState(214);
      functions();
      break;
    }

    case 8: {
      enterOuterAlt(_localctx, 8);
      setState(215);
      ret();
      break;
    }

    case 9: {
      enterOuterAlt(_localctx, 9);
      setState(216);
      oopGeneral();
      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- LiveTokenContext ------------------------------------------------------------------

TParser::LiveTokenContext::LiveTokenContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::LiveTokenContext::Newline() {
  return getToken(TParser::Newline, 0);
}


size_t TParser::LiveTokenContext::getRuleIndex() const {
  return TParser::RuleLiveToken;
}

void TParser::LiveTokenContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterLiveToken(this);
}

void TParser::LiveTokenContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitLiveToken(this);
}


antlrcpp::Any TParser::LiveTokenContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitLiveToken(this);
  else
    return visitor->visitChildren(this);
}

TParser::LiveTokenContext* TParser::liveToken() {
  LiveTokenContext *_localctx = _tracker.createInstance<LiveTokenContext>(_ctx, getState());
  enterRule(_localctx, 6, TParser::RuleLiveToken);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(219);
    match(TParser::Newline);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- UseContext ------------------------------------------------------------------

TParser::UseContext::UseContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::UseContext::Use() {
  return getToken(TParser::Use, 0);
}

TParser::UseValueContext* TParser::UseContext::useValue() {
  return getRuleContext<TParser::UseValueContext>(0);
}

tree::TerminalNode* TParser::UseContext::End() {
  return getToken(TParser::End, 0);
}


size_t TParser::UseContext::getRuleIndex() const {
  return TParser::RuleUse;
}

void TParser::UseContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterUse(this);
}

void TParser::UseContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitUse(this);
}


antlrcpp::Any TParser::UseContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitUse(this);
  else
    return visitor->visitChildren(this);
}

TParser::UseContext* TParser::use() {
  UseContext *_localctx = _tracker.createInstance<UseContext>(_ctx, getState());
  enterRule(_localctx, 8, TParser::RuleUse);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(221);
    match(TParser::Use);
    setState(222);
    useValue();
    setState(223);
    match(TParser::End);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- UseValueContext ------------------------------------------------------------------

TParser::UseValueContext::UseValueContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::UseStringContext* TParser::UseValueContext::useString() {
  return getRuleContext<TParser::UseStringContext>(0);
}

tree::TerminalNode* TParser::UseValueContext::Separator() {
  return getToken(TParser::Separator, 0);
}

TParser::UseValueContext* TParser::UseValueContext::useValue() {
  return getRuleContext<TParser::UseValueContext>(0);
}


size_t TParser::UseValueContext::getRuleIndex() const {
  return TParser::RuleUseValue;
}

void TParser::UseValueContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterUseValue(this);
}

void TParser::UseValueContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitUseValue(this);
}


antlrcpp::Any TParser::UseValueContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitUseValue(this);
  else
    return visitor->visitChildren(this);
}

TParser::UseValueContext* TParser::useValue() {
  UseValueContext *_localctx = _tracker.createInstance<UseValueContext>(_ctx, getState());
  enterRule(_localctx, 10, TParser::RuleUseValue);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(230);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 2, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(225);
      useString();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(226);
      useString();
      setState(227);
      match(TParser::Separator);
      setState(228);
      useValue();
      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- UseStringContext ------------------------------------------------------------------

TParser::UseStringContext::UseStringContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::UseStringContext::String() {
  return getToken(TParser::String, 0);
}


size_t TParser::UseStringContext::getRuleIndex() const {
  return TParser::RuleUseString;
}

void TParser::UseStringContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterUseString(this);
}

void TParser::UseStringContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitUseString(this);
}


antlrcpp::Any TParser::UseStringContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitUseString(this);
  else
    return visitor->visitChildren(this);
}

TParser::UseStringContext* TParser::useString() {
  UseStringContext *_localctx = _tracker.createInstance<UseStringContext>(_ctx, getState());
  enterRule(_localctx, 12, TParser::RuleUseString);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(232);
    match(TParser::String);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- VariableContext ------------------------------------------------------------------

TParser::VariableContext::VariableContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::VariableModesContext* TParser::VariableContext::variableModes() {
  return getRuleContext<TParser::VariableModesContext>(0);
}


size_t TParser::VariableContext::getRuleIndex() const {
  return TParser::RuleVariable;
}

void TParser::VariableContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterVariable(this);
}

void TParser::VariableContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitVariable(this);
}


antlrcpp::Any TParser::VariableContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitVariable(this);
  else
    return visitor->visitChildren(this);
}

TParser::VariableContext* TParser::variable() {
  VariableContext *_localctx = _tracker.createInstance<VariableContext>(_ctx, getState());
  enterRule(_localctx, 14, TParser::RuleVariable);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(234);
    variableModes();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- VariableModesContext ------------------------------------------------------------------

TParser::VariableModesContext::VariableModesContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::VariableModesContext::Var() {
  return getToken(TParser::Var, 0);
}

TParser::VariableMembersContext* TParser::VariableModesContext::variableMembers() {
  return getRuleContext<TParser::VariableMembersContext>(0);
}

tree::TerminalNode* TParser::VariableModesContext::End() {
  return getToken(TParser::End, 0);
}

TParser::MethodPermContext* TParser::VariableModesContext::methodPerm() {
  return getRuleContext<TParser::MethodPermContext>(0);
}

tree::TerminalNode* TParser::VariableModesContext::Static() {
  return getToken(TParser::Static, 0);
}

tree::TerminalNode* TParser::VariableModesContext::Final() {
  return getToken(TParser::Final, 0);
}


size_t TParser::VariableModesContext::getRuleIndex() const {
  return TParser::RuleVariableModes;
}

void TParser::VariableModesContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterVariableModes(this);
}

void TParser::VariableModesContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitVariableModes(this);
}


antlrcpp::Any TParser::VariableModesContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitVariableModes(this);
  else
    return visitor->visitChildren(this);
}

TParser::VariableModesContext* TParser::variableModes() {
  VariableModesContext *_localctx = _tracker.createInstance<VariableModesContext>(_ctx, getState());
  enterRule(_localctx, 16, TParser::RuleVariableModes);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(283);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 3, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(236);
      match(TParser::Var);
      setState(237);
      variableMembers();
      setState(238);
      match(TParser::End);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(240);
      methodPerm();
      setState(241);
      match(TParser::Var);
      setState(242);
      variableMembers();
      setState(243);
      match(TParser::End);
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(245);
      match(TParser::Static);
      setState(246);
      match(TParser::Var);
      setState(247);
      variableMembers();
      setState(248);
      match(TParser::End);
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(250);
      methodPerm();
      setState(251);
      match(TParser::Static);
      setState(252);
      match(TParser::Var);
      setState(253);
      variableMembers();
      setState(254);
      match(TParser::End);
      break;
    }

    case 5: {
      enterOuterAlt(_localctx, 5);
      setState(256);
      match(TParser::Final);
      setState(257);
      methodPerm();
      setState(258);
      match(TParser::Static);
      setState(259);
      match(TParser::Var);
      setState(260);
      variableMembers();
      setState(261);
      match(TParser::End);
      break;
    }

    case 6: {
      enterOuterAlt(_localctx, 6);
      setState(263);
      match(TParser::Final);
      setState(264);
      methodPerm();
      setState(265);
      match(TParser::Var);
      setState(266);
      variableMembers();
      setState(267);
      match(TParser::End);
      break;
    }

    case 7: {
      enterOuterAlt(_localctx, 7);
      setState(269);
      match(TParser::Final);
      setState(270);
      match(TParser::Var);
      setState(271);
      variableMembers();
      setState(272);
      match(TParser::End);
      break;
    }

    case 8: {
      enterOuterAlt(_localctx, 8);
      setState(274);
      match(TParser::Final);
      setState(275);
      match(TParser::Static);
      setState(276);
      match(TParser::Var);
      setState(277);
      variableMembers();
      setState(278);
      match(TParser::End);
      break;
    }

    case 9: {
      enterOuterAlt(_localctx, 9);
      setState(280);
      variableMembers();
      setState(281);
      match(TParser::End);
      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- VariableMembersContext ------------------------------------------------------------------

TParser::VariableMembersContext::VariableMembersContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::VariableDefinitionContext* TParser::VariableMembersContext::variableDefinition() {
  return getRuleContext<TParser::VariableDefinitionContext>(0);
}

tree::TerminalNode* TParser::VariableMembersContext::Separator() {
  return getToken(TParser::Separator, 0);
}

TParser::VariableMembersContext* TParser::VariableMembersContext::variableMembers() {
  return getRuleContext<TParser::VariableMembersContext>(0);
}


size_t TParser::VariableMembersContext::getRuleIndex() const {
  return TParser::RuleVariableMembers;
}

void TParser::VariableMembersContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterVariableMembers(this);
}

void TParser::VariableMembersContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitVariableMembers(this);
}


antlrcpp::Any TParser::VariableMembersContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitVariableMembers(this);
  else
    return visitor->visitChildren(this);
}

TParser::VariableMembersContext* TParser::variableMembers() {
  VariableMembersContext *_localctx = _tracker.createInstance<VariableMembersContext>(_ctx, getState());
  enterRule(_localctx, 18, TParser::RuleVariableMembers);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(290);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 4, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(285);
      variableDefinition();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(286);
      variableDefinition();
      setState(287);
      match(TParser::Separator);
      setState(288);
      variableMembers();
      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- VariableDefinitionContext ------------------------------------------------------------------

TParser::VariableDefinitionContext::VariableDefinitionContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::VariableDefinitionContext::Identifier() {
  return getToken(TParser::Identifier, 0);
}

TParser::VariableDefinitionGeneralContext* TParser::VariableDefinitionContext::variableDefinitionGeneral() {
  return getRuleContext<TParser::VariableDefinitionGeneralContext>(0);
}

TParser::ObjIdentifierAContext* TParser::VariableDefinitionContext::objIdentifierA() {
  return getRuleContext<TParser::ObjIdentifierAContext>(0);
}

tree::TerminalNode* TParser::VariableDefinitionContext::Point() {
  return getToken(TParser::Point, 0);
}

TParser::ObjIdentifierBContext* TParser::VariableDefinitionContext::objIdentifierB() {
  return getRuleContext<TParser::ObjIdentifierBContext>(0);
}

tree::TerminalNode* TParser::VariableDefinitionContext::TwoTwoPoint() {
  return getToken(TParser::TwoTwoPoint, 0);
}

TParser::ArrayAccessElementsContext* TParser::VariableDefinitionContext::arrayAccessElements() {
  return getRuleContext<TParser::ArrayAccessElementsContext>(0);
}


size_t TParser::VariableDefinitionContext::getRuleIndex() const {
  return TParser::RuleVariableDefinition;
}

void TParser::VariableDefinitionContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterVariableDefinition(this);
}

void TParser::VariableDefinitionContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitVariableDefinition(this);
}


antlrcpp::Any TParser::VariableDefinitionContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitVariableDefinition(this);
  else
    return visitor->visitChildren(this);
}

TParser::VariableDefinitionContext* TParser::variableDefinition() {
  VariableDefinitionContext *_localctx = _tracker.createInstance<VariableDefinitionContext>(_ctx, getState());
  enterRule(_localctx, 20, TParser::RuleVariableDefinition);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(307);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 5, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(292);
      match(TParser::Identifier);
      setState(293);
      variableDefinitionGeneral();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(294);
      objIdentifierA();
      setState(295);
      match(TParser::Point);
      setState(296);
      objIdentifierB();
      setState(297);
      variableDefinitionGeneral();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(299);
      objIdentifierA();
      setState(300);
      match(TParser::TwoTwoPoint);
      setState(301);
      objIdentifierB();
      setState(302);
      variableDefinitionGeneral();
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(304);
      arrayAccessElements();
      setState(305);
      variableDefinitionGeneral();
      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- VariableDefinitionGeneralContext ------------------------------------------------------------------

TParser::VariableDefinitionGeneralContext::VariableDefinitionGeneralContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::GeneralValueContext* TParser::VariableDefinitionGeneralContext::generalValue() {
  return getRuleContext<TParser::GeneralValueContext>(0);
}

tree::TerminalNode* TParser::VariableDefinitionGeneralContext::Attr() {
  return getToken(TParser::Attr, 0);
}

tree::TerminalNode* TParser::VariableDefinitionGeneralContext::AssignmentOperator() {
  return getToken(TParser::AssignmentOperator, 0);
}

tree::TerminalNode* TParser::VariableDefinitionGeneralContext::TypeSpec() {
  return getToken(TParser::TypeSpec, 0);
}

tree::TerminalNode* TParser::VariableDefinitionGeneralContext::New() {
  return getToken(TParser::New, 0);
}


size_t TParser::VariableDefinitionGeneralContext::getRuleIndex() const {
  return TParser::RuleVariableDefinitionGeneral;
}

void TParser::VariableDefinitionGeneralContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterVariableDefinitionGeneral(this);
}

void TParser::VariableDefinitionGeneralContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitVariableDefinitionGeneral(this);
}


antlrcpp::Any TParser::VariableDefinitionGeneralContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitVariableDefinitionGeneral(this);
  else
    return visitor->visitChildren(this);
}

TParser::VariableDefinitionGeneralContext* TParser::variableDefinitionGeneral() {
  VariableDefinitionGeneralContext *_localctx = _tracker.createInstance<VariableDefinitionGeneralContext>(_ctx, getState());
  enterRule(_localctx, 22, TParser::RuleVariableDefinitionGeneral);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(321);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 6, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(309);
      _la = _input->LA(1);
      if (!(_la == TParser::Attr

      || _la == TParser::AssignmentOperator)) {
      _errHandler->recoverInline(this);
      }
      else {
        _errHandler->reportMatch(this);
        consume();
      }
      setState(310);
      generalValue();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(311);
      match(TParser::TypeSpec);
      setState(312);
      _la = _input->LA(1);
      if (!(_la == TParser::Attr

      || _la == TParser::AssignmentOperator)) {
      _errHandler->recoverInline(this);
      }
      else {
        _errHandler->reportMatch(this);
        consume();
      }
      setState(313);
      generalValue();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(314);
      _la = _input->LA(1);
      if (!(_la == TParser::Attr

      || _la == TParser::AssignmentOperator)) {
      _errHandler->recoverInline(this);
      }
      else {
        _errHandler->reportMatch(this);
        consume();
      }
      setState(315);
      match(TParser::New);
      setState(316);
      generalValue();
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(317);
      match(TParser::TypeSpec);
      setState(318);
      _la = _input->LA(1);
      if (!(_la == TParser::Attr

      || _la == TParser::AssignmentOperator)) {
      _errHandler->recoverInline(this);
      }
      else {
        _errHandler->reportMatch(this);
        consume();
      }
      setState(319);
      match(TParser::New);
      setState(320);
      generalValue();
      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- IndexArrayContext ------------------------------------------------------------------

TParser::IndexArrayContext::IndexArrayContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::IndexArrayContext::OpenArIndex() {
  return getToken(TParser::OpenArIndex, 0);
}

tree::TerminalNode* TParser::IndexArrayContext::CloseArIndex() {
  return getToken(TParser::CloseArIndex, 0);
}

TParser::IndexArrayElementsContext* TParser::IndexArrayContext::indexArrayElements() {
  return getRuleContext<TParser::IndexArrayElementsContext>(0);
}


size_t TParser::IndexArrayContext::getRuleIndex() const {
  return TParser::RuleIndexArray;
}

void TParser::IndexArrayContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterIndexArray(this);
}

void TParser::IndexArrayContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitIndexArray(this);
}


antlrcpp::Any TParser::IndexArrayContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitIndexArray(this);
  else
    return visitor->visitChildren(this);
}

TParser::IndexArrayContext* TParser::indexArray() {
  IndexArrayContext *_localctx = _tracker.createInstance<IndexArrayContext>(_ctx, getState());
  enterRule(_localctx, 24, TParser::RuleIndexArray);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(329);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 7, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(323);
      match(TParser::OpenArIndex);
      setState(324);
      match(TParser::CloseArIndex);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(325);
      match(TParser::OpenArIndex);
      setState(326);
      indexArrayElements();
      setState(327);
      match(TParser::CloseArIndex);
      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- IndexArrayElementsContext ------------------------------------------------------------------

TParser::IndexArrayElementsContext::IndexArrayElementsContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::GeneralValueContext* TParser::IndexArrayElementsContext::generalValue() {
  return getRuleContext<TParser::GeneralValueContext>(0);
}

tree::TerminalNode* TParser::IndexArrayElementsContext::Separator() {
  return getToken(TParser::Separator, 0);
}

TParser::IndexArrayElementsContext* TParser::IndexArrayElementsContext::indexArrayElements() {
  return getRuleContext<TParser::IndexArrayElementsContext>(0);
}


size_t TParser::IndexArrayElementsContext::getRuleIndex() const {
  return TParser::RuleIndexArrayElements;
}

void TParser::IndexArrayElementsContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterIndexArrayElements(this);
}

void TParser::IndexArrayElementsContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitIndexArrayElements(this);
}


antlrcpp::Any TParser::IndexArrayElementsContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitIndexArrayElements(this);
  else
    return visitor->visitChildren(this);
}

TParser::IndexArrayElementsContext* TParser::indexArrayElements() {
  IndexArrayElementsContext *_localctx = _tracker.createInstance<IndexArrayElementsContext>(_ctx, getState());
  enterRule(_localctx, 26, TParser::RuleIndexArrayElements);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(336);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 8, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(331);
      generalValue();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(332);
      generalValue();
      setState(333);
      match(TParser::Separator);
      setState(334);
      indexArrayElements();
      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- AssociativeArrayContext ------------------------------------------------------------------

TParser::AssociativeArrayContext::AssociativeArrayContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::AssociativeArrayContext::OpenBlock() {
  return getToken(TParser::OpenBlock, 0);
}

tree::TerminalNode* TParser::AssociativeArrayContext::CloseBlock() {
  return getToken(TParser::CloseBlock, 0);
}

TParser::AssociativeArrayElementsContext* TParser::AssociativeArrayContext::associativeArrayElements() {
  return getRuleContext<TParser::AssociativeArrayElementsContext>(0);
}


size_t TParser::AssociativeArrayContext::getRuleIndex() const {
  return TParser::RuleAssociativeArray;
}

void TParser::AssociativeArrayContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterAssociativeArray(this);
}

void TParser::AssociativeArrayContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitAssociativeArray(this);
}


antlrcpp::Any TParser::AssociativeArrayContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitAssociativeArray(this);
  else
    return visitor->visitChildren(this);
}

TParser::AssociativeArrayContext* TParser::associativeArray() {
  AssociativeArrayContext *_localctx = _tracker.createInstance<AssociativeArrayContext>(_ctx, getState());
  enterRule(_localctx, 28, TParser::RuleAssociativeArray);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(344);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 9, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(338);
      match(TParser::OpenBlock);
      setState(339);
      match(TParser::CloseBlock);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(340);
      match(TParser::OpenBlock);
      setState(341);
      associativeArrayElements();
      setState(342);
      match(TParser::CloseBlock);
      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- AssociativeArrayElementsContext ------------------------------------------------------------------

TParser::AssociativeArrayElementsContext::AssociativeArrayElementsContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::AssociativeArrayElementsContext::Identifier() {
  return getToken(TParser::Identifier, 0);
}

tree::TerminalNode* TParser::AssociativeArrayElementsContext::TwoPoint() {
  return getToken(TParser::TwoPoint, 0);
}

TParser::GeneralValueContext* TParser::AssociativeArrayElementsContext::generalValue() {
  return getRuleContext<TParser::GeneralValueContext>(0);
}

tree::TerminalNode* TParser::AssociativeArrayElementsContext::Separator() {
  return getToken(TParser::Separator, 0);
}

TParser::AssociativeArrayElementsContext* TParser::AssociativeArrayElementsContext::associativeArrayElements() {
  return getRuleContext<TParser::AssociativeArrayElementsContext>(0);
}


size_t TParser::AssociativeArrayElementsContext::getRuleIndex() const {
  return TParser::RuleAssociativeArrayElements;
}

void TParser::AssociativeArrayElementsContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterAssociativeArrayElements(this);
}

void TParser::AssociativeArrayElementsContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitAssociativeArrayElements(this);
}


antlrcpp::Any TParser::AssociativeArrayElementsContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitAssociativeArrayElements(this);
  else
    return visitor->visitChildren(this);
}

TParser::AssociativeArrayElementsContext* TParser::associativeArrayElements() {
  AssociativeArrayElementsContext *_localctx = _tracker.createInstance<AssociativeArrayElementsContext>(_ctx, getState());
  enterRule(_localctx, 30, TParser::RuleAssociativeArrayElements);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(355);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 10, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(346);
      match(TParser::Identifier);
      setState(347);
      match(TParser::TwoPoint);
      setState(348);
      generalValue();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(349);
      match(TParser::Identifier);
      setState(350);
      match(TParser::TwoPoint);
      setState(351);
      generalValue();
      setState(352);
      match(TParser::Separator);
      setState(353);
      associativeArrayElements();
      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- OperationBlockContext ------------------------------------------------------------------

TParser::OperationBlockContext::OperationBlockContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::OperationBlockContext::OpenOp() {
  return getToken(TParser::OpenOp, 0);
}

TParser::OperationElementsContext* TParser::OperationBlockContext::operationElements() {
  return getRuleContext<TParser::OperationElementsContext>(0);
}

tree::TerminalNode* TParser::OperationBlockContext::CloseOp() {
  return getToken(TParser::CloseOp, 0);
}


size_t TParser::OperationBlockContext::getRuleIndex() const {
  return TParser::RuleOperationBlock;
}

void TParser::OperationBlockContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterOperationBlock(this);
}

void TParser::OperationBlockContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitOperationBlock(this);
}


antlrcpp::Any TParser::OperationBlockContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitOperationBlock(this);
  else
    return visitor->visitChildren(this);
}

TParser::OperationBlockContext* TParser::operationBlock() {
  OperationBlockContext *_localctx = _tracker.createInstance<OperationBlockContext>(_ctx, getState());
  enterRule(_localctx, 32, TParser::RuleOperationBlock);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(357);
    match(TParser::OpenOp);
    setState(358);
    operationElements();
    setState(359);
    match(TParser::CloseOp);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- OperationElementsContext ------------------------------------------------------------------

TParser::OperationElementsContext::OperationElementsContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::OperationValueContext* TParser::OperationElementsContext::operationValue() {
  return getRuleContext<TParser::OperationValueContext>(0);
}

TParser::OperationElementsContext* TParser::OperationElementsContext::operationElements() {
  return getRuleContext<TParser::OperationElementsContext>(0);
}


size_t TParser::OperationElementsContext::getRuleIndex() const {
  return TParser::RuleOperationElements;
}

void TParser::OperationElementsContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterOperationElements(this);
}

void TParser::OperationElementsContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitOperationElements(this);
}


antlrcpp::Any TParser::OperationElementsContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitOperationElements(this);
  else
    return visitor->visitChildren(this);
}

TParser::OperationElementsContext* TParser::operationElements() {
  OperationElementsContext *_localctx = _tracker.createInstance<OperationElementsContext>(_ctx, getState());
  enterRule(_localctx, 34, TParser::RuleOperationElements);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(365);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 11, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(361);
      operationValue();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(362);
      operationValue();
      setState(363);
      operationElements();
      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- OperationValueContext ------------------------------------------------------------------

TParser::OperationValueContext::OperationValueContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::FunctionCallContext* TParser::OperationValueContext::functionCall() {
  return getRuleContext<TParser::FunctionCallContext>(0);
}

tree::TerminalNode* TParser::OperationValueContext::ArithmeticOperator() {
  return getToken(TParser::ArithmeticOperator, 0);
}

tree::TerminalNode* TParser::OperationValueContext::TypeSpec() {
  return getToken(TParser::TypeSpec, 0);
}

tree::TerminalNode* TParser::OperationValueContext::Identifier() {
  return getToken(TParser::Identifier, 0);
}

TParser::FirstIncDecContext* TParser::OperationValueContext::firstIncDec() {
  return getRuleContext<TParser::FirstIncDecContext>(0);
}

TParser::LastIncDecContext* TParser::OperationValueContext::lastIncDec() {
  return getRuleContext<TParser::LastIncDecContext>(0);
}

tree::TerminalNode* TParser::OperationValueContext::Integer() {
  return getToken(TParser::Integer, 0);
}

tree::TerminalNode* TParser::OperationValueContext::Float() {
  return getToken(TParser::Float, 0);
}

TParser::OperationBlockContext* TParser::OperationValueContext::operationBlock() {
  return getRuleContext<TParser::OperationBlockContext>(0);
}

TParser::ArrayAccessElementsContext* TParser::OperationValueContext::arrayAccessElements() {
  return getRuleContext<TParser::ArrayAccessElementsContext>(0);
}


size_t TParser::OperationValueContext::getRuleIndex() const {
  return TParser::RuleOperationValue;
}

void TParser::OperationValueContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterOperationValue(this);
}

void TParser::OperationValueContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitOperationValue(this);
}


antlrcpp::Any TParser::OperationValueContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitOperationValue(this);
  else
    return visitor->visitChildren(this);
}

TParser::OperationValueContext* TParser::operationValue() {
  OperationValueContext *_localctx = _tracker.createInstance<OperationValueContext>(_ctx, getState());
  enterRule(_localctx, 36, TParser::RuleOperationValue);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(455);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 12, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(367);
      functionCall();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(368);
      functionCall();
      setState(369);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(371);
      functionCall();
      setState(372);
      match(TParser::TypeSpec);
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(374);
      functionCall();
      setState(375);
      match(TParser::TypeSpec);
      setState(376);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 5: {
      enterOuterAlt(_localctx, 5);
      setState(378);
      match(TParser::Identifier);
      break;
    }

    case 6: {
      enterOuterAlt(_localctx, 6);
      setState(379);
      match(TParser::Identifier);
      setState(380);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 7: {
      enterOuterAlt(_localctx, 7);
      setState(381);
      match(TParser::Identifier);
      setState(382);
      match(TParser::TypeSpec);
      break;
    }

    case 8: {
      enterOuterAlt(_localctx, 8);
      setState(383);
      match(TParser::Identifier);
      setState(384);
      match(TParser::TypeSpec);
      setState(385);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 9: {
      enterOuterAlt(_localctx, 9);
      setState(386);
      firstIncDec();
      setState(387);
      match(TParser::Identifier);
      break;
    }

    case 10: {
      enterOuterAlt(_localctx, 10);
      setState(389);
      firstIncDec();
      setState(390);
      match(TParser::Identifier);
      setState(391);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 11: {
      enterOuterAlt(_localctx, 11);
      setState(393);
      firstIncDec();
      setState(394);
      match(TParser::Identifier);
      setState(395);
      match(TParser::TypeSpec);
      break;
    }

    case 12: {
      enterOuterAlt(_localctx, 12);
      setState(397);
      firstIncDec();
      setState(398);
      match(TParser::Identifier);
      setState(399);
      match(TParser::TypeSpec);
      setState(400);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 13: {
      enterOuterAlt(_localctx, 13);
      setState(402);
      match(TParser::Identifier);
      setState(403);
      lastIncDec();
      break;
    }

    case 14: {
      enterOuterAlt(_localctx, 14);
      setState(404);
      match(TParser::Identifier);
      setState(405);
      lastIncDec();
      setState(406);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 15: {
      enterOuterAlt(_localctx, 15);
      setState(408);
      match(TParser::Identifier);
      setState(409);
      lastIncDec();
      setState(410);
      match(TParser::TypeSpec);
      break;
    }

    case 16: {
      enterOuterAlt(_localctx, 16);
      setState(412);
      match(TParser::Identifier);
      setState(413);
      lastIncDec();
      setState(414);
      match(TParser::TypeSpec);
      setState(415);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 17: {
      enterOuterAlt(_localctx, 17);
      setState(417);
      match(TParser::Integer);
      break;
    }

    case 18: {
      enterOuterAlt(_localctx, 18);
      setState(418);
      match(TParser::Integer);
      setState(419);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 19: {
      enterOuterAlt(_localctx, 19);
      setState(420);
      match(TParser::Integer);
      setState(421);
      match(TParser::TypeSpec);
      break;
    }

    case 20: {
      enterOuterAlt(_localctx, 20);
      setState(422);
      match(TParser::Integer);
      setState(423);
      match(TParser::TypeSpec);
      setState(424);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 21: {
      enterOuterAlt(_localctx, 21);
      setState(425);
      match(TParser::Float);
      break;
    }

    case 22: {
      enterOuterAlt(_localctx, 22);
      setState(426);
      match(TParser::Float);
      setState(427);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 23: {
      enterOuterAlt(_localctx, 23);
      setState(428);
      match(TParser::Float);
      setState(429);
      match(TParser::TypeSpec);
      break;
    }

    case 24: {
      enterOuterAlt(_localctx, 24);
      setState(430);
      match(TParser::Float);
      setState(431);
      match(TParser::TypeSpec);
      setState(432);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 25: {
      enterOuterAlt(_localctx, 25);
      setState(433);
      operationBlock();
      break;
    }

    case 26: {
      enterOuterAlt(_localctx, 26);
      setState(434);
      operationBlock();
      setState(435);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 27: {
      enterOuterAlt(_localctx, 27);
      setState(437);
      operationBlock();
      setState(438);
      match(TParser::TypeSpec);
      break;
    }

    case 28: {
      enterOuterAlt(_localctx, 28);
      setState(440);
      operationBlock();
      setState(441);
      match(TParser::TypeSpec);
      setState(442);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 29: {
      enterOuterAlt(_localctx, 29);
      setState(444);
      arrayAccessElements();
      break;
    }

    case 30: {
      enterOuterAlt(_localctx, 30);
      setState(445);
      arrayAccessElements();
      setState(446);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 31: {
      enterOuterAlt(_localctx, 31);
      setState(448);
      arrayAccessElements();
      setState(449);
      match(TParser::TypeSpec);
      break;
    }

    case 32: {
      enterOuterAlt(_localctx, 32);
      setState(451);
      arrayAccessElements();
      setState(452);
      match(TParser::TypeSpec);
      setState(453);
      match(TParser::ArithmeticOperator);
      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- FirstIncDecContext ------------------------------------------------------------------

TParser::FirstIncDecContext::FirstIncDecContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::FirstIncDecContext::IncDecOperators() {
  return getToken(TParser::IncDecOperators, 0);
}


size_t TParser::FirstIncDecContext::getRuleIndex() const {
  return TParser::RuleFirstIncDec;
}

void TParser::FirstIncDecContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterFirstIncDec(this);
}

void TParser::FirstIncDecContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitFirstIncDec(this);
}


antlrcpp::Any TParser::FirstIncDecContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitFirstIncDec(this);
  else
    return visitor->visitChildren(this);
}

TParser::FirstIncDecContext* TParser::firstIncDec() {
  FirstIncDecContext *_localctx = _tracker.createInstance<FirstIncDecContext>(_ctx, getState());
  enterRule(_localctx, 38, TParser::RuleFirstIncDec);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(457);
    match(TParser::IncDecOperators);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- LastIncDecContext ------------------------------------------------------------------

TParser::LastIncDecContext::LastIncDecContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::LastIncDecContext::IncDecOperators() {
  return getToken(TParser::IncDecOperators, 0);
}


size_t TParser::LastIncDecContext::getRuleIndex() const {
  return TParser::RuleLastIncDec;
}

void TParser::LastIncDecContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterLastIncDec(this);
}

void TParser::LastIncDecContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitLastIncDec(this);
}


antlrcpp::Any TParser::LastIncDecContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitLastIncDec(this);
  else
    return visitor->visitChildren(this);
}

TParser::LastIncDecContext* TParser::lastIncDec() {
  LastIncDecContext *_localctx = _tracker.createInstance<LastIncDecContext>(_ctx, getState());
  enterRule(_localctx, 40, TParser::RuleLastIncDec);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(459);
    match(TParser::IncDecOperators);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- CallingFunctionContext ------------------------------------------------------------------

TParser::CallingFunctionContext::CallingFunctionContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::FunctionCallContext* TParser::CallingFunctionContext::functionCall() {
  return getRuleContext<TParser::FunctionCallContext>(0);
}

tree::TerminalNode* TParser::CallingFunctionContext::End() {
  return getToken(TParser::End, 0);
}


size_t TParser::CallingFunctionContext::getRuleIndex() const {
  return TParser::RuleCallingFunction;
}

void TParser::CallingFunctionContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterCallingFunction(this);
}

void TParser::CallingFunctionContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitCallingFunction(this);
}


antlrcpp::Any TParser::CallingFunctionContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitCallingFunction(this);
  else
    return visitor->visitChildren(this);
}

TParser::CallingFunctionContext* TParser::callingFunction() {
  CallingFunctionContext *_localctx = _tracker.createInstance<CallingFunctionContext>(_ctx, getState());
  enterRule(_localctx, 42, TParser::RuleCallingFunction);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(461);
    functionCall();
    setState(462);
    match(TParser::End);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- FunctionCallContext ------------------------------------------------------------------

TParser::FunctionCallContext::FunctionCallContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::FunctionCallContext::Identifier() {
  return getToken(TParser::Identifier, 0);
}

TParser::FunctionCallParamContext* TParser::FunctionCallContext::functionCallParam() {
  return getRuleContext<TParser::FunctionCallParamContext>(0);
}

tree::TerminalNode* TParser::FunctionCallContext::Point() {
  return getToken(TParser::Point, 0);
}

TParser::IdentifierBContext* TParser::FunctionCallContext::identifierB() {
  return getRuleContext<TParser::IdentifierBContext>(0);
}

tree::TerminalNode* TParser::FunctionCallContext::TwoTwoPoint() {
  return getToken(TParser::TwoTwoPoint, 0);
}

TParser::MethodCascadingModesContext* TParser::FunctionCallContext::methodCascadingModes() {
  return getRuleContext<TParser::MethodCascadingModesContext>(0);
}


size_t TParser::FunctionCallContext::getRuleIndex() const {
  return TParser::RuleFunctionCall;
}

void TParser::FunctionCallContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterFunctionCall(this);
}

void TParser::FunctionCallContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitFunctionCall(this);
}


antlrcpp::Any TParser::FunctionCallContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitFunctionCall(this);
  else
    return visitor->visitChildren(this);
}

TParser::FunctionCallContext* TParser::functionCall() {
  FunctionCallContext *_localctx = _tracker.createInstance<FunctionCallContext>(_ctx, getState());
  enterRule(_localctx, 44, TParser::RuleFunctionCall);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(477);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 13, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(464);
      match(TParser::Identifier);
      setState(465);
      functionCallParam();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(466);
      match(TParser::Identifier);
      setState(467);
      match(TParser::Point);
      setState(468);
      identifierB();
      setState(469);
      functionCallParam();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(471);
      match(TParser::Identifier);
      setState(472);
      match(TParser::TwoTwoPoint);
      setState(473);
      identifierB();
      setState(474);
      functionCallParam();
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(476);
      methodCascadingModes();
      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- MethodCascadingModesContext ------------------------------------------------------------------

TParser::MethodCascadingModesContext::MethodCascadingModesContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::MethodCascadingModesContext::Identifier() {
  return getToken(TParser::Identifier, 0);
}

tree::TerminalNode* TParser::MethodCascadingModesContext::Point() {
  return getToken(TParser::Point, 0);
}

TParser::FunctionCallCascadingContext* TParser::MethodCascadingModesContext::functionCallCascading() {
  return getRuleContext<TParser::FunctionCallCascadingContext>(0);
}


size_t TParser::MethodCascadingModesContext::getRuleIndex() const {
  return TParser::RuleMethodCascadingModes;
}

void TParser::MethodCascadingModesContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterMethodCascadingModes(this);
}

void TParser::MethodCascadingModesContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitMethodCascadingModes(this);
}


antlrcpp::Any TParser::MethodCascadingModesContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitMethodCascadingModes(this);
  else
    return visitor->visitChildren(this);
}

TParser::MethodCascadingModesContext* TParser::methodCascadingModes() {
  MethodCascadingModesContext *_localctx = _tracker.createInstance<MethodCascadingModesContext>(_ctx, getState());
  enterRule(_localctx, 46, TParser::RuleMethodCascadingModes);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(479);
    match(TParser::Identifier);
    setState(480);
    match(TParser::Point);
    setState(481);
    functionCallCascading();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- FunctionCallCascadingContext ------------------------------------------------------------------

TParser::FunctionCallCascadingContext::FunctionCallCascadingContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::FunctionCallCascadingItemContext* TParser::FunctionCallCascadingContext::functionCallCascadingItem() {
  return getRuleContext<TParser::FunctionCallCascadingItemContext>(0);
}

tree::TerminalNode* TParser::FunctionCallCascadingContext::Point() {
  return getToken(TParser::Point, 0);
}

TParser::FunctionCallCascadingContext* TParser::FunctionCallCascadingContext::functionCallCascading() {
  return getRuleContext<TParser::FunctionCallCascadingContext>(0);
}


size_t TParser::FunctionCallCascadingContext::getRuleIndex() const {
  return TParser::RuleFunctionCallCascading;
}

void TParser::FunctionCallCascadingContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterFunctionCallCascading(this);
}

void TParser::FunctionCallCascadingContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitFunctionCallCascading(this);
}


antlrcpp::Any TParser::FunctionCallCascadingContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitFunctionCallCascading(this);
  else
    return visitor->visitChildren(this);
}

TParser::FunctionCallCascadingContext* TParser::functionCallCascading() {
  FunctionCallCascadingContext *_localctx = _tracker.createInstance<FunctionCallCascadingContext>(_ctx, getState());
  enterRule(_localctx, 48, TParser::RuleFunctionCallCascading);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(488);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 14, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(483);
      functionCallCascadingItem();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(484);
      functionCallCascadingItem();
      setState(485);
      match(TParser::Point);
      setState(486);
      functionCallCascading();
      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- FunctionCallCascadingItemContext ------------------------------------------------------------------

TParser::FunctionCallCascadingItemContext::FunctionCallCascadingItemContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::FunctionCallCascadingItemContext::Identifier() {
  return getToken(TParser::Identifier, 0);
}

TParser::FunctionCallParamContext* TParser::FunctionCallCascadingItemContext::functionCallParam() {
  return getRuleContext<TParser::FunctionCallParamContext>(0);
}


size_t TParser::FunctionCallCascadingItemContext::getRuleIndex() const {
  return TParser::RuleFunctionCallCascadingItem;
}

void TParser::FunctionCallCascadingItemContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterFunctionCallCascadingItem(this);
}

void TParser::FunctionCallCascadingItemContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitFunctionCallCascadingItem(this);
}


antlrcpp::Any TParser::FunctionCallCascadingItemContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitFunctionCallCascadingItem(this);
  else
    return visitor->visitChildren(this);
}

TParser::FunctionCallCascadingItemContext* TParser::functionCallCascadingItem() {
  FunctionCallCascadingItemContext *_localctx = _tracker.createInstance<FunctionCallCascadingItemContext>(_ctx, getState());
  enterRule(_localctx, 50, TParser::RuleFunctionCallCascadingItem);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(490);
    match(TParser::Identifier);
    setState(491);
    functionCallParam();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- IdentifierBContext ------------------------------------------------------------------

TParser::IdentifierBContext::IdentifierBContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::IdentifierBContext::Identifier() {
  return getToken(TParser::Identifier, 0);
}


size_t TParser::IdentifierBContext::getRuleIndex() const {
  return TParser::RuleIdentifierB;
}

void TParser::IdentifierBContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterIdentifierB(this);
}

void TParser::IdentifierBContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitIdentifierB(this);
}


antlrcpp::Any TParser::IdentifierBContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitIdentifierB(this);
  else
    return visitor->visitChildren(this);
}

TParser::IdentifierBContext* TParser::identifierB() {
  IdentifierBContext *_localctx = _tracker.createInstance<IdentifierBContext>(_ctx, getState());
  enterRule(_localctx, 52, TParser::RuleIdentifierB);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(493);
    match(TParser::Identifier);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- PointSeparatorContext ------------------------------------------------------------------

TParser::PointSeparatorContext::PointSeparatorContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::PointSeparatorContext::Point() {
  return getToken(TParser::Point, 0);
}


size_t TParser::PointSeparatorContext::getRuleIndex() const {
  return TParser::RulePointSeparator;
}

void TParser::PointSeparatorContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterPointSeparator(this);
}

void TParser::PointSeparatorContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitPointSeparator(this);
}


antlrcpp::Any TParser::PointSeparatorContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitPointSeparator(this);
  else
    return visitor->visitChildren(this);
}

TParser::PointSeparatorContext* TParser::pointSeparator() {
  PointSeparatorContext *_localctx = _tracker.createInstance<PointSeparatorContext>(_ctx, getState());
  enterRule(_localctx, 54, TParser::RulePointSeparator);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(495);
    match(TParser::Point);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- FunctionCallParamContext ------------------------------------------------------------------

TParser::FunctionCallParamContext::FunctionCallParamContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::FunctionCallParamContext::OpenOp() {
  return getToken(TParser::OpenOp, 0);
}

tree::TerminalNode* TParser::FunctionCallParamContext::CloseOp() {
  return getToken(TParser::CloseOp, 0);
}

TParser::FunctionCallParamElementsContext* TParser::FunctionCallParamContext::functionCallParamElements() {
  return getRuleContext<TParser::FunctionCallParamElementsContext>(0);
}


size_t TParser::FunctionCallParamContext::getRuleIndex() const {
  return TParser::RuleFunctionCallParam;
}

void TParser::FunctionCallParamContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterFunctionCallParam(this);
}

void TParser::FunctionCallParamContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitFunctionCallParam(this);
}


antlrcpp::Any TParser::FunctionCallParamContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitFunctionCallParam(this);
  else
    return visitor->visitChildren(this);
}

TParser::FunctionCallParamContext* TParser::functionCallParam() {
  FunctionCallParamContext *_localctx = _tracker.createInstance<FunctionCallParamContext>(_ctx, getState());
  enterRule(_localctx, 56, TParser::RuleFunctionCallParam);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(503);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 15, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(497);
      match(TParser::OpenOp);
      setState(498);
      match(TParser::CloseOp);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(499);
      match(TParser::OpenOp);
      setState(500);
      functionCallParamElements();
      setState(501);
      match(TParser::CloseOp);
      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- FunctionCallParamElementsContext ------------------------------------------------------------------

TParser::FunctionCallParamElementsContext::FunctionCallParamElementsContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::GeneralValueContext* TParser::FunctionCallParamElementsContext::generalValue() {
  return getRuleContext<TParser::GeneralValueContext>(0);
}

tree::TerminalNode* TParser::FunctionCallParamElementsContext::Separator() {
  return getToken(TParser::Separator, 0);
}

TParser::FunctionCallParamElementsContext* TParser::FunctionCallParamElementsContext::functionCallParamElements() {
  return getRuleContext<TParser::FunctionCallParamElementsContext>(0);
}

TParser::OperationElementsContext* TParser::FunctionCallParamElementsContext::operationElements() {
  return getRuleContext<TParser::OperationElementsContext>(0);
}


size_t TParser::FunctionCallParamElementsContext::getRuleIndex() const {
  return TParser::RuleFunctionCallParamElements;
}

void TParser::FunctionCallParamElementsContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterFunctionCallParamElements(this);
}

void TParser::FunctionCallParamElementsContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitFunctionCallParamElements(this);
}


antlrcpp::Any TParser::FunctionCallParamElementsContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitFunctionCallParamElements(this);
  else
    return visitor->visitChildren(this);
}

TParser::FunctionCallParamElementsContext* TParser::functionCallParamElements() {
  FunctionCallParamElementsContext *_localctx = _tracker.createInstance<FunctionCallParamElementsContext>(_ctx, getState());
  enterRule(_localctx, 58, TParser::RuleFunctionCallParamElements);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(515);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 16, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(505);
      generalValue();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(506);
      generalValue();
      setState(507);
      match(TParser::Separator);
      setState(508);
      functionCallParamElements();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(510);
      operationElements();
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(511);
      operationElements();
      setState(512);
      match(TParser::Separator);
      setState(513);
      functionCallParamElements();
      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ConditionalExpressionContext ------------------------------------------------------------------

TParser::ConditionalExpressionContext::ConditionalExpressionContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::ConditionalExpressionStructBlockContext* TParser::ConditionalExpressionContext::conditionalExpressionStructBlock() {
  return getRuleContext<TParser::ConditionalExpressionStructBlockContext>(0);
}

TParser::ConditionalExpressionContext* TParser::ConditionalExpressionContext::conditionalExpression() {
  return getRuleContext<TParser::ConditionalExpressionContext>(0);
}


size_t TParser::ConditionalExpressionContext::getRuleIndex() const {
  return TParser::RuleConditionalExpression;
}

void TParser::ConditionalExpressionContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterConditionalExpression(this);
}

void TParser::ConditionalExpressionContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitConditionalExpression(this);
}


antlrcpp::Any TParser::ConditionalExpressionContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitConditionalExpression(this);
  else
    return visitor->visitChildren(this);
}

TParser::ConditionalExpressionContext* TParser::conditionalExpression() {
  ConditionalExpressionContext *_localctx = _tracker.createInstance<ConditionalExpressionContext>(_ctx, getState());
  enterRule(_localctx, 60, TParser::RuleConditionalExpression);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(521);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 17, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(517);
      conditionalExpressionStructBlock();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(518);
      conditionalExpressionStructBlock();
      setState(519);
      conditionalExpression();
      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ConditionalExpressionStructBlockContext ------------------------------------------------------------------

TParser::ConditionalExpressionStructBlockContext::ConditionalExpressionStructBlockContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::IfElementUniqueContext* TParser::ConditionalExpressionStructBlockContext::ifElementUnique() {
  return getRuleContext<TParser::IfElementUniqueContext>(0);
}

TParser::ElifElementsContext* TParser::ConditionalExpressionStructBlockContext::elifElements() {
  return getRuleContext<TParser::ElifElementsContext>(0);
}

TParser::ElseElementUniqueContext* TParser::ConditionalExpressionStructBlockContext::elseElementUnique() {
  return getRuleContext<TParser::ElseElementUniqueContext>(0);
}


size_t TParser::ConditionalExpressionStructBlockContext::getRuleIndex() const {
  return TParser::RuleConditionalExpressionStructBlock;
}

void TParser::ConditionalExpressionStructBlockContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterConditionalExpressionStructBlock(this);
}

void TParser::ConditionalExpressionStructBlockContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitConditionalExpressionStructBlock(this);
}


antlrcpp::Any TParser::ConditionalExpressionStructBlockContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitConditionalExpressionStructBlock(this);
  else
    return visitor->visitChildren(this);
}

TParser::ConditionalExpressionStructBlockContext* TParser::conditionalExpressionStructBlock() {
  ConditionalExpressionStructBlockContext *_localctx = _tracker.createInstance<ConditionalExpressionStructBlockContext>(_ctx, getState());
  enterRule(_localctx, 62, TParser::RuleConditionalExpressionStructBlock);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(534);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 18, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(523);
      ifElementUnique();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(524);
      ifElementUnique();
      setState(525);
      elifElements();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(527);
      ifElementUnique();
      setState(528);
      elseElementUnique();
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(530);
      ifElementUnique();
      setState(531);
      elifElements();
      setState(532);
      elseElementUnique();
      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- IfElementUniqueContext ------------------------------------------------------------------

TParser::IfElementUniqueContext::IfElementUniqueContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::IfElementUniqueContext::If() {
  return getToken(TParser::If, 0);
}

TParser::ConditionalExpressionItemsContext* TParser::IfElementUniqueContext::conditionalExpressionItems() {
  return getRuleContext<TParser::ConditionalExpressionItemsContext>(0);
}

TParser::ConditionalBlockElementsContext* TParser::IfElementUniqueContext::conditionalBlockElements() {
  return getRuleContext<TParser::ConditionalBlockElementsContext>(0);
}


size_t TParser::IfElementUniqueContext::getRuleIndex() const {
  return TParser::RuleIfElementUnique;
}

void TParser::IfElementUniqueContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterIfElementUnique(this);
}

void TParser::IfElementUniqueContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitIfElementUnique(this);
}


antlrcpp::Any TParser::IfElementUniqueContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitIfElementUnique(this);
  else
    return visitor->visitChildren(this);
}

TParser::IfElementUniqueContext* TParser::ifElementUnique() {
  IfElementUniqueContext *_localctx = _tracker.createInstance<IfElementUniqueContext>(_ctx, getState());
  enterRule(_localctx, 64, TParser::RuleIfElementUnique);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(536);
    match(TParser::If);
    setState(537);
    conditionalExpressionItems();
    setState(538);
    conditionalBlockElements();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ElifElementsContext ------------------------------------------------------------------

TParser::ElifElementsContext::ElifElementsContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::ElifElementUniqueContext* TParser::ElifElementsContext::elifElementUnique() {
  return getRuleContext<TParser::ElifElementUniqueContext>(0);
}

TParser::ElifElementsContext* TParser::ElifElementsContext::elifElements() {
  return getRuleContext<TParser::ElifElementsContext>(0);
}


size_t TParser::ElifElementsContext::getRuleIndex() const {
  return TParser::RuleElifElements;
}

void TParser::ElifElementsContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterElifElements(this);
}

void TParser::ElifElementsContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitElifElements(this);
}


antlrcpp::Any TParser::ElifElementsContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitElifElements(this);
  else
    return visitor->visitChildren(this);
}

TParser::ElifElementsContext* TParser::elifElements() {
  ElifElementsContext *_localctx = _tracker.createInstance<ElifElementsContext>(_ctx, getState());
  enterRule(_localctx, 66, TParser::RuleElifElements);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(544);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 19, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(540);
      elifElementUnique();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(541);
      elifElementUnique();
      setState(542);
      elifElements();
      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ElifElementUniqueContext ------------------------------------------------------------------

TParser::ElifElementUniqueContext::ElifElementUniqueContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::ElifElementUniqueContext::Elif() {
  return getToken(TParser::Elif, 0);
}

TParser::ConditionalExpressionItemsContext* TParser::ElifElementUniqueContext::conditionalExpressionItems() {
  return getRuleContext<TParser::ConditionalExpressionItemsContext>(0);
}

TParser::ConditionalBlockElementsContext* TParser::ElifElementUniqueContext::conditionalBlockElements() {
  return getRuleContext<TParser::ConditionalBlockElementsContext>(0);
}


size_t TParser::ElifElementUniqueContext::getRuleIndex() const {
  return TParser::RuleElifElementUnique;
}

void TParser::ElifElementUniqueContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterElifElementUnique(this);
}

void TParser::ElifElementUniqueContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitElifElementUnique(this);
}


antlrcpp::Any TParser::ElifElementUniqueContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitElifElementUnique(this);
  else
    return visitor->visitChildren(this);
}

TParser::ElifElementUniqueContext* TParser::elifElementUnique() {
  ElifElementUniqueContext *_localctx = _tracker.createInstance<ElifElementUniqueContext>(_ctx, getState());
  enterRule(_localctx, 68, TParser::RuleElifElementUnique);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(546);
    match(TParser::Elif);
    setState(547);
    conditionalExpressionItems();
    setState(548);
    conditionalBlockElements();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ElseElementUniqueContext ------------------------------------------------------------------

TParser::ElseElementUniqueContext::ElseElementUniqueContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::ElseElementUniqueContext::Else() {
  return getToken(TParser::Else, 0);
}

TParser::ConditionalBlockElementsContext* TParser::ElseElementUniqueContext::conditionalBlockElements() {
  return getRuleContext<TParser::ConditionalBlockElementsContext>(0);
}


size_t TParser::ElseElementUniqueContext::getRuleIndex() const {
  return TParser::RuleElseElementUnique;
}

void TParser::ElseElementUniqueContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterElseElementUnique(this);
}

void TParser::ElseElementUniqueContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitElseElementUnique(this);
}


antlrcpp::Any TParser::ElseElementUniqueContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitElseElementUnique(this);
  else
    return visitor->visitChildren(this);
}

TParser::ElseElementUniqueContext* TParser::elseElementUnique() {
  ElseElementUniqueContext *_localctx = _tracker.createInstance<ElseElementUniqueContext>(_ctx, getState());
  enterRule(_localctx, 70, TParser::RuleElseElementUnique);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(550);
    match(TParser::Else);
    setState(551);
    conditionalBlockElements();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ConditionalExpressionItemsContext ------------------------------------------------------------------

TParser::ConditionalExpressionItemsContext::ConditionalExpressionItemsContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::ConditionalExpressionElementsContext* TParser::ConditionalExpressionItemsContext::conditionalExpressionElements() {
  return getRuleContext<TParser::ConditionalExpressionElementsContext>(0);
}


size_t TParser::ConditionalExpressionItemsContext::getRuleIndex() const {
  return TParser::RuleConditionalExpressionItems;
}

void TParser::ConditionalExpressionItemsContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterConditionalExpressionItems(this);
}

void TParser::ConditionalExpressionItemsContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitConditionalExpressionItems(this);
}


antlrcpp::Any TParser::ConditionalExpressionItemsContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitConditionalExpressionItems(this);
  else
    return visitor->visitChildren(this);
}

TParser::ConditionalExpressionItemsContext* TParser::conditionalExpressionItems() {
  ConditionalExpressionItemsContext *_localctx = _tracker.createInstance<ConditionalExpressionItemsContext>(_ctx, getState());
  enterRule(_localctx, 72, TParser::RuleConditionalExpressionItems);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(553);
    conditionalExpressionElements();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ConditionalBlockElementsContext ------------------------------------------------------------------

TParser::ConditionalBlockElementsContext::ConditionalBlockElementsContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::ConditionalBlockElementsContext::OpenBlock() {
  return getToken(TParser::OpenBlock, 0);
}

tree::TerminalNode* TParser::ConditionalBlockElementsContext::CloseBlock() {
  return getToken(TParser::CloseBlock, 0);
}

TParser::ConditionalBlockElsItemsContext* TParser::ConditionalBlockElementsContext::conditionalBlockElsItems() {
  return getRuleContext<TParser::ConditionalBlockElsItemsContext>(0);
}

TParser::ConditionalExpressionContext* TParser::ConditionalBlockElementsContext::conditionalExpression() {
  return getRuleContext<TParser::ConditionalExpressionContext>(0);
}

TParser::CallingFunctionContext* TParser::ConditionalBlockElementsContext::callingFunction() {
  return getRuleContext<TParser::CallingFunctionContext>(0);
}

TParser::LoopContext* TParser::ConditionalBlockElementsContext::loop() {
  return getRuleContext<TParser::LoopContext>(0);
}

TParser::RetContext* TParser::ConditionalBlockElementsContext::ret() {
  return getRuleContext<TParser::RetContext>(0);
}


size_t TParser::ConditionalBlockElementsContext::getRuleIndex() const {
  return TParser::RuleConditionalBlockElements;
}

void TParser::ConditionalBlockElementsContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterConditionalBlockElements(this);
}

void TParser::ConditionalBlockElementsContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitConditionalBlockElements(this);
}


antlrcpp::Any TParser::ConditionalBlockElementsContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitConditionalBlockElements(this);
  else
    return visitor->visitChildren(this);
}

TParser::ConditionalBlockElementsContext* TParser::conditionalBlockElements() {
  ConditionalBlockElementsContext *_localctx = _tracker.createInstance<ConditionalBlockElementsContext>(_ctx, getState());
  enterRule(_localctx, 74, TParser::RuleConditionalBlockElements);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(565);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 20, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(555);
      match(TParser::OpenBlock);
      setState(556);
      match(TParser::CloseBlock);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(557);
      match(TParser::OpenBlock);
      setState(558);
      conditionalBlockElsItems();
      setState(559);
      match(TParser::CloseBlock);
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(561);
      conditionalExpression();
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(562);
      callingFunction();
      break;
    }

    case 5: {
      enterOuterAlt(_localctx, 5);
      setState(563);
      loop();
      break;
    }

    case 6: {
      enterOuterAlt(_localctx, 6);
      setState(564);
      ret();
      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ConditionalBlockElsItemsContext ------------------------------------------------------------------

TParser::ConditionalBlockElsItemsContext::ConditionalBlockElsItemsContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::SentenceContext* TParser::ConditionalBlockElsItemsContext::sentence() {
  return getRuleContext<TParser::SentenceContext>(0);
}

TParser::ConditionalBlockElsItemsContext* TParser::ConditionalBlockElsItemsContext::conditionalBlockElsItems() {
  return getRuleContext<TParser::ConditionalBlockElsItemsContext>(0);
}


size_t TParser::ConditionalBlockElsItemsContext::getRuleIndex() const {
  return TParser::RuleConditionalBlockElsItems;
}

void TParser::ConditionalBlockElsItemsContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterConditionalBlockElsItems(this);
}

void TParser::ConditionalBlockElsItemsContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitConditionalBlockElsItems(this);
}


antlrcpp::Any TParser::ConditionalBlockElsItemsContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitConditionalBlockElsItems(this);
  else
    return visitor->visitChildren(this);
}

TParser::ConditionalBlockElsItemsContext* TParser::conditionalBlockElsItems() {
  ConditionalBlockElsItemsContext *_localctx = _tracker.createInstance<ConditionalBlockElsItemsContext>(_ctx, getState());
  enterRule(_localctx, 76, TParser::RuleConditionalBlockElsItems);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(571);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 21, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(567);
      sentence();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(568);
      sentence();
      setState(569);
      conditionalBlockElsItems();
      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ConditionalExpressionElementsContext ------------------------------------------------------------------

TParser::ConditionalExpressionElementsContext::ConditionalExpressionElementsContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::ConditionExpValueContext* TParser::ConditionalExpressionElementsContext::conditionExpValue() {
  return getRuleContext<TParser::ConditionExpValueContext>(0);
}

TParser::ConditionalExpressionElementsContext* TParser::ConditionalExpressionElementsContext::conditionalExpressionElements() {
  return getRuleContext<TParser::ConditionalExpressionElementsContext>(0);
}

TParser::ConditionExpBlockContext* TParser::ConditionalExpressionElementsContext::conditionExpBlock() {
  return getRuleContext<TParser::ConditionExpBlockContext>(0);
}


size_t TParser::ConditionalExpressionElementsContext::getRuleIndex() const {
  return TParser::RuleConditionalExpressionElements;
}

void TParser::ConditionalExpressionElementsContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterConditionalExpressionElements(this);
}

void TParser::ConditionalExpressionElementsContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitConditionalExpressionElements(this);
}


antlrcpp::Any TParser::ConditionalExpressionElementsContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitConditionalExpressionElements(this);
  else
    return visitor->visitChildren(this);
}

TParser::ConditionalExpressionElementsContext* TParser::conditionalExpressionElements() {
  ConditionalExpressionElementsContext *_localctx = _tracker.createInstance<ConditionalExpressionElementsContext>(_ctx, getState());
  enterRule(_localctx, 78, TParser::RuleConditionalExpressionElements);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(581);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 22, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(573);
      conditionExpValue();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(574);
      conditionExpValue();
      setState(575);
      conditionalExpressionElements();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(577);
      conditionExpBlock();
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(578);
      conditionExpBlock();
      setState(579);
      conditionalExpressionElements();
      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ConditionExpValueContext ------------------------------------------------------------------

TParser::ConditionExpValueContext::ConditionExpValueContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::ConditionExpValueContext::Not() {
  return getToken(TParser::Not, 0);
}

TParser::ConditionalExpValueContext* TParser::ConditionExpValueContext::conditionalExpValue() {
  return getRuleContext<TParser::ConditionalExpValueContext>(0);
}


size_t TParser::ConditionExpValueContext::getRuleIndex() const {
  return TParser::RuleConditionExpValue;
}

void TParser::ConditionExpValueContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterConditionExpValue(this);
}

void TParser::ConditionExpValueContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitConditionExpValue(this);
}


antlrcpp::Any TParser::ConditionExpValueContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitConditionExpValue(this);
  else
    return visitor->visitChildren(this);
}

TParser::ConditionExpValueContext* TParser::conditionExpValue() {
  ConditionExpValueContext *_localctx = _tracker.createInstance<ConditionExpValueContext>(_ctx, getState());
  enterRule(_localctx, 80, TParser::RuleConditionExpValue);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(586);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case TParser::Not: {
        enterOuterAlt(_localctx, 1);
        setState(583);
        match(TParser::Not);
        setState(584);
        conditionalExpValue();
        break;
      }

      case TParser::OpenOp:
      case TParser::IncDecOperators:
      case TParser::Identifier:
      case TParser::Integer:
      case TParser::Float: {
        enterOuterAlt(_localctx, 2);
        setState(585);
        conditionalExpValue();
        break;
      }

    default:
      throw NoViableAltException(this);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ConditionExpBlockContext ------------------------------------------------------------------

TParser::ConditionExpBlockContext::ConditionExpBlockContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::ConditionExpBlockItemValueContext* TParser::ConditionExpBlockContext::conditionExpBlockItemValue() {
  return getRuleContext<TParser::ConditionExpBlockItemValueContext>(0);
}

tree::TerminalNode* TParser::ConditionExpBlockContext::Not() {
  return getToken(TParser::Not, 0);
}


size_t TParser::ConditionExpBlockContext::getRuleIndex() const {
  return TParser::RuleConditionExpBlock;
}

void TParser::ConditionExpBlockContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterConditionExpBlock(this);
}

void TParser::ConditionExpBlockContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitConditionExpBlock(this);
}


antlrcpp::Any TParser::ConditionExpBlockContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitConditionExpBlock(this);
  else
    return visitor->visitChildren(this);
}

TParser::ConditionExpBlockContext* TParser::conditionExpBlock() {
  ConditionExpBlockContext *_localctx = _tracker.createInstance<ConditionExpBlockContext>(_ctx, getState());
  enterRule(_localctx, 82, TParser::RuleConditionExpBlock);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(591);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case TParser::OpenOp: {
        enterOuterAlt(_localctx, 1);
        setState(588);
        conditionExpBlockItemValue();
        break;
      }

      case TParser::Not: {
        enterOuterAlt(_localctx, 2);
        setState(589);
        match(TParser::Not);
        setState(590);
        conditionExpBlockItemValue();
        break;
      }

    default:
      throw NoViableAltException(this);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ConditionExpBlockItemValueContext ------------------------------------------------------------------

TParser::ConditionExpBlockItemValueContext::ConditionExpBlockItemValueContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::ConditionExpBlockItemContext* TParser::ConditionExpBlockItemValueContext::conditionExpBlockItem() {
  return getRuleContext<TParser::ConditionExpBlockItemContext>(0);
}

tree::TerminalNode* TParser::ConditionExpBlockItemValueContext::ArithmeticOperator() {
  return getToken(TParser::ArithmeticOperator, 0);
}

tree::TerminalNode* TParser::ConditionExpBlockItemValueContext::AssignmentOperator() {
  return getToken(TParser::AssignmentOperator, 0);
}

tree::TerminalNode* TParser::ConditionExpBlockItemValueContext::TypeSpec() {
  return getToken(TParser::TypeSpec, 0);
}


size_t TParser::ConditionExpBlockItemValueContext::getRuleIndex() const {
  return TParser::RuleConditionExpBlockItemValue;
}

void TParser::ConditionExpBlockItemValueContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterConditionExpBlockItemValue(this);
}

void TParser::ConditionExpBlockItemValueContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitConditionExpBlockItemValue(this);
}


antlrcpp::Any TParser::ConditionExpBlockItemValueContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitConditionExpBlockItemValue(this);
  else
    return visitor->visitChildren(this);
}

TParser::ConditionExpBlockItemValueContext* TParser::conditionExpBlockItemValue() {
  ConditionExpBlockItemValueContext *_localctx = _tracker.createInstance<ConditionExpBlockItemValueContext>(_ctx, getState());
  enterRule(_localctx, 84, TParser::RuleConditionExpBlockItemValue);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(601);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 25, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(593);
      conditionExpBlockItem();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(594);
      conditionExpBlockItem();
      setState(595);
      _la = _input->LA(1);
      if (!(_la == TParser::ArithmeticOperator

      || _la == TParser::AssignmentOperator)) {
      _errHandler->recoverInline(this);
      }
      else {
        _errHandler->reportMatch(this);
        consume();
      }
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(597);
      conditionExpBlockItem();
      setState(598);
      match(TParser::TypeSpec);
      setState(599);
      _la = _input->LA(1);
      if (!(_la == TParser::ArithmeticOperator

      || _la == TParser::AssignmentOperator)) {
      _errHandler->recoverInline(this);
      }
      else {
        _errHandler->reportMatch(this);
        consume();
      }
      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ConditionExpBlockItemContext ------------------------------------------------------------------

TParser::ConditionExpBlockItemContext::ConditionExpBlockItemContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::ConditionExpBlockItemContext::OpenOp() {
  return getToken(TParser::OpenOp, 0);
}

TParser::ConditionalExpressionElementsContext* TParser::ConditionExpBlockItemContext::conditionalExpressionElements() {
  return getRuleContext<TParser::ConditionalExpressionElementsContext>(0);
}

tree::TerminalNode* TParser::ConditionExpBlockItemContext::CloseOp() {
  return getToken(TParser::CloseOp, 0);
}


size_t TParser::ConditionExpBlockItemContext::getRuleIndex() const {
  return TParser::RuleConditionExpBlockItem;
}

void TParser::ConditionExpBlockItemContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterConditionExpBlockItem(this);
}

void TParser::ConditionExpBlockItemContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitConditionExpBlockItem(this);
}


antlrcpp::Any TParser::ConditionExpBlockItemContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitConditionExpBlockItem(this);
  else
    return visitor->visitChildren(this);
}

TParser::ConditionExpBlockItemContext* TParser::conditionExpBlockItem() {
  ConditionExpBlockItemContext *_localctx = _tracker.createInstance<ConditionExpBlockItemContext>(_ctx, getState());
  enterRule(_localctx, 86, TParser::RuleConditionExpBlockItem);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(603);
    match(TParser::OpenOp);
    setState(604);
    conditionalExpressionElements();
    setState(605);
    match(TParser::CloseOp);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ConditionalExpValueContext ------------------------------------------------------------------

TParser::ConditionalExpValueContext::ConditionalExpValueContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::FirstIncDecContext* TParser::ConditionalExpValueContext::firstIncDec() {
  return getRuleContext<TParser::FirstIncDecContext>(0);
}

tree::TerminalNode* TParser::ConditionalExpValueContext::Identifier() {
  return getToken(TParser::Identifier, 0);
}

tree::TerminalNode* TParser::ConditionalExpValueContext::ArithmeticOperator() {
  return getToken(TParser::ArithmeticOperator, 0);
}

tree::TerminalNode* TParser::ConditionalExpValueContext::AssignmentOperator() {
  return getToken(TParser::AssignmentOperator, 0);
}

tree::TerminalNode* TParser::ConditionalExpValueContext::TypeSpec() {
  return getToken(TParser::TypeSpec, 0);
}

TParser::LastIncDecContext* TParser::ConditionalExpValueContext::lastIncDec() {
  return getRuleContext<TParser::LastIncDecContext>(0);
}

tree::TerminalNode* TParser::ConditionalExpValueContext::Integer() {
  return getToken(TParser::Integer, 0);
}

tree::TerminalNode* TParser::ConditionalExpValueContext::Float() {
  return getToken(TParser::Float, 0);
}

TParser::FunctionCallAndAttrContext* TParser::ConditionalExpValueContext::functionCallAndAttr() {
  return getRuleContext<TParser::FunctionCallAndAttrContext>(0);
}

TParser::FunctionCallContext* TParser::ConditionalExpValueContext::functionCall() {
  return getRuleContext<TParser::FunctionCallContext>(0);
}

TParser::OperationBlockContext* TParser::ConditionalExpValueContext::operationBlock() {
  return getRuleContext<TParser::OperationBlockContext>(0);
}

TParser::ArrayAccessElementsContext* TParser::ConditionalExpValueContext::arrayAccessElements() {
  return getRuleContext<TParser::ArrayAccessElementsContext>(0);
}


size_t TParser::ConditionalExpValueContext::getRuleIndex() const {
  return TParser::RuleConditionalExpValue;
}

void TParser::ConditionalExpValueContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterConditionalExpValue(this);
}

void TParser::ConditionalExpValueContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitConditionalExpValue(this);
}


antlrcpp::Any TParser::ConditionalExpValueContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitConditionalExpValue(this);
  else
    return visitor->visitChildren(this);
}

TParser::ConditionalExpValueContext* TParser::conditionalExpValue() {
  ConditionalExpValueContext *_localctx = _tracker.createInstance<ConditionalExpValueContext>(_ctx, getState());
  enterRule(_localctx, 88, TParser::RuleConditionalExpValue);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(696);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 26, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(607);
      firstIncDec();
      setState(608);
      match(TParser::Identifier);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(610);
      firstIncDec();
      setState(611);
      match(TParser::Identifier);
      setState(612);
      _la = _input->LA(1);
      if (!(_la == TParser::ArithmeticOperator

      || _la == TParser::AssignmentOperator)) {
      _errHandler->recoverInline(this);
      }
      else {
        _errHandler->reportMatch(this);
        consume();
      }
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(614);
      firstIncDec();
      setState(615);
      match(TParser::Identifier);
      setState(616);
      match(TParser::TypeSpec);
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(618);
      firstIncDec();
      setState(619);
      match(TParser::Identifier);
      setState(620);
      match(TParser::TypeSpec);
      setState(621);
      _la = _input->LA(1);
      if (!(_la == TParser::ArithmeticOperator

      || _la == TParser::AssignmentOperator)) {
      _errHandler->recoverInline(this);
      }
      else {
        _errHandler->reportMatch(this);
        consume();
      }
      break;
    }

    case 5: {
      enterOuterAlt(_localctx, 5);
      setState(623);
      match(TParser::Identifier);
      setState(624);
      lastIncDec();
      break;
    }

    case 6: {
      enterOuterAlt(_localctx, 6);
      setState(625);
      match(TParser::Identifier);
      setState(626);
      lastIncDec();
      setState(627);
      _la = _input->LA(1);
      if (!(_la == TParser::ArithmeticOperator

      || _la == TParser::AssignmentOperator)) {
      _errHandler->recoverInline(this);
      }
      else {
        _errHandler->reportMatch(this);
        consume();
      }
      break;
    }

    case 7: {
      enterOuterAlt(_localctx, 7);
      setState(629);
      match(TParser::Identifier);
      setState(630);
      lastIncDec();
      setState(631);
      match(TParser::TypeSpec);
      break;
    }

    case 8: {
      enterOuterAlt(_localctx, 8);
      setState(633);
      match(TParser::Identifier);
      setState(634);
      lastIncDec();
      setState(635);
      match(TParser::TypeSpec);
      setState(636);
      _la = _input->LA(1);
      if (!(_la == TParser::ArithmeticOperator

      || _la == TParser::AssignmentOperator)) {
      _errHandler->recoverInline(this);
      }
      else {
        _errHandler->reportMatch(this);
        consume();
      }
      break;
    }

    case 9: {
      enterOuterAlt(_localctx, 9);
      setState(638);
      match(TParser::Integer);
      break;
    }

    case 10: {
      enterOuterAlt(_localctx, 10);
      setState(639);
      match(TParser::Integer);
      setState(640);
      _la = _input->LA(1);
      if (!(_la == TParser::ArithmeticOperator

      || _la == TParser::AssignmentOperator)) {
      _errHandler->recoverInline(this);
      }
      else {
        _errHandler->reportMatch(this);
        consume();
      }
      break;
    }

    case 11: {
      enterOuterAlt(_localctx, 11);
      setState(641);
      match(TParser::Integer);
      setState(642);
      match(TParser::TypeSpec);
      break;
    }

    case 12: {
      enterOuterAlt(_localctx, 12);
      setState(643);
      match(TParser::Integer);
      setState(644);
      match(TParser::TypeSpec);
      setState(645);
      _la = _input->LA(1);
      if (!(_la == TParser::ArithmeticOperator

      || _la == TParser::AssignmentOperator)) {
      _errHandler->recoverInline(this);
      }
      else {
        _errHandler->reportMatch(this);
        consume();
      }
      break;
    }

    case 13: {
      enterOuterAlt(_localctx, 13);
      setState(646);
      match(TParser::Float);
      break;
    }

    case 14: {
      enterOuterAlt(_localctx, 14);
      setState(647);
      match(TParser::Float);
      setState(648);
      _la = _input->LA(1);
      if (!(_la == TParser::ArithmeticOperator

      || _la == TParser::AssignmentOperator)) {
      _errHandler->recoverInline(this);
      }
      else {
        _errHandler->reportMatch(this);
        consume();
      }
      break;
    }

    case 15: {
      enterOuterAlt(_localctx, 15);
      setState(649);
      match(TParser::Float);
      setState(650);
      match(TParser::TypeSpec);
      break;
    }

    case 16: {
      enterOuterAlt(_localctx, 16);
      setState(651);
      match(TParser::Float);
      setState(652);
      match(TParser::TypeSpec);
      setState(653);
      _la = _input->LA(1);
      if (!(_la == TParser::ArithmeticOperator

      || _la == TParser::AssignmentOperator)) {
      _errHandler->recoverInline(this);
      }
      else {
        _errHandler->reportMatch(this);
        consume();
      }
      break;
    }

    case 17: {
      enterOuterAlt(_localctx, 17);
      setState(654);
      functionCallAndAttr();
      break;
    }

    case 18: {
      enterOuterAlt(_localctx, 18);
      setState(655);
      functionCall();
      break;
    }

    case 19: {
      enterOuterAlt(_localctx, 19);
      setState(656);
      functionCall();
      setState(657);
      _la = _input->LA(1);
      if (!(_la == TParser::ArithmeticOperator

      || _la == TParser::AssignmentOperator)) {
      _errHandler->recoverInline(this);
      }
      else {
        _errHandler->reportMatch(this);
        consume();
      }
      break;
    }

    case 20: {
      enterOuterAlt(_localctx, 20);
      setState(659);
      functionCall();
      setState(660);
      match(TParser::TypeSpec);
      break;
    }

    case 21: {
      enterOuterAlt(_localctx, 21);
      setState(662);
      functionCall();
      setState(663);
      match(TParser::TypeSpec);
      setState(664);
      _la = _input->LA(1);
      if (!(_la == TParser::ArithmeticOperator

      || _la == TParser::AssignmentOperator)) {
      _errHandler->recoverInline(this);
      }
      else {
        _errHandler->reportMatch(this);
        consume();
      }
      break;
    }

    case 22: {
      enterOuterAlt(_localctx, 22);
      setState(666);
      operationBlock();
      break;
    }

    case 23: {
      enterOuterAlt(_localctx, 23);
      setState(667);
      operationBlock();
      setState(668);
      _la = _input->LA(1);
      if (!(_la == TParser::ArithmeticOperator

      || _la == TParser::AssignmentOperator)) {
      _errHandler->recoverInline(this);
      }
      else {
        _errHandler->reportMatch(this);
        consume();
      }
      break;
    }

    case 24: {
      enterOuterAlt(_localctx, 24);
      setState(670);
      operationBlock();
      setState(671);
      match(TParser::TypeSpec);
      break;
    }

    case 25: {
      enterOuterAlt(_localctx, 25);
      setState(673);
      operationBlock();
      setState(674);
      match(TParser::TypeSpec);
      setState(675);
      _la = _input->LA(1);
      if (!(_la == TParser::ArithmeticOperator

      || _la == TParser::AssignmentOperator)) {
      _errHandler->recoverInline(this);
      }
      else {
        _errHandler->reportMatch(this);
        consume();
      }
      break;
    }

    case 26: {
      enterOuterAlt(_localctx, 26);
      setState(677);
      match(TParser::Identifier);
      break;
    }

    case 27: {
      enterOuterAlt(_localctx, 27);
      setState(678);
      match(TParser::Identifier);
      setState(679);
      _la = _input->LA(1);
      if (!(_la == TParser::ArithmeticOperator

      || _la == TParser::AssignmentOperator)) {
      _errHandler->recoverInline(this);
      }
      else {
        _errHandler->reportMatch(this);
        consume();
      }
      break;
    }

    case 28: {
      enterOuterAlt(_localctx, 28);
      setState(680);
      match(TParser::Identifier);
      setState(681);
      match(TParser::TypeSpec);
      break;
    }

    case 29: {
      enterOuterAlt(_localctx, 29);
      setState(682);
      match(TParser::Identifier);
      setState(683);
      match(TParser::TypeSpec);
      setState(684);
      _la = _input->LA(1);
      if (!(_la == TParser::ArithmeticOperator

      || _la == TParser::AssignmentOperator)) {
      _errHandler->recoverInline(this);
      }
      else {
        _errHandler->reportMatch(this);
        consume();
      }
      break;
    }

    case 30: {
      enterOuterAlt(_localctx, 30);
      setState(685);
      arrayAccessElements();
      break;
    }

    case 31: {
      enterOuterAlt(_localctx, 31);
      setState(686);
      arrayAccessElements();
      setState(687);
      _la = _input->LA(1);
      if (!(_la == TParser::ArithmeticOperator

      || _la == TParser::AssignmentOperator)) {
      _errHandler->recoverInline(this);
      }
      else {
        _errHandler->reportMatch(this);
        consume();
      }
      break;
    }

    case 32: {
      enterOuterAlt(_localctx, 32);
      setState(689);
      arrayAccessElements();
      setState(690);
      match(TParser::TypeSpec);
      break;
    }

    case 33: {
      enterOuterAlt(_localctx, 33);
      setState(692);
      arrayAccessElements();
      setState(693);
      match(TParser::TypeSpec);
      setState(694);
      _la = _input->LA(1);
      if (!(_la == TParser::ArithmeticOperator

      || _la == TParser::AssignmentOperator)) {
      _errHandler->recoverInline(this);
      }
      else {
        _errHandler->reportMatch(this);
        consume();
      }
      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- FunctionCallAndAttrContext ------------------------------------------------------------------

TParser::FunctionCallAndAttrContext::FunctionCallAndAttrContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::IdentifierAttrFnContext* TParser::FunctionCallAndAttrContext::identifierAttrFn() {
  return getRuleContext<TParser::IdentifierAttrFnContext>(0);
}

tree::TerminalNode* TParser::FunctionCallAndAttrContext::Attr() {
  return getToken(TParser::Attr, 0);
}

TParser::FunctionCallAttrFnContext* TParser::FunctionCallAndAttrContext::functionCallAttrFn() {
  return getRuleContext<TParser::FunctionCallAttrFnContext>(0);
}


size_t TParser::FunctionCallAndAttrContext::getRuleIndex() const {
  return TParser::RuleFunctionCallAndAttr;
}

void TParser::FunctionCallAndAttrContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterFunctionCallAndAttr(this);
}

void TParser::FunctionCallAndAttrContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitFunctionCallAndAttr(this);
}


antlrcpp::Any TParser::FunctionCallAndAttrContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitFunctionCallAndAttr(this);
  else
    return visitor->visitChildren(this);
}

TParser::FunctionCallAndAttrContext* TParser::functionCallAndAttr() {
  FunctionCallAndAttrContext *_localctx = _tracker.createInstance<FunctionCallAndAttrContext>(_ctx, getState());
  enterRule(_localctx, 90, TParser::RuleFunctionCallAndAttr);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(698);
    identifierAttrFn();
    setState(699);
    match(TParser::Attr);
    setState(700);
    functionCallAttrFn();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- IdentifierAttrFnContext ------------------------------------------------------------------

TParser::IdentifierAttrFnContext::IdentifierAttrFnContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::ArrayAccessElementsContext* TParser::IdentifierAttrFnContext::arrayAccessElements() {
  return getRuleContext<TParser::ArrayAccessElementsContext>(0);
}

tree::TerminalNode* TParser::IdentifierAttrFnContext::Identifier() {
  return getToken(TParser::Identifier, 0);
}


size_t TParser::IdentifierAttrFnContext::getRuleIndex() const {
  return TParser::RuleIdentifierAttrFn;
}

void TParser::IdentifierAttrFnContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterIdentifierAttrFn(this);
}

void TParser::IdentifierAttrFnContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitIdentifierAttrFn(this);
}


antlrcpp::Any TParser::IdentifierAttrFnContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitIdentifierAttrFn(this);
  else
    return visitor->visitChildren(this);
}

TParser::IdentifierAttrFnContext* TParser::identifierAttrFn() {
  IdentifierAttrFnContext *_localctx = _tracker.createInstance<IdentifierAttrFnContext>(_ctx, getState());
  enterRule(_localctx, 92, TParser::RuleIdentifierAttrFn);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(704);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 27, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(702);
      arrayAccessElements();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(703);
      match(TParser::Identifier);
      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- FunctionCallAttrFnContext ------------------------------------------------------------------

TParser::FunctionCallAttrFnContext::FunctionCallAttrFnContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::FunctionCallAttrFnItemContext* TParser::FunctionCallAttrFnContext::functionCallAttrFnItem() {
  return getRuleContext<TParser::FunctionCallAttrFnItemContext>(0);
}


size_t TParser::FunctionCallAttrFnContext::getRuleIndex() const {
  return TParser::RuleFunctionCallAttrFn;
}

void TParser::FunctionCallAttrFnContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterFunctionCallAttrFn(this);
}

void TParser::FunctionCallAttrFnContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitFunctionCallAttrFn(this);
}


antlrcpp::Any TParser::FunctionCallAttrFnContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitFunctionCallAttrFn(this);
  else
    return visitor->visitChildren(this);
}

TParser::FunctionCallAttrFnContext* TParser::functionCallAttrFn() {
  FunctionCallAttrFnContext *_localctx = _tracker.createInstance<FunctionCallAttrFnContext>(_ctx, getState());
  enterRule(_localctx, 94, TParser::RuleFunctionCallAttrFn);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(706);
    functionCallAttrFnItem();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- FunctionCallAttrFnItemContext ------------------------------------------------------------------

TParser::FunctionCallAttrFnItemContext::FunctionCallAttrFnItemContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::FunctionCallContext* TParser::FunctionCallAttrFnItemContext::functionCall() {
  return getRuleContext<TParser::FunctionCallContext>(0);
}

tree::TerminalNode* TParser::FunctionCallAttrFnItemContext::ArithmeticOperator() {
  return getToken(TParser::ArithmeticOperator, 0);
}

tree::TerminalNode* TParser::FunctionCallAttrFnItemContext::AssignmentOperator() {
  return getToken(TParser::AssignmentOperator, 0);
}

tree::TerminalNode* TParser::FunctionCallAttrFnItemContext::TypeSpec() {
  return getToken(TParser::TypeSpec, 0);
}


size_t TParser::FunctionCallAttrFnItemContext::getRuleIndex() const {
  return TParser::RuleFunctionCallAttrFnItem;
}

void TParser::FunctionCallAttrFnItemContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterFunctionCallAttrFnItem(this);
}

void TParser::FunctionCallAttrFnItemContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitFunctionCallAttrFnItem(this);
}


antlrcpp::Any TParser::FunctionCallAttrFnItemContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitFunctionCallAttrFnItem(this);
  else
    return visitor->visitChildren(this);
}

TParser::FunctionCallAttrFnItemContext* TParser::functionCallAttrFnItem() {
  FunctionCallAttrFnItemContext *_localctx = _tracker.createInstance<FunctionCallAttrFnItemContext>(_ctx, getState());
  enterRule(_localctx, 96, TParser::RuleFunctionCallAttrFnItem);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(719);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 28, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(708);
      functionCall();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(709);
      functionCall();
      setState(710);
      _la = _input->LA(1);
      if (!(_la == TParser::ArithmeticOperator

      || _la == TParser::AssignmentOperator)) {
      _errHandler->recoverInline(this);
      }
      else {
        _errHandler->reportMatch(this);
        consume();
      }
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(712);
      functionCall();
      setState(713);
      match(TParser::TypeSpec);
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(715);
      functionCall();
      setState(716);
      match(TParser::TypeSpec);
      setState(717);
      _la = _input->LA(1);
      if (!(_la == TParser::ArithmeticOperator

      || _la == TParser::AssignmentOperator)) {
      _errHandler->recoverInline(this);
      }
      else {
        _errHandler->reportMatch(this);
        consume();
      }
      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- LoopContext ------------------------------------------------------------------

TParser::LoopContext::LoopContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::LoopExpressionItemsContext* TParser::LoopContext::loopExpressionItems() {
  return getRuleContext<TParser::LoopExpressionItemsContext>(0);
}

TParser::LoopContext* TParser::LoopContext::loop() {
  return getRuleContext<TParser::LoopContext>(0);
}


size_t TParser::LoopContext::getRuleIndex() const {
  return TParser::RuleLoop;
}

void TParser::LoopContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterLoop(this);
}

void TParser::LoopContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitLoop(this);
}


antlrcpp::Any TParser::LoopContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitLoop(this);
  else
    return visitor->visitChildren(this);
}

TParser::LoopContext* TParser::loop() {
  LoopContext *_localctx = _tracker.createInstance<LoopContext>(_ctx, getState());
  enterRule(_localctx, 98, TParser::RuleLoop);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(725);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 29, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(721);
      loopExpressionItems();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(722);
      loopExpressionItems();
      setState(723);
      loop();
      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- LoopExpressionItemsContext ------------------------------------------------------------------

TParser::LoopExpressionItemsContext::LoopExpressionItemsContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::LoopExpressionItemsContext::For() {
  return getToken(TParser::For, 0);
}

TParser::LoopExpressionContext* TParser::LoopExpressionItemsContext::loopExpression() {
  return getRuleContext<TParser::LoopExpressionContext>(0);
}

TParser::LoopBlockElementsLimitedContext* TParser::LoopExpressionItemsContext::loopBlockElementsLimited() {
  return getRuleContext<TParser::LoopBlockElementsLimitedContext>(0);
}


size_t TParser::LoopExpressionItemsContext::getRuleIndex() const {
  return TParser::RuleLoopExpressionItems;
}

void TParser::LoopExpressionItemsContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterLoopExpressionItems(this);
}

void TParser::LoopExpressionItemsContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitLoopExpressionItems(this);
}


antlrcpp::Any TParser::LoopExpressionItemsContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitLoopExpressionItems(this);
  else
    return visitor->visitChildren(this);
}

TParser::LoopExpressionItemsContext* TParser::loopExpressionItems() {
  LoopExpressionItemsContext *_localctx = _tracker.createInstance<LoopExpressionItemsContext>(_ctx, getState());
  enterRule(_localctx, 100, TParser::RuleLoopExpressionItems);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(727);
    match(TParser::For);
    setState(728);
    loopExpression();
    setState(729);
    loopBlockElementsLimited();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- LoopExpressionContext ------------------------------------------------------------------

TParser::LoopExpressionContext::LoopExpressionContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::LoopInfiniteContext* TParser::LoopExpressionContext::loopInfinite() {
  return getRuleContext<TParser::LoopInfiniteContext>(0);
}

TParser::LoopCompleteContext* TParser::LoopExpressionContext::loopComplete() {
  return getRuleContext<TParser::LoopCompleteContext>(0);
}

TParser::LoopConditionalContext* TParser::LoopExpressionContext::loopConditional() {
  return getRuleContext<TParser::LoopConditionalContext>(0);
}


size_t TParser::LoopExpressionContext::getRuleIndex() const {
  return TParser::RuleLoopExpression;
}

void TParser::LoopExpressionContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterLoopExpression(this);
}

void TParser::LoopExpressionContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitLoopExpression(this);
}


antlrcpp::Any TParser::LoopExpressionContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitLoopExpression(this);
  else
    return visitor->visitChildren(this);
}

TParser::LoopExpressionContext* TParser::loopExpression() {
  LoopExpressionContext *_localctx = _tracker.createInstance<LoopExpressionContext>(_ctx, getState());
  enterRule(_localctx, 102, TParser::RuleLoopExpression);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(734);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 30, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(731);
      loopInfinite();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(732);
      loopComplete();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(733);
      loopConditional();
      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- LoopInfiniteContext ------------------------------------------------------------------

TParser::LoopInfiniteContext::LoopInfiniteContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::LoopInfiniteContext::OpenOp() {
  return getToken(TParser::OpenOp, 0);
}

tree::TerminalNode* TParser::LoopInfiniteContext::CloseOp() {
  return getToken(TParser::CloseOp, 0);
}


size_t TParser::LoopInfiniteContext::getRuleIndex() const {
  return TParser::RuleLoopInfinite;
}

void TParser::LoopInfiniteContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterLoopInfinite(this);
}

void TParser::LoopInfiniteContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitLoopInfinite(this);
}


antlrcpp::Any TParser::LoopInfiniteContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitLoopInfinite(this);
  else
    return visitor->visitChildren(this);
}

TParser::LoopInfiniteContext* TParser::loopInfinite() {
  LoopInfiniteContext *_localctx = _tracker.createInstance<LoopInfiniteContext>(_ctx, getState());
  enterRule(_localctx, 104, TParser::RuleLoopInfinite);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(739);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case TParser::OpenOp: {
        enterOuterAlt(_localctx, 1);
        setState(736);
        match(TParser::OpenOp);
        setState(737);
        match(TParser::CloseOp);
        break;
      }

      case TParser::If:
      case TParser::For:
      case TParser::Ret:
      case TParser::OpenBlock:
      case TParser::Identifier: {
        enterOuterAlt(_localctx, 2);

        break;
      }

    default:
      throw NoViableAltException(this);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- LoopCompleteContext ------------------------------------------------------------------

TParser::LoopCompleteContext::LoopCompleteContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::LoopCompleteContext::OpenOp() {
  return getToken(TParser::OpenOp, 0);
}

TParser::LoopOneMembersContext* TParser::LoopCompleteContext::loopOneMembers() {
  return getRuleContext<TParser::LoopOneMembersContext>(0);
}

TParser::EndOneContext* TParser::LoopCompleteContext::endOne() {
  return getRuleContext<TParser::EndOneContext>(0);
}

TParser::LoopTwoMembersContext* TParser::LoopCompleteContext::loopTwoMembers() {
  return getRuleContext<TParser::LoopTwoMembersContext>(0);
}

TParser::EndTwoContext* TParser::LoopCompleteContext::endTwo() {
  return getRuleContext<TParser::EndTwoContext>(0);
}

TParser::LoopThreeMembersContext* TParser::LoopCompleteContext::loopThreeMembers() {
  return getRuleContext<TParser::LoopThreeMembersContext>(0);
}

tree::TerminalNode* TParser::LoopCompleteContext::CloseOp() {
  return getToken(TParser::CloseOp, 0);
}


size_t TParser::LoopCompleteContext::getRuleIndex() const {
  return TParser::RuleLoopComplete;
}

void TParser::LoopCompleteContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterLoopComplete(this);
}

void TParser::LoopCompleteContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitLoopComplete(this);
}


antlrcpp::Any TParser::LoopCompleteContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitLoopComplete(this);
  else
    return visitor->visitChildren(this);
}

TParser::LoopCompleteContext* TParser::loopComplete() {
  LoopCompleteContext *_localctx = _tracker.createInstance<LoopCompleteContext>(_ctx, getState());
  enterRule(_localctx, 106, TParser::RuleLoopComplete);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(755);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case TParser::OpenOp: {
        enterOuterAlt(_localctx, 1);
        setState(741);
        match(TParser::OpenOp);
        setState(742);
        loopOneMembers();
        setState(743);
        endOne();
        setState(744);
        loopTwoMembers();
        setState(745);
        endTwo();
        setState(746);
        loopThreeMembers();
        setState(747);
        match(TParser::CloseOp);
        break;
      }

      case TParser::Var:
      case TParser::End:
      case TParser::IncDecOperators:
      case TParser::Identifier: {
        enterOuterAlt(_localctx, 2);
        setState(749);
        loopOneMembers();
        setState(750);
        endOne();
        setState(751);
        loopTwoMembers();
        setState(752);
        endTwo();
        setState(753);
        loopThreeMembers();
        break;
      }

    default:
      throw NoViableAltException(this);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- LoopConditionalContext ------------------------------------------------------------------

TParser::LoopConditionalContext::LoopConditionalContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::LoopTwoMembersContext* TParser::LoopConditionalContext::loopTwoMembers() {
  return getRuleContext<TParser::LoopTwoMembersContext>(0);
}


size_t TParser::LoopConditionalContext::getRuleIndex() const {
  return TParser::RuleLoopConditional;
}

void TParser::LoopConditionalContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterLoopConditional(this);
}

void TParser::LoopConditionalContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitLoopConditional(this);
}


antlrcpp::Any TParser::LoopConditionalContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitLoopConditional(this);
  else
    return visitor->visitChildren(this);
}

TParser::LoopConditionalContext* TParser::loopConditional() {
  LoopConditionalContext *_localctx = _tracker.createInstance<LoopConditionalContext>(_ctx, getState());
  enterRule(_localctx, 108, TParser::RuleLoopConditional);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(757);
    loopTwoMembers();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- EndOneContext ------------------------------------------------------------------

TParser::EndOneContext::EndOneContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::EndOneContext::End() {
  return getToken(TParser::End, 0);
}


size_t TParser::EndOneContext::getRuleIndex() const {
  return TParser::RuleEndOne;
}

void TParser::EndOneContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterEndOne(this);
}

void TParser::EndOneContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitEndOne(this);
}


antlrcpp::Any TParser::EndOneContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitEndOne(this);
  else
    return visitor->visitChildren(this);
}

TParser::EndOneContext* TParser::endOne() {
  EndOneContext *_localctx = _tracker.createInstance<EndOneContext>(_ctx, getState());
  enterRule(_localctx, 110, TParser::RuleEndOne);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(759);
    match(TParser::End);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- EndTwoContext ------------------------------------------------------------------

TParser::EndTwoContext::EndTwoContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::EndTwoContext::End() {
  return getToken(TParser::End, 0);
}


size_t TParser::EndTwoContext::getRuleIndex() const {
  return TParser::RuleEndTwo;
}

void TParser::EndTwoContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterEndTwo(this);
}

void TParser::EndTwoContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitEndTwo(this);
}


antlrcpp::Any TParser::EndTwoContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitEndTwo(this);
  else
    return visitor->visitChildren(this);
}

TParser::EndTwoContext* TParser::endTwo() {
  EndTwoContext *_localctx = _tracker.createInstance<EndTwoContext>(_ctx, getState());
  enterRule(_localctx, 112, TParser::RuleEndTwo);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(761);
    match(TParser::End);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- LoopOneMembersContext ------------------------------------------------------------------

TParser::LoopOneMembersContext::LoopOneMembersContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::VariableMembersContext* TParser::LoopOneMembersContext::variableMembers() {
  return getRuleContext<TParser::VariableMembersContext>(0);
}

tree::TerminalNode* TParser::LoopOneMembersContext::Var() {
  return getToken(TParser::Var, 0);
}


size_t TParser::LoopOneMembersContext::getRuleIndex() const {
  return TParser::RuleLoopOneMembers;
}

void TParser::LoopOneMembersContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterLoopOneMembers(this);
}

void TParser::LoopOneMembersContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitLoopOneMembers(this);
}


antlrcpp::Any TParser::LoopOneMembersContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitLoopOneMembers(this);
  else
    return visitor->visitChildren(this);
}

TParser::LoopOneMembersContext* TParser::loopOneMembers() {
  LoopOneMembersContext *_localctx = _tracker.createInstance<LoopOneMembersContext>(_ctx, getState());
  enterRule(_localctx, 114, TParser::RuleLoopOneMembers);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(767);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case TParser::IncDecOperators:
      case TParser::Identifier: {
        enterOuterAlt(_localctx, 1);
        setState(763);
        variableMembers();
        break;
      }

      case TParser::Var: {
        enterOuterAlt(_localctx, 2);
        setState(764);
        match(TParser::Var);
        setState(765);
        variableMembers();
        break;
      }

      case TParser::End: {
        enterOuterAlt(_localctx, 3);

        break;
      }

    default:
      throw NoViableAltException(this);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- LoopTwoMembersContext ------------------------------------------------------------------

TParser::LoopTwoMembersContext::LoopTwoMembersContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::ConditionalExpressionElementsContext* TParser::LoopTwoMembersContext::conditionalExpressionElements() {
  return getRuleContext<TParser::ConditionalExpressionElementsContext>(0);
}


size_t TParser::LoopTwoMembersContext::getRuleIndex() const {
  return TParser::RuleLoopTwoMembers;
}

void TParser::LoopTwoMembersContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterLoopTwoMembers(this);
}

void TParser::LoopTwoMembersContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitLoopTwoMembers(this);
}


antlrcpp::Any TParser::LoopTwoMembersContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitLoopTwoMembers(this);
  else
    return visitor->visitChildren(this);
}

TParser::LoopTwoMembersContext* TParser::loopTwoMembers() {
  LoopTwoMembersContext *_localctx = _tracker.createInstance<LoopTwoMembersContext>(_ctx, getState());
  enterRule(_localctx, 116, TParser::RuleLoopTwoMembers);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(771);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 34, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(769);
      conditionalExpressionElements();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);

      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- LoopThreeMembersContext ------------------------------------------------------------------

TParser::LoopThreeMembersContext::LoopThreeMembersContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::LoopThreeMembersValuesContext* TParser::LoopThreeMembersContext::loopThreeMembersValues() {
  return getRuleContext<TParser::LoopThreeMembersValuesContext>(0);
}


size_t TParser::LoopThreeMembersContext::getRuleIndex() const {
  return TParser::RuleLoopThreeMembers;
}

void TParser::LoopThreeMembersContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterLoopThreeMembers(this);
}

void TParser::LoopThreeMembersContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitLoopThreeMembers(this);
}


antlrcpp::Any TParser::LoopThreeMembersContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitLoopThreeMembers(this);
  else
    return visitor->visitChildren(this);
}

TParser::LoopThreeMembersContext* TParser::loopThreeMembers() {
  LoopThreeMembersContext *_localctx = _tracker.createInstance<LoopThreeMembersContext>(_ctx, getState());
  enterRule(_localctx, 118, TParser::RuleLoopThreeMembers);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(775);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 35, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(773);
      loopThreeMembersValues();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);

      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- LoopThreeMembersValuesContext ------------------------------------------------------------------

TParser::LoopThreeMembersValuesContext::LoopThreeMembersValuesContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::OperationElementsContext* TParser::LoopThreeMembersValuesContext::operationElements() {
  return getRuleContext<TParser::OperationElementsContext>(0);
}

tree::TerminalNode* TParser::LoopThreeMembersValuesContext::Separator() {
  return getToken(TParser::Separator, 0);
}

TParser::LoopThreeMembersValuesContext* TParser::LoopThreeMembersValuesContext::loopThreeMembersValues() {
  return getRuleContext<TParser::LoopThreeMembersValuesContext>(0);
}


size_t TParser::LoopThreeMembersValuesContext::getRuleIndex() const {
  return TParser::RuleLoopThreeMembersValues;
}

void TParser::LoopThreeMembersValuesContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterLoopThreeMembersValues(this);
}

void TParser::LoopThreeMembersValuesContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitLoopThreeMembersValues(this);
}


antlrcpp::Any TParser::LoopThreeMembersValuesContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitLoopThreeMembersValues(this);
  else
    return visitor->visitChildren(this);
}

TParser::LoopThreeMembersValuesContext* TParser::loopThreeMembersValues() {
  LoopThreeMembersValuesContext *_localctx = _tracker.createInstance<LoopThreeMembersValuesContext>(_ctx, getState());
  enterRule(_localctx, 120, TParser::RuleLoopThreeMembersValues);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(782);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 36, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(777);
      operationElements();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(778);
      operationElements();
      setState(779);
      match(TParser::Separator);
      setState(780);
      loopThreeMembersValues();
      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- LoopBlockElementsContext ------------------------------------------------------------------

TParser::LoopBlockElementsContext::LoopBlockElementsContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::SentenceContext* TParser::LoopBlockElementsContext::sentence() {
  return getRuleContext<TParser::SentenceContext>(0);
}

TParser::LoopBlockElementsContext* TParser::LoopBlockElementsContext::loopBlockElements() {
  return getRuleContext<TParser::LoopBlockElementsContext>(0);
}


size_t TParser::LoopBlockElementsContext::getRuleIndex() const {
  return TParser::RuleLoopBlockElements;
}

void TParser::LoopBlockElementsContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterLoopBlockElements(this);
}

void TParser::LoopBlockElementsContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitLoopBlockElements(this);
}


antlrcpp::Any TParser::LoopBlockElementsContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitLoopBlockElements(this);
  else
    return visitor->visitChildren(this);
}

TParser::LoopBlockElementsContext* TParser::loopBlockElements() {
  LoopBlockElementsContext *_localctx = _tracker.createInstance<LoopBlockElementsContext>(_ctx, getState());
  enterRule(_localctx, 122, TParser::RuleLoopBlockElements);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(788);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 37, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(784);
      sentence();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(785);
      sentence();
      setState(786);
      loopBlockElements();
      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- LoopBlockElementsLimitedContext ------------------------------------------------------------------

TParser::LoopBlockElementsLimitedContext::LoopBlockElementsLimitedContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::LoopBlockElementsLimitedContext::OpenBlock() {
  return getToken(TParser::OpenBlock, 0);
}

tree::TerminalNode* TParser::LoopBlockElementsLimitedContext::CloseBlock() {
  return getToken(TParser::CloseBlock, 0);
}

TParser::LoopBlockElementsContext* TParser::LoopBlockElementsLimitedContext::loopBlockElements() {
  return getRuleContext<TParser::LoopBlockElementsContext>(0);
}

TParser::ConditionalExpressionContext* TParser::LoopBlockElementsLimitedContext::conditionalExpression() {
  return getRuleContext<TParser::ConditionalExpressionContext>(0);
}

TParser::CallingFunctionContext* TParser::LoopBlockElementsLimitedContext::callingFunction() {
  return getRuleContext<TParser::CallingFunctionContext>(0);
}

TParser::LoopContext* TParser::LoopBlockElementsLimitedContext::loop() {
  return getRuleContext<TParser::LoopContext>(0);
}

TParser::RetContext* TParser::LoopBlockElementsLimitedContext::ret() {
  return getRuleContext<TParser::RetContext>(0);
}


size_t TParser::LoopBlockElementsLimitedContext::getRuleIndex() const {
  return TParser::RuleLoopBlockElementsLimited;
}

void TParser::LoopBlockElementsLimitedContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterLoopBlockElementsLimited(this);
}

void TParser::LoopBlockElementsLimitedContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitLoopBlockElementsLimited(this);
}


antlrcpp::Any TParser::LoopBlockElementsLimitedContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitLoopBlockElementsLimited(this);
  else
    return visitor->visitChildren(this);
}

TParser::LoopBlockElementsLimitedContext* TParser::loopBlockElementsLimited() {
  LoopBlockElementsLimitedContext *_localctx = _tracker.createInstance<LoopBlockElementsLimitedContext>(_ctx, getState());
  enterRule(_localctx, 124, TParser::RuleLoopBlockElementsLimited);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(800);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 38, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(790);
      match(TParser::OpenBlock);
      setState(791);
      match(TParser::CloseBlock);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(792);
      match(TParser::OpenBlock);
      setState(793);
      loopBlockElements();
      setState(794);
      match(TParser::CloseBlock);
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(796);
      conditionalExpression();
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(797);
      callingFunction();
      break;
    }

    case 5: {
      enterOuterAlt(_localctx, 5);
      setState(798);
      loop();
      break;
    }

    case 6: {
      enterOuterAlt(_localctx, 6);
      setState(799);
      ret();
      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- RetContext ------------------------------------------------------------------

TParser::RetContext::RetContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::RetContext::Ret() {
  return getToken(TParser::Ret, 0);
}

TParser::RetValuesContext* TParser::RetContext::retValues() {
  return getRuleContext<TParser::RetValuesContext>(0);
}

tree::TerminalNode* TParser::RetContext::End() {
  return getToken(TParser::End, 0);
}


size_t TParser::RetContext::getRuleIndex() const {
  return TParser::RuleRet;
}

void TParser::RetContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterRet(this);
}

void TParser::RetContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitRet(this);
}


antlrcpp::Any TParser::RetContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitRet(this);
  else
    return visitor->visitChildren(this);
}

TParser::RetContext* TParser::ret() {
  RetContext *_localctx = _tracker.createInstance<RetContext>(_ctx, getState());
  enterRule(_localctx, 126, TParser::RuleRet);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(802);
    match(TParser::Ret);
    setState(803);
    retValues();
    setState(804);
    match(TParser::End);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- RetValuesContext ------------------------------------------------------------------

TParser::RetValuesContext::RetValuesContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::GeneralValueContext* TParser::RetValuesContext::generalValue() {
  return getRuleContext<TParser::GeneralValueContext>(0);
}

TParser::OperationElementsContext* TParser::RetValuesContext::operationElements() {
  return getRuleContext<TParser::OperationElementsContext>(0);
}


size_t TParser::RetValuesContext::getRuleIndex() const {
  return TParser::RuleRetValues;
}

void TParser::RetValuesContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterRetValues(this);
}

void TParser::RetValuesContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitRetValues(this);
}


antlrcpp::Any TParser::RetValuesContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitRetValues(this);
  else
    return visitor->visitChildren(this);
}

TParser::RetValuesContext* TParser::retValues() {
  RetValuesContext *_localctx = _tracker.createInstance<RetValuesContext>(_ctx, getState());
  enterRule(_localctx, 128, TParser::RuleRetValues);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(808);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 39, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(806);
      generalValue();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(807);
      operationElements();
      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- FunctionsContext ------------------------------------------------------------------

TParser::FunctionsContext::FunctionsContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::FunctionsModesContext* TParser::FunctionsContext::functionsModes() {
  return getRuleContext<TParser::FunctionsModesContext>(0);
}

tree::TerminalNode* TParser::FunctionsContext::OpenBlock() {
  return getToken(TParser::OpenBlock, 0);
}

tree::TerminalNode* TParser::FunctionsContext::CloseBlock() {
  return getToken(TParser::CloseBlock, 0);
}

TParser::FunctionCodeBlockContext* TParser::FunctionsContext::functionCodeBlock() {
  return getRuleContext<TParser::FunctionCodeBlockContext>(0);
}

TParser::FunctionMethodsModesContext* TParser::FunctionsContext::functionMethodsModes() {
  return getRuleContext<TParser::FunctionMethodsModesContext>(0);
}

TParser::ConstructClassMethodContext* TParser::FunctionsContext::constructClassMethod() {
  return getRuleContext<TParser::ConstructClassMethodContext>(0);
}

TParser::InterfaceMethodContext* TParser::FunctionsContext::interfaceMethod() {
  return getRuleContext<TParser::InterfaceMethodContext>(0);
}

tree::TerminalNode* TParser::FunctionsContext::End() {
  return getToken(TParser::End, 0);
}


size_t TParser::FunctionsContext::getRuleIndex() const {
  return TParser::RuleFunctions;
}

void TParser::FunctionsContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterFunctions(this);
}

void TParser::FunctionsContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitFunctions(this);
}


antlrcpp::Any TParser::FunctionsContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitFunctions(this);
  else
    return visitor->visitChildren(this);
}

TParser::FunctionsContext* TParser::functions() {
  FunctionsContext *_localctx = _tracker.createInstance<FunctionsContext>(_ctx, getState());
  enterRule(_localctx, 130, TParser::RuleFunctions);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(840);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 40, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(810);
      functionsModes();
      setState(811);
      match(TParser::OpenBlock);
      setState(812);
      match(TParser::CloseBlock);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(814);
      functionsModes();
      setState(815);
      match(TParser::OpenBlock);
      setState(816);
      functionCodeBlock();
      setState(817);
      match(TParser::CloseBlock);
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(819);
      functionMethodsModes();
      setState(820);
      match(TParser::OpenBlock);
      setState(821);
      match(TParser::CloseBlock);
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(823);
      functionMethodsModes();
      setState(824);
      match(TParser::OpenBlock);
      setState(825);
      functionCodeBlock();
      setState(826);
      match(TParser::CloseBlock);
      break;
    }

    case 5: {
      enterOuterAlt(_localctx, 5);
      setState(828);
      constructClassMethod();
      setState(829);
      match(TParser::OpenBlock);
      setState(830);
      match(TParser::CloseBlock);
      break;
    }

    case 6: {
      enterOuterAlt(_localctx, 6);
      setState(832);
      constructClassMethod();
      setState(833);
      match(TParser::OpenBlock);
      setState(834);
      functionCodeBlock();
      setState(835);
      match(TParser::CloseBlock);
      break;
    }

    case 7: {
      enterOuterAlt(_localctx, 7);
      setState(837);
      interfaceMethod();
      setState(838);
      match(TParser::End);
      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- FunctionsModesContext ------------------------------------------------------------------

TParser::FunctionsModesContext::FunctionsModesContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::FunctionGeneralModesContext* TParser::FunctionsModesContext::functionGeneralModes() {
  return getRuleContext<TParser::FunctionGeneralModesContext>(0);
}


size_t TParser::FunctionsModesContext::getRuleIndex() const {
  return TParser::RuleFunctionsModes;
}

void TParser::FunctionsModesContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterFunctionsModes(this);
}

void TParser::FunctionsModesContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitFunctionsModes(this);
}


antlrcpp::Any TParser::FunctionsModesContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitFunctionsModes(this);
  else
    return visitor->visitChildren(this);
}

TParser::FunctionsModesContext* TParser::functionsModes() {
  FunctionsModesContext *_localctx = _tracker.createInstance<FunctionsModesContext>(_ctx, getState());
  enterRule(_localctx, 132, TParser::RuleFunctionsModes);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(842);
    functionGeneralModes();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- FunctionGeneralModesContext ------------------------------------------------------------------

TParser::FunctionGeneralModesContext::FunctionGeneralModesContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::FunctionGeneralModesContext::Function() {
  return getToken(TParser::Function, 0);
}

tree::TerminalNode* TParser::FunctionGeneralModesContext::Identifier() {
  return getToken(TParser::Identifier, 0);
}

tree::TerminalNode* TParser::FunctionGeneralModesContext::OpenOp() {
  return getToken(TParser::OpenOp, 0);
}

tree::TerminalNode* TParser::FunctionGeneralModesContext::CloseOp() {
  return getToken(TParser::CloseOp, 0);
}

tree::TerminalNode* TParser::FunctionGeneralModesContext::ArrowRight() {
  return getToken(TParser::ArrowRight, 0);
}

TParser::IdentifierRetContext* TParser::FunctionGeneralModesContext::identifierRet() {
  return getRuleContext<TParser::IdentifierRetContext>(0);
}

tree::TerminalNode* TParser::FunctionGeneralModesContext::TypeSpec() {
  return getToken(TParser::TypeSpec, 0);
}

TParser::FunctionParamsContext* TParser::FunctionGeneralModesContext::functionParams() {
  return getRuleContext<TParser::FunctionParamsContext>(0);
}


size_t TParser::FunctionGeneralModesContext::getRuleIndex() const {
  return TParser::RuleFunctionGeneralModes;
}

void TParser::FunctionGeneralModesContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterFunctionGeneralModes(this);
}

void TParser::FunctionGeneralModesContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitFunctionGeneralModes(this);
}


antlrcpp::Any TParser::FunctionGeneralModesContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitFunctionGeneralModes(this);
  else
    return visitor->visitChildren(this);
}

TParser::FunctionGeneralModesContext* TParser::functionGeneralModes() {
  FunctionGeneralModesContext *_localctx = _tracker.createInstance<FunctionGeneralModesContext>(_ctx, getState());
  enterRule(_localctx, 134, TParser::RuleFunctionGeneralModes);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(873);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 43, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(844);
      match(TParser::Function);
      setState(845);
      match(TParser::Identifier);
      setState(846);
      match(TParser::OpenOp);
      setState(847);
      match(TParser::CloseOp);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(848);
      match(TParser::Function);
      setState(849);
      match(TParser::Identifier);
      setState(850);
      match(TParser::OpenOp);
      setState(851);
      match(TParser::CloseOp);
      setState(852);
      match(TParser::ArrowRight);
      setState(855);
      _errHandler->sync(this);
      switch (_input->LA(1)) {
        case TParser::Identifier: {
          setState(853);
          identifierRet();
          break;
        }

        case TParser::TypeSpec: {
          setState(854);
          match(TParser::TypeSpec);
          break;
        }

      default:
        throw NoViableAltException(this);
      }
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(857);
      match(TParser::Function);
      setState(858);
      match(TParser::Identifier);
      setState(859);
      match(TParser::OpenOp);
      setState(860);
      functionParams();
      setState(861);
      match(TParser::CloseOp);
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(863);
      match(TParser::Function);
      setState(864);
      match(TParser::Identifier);
      setState(865);
      match(TParser::OpenOp);
      setState(866);
      functionParams();
      setState(867);
      match(TParser::CloseOp);
      setState(868);
      match(TParser::ArrowRight);
      setState(871);
      _errHandler->sync(this);
      switch (_input->LA(1)) {
        case TParser::Identifier: {
          setState(869);
          identifierRet();
          break;
        }

        case TParser::TypeSpec: {
          setState(870);
          match(TParser::TypeSpec);
          break;
        }

      default:
        throw NoViableAltException(this);
      }
      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- IdentifierRetContext ------------------------------------------------------------------

TParser::IdentifierRetContext::IdentifierRetContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::IdentifierRetContext::Identifier() {
  return getToken(TParser::Identifier, 0);
}


size_t TParser::IdentifierRetContext::getRuleIndex() const {
  return TParser::RuleIdentifierRet;
}

void TParser::IdentifierRetContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterIdentifierRet(this);
}

void TParser::IdentifierRetContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitIdentifierRet(this);
}


antlrcpp::Any TParser::IdentifierRetContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitIdentifierRet(this);
  else
    return visitor->visitChildren(this);
}

TParser::IdentifierRetContext* TParser::identifierRet() {
  IdentifierRetContext *_localctx = _tracker.createInstance<IdentifierRetContext>(_ctx, getState());
  enterRule(_localctx, 136, TParser::RuleIdentifierRet);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(875);
    match(TParser::Identifier);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- FunctionMethodsModesContext ------------------------------------------------------------------

TParser::FunctionMethodsModesContext::FunctionMethodsModesContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::MethodVisibilityContext* TParser::FunctionMethodsModesContext::methodVisibility() {
  return getRuleContext<TParser::MethodVisibilityContext>(0);
}

TParser::FunctionGeneralModesContext* TParser::FunctionMethodsModesContext::functionGeneralModes() {
  return getRuleContext<TParser::FunctionGeneralModesContext>(0);
}


size_t TParser::FunctionMethodsModesContext::getRuleIndex() const {
  return TParser::RuleFunctionMethodsModes;
}

void TParser::FunctionMethodsModesContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterFunctionMethodsModes(this);
}

void TParser::FunctionMethodsModesContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitFunctionMethodsModes(this);
}


antlrcpp::Any TParser::FunctionMethodsModesContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitFunctionMethodsModes(this);
  else
    return visitor->visitChildren(this);
}

TParser::FunctionMethodsModesContext* TParser::functionMethodsModes() {
  FunctionMethodsModesContext *_localctx = _tracker.createInstance<FunctionMethodsModesContext>(_ctx, getState());
  enterRule(_localctx, 138, TParser::RuleFunctionMethodsModes);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(877);
    methodVisibility();
    setState(878);
    functionGeneralModes();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- FunctionMethodsModesBkpContext ------------------------------------------------------------------

TParser::FunctionMethodsModesBkpContext::FunctionMethodsModesBkpContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::MethodPermContext* TParser::FunctionMethodsModesBkpContext::methodPerm() {
  return getRuleContext<TParser::MethodPermContext>(0);
}

TParser::FunctionGeneralModesContext* TParser::FunctionMethodsModesBkpContext::functionGeneralModes() {
  return getRuleContext<TParser::FunctionGeneralModesContext>(0);
}

tree::TerminalNode* TParser::FunctionMethodsModesBkpContext::Static() {
  return getToken(TParser::Static, 0);
}

tree::TerminalNode* TParser::FunctionMethodsModesBkpContext::Final() {
  return getToken(TParser::Final, 0);
}


size_t TParser::FunctionMethodsModesBkpContext::getRuleIndex() const {
  return TParser::RuleFunctionMethodsModesBkp;
}

void TParser::FunctionMethodsModesBkpContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterFunctionMethodsModesBkp(this);
}

void TParser::FunctionMethodsModesBkpContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitFunctionMethodsModesBkp(this);
}


antlrcpp::Any TParser::FunctionMethodsModesBkpContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitFunctionMethodsModesBkp(this);
  else
    return visitor->visitChildren(this);
}

TParser::FunctionMethodsModesBkpContext* TParser::functionMethodsModesBkp() {
  FunctionMethodsModesBkpContext *_localctx = _tracker.createInstance<FunctionMethodsModesBkpContext>(_ctx, getState());
  enterRule(_localctx, 140, TParser::RuleFunctionMethodsModesBkp);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(903);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 44, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(880);
      methodPerm();
      setState(881);
      functionGeneralModes();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(883);
      match(TParser::Static);
      setState(884);
      functionGeneralModes();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(885);
      methodPerm();
      setState(886);
      match(TParser::Static);
      setState(887);
      functionGeneralModes();
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(889);
      match(TParser::Final);
      setState(890);
      methodPerm();
      setState(891);
      match(TParser::Static);
      setState(892);
      functionGeneralModes();
      break;
    }

    case 5: {
      enterOuterAlt(_localctx, 5);
      setState(894);
      match(TParser::Final);
      setState(895);
      methodPerm();
      setState(896);
      functionGeneralModes();
      break;
    }

    case 6: {
      enterOuterAlt(_localctx, 6);
      setState(898);
      match(TParser::Final);
      setState(899);
      functionGeneralModes();
      break;
    }

    case 7: {
      enterOuterAlt(_localctx, 7);
      setState(900);
      match(TParser::Final);
      setState(901);
      match(TParser::Static);
      setState(902);
      functionGeneralModes();
      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- MethodPermContext ------------------------------------------------------------------

TParser::MethodPermContext::MethodPermContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::MethodPermContext::Pub() {
  return getToken(TParser::Pub, 0);
}

tree::TerminalNode* TParser::MethodPermContext::Pro() {
  return getToken(TParser::Pro, 0);
}

tree::TerminalNode* TParser::MethodPermContext::Priv() {
  return getToken(TParser::Priv, 0);
}


size_t TParser::MethodPermContext::getRuleIndex() const {
  return TParser::RuleMethodPerm;
}

void TParser::MethodPermContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterMethodPerm(this);
}

void TParser::MethodPermContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitMethodPerm(this);
}


antlrcpp::Any TParser::MethodPermContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitMethodPerm(this);
  else
    return visitor->visitChildren(this);
}

TParser::MethodPermContext* TParser::methodPerm() {
  MethodPermContext *_localctx = _tracker.createInstance<MethodPermContext>(_ctx, getState());
  enterRule(_localctx, 142, TParser::RuleMethodPerm);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(905);
    _la = _input->LA(1);
    if (!((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << TParser::Pub)
      | (1ULL << TParser::Pro)
      | (1ULL << TParser::Priv))) != 0))) {
    _errHandler->recoverInline(this);
    }
    else {
      _errHandler->reportMatch(this);
      consume();
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- VisibilityItemsContext ------------------------------------------------------------------

TParser::VisibilityItemsContext::VisibilityItemsContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::VisibilityItemsContext::Pub() {
  return getToken(TParser::Pub, 0);
}

tree::TerminalNode* TParser::VisibilityItemsContext::Pro() {
  return getToken(TParser::Pro, 0);
}

tree::TerminalNode* TParser::VisibilityItemsContext::Priv() {
  return getToken(TParser::Priv, 0);
}

tree::TerminalNode* TParser::VisibilityItemsContext::Final() {
  return getToken(TParser::Final, 0);
}

tree::TerminalNode* TParser::VisibilityItemsContext::Static() {
  return getToken(TParser::Static, 0);
}


size_t TParser::VisibilityItemsContext::getRuleIndex() const {
  return TParser::RuleVisibilityItems;
}

void TParser::VisibilityItemsContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterVisibilityItems(this);
}

void TParser::VisibilityItemsContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitVisibilityItems(this);
}


antlrcpp::Any TParser::VisibilityItemsContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitVisibilityItems(this);
  else
    return visitor->visitChildren(this);
}

TParser::VisibilityItemsContext* TParser::visibilityItems() {
  VisibilityItemsContext *_localctx = _tracker.createInstance<VisibilityItemsContext>(_ctx, getState());
  enterRule(_localctx, 144, TParser::RuleVisibilityItems);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(907);
    _la = _input->LA(1);
    if (!((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << TParser::Pub)
      | (1ULL << TParser::Pro)
      | (1ULL << TParser::Priv)
      | (1ULL << TParser::Static)
      | (1ULL << TParser::Final))) != 0))) {
    _errHandler->recoverInline(this);
    }
    else {
      _errHandler->reportMatch(this);
      consume();
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- MethodVisibilityContext ------------------------------------------------------------------

TParser::MethodVisibilityContext::MethodVisibilityContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::VisibilityItemsContext* TParser::MethodVisibilityContext::visibilityItems() {
  return getRuleContext<TParser::VisibilityItemsContext>(0);
}

TParser::MethodVisibilityContext* TParser::MethodVisibilityContext::methodVisibility() {
  return getRuleContext<TParser::MethodVisibilityContext>(0);
}


size_t TParser::MethodVisibilityContext::getRuleIndex() const {
  return TParser::RuleMethodVisibility;
}

void TParser::MethodVisibilityContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterMethodVisibility(this);
}

void TParser::MethodVisibilityContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitMethodVisibility(this);
}


antlrcpp::Any TParser::MethodVisibilityContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitMethodVisibility(this);
  else
    return visitor->visitChildren(this);
}

TParser::MethodVisibilityContext* TParser::methodVisibility() {
  MethodVisibilityContext *_localctx = _tracker.createInstance<MethodVisibilityContext>(_ctx, getState());
  enterRule(_localctx, 146, TParser::RuleMethodVisibility);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(913);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 45, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(909);
      visibilityItems();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(910);
      visibilityItems();
      setState(911);
      methodVisibility();
      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ConstructClassMethodContext ------------------------------------------------------------------

TParser::ConstructClassMethodContext::ConstructClassMethodContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::ConstructClassMethodContext::Identifier() {
  return getToken(TParser::Identifier, 0);
}

tree::TerminalNode* TParser::ConstructClassMethodContext::OpenOp() {
  return getToken(TParser::OpenOp, 0);
}

tree::TerminalNode* TParser::ConstructClassMethodContext::CloseOp() {
  return getToken(TParser::CloseOp, 0);
}

TParser::FunctionParamsContext* TParser::ConstructClassMethodContext::functionParams() {
  return getRuleContext<TParser::FunctionParamsContext>(0);
}


size_t TParser::ConstructClassMethodContext::getRuleIndex() const {
  return TParser::RuleConstructClassMethod;
}

void TParser::ConstructClassMethodContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterConstructClassMethod(this);
}

void TParser::ConstructClassMethodContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitConstructClassMethod(this);
}


antlrcpp::Any TParser::ConstructClassMethodContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitConstructClassMethod(this);
  else
    return visitor->visitChildren(this);
}

TParser::ConstructClassMethodContext* TParser::constructClassMethod() {
  ConstructClassMethodContext *_localctx = _tracker.createInstance<ConstructClassMethodContext>(_ctx, getState());
  enterRule(_localctx, 148, TParser::RuleConstructClassMethod);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(923);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 46, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(915);
      match(TParser::Identifier);
      setState(916);
      match(TParser::OpenOp);
      setState(917);
      match(TParser::CloseOp);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(918);
      match(TParser::Identifier);
      setState(919);
      match(TParser::OpenOp);
      setState(920);
      functionParams();
      setState(921);
      match(TParser::CloseOp);
      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- InterfaceMethodContext ------------------------------------------------------------------

TParser::InterfaceMethodContext::InterfaceMethodContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::FunctionsModesContext* TParser::InterfaceMethodContext::functionsModes() {
  return getRuleContext<TParser::FunctionsModesContext>(0);
}

TParser::FunctionMethodsModesContext* TParser::InterfaceMethodContext::functionMethodsModes() {
  return getRuleContext<TParser::FunctionMethodsModesContext>(0);
}


size_t TParser::InterfaceMethodContext::getRuleIndex() const {
  return TParser::RuleInterfaceMethod;
}

void TParser::InterfaceMethodContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterInterfaceMethod(this);
}

void TParser::InterfaceMethodContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitInterfaceMethod(this);
}


antlrcpp::Any TParser::InterfaceMethodContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitInterfaceMethod(this);
  else
    return visitor->visitChildren(this);
}

TParser::InterfaceMethodContext* TParser::interfaceMethod() {
  InterfaceMethodContext *_localctx = _tracker.createInstance<InterfaceMethodContext>(_ctx, getState());
  enterRule(_localctx, 150, TParser::RuleInterfaceMethod);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(927);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case TParser::Function: {
        enterOuterAlt(_localctx, 1);
        setState(925);
        functionsModes();
        break;
      }

      case TParser::Pub:
      case TParser::Pro:
      case TParser::Priv:
      case TParser::Static:
      case TParser::Final: {
        enterOuterAlt(_localctx, 2);
        setState(926);
        functionMethodsModes();
        break;
      }

    default:
      throw NoViableAltException(this);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- FunctionCodeBlockContext ------------------------------------------------------------------

TParser::FunctionCodeBlockContext::FunctionCodeBlockContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::FunctionCodeBlockElementsContext* TParser::FunctionCodeBlockContext::functionCodeBlockElements() {
  return getRuleContext<TParser::FunctionCodeBlockElementsContext>(0);
}


size_t TParser::FunctionCodeBlockContext::getRuleIndex() const {
  return TParser::RuleFunctionCodeBlock;
}

void TParser::FunctionCodeBlockContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterFunctionCodeBlock(this);
}

void TParser::FunctionCodeBlockContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitFunctionCodeBlock(this);
}


antlrcpp::Any TParser::FunctionCodeBlockContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitFunctionCodeBlock(this);
  else
    return visitor->visitChildren(this);
}

TParser::FunctionCodeBlockContext* TParser::functionCodeBlock() {
  FunctionCodeBlockContext *_localctx = _tracker.createInstance<FunctionCodeBlockContext>(_ctx, getState());
  enterRule(_localctx, 152, TParser::RuleFunctionCodeBlock);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(929);
    functionCodeBlockElements();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- FunctionCodeBlockElementsContext ------------------------------------------------------------------

TParser::FunctionCodeBlockElementsContext::FunctionCodeBlockElementsContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::SentenceContext* TParser::FunctionCodeBlockElementsContext::sentence() {
  return getRuleContext<TParser::SentenceContext>(0);
}

TParser::FunctionCodeBlockElementsContext* TParser::FunctionCodeBlockElementsContext::functionCodeBlockElements() {
  return getRuleContext<TParser::FunctionCodeBlockElementsContext>(0);
}


size_t TParser::FunctionCodeBlockElementsContext::getRuleIndex() const {
  return TParser::RuleFunctionCodeBlockElements;
}

void TParser::FunctionCodeBlockElementsContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterFunctionCodeBlockElements(this);
}

void TParser::FunctionCodeBlockElementsContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitFunctionCodeBlockElements(this);
}


antlrcpp::Any TParser::FunctionCodeBlockElementsContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitFunctionCodeBlockElements(this);
  else
    return visitor->visitChildren(this);
}

TParser::FunctionCodeBlockElementsContext* TParser::functionCodeBlockElements() {
  FunctionCodeBlockElementsContext *_localctx = _tracker.createInstance<FunctionCodeBlockElementsContext>(_ctx, getState());
  enterRule(_localctx, 154, TParser::RuleFunctionCodeBlockElements);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(935);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 48, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(931);
      sentence();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(932);
      sentence();
      setState(933);
      functionCodeBlockElements();
      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- FunctionParamsContext ------------------------------------------------------------------

TParser::FunctionParamsContext::FunctionParamsContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::FunctionParamsControlContext* TParser::FunctionParamsContext::functionParamsControl() {
  return getRuleContext<TParser::FunctionParamsControlContext>(0);
}


size_t TParser::FunctionParamsContext::getRuleIndex() const {
  return TParser::RuleFunctionParams;
}

void TParser::FunctionParamsContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterFunctionParams(this);
}

void TParser::FunctionParamsContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitFunctionParams(this);
}


antlrcpp::Any TParser::FunctionParamsContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitFunctionParams(this);
  else
    return visitor->visitChildren(this);
}

TParser::FunctionParamsContext* TParser::functionParams() {
  FunctionParamsContext *_localctx = _tracker.createInstance<FunctionParamsContext>(_ctx, getState());
  enterRule(_localctx, 156, TParser::RuleFunctionParams);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(937);
    functionParamsControl();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- FunctionParamsControlContext ------------------------------------------------------------------

TParser::FunctionParamsControlContext::FunctionParamsControlContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::FunctionParamElementsContext* TParser::FunctionParamsControlContext::functionParamElements() {
  return getRuleContext<TParser::FunctionParamElementsContext>(0);
}

tree::TerminalNode* TParser::FunctionParamsControlContext::Separator() {
  return getToken(TParser::Separator, 0);
}

TParser::FunctionParamsControlContext* TParser::FunctionParamsControlContext::functionParamsControl() {
  return getRuleContext<TParser::FunctionParamsControlContext>(0);
}


size_t TParser::FunctionParamsControlContext::getRuleIndex() const {
  return TParser::RuleFunctionParamsControl;
}

void TParser::FunctionParamsControlContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterFunctionParamsControl(this);
}

void TParser::FunctionParamsControlContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitFunctionParamsControl(this);
}


antlrcpp::Any TParser::FunctionParamsControlContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitFunctionParamsControl(this);
  else
    return visitor->visitChildren(this);
}

TParser::FunctionParamsControlContext* TParser::functionParamsControl() {
  FunctionParamsControlContext *_localctx = _tracker.createInstance<FunctionParamsControlContext>(_ctx, getState());
  enterRule(_localctx, 158, TParser::RuleFunctionParamsControl);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(944);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 49, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(939);
      functionParamElements();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(940);
      functionParamElements();
      setState(941);
      match(TParser::Separator);
      setState(942);
      functionParamsControl();
      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- FunctionParamElementsContext ------------------------------------------------------------------

TParser::FunctionParamElementsContext::FunctionParamElementsContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::FunctionParamElementsContext::Identifier() {
  return getToken(TParser::Identifier, 0);
}

tree::TerminalNode* TParser::FunctionParamElementsContext::TypeSpec() {
  return getToken(TParser::TypeSpec, 0);
}


size_t TParser::FunctionParamElementsContext::getRuleIndex() const {
  return TParser::RuleFunctionParamElements;
}

void TParser::FunctionParamElementsContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterFunctionParamElements(this);
}

void TParser::FunctionParamElementsContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitFunctionParamElements(this);
}


antlrcpp::Any TParser::FunctionParamElementsContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitFunctionParamElements(this);
  else
    return visitor->visitChildren(this);
}

TParser::FunctionParamElementsContext* TParser::functionParamElements() {
  FunctionParamElementsContext *_localctx = _tracker.createInstance<FunctionParamElementsContext>(_ctx, getState());
  enterRule(_localctx, 160, TParser::RuleFunctionParamElements);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(946);
    match(TParser::Identifier);
    setState(947);
    match(TParser::TypeSpec);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- OopGeneralContext ------------------------------------------------------------------

TParser::OopGeneralContext::OopGeneralContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::InterfaceClassContext* TParser::OopGeneralContext::interfaceClass() {
  return getRuleContext<TParser::InterfaceClassContext>(0);
}

TParser::AbstractClassContext* TParser::OopGeneralContext::abstractClass() {
  return getRuleContext<TParser::AbstractClassContext>(0);
}

TParser::ClassDefinationContext* TParser::OopGeneralContext::classDefination() {
  return getRuleContext<TParser::ClassDefinationContext>(0);
}


size_t TParser::OopGeneralContext::getRuleIndex() const {
  return TParser::RuleOopGeneral;
}

void TParser::OopGeneralContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterOopGeneral(this);
}

void TParser::OopGeneralContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitOopGeneral(this);
}


antlrcpp::Any TParser::OopGeneralContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitOopGeneral(this);
  else
    return visitor->visitChildren(this);
}

TParser::OopGeneralContext* TParser::oopGeneral() {
  OopGeneralContext *_localctx = _tracker.createInstance<OopGeneralContext>(_ctx, getState());
  enterRule(_localctx, 162, TParser::RuleOopGeneral);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(952);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case TParser::Interface: {
        enterOuterAlt(_localctx, 1);
        setState(949);
        interfaceClass();
        break;
      }

      case TParser::Abstract: {
        enterOuterAlt(_localctx, 2);
        setState(950);
        abstractClass();
        break;
      }

      case TParser::Final:
      case TParser::Class: {
        enterOuterAlt(_localctx, 3);
        setState(951);
        classDefination();
        break;
      }

    default:
      throw NoViableAltException(this);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- InterfaceClassContext ------------------------------------------------------------------

TParser::InterfaceClassContext::InterfaceClassContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::InterfaceClassDefinitionContext* TParser::InterfaceClassContext::interfaceClassDefinition() {
  return getRuleContext<TParser::InterfaceClassDefinitionContext>(0);
}


size_t TParser::InterfaceClassContext::getRuleIndex() const {
  return TParser::RuleInterfaceClass;
}

void TParser::InterfaceClassContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterInterfaceClass(this);
}

void TParser::InterfaceClassContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitInterfaceClass(this);
}


antlrcpp::Any TParser::InterfaceClassContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitInterfaceClass(this);
  else
    return visitor->visitChildren(this);
}

TParser::InterfaceClassContext* TParser::interfaceClass() {
  InterfaceClassContext *_localctx = _tracker.createInstance<InterfaceClassContext>(_ctx, getState());
  enterRule(_localctx, 164, TParser::RuleInterfaceClass);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(954);
    interfaceClassDefinition();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- InterfaceClassDefinitionContext ------------------------------------------------------------------

TParser::InterfaceClassDefinitionContext::InterfaceClassDefinitionContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::InterfaceClassDefinitionContext::Interface() {
  return getToken(TParser::Interface, 0);
}

tree::TerminalNode* TParser::InterfaceClassDefinitionContext::Identifier() {
  return getToken(TParser::Identifier, 0);
}

tree::TerminalNode* TParser::InterfaceClassDefinitionContext::OpenBlock() {
  return getToken(TParser::OpenBlock, 0);
}

tree::TerminalNode* TParser::InterfaceClassDefinitionContext::CloseBlock() {
  return getToken(TParser::CloseBlock, 0);
}

TParser::InterfaceCodeBlockContext* TParser::InterfaceClassDefinitionContext::interfaceCodeBlock() {
  return getRuleContext<TParser::InterfaceCodeBlockContext>(0);
}

tree::TerminalNode* TParser::InterfaceClassDefinitionContext::Extends() {
  return getToken(TParser::Extends, 0);
}

TParser::IdentifierBContext* TParser::InterfaceClassDefinitionContext::identifierB() {
  return getRuleContext<TParser::IdentifierBContext>(0);
}


size_t TParser::InterfaceClassDefinitionContext::getRuleIndex() const {
  return TParser::RuleInterfaceClassDefinition;
}

void TParser::InterfaceClassDefinitionContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterInterfaceClassDefinition(this);
}

void TParser::InterfaceClassDefinitionContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitInterfaceClassDefinition(this);
}


antlrcpp::Any TParser::InterfaceClassDefinitionContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitInterfaceClassDefinition(this);
  else
    return visitor->visitChildren(this);
}

TParser::InterfaceClassDefinitionContext* TParser::interfaceClassDefinition() {
  InterfaceClassDefinitionContext *_localctx = _tracker.createInstance<InterfaceClassDefinitionContext>(_ctx, getState());
  enterRule(_localctx, 166, TParser::RuleInterfaceClassDefinition);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(981);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 51, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(956);
      match(TParser::Interface);
      setState(957);
      match(TParser::Identifier);
      setState(958);
      match(TParser::OpenBlock);
      setState(959);
      match(TParser::CloseBlock);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(960);
      match(TParser::Interface);
      setState(961);
      match(TParser::Identifier);
      setState(962);
      match(TParser::OpenBlock);
      setState(963);
      interfaceCodeBlock();
      setState(964);
      match(TParser::CloseBlock);
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(966);
      match(TParser::Interface);
      setState(967);
      match(TParser::Identifier);
      setState(968);
      match(TParser::Extends);
      setState(969);
      identifierB();
      setState(970);
      match(TParser::OpenBlock);
      setState(971);
      match(TParser::CloseBlock);
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(973);
      match(TParser::Interface);
      setState(974);
      match(TParser::Identifier);
      setState(975);
      match(TParser::Extends);
      setState(976);
      identifierB();
      setState(977);
      match(TParser::OpenBlock);
      setState(978);
      interfaceCodeBlock();
      setState(979);
      match(TParser::CloseBlock);
      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- InterfaceCodeBlockContext ------------------------------------------------------------------

TParser::InterfaceCodeBlockContext::InterfaceCodeBlockContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::FunctionCodeBlockElementsContext* TParser::InterfaceCodeBlockContext::functionCodeBlockElements() {
  return getRuleContext<TParser::FunctionCodeBlockElementsContext>(0);
}


size_t TParser::InterfaceCodeBlockContext::getRuleIndex() const {
  return TParser::RuleInterfaceCodeBlock;
}

void TParser::InterfaceCodeBlockContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterInterfaceCodeBlock(this);
}

void TParser::InterfaceCodeBlockContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitInterfaceCodeBlock(this);
}


antlrcpp::Any TParser::InterfaceCodeBlockContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitInterfaceCodeBlock(this);
  else
    return visitor->visitChildren(this);
}

TParser::InterfaceCodeBlockContext* TParser::interfaceCodeBlock() {
  InterfaceCodeBlockContext *_localctx = _tracker.createInstance<InterfaceCodeBlockContext>(_ctx, getState());
  enterRule(_localctx, 168, TParser::RuleInterfaceCodeBlock);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(983);
    functionCodeBlockElements();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- AbstractClassContext ------------------------------------------------------------------

TParser::AbstractClassContext::AbstractClassContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::AbstractClassDefinitionContext* TParser::AbstractClassContext::abstractClassDefinition() {
  return getRuleContext<TParser::AbstractClassDefinitionContext>(0);
}


size_t TParser::AbstractClassContext::getRuleIndex() const {
  return TParser::RuleAbstractClass;
}

void TParser::AbstractClassContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterAbstractClass(this);
}

void TParser::AbstractClassContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitAbstractClass(this);
}


antlrcpp::Any TParser::AbstractClassContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitAbstractClass(this);
  else
    return visitor->visitChildren(this);
}

TParser::AbstractClassContext* TParser::abstractClass() {
  AbstractClassContext *_localctx = _tracker.createInstance<AbstractClassContext>(_ctx, getState());
  enterRule(_localctx, 170, TParser::RuleAbstractClass);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(985);
    abstractClassDefinition();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- AbstractClassDefinitionContext ------------------------------------------------------------------

TParser::AbstractClassDefinitionContext::AbstractClassDefinitionContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::AbstractClassDefinitionContext::Abstract() {
  return getToken(TParser::Abstract, 0);
}

tree::TerminalNode* TParser::AbstractClassDefinitionContext::Identifier() {
  return getToken(TParser::Identifier, 0);
}

tree::TerminalNode* TParser::AbstractClassDefinitionContext::OpenBlock() {
  return getToken(TParser::OpenBlock, 0);
}

tree::TerminalNode* TParser::AbstractClassDefinitionContext::CloseBlock() {
  return getToken(TParser::CloseBlock, 0);
}

TParser::AbstractCodeBlockContext* TParser::AbstractClassDefinitionContext::abstractCodeBlock() {
  return getRuleContext<TParser::AbstractCodeBlockContext>(0);
}

tree::TerminalNode* TParser::AbstractClassDefinitionContext::Extends() {
  return getToken(TParser::Extends, 0);
}

TParser::IdentifierBContext* TParser::AbstractClassDefinitionContext::identifierB() {
  return getRuleContext<TParser::IdentifierBContext>(0);
}


size_t TParser::AbstractClassDefinitionContext::getRuleIndex() const {
  return TParser::RuleAbstractClassDefinition;
}

void TParser::AbstractClassDefinitionContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterAbstractClassDefinition(this);
}

void TParser::AbstractClassDefinitionContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitAbstractClassDefinition(this);
}


antlrcpp::Any TParser::AbstractClassDefinitionContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitAbstractClassDefinition(this);
  else
    return visitor->visitChildren(this);
}

TParser::AbstractClassDefinitionContext* TParser::abstractClassDefinition() {
  AbstractClassDefinitionContext *_localctx = _tracker.createInstance<AbstractClassDefinitionContext>(_ctx, getState());
  enterRule(_localctx, 172, TParser::RuleAbstractClassDefinition);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(1012);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 52, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(987);
      match(TParser::Abstract);
      setState(988);
      match(TParser::Identifier);
      setState(989);
      match(TParser::OpenBlock);
      setState(990);
      match(TParser::CloseBlock);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(991);
      match(TParser::Abstract);
      setState(992);
      match(TParser::Identifier);
      setState(993);
      match(TParser::OpenBlock);
      setState(994);
      abstractCodeBlock();
      setState(995);
      match(TParser::CloseBlock);
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(997);
      match(TParser::Abstract);
      setState(998);
      match(TParser::Identifier);
      setState(999);
      match(TParser::Extends);
      setState(1000);
      identifierB();
      setState(1001);
      match(TParser::OpenBlock);
      setState(1002);
      match(TParser::CloseBlock);
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(1004);
      match(TParser::Abstract);
      setState(1005);
      match(TParser::Identifier);
      setState(1006);
      match(TParser::Extends);
      setState(1007);
      identifierB();
      setState(1008);
      match(TParser::OpenBlock);
      setState(1009);
      abstractCodeBlock();
      setState(1010);
      match(TParser::CloseBlock);
      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- AbstractCodeBlockContext ------------------------------------------------------------------

TParser::AbstractCodeBlockContext::AbstractCodeBlockContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::FunctionCodeBlockElementsContext* TParser::AbstractCodeBlockContext::functionCodeBlockElements() {
  return getRuleContext<TParser::FunctionCodeBlockElementsContext>(0);
}


size_t TParser::AbstractCodeBlockContext::getRuleIndex() const {
  return TParser::RuleAbstractCodeBlock;
}

void TParser::AbstractCodeBlockContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterAbstractCodeBlock(this);
}

void TParser::AbstractCodeBlockContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitAbstractCodeBlock(this);
}


antlrcpp::Any TParser::AbstractCodeBlockContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitAbstractCodeBlock(this);
  else
    return visitor->visitChildren(this);
}

TParser::AbstractCodeBlockContext* TParser::abstractCodeBlock() {
  AbstractCodeBlockContext *_localctx = _tracker.createInstance<AbstractCodeBlockContext>(_ctx, getState());
  enterRule(_localctx, 174, TParser::RuleAbstractCodeBlock);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(1014);
    functionCodeBlockElements();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ClassDefinationContext ------------------------------------------------------------------

TParser::ClassDefinationContext::ClassDefinationContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::ClassModesContext* TParser::ClassDefinationContext::classModes() {
  return getRuleContext<TParser::ClassModesContext>(0);
}

tree::TerminalNode* TParser::ClassDefinationContext::OpenBlock() {
  return getToken(TParser::OpenBlock, 0);
}

tree::TerminalNode* TParser::ClassDefinationContext::CloseBlock() {
  return getToken(TParser::CloseBlock, 0);
}

TParser::ClassCodeBlockContext* TParser::ClassDefinationContext::classCodeBlock() {
  return getRuleContext<TParser::ClassCodeBlockContext>(0);
}


size_t TParser::ClassDefinationContext::getRuleIndex() const {
  return TParser::RuleClassDefination;
}

void TParser::ClassDefinationContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterClassDefination(this);
}

void TParser::ClassDefinationContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitClassDefination(this);
}


antlrcpp::Any TParser::ClassDefinationContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitClassDefination(this);
  else
    return visitor->visitChildren(this);
}

TParser::ClassDefinationContext* TParser::classDefination() {
  ClassDefinationContext *_localctx = _tracker.createInstance<ClassDefinationContext>(_ctx, getState());
  enterRule(_localctx, 176, TParser::RuleClassDefination);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(1025);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 53, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(1016);
      classModes();
      setState(1017);
      match(TParser::OpenBlock);
      setState(1018);
      match(TParser::CloseBlock);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(1020);
      classModes();
      setState(1021);
      match(TParser::OpenBlock);
      setState(1022);
      classCodeBlock();
      setState(1023);
      match(TParser::CloseBlock);
      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ClassCodeBlockContext ------------------------------------------------------------------

TParser::ClassCodeBlockContext::ClassCodeBlockContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::FunctionCodeBlockElementsContext* TParser::ClassCodeBlockContext::functionCodeBlockElements() {
  return getRuleContext<TParser::FunctionCodeBlockElementsContext>(0);
}


size_t TParser::ClassCodeBlockContext::getRuleIndex() const {
  return TParser::RuleClassCodeBlock;
}

void TParser::ClassCodeBlockContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterClassCodeBlock(this);
}

void TParser::ClassCodeBlockContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitClassCodeBlock(this);
}


antlrcpp::Any TParser::ClassCodeBlockContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitClassCodeBlock(this);
  else
    return visitor->visitChildren(this);
}

TParser::ClassCodeBlockContext* TParser::classCodeBlock() {
  ClassCodeBlockContext *_localctx = _tracker.createInstance<ClassCodeBlockContext>(_ctx, getState());
  enterRule(_localctx, 178, TParser::RuleClassCodeBlock);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(1027);
    functionCodeBlockElements();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ClassModesContext ------------------------------------------------------------------

TParser::ClassModesContext::ClassModesContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::ClassModesContext::Class() {
  return getToken(TParser::Class, 0);
}

tree::TerminalNode* TParser::ClassModesContext::Identifier() {
  return getToken(TParser::Identifier, 0);
}

tree::TerminalNode* TParser::ClassModesContext::Extends() {
  return getToken(TParser::Extends, 0);
}

TParser::IdentifierBContext* TParser::ClassModesContext::identifierB() {
  return getRuleContext<TParser::IdentifierBContext>(0);
}

tree::TerminalNode* TParser::ClassModesContext::Implements() {
  return getToken(TParser::Implements, 0);
}

TParser::IdentifierCContext* TParser::ClassModesContext::identifierC() {
  return getRuleContext<TParser::IdentifierCContext>(0);
}

tree::TerminalNode* TParser::ClassModesContext::Final() {
  return getToken(TParser::Final, 0);
}


size_t TParser::ClassModesContext::getRuleIndex() const {
  return TParser::RuleClassModes;
}

void TParser::ClassModesContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterClassModes(this);
}

void TParser::ClassModesContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitClassModes(this);
}


antlrcpp::Any TParser::ClassModesContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitClassModes(this);
  else
    return visitor->visitChildren(this);
}

TParser::ClassModesContext* TParser::classModes() {
  ClassModesContext *_localctx = _tracker.createInstance<ClassModesContext>(_ctx, getState());
  enterRule(_localctx, 180, TParser::RuleClassModes);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(1067);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 54, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(1029);
      match(TParser::Class);
      setState(1030);
      match(TParser::Identifier);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(1031);
      match(TParser::Class);
      setState(1032);
      match(TParser::Identifier);
      setState(1033);
      match(TParser::Extends);
      setState(1034);
      identifierB();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(1035);
      match(TParser::Class);
      setState(1036);
      match(TParser::Identifier);
      setState(1037);
      match(TParser::Implements);
      setState(1038);
      identifierB();
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(1039);
      match(TParser::Class);
      setState(1040);
      match(TParser::Identifier);
      setState(1041);
      match(TParser::Extends);
      setState(1042);
      identifierB();
      setState(1043);
      match(TParser::Implements);
      setState(1044);
      identifierC();
      break;
    }

    case 5: {
      enterOuterAlt(_localctx, 5);
      setState(1046);
      match(TParser::Final);
      setState(1047);
      match(TParser::Class);
      setState(1048);
      match(TParser::Identifier);
      break;
    }

    case 6: {
      enterOuterAlt(_localctx, 6);
      setState(1049);
      match(TParser::Final);
      setState(1050);
      match(TParser::Class);
      setState(1051);
      match(TParser::Identifier);
      setState(1052);
      match(TParser::Extends);
      setState(1053);
      identifierB();
      break;
    }

    case 7: {
      enterOuterAlt(_localctx, 7);
      setState(1054);
      match(TParser::Final);
      setState(1055);
      match(TParser::Class);
      setState(1056);
      match(TParser::Identifier);
      setState(1057);
      match(TParser::Implements);
      setState(1058);
      identifierB();
      break;
    }

    case 8: {
      enterOuterAlt(_localctx, 8);
      setState(1059);
      match(TParser::Final);
      setState(1060);
      match(TParser::Class);
      setState(1061);
      match(TParser::Identifier);
      setState(1062);
      match(TParser::Extends);
      setState(1063);
      identifierB();
      setState(1064);
      match(TParser::Implements);
      setState(1065);
      identifierC();
      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- IdentifierCContext ------------------------------------------------------------------

TParser::IdentifierCContext::IdentifierCContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::IdentifierCContext::Identifier() {
  return getToken(TParser::Identifier, 0);
}


size_t TParser::IdentifierCContext::getRuleIndex() const {
  return TParser::RuleIdentifierC;
}

void TParser::IdentifierCContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterIdentifierC(this);
}

void TParser::IdentifierCContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitIdentifierC(this);
}


antlrcpp::Any TParser::IdentifierCContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitIdentifierC(this);
  else
    return visitor->visitChildren(this);
}

TParser::IdentifierCContext* TParser::identifierC() {
  IdentifierCContext *_localctx = _tracker.createInstance<IdentifierCContext>(_ctx, getState());
  enterRule(_localctx, 182, TParser::RuleIdentifierC);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(1069);
    match(TParser::Identifier);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ArrayAccessElementsContext ------------------------------------------------------------------

TParser::ArrayAccessElementsContext::ArrayAccessElementsContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::ArrayAccessElementsItemsContext* TParser::ArrayAccessElementsContext::arrayAccessElementsItems() {
  return getRuleContext<TParser::ArrayAccessElementsItemsContext>(0);
}

TParser::ArrayAccessElementsContext* TParser::ArrayAccessElementsContext::arrayAccessElements() {
  return getRuleContext<TParser::ArrayAccessElementsContext>(0);
}


size_t TParser::ArrayAccessElementsContext::getRuleIndex() const {
  return TParser::RuleArrayAccessElements;
}

void TParser::ArrayAccessElementsContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterArrayAccessElements(this);
}

void TParser::ArrayAccessElementsContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitArrayAccessElements(this);
}


antlrcpp::Any TParser::ArrayAccessElementsContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitArrayAccessElements(this);
  else
    return visitor->visitChildren(this);
}

TParser::ArrayAccessElementsContext* TParser::arrayAccessElements() {
  ArrayAccessElementsContext *_localctx = _tracker.createInstance<ArrayAccessElementsContext>(_ctx, getState());
  enterRule(_localctx, 184, TParser::RuleArrayAccessElements);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(1075);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 55, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(1071);
      arrayAccessElementsItems();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(1072);
      arrayAccessElementsItems();
      setState(1073);
      arrayAccessElements();
      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ArrayAccessElementsItemsContext ------------------------------------------------------------------

TParser::ArrayAccessElementsItemsContext::ArrayAccessElementsItemsContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::ArrayAccessElementsItemsContext::Identifier() {
  return getToken(TParser::Identifier, 0);
}

tree::TerminalNode* TParser::ArrayAccessElementsItemsContext::Point() {
  return getToken(TParser::Point, 0);
}

TParser::AccessBlockArContext* TParser::ArrayAccessElementsItemsContext::accessBlockAr() {
  return getRuleContext<TParser::AccessBlockArContext>(0);
}

TParser::FirstIncDecContext* TParser::ArrayAccessElementsItemsContext::firstIncDec() {
  return getRuleContext<TParser::FirstIncDecContext>(0);
}

TParser::LastIncDecContext* TParser::ArrayAccessElementsItemsContext::lastIncDec() {
  return getRuleContext<TParser::LastIncDecContext>(0);
}


size_t TParser::ArrayAccessElementsItemsContext::getRuleIndex() const {
  return TParser::RuleArrayAccessElementsItems;
}

void TParser::ArrayAccessElementsItemsContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterArrayAccessElementsItems(this);
}

void TParser::ArrayAccessElementsItemsContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitArrayAccessElementsItems(this);
}


antlrcpp::Any TParser::ArrayAccessElementsItemsContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitArrayAccessElementsItems(this);
  else
    return visitor->visitChildren(this);
}

TParser::ArrayAccessElementsItemsContext* TParser::arrayAccessElementsItems() {
  ArrayAccessElementsItemsContext *_localctx = _tracker.createInstance<ArrayAccessElementsItemsContext>(_ctx, getState());
  enterRule(_localctx, 186, TParser::RuleArrayAccessElementsItems);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(1111);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 56, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(1077);
      match(TParser::Identifier);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(1078);
      match(TParser::Identifier);
      setState(1079);
      match(TParser::Point);
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(1080);
      match(TParser::Identifier);
      setState(1081);
      accessBlockAr();
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(1082);
      match(TParser::Identifier);
      setState(1083);
      accessBlockAr();
      setState(1084);
      match(TParser::Point);
      break;
    }

    case 5: {
      enterOuterAlt(_localctx, 5);
      setState(1086);
      firstIncDec();
      setState(1087);
      match(TParser::Identifier);
      break;
    }

    case 6: {
      enterOuterAlt(_localctx, 6);
      setState(1089);
      match(TParser::Identifier);
      setState(1090);
      match(TParser::Point);
      break;
    }

    case 7: {
      enterOuterAlt(_localctx, 7);
      setState(1091);
      firstIncDec();
      setState(1092);
      match(TParser::Identifier);
      setState(1093);
      accessBlockAr();
      break;
    }

    case 8: {
      enterOuterAlt(_localctx, 8);
      setState(1095);
      match(TParser::Identifier);
      setState(1096);
      accessBlockAr();
      setState(1097);
      match(TParser::Point);
      break;
    }

    case 9: {
      enterOuterAlt(_localctx, 9);
      setState(1099);
      match(TParser::Identifier);
      setState(1100);
      lastIncDec();
      break;
    }

    case 10: {
      enterOuterAlt(_localctx, 10);
      setState(1101);
      match(TParser::Identifier);
      setState(1102);
      match(TParser::Point);
      break;
    }

    case 11: {
      enterOuterAlt(_localctx, 11);
      setState(1103);
      match(TParser::Identifier);
      setState(1104);
      accessBlockAr();
      setState(1105);
      lastIncDec();
      break;
    }

    case 12: {
      enterOuterAlt(_localctx, 12);
      setState(1107);
      match(TParser::Identifier);
      setState(1108);
      accessBlockAr();
      setState(1109);
      match(TParser::Point);
      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- AccessBlockArContext ------------------------------------------------------------------

TParser::AccessBlockArContext::AccessBlockArContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::AccessBlockArContext::OpenArIndex() {
  return getToken(TParser::OpenArIndex, 0);
}

TParser::ArrayIndexAccessContext* TParser::AccessBlockArContext::arrayIndexAccess() {
  return getRuleContext<TParser::ArrayIndexAccessContext>(0);
}

tree::TerminalNode* TParser::AccessBlockArContext::CloseArIndex() {
  return getToken(TParser::CloseArIndex, 0);
}

TParser::AccessBlockArContext* TParser::AccessBlockArContext::accessBlockAr() {
  return getRuleContext<TParser::AccessBlockArContext>(0);
}


size_t TParser::AccessBlockArContext::getRuleIndex() const {
  return TParser::RuleAccessBlockAr;
}

void TParser::AccessBlockArContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterAccessBlockAr(this);
}

void TParser::AccessBlockArContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitAccessBlockAr(this);
}


antlrcpp::Any TParser::AccessBlockArContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitAccessBlockAr(this);
  else
    return visitor->visitChildren(this);
}

TParser::AccessBlockArContext* TParser::accessBlockAr() {
  AccessBlockArContext *_localctx = _tracker.createInstance<AccessBlockArContext>(_ctx, getState());
  enterRule(_localctx, 188, TParser::RuleAccessBlockAr);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(1122);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 57, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(1113);
      match(TParser::OpenArIndex);
      setState(1114);
      arrayIndexAccess();
      setState(1115);
      match(TParser::CloseArIndex);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(1117);
      match(TParser::OpenArIndex);
      setState(1118);
      arrayIndexAccess();
      setState(1119);
      match(TParser::CloseArIndex);
      setState(1120);
      accessBlockAr();
      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ArrayIndexAccessContext ------------------------------------------------------------------

TParser::ArrayIndexAccessContext::ArrayIndexAccessContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::OperationElementsContext* TParser::ArrayIndexAccessContext::operationElements() {
  return getRuleContext<TParser::OperationElementsContext>(0);
}


size_t TParser::ArrayIndexAccessContext::getRuleIndex() const {
  return TParser::RuleArrayIndexAccess;
}

void TParser::ArrayIndexAccessContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterArrayIndexAccess(this);
}

void TParser::ArrayIndexAccessContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitArrayIndexAccess(this);
}


antlrcpp::Any TParser::ArrayIndexAccessContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitArrayIndexAccess(this);
  else
    return visitor->visitChildren(this);
}

TParser::ArrayIndexAccessContext* TParser::arrayIndexAccess() {
  ArrayIndexAccessContext *_localctx = _tracker.createInstance<ArrayIndexAccessContext>(_ctx, getState());
  enterRule(_localctx, 190, TParser::RuleArrayIndexAccess);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(1124);
    operationElements();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- GeneralValueContext ------------------------------------------------------------------

TParser::GeneralValueContext::GeneralValueContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::GeneralValueContext::Identifier() {
  return getToken(TParser::Identifier, 0);
}

tree::TerminalNode* TParser::GeneralValueContext::TypeSpec() {
  return getToken(TParser::TypeSpec, 0);
}

tree::TerminalNode* TParser::GeneralValueContext::Integer() {
  return getToken(TParser::Integer, 0);
}

tree::TerminalNode* TParser::GeneralValueContext::Float() {
  return getToken(TParser::Float, 0);
}

tree::TerminalNode* TParser::GeneralValueContext::String() {
  return getToken(TParser::String, 0);
}

TParser::IndexArrayContext* TParser::GeneralValueContext::indexArray() {
  return getRuleContext<TParser::IndexArrayContext>(0);
}

TParser::AssociativeArrayContext* TParser::GeneralValueContext::associativeArray() {
  return getRuleContext<TParser::AssociativeArrayContext>(0);
}

TParser::OperationElementsContext* TParser::GeneralValueContext::operationElements() {
  return getRuleContext<TParser::OperationElementsContext>(0);
}

TParser::FunctionCallContext* TParser::GeneralValueContext::functionCall() {
  return getRuleContext<TParser::FunctionCallContext>(0);
}

TParser::ObjIdentifierAContext* TParser::GeneralValueContext::objIdentifierA() {
  return getRuleContext<TParser::ObjIdentifierAContext>(0);
}

tree::TerminalNode* TParser::GeneralValueContext::Point() {
  return getToken(TParser::Point, 0);
}

TParser::ObjIdentifierBContext* TParser::GeneralValueContext::objIdentifierB() {
  return getRuleContext<TParser::ObjIdentifierBContext>(0);
}

tree::TerminalNode* TParser::GeneralValueContext::TwoTwoPoint() {
  return getToken(TParser::TwoTwoPoint, 0);
}

TParser::ArrayAccessElementsContext* TParser::GeneralValueContext::arrayAccessElements() {
  return getRuleContext<TParser::ArrayAccessElementsContext>(0);
}


size_t TParser::GeneralValueContext::getRuleIndex() const {
  return TParser::RuleGeneralValue;
}

void TParser::GeneralValueContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterGeneralValue(this);
}

void TParser::GeneralValueContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitGeneralValue(this);
}


antlrcpp::Any TParser::GeneralValueContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitGeneralValue(this);
  else
    return visitor->visitChildren(this);
}

TParser::GeneralValueContext* TParser::generalValue() {
  GeneralValueContext *_localctx = _tracker.createInstance<GeneralValueContext>(_ctx, getState());
  enterRule(_localctx, 192, TParser::RuleGeneralValue);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(1149);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 58, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(1126);
      match(TParser::Identifier);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(1127);
      match(TParser::Identifier);
      setState(1128);
      match(TParser::TypeSpec);
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(1129);
      match(TParser::Integer);
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(1130);
      match(TParser::Integer);
      setState(1131);
      match(TParser::TypeSpec);
      break;
    }

    case 5: {
      enterOuterAlt(_localctx, 5);
      setState(1132);
      match(TParser::Float);
      break;
    }

    case 6: {
      enterOuterAlt(_localctx, 6);
      setState(1133);
      match(TParser::Float);
      setState(1134);
      match(TParser::TypeSpec);
      break;
    }

    case 7: {
      enterOuterAlt(_localctx, 7);
      setState(1135);
      match(TParser::String);
      break;
    }

    case 8: {
      enterOuterAlt(_localctx, 8);
      setState(1136);
      indexArray();
      break;
    }

    case 9: {
      enterOuterAlt(_localctx, 9);
      setState(1137);
      associativeArray();
      break;
    }

    case 10: {
      enterOuterAlt(_localctx, 10);
      setState(1138);
      operationElements();
      break;
    }

    case 11: {
      enterOuterAlt(_localctx, 11);
      setState(1139);
      functionCall();
      break;
    }

    case 12: {
      enterOuterAlt(_localctx, 12);
      setState(1140);
      objIdentifierA();
      setState(1141);
      match(TParser::Point);
      setState(1142);
      objIdentifierB();
      break;
    }

    case 13: {
      enterOuterAlt(_localctx, 13);
      setState(1144);
      objIdentifierA();
      setState(1145);
      match(TParser::TwoTwoPoint);
      setState(1146);
      objIdentifierB();
      break;
    }

    case 14: {
      enterOuterAlt(_localctx, 14);
      setState(1148);
      arrayAccessElements();
      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ObjIdentifierAContext ------------------------------------------------------------------

TParser::ObjIdentifierAContext::ObjIdentifierAContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::ObjIdentifierAContext::Identifier() {
  return getToken(TParser::Identifier, 0);
}


size_t TParser::ObjIdentifierAContext::getRuleIndex() const {
  return TParser::RuleObjIdentifierA;
}

void TParser::ObjIdentifierAContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterObjIdentifierA(this);
}

void TParser::ObjIdentifierAContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitObjIdentifierA(this);
}


antlrcpp::Any TParser::ObjIdentifierAContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitObjIdentifierA(this);
  else
    return visitor->visitChildren(this);
}

TParser::ObjIdentifierAContext* TParser::objIdentifierA() {
  ObjIdentifierAContext *_localctx = _tracker.createInstance<ObjIdentifierAContext>(_ctx, getState());
  enterRule(_localctx, 194, TParser::RuleObjIdentifierA);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(1151);
    match(TParser::Identifier);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ObjIdentifierBContext ------------------------------------------------------------------

TParser::ObjIdentifierBContext::ObjIdentifierBContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::ObjIdentifierBContext::Identifier() {
  return getToken(TParser::Identifier, 0);
}


size_t TParser::ObjIdentifierBContext::getRuleIndex() const {
  return TParser::RuleObjIdentifierB;
}

void TParser::ObjIdentifierBContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterObjIdentifierB(this);
}

void TParser::ObjIdentifierBContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitObjIdentifierB(this);
}


antlrcpp::Any TParser::ObjIdentifierBContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitObjIdentifierB(this);
  else
    return visitor->visitChildren(this);
}

TParser::ObjIdentifierBContext* TParser::objIdentifierB() {
  ObjIdentifierBContext *_localctx = _tracker.createInstance<ObjIdentifierBContext>(_ctx, getState());
  enterRule(_localctx, 196, TParser::RuleObjIdentifierB);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(1153);
    match(TParser::Identifier);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

// Static vars and initialization.
std::vector<dfa::DFA> TParser::_decisionToDFA;
atn::PredictionContextCache TParser::_sharedContextCache;

// We own the ATN which in turn owns the ATN states.
atn::ATN TParser::_atn;
std::vector<uint16_t> TParser::_serializedATN;

std::vector<std::string> TParser::_ruleNames = {
  "main", "fileContent", "sentence", "liveToken", "use", "useValue", "useString", 
  "variable", "variableModes", "variableMembers", "variableDefinition", 
  "variableDefinitionGeneral", "indexArray", "indexArrayElements", "associativeArray", 
  "associativeArrayElements", "operationBlock", "operationElements", "operationValue", 
  "firstIncDec", "lastIncDec", "callingFunction", "functionCall", "methodCascadingModes", 
  "functionCallCascading", "functionCallCascadingItem", "identifierB", "pointSeparator", 
  "functionCallParam", "functionCallParamElements", "conditionalExpression", 
  "conditionalExpressionStructBlock", "ifElementUnique", "elifElements", 
  "elifElementUnique", "elseElementUnique", "conditionalExpressionItems", 
  "conditionalBlockElements", "conditionalBlockElsItems", "conditionalExpressionElements", 
  "conditionExpValue", "conditionExpBlock", "conditionExpBlockItemValue", 
  "conditionExpBlockItem", "conditionalExpValue", "functionCallAndAttr", 
  "identifierAttrFn", "functionCallAttrFn", "functionCallAttrFnItem", "loop", 
  "loopExpressionItems", "loopExpression", "loopInfinite", "loopComplete", 
  "loopConditional", "endOne", "endTwo", "loopOneMembers", "loopTwoMembers", 
  "loopThreeMembers", "loopThreeMembersValues", "loopBlockElements", "loopBlockElementsLimited", 
  "ret", "retValues", "functions", "functionsModes", "functionGeneralModes", 
  "identifierRet", "functionMethodsModes", "functionMethodsModesBkp", "methodPerm", 
  "visibilityItems", "methodVisibility", "constructClassMethod", "interfaceMethod", 
  "functionCodeBlock", "functionCodeBlockElements", "functionParams", "functionParamsControl", 
  "functionParamElements", "oopGeneral", "interfaceClass", "interfaceClassDefinition", 
  "interfaceCodeBlock", "abstractClass", "abstractClassDefinition", "abstractCodeBlock", 
  "classDefination", "classCodeBlock", "classModes", "identifierC", "arrayAccessElements", 
  "arrayAccessElementsItems", "accessBlockAr", "arrayIndexAccess", "generalValue", 
  "objIdentifierA", "objIdentifierB"
};

std::vector<std::string> TParser::_literalNames = {
  "", "'use'", "'var'", "'if'", "'elif'", "'else'", "'for'", "'ret'", "'fn'", 
  "'pub'", "'pro'", "'priv'", "'static'", "'final'", "'interface'", "'abstract'", 
  "'extends'", "'class'", "'implements'", "'new'", "'->'", "';'", "'='", 
  "'.'", "':'", "'::'", "','", "'['", "']'", "'{'", "'}'", "'('", "')'", 
  "", "", "'!'"
};

std::vector<std::string> TParser::_symbolicNames = {
  "", "Use", "Var", "If", "Elif", "Else", "For", "Ret", "Function", "Pub", 
  "Pro", "Priv", "Static", "Final", "Interface", "Abstract", "Extends", 
  "Class", "Implements", "New", "ArrowRight", "End", "Attr", "Point", "TwoPoint", 
  "TwoTwoPoint", "Separator", "OpenArIndex", "CloseArIndex", "OpenBlock", 
  "CloseBlock", "OpenOp", "CloseOp", "ArithmeticOperator", "AssignmentOperator", 
  "Not", "IncDecOperators", "Identifier", "IDPrefix", "TypeSpec", "String", 
  "Integer", "Float", "Whitespace", "Newline", "Words", "BlockComment", 
  "LineComment"
};

dfa::Vocabulary TParser::_vocabulary(_literalNames, _symbolicNames);

std::vector<std::string> TParser::_tokenNames;

TParser::Initializer::Initializer() {
	for (size_t i = 0; i < _symbolicNames.size(); ++i) {
		std::string name = _vocabulary.getLiteralName(i);
		if (name.empty()) {
			name = _vocabulary.getSymbolicName(i);
		}

		if (name.empty()) {
			_tokenNames.push_back("<INVALID>");
		} else {
      _tokenNames.push_back(name);
    }
	}

  static const uint16_t serializedATNSegment0[] = {
    0x3, 0x608b, 0xa72a, 0x8133, 0xb9ed, 0x417c, 0x3be7, 0x7786, 0x5964, 
       0x3, 0x31, 0x486, 0x4, 0x2, 0x9, 0x2, 0x4, 0x3, 0x9, 0x3, 0x4, 0x4, 
       0x9, 0x4, 0x4, 0x5, 0x9, 0x5, 0x4, 0x6, 0x9, 0x6, 0x4, 0x7, 0x9, 
       0x7, 0x4, 0x8, 0x9, 0x8, 0x4, 0x9, 0x9, 0x9, 0x4, 0xa, 0x9, 0xa, 
       0x4, 0xb, 0x9, 0xb, 0x4, 0xc, 0x9, 0xc, 0x4, 0xd, 0x9, 0xd, 0x4, 
       0xe, 0x9, 0xe, 0x4, 0xf, 0x9, 0xf, 0x4, 0x10, 0x9, 0x10, 0x4, 0x11, 
       0x9, 0x11, 0x4, 0x12, 0x9, 0x12, 0x4, 0x13, 0x9, 0x13, 0x4, 0x14, 
       0x9, 0x14, 0x4, 0x15, 0x9, 0x15, 0x4, 0x16, 0x9, 0x16, 0x4, 0x17, 
       0x9, 0x17, 0x4, 0x18, 0x9, 0x18, 0x4, 0x19, 0x9, 0x19, 0x4, 0x1a, 
       0x9, 0x1a, 0x4, 0x1b, 0x9, 0x1b, 0x4, 0x1c, 0x9, 0x1c, 0x4, 0x1d, 
       0x9, 0x1d, 0x4, 0x1e, 0x9, 0x1e, 0x4, 0x1f, 0x9, 0x1f, 0x4, 0x20, 
       0x9, 0x20, 0x4, 0x21, 0x9, 0x21, 0x4, 0x22, 0x9, 0x22, 0x4, 0x23, 
       0x9, 0x23, 0x4, 0x24, 0x9, 0x24, 0x4, 0x25, 0x9, 0x25, 0x4, 0x26, 
       0x9, 0x26, 0x4, 0x27, 0x9, 0x27, 0x4, 0x28, 0x9, 0x28, 0x4, 0x29, 
       0x9, 0x29, 0x4, 0x2a, 0x9, 0x2a, 0x4, 0x2b, 0x9, 0x2b, 0x4, 0x2c, 
       0x9, 0x2c, 0x4, 0x2d, 0x9, 0x2d, 0x4, 0x2e, 0x9, 0x2e, 0x4, 0x2f, 
       0x9, 0x2f, 0x4, 0x30, 0x9, 0x30, 0x4, 0x31, 0x9, 0x31, 0x4, 0x32, 
       0x9, 0x32, 0x4, 0x33, 0x9, 0x33, 0x4, 0x34, 0x9, 0x34, 0x4, 0x35, 
       0x9, 0x35, 0x4, 0x36, 0x9, 0x36, 0x4, 0x37, 0x9, 0x37, 0x4, 0x38, 
       0x9, 0x38, 0x4, 0x39, 0x9, 0x39, 0x4, 0x3a, 0x9, 0x3a, 0x4, 0x3b, 
       0x9, 0x3b, 0x4, 0x3c, 0x9, 0x3c, 0x4, 0x3d, 0x9, 0x3d, 0x4, 0x3e, 
       0x9, 0x3e, 0x4, 0x3f, 0x9, 0x3f, 0x4, 0x40, 0x9, 0x40, 0x4, 0x41, 
       0x9, 0x41, 0x4, 0x42, 0x9, 0x42, 0x4, 0x43, 0x9, 0x43, 0x4, 0x44, 
       0x9, 0x44, 0x4, 0x45, 0x9, 0x45, 0x4, 0x46, 0x9, 0x46, 0x4, 0x47, 
       0x9, 0x47, 0x4, 0x48, 0x9, 0x48, 0x4, 0x49, 0x9, 0x49, 0x4, 0x4a, 
       0x9, 0x4a, 0x4, 0x4b, 0x9, 0x4b, 0x4, 0x4c, 0x9, 0x4c, 0x4, 0x4d, 
       0x9, 0x4d, 0x4, 0x4e, 0x9, 0x4e, 0x4, 0x4f, 0x9, 0x4f, 0x4, 0x50, 
       0x9, 0x50, 0x4, 0x51, 0x9, 0x51, 0x4, 0x52, 0x9, 0x52, 0x4, 0x53, 
       0x9, 0x53, 0x4, 0x54, 0x9, 0x54, 0x4, 0x55, 0x9, 0x55, 0x4, 0x56, 
       0x9, 0x56, 0x4, 0x57, 0x9, 0x57, 0x4, 0x58, 0x9, 0x58, 0x4, 0x59, 
       0x9, 0x59, 0x4, 0x5a, 0x9, 0x5a, 0x4, 0x5b, 0x9, 0x5b, 0x4, 0x5c, 
       0x9, 0x5c, 0x4, 0x5d, 0x9, 0x5d, 0x4, 0x5e, 0x9, 0x5e, 0x4, 0x5f, 
       0x9, 0x5f, 0x4, 0x60, 0x9, 0x60, 0x4, 0x61, 0x9, 0x61, 0x4, 0x62, 
       0x9, 0x62, 0x4, 0x63, 0x9, 0x63, 0x4, 0x64, 0x9, 0x64, 0x3, 0x2, 
       0x3, 0x2, 0x3, 0x2, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 
       0x3, 0x5, 0x3, 0xd1, 0xa, 0x3, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x3, 
       0x4, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x5, 0x4, 
       0xdc, 0xa, 0x4, 0x3, 0x5, 0x3, 0x5, 0x3, 0x6, 0x3, 0x6, 0x3, 0x6, 
       0x3, 0x6, 0x3, 0x7, 0x3, 0x7, 0x3, 0x7, 0x3, 0x7, 0x3, 0x7, 0x5, 
       0x7, 0xe9, 0xa, 0x7, 0x3, 0x8, 0x3, 0x8, 0x3, 0x9, 0x3, 0x9, 0x3, 
       0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 
       0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 
       0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 
       0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 
       0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 
       0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 
       0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 
       0x3, 0xa, 0x5, 0xa, 0x11e, 0xa, 0xa, 0x3, 0xb, 0x3, 0xb, 0x3, 0xb, 
       0x3, 0xb, 0x3, 0xb, 0x5, 0xb, 0x125, 0xa, 0xb, 0x3, 0xc, 0x3, 0xc, 
       0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 
       0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 
       0x5, 0xc, 0x136, 0xa, 0xc, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 
       0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 
       0xd, 0x3, 0xd, 0x5, 0xd, 0x144, 0xa, 0xd, 0x3, 0xe, 0x3, 0xe, 0x3, 
       0xe, 0x3, 0xe, 0x3, 0xe, 0x3, 0xe, 0x5, 0xe, 0x14c, 0xa, 0xe, 0x3, 
       0xf, 0x3, 0xf, 0x3, 0xf, 0x3, 0xf, 0x3, 0xf, 0x5, 0xf, 0x153, 0xa, 
       0xf, 0x3, 0x10, 0x3, 0x10, 0x3, 0x10, 0x3, 0x10, 0x3, 0x10, 0x3, 
       0x10, 0x5, 0x10, 0x15b, 0xa, 0x10, 0x3, 0x11, 0x3, 0x11, 0x3, 0x11, 
       0x3, 0x11, 0x3, 0x11, 0x3, 0x11, 0x3, 0x11, 0x3, 0x11, 0x3, 0x11, 
       0x5, 0x11, 0x166, 0xa, 0x11, 0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 
       0x12, 0x3, 0x13, 0x3, 0x13, 0x3, 0x13, 0x3, 0x13, 0x5, 0x13, 0x170, 
       0xa, 0x13, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 
       0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 
       0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 
       0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 
       0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 
       0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 
       0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 
       0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 
       0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 
       0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 
       0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 
       0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 
       0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 
       0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 
       0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x5, 0x14, 
       0x1ca, 0xa, 0x14, 0x3, 0x15, 0x3, 0x15, 0x3, 0x16, 0x3, 0x16, 0x3, 
       0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 0x18, 0x3, 0x18, 0x3, 0x18, 0x3, 
       0x18, 0x3, 0x18, 0x3, 0x18, 0x3, 0x18, 0x3, 0x18, 0x3, 0x18, 0x3, 
       0x18, 0x3, 0x18, 0x3, 0x18, 0x3, 0x18, 0x5, 0x18, 0x1e0, 0xa, 0x18, 
       0x3, 0x19, 0x3, 0x19, 0x3, 0x19, 0x3, 0x19, 0x3, 0x1a, 0x3, 0x1a, 
       0x3, 0x1a, 0x3, 0x1a, 0x3, 0x1a, 0x5, 0x1a, 0x1eb, 0xa, 0x1a, 0x3, 
       0x1b, 0x3, 0x1b, 0x3, 0x1b, 0x3, 0x1c, 0x3, 0x1c, 0x3, 0x1d, 0x3, 
       0x1d, 0x3, 0x1e, 0x3, 0x1e, 0x3, 0x1e, 0x3, 0x1e, 0x3, 0x1e, 0x3, 
       0x1e, 0x5, 0x1e, 0x1fa, 0xa, 0x1e, 0x3, 0x1f, 0x3, 0x1f, 0x3, 0x1f, 
       0x3, 0x1f, 0x3, 0x1f, 0x3, 0x1f, 0x3, 0x1f, 0x3, 0x1f, 0x3, 0x1f, 
       0x3, 0x1f, 0x5, 0x1f, 0x206, 0xa, 0x1f, 0x3, 0x20, 0x3, 0x20, 0x3, 
       0x20, 0x3, 0x20, 0x5, 0x20, 0x20c, 0xa, 0x20, 0x3, 0x21, 0x3, 0x21, 
       0x3, 0x21, 0x3, 0x21, 0x3, 0x21, 0x3, 0x21, 0x3, 0x21, 0x3, 0x21, 
       0x3, 0x21, 0x3, 0x21, 0x3, 0x21, 0x5, 0x21, 0x219, 0xa, 0x21, 0x3, 
       0x22, 0x3, 0x22, 0x3, 0x22, 0x3, 0x22, 0x3, 0x23, 0x3, 0x23, 0x3, 
       0x23, 0x3, 0x23, 0x5, 0x23, 0x223, 0xa, 0x23, 0x3, 0x24, 0x3, 0x24, 
       0x3, 0x24, 0x3, 0x24, 0x3, 0x25, 0x3, 0x25, 0x3, 0x25, 0x3, 0x26, 
       0x3, 0x26, 0x3, 0x27, 0x3, 0x27, 0x3, 0x27, 0x3, 0x27, 0x3, 0x27, 
       0x3, 0x27, 0x3, 0x27, 0x3, 0x27, 0x3, 0x27, 0x3, 0x27, 0x5, 0x27, 
       0x238, 0xa, 0x27, 0x3, 0x28, 0x3, 0x28, 0x3, 0x28, 0x3, 0x28, 0x5, 
       0x28, 0x23e, 0xa, 0x28, 0x3, 0x29, 0x3, 0x29, 0x3, 0x29, 0x3, 0x29, 
       0x3, 0x29, 0x3, 0x29, 0x3, 0x29, 0x3, 0x29, 0x5, 0x29, 0x248, 0xa, 
       0x29, 0x3, 0x2a, 0x3, 0x2a, 0x3, 0x2a, 0x5, 0x2a, 0x24d, 0xa, 0x2a, 
       0x3, 0x2b, 0x3, 0x2b, 0x3, 0x2b, 0x5, 0x2b, 0x252, 0xa, 0x2b, 0x3, 
       0x2c, 0x3, 0x2c, 0x3, 0x2c, 0x3, 0x2c, 0x3, 0x2c, 0x3, 0x2c, 0x3, 
       0x2c, 0x3, 0x2c, 0x5, 0x2c, 0x25c, 0xa, 0x2c, 0x3, 0x2d, 0x3, 0x2d, 
       0x3, 0x2d, 0x3, 0x2d, 0x3, 0x2e, 0x3, 0x2e, 0x3, 0x2e, 0x3, 0x2e, 
       0x3, 0x2e, 0x3, 0x2e, 0x3, 0x2e, 0x3, 0x2e, 0x3, 0x2e, 0x3, 0x2e, 
       0x3, 0x2e, 0x3, 0x2e, 0x3, 0x2e, 0x3, 0x2e, 0x3, 0x2e, 0x3, 0x2e, 
       0x3, 0x2e, 0x3, 0x2e, 0x3, 0x2e, 0x3, 0x2e, 0x3, 0x2e, 0x3, 0x2e, 
       0x3, 0x2e, 0x3, 0x2e, 0x3, 0x2e, 0x3, 0x2e, 0x3, 0x2e, 0x3, 0x2e, 
       0x3, 0x2e, 0x3, 0x2e, 0x3, 0x2e, 0x3, 0x2e, 0x3, 0x2e, 0x3, 0x2e, 
       0x3, 0x2e, 0x3, 0x2e, 0x3, 0x2e, 0x3, 0x2e, 0x3, 0x2e, 0x3, 0x2e, 
       0x3, 0x2e, 0x3, 0x2e, 0x3, 0x2e, 0x3, 0x2e, 0x3, 0x2e, 0x3, 0x2e, 
       0x3, 0x2e, 0x3, 0x2e, 0x3, 0x2e, 0x3, 0x2e, 0x3, 0x2e, 0x3, 0x2e, 
       0x3, 0x2e, 0x3, 0x2e, 0x3, 0x2e, 0x3, 0x2e, 0x3, 0x2e, 0x3, 0x2e, 
       0x3, 0x2e, 0x3, 0x2e, 0x3, 0x2e, 0x3, 0x2e, 0x3, 0x2e, 0x3, 0x2e, 
       0x3, 0x2e, 0x3, 0x2e, 0x3, 0x2e, 0x3, 0x2e, 0x3, 0x2e, 0x3, 0x2e, 
       0x3, 0x2e, 0x3, 0x2e, 0x3, 0x2e, 0x3, 0x2e, 0x3, 0x2e, 0x3, 0x2e, 
       0x3, 0x2e, 0x3, 0x2e, 0x3, 0x2e, 0x3, 0x2e, 0x3, 0x2e, 0x3, 0x2e, 
       0x3, 0x2e, 0x3, 0x2e, 0x3, 0x2e, 0x3, 0x2e, 0x3, 0x2e, 0x3, 0x2e, 
       0x3, 0x2e, 0x5, 0x2e, 0x2bb, 0xa, 0x2e, 0x3, 0x2f, 0x3, 0x2f, 0x3, 
       0x2f, 0x3, 0x2f, 0x3, 0x30, 0x3, 0x30, 0x5, 0x30, 0x2c3, 0xa, 0x30, 
       0x3, 0x31, 0x3, 0x31, 0x3, 0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 0x32, 
       0x3, 0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 0x32, 
       0x3, 0x32, 0x5, 0x32, 0x2d2, 0xa, 0x32, 0x3, 0x33, 0x3, 0x33, 0x3, 
       0x33, 0x3, 0x33, 0x5, 0x33, 0x2d8, 0xa, 0x33, 0x3, 0x34, 0x3, 0x34, 
       0x3, 0x34, 0x3, 0x34, 0x3, 0x35, 0x3, 0x35, 0x3, 0x35, 0x5, 0x35, 
       0x2e1, 0xa, 0x35, 0x3, 0x36, 0x3, 0x36, 0x3, 0x36, 0x5, 0x36, 0x2e6, 
       0xa, 0x36, 0x3, 0x37, 0x3, 0x37, 0x3, 0x37, 0x3, 0x37, 0x3, 0x37, 
       0x3, 0x37, 0x3, 0x37, 0x3, 0x37, 0x3, 0x37, 0x3, 0x37, 0x3, 0x37, 
       0x3, 0x37, 0x3, 0x37, 0x3, 0x37, 0x5, 0x37, 0x2f6, 0xa, 0x37, 0x3, 
       0x38, 0x3, 0x38, 0x3, 0x39, 0x3, 0x39, 0x3, 0x3a, 0x3, 0x3a, 0x3, 
       0x3b, 0x3, 0x3b, 0x3, 0x3b, 0x3, 0x3b, 0x5, 0x3b, 0x302, 0xa, 0x3b, 
       0x3, 0x3c, 0x3, 0x3c, 0x5, 0x3c, 0x306, 0xa, 0x3c, 0x3, 0x3d, 0x3, 
       0x3d, 0x5, 0x3d, 0x30a, 0xa, 0x3d, 0x3, 0x3e, 0x3, 0x3e, 0x3, 0x3e, 
       0x3, 0x3e, 0x3, 0x3e, 0x5, 0x3e, 0x311, 0xa, 0x3e, 0x3, 0x3f, 0x3, 
       0x3f, 0x3, 0x3f, 0x3, 0x3f, 0x5, 0x3f, 0x317, 0xa, 0x3f, 0x3, 0x40, 
       0x3, 0x40, 0x3, 0x40, 0x3, 0x40, 0x3, 0x40, 0x3, 0x40, 0x3, 0x40, 
       0x3, 0x40, 0x3, 0x40, 0x3, 0x40, 0x5, 0x40, 0x323, 0xa, 0x40, 0x3, 
       0x41, 0x3, 0x41, 0x3, 0x41, 0x3, 0x41, 0x3, 0x42, 0x3, 0x42, 0x5, 
       0x42, 0x32b, 0xa, 0x42, 0x3, 0x43, 0x3, 0x43, 0x3, 0x43, 0x3, 0x43, 
       0x3, 0x43, 0x3, 0x43, 0x3, 0x43, 0x3, 0x43, 0x3, 0x43, 0x3, 0x43, 
       0x3, 0x43, 0x3, 0x43, 0x3, 0x43, 0x3, 0x43, 0x3, 0x43, 0x3, 0x43, 
       0x3, 0x43, 0x3, 0x43, 0x3, 0x43, 0x3, 0x43, 0x3, 0x43, 0x3, 0x43, 
       0x3, 0x43, 0x3, 0x43, 0x3, 0x43, 0x3, 0x43, 0x3, 0x43, 0x3, 0x43, 
       0x3, 0x43, 0x3, 0x43, 0x5, 0x43, 0x34b, 0xa, 0x43, 0x3, 0x44, 0x3, 
       0x44, 0x3, 0x45, 0x3, 0x45, 0x3, 0x45, 0x3, 0x45, 0x3, 0x45, 0x3, 
       0x45, 0x3, 0x45, 0x3, 0x45, 0x3, 0x45, 0x3, 0x45, 0x3, 0x45, 0x5, 
       0x45, 0x35a, 0xa, 0x45, 0x3, 0x45, 0x3, 0x45, 0x3, 0x45, 0x3, 0x45, 
       0x3, 0x45, 0x3, 0x45, 0x3, 0x45, 0x3, 0x45, 0x3, 0x45, 0x3, 0x45, 
       0x3, 0x45, 0x3, 0x45, 0x3, 0x45, 0x3, 0x45, 0x5, 0x45, 0x36a, 0xa, 
       0x45, 0x5, 0x45, 0x36c, 0xa, 0x45, 0x3, 0x46, 0x3, 0x46, 0x3, 0x47, 
       0x3, 0x47, 0x3, 0x47, 0x3, 0x48, 0x3, 0x48, 0x3, 0x48, 0x3, 0x48, 
       0x3, 0x48, 0x3, 0x48, 0x3, 0x48, 0x3, 0x48, 0x3, 0x48, 0x3, 0x48, 
       0x3, 0x48, 0x3, 0x48, 0x3, 0x48, 0x3, 0x48, 0x3, 0x48, 0x3, 0x48, 
       0x3, 0x48, 0x3, 0x48, 0x3, 0x48, 0x3, 0x48, 0x3, 0x48, 0x3, 0x48, 
       0x3, 0x48, 0x5, 0x48, 0x38a, 0xa, 0x48, 0x3, 0x49, 0x3, 0x49, 0x3, 
       0x4a, 0x3, 0x4a, 0x3, 0x4b, 0x3, 0x4b, 0x3, 0x4b, 0x3, 0x4b, 0x5, 
       0x4b, 0x394, 0xa, 0x4b, 0x3, 0x4c, 0x3, 0x4c, 0x3, 0x4c, 0x3, 0x4c, 
       0x3, 0x4c, 0x3, 0x4c, 0x3, 0x4c, 0x3, 0x4c, 0x5, 0x4c, 0x39e, 0xa, 
       0x4c, 0x3, 0x4d, 0x3, 0x4d, 0x5, 0x4d, 0x3a2, 0xa, 0x4d, 0x3, 0x4e, 
       0x3, 0x4e, 0x3, 0x4f, 0x3, 0x4f, 0x3, 0x4f, 0x3, 0x4f, 0x5, 0x4f, 
       0x3aa, 0xa, 0x4f, 0x3, 0x50, 0x3, 0x50, 0x3, 0x51, 0x3, 0x51, 0x3, 
       0x51, 0x3, 0x51, 0x3, 0x51, 0x5, 0x51, 0x3b3, 0xa, 0x51, 0x3, 0x52, 
       0x3, 0x52, 0x3, 0x52, 0x3, 0x53, 0x3, 0x53, 0x3, 0x53, 0x5, 0x53, 
       0x3bb, 0xa, 0x53, 0x3, 0x54, 0x3, 0x54, 0x3, 0x55, 0x3, 0x55, 0x3, 
       0x55, 0x3, 0x55, 0x3, 0x55, 0x3, 0x55, 0x3, 0x55, 0x3, 0x55, 0x3, 
       0x55, 0x3, 0x55, 0x3, 0x55, 0x3, 0x55, 0x3, 0x55, 0x3, 0x55, 0x3, 
       0x55, 0x3, 0x55, 0x3, 0x55, 0x3, 0x55, 0x3, 0x55, 0x3, 0x55, 0x3, 
       0x55, 0x3, 0x55, 0x3, 0x55, 0x3, 0x55, 0x3, 0x55, 0x5, 0x55, 0x3d8, 
       0xa, 0x55, 0x3, 0x56, 0x3, 0x56, 0x3, 0x57, 0x3, 0x57, 0x3, 0x58, 
       0x3, 0x58, 0x3, 0x58, 0x3, 0x58, 0x3, 0x58, 0x3, 0x58, 0x3, 0x58, 
       0x3, 0x58, 0x3, 0x58, 0x3, 0x58, 0x3, 0x58, 0x3, 0x58, 0x3, 0x58, 
       0x3, 0x58, 0x3, 0x58, 0x3, 0x58, 0x3, 0x58, 0x3, 0x58, 0x3, 0x58, 
       0x3, 0x58, 0x3, 0x58, 0x3, 0x58, 0x3, 0x58, 0x3, 0x58, 0x3, 0x58, 
       0x5, 0x58, 0x3f7, 0xa, 0x58, 0x3, 0x59, 0x3, 0x59, 0x3, 0x5a, 0x3, 
       0x5a, 0x3, 0x5a, 0x3, 0x5a, 0x3, 0x5a, 0x3, 0x5a, 0x3, 0x5a, 0x3, 
       0x5a, 0x3, 0x5a, 0x5, 0x5a, 0x404, 0xa, 0x5a, 0x3, 0x5b, 0x3, 0x5b, 
       0x3, 0x5c, 0x3, 0x5c, 0x3, 0x5c, 0x3, 0x5c, 0x3, 0x5c, 0x3, 0x5c, 
       0x3, 0x5c, 0x3, 0x5c, 0x3, 0x5c, 0x3, 0x5c, 0x3, 0x5c, 0x3, 0x5c, 
       0x3, 0x5c, 0x3, 0x5c, 0x3, 0x5c, 0x3, 0x5c, 0x3, 0x5c, 0x3, 0x5c, 
       0x3, 0x5c, 0x3, 0x5c, 0x3, 0x5c, 0x3, 0x5c, 0x3, 0x5c, 0x3, 0x5c, 
       0x3, 0x5c, 0x3, 0x5c, 0x3, 0x5c, 0x3, 0x5c, 0x3, 0x5c, 0x3, 0x5c, 
       0x3, 0x5c, 0x3, 0x5c, 0x3, 0x5c, 0x3, 0x5c, 0x3, 0x5c, 0x3, 0x5c, 
       0x3, 0x5c, 0x3, 0x5c, 0x5, 0x5c, 0x42e, 0xa, 0x5c, 0x3, 0x5d, 0x3, 
       0x5d, 0x3, 0x5e, 0x3, 0x5e, 0x3, 0x5e, 0x3, 0x5e, 0x5, 0x5e, 0x436, 
       0xa, 0x5e, 0x3, 0x5f, 0x3, 0x5f, 0x3, 0x5f, 0x3, 0x5f, 0x3, 0x5f, 
       0x3, 0x5f, 0x3, 0x5f, 0x3, 0x5f, 0x3, 0x5f, 0x3, 0x5f, 0x3, 0x5f, 
       0x3, 0x5f, 0x3, 0x5f, 0x3, 0x5f, 0x3, 0x5f, 0x3, 0x5f, 0x3, 0x5f, 
       0x3, 0x5f, 0x3, 0x5f, 0x3, 0x5f, 0x3, 0x5f, 0x3, 0x5f, 0x3, 0x5f, 
       0x3, 0x5f, 0x3, 0x5f, 0x3, 0x5f, 0x3, 0x5f, 0x3, 0x5f, 0x3, 0x5f, 
       0x3, 0x5f, 0x3, 0x5f, 0x3, 0x5f, 0x3, 0x5f, 0x3, 0x5f, 0x5, 0x5f, 
       0x45a, 0xa, 0x5f, 0x3, 0x60, 0x3, 0x60, 0x3, 0x60, 0x3, 0x60, 0x3, 
       0x60, 0x3, 0x60, 0x3, 0x60, 0x3, 0x60, 0x3, 0x60, 0x5, 0x60, 0x465, 
       0xa, 0x60, 0x3, 0x61, 0x3, 0x61, 0x3, 0x62, 0x3, 0x62, 0x3, 0x62, 
       0x3, 0x62, 0x3, 0x62, 0x3, 0x62, 0x3, 0x62, 0x3, 0x62, 0x3, 0x62, 
       0x3, 0x62, 0x3, 0x62, 0x3, 0x62, 0x3, 0x62, 0x3, 0x62, 0x3, 0x62, 
       0x3, 0x62, 0x3, 0x62, 0x3, 0x62, 0x3, 0x62, 0x3, 0x62, 0x3, 0x62, 
       0x3, 0x62, 0x3, 0x62, 0x5, 0x62, 0x480, 0xa, 0x62, 0x3, 0x63, 0x3, 
       0x63, 0x3, 0x64, 0x3, 0x64, 0x3, 0x64, 0x2, 0x2, 0x65, 0x2, 0x4, 
       0x6, 0x8, 0xa, 0xc, 0xe, 0x10, 0x12, 0x14, 0x16, 0x18, 0x1a, 0x1c, 
       0x1e, 0x20, 0x22, 0x24, 0x26, 0x28, 0x2a, 0x2c, 0x2e, 0x30, 0x32, 
       0x34, 0x36, 0x38, 0x3a, 0x3c, 0x3e, 0x40, 0x42, 0x44, 0x46, 0x48, 
       0x4a, 0x4c, 0x4e, 0x50, 0x52, 0x54, 0x56, 0x58, 0x5a, 0x5c, 0x5e, 
       0x60, 0x62, 0x64, 0x66, 0x68, 0x6a, 0x6c, 0x6e, 0x70, 0x72, 0x74, 
       0x76, 0x78, 0x7a, 0x7c, 0x7e, 0x80, 0x82, 0x84, 0x86, 0x88, 0x8a, 
       0x8c, 0x8e, 0x90, 0x92, 0x94, 0x96, 0x98, 0x9a, 0x9c, 0x9e, 0xa0, 
       0xa2, 0xa4, 0xa6, 0xa8, 0xaa, 0xac, 0xae, 0xb0, 0xb2, 0xb4, 0xb6, 
       0xb8, 0xba, 0xbc, 0xbe, 0xc0, 0xc2, 0xc4, 0xc6, 0x2, 0x6, 0x4, 0x2, 
       0x18, 0x18, 0x24, 0x24, 0x3, 0x2, 0x23, 0x24, 0x3, 0x2, 0xb, 0xd, 
       0x3, 0x2, 0xb, 0xf, 0x2, 0x4ef, 0x2, 0xc8, 0x3, 0x2, 0x2, 0x2, 0x4, 
       0xd0, 0x3, 0x2, 0x2, 0x2, 0x6, 0xdb, 0x3, 0x2, 0x2, 0x2, 0x8, 0xdd, 
       0x3, 0x2, 0x2, 0x2, 0xa, 0xdf, 0x3, 0x2, 0x2, 0x2, 0xc, 0xe8, 0x3, 
       0x2, 0x2, 0x2, 0xe, 0xea, 0x3, 0x2, 0x2, 0x2, 0x10, 0xec, 0x3, 0x2, 
       0x2, 0x2, 0x12, 0x11d, 0x3, 0x2, 0x2, 0x2, 0x14, 0x124, 0x3, 0x2, 
       0x2, 0x2, 0x16, 0x135, 0x3, 0x2, 0x2, 0x2, 0x18, 0x143, 0x3, 0x2, 
       0x2, 0x2, 0x1a, 0x14b, 0x3, 0x2, 0x2, 0x2, 0x1c, 0x152, 0x3, 0x2, 
       0x2, 0x2, 0x1e, 0x15a, 0x3, 0x2, 0x2, 0x2, 0x20, 0x165, 0x3, 0x2, 
       0x2, 0x2, 0x22, 0x167, 0x3, 0x2, 0x2, 0x2, 0x24, 0x16f, 0x3, 0x2, 
       0x2, 0x2, 0x26, 0x1c9, 0x3, 0x2, 0x2, 0x2, 0x28, 0x1cb, 0x3, 0x2, 
       0x2, 0x2, 0x2a, 0x1cd, 0x3, 0x2, 0x2, 0x2, 0x2c, 0x1cf, 0x3, 0x2, 
       0x2, 0x2, 0x2e, 0x1df, 0x3, 0x2, 0x2, 0x2, 0x30, 0x1e1, 0x3, 0x2, 
       0x2, 0x2, 0x32, 0x1ea, 0x3, 0x2, 0x2, 0x2, 0x34, 0x1ec, 0x3, 0x2, 
       0x2, 0x2, 0x36, 0x1ef, 0x3, 0x2, 0x2, 0x2, 0x38, 0x1f1, 0x3, 0x2, 
       0x2, 0x2, 0x3a, 0x1f9, 0x3, 0x2, 0x2, 0x2, 0x3c, 0x205, 0x3, 0x2, 
       0x2, 0x2, 0x3e, 0x20b, 0x3, 0x2, 0x2, 0x2, 0x40, 0x218, 0x3, 0x2, 
       0x2, 0x2, 0x42, 0x21a, 0x3, 0x2, 0x2, 0x2, 0x44, 0x222, 0x3, 0x2, 
       0x2, 0x2, 0x46, 0x224, 0x3, 0x2, 0x2, 0x2, 0x48, 0x228, 0x3, 0x2, 
       0x2, 0x2, 0x4a, 0x22b, 0x3, 0x2, 0x2, 0x2, 0x4c, 0x237, 0x3, 0x2, 
       0x2, 0x2, 0x4e, 0x23d, 0x3, 0x2, 0x2, 0x2, 0x50, 0x247, 0x3, 0x2, 
       0x2, 0x2, 0x52, 0x24c, 0x3, 0x2, 0x2, 0x2, 0x54, 0x251, 0x3, 0x2, 
       0x2, 0x2, 0x56, 0x25b, 0x3, 0x2, 0x2, 0x2, 0x58, 0x25d, 0x3, 0x2, 
       0x2, 0x2, 0x5a, 0x2ba, 0x3, 0x2, 0x2, 0x2, 0x5c, 0x2bc, 0x3, 0x2, 
       0x2, 0x2, 0x5e, 0x2c2, 0x3, 0x2, 0x2, 0x2, 0x60, 0x2c4, 0x3, 0x2, 
       0x2, 0x2, 0x62, 0x2d1, 0x3, 0x2, 0x2, 0x2, 0x64, 0x2d7, 0x3, 0x2, 
       0x2, 0x2, 0x66, 0x2d9, 0x3, 0x2, 0x2, 0x2, 0x68, 0x2e0, 0x3, 0x2, 
       0x2, 0x2, 0x6a, 0x2e5, 0x3, 0x2, 0x2, 0x2, 0x6c, 0x2f5, 0x3, 0x2, 
       0x2, 0x2, 0x6e, 0x2f7, 0x3, 0x2, 0x2, 0x2, 0x70, 0x2f9, 0x3, 0x2, 
       0x2, 0x2, 0x72, 0x2fb, 0x3, 0x2, 0x2, 0x2, 0x74, 0x301, 0x3, 0x2, 
       0x2, 0x2, 0x76, 0x305, 0x3, 0x2, 0x2, 0x2, 0x78, 0x309, 0x3, 0x2, 
       0x2, 0x2, 0x7a, 0x310, 0x3, 0x2, 0x2, 0x2, 0x7c, 0x316, 0x3, 0x2, 
       0x2, 0x2, 0x7e, 0x322, 0x3, 0x2, 0x2, 0x2, 0x80, 0x324, 0x3, 0x2, 
       0x2, 0x2, 0x82, 0x32a, 0x3, 0x2, 0x2, 0x2, 0x84, 0x34a, 0x3, 0x2, 
       0x2, 0x2, 0x86, 0x34c, 0x3, 0x2, 0x2, 0x2, 0x88, 0x36b, 0x3, 0x2, 
       0x2, 0x2, 0x8a, 0x36d, 0x3, 0x2, 0x2, 0x2, 0x8c, 0x36f, 0x3, 0x2, 
       0x2, 0x2, 0x8e, 0x389, 0x3, 0x2, 0x2, 0x2, 0x90, 0x38b, 0x3, 0x2, 
       0x2, 0x2, 0x92, 0x38d, 0x3, 0x2, 0x2, 0x2, 0x94, 0x393, 0x3, 0x2, 
       0x2, 0x2, 0x96, 0x39d, 0x3, 0x2, 0x2, 0x2, 0x98, 0x3a1, 0x3, 0x2, 
       0x2, 0x2, 0x9a, 0x3a3, 0x3, 0x2, 0x2, 0x2, 0x9c, 0x3a9, 0x3, 0x2, 
       0x2, 0x2, 0x9e, 0x3ab, 0x3, 0x2, 0x2, 0x2, 0xa0, 0x3b2, 0x3, 0x2, 
       0x2, 0x2, 0xa2, 0x3b4, 0x3, 0x2, 0x2, 0x2, 0xa4, 0x3ba, 0x3, 0x2, 
       0x2, 0x2, 0xa6, 0x3bc, 0x3, 0x2, 0x2, 0x2, 0xa8, 0x3d7, 0x3, 0x2, 
       0x2, 0x2, 0xaa, 0x3d9, 0x3, 0x2, 0x2, 0x2, 0xac, 0x3db, 0x3, 0x2, 
       0x2, 0x2, 0xae, 0x3f6, 0x3, 0x2, 0x2, 0x2, 0xb0, 0x3f8, 0x3, 0x2, 
       0x2, 0x2, 0xb2, 0x403, 0x3, 0x2, 0x2, 0x2, 0xb4, 0x405, 0x3, 0x2, 
       0x2, 0x2, 0xb6, 0x42d, 0x3, 0x2, 0x2, 0x2, 0xb8, 0x42f, 0x3, 0x2, 
       0x2, 0x2, 0xba, 0x435, 0x3, 0x2, 0x2, 0x2, 0xbc, 0x459, 0x3, 0x2, 
       0x2, 0x2, 0xbe, 0x464, 0x3, 0x2, 0x2, 0x2, 0xc0, 0x466, 0x3, 0x2, 
       0x2, 0x2, 0xc2, 0x47f, 0x3, 0x2, 0x2, 0x2, 0xc4, 0x481, 0x3, 0x2, 
       0x2, 0x2, 0xc6, 0x483, 0x3, 0x2, 0x2, 0x2, 0xc8, 0xc9, 0x5, 0x4, 
       0x3, 0x2, 0xc9, 0xca, 0x7, 0x2, 0x2, 0x3, 0xca, 0x3, 0x3, 0x2, 0x2, 
       0x2, 0xcb, 0xd1, 0x5, 0x6, 0x4, 0x2, 0xcc, 0xcd, 0x5, 0x6, 0x4, 0x2, 
       0xcd, 0xce, 0x5, 0x4, 0x3, 0x2, 0xce, 0xd1, 0x3, 0x2, 0x2, 0x2, 0xcf, 
       0xd1, 0x3, 0x2, 0x2, 0x2, 0xd0, 0xcb, 0x3, 0x2, 0x2, 0x2, 0xd0, 0xcc, 
       0x3, 0x2, 0x2, 0x2, 0xd0, 0xcf, 0x3, 0x2, 0x2, 0x2, 0xd1, 0x5, 0x3, 
       0x2, 0x2, 0x2, 0xd2, 0xdc, 0x5, 0x8, 0x5, 0x2, 0xd3, 0xdc, 0x5, 0xa, 
       0x6, 0x2, 0xd4, 0xdc, 0x5, 0x10, 0x9, 0x2, 0xd5, 0xdc, 0x5, 0x2c, 
       0x17, 0x2, 0xd6, 0xdc, 0x5, 0x3e, 0x20, 0x2, 0xd7, 0xdc, 0x5, 0x64, 
       0x33, 0x2, 0xd8, 0xdc, 0x5, 0x84, 0x43, 0x2, 0xd9, 0xdc, 0x5, 0x80, 
       0x41, 0x2, 0xda, 0xdc, 0x5, 0xa4, 0x53, 0x2, 0xdb, 0xd2, 0x3, 0x2, 
       0x2, 0x2, 0xdb, 0xd3, 0x3, 0x2, 0x2, 0x2, 0xdb, 0xd4, 0x3, 0x2, 0x2, 
       0x2, 0xdb, 0xd5, 0x3, 0x2, 0x2, 0x2, 0xdb, 0xd6, 0x3, 0x2, 0x2, 0x2, 
       0xdb, 0xd7, 0x3, 0x2, 0x2, 0x2, 0xdb, 0xd8, 0x3, 0x2, 0x2, 0x2, 0xdb, 
       0xd9, 0x3, 0x2, 0x2, 0x2, 0xdb, 0xda, 0x3, 0x2, 0x2, 0x2, 0xdc, 0x7, 
       0x3, 0x2, 0x2, 0x2, 0xdd, 0xde, 0x7, 0x2e, 0x2, 0x2, 0xde, 0x9, 0x3, 
       0x2, 0x2, 0x2, 0xdf, 0xe0, 0x7, 0x3, 0x2, 0x2, 0xe0, 0xe1, 0x5, 0xc, 
       0x7, 0x2, 0xe1, 0xe2, 0x7, 0x17, 0x2, 0x2, 0xe2, 0xb, 0x3, 0x2, 0x2, 
       0x2, 0xe3, 0xe9, 0x5, 0xe, 0x8, 0x2, 0xe4, 0xe5, 0x5, 0xe, 0x8, 0x2, 
       0xe5, 0xe6, 0x7, 0x1c, 0x2, 0x2, 0xe6, 0xe7, 0x5, 0xc, 0x7, 0x2, 
       0xe7, 0xe9, 0x3, 0x2, 0x2, 0x2, 0xe8, 0xe3, 0x3, 0x2, 0x2, 0x2, 0xe8, 
       0xe4, 0x3, 0x2, 0x2, 0x2, 0xe9, 0xd, 0x3, 0x2, 0x2, 0x2, 0xea, 0xeb, 
       0x7, 0x2a, 0x2, 0x2, 0xeb, 0xf, 0x3, 0x2, 0x2, 0x2, 0xec, 0xed, 0x5, 
       0x12, 0xa, 0x2, 0xed, 0x11, 0x3, 0x2, 0x2, 0x2, 0xee, 0xef, 0x7, 
       0x4, 0x2, 0x2, 0xef, 0xf0, 0x5, 0x14, 0xb, 0x2, 0xf0, 0xf1, 0x7, 
       0x17, 0x2, 0x2, 0xf1, 0x11e, 0x3, 0x2, 0x2, 0x2, 0xf2, 0xf3, 0x5, 
       0x90, 0x49, 0x2, 0xf3, 0xf4, 0x7, 0x4, 0x2, 0x2, 0xf4, 0xf5, 0x5, 
       0x14, 0xb, 0x2, 0xf5, 0xf6, 0x7, 0x17, 0x2, 0x2, 0xf6, 0x11e, 0x3, 
       0x2, 0x2, 0x2, 0xf7, 0xf8, 0x7, 0xe, 0x2, 0x2, 0xf8, 0xf9, 0x7, 0x4, 
       0x2, 0x2, 0xf9, 0xfa, 0x5, 0x14, 0xb, 0x2, 0xfa, 0xfb, 0x7, 0x17, 
       0x2, 0x2, 0xfb, 0x11e, 0x3, 0x2, 0x2, 0x2, 0xfc, 0xfd, 0x5, 0x90, 
       0x49, 0x2, 0xfd, 0xfe, 0x7, 0xe, 0x2, 0x2, 0xfe, 0xff, 0x7, 0x4, 
       0x2, 0x2, 0xff, 0x100, 0x5, 0x14, 0xb, 0x2, 0x100, 0x101, 0x7, 0x17, 
       0x2, 0x2, 0x101, 0x11e, 0x3, 0x2, 0x2, 0x2, 0x102, 0x103, 0x7, 0xf, 
       0x2, 0x2, 0x103, 0x104, 0x5, 0x90, 0x49, 0x2, 0x104, 0x105, 0x7, 
       0xe, 0x2, 0x2, 0x105, 0x106, 0x7, 0x4, 0x2, 0x2, 0x106, 0x107, 0x5, 
       0x14, 0xb, 0x2, 0x107, 0x108, 0x7, 0x17, 0x2, 0x2, 0x108, 0x11e, 
       0x3, 0x2, 0x2, 0x2, 0x109, 0x10a, 0x7, 0xf, 0x2, 0x2, 0x10a, 0x10b, 
       0x5, 0x90, 0x49, 0x2, 0x10b, 0x10c, 0x7, 0x4, 0x2, 0x2, 0x10c, 0x10d, 
       0x5, 0x14, 0xb, 0x2, 0x10d, 0x10e, 0x7, 0x17, 0x2, 0x2, 0x10e, 0x11e, 
       0x3, 0x2, 0x2, 0x2, 0x10f, 0x110, 0x7, 0xf, 0x2, 0x2, 0x110, 0x111, 
       0x7, 0x4, 0x2, 0x2, 0x111, 0x112, 0x5, 0x14, 0xb, 0x2, 0x112, 0x113, 
       0x7, 0x17, 0x2, 0x2, 0x113, 0x11e, 0x3, 0x2, 0x2, 0x2, 0x114, 0x115, 
       0x7, 0xf, 0x2, 0x2, 0x115, 0x116, 0x7, 0xe, 0x2, 0x2, 0x116, 0x117, 
       0x7, 0x4, 0x2, 0x2, 0x117, 0x118, 0x5, 0x14, 0xb, 0x2, 0x118, 0x119, 
       0x7, 0x17, 0x2, 0x2, 0x119, 0x11e, 0x3, 0x2, 0x2, 0x2, 0x11a, 0x11b, 
       0x5, 0x14, 0xb, 0x2, 0x11b, 0x11c, 0x7, 0x17, 0x2, 0x2, 0x11c, 0x11e, 
       0x3, 0x2, 0x2, 0x2, 0x11d, 0xee, 0x3, 0x2, 0x2, 0x2, 0x11d, 0xf2, 
       0x3, 0x2, 0x2, 0x2, 0x11d, 0xf7, 0x3, 0x2, 0x2, 0x2, 0x11d, 0xfc, 
       0x3, 0x2, 0x2, 0x2, 0x11d, 0x102, 0x3, 0x2, 0x2, 0x2, 0x11d, 0x109, 
       0x3, 0x2, 0x2, 0x2, 0x11d, 0x10f, 0x3, 0x2, 0x2, 0x2, 0x11d, 0x114, 
       0x3, 0x2, 0x2, 0x2, 0x11d, 0x11a, 0x3, 0x2, 0x2, 0x2, 0x11e, 0x13, 
       0x3, 0x2, 0x2, 0x2, 0x11f, 0x125, 0x5, 0x16, 0xc, 0x2, 0x120, 0x121, 
       0x5, 0x16, 0xc, 0x2, 0x121, 0x122, 0x7, 0x1c, 0x2, 0x2, 0x122, 0x123, 
       0x5, 0x14, 0xb, 0x2, 0x123, 0x125, 0x3, 0x2, 0x2, 0x2, 0x124, 0x11f, 
       0x3, 0x2, 0x2, 0x2, 0x124, 0x120, 0x3, 0x2, 0x2, 0x2, 0x125, 0x15, 
       0x3, 0x2, 0x2, 0x2, 0x126, 0x127, 0x7, 0x27, 0x2, 0x2, 0x127, 0x136, 
       0x5, 0x18, 0xd, 0x2, 0x128, 0x129, 0x5, 0xc4, 0x63, 0x2, 0x129, 0x12a, 
       0x7, 0x19, 0x2, 0x2, 0x12a, 0x12b, 0x5, 0xc6, 0x64, 0x2, 0x12b, 0x12c, 
       0x5, 0x18, 0xd, 0x2, 0x12c, 0x136, 0x3, 0x2, 0x2, 0x2, 0x12d, 0x12e, 
       0x5, 0xc4, 0x63, 0x2, 0x12e, 0x12f, 0x7, 0x1b, 0x2, 0x2, 0x12f, 0x130, 
       0x5, 0xc6, 0x64, 0x2, 0x130, 0x131, 0x5, 0x18, 0xd, 0x2, 0x131, 0x136, 
       0x3, 0x2, 0x2, 0x2, 0x132, 0x133, 0x5, 0xba, 0x5e, 0x2, 0x133, 0x134, 
       0x5, 0x18, 0xd, 0x2, 0x134, 0x136, 0x3, 0x2, 0x2, 0x2, 0x135, 0x126, 
       0x3, 0x2, 0x2, 0x2, 0x135, 0x128, 0x3, 0x2, 0x2, 0x2, 0x135, 0x12d, 
       0x3, 0x2, 0x2, 0x2, 0x135, 0x132, 0x3, 0x2, 0x2, 0x2, 0x136, 0x17, 
       0x3, 0x2, 0x2, 0x2, 0x137, 0x138, 0x9, 0x2, 0x2, 0x2, 0x138, 0x144, 
       0x5, 0xc2, 0x62, 0x2, 0x139, 0x13a, 0x7, 0x29, 0x2, 0x2, 0x13a, 0x13b, 
       0x9, 0x2, 0x2, 0x2, 0x13b, 0x144, 0x5, 0xc2, 0x62, 0x2, 0x13c, 0x13d, 
       0x9, 0x2, 0x2, 0x2, 0x13d, 0x13e, 0x7, 0x15, 0x2, 0x2, 0x13e, 0x144, 
       0x5, 0xc2, 0x62, 0x2, 0x13f, 0x140, 0x7, 0x29, 0x2, 0x2, 0x140, 0x141, 
       0x9, 0x2, 0x2, 0x2, 0x141, 0x142, 0x7, 0x15, 0x2, 0x2, 0x142, 0x144, 
       0x5, 0xc2, 0x62, 0x2, 0x143, 0x137, 0x3, 0x2, 0x2, 0x2, 0x143, 0x139, 
       0x3, 0x2, 0x2, 0x2, 0x143, 0x13c, 0x3, 0x2, 0x2, 0x2, 0x143, 0x13f, 
       0x3, 0x2, 0x2, 0x2, 0x144, 0x19, 0x3, 0x2, 0x2, 0x2, 0x145, 0x146, 
       0x7, 0x1d, 0x2, 0x2, 0x146, 0x14c, 0x7, 0x1e, 0x2, 0x2, 0x147, 0x148, 
       0x7, 0x1d, 0x2, 0x2, 0x148, 0x149, 0x5, 0x1c, 0xf, 0x2, 0x149, 0x14a, 
       0x7, 0x1e, 0x2, 0x2, 0x14a, 0x14c, 0x3, 0x2, 0x2, 0x2, 0x14b, 0x145, 
       0x3, 0x2, 0x2, 0x2, 0x14b, 0x147, 0x3, 0x2, 0x2, 0x2, 0x14c, 0x1b, 
       0x3, 0x2, 0x2, 0x2, 0x14d, 0x153, 0x5, 0xc2, 0x62, 0x2, 0x14e, 0x14f, 
       0x5, 0xc2, 0x62, 0x2, 0x14f, 0x150, 0x7, 0x1c, 0x2, 0x2, 0x150, 0x151, 
       0x5, 0x1c, 0xf, 0x2, 0x151, 0x153, 0x3, 0x2, 0x2, 0x2, 0x152, 0x14d, 
       0x3, 0x2, 0x2, 0x2, 0x152, 0x14e, 0x3, 0x2, 0x2, 0x2, 0x153, 0x1d, 
       0x3, 0x2, 0x2, 0x2, 0x154, 0x155, 0x7, 0x1f, 0x2, 0x2, 0x155, 0x15b, 
       0x7, 0x20, 0x2, 0x2, 0x156, 0x157, 0x7, 0x1f, 0x2, 0x2, 0x157, 0x158, 
       0x5, 0x20, 0x11, 0x2, 0x158, 0x159, 0x7, 0x20, 0x2, 0x2, 0x159, 0x15b, 
       0x3, 0x2, 0x2, 0x2, 0x15a, 0x154, 0x3, 0x2, 0x2, 0x2, 0x15a, 0x156, 
       0x3, 0x2, 0x2, 0x2, 0x15b, 0x1f, 0x3, 0x2, 0x2, 0x2, 0x15c, 0x15d, 
       0x7, 0x27, 0x2, 0x2, 0x15d, 0x15e, 0x7, 0x1a, 0x2, 0x2, 0x15e, 0x166, 
       0x5, 0xc2, 0x62, 0x2, 0x15f, 0x160, 0x7, 0x27, 0x2, 0x2, 0x160, 0x161, 
       0x7, 0x1a, 0x2, 0x2, 0x161, 0x162, 0x5, 0xc2, 0x62, 0x2, 0x162, 0x163, 
       0x7, 0x1c, 0x2, 0x2, 0x163, 0x164, 0x5, 0x20, 0x11, 0x2, 0x164, 0x166, 
       0x3, 0x2, 0x2, 0x2, 0x165, 0x15c, 0x3, 0x2, 0x2, 0x2, 0x165, 0x15f, 
       0x3, 0x2, 0x2, 0x2, 0x166, 0x21, 0x3, 0x2, 0x2, 0x2, 0x167, 0x168, 
       0x7, 0x21, 0x2, 0x2, 0x168, 0x169, 0x5, 0x24, 0x13, 0x2, 0x169, 0x16a, 
       0x7, 0x22, 0x2, 0x2, 0x16a, 0x23, 0x3, 0x2, 0x2, 0x2, 0x16b, 0x170, 
       0x5, 0x26, 0x14, 0x2, 0x16c, 0x16d, 0x5, 0x26, 0x14, 0x2, 0x16d, 
       0x16e, 0x5, 0x24, 0x13, 0x2, 0x16e, 0x170, 0x3, 0x2, 0x2, 0x2, 0x16f, 
       0x16b, 0x3, 0x2, 0x2, 0x2, 0x16f, 0x16c, 0x3, 0x2, 0x2, 0x2, 0x170, 
       0x25, 0x3, 0x2, 0x2, 0x2, 0x171, 0x1ca, 0x5, 0x2e, 0x18, 0x2, 0x172, 
       0x173, 0x5, 0x2e, 0x18, 0x2, 0x173, 0x174, 0x7, 0x23, 0x2, 0x2, 0x174, 
       0x1ca, 0x3, 0x2, 0x2, 0x2, 0x175, 0x176, 0x5, 0x2e, 0x18, 0x2, 0x176, 
       0x177, 0x7, 0x29, 0x2, 0x2, 0x177, 0x1ca, 0x3, 0x2, 0x2, 0x2, 0x178, 
       0x179, 0x5, 0x2e, 0x18, 0x2, 0x179, 0x17a, 0x7, 0x29, 0x2, 0x2, 0x17a, 
       0x17b, 0x7, 0x23, 0x2, 0x2, 0x17b, 0x1ca, 0x3, 0x2, 0x2, 0x2, 0x17c, 
       0x1ca, 0x7, 0x27, 0x2, 0x2, 0x17d, 0x17e, 0x7, 0x27, 0x2, 0x2, 0x17e, 
       0x1ca, 0x7, 0x23, 0x2, 0x2, 0x17f, 0x180, 0x7, 0x27, 0x2, 0x2, 0x180, 
       0x1ca, 0x7, 0x29, 0x2, 0x2, 0x181, 0x182, 0x7, 0x27, 0x2, 0x2, 0x182, 
       0x183, 0x7, 0x29, 0x2, 0x2, 0x183, 0x1ca, 0x7, 0x23, 0x2, 0x2, 0x184, 
       0x185, 0x5, 0x28, 0x15, 0x2, 0x185, 0x186, 0x7, 0x27, 0x2, 0x2, 0x186, 
       0x1ca, 0x3, 0x2, 0x2, 0x2, 0x187, 0x188, 0x5, 0x28, 0x15, 0x2, 0x188, 
       0x189, 0x7, 0x27, 0x2, 0x2, 0x189, 0x18a, 0x7, 0x23, 0x2, 0x2, 0x18a, 
       0x1ca, 0x3, 0x2, 0x2, 0x2, 0x18b, 0x18c, 0x5, 0x28, 0x15, 0x2, 0x18c, 
       0x18d, 0x7, 0x27, 0x2, 0x2, 0x18d, 0x18e, 0x7, 0x29, 0x2, 0x2, 0x18e, 
       0x1ca, 0x3, 0x2, 0x2, 0x2, 0x18f, 0x190, 0x5, 0x28, 0x15, 0x2, 0x190, 
       0x191, 0x7, 0x27, 0x2, 0x2, 0x191, 0x192, 0x7, 0x29, 0x2, 0x2, 0x192, 
       0x193, 0x7, 0x23, 0x2, 0x2, 0x193, 0x1ca, 0x3, 0x2, 0x2, 0x2, 0x194, 
       0x195, 0x7, 0x27, 0x2, 0x2, 0x195, 0x1ca, 0x5, 0x2a, 0x16, 0x2, 0x196, 
       0x197, 0x7, 0x27, 0x2, 0x2, 0x197, 0x198, 0x5, 0x2a, 0x16, 0x2, 0x198, 
       0x199, 0x7, 0x23, 0x2, 0x2, 0x199, 0x1ca, 0x3, 0x2, 0x2, 0x2, 0x19a, 
       0x19b, 0x7, 0x27, 0x2, 0x2, 0x19b, 0x19c, 0x5, 0x2a, 0x16, 0x2, 0x19c, 
       0x19d, 0x7, 0x29, 0x2, 0x2, 0x19d, 0x1ca, 0x3, 0x2, 0x2, 0x2, 0x19e, 
       0x19f, 0x7, 0x27, 0x2, 0x2, 0x19f, 0x1a0, 0x5, 0x2a, 0x16, 0x2, 0x1a0, 
       0x1a1, 0x7, 0x29, 0x2, 0x2, 0x1a1, 0x1a2, 0x7, 0x23, 0x2, 0x2, 0x1a2, 
       0x1ca, 0x3, 0x2, 0x2, 0x2, 0x1a3, 0x1ca, 0x7, 0x2b, 0x2, 0x2, 0x1a4, 
       0x1a5, 0x7, 0x2b, 0x2, 0x2, 0x1a5, 0x1ca, 0x7, 0x23, 0x2, 0x2, 0x1a6, 
       0x1a7, 0x7, 0x2b, 0x2, 0x2, 0x1a7, 0x1ca, 0x7, 0x29, 0x2, 0x2, 0x1a8, 
       0x1a9, 0x7, 0x2b, 0x2, 0x2, 0x1a9, 0x1aa, 0x7, 0x29, 0x2, 0x2, 0x1aa, 
       0x1ca, 0x7, 0x23, 0x2, 0x2, 0x1ab, 0x1ca, 0x7, 0x2c, 0x2, 0x2, 0x1ac, 
       0x1ad, 0x7, 0x2c, 0x2, 0x2, 0x1ad, 0x1ca, 0x7, 0x23, 0x2, 0x2, 0x1ae, 
       0x1af, 0x7, 0x2c, 0x2, 0x2, 0x1af, 0x1ca, 0x7, 0x29, 0x2, 0x2, 0x1b0, 
       0x1b1, 0x7, 0x2c, 0x2, 0x2, 0x1b1, 0x1b2, 0x7, 0x29, 0x2, 0x2, 0x1b2, 
       0x1ca, 0x7, 0x23, 0x2, 0x2, 0x1b3, 0x1ca, 0x5, 0x22, 0x12, 0x2, 0x1b4, 
       0x1b5, 0x5, 0x22, 0x12, 0x2, 0x1b5, 0x1b6, 0x7, 0x23, 0x2, 0x2, 0x1b6, 
       0x1ca, 0x3, 0x2, 0x2, 0x2, 0x1b7, 0x1b8, 0x5, 0x22, 0x12, 0x2, 0x1b8, 
       0x1b9, 0x7, 0x29, 0x2, 0x2, 0x1b9, 0x1ca, 0x3, 0x2, 0x2, 0x2, 0x1ba, 
       0x1bb, 0x5, 0x22, 0x12, 0x2, 0x1bb, 0x1bc, 0x7, 0x29, 0x2, 0x2, 0x1bc, 
       0x1bd, 0x7, 0x23, 0x2, 0x2, 0x1bd, 0x1ca, 0x3, 0x2, 0x2, 0x2, 0x1be, 
       0x1ca, 0x5, 0xba, 0x5e, 0x2, 0x1bf, 0x1c0, 0x5, 0xba, 0x5e, 0x2, 
       0x1c0, 0x1c1, 0x7, 0x23, 0x2, 0x2, 0x1c1, 0x1ca, 0x3, 0x2, 0x2, 0x2, 
       0x1c2, 0x1c3, 0x5, 0xba, 0x5e, 0x2, 0x1c3, 0x1c4, 0x7, 0x29, 0x2, 
       0x2, 0x1c4, 0x1ca, 0x3, 0x2, 0x2, 0x2, 0x1c5, 0x1c6, 0x5, 0xba, 0x5e, 
       0x2, 0x1c6, 0x1c7, 0x7, 0x29, 0x2, 0x2, 0x1c7, 0x1c8, 0x7, 0x23, 
       0x2, 0x2, 0x1c8, 0x1ca, 0x3, 0x2, 0x2, 0x2, 0x1c9, 0x171, 0x3, 0x2, 
       0x2, 0x2, 0x1c9, 0x172, 0x3, 0x2, 0x2, 0x2, 0x1c9, 0x175, 0x3, 0x2, 
       0x2, 0x2, 0x1c9, 0x178, 0x3, 0x2, 0x2, 0x2, 0x1c9, 0x17c, 0x3, 0x2, 
       0x2, 0x2, 0x1c9, 0x17d, 0x3, 0x2, 0x2, 0x2, 0x1c9, 0x17f, 0x3, 0x2, 
       0x2, 0x2, 0x1c9, 0x181, 0x3, 0x2, 0x2, 0x2, 0x1c9, 0x184, 0x3, 0x2, 
       0x2, 0x2, 0x1c9, 0x187, 0x3, 0x2, 0x2, 0x2, 0x1c9, 0x18b, 0x3, 0x2, 
       0x2, 0x2, 0x1c9, 0x18f, 0x3, 0x2, 0x2, 0x2, 0x1c9, 0x194, 0x3, 0x2, 
       0x2, 0x2, 0x1c9, 0x196, 0x3, 0x2, 0x2, 0x2, 0x1c9, 0x19a, 0x3, 0x2, 
       0x2, 0x2, 0x1c9, 0x19e, 0x3, 0x2, 0x2, 0x2, 0x1c9, 0x1a3, 0x3, 0x2, 
       0x2, 0x2, 0x1c9, 0x1a4, 0x3, 0x2, 0x2, 0x2, 0x1c9, 0x1a6, 0x3, 0x2, 
       0x2, 0x2, 0x1c9, 0x1a8, 0x3, 0x2, 0x2, 0x2, 0x1c9, 0x1ab, 0x3, 0x2, 
       0x2, 0x2, 0x1c9, 0x1ac, 0x3, 0x2, 0x2, 0x2, 0x1c9, 0x1ae, 0x3, 0x2, 
       0x2, 0x2, 0x1c9, 0x1b0, 0x3, 0x2, 0x2, 0x2, 0x1c9, 0x1b3, 0x3, 0x2, 
       0x2, 0x2, 0x1c9, 0x1b4, 0x3, 0x2, 0x2, 0x2, 0x1c9, 0x1b7, 0x3, 0x2, 
       0x2, 0x2, 0x1c9, 0x1ba, 0x3, 0x2, 0x2, 0x2, 0x1c9, 0x1be, 0x3, 0x2, 
       0x2, 0x2, 0x1c9, 0x1bf, 0x3, 0x2, 0x2, 0x2, 0x1c9, 0x1c2, 0x3, 0x2, 
       0x2, 0x2, 0x1c9, 0x1c5, 0x3, 0x2, 0x2, 0x2, 0x1ca, 0x27, 0x3, 0x2, 
       0x2, 0x2, 0x1cb, 0x1cc, 0x7, 0x26, 0x2, 0x2, 0x1cc, 0x29, 0x3, 0x2, 
       0x2, 0x2, 0x1cd, 0x1ce, 0x7, 0x26, 0x2, 0x2, 0x1ce, 0x2b, 0x3, 0x2, 
       0x2, 0x2, 0x1cf, 0x1d0, 0x5, 0x2e, 0x18, 0x2, 0x1d0, 0x1d1, 0x7, 
       0x17, 0x2, 0x2, 0x1d1, 0x2d, 0x3, 0x2, 0x2, 0x2, 0x1d2, 0x1d3, 0x7, 
       0x27, 0x2, 0x2, 0x1d3, 0x1e0, 0x5, 0x3a, 0x1e, 0x2, 0x1d4, 0x1d5, 
       0x7, 0x27, 0x2, 0x2, 0x1d5, 0x1d6, 0x7, 0x19, 0x2, 0x2, 0x1d6, 0x1d7, 
       0x5, 0x36, 0x1c, 0x2, 0x1d7, 0x1d8, 0x5, 0x3a, 0x1e, 0x2, 0x1d8, 
       0x1e0, 0x3, 0x2, 0x2, 0x2, 0x1d9, 0x1da, 0x7, 0x27, 0x2, 0x2, 0x1da, 
       0x1db, 0x7, 0x1b, 0x2, 0x2, 0x1db, 0x1dc, 0x5, 0x36, 0x1c, 0x2, 0x1dc, 
       0x1dd, 0x5, 0x3a, 0x1e, 0x2, 0x1dd, 0x1e0, 0x3, 0x2, 0x2, 0x2, 0x1de, 
       0x1e0, 0x5, 0x30, 0x19, 0x2, 0x1df, 0x1d2, 0x3, 0x2, 0x2, 0x2, 0x1df, 
       0x1d4, 0x3, 0x2, 0x2, 0x2, 0x1df, 0x1d9, 0x3, 0x2, 0x2, 0x2, 0x1df, 
       0x1de, 0x3, 0x2, 0x2, 0x2, 0x1e0, 0x2f, 0x3, 0x2, 0x2, 0x2, 0x1e1, 
       0x1e2, 0x7, 0x27, 0x2, 0x2, 0x1e2, 0x1e3, 0x7, 0x19, 0x2, 0x2, 0x1e3, 
       0x1e4, 0x5, 0x32, 0x1a, 0x2, 0x1e4, 0x31, 0x3, 0x2, 0x2, 0x2, 0x1e5, 
       0x1eb, 0x5, 0x34, 0x1b, 0x2, 0x1e6, 0x1e7, 0x5, 0x34, 0x1b, 0x2, 
       0x1e7, 0x1e8, 0x7, 0x19, 0x2, 0x2, 0x1e8, 0x1e9, 0x5, 0x32, 0x1a, 
       0x2, 0x1e9, 0x1eb, 0x3, 0x2, 0x2, 0x2, 0x1ea, 0x1e5, 0x3, 0x2, 0x2, 
       0x2, 0x1ea, 0x1e6, 0x3, 0x2, 0x2, 0x2, 0x1eb, 0x33, 0x3, 0x2, 0x2, 
       0x2, 0x1ec, 0x1ed, 0x7, 0x27, 0x2, 0x2, 0x1ed, 0x1ee, 0x5, 0x3a, 
       0x1e, 0x2, 0x1ee, 0x35, 0x3, 0x2, 0x2, 0x2, 0x1ef, 0x1f0, 0x7, 0x27, 
       0x2, 0x2, 0x1f0, 0x37, 0x3, 0x2, 0x2, 0x2, 0x1f1, 0x1f2, 0x7, 0x19, 
       0x2, 0x2, 0x1f2, 0x39, 0x3, 0x2, 0x2, 0x2, 0x1f3, 0x1f4, 0x7, 0x21, 
       0x2, 0x2, 0x1f4, 0x1fa, 0x7, 0x22, 0x2, 0x2, 0x1f5, 0x1f6, 0x7, 0x21, 
       0x2, 0x2, 0x1f6, 0x1f7, 0x5, 0x3c, 0x1f, 0x2, 0x1f7, 0x1f8, 0x7, 
       0x22, 0x2, 0x2, 0x1f8, 0x1fa, 0x3, 0x2, 0x2, 0x2, 0x1f9, 0x1f3, 0x3, 
       0x2, 0x2, 0x2, 0x1f9, 0x1f5, 0x3, 0x2, 0x2, 0x2, 0x1fa, 0x3b, 0x3, 
       0x2, 0x2, 0x2, 0x1fb, 0x206, 0x5, 0xc2, 0x62, 0x2, 0x1fc, 0x1fd, 
       0x5, 0xc2, 0x62, 0x2, 0x1fd, 0x1fe, 0x7, 0x1c, 0x2, 0x2, 0x1fe, 0x1ff, 
       0x5, 0x3c, 0x1f, 0x2, 0x1ff, 0x206, 0x3, 0x2, 0x2, 0x2, 0x200, 0x206, 
       0x5, 0x24, 0x13, 0x2, 0x201, 0x202, 0x5, 0x24, 0x13, 0x2, 0x202, 
       0x203, 0x7, 0x1c, 0x2, 0x2, 0x203, 0x204, 0x5, 0x3c, 0x1f, 0x2, 0x204, 
       0x206, 0x3, 0x2, 0x2, 0x2, 0x205, 0x1fb, 0x3, 0x2, 0x2, 0x2, 0x205, 
       0x1fc, 0x3, 0x2, 0x2, 0x2, 0x205, 0x200, 0x3, 0x2, 0x2, 0x2, 0x205, 
       0x201, 0x3, 0x2, 0x2, 0x2, 0x206, 0x3d, 0x3, 0x2, 0x2, 0x2, 0x207, 
       0x20c, 0x5, 0x40, 0x21, 0x2, 0x208, 0x209, 0x5, 0x40, 0x21, 0x2, 
       0x209, 0x20a, 0x5, 0x3e, 0x20, 0x2, 0x20a, 0x20c, 0x3, 0x2, 0x2, 
       0x2, 0x20b, 0x207, 0x3, 0x2, 0x2, 0x2, 0x20b, 0x208, 0x3, 0x2, 0x2, 
       0x2, 0x20c, 0x3f, 0x3, 0x2, 0x2, 0x2, 0x20d, 0x219, 0x5, 0x42, 0x22, 
       0x2, 0x20e, 0x20f, 0x5, 0x42, 0x22, 0x2, 0x20f, 0x210, 0x5, 0x44, 
       0x23, 0x2, 0x210, 0x219, 0x3, 0x2, 0x2, 0x2, 0x211, 0x212, 0x5, 0x42, 
       0x22, 0x2, 0x212, 0x213, 0x5, 0x48, 0x25, 0x2, 0x213, 0x219, 0x3, 
       0x2, 0x2, 0x2, 0x214, 0x215, 0x5, 0x42, 0x22, 0x2, 0x215, 0x216, 
       0x5, 0x44, 0x23, 0x2, 0x216, 0x217, 0x5, 0x48, 0x25, 0x2, 0x217, 
       0x219, 0x3, 0x2, 0x2, 0x2, 0x218, 0x20d, 0x3, 0x2, 0x2, 0x2, 0x218, 
       0x20e, 0x3, 0x2, 0x2, 0x2, 0x218, 0x211, 0x3, 0x2, 0x2, 0x2, 0x218, 
       0x214, 0x3, 0x2, 0x2, 0x2, 0x219, 0x41, 0x3, 0x2, 0x2, 0x2, 0x21a, 
       0x21b, 0x7, 0x5, 0x2, 0x2, 0x21b, 0x21c, 0x5, 0x4a, 0x26, 0x2, 0x21c, 
       0x21d, 0x5, 0x4c, 0x27, 0x2, 0x21d, 0x43, 0x3, 0x2, 0x2, 0x2, 0x21e, 
       0x223, 0x5, 0x46, 0x24, 0x2, 0x21f, 0x220, 0x5, 0x46, 0x24, 0x2, 
       0x220, 0x221, 0x5, 0x44, 0x23, 0x2, 0x221, 0x223, 0x3, 0x2, 0x2, 
       0x2, 0x222, 0x21e, 0x3, 0x2, 0x2, 0x2, 0x222, 0x21f, 0x3, 0x2, 0x2, 
       0x2, 0x223, 0x45, 0x3, 0x2, 0x2, 0x2, 0x224, 0x225, 0x7, 0x6, 0x2, 
       0x2, 0x225, 0x226, 0x5, 0x4a, 0x26, 0x2, 0x226, 0x227, 0x5, 0x4c, 
       0x27, 0x2, 0x227, 0x47, 0x3, 0x2, 0x2, 0x2, 0x228, 0x229, 0x7, 0x7, 
       0x2, 0x2, 0x229, 0x22a, 0x5, 0x4c, 0x27, 0x2, 0x22a, 0x49, 0x3, 0x2, 
       0x2, 0x2, 0x22b, 0x22c, 0x5, 0x50, 0x29, 0x2, 0x22c, 0x4b, 0x3, 0x2, 
       0x2, 0x2, 0x22d, 0x22e, 0x7, 0x1f, 0x2, 0x2, 0x22e, 0x238, 0x7, 0x20, 
       0x2, 0x2, 0x22f, 0x230, 0x7, 0x1f, 0x2, 0x2, 0x230, 0x231, 0x5, 0x4e, 
       0x28, 0x2, 0x231, 0x232, 0x7, 0x20, 0x2, 0x2, 0x232, 0x238, 0x3, 
       0x2, 0x2, 0x2, 0x233, 0x238, 0x5, 0x3e, 0x20, 0x2, 0x234, 0x238, 
       0x5, 0x2c, 0x17, 0x2, 0x235, 0x238, 0x5, 0x64, 0x33, 0x2, 0x236, 
       0x238, 0x5, 0x80, 0x41, 0x2, 0x237, 0x22d, 0x3, 0x2, 0x2, 0x2, 0x237, 
       0x22f, 0x3, 0x2, 0x2, 0x2, 0x237, 0x233, 0x3, 0x2, 0x2, 0x2, 0x237, 
       0x234, 0x3, 0x2, 0x2, 0x2, 0x237, 0x235, 0x3, 0x2, 0x2, 0x2, 0x237, 
       0x236, 0x3, 0x2, 0x2, 0x2, 0x238, 0x4d, 0x3, 0x2, 0x2, 0x2, 0x239, 
       0x23e, 0x5, 0x6, 0x4, 0x2, 0x23a, 0x23b, 0x5, 0x6, 0x4, 0x2, 0x23b, 
       0x23c, 0x5, 0x4e, 0x28, 0x2, 0x23c, 0x23e, 0x3, 0x2, 0x2, 0x2, 0x23d, 
       0x239, 0x3, 0x2, 0x2, 0x2, 0x23d, 0x23a, 0x3, 0x2, 0x2, 0x2, 0x23e, 
       0x4f, 0x3, 0x2, 0x2, 0x2, 0x23f, 0x248, 0x5, 0x52, 0x2a, 0x2, 0x240, 
       0x241, 0x5, 0x52, 0x2a, 0x2, 0x241, 0x242, 0x5, 0x50, 0x29, 0x2, 
       0x242, 0x248, 0x3, 0x2, 0x2, 0x2, 0x243, 0x248, 0x5, 0x54, 0x2b, 
       0x2, 0x244, 0x245, 0x5, 0x54, 0x2b, 0x2, 0x245, 0x246, 0x5, 0x50, 
       0x29, 0x2, 0x246, 0x248, 0x3, 0x2, 0x2, 0x2, 0x247, 0x23f, 0x3, 0x2, 
       0x2, 0x2, 0x247, 0x240, 0x3, 0x2, 0x2, 0x2, 0x247, 0x243, 0x3, 0x2, 
       0x2, 0x2, 0x247, 0x244, 0x3, 0x2, 0x2, 0x2, 0x248, 0x51, 0x3, 0x2, 
       0x2, 0x2, 0x249, 0x24a, 0x7, 0x25, 0x2, 0x2, 0x24a, 0x24d, 0x5, 0x5a, 
       0x2e, 0x2, 0x24b, 0x24d, 0x5, 0x5a, 0x2e, 0x2, 0x24c, 0x249, 0x3, 
       0x2, 0x2, 0x2, 0x24c, 0x24b, 0x3, 0x2, 0x2, 0x2, 0x24d, 0x53, 0x3, 
       0x2, 0x2, 0x2, 0x24e, 0x252, 0x5, 0x56, 0x2c, 0x2, 0x24f, 0x250, 
       0x7, 0x25, 0x2, 0x2, 0x250, 0x252, 0x5, 0x56, 0x2c, 0x2, 0x251, 0x24e, 
       0x3, 0x2, 0x2, 0x2, 0x251, 0x24f, 0x3, 0x2, 0x2, 0x2, 0x252, 0x55, 
       0x3, 0x2, 0x2, 0x2, 0x253, 0x25c, 0x5, 0x58, 0x2d, 0x2, 0x254, 0x255, 
       0x5, 0x58, 0x2d, 0x2, 0x255, 0x256, 0x9, 0x3, 0x2, 0x2, 0x256, 0x25c, 
       0x3, 0x2, 0x2, 0x2, 0x257, 0x258, 0x5, 0x58, 0x2d, 0x2, 0x258, 0x259, 
       0x7, 0x29, 0x2, 0x2, 0x259, 0x25a, 0x9, 0x3, 0x2, 0x2, 0x25a, 0x25c, 
       0x3, 0x2, 0x2, 0x2, 0x25b, 0x253, 0x3, 0x2, 0x2, 0x2, 0x25b, 0x254, 
       0x3, 0x2, 0x2, 0x2, 0x25b, 0x257, 0x3, 0x2, 0x2, 0x2, 0x25c, 0x57, 
       0x3, 0x2, 0x2, 0x2, 0x25d, 0x25e, 0x7, 0x21, 0x2, 0x2, 0x25e, 0x25f, 
       0x5, 0x50, 0x29, 0x2, 0x25f, 0x260, 0x7, 0x22, 0x2, 0x2, 0x260, 0x59, 
       0x3, 0x2, 0x2, 0x2, 0x261, 0x262, 0x5, 0x28, 0x15, 0x2, 0x262, 0x263, 
       0x7, 0x27, 0x2, 0x2, 0x263, 0x2bb, 0x3, 0x2, 0x2, 0x2, 0x264, 0x265, 
       0x5, 0x28, 0x15, 0x2, 0x265, 0x266, 0x7, 0x27, 0x2, 0x2, 0x266, 0x267, 
       0x9, 0x3, 0x2, 0x2, 0x267, 0x2bb, 0x3, 0x2, 0x2, 0x2, 0x268, 0x269, 
       0x5, 0x28, 0x15, 0x2, 0x269, 0x26a, 0x7, 0x27, 0x2, 0x2, 0x26a, 0x26b, 
       0x7, 0x29, 0x2, 0x2, 0x26b, 0x2bb, 0x3, 0x2, 0x2, 0x2, 0x26c, 0x26d, 
       0x5, 0x28, 0x15, 0x2, 0x26d, 0x26e, 0x7, 0x27, 0x2, 0x2, 0x26e, 0x26f, 
       0x7, 0x29, 0x2, 0x2, 0x26f, 0x270, 0x9, 0x3, 0x2, 0x2, 0x270, 0x2bb, 
       0x3, 0x2, 0x2, 0x2, 0x271, 0x272, 0x7, 0x27, 0x2, 0x2, 0x272, 0x2bb, 
       0x5, 0x2a, 0x16, 0x2, 0x273, 0x274, 0x7, 0x27, 0x2, 0x2, 0x274, 0x275, 
       0x5, 0x2a, 0x16, 0x2, 0x275, 0x276, 0x9, 0x3, 0x2, 0x2, 0x276, 0x2bb, 
       0x3, 0x2, 0x2, 0x2, 0x277, 0x278, 0x7, 0x27, 0x2, 0x2, 0x278, 0x279, 
       0x5, 0x2a, 0x16, 0x2, 0x279, 0x27a, 0x7, 0x29, 0x2, 0x2, 0x27a, 0x2bb, 
       0x3, 0x2, 0x2, 0x2, 0x27b, 0x27c, 0x7, 0x27, 0x2, 0x2, 0x27c, 0x27d, 
       0x5, 0x2a, 0x16, 0x2, 0x27d, 0x27e, 0x7, 0x29, 0x2, 0x2, 0x27e, 0x27f, 
       0x9, 0x3, 0x2, 0x2, 0x27f, 0x2bb, 0x3, 0x2, 0x2, 0x2, 0x280, 0x2bb, 
       0x7, 0x2b, 0x2, 0x2, 0x281, 0x282, 0x7, 0x2b, 0x2, 0x2, 0x282, 0x2bb, 
       0x9, 0x3, 0x2, 0x2, 0x283, 0x284, 0x7, 0x2b, 0x2, 0x2, 0x284, 0x2bb, 
       0x7, 0x29, 0x2, 0x2, 0x285, 0x286, 0x7, 0x2b, 0x2, 0x2, 0x286, 0x287, 
       0x7, 0x29, 0x2, 0x2, 0x287, 0x2bb, 0x9, 0x3, 0x2, 0x2, 0x288, 0x2bb, 
       0x7, 0x2c, 0x2, 0x2, 0x289, 0x28a, 0x7, 0x2c, 0x2, 0x2, 0x28a, 0x2bb, 
       0x9, 0x3, 0x2, 0x2, 0x28b, 0x28c, 0x7, 0x2c, 0x2, 0x2, 0x28c, 0x2bb, 
       0x7, 0x29, 0x2, 0x2, 0x28d, 0x28e, 0x7, 0x2c, 0x2, 0x2, 0x28e, 0x28f, 
       0x7, 0x29, 0x2, 0x2, 0x28f, 0x2bb, 0x9, 0x3, 0x2, 0x2, 0x290, 0x2bb, 
       0x5, 0x5c, 0x2f, 0x2, 0x291, 0x2bb, 0x5, 0x2e, 0x18, 0x2, 0x292, 
       0x293, 0x5, 0x2e, 0x18, 0x2, 0x293, 0x294, 0x9, 0x3, 0x2, 0x2, 0x294, 
       0x2bb, 0x3, 0x2, 0x2, 0x2, 0x295, 0x296, 0x5, 0x2e, 0x18, 0x2, 0x296, 
       0x297, 0x7, 0x29, 0x2, 0x2, 0x297, 0x2bb, 0x3, 0x2, 0x2, 0x2, 0x298, 
       0x299, 0x5, 0x2e, 0x18, 0x2, 0x299, 0x29a, 0x7, 0x29, 0x2, 0x2, 0x29a, 
       0x29b, 0x9, 0x3, 0x2, 0x2, 0x29b, 0x2bb, 0x3, 0x2, 0x2, 0x2, 0x29c, 
       0x2bb, 0x5, 0x22, 0x12, 0x2, 0x29d, 0x29e, 0x5, 0x22, 0x12, 0x2, 
       0x29e, 0x29f, 0x9, 0x3, 0x2, 0x2, 0x29f, 0x2bb, 0x3, 0x2, 0x2, 0x2, 
       0x2a0, 0x2a1, 0x5, 0x22, 0x12, 0x2, 0x2a1, 0x2a2, 0x7, 0x29, 0x2, 
       0x2, 0x2a2, 0x2bb, 0x3, 0x2, 0x2, 0x2, 0x2a3, 0x2a4, 0x5, 0x22, 0x12, 
       0x2, 0x2a4, 0x2a5, 0x7, 0x29, 0x2, 0x2, 0x2a5, 0x2a6, 0x9, 0x3, 0x2, 
       0x2, 0x2a6, 0x2bb, 0x3, 0x2, 0x2, 0x2, 0x2a7, 0x2bb, 0x7, 0x27, 0x2, 
       0x2, 0x2a8, 0x2a9, 0x7, 0x27, 0x2, 0x2, 0x2a9, 0x2bb, 0x9, 0x3, 0x2, 
       0x2, 0x2aa, 0x2ab, 0x7, 0x27, 0x2, 0x2, 0x2ab, 0x2bb, 0x7, 0x29, 
       0x2, 0x2, 0x2ac, 0x2ad, 0x7, 0x27, 0x2, 0x2, 0x2ad, 0x2ae, 0x7, 0x29, 
       0x2, 0x2, 0x2ae, 0x2bb, 0x9, 0x3, 0x2, 0x2, 0x2af, 0x2bb, 0x5, 0xba, 
       0x5e, 0x2, 0x2b0, 0x2b1, 0x5, 0xba, 0x5e, 0x2, 0x2b1, 0x2b2, 0x9, 
       0x3, 0x2, 0x2, 0x2b2, 0x2bb, 0x3, 0x2, 0x2, 0x2, 0x2b3, 0x2b4, 0x5, 
       0xba, 0x5e, 0x2, 0x2b4, 0x2b5, 0x7, 0x29, 0x2, 0x2, 0x2b5, 0x2bb, 
       0x3, 0x2, 0x2, 0x2, 0x2b6, 0x2b7, 0x5, 0xba, 0x5e, 0x2, 0x2b7, 0x2b8, 
       0x7, 0x29, 0x2, 0x2, 0x2b8, 0x2b9, 0x9, 0x3, 0x2, 0x2, 0x2b9, 0x2bb, 
       0x3, 0x2, 0x2, 0x2, 0x2ba, 0x261, 0x3, 0x2, 0x2, 0x2, 0x2ba, 0x264, 
       0x3, 0x2, 0x2, 0x2, 0x2ba, 0x268, 0x3, 0x2, 0x2, 0x2, 0x2ba, 0x26c, 
       0x3, 0x2, 0x2, 0x2, 0x2ba, 0x271, 0x3, 0x2, 0x2, 0x2, 0x2ba, 0x273, 
       0x3, 0x2, 0x2, 0x2, 0x2ba, 0x277, 0x3, 0x2, 0x2, 0x2, 0x2ba, 0x27b, 
       0x3, 0x2, 0x2, 0x2, 0x2ba, 0x280, 0x3, 0x2, 0x2, 0x2, 0x2ba, 0x281, 
       0x3, 0x2, 0x2, 0x2, 0x2ba, 0x283, 0x3, 0x2, 0x2, 0x2, 0x2ba, 0x285, 
       0x3, 0x2, 0x2, 0x2, 0x2ba, 0x288, 0x3, 0x2, 0x2, 0x2, 0x2ba, 0x289, 
       0x3, 0x2, 0x2, 0x2, 0x2ba, 0x28b, 0x3, 0x2, 0x2, 0x2, 0x2ba, 0x28d, 
       0x3, 0x2, 0x2, 0x2, 0x2ba, 0x290, 0x3, 0x2, 0x2, 0x2, 0x2ba, 0x291, 
       0x3, 0x2, 0x2, 0x2, 0x2ba, 0x292, 0x3, 0x2, 0x2, 0x2, 0x2ba, 0x295, 
       0x3, 0x2, 0x2, 0x2, 0x2ba, 0x298, 0x3, 0x2, 0x2, 0x2, 0x2ba, 0x29c, 
       0x3, 0x2, 0x2, 0x2, 0x2ba, 0x29d, 0x3, 0x2, 0x2, 0x2, 0x2ba, 0x2a0, 
       0x3, 0x2, 0x2, 0x2, 0x2ba, 0x2a3, 0x3, 0x2, 0x2, 0x2, 0x2ba, 0x2a7, 
       0x3, 0x2, 0x2, 0x2, 0x2ba, 0x2a8, 0x3, 0x2, 0x2, 0x2, 0x2ba, 0x2aa, 
       0x3, 0x2, 0x2, 0x2, 0x2ba, 0x2ac, 0x3, 0x2, 0x2, 0x2, 0x2ba, 0x2af, 
       0x3, 0x2, 0x2, 0x2, 0x2ba, 0x2b0, 0x3, 0x2, 0x2, 0x2, 0x2ba, 0x2b3, 
       0x3, 0x2, 0x2, 0x2, 0x2ba, 0x2b6, 0x3, 0x2, 0x2, 0x2, 0x2bb, 0x5b, 
       0x3, 0x2, 0x2, 0x2, 0x2bc, 0x2bd, 0x5, 0x5e, 0x30, 0x2, 0x2bd, 0x2be, 
       0x7, 0x18, 0x2, 0x2, 0x2be, 0x2bf, 0x5, 0x60, 0x31, 0x2, 0x2bf, 0x5d, 
       0x3, 0x2, 0x2, 0x2, 0x2c0, 0x2c3, 0x5, 0xba, 0x5e, 0x2, 0x2c1, 0x2c3, 
       0x7, 0x27, 0x2, 0x2, 0x2c2, 0x2c0, 0x3, 0x2, 0x2, 0x2, 0x2c2, 0x2c1, 
       0x3, 0x2, 0x2, 0x2, 0x2c3, 0x5f, 0x3, 0x2, 0x2, 0x2, 0x2c4, 0x2c5, 
       0x5, 0x62, 0x32, 0x2, 0x2c5, 0x61, 0x3, 0x2, 0x2, 0x2, 0x2c6, 0x2d2, 
       0x5, 0x2e, 0x18, 0x2, 0x2c7, 0x2c8, 0x5, 0x2e, 0x18, 0x2, 0x2c8, 
       0x2c9, 0x9, 0x3, 0x2, 0x2, 0x2c9, 0x2d2, 0x3, 0x2, 0x2, 0x2, 0x2ca, 
       0x2cb, 0x5, 0x2e, 0x18, 0x2, 0x2cb, 0x2cc, 0x7, 0x29, 0x2, 0x2, 0x2cc, 
       0x2d2, 0x3, 0x2, 0x2, 0x2, 0x2cd, 0x2ce, 0x5, 0x2e, 0x18, 0x2, 0x2ce, 
       0x2cf, 0x7, 0x29, 0x2, 0x2, 0x2cf, 0x2d0, 0x9, 0x3, 0x2, 0x2, 0x2d0, 
       0x2d2, 0x3, 0x2, 0x2, 0x2, 0x2d1, 0x2c6, 0x3, 0x2, 0x2, 0x2, 0x2d1, 
       0x2c7, 0x3, 0x2, 0x2, 0x2, 0x2d1, 0x2ca, 0x3, 0x2, 0x2, 0x2, 0x2d1, 
       0x2cd, 0x3, 0x2, 0x2, 0x2, 0x2d2, 0x63, 0x3, 0x2, 0x2, 0x2, 0x2d3, 
       0x2d8, 0x5, 0x66, 0x34, 0x2, 0x2d4, 0x2d5, 0x5, 0x66, 0x34, 0x2, 
       0x2d5, 0x2d6, 0x5, 0x64, 0x33, 0x2, 0x2d6, 0x2d8, 0x3, 0x2, 0x2, 
       0x2, 0x2d7, 0x2d3, 0x3, 0x2, 0x2, 0x2, 0x2d7, 0x2d4, 0x3, 0x2, 0x2, 
       0x2, 0x2d8, 0x65, 0x3, 0x2, 0x2, 0x2, 0x2d9, 0x2da, 0x7, 0x8, 0x2, 
       0x2, 0x2da, 0x2db, 0x5, 0x68, 0x35, 0x2, 0x2db, 0x2dc, 0x5, 0x7e, 
       0x40, 0x2, 0x2dc, 0x67, 0x3, 0x2, 0x2, 0x2, 0x2dd, 0x2e1, 0x5, 0x6a, 
       0x36, 0x2, 0x2de, 0x2e1, 0x5, 0x6c, 0x37, 0x2, 0x2df, 0x2e1, 0x5, 
       0x6e, 0x38, 0x2, 0x2e0, 0x2dd, 0x3, 0x2, 0x2, 0x2, 0x2e0, 0x2de, 
       0x3, 0x2, 0x2, 0x2, 0x2e0, 0x2df, 0x3, 0x2, 0x2, 0x2, 0x2e1, 0x69, 
       0x3, 0x2, 0x2, 0x2, 0x2e2, 0x2e3, 0x7, 0x21, 0x2, 0x2, 0x2e3, 0x2e6, 
       0x7, 0x22, 0x2, 0x2, 0x2e4, 0x2e6, 0x3, 0x2, 0x2, 0x2, 0x2e5, 0x2e2, 
       0x3, 0x2, 0x2, 0x2, 0x2e5, 0x2e4, 0x3, 0x2, 0x2, 0x2, 0x2e6, 0x6b, 
       0x3, 0x2, 0x2, 0x2, 0x2e7, 0x2e8, 0x7, 0x21, 0x2, 0x2, 0x2e8, 0x2e9, 
       0x5, 0x74, 0x3b, 0x2, 0x2e9, 0x2ea, 0x5, 0x70, 0x39, 0x2, 0x2ea, 
       0x2eb, 0x5, 0x76, 0x3c, 0x2, 0x2eb, 0x2ec, 0x5, 0x72, 0x3a, 0x2, 
       0x2ec, 0x2ed, 0x5, 0x78, 0x3d, 0x2, 0x2ed, 0x2ee, 0x7, 0x22, 0x2, 
       0x2, 0x2ee, 0x2f6, 0x3, 0x2, 0x2, 0x2, 0x2ef, 0x2f0, 0x5, 0x74, 0x3b, 
       0x2, 0x2f0, 0x2f1, 0x5, 0x70, 0x39, 0x2, 0x2f1, 0x2f2, 0x5, 0x76, 
       0x3c, 0x2, 0x2f2, 0x2f3, 0x5, 0x72, 0x3a, 0x2, 0x2f3, 0x2f4, 0x5, 
       0x78, 0x3d, 0x2, 0x2f4, 0x2f6, 0x3, 0x2, 0x2, 0x2, 0x2f5, 0x2e7, 
       0x3, 0x2, 0x2, 0x2, 0x2f5, 0x2ef, 0x3, 0x2, 0x2, 0x2, 0x2f6, 0x6d, 
       0x3, 0x2, 0x2, 0x2, 0x2f7, 0x2f8, 0x5, 0x76, 0x3c, 0x2, 0x2f8, 0x6f, 
       0x3, 0x2, 0x2, 0x2, 0x2f9, 0x2fa, 0x7, 0x17, 0x2, 0x2, 0x2fa, 0x71, 
       0x3, 0x2, 0x2, 0x2, 0x2fb, 0x2fc, 0x7, 0x17, 0x2, 0x2, 0x2fc, 0x73, 
       0x3, 0x2, 0x2, 0x2, 0x2fd, 0x302, 0x5, 0x14, 0xb, 0x2, 0x2fe, 0x2ff, 
       0x7, 0x4, 0x2, 0x2, 0x2ff, 0x302, 0x5, 0x14, 0xb, 0x2, 0x300, 0x302, 
       0x3, 0x2, 0x2, 0x2, 0x301, 0x2fd, 0x3, 0x2, 0x2, 0x2, 0x301, 0x2fe, 
       0x3, 0x2, 0x2, 0x2, 0x301, 0x300, 0x3, 0x2, 0x2, 0x2, 0x302, 0x75, 
       0x3, 0x2, 0x2, 0x2, 0x303, 0x306, 0x5, 0x50, 0x29, 0x2, 0x304, 0x306, 
       0x3, 0x2, 0x2, 0x2, 0x305, 0x303, 0x3, 0x2, 0x2, 0x2, 0x305, 0x304, 
       0x3, 0x2, 0x2, 0x2, 0x306, 0x77, 0x3, 0x2, 0x2, 0x2, 0x307, 0x30a, 
       0x5, 0x7a, 0x3e, 0x2, 0x308, 0x30a, 0x3, 0x2, 0x2, 0x2, 0x309, 0x307, 
       0x3, 0x2, 0x2, 0x2, 0x309, 0x308, 0x3, 0x2, 0x2, 0x2, 0x30a, 0x79, 
       0x3, 0x2, 0x2, 0x2, 0x30b, 0x311, 0x5, 0x24, 0x13, 0x2, 0x30c, 0x30d, 
       0x5, 0x24, 0x13, 0x2, 0x30d, 0x30e, 0x7, 0x1c, 0x2, 0x2, 0x30e, 0x30f, 
       0x5, 0x7a, 0x3e, 0x2, 0x30f, 0x311, 0x3, 0x2, 0x2, 0x2, 0x310, 0x30b, 
       0x3, 0x2, 0x2, 0x2, 0x310, 0x30c, 0x3, 0x2, 0x2, 0x2, 0x311, 0x7b, 
       0x3, 0x2, 0x2, 0x2, 0x312, 0x317, 0x5, 0x6, 0x4, 0x2, 0x313, 0x314, 
       0x5, 0x6, 0x4, 0x2, 0x314, 0x315, 0x5, 0x7c, 0x3f, 0x2, 0x315, 0x317, 
       0x3, 0x2, 0x2, 0x2, 0x316, 0x312, 0x3, 0x2, 0x2, 0x2, 0x316, 0x313, 
       0x3, 0x2, 0x2, 0x2, 0x317, 0x7d, 0x3, 0x2, 0x2, 0x2, 0x318, 0x319, 
       0x7, 0x1f, 0x2, 0x2, 0x319, 0x323, 0x7, 0x20, 0x2, 0x2, 0x31a, 0x31b, 
       0x7, 0x1f, 0x2, 0x2, 0x31b, 0x31c, 0x5, 0x7c, 0x3f, 0x2, 0x31c, 0x31d, 
       0x7, 0x20, 0x2, 0x2, 0x31d, 0x323, 0x3, 0x2, 0x2, 0x2, 0x31e, 0x323, 
       0x5, 0x3e, 0x20, 0x2, 0x31f, 0x323, 0x5, 0x2c, 0x17, 0x2, 0x320, 
       0x323, 0x5, 0x64, 0x33, 0x2, 0x321, 0x323, 0x5, 0x80, 0x41, 0x2, 
       0x322, 0x318, 0x3, 0x2, 0x2, 0x2, 0x322, 0x31a, 0x3, 0x2, 0x2, 0x2, 
       0x322, 0x31e, 0x3, 0x2, 0x2, 0x2, 0x322, 0x31f, 0x3, 0x2, 0x2, 0x2, 
       0x322, 0x320, 0x3, 0x2, 0x2, 0x2, 0x322, 0x321, 0x3, 0x2, 0x2, 0x2, 
       0x323, 0x7f, 0x3, 0x2, 0x2, 0x2, 0x324, 0x325, 0x7, 0x9, 0x2, 0x2, 
       0x325, 0x326, 0x5, 0x82, 0x42, 0x2, 0x326, 0x327, 0x7, 0x17, 0x2, 
       0x2, 0x327, 0x81, 0x3, 0x2, 0x2, 0x2, 0x328, 0x32b, 0x5, 0xc2, 0x62, 
       0x2, 0x329, 0x32b, 0x5, 0x24, 0x13, 0x2, 0x32a, 0x328, 0x3, 0x2, 
       0x2, 0x2, 0x32a, 0x329, 0x3, 0x2, 0x2, 0x2, 0x32b, 0x83, 0x3, 0x2, 
       0x2, 0x2, 0x32c, 0x32d, 0x5, 0x86, 0x44, 0x2, 0x32d, 0x32e, 0x7, 
       0x1f, 0x2, 0x2, 0x32e, 0x32f, 0x7, 0x20, 0x2, 0x2, 0x32f, 0x34b, 
       0x3, 0x2, 0x2, 0x2, 0x330, 0x331, 0x5, 0x86, 0x44, 0x2, 0x331, 0x332, 
       0x7, 0x1f, 0x2, 0x2, 0x332, 0x333, 0x5, 0x9a, 0x4e, 0x2, 0x333, 0x334, 
       0x7, 0x20, 0x2, 0x2, 0x334, 0x34b, 0x3, 0x2, 0x2, 0x2, 0x335, 0x336, 
       0x5, 0x8c, 0x47, 0x2, 0x336, 0x337, 0x7, 0x1f, 0x2, 0x2, 0x337, 0x338, 
       0x7, 0x20, 0x2, 0x2, 0x338, 0x34b, 0x3, 0x2, 0x2, 0x2, 0x339, 0x33a, 
       0x5, 0x8c, 0x47, 0x2, 0x33a, 0x33b, 0x7, 0x1f, 0x2, 0x2, 0x33b, 0x33c, 
       0x5, 0x9a, 0x4e, 0x2, 0x33c, 0x33d, 0x7, 0x20, 0x2, 0x2, 0x33d, 0x34b, 
       0x3, 0x2, 0x2, 0x2, 0x33e, 0x33f, 0x5, 0x96, 0x4c, 0x2, 0x33f, 0x340, 
       0x7, 0x1f, 0x2, 0x2, 0x340, 0x341, 0x7, 0x20, 0x2, 0x2, 0x341, 0x34b, 
       0x3, 0x2, 0x2, 0x2, 0x342, 0x343, 0x5, 0x96, 0x4c, 0x2, 0x343, 0x344, 
       0x7, 0x1f, 0x2, 0x2, 0x344, 0x345, 0x5, 0x9a, 0x4e, 0x2, 0x345, 0x346, 
       0x7, 0x20, 0x2, 0x2, 0x346, 0x34b, 0x3, 0x2, 0x2, 0x2, 0x347, 0x348, 
       0x5, 0x98, 0x4d, 0x2, 0x348, 0x349, 0x7, 0x17, 0x2, 0x2, 0x349, 0x34b, 
       0x3, 0x2, 0x2, 0x2, 0x34a, 0x32c, 0x3, 0x2, 0x2, 0x2, 0x34a, 0x330, 
       0x3, 0x2, 0x2, 0x2, 0x34a, 0x335, 0x3, 0x2, 0x2, 0x2, 0x34a, 0x339, 
       0x3, 0x2, 0x2, 0x2, 0x34a, 0x33e, 0x3, 0x2, 0x2, 0x2, 0x34a, 0x342, 
       0x3, 0x2, 0x2, 0x2, 0x34a, 0x347, 0x3, 0x2, 0x2, 0x2, 0x34b, 0x85, 
       0x3, 0x2, 0x2, 0x2, 0x34c, 0x34d, 0x5, 0x88, 0x45, 0x2, 0x34d, 0x87, 
       0x3, 0x2, 0x2, 0x2, 0x34e, 0x34f, 0x7, 0xa, 0x2, 0x2, 0x34f, 0x350, 
       0x7, 0x27, 0x2, 0x2, 0x350, 0x351, 0x7, 0x21, 0x2, 0x2, 0x351, 0x36c, 
       0x7, 0x22, 0x2, 0x2, 0x352, 0x353, 0x7, 0xa, 0x2, 0x2, 0x353, 0x354, 
       0x7, 0x27, 0x2, 0x2, 0x354, 0x355, 0x7, 0x21, 0x2, 0x2, 0x355, 0x356, 
       0x7, 0x22, 0x2, 0x2, 0x356, 0x359, 0x7, 0x16, 0x2, 0x2, 0x357, 0x35a, 
       0x5, 0x8a, 0x46, 0x2, 0x358, 0x35a, 0x7, 0x29, 0x2, 0x2, 0x359, 0x357, 
       0x3, 0x2, 0x2, 0x2, 0x359, 0x358, 0x3, 0x2, 0x2, 0x2, 0x35a, 0x36c, 
       0x3, 0x2, 0x2, 0x2, 0x35b, 0x35c, 0x7, 0xa, 0x2, 0x2, 0x35c, 0x35d, 
       0x7, 0x27, 0x2, 0x2, 0x35d, 0x35e, 0x7, 0x21, 0x2, 0x2, 0x35e, 0x35f, 
       0x5, 0x9e, 0x50, 0x2, 0x35f, 0x360, 0x7, 0x22, 0x2, 0x2, 0x360, 0x36c, 
       0x3, 0x2, 0x2, 0x2, 0x361, 0x362, 0x7, 0xa, 0x2, 0x2, 0x362, 0x363, 
       0x7, 0x27, 0x2, 0x2, 0x363, 0x364, 0x7, 0x21, 0x2, 0x2, 0x364, 0x365, 
       0x5, 0x9e, 0x50, 0x2, 0x365, 0x366, 0x7, 0x22, 0x2, 0x2, 0x366, 0x369, 
       0x7, 0x16, 0x2, 0x2, 0x367, 0x36a, 0x5, 0x8a, 0x46, 0x2, 0x368, 0x36a, 
       0x7, 0x29, 0x2, 0x2, 0x369, 0x367, 0x3, 0x2, 0x2, 0x2, 0x369, 0x368, 
       0x3, 0x2, 0x2, 0x2, 0x36a, 0x36c, 0x3, 0x2, 0x2, 0x2, 0x36b, 0x34e, 
       0x3, 0x2, 0x2, 0x2, 0x36b, 0x352, 0x3, 0x2, 0x2, 0x2, 0x36b, 0x35b, 
       0x3, 0x2, 0x2, 0x2, 0x36b, 0x361, 0x3, 0x2, 0x2, 0x2, 0x36c, 0x89, 
       0x3, 0x2, 0x2, 0x2, 0x36d, 0x36e, 0x7, 0x27, 0x2, 0x2, 0x36e, 0x8b, 
       0x3, 0x2, 0x2, 0x2, 0x36f, 0x370, 0x5, 0x94, 0x4b, 0x2, 0x370, 0x371, 
       0x5, 0x88, 0x45, 0x2, 0x371, 0x8d, 0x3, 0x2, 0x2, 0x2, 0x372, 0x373, 
       0x5, 0x90, 0x49, 0x2, 0x373, 0x374, 0x5, 0x88, 0x45, 0x2, 0x374, 
       0x38a, 0x3, 0x2, 0x2, 0x2, 0x375, 0x376, 0x7, 0xe, 0x2, 0x2, 0x376, 
       0x38a, 0x5, 0x88, 0x45, 0x2, 0x377, 0x378, 0x5, 0x90, 0x49, 0x2, 
       0x378, 0x379, 0x7, 0xe, 0x2, 0x2, 0x379, 0x37a, 0x5, 0x88, 0x45, 
       0x2, 0x37a, 0x38a, 0x3, 0x2, 0x2, 0x2, 0x37b, 0x37c, 0x7, 0xf, 0x2, 
       0x2, 0x37c, 0x37d, 0x5, 0x90, 0x49, 0x2, 0x37d, 0x37e, 0x7, 0xe, 
       0x2, 0x2, 0x37e, 0x37f, 0x5, 0x88, 0x45, 0x2, 0x37f, 0x38a, 0x3, 
       0x2, 0x2, 0x2, 0x380, 0x381, 0x7, 0xf, 0x2, 0x2, 0x381, 0x382, 0x5, 
       0x90, 0x49, 0x2, 0x382, 0x383, 0x5, 0x88, 0x45, 0x2, 0x383, 0x38a, 
       0x3, 0x2, 0x2, 0x2, 0x384, 0x385, 0x7, 0xf, 0x2, 0x2, 0x385, 0x38a, 
       0x5, 0x88, 0x45, 0x2, 0x386, 0x387, 0x7, 0xf, 0x2, 0x2, 0x387, 0x388, 
       0x7, 0xe, 0x2, 0x2, 0x388, 0x38a, 0x5, 0x88, 0x45, 0x2, 0x389, 0x372, 
       0x3, 0x2, 0x2, 0x2, 0x389, 0x375, 0x3, 0x2, 0x2, 0x2, 0x389, 0x377, 
       0x3, 0x2, 0x2, 0x2, 0x389, 0x37b, 0x3, 0x2, 0x2, 0x2, 0x389, 0x380, 
       0x3, 0x2, 0x2, 0x2, 0x389, 0x384, 0x3, 0x2, 0x2, 0x2, 0x389, 0x386, 
       0x3, 0x2, 0x2, 0x2, 0x38a, 0x8f, 0x3, 0x2, 0x2, 0x2, 0x38b, 0x38c, 
       0x9, 0x4, 0x2, 0x2, 0x38c, 0x91, 0x3, 0x2, 0x2, 0x2, 0x38d, 0x38e, 
       0x9, 0x5, 0x2, 0x2, 0x38e, 0x93, 0x3, 0x2, 0x2, 0x2, 0x38f, 0x394, 
       0x5, 0x92, 0x4a, 0x2, 0x390, 0x391, 0x5, 0x92, 0x4a, 0x2, 0x391, 
       0x392, 0x5, 0x94, 0x4b, 0x2, 0x392, 0x394, 0x3, 0x2, 0x2, 0x2, 0x393, 
       0x38f, 0x3, 0x2, 0x2, 0x2, 0x393, 0x390, 0x3, 0x2, 0x2, 0x2, 0x394, 
       0x95, 0x3, 0x2, 0x2, 0x2, 0x395, 0x396, 0x7, 0x27, 0x2, 0x2, 0x396, 
       0x397, 0x7, 0x21, 0x2, 0x2, 0x397, 0x39e, 0x7, 0x22, 0x2, 0x2, 0x398, 
       0x399, 0x7, 0x27, 0x2, 0x2, 0x399, 0x39a, 0x7, 0x21, 0x2, 0x2, 0x39a, 
       0x39b, 0x5, 0x9e, 0x50, 0x2, 0x39b, 0x39c, 0x7, 0x22, 0x2, 0x2, 0x39c, 
       0x39e, 0x3, 0x2, 0x2, 0x2, 0x39d, 0x395, 0x3, 0x2, 0x2, 0x2, 0x39d, 
       0x398, 0x3, 0x2, 0x2, 0x2, 0x39e, 0x97, 0x3, 0x2, 0x2, 0x2, 0x39f, 
       0x3a2, 0x5, 0x86, 0x44, 0x2, 0x3a0, 0x3a2, 0x5, 0x8c, 0x47, 0x2, 
       0x3a1, 0x39f, 0x3, 0x2, 0x2, 0x2, 0x3a1, 0x3a0, 0x3, 0x2, 0x2, 0x2, 
       0x3a2, 0x99, 0x3, 0x2, 0x2, 0x2, 0x3a3, 0x3a4, 0x5, 0x9c, 0x4f, 0x2, 
       0x3a4, 0x9b, 0x3, 0x2, 0x2, 0x2, 0x3a5, 0x3aa, 0x5, 0x6, 0x4, 0x2, 
       0x3a6, 0x3a7, 0x5, 0x6, 0x4, 0x2, 0x3a7, 0x3a8, 0x5, 0x9c, 0x4f, 
       0x2, 0x3a8, 0x3aa, 0x3, 0x2, 0x2, 0x2, 0x3a9, 0x3a5, 0x3, 0x2, 0x2, 
       0x2, 0x3a9, 0x3a6, 0x3, 0x2, 0x2, 0x2, 0x3aa, 0x9d, 0x3, 0x2, 0x2, 
       0x2, 0x3ab, 0x3ac, 0x5, 0xa0, 0x51, 0x2, 0x3ac, 0x9f, 0x3, 0x2, 0x2, 
       0x2, 0x3ad, 0x3b3, 0x5, 0xa2, 0x52, 0x2, 0x3ae, 0x3af, 0x5, 0xa2, 
       0x52, 0x2, 0x3af, 0x3b0, 0x7, 0x1c, 0x2, 0x2, 0x3b0, 0x3b1, 0x5, 
       0xa0, 0x51, 0x2, 0x3b1, 0x3b3, 0x3, 0x2, 0x2, 0x2, 0x3b2, 0x3ad, 
       0x3, 0x2, 0x2, 0x2, 0x3b2, 0x3ae, 0x3, 0x2, 0x2, 0x2, 0x3b3, 0xa1, 
       0x3, 0x2, 0x2, 0x2, 0x3b4, 0x3b5, 0x7, 0x27, 0x2, 0x2, 0x3b5, 0x3b6, 
       0x7, 0x29, 0x2, 0x2, 0x3b6, 0xa3, 0x3, 0x2, 0x2, 0x2, 0x3b7, 0x3bb, 
       0x5, 0xa6, 0x54, 0x2, 0x3b8, 0x3bb, 0x5, 0xac, 0x57, 0x2, 0x3b9, 
       0x3bb, 0x5, 0xb2, 0x5a, 0x2, 0x3ba, 0x3b7, 0x3, 0x2, 0x2, 0x2, 0x3ba, 
       0x3b8, 0x3, 0x2, 0x2, 0x2, 0x3ba, 0x3b9, 0x3, 0x2, 0x2, 0x2, 0x3bb, 
       0xa5, 0x3, 0x2, 0x2, 0x2, 0x3bc, 0x3bd, 0x5, 0xa8, 0x55, 0x2, 0x3bd, 
       0xa7, 0x3, 0x2, 0x2, 0x2, 0x3be, 0x3bf, 0x7, 0x10, 0x2, 0x2, 0x3bf, 
       0x3c0, 0x7, 0x27, 0x2, 0x2, 0x3c0, 0x3c1, 0x7, 0x1f, 0x2, 0x2, 0x3c1, 
       0x3d8, 0x7, 0x20, 0x2, 0x2, 0x3c2, 0x3c3, 0x7, 0x10, 0x2, 0x2, 0x3c3, 
       0x3c4, 0x7, 0x27, 0x2, 0x2, 0x3c4, 0x3c5, 0x7, 0x1f, 0x2, 0x2, 0x3c5, 
       0x3c6, 0x5, 0xaa, 0x56, 0x2, 0x3c6, 0x3c7, 0x7, 0x20, 0x2, 0x2, 0x3c7, 
       0x3d8, 0x3, 0x2, 0x2, 0x2, 0x3c8, 0x3c9, 0x7, 0x10, 0x2, 0x2, 0x3c9, 
       0x3ca, 0x7, 0x27, 0x2, 0x2, 0x3ca, 0x3cb, 0x7, 0x12, 0x2, 0x2, 0x3cb, 
       0x3cc, 0x5, 0x36, 0x1c, 0x2, 0x3cc, 0x3cd, 0x7, 0x1f, 0x2, 0x2, 0x3cd, 
       0x3ce, 0x7, 0x20, 0x2, 0x2, 0x3ce, 0x3d8, 0x3, 0x2, 0x2, 0x2, 0x3cf, 
       0x3d0, 0x7, 0x10, 0x2, 0x2, 0x3d0, 0x3d1, 0x7, 0x27, 0x2, 0x2, 0x3d1, 
       0x3d2, 0x7, 0x12, 0x2, 0x2, 0x3d2, 0x3d3, 0x5, 0x36, 0x1c, 0x2, 0x3d3, 
       0x3d4, 0x7, 0x1f, 0x2, 0x2, 0x3d4, 0x3d5, 0x5, 0xaa, 0x56, 0x2, 0x3d5, 
       0x3d6, 0x7, 0x20, 0x2, 0x2, 0x3d6, 0x3d8, 0x3, 0x2, 0x2, 0x2, 0x3d7, 
       0x3be, 0x3, 0x2, 0x2, 0x2, 0x3d7, 0x3c2, 0x3, 0x2, 0x2, 0x2, 0x3d7, 
       0x3c8, 0x3, 0x2, 0x2, 0x2, 0x3d7, 0x3cf, 0x3, 0x2, 0x2, 0x2, 0x3d8, 
       0xa9, 0x3, 0x2, 0x2, 0x2, 0x3d9, 0x3da, 0x5, 0x9c, 0x4f, 0x2, 0x3da, 
       0xab, 0x3, 0x2, 0x2, 0x2, 0x3db, 0x3dc, 0x5, 0xae, 0x58, 0x2, 0x3dc, 
       0xad, 0x3, 0x2, 0x2, 0x2, 0x3dd, 0x3de, 0x7, 0x11, 0x2, 0x2, 0x3de, 
       0x3df, 0x7, 0x27, 0x2, 0x2, 0x3df, 0x3e0, 0x7, 0x1f, 0x2, 0x2, 0x3e0, 
       0x3f7, 0x7, 0x20, 0x2, 0x2, 0x3e1, 0x3e2, 0x7, 0x11, 0x2, 0x2, 0x3e2, 
       0x3e3, 0x7, 0x27, 0x2, 0x2, 0x3e3, 0x3e4, 0x7, 0x1f, 0x2, 0x2, 0x3e4, 
       0x3e5, 0x5, 0xb0, 0x59, 0x2, 0x3e5, 0x3e6, 0x7, 0x20, 0x2, 0x2, 0x3e6, 
       0x3f7, 0x3, 0x2, 0x2, 0x2, 0x3e7, 0x3e8, 0x7, 0x11, 0x2, 0x2, 0x3e8, 
       0x3e9, 0x7, 0x27, 0x2, 0x2, 0x3e9, 0x3ea, 0x7, 0x12, 0x2, 0x2, 0x3ea, 
       0x3eb, 0x5, 0x36, 0x1c, 0x2, 0x3eb, 0x3ec, 0x7, 0x1f, 0x2, 0x2, 0x3ec, 
       0x3ed, 0x7, 0x20, 0x2, 0x2, 0x3ed, 0x3f7, 0x3, 0x2, 0x2, 0x2, 0x3ee, 
       0x3ef, 0x7, 0x11, 0x2, 0x2, 0x3ef, 0x3f0, 0x7, 0x27, 0x2, 0x2, 0x3f0, 
       0x3f1, 0x7, 0x12, 0x2, 0x2, 0x3f1, 0x3f2, 0x5, 0x36, 0x1c, 0x2, 0x3f2, 
       0x3f3, 0x7, 0x1f, 0x2, 0x2, 0x3f3, 0x3f4, 0x5, 0xb0, 0x59, 0x2, 0x3f4, 
       0x3f5, 0x7, 0x20, 0x2, 0x2, 0x3f5, 0x3f7, 0x3, 0x2, 0x2, 0x2, 0x3f6, 
       0x3dd, 0x3, 0x2, 0x2, 0x2, 0x3f6, 0x3e1, 0x3, 0x2, 0x2, 0x2, 0x3f6, 
       0x3e7, 0x3, 0x2, 0x2, 0x2, 0x3f6, 0x3ee, 0x3, 0x2, 0x2, 0x2, 0x3f7, 
       0xaf, 0x3, 0x2, 0x2, 0x2, 0x3f8, 0x3f9, 0x5, 0x9c, 0x4f, 0x2, 0x3f9, 
       0xb1, 0x3, 0x2, 0x2, 0x2, 0x3fa, 0x3fb, 0x5, 0xb6, 0x5c, 0x2, 0x3fb, 
       0x3fc, 0x7, 0x1f, 0x2, 0x2, 0x3fc, 0x3fd, 0x7, 0x20, 0x2, 0x2, 0x3fd, 
       0x404, 0x3, 0x2, 0x2, 0x2, 0x3fe, 0x3ff, 0x5, 0xb6, 0x5c, 0x2, 0x3ff, 
       0x400, 0x7, 0x1f, 0x2, 0x2, 0x400, 0x401, 0x5, 0xb4, 0x5b, 0x2, 0x401, 
       0x402, 0x7, 0x20, 0x2, 0x2, 0x402, 0x404, 0x3, 0x2, 0x2, 0x2, 0x403, 
       0x3fa, 0x3, 0x2, 0x2, 0x2, 0x403, 0x3fe, 0x3, 0x2, 0x2, 0x2, 0x404, 
       0xb3, 0x3, 0x2, 0x2, 0x2, 0x405, 0x406, 0x5, 0x9c, 0x4f, 0x2, 0x406, 
       0xb5, 0x3, 0x2, 0x2, 0x2, 0x407, 0x408, 0x7, 0x13, 0x2, 0x2, 0x408, 
       0x42e, 0x7, 0x27, 0x2, 0x2, 0x409, 0x40a, 0x7, 0x13, 0x2, 0x2, 0x40a, 
       0x40b, 0x7, 0x27, 0x2, 0x2, 0x40b, 0x40c, 0x7, 0x12, 0x2, 0x2, 0x40c, 
       0x42e, 0x5, 0x36, 0x1c, 0x2, 0x40d, 0x40e, 0x7, 0x13, 0x2, 0x2, 0x40e, 
       0x40f, 0x7, 0x27, 0x2, 0x2, 0x40f, 0x410, 0x7, 0x14, 0x2, 0x2, 0x410, 
       0x42e, 0x5, 0x36, 0x1c, 0x2, 0x411, 0x412, 0x7, 0x13, 0x2, 0x2, 0x412, 
       0x413, 0x7, 0x27, 0x2, 0x2, 0x413, 0x414, 0x7, 0x12, 0x2, 0x2, 0x414, 
       0x415, 0x5, 0x36, 0x1c, 0x2, 0x415, 0x416, 0x7, 0x14, 0x2, 0x2, 0x416, 
       0x417, 0x5, 0xb8, 0x5d, 0x2, 0x417, 0x42e, 0x3, 0x2, 0x2, 0x2, 0x418, 
       0x419, 0x7, 0xf, 0x2, 0x2, 0x419, 0x41a, 0x7, 0x13, 0x2, 0x2, 0x41a, 
       0x42e, 0x7, 0x27, 0x2, 0x2, 0x41b, 0x41c, 0x7, 0xf, 0x2, 0x2, 0x41c, 
       0x41d, 0x7, 0x13, 0x2, 0x2, 0x41d, 0x41e, 0x7, 0x27, 0x2, 0x2, 0x41e, 
       0x41f, 0x7, 0x12, 0x2, 0x2, 0x41f, 0x42e, 0x5, 0x36, 0x1c, 0x2, 0x420, 
       0x421, 0x7, 0xf, 0x2, 0x2, 0x421, 0x422, 0x7, 0x13, 0x2, 0x2, 0x422, 
       0x423, 0x7, 0x27, 0x2, 0x2, 0x423, 0x424, 0x7, 0x14, 0x2, 0x2, 0x424, 
       0x42e, 0x5, 0x36, 0x1c, 0x2, 0x425, 0x426, 0x7, 0xf, 0x2, 0x2, 0x426, 
       0x427, 0x7, 0x13, 0x2, 0x2, 0x427, 0x428, 0x7, 0x27, 0x2, 0x2, 0x428, 
       0x429, 0x7, 0x12, 0x2, 0x2, 0x429, 0x42a, 0x5, 0x36, 0x1c, 0x2, 0x42a, 
       0x42b, 0x7, 0x14, 0x2, 0x2, 0x42b, 0x42c, 0x5, 0xb8, 0x5d, 0x2, 0x42c, 
       0x42e, 0x3, 0x2, 0x2, 0x2, 0x42d, 0x407, 0x3, 0x2, 0x2, 0x2, 0x42d, 
       0x409, 0x3, 0x2, 0x2, 0x2, 0x42d, 0x40d, 0x3, 0x2, 0x2, 0x2, 0x42d, 
       0x411, 0x3, 0x2, 0x2, 0x2, 0x42d, 0x418, 0x3, 0x2, 0x2, 0x2, 0x42d, 
       0x41b, 0x3, 0x2, 0x2, 0x2, 0x42d, 0x420, 0x3, 0x2, 0x2, 0x2, 0x42d, 
       0x425, 0x3, 0x2, 0x2, 0x2, 0x42e, 0xb7, 0x3, 0x2, 0x2, 0x2, 0x42f, 
       0x430, 0x7, 0x27, 0x2, 0x2, 0x430, 0xb9, 0x3, 0x2, 0x2, 0x2, 0x431, 
       0x436, 0x5, 0xbc, 0x5f, 0x2, 0x432, 0x433, 0x5, 0xbc, 0x5f, 0x2, 
       0x433, 0x434, 0x5, 0xba, 0x5e, 0x2, 0x434, 0x436, 0x3, 0x2, 0x2, 
       0x2, 0x435, 0x431, 0x3, 0x2, 0x2, 0x2, 0x435, 0x432, 0x3, 0x2, 0x2, 
       0x2, 0x436, 0xbb, 0x3, 0x2, 0x2, 0x2, 0x437, 0x45a, 0x7, 0x27, 0x2, 
       0x2, 0x438, 0x439, 0x7, 0x27, 0x2, 0x2, 0x439, 0x45a, 0x7, 0x19, 
       0x2, 0x2, 0x43a, 0x43b, 0x7, 0x27, 0x2, 0x2, 0x43b, 0x45a, 0x5, 0xbe, 
       0x60, 0x2, 0x43c, 0x43d, 0x7, 0x27, 0x2, 0x2, 0x43d, 0x43e, 0x5, 
       0xbe, 0x60, 0x2, 0x43e, 0x43f, 0x7, 0x19, 0x2, 0x2, 0x43f, 0x45a, 
       0x3, 0x2, 0x2, 0x2, 0x440, 0x441, 0x5, 0x28, 0x15, 0x2, 0x441, 0x442, 
       0x7, 0x27, 0x2, 0x2, 0x442, 0x45a, 0x3, 0x2, 0x2, 0x2, 0x443, 0x444, 
       0x7, 0x27, 0x2, 0x2, 0x444, 0x45a, 0x7, 0x19, 0x2, 0x2, 0x445, 0x446, 
       0x5, 0x28, 0x15, 0x2, 0x446, 0x447, 0x7, 0x27, 0x2, 0x2, 0x447, 0x448, 
       0x5, 0xbe, 0x60, 0x2, 0x448, 0x45a, 0x3, 0x2, 0x2, 0x2, 0x449, 0x44a, 
       0x7, 0x27, 0x2, 0x2, 0x44a, 0x44b, 0x5, 0xbe, 0x60, 0x2, 0x44b, 0x44c, 
       0x7, 0x19, 0x2, 0x2, 0x44c, 0x45a, 0x3, 0x2, 0x2, 0x2, 0x44d, 0x44e, 
       0x7, 0x27, 0x2, 0x2, 0x44e, 0x45a, 0x5, 0x2a, 0x16, 0x2, 0x44f, 0x450, 
       0x7, 0x27, 0x2, 0x2, 0x450, 0x45a, 0x7, 0x19, 0x2, 0x2, 0x451, 0x452, 
       0x7, 0x27, 0x2, 0x2, 0x452, 0x453, 0x5, 0xbe, 0x60, 0x2, 0x453, 0x454, 
       0x5, 0x2a, 0x16, 0x2, 0x454, 0x45a, 0x3, 0x2, 0x2, 0x2, 0x455, 0x456, 
       0x7, 0x27, 0x2, 0x2, 0x456, 0x457, 0x5, 0xbe, 0x60, 0x2, 0x457, 0x458, 
       0x7, 0x19, 0x2, 0x2, 0x458, 0x45a, 0x3, 0x2, 0x2, 0x2, 0x459, 0x437, 
       0x3, 0x2, 0x2, 0x2, 0x459, 0x438, 0x3, 0x2, 0x2, 0x2, 0x459, 0x43a, 
       0x3, 0x2, 0x2, 0x2, 0x459, 0x43c, 0x3, 0x2, 0x2, 0x2, 0x459, 0x440, 
       0x3, 0x2, 0x2, 0x2, 0x459, 0x443, 0x3, 0x2, 0x2, 0x2, 0x459, 0x445, 
       0x3, 0x2, 0x2, 0x2, 0x459, 0x449, 0x3, 0x2, 0x2, 0x2, 0x459, 0x44d, 
       0x3, 0x2, 0x2, 0x2, 0x459, 0x44f, 0x3, 0x2, 0x2, 0x2, 0x459, 0x451, 
       0x3, 0x2, 0x2, 0x2, 0x459, 0x455, 0x3, 0x2, 0x2, 0x2, 0x45a, 0xbd, 
       0x3, 0x2, 0x2, 0x2, 0x45b, 0x45c, 0x7, 0x1d, 0x2, 0x2, 0x45c, 0x45d, 
       0x5, 0xc0, 0x61, 0x2, 0x45d, 0x45e, 0x7, 0x1e, 0x2, 0x2, 0x45e, 0x465, 
       0x3, 0x2, 0x2, 0x2, 0x45f, 0x460, 0x7, 0x1d, 0x2, 0x2, 0x460, 0x461, 
       0x5, 0xc0, 0x61, 0x2, 0x461, 0x462, 0x7, 0x1e, 0x2, 0x2, 0x462, 0x463, 
       0x5, 0xbe, 0x60, 0x2, 0x463, 0x465, 0x3, 0x2, 0x2, 0x2, 0x464, 0x45b, 
       0x3, 0x2, 0x2, 0x2, 0x464, 0x45f, 0x3, 0x2, 0x2, 0x2, 0x465, 0xbf, 
       0x3, 0x2, 0x2, 0x2, 0x466, 0x467, 0x5, 0x24, 0x13, 0x2, 0x467, 0xc1, 
       0x3, 0x2, 0x2, 0x2, 0x468, 0x480, 0x7, 0x27, 0x2, 0x2, 0x469, 0x46a, 
       0x7, 0x27, 0x2, 0x2, 0x46a, 0x480, 0x7, 0x29, 0x2, 0x2, 0x46b, 0x480, 
       0x7, 0x2b, 0x2, 0x2, 0x46c, 0x46d, 0x7, 0x2b, 0x2, 0x2, 0x46d, 0x480, 
       0x7, 0x29, 0x2, 0x2, 0x46e, 0x480, 0x7, 0x2c, 0x2, 0x2, 0x46f, 0x470, 
       0x7, 0x2c, 0x2, 0x2, 0x470, 0x480, 0x7, 0x29, 0x2, 0x2, 0x471, 0x480, 
       0x7, 0x2a, 0x2, 0x2, 0x472, 0x480, 0x5, 0x1a, 0xe, 0x2, 0x473, 0x480, 
       0x5, 0x1e, 0x10, 0x2, 0x474, 0x480, 0x5, 0x24, 0x13, 0x2, 0x475, 
       0x480, 0x5, 0x2e, 0x18, 0x2, 0x476, 0x477, 0x5, 0xc4, 0x63, 0x2, 
       0x477, 0x478, 0x7, 0x19, 0x2, 0x2, 0x478, 0x479, 0x5, 0xc6, 0x64, 
       0x2, 0x479, 0x480, 0x3, 0x2, 0x2, 0x2, 0x47a, 0x47b, 0x5, 0xc4, 0x63, 
       0x2, 0x47b, 0x47c, 0x7, 0x1b, 0x2, 0x2, 0x47c, 0x47d, 0x5, 0xc6, 
       0x64, 0x2, 0x47d, 0x480, 0x3, 0x2, 0x2, 0x2, 0x47e, 0x480, 0x5, 0xba, 
       0x5e, 0x2, 0x47f, 0x468, 0x3, 0x2, 0x2, 0x2, 0x47f, 0x469, 0x3, 0x2, 
       0x2, 0x2, 0x47f, 0x46b, 0x3, 0x2, 0x2, 0x2, 0x47f, 0x46c, 0x3, 0x2, 
       0x2, 0x2, 0x47f, 0x46e, 0x3, 0x2, 0x2, 0x2, 0x47f, 0x46f, 0x3, 0x2, 
       0x2, 0x2, 0x47f, 0x471, 0x3, 0x2, 0x2, 0x2, 0x47f, 0x472, 0x3, 0x2, 
       0x2, 0x2, 0x47f, 0x473, 0x3, 0x2, 0x2, 0x2, 0x47f, 0x474, 0x3, 0x2, 
       0x2, 0x2, 0x47f, 0x475, 0x3, 0x2, 0x2, 0x2, 0x47f, 0x476, 0x3, 0x2, 
       0x2, 0x2, 0x47f, 0x47a, 0x3, 0x2, 0x2, 0x2, 0x47f, 0x47e, 0x3, 0x2, 
       0x2, 0x2, 0x480, 0xc3, 0x3, 0x2, 0x2, 0x2, 0x481, 0x482, 0x7, 0x27, 
       0x2, 0x2, 0x482, 0xc5, 0x3, 0x2, 0x2, 0x2, 0x483, 0x484, 0x7, 0x27, 
       0x2, 0x2, 0x484, 0xc7, 0x3, 0x2, 0x2, 0x2, 0x3d, 0xd0, 0xdb, 0xe8, 
       0x11d, 0x124, 0x135, 0x143, 0x14b, 0x152, 0x15a, 0x165, 0x16f, 0x1c9, 
       0x1df, 0x1ea, 0x1f9, 0x205, 0x20b, 0x218, 0x222, 0x237, 0x23d, 0x247, 
       0x24c, 0x251, 0x25b, 0x2ba, 0x2c2, 0x2d1, 0x2d7, 0x2e0, 0x2e5, 0x2f5, 
       0x301, 0x305, 0x309, 0x310, 0x316, 0x322, 0x32a, 0x34a, 0x359, 0x369, 
       0x36b, 0x389, 0x393, 0x39d, 0x3a1, 0x3a9, 0x3b2, 0x3ba, 0x3d7, 0x3f6, 
       0x403, 0x42d, 0x435, 0x459, 0x464, 0x47f, 
  };

  _serializedATN.insert(_serializedATN.end(), serializedATNSegment0,
    serializedATNSegment0 + sizeof(serializedATNSegment0) / sizeof(serializedATNSegment0[0]));


  atn::ATNDeserializer deserializer;
  _atn = deserializer.deserialize(_serializedATN);

  size_t count = _atn.getNumberOfDecisions();
  _decisionToDFA.reserve(count);
  for (size_t i = 0; i < count; i++) { 
    _decisionToDFA.emplace_back(_atn.getDecisionState(i), i);
  }
}

TParser::Initializer TParser::_init;
