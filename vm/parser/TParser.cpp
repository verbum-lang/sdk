
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
    setState(100);
    sentences();
    setState(101);
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
    setState(108);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 0, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(103);
      statements();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(104);
      statements();
      setState(105);
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

TParser::BlockCommentsContext* TParser::StatementsContext::blockComments() {
  return getRuleContext<TParser::BlockCommentsContext>(0);
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

TParser::BlockTryCatchContext* TParser::StatementsContext::blockTryCatch() {
  return getRuleContext<TParser::BlockTryCatchContext>(0);
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
    setState(119);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case TParser::BlockComment:
      case TParser::LineComment: {
        enterOuterAlt(_localctx, 1);
        setState(110);
        blockComments();
        break;
      }

      case TParser::Use: {
        enterOuterAlt(_localctx, 2);
        setState(111);
        blockUse();
        break;
      }

      case TParser::Var: {
        enterOuterAlt(_localctx, 3);
        setState(112);
        blockVariable();
        break;
      }

      case TParser::Ret: {
        enterOuterAlt(_localctx, 4);
        setState(113);
        blockRet();
        break;
      }

      case TParser::If: {
        enterOuterAlt(_localctx, 5);
        setState(114);
        blockConditional();
        break;
      }

      case TParser::For: {
        enterOuterAlt(_localctx, 6);
        setState(115);
        blockLoop();
        break;
      }

      case TParser::Try: {
        enterOuterAlt(_localctx, 7);
        setState(116);
        blockTryCatch();
        break;
      }

      case TParser::OpenBlock: {
        enterOuterAlt(_localctx, 8);
        setState(117);
        blockCode();
        break;
      }

      case TParser::Function:
      case TParser::Pub:
      case TParser::Pro:
      case TParser::Priv:
      case TParser::Static:
      case TParser::Final:
      case TParser::Interface:
      case TParser::Abstract:
      case TParser::Extends:
      case TParser::Class:
      case TParser::Implements:
      case TParser::New:
      case TParser::Break:
      case TParser::Next:
      case TParser::Async:
      case TParser::ArrowRight:
      case TParser::ARightLB:
      case TParser::End:
      case TParser::Attr:
      case TParser::Point:
      case TParser::TwoPoint:
      case TParser::TwoTwoPoint:
      case TParser::Separator:
      case TParser::OpenArIndex:
      case TParser::CloseArIndex:
      case TParser::OpenOp:
      case TParser::CloseOp:
      case TParser::ArithmeticOperator:
      case TParser::AssignmentOperator:
      case TParser::Not:
      case TParser::IncDecOperators:
      case TParser::Identifier:
      case TParser::IDPrefix:
      case TParser::TypeSpec:
      case TParser::Words:
      case TParser::Integer:
      case TParser::Float:
      case TParser::String: {
        enterOuterAlt(_localctx, 9);
        setState(118);
        blockLiveTokens();
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
    setState(127);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 2, _ctx)) {
    case 1: {
      setState(121);
      match(TParser::OpenBlock);
      setState(122);
      match(TParser::CloseBlock);
      break;
    }

    case 2: {
      setState(123);
      match(TParser::OpenBlock);
      setState(124);
      sentences();
      setState(125);
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

//----------------- BlockCommentsContext ------------------------------------------------------------------

TParser::BlockCommentsContext::BlockCommentsContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* TParser::BlockCommentsContext::BlockComment() {
  return getToken(TParser::BlockComment, 0);
}

tree::TerminalNode* TParser::BlockCommentsContext::LineComment() {
  return getToken(TParser::LineComment, 0);
}


size_t TParser::BlockCommentsContext::getRuleIndex() const {
  return TParser::RuleBlockComments;
}

void TParser::BlockCommentsContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterBlockComments(this);
}

void TParser::BlockCommentsContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<TParserListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitBlockComments(this);
}


antlrcpp::Any TParser::BlockCommentsContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<TParserVisitor*>(visitor))
    return parserVisitor->visitBlockComments(this);
  else
    return visitor->visitChildren(this);
}

TParser::BlockCommentsContext* TParser::blockComments() {
  BlockCommentsContext *_localctx = _tracker.createInstance<BlockCommentsContext>(_ctx, getState());
  enterRule(_localctx, 8, TParser::RuleBlockComments);
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
    setState(129);
    _la = _input->LA(1);
    if (!(_la == TParser::BlockComment

    || _la == TParser::LineComment)) {
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
  enterRule(_localctx, 10, TParser::RuleBlockUse);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(131);
    match(TParser::Use);
    setState(132);
    useValue();
    setState(133);
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
  enterRule(_localctx, 12, TParser::RuleUseValue);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(140);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 3, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(135);
      useString();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(136);
      useString();
      setState(137);
      match(TParser::Separator);
      setState(138);
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
  enterRule(_localctx, 14, TParser::RuleUseString);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(142);
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
  enterRule(_localctx, 16, TParser::RuleBlockVariable);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(144);
    match(TParser::Var);
    setState(145);
    variableItem();
    setState(146);
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
  enterRule(_localctx, 18, TParser::RuleVariableItem);
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
    setState(148);
    variablePrefixModes();
    setState(150);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == TParser::New

    || _la == TParser::Await) {
      setState(149);
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
    setState(152);
    generalValueElements();
    setState(157);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 5, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        setState(153);
        match(TParser::Separator);
        setState(154);
        variableItem(); 
      }
      setState(159);
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

TParser::MethodVisibilityContext* TParser::VariablePrefixModesContext::methodVisibility() {
  return getRuleContext<TParser::MethodVisibilityContext>(0);
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
  enterRule(_localctx, 20, TParser::RuleVariablePrefixModes);
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
    setState(161);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if ((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << TParser::Pub)
      | (1ULL << TParser::Pro)
      | (1ULL << TParser::Priv)
      | (1ULL << TParser::Static)
      | (1ULL << TParser::Final)
      | (1ULL << TParser::Async))) != 0)) {
      setState(160);
      methodVisibility();
    }
    setState(167);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 7, _ctx)) {
    case 1: {
      setState(163);
      identifier();
      break;
    }

    case 2: {
      setState(164);
      identifier();
      setState(165);
      match(TParser::TypeSpec);
      break;
    }

    default:
      break;
    }
    setState(169);
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

