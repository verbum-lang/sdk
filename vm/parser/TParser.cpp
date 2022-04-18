
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

TParser::SentencesContext* TParser::MainContext::sentences() {
  return getRuleContext<TParser::SentencesContext>(0);
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
    setState(180);
    sentences();
    setState(181);
    match(TParser::EOF);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- SentencesContext ------------------------------------------------------------------

TParser::SentencesContext::SentencesContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::StatementsContext* TParser::SentencesContext::statements() {
  return getRuleContext<TParser::StatementsContext>(0);
}

TParser::SentencesContext* TParser::SentencesContext::sentences() {
  return getRuleContext<TParser::SentencesContext>(0);
}


size_t TParser::SentencesContext::getRuleIndex() const {
  return TParser::RuleSentences;
}

void TParser::SentencesContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterSentences(this);
}

void TParser::SentencesContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitSentences(this);
}


antlrcpp::Any TParser::SentencesContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitSentences(this);
  else
    return visitor->visitChildren(this);
}

TParser::SentencesContext* TParser::sentences() {
  SentencesContext *_localctx = _tracker.createInstance<SentencesContext>(_ctx, getState());
  enterRule(_localctx, 2, TParser::RuleSentences);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(188);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 0, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(183);
      statements();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(184);
      statements();
      setState(185);
      sentences();
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

//----------------- StatementsContext ------------------------------------------------------------------

TParser::StatementsContext::StatementsContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::BlockUseContext* TParser::StatementsContext::blockUse() {
  return getRuleContext<TParser::BlockUseContext>(0);
}

TParser::BlockVariableContext* TParser::StatementsContext::blockVariable() {
  return getRuleContext<TParser::BlockVariableContext>(0);
}

TParser::BlockRetContext* TParser::StatementsContext::blockRet() {
  return getRuleContext<TParser::BlockRetContext>(0);
}

TParser::BlockConditionalContext* TParser::StatementsContext::blockConditional() {
  return getRuleContext<TParser::BlockConditionalContext>(0);
}

TParser::BlockLoopContext* TParser::StatementsContext::blockLoop() {
  return getRuleContext<TParser::BlockLoopContext>(0);
}

TParser::BlockBreakContext* TParser::StatementsContext::blockBreak() {
  return getRuleContext<TParser::BlockBreakContext>(0);
}

TParser::BlockNextContext* TParser::StatementsContext::blockNext() {
  return getRuleContext<TParser::BlockNextContext>(0);
}

TParser::BlockTryCatchContext* TParser::StatementsContext::blockTryCatch() {
  return getRuleContext<TParser::BlockTryCatchContext>(0);
}

TParser::BlockFunctionContext* TParser::StatementsContext::blockFunction() {
  return getRuleContext<TParser::BlockFunctionContext>(0);
}

TParser::BlockInterfaceContext* TParser::StatementsContext::blockInterface() {
  return getRuleContext<TParser::BlockInterfaceContext>(0);
}

TParser::BlockAbstractionContext* TParser::StatementsContext::blockAbstraction() {
  return getRuleContext<TParser::BlockAbstractionContext>(0);
}

TParser::BlockClassContext* TParser::StatementsContext::blockClass() {
  return getRuleContext<TParser::BlockClassContext>(0);
}

TParser::BlockFunctionCallContext* TParser::StatementsContext::blockFunctionCall() {
  return getRuleContext<TParser::BlockFunctionCallContext>(0);
}

TParser::BlockClassConstructorContext* TParser::StatementsContext::blockClassConstructor() {
  return getRuleContext<TParser::BlockClassConstructorContext>(0);
}

TParser::BlockAttributionContext* TParser::StatementsContext::blockAttribution() {
  return getRuleContext<TParser::BlockAttributionContext>(0);
}

TParser::BlockMultipleAssignmentsContext* TParser::StatementsContext::blockMultipleAssignments() {
  return getRuleContext<TParser::BlockMultipleAssignmentsContext>(0);
}

TParser::BlockCodeContext* TParser::StatementsContext::blockCode() {
  return getRuleContext<TParser::BlockCodeContext>(0);
}

TParser::BlockPermissionTokensContext* TParser::StatementsContext::blockPermissionTokens() {
  return getRuleContext<TParser::BlockPermissionTokensContext>(0);
}


size_t TParser::StatementsContext::getRuleIndex() const {
  return TParser::RuleStatements;
}

void TParser::StatementsContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterStatements(this);
}

void TParser::StatementsContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitStatements(this);
}


antlrcpp::Any TParser::StatementsContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitStatements(this);
  else
    return visitor->visitChildren(this);
}

TParser::StatementsContext* TParser::statements() {
  StatementsContext *_localctx = _tracker.createInstance<StatementsContext>(_ctx, getState());
  enterRule(_localctx, 4, TParser::RuleStatements);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(208);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 1, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(190);
      blockUse();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(191);
      blockVariable();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(192);
      blockRet();
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(193);
      blockConditional();
      break;
    }

    case 5: {
      enterOuterAlt(_localctx, 5);
      setState(194);
      blockLoop();
      break;
    }

    case 6: {
      enterOuterAlt(_localctx, 6);
      setState(195);
      blockBreak();
      break;
    }

    case 7: {
      enterOuterAlt(_localctx, 7);
      setState(196);
      blockNext();
      break;
    }

    case 8: {
      enterOuterAlt(_localctx, 8);
      setState(197);
      blockTryCatch();
      break;
    }

    case 9: {
      enterOuterAlt(_localctx, 9);
      setState(198);
      blockFunction();
      break;
    }

    case 10: {
      enterOuterAlt(_localctx, 10);
      setState(199);
      blockInterface();
      break;
    }

    case 11: {
      enterOuterAlt(_localctx, 11);
      setState(200);
      blockAbstraction();
      break;
    }

    case 12: {
      enterOuterAlt(_localctx, 12);
      setState(201);
      blockClass();
      break;
    }

    case 13: {
      enterOuterAlt(_localctx, 13);
      setState(202);
      blockFunctionCall();
      break;
    }

    case 14: {
      enterOuterAlt(_localctx, 14);
      setState(203);
      blockClassConstructor();
      break;
    }

    case 15: {
      enterOuterAlt(_localctx, 15);
      setState(204);
      blockAttribution();
      break;
    }

    case 16: {
      enterOuterAlt(_localctx, 16);
      setState(205);
      blockMultipleAssignments();
      break;
    }

    case 17: {
      enterOuterAlt(_localctx, 17);
      setState(206);
      blockCode();
      break;
    }

    case 18: {
      enterOuterAlt(_localctx, 18);
      setState(207);
      blockPermissionTokens();
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

//----------------- BlockCodeContext ------------------------------------------------------------------

TParser::BlockCodeContext::BlockCodeContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::BlockCodeContext::OpenBlock() {
  return getToken(TParser::OpenBlock, 0);
}

tree::TerminalNode* TParser::BlockCodeContext::CloseBlock() {
  return getToken(TParser::CloseBlock, 0);
}

TParser::SentencesContext* TParser::BlockCodeContext::sentences() {
  return getRuleContext<TParser::SentencesContext>(0);
}


size_t TParser::BlockCodeContext::getRuleIndex() const {
  return TParser::RuleBlockCode;
}

void TParser::BlockCodeContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterBlockCode(this);
}

void TParser::BlockCodeContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitBlockCode(this);
}


antlrcpp::Any TParser::BlockCodeContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitBlockCode(this);
  else
    return visitor->visitChildren(this);
}

TParser::BlockCodeContext* TParser::blockCode() {
  BlockCodeContext *_localctx = _tracker.createInstance<BlockCodeContext>(_ctx, getState());
  enterRule(_localctx, 6, TParser::RuleBlockCode);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(216);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 2, _ctx)) {
    case 1: {
      setState(210);
      match(TParser::OpenBlock);
      setState(211);
      match(TParser::CloseBlock);
      break;
    }

    case 2: {
      setState(212);
      match(TParser::OpenBlock);
      setState(213);
      sentences();
      setState(214);
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

//----------------- BlockUseContext ------------------------------------------------------------------

TParser::BlockUseContext::BlockUseContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::BlockUseContext::Use() {
  return getToken(TParser::Use, 0);
}

TParser::UseValueContext* TParser::BlockUseContext::useValue() {
  return getRuleContext<TParser::UseValueContext>(0);
}

tree::TerminalNode* TParser::BlockUseContext::End() {
  return getToken(TParser::End, 0);
}


size_t TParser::BlockUseContext::getRuleIndex() const {
  return TParser::RuleBlockUse;
}

void TParser::BlockUseContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterBlockUse(this);
}

void TParser::BlockUseContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitBlockUse(this);
}


antlrcpp::Any TParser::BlockUseContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitBlockUse(this);
  else
    return visitor->visitChildren(this);
}

TParser::BlockUseContext* TParser::blockUse() {
  BlockUseContext *_localctx = _tracker.createInstance<BlockUseContext>(_ctx, getState());
  enterRule(_localctx, 8, TParser::RuleBlockUse);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(218);
    match(TParser::Use);
    setState(219);
    useValue();
    setState(220);
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
    setState(227);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 3, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(222);
      useString();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(223);
      useString();
      setState(224);
      match(TParser::Separator);
      setState(225);
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
    setState(229);
    match(TParser::String);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- BlockVariableContext ------------------------------------------------------------------

TParser::BlockVariableContext::BlockVariableContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::BlockVariableContext::Var() {
  return getToken(TParser::Var, 0);
}

TParser::VariableItemContext* TParser::BlockVariableContext::variableItem() {
  return getRuleContext<TParser::VariableItemContext>(0);
}

tree::TerminalNode* TParser::BlockVariableContext::End() {
  return getToken(TParser::End, 0);
}


size_t TParser::BlockVariableContext::getRuleIndex() const {
  return TParser::RuleBlockVariable;
}

void TParser::BlockVariableContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterBlockVariable(this);
}

void TParser::BlockVariableContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitBlockVariable(this);
}


antlrcpp::Any TParser::BlockVariableContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitBlockVariable(this);
  else
    return visitor->visitChildren(this);
}

TParser::BlockVariableContext* TParser::blockVariable() {
  BlockVariableContext *_localctx = _tracker.createInstance<BlockVariableContext>(_ctx, getState());
  enterRule(_localctx, 14, TParser::RuleBlockVariable);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(231);
    match(TParser::Var);
    setState(232);
    variableItem();
    setState(233);
    match(TParser::End);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- VariableItemContext ------------------------------------------------------------------

TParser::VariableItemContext::VariableItemContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::VariablePrefixModesContext* TParser::VariableItemContext::variablePrefixModes() {
  return getRuleContext<TParser::VariablePrefixModesContext>(0);
}

TParser::GeneralValueElementsContext* TParser::VariableItemContext::generalValueElements() {
  return getRuleContext<TParser::GeneralValueElementsContext>(0);
}

std::vector<tree::TerminalNode *> TParser::VariableItemContext::Separator() {
  return getTokens(TParser::Separator);
}

tree::TerminalNode* TParser::VariableItemContext::Separator(size_t i) {
  return getToken(TParser::Separator, i);
}

std::vector<TParser::VariableItemContext *> TParser::VariableItemContext::variableItem() {
  return getRuleContexts<TParser::VariableItemContext>();
}

TParser::VariableItemContext* TParser::VariableItemContext::variableItem(size_t i) {
  return getRuleContext<TParser::VariableItemContext>(i);
}

tree::TerminalNode* TParser::VariableItemContext::New() {
  return getToken(TParser::New, 0);
}

tree::TerminalNode* TParser::VariableItemContext::Await() {
  return getToken(TParser::Await, 0);
}


size_t TParser::VariableItemContext::getRuleIndex() const {
  return TParser::RuleVariableItem;
}

void TParser::VariableItemContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterVariableItem(this);
}

void TParser::VariableItemContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitVariableItem(this);
}


antlrcpp::Any TParser::VariableItemContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitVariableItem(this);
  else
    return visitor->visitChildren(this);
}

TParser::VariableItemContext* TParser::variableItem() {
  VariableItemContext *_localctx = _tracker.createInstance<VariableItemContext>(_ctx, getState());
  enterRule(_localctx, 16, TParser::RuleVariableItem);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    size_t alt;
    enterOuterAlt(_localctx, 1);
    setState(235);
    variablePrefixModes();
    setState(237);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == TParser::New

    || _la == TParser::Await) {
      setState(236);
      _la = _input->LA(1);
      if (!(_la == TParser::New

      || _la == TParser::Await)) {
      _errHandler->recoverInline(this);
      }
      else {
        _errHandler->reportMatch(this);
        consume();
      }
    }
    setState(239);
    generalValueElements();
    setState(244);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 5, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        setState(240);
        match(TParser::Separator);
        setState(241);
        variableItem(); 
      }
      setState(246);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 5, _ctx);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- VariablePrefixModesContext ------------------------------------------------------------------

TParser::VariablePrefixModesContext::VariablePrefixModesContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::VariablePrefixModesContext::Attr() {
  return getToken(TParser::Attr, 0);
}

tree::TerminalNode* TParser::VariablePrefixModesContext::AssignmentOperator() {
  return getToken(TParser::AssignmentOperator, 0);
}

TParser::IdentifierContext* TParser::VariablePrefixModesContext::identifier() {
  return getRuleContext<TParser::IdentifierContext>(0);
}

tree::TerminalNode* TParser::VariablePrefixModesContext::TypeSpec() {
  return getToken(TParser::TypeSpec, 0);
}


size_t TParser::VariablePrefixModesContext::getRuleIndex() const {
  return TParser::RuleVariablePrefixModes;
}

void TParser::VariablePrefixModesContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterVariablePrefixModes(this);
}

void TParser::VariablePrefixModesContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitVariablePrefixModes(this);
}


antlrcpp::Any TParser::VariablePrefixModesContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitVariablePrefixModes(this);
  else
    return visitor->visitChildren(this);
}

TParser::VariablePrefixModesContext* TParser::variablePrefixModes() {
  VariablePrefixModesContext *_localctx = _tracker.createInstance<VariablePrefixModesContext>(_ctx, getState());
  enterRule(_localctx, 18, TParser::RuleVariablePrefixModes);
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
    setState(251);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 6, _ctx)) {
    case 1: {
      setState(247);
      identifier();
      break;
    }

    case 2: {
      setState(248);
      identifier();
      setState(249);
      match(TParser::TypeSpec);
      break;
    }

    default:
      break;
    }
    setState(253);
    _la = _input->LA(1);
    if (!(_la == TParser::Attr

    || _la == TParser::AssignmentOperator)) {
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

//----------------- FunctionCallContext ------------------------------------------------------------------

TParser::FunctionCallContext::FunctionCallContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::FunctionCallPrefixContext* TParser::FunctionCallContext::functionCallPrefix() {
  return getRuleContext<TParser::FunctionCallPrefixContext>(0);
}

TParser::FunctionCallParamContext* TParser::FunctionCallContext::functionCallParam() {
  return getRuleContext<TParser::FunctionCallParamContext>(0);
}

TParser::IdentifierContext* TParser::FunctionCallContext::identifier() {
  return getRuleContext<TParser::IdentifierContext>(0);
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
  enterRule(_localctx, 20, TParser::RuleFunctionCall);
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
    setState(255);
    functionCallPrefix();
    setState(257);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == TParser::Identifier) {
      setState(256);
      identifier();
    }
    setState(259);
    functionCallParam();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- FunctionCallPrefixContext ------------------------------------------------------------------

TParser::FunctionCallPrefixContext::FunctionCallPrefixContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::IdentifierContext* TParser::FunctionCallPrefixContext::identifier() {
  return getRuleContext<TParser::IdentifierContext>(0);
}

tree::TerminalNode* TParser::FunctionCallPrefixContext::Point() {
  return getToken(TParser::Point, 0);
}

tree::TerminalNode* TParser::FunctionCallPrefixContext::TwoTwoPoint() {
  return getToken(TParser::TwoTwoPoint, 0);
}


size_t TParser::FunctionCallPrefixContext::getRuleIndex() const {
  return TParser::RuleFunctionCallPrefix;
}

void TParser::FunctionCallPrefixContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterFunctionCallPrefix(this);
}

void TParser::FunctionCallPrefixContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitFunctionCallPrefix(this);
}


antlrcpp::Any TParser::FunctionCallPrefixContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitFunctionCallPrefix(this);
  else
    return visitor->visitChildren(this);
}

TParser::FunctionCallPrefixContext* TParser::functionCallPrefix() {
  FunctionCallPrefixContext *_localctx = _tracker.createInstance<FunctionCallPrefixContext>(_ctx, getState());
  enterRule(_localctx, 22, TParser::RuleFunctionCallPrefix);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(268);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 8, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(261);
      identifier();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(262);
      identifier();
      setState(263);
      match(TParser::Point);
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(265);
      identifier();
      setState(266);
      match(TParser::TwoTwoPoint);
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
  enterRule(_localctx, 24, TParser::RuleFunctionCallParam);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(276);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 9, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(270);
      match(TParser::OpenOp);
      setState(271);
      match(TParser::CloseOp);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(272);
      match(TParser::OpenOp);
      setState(273);
      functionCallParamElements();
      setState(274);
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

std::vector<tree::TerminalNode *> TParser::FunctionCallParamElementsContext::Separator() {
  return getTokens(TParser::Separator);
}

tree::TerminalNode* TParser::FunctionCallParamElementsContext::Separator(size_t i) {
  return getToken(TParser::Separator, i);
}

std::vector<TParser::FunctionCallParamElementsContext *> TParser::FunctionCallParamElementsContext::functionCallParamElements() {
  return getRuleContexts<TParser::FunctionCallParamElementsContext>();
}

TParser::FunctionCallParamElementsContext* TParser::FunctionCallParamElementsContext::functionCallParamElements(size_t i) {
  return getRuleContext<TParser::FunctionCallParamElementsContext>(i);
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
  enterRule(_localctx, 26, TParser::RuleFunctionCallParamElements);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    size_t alt;
    enterOuterAlt(_localctx, 1);
    setState(278);
    generalValue();
    setState(283);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 10, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        setState(279);
        match(TParser::Separator);
        setState(280);
        functionCallParamElements(); 
      }
      setState(285);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 10, _ctx);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- BlockRetContext ------------------------------------------------------------------

TParser::BlockRetContext::BlockRetContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::BlockRetContext::Ret() {
  return getToken(TParser::Ret, 0);
}

TParser::GeneralValueElementsContext* TParser::BlockRetContext::generalValueElements() {
  return getRuleContext<TParser::GeneralValueElementsContext>(0);
}

tree::TerminalNode* TParser::BlockRetContext::End() {
  return getToken(TParser::End, 0);
}


size_t TParser::BlockRetContext::getRuleIndex() const {
  return TParser::RuleBlockRet;
}

void TParser::BlockRetContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterBlockRet(this);
}

void TParser::BlockRetContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitBlockRet(this);
}


antlrcpp::Any TParser::BlockRetContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitBlockRet(this);
  else
    return visitor->visitChildren(this);
}

TParser::BlockRetContext* TParser::blockRet() {
  BlockRetContext *_localctx = _tracker.createInstance<BlockRetContext>(_ctx, getState());
  enterRule(_localctx, 28, TParser::RuleBlockRet);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(286);
    match(TParser::Ret);
    setState(287);
    generalValueElements();
    setState(288);
    match(TParser::End);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- BlockConditionalContext ------------------------------------------------------------------

TParser::BlockConditionalContext::BlockConditionalContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::IfElementUniqueContext* TParser::BlockConditionalContext::ifElementUnique() {
  return getRuleContext<TParser::IfElementUniqueContext>(0);
}

TParser::ElifElementsContext* TParser::BlockConditionalContext::elifElements() {
  return getRuleContext<TParser::ElifElementsContext>(0);
}

TParser::ElseElementUniqueContext* TParser::BlockConditionalContext::elseElementUnique() {
  return getRuleContext<TParser::ElseElementUniqueContext>(0);
}


size_t TParser::BlockConditionalContext::getRuleIndex() const {
  return TParser::RuleBlockConditional;
}

void TParser::BlockConditionalContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterBlockConditional(this);
}

void TParser::BlockConditionalContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitBlockConditional(this);
}


antlrcpp::Any TParser::BlockConditionalContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitBlockConditional(this);
  else
    return visitor->visitChildren(this);
}

TParser::BlockConditionalContext* TParser::blockConditional() {
  BlockConditionalContext *_localctx = _tracker.createInstance<BlockConditionalContext>(_ctx, getState());
  enterRule(_localctx, 30, TParser::RuleBlockConditional);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(290);
    ifElementUnique();
    setState(292);
    _errHandler->sync(this);

    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 11, _ctx)) {
    case 1: {
      setState(291);
      elifElements();
      break;
    }

    default:
      break;
    }
    setState(295);
    _errHandler->sync(this);

    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 12, _ctx)) {
    case 1: {
      setState(294);
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

TParser::ConditionalBlockExpressionContext* TParser::IfElementUniqueContext::conditionalBlockExpression() {
  return getRuleContext<TParser::ConditionalBlockExpressionContext>(0);
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
  enterRule(_localctx, 32, TParser::RuleIfElementUnique);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(297);
    match(TParser::If);
    setState(298);
    conditionalBlockExpression();
    setState(299);
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

std::vector<TParser::ElifElementsContext *> TParser::ElifElementsContext::elifElements() {
  return getRuleContexts<TParser::ElifElementsContext>();
}

TParser::ElifElementsContext* TParser::ElifElementsContext::elifElements(size_t i) {
  return getRuleContext<TParser::ElifElementsContext>(i);
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
  enterRule(_localctx, 34, TParser::RuleElifElements);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    size_t alt;
    enterOuterAlt(_localctx, 1);
    setState(301);
    elifElementUnique();
    setState(305);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 13, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        setState(302);
        elifElements(); 
      }
      setState(307);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 13, _ctx);
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

TParser::ConditionalBlockExpressionContext* TParser::ElifElementUniqueContext::conditionalBlockExpression() {
  return getRuleContext<TParser::ConditionalBlockExpressionContext>(0);
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
  enterRule(_localctx, 36, TParser::RuleElifElementUnique);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(308);
    match(TParser::Elif);
    setState(309);
    conditionalBlockExpression();
    setState(310);
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
  enterRule(_localctx, 38, TParser::RuleElseElementUnique);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(312);
    match(TParser::Else);
    setState(313);
    conditionalBlockElements();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ConditionalBlockExpressionContext ------------------------------------------------------------------

TParser::ConditionalBlockExpressionContext::ConditionalBlockExpressionContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::GeneralValueElementsContext* TParser::ConditionalBlockExpressionContext::generalValueElements() {
  return getRuleContext<TParser::GeneralValueElementsContext>(0);
}


size_t TParser::ConditionalBlockExpressionContext::getRuleIndex() const {
  return TParser::RuleConditionalBlockExpression;
}

void TParser::ConditionalBlockExpressionContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterConditionalBlockExpression(this);
}

void TParser::ConditionalBlockExpressionContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitConditionalBlockExpression(this);
}


antlrcpp::Any TParser::ConditionalBlockExpressionContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitConditionalBlockExpression(this);
  else
    return visitor->visitChildren(this);
}

TParser::ConditionalBlockExpressionContext* TParser::conditionalBlockExpression() {
  ConditionalBlockExpressionContext *_localctx = _tracker.createInstance<ConditionalBlockExpressionContext>(_ctx, getState());
  enterRule(_localctx, 40, TParser::RuleConditionalBlockExpression);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(315);
    generalValueElements();
   
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

TParser::CodeBlockFlowControlContext* TParser::ConditionalBlockElementsContext::codeBlockFlowControl() {
  return getRuleContext<TParser::CodeBlockFlowControlContext>(0);
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
  enterRule(_localctx, 42, TParser::RuleConditionalBlockElements);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(317);
    codeBlockFlowControl();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- BlockLoopContext ------------------------------------------------------------------

TParser::BlockLoopContext::BlockLoopContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::BlockLoopContext::For() {
  return getToken(TParser::For, 0);
}

TParser::LoopBlockElementsContext* TParser::BlockLoopContext::loopBlockElements() {
  return getRuleContext<TParser::LoopBlockElementsContext>(0);
}

TParser::LoopInfiniteContext* TParser::BlockLoopContext::loopInfinite() {
  return getRuleContext<TParser::LoopInfiniteContext>(0);
}

TParser::LoopConditionalContext* TParser::BlockLoopContext::loopConditional() {
  return getRuleContext<TParser::LoopConditionalContext>(0);
}

TParser::LoopCompleteContext* TParser::BlockLoopContext::loopComplete() {
  return getRuleContext<TParser::LoopCompleteContext>(0);
}


size_t TParser::BlockLoopContext::getRuleIndex() const {
  return TParser::RuleBlockLoop;
}

void TParser::BlockLoopContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterBlockLoop(this);
}

void TParser::BlockLoopContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitBlockLoop(this);
}


antlrcpp::Any TParser::BlockLoopContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitBlockLoop(this);
  else
    return visitor->visitChildren(this);
}

TParser::BlockLoopContext* TParser::blockLoop() {
  BlockLoopContext *_localctx = _tracker.createInstance<BlockLoopContext>(_ctx, getState());
  enterRule(_localctx, 44, TParser::RuleBlockLoop);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(319);
    match(TParser::For);
    setState(323);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 14, _ctx)) {
    case 1: {
      setState(320);
      loopInfinite();
      break;
    }

    case 2: {
      setState(321);
      loopConditional();
      break;
    }

    case 3: {
      setState(322);
      loopComplete();
      break;
    }

    default:
      break;
    }
    setState(325);
    loopBlockElements();
   
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

TParser::CodeBlockFlowControlContext* TParser::LoopBlockElementsContext::codeBlockFlowControl() {
  return getRuleContext<TParser::CodeBlockFlowControlContext>(0);
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
  enterRule(_localctx, 46, TParser::RuleLoopBlockElements);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(327);
    codeBlockFlowControl();
   
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

tree::TerminalNode* TParser::LoopCompleteContext::OpenOp() {
  return getToken(TParser::OpenOp, 0);
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
  enterRule(_localctx, 48, TParser::RuleLoopComplete);
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
    setState(330);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == TParser::OpenOp) {
      setState(329);
      match(TParser::OpenOp);
    }
    setState(332);
    loopOneMembers();
    setState(333);
    endOne();
    setState(334);
    loopTwoMembers();
    setState(335);
    endTwo();
    setState(336);
    loopThreeMembers();
    setState(338);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == TParser::CloseOp) {
      setState(337);
      match(TParser::CloseOp);
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
  enterRule(_localctx, 50, TParser::RuleLoopConditional);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(340);
    loopTwoMembers();
   
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
  enterRule(_localctx, 52, TParser::RuleLoopInfinite);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(345);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case TParser::OpenOp: {
        enterOuterAlt(_localctx, 1);
        setState(342);
        match(TParser::OpenOp);
        setState(343);
        match(TParser::CloseOp);
        break;
      }

      case TParser::If:
      case TParser::For:
      case TParser::Ret:
      case TParser::Break:
      case TParser::Next:
      case TParser::Try:
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
  enterRule(_localctx, 54, TParser::RuleEndOne);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(347);
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
  enterRule(_localctx, 56, TParser::RuleEndTwo);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(349);
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

tree::TerminalNode* TParser::LoopOneMembersContext::Var() {
  return getToken(TParser::Var, 0);
}

TParser::VariableItemContext* TParser::LoopOneMembersContext::variableItem() {
  return getRuleContext<TParser::VariableItemContext>(0);
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
  enterRule(_localctx, 58, TParser::RuleLoopOneMembers);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(354);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case TParser::Var: {
        enterOuterAlt(_localctx, 1);
        setState(351);
        match(TParser::Var);
        setState(352);
        variableItem();
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

TParser::GeneralValueElementsContext* TParser::LoopTwoMembersContext::generalValueElements() {
  return getRuleContext<TParser::GeneralValueElementsContext>(0);
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
  enterRule(_localctx, 60, TParser::RuleLoopTwoMembers);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(358);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 19, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(356);
      generalValueElements();
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
  enterRule(_localctx, 62, TParser::RuleLoopThreeMembers);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(362);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 20, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(360);
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

std::vector<TParser::GeneralValueElementsContext *> TParser::LoopThreeMembersValuesContext::generalValueElements() {
  return getRuleContexts<TParser::GeneralValueElementsContext>();
}

TParser::GeneralValueElementsContext* TParser::LoopThreeMembersValuesContext::generalValueElements(size_t i) {
  return getRuleContext<TParser::GeneralValueElementsContext>(i);
}

std::vector<tree::TerminalNode *> TParser::LoopThreeMembersValuesContext::Separator() {
  return getTokens(TParser::Separator);
}

tree::TerminalNode* TParser::LoopThreeMembersValuesContext::Separator(size_t i) {
  return getToken(TParser::Separator, i);
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
  enterRule(_localctx, 64, TParser::RuleLoopThreeMembersValues);
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
    setState(364);
    generalValueElements();
    setState(369);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while (_la == TParser::Separator) {
      setState(365);
      match(TParser::Separator);
      setState(366);
      generalValueElements();
      setState(371);
      _errHandler->sync(this);
      _la = _input->LA(1);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- BlockBreakContext ------------------------------------------------------------------

TParser::BlockBreakContext::BlockBreakContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::BlockBreakContext::Break() {
  return getToken(TParser::Break, 0);
}

tree::TerminalNode* TParser::BlockBreakContext::End() {
  return getToken(TParser::End, 0);
}


size_t TParser::BlockBreakContext::getRuleIndex() const {
  return TParser::RuleBlockBreak;
}

void TParser::BlockBreakContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterBlockBreak(this);
}

void TParser::BlockBreakContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitBlockBreak(this);
}


antlrcpp::Any TParser::BlockBreakContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitBlockBreak(this);
  else
    return visitor->visitChildren(this);
}

TParser::BlockBreakContext* TParser::blockBreak() {
  BlockBreakContext *_localctx = _tracker.createInstance<BlockBreakContext>(_ctx, getState());
  enterRule(_localctx, 66, TParser::RuleBlockBreak);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(372);
    match(TParser::Break);
    setState(373);
    match(TParser::End);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- BlockNextContext ------------------------------------------------------------------

TParser::BlockNextContext::BlockNextContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::BlockNextContext::Next() {
  return getToken(TParser::Next, 0);
}

tree::TerminalNode* TParser::BlockNextContext::End() {
  return getToken(TParser::End, 0);
}


size_t TParser::BlockNextContext::getRuleIndex() const {
  return TParser::RuleBlockNext;
}

void TParser::BlockNextContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterBlockNext(this);
}

void TParser::BlockNextContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitBlockNext(this);
}


antlrcpp::Any TParser::BlockNextContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitBlockNext(this);
  else
    return visitor->visitChildren(this);
}

TParser::BlockNextContext* TParser::blockNext() {
  BlockNextContext *_localctx = _tracker.createInstance<BlockNextContext>(_ctx, getState());
  enterRule(_localctx, 68, TParser::RuleBlockNext);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(375);
    match(TParser::Next);
    setState(376);
    match(TParser::End);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- BlockTryCatchContext ------------------------------------------------------------------

TParser::BlockTryCatchContext::BlockTryCatchContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::TryUniqueElementContext* TParser::BlockTryCatchContext::tryUniqueElement() {
  return getRuleContext<TParser::TryUniqueElementContext>(0);
}

TParser::CatchUniqueElementContext* TParser::BlockTryCatchContext::catchUniqueElement() {
  return getRuleContext<TParser::CatchUniqueElementContext>(0);
}


size_t TParser::BlockTryCatchContext::getRuleIndex() const {
  return TParser::RuleBlockTryCatch;
}

void TParser::BlockTryCatchContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterBlockTryCatch(this);
}

void TParser::BlockTryCatchContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitBlockTryCatch(this);
}


