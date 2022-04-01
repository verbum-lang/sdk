
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
    setState(132);
    fileContent(0);
    setState(133);
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

TParser::FileContentContext* TParser::FileContentContext::fileContent() {
  return getRuleContext<TParser::FileContentContext>(0);
}

TParser::SentenceContext* TParser::FileContentContext::sentence() {
  return getRuleContext<TParser::SentenceContext>(0);
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
   return fileContent(0);
}

TParser::FileContentContext* TParser::fileContent(int precedence) {
  ParserRuleContext *parentContext = _ctx;
  size_t parentState = getState();
  TParser::FileContentContext *_localctx = _tracker.createInstance<FileContentContext>(_ctx, parentState);
  TParser::FileContentContext *previousContext = _localctx;
  (void)previousContext; // Silence compiler, in case the context is not used by generated code.
  size_t startState = 2;
  enterRecursionRule(_localctx, 2, TParser::RuleFileContent, precedence);

    

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    unrollRecursionContexts(parentContext);
  });
  try {
    size_t alt;
    enterOuterAlt(_localctx, 1);
    _ctx->stop = _input->LT(-1);
    setState(140);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 0, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        if (!_parseListeners.empty())
          triggerExitRuleEvent();
        previousContext = _localctx;
        _localctx = _tracker.createInstance<FileContentContext>(parentContext, parentState);
        pushNewRecursionContext(_localctx, startState, RuleFileContent);
        setState(136);

        if (!(precpred(_ctx, 2))) throw FailedPredicateException(this, "precpred(_ctx, 2)");
        setState(137);
        sentence(); 
      }
      setState(142);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 0, _ctx);
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
    setState(152);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 1, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(143);
      liveToken();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(144);
      use();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(145);
      variable();
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(146);
      callingFunction();
      break;
    }

    case 5: {
      enterOuterAlt(_localctx, 5);
      setState(147);
      conditionalExpression();
      break;
    }

    case 6: {
      enterOuterAlt(_localctx, 6);
      setState(148);
      loop();
      break;
    }

    case 7: {
      enterOuterAlt(_localctx, 7);
      setState(149);
      functions();
      break;
    }

    case 8: {
      enterOuterAlt(_localctx, 8);
      setState(150);
      ret();
      break;
    }

    case 9: {
      enterOuterAlt(_localctx, 9);
      setState(151);
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
    setState(154);
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
    setState(156);
    match(TParser::Use);
    setState(157);
    useValue();
    setState(158);
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
    setState(165);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 2, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(160);
      useString();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(161);
      useString();
      setState(162);
      match(TParser::Separator);
      setState(163);
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
    setState(167);
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
    setState(169);
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
    setState(215);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 3, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(171);
      match(TParser::Var);
      setState(172);
      variableMembers();
      setState(173);
      match(TParser::End);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(175);
      methodPerm();
      setState(176);
      match(TParser::Var);
      setState(177);
      variableMembers();
      setState(178);
      match(TParser::End);
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(180);
      match(TParser::Static);
      setState(181);
      match(TParser::Var);
      setState(182);
      variableMembers();
      setState(183);
      match(TParser::End);
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(185);
      methodPerm();
      setState(186);
      match(TParser::Static);
      setState(187);
      match(TParser::Var);
      setState(188);
      variableMembers();
      setState(189);
      match(TParser::End);
      break;
    }

    case 5: {
      enterOuterAlt(_localctx, 5);
      setState(191);
      match(TParser::Final);
      setState(192);
      methodPerm();
      setState(193);
      match(TParser::Static);
      setState(194);
      match(TParser::Var);
      setState(195);
      variableMembers();
      setState(196);
      match(TParser::End);
      break;
    }

    case 6: {
      enterOuterAlt(_localctx, 6);
      setState(198);
      match(TParser::Final);
      setState(199);
      methodPerm();
      setState(200);
      match(TParser::Var);
      setState(201);
      variableMembers();
      setState(202);
      match(TParser::End);
      break;
    }

    case 7: {
      enterOuterAlt(_localctx, 7);
      setState(204);
      match(TParser::Final);
      setState(205);
      match(TParser::Var);
      setState(206);
      variableMembers();
      setState(207);
      match(TParser::End);
      break;
    }

    case 8: {
      enterOuterAlt(_localctx, 8);
      setState(209);
      match(TParser::Final);
      setState(210);
      match(TParser::Static);
      setState(211);
      match(TParser::Var);
      setState(212);
      variableMembers();
      setState(213);
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
    setState(222);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 4, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(217);
      variableDefinition();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(218);
      variableDefinition();
      setState(219);
      match(TParser::Separator);
      setState(220);
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

tree::TerminalNode* TParser::VariableDefinitionContext::Attr() {
  return getToken(TParser::Attr, 0);
}

TParser::GeneralValueContext* TParser::VariableDefinitionContext::generalValue() {
  return getRuleContext<TParser::GeneralValueContext>(0);
}

tree::TerminalNode* TParser::VariableDefinitionContext::TypeSpec() {
  return getToken(TParser::TypeSpec, 0);
}

tree::TerminalNode* TParser::VariableDefinitionContext::New() {
  return getToken(TParser::New, 0);
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
    setState(240);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 5, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(224);
      match(TParser::Identifier);
      setState(225);
      match(TParser::Attr);
      setState(226);
      generalValue();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(227);
      match(TParser::Identifier);
      setState(228);
      match(TParser::TypeSpec);
      setState(229);
      match(TParser::Attr);
      setState(230);
      generalValue();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(231);
      match(TParser::Identifier);
      setState(232);
      match(TParser::Attr);
      setState(233);
      match(TParser::New);
      setState(234);
      generalValue();
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(235);
      match(TParser::Identifier);
      setState(236);
      match(TParser::TypeSpec);
      setState(237);
      match(TParser::Attr);
      setState(238);
      match(TParser::New);
      setState(239);
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
  enterRule(_localctx, 22, TParser::RuleIndexArray);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(248);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 6, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(242);
      match(TParser::OpenArIndex);
      setState(243);
      match(TParser::CloseArIndex);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(244);
      match(TParser::OpenArIndex);
      setState(245);
      indexArrayElements();
      setState(246);
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
  enterRule(_localctx, 24, TParser::RuleIndexArrayElements);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(255);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 7, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(250);
      generalValue();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(251);
      generalValue();
      setState(252);
      match(TParser::Separator);
      setState(253);
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
  enterRule(_localctx, 26, TParser::RuleAssociativeArray);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(263);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 8, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(257);
      match(TParser::OpenBlock);
      setState(258);
      match(TParser::CloseBlock);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(259);
      match(TParser::OpenBlock);
      setState(260);
      associativeArrayElements();
      setState(261);
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
  enterRule(_localctx, 28, TParser::RuleAssociativeArrayElements);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(274);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 9, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(265);
      match(TParser::Identifier);
      setState(266);
      match(TParser::TwoPoint);
      setState(267);
      generalValue();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(268);
      match(TParser::Identifier);
      setState(269);
      match(TParser::TwoPoint);
      setState(270);
      generalValue();
      setState(271);
      match(TParser::Separator);
      setState(272);
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
  enterRule(_localctx, 30, TParser::RuleOperationBlock);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(276);
    match(TParser::OpenOp);
    setState(277);
    operationElements();
    setState(278);
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
  enterRule(_localctx, 32, TParser::RuleOperationElements);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(284);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 10, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(280);
      operationValue();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(281);
      operationValue();
      setState(282);
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

tree::TerminalNode* TParser::OperationValueContext::Identifier() {
  return getToken(TParser::Identifier, 0);
}

tree::TerminalNode* TParser::OperationValueContext::ArithmeticOperator() {
  return getToken(TParser::ArithmeticOperator, 0);
}

tree::TerminalNode* TParser::OperationValueContext::TypeSpec() {
  return getToken(TParser::TypeSpec, 0);
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

TParser::FunctionCallContext* TParser::OperationValueContext::functionCall() {
  return getRuleContext<TParser::FunctionCallContext>(0);
}

TParser::OperationBlockContext* TParser::OperationValueContext::operationBlock() {
  return getRuleContext<TParser::OperationBlockContext>(0);
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
  enterRule(_localctx, 34, TParser::RuleOperationValue);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(363);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 11, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(286);
      match(TParser::Identifier);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(287);
      match(TParser::Identifier);
      setState(288);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(289);
      match(TParser::Identifier);
      setState(290);
      match(TParser::TypeSpec);
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(291);
      match(TParser::Identifier);
      setState(292);
      match(TParser::TypeSpec);
      setState(293);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 5: {
      enterOuterAlt(_localctx, 5);
      setState(294);
      firstIncDec();
      setState(295);
      match(TParser::Identifier);
      break;
    }

    case 6: {
      enterOuterAlt(_localctx, 6);
      setState(297);
      firstIncDec();
      setState(298);
      match(TParser::Identifier);
      setState(299);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 7: {
      enterOuterAlt(_localctx, 7);
      setState(301);
      firstIncDec();
      setState(302);
      match(TParser::Identifier);
      setState(303);
      match(TParser::TypeSpec);
      break;
    }

    case 8: {
      enterOuterAlt(_localctx, 8);
      setState(305);
      firstIncDec();
      setState(306);
      match(TParser::Identifier);
      setState(307);
      match(TParser::TypeSpec);
      setState(308);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 9: {
      enterOuterAlt(_localctx, 9);
      setState(310);
      match(TParser::Identifier);
      setState(311);
      lastIncDec();
      break;
    }

    case 10: {
      enterOuterAlt(_localctx, 10);
      setState(312);
      match(TParser::Identifier);
      setState(313);
      lastIncDec();
      setState(314);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 11: {
      enterOuterAlt(_localctx, 11);
      setState(316);
      match(TParser::Identifier);
      setState(317);
      lastIncDec();
      setState(318);
      match(TParser::TypeSpec);
      break;
    }

    case 12: {
      enterOuterAlt(_localctx, 12);
      setState(320);
      match(TParser::Identifier);
      setState(321);
      lastIncDec();
      setState(322);
      match(TParser::TypeSpec);
      setState(323);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 13: {
      enterOuterAlt(_localctx, 13);
      setState(325);
      match(TParser::Integer);
      break;
    }

    case 14: {
      enterOuterAlt(_localctx, 14);
      setState(326);
      match(TParser::Integer);
      setState(327);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 15: {
      enterOuterAlt(_localctx, 15);
      setState(328);
      match(TParser::Integer);
      setState(329);
      match(TParser::TypeSpec);
      break;
    }

    case 16: {
      enterOuterAlt(_localctx, 16);
      setState(330);
      match(TParser::Integer);
      setState(331);
      match(TParser::TypeSpec);
      setState(332);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 17: {
      enterOuterAlt(_localctx, 17);
      setState(333);
      match(TParser::Float);
      break;
    }

    case 18: {
      enterOuterAlt(_localctx, 18);
      setState(334);
      match(TParser::Float);
      setState(335);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 19: {
      enterOuterAlt(_localctx, 19);
      setState(336);
      match(TParser::Float);
      setState(337);
      match(TParser::TypeSpec);
      break;
    }

    case 20: {
      enterOuterAlt(_localctx, 20);
      setState(338);
      match(TParser::Float);
      setState(339);
      match(TParser::TypeSpec);
      setState(340);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 21: {
      enterOuterAlt(_localctx, 21);
      setState(341);
      functionCall();
      break;
    }

    case 22: {
      enterOuterAlt(_localctx, 22);
      setState(342);
      functionCall();
      setState(343);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 23: {
      enterOuterAlt(_localctx, 23);
      setState(345);
      functionCall();
      setState(346);
      match(TParser::TypeSpec);
      break;
    }

    case 24: {
      enterOuterAlt(_localctx, 24);
      setState(348);
      functionCall();
      setState(349);
      match(TParser::TypeSpec);
      setState(350);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 25: {
      enterOuterAlt(_localctx, 25);
      setState(352);
      operationBlock();
      break;
    }

    case 26: {
      enterOuterAlt(_localctx, 26);
      setState(353);
      operationBlock();
      setState(354);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 27: {
      enterOuterAlt(_localctx, 27);
      setState(356);
      operationBlock();
      setState(357);
      match(TParser::TypeSpec);
      break;
    }

    case 28: {
      enterOuterAlt(_localctx, 28);
      setState(359);
      operationBlock();
      setState(360);
      match(TParser::TypeSpec);
      setState(361);
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
  enterRule(_localctx, 36, TParser::RuleFirstIncDec);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(365);
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
  enterRule(_localctx, 38, TParser::RuleLastIncDec);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(367);
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
  enterRule(_localctx, 40, TParser::RuleCallingFunction);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(369);
    functionCall();
    setState(370);
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
  enterRule(_localctx, 42, TParser::RuleFunctionCall);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(384);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 12, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(372);
      match(TParser::Identifier);
      setState(373);
      functionCallParam();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(374);
      match(TParser::Identifier);
      setState(375);
      match(TParser::Point);
      setState(376);
      identifierB();
      setState(377);
      functionCallParam();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(379);
      match(TParser::Identifier);
      setState(380);
      match(TParser::TwoTwoPoint);
      setState(381);
      identifierB();
      setState(382);
      functionCallParam();
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
  enterRule(_localctx, 44, TParser::RuleIdentifierB);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(386);
    match(TParser::Identifier);
   
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
  enterRule(_localctx, 46, TParser::RuleFunctionCallParam);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(394);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 13, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(388);
      match(TParser::OpenOp);
      setState(389);
      match(TParser::CloseOp);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(390);
      match(TParser::OpenOp);
      setState(391);
      functionCallParamElements();
      setState(392);
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
  enterRule(_localctx, 48, TParser::RuleFunctionCallParamElements);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(406);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 14, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(396);
      generalValue();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(397);
      generalValue();
      setState(398);
      match(TParser::Separator);
      setState(399);
      functionCallParamElements();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(401);
      operationElements();
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(402);
      operationElements();
      setState(403);
      match(TParser::Separator);
      setState(404);
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

TParser::IfConditionsContext* TParser::ConditionalExpressionContext::ifConditions() {
  return getRuleContext<TParser::IfConditionsContext>(0);
}

TParser::ElifConditionsContext* TParser::ConditionalExpressionContext::elifConditions() {
  return getRuleContext<TParser::ElifConditionsContext>(0);
}

TParser::ElseConditionsContext* TParser::ConditionalExpressionContext::elseConditions() {
  return getRuleContext<TParser::ElseConditionsContext>(0);
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
  enterRule(_localctx, 50, TParser::RuleConditionalExpression);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(411);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case TParser::If: {
        enterOuterAlt(_localctx, 1);
        setState(408);
        ifConditions();
        break;
      }

      case TParser::Elif: {
        enterOuterAlt(_localctx, 2);
        setState(409);
        elifConditions();
        break;
      }

      case TParser::Else: {
        enterOuterAlt(_localctx, 3);
        setState(410);
        elseConditions();
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

//----------------- ConditionalBlockElementsContext ------------------------------------------------------------------

TParser::ConditionalBlockElementsContext::ConditionalBlockElementsContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::ConditionalExpressionContext* TParser::ConditionalBlockElementsContext::conditionalExpression() {
  return getRuleContext<TParser::ConditionalExpressionContext>(0);
}

TParser::ConditionalBlockElementsContext* TParser::ConditionalBlockElementsContext::conditionalBlockElements() {
  return getRuleContext<TParser::ConditionalBlockElementsContext>(0);
}

TParser::SentenceContext* TParser::ConditionalBlockElementsContext::sentence() {
  return getRuleContext<TParser::SentenceContext>(0);
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
  enterRule(_localctx, 52, TParser::RuleConditionalBlockElements);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(421);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 16, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(413);
      conditionalExpression();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(414);
      conditionalExpression();
      setState(415);
      conditionalBlockElements();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(417);
      sentence();
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(418);
      sentence();
      setState(419);
      conditionalBlockElements();
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

//----------------- IfConditionsContext ------------------------------------------------------------------

TParser::IfConditionsContext::IfConditionsContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::IfConditionsContext::If() {
  return getToken(TParser::If, 0);
}

TParser::ConditionalExpressionElementsContext* TParser::IfConditionsContext::conditionalExpressionElements() {
  return getRuleContext<TParser::ConditionalExpressionElementsContext>(0);
}

TParser::CallingFunctionContext* TParser::IfConditionsContext::callingFunction() {
  return getRuleContext<TParser::CallingFunctionContext>(0);
}

tree::TerminalNode* TParser::IfConditionsContext::OpenBlock() {
  return getToken(TParser::OpenBlock, 0);
}

tree::TerminalNode* TParser::IfConditionsContext::CloseBlock() {
  return getToken(TParser::CloseBlock, 0);
}

TParser::ConditionalBlockElementsContext* TParser::IfConditionsContext::conditionalBlockElements() {
  return getRuleContext<TParser::ConditionalBlockElementsContext>(0);
}

TParser::CondBlockElementsLimitedContext* TParser::IfConditionsContext::condBlockElementsLimited() {
  return getRuleContext<TParser::CondBlockElementsLimitedContext>(0);
}


size_t TParser::IfConditionsContext::getRuleIndex() const {
  return TParser::RuleIfConditions;
}

void TParser::IfConditionsContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterIfConditions(this);
}

void TParser::IfConditionsContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitIfConditions(this);
}


antlrcpp::Any TParser::IfConditionsContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitIfConditions(this);
  else
    return visitor->visitChildren(this);
}

TParser::IfConditionsContext* TParser::ifConditions() {
  IfConditionsContext *_localctx = _tracker.createInstance<IfConditionsContext>(_ctx, getState());
  enterRule(_localctx, 54, TParser::RuleIfConditions);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(442);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 17, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(423);
      match(TParser::If);
      setState(424);
      conditionalExpressionElements();
      setState(425);
      callingFunction();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(427);
      match(TParser::If);
      setState(428);
      conditionalExpressionElements();
      setState(429);
      match(TParser::OpenBlock);
      setState(430);
      match(TParser::CloseBlock);
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(432);
      match(TParser::If);
      setState(433);
      conditionalExpressionElements();
      setState(434);
      match(TParser::OpenBlock);
      setState(435);
      conditionalBlockElements();
      setState(436);
      match(TParser::CloseBlock);
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(438);
      match(TParser::If);
      setState(439);
      conditionalExpressionElements();
      setState(440);
      condBlockElementsLimited();
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

//----------------- ElifConditionsContext ------------------------------------------------------------------

TParser::ElifConditionsContext::ElifConditionsContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::ElifConditionsContext::Elif() {
  return getToken(TParser::Elif, 0);
}

TParser::ConditionalExpressionElementsContext* TParser::ElifConditionsContext::conditionalExpressionElements() {
  return getRuleContext<TParser::ConditionalExpressionElementsContext>(0);
}

TParser::CallingFunctionContext* TParser::ElifConditionsContext::callingFunction() {
  return getRuleContext<TParser::CallingFunctionContext>(0);
}

tree::TerminalNode* TParser::ElifConditionsContext::OpenBlock() {
  return getToken(TParser::OpenBlock, 0);
}

tree::TerminalNode* TParser::ElifConditionsContext::CloseBlock() {
  return getToken(TParser::CloseBlock, 0);
}

TParser::ConditionalBlockElementsContext* TParser::ElifConditionsContext::conditionalBlockElements() {
  return getRuleContext<TParser::ConditionalBlockElementsContext>(0);
}

TParser::CondBlockElementsLimitedContext* TParser::ElifConditionsContext::condBlockElementsLimited() {
  return getRuleContext<TParser::CondBlockElementsLimitedContext>(0);
}


size_t TParser::ElifConditionsContext::getRuleIndex() const {
  return TParser::RuleElifConditions;
}

void TParser::ElifConditionsContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterElifConditions(this);
}

void TParser::ElifConditionsContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitElifConditions(this);
}


antlrcpp::Any TParser::ElifConditionsContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitElifConditions(this);
  else
    return visitor->visitChildren(this);
}

TParser::ElifConditionsContext* TParser::elifConditions() {
  ElifConditionsContext *_localctx = _tracker.createInstance<ElifConditionsContext>(_ctx, getState());
  enterRule(_localctx, 56, TParser::RuleElifConditions);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(463);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 18, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(444);
      match(TParser::Elif);
      setState(445);
      conditionalExpressionElements();
      setState(446);
      callingFunction();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(448);
      match(TParser::Elif);
      setState(449);
      conditionalExpressionElements();
      setState(450);
      match(TParser::OpenBlock);
      setState(451);
      match(TParser::CloseBlock);
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(453);
      match(TParser::Elif);
      setState(454);
      conditionalExpressionElements();
      setState(455);
      match(TParser::OpenBlock);
      setState(456);
      conditionalBlockElements();
      setState(457);
      match(TParser::CloseBlock);
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(459);
      match(TParser::Elif);
      setState(460);
      conditionalExpressionElements();
      setState(461);
      condBlockElementsLimited();
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

//----------------- ElseConditionsContext ------------------------------------------------------------------

TParser::ElseConditionsContext::ElseConditionsContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::ElseConditionsContext::Else() {
  return getToken(TParser::Else, 0);
}

TParser::CallingFunctionContext* TParser::ElseConditionsContext::callingFunction() {
  return getRuleContext<TParser::CallingFunctionContext>(0);
}

tree::TerminalNode* TParser::ElseConditionsContext::OpenBlock() {
  return getToken(TParser::OpenBlock, 0);
}

tree::TerminalNode* TParser::ElseConditionsContext::CloseBlock() {
  return getToken(TParser::CloseBlock, 0);
}

TParser::ConditionalBlockElementsContext* TParser::ElseConditionsContext::conditionalBlockElements() {
  return getRuleContext<TParser::ConditionalBlockElementsContext>(0);
}

TParser::CondBlockElementsLimitedContext* TParser::ElseConditionsContext::condBlockElementsLimited() {
  return getRuleContext<TParser::CondBlockElementsLimitedContext>(0);
}


size_t TParser::ElseConditionsContext::getRuleIndex() const {
  return TParser::RuleElseConditions;
}

void TParser::ElseConditionsContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterElseConditions(this);
}

void TParser::ElseConditionsContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitElseConditions(this);
}


antlrcpp::Any TParser::ElseConditionsContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitElseConditions(this);
  else
    return visitor->visitChildren(this);
}

TParser::ElseConditionsContext* TParser::elseConditions() {
  ElseConditionsContext *_localctx = _tracker.createInstance<ElseConditionsContext>(_ctx, getState());
  enterRule(_localctx, 58, TParser::RuleElseConditions);

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
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 19, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(465);
      match(TParser::Else);
      setState(466);
      callingFunction();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(467);
      match(TParser::Else);
      setState(468);
      match(TParser::OpenBlock);
      setState(469);
      match(TParser::CloseBlock);
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(470);
      match(TParser::Else);
      setState(471);
      match(TParser::OpenBlock);
      setState(472);
      conditionalBlockElements();
      setState(473);
      match(TParser::CloseBlock);
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(475);
      match(TParser::Else);
      setState(476);
      condBlockElementsLimited();
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

//----------------- CondBlockElementsLimitedContext ------------------------------------------------------------------

TParser::CondBlockElementsLimitedContext::CondBlockElementsLimitedContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::IfConditionsContext* TParser::CondBlockElementsLimitedContext::ifConditions() {
  return getRuleContext<TParser::IfConditionsContext>(0);
}

TParser::ConditionalBlockElementsContext* TParser::CondBlockElementsLimitedContext::conditionalBlockElements() {
  return getRuleContext<TParser::ConditionalBlockElementsContext>(0);
}

TParser::LoopContext* TParser::CondBlockElementsLimitedContext::loop() {
  return getRuleContext<TParser::LoopContext>(0);
}

TParser::CondBlockElementsLimitedContext* TParser::CondBlockElementsLimitedContext::condBlockElementsLimited() {
  return getRuleContext<TParser::CondBlockElementsLimitedContext>(0);
}

TParser::RetContext* TParser::CondBlockElementsLimitedContext::ret() {
  return getRuleContext<TParser::RetContext>(0);
}


size_t TParser::CondBlockElementsLimitedContext::getRuleIndex() const {
  return TParser::RuleCondBlockElementsLimited;
}

void TParser::CondBlockElementsLimitedContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterCondBlockElementsLimited(this);
}

void TParser::CondBlockElementsLimitedContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitCondBlockElementsLimited(this);
}


antlrcpp::Any TParser::CondBlockElementsLimitedContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitCondBlockElementsLimited(this);
  else
    return visitor->visitChildren(this);
}

TParser::CondBlockElementsLimitedContext* TParser::condBlockElementsLimited() {
  CondBlockElementsLimitedContext *_localctx = _tracker.createInstance<CondBlockElementsLimitedContext>(_ctx, getState());
  enterRule(_localctx, 60, TParser::RuleCondBlockElementsLimited);

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
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 20, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(479);
      ifConditions();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(480);
      ifConditions();
      setState(481);
      conditionalBlockElements();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(483);
      loop();
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(484);
      loop();
      setState(485);
      condBlockElementsLimited();
      break;
    }

    case 5: {
      enterOuterAlt(_localctx, 5);
      setState(487);
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

//----------------- ConditionalExpressionElementsContext ------------------------------------------------------------------

TParser::ConditionalExpressionElementsContext::ConditionalExpressionElementsContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::ConditionalExpElementsValueContext* TParser::ConditionalExpressionElementsContext::conditionalExpElementsValue() {
  return getRuleContext<TParser::ConditionalExpElementsValueContext>(0);
}

TParser::ConditionalExpressionElementsContext* TParser::ConditionalExpressionElementsContext::conditionalExpressionElements() {
  return getRuleContext<TParser::ConditionalExpressionElementsContext>(0);
}

TParser::ConditionExpBlockContext* TParser::ConditionalExpressionElementsContext::conditionExpBlock() {
  return getRuleContext<TParser::ConditionExpBlockContext>(0);
}

tree::TerminalNode* TParser::ConditionalExpressionElementsContext::Not() {
  return getToken(TParser::Not, 0);
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
  enterRule(_localctx, 62, TParser::RuleConditionalExpressionElements);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(500);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 21, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(490);
      conditionalExpElementsValue();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(491);
      conditionalExpElementsValue();
      setState(492);
      conditionalExpressionElements();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(494);
      conditionExpBlock(0);
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(495);
      conditionExpBlock(0);
      setState(496);
      conditionalExpressionElements();
      break;
    }

    case 5: {
      enterOuterAlt(_localctx, 5);
      setState(498);
      match(TParser::Not);
      setState(499);
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

//----------------- ConditionalExpElementsValueContext ------------------------------------------------------------------

TParser::ConditionalExpElementsValueContext::ConditionalExpElementsValueContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::ConditionalExpValueContext* TParser::ConditionalExpElementsValueContext::conditionalExpValue() {
  return getRuleContext<TParser::ConditionalExpValueContext>(0);
}

TParser::ConditionalExpElementsValueContext* TParser::ConditionalExpElementsValueContext::conditionalExpElementsValue() {
  return getRuleContext<TParser::ConditionalExpElementsValueContext>(0);
}


size_t TParser::ConditionalExpElementsValueContext::getRuleIndex() const {
  return TParser::RuleConditionalExpElementsValue;
}

void TParser::ConditionalExpElementsValueContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterConditionalExpElementsValue(this);
}

void TParser::ConditionalExpElementsValueContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitConditionalExpElementsValue(this);
}


antlrcpp::Any TParser::ConditionalExpElementsValueContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitConditionalExpElementsValue(this);
  else
    return visitor->visitChildren(this);
}

TParser::ConditionalExpElementsValueContext* TParser::conditionalExpElementsValue() {
  ConditionalExpElementsValueContext *_localctx = _tracker.createInstance<ConditionalExpElementsValueContext>(_ctx, getState());
  enterRule(_localctx, 64, TParser::RuleConditionalExpElementsValue);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(506);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 22, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(502);
      conditionalExpValue();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(503);
      conditionalExpValue();
      setState(504);
      conditionalExpElementsValue();
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

//----------------- ConditionExpBlockContext ------------------------------------------------------------------

TParser::ConditionExpBlockContext::ConditionExpBlockContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::ConditionExpBlockContext::OpenOp() {
  return getToken(TParser::OpenOp, 0);
}

TParser::ConditionalExpressionElementsContext* TParser::ConditionExpBlockContext::conditionalExpressionElements() {
  return getRuleContext<TParser::ConditionalExpressionElementsContext>(0);
}

tree::TerminalNode* TParser::ConditionExpBlockContext::CloseOp() {
  return getToken(TParser::CloseOp, 0);
}

TParser::ConditionExpBlockContext* TParser::ConditionExpBlockContext::conditionExpBlock() {
  return getRuleContext<TParser::ConditionExpBlockContext>(0);
}

tree::TerminalNode* TParser::ConditionExpBlockContext::AssignmentOperator() {
  return getToken(TParser::AssignmentOperator, 0);
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
   return conditionExpBlock(0);
}

TParser::ConditionExpBlockContext* TParser::conditionExpBlock(int precedence) {
  ParserRuleContext *parentContext = _ctx;
  size_t parentState = getState();
  TParser::ConditionExpBlockContext *_localctx = _tracker.createInstance<ConditionExpBlockContext>(_ctx, parentState);
  TParser::ConditionExpBlockContext *previousContext = _localctx;
  (void)previousContext; // Silence compiler, in case the context is not used by generated code.
  size_t startState = 66;
  enterRecursionRule(_localctx, 66, TParser::RuleConditionExpBlock, precedence);

    

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    unrollRecursionContexts(parentContext);
  });
  try {
    size_t alt;
    enterOuterAlt(_localctx, 1);
    setState(509);
    match(TParser::OpenOp);
    setState(510);
    conditionalExpressionElements();
    setState(511);
    match(TParser::CloseOp);
    _ctx->stop = _input->LT(-1);
    setState(517);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 23, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        if (!_parseListeners.empty())
          triggerExitRuleEvent();
        previousContext = _localctx;
        _localctx = _tracker.createInstance<ConditionExpBlockContext>(parentContext, parentState);
        pushNewRecursionContext(_localctx, startState, RuleConditionExpBlock);
        setState(513);

        if (!(precpred(_ctx, 1))) throw FailedPredicateException(this, "precpred(_ctx, 1)");
        setState(514);
        match(TParser::AssignmentOperator); 
      }
      setState(519);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 23, _ctx);
    }
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

TParser::FirstIncDecContext* TParser::ConditionalExpValueContext::firstIncDec() {
  return getRuleContext<TParser::FirstIncDecContext>(0);
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

TParser::FunctionCallContext* TParser::ConditionalExpValueContext::functionCall() {
  return getRuleContext<TParser::FunctionCallContext>(0);
}

tree::TerminalNode* TParser::ConditionalExpValueContext::Attr() {
  return getToken(TParser::Attr, 0);
}

TParser::OperationBlockContext* TParser::ConditionalExpValueContext::operationBlock() {
  return getRuleContext<TParser::OperationBlockContext>(0);
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
  enterRule(_localctx, 68, TParser::RuleConditionalExpValue);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(616);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 24, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(520);
      match(TParser::Identifier);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(521);
      match(TParser::Identifier);
      setState(522);
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
      setState(523);
      match(TParser::Identifier);
      setState(524);
      match(TParser::TypeSpec);
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(525);
      match(TParser::Identifier);
      setState(526);
      match(TParser::TypeSpec);
      setState(527);
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
      setState(528);
      firstIncDec();
      setState(529);
      match(TParser::Identifier);
      break;
    }

    case 6: {
      enterOuterAlt(_localctx, 6);
      setState(531);
      firstIncDec();
      setState(532);
      match(TParser::Identifier);
      setState(533);
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
      setState(535);
      firstIncDec();
      setState(536);
      match(TParser::Identifier);
      setState(537);
      match(TParser::TypeSpec);
      break;
    }

    case 8: {
      enterOuterAlt(_localctx, 8);
      setState(539);
      firstIncDec();
      setState(540);
      match(TParser::Identifier);
      setState(541);
      match(TParser::TypeSpec);
      setState(542);
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
      setState(544);
      match(TParser::Identifier);
      setState(545);
      lastIncDec();
      break;
    }

    case 10: {
      enterOuterAlt(_localctx, 10);
      setState(546);
      match(TParser::Identifier);
      setState(547);
      lastIncDec();
      setState(548);
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
      setState(550);
      match(TParser::Identifier);
      setState(551);
      lastIncDec();
      setState(552);
      match(TParser::TypeSpec);
      break;
    }

    case 12: {
      enterOuterAlt(_localctx, 12);
      setState(554);
      match(TParser::Identifier);
      setState(555);
      lastIncDec();
      setState(556);
      match(TParser::TypeSpec);
      setState(557);
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
      setState(559);
      match(TParser::Integer);
      break;
    }

    case 14: {
      enterOuterAlt(_localctx, 14);
      setState(560);
      match(TParser::Integer);
      setState(561);
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
      setState(562);
      match(TParser::Integer);
      setState(563);
      match(TParser::TypeSpec);
      break;
    }

    case 16: {
      enterOuterAlt(_localctx, 16);
      setState(564);
      match(TParser::Integer);
      setState(565);
      match(TParser::TypeSpec);
      setState(566);
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
      setState(567);
      match(TParser::Float);
      break;
    }

    case 18: {
      enterOuterAlt(_localctx, 18);
      setState(568);
      match(TParser::Float);
      setState(569);
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

    case 19: {
      enterOuterAlt(_localctx, 19);
      setState(570);
      match(TParser::Float);
      setState(571);
      match(TParser::TypeSpec);
      break;
    }

    case 20: {
      enterOuterAlt(_localctx, 20);
      setState(572);
      match(TParser::Float);
      setState(573);
      match(TParser::TypeSpec);
      setState(574);
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

    case 21: {
      enterOuterAlt(_localctx, 21);
      setState(575);
      functionCall();
      break;
    }

    case 22: {
      enterOuterAlt(_localctx, 22);
      setState(576);
      functionCall();
      setState(577);
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

    case 23: {
      enterOuterAlt(_localctx, 23);
      setState(579);
      functionCall();
      setState(580);
      match(TParser::TypeSpec);
      break;
    }

    case 24: {
      enterOuterAlt(_localctx, 24);
      setState(582);
      functionCall();
      setState(583);
      match(TParser::TypeSpec);
      setState(584);
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

    case 25: {
      enterOuterAlt(_localctx, 25);
      setState(586);
      match(TParser::Identifier);
      setState(587);
      match(TParser::Attr);
      setState(588);
      functionCall();
      break;
    }

    case 26: {
      enterOuterAlt(_localctx, 26);
      setState(589);
      match(TParser::Identifier);
      setState(590);
      match(TParser::Attr);
      setState(591);
      functionCall();
      setState(592);
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

    case 27: {
      enterOuterAlt(_localctx, 27);
      setState(594);
      match(TParser::Identifier);
      setState(595);
      match(TParser::Attr);
      setState(596);
      functionCall();
      setState(597);
      match(TParser::TypeSpec);
      break;
    }

    case 28: {
      enterOuterAlt(_localctx, 28);
      setState(599);
      match(TParser::Identifier);
      setState(600);
      match(TParser::Attr);
      setState(601);
      functionCall();
      setState(602);
      match(TParser::TypeSpec);
      setState(603);
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

    case 29: {
      enterOuterAlt(_localctx, 29);
      setState(605);
      operationBlock();
      break;
    }

    case 30: {
      enterOuterAlt(_localctx, 30);
      setState(606);
      operationBlock();
      setState(607);
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

    case 31: {
      enterOuterAlt(_localctx, 31);
      setState(609);
      operationBlock();
      setState(610);
      match(TParser::TypeSpec);
      break;
    }

    case 32: {
      enterOuterAlt(_localctx, 32);
      setState(612);
      operationBlock();
      setState(613);
      match(TParser::TypeSpec);
      setState(614);
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

tree::TerminalNode* TParser::LoopContext::For() {
  return getToken(TParser::For, 0);
}

TParser::LoopExpressionContext* TParser::LoopContext::loopExpression() {
  return getRuleContext<TParser::LoopExpressionContext>(0);
}

tree::TerminalNode* TParser::LoopContext::OpenBlock() {
  return getToken(TParser::OpenBlock, 0);
}

tree::TerminalNode* TParser::LoopContext::CloseBlock() {
  return getToken(TParser::CloseBlock, 0);
}

TParser::LoopBlockElementsContext* TParser::LoopContext::loopBlockElements() {
  return getRuleContext<TParser::LoopBlockElementsContext>(0);
}

TParser::CallingFunctionContext* TParser::LoopContext::callingFunction() {
  return getRuleContext<TParser::CallingFunctionContext>(0);
}

TParser::LoopBlockElementsLimitedContext* TParser::LoopContext::loopBlockElementsLimited() {
  return getRuleContext<TParser::LoopBlockElementsLimitedContext>(0);
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
  enterRule(_localctx, 70, TParser::RuleLoop);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(637);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 25, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(618);
      match(TParser::For);
      setState(619);
      loopExpression();
      setState(620);
      match(TParser::OpenBlock);
      setState(621);
      match(TParser::CloseBlock);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(623);
      match(TParser::For);
      setState(624);
      loopExpression();
      setState(625);
      match(TParser::OpenBlock);
      setState(626);
      loopBlockElements();
      setState(627);
      match(TParser::CloseBlock);
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(629);
      match(TParser::For);
      setState(630);
      loopExpression();
      setState(631);
      callingFunction();
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(633);
      match(TParser::For);
      setState(634);
      loopExpression();
      setState(635);
      loopBlockElementsLimited();
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

//----------------- LoopExpressionContext ------------------------------------------------------------------

TParser::LoopExpressionContext::LoopExpressionContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::LoopExpressionContext::OpenOp() {
  return getToken(TParser::OpenOp, 0);
}

TParser::LoopOneMembersContext* TParser::LoopExpressionContext::loopOneMembers() {
  return getRuleContext<TParser::LoopOneMembersContext>(0);
}

std::vector<tree::TerminalNode *> TParser::LoopExpressionContext::End() {
  return getTokens(TParser::End);
}

tree::TerminalNode* TParser::LoopExpressionContext::End(size_t i) {
  return getToken(TParser::End, i);
}

TParser::LoopTwoMembersContext* TParser::LoopExpressionContext::loopTwoMembers() {
  return getRuleContext<TParser::LoopTwoMembersContext>(0);
}

TParser::LoopThreeMembersContext* TParser::LoopExpressionContext::loopThreeMembers() {
  return getRuleContext<TParser::LoopThreeMembersContext>(0);
}

tree::TerminalNode* TParser::LoopExpressionContext::CloseOp() {
  return getToken(TParser::CloseOp, 0);
}

TParser::ConditionalExpressionElementsContext* TParser::LoopExpressionContext::conditionalExpressionElements() {
  return getRuleContext<TParser::ConditionalExpressionElementsContext>(0);
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
  enterRule(_localctx, 72, TParser::RuleLoopExpression);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(657);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 26, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(639);
      match(TParser::OpenOp);
      setState(640);
      loopOneMembers();
      setState(641);
      match(TParser::End);
      setState(642);
      loopTwoMembers();
      setState(643);
      match(TParser::End);
      setState(644);
      loopThreeMembers();
      setState(645);
      match(TParser::CloseOp);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(647);
      loopOneMembers();
      setState(648);
      match(TParser::End);
      setState(649);
      loopTwoMembers();
      setState(650);
      match(TParser::End);
      setState(651);
      loopThreeMembers();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(653);
      conditionalExpressionElements();
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(654);
      match(TParser::OpenOp);
      setState(655);
      match(TParser::CloseOp);
      break;
    }

    case 5: {
      enterOuterAlt(_localctx, 5);

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

//----------------- LoopOneMembersContext ------------------------------------------------------------------

TParser::LoopOneMembersContext::LoopOneMembersContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::VariableMembersContext* TParser::LoopOneMembersContext::variableMembers() {
  return getRuleContext<TParser::VariableMembersContext>(0);
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
  enterRule(_localctx, 74, TParser::RuleLoopOneMembers);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(661);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case TParser::Identifier: {
        enterOuterAlt(_localctx, 1);
        setState(659);
        variableMembers();
        break;
      }

      case TParser::End: {
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
  enterRule(_localctx, 76, TParser::RuleLoopTwoMembers);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(665);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case TParser::OpenOp:
      case TParser::Not:
      case TParser::IncDecOperators:
      case TParser::Identifier:
      case TParser::Integer:
      case TParser::Float: {
        enterOuterAlt(_localctx, 1);
        setState(663);
        conditionalExpressionElements();
        break;
      }

      case TParser::End: {
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
  enterRule(_localctx, 78, TParser::RuleLoopThreeMembers);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(669);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 29, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(667);
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

TParser::OperationBlockContext* TParser::LoopThreeMembersValuesContext::operationBlock() {
  return getRuleContext<TParser::OperationBlockContext>(0);
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
  enterRule(_localctx, 80, TParser::RuleLoopThreeMembersValues);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(681);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 30, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(671);
      operationElements();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(672);
      operationBlock();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(673);
      operationElements();
      setState(674);
      match(TParser::Separator);
      setState(675);
      loopThreeMembersValues();
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(677);
      operationBlock();
      setState(678);
      match(TParser::Separator);
      setState(679);
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
  enterRule(_localctx, 82, TParser::RuleLoopBlockElements);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(687);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 31, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(683);
      sentence();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(684);
      sentence();
      setState(685);
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

TParser::IfConditionsContext* TParser::LoopBlockElementsLimitedContext::ifConditions() {
  return getRuleContext<TParser::IfConditionsContext>(0);
}

TParser::LoopBlockElementsLimitedContext* TParser::LoopBlockElementsLimitedContext::loopBlockElementsLimited() {
  return getRuleContext<TParser::LoopBlockElementsLimitedContext>(0);
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
  enterRule(_localctx, 84, TParser::RuleLoopBlockElementsLimited);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(698);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 32, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(689);
      ifConditions();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(690);
      ifConditions();
      setState(691);
      loopBlockElementsLimited();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(693);
      loop();
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(694);
      loop();
      setState(695);
      loopBlockElementsLimited();
      break;
    }

    case 5: {
      enterOuterAlt(_localctx, 5);
      setState(697);
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
  enterRule(_localctx, 86, TParser::RuleRet);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(700);
    match(TParser::Ret);
    setState(701);
    retValues();
    setState(702);
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

TParser::OperationBlockContext* TParser::RetValuesContext::operationBlock() {
  return getRuleContext<TParser::OperationBlockContext>(0);
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
  enterRule(_localctx, 88, TParser::RuleRetValues);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(707);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 33, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(704);
      generalValue();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(705);
      operationElements();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(706);
      operationBlock();
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
  enterRule(_localctx, 90, TParser::RuleFunctions);

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
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 34, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(709);
      functionsModes();
      setState(710);
      match(TParser::OpenBlock);
      setState(711);
      match(TParser::CloseBlock);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(713);
      functionsModes();
      setState(714);
      match(TParser::OpenBlock);
      setState(715);
      functionCodeBlock();
      setState(716);
      match(TParser::CloseBlock);
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(718);
      functionMethodsModes();
      setState(719);
      match(TParser::OpenBlock);
      setState(720);
      match(TParser::CloseBlock);
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(722);
      functionMethodsModes();
      setState(723);
      match(TParser::OpenBlock);
      setState(724);
      functionCodeBlock();
      setState(725);
      match(TParser::CloseBlock);
      break;
    }

    case 5: {
      enterOuterAlt(_localctx, 5);
      setState(727);
      constructClassMethod();
      setState(728);
      match(TParser::OpenBlock);
      setState(729);
      match(TParser::CloseBlock);
      break;
    }

    case 6: {
      enterOuterAlt(_localctx, 6);
      setState(731);
      constructClassMethod();
      setState(732);
      match(TParser::OpenBlock);
      setState(733);
      functionCodeBlock();
      setState(734);
      match(TParser::CloseBlock);
      break;
    }

    case 7: {
      enterOuterAlt(_localctx, 7);
      setState(736);
      interfaceMethod();
      setState(737);
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

//----------------- FunctionGeneralModesContext ------------------------------------------------------------------

TParser::FunctionGeneralModesContext::FunctionGeneralModesContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::FunctionGeneralModesContext::Function() {
  return getToken(TParser::Function, 0);
}

std::vector<tree::TerminalNode *> TParser::FunctionGeneralModesContext::Identifier() {
  return getTokens(TParser::Identifier);
}

tree::TerminalNode* TParser::FunctionGeneralModesContext::Identifier(size_t i) {
  return getToken(TParser::Identifier, i);
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
  enterRule(_localctx, 92, TParser::RuleFunctionGeneralModes);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(765);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 35, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(741);
      match(TParser::Function);
      setState(742);
      match(TParser::Identifier);
      setState(743);
      match(TParser::OpenOp);
      setState(744);
      match(TParser::CloseOp);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(745);
      match(TParser::Function);
      setState(746);
      match(TParser::Identifier);
      setState(747);
      match(TParser::OpenOp);
      setState(748);
      match(TParser::CloseOp);
      setState(749);
      match(TParser::ArrowRight);
      setState(750);
      match(TParser::Identifier);
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(751);
      match(TParser::Function);
      setState(752);
      match(TParser::Identifier);
      setState(753);
      match(TParser::OpenOp);
      setState(754);
      functionParams();
      setState(755);
      match(TParser::CloseOp);
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(757);
      match(TParser::Function);
      setState(758);
      match(TParser::Identifier);
      setState(759);
      match(TParser::OpenOp);
      setState(760);
      functionParams();
      setState(761);
      match(TParser::CloseOp);
      setState(762);
      match(TParser::ArrowRight);
      setState(763);
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
  enterRule(_localctx, 94, TParser::RuleFunctionsModes);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(767);
    functionGeneralModes();
   
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

TParser::MethodPermContext* TParser::FunctionMethodsModesContext::methodPerm() {
  return getRuleContext<TParser::MethodPermContext>(0);
}

TParser::FunctionGeneralModesContext* TParser::FunctionMethodsModesContext::functionGeneralModes() {
  return getRuleContext<TParser::FunctionGeneralModesContext>(0);
}

tree::TerminalNode* TParser::FunctionMethodsModesContext::Static() {
  return getToken(TParser::Static, 0);
}

tree::TerminalNode* TParser::FunctionMethodsModesContext::Final() {
  return getToken(TParser::Final, 0);
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
  enterRule(_localctx, 96, TParser::RuleFunctionMethodsModes);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(792);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 36, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(769);
      methodPerm();
      setState(770);
      functionGeneralModes();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(772);
      match(TParser::Static);
      setState(773);
      functionGeneralModes();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(774);
      methodPerm();
      setState(775);
      match(TParser::Static);
      setState(776);
      functionGeneralModes();
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(778);
      match(TParser::Final);
      setState(779);
      methodPerm();
      setState(780);
      match(TParser::Static);
      setState(781);
      functionGeneralModes();
      break;
    }

    case 5: {
      enterOuterAlt(_localctx, 5);
      setState(783);
      match(TParser::Final);
      setState(784);
      methodPerm();
      setState(785);
      functionGeneralModes();
      break;
    }

    case 6: {
      enterOuterAlt(_localctx, 6);
      setState(787);
      match(TParser::Final);
      setState(788);
      functionGeneralModes();
      break;
    }

    case 7: {
      enterOuterAlt(_localctx, 7);
      setState(789);
      match(TParser::Final);
      setState(790);
      match(TParser::Static);
      setState(791);
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
  enterRule(_localctx, 98, TParser::RuleMethodPerm);
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
    setState(794);
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
  enterRule(_localctx, 100, TParser::RuleConstructClassMethod);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(804);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 37, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(796);
      match(TParser::Identifier);
      setState(797);
      match(TParser::OpenOp);
      setState(798);
      match(TParser::CloseOp);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(799);
      match(TParser::Identifier);
      setState(800);
      match(TParser::OpenOp);
      setState(801);
      functionParams();
      setState(802);
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
  enterRule(_localctx, 102, TParser::RuleInterfaceMethod);

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
    switch (_input->LA(1)) {
      case TParser::Function: {
        enterOuterAlt(_localctx, 1);
        setState(806);
        functionsModes();
        break;
      }

      case TParser::Pub:
      case TParser::Pro:
      case TParser::Priv:
      case TParser::Static:
      case TParser::Final: {
        enterOuterAlt(_localctx, 2);
        setState(807);
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

TParser::SentenceContext* TParser::FunctionCodeBlockContext::sentence() {
  return getRuleContext<TParser::SentenceContext>(0);
}

TParser::FunctionCodeBlockContext* TParser::FunctionCodeBlockContext::functionCodeBlock() {
  return getRuleContext<TParser::FunctionCodeBlockContext>(0);
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
  enterRule(_localctx, 104, TParser::RuleFunctionCodeBlock);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(814);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 39, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(810);
      sentence();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(811);
      sentence();
      setState(812);
      functionCodeBlock();
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

TParser::FunctionParamElementsContext* TParser::FunctionParamsContext::functionParamElements() {
  return getRuleContext<TParser::FunctionParamElementsContext>(0);
}

tree::TerminalNode* TParser::FunctionParamsContext::Separator() {
  return getToken(TParser::Separator, 0);
}

TParser::FunctionParamsContext* TParser::FunctionParamsContext::functionParams() {
  return getRuleContext<TParser::FunctionParamsContext>(0);
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
  enterRule(_localctx, 106, TParser::RuleFunctionParams);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(821);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 40, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(816);
      functionParamElements();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(817);
      functionParamElements();
      setState(818);
      match(TParser::Separator);
      setState(819);
      functionParams();
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
  enterRule(_localctx, 108, TParser::RuleFunctionParamElements);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(823);
    match(TParser::Identifier);
    setState(824);
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
  enterRule(_localctx, 110, TParser::RuleOopGeneral);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(829);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case TParser::Interface: {
        enterOuterAlt(_localctx, 1);
        setState(826);
        interfaceClass();
        break;
      }

      case TParser::Abstract: {
        enterOuterAlt(_localctx, 2);
        setState(827);
        abstractClass();
        break;
      }

      case TParser::Final:
      case TParser::Class: {
        enterOuterAlt(_localctx, 3);
        setState(828);
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
  enterRule(_localctx, 112, TParser::RuleInterfaceClass);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(831);
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

std::vector<tree::TerminalNode *> TParser::InterfaceClassDefinitionContext::Identifier() {
  return getTokens(TParser::Identifier);
}

tree::TerminalNode* TParser::InterfaceClassDefinitionContext::Identifier(size_t i) {
  return getToken(TParser::Identifier, i);
}

tree::TerminalNode* TParser::InterfaceClassDefinitionContext::OpenBlock() {
  return getToken(TParser::OpenBlock, 0);
}

tree::TerminalNode* TParser::InterfaceClassDefinitionContext::CloseBlock() {
  return getToken(TParser::CloseBlock, 0);
}

TParser::FunctionCodeBlockContext* TParser::InterfaceClassDefinitionContext::functionCodeBlock() {
  return getRuleContext<TParser::FunctionCodeBlockContext>(0);
}

tree::TerminalNode* TParser::InterfaceClassDefinitionContext::Extends() {
  return getToken(TParser::Extends, 0);
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
  enterRule(_localctx, 114, TParser::RuleInterfaceClassDefinition);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(857);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 42, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(833);
      match(TParser::Interface);
      setState(834);
      match(TParser::Identifier);
      setState(835);
      match(TParser::OpenBlock);
      setState(836);
      match(TParser::CloseBlock);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(837);
      match(TParser::Interface);
      setState(838);
      match(TParser::Identifier);
      setState(839);
      match(TParser::OpenBlock);
      setState(840);
      functionCodeBlock();
      setState(841);
      match(TParser::CloseBlock);
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(843);
      match(TParser::Interface);
      setState(844);
      match(TParser::Identifier);
      setState(845);
      match(TParser::Extends);
      setState(846);
      match(TParser::Identifier);
      setState(847);
      match(TParser::OpenBlock);
      setState(848);
      match(TParser::CloseBlock);
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(849);
      match(TParser::Interface);
      setState(850);
      match(TParser::Identifier);
      setState(851);
      match(TParser::Extends);
      setState(852);
      match(TParser::Identifier);
      setState(853);
      match(TParser::OpenBlock);
      setState(854);
      functionCodeBlock();
      setState(855);
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
  enterRule(_localctx, 116, TParser::RuleAbstractClass);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(859);
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

std::vector<tree::TerminalNode *> TParser::AbstractClassDefinitionContext::Identifier() {
  return getTokens(TParser::Identifier);
}

tree::TerminalNode* TParser::AbstractClassDefinitionContext::Identifier(size_t i) {
  return getToken(TParser::Identifier, i);
}

tree::TerminalNode* TParser::AbstractClassDefinitionContext::OpenBlock() {
  return getToken(TParser::OpenBlock, 0);
}

tree::TerminalNode* TParser::AbstractClassDefinitionContext::CloseBlock() {
  return getToken(TParser::CloseBlock, 0);
}

TParser::FunctionCodeBlockContext* TParser::AbstractClassDefinitionContext::functionCodeBlock() {
  return getRuleContext<TParser::FunctionCodeBlockContext>(0);
}

tree::TerminalNode* TParser::AbstractClassDefinitionContext::Extends() {
  return getToken(TParser::Extends, 0);
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
  enterRule(_localctx, 118, TParser::RuleAbstractClassDefinition);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(885);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 43, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(861);
      match(TParser::Abstract);
      setState(862);
      match(TParser::Identifier);
      setState(863);
      match(TParser::OpenBlock);
      setState(864);
      match(TParser::CloseBlock);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(865);
      match(TParser::Abstract);
      setState(866);
      match(TParser::Identifier);
      setState(867);
      match(TParser::OpenBlock);
      setState(868);
      functionCodeBlock();
      setState(869);
      match(TParser::CloseBlock);
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(871);
      match(TParser::Abstract);
      setState(872);
      match(TParser::Identifier);
      setState(873);
      match(TParser::Extends);
      setState(874);
      match(TParser::Identifier);
      setState(875);
      match(TParser::OpenBlock);
      setState(876);
      match(TParser::CloseBlock);
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(877);
      match(TParser::Abstract);
      setState(878);
      match(TParser::Identifier);
      setState(879);
      match(TParser::Extends);
      setState(880);
      match(TParser::Identifier);
      setState(881);
      match(TParser::OpenBlock);
      setState(882);
      functionCodeBlock();
      setState(883);
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

//----------------- ClassDefinationContext ------------------------------------------------------------------

TParser::ClassDefinationContext::ClassDefinationContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::ClassModesGeneralContext* TParser::ClassDefinationContext::classModesGeneral() {
  return getRuleContext<TParser::ClassModesGeneralContext>(0);
}

tree::TerminalNode* TParser::ClassDefinationContext::OpenBlock() {
  return getToken(TParser::OpenBlock, 0);
}

tree::TerminalNode* TParser::ClassDefinationContext::CloseBlock() {
  return getToken(TParser::CloseBlock, 0);
}

TParser::FunctionCodeBlockContext* TParser::ClassDefinationContext::functionCodeBlock() {
  return getRuleContext<TParser::FunctionCodeBlockContext>(0);
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
  enterRule(_localctx, 120, TParser::RuleClassDefination);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(896);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 44, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(887);
      classModesGeneral();
      setState(888);
      match(TParser::OpenBlock);
      setState(889);
      match(TParser::CloseBlock);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(891);
      classModesGeneral();
      setState(892);
      match(TParser::OpenBlock);
      setState(893);
      functionCodeBlock();
      setState(894);
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

//----------------- ClassModesGeneralContext ------------------------------------------------------------------

TParser::ClassModesGeneralContext::ClassModesGeneralContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::ClassModesContext* TParser::ClassModesGeneralContext::classModes() {
  return getRuleContext<TParser::ClassModesContext>(0);
}

tree::TerminalNode* TParser::ClassModesGeneralContext::Final() {
  return getToken(TParser::Final, 0);
}


size_t TParser::ClassModesGeneralContext::getRuleIndex() const {
  return TParser::RuleClassModesGeneral;
}

void TParser::ClassModesGeneralContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterClassModesGeneral(this);
}

void TParser::ClassModesGeneralContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitClassModesGeneral(this);
}


antlrcpp::Any TParser::ClassModesGeneralContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitClassModesGeneral(this);
  else
    return visitor->visitChildren(this);
}

TParser::ClassModesGeneralContext* TParser::classModesGeneral() {
  ClassModesGeneralContext *_localctx = _tracker.createInstance<ClassModesGeneralContext>(_ctx, getState());
  enterRule(_localctx, 122, TParser::RuleClassModesGeneral);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(901);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case TParser::Class: {
        enterOuterAlt(_localctx, 1);
        setState(898);
        classModes();
        break;
      }

      case TParser::Final: {
        enterOuterAlt(_localctx, 2);
        setState(899);
        match(TParser::Final);
        setState(900);
        classModes();
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

//----------------- ClassModesContext ------------------------------------------------------------------

TParser::ClassModesContext::ClassModesContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::ClassModesContext::Class() {
  return getToken(TParser::Class, 0);
}

std::vector<tree::TerminalNode *> TParser::ClassModesContext::Identifier() {
  return getTokens(TParser::Identifier);
}

tree::TerminalNode* TParser::ClassModesContext::Identifier(size_t i) {
  return getToken(TParser::Identifier, i);
}

tree::TerminalNode* TParser::ClassModesContext::Extends() {
  return getToken(TParser::Extends, 0);
}

tree::TerminalNode* TParser::ClassModesContext::Implements() {
  return getToken(TParser::Implements, 0);
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
  enterRule(_localctx, 124, TParser::RuleClassModes);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(919);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 46, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(903);
      match(TParser::Class);
      setState(904);
      match(TParser::Identifier);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(905);
      match(TParser::Class);
      setState(906);
      match(TParser::Identifier);
      setState(907);
      match(TParser::Extends);
      setState(908);
      match(TParser::Identifier);
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(909);
      match(TParser::Class);
      setState(910);
      match(TParser::Identifier);
      setState(911);
      match(TParser::Implements);
      setState(912);
      match(TParser::Identifier);
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(913);
      match(TParser::Class);
      setState(914);
      match(TParser::Identifier);
      setState(915);
      match(TParser::Extends);
      setState(916);
      match(TParser::Identifier);
      setState(917);
      match(TParser::Implements);
      setState(918);
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

TParser::OperationBlockContext* TParser::GeneralValueContext::operationBlock() {
  return getRuleContext<TParser::OperationBlockContext>(0);
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
  enterRule(_localctx, 126, TParser::RuleGeneralValue);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(943);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 47, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(921);
      match(TParser::Identifier);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(922);
      match(TParser::Identifier);
      setState(923);
      match(TParser::TypeSpec);
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(924);
      match(TParser::Integer);
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(925);
      match(TParser::Integer);
      setState(926);
      match(TParser::TypeSpec);
      break;
    }

    case 5: {
      enterOuterAlt(_localctx, 5);
      setState(927);
      match(TParser::Float);
      break;
    }

    case 6: {
      enterOuterAlt(_localctx, 6);
      setState(928);
      match(TParser::Float);
      setState(929);
      match(TParser::TypeSpec);
      break;
    }

    case 7: {
      enterOuterAlt(_localctx, 7);
      setState(930);
      match(TParser::String);
      break;
    }

    case 8: {
      enterOuterAlt(_localctx, 8);
      setState(931);
      indexArray();
      break;
    }

    case 9: {
      enterOuterAlt(_localctx, 9);
      setState(932);
      associativeArray();
      break;
    }

    case 10: {
      enterOuterAlt(_localctx, 10);
      setState(933);
      operationBlock();
      break;
    }

    case 11: {
      enterOuterAlt(_localctx, 11);
      setState(934);
      functionCall();
      break;
    }

    case 12: {
      enterOuterAlt(_localctx, 12);
      setState(935);
      objIdentifierA();
      setState(936);
      match(TParser::Point);
      setState(937);
      objIdentifierB();
      break;
    }

    case 13: {
      enterOuterAlt(_localctx, 13);
      setState(939);
      objIdentifierA();
      setState(940);
      match(TParser::TwoTwoPoint);
      setState(941);
      objIdentifierB();
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
  enterRule(_localctx, 128, TParser::RuleObjIdentifierA);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(945);
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
  enterRule(_localctx, 130, TParser::RuleObjIdentifierB);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(947);
    match(TParser::Identifier);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

bool TParser::sempred(RuleContext *context, size_t ruleIndex, size_t predicateIndex) {
  switch (ruleIndex) {
    case 1: return fileContentSempred(dynamic_cast<FileContentContext *>(context), predicateIndex);
    case 33: return conditionExpBlockSempred(dynamic_cast<ConditionExpBlockContext *>(context), predicateIndex);

  default:
    break;
  }
  return true;
}

bool TParser::fileContentSempred(FileContentContext *_localctx, size_t predicateIndex) {
  switch (predicateIndex) {
    case 0: return precpred(_ctx, 2);

  default:
    break;
  }
  return true;
}

bool TParser::conditionExpBlockSempred(ConditionExpBlockContext *_localctx, size_t predicateIndex) {
  switch (predicateIndex) {
    case 1: return precpred(_ctx, 1);

  default:
    break;
  }
  return true;
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
  "indexArray", "indexArrayElements", "associativeArray", "associativeArrayElements", 
  "operationBlock", "operationElements", "operationValue", "firstIncDec", 
  "lastIncDec", "callingFunction", "functionCall", "identifierB", "functionCallParam", 
  "functionCallParamElements", "conditionalExpression", "conditionalBlockElements", 
  "ifConditions", "elifConditions", "elseConditions", "condBlockElementsLimited", 
  "conditionalExpressionElements", "conditionalExpElementsValue", "conditionExpBlock", 
  "conditionalExpValue", "loop", "loopExpression", "loopOneMembers", "loopTwoMembers", 
  "loopThreeMembers", "loopThreeMembersValues", "loopBlockElements", "loopBlockElementsLimited", 
  "ret", "retValues", "functions", "functionGeneralModes", "functionsModes", 
  "functionMethodsModes", "methodPerm", "constructClassMethod", "interfaceMethod", 
  "functionCodeBlock", "functionParams", "functionParamElements", "oopGeneral", 
  "interfaceClass", "interfaceClassDefinition", "abstractClass", "abstractClassDefinition", 
  "classDefination", "classModesGeneral", "classModes", "generalValue", 
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
       0x3, 0x31, 0x3b8, 0x4, 0x2, 0x9, 0x2, 0x4, 0x3, 0x9, 0x3, 0x4, 0x4, 
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
       0x9, 0x41, 0x4, 0x42, 0x9, 0x42, 0x4, 0x43, 0x9, 0x43, 0x3, 0x2, 
       0x3, 0x2, 0x3, 0x2, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x7, 0x3, 0x8d, 
       0xa, 0x3, 0xc, 0x3, 0xe, 0x3, 0x90, 0xb, 0x3, 0x3, 0x4, 0x3, 0x4, 
       0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x3, 
       0x4, 0x5, 0x4, 0x9b, 0xa, 0x4, 0x3, 0x5, 0x3, 0x5, 0x3, 0x6, 0x3, 
       0x6, 0x3, 0x6, 0x3, 0x6, 0x3, 0x7, 0x3, 0x7, 0x3, 0x7, 0x3, 0x7, 
       0x3, 0x7, 0x5, 0x7, 0xa8, 0xa, 0x7, 0x3, 0x8, 0x3, 0x8, 0x3, 0x9, 
       0x3, 0x9, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 
       0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 
       0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 
       0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 
       0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 
       0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 
       0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x5, 
       0xa, 0xda, 0xa, 0xa, 0x3, 0xb, 0x3, 0xb, 0x3, 0xb, 0x3, 0xb, 0x3, 
       0xb, 0x5, 0xb, 0xe1, 0xa, 0xb, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 
       0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 
       0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x5, 
       0xc, 0xf3, 0xa, 0xc, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 
       0xd, 0x3, 0xd, 0x5, 0xd, 0xfb, 0xa, 0xd, 0x3, 0xe, 0x3, 0xe, 0x3, 
       0xe, 0x3, 0xe, 0x3, 0xe, 0x5, 0xe, 0x102, 0xa, 0xe, 0x3, 0xf, 0x3, 
       0xf, 0x3, 0xf, 0x3, 0xf, 0x3, 0xf, 0x3, 0xf, 0x5, 0xf, 0x10a, 0xa, 
       0xf, 0x3, 0x10, 0x3, 0x10, 0x3, 0x10, 0x3, 0x10, 0x3, 0x10, 0x3, 
       0x10, 0x3, 0x10, 0x3, 0x10, 0x3, 0x10, 0x5, 0x10, 0x115, 0xa, 0x10, 
       0x3, 0x11, 0x3, 0x11, 0x3, 0x11, 0x3, 0x11, 0x3, 0x12, 0x3, 0x12, 
       0x3, 0x12, 0x3, 0x12, 0x5, 0x12, 0x11f, 0xa, 0x12, 0x3, 0x13, 0x3, 
       0x13, 0x3, 0x13, 0x3, 0x13, 0x3, 0x13, 0x3, 0x13, 0x3, 0x13, 0x3, 
       0x13, 0x3, 0x13, 0x3, 0x13, 0x3, 0x13, 0x3, 0x13, 0x3, 0x13, 0x3, 
       0x13, 0x3, 0x13, 0x3, 0x13, 0x3, 0x13, 0x3, 0x13, 0x3, 0x13, 0x3, 
       0x13, 0x3, 0x13, 0x3, 0x13, 0x3, 0x13, 0x3, 0x13, 0x3, 0x13, 0x3, 
       0x13, 0x3, 0x13, 0x3, 0x13, 0x3, 0x13, 0x3, 0x13, 0x3, 0x13, 0x3, 
       0x13, 0x3, 0x13, 0x3, 0x13, 0x3, 0x13, 0x3, 0x13, 0x3, 0x13, 0x3, 
       0x13, 0x3, 0x13, 0x3, 0x13, 0x3, 0x13, 0x3, 0x13, 0x3, 0x13, 0x3, 
       0x13, 0x3, 0x13, 0x3, 0x13, 0x3, 0x13, 0x3, 0x13, 0x3, 0x13, 0x3, 
       0x13, 0x3, 0x13, 0x3, 0x13, 0x3, 0x13, 0x3, 0x13, 0x3, 0x13, 0x3, 
       0x13, 0x3, 0x13, 0x3, 0x13, 0x3, 0x13, 0x3, 0x13, 0x3, 0x13, 0x3, 
       0x13, 0x3, 0x13, 0x3, 0x13, 0x3, 0x13, 0x3, 0x13, 0x3, 0x13, 0x3, 
       0x13, 0x3, 0x13, 0x3, 0x13, 0x3, 0x13, 0x3, 0x13, 0x3, 0x13, 0x3, 
       0x13, 0x3, 0x13, 0x3, 0x13, 0x3, 0x13, 0x5, 0x13, 0x16e, 0xa, 0x13, 
       0x3, 0x14, 0x3, 0x14, 0x3, 0x15, 0x3, 0x15, 0x3, 0x16, 0x3, 0x16, 
       0x3, 0x16, 0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 
       0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 
       0x3, 0x17, 0x5, 0x17, 0x183, 0xa, 0x17, 0x3, 0x18, 0x3, 0x18, 0x3, 
       0x19, 0x3, 0x19, 0x3, 0x19, 0x3, 0x19, 0x3, 0x19, 0x3, 0x19, 0x5, 
       0x19, 0x18d, 0xa, 0x19, 0x3, 0x1a, 0x3, 0x1a, 0x3, 0x1a, 0x3, 0x1a, 
       0x3, 0x1a, 0x3, 0x1a, 0x3, 0x1a, 0x3, 0x1a, 0x3, 0x1a, 0x3, 0x1a, 
       0x5, 0x1a, 0x199, 0xa, 0x1a, 0x3, 0x1b, 0x3, 0x1b, 0x3, 0x1b, 0x5, 
       0x1b, 0x19e, 0xa, 0x1b, 0x3, 0x1c, 0x3, 0x1c, 0x3, 0x1c, 0x3, 0x1c, 
       0x3, 0x1c, 0x3, 0x1c, 0x3, 0x1c, 0x3, 0x1c, 0x5, 0x1c, 0x1a8, 0xa, 
       0x1c, 0x3, 0x1d, 0x3, 0x1d, 0x3, 0x1d, 0x3, 0x1d, 0x3, 0x1d, 0x3, 
       0x1d, 0x3, 0x1d, 0x3, 0x1d, 0x3, 0x1d, 0x3, 0x1d, 0x3, 0x1d, 0x3, 
       0x1d, 0x3, 0x1d, 0x3, 0x1d, 0x3, 0x1d, 0x3, 0x1d, 0x3, 0x1d, 0x3, 
       0x1d, 0x3, 0x1d, 0x5, 0x1d, 0x1bd, 0xa, 0x1d, 0x3, 0x1e, 0x3, 0x1e, 
       0x3, 0x1e, 0x3, 0x1e, 0x3, 0x1e, 0x3, 0x1e, 0x3, 0x1e, 0x3, 0x1e, 
       0x3, 0x1e, 0x3, 0x1e, 0x3, 0x1e, 0x3, 0x1e, 0x3, 0x1e, 0x3, 0x1e, 
       0x3, 0x1e, 0x3, 0x1e, 0x3, 0x1e, 0x3, 0x1e, 0x3, 0x1e, 0x5, 0x1e, 
       0x1d2, 0xa, 0x1e, 0x3, 0x1f, 0x3, 0x1f, 0x3, 0x1f, 0x3, 0x1f, 0x3, 
       0x1f, 0x3, 0x1f, 0x3, 0x1f, 0x3, 0x1f, 0x3, 0x1f, 0x3, 0x1f, 0x3, 
       0x1f, 0x3, 0x1f, 0x5, 0x1f, 0x1e0, 0xa, 0x1f, 0x3, 0x20, 0x3, 0x20, 
       0x3, 0x20, 0x3, 0x20, 0x3, 0x20, 0x3, 0x20, 0x3, 0x20, 0x3, 0x20, 
       0x3, 0x20, 0x5, 0x20, 0x1eb, 0xa, 0x20, 0x3, 0x21, 0x3, 0x21, 0x3, 
       0x21, 0x3, 0x21, 0x3, 0x21, 0x3, 0x21, 0x3, 0x21, 0x3, 0x21, 0x3, 
       0x21, 0x3, 0x21, 0x5, 0x21, 0x1f7, 0xa, 0x21, 0x3, 0x22, 0x3, 0x22, 
       0x3, 0x22, 0x3, 0x22, 0x5, 0x22, 0x1fd, 0xa, 0x22, 0x3, 0x23, 0x3, 
       0x23, 0x3, 0x23, 0x3, 0x23, 0x3, 0x23, 0x3, 0x23, 0x3, 0x23, 0x7, 
       0x23, 0x206, 0xa, 0x23, 0xc, 0x23, 0xe, 0x23, 0x209, 0xb, 0x23, 0x3, 
       0x24, 0x3, 0x24, 0x3, 0x24, 0x3, 0x24, 0x3, 0x24, 0x3, 0x24, 0x3, 
       0x24, 0x3, 0x24, 0x3, 0x24, 0x3, 0x24, 0x3, 0x24, 0x3, 0x24, 0x3, 
       0x24, 0x3, 0x24, 0x3, 0x24, 0x3, 0x24, 0x3, 0x24, 0x3, 0x24, 0x3, 
       0x24, 0x3, 0x24, 0x3, 0x24, 0x3, 0x24, 0x3, 0x24, 0x3, 0x24, 0x3, 
       0x24, 0x3, 0x24, 0x3, 0x24, 0x3, 0x24, 0x3, 0x24, 0x3, 0x24, 0x3, 
       0x24, 0x3, 0x24, 0x3, 0x24, 0x3, 0x24, 0x3, 0x24, 0x3, 0x24, 0x3, 
       0x24, 0x3, 0x24, 0x3, 0x24, 0x3, 0x24, 0x3, 0x24, 0x3, 0x24, 0x3, 
       0x24, 0x3, 0x24, 0x3, 0x24, 0x3, 0x24, 0x3, 0x24, 0x3, 0x24, 0x3, 
       0x24, 0x3, 0x24, 0x3, 0x24, 0x3, 0x24, 0x3, 0x24, 0x3, 0x24, 0x3, 
       0x24, 0x3, 0x24, 0x3, 0x24, 0x3, 0x24, 0x3, 0x24, 0x3, 0x24, 0x3, 
       0x24, 0x3, 0x24, 0x3, 0x24, 0x3, 0x24, 0x3, 0x24, 0x3, 0x24, 0x3, 
       0x24, 0x3, 0x24, 0x3, 0x24, 0x3, 0x24, 0x3, 0x24, 0x3, 0x24, 0x3, 
       0x24, 0x3, 0x24, 0x3, 0x24, 0x3, 0x24, 0x3, 0x24, 0x3, 0x24, 0x3, 
       0x24, 0x3, 0x24, 0x3, 0x24, 0x3, 0x24, 0x3, 0x24, 0x3, 0x24, 0x3, 
       0x24, 0x3, 0x24, 0x3, 0x24, 0x3, 0x24, 0x3, 0x24, 0x3, 0x24, 0x3, 
       0x24, 0x3, 0x24, 0x3, 0x24, 0x3, 0x24, 0x3, 0x24, 0x3, 0x24, 0x5, 
       0x24, 0x26b, 0xa, 0x24, 0x3, 0x25, 0x3, 0x25, 0x3, 0x25, 0x3, 0x25, 
       0x3, 0x25, 0x3, 0x25, 0x3, 0x25, 0x3, 0x25, 0x3, 0x25, 0x3, 0x25, 
       0x3, 0x25, 0x3, 0x25, 0x3, 0x25, 0x3, 0x25, 0x3, 0x25, 0x3, 0x25, 
       0x3, 0x25, 0x3, 0x25, 0x3, 0x25, 0x5, 0x25, 0x280, 0xa, 0x25, 0x3, 
       0x26, 0x3, 0x26, 0x3, 0x26, 0x3, 0x26, 0x3, 0x26, 0x3, 0x26, 0x3, 
       0x26, 0x3, 0x26, 0x3, 0x26, 0x3, 0x26, 0x3, 0x26, 0x3, 0x26, 0x3, 
       0x26, 0x3, 0x26, 0x3, 0x26, 0x3, 0x26, 0x3, 0x26, 0x3, 0x26, 0x5, 
       0x26, 0x294, 0xa, 0x26, 0x3, 0x27, 0x3, 0x27, 0x5, 0x27, 0x298, 0xa, 
       0x27, 0x3, 0x28, 0x3, 0x28, 0x5, 0x28, 0x29c, 0xa, 0x28, 0x3, 0x29, 
       0x3, 0x29, 0x5, 0x29, 0x2a0, 0xa, 0x29, 0x3, 0x2a, 0x3, 0x2a, 0x3, 
       0x2a, 0x3, 0x2a, 0x3, 0x2a, 0x3, 0x2a, 0x3, 0x2a, 0x3, 0x2a, 0x3, 
       0x2a, 0x3, 0x2a, 0x5, 0x2a, 0x2ac, 0xa, 0x2a, 0x3, 0x2b, 0x3, 0x2b, 
       0x3, 0x2b, 0x3, 0x2b, 0x5, 0x2b, 0x2b2, 0xa, 0x2b, 0x3, 0x2c, 0x3, 
       0x2c, 0x3, 0x2c, 0x3, 0x2c, 0x3, 0x2c, 0x3, 0x2c, 0x3, 0x2c, 0x3, 
       0x2c, 0x3, 0x2c, 0x5, 0x2c, 0x2bd, 0xa, 0x2c, 0x3, 0x2d, 0x3, 0x2d, 
       0x3, 0x2d, 0x3, 0x2d, 0x3, 0x2e, 0x3, 0x2e, 0x3, 0x2e, 0x5, 0x2e, 
       0x2c6, 0xa, 0x2e, 0x3, 0x2f, 0x3, 0x2f, 0x3, 0x2f, 0x3, 0x2f, 0x3, 
       0x2f, 0x3, 0x2f, 0x3, 0x2f, 0x3, 0x2f, 0x3, 0x2f, 0x3, 0x2f, 0x3, 
       0x2f, 0x3, 0x2f, 0x3, 0x2f, 0x3, 0x2f, 0x3, 0x2f, 0x3, 0x2f, 0x3, 
       0x2f, 0x3, 0x2f, 0x3, 0x2f, 0x3, 0x2f, 0x3, 0x2f, 0x3, 0x2f, 0x3, 
       0x2f, 0x3, 0x2f, 0x3, 0x2f, 0x3, 0x2f, 0x3, 0x2f, 0x3, 0x2f, 0x3, 
       0x2f, 0x3, 0x2f, 0x5, 0x2f, 0x2e6, 0xa, 0x2f, 0x3, 0x30, 0x3, 0x30, 
       0x3, 0x30, 0x3, 0x30, 0x3, 0x30, 0x3, 0x30, 0x3, 0x30, 0x3, 0x30, 
       0x3, 0x30, 0x3, 0x30, 0x3, 0x30, 0x3, 0x30, 0x3, 0x30, 0x3, 0x30, 
       0x3, 0x30, 0x3, 0x30, 0x3, 0x30, 0x3, 0x30, 0x3, 0x30, 0x3, 0x30, 
       0x3, 0x30, 0x3, 0x30, 0x3, 0x30, 0x3, 0x30, 0x5, 0x30, 0x300, 0xa, 
       0x30, 0x3, 0x31, 0x3, 0x31, 0x3, 0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 
       0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 
       0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 
       0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 
       0x32, 0x3, 0x32, 0x5, 0x32, 0x31b, 0xa, 0x32, 0x3, 0x33, 0x3, 0x33, 
       0x3, 0x34, 0x3, 0x34, 0x3, 0x34, 0x3, 0x34, 0x3, 0x34, 0x3, 0x34, 
       0x3, 0x34, 0x3, 0x34, 0x5, 0x34, 0x327, 0xa, 0x34, 0x3, 0x35, 0x3, 
       0x35, 0x5, 0x35, 0x32b, 0xa, 0x35, 0x3, 0x36, 0x3, 0x36, 0x3, 0x36, 
       0x3, 0x36, 0x5, 0x36, 0x331, 0xa, 0x36, 0x3, 0x37, 0x3, 0x37, 0x3, 
       0x37, 0x3, 0x37, 0x3, 0x37, 0x5, 0x37, 0x338, 0xa, 0x37, 0x3, 0x38, 
       0x3, 0x38, 0x3, 0x38, 0x3, 0x39, 0x3, 0x39, 0x3, 0x39, 0x5, 0x39, 
       0x340, 0xa, 0x39, 0x3, 0x3a, 0x3, 0x3a, 0x3, 0x3b, 0x3, 0x3b, 0x3, 
       0x3b, 0x3, 0x3b, 0x3, 0x3b, 0x3, 0x3b, 0x3, 0x3b, 0x3, 0x3b, 0x3, 
       0x3b, 0x3, 0x3b, 0x3, 0x3b, 0x3, 0x3b, 0x3, 0x3b, 0x3, 0x3b, 0x3, 
       0x3b, 0x3, 0x3b, 0x3, 0x3b, 0x3, 0x3b, 0x3, 0x3b, 0x3, 0x3b, 0x3, 
       0x3b, 0x3, 0x3b, 0x3, 0x3b, 0x3, 0x3b, 0x5, 0x3b, 0x35c, 0xa, 0x3b, 
       0x3, 0x3c, 0x3, 0x3c, 0x3, 0x3d, 0x3, 0x3d, 0x3, 0x3d, 0x3, 0x3d, 
       0x3, 0x3d, 0x3, 0x3d, 0x3, 0x3d, 0x3, 0x3d, 0x3, 0x3d, 0x3, 0x3d, 
       0x3, 0x3d, 0x3, 0x3d, 0x3, 0x3d, 0x3, 0x3d, 0x3, 0x3d, 0x3, 0x3d, 
       0x3, 0x3d, 0x3, 0x3d, 0x3, 0x3d, 0x3, 0x3d, 0x3, 0x3d, 0x3, 0x3d, 
       0x3, 0x3d, 0x3, 0x3d, 0x5, 0x3d, 0x378, 0xa, 0x3d, 0x3, 0x3e, 0x3, 
       0x3e, 0x3, 0x3e, 0x3, 0x3e, 0x3, 0x3e, 0x3, 0x3e, 0x3, 0x3e, 0x3, 
       0x3e, 0x3, 0x3e, 0x5, 0x3e, 0x383, 0xa, 0x3e, 0x3, 0x3f, 0x3, 0x3f, 
       0x3, 0x3f, 0x5, 0x3f, 0x388, 0xa, 0x3f, 0x3, 0x40, 0x3, 0x40, 0x3, 
       0x40, 0x3, 0x40, 0x3, 0x40, 0x3, 0x40, 0x3, 0x40, 0x3, 0x40, 0x3, 
       0x40, 0x3, 0x40, 0x3, 0x40, 0x3, 0x40, 0x3, 0x40, 0x3, 0x40, 0x3, 
       0x40, 0x3, 0x40, 0x5, 0x40, 0x39a, 0xa, 0x40, 0x3, 0x41, 0x3, 0x41, 
       0x3, 0x41, 0x3, 0x41, 0x3, 0x41, 0x3, 0x41, 0x3, 0x41, 0x3, 0x41, 
       0x3, 0x41, 0x3, 0x41, 0x3, 0x41, 0x3, 0x41, 0x3, 0x41, 0x3, 0x41, 
       0x3, 0x41, 0x3, 0x41, 0x3, 0x41, 0x3, 0x41, 0x3, 0x41, 0x3, 0x41, 
       0x3, 0x41, 0x3, 0x41, 0x5, 0x41, 0x3b2, 0xa, 0x41, 0x3, 0x42, 0x3, 
       0x42, 0x3, 0x43, 0x3, 0x43, 0x3, 0x43, 0x2, 0x4, 0x4, 0x44, 0x44, 
       0x2, 0x4, 0x6, 0x8, 0xa, 0xc, 0xe, 0x10, 0x12, 0x14, 0x16, 0x18, 
       0x1a, 0x1c, 0x1e, 0x20, 0x22, 0x24, 0x26, 0x28, 0x2a, 0x2c, 0x2e, 
       0x30, 0x32, 0x34, 0x36, 0x38, 0x3a, 0x3c, 0x3e, 0x40, 0x42, 0x44, 
       0x46, 0x48, 0x4a, 0x4c, 0x4e, 0x50, 0x52, 0x54, 0x56, 0x58, 0x5a, 
       0x5c, 0x5e, 0x60, 0x62, 0x64, 0x66, 0x68, 0x6a, 0x6c, 0x6e, 0x70, 
       0x72, 0x74, 0x76, 0x78, 0x7a, 0x7c, 0x7e, 0x80, 0x82, 0x84, 0x2, 
       0x4, 0x3, 0x2, 0x23, 0x24, 0x3, 0x2, 0xb, 0xd, 0x2, 0x427, 0x2, 0x86, 
       0x3, 0x2, 0x2, 0x2, 0x4, 0x89, 0x3, 0x2, 0x2, 0x2, 0x6, 0x9a, 0x3, 
       0x2, 0x2, 0x2, 0x8, 0x9c, 0x3, 0x2, 0x2, 0x2, 0xa, 0x9e, 0x3, 0x2, 
       0x2, 0x2, 0xc, 0xa7, 0x3, 0x2, 0x2, 0x2, 0xe, 0xa9, 0x3, 0x2, 0x2, 
       0x2, 0x10, 0xab, 0x3, 0x2, 0x2, 0x2, 0x12, 0xd9, 0x3, 0x2, 0x2, 0x2, 
       0x14, 0xe0, 0x3, 0x2, 0x2, 0x2, 0x16, 0xf2, 0x3, 0x2, 0x2, 0x2, 0x18, 
       0xfa, 0x3, 0x2, 0x2, 0x2, 0x1a, 0x101, 0x3, 0x2, 0x2, 0x2, 0x1c, 
       0x109, 0x3, 0x2, 0x2, 0x2, 0x1e, 0x114, 0x3, 0x2, 0x2, 0x2, 0x20, 
       0x116, 0x3, 0x2, 0x2, 0x2, 0x22, 0x11e, 0x3, 0x2, 0x2, 0x2, 0x24, 
       0x16d, 0x3, 0x2, 0x2, 0x2, 0x26, 0x16f, 0x3, 0x2, 0x2, 0x2, 0x28, 
       0x171, 0x3, 0x2, 0x2, 0x2, 0x2a, 0x173, 0x3, 0x2, 0x2, 0x2, 0x2c, 
       0x182, 0x3, 0x2, 0x2, 0x2, 0x2e, 0x184, 0x3, 0x2, 0x2, 0x2, 0x30, 
       0x18c, 0x3, 0x2, 0x2, 0x2, 0x32, 0x198, 0x3, 0x2, 0x2, 0x2, 0x34, 
       0x19d, 0x3, 0x2, 0x2, 0x2, 0x36, 0x1a7, 0x3, 0x2, 0x2, 0x2, 0x38, 
       0x1bc, 0x3, 0x2, 0x2, 0x2, 0x3a, 0x1d1, 0x3, 0x2, 0x2, 0x2, 0x3c, 
       0x1df, 0x3, 0x2, 0x2, 0x2, 0x3e, 0x1ea, 0x3, 0x2, 0x2, 0x2, 0x40, 
       0x1f6, 0x3, 0x2, 0x2, 0x2, 0x42, 0x1fc, 0x3, 0x2, 0x2, 0x2, 0x44, 
       0x1fe, 0x3, 0x2, 0x2, 0x2, 0x46, 0x26a, 0x3, 0x2, 0x2, 0x2, 0x48, 
       0x27f, 0x3, 0x2, 0x2, 0x2, 0x4a, 0x293, 0x3, 0x2, 0x2, 0x2, 0x4c, 
       0x297, 0x3, 0x2, 0x2, 0x2, 0x4e, 0x29b, 0x3, 0x2, 0x2, 0x2, 0x50, 
       0x29f, 0x3, 0x2, 0x2, 0x2, 0x52, 0x2ab, 0x3, 0x2, 0x2, 0x2, 0x54, 
       0x2b1, 0x3, 0x2, 0x2, 0x2, 0x56, 0x2bc, 0x3, 0x2, 0x2, 0x2, 0x58, 
       0x2be, 0x3, 0x2, 0x2, 0x2, 0x5a, 0x2c5, 0x3, 0x2, 0x2, 0x2, 0x5c, 
       0x2e5, 0x3, 0x2, 0x2, 0x2, 0x5e, 0x2ff, 0x3, 0x2, 0x2, 0x2, 0x60, 
       0x301, 0x3, 0x2, 0x2, 0x2, 0x62, 0x31a, 0x3, 0x2, 0x2, 0x2, 0x64, 
       0x31c, 0x3, 0x2, 0x2, 0x2, 0x66, 0x326, 0x3, 0x2, 0x2, 0x2, 0x68, 
       0x32a, 0x3, 0x2, 0x2, 0x2, 0x6a, 0x330, 0x3, 0x2, 0x2, 0x2, 0x6c, 
       0x337, 0x3, 0x2, 0x2, 0x2, 0x6e, 0x339, 0x3, 0x2, 0x2, 0x2, 0x70, 
       0x33f, 0x3, 0x2, 0x2, 0x2, 0x72, 0x341, 0x3, 0x2, 0x2, 0x2, 0x74, 
       0x35b, 0x3, 0x2, 0x2, 0x2, 0x76, 0x35d, 0x3, 0x2, 0x2, 0x2, 0x78, 
       0x377, 0x3, 0x2, 0x2, 0x2, 0x7a, 0x382, 0x3, 0x2, 0x2, 0x2, 0x7c, 
       0x387, 0x3, 0x2, 0x2, 0x2, 0x7e, 0x399, 0x3, 0x2, 0x2, 0x2, 0x80, 
       0x3b1, 0x3, 0x2, 0x2, 0x2, 0x82, 0x3b3, 0x3, 0x2, 0x2, 0x2, 0x84, 
       0x3b5, 0x3, 0x2, 0x2, 0x2, 0x86, 0x87, 0x5, 0x4, 0x3, 0x2, 0x87, 
       0x88, 0x7, 0x2, 0x2, 0x3, 0x88, 0x3, 0x3, 0x2, 0x2, 0x2, 0x89, 0x8e, 
       0x8, 0x3, 0x1, 0x2, 0x8a, 0x8b, 0xc, 0x4, 0x2, 0x2, 0x8b, 0x8d, 0x5, 
       0x6, 0x4, 0x2, 0x8c, 0x8a, 0x3, 0x2, 0x2, 0x2, 0x8d, 0x90, 0x3, 0x2, 
       0x2, 0x2, 0x8e, 0x8c, 0x3, 0x2, 0x2, 0x2, 0x8e, 0x8f, 0x3, 0x2, 0x2, 
       0x2, 0x8f, 0x5, 0x3, 0x2, 0x2, 0x2, 0x90, 0x8e, 0x3, 0x2, 0x2, 0x2, 
       0x91, 0x9b, 0x5, 0x8, 0x5, 0x2, 0x92, 0x9b, 0x5, 0xa, 0x6, 0x2, 0x93, 
       0x9b, 0x5, 0x10, 0x9, 0x2, 0x94, 0x9b, 0x5, 0x2a, 0x16, 0x2, 0x95, 
       0x9b, 0x5, 0x34, 0x1b, 0x2, 0x96, 0x9b, 0x5, 0x48, 0x25, 0x2, 0x97, 
       0x9b, 0x5, 0x5c, 0x2f, 0x2, 0x98, 0x9b, 0x5, 0x58, 0x2d, 0x2, 0x99, 
       0x9b, 0x5, 0x70, 0x39, 0x2, 0x9a, 0x91, 0x3, 0x2, 0x2, 0x2, 0x9a, 
       0x92, 0x3, 0x2, 0x2, 0x2, 0x9a, 0x93, 0x3, 0x2, 0x2, 0x2, 0x9a, 0x94, 
       0x3, 0x2, 0x2, 0x2, 0x9a, 0x95, 0x3, 0x2, 0x2, 0x2, 0x9a, 0x96, 0x3, 
       0x2, 0x2, 0x2, 0x9a, 0x97, 0x3, 0x2, 0x2, 0x2, 0x9a, 0x98, 0x3, 0x2, 
       0x2, 0x2, 0x9a, 0x99, 0x3, 0x2, 0x2, 0x2, 0x9b, 0x7, 0x3, 0x2, 0x2, 
       0x2, 0x9c, 0x9d, 0x7, 0x2e, 0x2, 0x2, 0x9d, 0x9, 0x3, 0x2, 0x2, 0x2, 
       0x9e, 0x9f, 0x7, 0x3, 0x2, 0x2, 0x9f, 0xa0, 0x5, 0xc, 0x7, 0x2, 0xa0, 
       0xa1, 0x7, 0x17, 0x2, 0x2, 0xa1, 0xb, 0x3, 0x2, 0x2, 0x2, 0xa2, 0xa8, 
       0x5, 0xe, 0x8, 0x2, 0xa3, 0xa4, 0x5, 0xe, 0x8, 0x2, 0xa4, 0xa5, 0x7, 
       0x1c, 0x2, 0x2, 0xa5, 0xa6, 0x5, 0xc, 0x7, 0x2, 0xa6, 0xa8, 0x3, 
       0x2, 0x2, 0x2, 0xa7, 0xa2, 0x3, 0x2, 0x2, 0x2, 0xa7, 0xa3, 0x3, 0x2, 
       0x2, 0x2, 0xa8, 0xd, 0x3, 0x2, 0x2, 0x2, 0xa9, 0xaa, 0x7, 0x2a, 0x2, 
       0x2, 0xaa, 0xf, 0x3, 0x2, 0x2, 0x2, 0xab, 0xac, 0x5, 0x12, 0xa, 0x2, 
       0xac, 0x11, 0x3, 0x2, 0x2, 0x2, 0xad, 0xae, 0x7, 0x4, 0x2, 0x2, 0xae, 
       0xaf, 0x5, 0x14, 0xb, 0x2, 0xaf, 0xb0, 0x7, 0x17, 0x2, 0x2, 0xb0, 
       0xda, 0x3, 0x2, 0x2, 0x2, 0xb1, 0xb2, 0x5, 0x64, 0x33, 0x2, 0xb2, 
       0xb3, 0x7, 0x4, 0x2, 0x2, 0xb3, 0xb4, 0x5, 0x14, 0xb, 0x2, 0xb4, 
       0xb5, 0x7, 0x17, 0x2, 0x2, 0xb5, 0xda, 0x3, 0x2, 0x2, 0x2, 0xb6, 
       0xb7, 0x7, 0xe, 0x2, 0x2, 0xb7, 0xb8, 0x7, 0x4, 0x2, 0x2, 0xb8, 0xb9, 
       0x5, 0x14, 0xb, 0x2, 0xb9, 0xba, 0x7, 0x17, 0x2, 0x2, 0xba, 0xda, 
       0x3, 0x2, 0x2, 0x2, 0xbb, 0xbc, 0x5, 0x64, 0x33, 0x2, 0xbc, 0xbd, 
       0x7, 0xe, 0x2, 0x2, 0xbd, 0xbe, 0x7, 0x4, 0x2, 0x2, 0xbe, 0xbf, 0x5, 
       0x14, 0xb, 0x2, 0xbf, 0xc0, 0x7, 0x17, 0x2, 0x2, 0xc0, 0xda, 0x3, 
       0x2, 0x2, 0x2, 0xc1, 0xc2, 0x7, 0xf, 0x2, 0x2, 0xc2, 0xc3, 0x5, 0x64, 
       0x33, 0x2, 0xc3, 0xc4, 0x7, 0xe, 0x2, 0x2, 0xc4, 0xc5, 0x7, 0x4, 
       0x2, 0x2, 0xc5, 0xc6, 0x5, 0x14, 0xb, 0x2, 0xc6, 0xc7, 0x7, 0x17, 
       0x2, 0x2, 0xc7, 0xda, 0x3, 0x2, 0x2, 0x2, 0xc8, 0xc9, 0x7, 0xf, 0x2, 
       0x2, 0xc9, 0xca, 0x5, 0x64, 0x33, 0x2, 0xca, 0xcb, 0x7, 0x4, 0x2, 
       0x2, 0xcb, 0xcc, 0x5, 0x14, 0xb, 0x2, 0xcc, 0xcd, 0x7, 0x17, 0x2, 
       0x2, 0xcd, 0xda, 0x3, 0x2, 0x2, 0x2, 0xce, 0xcf, 0x7, 0xf, 0x2, 0x2, 
       0xcf, 0xd0, 0x7, 0x4, 0x2, 0x2, 0xd0, 0xd1, 0x5, 0x14, 0xb, 0x2, 
       0xd1, 0xd2, 0x7, 0x17, 0x2, 0x2, 0xd2, 0xda, 0x3, 0x2, 0x2, 0x2, 
       0xd3, 0xd4, 0x7, 0xf, 0x2, 0x2, 0xd4, 0xd5, 0x7, 0xe, 0x2, 0x2, 0xd5, 
       0xd6, 0x7, 0x4, 0x2, 0x2, 0xd6, 0xd7, 0x5, 0x14, 0xb, 0x2, 0xd7, 
       0xd8, 0x7, 0x17, 0x2, 0x2, 0xd8, 0xda, 0x3, 0x2, 0x2, 0x2, 0xd9, 
       0xad, 0x3, 0x2, 0x2, 0x2, 0xd9, 0xb1, 0x3, 0x2, 0x2, 0x2, 0xd9, 0xb6, 
       0x3, 0x2, 0x2, 0x2, 0xd9, 0xbb, 0x3, 0x2, 0x2, 0x2, 0xd9, 0xc1, 0x3, 
       0x2, 0x2, 0x2, 0xd9, 0xc8, 0x3, 0x2, 0x2, 0x2, 0xd9, 0xce, 0x3, 0x2, 
       0x2, 0x2, 0xd9, 0xd3, 0x3, 0x2, 0x2, 0x2, 0xda, 0x13, 0x3, 0x2, 0x2, 
       0x2, 0xdb, 0xe1, 0x5, 0x16, 0xc, 0x2, 0xdc, 0xdd, 0x5, 0x16, 0xc, 
       0x2, 0xdd, 0xde, 0x7, 0x1c, 0x2, 0x2, 0xde, 0xdf, 0x5, 0x14, 0xb, 
       0x2, 0xdf, 0xe1, 0x3, 0x2, 0x2, 0x2, 0xe0, 0xdb, 0x3, 0x2, 0x2, 0x2, 
       0xe0, 0xdc, 0x3, 0x2, 0x2, 0x2, 0xe1, 0x15, 0x3, 0x2, 0x2, 0x2, 0xe2, 
       0xe3, 0x7, 0x27, 0x2, 0x2, 0xe3, 0xe4, 0x7, 0x18, 0x2, 0x2, 0xe4, 
       0xf3, 0x5, 0x80, 0x41, 0x2, 0xe5, 0xe6, 0x7, 0x27, 0x2, 0x2, 0xe6, 
       0xe7, 0x7, 0x29, 0x2, 0x2, 0xe7, 0xe8, 0x7, 0x18, 0x2, 0x2, 0xe8, 
       0xf3, 0x5, 0x80, 0x41, 0x2, 0xe9, 0xea, 0x7, 0x27, 0x2, 0x2, 0xea, 
       0xeb, 0x7, 0x18, 0x2, 0x2, 0xeb, 0xec, 0x7, 0x15, 0x2, 0x2, 0xec, 
       0xf3, 0x5, 0x80, 0x41, 0x2, 0xed, 0xee, 0x7, 0x27, 0x2, 0x2, 0xee, 
       0xef, 0x7, 0x29, 0x2, 0x2, 0xef, 0xf0, 0x7, 0x18, 0x2, 0x2, 0xf0, 
       0xf1, 0x7, 0x15, 0x2, 0x2, 0xf1, 0xf3, 0x5, 0x80, 0x41, 0x2, 0xf2, 
       0xe2, 0x3, 0x2, 0x2, 0x2, 0xf2, 0xe5, 0x3, 0x2, 0x2, 0x2, 0xf2, 0xe9, 
       0x3, 0x2, 0x2, 0x2, 0xf2, 0xed, 0x3, 0x2, 0x2, 0x2, 0xf3, 0x17, 0x3, 
       0x2, 0x2, 0x2, 0xf4, 0xf5, 0x7, 0x1d, 0x2, 0x2, 0xf5, 0xfb, 0x7, 
       0x1e, 0x2, 0x2, 0xf6, 0xf7, 0x7, 0x1d, 0x2, 0x2, 0xf7, 0xf8, 0x5, 
       0x1a, 0xe, 0x2, 0xf8, 0xf9, 0x7, 0x1e, 0x2, 0x2, 0xf9, 0xfb, 0x3, 
       0x2, 0x2, 0x2, 0xfa, 0xf4, 0x3, 0x2, 0x2, 0x2, 0xfa, 0xf6, 0x3, 0x2, 
       0x2, 0x2, 0xfb, 0x19, 0x3, 0x2, 0x2, 0x2, 0xfc, 0x102, 0x5, 0x80, 
       0x41, 0x2, 0xfd, 0xfe, 0x5, 0x80, 0x41, 0x2, 0xfe, 0xff, 0x7, 0x1c, 
       0x2, 0x2, 0xff, 0x100, 0x5, 0x1a, 0xe, 0x2, 0x100, 0x102, 0x3, 0x2, 
       0x2, 0x2, 0x101, 0xfc, 0x3, 0x2, 0x2, 0x2, 0x101, 0xfd, 0x3, 0x2, 
       0x2, 0x2, 0x102, 0x1b, 0x3, 0x2, 0x2, 0x2, 0x103, 0x104, 0x7, 0x1f, 
       0x2, 0x2, 0x104, 0x10a, 0x7, 0x20, 0x2, 0x2, 0x105, 0x106, 0x7, 0x1f, 
       0x2, 0x2, 0x106, 0x107, 0x5, 0x1e, 0x10, 0x2, 0x107, 0x108, 0x7, 
       0x20, 0x2, 0x2, 0x108, 0x10a, 0x3, 0x2, 0x2, 0x2, 0x109, 0x103, 0x3, 
       0x2, 0x2, 0x2, 0x109, 0x105, 0x3, 0x2, 0x2, 0x2, 0x10a, 0x1d, 0x3, 
       0x2, 0x2, 0x2, 0x10b, 0x10c, 0x7, 0x27, 0x2, 0x2, 0x10c, 0x10d, 0x7, 
       0x1a, 0x2, 0x2, 0x10d, 0x115, 0x5, 0x80, 0x41, 0x2, 0x10e, 0x10f, 
       0x7, 0x27, 0x2, 0x2, 0x10f, 0x110, 0x7, 0x1a, 0x2, 0x2, 0x110, 0x111, 
       0x5, 0x80, 0x41, 0x2, 0x111, 0x112, 0x7, 0x1c, 0x2, 0x2, 0x112, 0x113, 
       0x5, 0x1e, 0x10, 0x2, 0x113, 0x115, 0x3, 0x2, 0x2, 0x2, 0x114, 0x10b, 
       0x3, 0x2, 0x2, 0x2, 0x114, 0x10e, 0x3, 0x2, 0x2, 0x2, 0x115, 0x1f, 
       0x3, 0x2, 0x2, 0x2, 0x116, 0x117, 0x7, 0x21, 0x2, 0x2, 0x117, 0x118, 
       0x5, 0x22, 0x12, 0x2, 0x118, 0x119, 0x7, 0x22, 0x2, 0x2, 0x119, 0x21, 
       0x3, 0x2, 0x2, 0x2, 0x11a, 0x11f, 0x5, 0x24, 0x13, 0x2, 0x11b, 0x11c, 
       0x5, 0x24, 0x13, 0x2, 0x11c, 0x11d, 0x5, 0x22, 0x12, 0x2, 0x11d, 
       0x11f, 0x3, 0x2, 0x2, 0x2, 0x11e, 0x11a, 0x3, 0x2, 0x2, 0x2, 0x11e, 
       0x11b, 0x3, 0x2, 0x2, 0x2, 0x11f, 0x23, 0x3, 0x2, 0x2, 0x2, 0x120, 
       0x16e, 0x7, 0x27, 0x2, 0x2, 0x121, 0x122, 0x7, 0x27, 0x2, 0x2, 0x122, 
       0x16e, 0x7, 0x23, 0x2, 0x2, 0x123, 0x124, 0x7, 0x27, 0x2, 0x2, 0x124, 
       0x16e, 0x7, 0x29, 0x2, 0x2, 0x125, 0x126, 0x7, 0x27, 0x2, 0x2, 0x126, 
       0x127, 0x7, 0x29, 0x2, 0x2, 0x127, 0x16e, 0x7, 0x23, 0x2, 0x2, 0x128, 
       0x129, 0x5, 0x26, 0x14, 0x2, 0x129, 0x12a, 0x7, 0x27, 0x2, 0x2, 0x12a, 
       0x16e, 0x3, 0x2, 0x2, 0x2, 0x12b, 0x12c, 0x5, 0x26, 0x14, 0x2, 0x12c, 
       0x12d, 0x7, 0x27, 0x2, 0x2, 0x12d, 0x12e, 0x7, 0x23, 0x2, 0x2, 0x12e, 
       0x16e, 0x3, 0x2, 0x2, 0x2, 0x12f, 0x130, 0x5, 0x26, 0x14, 0x2, 0x130, 
       0x131, 0x7, 0x27, 0x2, 0x2, 0x131, 0x132, 0x7, 0x29, 0x2, 0x2, 0x132, 
       0x16e, 0x3, 0x2, 0x2, 0x2, 0x133, 0x134, 0x5, 0x26, 0x14, 0x2, 0x134, 
       0x135, 0x7, 0x27, 0x2, 0x2, 0x135, 0x136, 0x7, 0x29, 0x2, 0x2, 0x136, 
       0x137, 0x7, 0x23, 0x2, 0x2, 0x137, 0x16e, 0x3, 0x2, 0x2, 0x2, 0x138, 
       0x139, 0x7, 0x27, 0x2, 0x2, 0x139, 0x16e, 0x5, 0x28, 0x15, 0x2, 0x13a, 
       0x13b, 0x7, 0x27, 0x2, 0x2, 0x13b, 0x13c, 0x5, 0x28, 0x15, 0x2, 0x13c, 
       0x13d, 0x7, 0x23, 0x2, 0x2, 0x13d, 0x16e, 0x3, 0x2, 0x2, 0x2, 0x13e, 
       0x13f, 0x7, 0x27, 0x2, 0x2, 0x13f, 0x140, 0x5, 0x28, 0x15, 0x2, 0x140, 
       0x141, 0x7, 0x29, 0x2, 0x2, 0x141, 0x16e, 0x3, 0x2, 0x2, 0x2, 0x142, 
       0x143, 0x7, 0x27, 0x2, 0x2, 0x143, 0x144, 0x5, 0x28, 0x15, 0x2, 0x144, 
       0x145, 0x7, 0x29, 0x2, 0x2, 0x145, 0x146, 0x7, 0x23, 0x2, 0x2, 0x146, 
       0x16e, 0x3, 0x2, 0x2, 0x2, 0x147, 0x16e, 0x7, 0x2b, 0x2, 0x2, 0x148, 
       0x149, 0x7, 0x2b, 0x2, 0x2, 0x149, 0x16e, 0x7, 0x23, 0x2, 0x2, 0x14a, 
       0x14b, 0x7, 0x2b, 0x2, 0x2, 0x14b, 0x16e, 0x7, 0x29, 0x2, 0x2, 0x14c, 
       0x14d, 0x7, 0x2b, 0x2, 0x2, 0x14d, 0x14e, 0x7, 0x29, 0x2, 0x2, 0x14e, 
       0x16e, 0x7, 0x23, 0x2, 0x2, 0x14f, 0x16e, 0x7, 0x2c, 0x2, 0x2, 0x150, 
       0x151, 0x7, 0x2c, 0x2, 0x2, 0x151, 0x16e, 0x7, 0x23, 0x2, 0x2, 0x152, 
       0x153, 0x7, 0x2c, 0x2, 0x2, 0x153, 0x16e, 0x7, 0x29, 0x2, 0x2, 0x154, 
       0x155, 0x7, 0x2c, 0x2, 0x2, 0x155, 0x156, 0x7, 0x29, 0x2, 0x2, 0x156, 
       0x16e, 0x7, 0x23, 0x2, 0x2, 0x157, 0x16e, 0x5, 0x2c, 0x17, 0x2, 0x158, 
       0x159, 0x5, 0x2c, 0x17, 0x2, 0x159, 0x15a, 0x7, 0x23, 0x2, 0x2, 0x15a, 
       0x16e, 0x3, 0x2, 0x2, 0x2, 0x15b, 0x15c, 0x5, 0x2c, 0x17, 0x2, 0x15c, 
       0x15d, 0x7, 0x29, 0x2, 0x2, 0x15d, 0x16e, 0x3, 0x2, 0x2, 0x2, 0x15e, 
       0x15f, 0x5, 0x2c, 0x17, 0x2, 0x15f, 0x160, 0x7, 0x29, 0x2, 0x2, 0x160, 
       0x161, 0x7, 0x23, 0x2, 0x2, 0x161, 0x16e, 0x3, 0x2, 0x2, 0x2, 0x162, 
       0x16e, 0x5, 0x20, 0x11, 0x2, 0x163, 0x164, 0x5, 0x20, 0x11, 0x2, 
       0x164, 0x165, 0x7, 0x23, 0x2, 0x2, 0x165, 0x16e, 0x3, 0x2, 0x2, 0x2, 
       0x166, 0x167, 0x5, 0x20, 0x11, 0x2, 0x167, 0x168, 0x7, 0x29, 0x2, 
       0x2, 0x168, 0x16e, 0x3, 0x2, 0x2, 0x2, 0x169, 0x16a, 0x5, 0x20, 0x11, 
       0x2, 0x16a, 0x16b, 0x7, 0x29, 0x2, 0x2, 0x16b, 0x16c, 0x7, 0x23, 
       0x2, 0x2, 0x16c, 0x16e, 0x3, 0x2, 0x2, 0x2, 0x16d, 0x120, 0x3, 0x2, 
       0x2, 0x2, 0x16d, 0x121, 0x3, 0x2, 0x2, 0x2, 0x16d, 0x123, 0x3, 0x2, 
       0x2, 0x2, 0x16d, 0x125, 0x3, 0x2, 0x2, 0x2, 0x16d, 0x128, 0x3, 0x2, 
       0x2, 0x2, 0x16d, 0x12b, 0x3, 0x2, 0x2, 0x2, 0x16d, 0x12f, 0x3, 0x2, 
       0x2, 0x2, 0x16d, 0x133, 0x3, 0x2, 0x2, 0x2, 0x16d, 0x138, 0x3, 0x2, 
       0x2, 0x2, 0x16d, 0x13a, 0x3, 0x2, 0x2, 0x2, 0x16d, 0x13e, 0x3, 0x2, 
       0x2, 0x2, 0x16d, 0x142, 0x3, 0x2, 0x2, 0x2, 0x16d, 0x147, 0x3, 0x2, 
       0x2, 0x2, 0x16d, 0x148, 0x3, 0x2, 0x2, 0x2, 0x16d, 0x14a, 0x3, 0x2, 
       0x2, 0x2, 0x16d, 0x14c, 0x3, 0x2, 0x2, 0x2, 0x16d, 0x14f, 0x3, 0x2, 
       0x2, 0x2, 0x16d, 0x150, 0x3, 0x2, 0x2, 0x2, 0x16d, 0x152, 0x3, 0x2, 
       0x2, 0x2, 0x16d, 0x154, 0x3, 0x2, 0x2, 0x2, 0x16d, 0x157, 0x3, 0x2, 
       0x2, 0x2, 0x16d, 0x158, 0x3, 0x2, 0x2, 0x2, 0x16d, 0x15b, 0x3, 0x2, 
       0x2, 0x2, 0x16d, 0x15e, 0x3, 0x2, 0x2, 0x2, 0x16d, 0x162, 0x3, 0x2, 
       0x2, 0x2, 0x16d, 0x163, 0x3, 0x2, 0x2, 0x2, 0x16d, 0x166, 0x3, 0x2, 
       0x2, 0x2, 0x16d, 0x169, 0x3, 0x2, 0x2, 0x2, 0x16e, 0x25, 0x3, 0x2, 
       0x2, 0x2, 0x16f, 0x170, 0x7, 0x26, 0x2, 0x2, 0x170, 0x27, 0x3, 0x2, 
       0x2, 0x2, 0x171, 0x172, 0x7, 0x26, 0x2, 0x2, 0x172, 0x29, 0x3, 0x2, 
       0x2, 0x2, 0x173, 0x174, 0x5, 0x2c, 0x17, 0x2, 0x174, 0x175, 0x7, 
       0x17, 0x2, 0x2, 0x175, 0x2b, 0x3, 0x2, 0x2, 0x2, 0x176, 0x177, 0x7, 
       0x27, 0x2, 0x2, 0x177, 0x183, 0x5, 0x30, 0x19, 0x2, 0x178, 0x179, 
       0x7, 0x27, 0x2, 0x2, 0x179, 0x17a, 0x7, 0x19, 0x2, 0x2, 0x17a, 0x17b, 
       0x5, 0x2e, 0x18, 0x2, 0x17b, 0x17c, 0x5, 0x30, 0x19, 0x2, 0x17c, 
       0x183, 0x3, 0x2, 0x2, 0x2, 0x17d, 0x17e, 0x7, 0x27, 0x2, 0x2, 0x17e, 
       0x17f, 0x7, 0x1b, 0x2, 0x2, 0x17f, 0x180, 0x5, 0x2e, 0x18, 0x2, 0x180, 
       0x181, 0x5, 0x30, 0x19, 0x2, 0x181, 0x183, 0x3, 0x2, 0x2, 0x2, 0x182, 
       0x176, 0x3, 0x2, 0x2, 0x2, 0x182, 0x178, 0x3, 0x2, 0x2, 0x2, 0x182, 
       0x17d, 0x3, 0x2, 0x2, 0x2, 0x183, 0x2d, 0x3, 0x2, 0x2, 0x2, 0x184, 
       0x185, 0x7, 0x27, 0x2, 0x2, 0x185, 0x2f, 0x3, 0x2, 0x2, 0x2, 0x186, 
       0x187, 0x7, 0x21, 0x2, 0x2, 0x187, 0x18d, 0x7, 0x22, 0x2, 0x2, 0x188, 
       0x189, 0x7, 0x21, 0x2, 0x2, 0x189, 0x18a, 0x5, 0x32, 0x1a, 0x2, 0x18a, 
       0x18b, 0x7, 0x22, 0x2, 0x2, 0x18b, 0x18d, 0x3, 0x2, 0x2, 0x2, 0x18c, 
       0x186, 0x3, 0x2, 0x2, 0x2, 0x18c, 0x188, 0x3, 0x2, 0x2, 0x2, 0x18d, 
       0x31, 0x3, 0x2, 0x2, 0x2, 0x18e, 0x199, 0x5, 0x80, 0x41, 0x2, 0x18f, 
       0x190, 0x5, 0x80, 0x41, 0x2, 0x190, 0x191, 0x7, 0x1c, 0x2, 0x2, 0x191, 
       0x192, 0x5, 0x32, 0x1a, 0x2, 0x192, 0x199, 0x3, 0x2, 0x2, 0x2, 0x193, 
       0x199, 0x5, 0x22, 0x12, 0x2, 0x194, 0x195, 0x5, 0x22, 0x12, 0x2, 
       0x195, 0x196, 0x7, 0x1c, 0x2, 0x2, 0x196, 0x197, 0x5, 0x32, 0x1a, 
       0x2, 0x197, 0x199, 0x3, 0x2, 0x2, 0x2, 0x198, 0x18e, 0x3, 0x2, 0x2, 
       0x2, 0x198, 0x18f, 0x3, 0x2, 0x2, 0x2, 0x198, 0x193, 0x3, 0x2, 0x2, 
       0x2, 0x198, 0x194, 0x3, 0x2, 0x2, 0x2, 0x199, 0x33, 0x3, 0x2, 0x2, 
       0x2, 0x19a, 0x19e, 0x5, 0x38, 0x1d, 0x2, 0x19b, 0x19e, 0x5, 0x3a, 
       0x1e, 0x2, 0x19c, 0x19e, 0x5, 0x3c, 0x1f, 0x2, 0x19d, 0x19a, 0x3, 
       0x2, 0x2, 0x2, 0x19d, 0x19b, 0x3, 0x2, 0x2, 0x2, 0x19d, 0x19c, 0x3, 
       0x2, 0x2, 0x2, 0x19e, 0x35, 0x3, 0x2, 0x2, 0x2, 0x19f, 0x1a8, 0x5, 
       0x34, 0x1b, 0x2, 0x1a0, 0x1a1, 0x5, 0x34, 0x1b, 0x2, 0x1a1, 0x1a2, 
       0x5, 0x36, 0x1c, 0x2, 0x1a2, 0x1a8, 0x3, 0x2, 0x2, 0x2, 0x1a3, 0x1a8, 
       0x5, 0x6, 0x4, 0x2, 0x1a4, 0x1a5, 0x5, 0x6, 0x4, 0x2, 0x1a5, 0x1a6, 
       0x5, 0x36, 0x1c, 0x2, 0x1a6, 0x1a8, 0x3, 0x2, 0x2, 0x2, 0x1a7, 0x19f, 
       0x3, 0x2, 0x2, 0x2, 0x1a7, 0x1a0, 0x3, 0x2, 0x2, 0x2, 0x1a7, 0x1a3, 
       0x3, 0x2, 0x2, 0x2, 0x1a7, 0x1a4, 0x3, 0x2, 0x2, 0x2, 0x1a8, 0x37, 
       0x3, 0x2, 0x2, 0x2, 0x1a9, 0x1aa, 0x7, 0x5, 0x2, 0x2, 0x1aa, 0x1ab, 
       0x5, 0x40, 0x21, 0x2, 0x1ab, 0x1ac, 0x5, 0x2a, 0x16, 0x2, 0x1ac, 
       0x1bd, 0x3, 0x2, 0x2, 0x2, 0x1ad, 0x1ae, 0x7, 0x5, 0x2, 0x2, 0x1ae, 
       0x1af, 0x5, 0x40, 0x21, 0x2, 0x1af, 0x1b0, 0x7, 0x1f, 0x2, 0x2, 0x1b0, 
       0x1b1, 0x7, 0x20, 0x2, 0x2, 0x1b1, 0x1bd, 0x3, 0x2, 0x2, 0x2, 0x1b2, 
       0x1b3, 0x7, 0x5, 0x2, 0x2, 0x1b3, 0x1b4, 0x5, 0x40, 0x21, 0x2, 0x1b4, 
       0x1b5, 0x7, 0x1f, 0x2, 0x2, 0x1b5, 0x1b6, 0x5, 0x36, 0x1c, 0x2, 0x1b6, 
       0x1b7, 0x7, 0x20, 0x2, 0x2, 0x1b7, 0x1bd, 0x3, 0x2, 0x2, 0x2, 0x1b8, 
       0x1b9, 0x7, 0x5, 0x2, 0x2, 0x1b9, 0x1ba, 0x5, 0x40, 0x21, 0x2, 0x1ba, 
       0x1bb, 0x5, 0x3e, 0x20, 0x2, 0x1bb, 0x1bd, 0x3, 0x2, 0x2, 0x2, 0x1bc, 
       0x1a9, 0x3, 0x2, 0x2, 0x2, 0x1bc, 0x1ad, 0x3, 0x2, 0x2, 0x2, 0x1bc, 
       0x1b2, 0x3, 0x2, 0x2, 0x2, 0x1bc, 0x1b8, 0x3, 0x2, 0x2, 0x2, 0x1bd, 
       0x39, 0x3, 0x2, 0x2, 0x2, 0x1be, 0x1bf, 0x7, 0x6, 0x2, 0x2, 0x1bf, 
       0x1c0, 0x5, 0x40, 0x21, 0x2, 0x1c0, 0x1c1, 0x5, 0x2a, 0x16, 0x2, 
       0x1c1, 0x1d2, 0x3, 0x2, 0x2, 0x2, 0x1c2, 0x1c3, 0x7, 0x6, 0x2, 0x2, 
       0x1c3, 0x1c4, 0x5, 0x40, 0x21, 0x2, 0x1c4, 0x1c5, 0x7, 0x1f, 0x2, 
       0x2, 0x1c5, 0x1c6, 0x7, 0x20, 0x2, 0x2, 0x1c6, 0x1d2, 0x3, 0x2, 0x2, 
       0x2, 0x1c7, 0x1c8, 0x7, 0x6, 0x2, 0x2, 0x1c8, 0x1c9, 0x5, 0x40, 0x21, 
       0x2, 0x1c9, 0x1ca, 0x7, 0x1f, 0x2, 0x2, 0x1ca, 0x1cb, 0x5, 0x36, 
       0x1c, 0x2, 0x1cb, 0x1cc, 0x7, 0x20, 0x2, 0x2, 0x1cc, 0x1d2, 0x3, 
       0x2, 0x2, 0x2, 0x1cd, 0x1ce, 0x7, 0x6, 0x2, 0x2, 0x1ce, 0x1cf, 0x5, 
       0x40, 0x21, 0x2, 0x1cf, 0x1d0, 0x5, 0x3e, 0x20, 0x2, 0x1d0, 0x1d2, 
       0x3, 0x2, 0x2, 0x2, 0x1d1, 0x1be, 0x3, 0x2, 0x2, 0x2, 0x1d1, 0x1c2, 
       0x3, 0x2, 0x2, 0x2, 0x1d1, 0x1c7, 0x3, 0x2, 0x2, 0x2, 0x1d1, 0x1cd, 
       0x3, 0x2, 0x2, 0x2, 0x1d2, 0x3b, 0x3, 0x2, 0x2, 0x2, 0x1d3, 0x1d4, 
       0x7, 0x7, 0x2, 0x2, 0x1d4, 0x1e0, 0x5, 0x2a, 0x16, 0x2, 0x1d5, 0x1d6, 
       0x7, 0x7, 0x2, 0x2, 0x1d6, 0x1d7, 0x7, 0x1f, 0x2, 0x2, 0x1d7, 0x1e0, 
       0x7, 0x20, 0x2, 0x2, 0x1d8, 0x1d9, 0x7, 0x7, 0x2, 0x2, 0x1d9, 0x1da, 
       0x7, 0x1f, 0x2, 0x2, 0x1da, 0x1db, 0x5, 0x36, 0x1c, 0x2, 0x1db, 0x1dc, 
       0x7, 0x20, 0x2, 0x2, 0x1dc, 0x1e0, 0x3, 0x2, 0x2, 0x2, 0x1dd, 0x1de, 
       0x7, 0x7, 0x2, 0x2, 0x1de, 0x1e0, 0x5, 0x3e, 0x20, 0x2, 0x1df, 0x1d3, 
       0x3, 0x2, 0x2, 0x2, 0x1df, 0x1d5, 0x3, 0x2, 0x2, 0x2, 0x1df, 0x1d8, 
       0x3, 0x2, 0x2, 0x2, 0x1df, 0x1dd, 0x3, 0x2, 0x2, 0x2, 0x1e0, 0x3d, 
       0x3, 0x2, 0x2, 0x2, 0x1e1, 0x1eb, 0x5, 0x38, 0x1d, 0x2, 0x1e2, 0x1e3, 
       0x5, 0x38, 0x1d, 0x2, 0x1e3, 0x1e4, 0x5, 0x36, 0x1c, 0x2, 0x1e4, 
       0x1eb, 0x3, 0x2, 0x2, 0x2, 0x1e5, 0x1eb, 0x5, 0x48, 0x25, 0x2, 0x1e6, 
       0x1e7, 0x5, 0x48, 0x25, 0x2, 0x1e7, 0x1e8, 0x5, 0x3e, 0x20, 0x2, 
       0x1e8, 0x1eb, 0x3, 0x2, 0x2, 0x2, 0x1e9, 0x1eb, 0x5, 0x58, 0x2d, 
       0x2, 0x1ea, 0x1e1, 0x3, 0x2, 0x2, 0x2, 0x1ea, 0x1e2, 0x3, 0x2, 0x2, 
       0x2, 0x1ea, 0x1e5, 0x3, 0x2, 0x2, 0x2, 0x1ea, 0x1e6, 0x3, 0x2, 0x2, 
       0x2, 0x1ea, 0x1e9, 0x3, 0x2, 0x2, 0x2, 0x1eb, 0x3f, 0x3, 0x2, 0x2, 
       0x2, 0x1ec, 0x1f7, 0x5, 0x42, 0x22, 0x2, 0x1ed, 0x1ee, 0x5, 0x42, 
       0x22, 0x2, 0x1ee, 0x1ef, 0x5, 0x40, 0x21, 0x2, 0x1ef, 0x1f7, 0x3, 
       0x2, 0x2, 0x2, 0x1f0, 0x1f7, 0x5, 0x44, 0x23, 0x2, 0x1f1, 0x1f2, 
       0x5, 0x44, 0x23, 0x2, 0x1f2, 0x1f3, 0x5, 0x40, 0x21, 0x2, 0x1f3, 
       0x1f7, 0x3, 0x2, 0x2, 0x2, 0x1f4, 0x1f5, 0x7, 0x25, 0x2, 0x2, 0x1f5, 
       0x1f7, 0x5, 0x40, 0x21, 0x2, 0x1f6, 0x1ec, 0x3, 0x2, 0x2, 0x2, 0x1f6, 
       0x1ed, 0x3, 0x2, 0x2, 0x2, 0x1f6, 0x1f0, 0x3, 0x2, 0x2, 0x2, 0x1f6, 
       0x1f1, 0x3, 0x2, 0x2, 0x2, 0x1f6, 0x1f4, 0x3, 0x2, 0x2, 0x2, 0x1f7, 
       0x41, 0x3, 0x2, 0x2, 0x2, 0x1f8, 0x1fd, 0x5, 0x46, 0x24, 0x2, 0x1f9, 
       0x1fa, 0x5, 0x46, 0x24, 0x2, 0x1fa, 0x1fb, 0x5, 0x42, 0x22, 0x2, 
       0x1fb, 0x1fd, 0x3, 0x2, 0x2, 0x2, 0x1fc, 0x1f8, 0x3, 0x2, 0x2, 0x2, 
       0x1fc, 0x1f9, 0x3, 0x2, 0x2, 0x2, 0x1fd, 0x43, 0x3, 0x2, 0x2, 0x2, 
       0x1fe, 0x1ff, 0x8, 0x23, 0x1, 0x2, 0x1ff, 0x200, 0x7, 0x21, 0x2, 
       0x2, 0x200, 0x201, 0x5, 0x40, 0x21, 0x2, 0x201, 0x202, 0x7, 0x22, 
       0x2, 0x2, 0x202, 0x207, 0x3, 0x2, 0x2, 0x2, 0x203, 0x204, 0xc, 0x3, 
       0x2, 0x2, 0x204, 0x206, 0x7, 0x24, 0x2, 0x2, 0x205, 0x203, 0x3, 0x2, 
       0x2, 0x2, 0x206, 0x209, 0x3, 0x2, 0x2, 0x2, 0x207, 0x205, 0x3, 0x2, 
       0x2, 0x2, 0x207, 0x208, 0x3, 0x2, 0x2, 0x2, 0x208, 0x45, 0x3, 0x2, 
       0x2, 0x2, 0x209, 0x207, 0x3, 0x2, 0x2, 0x2, 0x20a, 0x26b, 0x7, 0x27, 
       0x2, 0x2, 0x20b, 0x20c, 0x7, 0x27, 0x2, 0x2, 0x20c, 0x26b, 0x9, 0x2, 
       0x2, 0x2, 0x20d, 0x20e, 0x7, 0x27, 0x2, 0x2, 0x20e, 0x26b, 0x7, 0x29, 
       0x2, 0x2, 0x20f, 0x210, 0x7, 0x27, 0x2, 0x2, 0x210, 0x211, 0x7, 0x29, 
       0x2, 0x2, 0x211, 0x26b, 0x9, 0x2, 0x2, 0x2, 0x212, 0x213, 0x5, 0x26, 
       0x14, 0x2, 0x213, 0x214, 0x7, 0x27, 0x2, 0x2, 0x214, 0x26b, 0x3, 
       0x2, 0x2, 0x2, 0x215, 0x216, 0x5, 0x26, 0x14, 0x2, 0x216, 0x217, 
       0x7, 0x27, 0x2, 0x2, 0x217, 0x218, 0x9, 0x2, 0x2, 0x2, 0x218, 0x26b, 
       0x3, 0x2, 0x2, 0x2, 0x219, 0x21a, 0x5, 0x26, 0x14, 0x2, 0x21a, 0x21b, 
       0x7, 0x27, 0x2, 0x2, 0x21b, 0x21c, 0x7, 0x29, 0x2, 0x2, 0x21c, 0x26b, 
       0x3, 0x2, 0x2, 0x2, 0x21d, 0x21e, 0x5, 0x26, 0x14, 0x2, 0x21e, 0x21f, 
       0x7, 0x27, 0x2, 0x2, 0x21f, 0x220, 0x7, 0x29, 0x2, 0x2, 0x220, 0x221, 
       0x9, 0x2, 0x2, 0x2, 0x221, 0x26b, 0x3, 0x2, 0x2, 0x2, 0x222, 0x223, 
       0x7, 0x27, 0x2, 0x2, 0x223, 0x26b, 0x5, 0x28, 0x15, 0x2, 0x224, 0x225, 
       0x7, 0x27, 0x2, 0x2, 0x225, 0x226, 0x5, 0x28, 0x15, 0x2, 0x226, 0x227, 
       0x9, 0x2, 0x2, 0x2, 0x227, 0x26b, 0x3, 0x2, 0x2, 0x2, 0x228, 0x229, 
       0x7, 0x27, 0x2, 0x2, 0x229, 0x22a, 0x5, 0x28, 0x15, 0x2, 0x22a, 0x22b, 
       0x7, 0x29, 0x2, 0x2, 0x22b, 0x26b, 0x3, 0x2, 0x2, 0x2, 0x22c, 0x22d, 
       0x7, 0x27, 0x2, 0x2, 0x22d, 0x22e, 0x5, 0x28, 0x15, 0x2, 0x22e, 0x22f, 
       0x7, 0x29, 0x2, 0x2, 0x22f, 0x230, 0x9, 0x2, 0x2, 0x2, 0x230, 0x26b, 
       0x3, 0x2, 0x2, 0x2, 0x231, 0x26b, 0x7, 0x2b, 0x2, 0x2, 0x232, 0x233, 
       0x7, 0x2b, 0x2, 0x2, 0x233, 0x26b, 0x9, 0x2, 0x2, 0x2, 0x234, 0x235, 
       0x7, 0x2b, 0x2, 0x2, 0x235, 0x26b, 0x7, 0x29, 0x2, 0x2, 0x236, 0x237, 
       0x7, 0x2b, 0x2, 0x2, 0x237, 0x238, 0x7, 0x29, 0x2, 0x2, 0x238, 0x26b, 
       0x9, 0x2, 0x2, 0x2, 0x239, 0x26b, 0x7, 0x2c, 0x2, 0x2, 0x23a, 0x23b, 
       0x7, 0x2c, 0x2, 0x2, 0x23b, 0x26b, 0x9, 0x2, 0x2, 0x2, 0x23c, 0x23d, 
       0x7, 0x2c, 0x2, 0x2, 0x23d, 0x26b, 0x7, 0x29, 0x2, 0x2, 0x23e, 0x23f, 
       0x7, 0x2c, 0x2, 0x2, 0x23f, 0x240, 0x7, 0x29, 0x2, 0x2, 0x240, 0x26b, 
       0x9, 0x2, 0x2, 0x2, 0x241, 0x26b, 0x5, 0x2c, 0x17, 0x2, 0x242, 0x243, 
       0x5, 0x2c, 0x17, 0x2, 0x243, 0x244, 0x9, 0x2, 0x2, 0x2, 0x244, 0x26b, 
       0x3, 0x2, 0x2, 0x2, 0x245, 0x246, 0x5, 0x2c, 0x17, 0x2, 0x246, 0x247, 
       0x7, 0x29, 0x2, 0x2, 0x247, 0x26b, 0x3, 0x2, 0x2, 0x2, 0x248, 0x249, 
       0x5, 0x2c, 0x17, 0x2, 0x249, 0x24a, 0x7, 0x29, 0x2, 0x2, 0x24a, 0x24b, 
       0x9, 0x2, 0x2, 0x2, 0x24b, 0x26b, 0x3, 0x2, 0x2, 0x2, 0x24c, 0x24d, 
       0x7, 0x27, 0x2, 0x2, 0x24d, 0x24e, 0x7, 0x18, 0x2, 0x2, 0x24e, 0x26b, 
       0x5, 0x2c, 0x17, 0x2, 0x24f, 0x250, 0x7, 0x27, 0x2, 0x2, 0x250, 0x251, 
       0x7, 0x18, 0x2, 0x2, 0x251, 0x252, 0x5, 0x2c, 0x17, 0x2, 0x252, 0x253, 
       0x9, 0x2, 0x2, 0x2, 0x253, 0x26b, 0x3, 0x2, 0x2, 0x2, 0x254, 0x255, 
       0x7, 0x27, 0x2, 0x2, 0x255, 0x256, 0x7, 0x18, 0x2, 0x2, 0x256, 0x257, 
       0x5, 0x2c, 0x17, 0x2, 0x257, 0x258, 0x7, 0x29, 0x2, 0x2, 0x258, 0x26b, 
       0x3, 0x2, 0x2, 0x2, 0x259, 0x25a, 0x7, 0x27, 0x2, 0x2, 0x25a, 0x25b, 
       0x7, 0x18, 0x2, 0x2, 0x25b, 0x25c, 0x5, 0x2c, 0x17, 0x2, 0x25c, 0x25d, 
       0x7, 0x29, 0x2, 0x2, 0x25d, 0x25e, 0x9, 0x2, 0x2, 0x2, 0x25e, 0x26b, 
       0x3, 0x2, 0x2, 0x2, 0x25f, 0x26b, 0x5, 0x20, 0x11, 0x2, 0x260, 0x261, 
       0x5, 0x20, 0x11, 0x2, 0x261, 0x262, 0x9, 0x2, 0x2, 0x2, 0x262, 0x26b, 
       0x3, 0x2, 0x2, 0x2, 0x263, 0x264, 0x5, 0x20, 0x11, 0x2, 0x264, 0x265, 
       0x7, 0x29, 0x2, 0x2, 0x265, 0x26b, 0x3, 0x2, 0x2, 0x2, 0x266, 0x267, 
       0x5, 0x20, 0x11, 0x2, 0x267, 0x268, 0x7, 0x29, 0x2, 0x2, 0x268, 0x269, 
       0x9, 0x2, 0x2, 0x2, 0x269, 0x26b, 0x3, 0x2, 0x2, 0x2, 0x26a, 0x20a, 
       0x3, 0x2, 0x2, 0x2, 0x26a, 0x20b, 0x3, 0x2, 0x2, 0x2, 0x26a, 0x20d, 
       0x3, 0x2, 0x2, 0x2, 0x26a, 0x20f, 0x3, 0x2, 0x2, 0x2, 0x26a, 0x212, 
       0x3, 0x2, 0x2, 0x2, 0x26a, 0x215, 0x3, 0x2, 0x2, 0x2, 0x26a, 0x219, 
       0x3, 0x2, 0x2, 0x2, 0x26a, 0x21d, 0x3, 0x2, 0x2, 0x2, 0x26a, 0x222, 
       0x3, 0x2, 0x2, 0x2, 0x26a, 0x224, 0x3, 0x2, 0x2, 0x2, 0x26a, 0x228, 
       0x3, 0x2, 0x2, 0x2, 0x26a, 0x22c, 0x3, 0x2, 0x2, 0x2, 0x26a, 0x231, 
       0x3, 0x2, 0x2, 0x2, 0x26a, 0x232, 0x3, 0x2, 0x2, 0x2, 0x26a, 0x234, 
       0x3, 0x2, 0x2, 0x2, 0x26a, 0x236, 0x3, 0x2, 0x2, 0x2, 0x26a, 0x239, 
       0x3, 0x2, 0x2, 0x2, 0x26a, 0x23a, 0x3, 0x2, 0x2, 0x2, 0x26a, 0x23c, 
       0x3, 0x2, 0x2, 0x2, 0x26a, 0x23e, 0x3, 0x2, 0x2, 0x2, 0x26a, 0x241, 
       0x3, 0x2, 0x2, 0x2, 0x26a, 0x242, 0x3, 0x2, 0x2, 0x2, 0x26a, 0x245, 
       0x3, 0x2, 0x2, 0x2, 0x26a, 0x248, 0x3, 0x2, 0x2, 0x2, 0x26a, 0x24c, 
       0x3, 0x2, 0x2, 0x2, 0x26a, 0x24f, 0x3, 0x2, 0x2, 0x2, 0x26a, 0x254, 
       0x3, 0x2, 0x2, 0x2, 0x26a, 0x259, 0x3, 0x2, 0x2, 0x2, 0x26a, 0x25f, 
       0x3, 0x2, 0x2, 0x2, 0x26a, 0x260, 0x3, 0x2, 0x2, 0x2, 0x26a, 0x263, 
       0x3, 0x2, 0x2, 0x2, 0x26a, 0x266, 0x3, 0x2, 0x2, 0x2, 0x26b, 0x47, 
       0x3, 0x2, 0x2, 0x2, 0x26c, 0x26d, 0x7, 0x8, 0x2, 0x2, 0x26d, 0x26e, 
       0x5, 0x4a, 0x26, 0x2, 0x26e, 0x26f, 0x7, 0x1f, 0x2, 0x2, 0x26f, 0x270, 
       0x7, 0x20, 0x2, 0x2, 0x270, 0x280, 0x3, 0x2, 0x2, 0x2, 0x271, 0x272, 
       0x7, 0x8, 0x2, 0x2, 0x272, 0x273, 0x5, 0x4a, 0x26, 0x2, 0x273, 0x274, 
       0x7, 0x1f, 0x2, 0x2, 0x274, 0x275, 0x5, 0x54, 0x2b, 0x2, 0x275, 0x276, 
       0x7, 0x20, 0x2, 0x2, 0x276, 0x280, 0x3, 0x2, 0x2, 0x2, 0x277, 0x278, 
       0x7, 0x8, 0x2, 0x2, 0x278, 0x279, 0x5, 0x4a, 0x26, 0x2, 0x279, 0x27a, 
       0x5, 0x2a, 0x16, 0x2, 0x27a, 0x280, 0x3, 0x2, 0x2, 0x2, 0x27b, 0x27c, 
       0x7, 0x8, 0x2, 0x2, 0x27c, 0x27d, 0x5, 0x4a, 0x26, 0x2, 0x27d, 0x27e, 
       0x5, 0x56, 0x2c, 0x2, 0x27e, 0x280, 0x3, 0x2, 0x2, 0x2, 0x27f, 0x26c, 
       0x3, 0x2, 0x2, 0x2, 0x27f, 0x271, 0x3, 0x2, 0x2, 0x2, 0x27f, 0x277, 
       0x3, 0x2, 0x2, 0x2, 0x27f, 0x27b, 0x3, 0x2, 0x2, 0x2, 0x280, 0x49, 
       0x3, 0x2, 0x2, 0x2, 0x281, 0x282, 0x7, 0x21, 0x2, 0x2, 0x282, 0x283, 
       0x5, 0x4c, 0x27, 0x2, 0x283, 0x284, 0x7, 0x17, 0x2, 0x2, 0x284, 0x285, 
       0x5, 0x4e, 0x28, 0x2, 0x285, 0x286, 0x7, 0x17, 0x2, 0x2, 0x286, 0x287, 
       0x5, 0x50, 0x29, 0x2, 0x287, 0x288, 0x7, 0x22, 0x2, 0x2, 0x288, 0x294, 
       0x3, 0x2, 0x2, 0x2, 0x289, 0x28a, 0x5, 0x4c, 0x27, 0x2, 0x28a, 0x28b, 
       0x7, 0x17, 0x2, 0x2, 0x28b, 0x28c, 0x5, 0x4e, 0x28, 0x2, 0x28c, 0x28d, 
       0x7, 0x17, 0x2, 0x2, 0x28d, 0x28e, 0x5, 0x50, 0x29, 0x2, 0x28e, 0x294, 
       0x3, 0x2, 0x2, 0x2, 0x28f, 0x294, 0x5, 0x40, 0x21, 0x2, 0x290, 0x291, 
       0x7, 0x21, 0x2, 0x2, 0x291, 0x294, 0x7, 0x22, 0x2, 0x2, 0x292, 0x294, 
       0x3, 0x2, 0x2, 0x2, 0x293, 0x281, 0x3, 0x2, 0x2, 0x2, 0x293, 0x289, 
       0x3, 0x2, 0x2, 0x2, 0x293, 0x28f, 0x3, 0x2, 0x2, 0x2, 0x293, 0x290, 
       0x3, 0x2, 0x2, 0x2, 0x293, 0x292, 0x3, 0x2, 0x2, 0x2, 0x294, 0x4b, 
       0x3, 0x2, 0x2, 0x2, 0x295, 0x298, 0x5, 0x14, 0xb, 0x2, 0x296, 0x298, 
       0x3, 0x2, 0x2, 0x2, 0x297, 0x295, 0x3, 0x2, 0x2, 0x2, 0x297, 0x296, 
       0x3, 0x2, 0x2, 0x2, 0x298, 0x4d, 0x3, 0x2, 0x2, 0x2, 0x299, 0x29c, 
       0x5, 0x40, 0x21, 0x2, 0x29a, 0x29c, 0x3, 0x2, 0x2, 0x2, 0x29b, 0x299, 
       0x3, 0x2, 0x2, 0x2, 0x29b, 0x29a, 0x3, 0x2, 0x2, 0x2, 0x29c, 0x4f, 
       0x3, 0x2, 0x2, 0x2, 0x29d, 0x2a0, 0x5, 0x52, 0x2a, 0x2, 0x29e, 0x2a0, 
       0x3, 0x2, 0x2, 0x2, 0x29f, 0x29d, 0x3, 0x2, 0x2, 0x2, 0x29f, 0x29e, 
       0x3, 0x2, 0x2, 0x2, 0x2a0, 0x51, 0x3, 0x2, 0x2, 0x2, 0x2a1, 0x2ac, 
       0x5, 0x22, 0x12, 0x2, 0x2a2, 0x2ac, 0x5, 0x20, 0x11, 0x2, 0x2a3, 
       0x2a4, 0x5, 0x22, 0x12, 0x2, 0x2a4, 0x2a5, 0x7, 0x1c, 0x2, 0x2, 0x2a5, 
       0x2a6, 0x5, 0x52, 0x2a, 0x2, 0x2a6, 0x2ac, 0x3, 0x2, 0x2, 0x2, 0x2a7, 
       0x2a8, 0x5, 0x20, 0x11, 0x2, 0x2a8, 0x2a9, 0x7, 0x1c, 0x2, 0x2, 0x2a9, 
       0x2aa, 0x5, 0x52, 0x2a, 0x2, 0x2aa, 0x2ac, 0x3, 0x2, 0x2, 0x2, 0x2ab, 
       0x2a1, 0x3, 0x2, 0x2, 0x2, 0x2ab, 0x2a2, 0x3, 0x2, 0x2, 0x2, 0x2ab, 
       0x2a3, 0x3, 0x2, 0x2, 0x2, 0x2ab, 0x2a7, 0x3, 0x2, 0x2, 0x2, 0x2ac, 
       0x53, 0x3, 0x2, 0x2, 0x2, 0x2ad, 0x2b2, 0x5, 0x6, 0x4, 0x2, 0x2ae, 
       0x2af, 0x5, 0x6, 0x4, 0x2, 0x2af, 0x2b0, 0x5, 0x54, 0x2b, 0x2, 0x2b0, 
       0x2b2, 0x3, 0x2, 0x2, 0x2, 0x2b1, 0x2ad, 0x3, 0x2, 0x2, 0x2, 0x2b1, 
       0x2ae, 0x3, 0x2, 0x2, 0x2, 0x2b2, 0x55, 0x3, 0x2, 0x2, 0x2, 0x2b3, 
       0x2bd, 0x5, 0x38, 0x1d, 0x2, 0x2b4, 0x2b5, 0x5, 0x38, 0x1d, 0x2, 
       0x2b5, 0x2b6, 0x5, 0x56, 0x2c, 0x2, 0x2b6, 0x2bd, 0x3, 0x2, 0x2, 
       0x2, 0x2b7, 0x2bd, 0x5, 0x48, 0x25, 0x2, 0x2b8, 0x2b9, 0x5, 0x48, 
       0x25, 0x2, 0x2b9, 0x2ba, 0x5, 0x56, 0x2c, 0x2, 0x2ba, 0x2bd, 0x3, 
       0x2, 0x2, 0x2, 0x2bb, 0x2bd, 0x5, 0x58, 0x2d, 0x2, 0x2bc, 0x2b3, 
       0x3, 0x2, 0x2, 0x2, 0x2bc, 0x2b4, 0x3, 0x2, 0x2, 0x2, 0x2bc, 0x2b7, 
       0x3, 0x2, 0x2, 0x2, 0x2bc, 0x2b8, 0x3, 0x2, 0x2, 0x2, 0x2bc, 0x2bb, 
       0x3, 0x2, 0x2, 0x2, 0x2bd, 0x57, 0x3, 0x2, 0x2, 0x2, 0x2be, 0x2bf, 
       0x7, 0x9, 0x2, 0x2, 0x2bf, 0x2c0, 0x5, 0x5a, 0x2e, 0x2, 0x2c0, 0x2c1, 
       0x7, 0x17, 0x2, 0x2, 0x2c1, 0x59, 0x3, 0x2, 0x2, 0x2, 0x2c2, 0x2c6, 
       0x5, 0x80, 0x41, 0x2, 0x2c3, 0x2c6, 0x5, 0x22, 0x12, 0x2, 0x2c4, 
       0x2c6, 0x5, 0x20, 0x11, 0x2, 0x2c5, 0x2c2, 0x3, 0x2, 0x2, 0x2, 0x2c5, 
       0x2c3, 0x3, 0x2, 0x2, 0x2, 0x2c5, 0x2c4, 0x3, 0x2, 0x2, 0x2, 0x2c6, 
       0x5b, 0x3, 0x2, 0x2, 0x2, 0x2c7, 0x2c8, 0x5, 0x60, 0x31, 0x2, 0x2c8, 
       0x2c9, 0x7, 0x1f, 0x2, 0x2, 0x2c9, 0x2ca, 0x7, 0x20, 0x2, 0x2, 0x2ca, 
       0x2e6, 0x3, 0x2, 0x2, 0x2, 0x2cb, 0x2cc, 0x5, 0x60, 0x31, 0x2, 0x2cc, 
       0x2cd, 0x7, 0x1f, 0x2, 0x2, 0x2cd, 0x2ce, 0x5, 0x6a, 0x36, 0x2, 0x2ce, 
       0x2cf, 0x7, 0x20, 0x2, 0x2, 0x2cf, 0x2e6, 0x3, 0x2, 0x2, 0x2, 0x2d0, 
       0x2d1, 0x5, 0x62, 0x32, 0x2, 0x2d1, 0x2d2, 0x7, 0x1f, 0x2, 0x2, 0x2d2, 
       0x2d3, 0x7, 0x20, 0x2, 0x2, 0x2d3, 0x2e6, 0x3, 0x2, 0x2, 0x2, 0x2d4, 
       0x2d5, 0x5, 0x62, 0x32, 0x2, 0x2d5, 0x2d6, 0x7, 0x1f, 0x2, 0x2, 0x2d6, 
       0x2d7, 0x5, 0x6a, 0x36, 0x2, 0x2d7, 0x2d8, 0x7, 0x20, 0x2, 0x2, 0x2d8, 
       0x2e6, 0x3, 0x2, 0x2, 0x2, 0x2d9, 0x2da, 0x5, 0x66, 0x34, 0x2, 0x2da, 
       0x2db, 0x7, 0x1f, 0x2, 0x2, 0x2db, 0x2dc, 0x7, 0x20, 0x2, 0x2, 0x2dc, 
       0x2e6, 0x3, 0x2, 0x2, 0x2, 0x2dd, 0x2de, 0x5, 0x66, 0x34, 0x2, 0x2de, 
       0x2df, 0x7, 0x1f, 0x2, 0x2, 0x2df, 0x2e0, 0x5, 0x6a, 0x36, 0x2, 0x2e0, 
       0x2e1, 0x7, 0x20, 0x2, 0x2, 0x2e1, 0x2e6, 0x3, 0x2, 0x2, 0x2, 0x2e2, 
       0x2e3, 0x5, 0x68, 0x35, 0x2, 0x2e3, 0x2e4, 0x7, 0x17, 0x2, 0x2, 0x2e4, 
       0x2e6, 0x3, 0x2, 0x2, 0x2, 0x2e5, 0x2c7, 0x3, 0x2, 0x2, 0x2, 0x2e5, 
       0x2cb, 0x3, 0x2, 0x2, 0x2, 0x2e5, 0x2d0, 0x3, 0x2, 0x2, 0x2, 0x2e5, 
       0x2d4, 0x3, 0x2, 0x2, 0x2, 0x2e5, 0x2d9, 0x3, 0x2, 0x2, 0x2, 0x2e5, 
       0x2dd, 0x3, 0x2, 0x2, 0x2, 0x2e5, 0x2e2, 0x3, 0x2, 0x2, 0x2, 0x2e6, 
       0x5d, 0x3, 0x2, 0x2, 0x2, 0x2e7, 0x2e8, 0x7, 0xa, 0x2, 0x2, 0x2e8, 
       0x2e9, 0x7, 0x27, 0x2, 0x2, 0x2e9, 0x2ea, 0x7, 0x21, 0x2, 0x2, 0x2ea, 
       0x300, 0x7, 0x22, 0x2, 0x2, 0x2eb, 0x2ec, 0x7, 0xa, 0x2, 0x2, 0x2ec, 
       0x2ed, 0x7, 0x27, 0x2, 0x2, 0x2ed, 0x2ee, 0x7, 0x21, 0x2, 0x2, 0x2ee, 
       0x2ef, 0x7, 0x22, 0x2, 0x2, 0x2ef, 0x2f0, 0x7, 0x16, 0x2, 0x2, 0x2f0, 
       0x300, 0x7, 0x27, 0x2, 0x2, 0x2f1, 0x2f2, 0x7, 0xa, 0x2, 0x2, 0x2f2, 
       0x2f3, 0x7, 0x27, 0x2, 0x2, 0x2f3, 0x2f4, 0x7, 0x21, 0x2, 0x2, 0x2f4, 
       0x2f5, 0x5, 0x6c, 0x37, 0x2, 0x2f5, 0x2f6, 0x7, 0x22, 0x2, 0x2, 0x2f6, 
       0x300, 0x3, 0x2, 0x2, 0x2, 0x2f7, 0x2f8, 0x7, 0xa, 0x2, 0x2, 0x2f8, 
       0x2f9, 0x7, 0x27, 0x2, 0x2, 0x2f9, 0x2fa, 0x7, 0x21, 0x2, 0x2, 0x2fa, 
       0x2fb, 0x5, 0x6c, 0x37, 0x2, 0x2fb, 0x2fc, 0x7, 0x22, 0x2, 0x2, 0x2fc, 
       0x2fd, 0x7, 0x16, 0x2, 0x2, 0x2fd, 0x2fe, 0x7, 0x27, 0x2, 0x2, 0x2fe, 
       0x300, 0x3, 0x2, 0x2, 0x2, 0x2ff, 0x2e7, 0x3, 0x2, 0x2, 0x2, 0x2ff, 
       0x2eb, 0x3, 0x2, 0x2, 0x2, 0x2ff, 0x2f1, 0x3, 0x2, 0x2, 0x2, 0x2ff, 
       0x2f7, 0x3, 0x2, 0x2, 0x2, 0x300, 0x5f, 0x3, 0x2, 0x2, 0x2, 0x301, 
       0x302, 0x5, 0x5e, 0x30, 0x2, 0x302, 0x61, 0x3, 0x2, 0x2, 0x2, 0x303, 
       0x304, 0x5, 0x64, 0x33, 0x2, 0x304, 0x305, 0x5, 0x5e, 0x30, 0x2, 
       0x305, 0x31b, 0x3, 0x2, 0x2, 0x2, 0x306, 0x307, 0x7, 0xe, 0x2, 0x2, 
       0x307, 0x31b, 0x5, 0x5e, 0x30, 0x2, 0x308, 0x309, 0x5, 0x64, 0x33, 
       0x2, 0x309, 0x30a, 0x7, 0xe, 0x2, 0x2, 0x30a, 0x30b, 0x5, 0x5e, 0x30, 
       0x2, 0x30b, 0x31b, 0x3, 0x2, 0x2, 0x2, 0x30c, 0x30d, 0x7, 0xf, 0x2, 
       0x2, 0x30d, 0x30e, 0x5, 0x64, 0x33, 0x2, 0x30e, 0x30f, 0x7, 0xe, 
       0x2, 0x2, 0x30f, 0x310, 0x5, 0x5e, 0x30, 0x2, 0x310, 0x31b, 0x3, 
       0x2, 0x2, 0x2, 0x311, 0x312, 0x7, 0xf, 0x2, 0x2, 0x312, 0x313, 0x5, 
       0x64, 0x33, 0x2, 0x313, 0x314, 0x5, 0x5e, 0x30, 0x2, 0x314, 0x31b, 
       0x3, 0x2, 0x2, 0x2, 0x315, 0x316, 0x7, 0xf, 0x2, 0x2, 0x316, 0x31b, 
       0x5, 0x5e, 0x30, 0x2, 0x317, 0x318, 0x7, 0xf, 0x2, 0x2, 0x318, 0x319, 
       0x7, 0xe, 0x2, 0x2, 0x319, 0x31b, 0x5, 0x5e, 0x30, 0x2, 0x31a, 0x303, 
       0x3, 0x2, 0x2, 0x2, 0x31a, 0x306, 0x3, 0x2, 0x2, 0x2, 0x31a, 0x308, 
       0x3, 0x2, 0x2, 0x2, 0x31a, 0x30c, 0x3, 0x2, 0x2, 0x2, 0x31a, 0x311, 
       0x3, 0x2, 0x2, 0x2, 0x31a, 0x315, 0x3, 0x2, 0x2, 0x2, 0x31a, 0x317, 
       0x3, 0x2, 0x2, 0x2, 0x31b, 0x63, 0x3, 0x2, 0x2, 0x2, 0x31c, 0x31d, 
       0x9, 0x3, 0x2, 0x2, 0x31d, 0x65, 0x3, 0x2, 0x2, 0x2, 0x31e, 0x31f, 
       0x7, 0x27, 0x2, 0x2, 0x31f, 0x320, 0x7, 0x21, 0x2, 0x2, 0x320, 0x327, 
       0x7, 0x22, 0x2, 0x2, 0x321, 0x322, 0x7, 0x27, 0x2, 0x2, 0x322, 0x323, 
       0x7, 0x21, 0x2, 0x2, 0x323, 0x324, 0x5, 0x6c, 0x37, 0x2, 0x324, 0x325, 
       0x7, 0x22, 0x2, 0x2, 0x325, 0x327, 0x3, 0x2, 0x2, 0x2, 0x326, 0x31e, 
       0x3, 0x2, 0x2, 0x2, 0x326, 0x321, 0x3, 0x2, 0x2, 0x2, 0x327, 0x67, 
       0x3, 0x2, 0x2, 0x2, 0x328, 0x32b, 0x5, 0x60, 0x31, 0x2, 0x329, 0x32b, 
       0x5, 0x62, 0x32, 0x2, 0x32a, 0x328, 0x3, 0x2, 0x2, 0x2, 0x32a, 0x329, 
       0x3, 0x2, 0x2, 0x2, 0x32b, 0x69, 0x3, 0x2, 0x2, 0x2, 0x32c, 0x331, 
       0x5, 0x6, 0x4, 0x2, 0x32d, 0x32e, 0x5, 0x6, 0x4, 0x2, 0x32e, 0x32f, 
       0x5, 0x6a, 0x36, 0x2, 0x32f, 0x331, 0x3, 0x2, 0x2, 0x2, 0x330, 0x32c, 
       0x3, 0x2, 0x2, 0x2, 0x330, 0x32d, 0x3, 0x2, 0x2, 0x2, 0x331, 0x6b, 
       0x3, 0x2, 0x2, 0x2, 0x332, 0x338, 0x5, 0x6e, 0x38, 0x2, 0x333, 0x334, 
       0x5, 0x6e, 0x38, 0x2, 0x334, 0x335, 0x7, 0x1c, 0x2, 0x2, 0x335, 0x336, 
       0x5, 0x6c, 0x37, 0x2, 0x336, 0x338, 0x3, 0x2, 0x2, 0x2, 0x337, 0x332, 
       0x3, 0x2, 0x2, 0x2, 0x337, 0x333, 0x3, 0x2, 0x2, 0x2, 0x338, 0x6d, 
       0x3, 0x2, 0x2, 0x2, 0x339, 0x33a, 0x7, 0x27, 0x2, 0x2, 0x33a, 0x33b, 
       0x7, 0x29, 0x2, 0x2, 0x33b, 0x6f, 0x3, 0x2, 0x2, 0x2, 0x33c, 0x340, 
       0x5, 0x72, 0x3a, 0x2, 0x33d, 0x340, 0x5, 0x76, 0x3c, 0x2, 0x33e, 
       0x340, 0x5, 0x7a, 0x3e, 0x2, 0x33f, 0x33c, 0x3, 0x2, 0x2, 0x2, 0x33f, 
       0x33d, 0x3, 0x2, 0x2, 0x2, 0x33f, 0x33e, 0x3, 0x2, 0x2, 0x2, 0x340, 
       0x71, 0x3, 0x2, 0x2, 0x2, 0x341, 0x342, 0x5, 0x74, 0x3b, 0x2, 0x342, 
       0x73, 0x3, 0x2, 0x2, 0x2, 0x343, 0x344, 0x7, 0x10, 0x2, 0x2, 0x344, 
       0x345, 0x7, 0x27, 0x2, 0x2, 0x345, 0x346, 0x7, 0x1f, 0x2, 0x2, 0x346, 
       0x35c, 0x7, 0x20, 0x2, 0x2, 0x347, 0x348, 0x7, 0x10, 0x2, 0x2, 0x348, 
       0x349, 0x7, 0x27, 0x2, 0x2, 0x349, 0x34a, 0x7, 0x1f, 0x2, 0x2, 0x34a, 
       0x34b, 0x5, 0x6a, 0x36, 0x2, 0x34b, 0x34c, 0x7, 0x20, 0x2, 0x2, 0x34c, 
       0x35c, 0x3, 0x2, 0x2, 0x2, 0x34d, 0x34e, 0x7, 0x10, 0x2, 0x2, 0x34e, 
       0x34f, 0x7, 0x27, 0x2, 0x2, 0x34f, 0x350, 0x7, 0x12, 0x2, 0x2, 0x350, 
       0x351, 0x7, 0x27, 0x2, 0x2, 0x351, 0x352, 0x7, 0x1f, 0x2, 0x2, 0x352, 
       0x35c, 0x7, 0x20, 0x2, 0x2, 0x353, 0x354, 0x7, 0x10, 0x2, 0x2, 0x354, 
       0x355, 0x7, 0x27, 0x2, 0x2, 0x355, 0x356, 0x7, 0x12, 0x2, 0x2, 0x356, 
       0x357, 0x7, 0x27, 0x2, 0x2, 0x357, 0x358, 0x7, 0x1f, 0x2, 0x2, 0x358, 
       0x359, 0x5, 0x6a, 0x36, 0x2, 0x359, 0x35a, 0x7, 0x20, 0x2, 0x2, 0x35a, 
       0x35c, 0x3, 0x2, 0x2, 0x2, 0x35b, 0x343, 0x3, 0x2, 0x2, 0x2, 0x35b, 
       0x347, 0x3, 0x2, 0x2, 0x2, 0x35b, 0x34d, 0x3, 0x2, 0x2, 0x2, 0x35b, 
       0x353, 0x3, 0x2, 0x2, 0x2, 0x35c, 0x75, 0x3, 0x2, 0x2, 0x2, 0x35d, 
       0x35e, 0x5, 0x78, 0x3d, 0x2, 0x35e, 0x77, 0x3, 0x2, 0x2, 0x2, 0x35f, 
       0x360, 0x7, 0x11, 0x2, 0x2, 0x360, 0x361, 0x7, 0x27, 0x2, 0x2, 0x361, 
       0x362, 0x7, 0x1f, 0x2, 0x2, 0x362, 0x378, 0x7, 0x20, 0x2, 0x2, 0x363, 
       0x364, 0x7, 0x11, 0x2, 0x2, 0x364, 0x365, 0x7, 0x27, 0x2, 0x2, 0x365, 
       0x366, 0x7, 0x1f, 0x2, 0x2, 0x366, 0x367, 0x5, 0x6a, 0x36, 0x2, 0x367, 
       0x368, 0x7, 0x20, 0x2, 0x2, 0x368, 0x378, 0x3, 0x2, 0x2, 0x2, 0x369, 
       0x36a, 0x7, 0x11, 0x2, 0x2, 0x36a, 0x36b, 0x7, 0x27, 0x2, 0x2, 0x36b, 
       0x36c, 0x7, 0x12, 0x2, 0x2, 0x36c, 0x36d, 0x7, 0x27, 0x2, 0x2, 0x36d, 
       0x36e, 0x7, 0x1f, 0x2, 0x2, 0x36e, 0x378, 0x7, 0x20, 0x2, 0x2, 0x36f, 
       0x370, 0x7, 0x11, 0x2, 0x2, 0x370, 0x371, 0x7, 0x27, 0x2, 0x2, 0x371, 
       0x372, 0x7, 0x12, 0x2, 0x2, 0x372, 0x373, 0x7, 0x27, 0x2, 0x2, 0x373, 
       0x374, 0x7, 0x1f, 0x2, 0x2, 0x374, 0x375, 0x5, 0x6a, 0x36, 0x2, 0x375, 
       0x376, 0x7, 0x20, 0x2, 0x2, 0x376, 0x378, 0x3, 0x2, 0x2, 0x2, 0x377, 
       0x35f, 0x3, 0x2, 0x2, 0x2, 0x377, 0x363, 0x3, 0x2, 0x2, 0x2, 0x377, 
       0x369, 0x3, 0x2, 0x2, 0x2, 0x377, 0x36f, 0x3, 0x2, 0x2, 0x2, 0x378, 
       0x79, 0x3, 0x2, 0x2, 0x2, 0x379, 0x37a, 0x5, 0x7c, 0x3f, 0x2, 0x37a, 
       0x37b, 0x7, 0x1f, 0x2, 0x2, 0x37b, 0x37c, 0x7, 0x20, 0x2, 0x2, 0x37c, 
       0x383, 0x3, 0x2, 0x2, 0x2, 0x37d, 0x37e, 0x5, 0x7c, 0x3f, 0x2, 0x37e, 
       0x37f, 0x7, 0x1f, 0x2, 0x2, 0x37f, 0x380, 0x5, 0x6a, 0x36, 0x2, 0x380, 
       0x381, 0x7, 0x20, 0x2, 0x2, 0x381, 0x383, 0x3, 0x2, 0x2, 0x2, 0x382, 
       0x379, 0x3, 0x2, 0x2, 0x2, 0x382, 0x37d, 0x3, 0x2, 0x2, 0x2, 0x383, 
       0x7b, 0x3, 0x2, 0x2, 0x2, 0x384, 0x388, 0x5, 0x7e, 0x40, 0x2, 0x385, 
       0x386, 0x7, 0xf, 0x2, 0x2, 0x386, 0x388, 0x5, 0x7e, 0x40, 0x2, 0x387, 
       0x384, 0x3, 0x2, 0x2, 0x2, 0x387, 0x385, 0x3, 0x2, 0x2, 0x2, 0x388, 
       0x7d, 0x3, 0x2, 0x2, 0x2, 0x389, 0x38a, 0x7, 0x13, 0x2, 0x2, 0x38a, 
       0x39a, 0x7, 0x27, 0x2, 0x2, 0x38b, 0x38c, 0x7, 0x13, 0x2, 0x2, 0x38c, 
       0x38d, 0x7, 0x27, 0x2, 0x2, 0x38d, 0x38e, 0x7, 0x12, 0x2, 0x2, 0x38e, 
       0x39a, 0x7, 0x27, 0x2, 0x2, 0x38f, 0x390, 0x7, 0x13, 0x2, 0x2, 0x390, 
       0x391, 0x7, 0x27, 0x2, 0x2, 0x391, 0x392, 0x7, 0x14, 0x2, 0x2, 0x392, 
       0x39a, 0x7, 0x27, 0x2, 0x2, 0x393, 0x394, 0x7, 0x13, 0x2, 0x2, 0x394, 
       0x395, 0x7, 0x27, 0x2, 0x2, 0x395, 0x396, 0x7, 0x12, 0x2, 0x2, 0x396, 
       0x397, 0x7, 0x27, 0x2, 0x2, 0x397, 0x398, 0x7, 0x14, 0x2, 0x2, 0x398, 
       0x39a, 0x7, 0x27, 0x2, 0x2, 0x399, 0x389, 0x3, 0x2, 0x2, 0x2, 0x399, 
       0x38b, 0x3, 0x2, 0x2, 0x2, 0x399, 0x38f, 0x3, 0x2, 0x2, 0x2, 0x399, 
       0x393, 0x3, 0x2, 0x2, 0x2, 0x39a, 0x7f, 0x3, 0x2, 0x2, 0x2, 0x39b, 
       0x3b2, 0x7, 0x27, 0x2, 0x2, 0x39c, 0x39d, 0x7, 0x27, 0x2, 0x2, 0x39d, 
       0x3b2, 0x7, 0x29, 0x2, 0x2, 0x39e, 0x3b2, 0x7, 0x2b, 0x2, 0x2, 0x39f, 
       0x3a0, 0x7, 0x2b, 0x2, 0x2, 0x3a0, 0x3b2, 0x7, 0x29, 0x2, 0x2, 0x3a1, 
       0x3b2, 0x7, 0x2c, 0x2, 0x2, 0x3a2, 0x3a3, 0x7, 0x2c, 0x2, 0x2, 0x3a3, 
       0x3b2, 0x7, 0x29, 0x2, 0x2, 0x3a4, 0x3b2, 0x7, 0x2a, 0x2, 0x2, 0x3a5, 
       0x3b2, 0x5, 0x18, 0xd, 0x2, 0x3a6, 0x3b2, 0x5, 0x1c, 0xf, 0x2, 0x3a7, 
       0x3b2, 0x5, 0x20, 0x11, 0x2, 0x3a8, 0x3b2, 0x5, 0x2c, 0x17, 0x2, 
       0x3a9, 0x3aa, 0x5, 0x82, 0x42, 0x2, 0x3aa, 0x3ab, 0x7, 0x19, 0x2, 
       0x2, 0x3ab, 0x3ac, 0x5, 0x84, 0x43, 0x2, 0x3ac, 0x3b2, 0x3, 0x2, 
       0x2, 0x2, 0x3ad, 0x3ae, 0x5, 0x82, 0x42, 0x2, 0x3ae, 0x3af, 0x7, 
       0x1b, 0x2, 0x2, 0x3af, 0x3b0, 0x5, 0x84, 0x43, 0x2, 0x3b0, 0x3b2, 
       0x3, 0x2, 0x2, 0x2, 0x3b1, 0x39b, 0x3, 0x2, 0x2, 0x2, 0x3b1, 0x39c, 
       0x3, 0x2, 0x2, 0x2, 0x3b1, 0x39e, 0x3, 0x2, 0x2, 0x2, 0x3b1, 0x39f, 
       0x3, 0x2, 0x2, 0x2, 0x3b1, 0x3a1, 0x3, 0x2, 0x2, 0x2, 0x3b1, 0x3a2, 
       0x3, 0x2, 0x2, 0x2, 0x3b1, 0x3a4, 0x3, 0x2, 0x2, 0x2, 0x3b1, 0x3a5, 
       0x3, 0x2, 0x2, 0x2, 0x3b1, 0x3a6, 0x3, 0x2, 0x2, 0x2, 0x3b1, 0x3a7, 
       0x3, 0x2, 0x2, 0x2, 0x3b1, 0x3a8, 0x3, 0x2, 0x2, 0x2, 0x3b1, 0x3a9, 
       0x3, 0x2, 0x2, 0x2, 0x3b1, 0x3ad, 0x3, 0x2, 0x2, 0x2, 0x3b2, 0x81, 
       0x3, 0x2, 0x2, 0x2, 0x3b3, 0x3b4, 0x7, 0x27, 0x2, 0x2, 0x3b4, 0x83, 
       0x3, 0x2, 0x2, 0x2, 0x3b5, 0x3b6, 0x7, 0x27, 0x2, 0x2, 0x3b6, 0x85, 
       0x3, 0x2, 0x2, 0x2, 0x32, 0x8e, 0x9a, 0xa7, 0xd9, 0xe0, 0xf2, 0xfa, 
       0x101, 0x109, 0x114, 0x11e, 0x16d, 0x182, 0x18c, 0x198, 0x19d, 0x1a7, 
       0x1bc, 0x1d1, 0x1df, 0x1ea, 0x1f6, 0x1fc, 0x207, 0x26a, 0x27f, 0x293, 
       0x297, 0x29b, 0x29f, 0x2ab, 0x2b1, 0x2bc, 0x2c5, 0x2e5, 0x2ff, 0x31a, 
       0x326, 0x32a, 0x330, 0x337, 0x33f, 0x35b, 0x377, 0x382, 0x387, 0x399, 
       0x3b1, 
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
