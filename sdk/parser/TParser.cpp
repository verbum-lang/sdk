
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
    setState(38);
    fileContent(0);
    setState(39);
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
    setState(46);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 0, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        if (!_parseListeners.empty())
          triggerExitRuleEvent();
        previousContext = _localctx;
        _localctx = _tracker.createInstance<FileContentContext>(parentContext, parentState);
        pushNewRecursionContext(_localctx, startState, RuleFileContent);
        setState(42);

        if (!(precpred(_ctx, 2))) throw FailedPredicateException(this, "precpred(_ctx, 2)");
        setState(43);
        sentence(); 
      }
      setState(48);
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

TParser::LiveTokensContext* TParser::SentenceContext::liveTokens() {
  return getRuleContext<TParser::LiveTokensContext>(0);
}

TParser::UseContext* TParser::SentenceContext::use() {
  return getRuleContext<TParser::UseContext>(0);
}

TParser::VariableContext* TParser::SentenceContext::variable() {
  return getRuleContext<TParser::VariableContext>(0);
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
    setState(52);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case TParser::Newline: {
        enterOuterAlt(_localctx, 1);
        setState(49);
        liveTokens();
        break;
      }

      case TParser::Use: {
        enterOuterAlt(_localctx, 2);
        setState(50);
        use();
        break;
      }

      case TParser::Var: {
        enterOuterAlt(_localctx, 3);
        setState(51);
        variable();
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

//----------------- LiveTokensContext ------------------------------------------------------------------

TParser::LiveTokensContext::LiveTokensContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::LiveTokensContext::Newline() {
  return getToken(TParser::Newline, 0);
}


size_t TParser::LiveTokensContext::getRuleIndex() const {
  return TParser::RuleLiveTokens;
}

void TParser::LiveTokensContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterLiveTokens(this);
}

void TParser::LiveTokensContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitLiveTokens(this);
}


antlrcpp::Any TParser::LiveTokensContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitLiveTokens(this);
  else
    return visitor->visitChildren(this);
}

TParser::LiveTokensContext* TParser::liveTokens() {
  LiveTokensContext *_localctx = _tracker.createInstance<LiveTokensContext>(_ctx, getState());
  enterRule(_localctx, 6, TParser::RuleLiveTokens);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(54);
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
    setState(56);
    match(TParser::Use);
    setState(57);
    useValue();
    setState(58);
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
    setState(65);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 2, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(60);
      useString();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(61);
      useString();
      setState(62);
      match(TParser::Separator);
      setState(63);
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
    setState(67);
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

tree::TerminalNode* TParser::VariableContext::Var() {
  return getToken(TParser::Var, 0);
}

TParser::VariableMembersContext* TParser::VariableContext::variableMembers() {
  return getRuleContext<TParser::VariableMembersContext>(0);
}

tree::TerminalNode* TParser::VariableContext::End() {
  return getToken(TParser::End, 0);
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
    setState(69);
    match(TParser::Var);
    setState(70);
    variableMembers();
    setState(71);
    match(TParser::End);
   
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
  enterRule(_localctx, 16, TParser::RuleVariableMembers);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(78);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 3, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(73);
      variableDefinition();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(74);
      variableDefinition();
      setState(75);
      match(TParser::Separator);
      setState(76);
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

TParser::VariableValueContext* TParser::VariableDefinitionContext::variableValue() {
  return getRuleContext<TParser::VariableValueContext>(0);
}

tree::TerminalNode* TParser::VariableDefinitionContext::TypeSpec() {
  return getToken(TParser::TypeSpec, 0);
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
  enterRule(_localctx, 18, TParser::RuleVariableDefinition);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(87);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 4, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(80);
      match(TParser::Identifier);
      setState(81);
      match(TParser::Attr);
      setState(82);
      variableValue();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(83);
      match(TParser::Identifier);
      setState(84);
      match(TParser::TypeSpec);
      setState(85);
      match(TParser::Attr);
      setState(86);
      variableValue();
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

//----------------- VariableValueContext ------------------------------------------------------------------

TParser::VariableValueContext::VariableValueContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::GeneralValueContext* TParser::VariableValueContext::generalValue() {
  return getRuleContext<TParser::GeneralValueContext>(0);
}


size_t TParser::VariableValueContext::getRuleIndex() const {
  return TParser::RuleVariableValue;
}

void TParser::VariableValueContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterVariableValue(this);
}

void TParser::VariableValueContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitVariableValue(this);
}


antlrcpp::Any TParser::VariableValueContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitVariableValue(this);
  else
    return visitor->visitChildren(this);
}