tree::TerminalNode* TParser::VisibilityItemsContext::Async() {
  return getToken(TParser::Async, 0);
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
  enterRule(_localctx, 22, TParser::RuleVisibilityItems);
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
    setState(171);
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

//----------------- MethodVisibilityContext ------------------------------------------------------------------

TParser::MethodVisibilityContext::MethodVisibilityContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::VisibilityItemsContext* TParser::MethodVisibilityContext::visibilityItems() {
  return getRuleContext<TParser::VisibilityItemsContext>(0);
}

std::vector<TParser::MethodVisibilityContext *> TParser::MethodVisibilityContext::methodVisibility() {
  return getRuleContexts<TParser::MethodVisibilityContext>();
}

TParser::MethodVisibilityContext* TParser::MethodVisibilityContext::methodVisibility(size_t i) {
  return getRuleContext<TParser::MethodVisibilityContext>(i);
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
  enterRule(_localctx, 24, TParser::RuleMethodVisibility);

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
    setState(173);
    visibilityItems();
    setState(177);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 8, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        setState(174);
        methodVisibility(); 
      }
      setState(179);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 8, _ctx);
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
  enterRule(_localctx, 26, TParser::RuleFunctionCall);
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
    setState(180);
    functionCallPrefix();
    setState(182);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == TParser::Identifier) {
      setState(181);
      identifier();
    }
    setState(184);
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
  enterRule(_localctx, 28, TParser::RuleFunctionCallPrefix);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(193);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 10, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(186);
      identifier();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(187);
      identifier();
      setState(188);
      match(TParser::Point);
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(190);
      identifier();
      setState(191);
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
  enterRule(_localctx, 30, TParser::RuleFunctionCallParam);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(201);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 11, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(195);
      match(TParser::OpenOp);
      setState(196);
      match(TParser::CloseOp);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(197);
      match(TParser::OpenOp);
      setState(198);
      functionCallParamElements();
      setState(199);
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
  enterRule(_localctx, 32, TParser::RuleFunctionCallParamElements);

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
    setState(203);
    generalValue();
    setState(208);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 12, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        setState(204);
        match(TParser::Separator);
        setState(205);
        functionCallParamElements(); 
      }
      setState(210);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 12, _ctx);
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
  enterRule(_localctx, 34, TParser::RuleBlockRet);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(211);
    match(TParser::Ret);
    setState(212);
    generalValueElements();
    setState(213);
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
  enterRule(_localctx, 36, TParser::RuleBlockConditional);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(215);
    ifElementUnique();
    setState(217);
    _errHandler->sync(this);

    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 13, _ctx)) {
    case 1: {
      setState(216);
      elifElements();
      break;
    }

    default:
      break;
    }
    setState(220);
    _errHandler->sync(this);

    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 14, _ctx)) {
    case 1: {
      setState(219);
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
  enterRule(_localctx, 38, TParser::RuleIfElementUnique);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(222);
    match(TParser::If);
    setState(223);
    conditionalBlockExpression();
    setState(224);
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
  enterRule(_localctx, 40, TParser::RuleElifElements);

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
    setState(226);
    elifElementUnique();
    setState(230);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 15, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        setState(227);
        elifElements(); 
      }
      setState(232);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 15, _ctx);
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
  enterRule(_localctx, 42, TParser::RuleElifElementUnique);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(233);
    match(TParser::Elif);
    setState(234);
    conditionalBlockExpression();
    setState(235);
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
  enterRule(_localctx, 44, TParser::RuleElseElementUnique);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(237);
    match(TParser::Else);
    setState(238);
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
  enterRule(_localctx, 46, TParser::RuleConditionalBlockExpression);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(240);
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
  enterRule(_localctx, 48, TParser::RuleConditionalBlockElements);

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
  enterRule(_localctx, 50, TParser::RuleBlockLoop);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(244);
    match(TParser::For);
    setState(248);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 16, _ctx)) {
    case 1: {
      setState(245);
      loopInfinite();
      break;
    }

    case 2: {
      setState(246);
      loopConditional();
      break;
    }

    case 3: {
      setState(247);
      loopComplete();
      break;
    }

    default:
      break;
    }
    setState(250);
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
  enterRule(_localctx, 52, TParser::RuleLoopBlockElements);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(252);
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
  enterRule(_localctx, 54, TParser::RuleLoopComplete);
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
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == TParser::OpenOp) {
      setState(254);
      match(TParser::OpenOp);
    }
    setState(257);
    loopOneMembers();
    setState(258);
    endOne();
    setState(259);
    loopTwoMembers();
    setState(260);
    endTwo();
    setState(261);
    loopThreeMembers();
    setState(263);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == TParser::CloseOp) {
      setState(262);
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
  enterRule(_localctx, 56, TParser::RuleLoopConditional);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(265);
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
  enterRule(_localctx, 58, TParser::RuleLoopInfinite);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(270);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case TParser::OpenOp: {
        enterOuterAlt(_localctx, 1);
        setState(267);
        match(TParser::OpenOp);
        setState(268);
        match(TParser::CloseOp);
        break;
      }

      case TParser::If:
      case TParser::For:
      case TParser::Ret:
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
  enterRule(_localctx, 60, TParser::RuleEndOne);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(272);
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
  enterRule(_localctx, 62, TParser::RuleEndTwo);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(274);
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
  enterRule(_localctx, 64, TParser::RuleLoopOneMembers);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(279);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case TParser::Var: {
        enterOuterAlt(_localctx, 1);
        setState(276);
        match(TParser::Var);
        setState(277);
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
  enterRule(_localctx, 66, TParser::RuleLoopTwoMembers);

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
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 21, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(281);
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
  enterRule(_localctx, 68, TParser::RuleLoopThreeMembers);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(287);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 22, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(285);
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
  enterRule(_localctx, 70, TParser::RuleLoopThreeMembersValues);
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
    setState(289);
    generalValueElements();
    setState(294);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while (_la == TParser::Separator) {
      setState(290);
      match(TParser::Separator);
      setState(291);
      generalValueElements();
      setState(296);
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
  enterRule(_localctx, 72, TParser::RuleBlockTryCatch);

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
    tryUniqueElement();
    setState(299);
    _errHandler->sync(this);

    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 24, _ctx)) {
    case 1: {
      setState(298);
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
  enterRule(_localctx, 74, TParser::RuleTryUniqueElement);

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
    match(TParser::Try);
    setState(302);
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
  enterRule(_localctx, 76, TParser::RuleCatchUniqueElement);
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
    setState(304);
    match(TParser::Catch);
    setState(306);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == TParser::OpenOp) {
      setState(305);
      match(TParser::OpenOp);
    }
    setState(308);
    identifier();
    setState(310);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == TParser::CloseOp) {
      setState(309);
      match(TParser::CloseOp);
    }
    setState(312);
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
  enterRule(_localctx, 78, TParser::RuleTryCatchElements);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(314);
    codeBlockFlowControl();
   
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
  enterRule(_localctx, 80, TParser::RuleCodeBlockFlowControl);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(323);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 27, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(316);
      match(TParser::OpenBlock);
      setState(317);
      match(TParser::CloseBlock);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(318);
      match(TParser::OpenBlock);
      setState(319);
      sentences();
      setState(320);
      match(TParser::CloseBlock);
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(322);
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
  enterRule(_localctx, 82, TParser::RuleCodeBlockFlowControlElements);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(332);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case TParser::Identifier: {
        enterOuterAlt(_localctx, 1);
        setState(325);
        functionCall();
        setState(326);
        match(TParser::End);
        break;
      }

      case TParser::Ret: {
        enterOuterAlt(_localctx, 2);
        setState(328);
        blockRet();
        break;
      }

      case TParser::If: {
        enterOuterAlt(_localctx, 3);
        setState(329);
        blockConditional();
        break;
      }

      case TParser::For: {
        enterOuterAlt(_localctx, 4);
        setState(330);
        blockLoop();
        break;
      }

      case TParser::Try: {
        enterOuterAlt(_localctx, 5);
        setState(331);
        blockTryCatch();
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

//----------------- GeneralValueContext ------------------------------------------------------------------

TParser::GeneralValueContext::GeneralValueContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

TParser::IdentifierContext* TParser::GeneralValueContext::identifier() {
  return getRuleContext<TParser::IdentifierContext>(0);
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

tree::TerminalNode* TParser::GeneralValueContext::Not() {
  return getToken(TParser::Not, 0);
}

TParser::IncDecOperatorsAContext* TParser::GeneralValueContext::incDecOperatorsA() {
  return getRuleContext<TParser::IncDecOperatorsAContext>(0);
}

TParser::IncDecOperatorsBContext* TParser::GeneralValueContext::incDecOperatorsB() {
  return getRuleContext<TParser::IncDecOperatorsBContext>(0);
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

TParser::FunctionCallContext* TParser::GeneralValueContext::functionCall() {
  return getRuleContext<TParser::FunctionCallContext>(0);
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
  enterRule(_localctx, 84, TParser::RuleGeneralValue);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(417);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 55, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(389);
      _errHandler->sync(this);
      switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 46, _ctx)) {
      case 1: {
        setState(335);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::Not) {
          setState(334);
          match(TParser::Not);
        }
        setState(338);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::IncDecOperators) {
          setState(337);
          incDecOperatorsA();
        }
        setState(340);
        identifier();
        setState(342);
        _errHandler->sync(this);

        switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 31, _ctx)) {
        case 1: {
          setState(341);
          incDecOperatorsB();
          break;
        }

        default:
          break;
        }
        setState(345);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::TypeSpec) {
          setState(344);
          match(TParser::TypeSpec);
        }
        setState(348);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::ArithmeticOperator) {
          setState(347);
          match(TParser::ArithmeticOperator);
        }
        setState(351);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::AssignmentOperator) {
          setState(350);
          match(TParser::AssignmentOperator);
        }
        break;
      }

      case 2: {
        setState(354);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::Not) {
          setState(353);
          match(TParser::Not);
        }
        setState(356);
        match(TParser::Integer);
        setState(358);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::TypeSpec) {
          setState(357);
          match(TParser::TypeSpec);
        }
        setState(361);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::ArithmeticOperator) {
          setState(360);
          match(TParser::ArithmeticOperator);
        }
        setState(364);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::AssignmentOperator) {
          setState(363);
          match(TParser::AssignmentOperator);
        }
        break;
      }

      case 3: {
        setState(367);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::Not) {
          setState(366);
          match(TParser::Not);
        }
        setState(369);
        match(TParser::Float);
        setState(371);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::TypeSpec) {
          setState(370);
          match(TParser::TypeSpec);
        }
        setState(374);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::ArithmeticOperator) {
          setState(373);
          match(TParser::ArithmeticOperator);
        }
        setState(377);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::AssignmentOperator) {
          setState(376);
          match(TParser::AssignmentOperator);
        }
        break;
      }

      case 4: {
        setState(380);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::Not) {
          setState(379);
          match(TParser::Not);
        }
        setState(382);
        match(TParser::String);
        setState(384);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::ArithmeticOperator) {
          setState(383);
          match(TParser::ArithmeticOperator);
        }
        setState(387);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == TParser::AssignmentOperator) {
          setState(386);
          match(TParser::AssignmentOperator);
        }
        break;
      }

      default:
        break;
      }
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(392);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == TParser::Not) {
        setState(391);
        match(TParser::Not);
      }
      setState(394);
      functionCall();
      setState(396);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == TParser::TypeSpec) {
        setState(395);
        match(TParser::TypeSpec);
      }
      setState(399);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == TParser::ArithmeticOperator) {
        setState(398);
        match(TParser::ArithmeticOperator);
      }
      setState(402);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == TParser::AssignmentOperator) {
        setState(401);
        match(TParser::AssignmentOperator);
      }
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(405);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == TParser::Not) {
        setState(404);
        match(TParser::Not);
      }
      setState(407);
      generalValueBlock();
      setState(409);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == TParser::TypeSpec) {
        setState(408);
        match(TParser::TypeSpec);
      }
      setState(412);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == TParser::ArithmeticOperator) {
        setState(411);
        match(TParser::ArithmeticOperator);
      }
      setState(415);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == TParser::AssignmentOperator) {
        setState(414);
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
  enterRule(_localctx, 86, TParser::RuleGeneralValueBlock);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(419);
    match(TParser::OpenOp);
    setState(420);
    generalValueItems();
    setState(421);
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
  enterRule(_localctx, 88, TParser::RuleGeneralValueItems);

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
    setState(423);
    generalValue();
    setState(427);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 56, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        setState(424);
        generalValueItems(); 
      }
      setState(429);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 56, _ctx);
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
  enterRule(_localctx, 90, TParser::RuleGeneralValueElements);

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
    setState(430);
    generalValue();
    setState(434);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 57, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        setState(431);
        generalValueElements(); 
      }
      setState(436);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 57, _ctx);
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
  enterRule(_localctx, 92, TParser::RuleIdentifier);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(437);
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
  enterRule(_localctx, 94, TParser::RuleIncDecOperatorsA);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(439);
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
  enterRule(_localctx, 96, TParser::RuleIncDecOperatorsB);

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