antlrcpp::Any TParser::BlockTryCatchContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitBlockTryCatch(this);
  else
    return visitor->visitChildren(this);
}

TParser::BlockTryCatchContext* TParser::blockTryCatch() {
  BlockTryCatchContext *_localctx = _tracker.createInstance<BlockTryCatchContext>(_ctx, getState());
  enterRule(_localctx, 70, TParser::RuleBlockTryCatch);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(378);
    tryUniqueElement();
    setState(380);
    _errHandler->sync(this);

    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 22, _ctx)) {
    case 1: {
      setState(379);
      catchUniqueElement();
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

//----------------- TryUniqueElementContext ------------------------------------------------------------------

TParser::TryUniqueElementContext::TryUniqueElementContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::TryUniqueElementContext::Try() {
  return getToken(TParser::Try, 0);
}

TParser::TryCatchElementsContext* TParser::TryUniqueElementContext::tryCatchElements() {
  return getRuleContext<TParser::TryCatchElementsContext>(0);
}


size_t TParser::TryUniqueElementContext::getRuleIndex() const {
  return TParser::RuleTryUniqueElement;
}

void TParser::TryUniqueElementContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterTryUniqueElement(this);
}

void TParser::TryUniqueElementContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitTryUniqueElement(this);
}


antlrcpp::Any TParser::TryUniqueElementContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitTryUniqueElement(this);
  else
    return visitor->visitChildren(this);
}

TParser::TryUniqueElementContext* TParser::tryUniqueElement() {
  TryUniqueElementContext *_localctx = _tracker.createInstance<TryUniqueElementContext>(_ctx, getState());
  enterRule(_localctx, 72, TParser::RuleTryUniqueElement);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(382);
    match(TParser::Try);
    setState(383);
    tryCatchElements();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- CatchUniqueElementContext ------------------------------------------------------------------

TParser::CatchUniqueElementContext::CatchUniqueElementContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::CatchUniqueElementContext::Catch() {
  return getToken(TParser::Catch, 0);
}

TParser::IdentifierContext* TParser::CatchUniqueElementContext::identifier() {
  return getRuleContext<TParser::IdentifierContext>(0);
}

TParser::TryCatchElementsContext* TParser::CatchUniqueElementContext::tryCatchElements() {
  return getRuleContext<TParser::TryCatchElementsContext>(0);
}

tree::TerminalNode* TParser::CatchUniqueElementContext::OpenOp() {
  return getToken(TParser::OpenOp, 0);
}

tree::TerminalNode* TParser::CatchUniqueElementContext::CloseOp() {
  return getToken(TParser::CloseOp, 0);
}


size_t TParser::CatchUniqueElementContext::getRuleIndex() const {
  return TParser::RuleCatchUniqueElement;
}

void TParser::CatchUniqueElementContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterCatchUniqueElement(this);
}

void TParser::CatchUniqueElementContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitCatchUniqueElement(this);
}


antlrcpp::Any TParser::CatchUniqueElementContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitCatchUniqueElement(this);
  else
    return visitor->visitChildren(this);
}

TParser::CatchUniqueElementContext* TParser::catchUniqueElement() {
  CatchUniqueElementContext *_localctx = _tracker.createInstance<CatchUniqueElementContext>(_ctx, getState());
  enterRule(_localctx, 74, TParser::RuleCatchUniqueElement);
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
    setState(385);
    match(TParser::Catch);
    setState(387);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == TParser::OpenOp) {
      setState(386);
      match(TParser::OpenOp);
    }
    setState(389);
    identifier();
    setState(391);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == TParser::CloseOp) {
      setState(390);
      match(TParser::CloseOp);
    }
    setState(393);
    tryCatchElements();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- TryCatchElementsContext ------------------------------------------------------------------

TParser::TryCatchElementsContext::TryCatchElementsContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::CodeBlockFlowControlContext* TParser::TryCatchElementsContext::codeBlockFlowControl() {
  return getRuleContext<TParser::CodeBlockFlowControlContext>(0);
}


size_t TParser::TryCatchElementsContext::getRuleIndex() const {
  return TParser::RuleTryCatchElements;
}

void TParser::TryCatchElementsContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterTryCatchElements(this);
}

void TParser::TryCatchElementsContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitTryCatchElements(this);
}


antlrcpp::Any TParser::TryCatchElementsContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitTryCatchElements(this);
  else
    return visitor->visitChildren(this);
}

TParser::TryCatchElementsContext* TParser::tryCatchElements() {
  TryCatchElementsContext *_localctx = _tracker.createInstance<TryCatchElementsContext>(_ctx, getState());
  enterRule(_localctx, 76, TParser::RuleTryCatchElements);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(395);
    codeBlockFlowControl();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- BlockFunctionContext ------------------------------------------------------------------

TParser::BlockFunctionContext::BlockFunctionContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<tree::TerminalNode *> TParser::BlockFunctionContext::OpenOp() {
  return getTokens(TParser::OpenOp);
}

tree::TerminalNode* TParser::BlockFunctionContext::OpenOp(size_t i) {
  return getToken(TParser::OpenOp, i);
}

tree::TerminalNode* TParser::BlockFunctionContext::Function() {
  return getToken(TParser::Function, 0);
}

std::vector<tree::TerminalNode *> TParser::BlockFunctionContext::CloseOp() {
  return getTokens(TParser::CloseOp);
}

tree::TerminalNode* TParser::BlockFunctionContext::CloseOp(size_t i) {
  return getToken(TParser::CloseOp, i);
}

TParser::FunctionCodeBlockContext* TParser::BlockFunctionContext::functionCodeBlock() {
  return getRuleContext<TParser::FunctionCodeBlockContext>(0);
}

tree::TerminalNode* TParser::BlockFunctionContext::End() {
  return getToken(TParser::End, 0);
}

TParser::IdentifierContext* TParser::BlockFunctionContext::identifier() {
  return getRuleContext<TParser::IdentifierContext>(0);
}

TParser::FunctionParamContext* TParser::BlockFunctionContext::functionParam() {
  return getRuleContext<TParser::FunctionParamContext>(0);
}

tree::TerminalNode* TParser::BlockFunctionContext::ArrowRight() {
  return getToken(TParser::ArrowRight, 0);
}

TParser::FunctionAnonymousParamContext* TParser::BlockFunctionContext::functionAnonymousParam() {
  return getRuleContext<TParser::FunctionAnonymousParamContext>(0);
}

TParser::IdentifierBContext* TParser::BlockFunctionContext::identifierB() {
  return getRuleContext<TParser::IdentifierBContext>(0);
}

tree::TerminalNode* TParser::BlockFunctionContext::TypeSpec() {
  return getToken(TParser::TypeSpec, 0);
}


size_t TParser::BlockFunctionContext::getRuleIndex() const {
  return TParser::RuleBlockFunction;
}

void TParser::BlockFunctionContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterBlockFunction(this);
}

void TParser::BlockFunctionContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitBlockFunction(this);
}


antlrcpp::Any TParser::BlockFunctionContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitBlockFunction(this);
  else
    return visitor->visitChildren(this);
}

TParser::BlockFunctionContext* TParser::blockFunction() {
  BlockFunctionContext *_localctx = _tracker.createInstance<BlockFunctionContext>(_ctx, getState());
  enterRule(_localctx, 78, TParser::RuleBlockFunction);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(443);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case TParser::OpenOp: {
        enterOuterAlt(_localctx, 1);
        setState(397);
        match(TParser::OpenOp);
        setState(398);
        match(TParser::Function);
        setState(400);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::Identifier) {
          setState(399);
          identifier();
        }
        setState(402);
        match(TParser::OpenOp);
        setState(404);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::Identifier) {
          setState(403);
          functionParam();
        }
        setState(406);
        match(TParser::CloseOp);
        setState(412);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::ArrowRight) {
          setState(407);
          match(TParser::ArrowRight);
          setState(410);
          _errHandler->sync(this);
          switch (_input->LA(1)) {
            case TParser::Identifier: {
              setState(408);
              identifierB();
              break;
            }

            case TParser::TypeSpec: {
              setState(409);
              match(TParser::TypeSpec);
              break;
            }

          default:
            throw NoViableAltException(this);
          }
        }
        setState(414);
        functionCodeBlock();
        setState(415);
        match(TParser::CloseOp);
        setState(416);
        match(TParser::OpenOp);
        setState(418);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if ((((_la & ~ 0x3fULL) == 0) &&
          ((1ULL << _la) & ((1ULL << TParser::Function)
          | (1ULL << TParser::Class)
          | (1ULL << TParser::OpenArIndex)
          | (1ULL << TParser::OpenBlock)
          | (1ULL << TParser::OpenOp)
          | (1ULL << TParser::Not)
          | (1ULL << TParser::IncDecOperators)
          | (1ULL << TParser::Identifier)
          | (1ULL << TParser::Integer)
          | (1ULL << TParser::Float)
          | (1ULL << TParser::String))) != 0)) {
          setState(417);
          functionAnonymousParam();
        }
        setState(420);
        match(TParser::CloseOp);
        setState(421);
        match(TParser::End);
        break;
      }

      case TParser::Function: {
        enterOuterAlt(_localctx, 2);
        setState(423);
        match(TParser::Function);
        setState(425);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::Identifier) {
          setState(424);
          identifier();
        }
        setState(427);
        match(TParser::OpenOp);
        setState(429);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::Identifier) {
          setState(428);
          functionParam();
        }
        setState(431);
        match(TParser::CloseOp);
        setState(437);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::ArrowRight) {
          setState(432);
          match(TParser::ArrowRight);
          setState(435);
          _errHandler->sync(this);
          switch (_input->LA(1)) {
            case TParser::Identifier: {
              setState(433);
              identifierB();
              break;
            }

            case TParser::TypeSpec: {
              setState(434);
              match(TParser::TypeSpec);
              break;
            }

          default:
            throw NoViableAltException(this);
          }
        }
        setState(441);
        _errHandler->sync(this);
        switch (_input->LA(1)) {
          case TParser::OpenBlock: {
            setState(439);
            functionCodeBlock();
            break;
          }

          case TParser::End: {
            setState(440);
            match(TParser::End);
            break;
          }

        default:
          throw NoViableAltException(this);
        }
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

//----------------- BlockFunctionDeclarationAttrContext ------------------------------------------------------------------

TParser::BlockFunctionDeclarationAttrContext::BlockFunctionDeclarationAttrContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<tree::TerminalNode *> TParser::BlockFunctionDeclarationAttrContext::OpenOp() {
  return getTokens(TParser::OpenOp);
}

tree::TerminalNode* TParser::BlockFunctionDeclarationAttrContext::OpenOp(size_t i) {
  return getToken(TParser::OpenOp, i);
}

tree::TerminalNode* TParser::BlockFunctionDeclarationAttrContext::Function() {
  return getToken(TParser::Function, 0);
}

std::vector<tree::TerminalNode *> TParser::BlockFunctionDeclarationAttrContext::CloseOp() {
  return getTokens(TParser::CloseOp);
}

tree::TerminalNode* TParser::BlockFunctionDeclarationAttrContext::CloseOp(size_t i) {
  return getToken(TParser::CloseOp, i);
}

TParser::FunctionCodeBlockContext* TParser::BlockFunctionDeclarationAttrContext::functionCodeBlock() {
  return getRuleContext<TParser::FunctionCodeBlockContext>(0);
}

TParser::IdentifierContext* TParser::BlockFunctionDeclarationAttrContext::identifier() {
  return getRuleContext<TParser::IdentifierContext>(0);
}

TParser::FunctionParamContext* TParser::BlockFunctionDeclarationAttrContext::functionParam() {
  return getRuleContext<TParser::FunctionParamContext>(0);
}

tree::TerminalNode* TParser::BlockFunctionDeclarationAttrContext::ArrowRight() {
  return getToken(TParser::ArrowRight, 0);
}

TParser::FunctionAnonymousParamContext* TParser::BlockFunctionDeclarationAttrContext::functionAnonymousParam() {
  return getRuleContext<TParser::FunctionAnonymousParamContext>(0);
}

TParser::IdentifierBContext* TParser::BlockFunctionDeclarationAttrContext::identifierB() {
  return getRuleContext<TParser::IdentifierBContext>(0);
}

tree::TerminalNode* TParser::BlockFunctionDeclarationAttrContext::TypeSpec() {
  return getToken(TParser::TypeSpec, 0);
}


size_t TParser::BlockFunctionDeclarationAttrContext::getRuleIndex() const {
  return TParser::RuleBlockFunctionDeclarationAttr;
}

void TParser::BlockFunctionDeclarationAttrContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterBlockFunctionDeclarationAttr(this);
}

void TParser::BlockFunctionDeclarationAttrContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitBlockFunctionDeclarationAttr(this);
}


antlrcpp::Any TParser::BlockFunctionDeclarationAttrContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitBlockFunctionDeclarationAttr(this);
  else
    return visitor->visitChildren(this);
}

TParser::BlockFunctionDeclarationAttrContext* TParser::blockFunctionDeclarationAttr() {
  BlockFunctionDeclarationAttrContext *_localctx = _tracker.createInstance<BlockFunctionDeclarationAttrContext>(_ctx, getState());
  enterRule(_localctx, 80, TParser::RuleBlockFunctionDeclarationAttr);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(487);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case TParser::OpenOp: {
        enterOuterAlt(_localctx, 1);
        setState(445);
        match(TParser::OpenOp);
        setState(446);
        match(TParser::Function);
        setState(448);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::Identifier) {
          setState(447);
          identifier();
        }
        setState(450);
        match(TParser::OpenOp);
        setState(452);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::Identifier) {
          setState(451);
          functionParam();
        }
        setState(454);
        match(TParser::CloseOp);
        setState(460);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::ArrowRight) {
          setState(455);
          match(TParser::ArrowRight);
          setState(458);
          _errHandler->sync(this);
          switch (_input->LA(1)) {
            case TParser::Identifier: {
              setState(456);
              identifierB();
              break;
            }

            case TParser::TypeSpec: {
              setState(457);
              match(TParser::TypeSpec);
              break;
            }

          default:
            throw NoViableAltException(this);
          }
        }
        setState(462);
        functionCodeBlock();
        setState(463);
        match(TParser::CloseOp);
        setState(464);
        match(TParser::OpenOp);
        setState(466);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if ((((_la & ~ 0x3fULL) == 0) &&
          ((1ULL << _la) & ((1ULL << TParser::Function)
          | (1ULL << TParser::Class)
          | (1ULL << TParser::OpenArIndex)
          | (1ULL << TParser::OpenBlock)
          | (1ULL << TParser::OpenOp)
          | (1ULL << TParser::Not)
          | (1ULL << TParser::IncDecOperators)
          | (1ULL << TParser::Identifier)
          | (1ULL << TParser::Integer)
          | (1ULL << TParser::Float)
          | (1ULL << TParser::String))) != 0)) {
          setState(465);
          functionAnonymousParam();
        }
        setState(468);
        match(TParser::CloseOp);
        break;
      }

      case TParser::Function: {
        enterOuterAlt(_localctx, 2);
        setState(470);
        match(TParser::Function);
        setState(472);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::Identifier) {
          setState(471);
          identifier();
        }
        setState(474);
        match(TParser::OpenOp);
        setState(476);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::Identifier) {
          setState(475);
          functionParam();
        }
        setState(478);
        match(TParser::CloseOp);
        setState(484);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::ArrowRight) {
          setState(479);
          match(TParser::ArrowRight);
          setState(482);
          _errHandler->sync(this);
          switch (_input->LA(1)) {
            case TParser::Identifier: {
              setState(480);
              identifierB();
              break;
            }

            case TParser::TypeSpec: {
              setState(481);
              match(TParser::TypeSpec);
              break;
            }

          default:
            throw NoViableAltException(this);
          }
        }
        setState(486);
        functionCodeBlock();
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

//----------------- FunctionParamContext ------------------------------------------------------------------

TParser::FunctionParamContext::FunctionParamContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::FunctionParamContext::Identifier() {
  return getToken(TParser::Identifier, 0);
}

tree::TerminalNode* TParser::FunctionParamContext::TypeSpec() {
  return getToken(TParser::TypeSpec, 0);
}

tree::TerminalNode* TParser::FunctionParamContext::Separator() {
  return getToken(TParser::Separator, 0);
}

TParser::FunctionParamContext* TParser::FunctionParamContext::functionParam() {
  return getRuleContext<TParser::FunctionParamContext>(0);
}


size_t TParser::FunctionParamContext::getRuleIndex() const {
  return TParser::RuleFunctionParam;
}

void TParser::FunctionParamContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterFunctionParam(this);
}

void TParser::FunctionParamContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitFunctionParam(this);
}


antlrcpp::Any TParser::FunctionParamContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitFunctionParam(this);
  else
    return visitor->visitChildren(this);
}

TParser::FunctionParamContext* TParser::functionParam() {
  FunctionParamContext *_localctx = _tracker.createInstance<FunctionParamContext>(_ctx, getState());
  enterRule(_localctx, 82, TParser::RuleFunctionParam);
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
    setState(489);
    match(TParser::Identifier);
    setState(490);
    match(TParser::TypeSpec);
    setState(493);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == TParser::Separator) {
      setState(491);
      match(TParser::Separator);
      setState(492);
      functionParam();
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- FunctionAnonymousParamContext ------------------------------------------------------------------

TParser::FunctionAnonymousParamContext::FunctionAnonymousParamContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::GeneralValueElementsContext* TParser::FunctionAnonymousParamContext::generalValueElements() {
  return getRuleContext<TParser::GeneralValueElementsContext>(0);
}


size_t TParser::FunctionAnonymousParamContext::getRuleIndex() const {
  return TParser::RuleFunctionAnonymousParam;
}

void TParser::FunctionAnonymousParamContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterFunctionAnonymousParam(this);
}

void TParser::FunctionAnonymousParamContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitFunctionAnonymousParam(this);
}


antlrcpp::Any TParser::FunctionAnonymousParamContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitFunctionAnonymousParam(this);
  else
    return visitor->visitChildren(this);
}

TParser::FunctionAnonymousParamContext* TParser::functionAnonymousParam() {
  FunctionAnonymousParamContext *_localctx = _tracker.createInstance<FunctionAnonymousParamContext>(_ctx, getState());
  enterRule(_localctx, 84, TParser::RuleFunctionAnonymousParam);

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
    generalValueElements();
   
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

TParser::CodeBlockControlContext* TParser::FunctionCodeBlockContext::codeBlockControl() {
  return getRuleContext<TParser::CodeBlockControlContext>(0);
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
  enterRule(_localctx, 86, TParser::RuleFunctionCodeBlock);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(497);
    codeBlockControl();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- BlockInterfaceContext ------------------------------------------------------------------

TParser::BlockInterfaceContext::BlockInterfaceContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::BlockInterfaceContext::Interface() {
  return getToken(TParser::Interface, 0);
}

TParser::IdentifierContext* TParser::BlockInterfaceContext::identifier() {
  return getRuleContext<TParser::IdentifierContext>(0);
}

TParser::InterfaceCodeBlockContext* TParser::BlockInterfaceContext::interfaceCodeBlock() {
  return getRuleContext<TParser::InterfaceCodeBlockContext>(0);
}

tree::TerminalNode* TParser::BlockInterfaceContext::Extends() {
  return getToken(TParser::Extends, 0);
}

TParser::IdentifierBContext* TParser::BlockInterfaceContext::identifierB() {
  return getRuleContext<TParser::IdentifierBContext>(0);
}


size_t TParser::BlockInterfaceContext::getRuleIndex() const {
  return TParser::RuleBlockInterface;
}

void TParser::BlockInterfaceContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterBlockInterface(this);
}

void TParser::BlockInterfaceContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitBlockInterface(this);
}


antlrcpp::Any TParser::BlockInterfaceContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitBlockInterface(this);
  else
    return visitor->visitChildren(this);
}

TParser::BlockInterfaceContext* TParser::blockInterface() {
  BlockInterfaceContext *_localctx = _tracker.createInstance<BlockInterfaceContext>(_ctx, getState());
  enterRule(_localctx, 88, TParser::RuleBlockInterface);
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
    setState(499);
    match(TParser::Interface);
    setState(500);
    identifier();
    setState(503);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == TParser::Extends) {
      setState(501);
      match(TParser::Extends);
      setState(502);
      identifierB();
    }
    setState(505);
    interfaceCodeBlock();
   
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

TParser::CodeBlockControlContext* TParser::InterfaceCodeBlockContext::codeBlockControl() {
  return getRuleContext<TParser::CodeBlockControlContext>(0);
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
  enterRule(_localctx, 90, TParser::RuleInterfaceCodeBlock);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(507);
    codeBlockControl();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- BlockAbstractionContext ------------------------------------------------------------------

TParser::BlockAbstractionContext::BlockAbstractionContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::BlockAbstractionContext::Abstract() {
  return getToken(TParser::Abstract, 0);
}

TParser::IdentifierContext* TParser::BlockAbstractionContext::identifier() {
  return getRuleContext<TParser::IdentifierContext>(0);
}

TParser::AbstractionCodeBlockContext* TParser::BlockAbstractionContext::abstractionCodeBlock() {
  return getRuleContext<TParser::AbstractionCodeBlockContext>(0);
}

tree::TerminalNode* TParser::BlockAbstractionContext::Extends() {
  return getToken(TParser::Extends, 0);
}

TParser::IdentifierBContext* TParser::BlockAbstractionContext::identifierB() {
  return getRuleContext<TParser::IdentifierBContext>(0);
}


size_t TParser::BlockAbstractionContext::getRuleIndex() const {
  return TParser::RuleBlockAbstraction;
}

void TParser::BlockAbstractionContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterBlockAbstraction(this);
}

void TParser::BlockAbstractionContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitBlockAbstraction(this);
}


antlrcpp::Any TParser::BlockAbstractionContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitBlockAbstraction(this);
  else
    return visitor->visitChildren(this);
}

TParser::BlockAbstractionContext* TParser::blockAbstraction() {
  BlockAbstractionContext *_localctx = _tracker.createInstance<BlockAbstractionContext>(_ctx, getState());
  enterRule(_localctx, 92, TParser::RuleBlockAbstraction);
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
    setState(509);
    match(TParser::Abstract);
    setState(510);
    identifier();
    setState(513);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == TParser::Extends) {
      setState(511);
      match(TParser::Extends);
      setState(512);
      identifierB();
    }
    setState(515);
    abstractionCodeBlock();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- AbstractionCodeBlockContext ------------------------------------------------------------------

TParser::AbstractionCodeBlockContext::AbstractionCodeBlockContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::CodeBlockControlContext* TParser::AbstractionCodeBlockContext::codeBlockControl() {
  return getRuleContext<TParser::CodeBlockControlContext>(0);
}


size_t TParser::AbstractionCodeBlockContext::getRuleIndex() const {
  return TParser::RuleAbstractionCodeBlock;
}

void TParser::AbstractionCodeBlockContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterAbstractionCodeBlock(this);
}

void TParser::AbstractionCodeBlockContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitAbstractionCodeBlock(this);
}


antlrcpp::Any TParser::AbstractionCodeBlockContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitAbstractionCodeBlock(this);
  else
    return visitor->visitChildren(this);
}

TParser::AbstractionCodeBlockContext* TParser::abstractionCodeBlock() {
  AbstractionCodeBlockContext *_localctx = _tracker.createInstance<AbstractionCodeBlockContext>(_ctx, getState());
  enterRule(_localctx, 94, TParser::RuleAbstractionCodeBlock);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(517);
    codeBlockControl();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- BlockClassContext ------------------------------------------------------------------

TParser::BlockClassContext::BlockClassContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::OpenOpAContext* TParser::BlockClassContext::openOpA() {
  return getRuleContext<TParser::OpenOpAContext>(0);
}

tree::TerminalNode* TParser::BlockClassContext::New() {
  return getToken(TParser::New, 0);
}

tree::TerminalNode* TParser::BlockClassContext::Class() {
  return getToken(TParser::Class, 0);
}

TParser::ClassCodeBlockContext* TParser::BlockClassContext::classCodeBlock() {
  return getRuleContext<TParser::ClassCodeBlockContext>(0);
}

TParser::CloseOpAContext* TParser::BlockClassContext::closeOpA() {
  return getRuleContext<TParser::CloseOpAContext>(0);
}

tree::TerminalNode* TParser::BlockClassContext::End() {
  return getToken(TParser::End, 0);
}

TParser::IdentifierContext* TParser::BlockClassContext::identifier() {
  return getRuleContext<TParser::IdentifierContext>(0);
}

tree::TerminalNode* TParser::BlockClassContext::Extends() {
  return getToken(TParser::Extends, 0);
}

TParser::IdentifierBContext* TParser::BlockClassContext::identifierB() {
  return getRuleContext<TParser::IdentifierBContext>(0);
}

tree::TerminalNode* TParser::BlockClassContext::Implements() {
  return getToken(TParser::Implements, 0);
}

TParser::IdentifierCContext* TParser::BlockClassContext::identifierC() {
  return getRuleContext<TParser::IdentifierCContext>(0);
}

TParser::IdentifierDContext* TParser::BlockClassContext::identifierD() {
  return getRuleContext<TParser::IdentifierDContext>(0);
}

tree::TerminalNode* TParser::BlockClassContext::OpenOp() {
  return getToken(TParser::OpenOp, 0);
}

tree::TerminalNode* TParser::BlockClassContext::CloseOp() {
  return getToken(TParser::CloseOp, 0);
}

tree::TerminalNode* TParser::BlockClassContext::Point() {
  return getToken(TParser::Point, 0);
}

tree::TerminalNode* TParser::BlockClassContext::TwoTwoPoint() {
  return getToken(TParser::TwoTwoPoint, 0);
}

TParser::GeneralValueElementsContext* TParser::BlockClassContext::generalValueElements() {
  return getRuleContext<TParser::GeneralValueElementsContext>(0);
}


size_t TParser::BlockClassContext::getRuleIndex() const {
  return TParser::RuleBlockClass;
}

void TParser::BlockClassContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterBlockClass(this);
}

void TParser::BlockClassContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitBlockClass(this);
}


antlrcpp::Any TParser::BlockClassContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitBlockClass(this);
  else
    return visitor->visitChildren(this);
}

TParser::BlockClassContext* TParser::blockClass() {
  BlockClassContext *_localctx = _tracker.createInstance<BlockClassContext>(_ctx, getState());
  enterRule(_localctx, 96, TParser::RuleBlockClass);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(560);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case TParser::OpenOp: {
        enterOuterAlt(_localctx, 1);
        setState(519);
        openOpA();
        setState(520);
        match(TParser::New);
        setState(521);
        match(TParser::Class);
        setState(523);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::Identifier) {
          setState(522);
          identifier();
        }
        setState(527);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::Extends) {
          setState(525);
          match(TParser::Extends);
          setState(526);
          identifierB();
        }
        setState(531);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::Implements) {
          setState(529);
          match(TParser::Implements);
          setState(530);
          identifierC();
        }
        setState(533);
        classCodeBlock();
        setState(534);
        closeOpA();
        setState(543);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::Point

        || _la == TParser::TwoTwoPoint) {
          setState(535);
          _la = _input->LA(1);
          if (!(_la == TParser::Point

          || _la == TParser::TwoTwoPoint)) {
          _errHandler->recoverInline(this);
          }
          else {
            _errHandler->reportMatch(this);
            consume();
          }
          setState(536);
          identifierD();
          setState(537);
          match(TParser::OpenOp);
          setState(539);
          _errHandler->sync(this);

          _la = _input->LA(1);
          if ((((_la & ~ 0x3fULL) == 0) &&
            ((1ULL << _la) & ((1ULL << TParser::Function)
            | (1ULL << TParser::Class)
            | (1ULL << TParser::OpenArIndex)
            | (1ULL << TParser::OpenBlock)
            | (1ULL << TParser::OpenOp)
            | (1ULL << TParser::Not)
            | (1ULL << TParser::IncDecOperators)
            | (1ULL << TParser::Identifier)
            | (1ULL << TParser::Integer)
            | (1ULL << TParser::Float)
            | (1ULL << TParser::String))) != 0)) {
            setState(538);
            generalValueElements();
          }
          setState(541);
          match(TParser::CloseOp);
        }
        setState(545);
        match(TParser::End);
        break;
      }

      case TParser::Class: {
        enterOuterAlt(_localctx, 2);
        setState(547);
        match(TParser::Class);
        setState(549);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::Identifier) {
          setState(548);
          identifier();
        }
        setState(553);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::Extends) {
          setState(551);
          match(TParser::Extends);
          setState(552);
          identifierB();
        }
        setState(557);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::Implements) {
          setState(555);
          match(TParser::Implements);
          setState(556);
          identifierC();
        }
        setState(559);
        classCodeBlock();
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

//----------------- BlockClassDeclarationAttrContext ------------------------------------------------------------------

TParser::BlockClassDeclarationAttrContext::BlockClassDeclarationAttrContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::OpenOpAContext* TParser::BlockClassDeclarationAttrContext::openOpA() {
  return getRuleContext<TParser::OpenOpAContext>(0);
}

tree::TerminalNode* TParser::BlockClassDeclarationAttrContext::New() {
  return getToken(TParser::New, 0);
}

tree::TerminalNode* TParser::BlockClassDeclarationAttrContext::Class() {
  return getToken(TParser::Class, 0);
}

TParser::ClassCodeBlockContext* TParser::BlockClassDeclarationAttrContext::classCodeBlock() {
  return getRuleContext<TParser::ClassCodeBlockContext>(0);
}

