// Generated from C:/Users/Baxi/Desktop/Compiladores\Parser.g4 by ANTLR 4.8
package generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ABSTRACT=1, ASSERT=2, BOOLEAN=3, BREAK=4, BYTE=5, CASE=6, CATCH=7, CHAR=8, 
		CLASS=9, CONST=10, CONTINUE=11, DEFAULT=12, DO=13, DOUBLE=14, ELSE=15, 
		ENUM=16, EXTENDS=17, FINAL=18, FINALLY=19, FLOAT=20, FOR=21, IF=22, GOTO=23, 
		IMPLEMENTS=24, IMPORT=25, INSTANCEOF=26, INT=27, INTERFACE=28, LONG=29, 
		NATIVE=30, NEW=31, PACKAGE=32, PRIVATE=33, PROTECTED=34, PUBLIC=35, RETURN=36, 
		SHORT=37, STATIC=38, STRICTFP=39, SUPER=40, SWITCH=41, SYNCHRONIZED=42, 
		THIS=43, THROW=44, THROWS=45, TRANSIENT=46, TRY=47, VOID=48, VOLATILE=49, 
		WHILE=50, IntegerLiteral=51, FloatingPointLiteral=52, BooleanLiteral=53, 
		CharacterLiteral=54, StringLiteral=55, NullLiteral=56, LPAREN=57, RPAREN=58, 
		LBRACE=59, RBRACE=60, LBRACK=61, RBRACK=62, SEMI=63, COMMA=64, DOT=65, 
		ASSIGN=66, GT=67, LT=68, BANG=69, TILDE=70, QUESTION=71, COLON=72, EQUAL=73, 
		LE=74, GE=75, NOTEQUAL=76, AND=77, OR=78, INC=79, DEC=80, ADD=81, SUB=82, 
		MUL=83, DIV=84, BITAND=85, BITOR=86, CARET=87, MOD=88, ARROW=89, COLONCOLON=90, 
		ADD_ASSIGN=91, SUB_ASSIGN=92, MUL_ASSIGN=93, DIV_ASSIGN=94, AND_ASSIGN=95, 
		OR_ASSIGN=96, XOR_ASSIGN=97, MOD_ASSIGN=98, LSHIFT_ASSIGN=99, RSHIFT_ASSIGN=100, 
		URSHIFT_ASSIGN=101, Identifier=102, Class_Identifier=103, AT=104, ELLIPSIS=105, 
		WS=106, COMMENT=107, BLOCK_COMMENT=108, IDENTIFIER=109, CHAR_LITERAL=110, 
		STRING_LITERAL=111, BOOL_LITERAL=112, NULL_LITERAL=113, DECIMAL_LITERAL=114, 
		HEX_LITERAL=115, OCT_LITERAL=116, BINARY_LITERAL=117, FLOAT_LITERAL=118, 
		HEX_FLOAT_LITERAL=119;
	public static final int
		RULE_compilationUnit = 0, RULE_packageDeclaration = 1, RULE_importDeclaration = 2, 
		RULE_typeDeclaration = 3, RULE_modifier = 4, RULE_classOrInterfaceModifier = 5, 
		RULE_variableModifier = 6, RULE_classDeclaration = 7, RULE_typeParameters = 8, 
		RULE_typeParameter = 9, RULE_typeBound = 10, RULE_enumDeclaration = 11, 
		RULE_enumConstants = 12, RULE_enumConstant = 13, RULE_enumBodyDeclarations = 14, 
		RULE_interfaceDeclaration = 15, RULE_classBody = 16, RULE_interfaceBody = 17, 
		RULE_classBodyDeclaration = 18, RULE_memberDeclaration = 19, RULE_methodDeclaration = 20, 
		RULE_methodBody = 21, RULE_typeTypeOrVoid = 22, RULE_genericMethodDeclaration = 23, 
		RULE_genericConstructorDeclaration = 24, RULE_constructorDeclaration = 25, 
		RULE_fieldDeclaration = 26, RULE_interfaceBodyDeclaration = 27, RULE_interfaceMemberDeclaration = 28, 
		RULE_constDeclaration = 29, RULE_constantDeclarator = 30, RULE_interfaceMethodDeclaration = 31, 
		RULE_interfaceMethodModifier = 32, RULE_genericInterfaceMethodDeclaration = 33, 
		RULE_variableDeclarators = 34, RULE_variableDeclarator = 35, RULE_variableDeclaratorId = 36, 
		RULE_variableInitializer = 37, RULE_arrayInitializer = 38, RULE_classOrInterfaceType = 39, 
		RULE_typeArgument = 40, RULE_qualifiedNameList = 41, RULE_formalParameters = 42, 
		RULE_formalParameterList = 43, RULE_formalParameter = 44, RULE_lastFormalParameter = 45, 
		RULE_qualifiedName = 46, RULE_literal = 47, RULE_integerLiteral = 48, 
		RULE_floatLiteral = 49, RULE_altAnnotationQualifiedName = 50, RULE_annotation = 51, 
		RULE_elementValuePairs = 52, RULE_elementValuePair = 53, RULE_elementValue = 54, 
		RULE_elementValueArrayInitializer = 55, RULE_annotationTypeDeclaration = 56, 
		RULE_annotationTypeBody = 57, RULE_annotationTypeElementDeclaration = 58, 
		RULE_annotationTypeElementRest = 59, RULE_annotationMethodOrConstantRest = 60, 
		RULE_annotationMethodRest = 61, RULE_annotationConstantRest = 62, RULE_defaultValue = 63, 
		RULE_block = 64, RULE_blockStatement = 65, RULE_localVariableDeclaration = 66, 
		RULE_localTypeDeclaration = 67, RULE_statement = 68, RULE_catchClause = 69, 
		RULE_catchType = 70, RULE_finallyBlock = 71, RULE_resourceSpecification = 72, 
		RULE_resources = 73, RULE_resource = 74, RULE_switchBlockStatementGroup = 75, 
		RULE_switchLabel = 76, RULE_forControl = 77, RULE_forInit = 78, RULE_enhancedForControl = 79, 
		RULE_parExpression = 80, RULE_expressionList = 81, RULE_methodCall = 82, 
		RULE_expression = 83, RULE_lambdaExpression = 84, RULE_lambdaParameters = 85, 
		RULE_lambdaBody = 86, RULE_primary = 87, RULE_classType = 88, RULE_creator = 89, 
		RULE_createdName = 90, RULE_innerCreator = 91, RULE_arrayCreatorRest = 92, 
		RULE_classCreatorRest = 93, RULE_explicitGenericInvocation = 94, RULE_typeArgumentsOrDiamond = 95, 
		RULE_nonWildcardTypeArgumentsOrDiamond = 96, RULE_nonWildcardTypeArguments = 97, 
		RULE_typeList = 98, RULE_typeType = 99, RULE_primitiveType = 100, RULE_typeArguments = 101, 
		RULE_superSuffix = 102, RULE_explicitGenericInvocationSuffix = 103, RULE_arguments = 104;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "packageDeclaration", "importDeclaration", "typeDeclaration", 
			"modifier", "classOrInterfaceModifier", "variableModifier", "classDeclaration", 
			"typeParameters", "typeParameter", "typeBound", "enumDeclaration", "enumConstants", 
			"enumConstant", "enumBodyDeclarations", "interfaceDeclaration", "classBody", 
			"interfaceBody", "classBodyDeclaration", "memberDeclaration", "methodDeclaration", 
			"methodBody", "typeTypeOrVoid", "genericMethodDeclaration", "genericConstructorDeclaration", 
			"constructorDeclaration", "fieldDeclaration", "interfaceBodyDeclaration", 
			"interfaceMemberDeclaration", "constDeclaration", "constantDeclarator", 
			"interfaceMethodDeclaration", "interfaceMethodModifier", "genericInterfaceMethodDeclaration", 
			"variableDeclarators", "variableDeclarator", "variableDeclaratorId", 
			"variableInitializer", "arrayInitializer", "classOrInterfaceType", "typeArgument", 
			"qualifiedNameList", "formalParameters", "formalParameterList", "formalParameter", 
			"lastFormalParameter", "qualifiedName", "literal", "integerLiteral", 
			"floatLiteral", "altAnnotationQualifiedName", "annotation", "elementValuePairs", 
			"elementValuePair", "elementValue", "elementValueArrayInitializer", "annotationTypeDeclaration", 
			"annotationTypeBody", "annotationTypeElementDeclaration", "annotationTypeElementRest", 
			"annotationMethodOrConstantRest", "annotationMethodRest", "annotationConstantRest", 
			"defaultValue", "block", "blockStatement", "localVariableDeclaration", 
			"localTypeDeclaration", "statement", "catchClause", "catchType", "finallyBlock", 
			"resourceSpecification", "resources", "resource", "switchBlockStatementGroup", 
			"switchLabel", "forControl", "forInit", "enhancedForControl", "parExpression", 
			"expressionList", "methodCall", "expression", "lambdaExpression", "lambdaParameters", 
			"lambdaBody", "primary", "classType", "creator", "createdName", "innerCreator", 
			"arrayCreatorRest", "classCreatorRest", "explicitGenericInvocation", 
			"typeArgumentsOrDiamond", "nonWildcardTypeArgumentsOrDiamond", "nonWildcardTypeArguments", 
			"typeList", "typeType", "primitiveType", "typeArguments", "superSuffix", 
			"explicitGenericInvocationSuffix", "arguments"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'abstract'", "'assert'", "'boolean'", "'break'", "'byte'", "'case'", 
			"'catch'", "'char'", "'class'", "'const'", "'continue'", "'default'", 
			"'do'", "'double'", "'else'", "'enum'", "'extends'", "'final'", "'finally'", 
			"'float'", "'for'", "'if'", "'goto'", "'implements'", "'import'", "'instanceof'", 
			"'int'", "'interface'", "'long'", "'native'", "'new'", "'package'", "'private'", 
			"'protected'", "'public'", "'return'", "'short'", "'static'", "'strictfp'", 
			"'super'", "'switch'", "'synchronized'", "'this'", "'throw'", "'throws'", 
			"'transient'", "'try'", "'void'", "'volatile'", "'while'", null, null, 
			null, null, null, "'null'", "'('", "')'", "'{'", "'}'", "'['", "']'", 
			"';'", "','", "'.'", "'='", "'>'", "'<'", "'!'", "'~'", "'?'", "':'", 
			"'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", "'--'", "'+'", 
			"'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'->'", "'::'", "'+='", 
			"'-='", "'*='", "'/='", "'&='", "'|='", "'^='", "'%='", "'<<='", "'>>='", 
			"'>>>='", null, null, "'@'", "'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH", 
			"CHAR", "CLASS", "CONST", "CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE", 
			"ENUM", "EXTENDS", "FINAL", "FINALLY", "FLOAT", "FOR", "IF", "GOTO", 
			"IMPLEMENTS", "IMPORT", "INSTANCEOF", "INT", "INTERFACE", "LONG", "NATIVE", 
			"NEW", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "SHORT", 
			"STATIC", "STRICTFP", "SUPER", "SWITCH", "SYNCHRONIZED", "THIS", "THROW", 
			"THROWS", "TRANSIENT", "TRY", "VOID", "VOLATILE", "WHILE", "IntegerLiteral", 
			"FloatingPointLiteral", "BooleanLiteral", "CharacterLiteral", "StringLiteral", 
			"NullLiteral", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", 
			"SEMI", "COMMA", "DOT", "ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", 
			"COLON", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", 
			"ADD", "SUB", "MUL", "DIV", "BITAND", "BITOR", "CARET", "MOD", "ARROW", 
			"COLONCOLON", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", 
			"AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", 
			"RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "Identifier", "Class_Identifier", 
			"AT", "ELLIPSIS", "WS", "COMMENT", "BLOCK_COMMENT", "IDENTIFIER", "CHAR_LITERAL", 
			"STRING_LITERAL", "BOOL_LITERAL", "NULL_LITERAL", "DECIMAL_LITERAL", 
			"HEX_LITERAL", "OCT_LITERAL", "BINARY_LITERAL", "FLOAT_LITERAL", "HEX_FLOAT_LITERAL"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Parser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CompilationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(Parser.EOF, 0); }
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(210);
				packageDeclaration();
				}
				break;
			}
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(213);
				importDeclaration();
				}
				}
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << CLASS) | (1L << ENUM) | (1L << FINAL) | (1L << INTERFACE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << SEMI))) != 0) || _la==AT || _la==IDENTIFIER) {
				{
				{
				setState(219);
				typeDeclaration();
				}
				}
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(225);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageDeclarationContext extends ParserRuleContext {
		public TerminalNode PACKAGE() { return getToken(Parser.PACKAGE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Parser.SEMI, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitPackageDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_packageDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT || _la==IDENTIFIER) {
				{
				{
				setState(227);
				annotation();
				}
				}
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(233);
			match(PACKAGE);
			setState(234);
			qualifiedName();
			setState(235);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportDeclarationContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(Parser.IMPORT, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Parser.SEMI, 0); }
		public TerminalNode STATIC() { return getToken(Parser.STATIC, 0); }
		public TerminalNode DOT() { return getToken(Parser.DOT, 0); }
		public TerminalNode MUL() { return getToken(Parser.MUL, 0); }
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitImportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(IMPORT);
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(238);
				match(STATIC);
				}
			}

			setState(241);
			qualifiedName();
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(242);
				match(DOT);
				setState(243);
				match(MUL);
				}
			}

			setState(246);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public List<ClassOrInterfaceModifierContext> classOrInterfaceModifier() {
			return getRuleContexts(ClassOrInterfaceModifierContext.class);
		}
		public ClassOrInterfaceModifierContext classOrInterfaceModifier(int i) {
			return getRuleContext(ClassOrInterfaceModifierContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(Parser.SEMI, 0); }
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_typeDeclaration);
		try {
			int _alt;
			setState(261);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case CLASS:
			case ENUM:
			case FINAL:
			case INTERFACE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case STRICTFP:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(248);
						classOrInterfaceModifier();
						}
						} 
					}
					setState(253);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				setState(258);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CLASS:
					{
					setState(254);
					classDeclaration();
					}
					break;
				case ENUM:
					{
					setState(255);
					enumDeclaration();
					}
					break;
				case INTERFACE:
					{
					setState(256);
					interfaceDeclaration();
					}
					break;
				case AT:
					{
					setState(257);
					annotationTypeDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModifierContext extends ParserRuleContext {
		public ClassOrInterfaceModifierContext classOrInterfaceModifier() {
			return getRuleContext(ClassOrInterfaceModifierContext.class,0);
		}
		public TerminalNode NATIVE() { return getToken(Parser.NATIVE, 0); }
		public TerminalNode SYNCHRONIZED() { return getToken(Parser.SYNCHRONIZED, 0); }
		public TerminalNode TRANSIENT() { return getToken(Parser.TRANSIENT, 0); }
		public TerminalNode VOLATILE() { return getToken(Parser.VOLATILE, 0); }
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_modifier);
		try {
			setState(268);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case FINAL:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case STRICTFP:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(263);
				classOrInterfaceModifier();
				}
				break;
			case NATIVE:
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				match(NATIVE);
				}
				break;
			case SYNCHRONIZED:
				enterOuterAlt(_localctx, 3);
				{
				setState(265);
				match(SYNCHRONIZED);
				}
				break;
			case TRANSIENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(266);
				match(TRANSIENT);
				}
				break;
			case VOLATILE:
				enterOuterAlt(_localctx, 5);
				{
				setState(267);
				match(VOLATILE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOrInterfaceModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(Parser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(Parser.PROTECTED, 0); }
		public TerminalNode PRIVATE() { return getToken(Parser.PRIVATE, 0); }
		public TerminalNode STATIC() { return getToken(Parser.STATIC, 0); }
		public TerminalNode ABSTRACT() { return getToken(Parser.ABSTRACT, 0); }
		public TerminalNode FINAL() { return getToken(Parser.FINAL, 0); }
		public TerminalNode STRICTFP() { return getToken(Parser.STRICTFP, 0); }
		public ClassOrInterfaceModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceModifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitClassOrInterfaceModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassOrInterfaceModifierContext classOrInterfaceModifier() throws RecognitionException {
		ClassOrInterfaceModifierContext _localctx = new ClassOrInterfaceModifierContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_classOrInterfaceModifier);
		try {
			setState(278);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(271);
				match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(272);
				match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(273);
				match(PRIVATE);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(274);
				match(STATIC);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 6);
				{
				setState(275);
				match(ABSTRACT);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(276);
				match(FINAL);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 8);
				{
				setState(277);
				match(STRICTFP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableModifierContext extends ParserRuleContext {
		public TerminalNode FINAL() { return getToken(Parser.FINAL, 0); }
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public VariableModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitVariableModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableModifierContext variableModifier() throws RecognitionException {
		VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variableModifier);
		try {
			setState(282);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FINAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(280);
				match(FINAL);
				}
				break;
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(281);
				annotation();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(Parser.CLASS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(Parser.IDENTIFIER, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(Parser.EXTENDS, 0); }
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode IMPLEMENTS() { return getToken(Parser.IMPLEMENTS, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(CLASS);
			setState(285);
			match(IDENTIFIER);
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(286);
				typeParameters();
				}
			}

			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(289);
				match(EXTENDS);
				setState(290);
				typeType();
				}
			}

			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(293);
				match(IMPLEMENTS);
				setState(294);
				typeList();
				}
			}

			setState(297);
			classBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParametersContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(Parser.LT, 0); }
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public TerminalNode GT() { return getToken(Parser.GT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parser.COMMA, i);
		}
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitTypeParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_typeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(LT);
			setState(300);
			typeParameter();
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(301);
				match(COMMA);
				setState(302);
				typeParameter();
				}
				}
				setState(307);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(308);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(Parser.IDENTIFIER, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode EXTENDS() { return getToken(Parser.EXTENDS, 0); }
		public TypeBoundContext typeBound() {
			return getRuleContext(TypeBoundContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitTypeParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_typeParameter);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(310);
					annotation();
					}
					} 
				}
				setState(315);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(316);
			match(IDENTIFIER);
			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(317);
				match(EXTENDS);
				setState(318);
				typeBound();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeBoundContext extends ParserRuleContext {
		public List<TypeTypeContext> typeType() {
			return getRuleContexts(TypeTypeContext.class);
		}
		public TypeTypeContext typeType(int i) {
			return getRuleContext(TypeTypeContext.class,i);
		}
		public List<TerminalNode> BITAND() { return getTokens(Parser.BITAND); }
		public TerminalNode BITAND(int i) {
			return getToken(Parser.BITAND, i);
		}
		public TypeBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBound; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitTypeBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeBoundContext typeBound() throws RecognitionException {
		TypeBoundContext _localctx = new TypeBoundContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_typeBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			typeType();
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITAND) {
				{
				{
				setState(322);
				match(BITAND);
				setState(323);
				typeType();
				}
				}
				setState(328);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumDeclarationContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(Parser.ENUM, 0); }
		public TerminalNode IDENTIFIER() { return getToken(Parser.IDENTIFIER, 0); }
		public TerminalNode LBRACE() { return getToken(Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(Parser.RBRACE, 0); }
		public TerminalNode IMPLEMENTS() { return getToken(Parser.IMPLEMENTS, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public EnumConstantsContext enumConstants() {
			return getRuleContext(EnumConstantsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(Parser.COMMA, 0); }
		public EnumBodyDeclarationsContext enumBodyDeclarations() {
			return getRuleContext(EnumBodyDeclarationsContext.class,0);
		}
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitEnumDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(ENUM);
			setState(330);
			match(IDENTIFIER);
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(331);
				match(IMPLEMENTS);
				setState(332);
				typeList();
				}
			}

			setState(335);
			match(LBRACE);
			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT || _la==IDENTIFIER) {
				{
				setState(336);
				enumConstants();
				}
			}

			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(339);
				match(COMMA);
				}
			}

			setState(343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(342);
				enumBodyDeclarations();
				}
			}

			setState(345);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantsContext extends ParserRuleContext {
		public List<EnumConstantContext> enumConstant() {
			return getRuleContexts(EnumConstantContext.class);
		}
		public EnumConstantContext enumConstant(int i) {
			return getRuleContext(EnumConstantContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parser.COMMA, i);
		}
		public EnumConstantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstants; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitEnumConstants(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantsContext enumConstants() throws RecognitionException {
		EnumConstantsContext _localctx = new EnumConstantsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_enumConstants);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			enumConstant();
			setState(352);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(348);
					match(COMMA);
					setState(349);
					enumConstant();
					}
					} 
				}
				setState(354);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(Parser.IDENTIFIER, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public EnumConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitEnumConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantContext enumConstant() throws RecognitionException {
		EnumConstantContext _localctx = new EnumConstantContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_enumConstant);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(355);
					annotation();
					}
					} 
				}
				setState(360);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			setState(361);
			match(IDENTIFIER);
			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(362);
				arguments();
				}
			}

			setState(366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(365);
				classBody();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumBodyDeclarationsContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(Parser.SEMI, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public EnumBodyDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBodyDeclarations; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitEnumBodyDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumBodyDeclarationsContext enumBodyDeclarations() throws RecognitionException {
		EnumBodyDeclarationsContext _localctx = new EnumBodyDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_enumBodyDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(SEMI);
			setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (AT - 68)) | (1L << (IDENTIFIER - 68)))) != 0)) {
				{
				{
				setState(369);
				classBodyDeclaration();
				}
				}
				setState(374);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(Parser.INTERFACE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(Parser.IDENTIFIER, 0); }
		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(Parser.EXTENDS, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitInterfaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			match(INTERFACE);
			setState(376);
			match(IDENTIFIER);
			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(377);
				typeParameters();
				}
			}

			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(380);
				match(EXTENDS);
				setState(381);
				typeList();
				}
			}

			setState(384);
			interfaceBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(Parser.RBRACE, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			match(LBRACE);
			setState(390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (AT - 68)) | (1L << (IDENTIFIER - 68)))) != 0)) {
				{
				{
				setState(387);
				classBodyDeclaration();
				}
				}
				setState(392);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(393);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(Parser.RBRACE, 0); }
		public List<InterfaceBodyDeclarationContext> interfaceBodyDeclaration() {
			return getRuleContexts(InterfaceBodyDeclarationContext.class);
		}
		public InterfaceBodyDeclarationContext interfaceBodyDeclaration(int i) {
			return getRuleContext(InterfaceBodyDeclarationContext.class,i);
		}
		public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitInterfaceBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			match(LBRACE);
			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DEFAULT) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << SEMI))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (AT - 68)) | (1L << (IDENTIFIER - 68)))) != 0)) {
				{
				{
				setState(396);
				interfaceBodyDeclaration();
				}
				}
				setState(401);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(402);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(Parser.SEMI, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode STATIC() { return getToken(Parser.STATIC, 0); }
		public MemberDeclarationContext memberDeclaration() {
			return getRuleContext(MemberDeclarationContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitClassBodyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_classBodyDeclaration);
		int _la;
		try {
			int _alt;
			setState(416);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(404);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(406);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(405);
					match(STATIC);
					}
				}

				setState(408);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(412);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(409);
						modifier();
						}
						} 
					}
					setState(414);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				}
				setState(415);
				memberDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberDeclarationContext extends ParserRuleContext {
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public GenericMethodDeclarationContext genericMethodDeclaration() {
			return getRuleContext(GenericMethodDeclarationContext.class,0);
		}
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public GenericConstructorDeclarationContext genericConstructorDeclaration() {
			return getRuleContext(GenericConstructorDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public MemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberDeclarationContext memberDeclaration() throws RecognitionException {
		MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_memberDeclaration);
		try {
			setState(427);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(418);
				methodDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(419);
				genericMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(420);
				fieldDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(421);
				constructorDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(422);
				genericConstructorDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(423);
				interfaceDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(424);
				annotationTypeDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(425);
				classDeclaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(426);
				enumDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclarationContext extends ParserRuleContext {
		public TypeTypeOrVoidContext typeTypeOrVoid() {
			return getRuleContext(TypeTypeOrVoidContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(Parser.IDENTIFIER, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(Parser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(Parser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(Parser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(Parser.RBRACK, i);
		}
		public TerminalNode THROWS() { return getToken(Parser.THROWS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			typeTypeOrVoid();
			setState(430);
			match(IDENTIFIER);
			setState(431);
			formalParameters();
			setState(436);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(432);
				match(LBRACK);
				setState(433);
				match(RBRACK);
				}
				}
				setState(438);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(439);
				match(THROWS);
				setState(440);
				qualifiedNameList();
				}
			}

			setState(443);
			methodBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Parser.SEMI, 0); }
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_methodBody);
		try {
			setState(447);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(445);
				block();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(446);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeTypeOrVoidContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(Parser.VOID, 0); }
		public TypeTypeOrVoidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeTypeOrVoid; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitTypeTypeOrVoid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeTypeOrVoidContext typeTypeOrVoid() throws RecognitionException {
		TypeTypeOrVoidContext _localctx = new TypeTypeOrVoidContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_typeTypeOrVoid);
		try {
			setState(451);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(449);
				typeType();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(450);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericMethodDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public GenericMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericMethodDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitGenericMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericMethodDeclarationContext genericMethodDeclaration() throws RecognitionException {
		GenericMethodDeclarationContext _localctx = new GenericMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_genericMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			typeParameters();
			setState(454);
			methodDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericConstructorDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public GenericConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericConstructorDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitGenericConstructorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericConstructorDeclarationContext genericConstructorDeclaration() throws RecognitionException {
		GenericConstructorDeclarationContext _localctx = new GenericConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_genericConstructorDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			typeParameters();
			setState(457);
			constructorDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public BlockContext constructorBody;
		public TerminalNode IDENTIFIER() { return getToken(Parser.IDENTIFIER, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode THROWS() { return getToken(Parser.THROWS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitConstructorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			match(IDENTIFIER);
			setState(460);
			formalParameters();
			setState(463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(461);
				match(THROWS);
				setState(462);
				qualifiedNameList();
				}
			}

			setState(465);
			((ConstructorDeclarationContext)_localctx).constructorBody = block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldDeclarationContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Parser.SEMI, 0); }
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitFieldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			typeType();
			setState(468);
			variableDeclarators();
			setState(469);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceBodyDeclarationContext extends ParserRuleContext {
		public InterfaceMemberDeclarationContext interfaceMemberDeclaration() {
			return getRuleContext(InterfaceMemberDeclarationContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(Parser.SEMI, 0); }
		public InterfaceBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBodyDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitInterfaceBodyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceBodyDeclarationContext interfaceBodyDeclaration() throws RecognitionException {
		InterfaceBodyDeclarationContext _localctx = new InterfaceBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_interfaceBodyDeclaration);
		try {
			int _alt;
			setState(479);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case CLASS:
			case DEFAULT:
			case DOUBLE:
			case ENUM:
			case FINAL:
			case FLOAT:
			case INT:
			case INTERFACE:
			case LONG:
			case NATIVE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case SHORT:
			case STATIC:
			case STRICTFP:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VOID:
			case VOLATILE:
			case LT:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(474);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(471);
						modifier();
						}
						} 
					}
					setState(476);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
				}
				setState(477);
				interfaceMemberDeclaration();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(478);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMemberDeclarationContext extends ParserRuleContext {
		public ConstDeclarationContext constDeclaration() {
			return getRuleContext(ConstDeclarationContext.class,0);
		}
		public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
			return getRuleContext(InterfaceMethodDeclarationContext.class,0);
		}
		public GenericInterfaceMethodDeclarationContext genericInterfaceMethodDeclaration() {
			return getRuleContext(GenericInterfaceMethodDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public InterfaceMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMemberDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitInterfaceMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMemberDeclarationContext interfaceMemberDeclaration() throws RecognitionException {
		InterfaceMemberDeclarationContext _localctx = new InterfaceMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_interfaceMemberDeclaration);
		try {
			setState(488);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(481);
				constDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(482);
				interfaceMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(483);
				genericInterfaceMethodDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(484);
				interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(485);
				annotationTypeDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(486);
				classDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(487);
				enumDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstDeclarationContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public List<ConstantDeclaratorContext> constantDeclarator() {
			return getRuleContexts(ConstantDeclaratorContext.class);
		}
		public ConstantDeclaratorContext constantDeclarator(int i) {
			return getRuleContext(ConstantDeclaratorContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(Parser.SEMI, 0); }
		public List<TerminalNode> COMMA() { return getTokens(Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parser.COMMA, i);
		}
		public ConstDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitConstDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstDeclarationContext constDeclaration() throws RecognitionException {
		ConstDeclarationContext _localctx = new ConstDeclarationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_constDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			typeType();
			setState(491);
			constantDeclarator();
			setState(496);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(492);
				match(COMMA);
				setState(493);
				constantDeclarator();
				}
				}
				setState(498);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(499);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantDeclaratorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(Parser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(Parser.ASSIGN, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(Parser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(Parser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(Parser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(Parser.RBRACK, i);
		}
		public ConstantDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclarator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitConstantDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantDeclaratorContext constantDeclarator() throws RecognitionException {
		ConstantDeclaratorContext _localctx = new ConstantDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_constantDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			match(IDENTIFIER);
			setState(506);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(502);
				match(LBRACK);
				setState(503);
				match(RBRACK);
				}
				}
				setState(508);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(509);
			match(ASSIGN);
			setState(510);
			variableInitializer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMethodDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(Parser.IDENTIFIER, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public TypeTypeOrVoidContext typeTypeOrVoid() {
			return getRuleContext(TypeTypeOrVoidContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public List<InterfaceMethodModifierContext> interfaceMethodModifier() {
			return getRuleContexts(InterfaceMethodModifierContext.class);
		}
		public InterfaceMethodModifierContext interfaceMethodModifier(int i) {
			return getRuleContext(InterfaceMethodModifierContext.class,i);
		}
		public List<TerminalNode> LBRACK() { return getTokens(Parser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(Parser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(Parser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(Parser.RBRACK, i);
		}
		public TerminalNode THROWS() { return getToken(Parser.THROWS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public InterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitInterfaceMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMethodDeclarationContext interfaceMethodDeclaration() throws RecognitionException {
		InterfaceMethodDeclarationContext _localctx = new InterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_interfaceMethodDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(512);
					interfaceMethodModifier();
					}
					} 
				}
				setState(517);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			}
			setState(528);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case VOID:
			case AT:
			case IDENTIFIER:
				{
				setState(518);
				typeTypeOrVoid();
				}
				break;
			case LT:
				{
				setState(519);
				typeParameters();
				setState(523);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(520);
						annotation();
						}
						} 
					}
					setState(525);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
				}
				setState(526);
				typeTypeOrVoid();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(530);
			match(IDENTIFIER);
			setState(531);
			formalParameters();
			setState(536);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(532);
				match(LBRACK);
				setState(533);
				match(RBRACK);
				}
				}
				setState(538);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(541);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(539);
				match(THROWS);
				setState(540);
				qualifiedNameList();
				}
			}

			setState(543);
			methodBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMethodModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(Parser.PUBLIC, 0); }
		public TerminalNode ABSTRACT() { return getToken(Parser.ABSTRACT, 0); }
		public TerminalNode DEFAULT() { return getToken(Parser.DEFAULT, 0); }
		public TerminalNode STATIC() { return getToken(Parser.STATIC, 0); }
		public TerminalNode STRICTFP() { return getToken(Parser.STRICTFP, 0); }
		public InterfaceMethodModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodModifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitInterfaceMethodModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMethodModifierContext interfaceMethodModifier() throws RecognitionException {
		InterfaceMethodModifierContext _localctx = new InterfaceMethodModifierContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_interfaceMethodModifier);
		try {
			setState(551);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(545);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(546);
				match(PUBLIC);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 3);
				{
				setState(547);
				match(ABSTRACT);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 4);
				{
				setState(548);
				match(DEFAULT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(549);
				match(STATIC);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 6);
				{
				setState(550);
				match(STRICTFP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericInterfaceMethodDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
			return getRuleContext(InterfaceMethodDeclarationContext.class,0);
		}
		public GenericInterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericInterfaceMethodDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitGenericInterfaceMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericInterfaceMethodDeclarationContext genericInterfaceMethodDeclaration() throws RecognitionException {
		GenericInterfaceMethodDeclarationContext _localctx = new GenericInterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_genericInterfaceMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(553);
			typeParameters();
			setState(554);
			interfaceMethodDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorsContext extends ParserRuleContext {
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parser.COMMA, i);
		}
		public VariableDeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarators; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitVariableDeclarators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
		VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(556);
			variableDeclarator();
			setState(561);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(557);
				match(COMMA);
				setState(558);
				variableDeclarator();
				}
				}
				setState(563);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(Parser.ASSIGN, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitVariableDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(564);
			variableDeclaratorId();
			setState(567);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(565);
				match(ASSIGN);
				setState(566);
				variableInitializer();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(Parser.IDENTIFIER, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(Parser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(Parser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(Parser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(Parser.RBRACK, i);
		}
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitVariableDeclaratorId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
			match(IDENTIFIER);
			setState(574);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(570);
				match(LBRACK);
				setState(571);
				match(RBRACK);
				}
				}
				setState(576);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableInitializerContext extends ParserRuleContext {
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitVariableInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_variableInitializer);
		try {
			setState(579);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(577);
				arrayInitializer();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case AT:
			case IDENTIFIER:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case BOOL_LITERAL:
			case NULL_LITERAL:
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(578);
				expression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayInitializerContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(Parser.RBRACE, 0); }
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parser.COMMA, i);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
			match(LBRACE);
			setState(593);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (AT - 68)) | (1L << (IDENTIFIER - 68)) | (1L << (CHAR_LITERAL - 68)) | (1L << (STRING_LITERAL - 68)) | (1L << (BOOL_LITERAL - 68)) | (1L << (NULL_LITERAL - 68)) | (1L << (DECIMAL_LITERAL - 68)) | (1L << (HEX_LITERAL - 68)) | (1L << (OCT_LITERAL - 68)) | (1L << (BINARY_LITERAL - 68)) | (1L << (FLOAT_LITERAL - 68)) | (1L << (HEX_FLOAT_LITERAL - 68)))) != 0)) {
				{
				setState(582);
				variableInitializer();
				setState(587);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(583);
						match(COMMA);
						setState(584);
						variableInitializer();
						}
						} 
					}
					setState(589);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				}
				setState(591);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(590);
					match(COMMA);
					}
				}

				}
			}

			setState(595);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOrInterfaceTypeContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(Parser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(Parser.IDENTIFIER, i);
		}
		public List<TypeArgumentsContext> typeArguments() {
			return getRuleContexts(TypeArgumentsContext.class);
		}
		public TypeArgumentsContext typeArguments(int i) {
			return getRuleContext(TypeArgumentsContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(Parser.DOT, i);
		}
		public ClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassOrInterfaceTypeContext classOrInterfaceType() throws RecognitionException {
		ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_classOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(597);
			match(IDENTIFIER);
			setState(599);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(598);
				typeArguments();
				}
				break;
			}
			setState(608);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(601);
					match(DOT);
					setState(602);
					match(IDENTIFIER);
					setState(604);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
					case 1:
						{
						setState(603);
						typeArguments();
						}
						break;
					}
					}
					} 
				}
				setState(610);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(Parser.QUESTION, 0); }
		public TerminalNode EXTENDS() { return getToken(Parser.EXTENDS, 0); }
		public TerminalNode SUPER() { return getToken(Parser.SUPER, 0); }
		public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgument; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitTypeArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentContext typeArgument() throws RecognitionException {
		TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_typeArgument);
		int _la;
		try {
			setState(617);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(611);
				typeType();
				}
				break;
			case QUESTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(612);
				match(QUESTION);
				setState(615);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXTENDS || _la==SUPER) {
					{
					setState(613);
					_la = _input.LA(1);
					if ( !(_la==EXTENDS || _la==SUPER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(614);
					typeType();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameListContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parser.COMMA, i);
		}
		public QualifiedNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedNameList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitQualifiedNameList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameListContext qualifiedNameList() throws RecognitionException {
		QualifiedNameListContext _localctx = new QualifiedNameListContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_qualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(619);
			qualifiedName();
			setState(624);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(620);
				match(COMMA);
				setState(621);
				qualifiedName();
				}
				}
				setState(626);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParametersContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Parser.RPAREN, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitFormalParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(627);
			match(LPAREN);
			setState(629);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==AT || _la==IDENTIFIER) {
				{
				setState(628);
				formalParameterList();
				}
			}

			setState(631);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterListContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parser.COMMA, i);
		}
		public LastFormalParameterContext lastFormalParameter() {
			return getRuleContext(LastFormalParameterContext.class,0);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitFormalParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_formalParameterList);
		int _la;
		try {
			int _alt;
			setState(646);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(633);
				formalParameter();
				setState(638);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(634);
						match(COMMA);
						setState(635);
						formalParameter();
						}
						} 
					}
					setState(640);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
				}
				setState(643);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(641);
					match(COMMA);
					setState(642);
					lastFormalParameter();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(645);
				lastFormalParameter();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_formalParameter);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(651);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(648);
					variableModifier();
					}
					} 
				}
				setState(653);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			}
			setState(654);
			typeType();
			setState(655);
			variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LastFormalParameterContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode ELLIPSIS() { return getToken(Parser.ELLIPSIS, 0); }
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public LastFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastFormalParameter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitLastFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LastFormalParameterContext lastFormalParameter() throws RecognitionException {
		LastFormalParameterContext _localctx = new LastFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_lastFormalParameter);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(660);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(657);
					variableModifier();
					}
					} 
				}
				setState(662);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			}
			setState(663);
			typeType();
			setState(664);
			match(ELLIPSIS);
			setState(665);
			variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(Parser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(Parser.IDENTIFIER, i);
		}
		public List<TerminalNode> DOT() { return getTokens(Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(Parser.DOT, i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(667);
			match(IDENTIFIER);
			setState(672);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(668);
					match(DOT);
					setState(669);
					match(IDENTIFIER);
					}
					} 
				}
				setState(674);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public FloatLiteralContext floatLiteral() {
			return getRuleContext(FloatLiteralContext.class,0);
		}
		public TerminalNode CHAR_LITERAL() { return getToken(Parser.CHAR_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(Parser.STRING_LITERAL, 0); }
		public TerminalNode BOOL_LITERAL() { return getToken(Parser.BOOL_LITERAL, 0); }
		public TerminalNode NULL_LITERAL() { return getToken(Parser.NULL_LITERAL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_literal);
		try {
			setState(681);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(675);
				integerLiteral();
				}
				break;
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(676);
				floatLiteral();
				}
				break;
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(677);
				match(CHAR_LITERAL);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(678);
				match(STRING_LITERAL);
				}
				break;
			case BOOL_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(679);
				match(BOOL_LITERAL);
				}
				break;
			case NULL_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(680);
				match(NULL_LITERAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerLiteralContext extends ParserRuleContext {
		public TerminalNode DECIMAL_LITERAL() { return getToken(Parser.DECIMAL_LITERAL, 0); }
		public TerminalNode HEX_LITERAL() { return getToken(Parser.HEX_LITERAL, 0); }
		public TerminalNode OCT_LITERAL() { return getToken(Parser.OCT_LITERAL, 0); }
		public TerminalNode BINARY_LITERAL() { return getToken(Parser.BINARY_LITERAL, 0); }
		public IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_integerLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(683);
			_la = _input.LA(1);
			if ( !(((((_la - 114)) & ~0x3f) == 0 && ((1L << (_la - 114)) & ((1L << (DECIMAL_LITERAL - 114)) | (1L << (HEX_LITERAL - 114)) | (1L << (OCT_LITERAL - 114)) | (1L << (BINARY_LITERAL - 114)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FloatLiteralContext extends ParserRuleContext {
		public TerminalNode FLOAT_LITERAL() { return getToken(Parser.FLOAT_LITERAL, 0); }
		public TerminalNode HEX_FLOAT_LITERAL() { return getToken(Parser.HEX_FLOAT_LITERAL, 0); }
		public FloatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitFloatLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatLiteralContext floatLiteral() throws RecognitionException {
		FloatLiteralContext _localctx = new FloatLiteralContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_floatLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(685);
			_la = _input.LA(1);
			if ( !(_la==FLOAT_LITERAL || _la==HEX_FLOAT_LITERAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AltAnnotationQualifiedNameContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(Parser.AT, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(Parser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(Parser.IDENTIFIER, i);
		}
		public List<TerminalNode> DOT() { return getTokens(Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(Parser.DOT, i);
		}
		public AltAnnotationQualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_altAnnotationQualifiedName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitAltAnnotationQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AltAnnotationQualifiedNameContext altAnnotationQualifiedName() throws RecognitionException {
		AltAnnotationQualifiedNameContext _localctx = new AltAnnotationQualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_altAnnotationQualifiedName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(691);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(687);
				match(IDENTIFIER);
				setState(688);
				match(DOT);
				}
				}
				setState(693);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(694);
			match(AT);
			setState(695);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(Parser.AT, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public AltAnnotationQualifiedNameContext altAnnotationQualifiedName() {
			return getRuleContext(AltAnnotationQualifiedNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Parser.RPAREN, 0); }
		public ElementValuePairsContext elementValuePairs() {
			return getRuleContext(ElementValuePairsContext.class,0);
		}
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(700);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(697);
				match(AT);
				setState(698);
				qualifiedName();
				}
				break;
			case 2:
				{
				setState(699);
				altAnnotationQualifiedName();
				}
				break;
			}
			setState(708);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(702);
				match(LPAREN);
				setState(705);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
				case 1:
					{
					setState(703);
					elementValuePairs();
					}
					break;
				case 2:
					{
					setState(704);
					elementValue();
					}
					break;
				}
				setState(707);
				match(RPAREN);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuePairsContext extends ParserRuleContext {
		public List<ElementValuePairContext> elementValuePair() {
			return getRuleContexts(ElementValuePairContext.class);
		}
		public ElementValuePairContext elementValuePair(int i) {
			return getRuleContext(ElementValuePairContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parser.COMMA, i);
		}
		public ElementValuePairsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePairs; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitElementValuePairs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValuePairsContext elementValuePairs() throws RecognitionException {
		ElementValuePairsContext _localctx = new ElementValuePairsContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_elementValuePairs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(710);
			elementValuePair();
			setState(715);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(711);
				match(COMMA);
				setState(712);
				elementValuePair();
				}
				}
				setState(717);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuePairContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(Parser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(Parser.ASSIGN, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public ElementValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePair; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitElementValuePair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValuePairContext elementValuePair() throws RecognitionException {
		ElementValuePairContext _localctx = new ElementValuePairContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(718);
			match(IDENTIFIER);
			setState(719);
			match(ASSIGN);
			setState(720);
			elementValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ElementValueArrayInitializerContext elementValueArrayInitializer() {
			return getRuleContext(ElementValueArrayInitializerContext.class,0);
		}
		public ElementValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitElementValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueContext elementValue() throws RecognitionException {
		ElementValueContext _localctx = new ElementValueContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_elementValue);
		try {
			setState(725);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(722);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(723);
				annotation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(724);
				elementValueArrayInitializer();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueArrayInitializerContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(Parser.RBRACE, 0); }
		public List<ElementValueContext> elementValue() {
			return getRuleContexts(ElementValueContext.class);
		}
		public ElementValueContext elementValue(int i) {
			return getRuleContext(ElementValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parser.COMMA, i);
		}
		public ElementValueArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueArrayInitializer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitElementValueArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueArrayInitializerContext elementValueArrayInitializer() throws RecognitionException {
		ElementValueArrayInitializerContext _localctx = new ElementValueArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_elementValueArrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(727);
			match(LBRACE);
			setState(736);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (AT - 68)) | (1L << (IDENTIFIER - 68)) | (1L << (CHAR_LITERAL - 68)) | (1L << (STRING_LITERAL - 68)) | (1L << (BOOL_LITERAL - 68)) | (1L << (NULL_LITERAL - 68)) | (1L << (DECIMAL_LITERAL - 68)) | (1L << (HEX_LITERAL - 68)) | (1L << (OCT_LITERAL - 68)) | (1L << (BINARY_LITERAL - 68)) | (1L << (FLOAT_LITERAL - 68)) | (1L << (HEX_FLOAT_LITERAL - 68)))) != 0)) {
				{
				setState(728);
				elementValue();
				setState(733);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(729);
						match(COMMA);
						setState(730);
						elementValue();
						}
						} 
					}
					setState(735);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
				}
				}
			}

			setState(739);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(738);
				match(COMMA);
				}
			}

			setState(741);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeDeclarationContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(Parser.AT, 0); }
		public TerminalNode INTERFACE() { return getToken(Parser.INTERFACE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(Parser.IDENTIFIER, 0); }
		public AnnotationTypeBodyContext annotationTypeBody() {
			return getRuleContext(AnnotationTypeBodyContext.class,0);
		}
		public AnnotationTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitAnnotationTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeDeclarationContext annotationTypeDeclaration() throws RecognitionException {
		AnnotationTypeDeclarationContext _localctx = new AnnotationTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_annotationTypeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(743);
			match(AT);
			setState(744);
			match(INTERFACE);
			setState(745);
			match(IDENTIFIER);
			setState(746);
			annotationTypeBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(Parser.RBRACE, 0); }
		public List<AnnotationTypeElementDeclarationContext> annotationTypeElementDeclaration() {
			return getRuleContexts(AnnotationTypeElementDeclarationContext.class);
		}
		public AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration(int i) {
			return getRuleContext(AnnotationTypeElementDeclarationContext.class,i);
		}
		public AnnotationTypeBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitAnnotationTypeBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeBodyContext annotationTypeBody() throws RecognitionException {
		AnnotationTypeBodyContext _localctx = new AnnotationTypeBodyContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_annotationTypeBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(748);
			match(LBRACE);
			setState(752);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE) | (1L << SEMI))) != 0) || _la==AT || _la==IDENTIFIER) {
				{
				{
				setState(749);
				annotationTypeElementDeclaration();
				}
				}
				setState(754);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(755);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeElementDeclarationContext extends ParserRuleContext {
		public AnnotationTypeElementRestContext annotationTypeElementRest() {
			return getRuleContext(AnnotationTypeElementRestContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(Parser.SEMI, 0); }
		public AnnotationTypeElementDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitAnnotationTypeElementDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration() throws RecognitionException {
		AnnotationTypeElementDeclarationContext _localctx = new AnnotationTypeElementDeclarationContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_annotationTypeElementDeclaration);
		try {
			int _alt;
			setState(765);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case CLASS:
			case DOUBLE:
			case ENUM:
			case FINAL:
			case FLOAT:
			case INT:
			case INTERFACE:
			case LONG:
			case NATIVE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case SHORT:
			case STATIC:
			case STRICTFP:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VOLATILE:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(760);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(757);
						modifier();
						}
						} 
					}
					setState(762);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
				}
				setState(763);
				annotationTypeElementRest();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(764);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeElementRestContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public AnnotationMethodOrConstantRestContext annotationMethodOrConstantRest() {
			return getRuleContext(AnnotationMethodOrConstantRestContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Parser.SEMI, 0); }
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public AnnotationTypeElementRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementRest; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitAnnotationTypeElementRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeElementRestContext annotationTypeElementRest() throws RecognitionException {
		AnnotationTypeElementRestContext _localctx = new AnnotationTypeElementRestContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_annotationTypeElementRest);
		try {
			setState(787);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(767);
				typeType();
				setState(768);
				annotationMethodOrConstantRest();
				setState(769);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(771);
				classDeclaration();
				setState(773);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
				case 1:
					{
					setState(772);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(775);
				interfaceDeclaration();
				setState(777);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
				case 1:
					{
					setState(776);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(779);
				enumDeclaration();
				setState(781);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
				case 1:
					{
					setState(780);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(783);
				annotationTypeDeclaration();
				setState(785);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
				case 1:
					{
					setState(784);
					match(SEMI);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationMethodOrConstantRestContext extends ParserRuleContext {
		public AnnotationMethodRestContext annotationMethodRest() {
			return getRuleContext(AnnotationMethodRestContext.class,0);
		}
		public AnnotationConstantRestContext annotationConstantRest() {
			return getRuleContext(AnnotationConstantRestContext.class,0);
		}
		public AnnotationMethodOrConstantRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationMethodOrConstantRest; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitAnnotationMethodOrConstantRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationMethodOrConstantRestContext annotationMethodOrConstantRest() throws RecognitionException {
		AnnotationMethodOrConstantRestContext _localctx = new AnnotationMethodOrConstantRestContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_annotationMethodOrConstantRest);
		try {
			setState(791);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(789);
				annotationMethodRest();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(790);
				annotationConstantRest();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationMethodRestContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(Parser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Parser.RPAREN, 0); }
		public DefaultValueContext defaultValue() {
			return getRuleContext(DefaultValueContext.class,0);
		}
		public AnnotationMethodRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationMethodRest; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitAnnotationMethodRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationMethodRestContext annotationMethodRest() throws RecognitionException {
		AnnotationMethodRestContext _localctx = new AnnotationMethodRestContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_annotationMethodRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(793);
			match(IDENTIFIER);
			setState(794);
			match(LPAREN);
			setState(795);
			match(RPAREN);
			setState(797);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(796);
				defaultValue();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationConstantRestContext extends ParserRuleContext {
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public AnnotationConstantRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationConstantRest; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitAnnotationConstantRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationConstantRestContext annotationConstantRest() throws RecognitionException {
		AnnotationConstantRestContext _localctx = new AnnotationConstantRestContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_annotationConstantRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(799);
			variableDeclarators();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefaultValueContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(Parser.DEFAULT, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public DefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultValue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitDefaultValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_defaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(801);
			match(DEFAULT);
			setState(802);
			elementValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(Parser.RBRACE, 0); }
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(804);
			match(LBRACE);
			setState(808);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (AT - 68)) | (1L << (IDENTIFIER - 68)) | (1L << (CHAR_LITERAL - 68)) | (1L << (STRING_LITERAL - 68)) | (1L << (BOOL_LITERAL - 68)) | (1L << (NULL_LITERAL - 68)) | (1L << (DECIMAL_LITERAL - 68)) | (1L << (HEX_LITERAL - 68)) | (1L << (OCT_LITERAL - 68)) | (1L << (BINARY_LITERAL - 68)) | (1L << (FLOAT_LITERAL - 68)) | (1L << (HEX_FLOAT_LITERAL - 68)))) != 0)) {
				{
				{
				setState(805);
				blockStatement();
				}
				}
				setState(810);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(811);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Parser.SEMI, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LocalTypeDeclarationContext localTypeDeclaration() {
			return getRuleContext(LocalTypeDeclarationContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_blockStatement);
		try {
			setState(818);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(813);
				localVariableDeclaration();
				setState(814);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(816);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(817);
				localTypeDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitLocalVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_localVariableDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(823);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(820);
					variableModifier();
					}
					} 
				}
				setState(825);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
			}
			setState(826);
			typeType();
			setState(827);
			variableDeclarators();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalTypeDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public List<ClassOrInterfaceModifierContext> classOrInterfaceModifier() {
			return getRuleContexts(ClassOrInterfaceModifierContext.class);
		}
		public ClassOrInterfaceModifierContext classOrInterfaceModifier(int i) {
			return getRuleContext(ClassOrInterfaceModifierContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(Parser.SEMI, 0); }
		public LocalTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localTypeDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitLocalTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalTypeDeclarationContext localTypeDeclaration() throws RecognitionException {
		LocalTypeDeclarationContext _localctx = new LocalTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_localTypeDeclaration);
		int _la;
		try {
			setState(840);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case CLASS:
			case FINAL:
			case INTERFACE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case STRICTFP:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(832);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT || _la==IDENTIFIER) {
					{
					{
					setState(829);
					classOrInterfaceModifier();
					}
					}
					setState(834);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(837);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CLASS:
					{
					setState(835);
					classDeclaration();
					}
					break;
				case INTERFACE:
					{
					setState(836);
					interfaceDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(839);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public BlockContext blockLabel;
		public ExpressionContext statementExpression;
		public Token identifierLabel;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode ASSERT() { return getToken(Parser.ASSERT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(Parser.SEMI, 0); }
		public TerminalNode COLON() { return getToken(Parser.COLON, 0); }
		public TerminalNode IF() { return getToken(Parser.IF, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(Parser.ELSE, 0); }
		public TerminalNode FOR() { return getToken(Parser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(Parser.LPAREN, 0); }
		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Parser.RPAREN, 0); }
		public TerminalNode WHILE() { return getToken(Parser.WHILE, 0); }
		public TerminalNode DO() { return getToken(Parser.DO, 0); }
		public TerminalNode TRY() { return getToken(Parser.TRY, 0); }
		public FinallyBlockContext finallyBlock() {
			return getRuleContext(FinallyBlockContext.class,0);
		}
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public ResourceSpecificationContext resourceSpecification() {
			return getRuleContext(ResourceSpecificationContext.class,0);
		}
		public TerminalNode SWITCH() { return getToken(Parser.SWITCH, 0); }
		public TerminalNode LBRACE() { return getToken(Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(Parser.RBRACE, 0); }
		public List<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
			return getRuleContexts(SwitchBlockStatementGroupContext.class);
		}
		public SwitchBlockStatementGroupContext switchBlockStatementGroup(int i) {
			return getRuleContext(SwitchBlockStatementGroupContext.class,i);
		}
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public TerminalNode SYNCHRONIZED() { return getToken(Parser.SYNCHRONIZED, 0); }
		public TerminalNode RETURN() { return getToken(Parser.RETURN, 0); }
		public TerminalNode THROW() { return getToken(Parser.THROW, 0); }
		public TerminalNode BREAK() { return getToken(Parser.BREAK, 0); }
		public TerminalNode IDENTIFIER() { return getToken(Parser.IDENTIFIER, 0); }
		public TerminalNode CONTINUE() { return getToken(Parser.CONTINUE, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(946);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(842);
				((StatementContext)_localctx).blockLabel = block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(843);
				match(ASSERT);
				setState(844);
				expression(0);
				setState(847);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(845);
					match(COLON);
					setState(846);
					expression(0);
					}
				}

				setState(849);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(851);
				match(IF);
				setState(852);
				parExpression();
				setState(853);
				statement();
				setState(856);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
				case 1:
					{
					setState(854);
					match(ELSE);
					setState(855);
					statement();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(858);
				match(FOR);
				setState(859);
				match(LPAREN);
				setState(860);
				forControl();
				setState(861);
				match(RPAREN);
				setState(862);
				statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(864);
				match(WHILE);
				setState(865);
				parExpression();
				setState(866);
				statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(868);
				match(DO);
				setState(869);
				statement();
				setState(870);
				match(WHILE);
				setState(871);
				parExpression();
				setState(872);
				match(SEMI);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(874);
				match(TRY);
				setState(875);
				block();
				setState(885);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CATCH:
					{
					setState(877); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(876);
						catchClause();
						}
						}
						setState(879); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==CATCH );
					setState(882);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==FINALLY) {
						{
						setState(881);
						finallyBlock();
						}
					}

					}
					break;
				case FINALLY:
					{
					setState(884);
					finallyBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(887);
				match(TRY);
				setState(888);
				resourceSpecification();
				setState(889);
				block();
				setState(893);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CATCH) {
					{
					{
					setState(890);
					catchClause();
					}
					}
					setState(895);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(897);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FINALLY) {
					{
					setState(896);
					finallyBlock();
					}
				}

				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(899);
				match(SWITCH);
				setState(900);
				parExpression();
				setState(901);
				match(LBRACE);
				setState(905);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(902);
						switchBlockStatementGroup();
						}
						} 
					}
					setState(907);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
				}
				setState(911);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CASE || _la==DEFAULT) {
					{
					{
					setState(908);
					switchLabel();
					}
					}
					setState(913);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(914);
				match(RBRACE);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(916);
				match(SYNCHRONIZED);
				setState(917);
				parExpression();
				setState(918);
				block();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(920);
				match(RETURN);
				setState(922);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << LPAREN))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (AT - 68)) | (1L << (IDENTIFIER - 68)) | (1L << (CHAR_LITERAL - 68)) | (1L << (STRING_LITERAL - 68)) | (1L << (BOOL_LITERAL - 68)) | (1L << (NULL_LITERAL - 68)) | (1L << (DECIMAL_LITERAL - 68)) | (1L << (HEX_LITERAL - 68)) | (1L << (OCT_LITERAL - 68)) | (1L << (BINARY_LITERAL - 68)) | (1L << (FLOAT_LITERAL - 68)) | (1L << (HEX_FLOAT_LITERAL - 68)))) != 0)) {
					{
					setState(921);
					expression(0);
					}
				}

				setState(924);
				match(SEMI);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(925);
				match(THROW);
				setState(926);
				expression(0);
				setState(927);
				match(SEMI);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(929);
				match(BREAK);
				setState(931);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(930);
					match(IDENTIFIER);
					}
				}

				setState(933);
				match(SEMI);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(934);
				match(CONTINUE);
				setState(936);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(935);
					match(IDENTIFIER);
					}
				}

				setState(938);
				match(SEMI);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(939);
				match(SEMI);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(940);
				((StatementContext)_localctx).statementExpression = expression(0);
				setState(941);
				match(SEMI);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(943);
				((StatementContext)_localctx).identifierLabel = match(IDENTIFIER);
				setState(944);
				match(COLON);
				setState(945);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchClauseContext extends ParserRuleContext {
		public TerminalNode CATCH() { return getToken(Parser.CATCH, 0); }
		public TerminalNode LPAREN() { return getToken(Parser.LPAREN, 0); }
		public CatchTypeContext catchType() {
			return getRuleContext(CatchTypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(Parser.IDENTIFIER, 0); }
		public TerminalNode RPAREN() { return getToken(Parser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitCatchClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_catchClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(948);
			match(CATCH);
			setState(949);
			match(LPAREN);
			setState(953);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(950);
					variableModifier();
					}
					} 
				}
				setState(955);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
			}
			setState(956);
			catchType();
			setState(957);
			match(IDENTIFIER);
			setState(958);
			match(RPAREN);
			setState(959);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchTypeContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public List<TerminalNode> BITOR() { return getTokens(Parser.BITOR); }
		public TerminalNode BITOR(int i) {
			return getToken(Parser.BITOR, i);
		}
		public CatchTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitCatchType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchTypeContext catchType() throws RecognitionException {
		CatchTypeContext _localctx = new CatchTypeContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_catchType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(961);
			qualifiedName();
			setState(966);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(962);
				match(BITOR);
				setState(963);
				qualifiedName();
				}
				}
				setState(968);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FinallyBlockContext extends ParserRuleContext {
		public TerminalNode FINALLY() { return getToken(Parser.FINALLY, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FinallyBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitFinallyBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinallyBlockContext finallyBlock() throws RecognitionException {
		FinallyBlockContext _localctx = new FinallyBlockContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_finallyBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(969);
			match(FINALLY);
			setState(970);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceSpecificationContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(Parser.LPAREN, 0); }
		public ResourcesContext resources() {
			return getRuleContext(ResourcesContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Parser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(Parser.SEMI, 0); }
		public ResourceSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceSpecification; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitResourceSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceSpecificationContext resourceSpecification() throws RecognitionException {
		ResourceSpecificationContext _localctx = new ResourceSpecificationContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_resourceSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(972);
			match(LPAREN);
			setState(973);
			resources();
			setState(975);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(974);
				match(SEMI);
				}
			}

			setState(977);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourcesContext extends ParserRuleContext {
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(Parser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(Parser.SEMI, i);
		}
		public ResourcesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resources; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitResources(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourcesContext resources() throws RecognitionException {
		ResourcesContext _localctx = new ResourcesContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_resources);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(979);
			resource();
			setState(984);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(980);
					match(SEMI);
					setState(981);
					resource();
					}
					} 
				}
				setState(986);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(Parser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitResource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_resource);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(990);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(987);
					variableModifier();
					}
					} 
				}
				setState(992);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
			}
			setState(993);
			classOrInterfaceType();
			setState(994);
			variableDeclaratorId();
			setState(995);
			match(ASSIGN);
			setState(996);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchBlockStatementGroupContext extends ParserRuleContext {
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public SwitchBlockStatementGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatementGroup; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitSwitchBlockStatementGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_switchBlockStatementGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(999); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(998);
				switchLabel();
				}
				}
				setState(1001); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE || _la==DEFAULT );
			setState(1004); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1003);
				blockStatement();
				}
				}
				setState(1006); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (AT - 68)) | (1L << (IDENTIFIER - 68)) | (1L << (CHAR_LITERAL - 68)) | (1L << (STRING_LITERAL - 68)) | (1L << (BOOL_LITERAL - 68)) | (1L << (NULL_LITERAL - 68)) | (1L << (DECIMAL_LITERAL - 68)) | (1L << (HEX_LITERAL - 68)) | (1L << (OCT_LITERAL - 68)) | (1L << (BINARY_LITERAL - 68)) | (1L << (FLOAT_LITERAL - 68)) | (1L << (HEX_FLOAT_LITERAL - 68)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchLabelContext extends ParserRuleContext {
		public ExpressionContext constantExpression;
		public Token enumConstantName;
		public TerminalNode CASE() { return getToken(Parser.CASE, 0); }
		public TerminalNode COLON() { return getToken(Parser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(Parser.IDENTIFIER, 0); }
		public TerminalNode DEFAULT() { return getToken(Parser.DEFAULT, 0); }
		public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabel; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitSwitchLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_switchLabel);
		try {
			setState(1016);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1008);
				match(CASE);
				setState(1011);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
				case 1:
					{
					setState(1009);
					((SwitchLabelContext)_localctx).constantExpression = expression(0);
					}
					break;
				case 2:
					{
					setState(1010);
					((SwitchLabelContext)_localctx).enumConstantName = match(IDENTIFIER);
					}
					break;
				}
				setState(1013);
				match(COLON);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1014);
				match(DEFAULT);
				setState(1015);
				match(COLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForControlContext extends ParserRuleContext {
		public ExpressionListContext forUpdate;
		public EnhancedForControlContext enhancedForControl() {
			return getRuleContext(EnhancedForControlContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(Parser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(Parser.SEMI, i);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forControl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitForControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForControlContext forControl() throws RecognitionException {
		ForControlContext _localctx = new ForControlContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_forControl);
		int _la;
		try {
			setState(1030);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1018);
				enhancedForControl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1020);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << LPAREN))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (AT - 68)) | (1L << (IDENTIFIER - 68)) | (1L << (CHAR_LITERAL - 68)) | (1L << (STRING_LITERAL - 68)) | (1L << (BOOL_LITERAL - 68)) | (1L << (NULL_LITERAL - 68)) | (1L << (DECIMAL_LITERAL - 68)) | (1L << (HEX_LITERAL - 68)) | (1L << (OCT_LITERAL - 68)) | (1L << (BINARY_LITERAL - 68)) | (1L << (FLOAT_LITERAL - 68)) | (1L << (HEX_FLOAT_LITERAL - 68)))) != 0)) {
					{
					setState(1019);
					forInit();
					}
				}

				setState(1022);
				match(SEMI);
				setState(1024);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << LPAREN))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (AT - 68)) | (1L << (IDENTIFIER - 68)) | (1L << (CHAR_LITERAL - 68)) | (1L << (STRING_LITERAL - 68)) | (1L << (BOOL_LITERAL - 68)) | (1L << (NULL_LITERAL - 68)) | (1L << (DECIMAL_LITERAL - 68)) | (1L << (HEX_LITERAL - 68)) | (1L << (OCT_LITERAL - 68)) | (1L << (BINARY_LITERAL - 68)) | (1L << (FLOAT_LITERAL - 68)) | (1L << (HEX_FLOAT_LITERAL - 68)))) != 0)) {
					{
					setState(1023);
					expression(0);
					}
				}

				setState(1026);
				match(SEMI);
				setState(1028);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << LPAREN))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (AT - 68)) | (1L << (IDENTIFIER - 68)) | (1L << (CHAR_LITERAL - 68)) | (1L << (STRING_LITERAL - 68)) | (1L << (BOOL_LITERAL - 68)) | (1L << (NULL_LITERAL - 68)) | (1L << (DECIMAL_LITERAL - 68)) | (1L << (HEX_LITERAL - 68)) | (1L << (OCT_LITERAL - 68)) | (1L << (BINARY_LITERAL - 68)) | (1L << (FLOAT_LITERAL - 68)) | (1L << (HEX_FLOAT_LITERAL - 68)))) != 0)) {
					{
					setState(1027);
					((ForControlContext)_localctx).forUpdate = expressionList();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInitContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitForInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_forInit);
		try {
			setState(1034);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1032);
				localVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1033);
				expressionList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnhancedForControlContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode COLON() { return getToken(Parser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public EnhancedForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForControl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitEnhancedForControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnhancedForControlContext enhancedForControl() throws RecognitionException {
		EnhancedForControlContext _localctx = new EnhancedForControlContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_enhancedForControl);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1039);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1036);
					variableModifier();
					}
					} 
				}
				setState(1041);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
			}
			setState(1042);
			typeType();
			setState(1043);
			variableDeclaratorId();
			setState(1044);
			match(COLON);
			setState(1045);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(Parser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Parser.RPAREN, 0); }
		public ParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitParExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1047);
			match(LPAREN);
			setState(1048);
			expression(0);
			setState(1049);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parser.COMMA, i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1051);
			expression(0);
			setState(1056);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1052);
				match(COMMA);
				setState(1053);
				expression(0);
				}
				}
				setState(1058);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodCallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(Parser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Parser.RPAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode THIS() { return getToken(Parser.THIS, 0); }
		public TerminalNode SUPER() { return getToken(Parser.SUPER, 0); }
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_methodCall);
		int _la;
		try {
			setState(1077);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1059);
				match(IDENTIFIER);
				setState(1060);
				match(LPAREN);
				setState(1062);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << LPAREN))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (AT - 68)) | (1L << (IDENTIFIER - 68)) | (1L << (CHAR_LITERAL - 68)) | (1L << (STRING_LITERAL - 68)) | (1L << (BOOL_LITERAL - 68)) | (1L << (NULL_LITERAL - 68)) | (1L << (DECIMAL_LITERAL - 68)) | (1L << (HEX_LITERAL - 68)) | (1L << (OCT_LITERAL - 68)) | (1L << (BINARY_LITERAL - 68)) | (1L << (FLOAT_LITERAL - 68)) | (1L << (HEX_FLOAT_LITERAL - 68)))) != 0)) {
					{
					setState(1061);
					expressionList();
					}
				}

				setState(1064);
				match(RPAREN);
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1065);
				match(THIS);
				setState(1066);
				match(LPAREN);
				setState(1068);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << LPAREN))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (AT - 68)) | (1L << (IDENTIFIER - 68)) | (1L << (CHAR_LITERAL - 68)) | (1L << (STRING_LITERAL - 68)) | (1L << (BOOL_LITERAL - 68)) | (1L << (NULL_LITERAL - 68)) | (1L << (DECIMAL_LITERAL - 68)) | (1L << (HEX_LITERAL - 68)) | (1L << (OCT_LITERAL - 68)) | (1L << (BINARY_LITERAL - 68)) | (1L << (FLOAT_LITERAL - 68)) | (1L << (HEX_FLOAT_LITERAL - 68)))) != 0)) {
					{
					setState(1067);
					expressionList();
					}
				}

				setState(1070);
				match(RPAREN);
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 3);
				{
				setState(1071);
				match(SUPER);
				setState(1072);
				match(LPAREN);
				setState(1074);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << LPAREN))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (AT - 68)) | (1L << (IDENTIFIER - 68)) | (1L << (CHAR_LITERAL - 68)) | (1L << (STRING_LITERAL - 68)) | (1L << (BOOL_LITERAL - 68)) | (1L << (NULL_LITERAL - 68)) | (1L << (DECIMAL_LITERAL - 68)) | (1L << (HEX_LITERAL - 68)) | (1L << (OCT_LITERAL - 68)) | (1L << (BINARY_LITERAL - 68)) | (1L << (FLOAT_LITERAL - 68)) | (1L << (HEX_FLOAT_LITERAL - 68)))) != 0)) {
					{
					setState(1073);
					expressionList();
					}
				}

				setState(1076);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public Token prefix;
		public Token bop;
		public Token postfix;
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public TerminalNode NEW() { return getToken(Parser.NEW, 0); }
		public CreatorContext creator() {
			return getRuleContext(CreatorContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(Parser.LPAREN, 0); }
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Parser.RPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ADD() { return getToken(Parser.ADD, 0); }
		public TerminalNode SUB() { return getToken(Parser.SUB, 0); }
		public TerminalNode INC() { return getToken(Parser.INC, 0); }
		public TerminalNode DEC() { return getToken(Parser.DEC, 0); }
		public TerminalNode TILDE() { return getToken(Parser.TILDE, 0); }
		public TerminalNode BANG() { return getToken(Parser.BANG, 0); }
		public LambdaExpressionContext lambdaExpression() {
			return getRuleContext(LambdaExpressionContext.class,0);
		}
		public TerminalNode COLONCOLON() { return getToken(Parser.COLONCOLON, 0); }
		public TerminalNode IDENTIFIER() { return getToken(Parser.IDENTIFIER, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public TerminalNode MUL() { return getToken(Parser.MUL, 0); }
		public TerminalNode DIV() { return getToken(Parser.DIV, 0); }
		public TerminalNode MOD() { return getToken(Parser.MOD, 0); }
		public List<TerminalNode> LT() { return getTokens(Parser.LT); }
		public TerminalNode LT(int i) {
			return getToken(Parser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(Parser.GT); }
		public TerminalNode GT(int i) {
			return getToken(Parser.GT, i);
		}
		public TerminalNode LE() { return getToken(Parser.LE, 0); }
		public TerminalNode GE() { return getToken(Parser.GE, 0); }
		public TerminalNode EQUAL() { return getToken(Parser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(Parser.NOTEQUAL, 0); }
		public TerminalNode BITAND() { return getToken(Parser.BITAND, 0); }
		public TerminalNode CARET() { return getToken(Parser.CARET, 0); }
		public TerminalNode BITOR() { return getToken(Parser.BITOR, 0); }
		public TerminalNode AND() { return getToken(Parser.AND, 0); }
		public TerminalNode OR() { return getToken(Parser.OR, 0); }
		public TerminalNode COLON() { return getToken(Parser.COLON, 0); }
		public TerminalNode QUESTION() { return getToken(Parser.QUESTION, 0); }
		public TerminalNode ASSIGN() { return getToken(Parser.ASSIGN, 0); }
		public TerminalNode ADD_ASSIGN() { return getToken(Parser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(Parser.SUB_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(Parser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(Parser.DIV_ASSIGN, 0); }
		public TerminalNode AND_ASSIGN() { return getToken(Parser.AND_ASSIGN, 0); }
		public TerminalNode OR_ASSIGN() { return getToken(Parser.OR_ASSIGN, 0); }
		public TerminalNode XOR_ASSIGN() { return getToken(Parser.XOR_ASSIGN, 0); }
		public TerminalNode RSHIFT_ASSIGN() { return getToken(Parser.RSHIFT_ASSIGN, 0); }
		public TerminalNode URSHIFT_ASSIGN() { return getToken(Parser.URSHIFT_ASSIGN, 0); }
		public TerminalNode LSHIFT_ASSIGN() { return getToken(Parser.LSHIFT_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(Parser.MOD_ASSIGN, 0); }
		public TerminalNode DOT() { return getToken(Parser.DOT, 0); }
		public TerminalNode THIS() { return getToken(Parser.THIS, 0); }
		public InnerCreatorContext innerCreator() {
			return getRuleContext(InnerCreatorContext.class,0);
		}
		public TerminalNode SUPER() { return getToken(Parser.SUPER, 0); }
		public SuperSuffixContext superSuffix() {
			return getRuleContext(SuperSuffixContext.class,0);
		}
		public ExplicitGenericInvocationContext explicitGenericInvocation() {
			return getRuleContext(ExplicitGenericInvocationContext.class,0);
		}
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(Parser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(Parser.RBRACK, 0); }
		public TerminalNode INSTANCEOF() { return getToken(Parser.INSTANCEOF, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 166;
		enterRecursionRule(_localctx, 166, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				{
				setState(1080);
				primary();
				}
				break;
			case 2:
				{
				setState(1081);
				methodCall();
				}
				break;
			case 3:
				{
				setState(1082);
				match(NEW);
				setState(1083);
				creator();
				}
				break;
			case 4:
				{
				setState(1084);
				match(LPAREN);
				setState(1085);
				typeType();
				setState(1086);
				match(RPAREN);
				setState(1087);
				expression(21);
				}
				break;
			case 5:
				{
				setState(1089);
				((ExpressionContext)_localctx).prefix = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (ADD - 79)) | (1L << (SUB - 79)))) != 0)) ) {
					((ExpressionContext)_localctx).prefix = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1090);
				expression(19);
				}
				break;
			case 6:
				{
				setState(1091);
				((ExpressionContext)_localctx).prefix = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==BANG || _la==TILDE) ) {
					((ExpressionContext)_localctx).prefix = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1092);
				expression(18);
				}
				break;
			case 7:
				{
				setState(1093);
				lambdaExpression();
				}
				break;
			case 8:
				{
				setState(1094);
				typeType();
				setState(1095);
				match(COLONCOLON);
				setState(1101);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LT:
				case IDENTIFIER:
					{
					setState(1097);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(1096);
						typeArguments();
						}
					}

					setState(1099);
					match(IDENTIFIER);
					}
					break;
				case NEW:
					{
					setState(1100);
					match(NEW);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 9:
				{
				setState(1103);
				classType();
				setState(1104);
				match(COLONCOLON);
				setState(1106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1105);
					typeArguments();
					}
				}

				setState(1108);
				match(NEW);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1192);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,140,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1190);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1112);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1113);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (MUL - 83)) | (1L << (DIV - 83)) | (1L << (MOD - 83)))) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1114);
						expression(18);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1115);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1116);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1117);
						expression(17);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1118);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1126);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
						case 1:
							{
							setState(1119);
							match(LT);
							setState(1120);
							match(LT);
							}
							break;
						case 2:
							{
							setState(1121);
							match(GT);
							setState(1122);
							match(GT);
							setState(1123);
							match(GT);
							}
							break;
						case 3:
							{
							setState(1124);
							match(GT);
							setState(1125);
							match(GT);
							}
							break;
						}
						setState(1128);
						expression(16);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1129);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1130);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (GT - 67)) | (1L << (LT - 67)) | (1L << (LE - 67)) | (1L << (GE - 67)))) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1131);
						expression(15);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1132);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1133);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1134);
						expression(13);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1135);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1136);
						((ExpressionContext)_localctx).bop = match(BITAND);
						setState(1137);
						expression(12);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1138);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1139);
						((ExpressionContext)_localctx).bop = match(CARET);
						setState(1140);
						expression(11);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1141);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1142);
						((ExpressionContext)_localctx).bop = match(BITOR);
						setState(1143);
						expression(10);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1144);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1145);
						((ExpressionContext)_localctx).bop = match(AND);
						setState(1146);
						expression(9);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1147);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1148);
						((ExpressionContext)_localctx).bop = match(OR);
						setState(1149);
						expression(8);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1150);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1151);
						((ExpressionContext)_localctx).bop = match(QUESTION);
						setState(1152);
						expression(0);
						setState(1153);
						match(COLON);
						setState(1154);
						expression(6);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1156);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1157);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (ASSIGN - 66)) | (1L << (ADD_ASSIGN - 66)) | (1L << (SUB_ASSIGN - 66)) | (1L << (MUL_ASSIGN - 66)) | (1L << (DIV_ASSIGN - 66)) | (1L << (AND_ASSIGN - 66)) | (1L << (OR_ASSIGN - 66)) | (1L << (XOR_ASSIGN - 66)) | (1L << (MOD_ASSIGN - 66)) | (1L << (LSHIFT_ASSIGN - 66)) | (1L << (RSHIFT_ASSIGN - 66)) | (1L << (URSHIFT_ASSIGN - 66)))) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1158);
						expression(5);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1159);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(1160);
						((ExpressionContext)_localctx).bop = match(DOT);
						setState(1172);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
						case 1:
							{
							setState(1161);
							match(IDENTIFIER);
							}
							break;
						case 2:
							{
							setState(1162);
							methodCall();
							}
							break;
						case 3:
							{
							setState(1163);
							match(THIS);
							}
							break;
						case 4:
							{
							setState(1164);
							match(NEW);
							setState(1166);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==LT) {
								{
								setState(1165);
								nonWildcardTypeArguments();
								}
							}

							setState(1168);
							innerCreator();
							}
							break;
						case 5:
							{
							setState(1169);
							match(SUPER);
							setState(1170);
							superSuffix();
							}
							break;
						case 6:
							{
							setState(1171);
							explicitGenericInvocation();
							}
							break;
						}
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1174);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(1175);
						match(LBRACK);
						setState(1176);
						expression(0);
						setState(1177);
						match(RBRACK);
						}
						break;
					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1179);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1180);
						((ExpressionContext)_localctx).postfix = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==INC || _la==DEC) ) {
							((ExpressionContext)_localctx).postfix = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1181);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1182);
						((ExpressionContext)_localctx).bop = match(INSTANCEOF);
						setState(1183);
						typeType();
						}
						break;
					case 17:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1184);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1185);
						match(COLONCOLON);
						setState(1187);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==LT) {
							{
							setState(1186);
							typeArguments();
							}
						}

						setState(1189);
						match(IDENTIFIER);
						}
						break;
					}
					} 
				}
				setState(1194);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,140,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LambdaExpressionContext extends ParserRuleContext {
		public LambdaParametersContext lambdaParameters() {
			return getRuleContext(LambdaParametersContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(Parser.ARROW, 0); }
		public LambdaBodyContext lambdaBody() {
			return getRuleContext(LambdaBodyContext.class,0);
		}
		public LambdaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitLambdaExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaExpressionContext lambdaExpression() throws RecognitionException {
		LambdaExpressionContext _localctx = new LambdaExpressionContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_lambdaExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1195);
			lambdaParameters();
			setState(1196);
			match(ARROW);
			setState(1197);
			lambdaBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaParametersContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(Parser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(Parser.IDENTIFIER, i);
		}
		public TerminalNode LPAREN() { return getToken(Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Parser.RPAREN, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parser.COMMA, i);
		}
		public LambdaParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaParameters; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitLambdaParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaParametersContext lambdaParameters() throws RecognitionException {
		LambdaParametersContext _localctx = new LambdaParametersContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_lambdaParameters);
		int _la;
		try {
			setState(1215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1199);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1200);
				match(LPAREN);
				setState(1202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==AT || _la==IDENTIFIER) {
					{
					setState(1201);
					formalParameterList();
					}
				}

				setState(1204);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1205);
				match(LPAREN);
				setState(1206);
				match(IDENTIFIER);
				setState(1211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1207);
					match(COMMA);
					setState(1208);
					match(IDENTIFIER);
					}
					}
					setState(1213);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1214);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaBodyContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LambdaBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitLambdaBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaBodyContext lambdaBody() throws RecognitionException {
		LambdaBodyContext _localctx = new LambdaBodyContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_lambdaBody);
		try {
			setState(1219);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case AT:
			case IDENTIFIER:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case BOOL_LITERAL:
			case NULL_LITERAL:
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1217);
				expression(0);
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1218);
				block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(Parser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Parser.RPAREN, 0); }
		public TerminalNode THIS() { return getToken(Parser.THIS, 0); }
		public TerminalNode SUPER() { return getToken(Parser.SUPER, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(Parser.IDENTIFIER, 0); }
		public TypeTypeOrVoidContext typeTypeOrVoid() {
			return getRuleContext(TypeTypeOrVoidContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Parser.DOT, 0); }
		public TerminalNode CLASS() { return getToken(Parser.CLASS, 0); }
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() {
			return getRuleContext(ExplicitGenericInvocationSuffixContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_primary);
		try {
			setState(1239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1221);
				match(LPAREN);
				setState(1222);
				expression(0);
				setState(1223);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1225);
				match(THIS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1226);
				match(SUPER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1227);
				literal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1228);
				match(IDENTIFIER);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1229);
				typeTypeOrVoid();
				setState(1230);
				match(DOT);
				setState(1231);
				match(CLASS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1233);
				nonWildcardTypeArguments();
				setState(1237);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SUPER:
				case IDENTIFIER:
					{
					setState(1234);
					explicitGenericInvocationSuffix();
					}
					break;
				case THIS:
					{
					setState(1235);
					match(THIS);
					setState(1236);
					arguments();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassTypeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(Parser.IDENTIFIER, 0); }
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Parser.DOT, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitClassType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassTypeContext classType() throws RecognitionException {
		ClassTypeContext _localctx = new ClassTypeContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_classType);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				{
				setState(1241);
				classOrInterfaceType();
				setState(1242);
				match(DOT);
				}
				break;
			}
			setState(1249);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,148,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1246);
					annotation();
					}
					} 
				}
				setState(1251);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,148,_ctx);
			}
			setState(1252);
			match(IDENTIFIER);
			setState(1254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1253);
				typeArguments();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreatorContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public CreatedNameContext createdName() {
			return getRuleContext(CreatedNameContext.class,0);
		}
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public ArrayCreatorRestContext arrayCreatorRest() {
			return getRuleContext(ArrayCreatorRestContext.class,0);
		}
		public CreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitCreator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreatorContext creator() throws RecognitionException {
		CreatorContext _localctx = new CreatorContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_creator);
		try {
			setState(1265);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1256);
				nonWildcardTypeArguments();
				setState(1257);
				createdName();
				setState(1258);
				classCreatorRest();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1260);
				createdName();
				setState(1263);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACK:
					{
					setState(1261);
					arrayCreatorRest();
					}
					break;
				case LPAREN:
					{
					setState(1262);
					classCreatorRest();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreatedNameContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(Parser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(Parser.IDENTIFIER, i);
		}
		public List<TypeArgumentsOrDiamondContext> typeArgumentsOrDiamond() {
			return getRuleContexts(TypeArgumentsOrDiamondContext.class);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond(int i) {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(Parser.DOT, i);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public CreatedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createdName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitCreatedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreatedNameContext createdName() throws RecognitionException {
		CreatedNameContext _localctx = new CreatedNameContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_createdName);
		int _la;
		try {
			setState(1282);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1267);
				match(IDENTIFIER);
				setState(1269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1268);
					typeArgumentsOrDiamond();
					}
				}

				setState(1278);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(1271);
					match(DOT);
					setState(1272);
					match(IDENTIFIER);
					setState(1274);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(1273);
						typeArgumentsOrDiamond();
						}
					}

					}
					}
					setState(1280);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1281);
				primitiveType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InnerCreatorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(Parser.IDENTIFIER, 0); }
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public NonWildcardTypeArgumentsOrDiamondContext nonWildcardTypeArgumentsOrDiamond() {
			return getRuleContext(NonWildcardTypeArgumentsOrDiamondContext.class,0);
		}
		public InnerCreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerCreator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitInnerCreator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InnerCreatorContext innerCreator() throws RecognitionException {
		InnerCreatorContext _localctx = new InnerCreatorContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_innerCreator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1284);
			match(IDENTIFIER);
			setState(1286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1285);
				nonWildcardTypeArgumentsOrDiamond();
				}
			}

			setState(1288);
			classCreatorRest();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayCreatorRestContext extends ParserRuleContext {
		public List<TerminalNode> LBRACK() { return getTokens(Parser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(Parser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(Parser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(Parser.RBRACK, i);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCreatorRest; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitArrayCreatorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayCreatorRestContext arrayCreatorRest() throws RecognitionException {
		ArrayCreatorRestContext _localctx = new ArrayCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_arrayCreatorRest);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1290);
			match(LBRACK);
			setState(1318);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RBRACK:
				{
				setState(1291);
				match(RBRACK);
				setState(1296);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1292);
					match(LBRACK);
					setState(1293);
					match(RBRACK);
					}
					}
					setState(1298);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1299);
				arrayInitializer();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case AT:
			case IDENTIFIER:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case BOOL_LITERAL:
			case NULL_LITERAL:
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
				{
				setState(1300);
				expression(0);
				setState(1301);
				match(RBRACK);
				setState(1308);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,158,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1302);
						match(LBRACK);
						setState(1303);
						expression(0);
						setState(1304);
						match(RBRACK);
						}
						} 
					}
					setState(1310);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,158,_ctx);
				}
				setState(1315);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,159,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1311);
						match(LBRACK);
						setState(1312);
						match(RBRACK);
						}
						} 
					}
					setState(1317);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,159,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassCreatorRestContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ClassCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classCreatorRest; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitClassCreatorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassCreatorRestContext classCreatorRest() throws RecognitionException {
		ClassCreatorRestContext _localctx = new ClassCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_classCreatorRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1320);
			arguments();
			setState(1322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				{
				setState(1321);
				classBody();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitGenericInvocationContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() {
			return getRuleContext(ExplicitGenericInvocationSuffixContext.class,0);
		}
		public ExplicitGenericInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitGenericInvocation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitExplicitGenericInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplicitGenericInvocationContext explicitGenericInvocation() throws RecognitionException {
		ExplicitGenericInvocationContext _localctx = new ExplicitGenericInvocationContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_explicitGenericInvocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1324);
			nonWildcardTypeArguments();
			setState(1325);
			explicitGenericInvocationSuffix();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentsOrDiamondContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(Parser.LT, 0); }
		public TerminalNode GT() { return getToken(Parser.GT, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentsOrDiamond; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitTypeArgumentsOrDiamond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() throws RecognitionException {
		TypeArgumentsOrDiamondContext _localctx = new TypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_typeArgumentsOrDiamond);
		try {
			setState(1330);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1327);
				match(LT);
				setState(1328);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1329);
				typeArguments();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonWildcardTypeArgumentsOrDiamondContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(Parser.LT, 0); }
		public TerminalNode GT() { return getToken(Parser.GT, 0); }
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public NonWildcardTypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonWildcardTypeArgumentsOrDiamond; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitNonWildcardTypeArgumentsOrDiamond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonWildcardTypeArgumentsOrDiamondContext nonWildcardTypeArgumentsOrDiamond() throws RecognitionException {
		NonWildcardTypeArgumentsOrDiamondContext _localctx = new NonWildcardTypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_nonWildcardTypeArgumentsOrDiamond);
		try {
			setState(1335);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1332);
				match(LT);
				setState(1333);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1334);
				nonWildcardTypeArguments();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonWildcardTypeArgumentsContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(Parser.LT, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public TerminalNode GT() { return getToken(Parser.GT, 0); }
		public NonWildcardTypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonWildcardTypeArguments; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitNonWildcardTypeArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonWildcardTypeArgumentsContext nonWildcardTypeArguments() throws RecognitionException {
		NonWildcardTypeArgumentsContext _localctx = new NonWildcardTypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_nonWildcardTypeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1337);
			match(LT);
			setState(1338);
			typeList();
			setState(1339);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeListContext extends ParserRuleContext {
		public List<TypeTypeContext> typeType() {
			return getRuleContexts(TypeTypeContext.class);
		}
		public TypeTypeContext typeType(int i) {
			return getRuleContext(TypeTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parser.COMMA, i);
		}
		public TypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeListContext typeList() throws RecognitionException {
		TypeListContext _localctx = new TypeListContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1341);
			typeType();
			setState(1346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1342);
				match(COMMA);
				setState(1343);
				typeType();
				}
				}
				setState(1348);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeTypeContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(Parser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(Parser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(Parser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(Parser.RBRACK, i);
		}
		public TypeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitTypeType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeTypeContext typeType() throws RecognitionException {
		TypeTypeContext _localctx = new TypeTypeContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_typeType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1350);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
			case 1:
				{
				setState(1349);
				annotation();
				}
				break;
			}
			setState(1354);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(1352);
				classOrInterfaceType();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				{
				setState(1353);
				primitiveType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1360);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,167,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1356);
					match(LBRACK);
					setState(1357);
					match(RBRACK);
					}
					} 
				}
				setState(1362);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,167,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(Parser.BOOLEAN, 0); }
		public TerminalNode CHAR() { return getToken(Parser.CHAR, 0); }
		public TerminalNode BYTE() { return getToken(Parser.BYTE, 0); }
		public TerminalNode SHORT() { return getToken(Parser.SHORT, 0); }
		public TerminalNode INT() { return getToken(Parser.INT, 0); }
		public TerminalNode LONG() { return getToken(Parser.LONG, 0); }
		public TerminalNode FLOAT() { return getToken(Parser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(Parser.DOUBLE, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1363);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentsContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(Parser.LT, 0); }
		public List<TypeArgumentContext> typeArgument() {
			return getRuleContexts(TypeArgumentContext.class);
		}
		public TypeArgumentContext typeArgument(int i) {
			return getRuleContext(TypeArgumentContext.class,i);
		}
		public TerminalNode GT() { return getToken(Parser.GT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parser.COMMA, i);
		}
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitTypeArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1365);
			match(LT);
			setState(1366);
			typeArgument();
			setState(1371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1367);
				match(COMMA);
				setState(1368);
				typeArgument();
				}
				}
				setState(1373);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1374);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuperSuffixContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Parser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(Parser.IDENTIFIER, 0); }
		public SuperSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superSuffix; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitSuperSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuperSuffixContext superSuffix() throws RecognitionException {
		SuperSuffixContext _localctx = new SuperSuffixContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_superSuffix);
		try {
			setState(1382);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1376);
				arguments();
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1377);
				match(DOT);
				setState(1378);
				match(IDENTIFIER);
				setState(1380);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
				case 1:
					{
					setState(1379);
					arguments();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitGenericInvocationSuffixContext extends ParserRuleContext {
		public TerminalNode SUPER() { return getToken(Parser.SUPER, 0); }
		public SuperSuffixContext superSuffix() {
			return getRuleContext(SuperSuffixContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(Parser.IDENTIFIER, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitGenericInvocationSuffix; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitExplicitGenericInvocationSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() throws RecognitionException {
		ExplicitGenericInvocationSuffixContext _localctx = new ExplicitGenericInvocationSuffixContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_explicitGenericInvocationSuffix);
		try {
			setState(1388);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUPER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1384);
				match(SUPER);
				setState(1385);
				superSuffix();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1386);
				match(IDENTIFIER);
				setState(1387);
				arguments();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Parser.RPAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1390);
			match(LPAREN);
			setState(1392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << LPAREN))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (AT - 68)) | (1L << (IDENTIFIER - 68)) | (1L << (CHAR_LITERAL - 68)) | (1L << (STRING_LITERAL - 68)) | (1L << (BOOL_LITERAL - 68)) | (1L << (NULL_LITERAL - 68)) | (1L << (DECIMAL_LITERAL - 68)) | (1L << (HEX_LITERAL - 68)) | (1L << (OCT_LITERAL - 68)) | (1L << (BINARY_LITERAL - 68)) | (1L << (FLOAT_LITERAL - 68)) | (1L << (HEX_FLOAT_LITERAL - 68)))) != 0)) {
				{
				setState(1391);
				expressionList();
				}
			}

			setState(1394);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 83:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 17);
		case 1:
			return precpred(_ctx, 16);
		case 2:
			return precpred(_ctx, 15);
		case 3:
			return precpred(_ctx, 14);
		case 4:
			return precpred(_ctx, 12);
		case 5:
			return precpred(_ctx, 11);
		case 6:
			return precpred(_ctx, 10);
		case 7:
			return precpred(_ctx, 9);
		case 8:
			return precpred(_ctx, 8);
		case 9:
			return precpred(_ctx, 7);
		case 10:
			return precpred(_ctx, 6);
		case 11:
			return precpred(_ctx, 5);
		case 12:
			return precpred(_ctx, 25);
		case 13:
			return precpred(_ctx, 24);
		case 14:
			return precpred(_ctx, 20);
		case 15:
			return precpred(_ctx, 13);
		case 16:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3y\u0577\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\3\2\5"+
		"\2\u00d6\n\2\3\2\7\2\u00d9\n\2\f\2\16\2\u00dc\13\2\3\2\7\2\u00df\n\2\f"+
		"\2\16\2\u00e2\13\2\3\2\3\2\3\3\7\3\u00e7\n\3\f\3\16\3\u00ea\13\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\5\4\u00f2\n\4\3\4\3\4\3\4\5\4\u00f7\n\4\3\4\3\4\3\5"+
		"\7\5\u00fc\n\5\f\5\16\5\u00ff\13\5\3\5\3\5\3\5\3\5\5\5\u0105\n\5\3\5\5"+
		"\5\u0108\n\5\3\6\3\6\3\6\3\6\3\6\5\6\u010f\n\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\5\7\u0119\n\7\3\b\3\b\5\b\u011d\n\b\3\t\3\t\3\t\5\t\u0122\n\t"+
		"\3\t\3\t\5\t\u0126\n\t\3\t\3\t\5\t\u012a\n\t\3\t\3\t\3\n\3\n\3\n\3\n\7"+
		"\n\u0132\n\n\f\n\16\n\u0135\13\n\3\n\3\n\3\13\7\13\u013a\n\13\f\13\16"+
		"\13\u013d\13\13\3\13\3\13\3\13\5\13\u0142\n\13\3\f\3\f\3\f\7\f\u0147\n"+
		"\f\f\f\16\f\u014a\13\f\3\r\3\r\3\r\3\r\5\r\u0150\n\r\3\r\3\r\5\r\u0154"+
		"\n\r\3\r\5\r\u0157\n\r\3\r\5\r\u015a\n\r\3\r\3\r\3\16\3\16\3\16\7\16\u0161"+
		"\n\16\f\16\16\16\u0164\13\16\3\17\7\17\u0167\n\17\f\17\16\17\u016a\13"+
		"\17\3\17\3\17\5\17\u016e\n\17\3\17\5\17\u0171\n\17\3\20\3\20\7\20\u0175"+
		"\n\20\f\20\16\20\u0178\13\20\3\21\3\21\3\21\5\21\u017d\n\21\3\21\3\21"+
		"\5\21\u0181\n\21\3\21\3\21\3\22\3\22\7\22\u0187\n\22\f\22\16\22\u018a"+
		"\13\22\3\22\3\22\3\23\3\23\7\23\u0190\n\23\f\23\16\23\u0193\13\23\3\23"+
		"\3\23\3\24\3\24\5\24\u0199\n\24\3\24\3\24\7\24\u019d\n\24\f\24\16\24\u01a0"+
		"\13\24\3\24\5\24\u01a3\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\5\25\u01ae\n\25\3\26\3\26\3\26\3\26\3\26\7\26\u01b5\n\26\f\26\16\26"+
		"\u01b8\13\26\3\26\3\26\5\26\u01bc\n\26\3\26\3\26\3\27\3\27\5\27\u01c2"+
		"\n\27\3\30\3\30\5\30\u01c6\n\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\5\33\u01d2\n\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\7\35\u01db"+
		"\n\35\f\35\16\35\u01de\13\35\3\35\3\35\5\35\u01e2\n\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\5\36\u01eb\n\36\3\37\3\37\3\37\3\37\7\37\u01f1\n"+
		"\37\f\37\16\37\u01f4\13\37\3\37\3\37\3 \3 \3 \7 \u01fb\n \f \16 \u01fe"+
		"\13 \3 \3 \3 \3!\7!\u0204\n!\f!\16!\u0207\13!\3!\3!\3!\7!\u020c\n!\f!"+
		"\16!\u020f\13!\3!\3!\5!\u0213\n!\3!\3!\3!\3!\7!\u0219\n!\f!\16!\u021c"+
		"\13!\3!\3!\5!\u0220\n!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u022a\n\"\3#"+
		"\3#\3#\3$\3$\3$\7$\u0232\n$\f$\16$\u0235\13$\3%\3%\3%\5%\u023a\n%\3&\3"+
		"&\3&\7&\u023f\n&\f&\16&\u0242\13&\3\'\3\'\5\'\u0246\n\'\3(\3(\3(\3(\7"+
		"(\u024c\n(\f(\16(\u024f\13(\3(\5(\u0252\n(\5(\u0254\n(\3(\3(\3)\3)\5)"+
		"\u025a\n)\3)\3)\3)\5)\u025f\n)\7)\u0261\n)\f)\16)\u0264\13)\3*\3*\3*\3"+
		"*\5*\u026a\n*\5*\u026c\n*\3+\3+\3+\7+\u0271\n+\f+\16+\u0274\13+\3,\3,"+
		"\5,\u0278\n,\3,\3,\3-\3-\3-\7-\u027f\n-\f-\16-\u0282\13-\3-\3-\5-\u0286"+
		"\n-\3-\5-\u0289\n-\3.\7.\u028c\n.\f.\16.\u028f\13.\3.\3.\3.\3/\7/\u0295"+
		"\n/\f/\16/\u0298\13/\3/\3/\3/\3/\3\60\3\60\3\60\7\60\u02a1\n\60\f\60\16"+
		"\60\u02a4\13\60\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u02ac\n\61\3\62\3\62"+
		"\3\63\3\63\3\64\3\64\7\64\u02b4\n\64\f\64\16\64\u02b7\13\64\3\64\3\64"+
		"\3\64\3\65\3\65\3\65\5\65\u02bf\n\65\3\65\3\65\3\65\5\65\u02c4\n\65\3"+
		"\65\5\65\u02c7\n\65\3\66\3\66\3\66\7\66\u02cc\n\66\f\66\16\66\u02cf\13"+
		"\66\3\67\3\67\3\67\3\67\38\38\38\58\u02d8\n8\39\39\39\39\79\u02de\n9\f"+
		"9\169\u02e1\139\59\u02e3\n9\39\59\u02e6\n9\39\39\3:\3:\3:\3:\3:\3;\3;"+
		"\7;\u02f1\n;\f;\16;\u02f4\13;\3;\3;\3<\7<\u02f9\n<\f<\16<\u02fc\13<\3"+
		"<\3<\5<\u0300\n<\3=\3=\3=\3=\3=\3=\5=\u0308\n=\3=\3=\5=\u030c\n=\3=\3"+
		"=\5=\u0310\n=\3=\3=\5=\u0314\n=\5=\u0316\n=\3>\3>\5>\u031a\n>\3?\3?\3"+
		"?\3?\5?\u0320\n?\3@\3@\3A\3A\3A\3B\3B\7B\u0329\nB\fB\16B\u032c\13B\3B"+
		"\3B\3C\3C\3C\3C\3C\5C\u0335\nC\3D\7D\u0338\nD\fD\16D\u033b\13D\3D\3D\3"+
		"D\3E\7E\u0341\nE\fE\16E\u0344\13E\3E\3E\5E\u0348\nE\3E\5E\u034b\nE\3F"+
		"\3F\3F\3F\3F\5F\u0352\nF\3F\3F\3F\3F\3F\3F\3F\5F\u035b\nF\3F\3F\3F\3F"+
		"\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\6F\u0370\nF\rF\16F\u0371"+
		"\3F\5F\u0375\nF\3F\5F\u0378\nF\3F\3F\3F\3F\7F\u037e\nF\fF\16F\u0381\13"+
		"F\3F\5F\u0384\nF\3F\3F\3F\3F\7F\u038a\nF\fF\16F\u038d\13F\3F\7F\u0390"+
		"\nF\fF\16F\u0393\13F\3F\3F\3F\3F\3F\3F\3F\3F\5F\u039d\nF\3F\3F\3F\3F\3"+
		"F\3F\3F\5F\u03a6\nF\3F\3F\3F\5F\u03ab\nF\3F\3F\3F\3F\3F\3F\3F\3F\5F\u03b5"+
		"\nF\3G\3G\3G\7G\u03ba\nG\fG\16G\u03bd\13G\3G\3G\3G\3G\3G\3H\3H\3H\7H\u03c7"+
		"\nH\fH\16H\u03ca\13H\3I\3I\3I\3J\3J\3J\5J\u03d2\nJ\3J\3J\3K\3K\3K\7K\u03d9"+
		"\nK\fK\16K\u03dc\13K\3L\7L\u03df\nL\fL\16L\u03e2\13L\3L\3L\3L\3L\3L\3"+
		"M\6M\u03ea\nM\rM\16M\u03eb\3M\6M\u03ef\nM\rM\16M\u03f0\3N\3N\3N\5N\u03f6"+
		"\nN\3N\3N\3N\5N\u03fb\nN\3O\3O\5O\u03ff\nO\3O\3O\5O\u0403\nO\3O\3O\5O"+
		"\u0407\nO\5O\u0409\nO\3P\3P\5P\u040d\nP\3Q\7Q\u0410\nQ\fQ\16Q\u0413\13"+
		"Q\3Q\3Q\3Q\3Q\3Q\3R\3R\3R\3R\3S\3S\3S\7S\u0421\nS\fS\16S\u0424\13S\3T"+
		"\3T\3T\5T\u0429\nT\3T\3T\3T\3T\5T\u042f\nT\3T\3T\3T\3T\5T\u0435\nT\3T"+
		"\5T\u0438\nT\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\5U"+
		"\u044c\nU\3U\3U\5U\u0450\nU\3U\3U\3U\5U\u0455\nU\3U\3U\5U\u0459\nU\3U"+
		"\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\5U\u0469\nU\3U\3U\3U\3U\3U\3U"+
		"\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U"+
		"\3U\3U\3U\3U\3U\3U\3U\3U\3U\5U\u0491\nU\3U\3U\3U\3U\5U\u0497\nU\3U\3U"+
		"\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\5U\u04a6\nU\3U\7U\u04a9\nU\fU\16U\u04ac"+
		"\13U\3V\3V\3V\3V\3W\3W\3W\5W\u04b5\nW\3W\3W\3W\3W\3W\7W\u04bc\nW\fW\16"+
		"W\u04bf\13W\3W\5W\u04c2\nW\3X\3X\5X\u04c6\nX\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3"+
		"Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u04d8\nY\5Y\u04da\nY\3Z\3Z\3Z\5Z\u04df\nZ\3"+
		"Z\7Z\u04e2\nZ\fZ\16Z\u04e5\13Z\3Z\3Z\5Z\u04e9\nZ\3[\3[\3[\3[\3[\3[\3["+
		"\5[\u04f2\n[\5[\u04f4\n[\3\\\3\\\5\\\u04f8\n\\\3\\\3\\\3\\\5\\\u04fd\n"+
		"\\\7\\\u04ff\n\\\f\\\16\\\u0502\13\\\3\\\5\\\u0505\n\\\3]\3]\5]\u0509"+
		"\n]\3]\3]\3^\3^\3^\3^\7^\u0511\n^\f^\16^\u0514\13^\3^\3^\3^\3^\3^\3^\3"+
		"^\7^\u051d\n^\f^\16^\u0520\13^\3^\3^\7^\u0524\n^\f^\16^\u0527\13^\5^\u0529"+
		"\n^\3_\3_\5_\u052d\n_\3`\3`\3`\3a\3a\3a\5a\u0535\na\3b\3b\3b\5b\u053a"+
		"\nb\3c\3c\3c\3c\3d\3d\3d\7d\u0543\nd\fd\16d\u0546\13d\3e\5e\u0549\ne\3"+
		"e\3e\5e\u054d\ne\3e\3e\7e\u0551\ne\fe\16e\u0554\13e\3f\3f\3g\3g\3g\3g"+
		"\7g\u055c\ng\fg\16g\u055f\13g\3g\3g\3h\3h\3h\3h\5h\u0567\nh\5h\u0569\n"+
		"h\3i\3i\3i\3i\5i\u056f\ni\3j\3j\5j\u0573\nj\3j\3j\3j\2\3\u00a8k\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRT"+
		"VXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e"+
		"\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6"+
		"\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be"+
		"\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\2\16\4\2"+
		"\23\23**\3\2tw\3\2xy\3\2QT\3\2GH\4\2UVZZ\3\2ST\4\2EFLM\4\2KKNN\4\2DD]"+
		"g\3\2QR\n\2\5\5\7\7\n\n\20\20\26\26\35\35\37\37\'\'\2\u0611\2\u00d5\3"+
		"\2\2\2\4\u00e8\3\2\2\2\6\u00ef\3\2\2\2\b\u0107\3\2\2\2\n\u010e\3\2\2\2"+
		"\f\u0118\3\2\2\2\16\u011c\3\2\2\2\20\u011e\3\2\2\2\22\u012d\3\2\2\2\24"+
		"\u013b\3\2\2\2\26\u0143\3\2\2\2\30\u014b\3\2\2\2\32\u015d\3\2\2\2\34\u0168"+
		"\3\2\2\2\36\u0172\3\2\2\2 \u0179\3\2\2\2\"\u0184\3\2\2\2$\u018d\3\2\2"+
		"\2&\u01a2\3\2\2\2(\u01ad\3\2\2\2*\u01af\3\2\2\2,\u01c1\3\2\2\2.\u01c5"+
		"\3\2\2\2\60\u01c7\3\2\2\2\62\u01ca\3\2\2\2\64\u01cd\3\2\2\2\66\u01d5\3"+
		"\2\2\28\u01e1\3\2\2\2:\u01ea\3\2\2\2<\u01ec\3\2\2\2>\u01f7\3\2\2\2@\u0205"+
		"\3\2\2\2B\u0229\3\2\2\2D\u022b\3\2\2\2F\u022e\3\2\2\2H\u0236\3\2\2\2J"+
		"\u023b\3\2\2\2L\u0245\3\2\2\2N\u0247\3\2\2\2P\u0257\3\2\2\2R\u026b\3\2"+
		"\2\2T\u026d\3\2\2\2V\u0275\3\2\2\2X\u0288\3\2\2\2Z\u028d\3\2\2\2\\\u0296"+
		"\3\2\2\2^\u029d\3\2\2\2`\u02ab\3\2\2\2b\u02ad\3\2\2\2d\u02af\3\2\2\2f"+
		"\u02b5\3\2\2\2h\u02be\3\2\2\2j\u02c8\3\2\2\2l\u02d0\3\2\2\2n\u02d7\3\2"+
		"\2\2p\u02d9\3\2\2\2r\u02e9\3\2\2\2t\u02ee\3\2\2\2v\u02ff\3\2\2\2x\u0315"+
		"\3\2\2\2z\u0319\3\2\2\2|\u031b\3\2\2\2~\u0321\3\2\2\2\u0080\u0323\3\2"+
		"\2\2\u0082\u0326\3\2\2\2\u0084\u0334\3\2\2\2\u0086\u0339\3\2\2\2\u0088"+
		"\u034a\3\2\2\2\u008a\u03b4\3\2\2\2\u008c\u03b6\3\2\2\2\u008e\u03c3\3\2"+
		"\2\2\u0090\u03cb\3\2\2\2\u0092\u03ce\3\2\2\2\u0094\u03d5\3\2\2\2\u0096"+
		"\u03e0\3\2\2\2\u0098\u03e9\3\2\2\2\u009a\u03fa\3\2\2\2\u009c\u0408\3\2"+
		"\2\2\u009e\u040c\3\2\2\2\u00a0\u0411\3\2\2\2\u00a2\u0419\3\2\2\2\u00a4"+
		"\u041d\3\2\2\2\u00a6\u0437\3\2\2\2\u00a8\u0458\3\2\2\2\u00aa\u04ad\3\2"+
		"\2\2\u00ac\u04c1\3\2\2\2\u00ae\u04c5\3\2\2\2\u00b0\u04d9\3\2\2\2\u00b2"+
		"\u04de\3\2\2\2\u00b4\u04f3\3\2\2\2\u00b6\u0504\3\2\2\2\u00b8\u0506\3\2"+
		"\2\2\u00ba\u050c\3\2\2\2\u00bc\u052a\3\2\2\2\u00be\u052e\3\2\2\2\u00c0"+
		"\u0534\3\2\2\2\u00c2\u0539\3\2\2\2\u00c4\u053b\3\2\2\2\u00c6\u053f\3\2"+
		"\2\2\u00c8\u0548\3\2\2\2\u00ca\u0555\3\2\2\2\u00cc\u0557\3\2\2\2\u00ce"+
		"\u0568\3\2\2\2\u00d0\u056e\3\2\2\2\u00d2\u0570\3\2\2\2\u00d4\u00d6\5\4"+
		"\3\2\u00d5\u00d4\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00da\3\2\2\2\u00d7"+
		"\u00d9\5\6\4\2\u00d8\u00d7\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2"+
		"\2\2\u00da\u00db\3\2\2\2\u00db\u00e0\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd"+
		"\u00df\5\b\5\2\u00de\u00dd\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de\3\2"+
		"\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3"+
		"\u00e4\7\2\2\3\u00e4\3\3\2\2\2\u00e5\u00e7\5h\65\2\u00e6\u00e5\3\2\2\2"+
		"\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00eb"+
		"\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00ec\7\"\2\2\u00ec\u00ed\5^\60\2\u00ed"+
		"\u00ee\7A\2\2\u00ee\5\3\2\2\2\u00ef\u00f1\7\33\2\2\u00f0\u00f2\7(\2\2"+
		"\u00f1\u00f0\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f6"+
		"\5^\60\2\u00f4\u00f5\7C\2\2\u00f5\u00f7\7U\2\2\u00f6\u00f4\3\2\2\2\u00f6"+
		"\u00f7\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\7A\2\2\u00f9\7\3\2\2\2"+
		"\u00fa\u00fc\5\f\7\2\u00fb\u00fa\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb"+
		"\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0104\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100"+
		"\u0105\5\20\t\2\u0101\u0105\5\30\r\2\u0102\u0105\5 \21\2\u0103\u0105\5"+
		"r:\2\u0104\u0100\3\2\2\2\u0104\u0101\3\2\2\2\u0104\u0102\3\2\2\2\u0104"+
		"\u0103\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0108\7A\2\2\u0107\u00fd\3\2"+
		"\2\2\u0107\u0106\3\2\2\2\u0108\t\3\2\2\2\u0109\u010f\5\f\7\2\u010a\u010f"+
		"\7 \2\2\u010b\u010f\7,\2\2\u010c\u010f\7\60\2\2\u010d\u010f\7\63\2\2\u010e"+
		"\u0109\3\2\2\2\u010e\u010a\3\2\2\2\u010e\u010b\3\2\2\2\u010e\u010c\3\2"+
		"\2\2\u010e\u010d\3\2\2\2\u010f\13\3\2\2\2\u0110\u0119\5h\65\2\u0111\u0119"+
		"\7%\2\2\u0112\u0119\7$\2\2\u0113\u0119\7#\2\2\u0114\u0119\7(\2\2\u0115"+
		"\u0119\7\3\2\2\u0116\u0119\7\24\2\2\u0117\u0119\7)\2\2\u0118\u0110\3\2"+
		"\2\2\u0118\u0111\3\2\2\2\u0118\u0112\3\2\2\2\u0118\u0113\3\2\2\2\u0118"+
		"\u0114\3\2\2\2\u0118\u0115\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0117\3\2"+
		"\2\2\u0119\r\3\2\2\2\u011a\u011d\7\24\2\2\u011b\u011d\5h\65\2\u011c\u011a"+
		"\3\2\2\2\u011c\u011b\3\2\2\2\u011d\17\3\2\2\2\u011e\u011f\7\13\2\2\u011f"+
		"\u0121\7o\2\2\u0120\u0122\5\22\n\2\u0121\u0120\3\2\2\2\u0121\u0122\3\2"+
		"\2\2\u0122\u0125\3\2\2\2\u0123\u0124\7\23\2\2\u0124\u0126\5\u00c8e\2\u0125"+
		"\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0129\3\2\2\2\u0127\u0128\7\32"+
		"\2\2\u0128\u012a\5\u00c6d\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a"+
		"\u012b\3\2\2\2\u012b\u012c\5\"\22\2\u012c\21\3\2\2\2\u012d\u012e\7F\2"+
		"\2\u012e\u0133\5\24\13\2\u012f\u0130\7B\2\2\u0130\u0132\5\24\13\2\u0131"+
		"\u012f\3\2\2\2\u0132\u0135\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2"+
		"\2\2\u0134\u0136\3\2\2\2\u0135\u0133\3\2\2\2\u0136\u0137\7E\2\2\u0137"+
		"\23\3\2\2\2\u0138\u013a\5h\65\2\u0139\u0138\3\2\2\2\u013a\u013d\3\2\2"+
		"\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013e\3\2\2\2\u013d\u013b"+
		"\3\2\2\2\u013e\u0141\7o\2\2\u013f\u0140\7\23\2\2\u0140\u0142\5\26\f\2"+
		"\u0141\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\25\3\2\2\2\u0143\u0148"+
		"\5\u00c8e\2\u0144\u0145\7W\2\2\u0145\u0147\5\u00c8e\2\u0146\u0144\3\2"+
		"\2\2\u0147\u014a\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149"+
		"\27\3\2\2\2\u014a\u0148\3\2\2\2\u014b\u014c\7\22\2\2\u014c\u014f\7o\2"+
		"\2\u014d\u014e\7\32\2\2\u014e\u0150\5\u00c6d\2\u014f\u014d\3\2\2\2\u014f"+
		"\u0150\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0153\7=\2\2\u0152\u0154\5\32"+
		"\16\2\u0153\u0152\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0156\3\2\2\2\u0155"+
		"\u0157\7B\2\2\u0156\u0155\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0159\3\2"+
		"\2\2\u0158\u015a\5\36\20\2\u0159\u0158\3\2\2\2\u0159\u015a\3\2\2\2\u015a"+
		"\u015b\3\2\2\2\u015b\u015c\7>\2\2\u015c\31\3\2\2\2\u015d\u0162\5\34\17"+
		"\2\u015e\u015f\7B\2\2\u015f\u0161\5\34\17\2\u0160\u015e\3\2\2\2\u0161"+
		"\u0164\3\2\2\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163\33\3\2\2"+
		"\2\u0164\u0162\3\2\2\2\u0165\u0167\5h\65\2\u0166\u0165\3\2\2\2\u0167\u016a"+
		"\3\2\2\2\u0168\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016b\3\2\2\2\u016a"+
		"\u0168\3\2\2\2\u016b\u016d\7o\2\2\u016c\u016e\5\u00d2j\2\u016d\u016c\3"+
		"\2\2\2\u016d\u016e\3\2\2\2\u016e\u0170\3\2\2\2\u016f\u0171\5\"\22\2\u0170"+
		"\u016f\3\2\2\2\u0170\u0171\3\2\2\2\u0171\35\3\2\2\2\u0172\u0176\7A\2\2"+
		"\u0173\u0175\5&\24\2\u0174\u0173\3\2\2\2\u0175\u0178\3\2\2\2\u0176\u0174"+
		"\3\2\2\2\u0176\u0177\3\2\2\2\u0177\37\3\2\2\2\u0178\u0176\3\2\2\2\u0179"+
		"\u017a\7\36\2\2\u017a\u017c\7o\2\2\u017b\u017d\5\22\n\2\u017c\u017b\3"+
		"\2\2\2\u017c\u017d\3\2\2\2\u017d\u0180\3\2\2\2\u017e\u017f\7\23\2\2\u017f"+
		"\u0181\5\u00c6d\2\u0180\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0182"+
		"\3\2\2\2\u0182\u0183\5$\23\2\u0183!\3\2\2\2\u0184\u0188\7=\2\2\u0185\u0187"+
		"\5&\24\2\u0186\u0185\3\2\2\2\u0187\u018a\3\2\2\2\u0188\u0186\3\2\2\2\u0188"+
		"\u0189\3\2\2\2\u0189\u018b\3\2\2\2\u018a\u0188\3\2\2\2\u018b\u018c\7>"+
		"\2\2\u018c#\3\2\2\2\u018d\u0191\7=\2\2\u018e\u0190\58\35\2\u018f\u018e"+
		"\3\2\2\2\u0190\u0193\3\2\2\2\u0191\u018f\3\2\2\2\u0191\u0192\3\2\2\2\u0192"+
		"\u0194\3\2\2\2\u0193\u0191\3\2\2\2\u0194\u0195\7>\2\2\u0195%\3\2\2\2\u0196"+
		"\u01a3\7A\2\2\u0197\u0199\7(\2\2\u0198\u0197\3\2\2\2\u0198\u0199\3\2\2"+
		"\2\u0199\u019a\3\2\2\2\u019a\u01a3\5\u0082B\2\u019b\u019d\5\n\6\2\u019c"+
		"\u019b\3\2\2\2\u019d\u01a0\3\2\2\2\u019e\u019c\3\2\2\2\u019e\u019f\3\2"+
		"\2\2\u019f\u01a1\3\2\2\2\u01a0\u019e\3\2\2\2\u01a1\u01a3\5(\25\2\u01a2"+
		"\u0196\3\2\2\2\u01a2\u0198\3\2\2\2\u01a2\u019e\3\2\2\2\u01a3\'\3\2\2\2"+
		"\u01a4\u01ae\5*\26\2\u01a5\u01ae\5\60\31\2\u01a6\u01ae\5\66\34\2\u01a7"+
		"\u01ae\5\64\33\2\u01a8\u01ae\5\62\32\2\u01a9\u01ae\5 \21\2\u01aa\u01ae"+
		"\5r:\2\u01ab\u01ae\5\20\t\2\u01ac\u01ae\5\30\r\2\u01ad\u01a4\3\2\2\2\u01ad"+
		"\u01a5\3\2\2\2\u01ad\u01a6\3\2\2\2\u01ad\u01a7\3\2\2\2\u01ad\u01a8\3\2"+
		"\2\2\u01ad\u01a9\3\2\2\2\u01ad\u01aa\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ad"+
		"\u01ac\3\2\2\2\u01ae)\3\2\2\2\u01af\u01b0\5.\30\2\u01b0\u01b1\7o\2\2\u01b1"+
		"\u01b6\5V,\2\u01b2\u01b3\7?\2\2\u01b3\u01b5\7@\2\2\u01b4\u01b2\3\2\2\2"+
		"\u01b5\u01b8\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01bb"+
		"\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b9\u01ba\7/\2\2\u01ba\u01bc\5T+\2\u01bb"+
		"\u01b9\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01be\5,"+
		"\27\2\u01be+\3\2\2\2\u01bf\u01c2\5\u0082B\2\u01c0\u01c2\7A\2\2\u01c1\u01bf"+
		"\3\2\2\2\u01c1\u01c0\3\2\2\2\u01c2-\3\2\2\2\u01c3\u01c6\5\u00c8e\2\u01c4"+
		"\u01c6\7\62\2\2\u01c5\u01c3\3\2\2\2\u01c5\u01c4\3\2\2\2\u01c6/\3\2\2\2"+
		"\u01c7\u01c8\5\22\n\2\u01c8\u01c9\5*\26\2\u01c9\61\3\2\2\2\u01ca\u01cb"+
		"\5\22\n\2\u01cb\u01cc\5\64\33\2\u01cc\63\3\2\2\2\u01cd\u01ce\7o\2\2\u01ce"+
		"\u01d1\5V,\2\u01cf\u01d0\7/\2\2\u01d0\u01d2\5T+\2\u01d1\u01cf\3\2\2\2"+
		"\u01d1\u01d2\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d4\5\u0082B\2\u01d4"+
		"\65\3\2\2\2\u01d5\u01d6\5\u00c8e\2\u01d6\u01d7\5F$\2\u01d7\u01d8\7A\2"+
		"\2\u01d8\67\3\2\2\2\u01d9\u01db\5\n\6\2\u01da\u01d9\3\2\2\2\u01db\u01de"+
		"\3\2\2\2\u01dc\u01da\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01df\3\2\2\2\u01de"+
		"\u01dc\3\2\2\2\u01df\u01e2\5:\36\2\u01e0\u01e2\7A\2\2\u01e1\u01dc\3\2"+
		"\2\2\u01e1\u01e0\3\2\2\2\u01e29\3\2\2\2\u01e3\u01eb\5<\37\2\u01e4\u01eb"+
		"\5@!\2\u01e5\u01eb\5D#\2\u01e6\u01eb\5 \21\2\u01e7\u01eb\5r:\2\u01e8\u01eb"+
		"\5\20\t\2\u01e9\u01eb\5\30\r\2\u01ea\u01e3\3\2\2\2\u01ea\u01e4\3\2\2\2"+
		"\u01ea\u01e5\3\2\2\2\u01ea\u01e6\3\2\2\2\u01ea\u01e7\3\2\2\2\u01ea\u01e8"+
		"\3\2\2\2\u01ea\u01e9\3\2\2\2\u01eb;\3\2\2\2\u01ec\u01ed\5\u00c8e\2\u01ed"+
		"\u01f2\5> \2\u01ee\u01ef\7B\2\2\u01ef\u01f1\5> \2\u01f0\u01ee\3\2\2\2"+
		"\u01f1\u01f4\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f5"+
		"\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f5\u01f6\7A\2\2\u01f6=\3\2\2\2\u01f7\u01fc"+
		"\7o\2\2\u01f8\u01f9\7?\2\2\u01f9\u01fb\7@\2\2\u01fa\u01f8\3\2\2\2\u01fb"+
		"\u01fe\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01ff\3\2"+
		"\2\2\u01fe\u01fc\3\2\2\2\u01ff\u0200\7D\2\2\u0200\u0201\5L\'\2\u0201?"+
		"\3\2\2\2\u0202\u0204\5B\"\2\u0203\u0202\3\2\2\2\u0204\u0207\3\2\2\2\u0205"+
		"\u0203\3\2\2\2\u0205\u0206\3\2\2\2\u0206\u0212\3\2\2\2\u0207\u0205\3\2"+
		"\2\2\u0208\u0213\5.\30\2\u0209\u020d\5\22\n\2\u020a\u020c\5h\65\2\u020b"+
		"\u020a\3\2\2\2\u020c\u020f\3\2\2\2\u020d\u020b\3\2\2\2\u020d\u020e\3\2"+
		"\2\2\u020e\u0210\3\2\2\2\u020f\u020d\3\2\2\2\u0210\u0211\5.\30\2\u0211"+
		"\u0213\3\2\2\2\u0212\u0208\3\2\2\2\u0212\u0209\3\2\2\2\u0213\u0214\3\2"+
		"\2\2\u0214\u0215\7o\2\2\u0215\u021a\5V,\2\u0216\u0217\7?\2\2\u0217\u0219"+
		"\7@\2\2\u0218\u0216\3\2\2\2\u0219\u021c\3\2\2\2\u021a\u0218\3\2\2\2\u021a"+
		"\u021b\3\2\2\2\u021b\u021f\3\2\2\2\u021c\u021a\3\2\2\2\u021d\u021e\7/"+
		"\2\2\u021e\u0220\5T+\2\u021f\u021d\3\2\2\2\u021f\u0220\3\2\2\2\u0220\u0221"+
		"\3\2\2\2\u0221\u0222\5,\27\2\u0222A\3\2\2\2\u0223\u022a\5h\65\2\u0224"+
		"\u022a\7%\2\2\u0225\u022a\7\3\2\2\u0226\u022a\7\16\2\2\u0227\u022a\7("+
		"\2\2\u0228\u022a\7)\2\2\u0229\u0223\3\2\2\2\u0229\u0224\3\2\2\2\u0229"+
		"\u0225\3\2\2\2\u0229\u0226\3\2\2\2\u0229\u0227\3\2\2\2\u0229\u0228\3\2"+
		"\2\2\u022aC\3\2\2\2\u022b\u022c\5\22\n\2\u022c\u022d\5@!\2\u022dE\3\2"+
		"\2\2\u022e\u0233\5H%\2\u022f\u0230\7B\2\2\u0230\u0232\5H%\2\u0231\u022f"+
		"\3\2\2\2\u0232\u0235\3\2\2\2\u0233\u0231\3\2\2\2\u0233\u0234\3\2\2\2\u0234"+
		"G\3\2\2\2\u0235\u0233\3\2\2\2\u0236\u0239\5J&\2\u0237\u0238\7D\2\2\u0238"+
		"\u023a\5L\'\2\u0239\u0237\3\2\2\2\u0239\u023a\3\2\2\2\u023aI\3\2\2\2\u023b"+
		"\u0240\7o\2\2\u023c\u023d\7?\2\2\u023d\u023f\7@\2\2\u023e\u023c\3\2\2"+
		"\2\u023f\u0242\3\2\2\2\u0240\u023e\3\2\2\2\u0240\u0241\3\2\2\2\u0241K"+
		"\3\2\2\2\u0242\u0240\3\2\2\2\u0243\u0246\5N(\2\u0244\u0246\5\u00a8U\2"+
		"\u0245\u0243\3\2\2\2\u0245\u0244\3\2\2\2\u0246M\3\2\2\2\u0247\u0253\7"+
		"=\2\2\u0248\u024d\5L\'\2\u0249\u024a\7B\2\2\u024a\u024c\5L\'\2\u024b\u0249"+
		"\3\2\2\2\u024c\u024f\3\2\2\2\u024d\u024b\3\2\2\2\u024d\u024e\3\2\2\2\u024e"+
		"\u0251\3\2\2\2\u024f\u024d\3\2\2\2\u0250\u0252\7B\2\2\u0251\u0250\3\2"+
		"\2\2\u0251\u0252\3\2\2\2\u0252\u0254\3\2\2\2\u0253\u0248\3\2\2\2\u0253"+
		"\u0254\3\2\2\2\u0254\u0255\3\2\2\2\u0255\u0256\7>\2\2\u0256O\3\2\2\2\u0257"+
		"\u0259\7o\2\2\u0258\u025a\5\u00ccg\2\u0259\u0258\3\2\2\2\u0259\u025a\3"+
		"\2\2\2\u025a\u0262\3\2\2\2\u025b\u025c\7C\2\2\u025c\u025e\7o\2\2\u025d"+
		"\u025f\5\u00ccg\2\u025e\u025d\3\2\2\2\u025e\u025f\3\2\2\2\u025f\u0261"+
		"\3\2\2\2\u0260\u025b\3\2\2\2\u0261\u0264\3\2\2\2\u0262\u0260\3\2\2\2\u0262"+
		"\u0263\3\2\2\2\u0263Q\3\2\2\2\u0264\u0262\3\2\2\2\u0265\u026c\5\u00c8"+
		"e\2\u0266\u0269\7I\2\2\u0267\u0268\t\2\2\2\u0268\u026a\5\u00c8e\2\u0269"+
		"\u0267\3\2\2\2\u0269\u026a\3\2\2\2\u026a\u026c\3\2\2\2\u026b\u0265\3\2"+
		"\2\2\u026b\u0266\3\2\2\2\u026cS\3\2\2\2\u026d\u0272\5^\60\2\u026e\u026f"+
		"\7B\2\2\u026f\u0271\5^\60\2\u0270\u026e\3\2\2\2\u0271\u0274\3\2\2\2\u0272"+
		"\u0270\3\2\2\2\u0272\u0273\3\2\2\2\u0273U\3\2\2\2\u0274\u0272\3\2\2\2"+
		"\u0275\u0277\7;\2\2\u0276\u0278\5X-\2\u0277\u0276\3\2\2\2\u0277\u0278"+
		"\3\2\2\2\u0278\u0279\3\2\2\2\u0279\u027a\7<\2\2\u027aW\3\2\2\2\u027b\u0280"+
		"\5Z.\2\u027c\u027d\7B\2\2\u027d\u027f\5Z.\2\u027e\u027c\3\2\2\2\u027f"+
		"\u0282\3\2\2\2\u0280\u027e\3\2\2\2\u0280\u0281\3\2\2\2\u0281\u0285\3\2"+
		"\2\2\u0282\u0280\3\2\2\2\u0283\u0284\7B\2\2\u0284\u0286\5\\/\2\u0285\u0283"+
		"\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u0289\3\2\2\2\u0287\u0289\5\\/\2\u0288"+
		"\u027b\3\2\2\2\u0288\u0287\3\2\2\2\u0289Y\3\2\2\2\u028a\u028c\5\16\b\2"+
		"\u028b\u028a\3\2\2\2\u028c\u028f\3\2\2\2\u028d\u028b\3\2\2\2\u028d\u028e"+
		"\3\2\2\2\u028e\u0290\3\2\2\2\u028f\u028d\3\2\2\2\u0290\u0291\5\u00c8e"+
		"\2\u0291\u0292\5J&\2\u0292[\3\2\2\2\u0293\u0295\5\16\b\2\u0294\u0293\3"+
		"\2\2\2\u0295\u0298\3\2\2\2\u0296\u0294\3\2\2\2\u0296\u0297\3\2\2\2\u0297"+
		"\u0299\3\2\2\2\u0298\u0296\3\2\2\2\u0299\u029a\5\u00c8e\2\u029a\u029b"+
		"\7k\2\2\u029b\u029c\5J&\2\u029c]\3\2\2\2\u029d\u02a2\7o\2\2\u029e\u029f"+
		"\7C\2\2\u029f\u02a1\7o\2\2\u02a0\u029e\3\2\2\2\u02a1\u02a4\3\2\2\2\u02a2"+
		"\u02a0\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3_\3\2\2\2\u02a4\u02a2\3\2\2\2"+
		"\u02a5\u02ac\5b\62\2\u02a6\u02ac\5d\63\2\u02a7\u02ac\7p\2\2\u02a8\u02ac"+
		"\7q\2\2\u02a9\u02ac\7r\2\2\u02aa\u02ac\7s\2\2\u02ab\u02a5\3\2\2\2\u02ab"+
		"\u02a6\3\2\2\2\u02ab\u02a7\3\2\2\2\u02ab\u02a8\3\2\2\2\u02ab\u02a9\3\2"+
		"\2\2\u02ab\u02aa\3\2\2\2\u02aca\3\2\2\2\u02ad\u02ae\t\3\2\2\u02aec\3\2"+
		"\2\2\u02af\u02b0\t\4\2\2\u02b0e\3\2\2\2\u02b1\u02b2\7o\2\2\u02b2\u02b4"+
		"\7C\2\2\u02b3\u02b1\3\2\2\2\u02b4\u02b7\3\2\2\2\u02b5\u02b3\3\2\2\2\u02b5"+
		"\u02b6\3\2\2\2\u02b6\u02b8\3\2\2\2\u02b7\u02b5\3\2\2\2\u02b8\u02b9\7j"+
		"\2\2\u02b9\u02ba\7o\2\2\u02bag\3\2\2\2\u02bb\u02bc\7j\2\2\u02bc\u02bf"+
		"\5^\60\2\u02bd\u02bf\5f\64\2\u02be\u02bb\3\2\2\2\u02be\u02bd\3\2\2\2\u02bf"+
		"\u02c6\3\2\2\2\u02c0\u02c3\7;\2\2\u02c1\u02c4\5j\66\2\u02c2\u02c4\5n8"+
		"\2\u02c3\u02c1\3\2\2\2\u02c3\u02c2\3\2\2\2\u02c3\u02c4\3\2\2\2\u02c4\u02c5"+
		"\3\2\2\2\u02c5\u02c7\7<\2\2\u02c6\u02c0\3\2\2\2\u02c6\u02c7\3\2\2\2\u02c7"+
		"i\3\2\2\2\u02c8\u02cd\5l\67\2\u02c9\u02ca\7B\2\2\u02ca\u02cc\5l\67\2\u02cb"+
		"\u02c9\3\2\2\2\u02cc\u02cf\3\2\2\2\u02cd\u02cb\3\2\2\2\u02cd\u02ce\3\2"+
		"\2\2\u02cek\3\2\2\2\u02cf\u02cd\3\2\2\2\u02d0\u02d1\7o\2\2\u02d1\u02d2"+
		"\7D\2\2\u02d2\u02d3\5n8\2\u02d3m\3\2\2\2\u02d4\u02d8\5\u00a8U\2\u02d5"+
		"\u02d8\5h\65\2\u02d6\u02d8\5p9\2\u02d7\u02d4\3\2\2\2\u02d7\u02d5\3\2\2"+
		"\2\u02d7\u02d6\3\2\2\2\u02d8o\3\2\2\2\u02d9\u02e2\7=\2\2\u02da\u02df\5"+
		"n8\2\u02db\u02dc\7B\2\2\u02dc\u02de\5n8\2\u02dd\u02db\3\2\2\2\u02de\u02e1"+
		"\3\2\2\2\u02df\u02dd\3\2\2\2\u02df\u02e0\3\2\2\2\u02e0\u02e3\3\2\2\2\u02e1"+
		"\u02df\3\2\2\2\u02e2\u02da\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3\u02e5\3\2"+
		"\2\2\u02e4\u02e6\7B\2\2\u02e5\u02e4\3\2\2\2\u02e5\u02e6\3\2\2\2\u02e6"+
		"\u02e7\3\2\2\2\u02e7\u02e8\7>\2\2\u02e8q\3\2\2\2\u02e9\u02ea\7j\2\2\u02ea"+
		"\u02eb\7\36\2\2\u02eb\u02ec\7o\2\2\u02ec\u02ed\5t;\2\u02eds\3\2\2\2\u02ee"+
		"\u02f2\7=\2\2\u02ef\u02f1\5v<\2\u02f0\u02ef\3\2\2\2\u02f1\u02f4\3\2\2"+
		"\2\u02f2\u02f0\3\2\2\2\u02f2\u02f3\3\2\2\2\u02f3\u02f5\3\2\2\2\u02f4\u02f2"+
		"\3\2\2\2\u02f5\u02f6\7>\2\2\u02f6u\3\2\2\2\u02f7\u02f9\5\n\6\2\u02f8\u02f7"+
		"\3\2\2\2\u02f9\u02fc\3\2\2\2\u02fa\u02f8\3\2\2\2\u02fa\u02fb\3\2\2\2\u02fb"+
		"\u02fd\3\2\2\2\u02fc\u02fa\3\2\2\2\u02fd\u0300\5x=\2\u02fe\u0300\7A\2"+
		"\2\u02ff\u02fa\3\2\2\2\u02ff\u02fe\3\2\2\2\u0300w\3\2\2\2\u0301\u0302"+
		"\5\u00c8e\2\u0302\u0303\5z>\2\u0303\u0304\7A\2\2\u0304\u0316\3\2\2\2\u0305"+
		"\u0307\5\20\t\2\u0306\u0308\7A\2\2\u0307\u0306\3\2\2\2\u0307\u0308\3\2"+
		"\2\2\u0308\u0316\3\2\2\2\u0309\u030b\5 \21\2\u030a\u030c\7A\2\2\u030b"+
		"\u030a\3\2\2\2\u030b\u030c\3\2\2\2\u030c\u0316\3\2\2\2\u030d\u030f\5\30"+
		"\r\2\u030e\u0310\7A\2\2\u030f\u030e\3\2\2\2\u030f\u0310\3\2\2\2\u0310"+
		"\u0316\3\2\2\2\u0311\u0313\5r:\2\u0312\u0314\7A\2\2\u0313\u0312\3\2\2"+
		"\2\u0313\u0314\3\2\2\2\u0314\u0316\3\2\2\2\u0315\u0301\3\2\2\2\u0315\u0305"+
		"\3\2\2\2\u0315\u0309\3\2\2\2\u0315\u030d\3\2\2\2\u0315\u0311\3\2\2\2\u0316"+
		"y\3\2\2\2\u0317\u031a\5|?\2\u0318\u031a\5~@\2\u0319\u0317\3\2\2\2\u0319"+
		"\u0318\3\2\2\2\u031a{\3\2\2\2\u031b\u031c\7o\2\2\u031c\u031d\7;\2\2\u031d"+
		"\u031f\7<\2\2\u031e\u0320\5\u0080A\2\u031f\u031e\3\2\2\2\u031f\u0320\3"+
		"\2\2\2\u0320}\3\2\2\2\u0321\u0322\5F$\2\u0322\177\3\2\2\2\u0323\u0324"+
		"\7\16\2\2\u0324\u0325\5n8\2\u0325\u0081\3\2\2\2\u0326\u032a\7=\2\2\u0327"+
		"\u0329\5\u0084C\2\u0328\u0327\3\2\2\2\u0329\u032c\3\2\2\2\u032a\u0328"+
		"\3\2\2\2\u032a\u032b\3\2\2\2\u032b\u032d\3\2\2\2\u032c\u032a\3\2\2\2\u032d"+
		"\u032e\7>\2\2\u032e\u0083\3\2\2\2\u032f\u0330\5\u0086D\2\u0330\u0331\7"+
		"A\2\2\u0331\u0335\3\2\2\2\u0332\u0335\5\u008aF\2\u0333\u0335\5\u0088E"+
		"\2\u0334\u032f\3\2\2\2\u0334\u0332\3\2\2\2\u0334\u0333\3\2\2\2\u0335\u0085"+
		"\3\2\2\2\u0336\u0338\5\16\b\2\u0337\u0336\3\2\2\2\u0338\u033b\3\2\2\2"+
		"\u0339\u0337\3\2\2\2\u0339\u033a\3\2\2\2\u033a\u033c\3\2\2\2\u033b\u0339"+
		"\3\2\2\2\u033c\u033d\5\u00c8e\2\u033d\u033e\5F$\2\u033e\u0087\3\2\2\2"+
		"\u033f\u0341\5\f\7\2\u0340\u033f\3\2\2\2\u0341\u0344\3\2\2\2\u0342\u0340"+
		"\3\2\2\2\u0342\u0343\3\2\2\2\u0343\u0347\3\2\2\2\u0344\u0342\3\2\2\2\u0345"+
		"\u0348\5\20\t\2\u0346\u0348\5 \21\2\u0347\u0345\3\2\2\2\u0347\u0346\3"+
		"\2\2\2\u0348\u034b\3\2\2\2\u0349\u034b\7A\2\2\u034a\u0342\3\2\2\2\u034a"+
		"\u0349\3\2\2\2\u034b\u0089\3\2\2\2\u034c\u03b5\5\u0082B\2\u034d\u034e"+
		"\7\4\2\2\u034e\u0351\5\u00a8U\2\u034f\u0350\7J\2\2\u0350\u0352\5\u00a8"+
		"U\2\u0351\u034f\3\2\2\2\u0351\u0352\3\2\2\2\u0352\u0353\3\2\2\2\u0353"+
		"\u0354\7A\2\2\u0354\u03b5\3\2\2\2\u0355\u0356\7\30\2\2\u0356\u0357\5\u00a2"+
		"R\2\u0357\u035a\5\u008aF\2\u0358\u0359\7\21\2\2\u0359\u035b\5\u008aF\2"+
		"\u035a\u0358\3\2\2\2\u035a\u035b\3\2\2\2\u035b\u03b5\3\2\2\2\u035c\u035d"+
		"\7\27\2\2\u035d\u035e\7;\2\2\u035e\u035f\5\u009cO\2\u035f\u0360\7<\2\2"+
		"\u0360\u0361\5\u008aF\2\u0361\u03b5\3\2\2\2\u0362\u0363\7\64\2\2\u0363"+
		"\u0364\5\u00a2R\2\u0364\u0365\5\u008aF\2\u0365\u03b5\3\2\2\2\u0366\u0367"+
		"\7\17\2\2\u0367\u0368\5\u008aF\2\u0368\u0369\7\64\2\2\u0369\u036a\5\u00a2"+
		"R\2\u036a\u036b\7A\2\2\u036b\u03b5\3\2\2\2\u036c\u036d\7\61\2\2\u036d"+
		"\u0377\5\u0082B\2\u036e\u0370\5\u008cG\2\u036f\u036e\3\2\2\2\u0370\u0371"+
		"\3\2\2\2\u0371\u036f\3\2\2\2\u0371\u0372\3\2\2\2\u0372\u0374\3\2\2\2\u0373"+
		"\u0375\5\u0090I\2\u0374\u0373\3\2\2\2\u0374\u0375\3\2\2\2\u0375\u0378"+
		"\3\2\2\2\u0376\u0378\5\u0090I\2\u0377\u036f\3\2\2\2\u0377\u0376\3\2\2"+
		"\2\u0378\u03b5\3\2\2\2\u0379\u037a\7\61\2\2\u037a\u037b\5\u0092J\2\u037b"+
		"\u037f\5\u0082B\2\u037c\u037e\5\u008cG\2\u037d\u037c\3\2\2\2\u037e\u0381"+
		"\3\2\2\2\u037f\u037d\3\2\2\2\u037f\u0380\3\2\2\2\u0380\u0383\3\2\2\2\u0381"+
		"\u037f\3\2\2\2\u0382\u0384\5\u0090I\2\u0383\u0382\3\2\2\2\u0383\u0384"+
		"\3\2\2\2\u0384\u03b5\3\2\2\2\u0385\u0386\7+\2\2\u0386\u0387\5\u00a2R\2"+
		"\u0387\u038b\7=\2\2\u0388\u038a\5\u0098M\2\u0389\u0388\3\2\2\2\u038a\u038d"+
		"\3\2\2\2\u038b\u0389\3\2\2\2\u038b\u038c\3\2\2\2\u038c\u0391\3\2\2\2\u038d"+
		"\u038b\3\2\2\2\u038e\u0390\5\u009aN\2\u038f\u038e\3\2\2\2\u0390\u0393"+
		"\3\2\2\2\u0391\u038f\3\2\2\2\u0391\u0392\3\2\2\2\u0392\u0394\3\2\2\2\u0393"+
		"\u0391\3\2\2\2\u0394\u0395\7>\2\2\u0395\u03b5\3\2\2\2\u0396\u0397\7,\2"+
		"\2\u0397\u0398\5\u00a2R\2\u0398\u0399\5\u0082B\2\u0399\u03b5\3\2\2\2\u039a"+
		"\u039c\7&\2\2\u039b\u039d\5\u00a8U\2\u039c\u039b\3\2\2\2\u039c\u039d\3"+
		"\2\2\2\u039d\u039e\3\2\2\2\u039e\u03b5\7A\2\2\u039f\u03a0\7.\2\2\u03a0"+
		"\u03a1\5\u00a8U\2\u03a1\u03a2\7A\2\2\u03a2\u03b5\3\2\2\2\u03a3\u03a5\7"+
		"\6\2\2\u03a4\u03a6\7o\2\2\u03a5\u03a4\3\2\2\2\u03a5\u03a6\3\2\2\2\u03a6"+
		"\u03a7\3\2\2\2\u03a7\u03b5\7A\2\2\u03a8\u03aa\7\r\2\2\u03a9\u03ab\7o\2"+
		"\2\u03aa\u03a9\3\2\2\2\u03aa\u03ab\3\2\2\2\u03ab\u03ac\3\2\2\2\u03ac\u03b5"+
		"\7A\2\2\u03ad\u03b5\7A\2\2\u03ae\u03af\5\u00a8U\2\u03af\u03b0\7A\2\2\u03b0"+
		"\u03b5\3\2\2\2\u03b1\u03b2\7o\2\2\u03b2\u03b3\7J\2\2\u03b3\u03b5\5\u008a"+
		"F\2\u03b4\u034c\3\2\2\2\u03b4\u034d\3\2\2\2\u03b4\u0355\3\2\2\2\u03b4"+
		"\u035c\3\2\2\2\u03b4\u0362\3\2\2\2\u03b4\u0366\3\2\2\2\u03b4\u036c\3\2"+
		"\2\2\u03b4\u0379\3\2\2\2\u03b4\u0385\3\2\2\2\u03b4\u0396\3\2\2\2\u03b4"+
		"\u039a\3\2\2\2\u03b4\u039f\3\2\2\2\u03b4\u03a3\3\2\2\2\u03b4\u03a8\3\2"+
		"\2\2\u03b4\u03ad\3\2\2\2\u03b4\u03ae\3\2\2\2\u03b4\u03b1\3\2\2\2\u03b5"+
		"\u008b\3\2\2\2\u03b6\u03b7\7\t\2\2\u03b7\u03bb\7;\2\2\u03b8\u03ba\5\16"+
		"\b\2\u03b9\u03b8\3\2\2\2\u03ba\u03bd\3\2\2\2\u03bb\u03b9\3\2\2\2\u03bb"+
		"\u03bc\3\2\2\2\u03bc\u03be\3\2\2\2\u03bd\u03bb\3\2\2\2\u03be\u03bf\5\u008e"+
		"H\2\u03bf\u03c0\7o\2\2\u03c0\u03c1\7<\2\2\u03c1\u03c2\5\u0082B\2\u03c2"+
		"\u008d\3\2\2\2\u03c3\u03c8\5^\60\2\u03c4\u03c5\7X\2\2\u03c5\u03c7\5^\60"+
		"\2\u03c6\u03c4\3\2\2\2\u03c7\u03ca\3\2\2\2\u03c8\u03c6\3\2\2\2\u03c8\u03c9"+
		"\3\2\2\2\u03c9\u008f\3\2\2\2\u03ca\u03c8\3\2\2\2\u03cb\u03cc\7\25\2\2"+
		"\u03cc\u03cd\5\u0082B\2\u03cd\u0091\3\2\2\2\u03ce\u03cf\7;\2\2\u03cf\u03d1"+
		"\5\u0094K\2\u03d0\u03d2\7A\2\2\u03d1\u03d0\3\2\2\2\u03d1\u03d2\3\2\2\2"+
		"\u03d2\u03d3\3\2\2\2\u03d3\u03d4\7<\2\2\u03d4\u0093\3\2\2\2\u03d5\u03da"+
		"\5\u0096L\2\u03d6\u03d7\7A\2\2\u03d7\u03d9\5\u0096L\2\u03d8\u03d6\3\2"+
		"\2\2\u03d9\u03dc\3\2\2\2\u03da\u03d8\3\2\2\2\u03da\u03db\3\2\2\2\u03db"+
		"\u0095\3\2\2\2\u03dc\u03da\3\2\2\2\u03dd\u03df\5\16\b\2\u03de\u03dd\3"+
		"\2\2\2\u03df\u03e2\3\2\2\2\u03e0\u03de\3\2\2\2\u03e0\u03e1\3\2\2\2\u03e1"+
		"\u03e3\3\2\2\2\u03e2\u03e0\3\2\2\2\u03e3\u03e4\5P)\2\u03e4\u03e5\5J&\2"+
		"\u03e5\u03e6\7D\2\2\u03e6\u03e7\5\u00a8U\2\u03e7\u0097\3\2\2\2\u03e8\u03ea"+
		"\5\u009aN\2\u03e9\u03e8\3\2\2\2\u03ea\u03eb\3\2\2\2\u03eb\u03e9\3\2\2"+
		"\2\u03eb\u03ec\3\2\2\2\u03ec\u03ee\3\2\2\2\u03ed\u03ef\5\u0084C\2\u03ee"+
		"\u03ed\3\2\2\2\u03ef\u03f0\3\2\2\2\u03f0\u03ee\3\2\2\2\u03f0\u03f1\3\2"+
		"\2\2\u03f1\u0099\3\2\2\2\u03f2\u03f5\7\b\2\2\u03f3\u03f6\5\u00a8U\2\u03f4"+
		"\u03f6\7o\2\2\u03f5\u03f3\3\2\2\2\u03f5\u03f4\3\2\2\2\u03f6\u03f7\3\2"+
		"\2\2\u03f7\u03fb\7J\2\2\u03f8\u03f9\7\16\2\2\u03f9\u03fb\7J\2\2\u03fa"+
		"\u03f2\3\2\2\2\u03fa\u03f8\3\2\2\2\u03fb\u009b\3\2\2\2\u03fc\u0409\5\u00a0"+
		"Q\2\u03fd\u03ff\5\u009eP\2\u03fe\u03fd\3\2\2\2\u03fe\u03ff\3\2\2\2\u03ff"+
		"\u0400\3\2\2\2\u0400\u0402\7A\2\2\u0401\u0403\5\u00a8U\2\u0402\u0401\3"+
		"\2\2\2\u0402\u0403\3\2\2\2\u0403\u0404\3\2\2\2\u0404\u0406\7A\2\2\u0405"+
		"\u0407\5\u00a4S\2\u0406\u0405\3\2\2\2\u0406\u0407\3\2\2\2\u0407\u0409"+
		"\3\2\2\2\u0408\u03fc\3\2\2\2\u0408\u03fe\3\2\2\2\u0409\u009d\3\2\2\2\u040a"+
		"\u040d\5\u0086D\2\u040b\u040d\5\u00a4S\2\u040c\u040a\3\2\2\2\u040c\u040b"+
		"\3\2\2\2\u040d\u009f\3\2\2\2\u040e\u0410\5\16\b\2\u040f\u040e\3\2\2\2"+
		"\u0410\u0413\3\2\2\2\u0411\u040f\3\2\2\2\u0411\u0412\3\2\2\2\u0412\u0414"+
		"\3\2\2\2\u0413\u0411\3\2\2\2\u0414\u0415\5\u00c8e\2\u0415\u0416\5J&\2"+
		"\u0416\u0417\7J\2\2\u0417\u0418\5\u00a8U\2\u0418\u00a1\3\2\2\2\u0419\u041a"+
		"\7;\2\2\u041a\u041b\5\u00a8U\2\u041b\u041c\7<\2\2\u041c\u00a3\3\2\2\2"+
		"\u041d\u0422\5\u00a8U\2\u041e\u041f\7B\2\2\u041f\u0421\5\u00a8U\2\u0420"+
		"\u041e\3\2\2\2\u0421\u0424\3\2\2\2\u0422\u0420\3\2\2\2\u0422\u0423\3\2"+
		"\2\2\u0423\u00a5\3\2\2\2\u0424\u0422\3\2\2\2\u0425\u0426\7o\2\2\u0426"+
		"\u0428\7;\2\2\u0427\u0429\5\u00a4S\2\u0428\u0427\3\2\2\2\u0428\u0429\3"+
		"\2\2\2\u0429\u042a\3\2\2\2\u042a\u0438\7<\2\2\u042b\u042c\7-\2\2\u042c"+
		"\u042e\7;\2\2\u042d\u042f\5\u00a4S\2\u042e\u042d\3\2\2\2\u042e\u042f\3"+
		"\2\2\2\u042f\u0430\3\2\2\2\u0430\u0438\7<\2\2\u0431\u0432\7*\2\2\u0432"+
		"\u0434\7;\2\2\u0433\u0435\5\u00a4S\2\u0434\u0433\3\2\2\2\u0434\u0435\3"+
		"\2\2\2\u0435\u0436\3\2\2\2\u0436\u0438\7<\2\2\u0437\u0425\3\2\2\2\u0437"+
		"\u042b\3\2\2\2\u0437\u0431\3\2\2\2\u0438\u00a7\3\2\2\2\u0439\u043a\bU"+
		"\1\2\u043a\u0459\5\u00b0Y\2\u043b\u0459\5\u00a6T\2\u043c\u043d\7!\2\2"+
		"\u043d\u0459\5\u00b4[\2\u043e\u043f\7;\2\2\u043f\u0440\5\u00c8e\2\u0440"+
		"\u0441\7<\2\2\u0441\u0442\5\u00a8U\27\u0442\u0459\3\2\2\2\u0443\u0444"+
		"\t\5\2\2\u0444\u0459\5\u00a8U\25\u0445\u0446\t\6\2\2\u0446\u0459\5\u00a8"+
		"U\24\u0447\u0459\5\u00aaV\2\u0448\u0449\5\u00c8e\2\u0449\u044f\7\\\2\2"+
		"\u044a\u044c\5\u00ccg\2\u044b\u044a\3\2\2\2\u044b\u044c\3\2\2\2\u044c"+
		"\u044d\3\2\2\2\u044d\u0450\7o\2\2\u044e\u0450\7!\2\2\u044f\u044b\3\2\2"+
		"\2\u044f\u044e\3\2\2\2\u0450\u0459\3\2\2\2\u0451\u0452\5\u00b2Z\2\u0452"+
		"\u0454\7\\\2\2\u0453\u0455\5\u00ccg\2\u0454\u0453\3\2\2\2\u0454\u0455"+
		"\3\2\2\2\u0455\u0456\3\2\2\2\u0456\u0457\7!\2\2\u0457\u0459\3\2\2\2\u0458"+
		"\u0439\3\2\2\2\u0458\u043b\3\2\2\2\u0458\u043c\3\2\2\2\u0458\u043e\3\2"+
		"\2\2\u0458\u0443\3\2\2\2\u0458\u0445\3\2\2\2\u0458\u0447\3\2\2\2\u0458"+
		"\u0448\3\2\2\2\u0458\u0451\3\2\2\2\u0459\u04aa\3\2\2\2\u045a\u045b\f\23"+
		"\2\2\u045b\u045c\t\7\2\2\u045c\u04a9\5\u00a8U\24\u045d\u045e\f\22\2\2"+
		"\u045e\u045f\t\b\2\2\u045f\u04a9\5\u00a8U\23\u0460\u0468\f\21\2\2\u0461"+
		"\u0462\7F\2\2\u0462\u0469\7F\2\2\u0463\u0464\7E\2\2\u0464\u0465\7E\2\2"+
		"\u0465\u0469\7E\2\2\u0466\u0467\7E\2\2\u0467\u0469\7E\2\2\u0468\u0461"+
		"\3\2\2\2\u0468\u0463\3\2\2\2\u0468\u0466\3\2\2\2\u0469\u046a\3\2\2\2\u046a"+
		"\u04a9\5\u00a8U\22\u046b\u046c\f\20\2\2\u046c\u046d\t\t\2\2\u046d\u04a9"+
		"\5\u00a8U\21\u046e\u046f\f\16\2\2\u046f\u0470\t\n\2\2\u0470\u04a9\5\u00a8"+
		"U\17\u0471\u0472\f\r\2\2\u0472\u0473\7W\2\2\u0473\u04a9\5\u00a8U\16\u0474"+
		"\u0475\f\f\2\2\u0475\u0476\7Y\2\2\u0476\u04a9\5\u00a8U\r\u0477\u0478\f"+
		"\13\2\2\u0478\u0479\7X\2\2\u0479\u04a9\5\u00a8U\f\u047a\u047b\f\n\2\2"+
		"\u047b\u047c\7O\2\2\u047c\u04a9\5\u00a8U\13\u047d\u047e\f\t\2\2\u047e"+
		"\u047f\7P\2\2\u047f\u04a9\5\u00a8U\n\u0480\u0481\f\b\2\2\u0481\u0482\7"+
		"I\2\2\u0482\u0483\5\u00a8U\2\u0483\u0484\7J\2\2\u0484\u0485\5\u00a8U\b"+
		"\u0485\u04a9\3\2\2\2\u0486\u0487\f\7\2\2\u0487\u0488\t\13\2\2\u0488\u04a9"+
		"\5\u00a8U\7\u0489\u048a\f\33\2\2\u048a\u0496\7C\2\2\u048b\u0497\7o\2\2"+
		"\u048c\u0497\5\u00a6T\2\u048d\u0497\7-\2\2\u048e\u0490\7!\2\2\u048f\u0491"+
		"\5\u00c4c\2\u0490\u048f\3\2\2\2\u0490\u0491\3\2\2\2\u0491\u0492\3\2\2"+
		"\2\u0492\u0497\5\u00b8]\2\u0493\u0494\7*\2\2\u0494\u0497\5\u00ceh\2\u0495"+
		"\u0497\5\u00be`\2\u0496\u048b\3\2\2\2\u0496\u048c\3\2\2\2\u0496\u048d"+
		"\3\2\2\2\u0496\u048e\3\2\2\2\u0496\u0493\3\2\2\2\u0496\u0495\3\2\2\2\u0497"+
		"\u04a9\3\2\2\2\u0498\u0499\f\32\2\2\u0499\u049a\7?\2\2\u049a\u049b\5\u00a8"+
		"U\2\u049b\u049c\7@\2\2\u049c\u04a9\3\2\2\2\u049d\u049e\f\26\2\2\u049e"+
		"\u04a9\t\f\2\2\u049f\u04a0\f\17\2\2\u04a0\u04a1\7\34\2\2\u04a1\u04a9\5"+
		"\u00c8e\2\u04a2\u04a3\f\5\2\2\u04a3\u04a5\7\\\2\2\u04a4\u04a6\5\u00cc"+
		"g\2\u04a5\u04a4\3\2\2\2\u04a5\u04a6\3\2\2\2\u04a6\u04a7\3\2\2\2\u04a7"+
		"\u04a9\7o\2\2\u04a8\u045a\3\2\2\2\u04a8\u045d\3\2\2\2\u04a8\u0460\3\2"+
		"\2\2\u04a8\u046b\3\2\2\2\u04a8\u046e\3\2\2\2\u04a8\u0471\3\2\2\2\u04a8"+
		"\u0474\3\2\2\2\u04a8\u0477\3\2\2\2\u04a8\u047a\3\2\2\2\u04a8\u047d\3\2"+
		"\2\2\u04a8\u0480\3\2\2\2\u04a8\u0486\3\2\2\2\u04a8\u0489\3\2\2\2\u04a8"+
		"\u0498\3\2\2\2\u04a8\u049d\3\2\2\2\u04a8\u049f\3\2\2\2\u04a8\u04a2\3\2"+
		"\2\2\u04a9\u04ac\3\2\2\2\u04aa\u04a8\3\2\2\2\u04aa\u04ab\3\2\2\2\u04ab"+
		"\u00a9\3\2\2\2\u04ac\u04aa\3\2\2\2\u04ad\u04ae\5\u00acW\2\u04ae\u04af"+
		"\7[\2\2\u04af\u04b0\5\u00aeX\2\u04b0\u00ab\3\2\2\2\u04b1\u04c2\7o\2\2"+
		"\u04b2\u04b4\7;\2\2\u04b3\u04b5\5X-\2\u04b4\u04b3\3\2\2\2\u04b4\u04b5"+
		"\3\2\2\2\u04b5\u04b6\3\2\2\2\u04b6\u04c2\7<\2\2\u04b7\u04b8\7;\2\2\u04b8"+
		"\u04bd\7o\2\2\u04b9\u04ba\7B\2\2\u04ba\u04bc\7o\2\2\u04bb\u04b9\3\2\2"+
		"\2\u04bc\u04bf\3\2\2\2\u04bd\u04bb\3\2\2\2\u04bd\u04be\3\2\2\2\u04be\u04c0"+
		"\3\2\2\2\u04bf\u04bd\3\2\2\2\u04c0\u04c2\7<\2\2\u04c1\u04b1\3\2\2\2\u04c1"+
		"\u04b2\3\2\2\2\u04c1\u04b7\3\2\2\2\u04c2\u00ad\3\2\2\2\u04c3\u04c6\5\u00a8"+
		"U\2\u04c4\u04c6\5\u0082B\2\u04c5\u04c3\3\2\2\2\u04c5\u04c4\3\2\2\2\u04c6"+
		"\u00af\3\2\2\2\u04c7\u04c8\7;\2\2\u04c8\u04c9\5\u00a8U\2\u04c9\u04ca\7"+
		"<\2\2\u04ca\u04da\3\2\2\2\u04cb\u04da\7-\2\2\u04cc\u04da\7*\2\2\u04cd"+
		"\u04da\5`\61\2\u04ce\u04da\7o\2\2\u04cf\u04d0\5.\30\2\u04d0\u04d1\7C\2"+
		"\2\u04d1\u04d2\7\13\2\2\u04d2\u04da\3\2\2\2\u04d3\u04d7\5\u00c4c\2\u04d4"+
		"\u04d8\5\u00d0i\2\u04d5\u04d6\7-\2\2\u04d6\u04d8\5\u00d2j\2\u04d7\u04d4"+
		"\3\2\2\2\u04d7\u04d5\3\2\2\2\u04d8\u04da\3\2\2\2\u04d9\u04c7\3\2\2\2\u04d9"+
		"\u04cb\3\2\2\2\u04d9\u04cc\3\2\2\2\u04d9\u04cd\3\2\2\2\u04d9\u04ce\3\2"+
		"\2\2\u04d9\u04cf\3\2\2\2\u04d9\u04d3\3\2\2\2\u04da\u00b1\3\2\2\2\u04db"+
		"\u04dc\5P)\2\u04dc\u04dd\7C\2\2\u04dd\u04df\3\2\2\2\u04de\u04db\3\2\2"+
		"\2\u04de\u04df\3\2\2\2\u04df\u04e3\3\2\2\2\u04e0\u04e2\5h\65\2\u04e1\u04e0"+
		"\3\2\2\2\u04e2\u04e5\3\2\2\2\u04e3\u04e1\3\2\2\2\u04e3\u04e4\3\2\2\2\u04e4"+
		"\u04e6\3\2\2\2\u04e5\u04e3\3\2\2\2\u04e6\u04e8\7o\2\2\u04e7\u04e9\5\u00cc"+
		"g\2\u04e8\u04e7\3\2\2\2\u04e8\u04e9\3\2\2\2\u04e9\u00b3\3\2\2\2\u04ea"+
		"\u04eb\5\u00c4c\2\u04eb\u04ec\5\u00b6\\\2\u04ec\u04ed\5\u00bc_\2\u04ed"+
		"\u04f4\3\2\2\2\u04ee\u04f1\5\u00b6\\\2\u04ef\u04f2\5\u00ba^\2\u04f0\u04f2"+
		"\5\u00bc_\2\u04f1\u04ef\3\2\2\2\u04f1\u04f0\3\2\2\2\u04f2\u04f4\3\2\2"+
		"\2\u04f3\u04ea\3\2\2\2\u04f3\u04ee\3\2\2\2\u04f4\u00b5\3\2\2\2\u04f5\u04f7"+
		"\7o\2\2\u04f6\u04f8\5\u00c0a\2\u04f7\u04f6\3\2\2\2\u04f7\u04f8\3\2\2\2"+
		"\u04f8\u0500\3\2\2\2\u04f9\u04fa\7C\2\2\u04fa\u04fc\7o\2\2\u04fb\u04fd"+
		"\5\u00c0a\2\u04fc\u04fb\3\2\2\2\u04fc\u04fd\3\2\2\2\u04fd\u04ff\3\2\2"+
		"\2\u04fe\u04f9\3\2\2\2\u04ff\u0502\3\2\2\2\u0500\u04fe\3\2\2\2\u0500\u0501"+
		"\3\2\2\2\u0501\u0505\3\2\2\2\u0502\u0500\3\2\2\2\u0503\u0505\5\u00caf"+
		"\2\u0504\u04f5\3\2\2\2\u0504\u0503\3\2\2\2\u0505\u00b7\3\2\2\2\u0506\u0508"+
		"\7o\2\2\u0507\u0509\5\u00c2b\2\u0508\u0507\3\2\2\2\u0508\u0509\3\2\2\2"+
		"\u0509\u050a\3\2\2\2\u050a\u050b\5\u00bc_\2\u050b\u00b9\3\2\2\2\u050c"+
		"\u0528\7?\2\2\u050d\u0512\7@\2\2\u050e\u050f\7?\2\2\u050f\u0511\7@\2\2"+
		"\u0510\u050e\3\2\2\2\u0511\u0514\3\2\2\2\u0512\u0510\3\2\2\2\u0512\u0513"+
		"\3\2\2\2\u0513\u0515\3\2\2\2\u0514\u0512\3\2\2\2\u0515\u0529\5N(\2\u0516"+
		"\u0517\5\u00a8U\2\u0517\u051e\7@\2\2\u0518\u0519\7?\2\2\u0519\u051a\5"+
		"\u00a8U\2\u051a\u051b\7@\2\2\u051b\u051d\3\2\2\2\u051c\u0518\3\2\2\2\u051d"+
		"\u0520\3\2\2\2\u051e\u051c\3\2\2\2\u051e\u051f\3\2\2\2\u051f\u0525\3\2"+
		"\2\2\u0520\u051e\3\2\2\2\u0521\u0522\7?\2\2\u0522\u0524\7@\2\2\u0523\u0521"+
		"\3\2\2\2\u0524\u0527\3\2\2\2\u0525\u0523\3\2\2\2\u0525\u0526\3\2\2\2\u0526"+
		"\u0529\3\2\2\2\u0527\u0525\3\2\2\2\u0528\u050d\3\2\2\2\u0528\u0516\3\2"+
		"\2\2\u0529\u00bb\3\2\2\2\u052a\u052c\5\u00d2j\2\u052b\u052d\5\"\22\2\u052c"+
		"\u052b\3\2\2\2\u052c\u052d\3\2\2\2\u052d\u00bd\3\2\2\2\u052e\u052f\5\u00c4"+
		"c\2\u052f\u0530\5\u00d0i\2\u0530\u00bf\3\2\2\2\u0531\u0532\7F\2\2\u0532"+
		"\u0535\7E\2\2\u0533\u0535\5\u00ccg\2\u0534\u0531\3\2\2\2\u0534\u0533\3"+
		"\2\2\2\u0535\u00c1\3\2\2\2\u0536\u0537\7F\2\2\u0537\u053a\7E\2\2\u0538"+
		"\u053a\5\u00c4c\2\u0539\u0536\3\2\2\2\u0539\u0538\3\2\2\2\u053a\u00c3"+
		"\3\2\2\2\u053b\u053c\7F\2\2\u053c\u053d\5\u00c6d\2\u053d\u053e\7E\2\2"+
		"\u053e\u00c5\3\2\2\2\u053f\u0544\5\u00c8e\2\u0540\u0541\7B\2\2\u0541\u0543"+
		"\5\u00c8e\2\u0542\u0540\3\2\2\2\u0543\u0546\3\2\2\2\u0544\u0542\3\2\2"+
		"\2\u0544\u0545\3\2\2\2\u0545\u00c7\3\2\2\2\u0546\u0544\3\2\2\2\u0547\u0549"+
		"\5h\65\2\u0548\u0547\3\2\2\2\u0548\u0549\3\2\2\2\u0549\u054c\3\2\2\2\u054a"+
		"\u054d\5P)\2\u054b\u054d\5\u00caf\2\u054c\u054a\3\2\2\2\u054c\u054b\3"+
		"\2\2\2\u054d\u0552\3\2\2\2\u054e\u054f\7?\2\2\u054f\u0551\7@\2\2\u0550"+
		"\u054e\3\2\2\2\u0551\u0554\3\2\2\2\u0552\u0550\3\2\2\2\u0552\u0553\3\2"+
		"\2\2\u0553\u00c9\3\2\2\2\u0554\u0552\3\2\2\2\u0555\u0556\t\r\2\2\u0556"+
		"\u00cb\3\2\2\2\u0557\u0558\7F\2\2\u0558\u055d\5R*\2\u0559\u055a\7B\2\2"+
		"\u055a\u055c\5R*\2\u055b\u0559\3\2\2\2\u055c\u055f\3\2\2\2\u055d\u055b"+
		"\3\2\2\2\u055d\u055e\3\2\2\2\u055e\u0560\3\2\2\2\u055f\u055d\3\2\2\2\u0560"+
		"\u0561\7E\2\2\u0561\u00cd\3\2\2\2\u0562\u0569\5\u00d2j\2\u0563\u0564\7"+
		"C\2\2\u0564\u0566\7o\2\2\u0565\u0567\5\u00d2j\2\u0566\u0565\3\2\2\2\u0566"+
		"\u0567\3\2\2\2\u0567\u0569\3\2\2\2\u0568\u0562\3\2\2\2\u0568\u0563\3\2"+
		"\2\2\u0569\u00cf\3\2\2\2\u056a\u056b\7*\2\2\u056b\u056f\5\u00ceh\2\u056c"+
		"\u056d\7o\2\2\u056d\u056f\5\u00d2j\2\u056e\u056a\3\2\2\2\u056e\u056c\3"+
		"\2\2\2\u056f\u00d1\3\2\2\2\u0570\u0572\7;\2\2\u0571\u0573\5\u00a4S\2\u0572"+
		"\u0571\3\2\2\2\u0572\u0573\3\2\2\2\u0573\u0574\3\2\2\2\u0574\u0575\7<"+
		"\2\2\u0575\u00d3\3\2\2\2\u00af\u00d5\u00da\u00e0\u00e8\u00f1\u00f6\u00fd"+
		"\u0104\u0107\u010e\u0118\u011c\u0121\u0125\u0129\u0133\u013b\u0141\u0148"+
		"\u014f\u0153\u0156\u0159\u0162\u0168\u016d\u0170\u0176\u017c\u0180\u0188"+
		"\u0191\u0198\u019e\u01a2\u01ad\u01b6\u01bb\u01c1\u01c5\u01d1\u01dc\u01e1"+
		"\u01ea\u01f2\u01fc\u0205\u020d\u0212\u021a\u021f\u0229\u0233\u0239\u0240"+
		"\u0245\u024d\u0251\u0253\u0259\u025e\u0262\u0269\u026b\u0272\u0277\u0280"+
		"\u0285\u0288\u028d\u0296\u02a2\u02ab\u02b5\u02be\u02c3\u02c6\u02cd\u02d7"+
		"\u02df\u02e2\u02e5\u02f2\u02fa\u02ff\u0307\u030b\u030f\u0313\u0315\u0319"+
		"\u031f\u032a\u0334\u0339\u0342\u0347\u034a\u0351\u035a\u0371\u0374\u0377"+
		"\u037f\u0383\u038b\u0391\u039c\u03a5\u03aa\u03b4\u03bb\u03c8\u03d1\u03da"+
		"\u03e0\u03eb\u03f0\u03f5\u03fa\u03fe\u0402\u0406\u0408\u040c\u0411\u0422"+
		"\u0428\u042e\u0434\u0437\u044b\u044f\u0454\u0458\u0468\u0490\u0496\u04a5"+
		"\u04a8\u04aa\u04b4\u04bd\u04c1\u04c5\u04d7\u04d9\u04de\u04e3\u04e8\u04f1"+
		"\u04f3\u04f7\u04fc\u0500\u0504\u0508\u0512\u051e\u0525\u0528\u052c\u0534"+
		"\u0539\u0544\u0548\u054c\u0552\u055d\u0566\u0568\u056e\u0572";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}