tree::TerminalNode* TParser::BlockLiveTokensContext::Function() {
  return getToken(TParser::Function, 0);
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

tree::TerminalNode* TParser::BlockLiveTokensContext::Interface() {
  return getToken(TParser::Interface, 0);
}

tree::TerminalNode* TParser::BlockLiveTokensContext::Abstract() {
  return getToken(TParser::Abstract, 0);
}

tree::TerminalNode* TParser::BlockLiveTokensContext::Extends() {
  return getToken(TParser::Extends, 0);
}

tree::TerminalNode* TParser::BlockLiveTokensContext::Class() {
  return getToken(TParser::Class, 0);
}

tree::TerminalNode* TParser::BlockLiveTokensContext::Implements() {
  return getToken(TParser::Implements, 0);
}

tree::TerminalNode* TParser::BlockLiveTokensContext::New() {
  return getToken(TParser::New, 0);
}

tree::TerminalNode* TParser::BlockLiveTokensContext::Break() {
  return getToken(TParser::Break, 0);
}

tree::TerminalNode* TParser::BlockLiveTokensContext::Next() {
  return getToken(TParser::Next, 0);
}

tree::TerminalNode* TParser::BlockLiveTokensContext::Async() {
  return getToken(TParser::Async, 0);
}

tree::TerminalNode* TParser::BlockLiveTokensContext::ArrowRight() {
  return getToken(TParser::ArrowRight, 0);
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

tree::TerminalNode* TParser::BlockLiveTokensContext::Not() {
  return getToken(TParser::Not, 0);
}

tree::TerminalNode* TParser::BlockLiveTokensContext::IncDecOperators() {
  return getToken(TParser::IncDecOperators, 0);
}

tree::TerminalNode* TParser::BlockLiveTokensContext::Identifier() {
  return getToken(TParser::Identifier, 0);
}

tree::TerminalNode* TParser::BlockLiveTokensContext::IDPrefix() {
  return getToken(TParser::IDPrefix, 0);
}

tree::TerminalNode* TParser::BlockLiveTokensContext::TypeSpec() {
  return getToken(TParser::TypeSpec, 0);
}

tree::TerminalNode* TParser::BlockLiveTokensContext::Words() {
  return getToken(TParser::Words, 0);
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
  enterRule(_localctx, 98, TParser::RuleBlockLiveTokens);
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
    setState(443);
    _la = _input->LA(1);
    if (!((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << TParser::Function)
      | (1ULL << TParser::Pub)
      | (1ULL << TParser::Pro)
      | (1ULL << TParser::Priv)
      | (1ULL << TParser::Static)
      | (1ULL << TParser::Final)
      | (1ULL << TParser::Interface)
      | (1ULL << TParser::Abstract)
      | (1ULL << TParser::Extends)
      | (1ULL << TParser::Class)
      | (1ULL << TParser::Implements)
      | (1ULL << TParser::New)
      | (1ULL << TParser::Break)
      | (1ULL << TParser::Next)
      | (1ULL << TParser::Async)
      | (1ULL << TParser::ArrowRight)
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
      | (1ULL << TParser::Not)
      | (1ULL << TParser::IncDecOperators)
      | (1ULL << TParser::Identifier)
      | (1ULL << TParser::IDPrefix)
      | (1ULL << TParser::TypeSpec)
      | (1ULL << TParser::Words)
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
  "main", "sentences", "statements", "blockCode", "blockComments", "blockUse", 
  "useValue", "useString", "blockVariable", "variableItem", "variablePrefixModes", 
  "visibilityItems", "methodVisibility", "functionCall", "functionCallPrefix", 
  "functionCallParam", "functionCallParamElements", "blockRet", "blockConditional", 
  "ifElementUnique", "elifElements", "elifElementUnique", "elseElementUnique", 
  "conditionalBlockExpression", "conditionalBlockElements", "blockLoop", 
  "loopBlockElements", "loopComplete", "loopConditional", "loopInfinite", 
  "endOne", "endTwo", "loopOneMembers", "loopTwoMembers", "loopThreeMembers", 
  "loopThreeMembersValues", "blockTryCatch", "tryUniqueElement", "catchUniqueElement", 
  "tryCatchElements", "codeBlockFlowControl", "codeBlockFlowControlElements", 
  "generalValue", "generalValueBlock", "generalValueItems", "generalValueElements", 
  "identifier", "incDecOperatorsA", "incDecOperatorsB", "blockLiveTokens"
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
       0x3, 0x38, 0x1c0, 0x4, 0x2, 0x9, 0x2, 0x4, 0x3, 0x9, 0x3, 0x4, 0x4, 
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
       0x9, 0x32, 0x4, 0x33, 0x9, 0x33, 0x3, 0x2, 0x3, 0x2, 0x3, 0x2, 0x3, 
       0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x5, 0x3, 0x6f, 0xa, 
       0x3, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 
       0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x5, 0x4, 0x7a, 0xa, 0x4, 0x3, 0x5, 
       0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x5, 0x5, 0x82, 
       0xa, 0x5, 0x3, 0x6, 0x3, 0x6, 0x3, 0x7, 0x3, 0x7, 0x3, 0x7, 0x3, 
       0x7, 0x3, 0x8, 0x3, 0x8, 0x3, 0x8, 0x3, 0x8, 0x3, 0x8, 0x5, 0x8, 
       0x8f, 0xa, 0x8, 0x3, 0x9, 0x3, 0x9, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 
       0x3, 0xa, 0x3, 0xb, 0x3, 0xb, 0x5, 0xb, 0x99, 0xa, 0xb, 0x3, 0xb, 
       0x3, 0xb, 0x3, 0xb, 0x7, 0xb, 0x9e, 0xa, 0xb, 0xc, 0xb, 0xe, 0xb, 
       0xa1, 0xb, 0xb, 0x3, 0xc, 0x5, 0xc, 0xa4, 0xa, 0xc, 0x3, 0xc, 0x3, 
       0xc, 0x3, 0xc, 0x3, 0xc, 0x5, 0xc, 0xaa, 0xa, 0xc, 0x3, 0xc, 0x3, 
       0xc, 0x3, 0xd, 0x3, 0xd, 0x3, 0xe, 0x3, 0xe, 0x7, 0xe, 0xb2, 0xa, 
       0xe, 0xc, 0xe, 0xe, 0xe, 0xb5, 0xb, 0xe, 0x3, 0xf, 0x3, 0xf, 0x5, 
       0xf, 0xb9, 0xa, 0xf, 0x3, 0xf, 0x3, 0xf, 0x3, 0x10, 0x3, 0x10, 0x3, 
       0x10, 0x3, 0x10, 0x3, 0x10, 0x3, 0x10, 0x3, 0x10, 0x5, 0x10, 0xc4, 
       0xa, 0x10, 0x3, 0x11, 0x3, 0x11, 0x3, 0x11, 0x3, 0x11, 0x3, 0x11, 
       0x3, 0x11, 0x5, 0x11, 0xcc, 0xa, 0x11, 0x3, 0x12, 0x3, 0x12, 0x3, 
       0x12, 0x7, 0x12, 0xd1, 0xa, 0x12, 0xc, 0x12, 0xe, 0x12, 0xd4, 0xb, 
       0x12, 0x3, 0x13, 0x3, 0x13, 0x3, 0x13, 0x3, 0x13, 0x3, 0x14, 0x3, 
       0x14, 0x5, 0x14, 0xdc, 0xa, 0x14, 0x3, 0x14, 0x5, 0x14, 0xdf, 0xa, 
       0x14, 0x3, 0x15, 0x3, 0x15, 0x3, 0x15, 0x3, 0x15, 0x3, 0x16, 0x3, 
       0x16, 0x7, 0x16, 0xe7, 0xa, 0x16, 0xc, 0x16, 0xe, 0x16, 0xea, 0xb, 
       0x16, 0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 0x18, 0x3, 
       0x18, 0x3, 0x18, 0x3, 0x19, 0x3, 0x19, 0x3, 0x1a, 0x3, 0x1a, 0x3, 
       0x1b, 0x3, 0x1b, 0x3, 0x1b, 0x3, 0x1b, 0x5, 0x1b, 0xfb, 0xa, 0x1b, 
       0x3, 0x1b, 0x3, 0x1b, 0x3, 0x1c, 0x3, 0x1c, 0x3, 0x1d, 0x5, 0x1d, 
       0x102, 0xa, 0x1d, 0x3, 0x1d, 0x3, 0x1d, 0x3, 0x1d, 0x3, 0x1d, 0x3, 
       0x1d, 0x3, 0x1d, 0x5, 0x1d, 0x10a, 0xa, 0x1d, 0x3, 0x1e, 0x3, 0x1e, 
       0x3, 0x1f, 0x3, 0x1f, 0x3, 0x1f, 0x5, 0x1f, 0x111, 0xa, 0x1f, 0x3, 
       0x20, 0x3, 0x20, 0x3, 0x21, 0x3, 0x21, 0x3, 0x22, 0x3, 0x22, 0x3, 
       0x22, 0x5, 0x22, 0x11a, 0xa, 0x22, 0x3, 0x23, 0x3, 0x23, 0x5, 0x23, 
       0x11e, 0xa, 0x23, 0x3, 0x24, 0x3, 0x24, 0x5, 0x24, 0x122, 0xa, 0x24, 
       0x3, 0x25, 0x3, 0x25, 0x3, 0x25, 0x7, 0x25, 0x127, 0xa, 0x25, 0xc, 
       0x25, 0xe, 0x25, 0x12a, 0xb, 0x25, 0x3, 0x26, 0x3, 0x26, 0x5, 0x26, 
       0x12e, 0xa, 0x26, 0x3, 0x27, 0x3, 0x27, 0x3, 0x27, 0x3, 0x28, 0x3, 
       0x28, 0x5, 0x28, 0x135, 0xa, 0x28, 0x3, 0x28, 0x3, 0x28, 0x5, 0x28, 
       0x139, 0xa, 0x28, 0x3, 0x28, 0x3, 0x28, 0x3, 0x29, 0x3, 0x29, 0x3, 
       0x2a, 0x3, 0x2a, 0x3, 0x2a, 0x3, 0x2a, 0x3, 0x2a, 0x3, 0x2a, 0x3, 
       0x2a, 0x5, 0x2a, 0x146, 0xa, 0x2a, 0x3, 0x2b, 0x3, 0x2b, 0x3, 0x2b, 
       0x3, 0x2b, 0x3, 0x2b, 0x3, 0x2b, 0x3, 0x2b, 0x5, 0x2b, 0x14f, 0xa, 
       0x2b, 0x3, 0x2c, 0x5, 0x2c, 0x152, 0xa, 0x2c, 0x3, 0x2c, 0x5, 0x2c, 
       0x155, 0xa, 0x2c, 0x3, 0x2c, 0x3, 0x2c, 0x5, 0x2c, 0x159, 0xa, 0x2c, 
       0x3, 0x2c, 0x5, 0x2c, 0x15c, 0xa, 0x2c, 0x3, 0x2c, 0x5, 0x2c, 0x15f, 
       0xa, 0x2c, 0x3, 0x2c, 0x5, 0x2c, 0x162, 0xa, 0x2c, 0x3, 0x2c, 0x5, 
       0x2c, 0x165, 0xa, 0x2c, 0x3, 0x2c, 0x3, 0x2c, 0x5, 0x2c, 0x169, 0xa, 
       0x2c, 0x3, 0x2c, 0x5, 0x2c, 0x16c, 0xa, 0x2c, 0x3, 0x2c, 0x5, 0x2c, 
       0x16f, 0xa, 0x2c, 0x3, 0x2c, 0x5, 0x2c, 0x172, 0xa, 0x2c, 0x3, 0x2c, 
       0x3, 0x2c, 0x5, 0x2c, 0x176, 0xa, 0x2c, 0x3, 0x2c, 0x5, 0x2c, 0x179, 
       0xa, 0x2c, 0x3, 0x2c, 0x5, 0x2c, 0x17c, 0xa, 0x2c, 0x3, 0x2c, 0x5, 
       0x2c, 0x17f, 0xa, 0x2c, 0x3, 0x2c, 0x3, 0x2c, 0x5, 0x2c, 0x183, 0xa, 
       0x2c, 0x3, 0x2c, 0x5, 0x2c, 0x186, 0xa, 0x2c, 0x5, 0x2c, 0x188, 0xa, 
       0x2c, 0x3, 0x2c, 0x5, 0x2c, 0x18b, 0xa, 0x2c, 0x3, 0x2c, 0x3, 0x2c, 
       0x5, 0x2c, 0x18f, 0xa, 0x2c, 0x3, 0x2c, 0x5, 0x2c, 0x192, 0xa, 0x2c, 
       0x3, 0x2c, 0x5, 0x2c, 0x195, 0xa, 0x2c, 0x3, 0x2c, 0x5, 0x2c, 0x198, 
       0xa, 0x2c, 0x3, 0x2c, 0x3, 0x2c, 0x5, 0x2c, 0x19c, 0xa, 0x2c, 0x3, 
       0x2c, 0x5, 0x2c, 0x19f, 0xa, 0x2c, 0x3, 0x2c, 0x5, 0x2c, 0x1a2, 0xa, 
       0x2c, 0x5, 0x2c, 0x1a4, 0xa, 0x2c, 0x3, 0x2d, 0x3, 0x2d, 0x3, 0x2d, 
       0x3, 0x2d, 0x3, 0x2e, 0x3, 0x2e, 0x7, 0x2e, 0x1ac, 0xa, 0x2e, 0xc, 
       0x2e, 0xe, 0x2e, 0x1af, 0xb, 0x2e, 0x3, 0x2f, 0x3, 0x2f, 0x7, 0x2f, 
       0x1b3, 0xa, 0x2f, 0xc, 0x2f, 0xe, 0x2f, 0x1b6, 0xb, 0x2f, 0x3, 0x30, 
       0x3, 0x30, 0x3, 0x31, 0x3, 0x31, 0x3, 0x32, 0x3, 0x32, 0x3, 0x33, 
       0x3, 0x33, 0x3, 0x33, 0x2, 0x2, 0x34, 0x2, 0x4, 0x6, 0x8, 0xa, 0xc, 
       0xe, 0x10, 0x12, 0x14, 0x16, 0x18, 0x1a, 0x1c, 0x1e, 0x20, 0x22, 
       0x24, 0x26, 0x28, 0x2a, 0x2c, 0x2e, 0x30, 0x32, 0x34, 0x36, 0x38, 
       0x3a, 0x3c, 0x3e, 0x40, 0x42, 0x44, 0x46, 0x48, 0x4a, 0x4c, 0x4e, 
       0x50, 0x52, 0x54, 0x56, 0x58, 0x5a, 0x5c, 0x5e, 0x60, 0x62, 0x64, 
       0x2, 0x7, 0x3, 0x2, 0x35, 0x36, 0x4, 0x2, 0x15, 0x15, 0x19, 0x19, 
       0x4, 0x2, 0x1f, 0x1f, 0x2b, 0x2b, 0x4, 0x2, 0xb, 0xf, 0x18, 0x18, 
       0x5, 0x2, 0xa, 0x18, 0x1c, 0x25, 0x28, 0x34, 0x2, 0x1d8, 0x2, 0x66, 
       0x3, 0x2, 0x2, 0x2, 0x4, 0x6e, 0x3, 0x2, 0x2, 0x2, 0x6, 0x79, 0x3, 
       0x2, 0x2, 0x2, 0x8, 0x81, 0x3, 0x2, 0x2, 0x2, 0xa, 0x83, 0x3, 0x2, 
       0x2, 0x2, 0xc, 0x85, 0x3, 0x2, 0x2, 0x2, 0xe, 0x8e, 0x3, 0x2, 0x2, 
       0x2, 0x10, 0x90, 0x3, 0x2, 0x2, 0x2, 0x12, 0x92, 0x3, 0x2, 0x2, 0x2, 
       0x14, 0x96, 0x3, 0x2, 0x2, 0x2, 0x16, 0xa3, 0x3, 0x2, 0x2, 0x2, 0x18, 
       0xad, 0x3, 0x2, 0x2, 0x2, 0x1a, 0xaf, 0x3, 0x2, 0x2, 0x2, 0x1c, 0xb6, 
       0x3, 0x2, 0x2, 0x2, 0x1e, 0xc3, 0x3, 0x2, 0x2, 0x2, 0x20, 0xcb, 0x3, 
       0x2, 0x2, 0x2, 0x22, 0xcd, 0x3, 0x2, 0x2, 0x2, 0x24, 0xd5, 0x3, 0x2, 
       0x2, 0x2, 0x26, 0xd9, 0x3, 0x2, 0x2, 0x2, 0x28, 0xe0, 0x3, 0x2, 0x2, 
       0x2, 0x2a, 0xe4, 0x3, 0x2, 0x2, 0x2, 0x2c, 0xeb, 0x3, 0x2, 0x2, 0x2, 
       0x2e, 0xef, 0x3, 0x2, 0x2, 0x2, 0x30, 0xf2, 0x3, 0x2, 0x2, 0x2, 0x32, 
       0xf4, 0x3, 0x2, 0x2, 0x2, 0x34, 0xf6, 0x3, 0x2, 0x2, 0x2, 0x36, 0xfe, 
       0x3, 0x2, 0x2, 0x2, 0x38, 0x101, 0x3, 0x2, 0x2, 0x2, 0x3a, 0x10b, 
       0x3, 0x2, 0x2, 0x2, 0x3c, 0x110, 0x3, 0x2, 0x2, 0x2, 0x3e, 0x112, 
       0x3, 0x2, 0x2, 0x2, 0x40, 0x114, 0x3, 0x2, 0x2, 0x2, 0x42, 0x119, 
       0x3, 0x2, 0x2, 0x2, 0x44, 0x11d, 0x3, 0x2, 0x2, 0x2, 0x46, 0x121, 
       0x3, 0x2, 0x2, 0x2, 0x48, 0x123, 0x3, 0x2, 0x2, 0x2, 0x4a, 0x12b, 
       0x3, 0x2, 0x2, 0x2, 0x4c, 0x12f, 0x3, 0x2, 0x2, 0x2, 0x4e, 0x132, 
       0x3, 0x2, 0x2, 0x2, 0x50, 0x13c, 0x3, 0x2, 0x2, 0x2, 0x52, 0x145, 
       0x3, 0x2, 0x2, 0x2, 0x54, 0x14e, 0x3, 0x2, 0x2, 0x2, 0x56, 0x1a3, 
       0x3, 0x2, 0x2, 0x2, 0x58, 0x1a5, 0x3, 0x2, 0x2, 0x2, 0x5a, 0x1a9, 
       0x3, 0x2, 0x2, 0x2, 0x5c, 0x1b0, 0x3, 0x2, 0x2, 0x2, 0x5e, 0x1b7, 
       0x3, 0x2, 0x2, 0x2, 0x60, 0x1b9, 0x3, 0x2, 0x2, 0x2, 0x62, 0x1bb, 
       0x3, 0x2, 0x2, 0x2, 0x64, 0x1bd, 0x3, 0x2, 0x2, 0x2, 0x66, 0x67, 
       0x5, 0x4, 0x3, 0x2, 0x67, 0x68, 0x7, 0x2, 0x2, 0x3, 0x68, 0x3, 0x3, 
       0x2, 0x2, 0x2, 0x69, 0x6f, 0x5, 0x6, 0x4, 0x2, 0x6a, 0x6b, 0x5, 0x6, 
       0x4, 0x2, 0x6b, 0x6c, 0x5, 0x4, 0x3, 0x2, 0x6c, 0x6f, 0x3, 0x2, 0x2, 
       0x2, 0x6d, 0x6f, 0x3, 0x2, 0x2, 0x2, 0x6e, 0x69, 0x3, 0x2, 0x2, 0x2, 
       0x6e, 0x6a, 0x3, 0x2, 0x2, 0x2, 0x6e, 0x6d, 0x3, 0x2, 0x2, 0x2, 0x6f, 
       0x5, 0x3, 0x2, 0x2, 0x2, 0x70, 0x7a, 0x5, 0xa, 0x6, 0x2, 0x71, 0x7a, 
       0x5, 0xc, 0x7, 0x2, 0x72, 0x7a, 0x5, 0x12, 0xa, 0x2, 0x73, 0x7a, 
       0x5, 0x24, 0x13, 0x2, 0x74, 0x7a, 0x5, 0x26, 0x14, 0x2, 0x75, 0x7a, 
       0x5, 0x34, 0x1b, 0x2, 0x76, 0x7a, 0x5, 0x4a, 0x26, 0x2, 0x77, 0x7a, 
       0x5, 0x8, 0x5, 0x2, 0x78, 0x7a, 0x5, 0x64, 0x33, 0x2, 0x79, 0x70, 
       0x3, 0x2, 0x2, 0x2, 0x79, 0x71, 0x3, 0x2, 0x2, 0x2, 0x79, 0x72, 0x3, 
       0x2, 0x2, 0x2, 0x79, 0x73, 0x3, 0x2, 0x2, 0x2, 0x79, 0x74, 0x3, 0x2, 
       0x2, 0x2, 0x79, 0x75, 0x3, 0x2, 0x2, 0x2, 0x79, 0x76, 0x3, 0x2, 0x2, 
       0x2, 0x79, 0x77, 0x3, 0x2, 0x2, 0x2, 0x79, 0x78, 0x3, 0x2, 0x2, 0x2, 
       0x7a, 0x7, 0x3, 0x2, 0x2, 0x2, 0x7b, 0x7c, 0x7, 0x26, 0x2, 0x2, 0x7c, 
       0x82, 0x7, 0x27, 0x2, 0x2, 0x7d, 0x7e, 0x7, 0x26, 0x2, 0x2, 0x7e, 
       0x7f, 0x5, 0x4, 0x3, 0x2, 0x7f, 0x80, 0x7, 0x27, 0x2, 0x2, 0x80, 
       0x82, 0x3, 0x2, 0x2, 0x2, 0x81, 0x7b, 0x3, 0x2, 0x2, 0x2, 0x81, 0x7d, 
       0x3, 0x2, 0x2, 0x2, 0x82, 0x9, 0x3, 0x2, 0x2, 0x2, 0x83, 0x84, 0x9, 
       0x2, 0x2, 0x2, 0x84, 0xb, 0x3, 0x2, 0x2, 0x2, 0x85, 0x86, 0x7, 0x3, 
       0x2, 0x2, 0x86, 0x87, 0x5, 0xe, 0x8, 0x2, 0x87, 0x88, 0x7, 0x1e, 
       0x2, 0x2, 0x88, 0xd, 0x3, 0x2, 0x2, 0x2, 0x89, 0x8f, 0x5, 0x10, 0x9, 
       0x2, 0x8a, 0x8b, 0x5, 0x10, 0x9, 0x2, 0x8b, 0x8c, 0x7, 0x23, 0x2, 
       0x2, 0x8c, 0x8d, 0x5, 0xe, 0x8, 0x2, 0x8d, 0x8f, 0x3, 0x2, 0x2, 0x2, 
       0x8e, 0x89, 0x3, 0x2, 0x2, 0x2, 0x8e, 0x8a, 0x3, 0x2, 0x2, 0x2, 0x8f, 
       0xf, 0x3, 0x2, 0x2, 0x2, 0x90, 0x91, 0x7, 0x34, 0x2, 0x2, 0x91, 0x11, 
       0x3, 0x2, 0x2, 0x2, 0x92, 0x93, 0x7, 0x4, 0x2, 0x2, 0x93, 0x94, 0x5, 
       0x14, 0xb, 0x2, 0x94, 0x95, 0x7, 0x1e, 0x2, 0x2, 0x95, 0x13, 0x3, 
       0x2, 0x2, 0x2, 0x96, 0x98, 0x5, 0x16, 0xc, 0x2, 0x97, 0x99, 0x9, 
       0x3, 0x2, 0x2, 0x98, 0x97, 0x3, 0x2, 0x2, 0x2, 0x98, 0x99, 0x3, 0x2, 
       0x2, 0x2, 0x99, 0x9a, 0x3, 0x2, 0x2, 0x2, 0x9a, 0x9f, 0x5, 0x5c, 
       0x2f, 0x2, 0x9b, 0x9c, 0x7, 0x23, 0x2, 0x2, 0x9c, 0x9e, 0x5, 0x14, 
       0xb, 0x2, 0x9d, 0x9b, 0x3, 0x2, 0x2, 0x2, 0x9e, 0xa1, 0x3, 0x2, 0x2, 
       0x2, 0x9f, 0x9d, 0x3, 0x2, 0x2, 0x2, 0x9f, 0xa0, 0x3, 0x2, 0x2, 0x2, 
       0xa0, 0x15, 0x3, 0x2, 0x2, 0x2, 0xa1, 0x9f, 0x3, 0x2, 0x2, 0x2, 0xa2, 
       0xa4, 0x5, 0x1a, 0xe, 0x2, 0xa3, 0xa2, 0x3, 0x2, 0x2, 0x2, 0xa3, 
       0xa4, 0x3, 0x2, 0x2, 0x2, 0xa4, 0xa9, 0x3, 0x2, 0x2, 0x2, 0xa5, 0xaa, 
       0x5, 0x5e, 0x30, 0x2, 0xa6, 0xa7, 0x5, 0x5e, 0x30, 0x2, 0xa7, 0xa8, 
       0x7, 0x30, 0x2, 0x2, 0xa8, 0xaa, 0x3, 0x2, 0x2, 0x2, 0xa9, 0xa5, 
       0x3, 0x2, 0x2, 0x2, 0xa9, 0xa6, 0x3, 0x2, 0x2, 0x2, 0xaa, 0xab, 0x3, 
       0x2, 0x2, 0x2, 0xab, 0xac, 0x9, 0x4, 0x2, 0x2, 0xac, 0x17, 0x3, 0x2, 
       0x2, 0x2, 0xad, 0xae, 0x9, 0x5, 0x2, 0x2, 0xae, 0x19, 0x3, 0x2, 0x2, 
       0x2, 0xaf, 0xb3, 0x5, 0x18, 0xd, 0x2, 0xb0, 0xb2, 0x5, 0x1a, 0xe, 
       0x2, 0xb1, 0xb0, 0x3, 0x2, 0x2, 0x2, 0xb2, 0xb5, 0x3, 0x2, 0x2, 0x2, 
       0xb3, 0xb1, 0x3, 0x2, 0x2, 0x2, 0xb3, 0xb4, 0x3, 0x2, 0x2, 0x2, 0xb4, 
       0x1b, 0x3, 0x2, 0x2, 0x2, 0xb5, 0xb3, 0x3, 0x2, 0x2, 0x2, 0xb6, 0xb8, 
       0x5, 0x1e, 0x10, 0x2, 0xb7, 0xb9, 0x5, 0x5e, 0x30, 0x2, 0xb8, 0xb7, 
       0x3, 0x2, 0x2, 0x2, 0xb8, 0xb9, 0x3, 0x2, 0x2, 0x2, 0xb9, 0xba, 0x3, 
       0x2, 0x2, 0x2, 0xba, 0xbb, 0x5, 0x20, 0x11, 0x2, 0xbb, 0x1d, 0x3, 
       0x2, 0x2, 0x2, 0xbc, 0xc4, 0x5, 0x5e, 0x30, 0x2, 0xbd, 0xbe, 0x5, 
       0x5e, 0x30, 0x2, 0xbe, 0xbf, 0x7, 0x20, 0x2, 0x2, 0xbf, 0xc4, 0x3, 
       0x2, 0x2, 0x2, 0xc0, 0xc1, 0x5, 0x5e, 0x30, 0x2, 0xc1, 0xc2, 0x7, 
       0x22, 0x2, 0x2, 0xc2, 0xc4, 0x3, 0x2, 0x2, 0x2, 0xc3, 0xbc, 0x3, 
       0x2, 0x2, 0x2, 0xc3, 0xbd, 0x3, 0x2, 0x2, 0x2, 0xc3, 0xc0, 0x3, 0x2, 
       0x2, 0x2, 0xc4, 0x1f, 0x3, 0x2, 0x2, 0x2, 0xc5, 0xc6, 0x7, 0x28, 
       0x2, 0x2, 0xc6, 0xcc, 0x7, 0x29, 0x2, 0x2, 0xc7, 0xc8, 0x7, 0x28, 
       0x2, 0x2, 0xc8, 0xc9, 0x5, 0x22, 0x12, 0x2, 0xc9, 0xca, 0x7, 0x29, 
       0x2, 0x2, 0xca, 0xcc, 0x3, 0x2, 0x2, 0x2, 0xcb, 0xc5, 0x3, 0x2, 0x2, 
       0x2, 0xcb, 0xc7, 0x3, 0x2, 0x2, 0x2, 0xcc, 0x21, 0x3, 0x2, 0x2, 0x2, 
       0xcd, 0xd2, 0x5, 0x56, 0x2c, 0x2, 0xce, 0xcf, 0x7, 0x23, 0x2, 0x2, 
       0xcf, 0xd1, 0x5, 0x22, 0x12, 0x2, 0xd0, 0xce, 0x3, 0x2, 0x2, 0x2, 
       0xd1, 0xd4, 0x3, 0x2, 0x2, 0x2, 0xd2, 0xd0, 0x3, 0x2, 0x2, 0x2, 0xd2, 
       0xd3, 0x3, 0x2, 0x2, 0x2, 0xd3, 0x23, 0x3, 0x2, 0x2, 0x2, 0xd4, 0xd2, 
       0x3, 0x2, 0x2, 0x2, 0xd5, 0xd6, 0x7, 0x9, 0x2, 0x2, 0xd6, 0xd7, 0x5, 
       0x5c, 0x2f, 0x2, 0xd7, 0xd8, 0x7, 0x1e, 0x2, 0x2, 0xd8, 0x25, 0x3, 
       0x2, 0x2, 0x2, 0xd9, 0xdb, 0x5, 0x28, 0x15, 0x2, 0xda, 0xdc, 0x5, 
       0x2a, 0x16, 0x2, 0xdb, 0xda, 0x3, 0x2, 0x2, 0x2, 0xdb, 0xdc, 0x3, 
       0x2, 0x2, 0x2, 0xdc, 0xde, 0x3, 0x2, 0x2, 0x2, 0xdd, 0xdf, 0x5, 0x2e, 
       0x18, 0x2, 0xde, 0xdd, 0x3, 0x2, 0x2, 0x2, 0xde, 0xdf, 0x3, 0x2, 
       0x2, 0x2, 0xdf, 0x27, 0x3, 0x2, 0x2, 0x2, 0xe0, 0xe1, 0x7, 0x5, 0x2, 
       0x2, 0xe1, 0xe2, 0x5, 0x30, 0x19, 0x2, 0xe2, 0xe3, 0x5, 0x32, 0x1a, 
       0x2, 0xe3, 0x29, 0x3, 0x2, 0x2, 0x2, 0xe4, 0xe8, 0x5, 0x2c, 0x17, 
       0x2, 0xe5, 0xe7, 0x5, 0x2a, 0x16, 0x2, 0xe6, 0xe5, 0x3, 0x2, 0x2, 
       0x2, 0xe7, 0xea, 0x3, 0x2, 0x2, 0x2, 0xe8, 0xe6, 0x3, 0x2, 0x2, 0x2, 
       0xe8, 0xe9, 0x3, 0x2, 0x2, 0x2, 0xe9, 0x2b, 0x3, 0x2, 0x2, 0x2, 0xea, 
       0xe8, 0x3, 0x2, 0x2, 0x2, 0xeb, 0xec, 0x7, 0x6, 0x2, 0x2, 0xec, 0xed, 
       0x5, 0x30, 0x19, 0x2, 0xed, 0xee, 0x5, 0x32, 0x1a, 0x2, 0xee, 0x2d, 
       0x3, 0x2, 0x2, 0x2, 0xef, 0xf0, 0x7, 0x7, 0x2, 0x2, 0xf0, 0xf1, 0x5, 
       0x32, 0x1a, 0x2, 0xf1, 0x2f, 0x3, 0x2, 0x2, 0x2, 0xf2, 0xf3, 0x5, 
       0x5c, 0x2f, 0x2, 0xf3, 0x31, 0x3, 0x2, 0x2, 0x2, 0xf4, 0xf5, 0x5, 
       0x52, 0x2a, 0x2, 0xf5, 0x33, 0x3, 0x2, 0x2, 0x2, 0xf6, 0xfa, 0x7, 
       0x8, 0x2, 0x2, 0xf7, 0xfb, 0x5, 0x3c, 0x1f, 0x2, 0xf8, 0xfb, 0x5, 
       0x3a, 0x1e, 0x2, 0xf9, 0xfb, 0x5, 0x38, 0x1d, 0x2, 0xfa, 0xf7, 0x3, 
       0x2, 0x2, 0x2, 0xfa, 0xf8, 0x3, 0x2, 0x2, 0x2, 0xfa, 0xf9, 0x3, 0x2, 
       0x2, 0x2, 0xfb, 0xfc, 0x3, 0x2, 0x2, 0x2, 0xfc, 0xfd, 0x5, 0x36, 
       0x1c, 0x2, 0xfd, 0x35, 0x3, 0x2, 0x2, 0x2, 0xfe, 0xff, 0x5, 0x52, 
       0x2a, 0x2, 0xff, 0x37, 0x3, 0x2, 0x2, 0x2, 0x100, 0x102, 0x7, 0x28, 
       0x2, 0x2, 0x101, 0x100, 0x3, 0x2, 0x2, 0x2, 0x101, 0x102, 0x3, 0x2, 
       0x2, 0x2, 0x102, 0x103, 0x3, 0x2, 0x2, 0x2, 0x103, 0x104, 0x5, 0x42, 
       0x22, 0x2, 0x104, 0x105, 0x5, 0x3e, 0x20, 0x2, 0x105, 0x106, 0x5, 
       0x44, 0x23, 0x2, 0x106, 0x107, 0x5, 0x40, 0x21, 0x2, 0x107, 0x109, 
       0x5, 0x46, 0x24, 0x2, 0x108, 0x10a, 0x7, 0x29, 0x2, 0x2, 0x109, 0x108, 
       0x3, 0x2, 0x2, 0x2, 0x109, 0x10a, 0x3, 0x2, 0x2, 0x2, 0x10a, 0x39, 
       0x3, 0x2, 0x2, 0x2, 0x10b, 0x10c, 0x5, 0x44, 0x23, 0x2, 0x10c, 0x3b, 
       0x3, 0x2, 0x2, 0x2, 0x10d, 0x10e, 0x7, 0x28, 0x2, 0x2, 0x10e, 0x111, 
       0x7, 0x29, 0x2, 0x2, 0x10f, 0x111, 0x3, 0x2, 0x2, 0x2, 0x110, 0x10d, 
       0x3, 0x2, 0x2, 0x2, 0x110, 0x10f, 0x3, 0x2, 0x2, 0x2, 0x111, 0x3d, 
       0x3, 0x2, 0x2, 0x2, 0x112, 0x113, 0x7, 0x1e, 0x2, 0x2, 0x113, 0x3f, 
       0x3, 0x2, 0x2, 0x2, 0x114, 0x115, 0x7, 0x1e, 0x2, 0x2, 0x115, 0x41, 
       0x3, 0x2, 0x2, 0x2, 0x116, 0x117, 0x7, 0x4, 0x2, 0x2, 0x117, 0x11a, 
       0x5, 0x14, 0xb, 0x2, 0x118, 0x11a, 0x3, 0x2, 0x2, 0x2, 0x119, 0x116, 
       0x3, 0x2, 0x2, 0x2, 0x119, 0x118, 0x3, 0x2, 0x2, 0x2, 0x11a, 0x43, 
       0x3, 0x2, 0x2, 0x2, 0x11b, 0x11e, 0x5, 0x5c, 0x2f, 0x2, 0x11c, 0x11e, 
       0x3, 0x2, 0x2, 0x2, 0x11d, 0x11b, 0x3, 0x2, 0x2, 0x2, 0x11d, 0x11c, 
       0x3, 0x2, 0x2, 0x2, 0x11e, 0x45, 0x3, 0x2, 0x2, 0x2, 0x11f, 0x122, 
       0x5, 0x48, 0x25, 0x2, 0x120, 0x122, 0x3, 0x2, 0x2, 0x2, 0x121, 0x11f, 
       0x3, 0x2, 0x2, 0x2, 0x121, 0x120, 0x3, 0x2, 0x2, 0x2, 0x122, 0x47, 
       0x3, 0x2, 0x2, 0x2, 0x123, 0x128, 0x5, 0x5c, 0x2f, 0x2, 0x124, 0x125, 
       0x7, 0x23, 0x2, 0x2, 0x125, 0x127, 0x5, 0x5c, 0x2f, 0x2, 0x126, 0x124, 
       0x3, 0x2, 0x2, 0x2, 0x127, 0x12a, 0x3, 0x2, 0x2, 0x2, 0x128, 0x126, 
       0x3, 0x2, 0x2, 0x2, 0x128, 0x129, 0x3, 0x2, 0x2, 0x2, 0x129, 0x49, 
       0x3, 0x2, 0x2, 0x2, 0x12a, 0x128, 0x3, 0x2, 0x2, 0x2, 0x12b, 0x12d, 
       0x5, 0x4c, 0x27, 0x2, 0x12c, 0x12e, 0x5, 0x4e, 0x28, 0x2, 0x12d, 
       0x12c, 0x3, 0x2, 0x2, 0x2, 0x12d, 0x12e, 0x3, 0x2, 0x2, 0x2, 0x12e, 
       0x4b, 0x3, 0x2, 0x2, 0x2, 0x12f, 0x130, 0x7, 0x1a, 0x2, 0x2, 0x130, 
       0x131, 0x5, 0x50, 0x29, 0x2, 0x131, 0x4d, 0x3, 0x2, 0x2, 0x2, 0x132, 
       0x134, 0x7, 0x1b, 0x2, 0x2, 0x133, 0x135, 0x7, 0x28, 0x2, 0x2, 0x134, 
       0x133, 0x3, 0x2, 0x2, 0x2, 0x134, 0x135, 0x3, 0x2, 0x2, 0x2, 0x135, 
       0x136, 0x3, 0x2, 0x2, 0x2, 0x136, 0x138, 0x5, 0x5e, 0x30, 0x2, 0x137, 
       0x139, 0x7, 0x29, 0x2, 0x2, 0x138, 0x137, 0x3, 0x2, 0x2, 0x2, 0x138, 
       0x139, 0x3, 0x2, 0x2, 0x2, 0x139, 0x13a, 0x3, 0x2, 0x2, 0x2, 0x13a, 
       0x13b, 0x5, 0x50, 0x29, 0x2, 0x13b, 0x4f, 0x3, 0x2, 0x2, 0x2, 0x13c, 
       0x13d, 0x5, 0x52, 0x2a, 0x2, 0x13d, 0x51, 0x3, 0x2, 0x2, 0x2, 0x13e, 
       0x13f, 0x7, 0x26, 0x2, 0x2, 0x13f, 0x146, 0x7, 0x27, 0x2, 0x2, 0x140, 
       0x141, 0x7, 0x26, 0x2, 0x2, 0x141, 0x142, 0x5, 0x4, 0x3, 0x2, 0x142, 
       0x143, 0x7, 0x27, 0x2, 0x2, 0x143, 0x146, 0x3, 0x2, 0x2, 0x2, 0x144, 
       0x146, 0x5, 0x54, 0x2b, 0x2, 0x145, 0x13e, 0x3, 0x2, 0x2, 0x2, 0x145, 
       0x140, 0x3, 0x2, 0x2, 0x2, 0x145, 0x144, 0x3, 0x2, 0x2, 0x2, 0x146, 
       0x53, 0x3, 0x2, 0x2, 0x2, 0x147, 0x148, 0x5, 0x1c, 0xf, 0x2, 0x148, 
       0x149, 0x7, 0x1e, 0x2, 0x2, 0x149, 0x14f, 0x3, 0x2, 0x2, 0x2, 0x14a, 
       0x14f, 0x5, 0x24, 0x13, 0x2, 0x14b, 0x14f, 0x5, 0x26, 0x14, 0x2, 
       0x14c, 0x14f, 0x5, 0x34, 0x1b, 0x2, 0x14d, 0x14f, 0x5, 0x4a, 0x26, 
       0x2, 0x14e, 0x147, 0x3, 0x2, 0x2, 0x2, 0x14e, 0x14a, 0x3, 0x2, 0x2, 
       0x2, 0x14e, 0x14b, 0x3, 0x2, 0x2, 0x2, 0x14e, 0x14c, 0x3, 0x2, 0x2, 
       0x2, 0x14e, 0x14d, 0x3, 0x2, 0x2, 0x2, 0x14f, 0x55, 0x3, 0x2, 0x2, 
       0x2, 0x150, 0x152, 0x7, 0x2c, 0x2, 0x2, 0x151, 0x150, 0x3, 0x2, 0x2, 
       0x2, 0x151, 0x152, 0x3, 0x2, 0x2, 0x2, 0x152, 0x154, 0x3, 0x2, 0x2, 
       0x2, 0x153, 0x155, 0x5, 0x60, 0x31, 0x2, 0x154, 0x153, 0x3, 0x2, 
       0x2, 0x2, 0x154, 0x155, 0x3, 0x2, 0x2, 0x2, 0x155, 0x156, 0x3, 0x2, 
       0x2, 0x2, 0x156, 0x158, 0x5, 0x5e, 0x30, 0x2, 0x157, 0x159, 0x5, 
       0x62, 0x32, 0x2, 0x158, 0x157, 0x3, 0x2, 0x2, 0x2, 0x158, 0x159, 
       0x3, 0x2, 0x2, 0x2, 0x159, 0x15b, 0x3, 0x2, 0x2, 0x2, 0x15a, 0x15c, 
       0x7, 0x30, 0x2, 0x2, 0x15b, 0x15a, 0x3, 0x2, 0x2, 0x2, 0x15b, 0x15c, 
       0x3, 0x2, 0x2, 0x2, 0x15c, 0x15e, 0x3, 0x2, 0x2, 0x2, 0x15d, 0x15f, 
       0x7, 0x2a, 0x2, 0x2, 0x15e, 0x15d, 0x3, 0x2, 0x2, 0x2, 0x15e, 0x15f, 
       0x3, 0x2, 0x2, 0x2, 0x15f, 0x161, 0x3, 0x2, 0x2, 0x2, 0x160, 0x162, 
       0x7, 0x2b, 0x2, 0x2, 0x161, 0x160, 0x3, 0x2, 0x2, 0x2, 0x161, 0x162, 
       0x3, 0x2, 0x2, 0x2, 0x162, 0x188, 0x3, 0x2, 0x2, 0x2, 0x163, 0x165, 
       0x7, 0x2c, 0x2, 0x2, 0x164, 0x163, 0x3, 0x2, 0x2, 0x2, 0x164, 0x165, 
       0x3, 0x2, 0x2, 0x2, 0x165, 0x166, 0x3, 0x2, 0x2, 0x2, 0x166, 0x168, 
       0x7, 0x32, 0x2, 0x2, 0x167, 0x169, 0x7, 0x30, 0x2, 0x2, 0x168, 0x167, 
       0x3, 0x2, 0x2, 0x2, 0x168, 0x169, 0x3, 0x2, 0x2, 0x2, 0x169, 0x16b, 
       0x3, 0x2, 0x2, 0x2, 0x16a, 0x16c, 0x7, 0x2a, 0x2, 0x2, 0x16b, 0x16a, 
       0x3, 0x2, 0x2, 0x2, 0x16b, 0x16c, 0x3, 0x2, 0x2, 0x2, 0x16c, 0x16e, 
       0x3, 0x2, 0x2, 0x2, 0x16d, 0x16f, 0x7, 0x2b, 0x2, 0x2, 0x16e, 0x16d, 
       0x3, 0x2, 0x2, 0x2, 0x16e, 0x16f, 0x3, 0x2, 0x2, 0x2, 0x16f, 0x188, 
       0x3, 0x2, 0x2, 0x2, 0x170, 0x172, 0x7, 0x2c, 0x2, 0x2, 0x171, 0x170, 
       0x3, 0x2, 0x2, 0x2, 0x171, 0x172, 0x3, 0x2, 0x2, 0x2, 0x172, 0x173, 
       0x3, 0x2, 0x2, 0x2, 0x173, 0x175, 0x7, 0x33, 0x2, 0x2, 0x174, 0x176, 
       0x7, 0x30, 0x2, 0x2, 0x175, 0x174, 0x3, 0x2, 0x2, 0x2, 0x175, 0x176, 
       0x3, 0x2, 0x2, 0x2, 0x176, 0x178, 0x3, 0x2, 0x2, 0x2, 0x177, 0x179, 
       0x7, 0x2a, 0x2, 0x2, 0x178, 0x177, 0x3, 0x2, 0x2, 0x2, 0x178, 0x179, 
       0x3, 0x2, 0x2, 0x2, 0x179, 0x17b, 0x3, 0x2, 0x2, 0x2, 0x17a, 0x17c, 
       0x7, 0x2b, 0x2, 0x2, 0x17b, 0x17a, 0x3, 0x2, 0x2, 0x2, 0x17b, 0x17c, 
       0x3, 0x2, 0x2, 0x2, 0x17c, 0x188, 0x3, 0x2, 0x2, 0x2, 0x17d, 0x17f, 
       0x7, 0x2c, 0x2, 0x2, 0x17e, 0x17d, 0x3, 0x2, 0x2, 0x2, 0x17e, 0x17f, 
       0x3, 0x2, 0x2, 0x2, 0x17f, 0x180, 0x3, 0x2, 0x2, 0x2, 0x180, 0x182, 
       0x7, 0x34, 0x2, 0x2, 0x181, 0x183, 0x7, 0x2a, 0x2, 0x2, 0x182, 0x181, 
       0x3, 0x2, 0x2, 0x2, 0x182, 0x183, 0x3, 0x2, 0x2, 0x2, 0x183, 0x185, 
       0x3, 0x2, 0x2, 0x2, 0x184, 0x186, 0x7, 0x2b, 0x2, 0x2, 0x185, 0x184, 
       0x3, 0x2, 0x2, 0x2, 0x185, 0x186, 0x3, 0x2, 0x2, 0x2, 0x186, 0x188, 
       0x3, 0x2, 0x2, 0x2, 0x187, 0x151, 0x3, 0x2, 0x2, 0x2, 0x187, 0x164, 
       0x3, 0x2, 0x2, 0x2, 0x187, 0x171, 0x3, 0x2, 0x2, 0x2, 0x187, 0x17e, 
       0x3, 0x2, 0x2, 0x2, 0x188, 0x1a4, 0x3, 0x2, 0x2, 0x2, 0x189, 0x18b, 
       0x7, 0x2c, 0x2, 0x2, 0x18a, 0x189, 0x3, 0x2, 0x2, 0x2, 0x18a, 0x18b, 
       0x3, 0x2, 0x2, 0x2, 0x18b, 0x18c, 0x3, 0x2, 0x2, 0x2, 0x18c, 0x18e, 
       0x5, 0x1c, 0xf, 0x2, 0x18d, 0x18f, 0x7, 0x30, 0x2, 0x2, 0x18e, 0x18d, 
       0x3, 0x2, 0x2, 0x2, 0x18e, 0x18f, 0x3, 0x2, 0x2, 0x2, 0x18f, 0x191, 
       0x3, 0x2, 0x2, 0x2, 0x190, 0x192, 0x7, 0x2a, 0x2, 0x2, 0x191, 0x190, 
       0x3, 0x2, 0x2, 0x2, 0x191, 0x192, 0x3, 0x2, 0x2, 0x2, 0x192, 0x194, 
       0x3, 0x2, 0x2, 0x2, 0x193, 0x195, 0x7, 0x2b, 0x2, 0x2, 0x194, 0x193, 
       0x3, 0x2, 0x2, 0x2, 0x194, 0x195, 0x3, 0x2, 0x2, 0x2, 0x195, 0x1a4, 
       0x3, 0x2, 0x2, 0x2, 0x196, 0x198, 0x7, 0x2c, 0x2, 0x2, 0x197, 0x196, 
       0x3, 0x2, 0x2, 0x2, 0x197, 0x198, 0x3, 0x2, 0x2, 0x2, 0x198, 0x199, 
       0x3, 0x2, 0x2, 0x2, 0x199, 0x19b, 0x5, 0x58, 0x2d, 0x2, 0x19a, 0x19c, 
       0x7, 0x30, 0x2, 0x2, 0x19b, 0x19a, 0x3, 0x2, 0x2, 0x2, 0x19b, 0x19c, 
       0x3, 0x2, 0x2, 0x2, 0x19c, 0x19e, 0x3, 0x2, 0x2, 0x2, 0x19d, 0x19f, 
       0x7, 0x2a, 0x2, 0x2, 0x19e, 0x19d, 0x3, 0x2, 0x2, 0x2, 0x19e, 0x19f, 
       0x3, 0x2, 0x2, 0x2, 0x19f, 0x1a1, 0x3, 0x2, 0x2, 0x2, 0x1a0, 0x1a2, 
       0x7, 0x2b, 0x2, 0x2, 0x1a1, 0x1a0, 0x3, 0x2, 0x2, 0x2, 0x1a1, 0x1a2, 
       0x3, 0x2, 0x2, 0x2, 0x1a2, 0x1a4, 0x3, 0x2, 0x2, 0x2, 0x1a3, 0x187, 
       0x3, 0x2, 0x2, 0x2, 0x1a3, 0x18a, 0x3, 0x2, 0x2, 0x2, 0x1a3, 0x197, 
       0x3, 0x2, 0x2, 0x2, 0x1a4, 0x57, 0x3, 0x2, 0x2, 0x2, 0x1a5, 0x1a6, 
       0x7, 0x28, 0x2, 0x2, 0x1a6, 0x1a7, 0x5, 0x5a, 0x2e, 0x2, 0x1a7, 0x1a8, 
       0x7, 0x29, 0x2, 0x2, 0x1a8, 0x59, 0x3, 0x2, 0x2, 0x2, 0x1a9, 0x1ad, 
       0x5, 0x56, 0x2c, 0x2, 0x1aa, 0x1ac, 0x5, 0x5a, 0x2e, 0x2, 0x1ab, 
       0x1aa, 0x3, 0x2, 0x2, 0x2, 0x1ac, 0x1af, 0x3, 0x2, 0x2, 0x2, 0x1ad, 
       0x1ab, 0x3, 0x2, 0x2, 0x2, 0x1ad, 0x1ae, 0x3, 0x2, 0x2, 0x2, 0x1ae, 
       0x5b, 0x3, 0x2, 0x2, 0x2, 0x1af, 0x1ad, 0x3, 0x2, 0x2, 0x2, 0x1b0, 
       0x1b4, 0x5, 0x56, 0x2c, 0x2, 0x1b1, 0x1b3, 0x5, 0x5c, 0x2f, 0x2, 
       0x1b2, 0x1b1, 0x3, 0x2, 0x2, 0x2, 0x1b3, 0x1b6, 0x3, 0x2, 0x2, 0x2, 
       0x1b4, 0x1b2, 0x3, 0x2, 0x2, 0x2, 0x1b4, 0x1b5, 0x3, 0x2, 0x2, 0x2, 
       0x1b5, 0x5d, 0x3, 0x2, 0x2, 0x2, 0x1b6, 0x1b4, 0x3, 0x2, 0x2, 0x2, 
       0x1b7, 0x1b8, 0x7, 0x2e, 0x2, 0x2, 0x1b8, 0x5f, 0x3, 0x2, 0x2, 0x2, 
       0x1b9, 0x1ba, 0x7, 0x2d, 0x2, 0x2, 0x1ba, 0x61, 0x3, 0x2, 0x2, 0x2, 
       0x1bb, 0x1bc, 0x7, 0x2d, 0x2, 0x2, 0x1bc, 0x63, 0x3, 0x2, 0x2, 0x2, 
       0x1bd, 0x1be, 0x9, 0x6, 0x2, 0x2, 0x1be, 0x65, 0x3, 0x2, 0x2, 0x2, 
       0x3c, 0x6e, 0x79, 0x81, 0x8e, 0x98, 0x9f, 0xa3, 0xa9, 0xb3, 0xb8, 
       0xc3, 0xcb, 0xd2, 0xdb, 0xde, 0xe8, 0xfa, 0x101, 0x109, 0x110, 0x119, 
       0x11d, 0x121, 0x128, 0x12d, 0x134, 0x138, 0x145, 0x14e, 0x151, 0x154, 
       0x158, 0x15b, 0x15e, 0x161, 0x164, 0x168, 0x16b, 0x16e, 0x171, 0x175, 
       0x178, 0x17b, 0x17e, 0x182, 0x185, 0x187, 0x18a, 0x18e, 0x191, 0x194, 
       0x197, 0x19b, 0x19e, 0x1a1, 0x1a3, 0x1ad, 0x1b4, 
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