TParser::CloseOpAContext* TParser::BlockClassDeclarationAttrContext::closeOpA() {
  return getRuleContext<TParser::CloseOpAContext>(0);
}

TParser::IdentifierContext* TParser::BlockClassDeclarationAttrContext::identifier() {
  return getRuleContext<TParser::IdentifierContext>(0);
}

tree::TerminalNode* TParser::BlockClassDeclarationAttrContext::Extends() {
  return getToken(TParser::Extends, 0);
}

TParser::IdentifierBContext* TParser::BlockClassDeclarationAttrContext::identifierB() {
  return getRuleContext<TParser::IdentifierBContext>(0);
}

tree::TerminalNode* TParser::BlockClassDeclarationAttrContext::Implements() {
  return getToken(TParser::Implements, 0);
}

TParser::IdentifierCContext* TParser::BlockClassDeclarationAttrContext::identifierC() {
  return getRuleContext<TParser::IdentifierCContext>(0);
}

TParser::IdentifierDContext* TParser::BlockClassDeclarationAttrContext::identifierD() {
  return getRuleContext<TParser::IdentifierDContext>(0);
}

tree::TerminalNode* TParser::BlockClassDeclarationAttrContext::OpenOp() {
  return getToken(TParser::OpenOp, 0);
}

tree::TerminalNode* TParser::BlockClassDeclarationAttrContext::CloseOp() {
  return getToken(TParser::CloseOp, 0);
}

tree::TerminalNode* TParser::BlockClassDeclarationAttrContext::Point() {
  return getToken(TParser::Point, 0);
}

tree::TerminalNode* TParser::BlockClassDeclarationAttrContext::TwoTwoPoint() {
  return getToken(TParser::TwoTwoPoint, 0);
}

TParser::GeneralValueElementsContext* TParser::BlockClassDeclarationAttrContext::generalValueElements() {
  return getRuleContext<TParser::GeneralValueElementsContext>(0);
}


size_t TParser::BlockClassDeclarationAttrContext::getRuleIndex() const {
  return TParser::RuleBlockClassDeclarationAttr;
}

void TParser::BlockClassDeclarationAttrContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterBlockClassDeclarationAttr(this);
}

void TParser::BlockClassDeclarationAttrContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitBlockClassDeclarationAttr(this);
}


antlrcpp::Any TParser::BlockClassDeclarationAttrContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitBlockClassDeclarationAttr(this);
  else
    return visitor->visitChildren(this);
}

TParser::BlockClassDeclarationAttrContext* TParser::blockClassDeclarationAttr() {
  BlockClassDeclarationAttrContext *_localctx = _tracker.createInstance<BlockClassDeclarationAttrContext>(_ctx, getState());
  enterRule(_localctx, 98, TParser::RuleBlockClassDeclarationAttr);
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
    switch (_input->LA(1)) {
      case TParser::OpenOp: {
        enterOuterAlt(_localctx, 1);
        setState(562);
        openOpA();
        setState(563);
        match(TParser::New);
        setState(564);
        match(TParser::Class);
        setState(566);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::Identifier) {
          setState(565);
          identifier();
        }
        setState(570);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::Extends) {
          setState(568);
          match(TParser::Extends);
          setState(569);
          identifierB();
        }
        setState(574);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::Implements) {
          setState(572);
          match(TParser::Implements);
          setState(573);
          identifierC();
        }
        setState(576);
        classCodeBlock();
        setState(577);
        closeOpA();
        setState(586);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::Point

        || _la == TParser::TwoTwoPoint) {
          setState(578);
          _la = _input->LA(1);
          if (!(_la == TParser::Point

          || _la == TParser::TwoTwoPoint)) {
          _errHandler->recoverInline(this);
          }
          else {
            _errHandler->reportMatch(this);
            consume();
          }
          setState(579);
          identifierD();
          setState(580);
          match(TParser::OpenOp);
          setState(582);
          _errHandler->sync(this);

          _la = _input->LA(1);
          if ((((_la & ~ 0x3fULL) == 0) &&
            ((1ULL << _la) & ((1ULL << TParser::Function)
            | (1ULL << TParser::Class)
            | (1ULL << TParser::OpenArIndex)
            | (1ULL << TParser::OpenBlock)
            | (1ULL << TParser::OpenOp)
            | (1ULL << TParser::Not)
            | (1ULL << TParser::IncDecOperators)
            | (1ULL << TParser::Identifier)
            | (1ULL << TParser::Integer)
            | (1ULL << TParser::Float)
            | (1ULL << TParser::String))) != 0)) {
            setState(581);
            generalValueElements();
          }
          setState(584);
          match(TParser::CloseOp);
        }
        break;
      }

      case TParser::Class: {
        enterOuterAlt(_localctx, 2);
        setState(588);
        match(TParser::Class);
        setState(590);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::Identifier) {
          setState(589);
          identifier();
        }
        setState(594);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::Extends) {
          setState(592);
          match(TParser::Extends);
          setState(593);
          identifierB();
        }
        setState(598);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::Implements) {
          setState(596);
          match(TParser::Implements);
          setState(597);
          identifierC();
        }
        setState(600);
        classCodeBlock();
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

//----------------- ClassAnonymousParamContext ------------------------------------------------------------------

TParser::ClassAnonymousParamContext::ClassAnonymousParamContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::GeneralValueElementsContext* TParser::ClassAnonymousParamContext::generalValueElements() {
  return getRuleContext<TParser::GeneralValueElementsContext>(0);
}


size_t TParser::ClassAnonymousParamContext::getRuleIndex() const {
  return TParser::RuleClassAnonymousParam;
}

void TParser::ClassAnonymousParamContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterClassAnonymousParam(this);
}

void TParser::ClassAnonymousParamContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitClassAnonymousParam(this);
}


antlrcpp::Any TParser::ClassAnonymousParamContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitClassAnonymousParam(this);
  else
    return visitor->visitChildren(this);
}

TParser::ClassAnonymousParamContext* TParser::classAnonymousParam() {
  ClassAnonymousParamContext *_localctx = _tracker.createInstance<ClassAnonymousParamContext>(_ctx, getState());
  enterRule(_localctx, 100, TParser::RuleClassAnonymousParam);

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
    generalValueElements();
   
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

TParser::CodeBlockControlContext* TParser::ClassCodeBlockContext::codeBlockControl() {
  return getRuleContext<TParser::CodeBlockControlContext>(0);
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
  enterRule(_localctx, 102, TParser::RuleClassCodeBlock);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(605);
    codeBlockControl();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- BlockArrayContext ------------------------------------------------------------------

TParser::BlockArrayContext::BlockArrayContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::IndexArrayContext* TParser::BlockArrayContext::indexArray() {
  return getRuleContext<TParser::IndexArrayContext>(0);
}

TParser::AssociativeArrayContext* TParser::BlockArrayContext::associativeArray() {
  return getRuleContext<TParser::AssociativeArrayContext>(0);
}


size_t TParser::BlockArrayContext::getRuleIndex() const {
  return TParser::RuleBlockArray;
}

void TParser::BlockArrayContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterBlockArray(this);
}

void TParser::BlockArrayContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitBlockArray(this);
}


antlrcpp::Any TParser::BlockArrayContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitBlockArray(this);
  else
    return visitor->visitChildren(this);
}

TParser::BlockArrayContext* TParser::blockArray() {
  BlockArrayContext *_localctx = _tracker.createInstance<BlockArrayContext>(_ctx, getState());
  enterRule(_localctx, 104, TParser::RuleBlockArray);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(609);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case TParser::OpenArIndex: {
        setState(607);
        indexArray();
        break;
      }

      case TParser::OpenBlock: {
        setState(608);
        associativeArray();
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

//----------------- IndexArrayContext ------------------------------------------------------------------

TParser::IndexArrayContext::IndexArrayContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::IndexArrayContext::OpenArIndex() {
  return getToken(TParser::OpenArIndex, 0);
}

TParser::IndexArrayElementsContext* TParser::IndexArrayContext::indexArrayElements() {
  return getRuleContext<TParser::IndexArrayElementsContext>(0);
}

tree::TerminalNode* TParser::IndexArrayContext::CloseArIndex() {
  return getToken(TParser::CloseArIndex, 0);
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
  enterRule(_localctx, 106, TParser::RuleIndexArray);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(611);
    match(TParser::OpenArIndex);
    setState(612);
    indexArrayElements();
    setState(613);
    match(TParser::CloseArIndex);
   
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

TParser::GeneralValueElementsContext* TParser::IndexArrayElementsContext::generalValueElements() {
  return getRuleContext<TParser::GeneralValueElementsContext>(0);
}

std::vector<tree::TerminalNode *> TParser::IndexArrayElementsContext::Separator() {
  return getTokens(TParser::Separator);
}

tree::TerminalNode* TParser::IndexArrayElementsContext::Separator(size_t i) {
  return getToken(TParser::Separator, i);
}

std::vector<TParser::IndexArrayElementsContext *> TParser::IndexArrayElementsContext::indexArrayElements() {
  return getRuleContexts<TParser::IndexArrayElementsContext>();
}

TParser::IndexArrayElementsContext* TParser::IndexArrayElementsContext::indexArrayElements(size_t i) {
  return getRuleContext<TParser::IndexArrayElementsContext>(i);
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
  enterRule(_localctx, 108, TParser::RuleIndexArrayElements);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    size_t alt;
    enterOuterAlt(_localctx, 1);
    setState(615);
    generalValueElements();
    setState(620);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 68, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        setState(616);
        match(TParser::Separator);
        setState(617);
        indexArrayElements(); 
      }
      setState(622);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 68, _ctx);
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

TParser::AssociativeArrayElementsContext* TParser::AssociativeArrayContext::associativeArrayElements() {
  return getRuleContext<TParser::AssociativeArrayElementsContext>(0);
}

tree::TerminalNode* TParser::AssociativeArrayContext::CloseBlock() {
  return getToken(TParser::CloseBlock, 0);
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
  enterRule(_localctx, 110, TParser::RuleAssociativeArray);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(623);
    match(TParser::OpenBlock);
    setState(624);
    associativeArrayElements();
    setState(625);
    match(TParser::CloseBlock);
   
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

TParser::IdentifierContext* TParser::AssociativeArrayElementsContext::identifier() {
  return getRuleContext<TParser::IdentifierContext>(0);
}

tree::TerminalNode* TParser::AssociativeArrayElementsContext::TwoPoint() {
  return getToken(TParser::TwoPoint, 0);
}

TParser::GeneralValueElementsContext* TParser::AssociativeArrayElementsContext::generalValueElements() {
  return getRuleContext<TParser::GeneralValueElementsContext>(0);
}

std::vector<tree::TerminalNode *> TParser::AssociativeArrayElementsContext::Separator() {
  return getTokens(TParser::Separator);
}

tree::TerminalNode* TParser::AssociativeArrayElementsContext::Separator(size_t i) {
  return getToken(TParser::Separator, i);
}

std::vector<TParser::AssociativeArrayElementsContext *> TParser::AssociativeArrayElementsContext::associativeArrayElements() {
  return getRuleContexts<TParser::AssociativeArrayElementsContext>();
}

TParser::AssociativeArrayElementsContext* TParser::AssociativeArrayElementsContext::associativeArrayElements(size_t i) {
  return getRuleContext<TParser::AssociativeArrayElementsContext>(i);
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
  enterRule(_localctx, 112, TParser::RuleAssociativeArrayElements);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    size_t alt;
    enterOuterAlt(_localctx, 1);
    setState(627);
    identifier();
    setState(628);
    match(TParser::TwoPoint);
    setState(629);
    generalValueElements();
    setState(634);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 69, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        setState(630);
        match(TParser::Separator);
        setState(631);
        associativeArrayElements(); 
      }
      setState(636);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 69, _ctx);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- BlockLambdaFunctionsContext ------------------------------------------------------------------

TParser::BlockLambdaFunctionsContext::BlockLambdaFunctionsContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::BlockLambdaFunctionsContext::OpenOp() {
  return getToken(TParser::OpenOp, 0);
}

tree::TerminalNode* TParser::BlockLambdaFunctionsContext::CloseOp() {
  return getToken(TParser::CloseOp, 0);
}

tree::TerminalNode* TParser::BlockLambdaFunctionsContext::ARightLB() {
  return getToken(TParser::ARightLB, 0);
}

TParser::LambdaFnCodeBlockContext* TParser::BlockLambdaFunctionsContext::lambdaFnCodeBlock() {
  return getRuleContext<TParser::LambdaFnCodeBlockContext>(0);
}

TParser::LambdaFnParamsContext* TParser::BlockLambdaFunctionsContext::lambdaFnParams() {
  return getRuleContext<TParser::LambdaFnParamsContext>(0);
}

tree::TerminalNode* TParser::BlockLambdaFunctionsContext::ArrowRight() {
  return getToken(TParser::ArrowRight, 0);
}

TParser::IdentifierContext* TParser::BlockLambdaFunctionsContext::identifier() {
  return getRuleContext<TParser::IdentifierContext>(0);
}

tree::TerminalNode* TParser::BlockLambdaFunctionsContext::TypeSpec() {
  return getToken(TParser::TypeSpec, 0);
}


size_t TParser::BlockLambdaFunctionsContext::getRuleIndex() const {
  return TParser::RuleBlockLambdaFunctions;
}

void TParser::BlockLambdaFunctionsContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterBlockLambdaFunctions(this);
}

void TParser::BlockLambdaFunctionsContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitBlockLambdaFunctions(this);
}


antlrcpp::Any TParser::BlockLambdaFunctionsContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitBlockLambdaFunctions(this);
  else
    return visitor->visitChildren(this);
}

TParser::BlockLambdaFunctionsContext* TParser::blockLambdaFunctions() {
  BlockLambdaFunctionsContext *_localctx = _tracker.createInstance<BlockLambdaFunctionsContext>(_ctx, getState());
  enterRule(_localctx, 114, TParser::RuleBlockLambdaFunctions);
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
    setState(637);
    match(TParser::OpenOp);
    setState(639);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == TParser::Identifier) {
      setState(638);
      lambdaFnParams();
    }
    setState(641);
    match(TParser::CloseOp);
    setState(647);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == TParser::ArrowRight) {
      setState(642);
      match(TParser::ArrowRight);
      setState(645);
      _errHandler->sync(this);
      switch (_input->LA(1)) {
        case TParser::Identifier: {
          setState(643);
          identifier();
          break;
        }

        case TParser::TypeSpec: {
          setState(644);
          match(TParser::TypeSpec);
          break;
        }

      default:
        throw NoViableAltException(this);
      }
    }
    setState(649);
    match(TParser::ARightLB);
    setState(650);
    lambdaFnCodeBlock();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- LambdaFnParamsContext ------------------------------------------------------------------

TParser::LambdaFnParamsContext::LambdaFnParamsContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::IdentifierContext* TParser::LambdaFnParamsContext::identifier() {
  return getRuleContext<TParser::IdentifierContext>(0);
}

tree::TerminalNode* TParser::LambdaFnParamsContext::TypeSpec() {
  return getToken(TParser::TypeSpec, 0);
}

std::vector<tree::TerminalNode *> TParser::LambdaFnParamsContext::Separator() {
  return getTokens(TParser::Separator);
}

tree::TerminalNode* TParser::LambdaFnParamsContext::Separator(size_t i) {
  return getToken(TParser::Separator, i);
}

std::vector<TParser::LambdaFnParamsContext *> TParser::LambdaFnParamsContext::lambdaFnParams() {
  return getRuleContexts<TParser::LambdaFnParamsContext>();
}

TParser::LambdaFnParamsContext* TParser::LambdaFnParamsContext::lambdaFnParams(size_t i) {
  return getRuleContext<TParser::LambdaFnParamsContext>(i);
}


size_t TParser::LambdaFnParamsContext::getRuleIndex() const {
  return TParser::RuleLambdaFnParams;
}

void TParser::LambdaFnParamsContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterLambdaFnParams(this);
}

void TParser::LambdaFnParamsContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitLambdaFnParams(this);
}


antlrcpp::Any TParser::LambdaFnParamsContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitLambdaFnParams(this);
  else
    return visitor->visitChildren(this);
}

TParser::LambdaFnParamsContext* TParser::lambdaFnParams() {
  LambdaFnParamsContext *_localctx = _tracker.createInstance<LambdaFnParamsContext>(_ctx, getState());
  enterRule(_localctx, 116, TParser::RuleLambdaFnParams);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    size_t alt;
    enterOuterAlt(_localctx, 1);
    setState(652);
    identifier();
    setState(654);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == TParser::TypeSpec) {
      setState(653);
      match(TParser::TypeSpec);
    }
    setState(660);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 74, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        setState(656);
        match(TParser::Separator);
        setState(657);
        lambdaFnParams(); 
      }
      setState(662);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 74, _ctx);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- LambdaFnCodeBlockContext ------------------------------------------------------------------

TParser::LambdaFnCodeBlockContext::LambdaFnCodeBlockContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::CodeBlockControlContext* TParser::LambdaFnCodeBlockContext::codeBlockControl() {
  return getRuleContext<TParser::CodeBlockControlContext>(0);
}

TParser::GeneralValueElementsContext* TParser::LambdaFnCodeBlockContext::generalValueElements() {
  return getRuleContext<TParser::GeneralValueElementsContext>(0);
}


size_t TParser::LambdaFnCodeBlockContext::getRuleIndex() const {
  return TParser::RuleLambdaFnCodeBlock;
}

void TParser::LambdaFnCodeBlockContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterLambdaFnCodeBlock(this);
}

void TParser::LambdaFnCodeBlockContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitLambdaFnCodeBlock(this);
}


antlrcpp::Any TParser::LambdaFnCodeBlockContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitLambdaFnCodeBlock(this);
  else
    return visitor->visitChildren(this);
}

TParser::LambdaFnCodeBlockContext* TParser::lambdaFnCodeBlock() {
  LambdaFnCodeBlockContext *_localctx = _tracker.createInstance<LambdaFnCodeBlockContext>(_ctx, getState());
  enterRule(_localctx, 118, TParser::RuleLambdaFnCodeBlock);

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
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 75, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(663);
      codeBlockControl();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(664);
      generalValueElements();
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

//----------------- BlockClassConstructorContext ------------------------------------------------------------------

TParser::BlockClassConstructorContext::BlockClassConstructorContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::IdentifierContext* TParser::BlockClassConstructorContext::identifier() {
  return getRuleContext<TParser::IdentifierContext>(0);
}

tree::TerminalNode* TParser::BlockClassConstructorContext::OpenOp() {
  return getToken(TParser::OpenOp, 0);
}

tree::TerminalNode* TParser::BlockClassConstructorContext::CloseOp() {
  return getToken(TParser::CloseOp, 0);
}

TParser::CodeBlockControlContext* TParser::BlockClassConstructorContext::codeBlockControl() {
  return getRuleContext<TParser::CodeBlockControlContext>(0);
}

TParser::FunctionParamContext* TParser::BlockClassConstructorContext::functionParam() {
  return getRuleContext<TParser::FunctionParamContext>(0);
}


size_t TParser::BlockClassConstructorContext::getRuleIndex() const {
  return TParser::RuleBlockClassConstructor;
}

void TParser::BlockClassConstructorContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterBlockClassConstructor(this);
}

void TParser::BlockClassConstructorContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitBlockClassConstructor(this);
}


antlrcpp::Any TParser::BlockClassConstructorContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitBlockClassConstructor(this);
  else
    return visitor->visitChildren(this);
}

TParser::BlockClassConstructorContext* TParser::blockClassConstructor() {
  BlockClassConstructorContext *_localctx = _tracker.createInstance<BlockClassConstructorContext>(_ctx, getState());
  enterRule(_localctx, 120, TParser::RuleBlockClassConstructor);
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
    setState(667);
    identifier();
    setState(668);
    match(TParser::OpenOp);
    setState(670);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == TParser::Identifier) {
      setState(669);
      functionParam();
    }
    setState(672);
    match(TParser::CloseOp);
    setState(673);
    codeBlockControl();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- BlockFunctionCallContext ------------------------------------------------------------------

TParser::BlockFunctionCallContext::BlockFunctionCallContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::IdentifierContext* TParser::BlockFunctionCallContext::identifier() {
  return getRuleContext<TParser::IdentifierContext>(0);
}

tree::TerminalNode* TParser::BlockFunctionCallContext::OpenOp() {
  return getToken(TParser::OpenOp, 0);
}

tree::TerminalNode* TParser::BlockFunctionCallContext::CloseOp() {
  return getToken(TParser::CloseOp, 0);
}

tree::TerminalNode* TParser::BlockFunctionCallContext::End() {
  return getToken(TParser::End, 0);
}

TParser::IdentifierBContext* TParser::BlockFunctionCallContext::identifierB() {
  return getRuleContext<TParser::IdentifierBContext>(0);
}

TParser::FunctionCallElementsContext* TParser::BlockFunctionCallContext::functionCallElements() {
  return getRuleContext<TParser::FunctionCallElementsContext>(0);
}

tree::TerminalNode* TParser::BlockFunctionCallContext::Point() {
  return getToken(TParser::Point, 0);
}

tree::TerminalNode* TParser::BlockFunctionCallContext::TwoTwoPoint() {
  return getToken(TParser::TwoTwoPoint, 0);
}


size_t TParser::BlockFunctionCallContext::getRuleIndex() const {
  return TParser::RuleBlockFunctionCall;
}

void TParser::BlockFunctionCallContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterBlockFunctionCall(this);
}

void TParser::BlockFunctionCallContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitBlockFunctionCall(this);
}


antlrcpp::Any TParser::BlockFunctionCallContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitBlockFunctionCall(this);
  else
    return visitor->visitChildren(this);
}

TParser::BlockFunctionCallContext* TParser::blockFunctionCall() {
  BlockFunctionCallContext *_localctx = _tracker.createInstance<BlockFunctionCallContext>(_ctx, getState());
  enterRule(_localctx, 122, TParser::RuleBlockFunctionCall);
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
    setState(675);
    identifier();
    setState(678);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == TParser::Point

    || _la == TParser::TwoTwoPoint) {
      setState(676);
      _la = _input->LA(1);
      if (!(_la == TParser::Point

      || _la == TParser::TwoTwoPoint)) {
      _errHandler->recoverInline(this);
      }
      else {
        _errHandler->reportMatch(this);
        consume();
      }
      setState(677);
      identifierB();
    }
    setState(680);
    match(TParser::OpenOp);
    setState(682);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if ((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << TParser::Function)
      | (1ULL << TParser::Class)
      | (1ULL << TParser::OpenArIndex)
      | (1ULL << TParser::OpenBlock)
      | (1ULL << TParser::OpenOp)
      | (1ULL << TParser::Not)
      | (1ULL << TParser::IncDecOperators)
      | (1ULL << TParser::Identifier)
      | (1ULL << TParser::Integer)
      | (1ULL << TParser::Float)
      | (1ULL << TParser::String))) != 0)) {
      setState(681);
      functionCallElements();
    }
    setState(684);
    match(TParser::CloseOp);
    setState(685);
    match(TParser::End);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- FunctionCallElementsContext ------------------------------------------------------------------

TParser::FunctionCallElementsContext::FunctionCallElementsContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::GeneralValueElementsContext* TParser::FunctionCallElementsContext::generalValueElements() {
  return getRuleContext<TParser::GeneralValueElementsContext>(0);
}

std::vector<tree::TerminalNode *> TParser::FunctionCallElementsContext::Separator() {
  return getTokens(TParser::Separator);
}

tree::TerminalNode* TParser::FunctionCallElementsContext::Separator(size_t i) {
  return getToken(TParser::Separator, i);
}

std::vector<TParser::FunctionCallElementsContext *> TParser::FunctionCallElementsContext::functionCallElements() {
  return getRuleContexts<TParser::FunctionCallElementsContext>();
}

TParser::FunctionCallElementsContext* TParser::FunctionCallElementsContext::functionCallElements(size_t i) {
  return getRuleContext<TParser::FunctionCallElementsContext>(i);
}


size_t TParser::FunctionCallElementsContext::getRuleIndex() const {
  return TParser::RuleFunctionCallElements;
}

void TParser::FunctionCallElementsContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterFunctionCallElements(this);
}

void TParser::FunctionCallElementsContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitFunctionCallElements(this);
}


antlrcpp::Any TParser::FunctionCallElementsContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitFunctionCallElements(this);
  else
    return visitor->visitChildren(this);
}

TParser::FunctionCallElementsContext* TParser::functionCallElements() {
  FunctionCallElementsContext *_localctx = _tracker.createInstance<FunctionCallElementsContext>(_ctx, getState());
  enterRule(_localctx, 124, TParser::RuleFunctionCallElements);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    size_t alt;
    enterOuterAlt(_localctx, 1);
    setState(687);
    generalValueElements();
    setState(692);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 79, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        setState(688);
        match(TParser::Separator);
        setState(689);
        functionCallElements(); 
      }
      setState(694);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 79, _ctx);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- BlockAttributionContext ------------------------------------------------------------------

TParser::BlockAttributionContext::BlockAttributionContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::AttributionElementsContext* TParser::BlockAttributionContext::attributionElements() {
  return getRuleContext<TParser::AttributionElementsContext>(0);
}

tree::TerminalNode* TParser::BlockAttributionContext::End() {
  return getToken(TParser::End, 0);
}


size_t TParser::BlockAttributionContext::getRuleIndex() const {
  return TParser::RuleBlockAttribution;
}

void TParser::BlockAttributionContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterBlockAttribution(this);
}

void TParser::BlockAttributionContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitBlockAttribution(this);
}


antlrcpp::Any TParser::BlockAttributionContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitBlockAttribution(this);
  else
    return visitor->visitChildren(this);
}

TParser::BlockAttributionContext* TParser::blockAttribution() {
  BlockAttributionContext *_localctx = _tracker.createInstance<BlockAttributionContext>(_ctx, getState());
  enterRule(_localctx, 126, TParser::RuleBlockAttribution);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(695);
    attributionElements();
    setState(696);
    match(TParser::End);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- AttributionElementsContext ------------------------------------------------------------------

TParser::AttributionElementsContext::AttributionElementsContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::IdentifierContext* TParser::AttributionElementsContext::identifier() {
  return getRuleContext<TParser::IdentifierContext>(0);
}

TParser::GeneralValueElementsContext* TParser::AttributionElementsContext::generalValueElements() {
  return getRuleContext<TParser::GeneralValueElementsContext>(0);
}

tree::TerminalNode* TParser::AttributionElementsContext::Attr() {
  return getToken(TParser::Attr, 0);
}

tree::TerminalNode* TParser::AttributionElementsContext::AssignmentOperator() {
  return getToken(TParser::AssignmentOperator, 0);
}

TParser::IdentifierBContext* TParser::AttributionElementsContext::identifierB() {
  return getRuleContext<TParser::IdentifierBContext>(0);
}

std::vector<tree::TerminalNode *> TParser::AttributionElementsContext::Separator() {
  return getTokens(TParser::Separator);
}

tree::TerminalNode* TParser::AttributionElementsContext::Separator(size_t i) {
  return getToken(TParser::Separator, i);
}

std::vector<TParser::AttributionElementsContext *> TParser::AttributionElementsContext::attributionElements() {
  return getRuleContexts<TParser::AttributionElementsContext>();
}

TParser::AttributionElementsContext* TParser::AttributionElementsContext::attributionElements(size_t i) {
  return getRuleContext<TParser::AttributionElementsContext>(i);
}

tree::TerminalNode* TParser::AttributionElementsContext::Point() {
  return getToken(TParser::Point, 0);
}

tree::TerminalNode* TParser::AttributionElementsContext::TwoTwoPoint() {
  return getToken(TParser::TwoTwoPoint, 0);
}

tree::TerminalNode* TParser::AttributionElementsContext::New() {
  return getToken(TParser::New, 0);
}

tree::TerminalNode* TParser::AttributionElementsContext::Await() {
  return getToken(TParser::Await, 0);
}


size_t TParser::AttributionElementsContext::getRuleIndex() const {
  return TParser::RuleAttributionElements;
}

void TParser::AttributionElementsContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterAttributionElements(this);
}

void TParser::AttributionElementsContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitAttributionElements(this);
}


antlrcpp::Any TParser::AttributionElementsContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitAttributionElements(this);
  else
    return visitor->visitChildren(this);
}

TParser::AttributionElementsContext* TParser::attributionElements() {
  AttributionElementsContext *_localctx = _tracker.createInstance<AttributionElementsContext>(_ctx, getState());
  enterRule(_localctx, 128, TParser::RuleAttributionElements);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    size_t alt;
    enterOuterAlt(_localctx, 1);
    setState(698);
    identifier();
    setState(701);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == TParser::Point

    || _la == TParser::TwoTwoPoint) {
      setState(699);
      _la = _input->LA(1);
      if (!(_la == TParser::Point

      || _la == TParser::TwoTwoPoint)) {
      _errHandler->recoverInline(this);
      }
      else {
        _errHandler->reportMatch(this);
        consume();
      }
      setState(700);
      identifierB();
    }
    setState(703);
    _la = _input->LA(1);
    if (!(_la == TParser::Attr

    || _la == TParser::AssignmentOperator)) {
    _errHandler->recoverInline(this);
    }
    else {
      _errHandler->reportMatch(this);
      consume();
    }
    setState(705);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == TParser::New

    || _la == TParser::Await) {
      setState(704);
      _la = _input->LA(1);
      if (!(_la == TParser::New

      || _la == TParser::Await)) {
      _errHandler->recoverInline(this);
      }
      else {
        _errHandler->reportMatch(this);
        consume();
      }
    }
    setState(707);
    generalValueElements();
    setState(712);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 82, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        setState(708);
        match(TParser::Separator);
        setState(709);
        attributionElements(); 
      }
      setState(714);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 82, _ctx);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- BlockMultipleAssignmentsContext ------------------------------------------------------------------

TParser::BlockMultipleAssignmentsContext::BlockMultipleAssignmentsContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::VariableMultipleAssignmentsModesContext* TParser::BlockMultipleAssignmentsContext::variableMultipleAssignmentsModes() {
  return getRuleContext<TParser::VariableMultipleAssignmentsModesContext>(0);
}

tree::TerminalNode* TParser::BlockMultipleAssignmentsContext::Attr() {
  return getToken(TParser::Attr, 0);
}

TParser::GeneralValueElementsContext* TParser::BlockMultipleAssignmentsContext::generalValueElements() {
  return getRuleContext<TParser::GeneralValueElementsContext>(0);
}

tree::TerminalNode* TParser::BlockMultipleAssignmentsContext::End() {
  return getToken(TParser::End, 0);
}


