
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
    setState(136);
    sentences();
    setState(137);
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
    setState(144);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 0, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(139);
      statements();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(140);
      statements();
      setState(141);
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

TParser::BlockCodeContext* TParser::StatementsContext::blockCode() {
  return getRuleContext<TParser::BlockCodeContext>(0);
}

TParser::BlockLiveTokensContext* TParser::StatementsContext::blockLiveTokens() {
  return getRuleContext<TParser::BlockLiveTokensContext>(0);
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
    setState(160);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 1, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(146);
      blockUse();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(147);
      blockVariable();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(148);
      blockRet();
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(149);
      blockConditional();
      break;
    }

    case 5: {
      enterOuterAlt(_localctx, 5);
      setState(150);
      blockLoop();
      break;
    }

    case 6: {
      enterOuterAlt(_localctx, 6);
      setState(151);
      blockBreak();
      break;
    }

    case 7: {
      enterOuterAlt(_localctx, 7);
      setState(152);
      blockNext();
      break;
    }

    case 8: {
      enterOuterAlt(_localctx, 8);
      setState(153);
      blockTryCatch();
      break;
    }

    case 9: {
      enterOuterAlt(_localctx, 9);
      setState(154);
      blockFunction();
      break;
    }

    case 10: {
      enterOuterAlt(_localctx, 10);
      setState(155);
      blockInterface();
      break;
    }

    case 11: {
      enterOuterAlt(_localctx, 11);
      setState(156);
      blockAbstraction();
      break;
    }

    case 12: {
      enterOuterAlt(_localctx, 12);
      setState(157);
      blockClass();
      break;
    }

    case 13: {
      enterOuterAlt(_localctx, 13);
      setState(158);
      blockCode();
      break;
    }

    case 14: {
      enterOuterAlt(_localctx, 14);
      setState(159);
      blockLiveTokens();
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
    setState(168);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 2, _ctx)) {
    case 1: {
      setState(162);
      match(TParser::OpenBlock);
      setState(163);
      match(TParser::CloseBlock);
      break;
    }

    case 2: {
      setState(164);
      match(TParser::OpenBlock);
      setState(165);
      sentences();
      setState(166);
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
    setState(170);
    match(TParser::Use);
    setState(171);
    useValue();
    setState(172);
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
    setState(179);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 3, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(174);
      useString();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(175);
      useString();
      setState(176);
      match(TParser::Separator);
      setState(177);
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
    setState(181);
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
    setState(183);
    match(TParser::Var);
    setState(184);
    variableItem();
    setState(185);
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
    setState(187);
    variablePrefixModes();
    setState(189);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == TParser::New

    || _la == TParser::Await) {
      setState(188);
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
    setState(191);
    generalValueElements();
    setState(196);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 5, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        setState(192);
        match(TParser::Separator);
        setState(193);
        variableItem(); 
      }
      setState(198);
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
    setState(203);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 6, _ctx)) {
    case 1: {
      setState(199);
      identifier();
      break;
    }

    case 2: {
      setState(200);
      identifier();
      setState(201);
      match(TParser::TypeSpec);
      break;
    }

    default:
      break;
    }
    setState(205);
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
    setState(207);
    functionCallPrefix();
    setState(209);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == TParser::Identifier) {
      setState(208);
      identifier();
    }
    setState(211);
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
    setState(220);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 8, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(213);
      identifier();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(214);
      identifier();
      setState(215);
      match(TParser::Point);
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(217);
      identifier();
      setState(218);
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
    setState(228);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 9, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(222);
      match(TParser::OpenOp);
      setState(223);
      match(TParser::CloseOp);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(224);
      match(TParser::OpenOp);
      setState(225);
      functionCallParamElements();
      setState(226);
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
    setState(230);
    generalValue();
    setState(235);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 10, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        setState(231);
        match(TParser::Separator);
        setState(232);
        functionCallParamElements(); 
      }
      setState(237);
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
    setState(238);
    match(TParser::Ret);
    setState(239);
    generalValueElements();
    setState(240);
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
    setState(242);
    ifElementUnique();
    setState(244);
    _errHandler->sync(this);

    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 11, _ctx)) {
    case 1: {
      setState(243);
      elifElements();
      break;
    }

    default:
      break;
    }
    setState(247);
    _errHandler->sync(this);

    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 12, _ctx)) {
    case 1: {
      setState(246);
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
    setState(249);
    match(TParser::If);
    setState(250);
    conditionalBlockExpression();
    setState(251);
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
    setState(253);
    elifElementUnique();
    setState(257);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 13, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        setState(254);
        elifElements(); 
      }
      setState(259);
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
    setState(260);
    match(TParser::Elif);
    setState(261);
    conditionalBlockExpression();
    setState(262);
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
    setState(264);
    match(TParser::Else);
    setState(265);
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
    setState(267);
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
    setState(269);
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
    setState(271);
    match(TParser::For);
    setState(275);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 14, _ctx)) {
    case 1: {
      setState(272);
      loopInfinite();
      break;
    }

    case 2: {
      setState(273);
      loopConditional();
      break;
    }

    case 3: {
      setState(274);
      loopComplete();
      break;
    }

    default:
      break;
    }
    setState(277);
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
    setState(279);
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
    setState(282);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == TParser::OpenOp) {
      setState(281);
      match(TParser::OpenOp);
    }
    setState(284);
    loopOneMembers();
    setState(285);
    endOne();
    setState(286);
    loopTwoMembers();
    setState(287);
    endTwo();
    setState(288);
    loopThreeMembers();
    setState(290);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == TParser::CloseOp) {
      setState(289);
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
    setState(292);
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
    setState(297);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case TParser::OpenOp: {
        enterOuterAlt(_localctx, 1);
        setState(294);
        match(TParser::OpenOp);
        setState(295);
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
    setState(299);
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
    setState(301);
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
    setState(306);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case TParser::Var: {
        enterOuterAlt(_localctx, 1);
        setState(303);
        match(TParser::Var);
        setState(304);
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
    setState(310);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 19, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(308);
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
    setState(314);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 20, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(312);
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
    setState(316);
    generalValueElements();
    setState(321);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while (_la == TParser::Separator) {
      setState(317);
      match(TParser::Separator);
      setState(318);
      generalValueElements();
      setState(323);
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
    setState(324);
    match(TParser::Break);
    setState(325);
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
    setState(327);
    match(TParser::Next);
    setState(328);
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
    setState(330);
    tryUniqueElement();
    setState(332);
    _errHandler->sync(this);

    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 22, _ctx)) {
    case 1: {
      setState(331);
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
    setState(334);
    match(TParser::Try);
    setState(335);
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
    setState(337);
    match(TParser::Catch);
    setState(339);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == TParser::OpenOp) {
      setState(338);
      match(TParser::OpenOp);
    }
    setState(341);
    identifier();
    setState(343);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == TParser::CloseOp) {
      setState(342);
      match(TParser::CloseOp);
    }
    setState(345);
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
    setState(347);
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
    setState(395);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case TParser::OpenOp: {
        enterOuterAlt(_localctx, 1);
        setState(349);
        match(TParser::OpenOp);
        setState(350);
        match(TParser::Function);
        setState(352);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::Identifier) {
          setState(351);
          identifier();
        }
        setState(354);
        match(TParser::OpenOp);
        setState(356);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::Identifier) {
          setState(355);
          functionParam();
        }
        setState(358);
        match(TParser::CloseOp);
        setState(364);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::ArrowRight) {
          setState(359);
          match(TParser::ArrowRight);
          setState(362);
          _errHandler->sync(this);
          switch (_input->LA(1)) {
            case TParser::Identifier: {
              setState(360);
              identifierB();
              break;
            }

            case TParser::TypeSpec: {
              setState(361);
              match(TParser::TypeSpec);
              break;
            }

          default:
            throw NoViableAltException(this);
          }
        }
        setState(366);
        functionCodeBlock();
        setState(367);
        match(TParser::CloseOp);
        setState(368);
        match(TParser::OpenOp);
        setState(370);
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
          setState(369);
          functionAnonymousParam();
        }
        setState(372);
        match(TParser::CloseOp);
        setState(373);
        match(TParser::End);
        break;
      }

      case TParser::Function: {
        enterOuterAlt(_localctx, 2);
        setState(375);
        match(TParser::Function);
        setState(377);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::Identifier) {
          setState(376);
          identifier();
        }
        setState(379);
        match(TParser::OpenOp);
        setState(381);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::Identifier) {
          setState(380);
          functionParam();
        }
        setState(383);
        match(TParser::CloseOp);
        setState(389);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::ArrowRight) {
          setState(384);
          match(TParser::ArrowRight);
          setState(387);
          _errHandler->sync(this);
          switch (_input->LA(1)) {
            case TParser::Identifier: {
              setState(385);
              identifierB();
              break;
            }

            case TParser::TypeSpec: {
              setState(386);
              match(TParser::TypeSpec);
              break;
            }

          default:
            throw NoViableAltException(this);
          }
        }
        setState(393);
        _errHandler->sync(this);
        switch (_input->LA(1)) {
          case TParser::OpenBlock: {
            setState(391);
            functionCodeBlock();
            break;
          }

          case TParser::End: {
            setState(392);
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
    setState(439);
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
        break;
      }

      case TParser::Function: {
        enterOuterAlt(_localctx, 2);
        setState(422);
        match(TParser::Function);
        setState(424);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::Identifier) {
          setState(423);
          identifier();
        }
        setState(426);
        match(TParser::OpenOp);
        setState(428);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::Identifier) {
          setState(427);
          functionParam();
        }
        setState(430);
        match(TParser::CloseOp);
        setState(436);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::ArrowRight) {
          setState(431);
          match(TParser::ArrowRight);
          setState(434);
          _errHandler->sync(this);
          switch (_input->LA(1)) {
            case TParser::Identifier: {
              setState(432);
              identifierB();
              break;
            }

            case TParser::TypeSpec: {
              setState(433);
              match(TParser::TypeSpec);
              break;
            }

          default:
            throw NoViableAltException(this);
          }
        }
        setState(438);
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
    setState(441);
    match(TParser::Identifier);
    setState(442);
    match(TParser::TypeSpec);
    setState(445);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == TParser::Separator) {
      setState(443);
      match(TParser::Separator);
      setState(444);
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
    setState(447);
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
    setState(449);
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
    setState(451);
    match(TParser::Interface);
    setState(452);
    identifier();
    setState(455);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == TParser::Extends) {
      setState(453);
      match(TParser::Extends);
      setState(454);
      identifierB();
    }
    setState(457);
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
    setState(459);
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
    setState(461);
    match(TParser::Abstract);
    setState(462);
    identifier();
    setState(465);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == TParser::Extends) {
      setState(463);
      match(TParser::Extends);
      setState(464);
      identifierB();
    }
    setState(467);
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
    setState(469);
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

tree::TerminalNode* TParser::BlockClassContext::Class() {
  return getToken(TParser::Class, 0);
}