TParser::VariableValueContext* TParser::variableValue() {
  VariableValueContext *_localctx = _tracker.createInstance<VariableValueContext>(_ctx, getState());
  enterRule(_localctx, 20, TParser::RuleVariableValue);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(89);
    generalValue();
   
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
    setState(97);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 5, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(91);
      match(TParser::OpenArIndex);
      setState(92);
      match(TParser::CloseArIndex);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(93);
      match(TParser::OpenArIndex);
      setState(94);
      indexArrayElements();
      setState(95);
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
    setState(104);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 6, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(99);
      generalValue();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(100);
      generalValue();
      setState(101);
      match(TParser::Separator);
      setState(102);
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
    setState(112);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 7, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(106);
      match(TParser::OpenBlock);
      setState(107);
      match(TParser::CloseBlock);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(108);
      match(TParser::OpenBlock);
      setState(109);
      associativeArrayElements();
      setState(110);
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
    setState(123);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 8, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(114);
      match(TParser::Identifier);
      setState(115);
      match(TParser::TwoPoint);
      setState(116);
      generalValue();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(117);
      match(TParser::Identifier);
      setState(118);
      match(TParser::TwoPoint);
      setState(119);
      generalValue();
      setState(120);
      match(TParser::Separator);
      setState(121);
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
    setState(125);
    match(TParser::OpenOp);
    setState(126);
    operationElements();
    setState(127);
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
    setState(133);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 9, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(129);
      operationValue();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(130);
      operationValue();
      setState(131);
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

tree::TerminalNode* TParser::OperationValueContext::Integer() {
  return getToken(TParser::Integer, 0);
}

tree::TerminalNode* TParser::OperationValueContext::Float() {
  return getToken(TParser::Float, 0);
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
    setState(170);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 10, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(135);
      match(TParser::Identifier);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(136);
      match(TParser::Identifier);
      setState(137);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(138);
      match(TParser::Identifier);
      setState(139);
      match(TParser::TypeSpec);
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(140);
      match(TParser::Identifier);
      setState(141);
      match(TParser::TypeSpec);
      setState(142);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 5: {
      enterOuterAlt(_localctx, 5);
      setState(143);
      match(TParser::Integer);
      break;
    }

    case 6: {
      enterOuterAlt(_localctx, 6);
      setState(144);
      match(TParser::Integer);
      setState(145);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 7: {
      enterOuterAlt(_localctx, 7);
      setState(146);
      match(TParser::Integer);
      setState(147);
      match(TParser::TypeSpec);
      break;
    }

    case 8: {
      enterOuterAlt(_localctx, 8);
      setState(148);
      match(TParser::Integer);
      setState(149);
      match(TParser::TypeSpec);
      setState(150);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 9: {
      enterOuterAlt(_localctx, 9);
      setState(151);
      match(TParser::Float);
      break;
    }

    case 10: {
      enterOuterAlt(_localctx, 10);
      setState(152);
      match(TParser::Float);
      setState(153);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 11: {
      enterOuterAlt(_localctx, 11);
      setState(154);
      match(TParser::Float);
      setState(155);
      match(TParser::TypeSpec);
      break;
    }

    case 12: {
      enterOuterAlt(_localctx, 12);
      setState(156);
      match(TParser::Float);
      setState(157);
      match(TParser::TypeSpec);
      setState(158);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 13: {
      enterOuterAlt(_localctx, 13);
      setState(159);
      operationBlock();
      break;
    }

    case 14: {
      enterOuterAlt(_localctx, 14);
      setState(160);
      operationBlock();
      setState(161);
      match(TParser::ArithmeticOperator);
      break;
    }

    case 15: {
      enterOuterAlt(_localctx, 15);
      setState(163);
      operationBlock();
      setState(164);
      match(TParser::TypeSpec);
      break;
    }

    case 16: {
      enterOuterAlt(_localctx, 16);
      setState(166);
      operationBlock();
      setState(167);
      match(TParser::TypeSpec);
      setState(168);
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

tree::TerminalNode* TParser::GeneralValueContext::String() {
  return getToken(TParser::String, 0);
}

tree::TerminalNode* TParser::GeneralValueContext::Integer() {
  return getToken(TParser::Integer, 0);
}

tree::TerminalNode* TParser::GeneralValueContext::Float() {
  return getToken(TParser::Float, 0);
}

tree::TerminalNode* TParser::GeneralValueContext::Bool() {
  return getToken(TParser::Bool, 0);
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
  enterRule(_localctx, 36, TParser::RuleGeneralValue);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(186);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 11, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(172);
      match(TParser::Identifier);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(173);
      match(TParser::Identifier);
      setState(174);
      match(TParser::TypeSpec);
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(175);
      match(TParser::String);
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(176);
      match(TParser::Integer);
      break;
    }

    case 5: {
      enterOuterAlt(_localctx, 5);
      setState(177);
      match(TParser::Integer);
      setState(178);
      match(TParser::TypeSpec);
      break;
    }

    case 6: {
      enterOuterAlt(_localctx, 6);
      setState(179);
      match(TParser::Float);
      break;
    }

    case 7: {
      enterOuterAlt(_localctx, 7);
      setState(180);
      match(TParser::Float);
      setState(181);
      match(TParser::TypeSpec);
      break;
    }

    case 8: {
      enterOuterAlt(_localctx, 8);
      setState(182);
      match(TParser::Bool);
      break;
    }

    case 9: {
      enterOuterAlt(_localctx, 9);
      setState(183);
      indexArray();
      break;
    }

    case 10: {
      enterOuterAlt(_localctx, 10);
      setState(184);
      associativeArray();
      break;
    }

    case 11: {
      enterOuterAlt(_localctx, 11);
      setState(185);
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

bool TParser::sempred(RuleContext *context, size_t ruleIndex, size_t predicateIndex) {
  switch (ruleIndex) {
    case 1: return fileContentSempred(dynamic_cast<FileContentContext *>(context), predicateIndex);

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

// Static vars and initialization.
std::vector<dfa::DFA> TParser::_decisionToDFA;
atn::PredictionContextCache TParser::_sharedContextCache;

// We own the ATN which in turn owns the ATN states.
atn::ATN TParser::_atn;
std::vector<uint16_t> TParser::_serializedATN;

std::vector<std::string> TParser::_ruleNames = {
  "main", "fileContent", "sentence", "liveTokens", "use", "useValue", "useString", 
  "variable", "variableMembers", "variableDefinition", "variableValue", 
  "indexArray", "indexArrayElements", "associativeArray", "associativeArrayElements", 
  "operationBlock", "operationElements", "operationValue", "generalValue"
};

std::vector<std::string> TParser::_literalNames = {
  "", "'use'", "'var'", "", "';'", "'='", "':'", "','", "'['", "']'", "'{'", 
  "'}'", "'('", "')'"
};

std::vector<std::string> TParser::_symbolicNames = {
  "", "Use", "Var", "Bool", "End", "Attr", "TwoPoint", "Separator", "OpenArIndex", 
  "CloseArIndex", "OpenBlock", "CloseBlock", "OpenOp", "CloseOp", "ArithmeticOperator", 
  "IncDecOperators", "Identifier", "IDPrefix", "TypeSpec", "String", "Integer", 
  "Float", "Whitespace", "Newline", "Words", "BlockComment", "LineComment"
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
       0x3, 0x1c, 0xbf, 0x4, 0x2, 0x9, 0x2, 0x4, 0x3, 0x9, 0x3, 0x4, 0x4, 
       0x9, 0x4, 0x4, 0x5, 0x9, 0x5, 0x4, 0x6, 0x9, 0x6, 0x4, 0x7, 0x9, 
       0x7, 0x4, 0x8, 0x9, 0x8, 0x4, 0x9, 0x9, 0x9, 0x4, 0xa, 0x9, 0xa, 
       0x4, 0xb, 0x9, 0xb, 0x4, 0xc, 0x9, 0xc, 0x4, 0xd, 0x9, 0xd, 0x4, 
       0xe, 0x9, 0xe, 0x4, 0xf, 0x9, 0xf, 0x4, 0x10, 0x9, 0x10, 0x4, 0x11, 
       0x9, 0x11, 0x4, 0x12, 0x9, 0x12, 0x4, 0x13, 0x9, 0x13, 0x4, 0x14, 
       0x9, 0x14, 0x3, 0x2, 0x3, 0x2, 0x3, 0x2, 0x3, 0x3, 0x3, 0x3, 0x3, 
       0x3, 0x7, 0x3, 0x2f, 0xa, 0x3, 0xc, 0x3, 0xe, 0x3, 0x32, 0xb, 0x3, 
       0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x5, 0x4, 0x37, 0xa, 0x4, 0x3, 0x5, 
       0x3, 0x5, 0x3, 0x6, 0x3, 0x6, 0x3, 0x6, 0x3, 0x6, 0x3, 0x7, 0x3, 
       0x7, 0x3, 0x7, 0x3, 0x7, 0x3, 0x7, 0x5, 0x7, 0x44, 0xa, 0x7, 0x3, 
       0x8, 0x3, 0x8, 0x3, 0x9, 0x3, 0x9, 0x3, 0x9, 0x3, 0x9, 0x3, 0xa, 
       0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x5, 0xa, 0x51, 0xa, 0xa, 
       0x3, 0xb, 0x3, 0xb, 0x3, 0xb, 0x3, 0xb, 0x3, 0xb, 0x3, 0xb, 0x3, 
       0xb, 0x5, 0xb, 0x5a, 0xa, 0xb, 0x3, 0xc, 0x3, 0xc, 0x3, 0xd, 0x3, 
       0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x5, 0xd, 0x64, 0xa, 
       0xd, 0x3, 0xe, 0x3, 0xe, 0x3, 0xe, 0x3, 0xe, 0x3, 0xe, 0x5, 0xe, 
       0x6b, 0xa, 0xe, 0x3, 0xf, 0x3, 0xf, 0x3, 0xf, 0x3, 0xf, 0x3, 0xf, 
       0x3, 0xf, 0x5, 0xf, 0x73, 0xa, 0xf, 0x3, 0x10, 0x3, 0x10, 0x3, 0x10, 
       0x3, 0x10, 0x3, 0x10, 0x3, 0x10, 0x3, 0x10, 0x3, 0x10, 0x3, 0x10, 
       0x5, 0x10, 0x7e, 0xa, 0x10, 0x3, 0x11, 0x3, 0x11, 0x3, 0x11, 0x3, 
       0x11, 0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 0x5, 0x12, 0x88, 
       0xa, 0x12, 0x3, 0x13, 0x3, 0x13, 0x3, 0x13, 0x3, 0x13, 0x3, 0x13, 
       0x3, 0x13, 0x3, 0x13, 0x3, 0x13, 0x3, 0x13, 0x3, 0x13, 0x3, 0x13, 
       0x3, 0x13, 0x3, 0x13, 0x3, 0x13, 0x3, 0x13, 0x3, 0x13, 0x3, 0x13, 
       0x3, 0x13, 0x3, 0x13, 0x3, 0x13, 0x3, 0x13, 0x3, 0x13, 0x3, 0x13, 
       0x3, 0x13, 0x3, 0x13, 0x3, 0x13, 0x3, 0x13, 0x3, 0x13, 0x3, 0x13, 
       0x3, 0x13, 0x3, 0x13, 0x3, 0x13, 0x3, 0x13, 0x3, 0x13, 0x3, 0x13, 
       0x5, 0x13, 0xad, 0xa, 0x13, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 
       0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 
       0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x5, 0x14, 0xbd, 
       0xa, 0x14, 0x3, 0x14, 0x2, 0x3, 0x4, 0x15, 0x2, 0x4, 0x6, 0x8, 0xa, 
       0xc, 0xe, 0x10, 0x12, 0x14, 0x16, 0x18, 0x1a, 0x1c, 0x1e, 0x20, 0x22, 
       0x24, 0x26, 0x2, 0x2, 0x2, 0xcf, 0x2, 0x28, 0x3, 0x2, 0x2, 0x2, 0x4, 
       0x2b, 0x3, 0x2, 0x2, 0x2, 0x6, 0x36, 0x3, 0x2, 0x2, 0x2, 0x8, 0x38, 
       0x3, 0x2, 0x2, 0x2, 0xa, 0x3a, 0x3, 0x2, 0x2, 0x2, 0xc, 0x43, 0x3, 
       0x2, 0x2, 0x2, 0xe, 0x45, 0x3, 0x2, 0x2, 0x2, 0x10, 0x47, 0x3, 0x2, 
       0x2, 0x2, 0x12, 0x50, 0x3, 0x2, 0x2, 0x2, 0x14, 0x59, 0x3, 0x2, 0x2, 
       0x2, 0x16, 0x5b, 0x3, 0x2, 0x2, 0x2, 0x18, 0x63, 0x3, 0x2, 0x2, 0x2, 
       0x1a, 0x6a, 0x3, 0x2, 0x2, 0x2, 0x1c, 0x72, 0x3, 0x2, 0x2, 0x2, 0x1e, 
       0x7d, 0x3, 0x2, 0x2, 0x2, 0x20, 0x7f, 0x3, 0x2, 0x2, 0x2, 0x22, 0x87, 
       0x3, 0x2, 0x2, 0x2, 0x24, 0xac, 0x3, 0x2, 0x2, 0x2, 0x26, 0xbc, 0x3, 
       0x2, 0x2, 0x2, 0x28, 0x29, 0x5, 0x4, 0x3, 0x2, 0x29, 0x2a, 0x7, 0x2, 
       0x2, 0x3, 0x2a, 0x3, 0x3, 0x2, 0x2, 0x2, 0x2b, 0x30, 0x8, 0x3, 0x1, 
       0x2, 0x2c, 0x2d, 0xc, 0x4, 0x2, 0x2, 0x2d, 0x2f, 0x5, 0x6, 0x4, 0x2, 
       0x2e, 0x2c, 0x3, 0x2, 0x2, 0x2, 0x2f, 0x32, 0x3, 0x2, 0x2, 0x2, 0x30, 
       0x2e, 0x3, 0x2, 0x2, 0x2, 0x30, 0x31, 0x3, 0x2, 0x2, 0x2, 0x31, 0x5, 
       0x3, 0x2, 0x2, 0x2, 0x32, 0x30, 0x3, 0x2, 0x2, 0x2, 0x33, 0x37, 0x5, 
       0x8, 0x5, 0x2, 0x34, 0x37, 0x5, 0xa, 0x6, 0x2, 0x35, 0x37, 0x5, 0x10, 
       0x9, 0x2, 0x36, 0x33, 0x3, 0x2, 0x2, 0x2, 0x36, 0x34, 0x3, 0x2, 0x2, 
       0x2, 0x36, 0x35, 0x3, 0x2, 0x2, 0x2, 0x37, 0x7, 0x3, 0x2, 0x2, 0x2, 
       0x38, 0x39, 0x7, 0x19, 0x2, 0x2, 0x39, 0x9, 0x3, 0x2, 0x2, 0x2, 0x3a, 
       0x3b, 0x7, 0x3, 0x2, 0x2, 0x3b, 0x3c, 0x5, 0xc, 0x7, 0x2, 0x3c, 0x3d, 
       0x7, 0x6, 0x2, 0x2, 0x3d, 0xb, 0x3, 0x2, 0x2, 0x2, 0x3e, 0x44, 0x5, 
       0xe, 0x8, 0x2, 0x3f, 0x40, 0x5, 0xe, 0x8, 0x2, 0x40, 0x41, 0x7, 0x9, 
       0x2, 0x2, 0x41, 0x42, 0x5, 0xc, 0x7, 0x2, 0x42, 0x44, 0x3, 0x2, 0x2, 
       0x2, 0x43, 0x3e, 0x3, 0x2, 0x2, 0x2, 0x43, 0x3f, 0x3, 0x2, 0x2, 0x2, 
       0x44, 0xd, 0x3, 0x2, 0x2, 0x2, 0x45, 0x46, 0x7, 0x15, 0x2, 0x2, 0x46, 
       0xf, 0x3, 0x2, 0x2, 0x2, 0x47, 0x48, 0x7, 0x4, 0x2, 0x2, 0x48, 0x49, 
       0x5, 0x12, 0xa, 0x2, 0x49, 0x4a, 0x7, 0x6, 0x2, 0x2, 0x4a, 0x11, 
       0x3, 0x2, 0x2, 0x2, 0x4b, 0x51, 0x5, 0x14, 0xb, 0x2, 0x4c, 0x4d, 
       0x5, 0x14, 0xb, 0x2, 0x4d, 0x4e, 0x7, 0x9, 0x2, 0x2, 0x4e, 0x4f, 
       0x5, 0x12, 0xa, 0x2, 0x4f, 0x51, 0x3, 0x2, 0x2, 0x2, 0x50, 0x4b, 
       0x3, 0x2, 0x2, 0x2, 0x50, 0x4c, 0x3, 0x2, 0x2, 0x2, 0x51, 0x13, 0x3, 
       0x2, 0x2, 0x2, 0x52, 0x53, 0x7, 0x12, 0x2, 0x2, 0x53, 0x54, 0x7, 
       0x7, 0x2, 0x2, 0x54, 0x5a, 0x5, 0x16, 0xc, 0x2, 0x55, 0x56, 0x7, 
       0x12, 0x2, 0x2, 0x56, 0x57, 0x7, 0x14, 0x2, 0x2, 0x57, 0x58, 0x7, 
       0x7, 0x2, 0x2, 0x58, 0x5a, 0x5, 0x16, 0xc, 0x2, 0x59, 0x52, 0x3, 
       0x2, 0x2, 0x2, 0x59, 0x55, 0x3, 0x2, 0x2, 0x2, 0x5a, 0x15, 0x3, 0x2, 
       0x2, 0x2, 0x5b, 0x5c, 0x5, 0x26, 0x14, 0x2, 0x5c, 0x17, 0x3, 0x2, 
       0x2, 0x2, 0x5d, 0x5e, 0x7, 0xa, 0x2, 0x2, 0x5e, 0x64, 0x7, 0xb, 0x2, 
       0x2, 0x5f, 0x60, 0x7, 0xa, 0x2, 0x2, 0x60, 0x61, 0x5, 0x1a, 0xe, 
       0x2, 0x61, 0x62, 0x7, 0xb, 0x2, 0x2, 0x62, 0x64, 0x3, 0x2, 0x2, 0x2, 
       0x63, 0x5d, 0x3, 0x2, 0x2, 0x2, 0x63, 0x5f, 0x3, 0x2, 0x2, 0x2, 0x64, 
       0x19, 0x3, 0x2, 0x2, 0x2, 0x65, 0x6b, 0x5, 0x26, 0x14, 0x2, 0x66, 
       0x67, 0x5, 0x26, 0x14, 0x2, 0x67, 0x68, 0x7, 0x9, 0x2, 0x2, 0x68, 
       0x69, 0x5, 0x1a, 0xe, 0x2, 0x69, 0x6b, 0x3, 0x2, 0x2, 0x2, 0x6a, 
       0x65, 0x3, 0x2, 0x2, 0x2, 0x6a, 0x66, 0x3, 0x2, 0x2, 0x2, 0x6b, 0x1b, 
       0x3, 0x2, 0x2, 0x2, 0x6c, 0x6d, 0x7, 0xc, 0x2, 0x2, 0x6d, 0x73, 0x7, 
       0xd, 0x2, 0x2, 0x6e, 0x6f, 0x7, 0xc, 0x2, 0x2, 0x6f, 0x70, 0x5, 0x1e, 
       0x10, 0x2, 0x70, 0x71, 0x7, 0xd, 0x2, 0x2, 0x71, 0x73, 0x3, 0x2, 
       0x2, 0x2, 0x72, 0x6c, 0x3, 0x2, 0x2, 0x2, 0x72, 0x6e, 0x3, 0x2, 0x2, 
       0x2, 0x73, 0x1d, 0x3, 0x2, 0x2, 0x2, 0x74, 0x75, 0x7, 0x12, 0x2, 
       0x2, 0x75, 0x76, 0x7, 0x8, 0x2, 0x2, 0x76, 0x7e, 0x5, 0x26, 0x14, 
       0x2, 0x77, 0x78, 0x7, 0x12, 0x2, 0x2, 0x78, 0x79, 0x7, 0x8, 0x2, 
       0x2, 0x79, 0x7a, 0x5, 0x26, 0x14, 0x2, 0x7a, 0x7b, 0x7, 0x9, 0x2, 
       0x2, 0x7b, 0x7c, 0x5, 0x1e, 0x10, 0x2, 0x7c, 0x7e, 0x3, 0x2, 0x2, 
       0x2, 0x7d, 0x74, 0x3, 0x2, 0x2, 0x2, 0x7d, 0x77, 0x3, 0x2, 0x2, 0x2, 
       0x7e, 0x1f, 0x3, 0x2, 0x2, 0x2, 0x7f, 0x80, 0x7, 0xe, 0x2, 0x2, 0x80, 
       0x81, 0x5, 0x22, 0x12, 0x2, 0x81, 0x82, 0x7, 0xf, 0x2, 0x2, 0x82, 
       0x21, 0x3, 0x2, 0x2, 0x2, 0x83, 0x88, 0x5, 0x24, 0x13, 0x2, 0x84, 
       0x85, 0x5, 0x24, 0x13, 0x2, 0x85, 0x86, 0x5, 0x22, 0x12, 0x2, 0x86, 
       0x88, 0x3, 0x2, 0x2, 0x2, 0x87, 0x83, 0x3, 0x2, 0x2, 0x2, 0x87, 0x84, 
       0x3, 0x2, 0x2, 0x2, 0x88, 0x23, 0x3, 0x2, 0x2, 0x2, 0x89, 0xad, 0x7, 
       0x12, 0x2, 0x2, 0x8a, 0x8b, 0x7, 0x12, 0x2, 0x2, 0x8b, 0xad, 0x7, 
       0x10, 0x2, 0x2, 0x8c, 0x8d, 0x7, 0x12, 0x2, 0x2, 0x8d, 0xad, 0x7, 
       0x14, 0x2, 0x2, 0x8e, 0x8f, 0x7, 0x12, 0x2, 0x2, 0x8f, 0x90, 0x7, 
       0x14, 0x2, 0x2, 0x90, 0xad, 0x7, 0x10, 0x2, 0x2, 0x91, 0xad, 0x7, 
       0x16, 0x2, 0x2, 0x92, 0x93, 0x7, 0x16, 0x2, 0x2, 0x93, 0xad, 0x7, 
       0x10, 0x2, 0x2, 0x94, 0x95, 0x7, 0x16, 0x2, 0x2, 0x95, 0xad, 0x7, 
       0x14, 0x2, 0x2, 0x96, 0x97, 0x7, 0x16, 0x2, 0x2, 0x97, 0x98, 0x7, 
       0x14, 0x2, 0x2, 0x98, 0xad, 0x7, 0x10, 0x2, 0x2, 0x99, 0xad, 0x7, 
       0x17, 0x2, 0x2, 0x9a, 0x9b, 0x7, 0x17, 0x2, 0x2, 0x9b, 0xad, 0x7, 
       0x10, 0x2, 0x2, 0x9c, 0x9d, 0x7, 0x17, 0x2, 0x2, 0x9d, 0xad, 0x7, 
       0x14, 0x2, 0x2, 0x9e, 0x9f, 0x7, 0x17, 0x2, 0x2, 0x9f, 0xa0, 0x7, 
       0x14, 0x2, 0x2, 0xa0, 0xad, 0x7, 0x10, 0x2, 0x2, 0xa1, 0xad, 0x5, 
       0x20, 0x11, 0x2, 0xa2, 0xa3, 0x5, 0x20, 0x11, 0x2, 0xa3, 0xa4, 0x7, 
       0x10, 0x2, 0x2, 0xa4, 0xad, 0x3, 0x2, 0x2, 0x2, 0xa5, 0xa6, 0x5, 
       0x20, 0x11, 0x2, 0xa6, 0xa7, 0x7, 0x14, 0x2, 0x2, 0xa7, 0xad, 0x3, 
       0x2, 0x2, 0x2, 0xa8, 0xa9, 0x5, 0x20, 0x11, 0x2, 0xa9, 0xaa, 0x7, 
       0x14, 0x2, 0x2, 0xaa, 0xab, 0x7, 0x10, 0x2, 0x2, 0xab, 0xad, 0x3, 
       0x2, 0x2, 0x2, 0xac, 0x89, 0x3, 0x2, 0x2, 0x2, 0xac, 0x8a, 0x3, 0x2, 
       0x2, 0x2, 0xac, 0x8c, 0x3, 0x2, 0x2, 0x2, 0xac, 0x8e, 0x3, 0x2, 0x2, 
       0x2, 0xac, 0x91, 0x3, 0x2, 0x2, 0x2, 0xac, 0x92, 0x3, 0x2, 0x2, 0x2, 
       0xac, 0x94, 0x3, 0x2, 0x2, 0x2, 0xac, 0x96, 0x3, 0x2, 0x2, 0x2, 0xac, 
       0x99, 0x3, 0x2, 0x2, 0x2, 0xac, 0x9a, 0x3, 0x2, 0x2, 0x2, 0xac, 0x9c, 
       0x3, 0x2, 0x2, 0x2, 0xac, 0x9e, 0x3, 0x2, 0x2, 0x2, 0xac, 0xa1, 0x3, 
       0x2, 0x2, 0x2, 0xac, 0xa2, 0x3, 0x2, 0x2, 0x2, 0xac, 0xa5, 0x3, 0x2, 
       0x2, 0x2, 0xac, 0xa8, 0x3, 0x2, 0x2, 0x2, 0xad, 0x25, 0x3, 0x2, 0x2, 
       0x2, 0xae, 0xbd, 0x7, 0x12, 0x2, 0x2, 0xaf, 0xb0, 0x7, 0x12, 0x2, 
       0x2, 0xb0, 0xbd, 0x7, 0x14, 0x2, 0x2, 0xb1, 0xbd, 0x7, 0x15, 0x2, 
       0x2, 0xb2, 0xbd, 0x7, 0x16, 0x2, 0x2, 0xb3, 0xb4, 0x7, 0x16, 0x2, 
       0x2, 0xb4, 0xbd, 0x7, 0x14, 0x2, 0x2, 0xb5, 0xbd, 0x7, 0x17, 0x2, 
       0x2, 0xb6, 0xb7, 0x7, 0x17, 0x2, 0x2, 0xb7, 0xbd, 0x7, 0x14, 0x2, 
       0x2, 0xb8, 0xbd, 0x7, 0x5, 0x2, 0x2, 0xb9, 0xbd, 0x5, 0x18, 0xd, 
       0x2, 0xba, 0xbd, 0x5, 0x1c, 0xf, 0x2, 0xbb, 0xbd, 0x5, 0x20, 0x11, 
       0x2, 0xbc, 0xae, 0x3, 0x2, 0x2, 0x2, 0xbc, 0xaf, 0x3, 0x2, 0x2, 0x2, 
       0xbc, 0xb1, 0x3, 0x2, 0x2, 0x2, 0xbc, 0xb2, 0x3, 0x2, 0x2, 0x2, 0xbc, 
       0xb3, 0x3, 0x2, 0x2, 0x2, 0xbc, 0xb5, 0x3, 0x2, 0x2, 0x2, 0xbc, 0xb6, 
       0x3, 0x2, 0x2, 0x2, 0xbc, 0xb8, 0x3, 0x2, 0x2, 0x2, 0xbc, 0xb9, 0x3, 
       0x2, 0x2, 0x2, 0xbc, 0xba, 0x3, 0x2, 0x2, 0x2, 0xbc, 0xbb, 0x3, 0x2, 
       0x2, 0x2, 0xbd, 0x27, 0x3, 0x2, 0x2, 0x2, 0xe, 0x30, 0x36, 0x43, 
       0x50, 0x59, 0x63, 0x6a, 0x72, 0x7d, 0x87, 0xac, 0xbc, 
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