size_t TParser::BlockMultipleAssignmentsContext::getRuleIndex() const {
  return TParser::RuleBlockMultipleAssignments;
}

void TParser::BlockMultipleAssignmentsContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterBlockMultipleAssignments(this);
}

void TParser::BlockMultipleAssignmentsContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitBlockMultipleAssignments(this);
}


antlrcpp::Any TParser::BlockMultipleAssignmentsContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitBlockMultipleAssignments(this);
  else
    return visitor->visitChildren(this);
}

TParser::BlockMultipleAssignmentsContext* TParser::blockMultipleAssignments() {
  BlockMultipleAssignmentsContext *_localctx = _tracker.createInstance<BlockMultipleAssignmentsContext>(_ctx, getState());
  enterRule(_localctx, 130, TParser::RuleBlockMultipleAssignments);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(715);
    variableMultipleAssignmentsModes();
    setState(716);
    match(TParser::Attr);
    setState(717);
    generalValueElements();
    setState(718);
    match(TParser::End);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- VariableMultipleAssignmentsModesContext ------------------------------------------------------------------

TParser::VariableMultipleAssignmentsModesContext::VariableMultipleAssignmentsModesContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::GeneralValueContext* TParser::VariableMultipleAssignmentsModesContext::generalValue() {
  return getRuleContext<TParser::GeneralValueContext>(0);
}

std::vector<tree::TerminalNode *> TParser::VariableMultipleAssignmentsModesContext::Attr() {
  return getTokens(TParser::Attr);
}

tree::TerminalNode* TParser::VariableMultipleAssignmentsModesContext::Attr(size_t i) {
  return getToken(TParser::Attr, i);
}

std::vector<TParser::VariableMultipleAssignmentsModesContext *> TParser::VariableMultipleAssignmentsModesContext::variableMultipleAssignmentsModes() {
  return getRuleContexts<TParser::VariableMultipleAssignmentsModesContext>();
}

TParser::VariableMultipleAssignmentsModesContext* TParser::VariableMultipleAssignmentsModesContext::variableMultipleAssignmentsModes(size_t i) {
  return getRuleContext<TParser::VariableMultipleAssignmentsModesContext>(i);
}


size_t TParser::VariableMultipleAssignmentsModesContext::getRuleIndex() const {
  return TParser::RuleVariableMultipleAssignmentsModes;
}

void TParser::VariableMultipleAssignmentsModesContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterVariableMultipleAssignmentsModes(this);
}

void TParser::VariableMultipleAssignmentsModesContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitVariableMultipleAssignmentsModes(this);
}


antlrcpp::Any TParser::VariableMultipleAssignmentsModesContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitVariableMultipleAssignmentsModes(this);
  else
    return visitor->visitChildren(this);
}

TParser::VariableMultipleAssignmentsModesContext* TParser::variableMultipleAssignmentsModes() {
  VariableMultipleAssignmentsModesContext *_localctx = _tracker.createInstance<VariableMultipleAssignmentsModesContext>(_ctx, getState());
  enterRule(_localctx, 132, TParser::RuleVariableMultipleAssignmentsModes);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    size_t alt;
    enterOuterAlt(_localctx, 1);
    setState(720);
    generalValue();
    setState(725);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 83, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        setState(721);
        match(TParser::Attr);
        setState(722);
        variableMultipleAssignmentsModes(); 
      }
      setState(727);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 83, _ctx);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- BlockAccessArrayElementsContext ------------------------------------------------------------------

TParser::BlockAccessArrayElementsContext::BlockAccessArrayElementsContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::ArrayAccessElementsContext* TParser::BlockAccessArrayElementsContext::arrayAccessElements() {
  return getRuleContext<TParser::ArrayAccessElementsContext>(0);
}


size_t TParser::BlockAccessArrayElementsContext::getRuleIndex() const {
  return TParser::RuleBlockAccessArrayElements;
}

void TParser::BlockAccessArrayElementsContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterBlockAccessArrayElements(this);
}

void TParser::BlockAccessArrayElementsContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitBlockAccessArrayElements(this);
}


antlrcpp::Any TParser::BlockAccessArrayElementsContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitBlockAccessArrayElements(this);
  else
    return visitor->visitChildren(this);
}

TParser::BlockAccessArrayElementsContext* TParser::blockAccessArrayElements() {
  BlockAccessArrayElementsContext *_localctx = _tracker.createInstance<BlockAccessArrayElementsContext>(_ctx, getState());
  enterRule(_localctx, 134, TParser::RuleBlockAccessArrayElements);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(728);
    arrayAccessElements();
   
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

std::vector<TParser::ArrayAccessElementsContext *> TParser::ArrayAccessElementsContext::arrayAccessElements() {
  return getRuleContexts<TParser::ArrayAccessElementsContext>();
}

TParser::ArrayAccessElementsContext* TParser::ArrayAccessElementsContext::arrayAccessElements(size_t i) {
  return getRuleContext<TParser::ArrayAccessElementsContext>(i);
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
  enterRule(_localctx, 136, TParser::RuleArrayAccessElements);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    size_t alt;
    enterOuterAlt(_localctx, 1);
    setState(730);
    arrayAccessElementsItems();
    setState(734);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 84, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        setState(731);
        arrayAccessElements(); 
      }
      setState(736);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 84, _ctx);
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

TParser::IdentifierContext* TParser::ArrayAccessElementsItemsContext::identifier() {
  return getRuleContext<TParser::IdentifierContext>(0);
}

TParser::AccessBlockArContext* TParser::ArrayAccessElementsItemsContext::accessBlockAr() {
  return getRuleContext<TParser::AccessBlockArContext>(0);
}

tree::TerminalNode* TParser::ArrayAccessElementsItemsContext::Point() {
  return getToken(TParser::Point, 0);
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
  enterRule(_localctx, 138, TParser::RuleArrayAccessElementsItems);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(764);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 93, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(737);
      identifier();
      setState(739);
      _errHandler->sync(this);

      switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 85, _ctx)) {
      case 1: {
        setState(738);
        accessBlockAr();
        break;
      }

      default:
        break;
      }
      setState(742);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == TParser::Point) {
        setState(741);
        match(TParser::Point);
      }
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(745);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == TParser::IncDecOperators) {
        setState(744);
        firstIncDec();
      }
      setState(747);
      identifier();
      setState(749);
      _errHandler->sync(this);

      switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 88, _ctx)) {
      case 1: {
        setState(748);
        accessBlockAr();
        break;
      }

      default:
        break;
      }
      setState(752);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == TParser::Point) {
        setState(751);
        match(TParser::Point);
      }
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(754);
      identifier();
      setState(756);
      _errHandler->sync(this);

      switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 90, _ctx)) {
      case 1: {
        setState(755);
        accessBlockAr();
        break;
      }

      default:
        break;
      }
      setState(759);
      _errHandler->sync(this);

      switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 91, _ctx)) {
      case 1: {
        setState(758);
        lastIncDec();
        break;
      }

      default:
        break;
      }
      setState(762);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == TParser::Point) {
        setState(761);
        match(TParser::Point);
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

std::vector<TParser::AccessBlockArContext *> TParser::AccessBlockArContext::accessBlockAr() {
  return getRuleContexts<TParser::AccessBlockArContext>();
}

TParser::AccessBlockArContext* TParser::AccessBlockArContext::accessBlockAr(size_t i) {
  return getRuleContext<TParser::AccessBlockArContext>(i);
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
  enterRule(_localctx, 140, TParser::RuleAccessBlockAr);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    size_t alt;
    enterOuterAlt(_localctx, 1);
    setState(766);
    match(TParser::OpenArIndex);
    setState(767);
    arrayIndexAccess();
    setState(768);
    match(TParser::CloseArIndex);
    setState(772);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 94, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        setState(769);
        accessBlockAr(); 
      }
      setState(774);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 94, _ctx);
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

TParser::GeneralValueElementsContext* TParser::ArrayIndexAccessContext::generalValueElements() {
  return getRuleContext<TParser::GeneralValueElementsContext>(0);
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
  enterRule(_localctx, 142, TParser::RuleArrayIndexAccess);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(775);
    generalValueElements();
   
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
  enterRule(_localctx, 144, TParser::RuleFirstIncDec);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(777);
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
  enterRule(_localctx, 146, TParser::RuleLastIncDec);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(779);
    match(TParser::IncDecOperators);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- BlockPermissionTokensContext ------------------------------------------------------------------

TParser::BlockPermissionTokensContext::BlockPermissionTokensContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::BlockPermissionTokensContext::Pub() {
  return getToken(TParser::Pub, 0);
}

tree::TerminalNode* TParser::BlockPermissionTokensContext::Pro() {
  return getToken(TParser::Pro, 0);
}

tree::TerminalNode* TParser::BlockPermissionTokensContext::Priv() {
  return getToken(TParser::Priv, 0);
}

tree::TerminalNode* TParser::BlockPermissionTokensContext::Static() {
  return getToken(TParser::Static, 0);
}

tree::TerminalNode* TParser::BlockPermissionTokensContext::Final() {
  return getToken(TParser::Final, 0);
}

tree::TerminalNode* TParser::BlockPermissionTokensContext::Async() {
  return getToken(TParser::Async, 0);
}


size_t TParser::BlockPermissionTokensContext::getRuleIndex() const {
  return TParser::RuleBlockPermissionTokens;
}

void TParser::BlockPermissionTokensContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterBlockPermissionTokens(this);
}

void TParser::BlockPermissionTokensContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitBlockPermissionTokens(this);
}


antlrcpp::Any TParser::BlockPermissionTokensContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitBlockPermissionTokens(this);
  else
    return visitor->visitChildren(this);
}

TParser::BlockPermissionTokensContext* TParser::blockPermissionTokens() {
  BlockPermissionTokensContext *_localctx = _tracker.createInstance<BlockPermissionTokensContext>(_ctx, getState());
  enterRule(_localctx, 148, TParser::RuleBlockPermissionTokens);
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
    setState(781);
    _la = _input->LA(1);
    if (!((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << TParser::Pub)
      | (1ULL << TParser::Pro)
      | (1ULL << TParser::Priv)
      | (1ULL << TParser::Static)
      | (1ULL << TParser::Final)
      | (1ULL << TParser::Async))) != 0))) {
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

//----------------- CodeBlockFlowControlContext ------------------------------------------------------------------

TParser::CodeBlockFlowControlContext::CodeBlockFlowControlContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::CodeBlockFlowControlContext::OpenBlock() {
  return getToken(TParser::OpenBlock, 0);
}

tree::TerminalNode* TParser::CodeBlockFlowControlContext::CloseBlock() {
  return getToken(TParser::CloseBlock, 0);
}

TParser::SentencesContext* TParser::CodeBlockFlowControlContext::sentences() {
  return getRuleContext<TParser::SentencesContext>(0);
}

TParser::CodeBlockFlowControlElementsContext* TParser::CodeBlockFlowControlContext::codeBlockFlowControlElements() {
  return getRuleContext<TParser::CodeBlockFlowControlElementsContext>(0);
}


size_t TParser::CodeBlockFlowControlContext::getRuleIndex() const {
  return TParser::RuleCodeBlockFlowControl;
}

void TParser::CodeBlockFlowControlContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterCodeBlockFlowControl(this);
}

void TParser::CodeBlockFlowControlContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitCodeBlockFlowControl(this);
}


antlrcpp::Any TParser::CodeBlockFlowControlContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitCodeBlockFlowControl(this);
  else
    return visitor->visitChildren(this);
}

TParser::CodeBlockFlowControlContext* TParser::codeBlockFlowControl() {
  CodeBlockFlowControlContext *_localctx = _tracker.createInstance<CodeBlockFlowControlContext>(_ctx, getState());
  enterRule(_localctx, 150, TParser::RuleCodeBlockFlowControl);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(790);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 95, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(783);
      match(TParser::OpenBlock);
      setState(784);
      match(TParser::CloseBlock);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(785);
      match(TParser::OpenBlock);
      setState(786);
      sentences();
      setState(787);
      match(TParser::CloseBlock);
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(789);
      codeBlockFlowControlElements();
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

//----------------- CodeBlockFlowControlElementsContext ------------------------------------------------------------------

TParser::CodeBlockFlowControlElementsContext::CodeBlockFlowControlElementsContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::FunctionCallContext* TParser::CodeBlockFlowControlElementsContext::functionCall() {
  return getRuleContext<TParser::FunctionCallContext>(0);
}

tree::TerminalNode* TParser::CodeBlockFlowControlElementsContext::End() {
  return getToken(TParser::End, 0);
}

TParser::BlockRetContext* TParser::CodeBlockFlowControlElementsContext::blockRet() {
  return getRuleContext<TParser::BlockRetContext>(0);
}

TParser::BlockConditionalContext* TParser::CodeBlockFlowControlElementsContext::blockConditional() {
  return getRuleContext<TParser::BlockConditionalContext>(0);
}

TParser::BlockLoopContext* TParser::CodeBlockFlowControlElementsContext::blockLoop() {
  return getRuleContext<TParser::BlockLoopContext>(0);
}

TParser::BlockTryCatchContext* TParser::CodeBlockFlowControlElementsContext::blockTryCatch() {
  return getRuleContext<TParser::BlockTryCatchContext>(0);
}

TParser::BlockBreakContext* TParser::CodeBlockFlowControlElementsContext::blockBreak() {
  return getRuleContext<TParser::BlockBreakContext>(0);
}

TParser::BlockNextContext* TParser::CodeBlockFlowControlElementsContext::blockNext() {
  return getRuleContext<TParser::BlockNextContext>(0);
}


size_t TParser::CodeBlockFlowControlElementsContext::getRuleIndex() const {
  return TParser::RuleCodeBlockFlowControlElements;
}

void TParser::CodeBlockFlowControlElementsContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterCodeBlockFlowControlElements(this);
}

void TParser::CodeBlockFlowControlElementsContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitCodeBlockFlowControlElements(this);
}


antlrcpp::Any TParser::CodeBlockFlowControlElementsContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitCodeBlockFlowControlElements(this);
  else
    return visitor->visitChildren(this);
}

TParser::CodeBlockFlowControlElementsContext* TParser::codeBlockFlowControlElements() {
  CodeBlockFlowControlElementsContext *_localctx = _tracker.createInstance<CodeBlockFlowControlElementsContext>(_ctx, getState());
  enterRule(_localctx, 152, TParser::RuleCodeBlockFlowControlElements);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(801);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case TParser::Identifier: {
        enterOuterAlt(_localctx, 1);
        setState(792);
        functionCall();
        setState(793);
        match(TParser::End);
        break;
      }

      case TParser::Ret: {
        enterOuterAlt(_localctx, 2);
        setState(795);
        blockRet();
        break;
      }

      case TParser::If: {
        enterOuterAlt(_localctx, 3);
        setState(796);
        blockConditional();
        break;
      }

      case TParser::For: {
        enterOuterAlt(_localctx, 4);
        setState(797);
        blockLoop();
        break;
      }

      case TParser::Try: {
        enterOuterAlt(_localctx, 5);
        setState(798);
        blockTryCatch();
        break;
      }

      case TParser::Break: {
        enterOuterAlt(_localctx, 6);
        setState(799);
        blockBreak();
        break;
      }

      case TParser::Next: {
        enterOuterAlt(_localctx, 7);
        setState(800);
        blockNext();
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

//----------------- CodeBlockControlContext ------------------------------------------------------------------

TParser::CodeBlockControlContext::CodeBlockControlContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::CodeBlockControlContext::OpenBlock() {
  return getToken(TParser::OpenBlock, 0);
}

tree::TerminalNode* TParser::CodeBlockControlContext::CloseBlock() {
  return getToken(TParser::CloseBlock, 0);
}

TParser::SentencesContext* TParser::CodeBlockControlContext::sentences() {
  return getRuleContext<TParser::SentencesContext>(0);
}


size_t TParser::CodeBlockControlContext::getRuleIndex() const {
  return TParser::RuleCodeBlockControl;
}

void TParser::CodeBlockControlContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterCodeBlockControl(this);
}

void TParser::CodeBlockControlContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitCodeBlockControl(this);
}


antlrcpp::Any TParser::CodeBlockControlContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitCodeBlockControl(this);
  else
    return visitor->visitChildren(this);
}

TParser::CodeBlockControlContext* TParser::codeBlockControl() {
  CodeBlockControlContext *_localctx = _tracker.createInstance<CodeBlockControlContext>(_ctx, getState());
  enterRule(_localctx, 154, TParser::RuleCodeBlockControl);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(809);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 97, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(803);
      match(TParser::OpenBlock);
      setState(804);
      match(TParser::CloseBlock);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(805);
      match(TParser::OpenBlock);
      setState(806);
      sentences();
      setState(807);
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

//----------------- GeneralValueContext ------------------------------------------------------------------

TParser::GeneralValueContext::GeneralValueContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::IdentifierContext* TParser::GeneralValueContext::identifier() {
  return getRuleContext<TParser::IdentifierContext>(0);
}

TParser::IdentifierBContext* TParser::GeneralValueContext::identifierB() {
  return getRuleContext<TParser::IdentifierBContext>(0);
}

tree::TerminalNode* TParser::GeneralValueContext::Point() {
  return getToken(TParser::Point, 0);
}

tree::TerminalNode* TParser::GeneralValueContext::TwoTwoPoint() {
  return getToken(TParser::TwoTwoPoint, 0);
}

tree::TerminalNode* TParser::GeneralValueContext::Not() {
  return getToken(TParser::Not, 0);
}

tree::TerminalNode* TParser::GeneralValueContext::TypeSpec() {
  return getToken(TParser::TypeSpec, 0);
}

tree::TerminalNode* TParser::GeneralValueContext::ArithmeticOperator() {
  return getToken(TParser::ArithmeticOperator, 0);
}

tree::TerminalNode* TParser::GeneralValueContext::AssignmentOperator() {
  return getToken(TParser::AssignmentOperator, 0);
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

TParser::IncDecOperatorsAContext* TParser::GeneralValueContext::incDecOperatorsA() {
  return getRuleContext<TParser::IncDecOperatorsAContext>(0);
}

TParser::IncDecOperatorsBContext* TParser::GeneralValueContext::incDecOperatorsB() {
  return getRuleContext<TParser::IncDecOperatorsBContext>(0);
}

TParser::FunctionCallContext* TParser::GeneralValueContext::functionCall() {
  return getRuleContext<TParser::FunctionCallContext>(0);
}

tree::TerminalNode* TParser::GeneralValueContext::OpenOp() {
  return getToken(TParser::OpenOp, 0);
}

TParser::BlockFunctionContext* TParser::GeneralValueContext::blockFunction() {
  return getRuleContext<TParser::BlockFunctionContext>(0);
}

tree::TerminalNode* TParser::GeneralValueContext::CloseOp() {
  return getToken(TParser::CloseOp, 0);
}

TParser::BlockArrayContext* TParser::GeneralValueContext::blockArray() {
  return getRuleContext<TParser::BlockArrayContext>(0);
}

TParser::BlockFunctionDeclarationAttrContext* TParser::GeneralValueContext::blockFunctionDeclarationAttr() {
  return getRuleContext<TParser::BlockFunctionDeclarationAttrContext>(0);
}

TParser::BlockClassDeclarationAttrContext* TParser::GeneralValueContext::blockClassDeclarationAttr() {
  return getRuleContext<TParser::BlockClassDeclarationAttrContext>(0);
}

TParser::BlockLambdaFunctionsContext* TParser::GeneralValueContext::blockLambdaFunctions() {
  return getRuleContext<TParser::BlockLambdaFunctionsContext>(0);
}

TParser::BlockAccessArrayElementsContext* TParser::GeneralValueContext::blockAccessArrayElements() {
  return getRuleContext<TParser::BlockAccessArrayElementsContext>(0);
}

tree::TerminalNode* TParser::GeneralValueContext::OpenBlock() {
  return getToken(TParser::OpenBlock, 0);
}

tree::TerminalNode* TParser::GeneralValueContext::CloseBlock() {
  return getToken(TParser::CloseBlock, 0);
}

tree::TerminalNode* TParser::GeneralValueContext::OpenArIndex() {
  return getToken(TParser::OpenArIndex, 0);
}

tree::TerminalNode* TParser::GeneralValueContext::CloseArIndex() {
  return getToken(TParser::CloseArIndex, 0);
}

TParser::GeneralValueBlockContext* TParser::GeneralValueContext::generalValueBlock() {
  return getRuleContext<TParser::GeneralValueBlockContext>(0);
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
  enterRule(_localctx, 156, TParser::RuleGeneralValue);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(956);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 140, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(812);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == TParser::Not) {
        setState(811);
        match(TParser::Not);
      }
      setState(814);
      identifier();
      setState(815);
      _la = _input->LA(1);
      if (!(_la == TParser::Point

      || _la == TParser::TwoTwoPoint)) {
      _errHandler->recoverInline(this);
      }
      else {
        _errHandler->reportMatch(this);
        consume();
      }
      setState(816);
      identifierB();
      setState(818);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == TParser::TypeSpec) {
        setState(817);
        match(TParser::TypeSpec);
      }
      setState(821);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == TParser::ArithmeticOperator) {
        setState(820);
        match(TParser::ArithmeticOperator);
      }
      setState(824);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == TParser::AssignmentOperator) {
        setState(823);
        match(TParser::AssignmentOperator);
      }
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(884);
      _errHandler->sync(this);
      switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 120, _ctx)) {
      case 1: {
        setState(827);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::Not) {
          setState(826);
          match(TParser::Not);
        }
        setState(830);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::IncDecOperators) {
          setState(829);
          incDecOperatorsA();
        }
        setState(832);
        identifier();
        setState(834);
        _errHandler->sync(this);

        switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 104, _ctx)) {
        case 1: {
          setState(833);
          incDecOperatorsB();
          break;
        }

        default:
          break;
        }
        setState(837);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::TypeSpec) {
          setState(836);
          match(TParser::TypeSpec);
        }
        setState(840);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::ArithmeticOperator) {
          setState(839);
          match(TParser::ArithmeticOperator);
        }
        setState(843);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::AssignmentOperator) {
          setState(842);
          match(TParser::AssignmentOperator);
        }
        break;
      }

      case 2: {
        setState(846);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::Not) {
          setState(845);
          match(TParser::Not);
        }
        setState(848);
        match(TParser::Integer);
        setState(850);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::TypeSpec) {
          setState(849);
          match(TParser::TypeSpec);
        }
        setState(853);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::ArithmeticOperator) {
          setState(852);
          match(TParser::ArithmeticOperator);
        }
        setState(856);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::AssignmentOperator) {
          setState(855);
          match(TParser::AssignmentOperator);
        }
        break;
      }

      case 3: {
        setState(859);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::Not) {
          setState(858);
          match(TParser::Not);
        }
        setState(861);
        match(TParser::Float);
        setState(863);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::TypeSpec) {
          setState(862);
          match(TParser::TypeSpec);
        }
        setState(866);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::ArithmeticOperator) {
          setState(865);
          match(TParser::ArithmeticOperator);
        }
        setState(869);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::AssignmentOperator) {
          setState(868);
          match(TParser::AssignmentOperator);
        }
        break;
      }

      case 4: {
        setState(872);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::Not) {
          setState(871);
          match(TParser::Not);
        }
        setState(874);
        match(TParser::String);
        setState(876);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::TypeSpec) {
          setState(875);
          match(TParser::TypeSpec);
        }
        setState(879);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::ArithmeticOperator) {
          setState(878);
          match(TParser::ArithmeticOperator);
        }
        setState(882);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::AssignmentOperator) {
          setState(881);
          match(TParser::AssignmentOperator);
        }
        break;
      }

      default:
        break;
      }
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(887);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == TParser::Not) {
        setState(886);
        match(TParser::Not);
      }
      setState(889);
      functionCall();
      setState(891);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == TParser::TypeSpec) {
        setState(890);
        match(TParser::TypeSpec);
      }
      setState(894);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == TParser::ArithmeticOperator) {
        setState(893);
        match(TParser::ArithmeticOperator);
      }
      setState(897);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == TParser::AssignmentOperator) {
        setState(896);
        match(TParser::AssignmentOperator);
      }
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(900);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == TParser::Not) {
        setState(899);
        match(TParser::Not);
      }
      setState(902);
      match(TParser::OpenOp);
      setState(903);
      blockFunction();
      setState(904);
      match(TParser::CloseOp);
      setState(906);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == TParser::TypeSpec) {
        setState(905);
        match(TParser::TypeSpec);
      }
      setState(909);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == TParser::ArithmeticOperator) {
        setState(908);
        match(TParser::ArithmeticOperator);
      }
      setState(912);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == TParser::AssignmentOperator) {
        setState(911);
        match(TParser::AssignmentOperator);
      }
      break;
    }

    case 5: {
      enterOuterAlt(_localctx, 5);
      setState(915);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == TParser::Not) {
        setState(914);
        match(TParser::Not);
      }
      setState(918);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == TParser::IncDecOperators) {
        setState(917);
        incDecOperatorsA();
      }
      setState(920);
      blockArray();
      setState(922);
      _errHandler->sync(this);

      switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 131, _ctx)) {
      case 1: {
        setState(921);
        incDecOperatorsB();
        break;
      }

      default:
        break;
      }
      setState(925);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == TParser::TypeSpec) {
        setState(924);
        match(TParser::TypeSpec);
      }
      setState(928);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == TParser::ArithmeticOperator) {
        setState(927);
        match(TParser::ArithmeticOperator);
      }
      setState(931);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == TParser::AssignmentOperator) {
        setState(930);
        match(TParser::AssignmentOperator);
      }
      break;
    }

    case 6: {
      enterOuterAlt(_localctx, 6);
      setState(933);
      blockFunctionDeclarationAttr();
      break;
    }

    case 7: {
      enterOuterAlt(_localctx, 7);
      setState(934);
      blockClassDeclarationAttr();
      break;
    }

    case 8: {
      enterOuterAlt(_localctx, 8);
      setState(935);
      blockLambdaFunctions();
      break;
    }

    case 9: {
      enterOuterAlt(_localctx, 9);
      setState(936);
      blockAccessArrayElements();
      break;
    }

    case 10: {
      enterOuterAlt(_localctx, 10);
      setState(941);
      _errHandler->sync(this);
      switch (_input->LA(1)) {
        case TParser::OpenBlock: {
          setState(937);
          match(TParser::OpenBlock);
          setState(938);
          match(TParser::CloseBlock);
          break;
        }

        case TParser::OpenArIndex: {
          setState(939);
          match(TParser::OpenArIndex);
          setState(940);
          match(TParser::CloseArIndex);
          break;
        }

      default:
        throw NoViableAltException(this);
      }
      break;
    }

    case 11: {
      enterOuterAlt(_localctx, 11);
      setState(944);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == TParser::Not) {
        setState(943);
        match(TParser::Not);
      }
      setState(946);
      generalValueBlock();
      setState(948);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == TParser::TypeSpec) {
        setState(947);
        match(TParser::TypeSpec);
      }
      setState(951);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == TParser::ArithmeticOperator) {
        setState(950);
        match(TParser::ArithmeticOperator);
      }
      setState(954);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == TParser::AssignmentOperator) {
        setState(953);
        match(TParser::AssignmentOperator);
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

//----------------- GeneralValueBlockContext ------------------------------------------------------------------

TParser::GeneralValueBlockContext::GeneralValueBlockContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::GeneralValueBlockContext::OpenOp() {
  return getToken(TParser::OpenOp, 0);
}

TParser::GeneralValueItemsContext* TParser::GeneralValueBlockContext::generalValueItems() {
  return getRuleContext<TParser::GeneralValueItemsContext>(0);
}

tree::TerminalNode* TParser::GeneralValueBlockContext::CloseOp() {
  return getToken(TParser::CloseOp, 0);
}


size_t TParser::GeneralValueBlockContext::getRuleIndex() const {
  return TParser::RuleGeneralValueBlock;
}

void TParser::GeneralValueBlockContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterGeneralValueBlock(this);
}

void TParser::GeneralValueBlockContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitGeneralValueBlock(this);
}


antlrcpp::Any TParser::GeneralValueBlockContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitGeneralValueBlock(this);
  else
    return visitor->visitChildren(this);
}

TParser::GeneralValueBlockContext* TParser::generalValueBlock() {
  GeneralValueBlockContext *_localctx = _tracker.createInstance<GeneralValueBlockContext>(_ctx, getState());
  enterRule(_localctx, 158, TParser::RuleGeneralValueBlock);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(958);
    match(TParser::OpenOp);
    setState(959);
    generalValueItems();
    setState(960);
    match(TParser::CloseOp);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- GeneralValueItemsContext ------------------------------------------------------------------

TParser::GeneralValueItemsContext::GeneralValueItemsContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::GeneralValueContext* TParser::GeneralValueItemsContext::generalValue() {
  return getRuleContext<TParser::GeneralValueContext>(0);
}

std::vector<TParser::GeneralValueItemsContext *> TParser::GeneralValueItemsContext::generalValueItems() {
  return getRuleContexts<TParser::GeneralValueItemsContext>();
}

TParser::GeneralValueItemsContext* TParser::GeneralValueItemsContext::generalValueItems(size_t i) {
  return getRuleContext<TParser::GeneralValueItemsContext>(i);
}


size_t TParser::GeneralValueItemsContext::getRuleIndex() const {
  return TParser::RuleGeneralValueItems;
}

void TParser::GeneralValueItemsContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterGeneralValueItems(this);
}

void TParser::GeneralValueItemsContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitGeneralValueItems(this);
}


antlrcpp::Any TParser::GeneralValueItemsContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitGeneralValueItems(this);
  else
    return visitor->visitChildren(this);
}

TParser::GeneralValueItemsContext* TParser::generalValueItems() {
  GeneralValueItemsContext *_localctx = _tracker.createInstance<GeneralValueItemsContext>(_ctx, getState());
  enterRule(_localctx, 160, TParser::RuleGeneralValueItems);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    size_t alt;
    enterOuterAlt(_localctx, 1);
    setState(962);
    generalValue();
    setState(966);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 141, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        setState(963);
        generalValueItems(); 
      }
      setState(968);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 141, _ctx);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- GeneralValueElementsContext ------------------------------------------------------------------

TParser::GeneralValueElementsContext::GeneralValueElementsContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::GeneralValueContext* TParser::GeneralValueElementsContext::generalValue() {
  return getRuleContext<TParser::GeneralValueContext>(0);
}

std::vector<TParser::GeneralValueElementsContext *> TParser::GeneralValueElementsContext::generalValueElements() {
  return getRuleContexts<TParser::GeneralValueElementsContext>();
}