TParser::ClassCodeBlockContext* TParser::BlockClassContext::classCodeBlock() {
  return getRuleContext<TParser::ClassCodeBlockContext>(0);
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
    enterOuterAlt(_localctx, 1);
    setState(471);
    match(TParser::Class);
    setState(473);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == TParser::Identifier) {
      setState(472);
      identifier();
    }
    setState(477);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == TParser::Extends) {
      setState(475);
      match(TParser::Extends);
      setState(476);
      identifierB();
    }
    setState(481);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == TParser::Implements) {
      setState(479);
      match(TParser::Implements);
      setState(480);
      identifierC();
    }
    setState(483);
    classCodeBlock();
   
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
  enterRule(_localctx, 98, TParser::RuleClassCodeBlock);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(485);
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
  enterRule(_localctx, 100, TParser::RuleBlockArray);

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
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case TParser::OpenArIndex: {
        setState(487);
        indexArray();
        break;
      }

      case TParser::OpenBlock: {
        setState(488);
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
  enterRule(_localctx, 102, TParser::RuleIndexArray);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(491);
    match(TParser::OpenArIndex);
    setState(492);
    indexArrayElements();
    setState(493);
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
  enterRule(_localctx, 104, TParser::RuleIndexArrayElements);

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
    setState(495);
    generalValueElements();
    setState(500);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 53, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        setState(496);
        match(TParser::Separator);
        setState(497);
        indexArrayElements(); 
      }
      setState(502);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 53, _ctx);
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
  enterRule(_localctx, 106, TParser::RuleAssociativeArray);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(503);
    match(TParser::OpenBlock);
    setState(504);
    associativeArrayElements();
    setState(505);
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
  enterRule(_localctx, 108, TParser::RuleAssociativeArrayElements);

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
    setState(507);
    identifier();
    setState(508);
    match(TParser::TwoPoint);
    setState(509);
    generalValueElements();
    setState(514);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 54, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        setState(510);
        match(TParser::Separator);
        setState(511);
        associativeArrayElements(); 
      }
      setState(516);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 54, _ctx);
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
  enterRule(_localctx, 110, TParser::RuleCodeBlockFlowControl);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(524);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 55, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(517);
      match(TParser::OpenBlock);
      setState(518);
      match(TParser::CloseBlock);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(519);
      match(TParser::OpenBlock);
      setState(520);
      sentences();
      setState(521);
      match(TParser::CloseBlock);
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(523);
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
  enterRule(_localctx, 112, TParser::RuleCodeBlockFlowControlElements);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(535);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case TParser::Identifier: {
        enterOuterAlt(_localctx, 1);
        setState(526);
        functionCall();
        setState(527);
        match(TParser::End);
        break;
      }

      case TParser::Ret: {
        enterOuterAlt(_localctx, 2);
        setState(529);
        blockRet();
        break;
      }

      case TParser::If: {
        enterOuterAlt(_localctx, 3);
        setState(530);
        blockConditional();
        break;
      }

      case TParser::For: {
        enterOuterAlt(_localctx, 4);
        setState(531);
        blockLoop();
        break;
      }

      case TParser::Try: {
        enterOuterAlt(_localctx, 5);
        setState(532);
        blockTryCatch();
        break;
      }

      case TParser::Break: {
        enterOuterAlt(_localctx, 6);
        setState(533);
        blockBreak();
        break;
      }

      case TParser::Next: {
        enterOuterAlt(_localctx, 7);
        setState(534);
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
  enterRule(_localctx, 114, TParser::RuleCodeBlockControl);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(543);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 57, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(537);
      match(TParser::OpenBlock);
      setState(538);
      match(TParser::CloseBlock);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(539);
      match(TParser::OpenBlock);
      setState(540);
      sentences();
      setState(541);
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

TParser::BlockClassContext* TParser::GeneralValueContext::blockClass() {
  return getRuleContext<TParser::BlockClassContext>(0);
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
  enterRule(_localctx, 116, TParser::RuleGeneralValue);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(688);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 100, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(546);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == TParser::Not) {
        setState(545);
        match(TParser::Not);
      }
      setState(548);
      identifier();
      setState(549);
      _la = _input->LA(1);
      if (!(_la == TParser::Point

      || _la == TParser::TwoTwoPoint)) {
      _errHandler->recoverInline(this);
      }
      else {
        _errHandler->reportMatch(this);
        consume();
      }
      setState(550);
      identifierB();
      setState(552);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == TParser::TypeSpec) {
        setState(551);
        match(TParser::TypeSpec);
      }
      setState(555);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == TParser::ArithmeticOperator) {
        setState(554);
        match(TParser::ArithmeticOperator);
      }
      setState(558);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == TParser::AssignmentOperator) {
        setState(557);
        match(TParser::AssignmentOperator);
      }
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(618);
      _errHandler->sync(this);
      switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 80, _ctx)) {
      case 1: {
        setState(561);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::Not) {
          setState(560);
          match(TParser::Not);
        }
        setState(564);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::IncDecOperators) {
          setState(563);
          incDecOperatorsA();
        }
        setState(566);
        identifier();
        setState(568);
        _errHandler->sync(this);

        switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 64, _ctx)) {
        case 1: {
          setState(567);
          incDecOperatorsB();
          break;
        }

        default:
          break;
        }
        setState(571);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::TypeSpec) {
          setState(570);
          match(TParser::TypeSpec);
        }
        setState(574);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::ArithmeticOperator) {
          setState(573);
          match(TParser::ArithmeticOperator);
        }
        setState(577);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::AssignmentOperator) {
          setState(576);
          match(TParser::AssignmentOperator);
        }
        break;
      }

      case 2: {
        setState(580);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::Not) {
          setState(579);
          match(TParser::Not);
        }
        setState(582);
        match(TParser::Integer);
        setState(584);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::TypeSpec) {
          setState(583);
          match(TParser::TypeSpec);
        }
        setState(587);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::ArithmeticOperator) {
          setState(586);
          match(TParser::ArithmeticOperator);
        }
        setState(590);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::AssignmentOperator) {
          setState(589);
          match(TParser::AssignmentOperator);
        }
        break;
      }

      case 3: {
        setState(593);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::Not) {
          setState(592);
          match(TParser::Not);
        }
        setState(595);
        match(TParser::Float);
        setState(597);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::TypeSpec) {
          setState(596);
          match(TParser::TypeSpec);
        }
        setState(600);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::ArithmeticOperator) {
          setState(599);
          match(TParser::ArithmeticOperator);
        }
        setState(603);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::AssignmentOperator) {
          setState(602);
          match(TParser::AssignmentOperator);
        }
        break;
      }

      case 4: {
        setState(606);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::Not) {
          setState(605);
          match(TParser::Not);
        }
        setState(608);
        match(TParser::String);
        setState(610);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::TypeSpec) {
          setState(609);
          match(TParser::TypeSpec);
        }
        setState(613);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::ArithmeticOperator) {
          setState(612);
          match(TParser::ArithmeticOperator);
        }
        setState(616);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::AssignmentOperator) {
          setState(615);
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
      setState(621);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == TParser::Not) {
        setState(620);
        match(TParser::Not);
      }
      setState(623);
      functionCall();
      setState(625);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == TParser::TypeSpec) {
        setState(624);
        match(TParser::TypeSpec);
      }
      setState(628);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == TParser::ArithmeticOperator) {
        setState(627);
        match(TParser::ArithmeticOperator);
      }
      setState(631);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == TParser::AssignmentOperator) {
        setState(630);
        match(TParser::AssignmentOperator);
      }
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(634);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == TParser::Not) {
        setState(633);
        match(TParser::Not);
      }
      setState(636);
      match(TParser::OpenOp);
      setState(637);
      blockFunction();
      setState(638);
      match(TParser::CloseOp);
      setState(640);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == TParser::TypeSpec) {
        setState(639);
        match(TParser::TypeSpec);
      }
      setState(643);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == TParser::ArithmeticOperator) {
        setState(642);
        match(TParser::ArithmeticOperator);
      }
      setState(646);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == TParser::AssignmentOperator) {
        setState(645);
        match(TParser::AssignmentOperator);
      }
      break;
    }

    case 5: {
      enterOuterAlt(_localctx, 5);
      setState(649);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == TParser::Not) {
        setState(648);
        match(TParser::Not);
      }
      setState(652);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == TParser::IncDecOperators) {
        setState(651);
        incDecOperatorsA();
      }
      setState(654);
      blockArray();
      setState(656);
      _errHandler->sync(this);

      switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 91, _ctx)) {
      case 1: {
        setState(655);
        incDecOperatorsB();
        break;
      }

      default:
        break;
      }
      setState(659);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == TParser::TypeSpec) {
        setState(658);
        match(TParser::TypeSpec);
      }
      setState(662);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == TParser::ArithmeticOperator) {
        setState(661);
        match(TParser::ArithmeticOperator);
      }
      setState(665);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == TParser::AssignmentOperator) {
        setState(664);
        match(TParser::AssignmentOperator);
      }
      break;
    }

    case 6: {
      enterOuterAlt(_localctx, 6);
      setState(667);
      blockFunctionDeclarationAttr();
      break;
    }

    case 7: {
      enterOuterAlt(_localctx, 7);
      setState(668);
      blockClass();
      break;
    }

    case 8: {
      enterOuterAlt(_localctx, 8);
      setState(673);
      _errHandler->sync(this);
      switch (_input->LA(1)) {
        case TParser::OpenBlock: {
          setState(669);
          match(TParser::OpenBlock);
          setState(670);
          match(TParser::CloseBlock);
          break;
        }

        case TParser::OpenArIndex: {
          setState(671);
          match(TParser::OpenArIndex);
          setState(672);
          match(TParser::CloseArIndex);
          break;
        }

      default:
        throw NoViableAltException(this);
      }
      break;
    }

    case 9: {
      enterOuterAlt(_localctx, 9);
      setState(676);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == TParser::Not) {
        setState(675);
        match(TParser::Not);
      }
      setState(678);
      generalValueBlock();
      setState(680);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == TParser::TypeSpec) {
        setState(679);
        match(TParser::TypeSpec);
      }
      setState(683);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == TParser::ArithmeticOperator) {
        setState(682);
        match(TParser::ArithmeticOperator);
      }
      setState(686);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == TParser::AssignmentOperator) {
        setState(685);
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
  enterRule(_localctx, 118, TParser::RuleGeneralValueBlock);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(690);
    match(TParser::OpenOp);
    setState(691);
    generalValueItems();
    setState(692);
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
  enterRule(_localctx, 120, TParser::RuleGeneralValueItems);

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
    setState(694);
    generalValue();
    setState(698);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 101, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        setState(695);
        generalValueItems(); 
      }
      setState(700);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 101, _ctx);
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
  enterRule(_localctx, 122, TParser::RuleGeneralValueElements);

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
    setState(701);
    generalValue();
    setState(705);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 102, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        setState(702);
        generalValueElements(); 
      }
      setState(707);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 102, _ctx);
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
  enterRule(_localctx, 124, TParser::RuleIdentifier);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(708);
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
  enterRule(_localctx, 126, TParser::RuleIdentifierB);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(710);
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
  enterRule(_localctx, 128, TParser::RuleIdentifierC);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(712);
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
  enterRule(_localctx, 130, TParser::RuleIncDecOperatorsA);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(714);
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
  enterRule(_localctx, 132, TParser::RuleIncDecOperatorsB);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(716);
    match(TParser::IncDecOperators);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- BlockLiveTokensContext ------------------------------------------------------------------

TParser::BlockLiveTokensContext::BlockLiveTokensContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::BlockLiveTokensContext::New() {
  return getToken(TParser::New, 0);
}

tree::TerminalNode* TParser::BlockLiveTokensContext::ARightLB() {
  return getToken(TParser::ARightLB, 0);
}

tree::TerminalNode* TParser::BlockLiveTokensContext::End() {
  return getToken(TParser::End, 0);
}

tree::TerminalNode* TParser::BlockLiveTokensContext::Attr() {
  return getToken(TParser::Attr, 0);
}

tree::TerminalNode* TParser::BlockLiveTokensContext::Point() {
  return getToken(TParser::Point, 0);
}

tree::TerminalNode* TParser::BlockLiveTokensContext::TwoPoint() {
  return getToken(TParser::TwoPoint, 0);
}

tree::TerminalNode* TParser::BlockLiveTokensContext::TwoTwoPoint() {
  return getToken(TParser::TwoTwoPoint, 0);
}

tree::TerminalNode* TParser::BlockLiveTokensContext::Separator() {
  return getToken(TParser::Separator, 0);
}

tree::TerminalNode* TParser::BlockLiveTokensContext::OpenArIndex() {
  return getToken(TParser::OpenArIndex, 0);
}

tree::TerminalNode* TParser::BlockLiveTokensContext::CloseArIndex() {
  return getToken(TParser::CloseArIndex, 0);
}

tree::TerminalNode* TParser::BlockLiveTokensContext::Pub() {
  return getToken(TParser::Pub, 0);
}

tree::TerminalNode* TParser::BlockLiveTokensContext::Pro() {
  return getToken(TParser::Pro, 0);
}

tree::TerminalNode* TParser::BlockLiveTokensContext::Priv() {
  return getToken(TParser::Priv, 0);
}

tree::TerminalNode* TParser::BlockLiveTokensContext::Static() {
  return getToken(TParser::Static, 0);
}

tree::TerminalNode* TParser::BlockLiveTokensContext::Final() {
  return getToken(TParser::Final, 0);
}

tree::TerminalNode* TParser::BlockLiveTokensContext::Async() {
  return getToken(TParser::Async, 0);
}

tree::TerminalNode* TParser::BlockLiveTokensContext::OpenOp() {
  return getToken(TParser::OpenOp, 0);
}

tree::TerminalNode* TParser::BlockLiveTokensContext::CloseOp() {
  return getToken(TParser::CloseOp, 0);
}

tree::TerminalNode* TParser::BlockLiveTokensContext::ArithmeticOperator() {
  return getToken(TParser::ArithmeticOperator, 0);
}

tree::TerminalNode* TParser::BlockLiveTokensContext::AssignmentOperator() {
  return getToken(TParser::AssignmentOperator, 0);
}

tree::TerminalNode* TParser::BlockLiveTokensContext::IncDecOperators() {
  return getToken(TParser::IncDecOperators, 0);
}

tree::TerminalNode* TParser::BlockLiveTokensContext::Identifier() {
  return getToken(TParser::Identifier, 0);
}

tree::TerminalNode* TParser::BlockLiveTokensContext::TypeSpec() {
  return getToken(TParser::TypeSpec, 0);
}

tree::TerminalNode* TParser::BlockLiveTokensContext::Integer() {
  return getToken(TParser::Integer, 0);
}

tree::TerminalNode* TParser::BlockLiveTokensContext::Float() {
  return getToken(TParser::Float, 0);
}

tree::TerminalNode* TParser::BlockLiveTokensContext::String() {
  return getToken(TParser::String, 0);
}


size_t TParser::BlockLiveTokensContext::getRuleIndex() const {
  return TParser::RuleBlockLiveTokens;
}

void TParser::BlockLiveTokensContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterBlockLiveTokens(this);
}

void TParser::BlockLiveTokensContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitBlockLiveTokens(this);
}


antlrcpp::Any TParser::BlockLiveTokensContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitBlockLiveTokens(this);
  else
    return visitor->visitChildren(this);
}

