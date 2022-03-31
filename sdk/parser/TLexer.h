
// Generated from ./TLexer.g4 by ANTLR 4.9.2

#pragma once


#include "antlr4-runtime.h"


	#ifndef _WIN32
	#pragma GCC diagnostic ignored "-Wunused-parameter"
	#endif


namespace verbum {


class  TLexer : public antlr4::Lexer {
public:
  enum {
    Use = 1, Var = 2, If = 3, Elif = 4, Else = 5, Bool = 6, End = 7, Attr = 8, 
    Point = 9, TwoPoint = 10, TwoTwoPoint = 11, Separator = 12, OpenArIndex = 13, 
    CloseArIndex = 14, OpenBlock = 15, CloseBlock = 16, OpenOp = 17, CloseOp = 18, 
    ArithmeticOperator = 19, AssignmentOperator = 20, Not = 21, IncDecOperators = 22, 
    Identifier = 23, IDPrefix = 24, TypeSpec = 25, String = 26, Integer = 27, 
    Float = 28, Whitespace = 29, Newline = 30, Words = 31, BlockComment = 32, 
    LineComment = 33
  };

  explicit TLexer(antlr4::CharStream *input);
  ~TLexer();

  virtual std::string getGrammarFileName() const override;
  virtual const std::vector<std::string>& getRuleNames() const override;

  virtual const std::vector<std::string>& getChannelNames() const override;
  virtual const std::vector<std::string>& getModeNames() const override;
  virtual const std::vector<std::string>& getTokenNames() const override; // deprecated, use vocabulary instead
  virtual antlr4::dfa::Vocabulary& getVocabulary() const override;

  virtual const std::vector<uint16_t> getSerializedATN() const override;
  virtual const antlr4::atn::ATN& getATN() const override;

private:
  static std::vector<antlr4::dfa::DFA> _decisionToDFA;
  static antlr4::atn::PredictionContextCache _sharedContextCache;
  static std::vector<std::string> _ruleNames;
  static std::vector<std::string> _tokenNames;
  static std::vector<std::string> _channelNames;
  static std::vector<std::string> _modeNames;

  static std::vector<std::string> _literalNames;
  static std::vector<std::string> _symbolicNames;
  static antlr4::dfa::Vocabulary _vocabulary;
  static antlr4::atn::ATN _atn;
  static std::vector<uint16_t> _serializedATN;


  // Individual action functions triggered by action() above.

  // Individual semantic predicate functions triggered by sempred() above.

  struct Initializer {
    Initializer();
  };
  static Initializer _init;
};

}  // namespace verbum