TParser::GeneralValueElementsContext* TParser::GeneralValueElementsContext::generalValueElements(size_t i) {
  return getRuleContext<TParser::GeneralValueElementsContext>(i);
}


size_t TParser::GeneralValueElementsContext::getRuleIndex() const {
  return TParser::RuleGeneralValueElements;
}

void TParser::GeneralValueElementsContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterGeneralValueElements(this);
}

void TParser::GeneralValueElementsContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitGeneralValueElements(this);
}


antlrcpp::Any TParser::GeneralValueElementsContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitGeneralValueElements(this);
  else
    return visitor->visitChildren(this);
}

TParser::GeneralValueElementsContext* TParser::generalValueElements() {
  GeneralValueElementsContext *_localctx = _tracker.createInstance<GeneralValueElementsContext>(_ctx, getState());
  enterRule(_localctx, 162, TParser::RuleGeneralValueElements);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    size_t alt;
    enterOuterAlt(_localctx, 1);
    setState(969);
    generalValue();
    setState(973);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 142, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        setState(970);
        generalValueElements(); 
      }
      setState(975);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 142, _ctx);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- IdentifierContext ------------------------------------------------------------------

TParser::IdentifierContext::IdentifierContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::IdentifierContext::Identifier() {
  return getToken(TParser::Identifier, 0);
}


size_t TParser::IdentifierContext::getRuleIndex() const {
  return TParser::RuleIdentifier;
}

void TParser::IdentifierContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterIdentifier(this);
}

void TParser::IdentifierContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitIdentifier(this);
}


antlrcpp::Any TParser::IdentifierContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitIdentifier(this);
  else
    return visitor->visitChildren(this);
}

TParser::IdentifierContext* TParser::identifier() {
  IdentifierContext *_localctx = _tracker.createInstance<IdentifierContext>(_ctx, getState());
  enterRule(_localctx, 164, TParser::RuleIdentifier);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(976);
    match(TParser::Identifier);
   
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
  enterRule(_localctx, 166, TParser::RuleIdentifierB);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(978);
    match(TParser::Identifier);
   
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
  enterRule(_localctx, 168, TParser::RuleIdentifierC);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(980);
    match(TParser::Identifier);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- IdentifierDContext ------------------------------------------------------------------

TParser::IdentifierDContext::IdentifierDContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::IdentifierDContext::Identifier() {
  return getToken(TParser::Identifier, 0);
}


size_t TParser::IdentifierDContext::getRuleIndex() const {
  return TParser::RuleIdentifierD;
}

void TParser::IdentifierDContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterIdentifierD(this);
}

void TParser::IdentifierDContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitIdentifierD(this);
}


antlrcpp::Any TParser::IdentifierDContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitIdentifierD(this);
  else
    return visitor->visitChildren(this);
}

TParser::IdentifierDContext* TParser::identifierD() {
  IdentifierDContext *_localctx = _tracker.createInstance<IdentifierDContext>(_ctx, getState());
  enterRule(_localctx, 170, TParser::RuleIdentifierD);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(982);
    match(TParser::Identifier);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- IncDecOperatorsAContext ------------------------------------------------------------------

TParser::IncDecOperatorsAContext::IncDecOperatorsAContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::IncDecOperatorsAContext::IncDecOperators() {
  return getToken(TParser::IncDecOperators, 0);
}


size_t TParser::IncDecOperatorsAContext::getRuleIndex() const {
  return TParser::RuleIncDecOperatorsA;
}

void TParser::IncDecOperatorsAContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterIncDecOperatorsA(this);
}

void TParser::IncDecOperatorsAContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitIncDecOperatorsA(this);
}


antlrcpp::Any TParser::IncDecOperatorsAContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitIncDecOperatorsA(this);
  else
    return visitor->visitChildren(this);
}

TParser::IncDecOperatorsAContext* TParser::incDecOperatorsA() {
  IncDecOperatorsAContext *_localctx = _tracker.createInstance<IncDecOperatorsAContext>(_ctx, getState());
  enterRule(_localctx, 172, TParser::RuleIncDecOperatorsA);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(984);
    match(TParser::IncDecOperators);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- IncDecOperatorsBContext ------------------------------------------------------------------

TParser::IncDecOperatorsBContext::IncDecOperatorsBContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::IncDecOperatorsBContext::IncDecOperators() {
  return getToken(TParser::IncDecOperators, 0);
}


size_t TParser::IncDecOperatorsBContext::getRuleIndex() const {
  return TParser::RuleIncDecOperatorsB;
}

void TParser::IncDecOperatorsBContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterIncDecOperatorsB(this);
}

void TParser::IncDecOperatorsBContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitIncDecOperatorsB(this);
}


antlrcpp::Any TParser::IncDecOperatorsBContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitIncDecOperatorsB(this);
  else
    return visitor->visitChildren(this);
}

TParser::IncDecOperatorsBContext* TParser::incDecOperatorsB() {
  IncDecOperatorsBContext *_localctx = _tracker.createInstance<IncDecOperatorsBContext>(_ctx, getState());
  enterRule(_localctx, 174, TParser::RuleIncDecOperatorsB);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(986);
    match(TParser::IncDecOperators);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- OpenOpAContext ------------------------------------------------------------------

TParser::OpenOpAContext::OpenOpAContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::OpenOpAContext::OpenOp() {
  return getToken(TParser::OpenOp, 0);
}


size_t TParser::OpenOpAContext::getRuleIndex() const {
  return TParser::RuleOpenOpA;
}

void TParser::OpenOpAContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterOpenOpA(this);
}

void TParser::OpenOpAContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitOpenOpA(this);
}


antlrcpp::Any TParser::OpenOpAContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitOpenOpA(this);
  else
    return visitor->visitChildren(this);
}

TParser::OpenOpAContext* TParser::openOpA() {
  OpenOpAContext *_localctx = _tracker.createInstance<OpenOpAContext>(_ctx, getState());
  enterRule(_localctx, 176, TParser::RuleOpenOpA);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(988);
    match(TParser::OpenOp);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- CloseOpAContext ------------------------------------------------------------------

TParser::CloseOpAContext::CloseOpAContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::CloseOpAContext::CloseOp() {
  return getToken(TParser::CloseOp, 0);
}


size_t TParser::CloseOpAContext::getRuleIndex() const {
  return TParser::RuleCloseOpA;
}

void TParser::CloseOpAContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterCloseOpA(this);
}

void TParser::CloseOpAContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitCloseOpA(this);
}


antlrcpp::Any TParser::CloseOpAContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitCloseOpA(this);
  else
    return visitor->visitChildren(this);
}

TParser::CloseOpAContext* TParser::closeOpA() {
  CloseOpAContext *_localctx = _tracker.createInstance<CloseOpAContext>(_ctx, getState());
  enterRule(_localctx, 178, TParser::RuleCloseOpA);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(990);
    match(TParser::CloseOp);
   
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
  "main", "sentences", "statements", "blockCode", "blockUse", "useValue", 
  "useString", "blockVariable", "variableItem", "variablePrefixModes", "functionCall", 
  "functionCallPrefix", "functionCallParam", "functionCallParamElements", 
  "blockRet", "blockConditional", "ifElementUnique", "elifElements", "elifElementUnique", 
  "elseElementUnique", "conditionalBlockExpression", "conditionalBlockElements", 
  "blockLoop", "loopBlockElements", "loopComplete", "loopConditional", "loopInfinite", 
  "endOne", "endTwo", "loopOneMembers", "loopTwoMembers", "loopThreeMembers", 
  "loopThreeMembersValues", "blockBreak", "blockNext", "blockTryCatch", 
  "tryUniqueElement", "catchUniqueElement", "tryCatchElements", "blockFunction", 
  "blockFunctionDeclarationAttr", "functionParam", "functionAnonymousParam", 
  "functionCodeBlock", "blockInterface", "interfaceCodeBlock", "blockAbstraction", 
  "abstractionCodeBlock", "blockClass", "blockClassDeclarationAttr", "classAnonymousParam", 
  "classCodeBlock", "blockArray", "indexArray", "indexArrayElements", "associativeArray", 
  "associativeArrayElements", "blockLambdaFunctions", "lambdaFnParams", 
  "lambdaFnCodeBlock", "blockClassConstructor", "blockFunctionCall", "functionCallElements", 
  "blockAttribution", "attributionElements", "blockMultipleAssignments", 
  "variableMultipleAssignmentsModes", "blockAccessArrayElements", "arrayAccessElements", 
  "arrayAccessElementsItems", "accessBlockAr", "arrayIndexAccess", "firstIncDec", 
  "lastIncDec", "blockPermissionTokens", "codeBlockFlowControl", "codeBlockFlowControlElements", 
  "codeBlockControl", "generalValue", "generalValueBlock", "generalValueItems", 
  "generalValueElements", "identifier", "identifierB", "identifierC", "identifierD", 
  "incDecOperatorsA", "incDecOperatorsB", "openOpA", "closeOpA"
};

std::vector<std::string> TParser::_literalNames = {
  "", "'use'", "'var'", "'if'", "'elif'", "'else'", "'for'", "'ret'", "'fn'", 
  "'pub'", "'pro'", "'priv'", "'static'", "'final'", "'interface'", "'abstract'", 
  "'extends'", "'class'", "'implements'", "'new'", "'break'", "'next'", 
  "'async'", "'await'", "'try'", "'catch'", "'->'", "'=>'", "';'", "'='", 
  "'.'", "':'", "'::'", "','", "'['", "']'", "'{'", "'}'", "'('", "')'", 
  "", "", "'!'"
};