TParser::BlockLiveTokensContext* TParser::blockLiveTokens() {
  BlockLiveTokensContext *_localctx = _tracker.createInstance<BlockLiveTokensContext>(_ctx, getState());
  enterRule(_localctx, 134, TParser::RuleBlockLiveTokens);
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
    setState(718);
    _la = _input->LA(1);
    if (!((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << TParser::Pub)
      | (1ULL << TParser::Pro)
      | (1ULL << TParser::Priv)
      | (1ULL << TParser::Static)
      | (1ULL << TParser::Final)
      | (1ULL << TParser::New)
      | (1ULL << TParser::Async)
      | (1ULL << TParser::ARightLB)
      | (1ULL << TParser::End)
      | (1ULL << TParser::Attr)
      | (1ULL << TParser::Point)
      | (1ULL << TParser::TwoPoint)
      | (1ULL << TParser::TwoTwoPoint)
      | (1ULL << TParser::Separator)
      | (1ULL << TParser::OpenArIndex)
      | (1ULL << TParser::CloseArIndex)
      | (1ULL << TParser::OpenOp)
      | (1ULL << TParser::CloseOp)
      | (1ULL << TParser::ArithmeticOperator)
      | (1ULL << TParser::AssignmentOperator)
      | (1ULL << TParser::IncDecOperators)
      | (1ULL << TParser::Identifier)
      | (1ULL << TParser::TypeSpec)
      | (1ULL << TParser::Integer)
      | (1ULL << TParser::Float)
      | (1ULL << TParser::String))) != 0))) {
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
  "abstractionCodeBlock", "blockClass", "classCodeBlock", "blockArray", 
  "indexArray", "indexArrayElements", "associativeArray", "associativeArrayElements", 
  "codeBlockFlowControl", "codeBlockFlowControlElements", "codeBlockControl", 
  "generalValue", "generalValueBlock", "generalValueItems", "generalValueElements", 
  "identifier", "identifierB", "identifierC", "incDecOperatorsA", "incDecOperatorsB", 
  "blockLiveTokens"
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
       0x3, 0x38, 0x2d3, 0x4, 0x2, 0x9, 0x2, 0x4, 0x3, 0x9, 0x3, 0x4, 0x4, 
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
       0x9, 0x44, 0x4, 0x45, 0x9, 0x45, 0x3, 0x2, 0x3, 0x2, 0x3, 0x2, 0x3, 
       0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x5, 0x3, 0x93, 0xa, 
       0x3, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 
       0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x3, 
       0x4, 0x3, 0x4, 0x5, 0x4, 0xa3, 0xa, 0x4, 0x3, 0x5, 0x3, 0x5, 0x3, 
       0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x5, 0x5, 0xab, 0xa, 0x5, 0x3, 
       0x6, 0x3, 0x6, 0x3, 0x6, 0x3, 0x6, 0x3, 0x7, 0x3, 0x7, 0x3, 0x7, 
       0x3, 0x7, 0x3, 0x7, 0x5, 0x7, 0xb6, 0xa, 0x7, 0x3, 0x8, 0x3, 0x8, 
       0x3, 0x9, 0x3, 0x9, 0x3, 0x9, 0x3, 0x9, 0x3, 0xa, 0x3, 0xa, 0x5, 
       0xa, 0xc0, 0xa, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x7, 0xa, 0xc5, 
       0xa, 0xa, 0xc, 0xa, 0xe, 0xa, 0xc8, 0xb, 0xa, 0x3, 0xb, 0x3, 0xb, 
       0x3, 0xb, 0x3, 0xb, 0x5, 0xb, 0xce, 0xa, 0xb, 0x3, 0xb, 0x3, 0xb, 
       0x3, 0xc, 0x3, 0xc, 0x5, 0xc, 0xd4, 0xa, 0xc, 0x3, 0xc, 0x3, 0xc, 
       0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 
       0xd, 0x5, 0xd, 0xdf, 0xa, 0xd, 0x3, 0xe, 0x3, 0xe, 0x3, 0xe, 0x3, 
       0xe, 0x3, 0xe, 0x3, 0xe, 0x5, 0xe, 0xe7, 0xa, 0xe, 0x3, 0xf, 0x3, 
       0xf, 0x3, 0xf, 0x7, 0xf, 0xec, 0xa, 0xf, 0xc, 0xf, 0xe, 0xf, 0xef, 
       0xb, 0xf, 0x3, 0x10, 0x3, 0x10, 0x3, 0x10, 0x3, 0x10, 0x3, 0x11, 
       0x3, 0x11, 0x5, 0x11, 0xf7, 0xa, 0x11, 0x3, 0x11, 0x5, 0x11, 0xfa, 
       0xa, 0x11, 0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 0x13, 
       0x3, 0x13, 0x7, 0x13, 0x102, 0xa, 0x13, 0xc, 0x13, 0xe, 0x13, 0x105, 
       0xb, 0x13, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x14, 0x3, 0x15, 
       0x3, 0x15, 0x3, 0x15, 0x3, 0x16, 0x3, 0x16, 0x3, 0x17, 0x3, 0x17, 
       0x3, 0x18, 0x3, 0x18, 0x3, 0x18, 0x3, 0x18, 0x5, 0x18, 0x116, 0xa, 
       0x18, 0x3, 0x18, 0x3, 0x18, 0x3, 0x19, 0x3, 0x19, 0x3, 0x1a, 0x5, 
       0x1a, 0x11d, 0xa, 0x1a, 0x3, 0x1a, 0x3, 0x1a, 0x3, 0x1a, 0x3, 0x1a, 
       0x3, 0x1a, 0x3, 0x1a, 0x5, 0x1a, 0x125, 0xa, 0x1a, 0x3, 0x1b, 0x3, 
       0x1b, 0x3, 0x1c, 0x3, 0x1c, 0x3, 0x1c, 0x5, 0x1c, 0x12c, 0xa, 0x1c, 
       0x3, 0x1d, 0x3, 0x1d, 0x3, 0x1e, 0x3, 0x1e, 0x3, 0x1f, 0x3, 0x1f, 
       0x3, 0x1f, 0x5, 0x1f, 0x135, 0xa, 0x1f, 0x3, 0x20, 0x3, 0x20, 0x5, 
       0x20, 0x139, 0xa, 0x20, 0x3, 0x21, 0x3, 0x21, 0x5, 0x21, 0x13d, 0xa, 
       0x21, 0x3, 0x22, 0x3, 0x22, 0x3, 0x22, 0x7, 0x22, 0x142, 0xa, 0x22, 
       0xc, 0x22, 0xe, 0x22, 0x145, 0xb, 0x22, 0x3, 0x23, 0x3, 0x23, 0x3, 
       0x23, 0x3, 0x24, 0x3, 0x24, 0x3, 0x24, 0x3, 0x25, 0x3, 0x25, 0x5, 
       0x25, 0x14f, 0xa, 0x25, 0x3, 0x26, 0x3, 0x26, 0x3, 0x26, 0x3, 0x27, 
       0x3, 0x27, 0x5, 0x27, 0x156, 0xa, 0x27, 0x3, 0x27, 0x3, 0x27, 0x5, 
       0x27, 0x15a, 0xa, 0x27, 0x3, 0x27, 0x3, 0x27, 0x3, 0x28, 0x3, 0x28, 
       0x3, 0x29, 0x3, 0x29, 0x3, 0x29, 0x5, 0x29, 0x163, 0xa, 0x29, 0x3, 
       0x29, 0x3, 0x29, 0x5, 0x29, 0x167, 0xa, 0x29, 0x3, 0x29, 0x3, 0x29, 
       0x3, 0x29, 0x3, 0x29, 0x5, 0x29, 0x16d, 0xa, 0x29, 0x5, 0x29, 0x16f, 
       0xa, 0x29, 0x3, 0x29, 0x3, 0x29, 0x3, 0x29, 0x3, 0x29, 0x5, 0x29, 
       0x175, 0xa, 0x29, 0x3, 0x29, 0x3, 0x29, 0x3, 0x29, 0x3, 0x29, 0x3, 
       0x29, 0x5, 0x29, 0x17c, 0xa, 0x29, 0x3, 0x29, 0x3, 0x29, 0x5, 0x29, 
       0x180, 0xa, 0x29, 0x3, 0x29, 0x3, 0x29, 0x3, 0x29, 0x3, 0x29, 0x5, 
       0x29, 0x186, 0xa, 0x29, 0x5, 0x29, 0x188, 0xa, 0x29, 0x3, 0x29, 0x3, 
       0x29, 0x5, 0x29, 0x18c, 0xa, 0x29, 0x5, 0x29, 0x18e, 0xa, 0x29, 0x3, 
       0x2a, 0x3, 0x2a, 0x3, 0x2a, 0x5, 0x2a, 0x193, 0xa, 0x2a, 0x3, 0x2a, 
       0x3, 0x2a, 0x5, 0x2a, 0x197, 0xa, 0x2a, 0x3, 0x2a, 0x3, 0x2a, 0x3, 
       0x2a, 0x3, 0x2a, 0x5, 0x2a, 0x19d, 0xa, 0x2a, 0x5, 0x2a, 0x19f, 0xa, 
       0x2a, 0x3, 0x2a, 0x3, 0x2a, 0x3, 0x2a, 0x3, 0x2a, 0x5, 0x2a, 0x1a5, 
       0xa, 0x2a, 0x3, 0x2a, 0x3, 0x2a, 0x3, 0x2a, 0x3, 0x2a, 0x5, 0x2a, 
       0x1ab, 0xa, 0x2a, 0x3, 0x2a, 0x3, 0x2a, 0x5, 0x2a, 0x1af, 0xa, 0x2a, 
       0x3, 0x2a, 0x3, 0x2a, 0x3, 0x2a, 0x3, 0x2a, 0x5, 0x2a, 0x1b5, 0xa, 
       0x2a, 0x5, 0x2a, 0x1b7, 0xa, 0x2a, 0x3, 0x2a, 0x5, 0x2a, 0x1ba, 0xa, 
       0x2a, 0x3, 0x2b, 0x3, 0x2b, 0x3, 0x2b, 0x3, 0x2b, 0x5, 0x2b, 0x1c0, 
       0xa, 0x2b, 0x3, 0x2c, 0x3, 0x2c, 0x3, 0x2d, 0x3, 0x2d, 0x3, 0x2e, 
       0x3, 0x2e, 0x3, 0x2e, 0x3, 0x2e, 0x5, 0x2e, 0x1ca, 0xa, 0x2e, 0x3, 
       0x2e, 0x3, 0x2e, 0x3, 0x2f, 0x3, 0x2f, 0x3, 0x30, 0x3, 0x30, 0x3, 
       0x30, 0x3, 0x30, 0x5, 0x30, 0x1d4, 0xa, 0x30, 0x3, 0x30, 0x3, 0x30, 
       0x3, 0x31, 0x3, 0x31, 0x3, 0x32, 0x3, 0x32, 0x5, 0x32, 0x1dc, 0xa, 
       0x32, 0x3, 0x32, 0x3, 0x32, 0x5, 0x32, 0x1e0, 0xa, 0x32, 0x3, 0x32, 
       0x3, 0x32, 0x5, 0x32, 0x1e4, 0xa, 0x32, 0x3, 0x32, 0x3, 0x32, 0x3, 
       0x33, 0x3, 0x33, 0x3, 0x34, 0x3, 0x34, 0x5, 0x34, 0x1ec, 0xa, 0x34, 
       0x3, 0x35, 0x3, 0x35, 0x3, 0x35, 0x3, 0x35, 0x3, 0x36, 0x3, 0x36, 
       0x3, 0x36, 0x7, 0x36, 0x1f5, 0xa, 0x36, 0xc, 0x36, 0xe, 0x36, 0x1f8, 
       0xb, 0x36, 0x3, 0x37, 0x3, 0x37, 0x3, 0x37, 0x3, 0x37, 0x3, 0x38, 
       0x3, 0x38, 0x3, 0x38, 0x3, 0x38, 0x3, 0x38, 0x7, 0x38, 0x203, 0xa, 
       0x38, 0xc, 0x38, 0xe, 0x38, 0x206, 0xb, 0x38, 0x3, 0x39, 0x3, 0x39, 
       0x3, 0x39, 0x3, 0x39, 0x3, 0x39, 0x3, 0x39, 0x3, 0x39, 0x5, 0x39, 
       0x20f, 0xa, 0x39, 0x3, 0x3a, 0x3, 0x3a, 0x3, 0x3a, 0x3, 0x3a, 0x3, 
       0x3a, 0x3, 0x3a, 0x3, 0x3a, 0x3, 0x3a, 0x3, 0x3a, 0x5, 0x3a, 0x21a, 
       0xa, 0x3a, 0x3, 0x3b, 0x3, 0x3b, 0x3, 0x3b, 0x3, 0x3b, 0x3, 0x3b, 
       0x3, 0x3b, 0x5, 0x3b, 0x222, 0xa, 0x3b, 0x3, 0x3c, 0x5, 0x3c, 0x225, 
       0xa, 0x3c, 0x3, 0x3c, 0x3, 0x3c, 0x3, 0x3c, 0x3, 0x3c, 0x5, 0x3c, 
       0x22b, 0xa, 0x3c, 0x3, 0x3c, 0x5, 0x3c, 0x22e, 0xa, 0x3c, 0x3, 0x3c, 
       0x5, 0x3c, 0x231, 0xa, 0x3c, 0x3, 0x3c, 0x5, 0x3c, 0x234, 0xa, 0x3c, 
       0x3, 0x3c, 0x5, 0x3c, 0x237, 0xa, 0x3c, 0x3, 0x3c, 0x3, 0x3c, 0x5, 
       0x3c, 0x23b, 0xa, 0x3c, 0x3, 0x3c, 0x5, 0x3c, 0x23e, 0xa, 0x3c, 0x3, 
       0x3c, 0x5, 0x3c, 0x241, 0xa, 0x3c, 0x3, 0x3c, 0x5, 0x3c, 0x244, 0xa, 
       0x3c, 0x3, 0x3c, 0x5, 0x3c, 0x247, 0xa, 0x3c, 0x3, 0x3c, 0x3, 0x3c, 
       0x5, 0x3c, 0x24b, 0xa, 0x3c, 0x3, 0x3c, 0x5, 0x3c, 0x24e, 0xa, 0x3c, 
       0x3, 0x3c, 0x5, 0x3c, 0x251, 0xa, 0x3c, 0x3, 0x3c, 0x5, 0x3c, 0x254, 
       0xa, 0x3c, 0x3, 0x3c, 0x3, 0x3c, 0x5, 0x3c, 0x258, 0xa, 0x3c, 0x3, 
       0x3c, 0x5, 0x3c, 0x25b, 0xa, 0x3c, 0x3, 0x3c, 0x5, 0x3c, 0x25e, 0xa, 
       0x3c, 0x3, 0x3c, 0x5, 0x3c, 0x261, 0xa, 0x3c, 0x3, 0x3c, 0x3, 0x3c, 
       0x5, 0x3c, 0x265, 0xa, 0x3c, 0x3, 0x3c, 0x5, 0x3c, 0x268, 0xa, 0x3c, 
       0x3, 0x3c, 0x5, 0x3c, 0x26b, 0xa, 0x3c, 0x5, 0x3c, 0x26d, 0xa, 0x3c, 
       0x3, 0x3c, 0x5, 0x3c, 0x270, 0xa, 0x3c, 0x3, 0x3c, 0x3, 0x3c, 0x5, 
       0x3c, 0x274, 0xa, 0x3c, 0x3, 0x3c, 0x5, 0x3c, 0x277, 0xa, 0x3c, 0x3, 
       0x3c, 0x5, 0x3c, 0x27a, 0xa, 0x3c, 0x3, 0x3c, 0x5, 0x3c, 0x27d, 0xa, 
       0x3c, 0x3, 0x3c, 0x3, 0x3c, 0x3, 0x3c, 0x3, 0x3c, 0x5, 0x3c, 0x283, 
       0xa, 0x3c, 0x3, 0x3c, 0x5, 0x3c, 0x286, 0xa, 0x3c, 0x3, 0x3c, 0x5, 
       0x3c, 0x289, 0xa, 0x3c, 0x3, 0x3c, 0x5, 0x3c, 0x28c, 0xa, 0x3c, 0x3, 
       0x3c, 0x5, 0x3c, 0x28f, 0xa, 0x3c, 0x3, 0x3c, 0x3, 0x3c, 0x5, 0x3c, 
       0x293, 0xa, 0x3c, 0x3, 0x3c, 0x5, 0x3c, 0x296, 0xa, 0x3c, 0x3, 0x3c, 
       0x5, 0x3c, 0x299, 0xa, 0x3c, 0x3, 0x3c, 0x5, 0x3c, 0x29c, 0xa, 0x3c, 
       0x3, 0x3c, 0x3, 0x3c, 0x3, 0x3c, 0x3, 0x3c, 0x3, 0x3c, 0x3, 0x3c, 
       0x5, 0x3c, 0x2a4, 0xa, 0x3c, 0x3, 0x3c, 0x5, 0x3c, 0x2a7, 0xa, 0x3c, 
       0x3, 0x3c, 0x3, 0x3c, 0x5, 0x3c, 0x2ab, 0xa, 0x3c, 0x3, 0x3c, 0x5, 
       0x3c, 0x2ae, 0xa, 0x3c, 0x3, 0x3c, 0x5, 0x3c, 0x2b1, 0xa, 0x3c, 0x5, 
       0x3c, 0x2b3, 0xa, 0x3c, 0x3, 0x3d, 0x3, 0x3d, 0x3, 0x3d, 0x3, 0x3d, 
       0x3, 0x3e, 0x3, 0x3e, 0x7, 0x3e, 0x2bb, 0xa, 0x3e, 0xc, 0x3e, 0xe, 
       0x3e, 0x2be, 0xb, 0x3e, 0x3, 0x3f, 0x3, 0x3f, 0x7, 0x3f, 0x2c2, 0xa, 
       0x3f, 0xc, 0x3f, 0xe, 0x3f, 0x2c5, 0xb, 0x3f, 0x3, 0x40, 0x3, 0x40, 
       0x3, 0x41, 0x3, 0x41, 0x3, 0x42, 0x3, 0x42, 0x3, 0x43, 0x3, 0x43, 
       0x3, 0x44, 0x3, 0x44, 0x3, 0x45, 0x3, 0x45, 0x3, 0x45, 0x2, 0x2, 
       0x46, 0x2, 0x4, 0x6, 0x8, 0xa, 0xc, 0xe, 0x10, 0x12, 0x14, 0x16, 
       0x18, 0x1a, 0x1c, 0x1e, 0x20, 0x22, 0x24, 0x26, 0x28, 0x2a, 0x2c, 
       0x2e, 0x30, 0x32, 0x34, 0x36, 0x38, 0x3a, 0x3c, 0x3e, 0x40, 0x42, 
       0x44, 0x46, 0x48, 0x4a, 0x4c, 0x4e, 0x50, 0x52, 0x54, 0x56, 0x58, 
       0x5a, 0x5c, 0x5e, 0x60, 0x62, 0x64, 0x66, 0x68, 0x6a, 0x6c, 0x6e, 
       0x70, 0x72, 0x74, 0x76, 0x78, 0x7a, 0x7c, 0x7e, 0x80, 0x82, 0x84, 
       0x86, 0x88, 0x2, 0x6, 0x4, 0x2, 0x15, 0x15, 0x19, 0x19, 0x4, 0x2, 
       0x1f, 0x1f, 0x2b, 0x2b, 0x4, 0x2, 0x20, 0x20, 0x22, 0x22, 0xa, 0x2, 
       0xb, 0xf, 0x15, 0x15, 0x18, 0x18, 0x1d, 0x25, 0x28, 0x2b, 0x2d, 0x2e, 
       0x30, 0x30, 0x32, 0x34, 0x2, 0x313, 0x2, 0x8a, 0x3, 0x2, 0x2, 0x2, 
       0x4, 0x92, 0x3, 0x2, 0x2, 0x2, 0x6, 0xa2, 0x3, 0x2, 0x2, 0x2, 0x8, 
       0xaa, 0x3, 0x2, 0x2, 0x2, 0xa, 0xac, 0x3, 0x2, 0x2, 0x2, 0xc, 0xb5, 
       0x3, 0x2, 0x2, 0x2, 0xe, 0xb7, 0x3, 0x2, 0x2, 0x2, 0x10, 0xb9, 0x3, 
       0x2, 0x2, 0x2, 0x12, 0xbd, 0x3, 0x2, 0x2, 0x2, 0x14, 0xcd, 0x3, 0x2, 
       0x2, 0x2, 0x16, 0xd1, 0x3, 0x2, 0x2, 0x2, 0x18, 0xde, 0x3, 0x2, 0x2, 
       0x2, 0x1a, 0xe6, 0x3, 0x2, 0x2, 0x2, 0x1c, 0xe8, 0x3, 0x2, 0x2, 0x2, 
       0x1e, 0xf0, 0x3, 0x2, 0x2, 0x2, 0x20, 0xf4, 0x3, 0x2, 0x2, 0x2, 0x22, 
       0xfb, 0x3, 0x2, 0x2, 0x2, 0x24, 0xff, 0x3, 0x2, 0x2, 0x2, 0x26, 0x106, 
       0x3, 0x2, 0x2, 0x2, 0x28, 0x10a, 0x3, 0x2, 0x2, 0x2, 0x2a, 0x10d, 
       0x3, 0x2, 0x2, 0x2, 0x2c, 0x10f, 0x3, 0x2, 0x2, 0x2, 0x2e, 0x111, 
       0x3, 0x2, 0x2, 0x2, 0x30, 0x119, 0x3, 0x2, 0x2, 0x2, 0x32, 0x11c, 
       0x3, 0x2, 0x2, 0x2, 0x34, 0x126, 0x3, 0x2, 0x2, 0x2, 0x36, 0x12b, 
       0x3, 0x2, 0x2, 0x2, 0x38, 0x12d, 0x3, 0x2, 0x2, 0x2, 0x3a, 0x12f, 
       0x3, 0x2, 0x2, 0x2, 0x3c, 0x134, 0x3, 0x2, 0x2, 0x2, 0x3e, 0x138, 
       0x3, 0x2, 0x2, 0x2, 0x40, 0x13c, 0x3, 0x2, 0x2, 0x2, 0x42, 0x13e, 
       0x3, 0x2, 0x2, 0x2, 0x44, 0x146, 0x3, 0x2, 0x2, 0x2, 0x46, 0x149, 
       0x3, 0x2, 0x2, 0x2, 0x48, 0x14c, 0x3, 0x2, 0x2, 0x2, 0x4a, 0x150, 
       0x3, 0x2, 0x2, 0x2, 0x4c, 0x153, 0x3, 0x2, 0x2, 0x2, 0x4e, 0x15d, 
       0x3, 0x2, 0x2, 0x2, 0x50, 0x18d, 0x3, 0x2, 0x2, 0x2, 0x52, 0x1b9, 
       0x3, 0x2, 0x2, 0x2, 0x54, 0x1bb, 0x3, 0x2, 0x2, 0x2, 0x56, 0x1c1, 
       0x3, 0x2, 0x2, 0x2, 0x58, 0x1c3, 0x3, 0x2, 0x2, 0x2, 0x5a, 0x1c5, 
       0x3, 0x2, 0x2, 0x2, 0x5c, 0x1cd, 0x3, 0x2, 0x2, 0x2, 0x5e, 0x1cf, 
       0x3, 0x2, 0x2, 0x2, 0x60, 0x1d7, 0x3, 0x2, 0x2, 0x2, 0x62, 0x1d9, 
       0x3, 0x2, 0x2, 0x2, 0x64, 0x1e7, 0x3, 0x2, 0x2, 0x2, 0x66, 0x1eb, 
       0x3, 0x2, 0x2, 0x2, 0x68, 0x1ed, 0x3, 0x2, 0x2, 0x2, 0x6a, 0x1f1, 
       0x3, 0x2, 0x2, 0x2, 0x6c, 0x1f9, 0x3, 0x2, 0x2, 0x2, 0x6e, 0x1fd, 
       0x3, 0x2, 0x2, 0x2, 0x70, 0x20e, 0x3, 0x2, 0x2, 0x2, 0x72, 0x219, 
       0x3, 0x2, 0x2, 0x2, 0x74, 0x221, 0x3, 0x2, 0x2, 0x2, 0x76, 0x2b2, 
       0x3, 0x2, 0x2, 0x2, 0x78, 0x2b4, 0x3, 0x2, 0x2, 0x2, 0x7a, 0x2b8, 
       0x3, 0x2, 0x2, 0x2, 0x7c, 0x2bf, 0x3, 0x2, 0x2, 0x2, 0x7e, 0x2c6, 
       0x3, 0x2, 0x2, 0x2, 0x80, 0x2c8, 0x3, 0x2, 0x2, 0x2, 0x82, 0x2ca, 
       0x3, 0x2, 0x2, 0x2, 0x84, 0x2cc, 0x3, 0x2, 0x2, 0x2, 0x86, 0x2ce, 
       0x3, 0x2, 0x2, 0x2, 0x88, 0x2d0, 0x3, 0x2, 0x2, 0x2, 0x8a, 0x8b, 
       0x5, 0x4, 0x3, 0x2, 0x8b, 0x8c, 0x7, 0x2, 0x2, 0x3, 0x8c, 0x3, 0x3, 
       0x2, 0x2, 0x2, 0x8d, 0x93, 0x5, 0x6, 0x4, 0x2, 0x8e, 0x8f, 0x5, 0x6, 
       0x4, 0x2, 0x8f, 0x90, 0x5, 0x4, 0x3, 0x2, 0x90, 0x93, 0x3, 0x2, 0x2, 
       0x2, 0x91, 0x93, 0x3, 0x2, 0x2, 0x2, 0x92, 0x8d, 0x3, 0x2, 0x2, 0x2, 
       0x92, 0x8e, 0x3, 0x2, 0x2, 0x2, 0x92, 0x91, 0x3, 0x2, 0x2, 0x2, 0x93, 
       0x5, 0x3, 0x2, 0x2, 0x2, 0x94, 0xa3, 0x5, 0xa, 0x6, 0x2, 0x95, 0xa3, 
       0x5, 0x10, 0x9, 0x2, 0x96, 0xa3, 0x5, 0x1e, 0x10, 0x2, 0x97, 0xa3, 
       0x5, 0x20, 0x11, 0x2, 0x98, 0xa3, 0x5, 0x2e, 0x18, 0x2, 0x99, 0xa3, 
       0x5, 0x44, 0x23, 0x2, 0x9a, 0xa3, 0x5, 0x46, 0x24, 0x2, 0x9b, 0xa3, 
       0x5, 0x48, 0x25, 0x2, 0x9c, 0xa3, 0x5, 0x50, 0x29, 0x2, 0x9d, 0xa3, 
       0x5, 0x5a, 0x2e, 0x2, 0x9e, 0xa3, 0x5, 0x5e, 0x30, 0x2, 0x9f, 0xa3, 
       0x5, 0x62, 0x32, 0x2, 0xa0, 0xa3, 0x5, 0x8, 0x5, 0x2, 0xa1, 0xa3, 
       0x5, 0x88, 0x45, 0x2, 0xa2, 0x94, 0x3, 0x2, 0x2, 0x2, 0xa2, 0x95, 
       0x3, 0x2, 0x2, 0x2, 0xa2, 0x96, 0x3, 0x2, 0x2, 0x2, 0xa2, 0x97, 0x3, 
       0x2, 0x2, 0x2, 0xa2, 0x98, 0x3, 0x2, 0x2, 0x2, 0xa2, 0x99, 0x3, 0x2, 
       0x2, 0x2, 0xa2, 0x9a, 0x3, 0x2, 0x2, 0x2, 0xa2, 0x9b, 0x3, 0x2, 0x2, 
       0x2, 0xa2, 0x9c, 0x3, 0x2, 0x2, 0x2, 0xa2, 0x9d, 0x3, 0x2, 0x2, 0x2, 
       0xa2, 0x9e, 0x3, 0x2, 0x2, 0x2, 0xa2, 0x9f, 0x3, 0x2, 0x2, 0x2, 0xa2, 
       0xa0, 0x3, 0x2, 0x2, 0x2, 0xa2, 0xa1, 0x3, 0x2, 0x2, 0x2, 0xa3, 0x7, 
       0x3, 0x2, 0x2, 0x2, 0xa4, 0xa5, 0x7, 0x26, 0x2, 0x2, 0xa5, 0xab, 
       0x7, 0x27, 0x2, 0x2, 0xa6, 0xa7, 0x7, 0x26, 0x2, 0x2, 0xa7, 0xa8, 
       0x5, 0x4, 0x3, 0x2, 0xa8, 0xa9, 0x7, 0x27, 0x2, 0x2, 0xa9, 0xab, 
       0x3, 0x2, 0x2, 0x2, 0xaa, 0xa4, 0x3, 0x2, 0x2, 0x2, 0xaa, 0xa6, 0x3, 
       0x2, 0x2, 0x2, 0xab, 0x9, 0x3, 0x2, 0x2, 0x2, 0xac, 0xad, 0x7, 0x3, 
       0x2, 0x2, 0xad, 0xae, 0x5, 0xc, 0x7, 0x2, 0xae, 0xaf, 0x7, 0x1e, 
       0x2, 0x2, 0xaf, 0xb, 0x3, 0x2, 0x2, 0x2, 0xb0, 0xb6, 0x5, 0xe, 0x8, 
       0x2, 0xb1, 0xb2, 0x5, 0xe, 0x8, 0x2, 0xb2, 0xb3, 0x7, 0x23, 0x2, 
       0x2, 0xb3, 0xb4, 0x5, 0xc, 0x7, 0x2, 0xb4, 0xb6, 0x3, 0x2, 0x2, 0x2, 
       0xb5, 0xb0, 0x3, 0x2, 0x2, 0x2, 0xb5, 0xb1, 0x3, 0x2, 0x2, 0x2, 0xb6, 
       0xd, 0x3, 0x2, 0x2, 0x2, 0xb7, 0xb8, 0x7, 0x34, 0x2, 0x2, 0xb8, 0xf, 
       0x3, 0x2, 0x2, 0x2, 0xb9, 0xba, 0x7, 0x4, 0x2, 0x2, 0xba, 0xbb, 0x5, 
       0x12, 0xa, 0x2, 0xbb, 0xbc, 0x7, 0x1e, 0x2, 0x2, 0xbc, 0x11, 0x3, 
       0x2, 0x2, 0x2, 0xbd, 0xbf, 0x5, 0x14, 0xb, 0x2, 0xbe, 0xc0, 0x9, 
       0x2, 0x2, 0x2, 0xbf, 0xbe, 0x3, 0x2, 0x2, 0x2, 0xbf, 0xc0, 0x3, 0x2, 
       0x2, 0x2, 0xc0, 0xc1, 0x3, 0x2, 0x2, 0x2, 0xc1, 0xc6, 0x5, 0x7c, 
       0x3f, 0x2, 0xc2, 0xc3, 0x7, 0x23, 0x2, 0x2, 0xc3, 0xc5, 0x5, 0x12, 
       0xa, 0x2, 0xc4, 0xc2, 0x3, 0x2, 0x2, 0x2, 0xc5, 0xc8, 0x3, 0x2, 0x2, 
       0x2, 0xc6, 0xc4, 0x3, 0x2, 0x2, 0x2, 0xc6, 0xc7, 0x3, 0x2, 0x2, 0x2, 
       0xc7, 0x13, 0x3, 0x2, 0x2, 0x2, 0xc8, 0xc6, 0x3, 0x2, 0x2, 0x2, 0xc9, 
       0xce, 0x5, 0x7e, 0x40, 0x2, 0xca, 0xcb, 0x5, 0x7e, 0x40, 0x2, 0xcb, 
       0xcc, 0x7, 0x30, 0x2, 0x2, 0xcc, 0xce, 0x3, 0x2, 0x2, 0x2, 0xcd, 
       0xc9, 0x3, 0x2, 0x2, 0x2, 0xcd, 0xca, 0x3, 0x2, 0x2, 0x2, 0xce, 0xcf, 
       0x3, 0x2, 0x2, 0x2, 0xcf, 0xd0, 0x9, 0x3, 0x2, 0x2, 0xd0, 0x15, 0x3, 
       0x2, 0x2, 0x2, 0xd1, 0xd3, 0x5, 0x18, 0xd, 0x2, 0xd2, 0xd4, 0x5, 
       0x7e, 0x40, 0x2, 0xd3, 0xd2, 0x3, 0x2, 0x2, 0x2, 0xd3, 0xd4, 0x3, 
       0x2, 0x2, 0x2, 0xd4, 0xd5, 0x3, 0x2, 0x2, 0x2, 0xd5, 0xd6, 0x5, 0x1a, 
       0xe, 0x2, 0xd6, 0x17, 0x3, 0x2, 0x2, 0x2, 0xd7, 0xdf, 0x5, 0x7e, 
       0x40, 0x2, 0xd8, 0xd9, 0x5, 0x7e, 0x40, 0x2, 0xd9, 0xda, 0x7, 0x20, 
       0x2, 0x2, 0xda, 0xdf, 0x3, 0x2, 0x2, 0x2, 0xdb, 0xdc, 0x5, 0x7e, 
       0x40, 0x2, 0xdc, 0xdd, 0x7, 0x22, 0x2, 0x2, 0xdd, 0xdf, 0x3, 0x2, 
       0x2, 0x2, 0xde, 0xd7, 0x3, 0x2, 0x2, 0x2, 0xde, 0xd8, 0x3, 0x2, 0x2, 
       0x2, 0xde, 0xdb, 0x3, 0x2, 0x2, 0x2, 0xdf, 0x19, 0x3, 0x2, 0x2, 0x2, 
       0xe0, 0xe1, 0x7, 0x28, 0x2, 0x2, 0xe1, 0xe7, 0x7, 0x29, 0x2, 0x2, 
       0xe2, 0xe3, 0x7, 0x28, 0x2, 0x2, 0xe3, 0xe4, 0x5, 0x1c, 0xf, 0x2, 
       0xe4, 0xe5, 0x7, 0x29, 0x2, 0x2, 0xe5, 0xe7, 0x3, 0x2, 0x2, 0x2, 
       0xe6, 0xe0, 0x3, 0x2, 0x2, 0x2, 0xe6, 0xe2, 0x3, 0x2, 0x2, 0x2, 0xe7, 
       0x1b, 0x3, 0x2, 0x2, 0x2, 0xe8, 0xed, 0x5, 0x76, 0x3c, 0x2, 0xe9, 
       0xea, 0x7, 0x23, 0x2, 0x2, 0xea, 0xec, 0x5, 0x1c, 0xf, 0x2, 0xeb, 
       0xe9, 0x3, 0x2, 0x2, 0x2, 0xec, 0xef, 0x3, 0x2, 0x2, 0x2, 0xed, 0xeb, 
       0x3, 0x2, 0x2, 0x2, 0xed, 0xee, 0x3, 0x2, 0x2, 0x2, 0xee, 0x1d, 0x3, 
       0x2, 0x2, 0x2, 0xef, 0xed, 0x3, 0x2, 0x2, 0x2, 0xf0, 0xf1, 0x7, 0x9, 
       0x2, 0x2, 0xf1, 0xf2, 0x5, 0x7c, 0x3f, 0x2, 0xf2, 0xf3, 0x7, 0x1e, 
       0x2, 0x2, 0xf3, 0x1f, 0x3, 0x2, 0x2, 0x2, 0xf4, 0xf6, 0x5, 0x22, 
       0x12, 0x2, 0xf5, 0xf7, 0x5, 0x24, 0x13, 0x2, 0xf6, 0xf5, 0x3, 0x2, 
       0x2, 0x2, 0xf6, 0xf7, 0x3, 0x2, 0x2, 0x2, 0xf7, 0xf9, 0x3, 0x2, 0x2, 
       0x2, 0xf8, 0xfa, 0x5, 0x28, 0x15, 0x2, 0xf9, 0xf8, 0x3, 0x2, 0x2, 
       0x2, 0xf9, 0xfa, 0x3, 0x2, 0x2, 0x2, 0xfa, 0x21, 0x3, 0x2, 0x2, 0x2, 
       0xfb, 0xfc, 0x7, 0x5, 0x2, 0x2, 0xfc, 0xfd, 0x5, 0x2a, 0x16, 0x2, 
       0xfd, 0xfe, 0x5, 0x2c, 0x17, 0x2, 0xfe, 0x23, 0x3, 0x2, 0x2, 0x2, 
       0xff, 0x103, 0x5, 0x26, 0x14, 0x2, 0x100, 0x102, 0x5, 0x24, 0x13, 
       0x2, 0x101, 0x100, 0x3, 0x2, 0x2, 0x2, 0x102, 0x105, 0x3, 0x2, 0x2, 
       0x2, 0x103, 0x101, 0x3, 0x2, 0x2, 0x2, 0x103, 0x104, 0x3, 0x2, 0x2, 
       0x2, 0x104, 0x25, 0x3, 0x2, 0x2, 0x2, 0x105, 0x103, 0x3, 0x2, 0x2, 
       0x2, 0x106, 0x107, 0x7, 0x6, 0x2, 0x2, 0x107, 0x108, 0x5, 0x2a, 0x16, 
       0x2, 0x108, 0x109, 0x5, 0x2c, 0x17, 0x2, 0x109, 0x27, 0x3, 0x2, 0x2, 
       0x2, 0x10a, 0x10b, 0x7, 0x7, 0x2, 0x2, 0x10b, 0x10c, 0x5, 0x2c, 0x17, 
       0x2, 0x10c, 0x29, 0x3, 0x2, 0x2, 0x2, 0x10d, 0x10e, 0x5, 0x7c, 0x3f, 
       0x2, 0x10e, 0x2b, 0x3, 0x2, 0x2, 0x2, 0x10f, 0x110, 0x5, 0x70, 0x39, 
       0x2, 0x110, 0x2d, 0x3, 0x2, 0x2, 0x2, 0x111, 0x115, 0x7, 0x8, 0x2, 
       0x2, 0x112, 0x116, 0x5, 0x36, 0x1c, 0x2, 0x113, 0x116, 0x5, 0x34, 
       0x1b, 0x2, 0x114, 0x116, 0x5, 0x32, 0x1a, 0x2, 0x115, 0x112, 0x3, 
       0x2, 0x2, 0x2, 0x115, 0x113, 0x3, 0x2, 0x2, 0x2, 0x115, 0x114, 0x3, 
       0x2, 0x2, 0x2, 0x116, 0x117, 0x3, 0x2, 0x2, 0x2, 0x117, 0x118, 0x5, 
       0x30, 0x19, 0x2, 0x118, 0x2f, 0x3, 0x2, 0x2, 0x2, 0x119, 0x11a, 0x5, 
       0x70, 0x39, 0x2, 0x11a, 0x31, 0x3, 0x2, 0x2, 0x2, 0x11b, 0x11d, 0x7, 
       0x28, 0x2, 0x2, 0x11c, 0x11b, 0x3, 0x2, 0x2, 0x2, 0x11c, 0x11d, 0x3, 
       0x2, 0x2, 0x2, 0x11d, 0x11e, 0x3, 0x2, 0x2, 0x2, 0x11e, 0x11f, 0x5, 
       0x3c, 0x1f, 0x2, 0x11f, 0x120, 0x5, 0x38, 0x1d, 0x2, 0x120, 0x121, 
       0x5, 0x3e, 0x20, 0x2, 0x121, 0x122, 0x5, 0x3a, 0x1e, 0x2, 0x122, 
       0x124, 0x5, 0x40, 0x21, 0x2, 0x123, 0x125, 0x7, 0x29, 0x2, 0x2, 0x124, 
       0x123, 0x3, 0x2, 0x2, 0x2, 0x124, 0x125, 0x3, 0x2, 0x2, 0x2, 0x125, 
       0x33, 0x3, 0x2, 0x2, 0x2, 0x126, 0x127, 0x5, 0x3e, 0x20, 0x2, 0x127, 
       0x35, 0x3, 0x2, 0x2, 0x2, 0x128, 0x129, 0x7, 0x28, 0x2, 0x2, 0x129, 
       0x12c, 0x7, 0x29, 0x2, 0x2, 0x12a, 0x12c, 0x3, 0x2, 0x2, 0x2, 0x12b, 
       0x128, 0x3, 0x2, 0x2, 0x2, 0x12b, 0x12a, 0x3, 0x2, 0x2, 0x2, 0x12c, 
       0x37, 0x3, 0x2, 0x2, 0x2, 0x12d, 0x12e, 0x7, 0x1e, 0x2, 0x2, 0x12e, 
       0x39, 0x3, 0x2, 0x2, 0x2, 0x12f, 0x130, 0x7, 0x1e, 0x2, 0x2, 0x130, 
       0x3b, 0x3, 0x2, 0x2, 0x2, 0x131, 0x132, 0x7, 0x4, 0x2, 0x2, 0x132, 
       0x135, 0x5, 0x12, 0xa, 0x2, 0x133, 0x135, 0x3, 0x2, 0x2, 0x2, 0x134, 
       0x131, 0x3, 0x2, 0x2, 0x2, 0x134, 0x133, 0x3, 0x2, 0x2, 0x2, 0x135, 
       0x3d, 0x3, 0x2, 0x2, 0x2, 0x136, 0x139, 0x5, 0x7c, 0x3f, 0x2, 0x137, 
       0x139, 0x3, 0x2, 0x2, 0x2, 0x138, 0x136, 0x3, 0x2, 0x2, 0x2, 0x138, 
       0x137, 0x3, 0x2, 0x2, 0x2, 0x139, 0x3f, 0x3, 0x2, 0x2, 0x2, 0x13a, 
       0x13d, 0x5, 0x42, 0x22, 0x2, 0x13b, 0x13d, 0x3, 0x2, 0x2, 0x2, 0x13c, 
       0x13a, 0x3, 0x2, 0x2, 0x2, 0x13c, 0x13b, 0x3, 0x2, 0x2, 0x2, 0x13d, 
       0x41, 0x3, 0x2, 0x2, 0x2, 0x13e, 0x143, 0x5, 0x7c, 0x3f, 0x2, 0x13f, 
       0x140, 0x7, 0x23, 0x2, 0x2, 0x140, 0x142, 0x5, 0x7c, 0x3f, 0x2, 0x141, 
       0x13f, 0x3, 0x2, 0x2, 0x2, 0x142, 0x145, 0x3, 0x2, 0x2, 0x2, 0x143, 
       0x141, 0x3, 0x2, 0x2, 0x2, 0x143, 0x144, 0x3, 0x2, 0x2, 0x2, 0x144, 
       0x43, 0x3, 0x2, 0x2, 0x2, 0x145, 0x143, 0x3, 0x2, 0x2, 0x2, 0x146, 
       0x147, 0x7, 0x16, 0x2, 0x2, 0x147, 0x148, 0x7, 0x1e, 0x2, 0x2, 0x148, 
       0x45, 0x3, 0x2, 0x2, 0x2, 0x149, 0x14a, 0x7, 0x17, 0x2, 0x2, 0x14a, 
       0x14b, 0x7, 0x1e, 0x2, 0x2, 0x14b, 0x47, 0x3, 0x2, 0x2, 0x2, 0x14c, 
       0x14e, 0x5, 0x4a, 0x26, 0x2, 0x14d, 0x14f, 0x5, 0x4c, 0x27, 0x2, 
       0x14e, 0x14d, 0x3, 0x2, 0x2, 0x2, 0x14e, 0x14f, 0x3, 0x2, 0x2, 0x2, 
       0x14f, 0x49, 0x3, 0x2, 0x2, 0x2, 0x150, 0x151, 0x7, 0x1a, 0x2, 0x2, 
       0x151, 0x152, 0x5, 0x4e, 0x28, 0x2, 0x152, 0x4b, 0x3, 0x2, 0x2, 0x2, 
       0x153, 0x155, 0x7, 0x1b, 0x2, 0x2, 0x154, 0x156, 0x7, 0x28, 0x2, 
       0x2, 0x155, 0x154, 0x3, 0x2, 0x2, 0x2, 0x155, 0x156, 0x3, 0x2, 0x2, 
       0x2, 0x156, 0x157, 0x3, 0x2, 0x2, 0x2, 0x157, 0x159, 0x5, 0x7e, 0x40, 
       0x2, 0x158, 0x15a, 0x7, 0x29, 0x2, 0x2, 0x159, 0x158, 0x3, 0x2, 0x2, 
       0x2, 0x159, 0x15a, 0x3, 0x2, 0x2, 0x2, 0x15a, 0x15b, 0x3, 0x2, 0x2, 
       0x2, 0x15b, 0x15c, 0x5, 0x4e, 0x28, 0x2, 0x15c, 0x4d, 0x3, 0x2, 0x2, 
       0x2, 0x15d, 0x15e, 0x5, 0x70, 0x39, 0x2, 0x15e, 0x4f, 0x3, 0x2, 0x2, 
       0x2, 0x15f, 0x160, 0x7, 0x28, 0x2, 0x2, 0x160, 0x162, 0x7, 0xa, 0x2, 
       0x2, 0x161, 0x163, 0x5, 0x7e, 0x40, 0x2, 0x162, 0x161, 0x3, 0x2, 
       0x2, 0x2, 0x162, 0x163, 0x3, 0x2, 0x2, 0x2, 0x163, 0x164, 0x3, 0x2, 
       0x2, 0x2, 0x164, 0x166, 0x7, 0x28, 0x2, 0x2, 0x165, 0x167, 0x5, 0x54, 
       0x2b, 0x2, 0x166, 0x165, 0x3, 0x2, 0x2, 0x2, 0x166, 0x167, 0x3, 0x2, 
       0x2, 0x2, 0x167, 0x168, 0x3, 0x2, 0x2, 0x2, 0x168, 0x16e, 0x7, 0x29, 
       0x2, 0x2, 0x169, 0x16c, 0x7, 0x1c, 0x2, 0x2, 0x16a, 0x16d, 0x5, 0x80, 
       0x41, 0x2, 0x16b, 0x16d, 0x7, 0x30, 0x2, 0x2, 0x16c, 0x16a, 0x3, 
       0x2, 0x2, 0x2, 0x16c, 0x16b, 0x3, 0x2, 0x2, 0x2, 0x16d, 0x16f, 0x3, 
       0x2, 0x2, 0x2, 0x16e, 0x169, 0x3, 0x2, 0x2, 0x2, 0x16e, 0x16f, 0x3, 
       0x2, 0x2, 0x2, 0x16f, 0x170, 0x3, 0x2, 0x2, 0x2, 0x170, 0x171, 0x5, 
       0x58, 0x2d, 0x2, 0x171, 0x172, 0x7, 0x29, 0x2, 0x2, 0x172, 0x174, 
       0x7, 0x28, 0x2, 0x2, 0x173, 0x175, 0x5, 0x56, 0x2c, 0x2, 0x174, 0x173, 
       0x3, 0x2, 0x2, 0x2, 0x174, 0x175, 0x3, 0x2, 0x2, 0x2, 0x175, 0x176, 
       0x3, 0x2, 0x2, 0x2, 0x176, 0x177, 0x7, 0x29, 0x2, 0x2, 0x177, 0x178, 
       0x7, 0x1e, 0x2, 0x2, 0x178, 0x18e, 0x3, 0x2, 0x2, 0x2, 0x179, 0x17b, 
       0x7, 0xa, 0x2, 0x2, 0x17a, 0x17c, 0x5, 0x7e, 0x40, 0x2, 0x17b, 0x17a, 
       0x3, 0x2, 0x2, 0x2, 0x17b, 0x17c, 0x3, 0x2, 0x2, 0x2, 0x17c, 0x17d, 
       0x3, 0x2, 0x2, 0x2, 0x17d, 0x17f, 0x7, 0x28, 0x2, 0x2, 0x17e, 0x180, 
       0x5, 0x54, 0x2b, 0x2, 0x17f, 0x17e, 0x3, 0x2, 0x2, 0x2, 0x17f, 0x180, 
       0x3, 0x2, 0x2, 0x2, 0x180, 0x181, 0x3, 0x2, 0x2, 0x2, 0x181, 0x187, 
       0x7, 0x29, 0x2, 0x2, 0x182, 0x185, 0x7, 0x1c, 0x2, 0x2, 0x183, 0x186, 
       0x5, 0x80, 0x41, 0x2, 0x184, 0x186, 0x7, 0x30, 0x2, 0x2, 0x185, 0x183, 
       0x3, 0x2, 0x2, 0x2, 0x185, 0x184, 0x3, 0x2, 0x2, 0x2, 0x186, 0x188, 
       0x3, 0x2, 0x2, 0x2, 0x187, 0x182, 0x3, 0x2, 0x2, 0x2, 0x187, 0x188, 
       0x3, 0x2, 0x2, 0x2, 0x188, 0x18b, 0x3, 0x2, 0x2, 0x2, 0x189, 0x18c, 
       0x5, 0x58, 0x2d, 0x2, 0x18a, 0x18c, 0x7, 0x1e, 0x2, 0x2, 0x18b, 0x189, 
       0x3, 0x2, 0x2, 0x2, 0x18b, 0x18a, 0x3, 0x2, 0x2, 0x2, 0x18c, 0x18e, 
       0x3, 0x2, 0x2, 0x2, 0x18d, 0x15f, 0x3, 0x2, 0x2, 0x2, 0x18d, 0x179, 
       0x3, 0x2, 0x2, 0x2, 0x18e, 0x51, 0x3, 0x2, 0x2, 0x2, 0x18f, 0x190, 
       0x7, 0x28, 0x2, 0x2, 0x190, 0x192, 0x7, 0xa, 0x2, 0x2, 0x191, 0x193, 
       0x5, 0x7e, 0x40, 0x2, 0x192, 0x191, 0x3, 0x2, 0x2, 0x2, 0x192, 0x193, 
       0x3, 0x2, 0x2, 0x2, 0x193, 0x194, 0x3, 0x2, 0x2, 0x2, 0x194, 0x196, 
       0x7, 0x28, 0x2, 0x2, 0x195, 0x197, 0x5, 0x54, 0x2b, 0x2, 0x196, 0x195, 
       0x3, 0x2, 0x2, 0x2, 0x196, 0x197, 0x3, 0x2, 0x2, 0x2, 0x197, 0x198, 
       0x3, 0x2, 0x2, 0x2, 0x198, 0x19e, 0x7, 0x29, 0x2, 0x2, 0x199, 0x19c, 
       0x7, 0x1c, 0x2, 0x2, 0x19a, 0x19d, 0x5, 0x80, 0x41, 0x2, 0x19b, 0x19d, 
       0x7, 0x30, 0x2, 0x2, 0x19c, 0x19a, 0x3, 0x2, 0x2, 0x2, 0x19c, 0x19b, 
       0x3, 0x2, 0x2, 0x2, 0x19d, 0x19f, 0x3, 0x2, 0x2, 0x2, 0x19e, 0x199, 
       0x3, 0x2, 0x2, 0x2, 0x19e, 0x19f, 0x3, 0x2, 0x2, 0x2, 0x19f, 0x1a0, 
       0x3, 0x2, 0x2, 0x2, 0x1a0, 0x1a1, 0x5, 0x58, 0x2d, 0x2, 0x1a1, 0x1a2, 
       0x7, 0x29, 0x2, 0x2, 0x1a2, 0x1a4, 0x7, 0x28, 0x2, 0x2, 0x1a3, 0x1a5, 
       0x5, 0x56, 0x2c, 0x2, 0x1a4, 0x1a3, 0x3, 0x2, 0x2, 0x2, 0x1a4, 0x1a5, 
       0x3, 0x2, 0x2, 0x2, 0x1a5, 0x1a6, 0x3, 0x2, 0x2, 0x2, 0x1a6, 0x1a7, 
       0x7, 0x29, 0x2, 0x2, 0x1a7, 0x1ba, 0x3, 0x2, 0x2, 0x2, 0x1a8, 0x1aa, 
       0x7, 0xa, 0x2, 0x2, 0x1a9, 0x1ab, 0x5, 0x7e, 0x40, 0x2, 0x1aa, 0x1a9, 
       0x3, 0x2, 0x2, 0x2, 0x1aa, 0x1ab, 0x3, 0x2, 0x2, 0x2, 0x1ab, 0x1ac, 
       0x3, 0x2, 0x2, 0x2, 0x1ac, 0x1ae, 0x7, 0x28, 0x2, 0x2, 0x1ad, 0x1af, 
       0x5, 0x54, 0x2b, 0x2, 0x1ae, 0x1ad, 0x3, 0x2, 0x2, 0x2, 0x1ae, 0x1af, 
       0x3, 0x2, 0x2, 0x2, 0x1af, 0x1b0, 0x3, 0x2, 0x2, 0x2, 0x1b0, 0x1b6, 
       0x7, 0x29, 0x2, 0x2, 0x1b1, 0x1b4, 0x7, 0x1c, 0x2, 0x2, 0x1b2, 0x1b5, 
       0x5, 0x80, 0x41, 0x2, 0x1b3, 0x1b5, 0x7, 0x30, 0x2, 0x2, 0x1b4, 0x1b2, 
       0x3, 0x2, 0x2, 0x2, 0x1b4, 0x1b3, 0x3, 0x2, 0x2, 0x2, 0x1b5, 0x1b7, 
       0x3, 0x2, 0x2, 0x2, 0x1b6, 0x1b1, 0x3, 0x2, 0x2, 0x2, 0x1b6, 0x1b7, 
       0x3, 0x2, 0x2, 0x2, 0x1b7, 0x1b8, 0x3, 0x2, 0x2, 0x2, 0x1b8, 0x1ba, 
       0x5, 0x58, 0x2d, 0x2, 0x1b9, 0x18f, 0x3, 0x2, 0x2, 0x2, 0x1b9, 0x1a8, 
       0x3, 0x2, 0x2, 0x2, 0x1ba, 0x53, 0x3, 0x2, 0x2, 0x2, 0x1bb, 0x1bc, 
       0x7, 0x2e, 0x2, 0x2, 0x1bc, 0x1bf, 0x7, 0x30, 0x2, 0x2, 0x1bd, 0x1be, 
       0x7, 0x23, 0x2, 0x2, 0x1be, 0x1c0, 0x5, 0x54, 0x2b, 0x2, 0x1bf, 0x1bd, 
       0x3, 0x2, 0x2, 0x2, 0x1bf, 0x1c0, 0x3, 0x2, 0x2, 0x2, 0x1c0, 0x55, 
       0x3, 0x2, 0x2, 0x2, 0x1c1, 0x1c2, 0x5, 0x7c, 0x3f, 0x2, 0x1c2, 0x57, 
       0x3, 0x2, 0x2, 0x2, 0x1c3, 0x1c4, 0x5, 0x74, 0x3b, 0x2, 0x1c4, 0x59, 
       0x3, 0x2, 0x2, 0x2, 0x1c5, 0x1c6, 0x7, 0x10, 0x2, 0x2, 0x1c6, 0x1c9, 
       0x5, 0x7e, 0x40, 0x2, 0x1c7, 0x1c8, 0x7, 0x12, 0x2, 0x2, 0x1c8, 0x1ca, 
       0x5, 0x80, 0x41, 0x2, 0x1c9, 0x1c7, 0x3, 0x2, 0x2, 0x2, 0x1c9, 0x1ca, 
       0x3, 0x2, 0x2, 0x2, 0x1ca, 0x1cb, 0x3, 0x2, 0x2, 0x2, 0x1cb, 0x1cc, 
       0x5, 0x5c, 0x2f, 0x2, 0x1cc, 0x5b, 0x3, 0x2, 0x2, 0x2, 0x1cd, 0x1ce, 
       0x5, 0x74, 0x3b, 0x2, 0x1ce, 0x5d, 0x3, 0x2, 0x2, 0x2, 0x1cf, 0x1d0, 
       0x7, 0x11, 0x2, 0x2, 0x1d0, 0x1d3, 0x5, 0x7e, 0x40, 0x2, 0x1d1, 0x1d2, 
       0x7, 0x12, 0x2, 0x2, 0x1d2, 0x1d4, 0x5, 0x80, 0x41, 0x2, 0x1d3, 0x1d1, 
       0x3, 0x2, 0x2, 0x2, 0x1d3, 0x1d4, 0x3, 0x2, 0x2, 0x2, 0x1d4, 0x1d5, 
       0x3, 0x2, 0x2, 0x2, 0x1d5, 0x1d6, 0x5, 0x60, 0x31, 0x2, 0x1d6, 0x5f, 
       0x3, 0x2, 0x2, 0x2, 0x1d7, 0x1d8, 0x5, 0x74, 0x3b, 0x2, 0x1d8, 0x61, 
       0x3, 0x2, 0x2, 0x2, 0x1d9, 0x1db, 0x7, 0x13, 0x2, 0x2, 0x1da, 0x1dc, 
       0x5, 0x7e, 0x40, 0x2, 0x1db, 0x1da, 0x3, 0x2, 0x2, 0x2, 0x1db, 0x1dc, 
       0x3, 0x2, 0x2, 0x2, 0x1dc, 0x1df, 0x3, 0x2, 0x2, 0x2, 0x1dd, 0x1de, 
       0x7, 0x12, 0x2, 0x2, 0x1de, 0x1e0, 0x5, 0x80, 0x41, 0x2, 0x1df, 0x1dd, 
       0x3, 0x2, 0x2, 0x2, 0x1df, 0x1e0, 0x3, 0x2, 0x2, 0x2, 0x1e0, 0x1e3, 
       0x3, 0x2, 0x2, 0x2, 0x1e1, 0x1e2, 0x7, 0x14, 0x2, 0x2, 0x1e2, 0x1e4, 
       0x5, 0x82, 0x42, 0x2, 0x1e3, 0x1e1, 0x3, 0x2, 0x2, 0x2, 0x1e3, 0x1e4, 
       0x3, 0x2, 0x2, 0x2, 0x1e4, 0x1e5, 0x3, 0x2, 0x2, 0x2, 0x1e5, 0x1e6, 
       0x5, 0x64, 0x33, 0x2, 0x1e6, 0x63, 0x3, 0x2, 0x2, 0x2, 0x1e7, 0x1e8, 
       0x5, 0x74, 0x3b, 0x2, 0x1e8, 0x65, 0x3, 0x2, 0x2, 0x2, 0x1e9, 0x1ec, 
       0x5, 0x68, 0x35, 0x2, 0x1ea, 0x1ec, 0x5, 0x6c, 0x37, 0x2, 0x1eb, 
       0x1e9, 0x3, 0x2, 0x2, 0x2, 0x1eb, 0x1ea, 0x3, 0x2, 0x2, 0x2, 0x1ec, 
       0x67, 0x3, 0x2, 0x2, 0x2, 0x1ed, 0x1ee, 0x7, 0x24, 0x2, 0x2, 0x1ee, 
       0x1ef, 0x5, 0x6a, 0x36, 0x2, 0x1ef, 0x1f0, 0x7, 0x25, 0x2, 0x2, 0x1f0, 
       0x69, 0x3, 0x2, 0x2, 0x2, 0x1f1, 0x1f6, 0x5, 0x7c, 0x3f, 0x2, 0x1f2, 
       0x1f3, 0x7, 0x23, 0x2, 0x2, 0x1f3, 0x1f5, 0x5, 0x6a, 0x36, 0x2, 0x1f4, 
       0x1f2, 0x3, 0x2, 0x2, 0x2, 0x1f5, 0x1f8, 0x3, 0x2, 0x2, 0x2, 0x1f6, 
       0x1f4, 0x3, 0x2, 0x2, 0x2, 0x1f6, 0x1f7, 0x3, 0x2, 0x2, 0x2, 0x1f7, 
       0x6b, 0x3, 0x2, 0x2, 0x2, 0x1f8, 0x1f6, 0x3, 0x2, 0x2, 0x2, 0x1f9, 
       0x1fa, 0x7, 0x26, 0x2, 0x2, 0x1fa, 0x1fb, 0x5, 0x6e, 0x38, 0x2, 0x1fb, 
       0x1fc, 0x7, 0x27, 0x2, 0x2, 0x1fc, 0x6d, 0x3, 0x2, 0x2, 0x2, 0x1fd, 
       0x1fe, 0x5, 0x7e, 0x40, 0x2, 0x1fe, 0x1ff, 0x7, 0x21, 0x2, 0x2, 0x1ff, 
       0x204, 0x5, 0x7c, 0x3f, 0x2, 0x200, 0x201, 0x7, 0x23, 0x2, 0x2, 0x201, 
       0x203, 0x5, 0x6e, 0x38, 0x2, 0x202, 0x200, 0x3, 0x2, 0x2, 0x2, 0x203, 
       0x206, 0x3, 0x2, 0x2, 0x2, 0x204, 0x202, 0x3, 0x2, 0x2, 0x2, 0x204, 
       0x205, 0x3, 0x2, 0x2, 0x2, 0x205, 0x6f, 0x3, 0x2, 0x2, 0x2, 0x206, 
       0x204, 0x3, 0x2, 0x2, 0x2, 0x207, 0x208, 0x7, 0x26, 0x2, 0x2, 0x208, 
       0x20f, 0x7, 0x27, 0x2, 0x2, 0x209, 0x20a, 0x7, 0x26, 0x2, 0x2, 0x20a, 
       0x20b, 0x5, 0x4, 0x3, 0x2, 0x20b, 0x20c, 0x7, 0x27, 0x2, 0x2, 0x20c, 
       0x20f, 0x3, 0x2, 0x2, 0x2, 0x20d, 0x20f, 0x5, 0x72, 0x3a, 0x2, 0x20e, 
       0x207, 0x3, 0x2, 0x2, 0x2, 0x20e, 0x209, 0x3, 0x2, 0x2, 0x2, 0x20e, 
       0x20d, 0x3, 0x2, 0x2, 0x2, 0x20f, 0x71, 0x3, 0x2, 0x2, 0x2, 0x210, 
       0x211, 0x5, 0x16, 0xc, 0x2, 0x211, 0x212, 0x7, 0x1e, 0x2, 0x2, 0x212, 
       0x21a, 0x3, 0x2, 0x2, 0x2, 0x213, 0x21a, 0x5, 0x1e, 0x10, 0x2, 0x214, 
       0x21a, 0x5, 0x20, 0x11, 0x2, 0x215, 0x21a, 0x5, 0x2e, 0x18, 0x2, 
       0x216, 0x21a, 0x5, 0x48, 0x25, 0x2, 0x217, 0x21a, 0x5, 0x44, 0x23, 
       0x2, 0x218, 0x21a, 0x5, 0x46, 0x24, 0x2, 0x219, 0x210, 0x3, 0x2, 
       0x2, 0x2, 0x219, 0x213, 0x3, 0x2, 0x2, 0x2, 0x219, 0x214, 0x3, 0x2, 
       0x2, 0x2, 0x219, 0x215, 0x3, 0x2, 0x2, 0x2, 0x219, 0x216, 0x3, 0x2, 
       0x2, 0x2, 0x219, 0x217, 0x3, 0x2, 0x2, 0x2, 0x219, 0x218, 0x3, 0x2, 
       0x2, 0x2, 0x21a, 0x73, 0x3, 0x2, 0x2, 0x2, 0x21b, 0x21c, 0x7, 0x26, 
       0x2, 0x2, 0x21c, 0x222, 0x7, 0x27, 0x2, 0x2, 0x21d, 0x21e, 0x7, 0x26, 
       0x2, 0x2, 0x21e, 0x21f, 0x5, 0x4, 0x3, 0x2, 0x21f, 0x220, 0x7, 0x27, 
       0x2, 0x2, 0x220, 0x222, 0x3, 0x2, 0x2, 0x2, 0x221, 0x21b, 0x3, 0x2, 
       0x2, 0x2, 0x221, 0x21d, 0x3, 0x2, 0x2, 0x2, 0x222, 0x75, 0x3, 0x2, 
       0x2, 0x2, 0x223, 0x225, 0x7, 0x2c, 0x2, 0x2, 0x224, 0x223, 0x3, 0x2, 
       0x2, 0x2, 0x224, 0x225, 0x3, 0x2, 0x2, 0x2, 0x225, 0x226, 0x3, 0x2, 
       0x2, 0x2, 0x226, 0x227, 0x5, 0x7e, 0x40, 0x2, 0x227, 0x228, 0x9, 
       0x4, 0x2, 0x2, 0x228, 0x22a, 0x5, 0x80, 0x41, 0x2, 0x229, 0x22b, 
       0x7, 0x30, 0x2, 0x2, 0x22a, 0x229, 0x3, 0x2, 0x2, 0x2, 0x22a, 0x22b, 
       0x3, 0x2, 0x2, 0x2, 0x22b, 0x22d, 0x3, 0x2, 0x2, 0x2, 0x22c, 0x22e, 
       0x7, 0x2a, 0x2, 0x2, 0x22d, 0x22c, 0x3, 0x2, 0x2, 0x2, 0x22d, 0x22e, 
       0x3, 0x2, 0x2, 0x2, 0x22e, 0x230, 0x3, 0x2, 0x2, 0x2, 0x22f, 0x231, 
       0x7, 0x2b, 0x2, 0x2, 0x230, 0x22f, 0x3, 0x2, 0x2, 0x2, 0x230, 0x231, 
       0x3, 0x2, 0x2, 0x2, 0x231, 0x2b3, 0x3, 0x2, 0x2, 0x2, 0x232, 0x234, 
       0x7, 0x2c, 0x2, 0x2, 0x233, 0x232, 0x3, 0x2, 0x2, 0x2, 0x233, 0x234, 
       0x3, 0x2, 0x2, 0x2, 0x234, 0x236, 0x3, 0x2, 0x2, 0x2, 0x235, 0x237, 
       0x5, 0x84, 0x43, 0x2, 0x236, 0x235, 0x3, 0x2, 0x2, 0x2, 0x236, 0x237, 
       0x3, 0x2, 0x2, 0x2, 0x237, 0x238, 0x3, 0x2, 0x2, 0x2, 0x238, 0x23a, 
       0x5, 0x7e, 0x40, 0x2, 0x239, 0x23b, 0x5, 0x86, 0x44, 0x2, 0x23a, 
       0x239, 0x3, 0x2, 0x2, 0x2, 0x23a, 0x23b, 0x3, 0x2, 0x2, 0x2, 0x23b, 
       0x23d, 0x3, 0x2, 0x2, 0x2, 0x23c, 0x23e, 0x7, 0x30, 0x2, 0x2, 0x23d, 
       0x23c, 0x3, 0x2, 0x2, 0x2, 0x23d, 0x23e, 0x3, 0x2, 0x2, 0x2, 0x23e, 
       0x240, 0x3, 0x2, 0x2, 0x2, 0x23f, 0x241, 0x7, 0x2a, 0x2, 0x2, 0x240, 
       0x23f, 0x3, 0x2, 0x2, 0x2, 0x240, 0x241, 0x3, 0x2, 0x2, 0x2, 0x241, 
       0x243, 0x3, 0x2, 0x2, 0x2, 0x242, 0x244, 0x7, 0x2b, 0x2, 0x2, 0x243, 
       0x242, 0x3, 0x2, 0x2, 0x2, 0x243, 0x244, 0x3, 0x2, 0x2, 0x2, 0x244, 
       0x26d, 0x3, 0x2, 0x2, 0x2, 0x245, 0x247, 0x7, 0x2c, 0x2, 0x2, 0x246, 
       0x245, 0x3, 0x2, 0x2, 0x2, 0x246, 0x247, 0x3, 0x2, 0x2, 0x2, 0x247, 
       0x248, 0x3, 0x2, 0x2, 0x2, 0x248, 0x24a, 0x7, 0x32, 0x2, 0x2, 0x249, 
       0x24b, 0x7, 0x30, 0x2, 0x2, 0x24a, 0x249, 0x3, 0x2, 0x2, 0x2, 0x24a, 
       0x24b, 0x3, 0x2, 0x2, 0x2, 0x24b, 0x24d, 0x3, 0x2, 0x2, 0x2, 0x24c, 
       0x24e, 0x7, 0x2a, 0x2, 0x2, 0x24d, 0x24c, 0x3, 0x2, 0x2, 0x2, 0x24d, 
       0x24e, 0x3, 0x2, 0x2, 0x2, 0x24e, 0x250, 0x3, 0x2, 0x2, 0x2, 0x24f, 
       0x251, 0x7, 0x2b, 0x2, 0x2, 0x250, 0x24f, 0x3, 0x2, 0x2, 0x2, 0x250, 
       0x251, 0x3, 0x2, 0x2, 0x2, 0x251, 0x26d, 0x3, 0x2, 0x2, 0x2, 0x252, 
       0x254, 0x7, 0x2c, 0x2, 0x2, 0x253, 0x252, 0x3, 0x2, 0x2, 0x2, 0x253, 
       0x254, 0x3, 0x2, 0x2, 0x2, 0x254, 0x255, 0x3, 0x2, 0x2, 0x2, 0x255, 
       0x257, 0x7, 0x33, 0x2, 0x2, 0x256, 0x258, 0x7, 0x30, 0x2, 0x2, 0x257, 
       0x256, 0x3, 0x2, 0x2, 0x2, 0x257, 0x258, 0x3, 0x2, 0x2, 0x2, 0x258, 
       0x25a, 0x3, 0x2, 0x2, 0x2, 0x259, 0x25b, 0x7, 0x2a, 0x2, 0x2, 0x25a, 
       0x259, 0x3, 0x2, 0x2, 0x2, 0x25a, 0x25b, 0x3, 0x2, 0x2, 0x2, 0x25b, 
       0x25d, 0x3, 0x2, 0x2, 0x2, 0x25c, 0x25e, 0x7, 0x2b, 0x2, 0x2, 0x25d, 
       0x25c, 0x3, 0x2, 0x2, 0x2, 0x25d, 0x25e, 0x3, 0x2, 0x2, 0x2, 0x25e, 
       0x26d, 0x3, 0x2, 0x2, 0x2, 0x25f, 0x261, 0x7, 0x2c, 0x2, 0x2, 0x260, 
       0x25f, 0x3, 0x2, 0x2, 0x2, 0x260, 0x261, 0x3, 0x2, 0x2, 0x2, 0x261, 
       0x262, 0x3, 0x2, 0x2, 0x2, 0x262, 0x264, 0x7, 0x34, 0x2, 0x2, 0x263, 
       0x265, 0x7, 0x30, 0x2, 0x2, 0x264, 0x263, 0x3, 0x2, 0x2, 0x2, 0x264, 
       0x265, 0x3, 0x2, 0x2, 0x2, 0x265, 0x267, 0x3, 0x2, 0x2, 0x2, 0x266, 
       0x268, 0x7, 0x2a, 0x2, 0x2, 0x267, 0x266, 0x3, 0x2, 0x2, 0x2, 0x267, 
       0x268, 0x3, 0x2, 0x2, 0x2, 0x268, 0x26a, 0x3, 0x2, 0x2, 0x2, 0x269, 
       0x26b, 0x7, 0x2b, 0x2, 0x2, 0x26a, 0x269, 0x3, 0x2, 0x2, 0x2, 0x26a, 
       0x26b, 0x3, 0x2, 0x2, 0x2, 0x26b, 0x26d, 0x3, 0x2, 0x2, 0x2, 0x26c, 
       0x233, 0x3, 0x2, 0x2, 0x2, 0x26c, 0x246, 0x3, 0x2, 0x2, 0x2, 0x26c, 
       0x253, 0x3, 0x2, 0x2, 0x2, 0x26c, 0x260, 0x3, 0x2, 0x2, 0x2, 0x26d, 
       0x2b3, 0x3, 0x2, 0x2, 0x2, 0x26e, 0x270, 0x7, 0x2c, 0x2, 0x2, 0x26f, 
       0x26e, 0x3, 0x2, 0x2, 0x2, 0x26f, 0x270, 0x3, 0x2, 0x2, 0x2, 0x270, 
       0x271, 0x3, 0x2, 0x2, 0x2, 0x271, 0x273, 0x5, 0x16, 0xc, 0x2, 0x272, 
       0x274, 0x7, 0x30, 0x2, 0x2, 0x273, 0x272, 0x3, 0x2, 0x2, 0x2, 0x273, 
       0x274, 0x3, 0x2, 0x2, 0x2, 0x274, 0x276, 0x3, 0x2, 0x2, 0x2, 0x275, 
       0x277, 0x7, 0x2a, 0x2, 0x2, 0x276, 0x275, 0x3, 0x2, 0x2, 0x2, 0x276, 
       0x277, 0x3, 0x2, 0x2, 0x2, 0x277, 0x279, 0x3, 0x2, 0x2, 0x2, 0x278, 
       0x27a, 0x7, 0x2b, 0x2, 0x2, 0x279, 0x278, 0x3, 0x2, 0x2, 0x2, 0x279, 
       0x27a, 0x3, 0x2, 0x2, 0x2, 0x27a, 0x2b3, 0x3, 0x2, 0x2, 0x2, 0x27b, 
       0x27d, 0x7, 0x2c, 0x2, 0x2, 0x27c, 0x27b, 0x3, 0x2, 0x2, 0x2, 0x27c, 
       0x27d, 0x3, 0x2, 0x2, 0x2, 0x27d, 0x27e, 0x3, 0x2, 0x2, 0x2, 0x27e, 
       0x27f, 0x7, 0x28, 0x2, 0x2, 0x27f, 0x280, 0x5, 0x50, 0x29, 0x2, 0x280, 
       0x282, 0x7, 0x29, 0x2, 0x2, 0x281, 0x283, 0x7, 0x30, 0x2, 0x2, 0x282, 
       0x281, 0x3, 0x2, 0x2, 0x2, 0x282, 0x283, 0x3, 0x2, 0x2, 0x2, 0x283, 
       0x285, 0x3, 0x2, 0x2, 0x2, 0x284, 0x286, 0x7, 0x2a, 0x2, 0x2, 0x285, 
       0x284, 0x3, 0x2, 0x2, 0x2, 0x285, 0x286, 0x3, 0x2, 0x2, 0x2, 0x286, 
       0x288, 0x3, 0x2, 0x2, 0x2, 0x287, 0x289, 0x7, 0x2b, 0x2, 0x2, 0x288, 
       0x287, 0x3, 0x2, 0x2, 0x2, 0x288, 0x289, 0x3, 0x2, 0x2, 0x2, 0x289, 
       0x2b3, 0x3, 0x2, 0x2, 0x2, 0x28a, 0x28c, 0x7, 0x2c, 0x2, 0x2, 0x28b, 
       0x28a, 0x3, 0x2, 0x2, 0x2, 0x28b, 0x28c, 0x3, 0x2, 0x2, 0x2, 0x28c, 
       0x28e, 0x3, 0x2, 0x2, 0x2, 0x28d, 0x28f, 0x5, 0x84, 0x43, 0x2, 0x28e, 
       0x28d, 0x3, 0x2, 0x2, 0x2, 0x28e, 0x28f, 0x3, 0x2, 0x2, 0x2, 0x28f, 
       0x290, 0x3, 0x2, 0x2, 0x2, 0x290, 0x292, 0x5, 0x66, 0x34, 0x2, 0x291, 
       0x293, 0x5, 0x86, 0x44, 0x2, 0x292, 0x291, 0x3, 0x2, 0x2, 0x2, 0x292, 
       0x293, 0x3, 0x2, 0x2, 0x2, 0x293, 0x295, 0x3, 0x2, 0x2, 0x2, 0x294, 
       0x296, 0x7, 0x30, 0x2, 0x2, 0x295, 0x294, 0x3, 0x2, 0x2, 0x2, 0x295, 
       0x296, 0x3, 0x2, 0x2, 0x2, 0x296, 0x298, 0x3, 0x2, 0x2, 0x2, 0x297, 
       0x299, 0x7, 0x2a, 0x2, 0x2, 0x298, 0x297, 0x3, 0x2, 0x2, 0x2, 0x298, 
       0x299, 0x3, 0x2, 0x2, 0x2, 0x299, 0x29b, 0x3, 0x2, 0x2, 0x2, 0x29a, 
       0x29c, 0x7, 0x2b, 0x2, 0x2, 0x29b, 0x29a, 0x3, 0x2, 0x2, 0x2, 0x29b, 
       0x29c, 0x3, 0x2, 0x2, 0x2, 0x29c, 0x2b3, 0x3, 0x2, 0x2, 0x2, 0x29d, 
       0x2b3, 0x5, 0x52, 0x2a, 0x2, 0x29e, 0x2b3, 0x5, 0x62, 0x32, 0x2, 
       0x29f, 0x2a0, 0x7, 0x26, 0x2, 0x2, 0x2a0, 0x2a4, 0x7, 0x27, 0x2, 
       0x2, 0x2a1, 0x2a2, 0x7, 0x24, 0x2, 0x2, 0x2a2, 0x2a4, 0x7, 0x25, 
       0x2, 0x2, 0x2a3, 0x29f, 0x3, 0x2, 0x2, 0x2, 0x2a3, 0x2a1, 0x3, 0x2, 
       0x2, 0x2, 0x2a4, 0x2b3, 0x3, 0x2, 0x2, 0x2, 0x2a5, 0x2a7, 0x7, 0x2c, 
       0x2, 0x2, 0x2a6, 0x2a5, 0x3, 0x2, 0x2, 0x2, 0x2a6, 0x2a7, 0x3, 0x2, 
       0x2, 0x2, 0x2a7, 0x2a8, 0x3, 0x2, 0x2, 0x2, 0x2a8, 0x2aa, 0x5, 0x78, 
       0x3d, 0x2, 0x2a9, 0x2ab, 0x7, 0x30, 0x2, 0x2, 0x2aa, 0x2a9, 0x3, 
       0x2, 0x2, 0x2, 0x2aa, 0x2ab, 0x3, 0x2, 0x2, 0x2, 0x2ab, 0x2ad, 0x3, 
       0x2, 0x2, 0x2, 0x2ac, 0x2ae, 0x7, 0x2a, 0x2, 0x2, 0x2ad, 0x2ac, 0x3, 
       0x2, 0x2, 0x2, 0x2ad, 0x2ae, 0x3, 0x2, 0x2, 0x2, 0x2ae, 0x2b0, 0x3, 
       0x2, 0x2, 0x2, 0x2af, 0x2b1, 0x7, 0x2b, 0x2, 0x2, 0x2b0, 0x2af, 0x3, 
       0x2, 0x2, 0x2, 0x2b0, 0x2b1, 0x3, 0x2, 0x2, 0x2, 0x2b1, 0x2b3, 0x3, 
       0x2, 0x2, 0x2, 0x2b2, 0x224, 0x3, 0x2, 0x2, 0x2, 0x2b2, 0x26c, 0x3, 
       0x2, 0x2, 0x2, 0x2b2, 0x26f, 0x3, 0x2, 0x2, 0x2, 0x2b2, 0x27c, 0x3, 
       0x2, 0x2, 0x2, 0x2b2, 0x28b, 0x3, 0x2, 0x2, 0x2, 0x2b2, 0x29d, 0x3, 
       0x2, 0x2, 0x2, 0x2b2, 0x29e, 0x3, 0x2, 0x2, 0x2, 0x2b2, 0x2a3, 0x3, 
       0x2, 0x2, 0x2, 0x2b2, 0x2a6, 0x3, 0x2, 0x2, 0x2, 0x2b3, 0x77, 0x3, 
       0x2, 0x2, 0x2, 0x2b4, 0x2b5, 0x7, 0x28, 0x2, 0x2, 0x2b5, 0x2b6, 0x5, 
       0x7a, 0x3e, 0x2, 0x2b6, 0x2b7, 0x7, 0x29, 0x2, 0x2, 0x2b7, 0x79, 
       0x3, 0x2, 0x2, 0x2, 0x2b8, 0x2bc, 0x5, 0x76, 0x3c, 0x2, 0x2b9, 0x2bb, 
       0x5, 0x7a, 0x3e, 0x2, 0x2ba, 0x2b9, 0x3, 0x2, 0x2, 0x2, 0x2bb, 0x2be, 
       0x3, 0x2, 0x2, 0x2, 0x2bc, 0x2ba, 0x3, 0x2, 0x2, 0x2, 0x2bc, 0x2bd, 
       0x3, 0x2, 0x2, 0x2, 0x2bd, 0x7b, 0x3, 0x2, 0x2, 0x2, 0x2be, 0x2bc, 
       0x3, 0x2, 0x2, 0x2, 0x2bf, 0x2c3, 0x5, 0x76, 0x3c, 0x2, 0x2c0, 0x2c2, 
       0x5, 0x7c, 0x3f, 0x2, 0x2c1, 0x2c0, 0x3, 0x2, 0x2, 0x2, 0x2c2, 0x2c5, 
       0x3, 0x2, 0x2, 0x2, 0x2c3, 0x2c1, 0x3, 0x2, 0x2, 0x2, 0x2c3, 0x2c4, 
       0x3, 0x2, 0x2, 0x2, 0x2c4, 0x7d, 0x3, 0x2, 0x2, 0x2, 0x2c5, 0x2c3, 
       0x3, 0x2, 0x2, 0x2, 0x2c6, 0x2c7, 0x7, 0x2e, 0x2, 0x2, 0x2c7, 0x7f, 
       0x3, 0x2, 0x2, 0x2, 0x2c8, 0x2c9, 0x7, 0x2e, 0x2, 0x2, 0x2c9, 0x81, 
       0x3, 0x2, 0x2, 0x2, 0x2ca, 0x2cb, 0x7, 0x2e, 0x2, 0x2, 0x2cb, 0x83, 
       0x3, 0x2, 0x2, 0x2, 0x2cc, 0x2cd, 0x7, 0x2d, 0x2, 0x2, 0x2cd, 0x85, 
       0x3, 0x2, 0x2, 0x2, 0x2ce, 0x2cf, 0x7, 0x2d, 0x2, 0x2, 0x2cf, 0x87, 
       0x3, 0x2, 0x2, 0x2, 0x2d0, 0x2d1, 0x9, 0x5, 0x2, 0x2, 0x2d1, 0x89, 
       0x3, 0x2, 0x2, 0x2, 0x69, 0x92, 0xa2, 0xaa, 0xb5, 0xbf, 0xc6, 0xcd, 
       0xd3, 0xde, 0xe6, 0xed, 0xf6, 0xf9, 0x103, 0x115, 0x11c, 0x124, 0x12b, 
       0x134, 0x138, 0x13c, 0x143, 0x14e, 0x155, 0x159, 0x162, 0x166, 0x16c, 
       0x16e, 0x174, 0x17b, 0x17f, 0x185, 0x187, 0x18b, 0x18d, 0x192, 0x196, 
       0x19c, 0x19e, 0x1a4, 0x1aa, 0x1ae, 0x1b4, 0x1b6, 0x1b9, 0x1bf, 0x1c9, 
       0x1d3, 0x1db, 0x1df, 0x1e3, 0x1eb, 0x1f6, 0x204, 0x20e, 0x219, 0x221, 
       0x224, 0x22a, 0x22d, 0x230, 0x233, 0x236, 0x23a, 0x23d, 0x240, 0x243, 
       0x246, 0x24a, 0x24d, 0x250, 0x253, 0x257, 0x25a, 0x25d, 0x260, 0x264, 
       0x267, 0x26a, 0x26c, 0x26f, 0x273, 0x276, 0x279, 0x27c, 0x282, 0x285, 
       0x288, 0x28b, 0x28e, 0x292, 0x295, 0x298, 0x29b, 0x2a3, 0x2a6, 0x2aa, 
       0x2ad, 0x2b0, 0x2b2, 0x2bc, 0x2c3, 
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