std::vector<std::string> TParser::_symbolicNames = {
  "", "Use", "Var", "If", "Elif", "Else", "For", "Ret", "Function", "Pub", 
  "Pro", "Priv", "Static", "Final", "Interface", "Abstract", "Extends", 
  "Class", "Implements", "New", "Break", "Next", "Async", "Await", "Try", 
  "Catch", "ArrowRight", "ARightLB", "End", "Attr", "Point", "TwoPoint", 
  "TwoTwoPoint", "Separator", "OpenArIndex", "CloseArIndex", "OpenBlock", 
  "CloseBlock", "OpenOp", "CloseOp", "ArithmeticOperator", "AssignmentOperator", 
  "Not", "IncDecOperators", "Identifier", "IDPrefix", "TypeSpec", "Words", 
  "Integer", "Float", "String", "BlockComment", "LineComment", "Whitespace", 
  "Newline"
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
       0x3, 0x38, 0x3e3, 0x4, 0x2, 0x9, 0x2, 0x4, 0x3, 0x9, 0x3, 0x4, 0x4, 
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
       0x9, 0x59, 0x4, 0x5a, 0x9, 0x5a, 0x4, 0x5b, 0x9, 0x5b, 0x3, 0x2, 
       0x3, 0x2, 0x3, 0x2, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 
       0x3, 0x5, 0x3, 0xbf, 0xa, 0x3, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x3, 
       0x4, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 
       0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x3, 
       0x4, 0x3, 0x4, 0x5, 0x4, 0xd3, 0xa, 0x4, 0x3, 0x5, 0x3, 0x5, 0x3, 
       0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x5, 0x5, 0xdb, 0xa, 0x5, 0x3, 
       0x6, 0x3, 0x6, 0x3, 0x6, 0x3, 0x6, 0x3, 0x7, 0x3, 0x7, 0x3, 0x7, 
       0x3, 0x7, 0x3, 0x7, 0x5, 0x7, 0xe6, 0xa, 0x7, 0x3, 0x8, 0x3, 0x8, 
       0x3, 0x9, 0x3, 0x9, 0x3, 0x9, 0x3, 0x9, 0x3, 0xa, 0x3, 0xa, 0x5, 
       0xa, 0xf0, 0xa, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x7, 0xa, 0xf5, 
       0xa, 0xa, 0xc, 0xa, 0xe, 0xa, 0xf8, 0xb, 0xa, 0x3, 0xb, 0x3, 0xb, 
       0x3, 0xb, 0x3, 0xb, 0x5, 0xb, 0xfe, 0xa, 0xb, 0x3, 0xb, 0x3, 0xb, 
       0x3, 0xc, 0x3, 0xc, 0x5, 0xc, 0x104, 0xa, 0xc, 0x3, 0xc, 0x3, 0xc, 
       0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 
       0xd, 0x5, 0xd, 0x10f, 0xa, 0xd, 0x3, 0xe, 0x3, 0xe, 0x3, 0xe, 0x3, 
       0xe, 0x3, 0xe, 0x3, 0xe, 0x5, 0xe, 0x117, 0xa, 0xe, 0x3, 0xf, 0x3, 
       0xf, 0x3, 0xf, 0x7, 0xf, 0x11c, 0xa, 0xf, 0xc, 0xf, 0xe, 0xf, 0x11f, 
       0xb, 0xf, 0x3, 0x10, 0x3, 0x10, 0x3, 0x10, 0x3, 0x10, 0x3, 0x11, 
       0x3, 0x11, 0x5, 0x11, 0x127, 0xa, 0x11, 0x3, 0x11, 0x5, 0x11, 0x12a, 
       0xa, 0x11, 0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 0x13, 
       0x3, 0x13, 0x7, 0x13, 0x132, 0xa, 0x13, 0xc, 0x13, 0xe, 0x13, 0x135, 
       0xb, 0x13, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x15, 
       0x3, 0x15, 0x3, 0x15, 0x3, 0x16, 0x3, 0x16, 0x3, 0x17, 0x3, 0x17, 
       0x3, 0x18, 0x3, 0x18, 0x3, 0x18, 0x3, 0x18, 0x5, 0x18, 0x146, 0xa, 
       0x18, 0x3, 0x18, 0x3, 0x18, 0x3, 0x19, 0x3, 0x19, 0x3, 0x1a, 0x5, 
       0x1a, 0x14d, 0xa, 0x1a, 0x3, 0x1a, 0x3, 0x1a, 0x3, 0x1a, 0x3, 0x1a, 
       0x3, 0x1a, 0x3, 0x1a, 0x5, 0x1a, 0x155, 0xa, 0x1a, 0x3, 0x1b, 0x3, 
       0x1b, 0x3, 0x1c, 0x3, 0x1c, 0x3, 0x1c, 0x5, 0x1c, 0x15c, 0xa, 0x1c, 
       0x3, 0x1d, 0x3, 0x1d, 0x3, 0x1e, 0x3, 0x1e, 0x3, 0x1f, 0x3, 0x1f, 
       0x3, 0x1f, 0x5, 0x1f, 0x165, 0xa, 0x1f, 0x3, 0x20, 0x3, 0x20, 0x5, 
       0x20, 0x169, 0xa, 0x20, 0x3, 0x21, 0x3, 0x21, 0x5, 0x21, 0x16d, 0xa, 
       0x21, 0x3, 0x22, 0x3, 0x22, 0x3, 0x22, 0x7, 0x22, 0x172, 0xa, 0x22, 
       0xc, 0x22, 0xe, 0x22, 0x175, 0xb, 0x22, 0x3, 0x23, 0x3, 0x23, 0x3, 
       0x23, 0x3, 0x24, 0x3, 0x24, 0x3, 0x24, 0x3, 0x25, 0x3, 0x25, 0x5, 
       0x25, 0x17f, 0xa, 0x25, 0x3, 0x26, 0x3, 0x26, 0x3, 0x26, 0x3, 0x27, 
       0x3, 0x27, 0x5, 0x27, 0x186, 0xa, 0x27, 0x3, 0x27, 0x3, 0x27, 0x5, 
       0x27, 0x18a, 0xa, 0x27, 0x3, 0x27, 0x3, 0x27, 0x3, 0x28, 0x3, 0x28, 
       0x3, 0x29, 0x3, 0x29, 0x3, 0x29, 0x5, 0x29, 0x193, 0xa, 0x29, 0x3, 
       0x29, 0x3, 0x29, 0x5, 0x29, 0x197, 0xa, 0x29, 0x3, 0x29, 0x3, 0x29, 
       0x3, 0x29, 0x3, 0x29, 0x5, 0x29, 0x19d, 0xa, 0x29, 0x5, 0x29, 0x19f, 
       0xa, 0x29, 0x3, 0x29, 0x3, 0x29, 0x3, 0x29, 0x3, 0x29, 0x5, 0x29, 
       0x1a5, 0xa, 0x29, 0x3, 0x29, 0x3, 0x29, 0x3, 0x29, 0x3, 0x29, 0x3, 
       0x29, 0x5, 0x29, 0x1ac, 0xa, 0x29, 0x3, 0x29, 0x3, 0x29, 0x5, 0x29, 
       0x1b0, 0xa, 0x29, 0x3, 0x29, 0x3, 0x29, 0x3, 0x29, 0x3, 0x29, 0x5, 
       0x29, 0x1b6, 0xa, 0x29, 0x5, 0x29, 0x1b8, 0xa, 0x29, 0x3, 0x29, 0x3, 
       0x29, 0x5, 0x29, 0x1bc, 0xa, 0x29, 0x5, 0x29, 0x1be, 0xa, 0x29, 0x3, 
       0x2a, 0x3, 0x2a, 0x3, 0x2a, 0x5, 0x2a, 0x1c3, 0xa, 0x2a, 0x3, 0x2a, 
       0x3, 0x2a, 0x5, 0x2a, 0x1c7, 0xa, 0x2a, 0x3, 0x2a, 0x3, 0x2a, 0x3, 
       0x2a, 0x3, 0x2a, 0x5, 0x2a, 0x1cd, 0xa, 0x2a, 0x5, 0x2a, 0x1cf, 0xa, 
       0x2a, 0x3, 0x2a, 0x3, 0x2a, 0x3, 0x2a, 0x3, 0x2a, 0x5, 0x2a, 0x1d5, 
       0xa, 0x2a, 0x3, 0x2a, 0x3, 0x2a, 0x3, 0x2a, 0x3, 0x2a, 0x5, 0x2a, 
       0x1db, 0xa, 0x2a, 0x3, 0x2a, 0x3, 0x2a, 0x5, 0x2a, 0x1df, 0xa, 0x2a, 
       0x3, 0x2a, 0x3, 0x2a, 0x3, 0x2a, 0x3, 0x2a, 0x5, 0x2a, 0x1e5, 0xa, 
       0x2a, 0x5, 0x2a, 0x1e7, 0xa, 0x2a, 0x3, 0x2a, 0x5, 0x2a, 0x1ea, 0xa, 
       0x2a, 0x3, 0x2b, 0x3, 0x2b, 0x3, 0x2b, 0x3, 0x2b, 0x5, 0x2b, 0x1f0, 
       0xa, 0x2b, 0x3, 0x2c, 0x3, 0x2c, 0x3, 0x2d, 0x3, 0x2d, 0x3, 0x2e, 
       0x3, 0x2e, 0x3, 0x2e, 0x3, 0x2e, 0x5, 0x2e, 0x1fa, 0xa, 0x2e, 0x3, 
       0x2e, 0x3, 0x2e, 0x3, 0x2f, 0x3, 0x2f, 0x3, 0x30, 0x3, 0x30, 0x3, 
       0x30, 0x3, 0x30, 0x5, 0x30, 0x204, 0xa, 0x30, 0x3, 0x30, 0x3, 0x30, 
       0x3, 0x31, 0x3, 0x31, 0x3, 0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 0x32, 
       0x5, 0x32, 0x20e, 0xa, 0x32, 0x3, 0x32, 0x3, 0x32, 0x5, 0x32, 0x212, 
       0xa, 0x32, 0x3, 0x32, 0x3, 0x32, 0x5, 0x32, 0x216, 0xa, 0x32, 0x3, 
       0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 0x32, 0x5, 
       0x32, 0x21e, 0xa, 0x32, 0x3, 0x32, 0x3, 0x32, 0x5, 0x32, 0x222, 0xa, 
       0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 0x32, 0x5, 0x32, 0x228, 
       0xa, 0x32, 0x3, 0x32, 0x3, 0x32, 0x5, 0x32, 0x22c, 0xa, 0x32, 0x3, 
       0x32, 0x3, 0x32, 0x5, 0x32, 0x230, 0xa, 0x32, 0x3, 0x32, 0x5, 0x32, 
       0x233, 0xa, 0x32, 0x3, 0x33, 0x3, 0x33, 0x3, 0x33, 0x3, 0x33, 0x5, 
       0x33, 0x239, 0xa, 0x33, 0x3, 0x33, 0x3, 0x33, 0x5, 0x33, 0x23d, 0xa, 
       0x33, 0x3, 0x33, 0x3, 0x33, 0x5, 0x33, 0x241, 0xa, 0x33, 0x3, 0x33, 
       0x3, 0x33, 0x3, 0x33, 0x3, 0x33, 0x3, 0x33, 0x3, 0x33, 0x5, 0x33, 
       0x249, 0xa, 0x33, 0x3, 0x33, 0x3, 0x33, 0x5, 0x33, 0x24d, 0xa, 0x33, 
       0x3, 0x33, 0x3, 0x33, 0x5, 0x33, 0x251, 0xa, 0x33, 0x3, 0x33, 0x3, 
       0x33, 0x5, 0x33, 0x255, 0xa, 0x33, 0x3, 0x33, 0x3, 0x33, 0x5, 0x33, 
       0x259, 0xa, 0x33, 0x3, 0x33, 0x5, 0x33, 0x25c, 0xa, 0x33, 0x3, 0x34, 
       0x3, 0x34, 0x3, 0x35, 0x3, 0x35, 0x3, 0x36, 0x3, 0x36, 0x5, 0x36, 
       0x264, 0xa, 0x36, 0x3, 0x37, 0x3, 0x37, 0x3, 0x37, 0x3, 0x37, 0x3, 
       0x38, 0x3, 0x38, 0x3, 0x38, 0x7, 0x38, 0x26d, 0xa, 0x38, 0xc, 0x38, 
       0xe, 0x38, 0x270, 0xb, 0x38, 0x3, 0x39, 0x3, 0x39, 0x3, 0x39, 0x3, 
       0x39, 0x3, 0x3a, 0x3, 0x3a, 0x3, 0x3a, 0x3, 0x3a, 0x3, 0x3a, 0x7, 
       0x3a, 0x27b, 0xa, 0x3a, 0xc, 0x3a, 0xe, 0x3a, 0x27e, 0xb, 0x3a, 0x3, 
       0x3b, 0x3, 0x3b, 0x5, 0x3b, 0x282, 0xa, 0x3b, 0x3, 0x3b, 0x3, 0x3b, 
       0x3, 0x3b, 0x3, 0x3b, 0x5, 0x3b, 0x288, 0xa, 0x3b, 0x5, 0x3b, 0x28a, 
       0xa, 0x3b, 0x3, 0x3b, 0x3, 0x3b, 0x3, 0x3b, 0x3, 0x3c, 0x3, 0x3c, 
       0x5, 0x3c, 0x291, 0xa, 0x3c, 0x3, 0x3c, 0x3, 0x3c, 0x7, 0x3c, 0x295, 
       0xa, 0x3c, 0xc, 0x3c, 0xe, 0x3c, 0x298, 0xb, 0x3c, 0x3, 0x3d, 0x3, 
       0x3d, 0x5, 0x3d, 0x29c, 0xa, 0x3d, 0x3, 0x3e, 0x3, 0x3e, 0x3, 0x3e, 
       0x5, 0x3e, 0x2a1, 0xa, 0x3e, 0x3, 0x3e, 0x3, 0x3e, 0x3, 0x3e, 0x3, 
       0x3f, 0x3, 0x3f, 0x3, 0x3f, 0x5, 0x3f, 0x2a9, 0xa, 0x3f, 0x3, 0x3f, 
       0x3, 0x3f, 0x5, 0x3f, 0x2ad, 0xa, 0x3f, 0x3, 0x3f, 0x3, 0x3f, 0x3, 
       0x3f, 0x3, 0x40, 0x3, 0x40, 0x3, 0x40, 0x7, 0x40, 0x2b5, 0xa, 0x40, 
       0xc, 0x40, 0xe, 0x40, 0x2b8, 0xb, 0x40, 0x3, 0x41, 0x3, 0x41, 0x3, 
       0x41, 0x3, 0x42, 0x3, 0x42, 0x3, 0x42, 0x5, 0x42, 0x2c0, 0xa, 0x42, 
       0x3, 0x42, 0x3, 0x42, 0x5, 0x42, 0x2c4, 0xa, 0x42, 0x3, 0x42, 0x3, 
       0x42, 0x3, 0x42, 0x7, 0x42, 0x2c9, 0xa, 0x42, 0xc, 0x42, 0xe, 0x42, 
       0x2cc, 0xb, 0x42, 0x3, 0x43, 0x3, 0x43, 0x3, 0x43, 0x3, 0x43, 0x3, 
       0x43, 0x3, 0x44, 0x3, 0x44, 0x3, 0x44, 0x7, 0x44, 0x2d6, 0xa, 0x44, 
       0xc, 0x44, 0xe, 0x44, 0x2d9, 0xb, 0x44, 0x3, 0x45, 0x3, 0x45, 0x3, 
       0x46, 0x3, 0x46, 0x7, 0x46, 0x2df, 0xa, 0x46, 0xc, 0x46, 0xe, 0x46, 
       0x2e2, 0xb, 0x46, 0x3, 0x47, 0x3, 0x47, 0x5, 0x47, 0x2e6, 0xa, 0x47, 
       0x3, 0x47, 0x5, 0x47, 0x2e9, 0xa, 0x47, 0x3, 0x47, 0x5, 0x47, 0x2ec, 
       0xa, 0x47, 0x3, 0x47, 0x3, 0x47, 0x5, 0x47, 0x2f0, 0xa, 0x47, 0x3, 
       0x47, 0x5, 0x47, 0x2f3, 0xa, 0x47, 0x3, 0x47, 0x3, 0x47, 0x5, 0x47, 
       0x2f7, 0xa, 0x47, 0x3, 0x47, 0x5, 0x47, 0x2fa, 0xa, 0x47, 0x3, 0x47, 
       0x5, 0x47, 0x2fd, 0xa, 0x47, 0x5, 0x47, 0x2ff, 0xa, 0x47, 0x3, 0x48, 
       0x3, 0x48, 0x3, 0x48, 0x3, 0x48, 0x7, 0x48, 0x305, 0xa, 0x48, 0xc, 
       0x48, 0xe, 0x48, 0x308, 0xb, 0x48, 0x3, 0x49, 0x3, 0x49, 0x3, 0x4a, 
       0x3, 0x4a, 0x3, 0x4b, 0x3, 0x4b, 0x3, 0x4c, 0x3, 0x4c, 0x3, 0x4d, 
       0x3, 0x4d, 0x3, 0x4d, 0x3, 0x4d, 0x3, 0x4d, 0x3, 0x4d, 0x3, 0x4d, 
       0x5, 0x4d, 0x319, 0xa, 0x4d, 0x3, 0x4e, 0x3, 0x4e, 0x3, 0x4e, 0x3, 
       0x4e, 0x3, 0x4e, 0x3, 0x4e, 0x3, 0x4e, 0x3, 0x4e, 0x3, 0x4e, 0x5, 
       0x4e, 0x324, 0xa, 0x4e, 0x3, 0x4f, 0x3, 0x4f, 0x3, 0x4f, 0x3, 0x4f, 
       0x3, 0x4f, 0x3, 0x4f, 0x5, 0x4f, 0x32c, 0xa, 0x4f, 0x3, 0x50, 0x5, 
       0x50, 0x32f, 0xa, 0x50, 0x3, 0x50, 0x3, 0x50, 0x3, 0x50, 0x3, 0x50, 
       0x5, 0x50, 0x335, 0xa, 0x50, 0x3, 0x50, 0x5, 0x50, 0x338, 0xa, 0x50, 
       0x3, 0x50, 0x5, 0x50, 0x33b, 0xa, 0x50, 0x3, 0x50, 0x5, 0x50, 0x33e, 
       0xa, 0x50, 0x3, 0x50, 0x5, 0x50, 0x341, 0xa, 0x50, 0x3, 0x50, 0x3, 
       0x50, 0x5, 0x50, 0x345, 0xa, 0x50, 0x3, 0x50, 0x5, 0x50, 0x348, 0xa, 
       0x50, 0x3, 0x50, 0x5, 0x50, 0x34b, 0xa, 0x50, 0x3, 0x50, 0x5, 0x50, 
       0x34e, 0xa, 0x50, 0x3, 0x50, 0x5, 0x50, 0x351, 0xa, 0x50, 0x3, 0x50, 
       0x3, 0x50, 0x5, 0x50, 0x355, 0xa, 0x50, 0x3, 0x50, 0x5, 0x50, 0x358, 
       0xa, 0x50, 0x3, 0x50, 0x5, 0x50, 0x35b, 0xa, 0x50, 0x3, 0x50, 0x5, 
       0x50, 0x35e, 0xa, 0x50, 0x3, 0x50, 0x3, 0x50, 0x5, 0x50, 0x362, 0xa, 
       0x50, 0x3, 0x50, 0x5, 0x50, 0x365, 0xa, 0x50, 0x3, 0x50, 0x5, 0x50, 
       0x368, 0xa, 0x50, 0x3, 0x50, 0x5, 0x50, 0x36b, 0xa, 0x50, 0x3, 0x50, 
       0x3, 0x50, 0x5, 0x50, 0x36f, 0xa, 0x50, 0x3, 0x50, 0x5, 0x50, 0x372, 
       0xa, 0x50, 0x3, 0x50, 0x5, 0x50, 0x375, 0xa, 0x50, 0x5, 0x50, 0x377, 
       0xa, 0x50, 0x3, 0x50, 0x5, 0x50, 0x37a, 0xa, 0x50, 0x3, 0x50, 0x3, 
       0x50, 0x5, 0x50, 0x37e, 0xa, 0x50, 0x3, 0x50, 0x5, 0x50, 0x381, 0xa, 
       0x50, 0x3, 0x50, 0x5, 0x50, 0x384, 0xa, 0x50, 0x3, 0x50, 0x5, 0x50, 
       0x387, 0xa, 0x50, 0x3, 0x50, 0x3, 0x50, 0x3, 0x50, 0x3, 0x50, 0x5, 
       0x50, 0x38d, 0xa, 0x50, 0x3, 0x50, 0x5, 0x50, 0x390, 0xa, 0x50, 0x3, 
       0x50, 0x5, 0x50, 0x393, 0xa, 0x50, 0x3, 0x50, 0x5, 0x50, 0x396, 0xa, 
       0x50, 0x3, 0x50, 0x5, 0x50, 0x399, 0xa, 0x50, 0x3, 0x50, 0x3, 0x50, 
       0x5, 0x50, 0x39d, 0xa, 0x50, 0x3, 0x50, 0x5, 0x50, 0x3a0, 0xa, 0x50, 
       0x3, 0x50, 0x5, 0x50, 0x3a3, 0xa, 0x50, 0x3, 0x50, 0x5, 0x50, 0x3a6, 
       0xa, 0x50, 0x3, 0x50, 0x3, 0x50, 0x3, 0x50, 0x3, 0x50, 0x3, 0x50, 
       0x3, 0x50, 0x3, 0x50, 0x3, 0x50, 0x5, 0x50, 0x3b0, 0xa, 0x50, 0x3, 
       0x50, 0x5, 0x50, 0x3b3, 0xa, 0x50, 0x3, 0x50, 0x3, 0x50, 0x5, 0x50, 
       0x3b7, 0xa, 0x50, 0x3, 0x50, 0x5, 0x50, 0x3ba, 0xa, 0x50, 0x3, 0x50, 
       0x5, 0x50, 0x3bd, 0xa, 0x50, 0x5, 0x50, 0x3bf, 0xa, 0x50, 0x3, 0x51, 
       0x3, 0x51, 0x3, 0x51, 0x3, 0x51, 0x3, 0x52, 0x3, 0x52, 0x7, 0x52, 
       0x3c7, 0xa, 0x52, 0xc, 0x52, 0xe, 0x52, 0x3ca, 0xb, 0x52, 0x3, 0x53, 
       0x3, 0x53, 0x7, 0x53, 0x3ce, 0xa, 0x53, 0xc, 0x53, 0xe, 0x53, 0x3d1, 
       0xb, 0x53, 0x3, 0x54, 0x3, 0x54, 0x3, 0x55, 0x3, 0x55, 0x3, 0x56, 
       0x3, 0x56, 0x3, 0x57, 0x3, 0x57, 0x3, 0x58, 0x3, 0x58, 0x3, 0x59, 
       0x3, 0x59, 0x3, 0x5a, 0x3, 0x5a, 0x3, 0x5b, 0x3, 0x5b, 0x3, 0x5b, 
       0x2, 0x2, 0x5c, 0x2, 0x4, 0x6, 0x8, 0xa, 0xc, 0xe, 0x10, 0x12, 0x14, 
       0x16, 0x18, 0x1a, 0x1c, 0x1e, 0x20, 0x22, 0x24, 0x26, 0x28, 0x2a, 
       0x2c, 0x2e, 0x30, 0x32, 0x34, 0x36, 0x38, 0x3a, 0x3c, 0x3e, 0x40, 
       0x42, 0x44, 0x46, 0x48, 0x4a, 0x4c, 0x4e, 0x50, 0x52, 0x54, 0x56, 
       0x58, 0x5a, 0x5c, 0x5e, 0x60, 0x62, 0x64, 0x66, 0x68, 0x6a, 0x6c, 
       0x6e, 0x70, 0x72, 0x74, 0x76, 0x78, 0x7a, 0x7c, 0x7e, 0x80, 0x82, 
       0x84, 0x86, 0x88, 0x8a, 0x8c, 0x8e, 0x90, 0x92, 0x94, 0x96, 0x98, 
       0x9a, 0x9c, 0x9e, 0xa0, 0xa2, 0xa4, 0xa6, 0xa8, 0xaa, 0xac, 0xae, 
       0xb0, 0xb2, 0xb4, 0x2, 0x6, 0x4, 0x2, 0x15, 0x15, 0x19, 0x19, 0x4, 
       0x2, 0x1f, 0x1f, 0x2b, 0x2b, 0x4, 0x2, 0x20, 0x20, 0x22, 0x22, 0x4, 
       0x2, 0xb, 0xf, 0x18, 0x18, 0x2, 0x43c, 0x2, 0xb6, 0x3, 0x2, 0x2, 
       0x2, 0x4, 0xbe, 0x3, 0x2, 0x2, 0x2, 0x6, 0xd2, 0x3, 0x2, 0x2, 0x2, 
       0x8, 0xda, 0x3, 0x2, 0x2, 0x2, 0xa, 0xdc, 0x3, 0x2, 0x2, 0x2, 0xc, 
       0xe5, 0x3, 0x2, 0x2, 0x2, 0xe, 0xe7, 0x3, 0x2, 0x2, 0x2, 0x10, 0xe9, 
       0x3, 0x2, 0x2, 0x2, 0x12, 0xed, 0x3, 0x2, 0x2, 0x2, 0x14, 0xfd, 0x3, 
       0x2, 0x2, 0x2, 0x16, 0x101, 0x3, 0x2, 0x2, 0x2, 0x18, 0x10e, 0x3, 
       0x2, 0x2, 0x2, 0x1a, 0x116, 0x3, 0x2, 0x2, 0x2, 0x1c, 0x118, 0x3, 
       0x2, 0x2, 0x2, 0x1e, 0x120, 0x3, 0x2, 0x2, 0x2, 0x20, 0x124, 0x3, 
       0x2, 0x2, 0x2, 0x22, 0x12b, 0x3, 0x2, 0x2, 0x2, 0x24, 0x12f, 0x3, 
       0x2, 0x2, 0x2, 0x26, 0x136, 0x3, 0x2, 0x2, 0x2, 0x28, 0x13a, 0x3, 
       0x2, 0x2, 0x2, 0x2a, 0x13d, 0x3, 0x2, 0x2, 0x2, 0x2c, 0x13f, 0x3, 
       0x2, 0x2, 0x2, 0x2e, 0x141, 0x3, 0x2, 0x2, 0x2, 0x30, 0x149, 0x3, 
       0x2, 0x2, 0x2, 0x32, 0x14c, 0x3, 0x2, 0x2, 0x2, 0x34, 0x156, 0x3, 
       0x2, 0x2, 0x2, 0x36, 0x15b, 0x3, 0x2, 0x2, 0x2, 0x38, 0x15d, 0x3, 
       0x2, 0x2, 0x2, 0x3a, 0x15f, 0x3, 0x2, 0x2, 0x2, 0x3c, 0x164, 0x3, 
       0x2, 0x2, 0x2, 0x3e, 0x168, 0x3, 0x2, 0x2, 0x2, 0x40, 0x16c, 0x3, 
       0x2, 0x2, 0x2, 0x42, 0x16e, 0x3, 0x2, 0x2, 0x2, 0x44, 0x176, 0x3, 
       0x2, 0x2, 0x2, 0x46, 0x179, 0x3, 0x2, 0x2, 0x2, 0x48, 0x17c, 0x3, 
       0x2, 0x2, 0x2, 0x4a, 0x180, 0x3, 0x2, 0x2, 0x2, 0x4c, 0x183, 0x3, 
       0x2, 0x2, 0x2, 0x4e, 0x18d, 0x3, 0x2, 0x2, 0x2, 0x50, 0x1bd, 0x3, 
       0x2, 0x2, 0x2, 0x52, 0x1e9, 0x3, 0x2, 0x2, 0x2, 0x54, 0x1eb, 0x3, 
       0x2, 0x2, 0x2, 0x56, 0x1f1, 0x3, 0x2, 0x2, 0x2, 0x58, 0x1f3, 0x3, 
       0x2, 0x2, 0x2, 0x5a, 0x1f5, 0x3, 0x2, 0x2, 0x2, 0x5c, 0x1fd, 0x3, 
       0x2, 0x2, 0x2, 0x5e, 0x1ff, 0x3, 0x2, 0x2, 0x2, 0x60, 0x207, 0x3, 
       0x2, 0x2, 0x2, 0x62, 0x232, 0x3, 0x2, 0x2, 0x2, 0x64, 0x25b, 0x3, 
       0x2, 0x2, 0x2, 0x66, 0x25d, 0x3, 0x2, 0x2, 0x2, 0x68, 0x25f, 0x3, 
       0x2, 0x2, 0x2, 0x6a, 0x263, 0x3, 0x2, 0x2, 0x2, 0x6c, 0x265, 0x3, 
       0x2, 0x2, 0x2, 0x6e, 0x269, 0x3, 0x2, 0x2, 0x2, 0x70, 0x271, 0x3, 
       0x2, 0x2, 0x2, 0x72, 0x275, 0x3, 0x2, 0x2, 0x2, 0x74, 0x27f, 0x3, 
       0x2, 0x2, 0x2, 0x76, 0x28e, 0x3, 0x2, 0x2, 0x2, 0x78, 0x29b, 0x3, 
       0x2, 0x2, 0x2, 0x7a, 0x29d, 0x3, 0x2, 0x2, 0x2, 0x7c, 0x2a5, 0x3, 
       0x2, 0x2, 0x2, 0x7e, 0x2b1, 0x3, 0x2, 0x2, 0x2, 0x80, 0x2b9, 0x3, 
       0x2, 0x2, 0x2, 0x82, 0x2bc, 0x3, 0x2, 0x2, 0x2, 0x84, 0x2cd, 0x3, 
       0x2, 0x2, 0x2, 0x86, 0x2d2, 0x3, 0x2, 0x2, 0x2, 0x88, 0x2da, 0x3, 
       0x2, 0x2, 0x2, 0x8a, 0x2dc, 0x3, 0x2, 0x2, 0x2, 0x8c, 0x2fe, 0x3, 
       0x2, 0x2, 0x2, 0x8e, 0x300, 0x3, 0x2, 0x2, 0x2, 0x90, 0x309, 0x3, 
       0x2, 0x2, 0x2, 0x92, 0x30b, 0x3, 0x2, 0x2, 0x2, 0x94, 0x30d, 0x3, 
       0x2, 0x2, 0x2, 0x96, 0x30f, 0x3, 0x2, 0x2, 0x2, 0x98, 0x318, 0x3, 
       0x2, 0x2, 0x2, 0x9a, 0x323, 0x3, 0x2, 0x2, 0x2, 0x9c, 0x32b, 0x3, 
       0x2, 0x2, 0x2, 0x9e, 0x3be, 0x3, 0x2, 0x2, 0x2, 0xa0, 0x3c0, 0x3, 
       0x2, 0x2, 0x2, 0xa2, 0x3c4, 0x3, 0x2, 0x2, 0x2, 0xa4, 0x3cb, 0x3, 
       0x2, 0x2, 0x2, 0xa6, 0x3d2, 0x3, 0x2, 0x2, 0x2, 0xa8, 0x3d4, 0x3, 
       0x2, 0x2, 0x2, 0xaa, 0x3d6, 0x3, 0x2, 0x2, 0x2, 0xac, 0x3d8, 0x3, 
       0x2, 0x2, 0x2, 0xae, 0x3da, 0x3, 0x2, 0x2, 0x2, 0xb0, 0x3dc, 0x3, 
       0x2, 0x2, 0x2, 0xb2, 0x3de, 0x3, 0x2, 0x2, 0x2, 0xb4, 0x3e0, 0x3, 
       0x2, 0x2, 0x2, 0xb6, 0xb7, 0x5, 0x4, 0x3, 0x2, 0xb7, 0xb8, 0x7, 0x2, 
       0x2, 0x3, 0xb8, 0x3, 0x3, 0x2, 0x2, 0x2, 0xb9, 0xbf, 0x5, 0x6, 0x4, 
       0x2, 0xba, 0xbb, 0x5, 0x6, 0x4, 0x2, 0xbb, 0xbc, 0x5, 0x4, 0x3, 0x2, 
       0xbc, 0xbf, 0x3, 0x2, 0x2, 0x2, 0xbd, 0xbf, 0x3, 0x2, 0x2, 0x2, 0xbe, 
       0xb9, 0x3, 0x2, 0x2, 0x2, 0xbe, 0xba, 0x3, 0x2, 0x2, 0x2, 0xbe, 0xbd, 
       0x3, 0x2, 0x2, 0x2, 0xbf, 0x5, 0x3, 0x2, 0x2, 0x2, 0xc0, 0xd3, 0x5, 
       0xa, 0x6, 0x2, 0xc1, 0xd3, 0x5, 0x10, 0x9, 0x2, 0xc2, 0xd3, 0x5, 
       0x1e, 0x10, 0x2, 0xc3, 0xd3, 0x5, 0x20, 0x11, 0x2, 0xc4, 0xd3, 0x5, 
       0x2e, 0x18, 0x2, 0xc5, 0xd3, 0x5, 0x44, 0x23, 0x2, 0xc6, 0xd3, 0x5, 
       0x46, 0x24, 0x2, 0xc7, 0xd3, 0x5, 0x48, 0x25, 0x2, 0xc8, 0xd3, 0x5, 
       0x50, 0x29, 0x2, 0xc9, 0xd3, 0x5, 0x5a, 0x2e, 0x2, 0xca, 0xd3, 0x5, 
       0x5e, 0x30, 0x2, 0xcb, 0xd3, 0x5, 0x62, 0x32, 0x2, 0xcc, 0xd3, 0x5, 
       0x7c, 0x3f, 0x2, 0xcd, 0xd3, 0x5, 0x7a, 0x3e, 0x2, 0xce, 0xd3, 0x5, 
       0x80, 0x41, 0x2, 0xcf, 0xd3, 0x5, 0x84, 0x43, 0x2, 0xd0, 0xd3, 0x5, 
       0x8, 0x5, 0x2, 0xd1, 0xd3, 0x5, 0x96, 0x4c, 0x2, 0xd2, 0xc0, 0x3, 
       0x2, 0x2, 0x2, 0xd2, 0xc1, 0x3, 0x2, 0x2, 0x2, 0xd2, 0xc2, 0x3, 0x2, 
       0x2, 0x2, 0xd2, 0xc3, 0x3, 0x2, 0x2, 0x2, 0xd2, 0xc4, 0x3, 0x2, 0x2, 
       0x2, 0xd2, 0xc5, 0x3, 0x2, 0x2, 0x2, 0xd2, 0xc6, 0x3, 0x2, 0x2, 0x2, 
       0xd2, 0xc7, 0x3, 0x2, 0x2, 0x2, 0xd2, 0xc8, 0x3, 0x2, 0x2, 0x2, 0xd2, 
       0xc9, 0x3, 0x2, 0x2, 0x2, 0xd2, 0xca, 0x3, 0x2, 0x2, 0x2, 0xd2, 0xcb, 
       0x3, 0x2, 0x2, 0x2, 0xd2, 0xcc, 0x3, 0x2, 0x2, 0x2, 0xd2, 0xcd, 0x3, 
       0x2, 0x2, 0x2, 0xd2, 0xce, 0x3, 0x2, 0x2, 0x2, 0xd2, 0xcf, 0x3, 0x2, 
       0x2, 0x2, 0xd2, 0xd0, 0x3, 0x2, 0x2, 0x2, 0xd2, 0xd1, 0x3, 0x2, 0x2, 
       0x2, 0xd3, 0x7, 0x3, 0x2, 0x2, 0x2, 0xd4, 0xd5, 0x7, 0x26, 0x2, 0x2, 
       0xd5, 0xdb, 0x7, 0x27, 0x2, 0x2, 0xd6, 0xd7, 0x7, 0x26, 0x2, 0x2, 
       0xd7, 0xd8, 0x5, 0x4, 0x3, 0x2, 0xd8, 0xd9, 0x7, 0x27, 0x2, 0x2, 
       0xd9, 0xdb, 0x3, 0x2, 0x2, 0x2, 0xda, 0xd4, 0x3, 0x2, 0x2, 0x2, 0xda, 
       0xd6, 0x3, 0x2, 0x2, 0x2, 0xdb, 0x9, 0x3, 0x2, 0x2, 0x2, 0xdc, 0xdd, 
       0x7, 0x3, 0x2, 0x2, 0xdd, 0xde, 0x5, 0xc, 0x7, 0x2, 0xde, 0xdf, 0x7, 
       0x1e, 0x2, 0x2, 0xdf, 0xb, 0x3, 0x2, 0x2, 0x2, 0xe0, 0xe6, 0x5, 0xe, 
       0x8, 0x2, 0xe1, 0xe2, 0x5, 0xe, 0x8, 0x2, 0xe2, 0xe3, 0x7, 0x23, 
       0x2, 0x2, 0xe3, 0xe4, 0x5, 0xc, 0x7, 0x2, 0xe4, 0xe6, 0x3, 0x2, 0x2, 
       0x2, 0xe5, 0xe0, 0x3, 0x2, 0x2, 0x2, 0xe5, 0xe1, 0x3, 0x2, 0x2, 0x2, 
       0xe6, 0xd, 0x3, 0x2, 0x2, 0x2, 0xe7, 0xe8, 0x7, 0x34, 0x2, 0x2, 0xe8, 
       0xf, 0x3, 0x2, 0x2, 0x2, 0xe9, 0xea, 0x7, 0x4, 0x2, 0x2, 0xea, 0xeb, 
       0x5, 0x12, 0xa, 0x2, 0xeb, 0xec, 0x7, 0x1e, 0x2, 0x2, 0xec, 0x11, 
       0x3, 0x2, 0x2, 0x2, 0xed, 0xef, 0x5, 0x14, 0xb, 0x2, 0xee, 0xf0, 
       0x9, 0x2, 0x2, 0x2, 0xef, 0xee, 0x3, 0x2, 0x2, 0x2, 0xef, 0xf0, 0x3, 
       0x2, 0x2, 0x2, 0xf0, 0xf1, 0x3, 0x2, 0x2, 0x2, 0xf1, 0xf6, 0x5, 0xa4, 
       0x53, 0x2, 0xf2, 0xf3, 0x7, 0x23, 0x2, 0x2, 0xf3, 0xf5, 0x5, 0x12, 
       0xa, 0x2, 0xf4, 0xf2, 0x3, 0x2, 0x2, 0x2, 0xf5, 0xf8, 0x3, 0x2, 0x2, 
       0x2, 0xf6, 0xf4, 0x3, 0x2, 0x2, 0x2, 0xf6, 0xf7, 0x3, 0x2, 0x2, 0x2, 
       0xf7, 0x13, 0x3, 0x2, 0x2, 0x2, 0xf8, 0xf6, 0x3, 0x2, 0x2, 0x2, 0xf9, 
       0xfe, 0x5, 0xa6, 0x54, 0x2, 0xfa, 0xfb, 0x5, 0xa6, 0x54, 0x2, 0xfb, 
       0xfc, 0x7, 0x30, 0x2, 0x2, 0xfc, 0xfe, 0x3, 0x2, 0x2, 0x2, 0xfd, 
       0xf9, 0x3, 0x2, 0x2, 0x2, 0xfd, 0xfa, 0x3, 0x2, 0x2, 0x2, 0xfe, 0xff, 
       0x3, 0x2, 0x2, 0x2, 0xff, 0x100, 0x9, 0x3, 0x2, 0x2, 0x100, 0x15, 
       0x3, 0x2, 0x2, 0x2, 0x101, 0x103, 0x5, 0x18, 0xd, 0x2, 0x102, 0x104, 
       0x5, 0xa6, 0x54, 0x2, 0x103, 0x102, 0x3, 0x2, 0x2, 0x2, 0x103, 0x104, 
       0x3, 0x2, 0x2, 0x2, 0x104, 0x105, 0x3, 0x2, 0x2, 0x2, 0x105, 0x106, 
       0x5, 0x1a, 0xe, 0x2, 0x106, 0x17, 0x3, 0x2, 0x2, 0x2, 0x107, 0x10f, 
       0x5, 0xa6, 0x54, 0x2, 0x108, 0x109, 0x5, 0xa6, 0x54, 0x2, 0x109, 
       0x10a, 0x7, 0x20, 0x2, 0x2, 0x10a, 0x10f, 0x3, 0x2, 0x2, 0x2, 0x10b, 
       0x10c, 0x5, 0xa6, 0x54, 0x2, 0x10c, 0x10d, 0x7, 0x22, 0x2, 0x2, 0x10d, 
       0x10f, 0x3, 0x2, 0x2, 0x2, 0x10e, 0x107, 0x3, 0x2, 0x2, 0x2, 0x10e, 
       0x108, 0x3, 0x2, 0x2, 0x2, 0x10e, 0x10b, 0x3, 0x2, 0x2, 0x2, 0x10f, 
       0x19, 0x3, 0x2, 0x2, 0x2, 0x110, 0x111, 0x7, 0x28, 0x2, 0x2, 0x111, 
       0x117, 0x7, 0x29, 0x2, 0x2, 0x112, 0x113, 0x7, 0x28, 0x2, 0x2, 0x113, 
       0x114, 0x5, 0x1c, 0xf, 0x2, 0x114, 0x115, 0x7, 0x29, 0x2, 0x2, 0x115, 
       0x117, 0x3, 0x2, 0x2, 0x2, 0x116, 0x110, 0x3, 0x2, 0x2, 0x2, 0x116, 
       0x112, 0x3, 0x2, 0x2, 0x2, 0x117, 0x1b, 0x3, 0x2, 0x2, 0x2, 0x118, 
       0x11d, 0x5, 0x9e, 0x50, 0x2, 0x119, 0x11a, 0x7, 0x23, 0x2, 0x2, 0x11a, 
       0x11c, 0x5, 0x1c, 0xf, 0x2, 0x11b, 0x119, 0x3, 0x2, 0x2, 0x2, 0x11c, 
       0x11f, 0x3, 0x2, 0x2, 0x2, 0x11d, 0x11b, 0x3, 0x2, 0x2, 0x2, 0x11d, 
       0x11e, 0x3, 0x2, 0x2, 0x2, 0x11e, 0x1d, 0x3, 0x2, 0x2, 0x2, 0x11f, 
       0x11d, 0x3, 0x2, 0x2, 0x2, 0x120, 0x121, 0x7, 0x9, 0x2, 0x2, 0x121, 
       0x122, 0x5, 0xa4, 0x53, 0x2, 0x122, 0x123, 0x7, 0x1e, 0x2, 0x2, 0x123, 
       0x1f, 0x3, 0x2, 0x2, 0x2, 0x124, 0x126, 0x5, 0x22, 0x12, 0x2, 0x125, 
       0x127, 0x5, 0x24, 0x13, 0x2, 0x126, 0x125, 0x3, 0x2, 0x2, 0x2, 0x126, 
       0x127, 0x3, 0x2, 0x2, 0x2, 0x127, 0x129, 0x3, 0x2, 0x2, 0x2, 0x128, 
       0x12a, 0x5, 0x28, 0x15, 0x2, 0x129, 0x128, 0x3, 0x2, 0x2, 0x2, 0x129, 
       0x12a, 0x3, 0x2, 0x2, 0x2, 0x12a, 0x21, 0x3, 0x2, 0x2, 0x2, 0x12b, 
       0x12c, 0x7, 0x5, 0x2, 0x2, 0x12c, 0x12d, 0x5, 0x2a, 0x16, 0x2, 0x12d, 
       0x12e, 0x5, 0x2c, 0x17, 0x2, 0x12e, 0x23, 0x3, 0x2, 0x2, 0x2, 0x12f, 
       0x133, 0x5, 0x26, 0x14, 0x2, 0x130, 0x132, 0x5, 0x24, 0x13, 0x2, 
       0x131, 0x130, 0x3, 0x2, 0x2, 0x2, 0x132, 0x135, 0x3, 0x2, 0x2, 0x2, 
       0x133, 0x131, 0x3, 0x2, 0x2, 0x2, 0x133, 0x134, 0x3, 0x2, 0x2, 0x2, 
       0x134, 0x25, 0x3, 0x2, 0x2, 0x2, 0x135, 0x133, 0x3, 0x2, 0x2, 0x2, 
       0x136, 0x137, 0x7, 0x6, 0x2, 0x2, 0x137, 0x138, 0x5, 0x2a, 0x16, 
       0x2, 0x138, 0x139, 0x5, 0x2c, 0x17, 0x2, 0x139, 0x27, 0x3, 0x2, 0x2, 
       0x2, 0x13a, 0x13b, 0x7, 0x7, 0x2, 0x2, 0x13b, 0x13c, 0x5, 0x2c, 0x17, 
       0x2, 0x13c, 0x29, 0x3, 0x2, 0x2, 0x2, 0x13d, 0x13e, 0x5, 0xa4, 0x53, 
       0x2, 0x13e, 0x2b, 0x3, 0x2, 0x2, 0x2, 0x13f, 0x140, 0x5, 0x98, 0x4d, 
       0x2, 0x140, 0x2d, 0x3, 0x2, 0x2, 0x2, 0x141, 0x145, 0x7, 0x8, 0x2, 
       0x2, 0x142, 0x146, 0x5, 0x36, 0x1c, 0x2, 0x143, 0x146, 0x5, 0x34, 
       0x1b, 0x2, 0x144, 0x146, 0x5, 0x32, 0x1a, 0x2, 0x145, 0x142, 0x3, 
       0x2, 0x2, 0x2, 0x145, 0x143, 0x3, 0x2, 0x2, 0x2, 0x145, 0x144, 0x3, 
       0x2, 0x2, 0x2, 0x146, 0x147, 0x3, 0x2, 0x2, 0x2, 0x147, 0x148, 0x5, 
       0x30, 0x19, 0x2, 0x148, 0x2f, 0x3, 0x2, 0x2, 0x2, 0x149, 0x14a, 0x5, 
       0x98, 0x4d, 0x2, 0x14a, 0x31, 0x3, 0x2, 0x2, 0x2, 0x14b, 0x14d, 0x7, 
       0x28, 0x2, 0x2, 0x14c, 0x14b, 0x3, 0x2, 0x2, 0x2, 0x14c, 0x14d, 0x3, 
       0x2, 0x2, 0x2, 0x14d, 0x14e, 0x3, 0x2, 0x2, 0x2, 0x14e, 0x14f, 0x5, 
       0x3c, 0x1f, 0x2, 0x14f, 0x150, 0x5, 0x38, 0x1d, 0x2, 0x150, 0x151, 
       0x5, 0x3e, 0x20, 0x2, 0x151, 0x152, 0x5, 0x3a, 0x1e, 0x2, 0x152, 
       0x154, 0x5, 0x40, 0x21, 0x2, 0x153, 0x155, 0x7, 0x29, 0x2, 0x2, 0x154, 
       0x153, 0x3, 0x2, 0x2, 0x2, 0x154, 0x155, 0x3, 0x2, 0x2, 0x2, 0x155, 
       0x33, 0x3, 0x2, 0x2, 0x2, 0x156, 0x157, 0x5, 0x3e, 0x20, 0x2, 0x157, 
       0x35, 0x3, 0x2, 0x2, 0x2, 0x158, 0x159, 0x7, 0x28, 0x2, 0x2, 0x159, 
       0x15c, 0x7, 0x29, 0x2, 0x2, 0x15a, 0x15c, 0x3, 0x2, 0x2, 0x2, 0x15b, 
       0x158, 0x3, 0x2, 0x2, 0x2, 0x15b, 0x15a, 0x3, 0x2, 0x2, 0x2, 0x15c, 
       0x37, 0x3, 0x2, 0x2, 0x2, 0x15d, 0x15e, 0x7, 0x1e, 0x2, 0x2, 0x15e, 
       0x39, 0x3, 0x2, 0x2, 0x2, 0x15f, 0x160, 0x7, 0x1e, 0x2, 0x2, 0x160, 
       0x3b, 0x3, 0x2, 0x2, 0x2, 0x161, 0x162, 0x7, 0x4, 0x2, 0x2, 0x162, 
       0x165, 0x5, 0x12, 0xa, 0x2, 0x163, 0x165, 0x3, 0x2, 0x2, 0x2, 0x164, 
       0x161, 0x3, 0x2, 0x2, 0x2, 0x164, 0x163, 0x3, 0x2, 0x2, 0x2, 0x165, 
       0x3d, 0x3, 0x2, 0x2, 0x2, 0x166, 0x169, 0x5, 0xa4, 0x53, 0x2, 0x167, 
       0x169, 0x3, 0x2, 0x2, 0x2, 0x168, 0x166, 0x3, 0x2, 0x2, 0x2, 0x168, 
       0x167, 0x3, 0x2, 0x2, 0x2, 0x169, 0x3f, 0x3, 0x2, 0x2, 0x2, 0x16a, 
       0x16d, 0x5, 0x42, 0x22, 0x2, 0x16b, 0x16d, 0x3, 0x2, 0x2, 0x2, 0x16c, 
       0x16a, 0x3, 0x2, 0x2, 0x2, 0x16c, 0x16b, 0x3, 0x2, 0x2, 0x2, 0x16d, 
       0x41, 0x3, 0x2, 0x2, 0x2, 0x16e, 0x173, 0x5, 0xa4, 0x53, 0x2, 0x16f, 
       0x170, 0x7, 0x23, 0x2, 0x2, 0x170, 0x172, 0x5, 0xa4, 0x53, 0x2, 0x171, 
       0x16f, 0x3, 0x2, 0x2, 0x2, 0x172, 0x175, 0x3, 0x2, 0x2, 0x2, 0x173, 
       0x171, 0x3, 0x2, 0x2, 0x2, 0x173, 0x174, 0x3, 0x2, 0x2, 0x2, 0x174, 
       0x43, 0x3, 0x2, 0x2, 0x2, 0x175, 0x173, 0x3, 0x2, 0x2, 0x2, 0x176, 
       0x177, 0x7, 0x16, 0x2, 0x2, 0x177, 0x178, 0x7, 0x1e, 0x2, 0x2, 0x178, 
       0x45, 0x3, 0x2, 0x2, 0x2, 0x179, 0x17a, 0x7, 0x17, 0x2, 0x2, 0x17a, 
       0x17b, 0x7, 0x1e, 0x2, 0x2, 0x17b, 0x47, 0x3, 0x2, 0x2, 0x2, 0x17c, 
       0x17e, 0x5, 0x4a, 0x26, 0x2, 0x17d, 0x17f, 0x5, 0x4c, 0x27, 0x2, 
       0x17e, 0x17d, 0x3, 0x2, 0x2, 0x2, 0x17e, 0x17f, 0x3, 0x2, 0x2, 0x2, 
       0x17f, 0x49, 0x3, 0x2, 0x2, 0x2, 0x180, 0x181, 0x7, 0x1a, 0x2, 0x2, 
       0x181, 0x182, 0x5, 0x4e, 0x28, 0x2, 0x182, 0x4b, 0x3, 0x2, 0x2, 0x2, 
       0x183, 0x185, 0x7, 0x1b, 0x2, 0x2, 0x184, 0x186, 0x7, 0x28, 0x2, 
       0x2, 0x185, 0x184, 0x3, 0x2, 0x2, 0x2, 0x185, 0x186, 0x3, 0x2, 0x2, 
       0x2, 0x186, 0x187, 0x3, 0x2, 0x2, 0x2, 0x187, 0x189, 0x5, 0xa6, 0x54, 
       0x2, 0x188, 0x18a, 0x7, 0x29, 0x2, 0x2, 0x189, 0x188, 0x3, 0x2, 0x2, 
       0x2, 0x189, 0x18a, 0x3, 0x2, 0x2, 0x2, 0x18a, 0x18b, 0x3, 0x2, 0x2, 
       0x2, 0x18b, 0x18c, 0x5, 0x4e, 0x28, 0x2, 0x18c, 0x4d, 0x3, 0x2, 0x2, 
       0x2, 0x18d, 0x18e, 0x5, 0x98, 0x4d, 0x2, 0x18e, 0x4f, 0x3, 0x2, 0x2, 
       0x2, 0x18f, 0x190, 0x7, 0x28, 0x2, 0x2, 0x190, 0x192, 0x7, 0xa, 0x2, 
       0x2, 0x191, 0x193, 0x5, 0xa6, 0x54, 0x2, 0x192, 0x191, 0x3, 0x2, 
       0x2, 0x2, 0x192, 0x193, 0x3, 0x2, 0x2, 0x2, 0x193, 0x194, 0x3, 0x2, 
       0x2, 0x2, 0x194, 0x196, 0x7, 0x28, 0x2, 0x2, 0x195, 0x197, 0x5, 0x54, 
       0x2b, 0x2, 0x196, 0x195, 0x3, 0x2, 0x2, 0x2, 0x196, 0x197, 0x3, 0x2, 
       0x2, 0x2, 0x197, 0x198, 0x3, 0x2, 0x2, 0x2, 0x198, 0x19e, 0x7, 0x29, 
       0x2, 0x2, 0x199, 0x19c, 0x7, 0x1c, 0x2, 0x2, 0x19a, 0x19d, 0x5, 0xa8, 
       0x55, 0x2, 0x19b, 0x19d, 0x7, 0x30, 0x2, 0x2, 0x19c, 0x19a, 0x3, 
       0x2, 0x2, 0x2, 0x19c, 0x19b, 0x3, 0x2, 0x2, 0x2, 0x19d, 0x19f, 0x3, 
       0x2, 0x2, 0x2, 0x19e, 0x199, 0x3, 0x2, 0x2, 0x2, 0x19e, 0x19f, 0x3, 
       0x2, 0x2, 0x2, 0x19f, 0x1a0, 0x3, 0x2, 0x2, 0x2, 0x1a0, 0x1a1, 0x5, 
       0x58, 0x2d, 0x2, 0x1a1, 0x1a2, 0x7, 0x29, 0x2, 0x2, 0x1a2, 0x1a4, 
       0x7, 0x28, 0x2, 0x2, 0x1a3, 0x1a5, 0x5, 0x56, 0x2c, 0x2, 0x1a4, 0x1a3, 
       0x3, 0x2, 0x2, 0x2, 0x1a4, 0x1a5, 0x3, 0x2, 0x2, 0x2, 0x1a5, 0x1a6, 
       0x3, 0x2, 0x2, 0x2, 0x1a6, 0x1a7, 0x7, 0x29, 0x2, 0x2, 0x1a7, 0x1a8, 
       0x7, 0x1e, 0x2, 0x2, 0x1a8, 0x1be, 0x3, 0x2, 0x2, 0x2, 0x1a9, 0x1ab, 
       0x7, 0xa, 0x2, 0x2, 0x1aa, 0x1ac, 0x5, 0xa6, 0x54, 0x2, 0x1ab, 0x1aa, 
       0x3, 0x2, 0x2, 0x2, 0x1ab, 0x1ac, 0x3, 0x2, 0x2, 0x2, 0x1ac, 0x1ad, 
       0x3, 0x2, 0x2, 0x2, 0x1ad, 0x1af, 0x7, 0x28, 0x2, 0x2, 0x1ae, 0x1b0, 
       0x5, 0x54, 0x2b, 0x2, 0x1af, 0x1ae, 0x3, 0x2, 0x2, 0x2, 0x1af, 0x1b0, 
       0x3, 0x2, 0x2, 0x2, 0x1b0, 0x1b1, 0x3, 0x2, 0x2, 0x2, 0x1b1, 0x1b7, 
       0x7, 0x29, 0x2, 0x2, 0x1b2, 0x1b5, 0x7, 0x1c, 0x2, 0x2, 0x1b3, 0x1b6, 
       0x5, 0xa8, 0x55, 0x2, 0x1b4, 0x1b6, 0x7, 0x30, 0x2, 0x2, 0x1b5, 0x1b3, 
       0x3, 0x2, 0x2, 0x2, 0x1b5, 0x1b4, 0x3, 0x2, 0x2, 0x2, 0x1b6, 0x1b8, 
       0x3, 0x2, 0x2, 0x2, 0x1b7, 0x1b2, 0x3, 0x2, 0x2, 0x2, 0x1b7, 0x1b8, 
       0x3, 0x2, 0x2, 0x2, 0x1b8, 0x1bb, 0x3, 0x2, 0x2, 0x2, 0x1b9, 0x1bc, 
       0x5, 0x58, 0x2d, 0x2, 0x1ba, 0x1bc, 0x7, 0x1e, 0x2, 0x2, 0x1bb, 0x1b9, 
       0x3, 0x2, 0x2, 0x2, 0x1bb, 0x1ba, 0x3, 0x2, 0x2, 0x2, 0x1bc, 0x1be, 
       0x3, 0x2, 0x2, 0x2, 0x1bd, 0x18f, 0x3, 0x2, 0x2, 0x2, 0x1bd, 0x1a9, 
       0x3, 0x2, 0x2, 0x2, 0x1be, 0x51, 0x3, 0x2, 0x2, 0x2, 0x1bf, 0x1c0, 
       0x7, 0x28, 0x2, 0x2, 0x1c0, 0x1c2, 0x7, 0xa, 0x2, 0x2, 0x1c1, 0x1c3, 
       0x5, 0xa6, 0x54, 0x2, 0x1c2, 0x1c1, 0x3, 0x2, 0x2, 0x2, 0x1c2, 0x1c3, 
       0x3, 0x2, 0x2, 0x2, 0x1c3, 0x1c4, 0x3, 0x2, 0x2, 0x2, 0x1c4, 0x1c6, 
       0x7, 0x28, 0x2, 0x2, 0x1c5, 0x1c7, 0x5, 0x54, 0x2b, 0x2, 0x1c6, 0x1c5, 
       0x3, 0x2, 0x2, 0x2, 0x1c6, 0x1c7, 0x3, 0x2, 0x2, 0x2, 0x1c7, 0x1c8, 
       0x3, 0x2, 0x2, 0x2, 0x1c8, 0x1ce, 0x7, 0x29, 0x2, 0x2, 0x1c9, 0x1cc, 
       0x7, 0x1c, 0x2, 0x2, 0x1ca, 0x1cd, 0x5, 0xa8, 0x55, 0x2, 0x1cb, 0x1cd, 
       0x7, 0x30, 0x2, 0x2, 0x1cc, 0x1ca, 0x3, 0x2, 0x2, 0x2, 0x1cc, 0x1cb, 
       0x3, 0x2, 0x2, 0x2, 0x1cd, 0x1cf, 0x3, 0x2, 0x2, 0x2, 0x1ce, 0x1c9, 
       0x3, 0x2, 0x2, 0x2, 0x1ce, 0x1cf, 0x3, 0x2, 0x2, 0x2, 0x1cf, 0x1d0, 
       0x3, 0x2, 0x2, 0x2, 0x1d0, 0x1d1, 0x5, 0x58, 0x2d, 0x2, 0x1d1, 0x1d2, 
       0x7, 0x29, 0x2, 0x2, 0x1d2, 0x1d4, 0x7, 0x28, 0x2, 0x2, 0x1d3, 0x1d5, 
       0x5, 0x56, 0x2c, 0x2, 0x1d4, 0x1d3, 0x3, 0x2, 0x2, 0x2, 0x1d4, 0x1d5, 
       0x3, 0x2, 0x2, 0x2, 0x1d5, 0x1d6, 0x3, 0x2, 0x2, 0x2, 0x1d6, 0x1d7, 
       0x7, 0x29, 0x2, 0x2, 0x1d7, 0x1ea, 0x3, 0x2, 0x2, 0x2, 0x1d8, 0x1da, 
       0x7, 0xa, 0x2, 0x2, 0x1d9, 0x1db, 0x5, 0xa6, 0x54, 0x2, 0x1da, 0x1d9, 
       0x3, 0x2, 0x2, 0x2, 0x1da, 0x1db, 0x3, 0x2, 0x2, 0x2, 0x1db, 0x1dc, 
       0x3, 0x2, 0x2, 0x2, 0x1dc, 0x1de, 0x7, 0x28, 0x2, 0x2, 0x1dd, 0x1df, 
       0x5, 0x54, 0x2b, 0x2, 0x1de, 0x1dd, 0x3, 0x2, 0x2, 0x2, 0x1de, 0x1df, 
       0x3, 0x2, 0x2, 0x2, 0x1df, 0x1e0, 0x3, 0x2, 0x2, 0x2, 0x1e0, 0x1e6, 
       0x7, 0x29, 0x2, 0x2, 0x1e1, 0x1e4, 0x7, 0x1c, 0x2, 0x2, 0x1e2, 0x1e5, 
       0x5, 0xa8, 0x55, 0x2, 0x1e3, 0x1e5, 0x7, 0x30, 0x2, 0x2, 0x1e4, 0x1e2, 
       0x3, 0x2, 0x2, 0x2, 0x1e4, 0x1e3, 0x3, 0x2, 0x2, 0x2, 0x1e5, 0x1e7, 
       0x3, 0x2, 0x2, 0x2, 0x1e6, 0x1e1, 0x3, 0x2, 0x2, 0x2, 0x1e6, 0x1e7, 
       0x3, 0x2, 0x2, 0x2, 0x1e7, 0x1e8, 0x3, 0x2, 0x2, 0x2, 0x1e8, 0x1ea, 
       0x5, 0x58, 0x2d, 0x2, 0x1e9, 0x1bf, 0x3, 0x2, 0x2, 0x2, 0x1e9, 0x1d8, 
       0x3, 0x2, 0x2, 0x2, 0x1ea, 0x53, 0x3, 0x2, 0x2, 0x2, 0x1eb, 0x1ec, 
       0x7, 0x2e, 0x2, 0x2, 0x1ec, 0x1ef, 0x7, 0x30, 0x2, 0x2, 0x1ed, 0x1ee, 
       0x7, 0x23, 0x2, 0x2, 0x1ee, 0x1f0, 0x5, 0x54, 0x2b, 0x2, 0x1ef, 0x1ed, 
       0x3, 0x2, 0x2, 0x2, 0x1ef, 0x1f0, 0x3, 0x2, 0x2, 0x2, 0x1f0, 0x55, 
       0x3, 0x2, 0x2, 0x2, 0x1f1, 0x1f2, 0x5, 0xa4, 0x53, 0x2, 0x1f2, 0x57, 
       0x3, 0x2, 0x2, 0x2, 0x1f3, 0x1f4, 0x5, 0x9c, 0x4f, 0x2, 0x1f4, 0x59, 
       0x3, 0x2, 0x2, 0x2, 0x1f5, 0x1f6, 0x7, 0x10, 0x2, 0x2, 0x1f6, 0x1f9, 
       0x5, 0xa6, 0x54, 0x2, 0x1f7, 0x1f8, 0x7, 0x12, 0x2, 0x2, 0x1f8, 0x1fa, 
       0x5, 0xa8, 0x55, 0x2, 0x1f9, 0x1f7, 0x3, 0x2, 0x2, 0x2, 0x1f9, 0x1fa, 
       0x3, 0x2, 0x2, 0x2, 0x1fa, 0x1fb, 0x3, 0x2, 0x2, 0x2, 0x1fb, 0x1fc, 
       0x5, 0x5c, 0x2f, 0x2, 0x1fc, 0x5b, 0x3, 0x2, 0x2, 0x2, 0x1fd, 0x1fe, 
       0x5, 0x9c, 0x4f, 0x2, 0x1fe, 0x5d, 0x3, 0x2, 0x2, 0x2, 0x1ff, 0x200, 
       0x7, 0x11, 0x2, 0x2, 0x200, 0x203, 0x5, 0xa6, 0x54, 0x2, 0x201, 0x202, 
       0x7, 0x12, 0x2, 0x2, 0x202, 0x204, 0x5, 0xa8, 0x55, 0x2, 0x203, 0x201, 
       0x3, 0x2, 0x2, 0x2, 0x203, 0x204, 0x3, 0x2, 0x2, 0x2, 0x204, 0x205, 
       0x3, 0x2, 0x2, 0x2, 0x205, 0x206, 0x5, 0x60, 0x31, 0x2, 0x206, 0x5f, 
       0x3, 0x2, 0x2, 0x2, 0x207, 0x208, 0x5, 0x9c, 0x4f, 0x2, 0x208, 0x61, 
       0x3, 0x2, 0x2, 0x2, 0x209, 0x20a, 0x5, 0xb2, 0x5a, 0x2, 0x20a, 0x20b, 
       0x7, 0x15, 0x2, 0x2, 0x20b, 0x20d, 0x7, 0x13, 0x2, 0x2, 0x20c, 0x20e, 
       0x5, 0xa6, 0x54, 0x2, 0x20d, 0x20c, 0x3, 0x2, 0x2, 0x2, 0x20d, 0x20e, 
       0x3, 0x2, 0x2, 0x2, 0x20e, 0x211, 0x3, 0x2, 0x2, 0x2, 0x20f, 0x210, 
       0x7, 0x12, 0x2, 0x2, 0x210, 0x212, 0x5, 0xa8, 0x55, 0x2, 0x211, 0x20f, 
       0x3, 0x2, 0x2, 0x2, 0x211, 0x212, 0x3, 0x2, 0x2, 0x2, 0x212, 0x215, 
       0x3, 0x2, 0x2, 0x2, 0x213, 0x214, 0x7, 0x14, 0x2, 0x2, 0x214, 0x216, 
       0x5, 0xaa, 0x56, 0x2, 0x215, 0x213, 0x3, 0x2, 0x2, 0x2, 0x215, 0x216, 
       0x3, 0x2, 0x2, 0x2, 0x216, 0x217, 0x3, 0x2, 0x2, 0x2, 0x217, 0x218, 
       0x5, 0x68, 0x35, 0x2, 0x218, 0x221, 0x5, 0xb4, 0x5b, 0x2, 0x219, 
       0x21a, 0x9, 0x4, 0x2, 0x2, 0x21a, 0x21b, 0x5, 0xac, 0x57, 0x2, 0x21b, 
       0x21d, 0x7, 0x28, 0x2, 0x2, 0x21c, 0x21e, 0x5, 0xa4, 0x53, 0x2, 0x21d, 
       0x21c, 0x3, 0x2, 0x2, 0x2, 0x21d, 0x21e, 0x3, 0x2, 0x2, 0x2, 0x21e, 
       0x21f, 0x3, 0x2, 0x2, 0x2, 0x21f, 0x220, 0x7, 0x29, 0x2, 0x2, 0x220, 
       0x222, 0x3, 0x2, 0x2, 0x2, 0x221, 0x219, 0x3, 0x2, 0x2, 0x2, 0x221, 
       0x222, 0x3, 0x2, 0x2, 0x2, 0x222, 0x223, 0x3, 0x2, 0x2, 0x2, 0x223, 
       0x224, 0x7, 0x1e, 0x2, 0x2, 0x224, 0x233, 0x3, 0x2, 0x2, 0x2, 0x225, 
       0x227, 0x7, 0x13, 0x2, 0x2, 0x226, 0x228, 0x5, 0xa6, 0x54, 0x2, 0x227, 
       0x226, 0x3, 0x2, 0x2, 0x2, 0x227, 0x228, 0x3, 0x2, 0x2, 0x2, 0x228, 
       0x22b, 0x3, 0x2, 0x2, 0x2, 0x229, 0x22a, 0x7, 0x12, 0x2, 0x2, 0x22a, 
       0x22c, 0x5, 0xa8, 0x55, 0x2, 0x22b, 0x229, 0x3, 0x2, 0x2, 0x2, 0x22b, 
       0x22c, 0x3, 0x2, 0x2, 0x2, 0x22c, 0x22f, 0x3, 0x2, 0x2, 0x2, 0x22d, 
       0x22e, 0x7, 0x14, 0x2, 0x2, 0x22e, 0x230, 0x5, 0xaa, 0x56, 0x2, 0x22f, 
       0x22d, 0x3, 0x2, 0x2, 0x2, 0x22f, 0x230, 0x3, 0x2, 0x2, 0x2, 0x230, 
       0x231, 0x3, 0x2, 0x2, 0x2, 0x231, 0x233, 0x5, 0x68, 0x35, 0x2, 0x232, 
       0x209, 0x3, 0x2, 0x2, 0x2, 0x232, 0x225, 0x3, 0x2, 0x2, 0x2, 0x233, 
       0x63, 0x3, 0x2, 0x2, 0x2, 0x234, 0x235, 0x5, 0xb2, 0x5a, 0x2, 0x235, 
       0x236, 0x7, 0x15, 0x2, 0x2, 0x236, 0x238, 0x7, 0x13, 0x2, 0x2, 0x237, 
       0x239, 0x5, 0xa6, 0x54, 0x2, 0x238, 0x237, 0x3, 0x2, 0x2, 0x2, 0x238, 
       0x239, 0x3, 0x2, 0x2, 0x2, 0x239, 0x23c, 0x3, 0x2, 0x2, 0x2, 0x23a, 
       0x23b, 0x7, 0x12, 0x2, 0x2, 0x23b, 0x23d, 0x5, 0xa8, 0x55, 0x2, 0x23c, 
       0x23a, 0x3, 0x2, 0x2, 0x2, 0x23c, 0x23d, 0x3, 0x2, 0x2, 0x2, 0x23d, 
       0x240, 0x3, 0x2, 0x2, 0x2, 0x23e, 0x23f, 0x7, 0x14, 0x2, 0x2, 0x23f, 
       0x241, 0x5, 0xaa, 0x56, 0x2, 0x240, 0x23e, 0x3, 0x2, 0x2, 0x2, 0x240, 
       0x241, 0x3, 0x2, 0x2, 0x2, 0x241, 0x242, 0x3, 0x2, 0x2, 0x2, 0x242, 
       0x243, 0x5, 0x68, 0x35, 0x2, 0x243, 0x24c, 0x5, 0xb4, 0x5b, 0x2, 
       0x244, 0x245, 0x9, 0x4, 0x2, 0x2, 0x245, 0x246, 0x5, 0xac, 0x57, 
       0x2, 0x246, 0x248, 0x7, 0x28, 0x2, 0x2, 0x247, 0x249, 0x5, 0xa4, 
       0x53, 0x2, 0x248, 0x247, 0x3, 0x2, 0x2, 0x2, 0x248, 0x249, 0x3, 0x2, 
       0x2, 0x2, 0x249, 0x24a, 0x3, 0x2, 0x2, 0x2, 0x24a, 0x24b, 0x7, 0x29, 
       0x2, 0x2, 0x24b, 0x24d, 0x3, 0x2, 0x2, 0x2, 0x24c, 0x244, 0x3, 0x2, 
       0x2, 0x2, 0x24c, 0x24d, 0x3, 0x2, 0x2, 0x2, 0x24d, 0x25c, 0x3, 0x2, 
       0x2, 0x2, 0x24e, 0x250, 0x7, 0x13, 0x2, 0x2, 0x24f, 0x251, 0x5, 0xa6, 
       0x54, 0x2, 0x250, 0x24f, 0x3, 0x2, 0x2, 0x2, 0x250, 0x251, 0x3, 0x2, 
       0x2, 0x2, 0x251, 0x254, 0x3, 0x2, 0x2, 0x2, 0x252, 0x253, 0x7, 0x12, 
       0x2, 0x2, 0x253, 0x255, 0x5, 0xa8, 0x55, 0x2, 0x254, 0x252, 0x3, 
       0x2, 0x2, 0x2, 0x254, 0x255, 0x3, 0x2, 0x2, 0x2, 0x255, 0x258, 0x3, 
       0x2, 0x2, 0x2, 0x256, 0x257, 0x7, 0x14, 0x2, 0x2, 0x257, 0x259, 0x5, 
       0xaa, 0x56, 0x2, 0x258, 0x256, 0x3, 0x2, 0x2, 0x2, 0x258, 0x259, 
       0x3, 0x2, 0x2, 0x2, 0x259, 0x25a, 0x3, 0x2, 0x2, 0x2, 0x25a, 0x25c, 
       0x5, 0x68, 0x35, 0x2, 0x25b, 0x234, 0x3, 0x2, 0x2, 0x2, 0x25b, 0x24e, 
       0x3, 0x2, 0x2, 0x2, 0x25c, 0x65, 0x3, 0x2, 0x2, 0x2, 0x25d, 0x25e, 
       0x5, 0xa4, 0x53, 0x2, 0x25e, 0x67, 0x3, 0x2, 0x2, 0x2, 0x25f, 0x260, 
       0x5, 0x9c, 0x4f, 0x2, 0x260, 0x69, 0x3, 0x2, 0x2, 0x2, 0x261, 0x264, 
       0x5, 0x6c, 0x37, 0x2, 0x262, 0x264, 0x5, 0x70, 0x39, 0x2, 0x263, 
       0x261, 0x3, 0x2, 0x2, 0x2, 0x263, 0x262, 0x3, 0x2, 0x2, 0x2, 0x264, 
       0x6b, 0x3, 0x2, 0x2, 0x2, 0x265, 0x266, 0x7, 0x24, 0x2, 0x2, 0x266, 
       0x267, 0x5, 0x6e, 0x38, 0x2, 0x267, 0x268, 0x7, 0x25, 0x2, 0x2, 0x268, 
       0x6d, 0x3, 0x2, 0x2, 0x2, 0x269, 0x26e, 0x5, 0xa4, 0x53, 0x2, 0x26a, 
       0x26b, 0x7, 0x23, 0x2, 0x2, 0x26b, 0x26d, 0x5, 0x6e, 0x38, 0x2, 0x26c, 
       0x26a, 0x3, 0x2, 0x2, 0x2, 0x26d, 0x270, 0x3, 0x2, 0x2, 0x2, 0x26e, 
       0x26c, 0x3, 0x2, 0x2, 0x2, 0x26e, 0x26f, 0x3, 0x2, 0x2, 0x2, 0x26f, 
       0x6f, 0x3, 0x2, 0x2, 0x2, 0x270, 0x26e, 0x3, 0x2, 0x2, 0x2, 0x271, 
       0x272, 0x7, 0x26, 0x2, 0x2, 0x272, 0x273, 0x5, 0x72, 0x3a, 0x2, 0x273, 
       0x274, 0x7, 0x27, 0x2, 0x2, 0x274, 0x71, 0x3, 0x2, 0x2, 0x2, 0x275, 
       0x276, 0x5, 0xa6, 0x54, 0x2, 0x276, 0x277, 0x7, 0x21, 0x2, 0x2, 0x277, 
       0x27c, 0x5, 0xa4, 0x53, 0x2, 0x278, 0x279, 0x7, 0x23, 0x2, 0x2, 0x279, 
       0x27b, 0x5, 0x72, 0x3a, 0x2, 0x27a, 0x278, 0x3, 0x2, 0x2, 0x2, 0x27b, 
       0x27e, 0x3, 0x2, 0x2, 0x2, 0x27c, 0x27a, 0x3, 0x2, 0x2, 0x2, 0x27c, 
       0x27d, 0x3, 0x2, 0x2, 0x2, 0x27d, 0x73, 0x3, 0x2, 0x2, 0x2, 0x27e, 
       0x27c, 0x3, 0x2, 0x2, 0x2, 0x27f, 0x281, 0x7, 0x28, 0x2, 0x2, 0x280, 
       0x282, 0x5, 0x76, 0x3c, 0x2, 0x281, 0x280, 0x3, 0x2, 0x2, 0x2, 0x281, 
       0x282, 0x3, 0x2, 0x2, 0x2, 0x282, 0x283, 0x3, 0x2, 0x2, 0x2, 0x283, 
       0x289, 0x7, 0x29, 0x2, 0x2, 0x284, 0x287, 0x7, 0x1c, 0x2, 0x2, 0x285, 
       0x288, 0x5, 0xa6, 0x54, 0x2, 0x286, 0x288, 0x7, 0x30, 0x2, 0x2, 0x287, 
       0x285, 0x3, 0x2, 0x2, 0x2, 0x287, 0x286, 0x3, 0x2, 0x2, 0x2, 0x288, 
       0x28a, 0x3, 0x2, 0x2, 0x2, 0x289, 0x284, 0x3, 0x2, 0x2, 0x2, 0x289, 
       0x28a, 0x3, 0x2, 0x2, 0x2, 0x28a, 0x28b, 0x3, 0x2, 0x2, 0x2, 0x28b, 
       0x28c, 0x7, 0x1d, 0x2, 0x2, 0x28c, 0x28d, 0x5, 0x78, 0x3d, 0x2, 0x28d, 
       0x75, 0x3, 0x2, 0x2, 0x2, 0x28e, 0x290, 0x5, 0xa6, 0x54, 0x2, 0x28f, 
       0x291, 0x7, 0x30, 0x2, 0x2, 0x290, 0x28f, 0x3, 0x2, 0x2, 0x2, 0x290, 
       0x291, 0x3, 0x2, 0x2, 0x2, 0x291, 0x296, 0x3, 0x2, 0x2, 0x2, 0x292, 
       0x293, 0x7, 0x23, 0x2, 0x2, 0x293, 0x295, 0x5, 0x76, 0x3c, 0x2, 0x294, 
       0x292, 0x3, 0x2, 0x2, 0x2, 0x295, 0x298, 0x3, 0x2, 0x2, 0x2, 0x296, 
       0x294, 0x3, 0x2, 0x2, 0x2, 0x296, 0x297, 0x3, 0x2, 0x2, 0x2, 0x297, 
       0x77, 0x3, 0x2, 0x2, 0x2, 0x298, 0x296, 0x3, 0x2, 0x2, 0x2, 0x299, 
       0x29c, 0x5, 0x9c, 0x4f, 0x2, 0x29a, 0x29c, 0x5, 0xa4, 0x53, 0x2, 
       0x29b, 0x299, 0x3, 0x2, 0x2, 0x2, 0x29b, 0x29a, 0x3, 0x2, 0x2, 0x2, 
       0x29c, 0x79, 0x3, 0x2, 0x2, 0x2, 0x29d, 0x29e, 0x5, 0xa6, 0x54, 0x2, 
       0x29e, 0x2a0, 0x7, 0x28, 0x2, 0x2, 0x29f, 0x2a1, 0x5, 0x54, 0x2b, 
       0x2, 0x2a0, 0x29f, 0x3, 0x2, 0x2, 0x2, 0x2a0, 0x2a1, 0x3, 0x2, 0x2, 
       0x2, 0x2a1, 0x2a2, 0x3, 0x2, 0x2, 0x2, 0x2a2, 0x2a3, 0x7, 0x29, 0x2, 
       0x2, 0x2a3, 0x2a4, 0x5, 0x9c, 0x4f, 0x2, 0x2a4, 0x7b, 0x3, 0x2, 0x2, 
       0x2, 0x2a5, 0x2a8, 0x5, 0xa6, 0x54, 0x2, 0x2a6, 0x2a7, 0x9, 0x4, 
       0x2, 0x2, 0x2a7, 0x2a9, 0x5, 0xa8, 0x55, 0x2, 0x2a8, 0x2a6, 0x3, 
       0x2, 0x2, 0x2, 0x2a8, 0x2a9, 0x3, 0x2, 0x2, 0x2, 0x2a9, 0x2aa, 0x3, 
       0x2, 0x2, 0x2, 0x2aa, 0x2ac, 0x7, 0x28, 0x2, 0x2, 0x2ab, 0x2ad, 0x5, 
       0x7e, 0x40, 0x2, 0x2ac, 0x2ab, 0x3, 0x2, 0x2, 0x2, 0x2ac, 0x2ad, 
       0x3, 0x2, 0x2, 0x2, 0x2ad, 0x2ae, 0x3, 0x2, 0x2, 0x2, 0x2ae, 0x2af, 
       0x7, 0x29, 0x2, 0x2, 0x2af, 0x2b0, 0x7, 0x1e, 0x2, 0x2, 0x2b0, 0x7d, 
       0x3, 0x2, 0x2, 0x2, 0x2b1, 0x2b6, 0x5, 0xa4, 0x53, 0x2, 0x2b2, 0x2b3, 
       0x7, 0x23, 0x2, 0x2, 0x2b3, 0x2b5, 0x5, 0x7e, 0x40, 0x2, 0x2b4, 0x2b2, 
       0x3, 0x2, 0x2, 0x2, 0x2b5, 0x2b8, 0x3, 0x2, 0x2, 0x2, 0x2b6, 0x2b4, 
       0x3, 0x2, 0x2, 0x2, 0x2b6, 0x2b7, 0x3, 0x2, 0x2, 0x2, 0x2b7, 0x7f, 
       0x3, 0x2, 0x2, 0x2, 0x2b8, 0x2b6, 0x3, 0x2, 0x2, 0x2, 0x2b9, 0x2ba, 
       0x5, 0x82, 0x42, 0x2, 0x2ba, 0x2bb, 0x7, 0x1e, 0x2, 0x2, 0x2bb, 0x81, 
       0x3, 0x2, 0x2, 0x2, 0x2bc, 0x2bf, 0x5, 0xa6, 0x54, 0x2, 0x2bd, 0x2be, 
       0x9, 0x4, 0x2, 0x2, 0x2be, 0x2c0, 0x5, 0xa8, 0x55, 0x2, 0x2bf, 0x2bd, 
       0x3, 0x2, 0x2, 0x2, 0x2bf, 0x2c0, 0x3, 0x2, 0x2, 0x2, 0x2c0, 0x2c1, 
       0x3, 0x2, 0x2, 0x2, 0x2c1, 0x2c3, 0x9, 0x3, 0x2, 0x2, 0x2c2, 0x2c4, 
       0x9, 0x2, 0x2, 0x2, 0x2c3, 0x2c2, 0x3, 0x2, 0x2, 0x2, 0x2c3, 0x2c4, 
       0x3, 0x2, 0x2, 0x2, 0x2c4, 0x2c5, 0x3, 0x2, 0x2, 0x2, 0x2c5, 0x2ca, 
       0x5, 0xa4, 0x53, 0x2, 0x2c6, 0x2c7, 0x7, 0x23, 0x2, 0x2, 0x2c7, 0x2c9, 
       0x5, 0x82, 0x42, 0x2, 0x2c8, 0x2c6, 0x3, 0x2, 0x2, 0x2, 0x2c9, 0x2cc, 
       0x3, 0x2, 0x2, 0x2, 0x2ca, 0x2c8, 0x3, 0x2, 0x2, 0x2, 0x2ca, 0x2cb, 
       0x3, 0x2, 0x2, 0x2, 0x2cb, 0x83, 0x3, 0x2, 0x2, 0x2, 0x2cc, 0x2ca, 
       0x3, 0x2, 0x2, 0x2, 0x2cd, 0x2ce, 0x5, 0x86, 0x44, 0x2, 0x2ce, 0x2cf, 
       0x7, 0x1f, 0x2, 0x2, 0x2cf, 0x2d0, 0x5, 0xa4, 0x53, 0x2, 0x2d0, 0x2d1, 
       0x7, 0x1e, 0x2, 0x2, 0x2d1, 0x85, 0x3, 0x2, 0x2, 0x2, 0x2d2, 0x2d7, 
       0x5, 0x9e, 0x50, 0x2, 0x2d3, 0x2d4, 0x7, 0x1f, 0x2, 0x2, 0x2d4, 0x2d6, 
       0x5, 0x86, 0x44, 0x2, 0x2d5, 0x2d3, 0x3, 0x2, 0x2, 0x2, 0x2d6, 0x2d9, 
       0x3, 0x2, 0x2, 0x2, 0x2d7, 0x2d5, 0x3, 0x2, 0x2, 0x2, 0x2d7, 0x2d8, 
       0x3, 0x2, 0x2, 0x2, 0x2d8, 0x87, 0x3, 0x2, 0x2, 0x2, 0x2d9, 0x2d7, 
       0x3, 0x2, 0x2, 0x2, 0x2da, 0x2db, 0x5, 0x8a, 0x46, 0x2, 0x2db, 0x89, 
       0x3, 0x2, 0x2, 0x2, 0x2dc, 0x2e0, 0x5, 0x8c, 0x47, 0x2, 0x2dd, 0x2df, 
       0x5, 0x8a, 0x46, 0x2, 0x2de, 0x2dd, 0x3, 0x2, 0x2, 0x2, 0x2df, 0x2e2, 
       0x3, 0x2, 0x2, 0x2, 0x2e0, 0x2de, 0x3, 0x2, 0x2, 0x2, 0x2e0, 0x2e1, 
       0x3, 0x2, 0x2, 0x2, 0x2e1, 0x8b, 0x3, 0x2, 0x2, 0x2, 0x2e2, 0x2e0, 
       0x3, 0x2, 0x2, 0x2, 0x2e3, 0x2e5, 0x5, 0xa6, 0x54, 0x2, 0x2e4, 0x2e6, 
       0x5, 0x8e, 0x48, 0x2, 0x2e5, 0x2e4, 0x3, 0x2, 0x2, 0x2, 0x2e5, 0x2e6, 
       0x3, 0x2, 0x2, 0x2, 0x2e6, 0x2e8, 0x3, 0x2, 0x2, 0x2, 0x2e7, 0x2e9, 
       0x7, 0x20, 0x2, 0x2, 0x2e8, 0x2e7, 0x3, 0x2, 0x2, 0x2, 0x2e8, 0x2e9, 
       0x3, 0x2, 0x2, 0x2, 0x2e9, 0x2ff, 0x3, 0x2, 0x2, 0x2, 0x2ea, 0x2ec, 
       0x5, 0x92, 0x4a, 0x2, 0x2eb, 0x2ea, 0x3, 0x2, 0x2, 0x2, 0x2eb, 0x2ec, 
       0x3, 0x2, 0x2, 0x2, 0x2ec, 0x2ed, 0x3, 0x2, 0x2, 0x2, 0x2ed, 0x2ef, 
       0x5, 0xa6, 0x54, 0x2, 0x2ee, 0x2f0, 0x5, 0x8e, 0x48, 0x2, 0x2ef, 
       0x2ee, 0x3, 0x2, 0x2, 0x2, 0x2ef, 0x2f0, 0x3, 0x2, 0x2, 0x2, 0x2f0, 
       0x2f2, 0x3, 0x2, 0x2, 0x2, 0x2f1, 0x2f3, 0x7, 0x20, 0x2, 0x2, 0x2f2, 
       0x2f1, 0x3, 0x2, 0x2, 0x2, 0x2f2, 0x2f3, 0x3, 0x2, 0x2, 0x2, 0x2f3, 
       0x2ff, 0x3, 0x2, 0x2, 0x2, 0x2f4, 0x2f6, 0x5, 0xa6, 0x54, 0x2, 0x2f5, 
       0x2f7, 0x5, 0x8e, 0x48, 0x2, 0x2f6, 0x2f5, 0x3, 0x2, 0x2, 0x2, 0x2f6, 
       0x2f7, 0x3, 0x2, 0x2, 0x2, 0x2f7, 0x2f9, 0x3, 0x2, 0x2, 0x2, 0x2f8, 
       0x2fa, 0x5, 0x94, 0x4b, 0x2, 0x2f9, 0x2f8, 0x3, 0x2, 0x2, 0x2, 0x2f9, 
       0x2fa, 0x3, 0x2, 0x2, 0x2, 0x2fa, 0x2fc, 0x3, 0x2, 0x2, 0x2, 0x2fb, 
       0x2fd, 0x7, 0x20, 0x2, 0x2, 0x2fc, 0x2fb, 0x3, 0x2, 0x2, 0x2, 0x2fc, 
       0x2fd, 0x3, 0x2, 0x2, 0x2, 0x2fd, 0x2ff, 0x3, 0x2, 0x2, 0x2, 0x2fe, 
       0x2e3, 0x3, 0x2, 0x2, 0x2, 0x2fe, 0x2eb, 0x3, 0x2, 0x2, 0x2, 0x2fe, 
       0x2f4, 0x3, 0x2, 0x2, 0x2, 0x2ff, 0x8d, 0x3, 0x2, 0x2, 0x2, 0x300, 
       0x301, 0x7, 0x24, 0x2, 0x2, 0x301, 0x302, 0x5, 0x90, 0x49, 0x2, 0x302, 
       0x306, 0x7, 0x25, 0x2, 0x2, 0x303, 0x305, 0x5, 0x8e, 0x48, 0x2, 0x304, 
       0x303, 0x3, 0x2, 0x2, 0x2, 0x305, 0x308, 0x3, 0x2, 0x2, 0x2, 0x306, 
       0x304, 0x3, 0x2, 0x2, 0x2, 0x306, 0x307, 0x3, 0x2, 0x2, 0x2, 0x307, 
       0x8f, 0x3, 0x2, 0x2, 0x2, 0x308, 0x306, 0x3, 0x2, 0x2, 0x2, 0x309, 
       0x30a, 0x5, 0xa4, 0x53, 0x2, 0x30a, 0x91, 0x3, 0x2, 0x2, 0x2, 0x30b, 
       0x30c, 0x7, 0x2d, 0x2, 0x2, 0x30c, 0x93, 0x3, 0x2, 0x2, 0x2, 0x30d, 
       0x30e, 0x7, 0x2d, 0x2, 0x2, 0x30e, 0x95, 0x3, 0x2, 0x2, 0x2, 0x30f, 
       0x310, 0x9, 0x5, 0x2, 0x2, 0x310, 0x97, 0x3, 0x2, 0x2, 0x2, 0x311, 
       0x312, 0x7, 0x26, 0x2, 0x2, 0x312, 0x319, 0x7, 0x27, 0x2, 0x2, 0x313, 
       0x314, 0x7, 0x26, 0x2, 0x2, 0x314, 0x315, 0x5, 0x4, 0x3, 0x2, 0x315, 
       0x316, 0x7, 0x27, 0x2, 0x2, 0x316, 0x319, 0x3, 0x2, 0x2, 0x2, 0x317, 
       0x319, 0x5, 0x9a, 0x4e, 0x2, 0x318, 0x311, 0x3, 0x2, 0x2, 0x2, 0x318, 
       0x313, 0x3, 0x2, 0x2, 0x2, 0x318, 0x317, 0x3, 0x2, 0x2, 0x2, 0x319, 
       0x99, 0x3, 0x2, 0x2, 0x2, 0x31a, 0x31b, 0x5, 0x16, 0xc, 0x2, 0x31b, 
       0x31c, 0x7, 0x1e, 0x2, 0x2, 0x31c, 0x324, 0x3, 0x2, 0x2, 0x2, 0x31d, 
       0x324, 0x5, 0x1e, 0x10, 0x2, 0x31e, 0x324, 0x5, 0x20, 0x11, 0x2, 
       0x31f, 0x324, 0x5, 0x2e, 0x18, 0x2, 0x320, 0x324, 0x5, 0x48, 0x25, 
       0x2, 0x321, 0x324, 0x5, 0x44, 0x23, 0x2, 0x322, 0x324, 0x5, 0x46, 
       0x24, 0x2, 0x323, 0x31a, 0x3, 0x2, 0x2, 0x2, 0x323, 0x31d, 0x3, 0x2, 
       0x2, 0x2, 0x323, 0x31e, 0x3, 0x2, 0x2, 0x2, 0x323, 0x31f, 0x3, 0x2, 
       0x2, 0x2, 0x323, 0x320, 0x3, 0x2, 0x2, 0x2, 0x323, 0x321, 0x3, 0x2, 
       0x2, 0x2, 0x323, 0x322, 0x3, 0x2, 0x2, 0x2, 0x324, 0x9b, 0x3, 0x2, 
       0x2, 0x2, 0x325, 0x326, 0x7, 0x26, 0x2, 0x2, 0x326, 0x32c, 0x7, 0x27, 
       0x2, 0x2, 0x327, 0x328, 0x7, 0x26, 0x2, 0x2, 0x328, 0x329, 0x5, 0x4, 
       0x3, 0x2, 0x329, 0x32a, 0x7, 0x27, 0x2, 0x2, 0x32a, 0x32c, 0x3, 0x2, 
       0x2, 0x2, 0x32b, 0x325, 0x3, 0x2, 0x2, 0x2, 0x32b, 0x327, 0x3, 0x2, 
       0x2, 0x2, 0x32c, 0x9d, 0x3, 0x2, 0x2, 0x2, 0x32d, 0x32f, 0x7, 0x2c, 
       0x2, 0x2, 0x32e, 0x32d, 0x3, 0x2, 0x2, 0x2, 0x32e, 0x32f, 0x3, 0x2, 
       0x2, 0x2, 0x32f, 0x330, 0x3, 0x2, 0x2, 0x2, 0x330, 0x331, 0x5, 0xa6, 
       0x54, 0x2, 0x331, 0x332, 0x9, 0x4, 0x2, 0x2, 0x332, 0x334, 0x5, 0xa8, 
       0x55, 0x2, 0x333, 0x335, 0x7, 0x30, 0x2, 0x2, 0x334, 0x333, 0x3, 
       0x2, 0x2, 0x2, 0x334, 0x335, 0x3, 0x2, 0x2, 0x2, 0x335, 0x337, 0x3, 
       0x2, 0x2, 0x2, 0x336, 0x338, 0x7, 0x2a, 0x2, 0x2, 0x337, 0x336, 0x3, 
       0x2, 0x2, 0x2, 0x337, 0x338, 0x3, 0x2, 0x2, 0x2, 0x338, 0x33a, 0x3, 
       0x2, 0x2, 0x2, 0x339, 0x33b, 0x7, 0x2b, 0x2, 0x2, 0x33a, 0x339, 0x3, 
       0x2, 0x2, 0x2, 0x33a, 0x33b, 0x3, 0x2, 0x2, 0x2, 0x33b, 0x3bf, 0x3, 
       0x2, 0x2, 0x2, 0x33c, 0x33e, 0x7, 0x2c, 0x2, 0x2, 0x33d, 0x33c, 0x3, 
       0x2, 0x2, 0x2, 0x33d, 0x33e, 0x3, 0x2, 0x2, 0x2, 0x33e, 0x340, 0x3, 
       0x2, 0x2, 0x2, 0x33f, 0x341, 0x5, 0xae, 0x58, 0x2, 0x340, 0x33f, 
       0x3, 0x2, 0x2, 0x2, 0x340, 0x341, 0x3, 0x2, 0x2, 0x2, 0x341, 0x342, 
       0x3, 0x2, 0x2, 0x2, 0x342, 0x344, 0x5, 0xa6, 0x54, 0x2, 0x343, 0x345, 
       0x5, 0xb0, 0x59, 0x2, 0x344, 0x343, 0x3, 0x2, 0x2, 0x2, 0x344, 0x345, 
       0x3, 0x2, 0x2, 0x2, 0x345, 0x347, 0x3, 0x2, 0x2, 0x2, 0x346, 0x348, 
       0x7, 0x30, 0x2, 0x2, 0x347, 0x346, 0x3, 0x2, 0x2, 0x2, 0x347, 0x348, 
       0x3, 0x2, 0x2, 0x2, 0x348, 0x34a, 0x3, 0x2, 0x2, 0x2, 0x349, 0x34b, 
       0x7, 0x2a, 0x2, 0x2, 0x34a, 0x349, 0x3, 0x2, 0x2, 0x2, 0x34a, 0x34b, 
       0x3, 0x2, 0x2, 0x2, 0x34b, 0x34d, 0x3, 0x2, 0x2, 0x2, 0x34c, 0x34e, 
       0x7, 0x2b, 0x2, 0x2, 0x34d, 0x34c, 0x3, 0x2, 0x2, 0x2, 0x34d, 0x34e, 
       0x3, 0x2, 0x2, 0x2, 0x34e, 0x377, 0x3, 0x2, 0x2, 0x2, 0x34f, 0x351, 
       0x7, 0x2c, 0x2, 0x2, 0x350, 0x34f, 0x3, 0x2, 0x2, 0x2, 0x350, 0x351, 
       0x3, 0x2, 0x2, 0x2, 0x351, 0x352, 0x3, 0x2, 0x2, 0x2, 0x352, 0x354, 
       0x7, 0x32, 0x2, 0x2, 0x353, 0x355, 0x7, 0x30, 0x2, 0x2, 0x354, 0x353, 
       0x3, 0x2, 0x2, 0x2, 0x354, 0x355, 0x3, 0x2, 0x2, 0x2, 0x355, 0x357, 
       0x3, 0x2, 0x2, 0x2, 0x356, 0x358, 0x7, 0x2a, 0x2, 0x2, 0x357, 0x356, 
       0x3, 0x2, 0x2, 0x2, 0x357, 0x358, 0x3, 0x2, 0x2, 0x2, 0x358, 0x35a, 
       0x3, 0x2, 0x2, 0x2, 0x359, 0x35b, 0x7, 0x2b, 0x2, 0x2, 0x35a, 0x359, 
       0x3, 0x2, 0x2, 0x2, 0x35a, 0x35b, 0x3, 0x2, 0x2, 0x2, 0x35b, 0x377, 
       0x3, 0x2, 0x2, 0x2, 0x35c, 0x35e, 0x7, 0x2c, 0x2, 0x2, 0x35d, 0x35c, 
       0x3, 0x2, 0x2, 0x2, 0x35d, 0x35e, 0x3, 0x2, 0x2, 0x2, 0x35e, 0x35f, 
       0x3, 0x2, 0x2, 0x2, 0x35f, 0x361, 0x7, 0x33, 0x2, 0x2, 0x360, 0x362, 
       0x7, 0x30, 0x2, 0x2, 0x361, 0x360, 0x3, 0x2, 0x2, 0x2, 0x361, 0x362, 
       0x3, 0x2, 0x2, 0x2, 0x362, 0x364, 0x3, 0x2, 0x2, 0x2, 0x363, 0x365, 
       0x7, 0x2a, 0x2, 0x2, 0x364, 0x363, 0x3, 0x2, 0x2, 0x2, 0x364, 0x365, 
       0x3, 0x2, 0x2, 0x2, 0x365, 0x367, 0x3, 0x2, 0x2, 0x2, 0x366, 0x368, 
       0x7, 0x2b, 0x2, 0x2, 0x367, 0x366, 0x3, 0x2, 0x2, 0x2, 0x367, 0x368, 
       0x3, 0x2, 0x2, 0x2, 0x368, 0x377, 0x3, 0x2, 0x2, 0x2, 0x369, 0x36b, 
       0x7, 0x2c, 0x2, 0x2, 0x36a, 0x369, 0x3, 0x2, 0x2, 0x2, 0x36a, 0x36b, 
       0x3, 0x2, 0x2, 0x2, 0x36b, 0x36c, 0x3, 0x2, 0x2, 0x2, 0x36c, 0x36e, 
       0x7, 0x34, 0x2, 0x2, 0x36d, 0x36f, 0x7, 0x30, 0x2, 0x2, 0x36e, 0x36d, 
       0x3, 0x2, 0x2, 0x2, 0x36e, 0x36f, 0x3, 0x2, 0x2, 0x2, 0x36f, 0x371, 
       0x3, 0x2, 0x2, 0x2, 0x370, 0x372, 0x7, 0x2a, 0x2, 0x2, 0x371, 0x370, 
       0x3, 0x2, 0x2, 0x2, 0x371, 0x372, 0x3, 0x2, 0x2, 0x2, 0x372, 0x374, 
       0x3, 0x2, 0x2, 0x2, 0x373, 0x375, 0x7, 0x2b, 0x2, 0x2, 0x374, 0x373, 
       0x3, 0x2, 0x2, 0x2, 0x374, 0x375, 0x3, 0x2, 0x2, 0x2, 0x375, 0x377, 
       0x3, 0x2, 0x2, 0x2, 0x376, 0x33d, 0x3, 0x2, 0x2, 0x2, 0x376, 0x350, 
       0x3, 0x2, 0x2, 0x2, 0x376, 0x35d, 0x3, 0x2, 0x2, 0x2, 0x376, 0x36a, 
       0x3, 0x2, 0x2, 0x2, 0x377, 0x3bf, 0x3, 0x2, 0x2, 0x2, 0x378, 0x37a, 
       0x7, 0x2c, 0x2, 0x2, 0x379, 0x378, 0x3, 0x2, 0x2, 0x2, 0x379, 0x37a, 
       0x3, 0x2, 0x2, 0x2, 0x37a, 0x37b, 0x3, 0x2, 0x2, 0x2, 0x37b, 0x37d, 
       0x5, 0x16, 0xc, 0x2, 0x37c, 0x37e, 0x7, 0x30, 0x2, 0x2, 0x37d, 0x37c, 
       0x3, 0x2, 0x2, 0x2, 0x37d, 0x37e, 0x3, 0x2, 0x2, 0x2, 0x37e, 0x380, 
       0x3, 0x2, 0x2, 0x2, 0x37f, 0x381, 0x7, 0x2a, 0x2, 0x2, 0x380, 0x37f, 
       0x3, 0x2, 0x2, 0x2, 0x380, 0x381, 0x3, 0x2, 0x2, 0x2, 0x381, 0x383, 
       0x3, 0x2, 0x2, 0x2, 0x382, 0x384, 0x7, 0x2b, 0x2, 0x2, 0x383, 0x382, 
       0x3, 0x2, 0x2, 0x2, 0x383, 0x384, 0x3, 0x2, 0x2, 0x2, 0x384, 0x3bf, 
       0x3, 0x2, 0x2, 0x2, 0x385, 0x387, 0x7, 0x2c, 0x2, 0x2, 0x386, 0x385, 
       0x3, 0x2, 0x2, 0x2, 0x386, 0x387, 0x3, 0x2, 0x2, 0x2, 0x387, 0x388, 
       0x3, 0x2, 0x2, 0x2, 0x388, 0x389, 0x7, 0x28, 0x2, 0x2, 0x389, 0x38a, 
       0x5, 0x50, 0x29, 0x2, 0x38a, 0x38c, 0x7, 0x29, 0x2, 0x2, 0x38b, 0x38d, 
       0x7, 0x30, 0x2, 0x2, 0x38c, 0x38b, 0x3, 0x2, 0x2, 0x2, 0x38c, 0x38d, 
       0x3, 0x2, 0x2, 0x2, 0x38d, 0x38f, 0x3, 0x2, 0x2, 0x2, 0x38e, 0x390, 
       0x7, 0x2a, 0x2, 0x2, 0x38f, 0x38e, 0x3, 0x2, 0x2, 0x2, 0x38f, 0x390, 
       0x3, 0x2, 0x2, 0x2, 0x390, 0x392, 0x3, 0x2, 0x2, 0x2, 0x391, 0x393, 
       0x7, 0x2b, 0x2, 0x2, 0x392, 0x391, 0x3, 0x2, 0x2, 0x2, 0x392, 0x393, 
       0x3, 0x2, 0x2, 0x2, 0x393, 0x3bf, 0x3, 0x2, 0x2, 0x2, 0x394, 0x396, 
       0x7, 0x2c, 0x2, 0x2, 0x395, 0x394, 0x3, 0x2, 0x2, 0x2, 0x395, 0x396, 
       0x3, 0x2, 0x2, 0x2, 0x396, 0x398, 0x3, 0x2, 0x2, 0x2, 0x397, 0x399, 
       0x5, 0xae, 0x58, 0x2, 0x398, 0x397, 0x3, 0x2, 0x2, 0x2, 0x398, 0x399, 
       0x3, 0x2, 0x2, 0x2, 0x399, 0x39a, 0x3, 0x2, 0x2, 0x2, 0x39a, 0x39c, 
       0x5, 0x6a, 0x36, 0x2, 0x39b, 0x39d, 0x5, 0xb0, 0x59, 0x2, 0x39c, 
       0x39b, 0x3, 0x2, 0x2, 0x2, 0x39c, 0x39d, 0x3, 0x2, 0x2, 0x2, 0x39d, 
       0x39f, 0x3, 0x2, 0x2, 0x2, 0x39e, 0x3a0, 0x7, 0x30, 0x2, 0x2, 0x39f, 
       0x39e, 0x3, 0x2, 0x2, 0x2, 0x39f, 0x3a0, 0x3, 0x2, 0x2, 0x2, 0x3a0, 
       0x3a2, 0x3, 0x2, 0x2, 0x2, 0x3a1, 0x3a3, 0x7, 0x2a, 0x2, 0x2, 0x3a2, 
       0x3a1, 0x3, 0x2, 0x2, 0x2, 0x3a2, 0x3a3, 0x3, 0x2, 0x2, 0x2, 0x3a3, 
       0x3a5, 0x3, 0x2, 0x2, 0x2, 0x3a4, 0x3a6, 0x7, 0x2b, 0x2, 0x2, 0x3a5, 
       0x3a4, 0x3, 0x2, 0x2, 0x2, 0x3a5, 0x3a6, 0x3, 0x2, 0x2, 0x2, 0x3a6, 
       0x3bf, 0x3, 0x2, 0x2, 0x2, 0x3a7, 0x3bf, 0x5, 0x52, 0x2a, 0x2, 0x3a8, 
       0x3bf, 0x5, 0x64, 0x33, 0x2, 0x3a9, 0x3bf, 0x5, 0x74, 0x3b, 0x2, 
       0x3aa, 0x3bf, 0x5, 0x88, 0x45, 0x2, 0x3ab, 0x3ac, 0x7, 0x26, 0x2, 
       0x2, 0x3ac, 0x3b0, 0x7, 0x27, 0x2, 0x2, 0x3ad, 0x3ae, 0x7, 0x24, 
       0x2, 0x2, 0x3ae, 0x3b0, 0x7, 0x25, 0x2, 0x2, 0x3af, 0x3ab, 0x3, 0x2, 
       0x2, 0x2, 0x3af, 0x3ad, 0x3, 0x2, 0x2, 0x2, 0x3b0, 0x3bf, 0x3, 0x2, 
       0x2, 0x2, 0x3b1, 0x3b3, 0x7, 0x2c, 0x2, 0x2, 0x3b2, 0x3b1, 0x3, 0x2, 
       0x2, 0x2, 0x3b2, 0x3b3, 0x3, 0x2, 0x2, 0x2, 0x3b3, 0x3b4, 0x3, 0x2, 
       0x2, 0x2, 0x3b4, 0x3b6, 0x5, 0xa0, 0x51, 0x2, 0x3b5, 0x3b7, 0x7, 
       0x30, 0x2, 0x2, 0x3b6, 0x3b5, 0x3, 0x2, 0x2, 0x2, 0x3b6, 0x3b7, 0x3, 
       0x2, 0x2, 0x2, 0x3b7, 0x3b9, 0x3, 0x2, 0x2, 0x2, 0x3b8, 0x3ba, 0x7, 
       0x2a, 0x2, 0x2, 0x3b9, 0x3b8, 0x3, 0x2, 0x2, 0x2, 0x3b9, 0x3ba, 0x3, 
       0x2, 0x2, 0x2, 0x3ba, 0x3bc, 0x3, 0x2, 0x2, 0x2, 0x3bb, 0x3bd, 0x7, 
       0x2b, 0x2, 0x2, 0x3bc, 0x3bb, 0x3, 0x2, 0x2, 0x2, 0x3bc, 0x3bd, 0x3, 
       0x2, 0x2, 0x2, 0x3bd, 0x3bf, 0x3, 0x2, 0x2, 0x2, 0x3be, 0x32e, 0x3, 
       0x2, 0x2, 0x2, 0x3be, 0x376, 0x3, 0x2, 0x2, 0x2, 0x3be, 0x379, 0x3, 
       0x2, 0x2, 0x2, 0x3be, 0x386, 0x3, 0x2, 0x2, 0x2, 0x3be, 0x395, 0x3, 
       0x2, 0x2, 0x2, 0x3be, 0x3a7, 0x3, 0x2, 0x2, 0x2, 0x3be, 0x3a8, 0x3, 
       0x2, 0x2, 0x2, 0x3be, 0x3a9, 0x3, 0x2, 0x2, 0x2, 0x3be, 0x3aa, 0x3, 
       0x2, 0x2, 0x2, 0x3be, 0x3af, 0x3, 0x2, 0x2, 0x2, 0x3be, 0x3b2, 0x3, 
       0x2, 0x2, 0x2, 0x3bf, 0x9f, 0x3, 0x2, 0x2, 0x2, 0x3c0, 0x3c1, 0x7, 
       0x28, 0x2, 0x2, 0x3c1, 0x3c2, 0x5, 0xa2, 0x52, 0x2, 0x3c2, 0x3c3, 
       0x7, 0x29, 0x2, 0x2, 0x3c3, 0xa1, 0x3, 0x2, 0x2, 0x2, 0x3c4, 0x3c8, 
       0x5, 0x9e, 0x50, 0x2, 0x3c5, 0x3c7, 0x5, 0xa2, 0x52, 0x2, 0x3c6, 
       0x3c5, 0x3, 0x2, 0x2, 0x2, 0x3c7, 0x3ca, 0x3, 0x2, 0x2, 0x2, 0x3c8, 
       0x3c6, 0x3, 0x2, 0x2, 0x2, 0x3c8, 0x3c9, 0x3, 0x2, 0x2, 0x2, 0x3c9, 
       0xa3, 0x3, 0x2, 0x2, 0x2, 0x3ca, 0x3c8, 0x3, 0x2, 0x2, 0x2, 0x3cb, 
       0x3cf, 0x5, 0x9e, 0x50, 0x2, 0x3cc, 0x3ce, 0x5, 0xa4, 0x53, 0x2, 
       0x3cd, 0x3cc, 0x3, 0x2, 0x2, 0x2, 0x3ce, 0x3d1, 0x3, 0x2, 0x2, 0x2, 
       0x3cf, 0x3cd, 0x3, 0x2, 0x2, 0x2, 0x3cf, 0x3d0, 0x3, 0x2, 0x2, 0x2, 
       0x3d0, 0xa5, 0x3, 0x2, 0x2, 0x2, 0x3d1, 0x3cf, 0x3, 0x2, 0x2, 0x2, 
       0x3d2, 0x3d3, 0x7, 0x2e, 0x2, 0x2, 0x3d3, 0xa7, 0x3, 0x2, 0x2, 0x2, 
       0x3d4, 0x3d5, 0x7, 0x2e, 0x2, 0x2, 0x3d5, 0xa9, 0x3, 0x2, 0x2, 0x2, 
       0x3d6, 0x3d7, 0x7, 0x2e, 0x2, 0x2, 0x3d7, 0xab, 0x3, 0x2, 0x2, 0x2, 
       0x3d8, 0x3d9, 0x7, 0x2e, 0x2, 0x2, 0x3d9, 0xad, 0x3, 0x2, 0x2, 0x2, 
       0x3da, 0x3db, 0x7, 0x2d, 0x2, 0x2, 0x3db, 0xaf, 0x3, 0x2, 0x2, 0x2, 
       0x3dc, 0x3dd, 0x7, 0x2d, 0x2, 0x2, 0x3dd, 0xb1, 0x3, 0x2, 0x2, 0x2, 
       0x3de, 0x3df, 0x7, 0x28, 0x2, 0x2, 0x3df, 0xb3, 0x3, 0x2, 0x2, 0x2, 
       0x3e0, 0x3e1, 0x7, 0x29, 0x2, 0x2, 0x3e1, 0xb5, 0x3, 0x2, 0x2, 0x2, 
       0x91, 0xbe, 0xd2, 0xda, 0xe5, 0xef, 0xf6, 0xfd, 0x103, 0x10e, 0x116, 
       0x11d, 0x126, 0x129, 0x133, 0x145, 0x14c, 0x154, 0x15b, 0x164, 0x168, 
       0x16c, 0x173, 0x17e, 0x185, 0x189, 0x192, 0x196, 0x19c, 0x19e, 0x1a4, 
       0x1ab, 0x1af, 0x1b5, 0x1b7, 0x1bb, 0x1bd, 0x1c2, 0x1c6, 0x1cc, 0x1ce, 
       0x1d4, 0x1da, 0x1de, 0x1e4, 0x1e6, 0x1e9, 0x1ef, 0x1f9, 0x203, 0x20d, 
       0x211, 0x215, 0x21d, 0x221, 0x227, 0x22b, 0x22f, 0x232, 0x238, 0x23c, 
       0x240, 0x248, 0x24c, 0x250, 0x254, 0x258, 0x25b, 0x263, 0x26e, 0x27c, 
       0x281, 0x287, 0x289, 0x290, 0x296, 0x29b, 0x2a0, 0x2a8, 0x2ac, 0x2b6, 
       0x2bf, 0x2c3, 0x2ca, 0x2d7, 0x2e0, 0x2e5, 0x2e8, 0x2eb, 0x2ef, 0x2f2, 
       0x2f6, 0x2f9, 0x2fc, 0x2fe, 0x306, 0x318, 0x323, 0x32b, 0x32e, 0x334, 
       0x337, 0x33a, 0x33d, 0x340, 0x344, 0x347, 0x34a, 0x34d, 0x350, 0x354, 
       0x357, 0x35a, 0x35d, 0x361, 0x364, 0x367, 0x36a, 0x36e, 0x371, 0x374, 
       0x376, 0x379, 0x37d, 0x380, 0x383, 0x386, 0x38c, 0x38f, 0x392, 0x395, 
       0x398, 0x39c, 0x39f, 0x3a2, 0x3a5, 0x3af, 0x3b2, 0x3b6, 0x3b9, 0x3bc, 
       0x3be, 0x3c8, 0x3cf, 
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
