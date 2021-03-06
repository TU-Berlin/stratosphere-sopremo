// $ANTLR 3.5 /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g 2014-01-17 14:21:14
 
package eu.stratosphere.meteor; 

import eu.stratosphere.sopremo.operator.*;
import eu.stratosphere.sopremo.io.*;
import eu.stratosphere.sopremo.query.*;
import eu.stratosphere.sopremo.pact.*;
import eu.stratosphere.sopremo.expressions.*;
import eu.stratosphere.sopremo.function.*;
import eu.stratosphere.sopremo.type.*;
import java.math.*;
import java.util.IdentityHashMap;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class MeteorParser extends MeteorParserBase {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "APOSTROPHE", "COMMENT", 
		"DECIMAL", "DIGIT", "ELSE", "ESC_SEQ", "EXPONENT", "EXPRESSION", "FN", 
		"HEX_DIGIT", "ID", "IF", "IN", "INTEGER", "JAVAUDF", "LOWER_LETTER", "NOT", 
		"OCTAL_ESC", "OPERATOR", "OR", "QUOTATION", "SIGN", "SLASH", "STAR", "STRING", 
		"UINT", "UNICODE_ESC", "UPPER_LETTER", "VAR", "WS", "'!'", "'!='", "'&&'", 
		"'&'", "'('", "')'", "'+'", "'++'", "','", "'-'", "'--'", "'.'", "':'", 
		"';'", "'<'", "'<='", "'='", "'=='", "'>'", "'>='", "'?'", "'?.'", "'['", 
		"']'", "'false'", "'null'", "'read'", "'true'", "'using'", "'write'", 
		"'{'", "'||'", "'}'", "'~'"
	};
	public static final int EOF=-1;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int T__39=39;
	public static final int T__40=40;
	public static final int T__41=41;
	public static final int T__42=42;
	public static final int T__43=43;
	public static final int T__44=44;
	public static final int T__45=45;
	public static final int T__46=46;
	public static final int T__47=47;
	public static final int T__48=48;
	public static final int T__49=49;
	public static final int T__50=50;
	public static final int T__51=51;
	public static final int T__52=52;
	public static final int T__53=53;
	public static final int T__54=54;
	public static final int T__55=55;
	public static final int T__56=56;
	public static final int T__57=57;
	public static final int T__58=58;
	public static final int T__59=59;
	public static final int T__60=60;
	public static final int T__61=61;
	public static final int T__62=62;
	public static final int T__63=63;
	public static final int T__64=64;
	public static final int T__65=65;
	public static final int T__66=66;
	public static final int T__67=67;
	public static final int T__68=68;
	public static final int AND=4;
	public static final int APOSTROPHE=5;
	public static final int COMMENT=6;
	public static final int DECIMAL=7;
	public static final int DIGIT=8;
	public static final int ELSE=9;
	public static final int ESC_SEQ=10;
	public static final int EXPONENT=11;
	public static final int EXPRESSION=12;
	public static final int FN=13;
	public static final int HEX_DIGIT=14;
	public static final int ID=15;
	public static final int IF=16;
	public static final int IN=17;
	public static final int INTEGER=18;
	public static final int JAVAUDF=19;
	public static final int LOWER_LETTER=20;
	public static final int NOT=21;
	public static final int OCTAL_ESC=22;
	public static final int OPERATOR=23;
	public static final int OR=24;
	public static final int QUOTATION=25;
	public static final int SIGN=26;
	public static final int SLASH=27;
	public static final int STAR=28;
	public static final int STRING=29;
	public static final int UINT=30;
	public static final int UNICODE_ESC=31;
	public static final int UPPER_LETTER=32;
	public static final int VAR=33;
	public static final int WS=34;

	// delegates
	public MeteorParserBase[] getDelegates() {
		return new MeteorParserBase[] {};
	}

	// delegators


	public MeteorParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public MeteorParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return MeteorParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g"; }


	  private Stack<String> paraphrase = new Stack<String>();

	  private boolean setInnerOutput(Token VAR, Operator<?> op) {
		  JsonStreamExpression output = new JsonStreamExpression(op.getOutput(objectCreation_stack.peek().mappings.size()));
		  objectCreation_stack.peek().mappings.add(new ObjectCreation.TagMapping(output, new JsonStreamExpression(op)));
		  getVariableRegistry().getRegistry(1).put(VAR.getText(), output);
		  return true;
		}
	  
	  protected EvaluationExpression getInputSelection(Token inputVar) throws RecognitionException {
	      return getVariableSafely(inputVar).toInputSelection(operator_stack.peek().result);
	  }

	  public void parseSinks() throws RecognitionException {
	    script();
	  }


	public static class script_return extends ParserRuleReturnScope {
		EvaluationExpression tree;
		@Override
		public EvaluationExpression getTree() { return tree; }
	};


	// $ANTLR start "script"
	// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:60:1: script : ( statement ';' )+ ->;
	public final MeteorParser.script_return script() throws RecognitionException {
		MeteorParser.script_return retval = new MeteorParser.script_return();
		retval.start = input.LT(1);

		EvaluationExpression root_0 = null;

		Token char_literal2=null;
		ParserRuleReturnScope statement1 =null;

		EvaluationExpression char_literal2_tree=null;
		RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");

		try {
			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:61:2: ( ( statement ';' )+ ->)
			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:61:5: ( statement ';' )+
			{
			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:61:5: ( statement ';' )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==ID||LA1_0==VAR||LA1_0==61||(LA1_0 >= 63 && LA1_0 <= 64)) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:61:6: statement ';'
					{
					pushFollow(FOLLOW_statement_in_script121);
					statement1=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_statement.add(statement1.getTree());
					char_literal2=(Token)match(input,48,FOLLOW_48_in_script123); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_48.add(char_literal2);

					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (EvaluationExpression)adaptor.nil();
			// 61:22: ->
			{
				root_0 = null;
			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (EvaluationExpression)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "script"


	public static class statement_return extends ParserRuleReturnScope {
		EvaluationExpression tree;
		@Override
		public EvaluationExpression getTree() { return tree; }
	};


	// $ANTLR start "statement"
	// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:63:1: statement : ( operator | packageImport | functionDefinition | javaudf | adhocSource |m= functionCall ) ->;
	public final MeteorParser.statement_return statement() throws RecognitionException {
		MeteorParser.statement_return retval = new MeteorParser.statement_return();
		retval.start = input.LT(1);

		EvaluationExpression root_0 = null;

		ParserRuleReturnScope m =null;
		ParserRuleReturnScope operator3 =null;
		ParserRuleReturnScope packageImport4 =null;
		ParserRuleReturnScope functionDefinition5 =null;
		ParserRuleReturnScope javaudf6 =null;
		ParserRuleReturnScope adhocSource7 =null;

		RewriteRuleSubtreeStream stream_functionCall=new RewriteRuleSubtreeStream(adaptor,"rule functionCall");
		RewriteRuleSubtreeStream stream_functionDefinition=new RewriteRuleSubtreeStream(adaptor,"rule functionDefinition");
		RewriteRuleSubtreeStream stream_javaudf=new RewriteRuleSubtreeStream(adaptor,"rule javaudf");
		RewriteRuleSubtreeStream stream_adhocSource=new RewriteRuleSubtreeStream(adaptor,"rule adhocSource");
		RewriteRuleSubtreeStream stream_operator=new RewriteRuleSubtreeStream(adaptor,"rule operator");
		RewriteRuleSubtreeStream stream_packageImport=new RewriteRuleSubtreeStream(adaptor,"rule packageImport");

		try {
			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:64:2: ( ( operator | packageImport | functionDefinition | javaudf | adhocSource |m= functionCall ) ->)
			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:64:4: ( operator | packageImport | functionDefinition | javaudf | adhocSource |m= functionCall )
			{
			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:64:4: ( operator | packageImport | functionDefinition | javaudf | adhocSource |m= functionCall )
			int alt2=6;
			switch ( input.LA(1) ) {
			case VAR:
				{
				int LA2_1 = input.LA(2);
				if ( (LA2_1==51) ) {
					int LA2_5 = input.LA(3);
					if ( (LA2_5==ID||LA2_5==61) ) {
						alt2=1;
					}
					else if ( (LA2_5==57) ) {
						alt2=5;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 2, 5, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA2_1==43) ) {
					alt2=1;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 61:
			case 64:
				{
				alt2=1;
				}
				break;
			case ID:
				{
				switch ( input.LA(2) ) {
				case 47:
					{
					int LA2_6 = input.LA(3);
					if ( (LA2_6==ID) ) {
						int LA2_10 = input.LA(4);
						if ( (LA2_10==39) ) {
							alt2=6;
						}
						else if ( (LA2_10==ID||LA2_10==VAR||LA2_10==48) ) {
							alt2=1;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 2, 10, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 2, 6, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 51:
					{
					int LA2_7 = input.LA(3);
					if ( (LA2_7==JAVAUDF) ) {
						alt2=4;
					}
					else if ( (LA2_7==FN) ) {
						alt2=3;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 2, 7, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 39:
					{
					alt2=6;
					}
					break;
				case ID:
				case VAR:
				case 48:
					{
					alt2=1;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 63:
				{
				alt2=2;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:64:5: operator
					{
					pushFollow(FOLLOW_operator_in_statement137);
					operator3=operator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_operator.add(operator3.getTree());
					}
					break;
				case 2 :
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:64:16: packageImport
					{
					pushFollow(FOLLOW_packageImport_in_statement141);
					packageImport4=packageImport();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_packageImport.add(packageImport4.getTree());
					}
					break;
				case 3 :
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:64:32: functionDefinition
					{
					pushFollow(FOLLOW_functionDefinition_in_statement145);
					functionDefinition5=functionDefinition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_functionDefinition.add(functionDefinition5.getTree());
					}
					break;
				case 4 :
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:64:53: javaudf
					{
					pushFollow(FOLLOW_javaudf_in_statement149);
					javaudf6=javaudf();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_javaudf.add(javaudf6.getTree());
					}
					break;
				case 5 :
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:64:63: adhocSource
					{
					pushFollow(FOLLOW_adhocSource_in_statement153);
					adhocSource7=adhocSource();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_adhocSource.add(adhocSource7.getTree());
					}
					break;
				case 6 :
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:66:4: m= functionCall
					{
					pushFollow(FOLLOW_functionCall_in_statement161);
					m=functionCall();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_functionCall.add(m.getTree());
					if ( state.backtracking==0 ) { (m!=null?((EvaluationExpression)m.getTree()):null).evaluate(MissingNode.getInstance()); }
					}
					break;

			}

			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (EvaluationExpression)adaptor.nil();
			// 66:69: ->
			{
				root_0 = null;
			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (EvaluationExpression)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "statement"


	public static class packageImport_return extends ParserRuleReturnScope {
		EvaluationExpression tree;
		@Override
		public EvaluationExpression getTree() { return tree; }
	};


	// $ANTLR start "packageImport"
	// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:68:1: packageImport : 'using' packageName= ID ( ',' additionalPackage= ID )* ->;
	public final MeteorParser.packageImport_return packageImport() throws RecognitionException {
		MeteorParser.packageImport_return retval = new MeteorParser.packageImport_return();
		retval.start = input.LT(1);

		EvaluationExpression root_0 = null;

		Token packageName=null;
		Token additionalPackage=null;
		Token string_literal8=null;
		Token char_literal9=null;

		EvaluationExpression packageName_tree=null;
		EvaluationExpression additionalPackage_tree=null;
		EvaluationExpression string_literal8_tree=null;
		EvaluationExpression char_literal9_tree=null;
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");

		try {
			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:69:3: ( 'using' packageName= ID ( ',' additionalPackage= ID )* ->)
			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:69:6: 'using' packageName= ID ( ',' additionalPackage= ID )*
			{
			string_literal8=(Token)match(input,63,FOLLOW_63_in_packageImport178); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_63.add(string_literal8);

			packageName=(Token)match(input,ID,FOLLOW_ID_in_packageImport182); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ID.add(packageName);

			if ( state.backtracking==0 ) { getPackageManager().importPackage((packageName!=null?packageName.getText():null)); }
			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:70:6: ( ',' additionalPackage= ID )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==43) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:70:7: ',' additionalPackage= ID
					{
					char_literal9=(Token)match(input,43,FOLLOW_43_in_packageImport193); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_43.add(char_literal9);

					additionalPackage=(Token)match(input,ID,FOLLOW_ID_in_packageImport197); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ID.add(additionalPackage);

					if ( state.backtracking==0 ) { getPackageManager().importPackage((additionalPackage!=null?additionalPackage.getText():null)); }
					}
					break;

				default :
					break loop3;
				}
			}

			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (EvaluationExpression)adaptor.nil();
			// 70:98: ->
			{
				root_0 = null;
			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (EvaluationExpression)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "packageImport"


	public static class functionDefinition_return extends ParserRuleReturnScope {
		EvaluationExpression tree;
		@Override
		public EvaluationExpression getTree() { return tree; }
	};


	// $ANTLR start "functionDefinition"
	// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:72:1: functionDefinition : name= ID '=' func= inlineFunction ->;
	public final MeteorParser.functionDefinition_return functionDefinition() throws RecognitionException {
		MeteorParser.functionDefinition_return retval = new MeteorParser.functionDefinition_return();
		retval.start = input.LT(1);

		EvaluationExpression root_0 = null;

		Token name=null;
		Token char_literal10=null;
		ParserRuleReturnScope func =null;

		EvaluationExpression name_tree=null;
		EvaluationExpression char_literal10_tree=null;
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
		RewriteRuleSubtreeStream stream_inlineFunction=new RewriteRuleSubtreeStream(adaptor,"rule inlineFunction");

		try {
			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:73:3: (name= ID '=' func= inlineFunction ->)
			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:73:5: name= ID '=' func= inlineFunction
			{
			name=(Token)match(input,ID,FOLLOW_ID_in_functionDefinition215); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ID.add(name);

			char_literal10=(Token)match(input,51,FOLLOW_51_in_functionDefinition217); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_51.add(char_literal10);

			pushFollow(FOLLOW_inlineFunction_in_functionDefinition221);
			func=inlineFunction();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_inlineFunction.add(func.getTree());
			if ( state.backtracking==0 ) { addFunction((name!=null?name.getText():null), (func!=null?((MeteorParser.inlineFunction_return)func).func:null)); }
			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (EvaluationExpression)adaptor.nil();
			// 73:78: ->
			{
				root_0 = null;
			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (EvaluationExpression)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "functionDefinition"


	public static class inlineFunction_return extends ParserRuleReturnScope {
		public ExpressionFunction func;
		EvaluationExpression tree;
		@Override
		public EvaluationExpression getTree() { return tree; }
	};


	// $ANTLR start "inlineFunction"
	// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:75:1: inlineFunction returns [ExpressionFunction func] : FN '(' (param= ID ( ',' param= ID )* )? ')' '{' def= expression '}' ->;
	public final MeteorParser.inlineFunction_return inlineFunction() throws RecognitionException {
		MeteorParser.inlineFunction_return retval = new MeteorParser.inlineFunction_return();
		retval.start = input.LT(1);

		EvaluationExpression root_0 = null;

		Token param=null;
		Token FN11=null;
		Token char_literal12=null;
		Token char_literal13=null;
		Token char_literal14=null;
		Token char_literal15=null;
		Token char_literal16=null;
		ParserRuleReturnScope def =null;

		EvaluationExpression param_tree=null;
		EvaluationExpression FN11_tree=null;
		EvaluationExpression char_literal12_tree=null;
		EvaluationExpression char_literal13_tree=null;
		EvaluationExpression char_literal14_tree=null;
		EvaluationExpression char_literal15_tree=null;
		EvaluationExpression char_literal16_tree=null;
		RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleTokenStream stream_FN=new RewriteRuleTokenStream(adaptor,"token FN");
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		 List<Token> params = new ArrayList(); 
		try {
			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:77:3: ( FN '(' (param= ID ( ',' param= ID )* )? ')' '{' def= expression '}' ->)
			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:77:5: FN '(' (param= ID ( ',' param= ID )* )? ')' '{' def= expression '}'
			{
			FN11=(Token)match(input,FN,FOLLOW_FN_in_inlineFunction247); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_FN.add(FN11);

			char_literal12=(Token)match(input,39,FOLLOW_39_in_inlineFunction249); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_39.add(char_literal12);

			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:78:3: (param= ID ( ',' param= ID )* )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==ID) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:78:4: param= ID ( ',' param= ID )*
					{
					param=(Token)match(input,ID,FOLLOW_ID_in_inlineFunction258); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ID.add(param);

					if ( state.backtracking==0 ) { params.add(param); }
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:79:3: ( ',' param= ID )*
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( (LA4_0==43) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:79:4: ',' param= ID
							{
							char_literal13=(Token)match(input,43,FOLLOW_43_in_inlineFunction265); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_43.add(char_literal13);

							param=(Token)match(input,ID,FOLLOW_ID_in_inlineFunction269); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_ID.add(param);

							if ( state.backtracking==0 ) { params.add(param); }
							}
							break;

						default :
							break loop4;
						}
					}

					}
					break;

			}

			char_literal14=(Token)match(input,40,FOLLOW_40_in_inlineFunction280); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_40.add(char_literal14);

			if ( state.backtracking==0 ) { 
			    addConstantScope();
			    for(int index = 0; index < params.size(); index++) 
			      this.getConstantRegistry().put(params.get(index).getText(), new InputSelection(index)); 
			  }
			char_literal15=(Token)match(input,65,FOLLOW_65_in_inlineFunction290); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_65.add(char_literal15);

			pushFollow(FOLLOW_expression_in_inlineFunction294);
			def=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(def.getTree());
			char_literal16=(Token)match(input,67,FOLLOW_67_in_inlineFunction296); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_67.add(char_literal16);

			if ( state.backtracking==0 ) { 
			    retval.func = new ExpressionFunction(params.size(), (def!=null?((EvaluationExpression)def.getTree()):null));
			    removeConstantScope(); 
			  }
			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (EvaluationExpression)adaptor.nil();
			// 90:5: ->
			{
				root_0 = null;
			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (EvaluationExpression)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "inlineFunction"


	public static class javaudf_return extends ParserRuleReturnScope {
		EvaluationExpression tree;
		@Override
		public EvaluationExpression getTree() { return tree; }
	};


	// $ANTLR start "javaudf"
	// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:92:1: javaudf : name= ID '=' JAVAUDF '(' path= STRING ')' ->;
	public final MeteorParser.javaudf_return javaudf() throws RecognitionException {
		MeteorParser.javaudf_return retval = new MeteorParser.javaudf_return();
		retval.start = input.LT(1);

		EvaluationExpression root_0 = null;

		Token name=null;
		Token path=null;
		Token char_literal17=null;
		Token JAVAUDF18=null;
		Token char_literal19=null;
		Token char_literal20=null;

		EvaluationExpression name_tree=null;
		EvaluationExpression path_tree=null;
		EvaluationExpression char_literal17_tree=null;
		EvaluationExpression JAVAUDF18_tree=null;
		EvaluationExpression char_literal19_tree=null;
		EvaluationExpression char_literal20_tree=null;
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
		RewriteRuleTokenStream stream_JAVAUDF=new RewriteRuleTokenStream(adaptor,"token JAVAUDF");
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

		try {
			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:93:3: (name= ID '=' JAVAUDF '(' path= STRING ')' ->)
			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:93:5: name= ID '=' JAVAUDF '(' path= STRING ')'
			{
			name=(Token)match(input,ID,FOLLOW_ID_in_javaudf316); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ID.add(name);

			char_literal17=(Token)match(input,51,FOLLOW_51_in_javaudf318); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_51.add(char_literal17);

			JAVAUDF18=(Token)match(input,JAVAUDF,FOLLOW_JAVAUDF_in_javaudf320); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_JAVAUDF.add(JAVAUDF18);

			char_literal19=(Token)match(input,39,FOLLOW_39_in_javaudf322); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_39.add(char_literal19);

			path=(Token)match(input,STRING,FOLLOW_STRING_in_javaudf326); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_STRING.add(path);

			char_literal20=(Token)match(input,40,FOLLOW_40_in_javaudf328); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_40.add(char_literal20);

			if ( state.backtracking==0 ) { addFunction(name.getText(), path.getText()); }
			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (EvaluationExpression)adaptor.nil();
			// 94:53: ->
			{
				root_0 = null;
			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (EvaluationExpression)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "javaudf"


	protected static class contextAwareExpression_scope {
		EvaluationExpression context;
	}
	protected Stack<contextAwareExpression_scope> contextAwareExpression_stack = new Stack<contextAwareExpression_scope>();

	public static class contextAwareExpression_return extends ParserRuleReturnScope {
		EvaluationExpression tree;
		@Override
		public EvaluationExpression getTree() { return tree; }
	};


	// $ANTLR start "contextAwareExpression"
	// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:96:1: contextAwareExpression[EvaluationExpression contextExpression] : ternaryExpression ;
	public final MeteorParser.contextAwareExpression_return contextAwareExpression(EvaluationExpression contextExpression) throws RecognitionException {
		contextAwareExpression_stack.push(new contextAwareExpression_scope());
		MeteorParser.contextAwareExpression_return retval = new MeteorParser.contextAwareExpression_return();
		retval.start = input.LT(1);

		EvaluationExpression root_0 = null;

		ParserRuleReturnScope ternaryExpression21 =null;


		 contextAwareExpression_stack.peek().context = contextExpression; 
		try {
			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:99:3: ( ternaryExpression )
			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:99:5: ternaryExpression
			{
			root_0 = (EvaluationExpression)adaptor.nil();


			pushFollow(FOLLOW_ternaryExpression_in_contextAwareExpression356);
			ternaryExpression21=ternaryExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, ternaryExpression21.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (EvaluationExpression)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
			contextAwareExpression_stack.pop();
		}
		return retval;
	}
	// $ANTLR end "contextAwareExpression"


	public static class expression_return extends ParserRuleReturnScope {
		EvaluationExpression tree;
		@Override
		public EvaluationExpression getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:101:1: expression : ( ( ID ( ID | VAR ) )=> operatorExpression | ternaryExpression );
	public final MeteorParser.expression_return expression() throws RecognitionException {
		MeteorParser.expression_return retval = new MeteorParser.expression_return();
		retval.start = input.LT(1);

		EvaluationExpression root_0 = null;

		ParserRuleReturnScope operatorExpression22 =null;
		ParserRuleReturnScope ternaryExpression23 =null;


		try {
			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:102:3: ( ( ID ( ID | VAR ) )=> operatorExpression | ternaryExpression )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==VAR) ) {
				int LA6_1 = input.LA(2);
				if ( (LA6_1==51) && (synpred1_Meteor())) {
					alt6=1;
				}
				else if ( (LA6_1==43) ) {
					int LA6_7 = input.LA(3);
					if ( (LA6_7==VAR) ) {
						int LA6_8 = input.LA(4);
						if ( (synpred1_Meteor()) ) {
							alt6=1;
						}
						else if ( (true) ) {
							alt6=2;
						}

					}
					else if ( (LA6_7==DECIMAL||LA6_7==FN||LA6_7==ID||LA6_7==INTEGER||(LA6_7 >= STRING && LA6_7 <= UINT)||LA6_7==35||(LA6_7 >= 38 && LA6_7 <= 39)||LA6_7==42||LA6_7==45||(LA6_7 >= 57 && LA6_7 <= 62)||(LA6_7 >= 64 && LA6_7 <= 65)||(LA6_7 >= 67 && LA6_7 <= 68)) ) {
						alt6=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 6, 7, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA6_1==AND||(LA6_1 >= ID && LA6_1 <= IN)||LA6_1==NOT||LA6_1==OR||(LA6_1 >= SLASH && LA6_1 <= STAR)||(LA6_1 >= 36 && LA6_1 <= 37)||(LA6_1 >= 40 && LA6_1 <= 41)||LA6_1==44||LA6_1==46||(LA6_1 >= 49 && LA6_1 <= 50)||(LA6_1 >= 52 && LA6_1 <= 58)||(LA6_1 >= 66 && LA6_1 <= 67)) ) {
					alt6=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 6, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA6_0==61) && (synpred1_Meteor())) {
				alt6=1;
			}
			else if ( (LA6_0==64) && (synpred1_Meteor())) {
				alt6=1;
			}
			else if ( (LA6_0==ID) ) {
				int LA6_4 = input.LA(2);
				if ( (synpred1_Meteor()) ) {
					alt6=1;
				}
				else if ( (true) ) {
					alt6=2;
				}

			}
			else if ( (LA6_0==DECIMAL||LA6_0==FN||LA6_0==INTEGER||(LA6_0 >= STRING && LA6_0 <= UINT)||LA6_0==35||(LA6_0 >= 38 && LA6_0 <= 39)||LA6_0==42||LA6_0==45||LA6_0==57||(LA6_0 >= 59 && LA6_0 <= 60)||LA6_0==62||LA6_0==65||LA6_0==68) ) {
				alt6=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:102:5: ( ID ( ID | VAR ) )=> operatorExpression
					{
					root_0 = (EvaluationExpression)adaptor.nil();


					pushFollow(FOLLOW_operatorExpression_in_expression379);
					operatorExpression22=operatorExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, operatorExpression22.getTree());

					}
					break;
				case 2 :
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:103:5: ternaryExpression
					{
					root_0 = (EvaluationExpression)adaptor.nil();


					pushFollow(FOLLOW_ternaryExpression_in_expression385);
					ternaryExpression23=ternaryExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, ternaryExpression23.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (EvaluationExpression)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expression"


	public static class ternaryExpression_return extends ParserRuleReturnScope {
		EvaluationExpression tree;
		@Override
		public EvaluationExpression getTree() { return tree; }
	};


	// $ANTLR start "ternaryExpression"
	// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:105:1: ternaryExpression : ( ( orExpression '?' )=>ifClause= orExpression '?' (ifExpr= orExpression )? ':' elseExpr= orExpression -> ^( EXPRESSION[\"TernaryExpression\"] $ifClause) | ( orExpression IF )=>ifExpr2= orExpression IF ifClause2= orExpression -> ^( EXPRESSION[\"TernaryExpression\"] $ifClause2 $ifExpr2) | orExpression );
	public final MeteorParser.ternaryExpression_return ternaryExpression() throws RecognitionException {
		MeteorParser.ternaryExpression_return retval = new MeteorParser.ternaryExpression_return();
		retval.start = input.LT(1);

		EvaluationExpression root_0 = null;

		Token char_literal24=null;
		Token char_literal25=null;
		Token IF26=null;
		ParserRuleReturnScope ifClause =null;
		ParserRuleReturnScope ifExpr =null;
		ParserRuleReturnScope elseExpr =null;
		ParserRuleReturnScope ifExpr2 =null;
		ParserRuleReturnScope ifClause2 =null;
		ParserRuleReturnScope orExpression27 =null;

		EvaluationExpression char_literal24_tree=null;
		EvaluationExpression char_literal25_tree=null;
		EvaluationExpression IF26_tree=null;
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
		RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
		RewriteRuleSubtreeStream stream_orExpression=new RewriteRuleSubtreeStream(adaptor,"rule orExpression");

		try {
			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:106:2: ( ( orExpression '?' )=>ifClause= orExpression '?' (ifExpr= orExpression )? ':' elseExpr= orExpression -> ^( EXPRESSION[\"TernaryExpression\"] $ifClause) | ( orExpression IF )=>ifExpr2= orExpression IF ifClause2= orExpression -> ^( EXPRESSION[\"TernaryExpression\"] $ifClause2 $ifExpr2) | orExpression )
			int alt8=3;
			switch ( input.LA(1) ) {
			case 42:
				{
				int LA8_1 = input.LA(2);
				if ( (synpred2_Meteor()) ) {
					alt8=1;
				}
				else if ( (synpred3_Meteor()) ) {
					alt8=2;
				}
				else if ( (true) ) {
					alt8=3;
				}

				}
				break;
			case 45:
				{
				int LA8_2 = input.LA(2);
				if ( (synpred2_Meteor()) ) {
					alt8=1;
				}
				else if ( (synpred3_Meteor()) ) {
					alt8=2;
				}
				else if ( (true) ) {
					alt8=3;
				}

				}
				break;
			case 35:
			case 68:
				{
				int LA8_3 = input.LA(2);
				if ( (synpred2_Meteor()) ) {
					alt8=1;
				}
				else if ( (synpred3_Meteor()) ) {
					alt8=2;
				}
				else if ( (true) ) {
					alt8=3;
				}

				}
				break;
			case 39:
				{
				int LA8_4 = input.LA(2);
				if ( (synpred2_Meteor()) ) {
					alt8=1;
				}
				else if ( (synpred3_Meteor()) ) {
					alt8=2;
				}
				else if ( (true) ) {
					alt8=3;
				}

				}
				break;
			case ID:
				{
				int LA8_5 = input.LA(2);
				if ( (synpred2_Meteor()) ) {
					alt8=1;
				}
				else if ( (synpred3_Meteor()) ) {
					alt8=2;
				}
				else if ( (true) ) {
					alt8=3;
				}

				}
				break;
			case 38:
				{
				int LA8_6 = input.LA(2);
				if ( (synpred2_Meteor()) ) {
					alt8=1;
				}
				else if ( (synpred3_Meteor()) ) {
					alt8=2;
				}
				else if ( (true) ) {
					alt8=3;
				}

				}
				break;
			case FN:
				{
				int LA8_7 = input.LA(2);
				if ( (synpred2_Meteor()) ) {
					alt8=1;
				}
				else if ( (synpred3_Meteor()) ) {
					alt8=2;
				}
				else if ( (true) ) {
					alt8=3;
				}

				}
				break;
			case 62:
				{
				int LA8_8 = input.LA(2);
				if ( (synpred2_Meteor()) ) {
					alt8=1;
				}
				else if ( (synpred3_Meteor()) ) {
					alt8=2;
				}
				else if ( (true) ) {
					alt8=3;
				}

				}
				break;
			case 59:
				{
				int LA8_9 = input.LA(2);
				if ( (synpred2_Meteor()) ) {
					alt8=1;
				}
				else if ( (synpred3_Meteor()) ) {
					alt8=2;
				}
				else if ( (true) ) {
					alt8=3;
				}

				}
				break;
			case DECIMAL:
				{
				int LA8_10 = input.LA(2);
				if ( (synpred2_Meteor()) ) {
					alt8=1;
				}
				else if ( (synpred3_Meteor()) ) {
					alt8=2;
				}
				else if ( (true) ) {
					alt8=3;
				}

				}
				break;
			case STRING:
				{
				int LA8_11 = input.LA(2);
				if ( (synpred2_Meteor()) ) {
					alt8=1;
				}
				else if ( (synpred3_Meteor()) ) {
					alt8=2;
				}
				else if ( (true) ) {
					alt8=3;
				}

				}
				break;
			case UINT:
				{
				int LA8_12 = input.LA(2);
				if ( (synpred2_Meteor()) ) {
					alt8=1;
				}
				else if ( (synpred3_Meteor()) ) {
					alt8=2;
				}
				else if ( (true) ) {
					alt8=3;
				}

				}
				break;
			case INTEGER:
				{
				int LA8_13 = input.LA(2);
				if ( (synpred2_Meteor()) ) {
					alt8=1;
				}
				else if ( (synpred3_Meteor()) ) {
					alt8=2;
				}
				else if ( (true) ) {
					alt8=3;
				}

				}
				break;
			case 60:
				{
				int LA8_14 = input.LA(2);
				if ( (synpred2_Meteor()) ) {
					alt8=1;
				}
				else if ( (synpred3_Meteor()) ) {
					alt8=2;
				}
				else if ( (true) ) {
					alt8=3;
				}

				}
				break;
			case VAR:
				{
				int LA8_15 = input.LA(2);
				if ( (synpred2_Meteor()) ) {
					alt8=1;
				}
				else if ( (synpred3_Meteor()) ) {
					alt8=2;
				}
				else if ( (true) ) {
					alt8=3;
				}

				}
				break;
			case 57:
				{
				int LA8_16 = input.LA(2);
				if ( (synpred2_Meteor()) ) {
					alt8=1;
				}
				else if ( (synpred3_Meteor()) ) {
					alt8=2;
				}
				else if ( (true) ) {
					alt8=3;
				}

				}
				break;
			case 65:
				{
				int LA8_17 = input.LA(2);
				if ( (synpred2_Meteor()) ) {
					alt8=1;
				}
				else if ( (synpred3_Meteor()) ) {
					alt8=2;
				}
				else if ( (true) ) {
					alt8=3;
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}
			switch (alt8) {
				case 1 :
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:106:4: ( orExpression '?' )=>ifClause= orExpression '?' (ifExpr= orExpression )? ':' elseExpr= orExpression
					{
					pushFollow(FOLLOW_orExpression_in_ternaryExpression403);
					ifClause=orExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_orExpression.add(ifClause.getTree());
					char_literal24=(Token)match(input,55,FOLLOW_55_in_ternaryExpression405); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_55.add(char_literal24);

					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:106:57: (ifExpr= orExpression )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==DECIMAL||LA7_0==FN||LA7_0==ID||LA7_0==INTEGER||(LA7_0 >= STRING && LA7_0 <= UINT)||LA7_0==VAR||LA7_0==35||(LA7_0 >= 38 && LA7_0 <= 39)||LA7_0==42||LA7_0==45||LA7_0==57||(LA7_0 >= 59 && LA7_0 <= 60)||LA7_0==62||LA7_0==65||LA7_0==68) ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:106:57: ifExpr= orExpression
							{
							pushFollow(FOLLOW_orExpression_in_ternaryExpression409);
							ifExpr=orExpression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_orExpression.add(ifExpr.getTree());
							}
							break;

					}

					char_literal25=(Token)match(input,47,FOLLOW_47_in_ternaryExpression412); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_47.add(char_literal25);

					pushFollow(FOLLOW_orExpression_in_ternaryExpression416);
					elseExpr=orExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_orExpression.add(elseExpr.getTree());
					// AST REWRITE
					// elements: ifClause
					// token labels: 
					// rule labels: retval, ifClause
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_ifClause=new RewriteRuleSubtreeStream(adaptor,"rule ifClause",ifClause!=null?ifClause.getTree():null);

					root_0 = (EvaluationExpression)adaptor.nil();
					// 107:2: -> ^( EXPRESSION[\"TernaryExpression\"] $ifClause)
					{
						// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:107:5: ^( EXPRESSION[\"TernaryExpression\"] $ifClause)
						{
						EvaluationExpression root_1 = (EvaluationExpression)adaptor.nil();
						root_1 = (EvaluationExpression)adaptor.becomeRoot((EvaluationExpression)adaptor.create(EXPRESSION, "TernaryExpression"), root_1);
						adaptor.addChild(root_1, stream_ifClause.nextTree());
						adaptor.addChild(root_1,  ifExpr == null ? (ifClause!=null?((EvaluationExpression)ifClause.getTree()):null) : (ifExpr!=null?((EvaluationExpression)ifExpr.getTree()):null) );
						adaptor.addChild(root_1,  (elseExpr!=null?((EvaluationExpression)elseExpr.getTree()):null) );
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:108:4: ( orExpression IF )=>ifExpr2= orExpression IF ifClause2= orExpression
					{
					pushFollow(FOLLOW_orExpression_in_ternaryExpression445);
					ifExpr2=orExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_orExpression.add(ifExpr2.getTree());
					IF26=(Token)match(input,IF,FOLLOW_IF_in_ternaryExpression447); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_IF.add(IF26);

					pushFollow(FOLLOW_orExpression_in_ternaryExpression451);
					ifClause2=orExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_orExpression.add(ifClause2.getTree());
					// AST REWRITE
					// elements: ifExpr2, ifClause2
					// token labels: 
					// rule labels: retval, ifExpr2, ifClause2
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_ifExpr2=new RewriteRuleSubtreeStream(adaptor,"rule ifExpr2",ifExpr2!=null?ifExpr2.getTree():null);
					RewriteRuleSubtreeStream stream_ifClause2=new RewriteRuleSubtreeStream(adaptor,"rule ifClause2",ifClause2!=null?ifClause2.getTree():null);

					root_0 = (EvaluationExpression)adaptor.nil();
					// 109:3: -> ^( EXPRESSION[\"TernaryExpression\"] $ifClause2 $ifExpr2)
					{
						// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:109:6: ^( EXPRESSION[\"TernaryExpression\"] $ifClause2 $ifExpr2)
						{
						EvaluationExpression root_1 = (EvaluationExpression)adaptor.nil();
						root_1 = (EvaluationExpression)adaptor.becomeRoot((EvaluationExpression)adaptor.create(EXPRESSION, "TernaryExpression"), root_1);
						adaptor.addChild(root_1, stream_ifClause2.nextTree());
						adaptor.addChild(root_1, stream_ifExpr2.nextTree());
						adaptor.addChild(root_1,  EvaluationExpression.VALUE );
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:110:5: orExpression
					{
					root_0 = (EvaluationExpression)adaptor.nil();


					pushFollow(FOLLOW_orExpression_in_ternaryExpression474);
					orExpression27=orExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, orExpression27.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (EvaluationExpression)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "ternaryExpression"


	public static class orExpression_return extends ParserRuleReturnScope {
		EvaluationExpression tree;
		@Override
		public EvaluationExpression getTree() { return tree; }
	};


	// $ANTLR start "orExpression"
	// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:112:1: orExpression :exprs+= andExpression ( ( OR | '||' ) exprs+= andExpression )* -> { $exprs.size() == 1 }? ->;
	public final MeteorParser.orExpression_return orExpression() throws RecognitionException {
		MeteorParser.orExpression_return retval = new MeteorParser.orExpression_return();
		retval.start = input.LT(1);

		EvaluationExpression root_0 = null;

		Token OR28=null;
		Token string_literal29=null;
		List<Object> list_exprs=null;
		RuleReturnScope exprs = null;
		EvaluationExpression OR28_tree=null;
		EvaluationExpression string_literal29_tree=null;
		RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
		RewriteRuleTokenStream stream_OR=new RewriteRuleTokenStream(adaptor,"token OR");
		RewriteRuleSubtreeStream stream_andExpression=new RewriteRuleSubtreeStream(adaptor,"rule andExpression");

		try {
			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:113:3: (exprs+= andExpression ( ( OR | '||' ) exprs+= andExpression )* -> { $exprs.size() == 1 }? ->)
			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:113:5: exprs+= andExpression ( ( OR | '||' ) exprs+= andExpression )*
			{
			pushFollow(FOLLOW_andExpression_in_orExpression487);
			exprs=andExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_andExpression.add(exprs.getTree());
			if (list_exprs==null) list_exprs=new ArrayList<Object>();
			list_exprs.add(exprs.getTree());
			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:113:26: ( ( OR | '||' ) exprs+= andExpression )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==OR||LA10_0==66) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:113:27: ( OR | '||' ) exprs+= andExpression
					{
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:113:27: ( OR | '||' )
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0==OR) ) {
						alt9=1;
					}
					else if ( (LA9_0==66) ) {
						alt9=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 9, 0, input);
						throw nvae;
					}

					switch (alt9) {
						case 1 :
							// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:113:28: OR
							{
							OR28=(Token)match(input,OR,FOLLOW_OR_in_orExpression491); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_OR.add(OR28);

							}
							break;
						case 2 :
							// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:113:33: '||'
							{
							string_literal29=(Token)match(input,66,FOLLOW_66_in_orExpression495); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_66.add(string_literal29);

							}
							break;

					}

					pushFollow(FOLLOW_andExpression_in_orExpression500);
					exprs=andExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_andExpression.add(exprs.getTree());
					if (list_exprs==null) list_exprs=new ArrayList<Object>();
					list_exprs.add(exprs.getTree());
					}
					break;

				default :
					break loop10;
				}
			}

			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (EvaluationExpression)adaptor.nil();
			// 114:3: -> { $exprs.size() == 1 }?
			if ( list_exprs.size() == 1 ) {
				adaptor.addChild(root_0,  list_exprs.get(0) );
			}

			else // 115:3: ->
			{
				adaptor.addChild(root_0,  OrExpression.valueOf((List) list_exprs) );
			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (EvaluationExpression)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "orExpression"


	public static class andExpression_return extends ParserRuleReturnScope {
		EvaluationExpression tree;
		@Override
		public EvaluationExpression getTree() { return tree; }
	};


	// $ANTLR start "andExpression"
	// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:117:1: andExpression :exprs+= elementExpression ( ( AND | '&&' ) exprs+= elementExpression )* -> { $exprs.size() == 1 }? ->;
	public final MeteorParser.andExpression_return andExpression() throws RecognitionException {
		MeteorParser.andExpression_return retval = new MeteorParser.andExpression_return();
		retval.start = input.LT(1);

		EvaluationExpression root_0 = null;

		Token AND30=null;
		Token string_literal31=null;
		List<Object> list_exprs=null;
		RuleReturnScope exprs = null;
		EvaluationExpression AND30_tree=null;
		EvaluationExpression string_literal31_tree=null;
		RewriteRuleTokenStream stream_AND=new RewriteRuleTokenStream(adaptor,"token AND");
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleSubtreeStream stream_elementExpression=new RewriteRuleSubtreeStream(adaptor,"rule elementExpression");

		try {
			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:118:3: (exprs+= elementExpression ( ( AND | '&&' ) exprs+= elementExpression )* -> { $exprs.size() == 1 }? ->)
			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:118:5: exprs+= elementExpression ( ( AND | '&&' ) exprs+= elementExpression )*
			{
			pushFollow(FOLLOW_elementExpression_in_andExpression529);
			exprs=elementExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_elementExpression.add(exprs.getTree());
			if (list_exprs==null) list_exprs=new ArrayList<Object>();
			list_exprs.add(exprs.getTree());
			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:118:30: ( ( AND | '&&' ) exprs+= elementExpression )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==AND||LA12_0==37) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:118:31: ( AND | '&&' ) exprs+= elementExpression
					{
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:118:31: ( AND | '&&' )
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0==AND) ) {
						alt11=1;
					}
					else if ( (LA11_0==37) ) {
						alt11=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 11, 0, input);
						throw nvae;
					}

					switch (alt11) {
						case 1 :
							// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:118:32: AND
							{
							AND30=(Token)match(input,AND,FOLLOW_AND_in_andExpression533); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_AND.add(AND30);

							}
							break;
						case 2 :
							// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:118:38: '&&'
							{
							string_literal31=(Token)match(input,37,FOLLOW_37_in_andExpression537); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_37.add(string_literal31);

							}
							break;

					}

					pushFollow(FOLLOW_elementExpression_in_andExpression542);
					exprs=elementExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_elementExpression.add(exprs.getTree());
					if (list_exprs==null) list_exprs=new ArrayList<Object>();
					list_exprs.add(exprs.getTree());
					}
					break;

				default :
					break loop12;
				}
			}

			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (EvaluationExpression)adaptor.nil();
			// 119:3: -> { $exprs.size() == 1 }?
			if ( list_exprs.size() == 1 ) {
				adaptor.addChild(root_0,  list_exprs.get(0) );
			}

			else // 120:3: ->
			{
				adaptor.addChild(root_0,  AndExpression.valueOf((List) list_exprs) );
			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (EvaluationExpression)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "andExpression"


	public static class elementExpression_return extends ParserRuleReturnScope {
		EvaluationExpression tree;
		@Override
		public EvaluationExpression getTree() { return tree; }
	};


	// $ANTLR start "elementExpression"
	// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:122:1: elementExpression : elem= comparisonExpression ( (not= NOT )? IN set= comparisonExpression )? -> { set == null }? $elem -> ^( EXPRESSION[\"ElementInSetExpression\"] $elem $set) ;
	public final MeteorParser.elementExpression_return elementExpression() throws RecognitionException {
		MeteorParser.elementExpression_return retval = new MeteorParser.elementExpression_return();
		retval.start = input.LT(1);

		EvaluationExpression root_0 = null;

		Token not=null;
		Token IN32=null;
		ParserRuleReturnScope elem =null;
		ParserRuleReturnScope set =null;

		EvaluationExpression not_tree=null;
		EvaluationExpression IN32_tree=null;
		RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
		RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
		RewriteRuleSubtreeStream stream_comparisonExpression=new RewriteRuleSubtreeStream(adaptor,"rule comparisonExpression");

		try {
			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:123:2: (elem= comparisonExpression ( (not= NOT )? IN set= comparisonExpression )? -> { set == null }? $elem -> ^( EXPRESSION[\"ElementInSetExpression\"] $elem $set) )
			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:123:4: elem= comparisonExpression ( (not= NOT )? IN set= comparisonExpression )?
			{
			pushFollow(FOLLOW_comparisonExpression_in_elementExpression571);
			elem=comparisonExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_comparisonExpression.add(elem.getTree());
			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:123:30: ( (not= NOT )? IN set= comparisonExpression )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==IN||LA14_0==NOT) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:123:31: (not= NOT )? IN set= comparisonExpression
					{
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:123:34: (not= NOT )?
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0==NOT) ) {
						alt13=1;
					}
					switch (alt13) {
						case 1 :
							// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:123:34: not= NOT
							{
							not=(Token)match(input,NOT,FOLLOW_NOT_in_elementExpression576); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_NOT.add(not);

							}
							break;

					}

					IN32=(Token)match(input,IN,FOLLOW_IN_in_elementExpression579); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_IN.add(IN32);

					pushFollow(FOLLOW_comparisonExpression_in_elementExpression583);
					set=comparisonExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_comparisonExpression.add(set.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: elem, elem, set
			// token labels: 
			// rule labels: elem, retval, set
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_elem=new RewriteRuleSubtreeStream(adaptor,"rule elem",elem!=null?elem.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_set=new RewriteRuleSubtreeStream(adaptor,"rule set",set!=null?set.getTree():null);

			root_0 = (EvaluationExpression)adaptor.nil();
			// 124:2: -> { set == null }? $elem
			if ( set == null ) {
				adaptor.addChild(root_0, stream_elem.nextTree());
			}

			else // 125:2: -> ^( EXPRESSION[\"ElementInSetExpression\"] $elem $set)
			{
				// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:125:5: ^( EXPRESSION[\"ElementInSetExpression\"] $elem $set)
				{
				EvaluationExpression root_1 = (EvaluationExpression)adaptor.nil();
				root_1 = (EvaluationExpression)adaptor.becomeRoot((EvaluationExpression)adaptor.create(EXPRESSION, "ElementInSetExpression"), root_1);
				adaptor.addChild(root_1, stream_elem.nextTree());
				adaptor.addChild(root_1,  not == null ? ElementInSetExpression.Quantor.EXISTS_IN : ElementInSetExpression.Quantor.EXISTS_NOT_IN);
				adaptor.addChild(root_1, stream_set.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (EvaluationExpression)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "elementExpression"


	public static class comparisonExpression_return extends ParserRuleReturnScope {
		EvaluationExpression tree;
		@Override
		public EvaluationExpression getTree() { return tree; }
	};


	// $ANTLR start "comparisonExpression"
	// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:128:1: comparisonExpression : e1= arithmeticExpression ( (s= '<=' |s= '>=' |s= '<' |s= '>' |s= '==' |s= '!=' ) e2= arithmeticExpression )? -> { $s == null }? $e1 -> { $s.getText().equals(\"!=\") }? ^( EXPRESSION[\"ComparativeExpression\"] $e1 $e2) -> { $s.getText().equals(\"==\") }? ^( EXPRESSION[\"ComparativeExpression\"] $e1 $e2) -> ^( EXPRESSION[\"ComparativeExpression\"] $e1 $e2) ;
	public final MeteorParser.comparisonExpression_return comparisonExpression() throws RecognitionException {
		MeteorParser.comparisonExpression_return retval = new MeteorParser.comparisonExpression_return();
		retval.start = input.LT(1);

		EvaluationExpression root_0 = null;

		Token s=null;
		ParserRuleReturnScope e1 =null;
		ParserRuleReturnScope e2 =null;

		EvaluationExpression s_tree=null;
		RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
		RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
		RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
		RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
		RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
		RewriteRuleSubtreeStream stream_arithmeticExpression=new RewriteRuleSubtreeStream(adaptor,"rule arithmeticExpression");

		try {
			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:129:2: (e1= arithmeticExpression ( (s= '<=' |s= '>=' |s= '<' |s= '>' |s= '==' |s= '!=' ) e2= arithmeticExpression )? -> { $s == null }? $e1 -> { $s.getText().equals(\"!=\") }? ^( EXPRESSION[\"ComparativeExpression\"] $e1 $e2) -> { $s.getText().equals(\"==\") }? ^( EXPRESSION[\"ComparativeExpression\"] $e1 $e2) -> ^( EXPRESSION[\"ComparativeExpression\"] $e1 $e2) )
			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:129:4: e1= arithmeticExpression ( (s= '<=' |s= '>=' |s= '<' |s= '>' |s= '==' |s= '!=' ) e2= arithmeticExpression )?
			{
			pushFollow(FOLLOW_arithmeticExpression_in_comparisonExpression624);
			e1=arithmeticExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_arithmeticExpression.add(e1.getTree());
			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:129:28: ( (s= '<=' |s= '>=' |s= '<' |s= '>' |s= '==' |s= '!=' ) e2= arithmeticExpression )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==36||(LA16_0 >= 49 && LA16_0 <= 50)||(LA16_0 >= 52 && LA16_0 <= 54)) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:129:29: (s= '<=' |s= '>=' |s= '<' |s= '>' |s= '==' |s= '!=' ) e2= arithmeticExpression
					{
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:129:29: (s= '<=' |s= '>=' |s= '<' |s= '>' |s= '==' |s= '!=' )
					int alt15=6;
					switch ( input.LA(1) ) {
					case 50:
						{
						alt15=1;
						}
						break;
					case 54:
						{
						alt15=2;
						}
						break;
					case 49:
						{
						alt15=3;
						}
						break;
					case 53:
						{
						alt15=4;
						}
						break;
					case 52:
						{
						alt15=5;
						}
						break;
					case 36:
						{
						alt15=6;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 15, 0, input);
						throw nvae;
					}
					switch (alt15) {
						case 1 :
							// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:129:30: s= '<='
							{
							s=(Token)match(input,50,FOLLOW_50_in_comparisonExpression630); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_50.add(s);

							}
							break;
						case 2 :
							// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:129:39: s= '>='
							{
							s=(Token)match(input,54,FOLLOW_54_in_comparisonExpression636); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_54.add(s);

							}
							break;
						case 3 :
							// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:129:48: s= '<'
							{
							s=(Token)match(input,49,FOLLOW_49_in_comparisonExpression642); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_49.add(s);

							}
							break;
						case 4 :
							// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:129:56: s= '>'
							{
							s=(Token)match(input,53,FOLLOW_53_in_comparisonExpression648); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_53.add(s);

							}
							break;
						case 5 :
							// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:129:64: s= '=='
							{
							s=(Token)match(input,52,FOLLOW_52_in_comparisonExpression654); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_52.add(s);

							}
							break;
						case 6 :
							// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:129:73: s= '!='
							{
							s=(Token)match(input,36,FOLLOW_36_in_comparisonExpression660); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_36.add(s);

							}
							break;

					}

					pushFollow(FOLLOW_arithmeticExpression_in_comparisonExpression665);
					e2=arithmeticExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_arithmeticExpression.add(e2.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: e1, e2, e1, e2, e2, e1, e1
			// token labels: 
			// rule labels: retval, e1, e2
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_e1=new RewriteRuleSubtreeStream(adaptor,"rule e1",e1!=null?e1.getTree():null);
			RewriteRuleSubtreeStream stream_e2=new RewriteRuleSubtreeStream(adaptor,"rule e2",e2!=null?e2.getTree():null);

			root_0 = (EvaluationExpression)adaptor.nil();
			// 130:2: -> { $s == null }? $e1
			if ( s == null ) {
				adaptor.addChild(root_0, stream_e1.nextTree());
			}

			else // 131:3: -> { $s.getText().equals(\"!=\") }? ^( EXPRESSION[\"ComparativeExpression\"] $e1 $e2)
			if ( s.getText().equals("!=") ) {
				// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:131:38: ^( EXPRESSION[\"ComparativeExpression\"] $e1 $e2)
				{
				EvaluationExpression root_1 = (EvaluationExpression)adaptor.nil();
				root_1 = (EvaluationExpression)adaptor.becomeRoot((EvaluationExpression)adaptor.create(EXPRESSION, "ComparativeExpression"), root_1);
				adaptor.addChild(root_1, stream_e1.nextTree());
				adaptor.addChild(root_1, ComparativeExpression.BinaryOperator.NOT_EQUAL);
				adaptor.addChild(root_1, stream_e2.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}

			else // 132:3: -> { $s.getText().equals(\"==\") }? ^( EXPRESSION[\"ComparativeExpression\"] $e1 $e2)
			if ( s.getText().equals("==") ) {
				// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:132:38: ^( EXPRESSION[\"ComparativeExpression\"] $e1 $e2)
				{
				EvaluationExpression root_1 = (EvaluationExpression)adaptor.nil();
				root_1 = (EvaluationExpression)adaptor.becomeRoot((EvaluationExpression)adaptor.create(EXPRESSION, "ComparativeExpression"), root_1);
				adaptor.addChild(root_1, stream_e1.nextTree());
				adaptor.addChild(root_1, ComparativeExpression.BinaryOperator.EQUAL);
				adaptor.addChild(root_1, stream_e2.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}

			else // 133:2: -> ^( EXPRESSION[\"ComparativeExpression\"] $e1 $e2)
			{
				// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:133:6: ^( EXPRESSION[\"ComparativeExpression\"] $e1 $e2)
				{
				EvaluationExpression root_1 = (EvaluationExpression)adaptor.nil();
				root_1 = (EvaluationExpression)adaptor.becomeRoot((EvaluationExpression)adaptor.create(EXPRESSION, "ComparativeExpression"), root_1);
				adaptor.addChild(root_1, stream_e1.nextTree());
				adaptor.addChild(root_1, ComparativeExpression.BinaryOperator.valueOfSymbol((s!=null?s.getText():null)));
				adaptor.addChild(root_1, stream_e2.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (EvaluationExpression)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "comparisonExpression"


	public static class arithmeticExpression_return extends ParserRuleReturnScope {
		EvaluationExpression tree;
		@Override
		public EvaluationExpression getTree() { return tree; }
	};


	// $ANTLR start "arithmeticExpression"
	// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:135:1: arithmeticExpression : e1= multiplicationExpression ( (s= '+' |s= '-' ) e2= multiplicationExpression )? -> { s != null }? ^( EXPRESSION[\"ArithmeticExpression\"] $e1 $e2) -> $e1;
	public final MeteorParser.arithmeticExpression_return arithmeticExpression() throws RecognitionException {
		MeteorParser.arithmeticExpression_return retval = new MeteorParser.arithmeticExpression_return();
		retval.start = input.LT(1);

		EvaluationExpression root_0 = null;

		Token s=null;
		ParserRuleReturnScope e1 =null;
		ParserRuleReturnScope e2 =null;

		EvaluationExpression s_tree=null;
		RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
		RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
		RewriteRuleSubtreeStream stream_multiplicationExpression=new RewriteRuleSubtreeStream(adaptor,"rule multiplicationExpression");

		try {
			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:136:2: (e1= multiplicationExpression ( (s= '+' |s= '-' ) e2= multiplicationExpression )? -> { s != null }? ^( EXPRESSION[\"ArithmeticExpression\"] $e1 $e2) -> $e1)
			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:136:4: e1= multiplicationExpression ( (s= '+' |s= '-' ) e2= multiplicationExpression )?
			{
			pushFollow(FOLLOW_multiplicationExpression_in_arithmeticExpression745);
			e1=multiplicationExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_multiplicationExpression.add(e1.getTree());
			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:136:32: ( (s= '+' |s= '-' ) e2= multiplicationExpression )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==41||LA18_0==44) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:136:33: (s= '+' |s= '-' ) e2= multiplicationExpression
					{
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:136:33: (s= '+' |s= '-' )
					int alt17=2;
					int LA17_0 = input.LA(1);
					if ( (LA17_0==41) ) {
						alt17=1;
					}
					else if ( (LA17_0==44) ) {
						alt17=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 17, 0, input);
						throw nvae;
					}

					switch (alt17) {
						case 1 :
							// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:136:34: s= '+'
							{
							s=(Token)match(input,41,FOLLOW_41_in_arithmeticExpression751); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_41.add(s);

							}
							break;
						case 2 :
							// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:136:42: s= '-'
							{
							s=(Token)match(input,44,FOLLOW_44_in_arithmeticExpression757); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_44.add(s);

							}
							break;

					}

					pushFollow(FOLLOW_multiplicationExpression_in_arithmeticExpression762);
					e2=multiplicationExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_multiplicationExpression.add(e2.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: e1, e1, e2
			// token labels: 
			// rule labels: retval, e1, e2
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_e1=new RewriteRuleSubtreeStream(adaptor,"rule e1",e1!=null?e1.getTree():null);
			RewriteRuleSubtreeStream stream_e2=new RewriteRuleSubtreeStream(adaptor,"rule e2",e2!=null?e2.getTree():null);

			root_0 = (EvaluationExpression)adaptor.nil();
			// 137:2: -> { s != null }? ^( EXPRESSION[\"ArithmeticExpression\"] $e1 $e2)
			if ( s != null ) {
				// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:137:21: ^( EXPRESSION[\"ArithmeticExpression\"] $e1 $e2)
				{
				EvaluationExpression root_1 = (EvaluationExpression)adaptor.nil();
				root_1 = (EvaluationExpression)adaptor.becomeRoot((EvaluationExpression)adaptor.create(EXPRESSION, "ArithmeticExpression"), root_1);
				adaptor.addChild(root_1, stream_e1.nextTree());
				adaptor.addChild(root_1,  s.getText().equals("+") ? ArithmeticExpression.ArithmeticOperator.ADDITION : ArithmeticExpression.ArithmeticOperator.SUBTRACTION);
				adaptor.addChild(root_1, stream_e2.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}

			else // 139:2: -> $e1
			{
				adaptor.addChild(root_0, stream_e1.nextTree());
			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (EvaluationExpression)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "arithmeticExpression"


	public static class multiplicationExpression_return extends ParserRuleReturnScope {
		EvaluationExpression tree;
		@Override
		public EvaluationExpression getTree() { return tree; }
	};


	// $ANTLR start "multiplicationExpression"
	// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:141:1: multiplicationExpression : e1= preincrementExpression ( (s= '*' |s= SLASH ) e2= preincrementExpression )? -> { s != null }? ^( EXPRESSION[\"ArithmeticExpression\"] $e1 $e2) -> $e1;
	public final MeteorParser.multiplicationExpression_return multiplicationExpression() throws RecognitionException {
		MeteorParser.multiplicationExpression_return retval = new MeteorParser.multiplicationExpression_return();
		retval.start = input.LT(1);

		EvaluationExpression root_0 = null;

		Token s=null;
		ParserRuleReturnScope e1 =null;
		ParserRuleReturnScope e2 =null;

		EvaluationExpression s_tree=null;
		RewriteRuleTokenStream stream_STAR=new RewriteRuleTokenStream(adaptor,"token STAR");
		RewriteRuleTokenStream stream_SLASH=new RewriteRuleTokenStream(adaptor,"token SLASH");
		RewriteRuleSubtreeStream stream_preincrementExpression=new RewriteRuleSubtreeStream(adaptor,"rule preincrementExpression");

		try {
			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:142:2: (e1= preincrementExpression ( (s= '*' |s= SLASH ) e2= preincrementExpression )? -> { s != null }? ^( EXPRESSION[\"ArithmeticExpression\"] $e1 $e2) -> $e1)
			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:142:4: e1= preincrementExpression ( (s= '*' |s= SLASH ) e2= preincrementExpression )?
			{
			pushFollow(FOLLOW_preincrementExpression_in_multiplicationExpression805);
			e1=preincrementExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_preincrementExpression.add(e1.getTree());
			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:142:30: ( (s= '*' |s= SLASH ) e2= preincrementExpression )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( ((LA20_0 >= SLASH && LA20_0 <= STAR)) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:142:31: (s= '*' |s= SLASH ) e2= preincrementExpression
					{
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:142:31: (s= '*' |s= SLASH )
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0==STAR) ) {
						alt19=1;
					}
					else if ( (LA19_0==SLASH) ) {
						alt19=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 19, 0, input);
						throw nvae;
					}

					switch (alt19) {
						case 1 :
							// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:142:32: s= '*'
							{
							s=(Token)match(input,STAR,FOLLOW_STAR_in_multiplicationExpression811); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_STAR.add(s);

							}
							break;
						case 2 :
							// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:142:40: s= SLASH
							{
							s=(Token)match(input,SLASH,FOLLOW_SLASH_in_multiplicationExpression817); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_SLASH.add(s);

							}
							break;

					}

					pushFollow(FOLLOW_preincrementExpression_in_multiplicationExpression822);
					e2=preincrementExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_preincrementExpression.add(e2.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: e1, e2, e1
			// token labels: 
			// rule labels: retval, e1, e2
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_e1=new RewriteRuleSubtreeStream(adaptor,"rule e1",e1!=null?e1.getTree():null);
			RewriteRuleSubtreeStream stream_e2=new RewriteRuleSubtreeStream(adaptor,"rule e2",e2!=null?e2.getTree():null);

			root_0 = (EvaluationExpression)adaptor.nil();
			// 143:2: -> { s != null }? ^( EXPRESSION[\"ArithmeticExpression\"] $e1 $e2)
			if ( s != null ) {
				// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:143:21: ^( EXPRESSION[\"ArithmeticExpression\"] $e1 $e2)
				{
				EvaluationExpression root_1 = (EvaluationExpression)adaptor.nil();
				root_1 = (EvaluationExpression)adaptor.becomeRoot((EvaluationExpression)adaptor.create(EXPRESSION, "ArithmeticExpression"), root_1);
				adaptor.addChild(root_1, stream_e1.nextTree());
				adaptor.addChild(root_1,  s.getText().equals("*") ? ArithmeticExpression.ArithmeticOperator.MULTIPLICATION : ArithmeticExpression.ArithmeticOperator.DIVISION);
				adaptor.addChild(root_1, stream_e2.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}

			else // 145:2: -> $e1
			{
				adaptor.addChild(root_0, stream_e1.nextTree());
			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (EvaluationExpression)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "multiplicationExpression"


	public static class preincrementExpression_return extends ParserRuleReturnScope {
		EvaluationExpression tree;
		@Override
		public EvaluationExpression getTree() { return tree; }
	};


	// $ANTLR start "preincrementExpression"
	// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:147:1: preincrementExpression : ( '++' preincrementExpression | '--' preincrementExpression | unaryExpression );
	public final MeteorParser.preincrementExpression_return preincrementExpression() throws RecognitionException {
		MeteorParser.preincrementExpression_return retval = new MeteorParser.preincrementExpression_return();
		retval.start = input.LT(1);

		EvaluationExpression root_0 = null;

		Token string_literal33=null;
		Token string_literal35=null;
		ParserRuleReturnScope preincrementExpression34 =null;
		ParserRuleReturnScope preincrementExpression36 =null;
		ParserRuleReturnScope unaryExpression37 =null;

		EvaluationExpression string_literal33_tree=null;
		EvaluationExpression string_literal35_tree=null;

		try {
			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:148:2: ( '++' preincrementExpression | '--' preincrementExpression | unaryExpression )
			int alt21=3;
			switch ( input.LA(1) ) {
			case 42:
				{
				alt21=1;
				}
				break;
			case 45:
				{
				alt21=2;
				}
				break;
			case DECIMAL:
			case FN:
			case ID:
			case INTEGER:
			case STRING:
			case UINT:
			case VAR:
			case 35:
			case 38:
			case 39:
			case 57:
			case 59:
			case 60:
			case 62:
			case 65:
			case 68:
				{
				alt21=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}
			switch (alt21) {
				case 1 :
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:148:4: '++' preincrementExpression
					{
					root_0 = (EvaluationExpression)adaptor.nil();


					string_literal33=(Token)match(input,42,FOLLOW_42_in_preincrementExpression863); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal33_tree = (EvaluationExpression)adaptor.create(string_literal33);
					adaptor.addChild(root_0, string_literal33_tree);
					}

					pushFollow(FOLLOW_preincrementExpression_in_preincrementExpression865);
					preincrementExpression34=preincrementExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, preincrementExpression34.getTree());

					}
					break;
				case 2 :
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:149:4: '--' preincrementExpression
					{
					root_0 = (EvaluationExpression)adaptor.nil();


					string_literal35=(Token)match(input,45,FOLLOW_45_in_preincrementExpression870); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal35_tree = (EvaluationExpression)adaptor.create(string_literal35);
					adaptor.addChild(root_0, string_literal35_tree);
					}

					pushFollow(FOLLOW_preincrementExpression_in_preincrementExpression872);
					preincrementExpression36=preincrementExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, preincrementExpression36.getTree());

					}
					break;
				case 3 :
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:150:4: unaryExpression
					{
					root_0 = (EvaluationExpression)adaptor.nil();


					pushFollow(FOLLOW_unaryExpression_in_preincrementExpression877);
					unaryExpression37=unaryExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression37.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (EvaluationExpression)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "preincrementExpression"


	public static class unaryExpression_return extends ParserRuleReturnScope {
		EvaluationExpression tree;
		@Override
		public EvaluationExpression getTree() { return tree; }
	};


	// $ANTLR start "unaryExpression"
	// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:152:1: unaryExpression : ( '!' | '~' )? castExpression ;
	public final MeteorParser.unaryExpression_return unaryExpression() throws RecognitionException {
		MeteorParser.unaryExpression_return retval = new MeteorParser.unaryExpression_return();
		retval.start = input.LT(1);

		EvaluationExpression root_0 = null;

		Token set38=null;
		ParserRuleReturnScope castExpression39 =null;

		EvaluationExpression set38_tree=null;

		try {
			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:153:2: ( ( '!' | '~' )? castExpression )
			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:153:4: ( '!' | '~' )? castExpression
			{
			root_0 = (EvaluationExpression)adaptor.nil();


			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:153:4: ( '!' | '~' )?
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==35||LA22_0==68) ) {
				alt22=1;
			}
			switch (alt22) {
				case 1 :
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:
					{
					set38=input.LT(1);
					if ( input.LA(1)==35||input.LA(1)==68 ) {
						input.consume();
						if ( state.backtracking==0 ) adaptor.addChild(root_0, (EvaluationExpression)adaptor.create(set38));
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}
					break;

			}

			pushFollow(FOLLOW_castExpression_in_unaryExpression896);
			castExpression39=castExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, castExpression39.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (EvaluationExpression)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "unaryExpression"


	public static class castExpression_return extends ParserRuleReturnScope {
		EvaluationExpression tree;
		@Override
		public EvaluationExpression getTree() { return tree; }
	};


	// $ANTLR start "castExpression"
	// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:159:1: castExpression : ( ( '(' ID ')' )=> '(' type= ID ')' expr= generalPathExpression ->|expr= generalPathExpression ({...}? ID type= ID )? ->);
	public final MeteorParser.castExpression_return castExpression() throws RecognitionException {
		MeteorParser.castExpression_return retval = new MeteorParser.castExpression_return();
		retval.start = input.LT(1);

		EvaluationExpression root_0 = null;

		Token type=null;
		Token char_literal40=null;
		Token char_literal41=null;
		Token ID42=null;
		ParserRuleReturnScope expr =null;

		EvaluationExpression type_tree=null;
		EvaluationExpression char_literal40_tree=null;
		EvaluationExpression char_literal41_tree=null;
		EvaluationExpression ID42_tree=null;
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleSubtreeStream stream_generalPathExpression=new RewriteRuleSubtreeStream(adaptor,"rule generalPathExpression");

		try {
			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:160:2: ( ( '(' ID ')' )=> '(' type= ID ')' expr= generalPathExpression ->|expr= generalPathExpression ({...}? ID type= ID )? ->)
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==39) ) {
				int LA24_1 = input.LA(2);
				if ( (synpred4_Meteor()) ) {
					alt24=1;
				}
				else if ( (true) ) {
					alt24=2;
				}

			}
			else if ( (LA24_0==DECIMAL||LA24_0==FN||LA24_0==ID||LA24_0==INTEGER||(LA24_0 >= STRING && LA24_0 <= UINT)||LA24_0==VAR||LA24_0==38||LA24_0==57||(LA24_0 >= 59 && LA24_0 <= 60)||LA24_0==62||LA24_0==65) ) {
				alt24=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}

			switch (alt24) {
				case 1 :
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:160:4: ( '(' ID ')' )=> '(' type= ID ')' expr= generalPathExpression
					{
					char_literal40=(Token)match(input,39,FOLLOW_39_in_castExpression916); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_39.add(char_literal40);

					type=(Token)match(input,ID,FOLLOW_ID_in_castExpression920); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ID.add(type);

					char_literal41=(Token)match(input,40,FOLLOW_40_in_castExpression922); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_40.add(char_literal41);

					pushFollow(FOLLOW_generalPathExpression_in_castExpression926);
					expr=generalPathExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_generalPathExpression.add(expr.getTree());
					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (EvaluationExpression)adaptor.nil();
					// 161:3: ->
					{
						adaptor.addChild(root_0,  coerce((type!=null?type.getText():null), (expr!=null?((EvaluationExpression)expr.getTree()):null)) );
					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:162:4: expr= generalPathExpression ({...}? ID type= ID )?
					{
					pushFollow(FOLLOW_generalPathExpression_in_castExpression939);
					expr=generalPathExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_generalPathExpression.add(expr.getTree());
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:162:31: ({...}? ID type= ID )?
					int alt23=2;
					int LA23_0 = input.LA(1);
					if ( (LA23_0==ID) ) {
						int LA23_1 = input.LA(2);
						if ( (LA23_1==ID) ) {
							int LA23_3 = input.LA(3);
							if ( ((input.LT(1).getText().equals("as"))) ) {
								alt23=1;
							}
						}
					}
					switch (alt23) {
						case 1 :
							// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:162:32: {...}? ID type= ID
							{
							if ( !((input.LT(1).getText().equals("as"))) ) {
								if (state.backtracking>0) {state.failed=true; return retval;}
								throw new FailedPredicateException(input, "castExpression", "input.LT(1).getText().equals(\"as\")");
							}
							ID42=(Token)match(input,ID,FOLLOW_ID_in_castExpression944); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_ID.add(ID42);

							type=(Token)match(input,ID,FOLLOW_ID_in_castExpression948); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_ID.add(type);

							}
							break;

					}

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (EvaluationExpression)adaptor.nil();
					// 163:2: ->
					{
						adaptor.addChild(root_0,  type == null ? (expr!=null?((EvaluationExpression)expr.getTree()):null) : coerce((type!=null?type.getText():null), (expr!=null?((EvaluationExpression)expr.getTree()):null)));
					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (EvaluationExpression)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "castExpression"


	public static class generalPathExpression_return extends ParserRuleReturnScope {
		EvaluationExpression tree;
		@Override
		public EvaluationExpression getTree() { return tree; }
	};


	// $ANTLR start "generalPathExpression"
	// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:165:1: generalPathExpression : value= valueExpression ( ( pathExpression[EvaluationExpression.VALUE] )=>path= pathExpression[$value.tree] -> $path| -> $value) ;
	public final MeteorParser.generalPathExpression_return generalPathExpression() throws RecognitionException {
		MeteorParser.generalPathExpression_return retval = new MeteorParser.generalPathExpression_return();
		retval.start = input.LT(1);

		EvaluationExpression root_0 = null;

		ParserRuleReturnScope value =null;
		ParserRuleReturnScope path =null;

		RewriteRuleSubtreeStream stream_valueExpression=new RewriteRuleSubtreeStream(adaptor,"rule valueExpression");
		RewriteRuleSubtreeStream stream_pathExpression=new RewriteRuleSubtreeStream(adaptor,"rule pathExpression");

		try {
			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:166:2: (value= valueExpression ( ( pathExpression[EvaluationExpression.VALUE] )=>path= pathExpression[$value.tree] -> $path| -> $value) )
			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:166:4: value= valueExpression ( ( pathExpression[EvaluationExpression.VALUE] )=>path= pathExpression[$value.tree] -> $path| -> $value)
			{
			pushFollow(FOLLOW_valueExpression_in_generalPathExpression967);
			value=valueExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_valueExpression.add(value.getTree());
			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:167:4: ( ( pathExpression[EvaluationExpression.VALUE] )=>path= pathExpression[$value.tree] -> $path| -> $value)
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==56) && (synpred5_Meteor())) {
				alt25=1;
			}
			else if ( (LA25_0==46) && (synpred5_Meteor())) {
				alt25=1;
			}
			else if ( (LA25_0==57) && (synpred5_Meteor())) {
				alt25=1;
			}
			else if ( (LA25_0==EOF||LA25_0==AND||(LA25_0 >= ID && LA25_0 <= IN)||LA25_0==NOT||LA25_0==OR||(LA25_0 >= SLASH && LA25_0 <= STAR)||(LA25_0 >= 36 && LA25_0 <= 37)||(LA25_0 >= 40 && LA25_0 <= 41)||(LA25_0 >= 43 && LA25_0 <= 44)||(LA25_0 >= 47 && LA25_0 <= 50)||(LA25_0 >= 52 && LA25_0 <= 55)||LA25_0==58||(LA25_0 >= 66 && LA25_0 <= 67)) ) {
				alt25=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}

			switch (alt25) {
				case 1 :
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:167:5: ( pathExpression[EvaluationExpression.VALUE] )=>path= pathExpression[$value.tree]
					{
					pushFollow(FOLLOW_pathExpression_in_generalPathExpression982);
					path=pathExpression((value!=null?((EvaluationExpression)value.getTree()):null));
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_pathExpression.add(path.getTree());
					// AST REWRITE
					// elements: path
					// token labels: 
					// rule labels: retval, path
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_path=new RewriteRuleSubtreeStream(adaptor,"rule path",path!=null?path.getTree():null);

					root_0 = (EvaluationExpression)adaptor.nil();
					// 167:85: -> $path
					{
						adaptor.addChild(root_0, stream_path.nextTree());
					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:168:7: 
					{
					// AST REWRITE
					// elements: value
					// token labels: 
					// rule labels: retval, value
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value",value!=null?value.getTree():null);

					root_0 = (EvaluationExpression)adaptor.nil();
					// 168:7: -> $value
					{
						adaptor.addChild(root_0, stream_value.nextTree());
					}


					retval.tree = root_0;
					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (EvaluationExpression)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "generalPathExpression"


	public static class contextAwarePathExpression_return extends ParserRuleReturnScope {
		EvaluationExpression tree;
		@Override
		public EvaluationExpression getTree() { return tree; }
	};


	// $ANTLR start "contextAwarePathExpression"
	// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:170:1: contextAwarePathExpression[EvaluationExpression context] : pathExpression[context] ;
	public final MeteorParser.contextAwarePathExpression_return contextAwarePathExpression(EvaluationExpression context) throws RecognitionException {
		MeteorParser.contextAwarePathExpression_return retval = new MeteorParser.contextAwarePathExpression_return();
		retval.start = input.LT(1);

		EvaluationExpression root_0 = null;

		ParserRuleReturnScope pathExpression43 =null;


		try {
			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:171:3: ( pathExpression[context] )
			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:171:5: pathExpression[context]
			{
			root_0 = (EvaluationExpression)adaptor.nil();


			pushFollow(FOLLOW_pathExpression_in_contextAwarePathExpression1011);
			pathExpression43=pathExpression(context);
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, pathExpression43.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (EvaluationExpression)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "contextAwarePathExpression"


	public static class pathExpression_return extends ParserRuleReturnScope {
		EvaluationExpression tree;
		@Override
		public EvaluationExpression getTree() { return tree; }
	};


	// $ANTLR start "pathExpression"
	// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:173:1: pathExpression[EvaluationExpression inExp] : ( ( '?.' ID '(' )=> '?.' call= methodCall[inExp] ( ( pathSegment )=>path= pathExpression[new TernaryExpression(new NotNullOrMissingBooleanExpression().withInputExpression(inExp), $call.tree)] -> $path| -> ^( EXPRESSION[\"TernaryExpression\"] $call) ) | ( '.' ID '(' )=> '.' call= methodCall[inExp] ( ( pathSegment )=>path= pathExpression[$call.tree] -> $path| -> $call) |seg= pathSegment ( ( pathSegment )=>path= pathExpression[$seg.tree] -> $path| -> $seg) );
	public final MeteorParser.pathExpression_return pathExpression(EvaluationExpression inExp) throws RecognitionException {
		MeteorParser.pathExpression_return retval = new MeteorParser.pathExpression_return();
		retval.start = input.LT(1);

		EvaluationExpression root_0 = null;

		Token string_literal44=null;
		Token char_literal45=null;
		ParserRuleReturnScope call =null;
		ParserRuleReturnScope path =null;
		ParserRuleReturnScope seg =null;

		EvaluationExpression string_literal44_tree=null;
		EvaluationExpression char_literal45_tree=null;
		RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
		RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
		RewriteRuleSubtreeStream stream_pathSegment=new RewriteRuleSubtreeStream(adaptor,"rule pathSegment");
		RewriteRuleSubtreeStream stream_methodCall=new RewriteRuleSubtreeStream(adaptor,"rule methodCall");
		RewriteRuleSubtreeStream stream_pathExpression=new RewriteRuleSubtreeStream(adaptor,"rule pathExpression");

		try {
			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:174:3: ( ( '?.' ID '(' )=> '?.' call= methodCall[inExp] ( ( pathSegment )=>path= pathExpression[new TernaryExpression(new NotNullOrMissingBooleanExpression().withInputExpression(inExp), $call.tree)] -> $path| -> ^( EXPRESSION[\"TernaryExpression\"] $call) ) | ( '.' ID '(' )=> '.' call= methodCall[inExp] ( ( pathSegment )=>path= pathExpression[$call.tree] -> $path| -> $call) |seg= pathSegment ( ( pathSegment )=>path= pathExpression[$seg.tree] -> $path| -> $seg) )
			int alt29=3;
			switch ( input.LA(1) ) {
			case 56:
				{
				int LA29_1 = input.LA(2);
				if ( (synpred6_Meteor()) ) {
					alt29=1;
				}
				else if ( (true) ) {
					alt29=3;
				}

				}
				break;
			case 46:
				{
				int LA29_2 = input.LA(2);
				if ( (synpred8_Meteor()) ) {
					alt29=2;
				}
				else if ( (true) ) {
					alt29=3;
				}

				}
				break;
			case 57:
				{
				alt29=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 29, 0, input);
				throw nvae;
			}
			switch (alt29) {
				case 1 :
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:175:5: ( '?.' ID '(' )=> '?.' call= methodCall[inExp] ( ( pathSegment )=>path= pathExpression[new TernaryExpression(new NotNullOrMissingBooleanExpression().withInputExpression(inExp), $call.tree)] -> $path| -> ^( EXPRESSION[\"TernaryExpression\"] $call) )
					{
					string_literal44=(Token)match(input,56,FOLLOW_56_in_pathExpression1039); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_56.add(string_literal44);

					pushFollow(FOLLOW_methodCall_in_pathExpression1043);
					call=methodCall(inExp);
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_methodCall.add(call.getTree());
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:176:7: ( ( pathSegment )=>path= pathExpression[new TernaryExpression(new NotNullOrMissingBooleanExpression().withInputExpression(inExp), $call.tree)] -> $path| -> ^( EXPRESSION[\"TernaryExpression\"] $call) )
					int alt26=2;
					int LA26_0 = input.LA(1);
					if ( (LA26_0==56) && (synpred7_Meteor())) {
						alt26=1;
					}
					else if ( (LA26_0==46) && (synpred7_Meteor())) {
						alt26=1;
					}
					else if ( (LA26_0==57) && (synpred7_Meteor())) {
						alt26=1;
					}
					else if ( (LA26_0==EOF||LA26_0==AND||(LA26_0 >= ID && LA26_0 <= IN)||LA26_0==NOT||LA26_0==OR||(LA26_0 >= SLASH && LA26_0 <= STAR)||(LA26_0 >= 36 && LA26_0 <= 37)||(LA26_0 >= 40 && LA26_0 <= 41)||(LA26_0 >= 43 && LA26_0 <= 44)||(LA26_0 >= 47 && LA26_0 <= 50)||(LA26_0 >= 52 && LA26_0 <= 55)||LA26_0==58||(LA26_0 >= 66 && LA26_0 <= 67)) ) {
						alt26=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 26, 0, input);
						throw nvae;
					}

					switch (alt26) {
						case 1 :
							// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:176:8: ( pathSegment )=>path= pathExpression[new TernaryExpression(new NotNullOrMissingBooleanExpression().withInputExpression(inExp), $call.tree)]
							{
							pushFollow(FOLLOW_pathExpression_in_pathExpression1060);
							path=pathExpression(new TernaryExpression(new NotNullOrMissingBooleanExpression().withInputExpression(inExp), (call!=null?((EvaluationExpression)call.getTree()):null)));
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_pathExpression.add(path.getTree());
							// AST REWRITE
							// elements: path
							// token labels: 
							// rule labels: retval, path
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							if ( state.backtracking==0 ) {
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
							RewriteRuleSubtreeStream stream_path=new RewriteRuleSubtreeStream(adaptor,"rule path",path!=null?path.getTree():null);

							root_0 = (EvaluationExpression)adaptor.nil();
							// 176:146: -> $path
							{
								adaptor.addChild(root_0, stream_path.nextTree());
							}


							retval.tree = root_0;
							}

							}
							break;
						case 2 :
							// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:177:8: 
							{
							// AST REWRITE
							// elements: call
							// token labels: 
							// rule labels: call, retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							if ( state.backtracking==0 ) {
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_call=new RewriteRuleSubtreeStream(adaptor,"rule call",call!=null?call.getTree():null);
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (EvaluationExpression)adaptor.nil();
							// 177:8: -> ^( EXPRESSION[\"TernaryExpression\"] $call)
							{
								// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:177:11: ^( EXPRESSION[\"TernaryExpression\"] $call)
								{
								EvaluationExpression root_1 = (EvaluationExpression)adaptor.nil();
								root_1 = (EvaluationExpression)adaptor.becomeRoot((EvaluationExpression)adaptor.create(EXPRESSION, "TernaryExpression"), root_1);
								adaptor.addChild(root_1, new NotNullOrMissingBooleanExpression().withInputExpression(inExp));
								adaptor.addChild(root_1, stream_call.nextTree());
								adaptor.addChild(root_1, inExp);
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;
							}

							}
							break;

					}

					}
					break;
				case 2 :
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:179:5: ( '.' ID '(' )=> '.' call= methodCall[inExp] ( ( pathSegment )=>path= pathExpression[$call.tree] -> $path| -> $call)
					{
					char_literal45=(Token)match(input,46,FOLLOW_46_in_pathExpression1110); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_46.add(char_literal45);

					pushFollow(FOLLOW_methodCall_in_pathExpression1114);
					call=methodCall(inExp);
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_methodCall.add(call.getTree());
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:180:7: ( ( pathSegment )=>path= pathExpression[$call.tree] -> $path| -> $call)
					int alt27=2;
					int LA27_0 = input.LA(1);
					if ( (LA27_0==56) && (synpred9_Meteor())) {
						alt27=1;
					}
					else if ( (LA27_0==46) && (synpred9_Meteor())) {
						alt27=1;
					}
					else if ( (LA27_0==57) && (synpred9_Meteor())) {
						alt27=1;
					}
					else if ( (LA27_0==EOF||LA27_0==AND||(LA27_0 >= ID && LA27_0 <= IN)||LA27_0==NOT||LA27_0==OR||(LA27_0 >= SLASH && LA27_0 <= STAR)||(LA27_0 >= 36 && LA27_0 <= 37)||(LA27_0 >= 40 && LA27_0 <= 41)||(LA27_0 >= 43 && LA27_0 <= 44)||(LA27_0 >= 47 && LA27_0 <= 50)||(LA27_0 >= 52 && LA27_0 <= 55)||LA27_0==58||(LA27_0 >= 66 && LA27_0 <= 67)) ) {
						alt27=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 27, 0, input);
						throw nvae;
					}

					switch (alt27) {
						case 1 :
							// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:180:8: ( pathSegment )=>path= pathExpression[$call.tree]
							{
							pushFollow(FOLLOW_pathExpression_in_pathExpression1131);
							path=pathExpression((call!=null?((EvaluationExpression)call.getTree()):null));
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_pathExpression.add(path.getTree());
							// AST REWRITE
							// elements: path
							// token labels: 
							// rule labels: retval, path
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							if ( state.backtracking==0 ) {
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
							RewriteRuleSubtreeStream stream_path=new RewriteRuleSubtreeStream(adaptor,"rule path",path!=null?path.getTree():null);

							root_0 = (EvaluationExpression)adaptor.nil();
							// 180:55: -> $path
							{
								adaptor.addChild(root_0, stream_path.nextTree());
							}


							retval.tree = root_0;
							}

							}
							break;
						case 2 :
							// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:180:66: 
							{
							// AST REWRITE
							// elements: call
							// token labels: 
							// rule labels: call, retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							if ( state.backtracking==0 ) {
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_call=new RewriteRuleSubtreeStream(adaptor,"rule call",call!=null?call.getTree():null);
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (EvaluationExpression)adaptor.nil();
							// 180:66: -> $call
							{
								adaptor.addChild(root_0, stream_call.nextTree());
							}


							retval.tree = root_0;
							}

							}
							break;

					}

					}
					break;
				case 3 :
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:182:5: seg= pathSegment ( ( pathSegment )=>path= pathExpression[$seg.tree] -> $path| -> $seg)
					{
					pushFollow(FOLLOW_pathSegment_in_pathExpression1157);
					seg=pathSegment();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_pathSegment.add(seg.getTree());
					if ( state.backtracking==0 ) { ((PathSegmentExpression) seg.getTree()).setInputExpression(inExp); }
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:183:5: ( ( pathSegment )=>path= pathExpression[$seg.tree] -> $path| -> $seg)
					int alt28=2;
					int LA28_0 = input.LA(1);
					if ( (LA28_0==56) && (synpred10_Meteor())) {
						alt28=1;
					}
					else if ( (LA28_0==46) && (synpred10_Meteor())) {
						alt28=1;
					}
					else if ( (LA28_0==57) && (synpred10_Meteor())) {
						alt28=1;
					}
					else if ( (LA28_0==EOF||LA28_0==AND||(LA28_0 >= ID && LA28_0 <= IN)||LA28_0==NOT||LA28_0==OR||(LA28_0 >= SLASH && LA28_0 <= STAR)||(LA28_0 >= 36 && LA28_0 <= 37)||(LA28_0 >= 40 && LA28_0 <= 41)||(LA28_0 >= 43 && LA28_0 <= 44)||(LA28_0 >= 47 && LA28_0 <= 50)||(LA28_0 >= 52 && LA28_0 <= 55)||LA28_0==58||(LA28_0 >= 66 && LA28_0 <= 67)) ) {
						alt28=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 28, 0, input);
						throw nvae;
					}

					switch (alt28) {
						case 1 :
							// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:183:6: ( pathSegment )=>path= pathExpression[$seg.tree]
							{
							pushFollow(FOLLOW_pathExpression_in_pathExpression1173);
							path=pathExpression((seg!=null?((EvaluationExpression)seg.getTree()):null));
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_pathExpression.add(path.getTree());
							// AST REWRITE
							// elements: path
							// token labels: 
							// rule labels: retval, path
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							if ( state.backtracking==0 ) {
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
							RewriteRuleSubtreeStream stream_path=new RewriteRuleSubtreeStream(adaptor,"rule path",path!=null?path.getTree():null);

							root_0 = (EvaluationExpression)adaptor.nil();
							// 183:53: -> $path
							{
								adaptor.addChild(root_0, stream_path.nextTree());
							}


							retval.tree = root_0;
							}

							}
							break;
						case 2 :
							// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:183:64: 
							{
							// AST REWRITE
							// elements: seg
							// token labels: 
							// rule labels: retval, seg
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							if ( state.backtracking==0 ) {
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
							RewriteRuleSubtreeStream stream_seg=new RewriteRuleSubtreeStream(adaptor,"rule seg",seg!=null?seg.getTree():null);

							root_0 = (EvaluationExpression)adaptor.nil();
							// 183:64: -> $seg
							{
								adaptor.addChild(root_0, stream_seg.nextTree());
							}


							retval.tree = root_0;
							}

							}
							break;

					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (EvaluationExpression)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (NoViableAltException re) {
			 explainUsage("in a path expression only .field, ?.field, [...], and .method(...) are allowed", re); 
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "pathExpression"


	public static class pathSegment_return extends ParserRuleReturnScope {
		EvaluationExpression tree;
		@Override
		public EvaluationExpression getTree() { return tree; }
	};


	// $ANTLR start "pathSegment"
	// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:186:1: pathSegment : ( ( '?.' )=> '?.' field= ID -> ^( EXPRESSION[\"TernaryExpression\"] ) | ( '.' )=> '.' field= ID -> ^( EXPRESSION[\"ObjectAccess\"] ) | ( '[' )=> arrayAccess );
	public final MeteorParser.pathSegment_return pathSegment() throws RecognitionException {
		MeteorParser.pathSegment_return retval = new MeteorParser.pathSegment_return();
		retval.start = input.LT(1);

		EvaluationExpression root_0 = null;

		Token field=null;
		Token string_literal46=null;
		Token char_literal47=null;
		ParserRuleReturnScope arrayAccess48 =null;

		EvaluationExpression field_tree=null;
		EvaluationExpression string_literal46_tree=null;
		EvaluationExpression char_literal47_tree=null;
		RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
		RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

		  paraphrase.push("a path expression"); 
		try {
			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:189:3: ( ( '?.' )=> '?.' field= ID -> ^( EXPRESSION[\"TernaryExpression\"] ) | ( '.' )=> '.' field= ID -> ^( EXPRESSION[\"ObjectAccess\"] ) | ( '[' )=> arrayAccess )
			int alt30=3;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==56) && (synpred11_Meteor())) {
				alt30=1;
			}
			else if ( (LA30_0==46) && (synpred12_Meteor())) {
				alt30=2;
			}
			else if ( (LA30_0==57) && (synpred13_Meteor())) {
				alt30=3;
			}

			switch (alt30) {
				case 1 :
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:190:5: ( '?.' )=> '?.' field= ID
					{
					string_literal46=(Token)match(input,56,FOLLOW_56_in_pathSegment1225); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_56.add(string_literal46);

					field=(Token)match(input,ID,FOLLOW_ID_in_pathSegment1229); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ID.add(field);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (EvaluationExpression)adaptor.nil();
					// 190:28: -> ^( EXPRESSION[\"TernaryExpression\"] )
					{
						// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:190:31: ^( EXPRESSION[\"TernaryExpression\"] )
						{
						EvaluationExpression root_1 = (EvaluationExpression)adaptor.nil();
						root_1 = (EvaluationExpression)adaptor.becomeRoot((EvaluationExpression)adaptor.create(EXPRESSION, "TernaryExpression"), root_1);
						adaptor.addChild(root_1, new NotNullOrMissingBooleanExpression());
						adaptor.addChild(root_1, new ObjectAccess((field!=null?field.getText():null)));
						adaptor.addChild(root_1, EvaluationExpression.VALUE);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:191:5: ( '.' )=> '.' field= ID
					{
					char_literal47=(Token)match(input,46,FOLLOW_46_in_pathSegment1257); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_46.add(char_literal47);

					field=(Token)match(input,ID,FOLLOW_ID_in_pathSegment1261); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ID.add(field);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (EvaluationExpression)adaptor.nil();
					// 191:27: -> ^( EXPRESSION[\"ObjectAccess\"] )
					{
						// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:191:30: ^( EXPRESSION[\"ObjectAccess\"] )
						{
						EvaluationExpression root_1 = (EvaluationExpression)adaptor.nil();
						root_1 = (EvaluationExpression)adaptor.becomeRoot((EvaluationExpression)adaptor.create(EXPRESSION, "ObjectAccess"), root_1);
						adaptor.addChild(root_1, (field!=null?field.getText():null));
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:192:5: ( '[' )=> arrayAccess
					{
					root_0 = (EvaluationExpression)adaptor.nil();


					pushFollow(FOLLOW_arrayAccess_in_pathSegment1286);
					arrayAccess48=arrayAccess();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayAccess48.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (EvaluationExpression)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { paraphrase.pop(); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "pathSegment"


	public static class arrayAccess_return extends ParserRuleReturnScope {
		EvaluationExpression tree;
		@Override
		public EvaluationExpression getTree() { return tree; }
	};


	// $ANTLR start "arrayAccess"
	// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:194:1: arrayAccess : ( '[' STAR ']' ( ( '.' methodCall[null] )=> '.' call= methodCall[EvaluationExpression.VALUE] -> ^( EXPRESSION[\"ArrayProjection\"] $call) |path= pathSegment -> ^( EXPRESSION[\"ArrayProjection\"] $path) ) | '[' (pos= INTEGER |pos= UINT ) ']' -> ^( EXPRESSION[\"ArrayAccess\"] ) | '[' (start= INTEGER |start= UINT ) ':' (end= INTEGER |end= UINT ) ']' -> ^( EXPRESSION[\"ArrayAccess\"] ) );
	public final MeteorParser.arrayAccess_return arrayAccess() throws RecognitionException {
		MeteorParser.arrayAccess_return retval = new MeteorParser.arrayAccess_return();
		retval.start = input.LT(1);

		EvaluationExpression root_0 = null;

		Token pos=null;
		Token start=null;
		Token end=null;
		Token char_literal49=null;
		Token STAR50=null;
		Token char_literal51=null;
		Token char_literal52=null;
		Token char_literal53=null;
		Token char_literal54=null;
		Token char_literal55=null;
		Token char_literal56=null;
		Token char_literal57=null;
		ParserRuleReturnScope call =null;
		ParserRuleReturnScope path =null;

		EvaluationExpression pos_tree=null;
		EvaluationExpression start_tree=null;
		EvaluationExpression end_tree=null;
		EvaluationExpression char_literal49_tree=null;
		EvaluationExpression STAR50_tree=null;
		EvaluationExpression char_literal51_tree=null;
		EvaluationExpression char_literal52_tree=null;
		EvaluationExpression char_literal53_tree=null;
		EvaluationExpression char_literal54_tree=null;
		EvaluationExpression char_literal55_tree=null;
		EvaluationExpression char_literal56_tree=null;
		EvaluationExpression char_literal57_tree=null;
		RewriteRuleTokenStream stream_INTEGER=new RewriteRuleTokenStream(adaptor,"token INTEGER");
		RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
		RewriteRuleTokenStream stream_STAR=new RewriteRuleTokenStream(adaptor,"token STAR");
		RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
		RewriteRuleTokenStream stream_UINT=new RewriteRuleTokenStream(adaptor,"token UINT");
		RewriteRuleSubtreeStream stream_methodCall=new RewriteRuleSubtreeStream(adaptor,"rule methodCall");
		RewriteRuleSubtreeStream stream_pathSegment=new RewriteRuleSubtreeStream(adaptor,"rule pathSegment");

		try {
			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:195:3: ( '[' STAR ']' ( ( '.' methodCall[null] )=> '.' call= methodCall[EvaluationExpression.VALUE] -> ^( EXPRESSION[\"ArrayProjection\"] $call) |path= pathSegment -> ^( EXPRESSION[\"ArrayProjection\"] $path) ) | '[' (pos= INTEGER |pos= UINT ) ']' -> ^( EXPRESSION[\"ArrayAccess\"] ) | '[' (start= INTEGER |start= UINT ) ':' (end= INTEGER |end= UINT ) ']' -> ^( EXPRESSION[\"ArrayAccess\"] ) )
			int alt35=3;
			int LA35_0 = input.LA(1);
			if ( (LA35_0==57) ) {
				switch ( input.LA(2) ) {
				case STAR:
					{
					alt35=1;
					}
					break;
				case INTEGER:
					{
					int LA35_3 = input.LA(3);
					if ( (LA35_3==58) ) {
						alt35=2;
					}
					else if ( (LA35_3==47) ) {
						alt35=3;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 35, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case UINT:
					{
					int LA35_4 = input.LA(3);
					if ( (LA35_4==58) ) {
						alt35=2;
					}
					else if ( (LA35_4==47) ) {
						alt35=3;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 35, 4, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 35, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 35, 0, input);
				throw nvae;
			}

			switch (alt35) {
				case 1 :
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:195:5: '[' STAR ']' ( ( '.' methodCall[null] )=> '.' call= methodCall[EvaluationExpression.VALUE] -> ^( EXPRESSION[\"ArrayProjection\"] $call) |path= pathSegment -> ^( EXPRESSION[\"ArrayProjection\"] $path) )
					{
					char_literal49=(Token)match(input,57,FOLLOW_57_in_arrayAccess1296); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_57.add(char_literal49);

					STAR50=(Token)match(input,STAR,FOLLOW_STAR_in_arrayAccess1298); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_STAR.add(STAR50);

					char_literal51=(Token)match(input,58,FOLLOW_58_in_arrayAccess1300); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_58.add(char_literal51);

					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:195:18: ( ( '.' methodCall[null] )=> '.' call= methodCall[EvaluationExpression.VALUE] -> ^( EXPRESSION[\"ArrayProjection\"] $call) |path= pathSegment -> ^( EXPRESSION[\"ArrayProjection\"] $path) )
					int alt31=2;
					int LA31_0 = input.LA(1);
					if ( (LA31_0==46) ) {
						int LA31_1 = input.LA(2);
						if ( (synpred14_Meteor()) ) {
							alt31=1;
						}
						else if ( (true) ) {
							alt31=2;
						}

					}
					else if ( ((LA31_0 >= 56 && LA31_0 <= 57)) ) {
						alt31=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 31, 0, input);
						throw nvae;
					}

					switch (alt31) {
						case 1 :
							// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:195:19: ( '.' methodCall[null] )=> '.' call= methodCall[EvaluationExpression.VALUE]
							{
							char_literal52=(Token)match(input,46,FOLLOW_46_in_arrayAccess1311); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_46.add(char_literal52);

							pushFollow(FOLLOW_methodCall_in_arrayAccess1315);
							call=methodCall(EvaluationExpression.VALUE);
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_methodCall.add(call.getTree());
							// AST REWRITE
							// elements: call
							// token labels: 
							// rule labels: call, retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							if ( state.backtracking==0 ) {
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_call=new RewriteRuleSubtreeStream(adaptor,"rule call",call!=null?call.getTree():null);
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (EvaluationExpression)adaptor.nil();
							// 196:4: -> ^( EXPRESSION[\"ArrayProjection\"] $call)
							{
								// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:196:7: ^( EXPRESSION[\"ArrayProjection\"] $call)
								{
								EvaluationExpression root_1 = (EvaluationExpression)adaptor.nil();
								root_1 = (EvaluationExpression)adaptor.becomeRoot((EvaluationExpression)adaptor.create(EXPRESSION, "ArrayProjection"), root_1);
								adaptor.addChild(root_1, stream_call.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;
							}

							}
							break;
						case 2 :
							// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:197:6: path= pathSegment
							{
							pushFollow(FOLLOW_pathSegment_in_arrayAccess1338);
							path=pathSegment();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_pathSegment.add(path.getTree());
							// AST REWRITE
							// elements: path
							// token labels: 
							// rule labels: retval, path
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							if ( state.backtracking==0 ) {
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
							RewriteRuleSubtreeStream stream_path=new RewriteRuleSubtreeStream(adaptor,"rule path",path!=null?path.getTree():null);

							root_0 = (EvaluationExpression)adaptor.nil();
							// 198:4: -> ^( EXPRESSION[\"ArrayProjection\"] $path)
							{
								// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:198:7: ^( EXPRESSION[\"ArrayProjection\"] $path)
								{
								EvaluationExpression root_1 = (EvaluationExpression)adaptor.nil();
								root_1 = (EvaluationExpression)adaptor.becomeRoot((EvaluationExpression)adaptor.create(EXPRESSION, "ArrayProjection"), root_1);
								adaptor.addChild(root_1, stream_path.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;
							}

							}
							break;

					}

					}
					break;
				case 2 :
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:199:5: '[' (pos= INTEGER |pos= UINT ) ']'
					{
					char_literal53=(Token)match(input,57,FOLLOW_57_in_arrayAccess1359); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_57.add(char_literal53);

					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:199:9: (pos= INTEGER |pos= UINT )
					int alt32=2;
					int LA32_0 = input.LA(1);
					if ( (LA32_0==INTEGER) ) {
						alt32=1;
					}
					else if ( (LA32_0==UINT) ) {
						alt32=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 32, 0, input);
						throw nvae;
					}

					switch (alt32) {
						case 1 :
							// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:199:10: pos= INTEGER
							{
							pos=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_arrayAccess1364); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_INTEGER.add(pos);

							}
							break;
						case 2 :
							// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:199:24: pos= UINT
							{
							pos=(Token)match(input,UINT,FOLLOW_UINT_in_arrayAccess1370); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_UINT.add(pos);

							}
							break;

					}

					char_literal54=(Token)match(input,58,FOLLOW_58_in_arrayAccess1373); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_58.add(char_literal54);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (EvaluationExpression)adaptor.nil();
					// 200:3: -> ^( EXPRESSION[\"ArrayAccess\"] )
					{
						// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:200:6: ^( EXPRESSION[\"ArrayAccess\"] )
						{
						EvaluationExpression root_1 = (EvaluationExpression)adaptor.nil();
						root_1 = (EvaluationExpression)adaptor.becomeRoot((EvaluationExpression)adaptor.create(EXPRESSION, "ArrayAccess"), root_1);
						adaptor.addChild(root_1,  Integer.valueOf((pos!=null?pos.getText():null)) );
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:201:5: '[' (start= INTEGER |start= UINT ) ':' (end= INTEGER |end= UINT ) ']'
					{
					char_literal55=(Token)match(input,57,FOLLOW_57_in_arrayAccess1391); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_57.add(char_literal55);

					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:201:9: (start= INTEGER |start= UINT )
					int alt33=2;
					int LA33_0 = input.LA(1);
					if ( (LA33_0==INTEGER) ) {
						alt33=1;
					}
					else if ( (LA33_0==UINT) ) {
						alt33=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 33, 0, input);
						throw nvae;
					}

					switch (alt33) {
						case 1 :
							// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:201:10: start= INTEGER
							{
							start=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_arrayAccess1396); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_INTEGER.add(start);

							}
							break;
						case 2 :
							// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:201:26: start= UINT
							{
							start=(Token)match(input,UINT,FOLLOW_UINT_in_arrayAccess1402); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_UINT.add(start);

							}
							break;

					}

					char_literal56=(Token)match(input,47,FOLLOW_47_in_arrayAccess1405); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_47.add(char_literal56);

					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:201:42: (end= INTEGER |end= UINT )
					int alt34=2;
					int LA34_0 = input.LA(1);
					if ( (LA34_0==INTEGER) ) {
						alt34=1;
					}
					else if ( (LA34_0==UINT) ) {
						alt34=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 34, 0, input);
						throw nvae;
					}

					switch (alt34) {
						case 1 :
							// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:201:43: end= INTEGER
							{
							end=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_arrayAccess1410); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_INTEGER.add(end);

							}
							break;
						case 2 :
							// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:201:57: end= UINT
							{
							end=(Token)match(input,UINT,FOLLOW_UINT_in_arrayAccess1416); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_UINT.add(end);

							}
							break;

					}

					char_literal57=(Token)match(input,58,FOLLOW_58_in_arrayAccess1419); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_58.add(char_literal57);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (EvaluationExpression)adaptor.nil();
					// 202:3: -> ^( EXPRESSION[\"ArrayAccess\"] )
					{
						// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:202:6: ^( EXPRESSION[\"ArrayAccess\"] )
						{
						EvaluationExpression root_1 = (EvaluationExpression)adaptor.nil();
						root_1 = (EvaluationExpression)adaptor.becomeRoot((EvaluationExpression)adaptor.create(EXPRESSION, "ArrayAccess"), root_1);
						adaptor.addChild(root_1,  Integer.valueOf((start!=null?start.getText():null)) );
						adaptor.addChild(root_1,  Integer.valueOf((end!=null?end.getText():null)) );
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (EvaluationExpression)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "arrayAccess"


	public static class valueExpression_return extends ParserRuleReturnScope {
		EvaluationExpression tree;
		@Override
		public EvaluationExpression getTree() { return tree; }
	};


	// $ANTLR start "valueExpression"
	// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:204:1: valueExpression : ( ( ID '(' )=> functionCall | functionReference | ( FN )=>func= inlineFunction -> ^( EXPRESSION[\"ConstantExpression\"] ) | parenthesesExpression | literal | VAR ->| ( ( ID ':' )=>packageName= ID ':' )? constant= ID {...}? => ->| arrayCreation | objectCreation );
	public final MeteorParser.valueExpression_return valueExpression() throws RecognitionException {
		MeteorParser.valueExpression_return retval = new MeteorParser.valueExpression_return();
		retval.start = input.LT(1);

		EvaluationExpression root_0 = null;

		Token packageName=null;
		Token constant=null;
		Token VAR62=null;
		Token char_literal63=null;
		ParserRuleReturnScope func =null;
		ParserRuleReturnScope functionCall58 =null;
		ParserRuleReturnScope functionReference59 =null;
		ParserRuleReturnScope parenthesesExpression60 =null;
		ParserRuleReturnScope literal61 =null;
		ParserRuleReturnScope arrayCreation64 =null;
		ParserRuleReturnScope objectCreation65 =null;

		EvaluationExpression packageName_tree=null;
		EvaluationExpression constant_tree=null;
		EvaluationExpression VAR62_tree=null;
		EvaluationExpression char_literal63_tree=null;
		RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_inlineFunction=new RewriteRuleSubtreeStream(adaptor,"rule inlineFunction");

		try {
			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:205:2: ( ( ID '(' )=> functionCall | functionReference | ( FN )=>func= inlineFunction -> ^( EXPRESSION[\"ConstantExpression\"] ) | parenthesesExpression | literal | VAR ->| ( ( ID ':' )=>packageName= ID ':' )? constant= ID {...}? => ->| arrayCreation | objectCreation )
			int alt37=9;
			int LA37_0 = input.LA(1);
			if ( (LA37_0==ID) ) {
				int LA37_1 = input.LA(2);
				if ( (LA37_1==47) ) {
					int LA37_9 = input.LA(3);
					if ( (synpred15_Meteor()) ) {
						alt37=1;
					}
					else if ( (true) ) {
						alt37=7;
					}

				}
				else if ( (LA37_1==39) && (synpred15_Meteor())) {
					alt37=1;
				}
				else if ( (LA37_1==EOF||LA37_1==AND||(LA37_1 >= ID && LA37_1 <= IN)||LA37_1==NOT||LA37_1==OR||(LA37_1 >= SLASH && LA37_1 <= STAR)||(LA37_1 >= 36 && LA37_1 <= 37)||(LA37_1 >= 40 && LA37_1 <= 41)||(LA37_1 >= 43 && LA37_1 <= 44)||LA37_1==46||(LA37_1 >= 48 && LA37_1 <= 50)||(LA37_1 >= 52 && LA37_1 <= 58)||(LA37_1 >= 66 && LA37_1 <= 67)) ) {
					alt37=7;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 37, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA37_0==38) ) {
				alt37=2;
			}
			else if ( (LA37_0==FN) && (synpred16_Meteor())) {
				alt37=3;
			}
			else if ( (LA37_0==39) ) {
				alt37=4;
			}
			else if ( (LA37_0==DECIMAL||LA37_0==INTEGER||(LA37_0 >= STRING && LA37_0 <= UINT)||(LA37_0 >= 59 && LA37_0 <= 60)||LA37_0==62) ) {
				alt37=5;
			}
			else if ( (LA37_0==VAR) ) {
				alt37=6;
			}
			else if ( (LA37_0==57) ) {
				alt37=8;
			}
			else if ( (LA37_0==65) ) {
				alt37=9;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 37, 0, input);
				throw nvae;
			}

			switch (alt37) {
				case 1 :
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:205:4: ( ID '(' )=> functionCall
					{
					root_0 = (EvaluationExpression)adaptor.nil();


					pushFollow(FOLLOW_functionCall_in_valueExpression1451);
					functionCall58=functionCall();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, functionCall58.getTree());

					}
					break;
				case 2 :
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:206:4: functionReference
					{
					root_0 = (EvaluationExpression)adaptor.nil();


					pushFollow(FOLLOW_functionReference_in_valueExpression1456);
					functionReference59=functionReference();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, functionReference59.getTree());

					}
					break;
				case 3 :
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:207:5: ( FN )=>func= inlineFunction
					{
					pushFollow(FOLLOW_inlineFunction_in_valueExpression1469);
					func=inlineFunction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_inlineFunction.add(func.getTree());
					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (EvaluationExpression)adaptor.nil();
					// 207:32: -> ^( EXPRESSION[\"ConstantExpression\"] )
					{
						// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:207:35: ^( EXPRESSION[\"ConstantExpression\"] )
						{
						EvaluationExpression root_1 = (EvaluationExpression)adaptor.nil();
						root_1 = (EvaluationExpression)adaptor.becomeRoot((EvaluationExpression)adaptor.create(EXPRESSION, "ConstantExpression"), root_1);
						adaptor.addChild(root_1,  new FunctionNode((func!=null?((MeteorParser.inlineFunction_return)func).func:null)) );
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:208:4: parenthesesExpression
					{
					root_0 = (EvaluationExpression)adaptor.nil();


					pushFollow(FOLLOW_parenthesesExpression_in_valueExpression1483);
					parenthesesExpression60=parenthesesExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, parenthesesExpression60.getTree());

					}
					break;
				case 5 :
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:209:4: literal
					{
					root_0 = (EvaluationExpression)adaptor.nil();


					pushFollow(FOLLOW_literal_in_valueExpression1489);
					literal61=literal();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, literal61.getTree());

					}
					break;
				case 6 :
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:210:4: VAR
					{
					VAR62=(Token)match(input,VAR,FOLLOW_VAR_in_valueExpression1495); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_VAR.add(VAR62);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (EvaluationExpression)adaptor.nil();
					// 210:8: ->
					{
						adaptor.addChild(root_0,  getInputSelection(VAR62) );
					}


					retval.tree = root_0;
					}

					}
					break;
				case 7 :
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:211:5: ( ( ID ':' )=>packageName= ID ':' )? constant= ID {...}? =>
					{
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:211:5: ( ( ID ':' )=>packageName= ID ':' )?
					int alt36=2;
					int LA36_0 = input.LA(1);
					if ( (LA36_0==ID) ) {
						int LA36_1 = input.LA(2);
						if ( (LA36_1==47) ) {
							int LA36_2 = input.LA(3);
							if ( (synpred17_Meteor()) ) {
								alt36=1;
							}
						}
					}
					switch (alt36) {
						case 1 :
							// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:211:6: ( ID ':' )=>packageName= ID ':'
							{
							packageName=(Token)match(input,ID,FOLLOW_ID_in_valueExpression1515); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_ID.add(packageName);

							char_literal63=(Token)match(input,47,FOLLOW_47_in_valueExpression1517); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_47.add(char_literal63);

							}
							break;

					}

					constant=(Token)match(input,ID,FOLLOW_ID_in_valueExpression1523); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ID.add(constant);

					if ( !(( getScope((packageName!=null?packageName.getText():null)).getConstantRegistry().get((constant!=null?constant.getText():null)) != null )) ) {
						if (state.backtracking>0) {state.failed=true; return retval;}
						throw new FailedPredicateException(input, "valueExpression", " getScope($packageName.text).getConstantRegistry().get($constant.text) != null ");
					}
					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (EvaluationExpression)adaptor.nil();
					// 212:5: ->
					{
						adaptor.addChild(root_0,  getScope((packageName!=null?packageName.getText():null)).getConstantRegistry().get((constant!=null?constant.getText():null)) );
					}


					retval.tree = root_0;
					}

					}
					break;
				case 8 :
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:213:4: arrayCreation
					{
					root_0 = (EvaluationExpression)adaptor.nil();


					pushFollow(FOLLOW_arrayCreation_in_valueExpression1543);
					arrayCreation64=arrayCreation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayCreation64.getTree());

					}
					break;
				case 9 :
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:214:4: objectCreation
					{
					root_0 = (EvaluationExpression)adaptor.nil();


					pushFollow(FOLLOW_objectCreation_in_valueExpression1549);
					objectCreation65=objectCreation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, objectCreation65.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (EvaluationExpression)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "valueExpression"


	public static class operatorExpression_return extends ParserRuleReturnScope {
		EvaluationExpression tree;
		@Override
		public EvaluationExpression getTree() { return tree; }
	};


	// $ANTLR start "operatorExpression"
	// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:216:1: operatorExpression : op= operator -> ^( EXPRESSION[\"NestedOperatorExpression\"] ) ;
	public final MeteorParser.operatorExpression_return operatorExpression() throws RecognitionException {
		MeteorParser.operatorExpression_return retval = new MeteorParser.operatorExpression_return();
		retval.start = input.LT(1);

		EvaluationExpression root_0 = null;

		ParserRuleReturnScope op =null;

		RewriteRuleSubtreeStream stream_operator=new RewriteRuleSubtreeStream(adaptor,"rule operator");

		try {
			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:217:2: (op= operator -> ^( EXPRESSION[\"NestedOperatorExpression\"] ) )
			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:217:4: op= operator
			{
			pushFollow(FOLLOW_operator_in_operatorExpression1561);
			op=operator();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_operator.add(op.getTree());
			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (EvaluationExpression)adaptor.nil();
			// 217:16: -> ^( EXPRESSION[\"NestedOperatorExpression\"] )
			{
				// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:217:19: ^( EXPRESSION[\"NestedOperatorExpression\"] )
				{
				EvaluationExpression root_1 = (EvaluationExpression)adaptor.nil();
				root_1 = (EvaluationExpression)adaptor.becomeRoot((EvaluationExpression)adaptor.create(EXPRESSION, "NestedOperatorExpression"), root_1);
				adaptor.addChild(root_1,  (op!=null?((MeteorParser.operator_return)op).op:null) );
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (EvaluationExpression)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "operatorExpression"


	public static class parenthesesExpression_return extends ParserRuleReturnScope {
		EvaluationExpression tree;
		@Override
		public EvaluationExpression getTree() { return tree; }
	};


	// $ANTLR start "parenthesesExpression"
	// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:219:1: parenthesesExpression : ( '(' expression ')' ) -> expression ;
	public final MeteorParser.parenthesesExpression_return parenthesesExpression() throws RecognitionException {
		MeteorParser.parenthesesExpression_return retval = new MeteorParser.parenthesesExpression_return();
		retval.start = input.LT(1);

		EvaluationExpression root_0 = null;

		Token char_literal66=null;
		Token char_literal68=null;
		ParserRuleReturnScope expression67 =null;

		EvaluationExpression char_literal66_tree=null;
		EvaluationExpression char_literal68_tree=null;
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:220:2: ( ( '(' expression ')' ) -> expression )
			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:220:4: ( '(' expression ')' )
			{
			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:220:4: ( '(' expression ')' )
			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:220:5: '(' expression ')'
			{
			char_literal66=(Token)match(input,39,FOLLOW_39_in_parenthesesExpression1580); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_39.add(char_literal66);

			pushFollow(FOLLOW_expression_in_parenthesesExpression1582);
			expression67=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(expression67.getTree());
			char_literal68=(Token)match(input,40,FOLLOW_40_in_parenthesesExpression1584); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_40.add(char_literal68);

			}

			// AST REWRITE
			// elements: expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (EvaluationExpression)adaptor.nil();
			// 220:25: -> expression
			{
				adaptor.addChild(root_0, stream_expression.nextTree());
			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (EvaluationExpression)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "parenthesesExpression"


	public static class methodCall_return extends ParserRuleReturnScope {
		EvaluationExpression tree;
		@Override
		public EvaluationExpression getTree() { return tree; }
	};


	// $ANTLR start "methodCall"
	// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:222:1: methodCall[EvaluationExpression targetExpr] : (packageName= ID ':' )? name= ID '(' ( (param= expression ) ( ',' (param= expression ) )* )? ')' ->;
	public final MeteorParser.methodCall_return methodCall(EvaluationExpression targetExpr) throws RecognitionException {
		MeteorParser.methodCall_return retval = new MeteorParser.methodCall_return();
		retval.start = input.LT(1);

		EvaluationExpression root_0 = null;

		Token packageName=null;
		Token name=null;
		Token char_literal69=null;
		Token char_literal70=null;
		Token char_literal71=null;
		Token char_literal72=null;
		ParserRuleReturnScope param =null;

		EvaluationExpression packageName_tree=null;
		EvaluationExpression name_tree=null;
		EvaluationExpression char_literal69_tree=null;
		EvaluationExpression char_literal70_tree=null;
		EvaluationExpression char_literal71_tree=null;
		EvaluationExpression char_literal72_tree=null;
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		 List<EvaluationExpression> params = new ArrayList();
		        paraphrase.push("a method call"); 
		try {
			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:226:3: ( (packageName= ID ':' )? name= ID '(' ( (param= expression ) ( ',' (param= expression ) )* )? ')' ->)
			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:226:5: (packageName= ID ':' )? name= ID '(' ( (param= expression ) ( ',' (param= expression ) )* )? ')'
			{
			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:226:5: (packageName= ID ':' )?
			int alt38=2;
			int LA38_0 = input.LA(1);
			if ( (LA38_0==ID) ) {
				int LA38_1 = input.LA(2);
				if ( (LA38_1==47) ) {
					alt38=1;
				}
			}
			switch (alt38) {
				case 1 :
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:226:6: packageName= ID ':'
					{
					packageName=(Token)match(input,ID,FOLLOW_ID_in_methodCall1614); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ID.add(packageName);

					char_literal69=(Token)match(input,47,FOLLOW_47_in_methodCall1616); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_47.add(char_literal69);

					}
					break;

			}

			name=(Token)match(input,ID,FOLLOW_ID_in_methodCall1622); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ID.add(name);

			char_literal70=(Token)match(input,39,FOLLOW_39_in_methodCall1624); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_39.add(char_literal70);

			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:227:3: ( (param= expression ) ( ',' (param= expression ) )* )?
			int alt40=2;
			int LA40_0 = input.LA(1);
			if ( (LA40_0==DECIMAL||LA40_0==FN||LA40_0==ID||LA40_0==INTEGER||(LA40_0 >= STRING && LA40_0 <= UINT)||LA40_0==VAR||LA40_0==35||(LA40_0 >= 38 && LA40_0 <= 39)||LA40_0==42||LA40_0==45||LA40_0==57||(LA40_0 >= 59 && LA40_0 <= 62)||(LA40_0 >= 64 && LA40_0 <= 65)||LA40_0==68) ) {
				alt40=1;
			}
			switch (alt40) {
				case 1 :
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:227:4: (param= expression ) ( ',' (param= expression ) )*
					{
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:227:4: (param= expression )
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:227:5: param= expression
					{
					pushFollow(FOLLOW_expression_in_methodCall1633);
					param=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(param.getTree());
					if ( state.backtracking==0 ) { params.add((param!=null?((EvaluationExpression)param.getTree()):null)); }
					}

					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:228:3: ( ',' (param= expression ) )*
					loop39:
					while (true) {
						int alt39=2;
						int LA39_0 = input.LA(1);
						if ( (LA39_0==43) ) {
							alt39=1;
						}

						switch (alt39) {
						case 1 :
							// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:228:4: ',' (param= expression )
							{
							char_literal71=(Token)match(input,43,FOLLOW_43_in_methodCall1642); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_43.add(char_literal71);

							// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:228:8: (param= expression )
							// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:228:9: param= expression
							{
							pushFollow(FOLLOW_expression_in_methodCall1647);
							param=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_expression.add(param.getTree());
							if ( state.backtracking==0 ) { params.add((param!=null?((EvaluationExpression)param.getTree()):null)); }
							}

							}
							break;

						default :
							break loop39;
						}
					}

					}
					break;

			}

			char_literal72=(Token)match(input,40,FOLLOW_40_in_methodCall1659); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_40.add(char_literal72);

			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (EvaluationExpression)adaptor.nil();
			// 229:7: ->
			{
				adaptor.addChild(root_0,  createCheckedMethodCall((packageName!=null?packageName.getText():null), name, targetExpr, params.toArray(new EvaluationExpression[params.size()])) );
			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (EvaluationExpression)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { paraphrase.pop(); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "methodCall"


	public static class functionCall_return extends ParserRuleReturnScope {
		EvaluationExpression tree;
		@Override
		public EvaluationExpression getTree() { return tree; }
	};


	// $ANTLR start "functionCall"
	// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:231:1: functionCall : methodCall[null] ;
	public final MeteorParser.functionCall_return functionCall() throws RecognitionException {
		MeteorParser.functionCall_return retval = new MeteorParser.functionCall_return();
		retval.start = input.LT(1);

		EvaluationExpression root_0 = null;

		ParserRuleReturnScope methodCall73 =null;


		try {
			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:232:2: ( methodCall[null] )
			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:232:4: methodCall[null]
			{
			root_0 = (EvaluationExpression)adaptor.nil();


			pushFollow(FOLLOW_methodCall_in_functionCall1674);
			methodCall73=methodCall(null);
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, methodCall73.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (EvaluationExpression)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "functionCall"


	public static class functionReference_return extends ParserRuleReturnScope {
		EvaluationExpression tree;
		@Override
		public EvaluationExpression getTree() { return tree; }
	};


	// $ANTLR start "functionReference"
	// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:234:1: functionReference : '&' ( ( ID ':' )=>packageName= ID ':' )? name= ID -> ^( EXPRESSION[\"ConstantExpression\"] ) ;
	public final MeteorParser.functionReference_return functionReference() throws RecognitionException {
		MeteorParser.functionReference_return retval = new MeteorParser.functionReference_return();
		retval.start = input.LT(1);

		EvaluationExpression root_0 = null;

		Token packageName=null;
		Token name=null;
		Token char_literal74=null;
		Token char_literal75=null;

		EvaluationExpression packageName_tree=null;
		EvaluationExpression name_tree=null;
		EvaluationExpression char_literal74_tree=null;
		EvaluationExpression char_literal75_tree=null;
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");

		try {
			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:235:3: ( '&' ( ( ID ':' )=>packageName= ID ':' )? name= ID -> ^( EXPRESSION[\"ConstantExpression\"] ) )
			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:235:5: '&' ( ( ID ':' )=>packageName= ID ':' )? name= ID
			{
			char_literal74=(Token)match(input,38,FOLLOW_38_in_functionReference1685); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_38.add(char_literal74);

			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:235:9: ( ( ID ':' )=>packageName= ID ':' )?
			int alt41=2;
			int LA41_0 = input.LA(1);
			if ( (LA41_0==ID) ) {
				int LA41_1 = input.LA(2);
				if ( (LA41_1==47) ) {
					int LA41_2 = input.LA(3);
					if ( (LA41_2==ID) ) {
						int LA41_4 = input.LA(4);
						if ( (synpred18_Meteor()) ) {
							alt41=1;
						}
					}
				}
			}
			switch (alt41) {
				case 1 :
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:235:10: ( ID ':' )=>packageName= ID ':'
					{
					packageName=(Token)match(input,ID,FOLLOW_ID_in_functionReference1697); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ID.add(packageName);

					char_literal75=(Token)match(input,47,FOLLOW_47_in_functionReference1699); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_47.add(char_literal75);

					}
					break;

			}

			name=(Token)match(input,ID,FOLLOW_ID_in_functionReference1705); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ID.add(name);

			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (EvaluationExpression)adaptor.nil();
			// 236:9: -> ^( EXPRESSION[\"ConstantExpression\"] )
			{
				// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:236:12: ^( EXPRESSION[\"ConstantExpression\"] )
				{
				EvaluationExpression root_1 = (EvaluationExpression)adaptor.nil();
				root_1 = (EvaluationExpression)adaptor.becomeRoot((EvaluationExpression)adaptor.create(EXPRESSION, "ConstantExpression"), root_1);
				adaptor.addChild(root_1,  new FunctionNode(getSopremoFunction((packageName!=null?packageName.getText():null), name)) );
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (EvaluationExpression)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "functionReference"


	public static class fieldAssignment_return extends ParserRuleReturnScope {
		EvaluationExpression tree;
		@Override
		public EvaluationExpression getTree() { return tree; }
	};


	// $ANTLR start "fieldAssignment"
	// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:238:1: fieldAssignment : ( ( ( ID ':' )=> ID ':' expression ->) | VAR ( '.' STAR ->|p= contextAwarePathExpression[getVariableSafely($VAR).toInputSelection($operator::result)] ( ':' e2= expression ->| ->) ) );
	public final MeteorParser.fieldAssignment_return fieldAssignment() throws RecognitionException {
		MeteorParser.fieldAssignment_return retval = new MeteorParser.fieldAssignment_return();
		retval.start = input.LT(1);

		EvaluationExpression root_0 = null;

		Token ID76=null;
		Token char_literal77=null;
		Token VAR79=null;
		Token char_literal80=null;
		Token STAR81=null;
		Token char_literal82=null;
		ParserRuleReturnScope p =null;
		ParserRuleReturnScope e2 =null;
		ParserRuleReturnScope expression78 =null;

		EvaluationExpression ID76_tree=null;
		EvaluationExpression char_literal77_tree=null;
		EvaluationExpression VAR79_tree=null;
		EvaluationExpression char_literal80_tree=null;
		EvaluationExpression STAR81_tree=null;
		EvaluationExpression char_literal82_tree=null;
		RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
		RewriteRuleTokenStream stream_STAR=new RewriteRuleTokenStream(adaptor,"token STAR");
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_contextAwarePathExpression=new RewriteRuleSubtreeStream(adaptor,"rule contextAwarePathExpression");

		try {
			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:239:2: ( ( ( ID ':' )=> ID ':' expression ->) | VAR ( '.' STAR ->|p= contextAwarePathExpression[getVariableSafely($VAR).toInputSelection($operator::result)] ( ':' e2= expression ->| ->) ) )
			int alt44=2;
			int LA44_0 = input.LA(1);
			if ( (LA44_0==ID) && (synpred19_Meteor())) {
				alt44=1;
			}
			else if ( (LA44_0==VAR) ) {
				alt44=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 44, 0, input);
				throw nvae;
			}

			switch (alt44) {
				case 1 :
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:239:4: ( ( ID ':' )=> ID ':' expression ->)
					{
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:239:4: ( ( ID ':' )=> ID ':' expression ->)
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:239:5: ( ID ':' )=> ID ':' expression
					{
					ID76=(Token)match(input,ID,FOLLOW_ID_in_fieldAssignment1741); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ID.add(ID76);

					char_literal77=(Token)match(input,47,FOLLOW_47_in_fieldAssignment1743); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_47.add(char_literal77);

					pushFollow(FOLLOW_expression_in_fieldAssignment1745);
					expression78=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression78.getTree());
					if ( state.backtracking==0 ) { objectCreation_stack.peek().mappings.add(new ObjectCreation.FieldAssignment((ID76!=null?ID76.getText():null), (expression78!=null?((EvaluationExpression)expression78.getTree()):null))); }
					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (EvaluationExpression)adaptor.nil();
					// 240:104: ->
					{
						root_0 = null;
					}


					retval.tree = root_0;
					}

					}

					}
					break;
				case 2 :
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:241:5: VAR ( '.' STAR ->|p= contextAwarePathExpression[getVariableSafely($VAR).toInputSelection($operator::result)] ( ':' e2= expression ->| ->) )
					{
					VAR79=(Token)match(input,VAR,FOLLOW_VAR_in_fieldAssignment1762); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_VAR.add(VAR79);

					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:242:5: ( '.' STAR ->|p= contextAwarePathExpression[getVariableSafely($VAR).toInputSelection($operator::result)] ( ':' e2= expression ->| ->) )
					int alt43=2;
					int LA43_0 = input.LA(1);
					if ( (LA43_0==46) ) {
						int LA43_1 = input.LA(2);
						if ( (LA43_1==STAR) ) {
							alt43=1;
						}
						else if ( (LA43_1==ID) ) {
							alt43=2;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 43, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}
					else if ( ((LA43_0 >= 56 && LA43_0 <= 57)) ) {
						alt43=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 43, 0, input);
						throw nvae;
					}

					switch (alt43) {
						case 1 :
							// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:242:7: '.' STAR
							{
							char_literal80=(Token)match(input,46,FOLLOW_46_in_fieldAssignment1771); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_46.add(char_literal80);

							STAR81=(Token)match(input,STAR,FOLLOW_STAR_in_fieldAssignment1773); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_STAR.add(STAR81);

							if ( state.backtracking==0 ) { objectCreation_stack.peek().mappings.add(new ObjectCreation.CopyFields(getInputSelection(VAR79))); }
							// AST REWRITE
							// elements: 
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							if ( state.backtracking==0 ) {
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (EvaluationExpression)adaptor.nil();
							// 242:107: ->
							{
								root_0 = null;
							}


							retval.tree = root_0;
							}

							}
							break;
						case 2 :
							// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:244:9: p= contextAwarePathExpression[getVariableSafely($VAR).toInputSelection($operator::result)] ( ':' e2= expression ->| ->)
							{
							pushFollow(FOLLOW_contextAwarePathExpression_in_fieldAssignment1790);
							p=contextAwarePathExpression(getVariableSafely(VAR79).toInputSelection(operator_stack.peek().result));
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_contextAwarePathExpression.add(p.getTree());
							// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:245:7: ( ':' e2= expression ->| ->)
							int alt42=2;
							int LA42_0 = input.LA(1);
							if ( (LA42_0==47) ) {
								alt42=1;
							}
							else if ( (LA42_0==43||LA42_0==67) ) {
								alt42=2;
							}

							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								NoViableAltException nvae =
									new NoViableAltException("", 42, 0, input);
								throw nvae;
							}

							switch (alt42) {
								case 1 :
									// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:245:9: ':' e2= expression
									{
									char_literal82=(Token)match(input,47,FOLLOW_47_in_fieldAssignment1801); if (state.failed) return retval; 
									if ( state.backtracking==0 ) stream_47.add(char_literal82);

									pushFollow(FOLLOW_expression_in_fieldAssignment1805);
									e2=expression();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) stream_expression.add(e2.getTree());
									if ( state.backtracking==0 ) { objectCreation_stack.peek().mappings.add(new ObjectCreation.TagMapping((p!=null?((EvaluationExpression)p.getTree()):null), (e2!=null?((EvaluationExpression)e2.getTree()):null))); }
									// AST REWRITE
									// elements: 
									// token labels: 
									// rule labels: retval
									// token list labels: 
									// rule list labels: 
									// wildcard labels: 
									if ( state.backtracking==0 ) {
									retval.tree = root_0;
									RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

									root_0 = (EvaluationExpression)adaptor.nil();
									// 245:112: ->
									{
										root_0 = null;
									}


									retval.tree = root_0;
									}

									}
									break;
								case 2 :
									// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:246:23: 
									{
									if ( state.backtracking==0 ) { objectCreation_stack.peek().mappings.add(new ObjectCreation.FieldAssignment(getAssignmentName((p!=null?((EvaluationExpression)p.getTree()):null)), (p!=null?((EvaluationExpression)p.getTree()):null))); }
									// AST REWRITE
									// elements: 
									// token labels: 
									// rule labels: retval
									// token list labels: 
									// rule list labels: 
									// wildcard labels: 
									if ( state.backtracking==0 ) {
									retval.tree = root_0;
									RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

									root_0 = (EvaluationExpression)adaptor.nil();
									// 246:131: ->
									{
										root_0 = null;
									}


									retval.tree = root_0;
									}

									}
									break;

							}

							}
							break;

					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (EvaluationExpression)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (NoViableAltException re) {
			 explainUsage("inside of a json object {...} only <field: expression>, <$var.path>, <$var = operator> or <$var: expression> are allowed", re); 
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "fieldAssignment"


	protected static class objectCreation_scope {
		List<ObjectCreation.Mapping> mappings;
	}
	protected Stack<objectCreation_scope> objectCreation_stack = new Stack<objectCreation_scope>();

	public static class objectCreation_return extends ParserRuleReturnScope {
		EvaluationExpression tree;
		@Override
		public EvaluationExpression getTree() { return tree; }
	};


	// $ANTLR start "objectCreation"
	// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:251:1: objectCreation : '{' ( fieldAssignment ( ',' fieldAssignment )* ( ',' )? )? '}' -> ^( EXPRESSION[\"ObjectCreation\"] ) ;
	public final MeteorParser.objectCreation_return objectCreation() throws RecognitionException {
		objectCreation_stack.push(new objectCreation_scope());
		MeteorParser.objectCreation_return retval = new MeteorParser.objectCreation_return();
		retval.start = input.LT(1);

		EvaluationExpression root_0 = null;

		Token char_literal83=null;
		Token char_literal85=null;
		Token char_literal87=null;
		Token char_literal88=null;
		ParserRuleReturnScope fieldAssignment84 =null;
		ParserRuleReturnScope fieldAssignment86 =null;

		EvaluationExpression char_literal83_tree=null;
		EvaluationExpression char_literal85_tree=null;
		EvaluationExpression char_literal87_tree=null;
		EvaluationExpression char_literal88_tree=null;
		RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
		RewriteRuleSubtreeStream stream_fieldAssignment=new RewriteRuleSubtreeStream(adaptor,"rule fieldAssignment");

		 objectCreation_stack.peek().mappings = new ArrayList<ObjectCreation.Mapping>(); 
		        paraphrase.push("a json object"); 
		try {
			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:256:2: ( '{' ( fieldAssignment ( ',' fieldAssignment )* ( ',' )? )? '}' -> ^( EXPRESSION[\"ObjectCreation\"] ) )
			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:256:4: '{' ( fieldAssignment ( ',' fieldAssignment )* ( ',' )? )? '}'
			{
			char_literal83=(Token)match(input,65,FOLLOW_65_in_objectCreation1870); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_65.add(char_literal83);

			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:256:8: ( fieldAssignment ( ',' fieldAssignment )* ( ',' )? )?
			int alt47=2;
			int LA47_0 = input.LA(1);
			if ( (LA47_0==ID||LA47_0==VAR) ) {
				alt47=1;
			}
			switch (alt47) {
				case 1 :
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:256:9: fieldAssignment ( ',' fieldAssignment )* ( ',' )?
					{
					pushFollow(FOLLOW_fieldAssignment_in_objectCreation1873);
					fieldAssignment84=fieldAssignment();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_fieldAssignment.add(fieldAssignment84.getTree());
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:256:25: ( ',' fieldAssignment )*
					loop45:
					while (true) {
						int alt45=2;
						int LA45_0 = input.LA(1);
						if ( (LA45_0==43) ) {
							int LA45_1 = input.LA(2);
							if ( (LA45_1==ID||LA45_1==VAR) ) {
								alt45=1;
							}

						}

						switch (alt45) {
						case 1 :
							// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:256:26: ',' fieldAssignment
							{
							char_literal85=(Token)match(input,43,FOLLOW_43_in_objectCreation1876); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_43.add(char_literal85);

							pushFollow(FOLLOW_fieldAssignment_in_objectCreation1878);
							fieldAssignment86=fieldAssignment();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_fieldAssignment.add(fieldAssignment86.getTree());
							}
							break;

						default :
							break loop45;
						}
					}

					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:256:48: ( ',' )?
					int alt46=2;
					int LA46_0 = input.LA(1);
					if ( (LA46_0==43) ) {
						alt46=1;
					}
					switch (alt46) {
						case 1 :
							// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:256:48: ','
							{
							char_literal87=(Token)match(input,43,FOLLOW_43_in_objectCreation1882); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_43.add(char_literal87);

							}
							break;

					}

					}
					break;

			}

			char_literal88=(Token)match(input,67,FOLLOW_67_in_objectCreation1887); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_67.add(char_literal88);

			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (EvaluationExpression)adaptor.nil();
			// 256:59: -> ^( EXPRESSION[\"ObjectCreation\"] )
			{
				// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:256:62: ^( EXPRESSION[\"ObjectCreation\"] )
				{
				EvaluationExpression root_1 = (EvaluationExpression)adaptor.nil();
				root_1 = (EvaluationExpression)adaptor.becomeRoot((EvaluationExpression)adaptor.create(EXPRESSION, "ObjectCreation"), root_1);
				adaptor.addChild(root_1,  objectCreation_stack.peek().mappings );
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (EvaluationExpression)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { paraphrase.pop(); }
		}
		catch (MissingTokenException re) {
			 explainUsage("expected <,> or <}> after a complete field assignment inside of a json object", re); 
		}

		finally {
			// do for sure before leaving
			objectCreation_stack.pop();
		}
		return retval;
	}
	// $ANTLR end "objectCreation"


	public static class literal_return extends ParserRuleReturnScope {
		EvaluationExpression tree;
		@Override
		public EvaluationExpression getTree() { return tree; }
	};


	// $ANTLR start "literal"
	// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:259:1: literal : (val= 'true' -> ^( EXPRESSION[\"ConstantExpression\"] ) |val= 'false' -> ^( EXPRESSION[\"ConstantExpression\"] ) |val= DECIMAL -> ^( EXPRESSION[\"ConstantExpression\"] ) |val= STRING -> ^( EXPRESSION[\"ConstantExpression\"] ) | (val= UINT |val= INTEGER ) -> ^( EXPRESSION[\"ConstantExpression\"] ) | 'null' ->);
	public final MeteorParser.literal_return literal() throws RecognitionException {
		MeteorParser.literal_return retval = new MeteorParser.literal_return();
		retval.start = input.LT(1);

		EvaluationExpression root_0 = null;

		Token val=null;
		Token string_literal89=null;

		EvaluationExpression val_tree=null;
		EvaluationExpression string_literal89_tree=null;
		RewriteRuleTokenStream stream_INTEGER=new RewriteRuleTokenStream(adaptor,"token INTEGER");
		RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
		RewriteRuleTokenStream stream_DECIMAL=new RewriteRuleTokenStream(adaptor,"token DECIMAL");
		RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
		RewriteRuleTokenStream stream_UINT=new RewriteRuleTokenStream(adaptor,"token UINT");
		RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
		RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

		 paraphrase.push("a literal"); 
		try {
			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:262:2: (val= 'true' -> ^( EXPRESSION[\"ConstantExpression\"] ) |val= 'false' -> ^( EXPRESSION[\"ConstantExpression\"] ) |val= DECIMAL -> ^( EXPRESSION[\"ConstantExpression\"] ) |val= STRING -> ^( EXPRESSION[\"ConstantExpression\"] ) | (val= UINT |val= INTEGER ) -> ^( EXPRESSION[\"ConstantExpression\"] ) | 'null' ->)
			int alt49=6;
			switch ( input.LA(1) ) {
			case 62:
				{
				alt49=1;
				}
				break;
			case 59:
				{
				alt49=2;
				}
				break;
			case DECIMAL:
				{
				alt49=3;
				}
				break;
			case STRING:
				{
				alt49=4;
				}
				break;
			case INTEGER:
			case UINT:
				{
				alt49=5;
				}
				break;
			case 60:
				{
				alt49=6;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 49, 0, input);
				throw nvae;
			}
			switch (alt49) {
				case 1 :
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:262:4: val= 'true'
					{
					val=(Token)match(input,62,FOLLOW_62_in_literal1925); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_62.add(val);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (EvaluationExpression)adaptor.nil();
					// 262:15: -> ^( EXPRESSION[\"ConstantExpression\"] )
					{
						// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:262:18: ^( EXPRESSION[\"ConstantExpression\"] )
						{
						EvaluationExpression root_1 = (EvaluationExpression)adaptor.nil();
						root_1 = (EvaluationExpression)adaptor.becomeRoot((EvaluationExpression)adaptor.create(EXPRESSION, "ConstantExpression"), root_1);
						adaptor.addChild(root_1,  Boolean.TRUE );
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:263:4: val= 'false'
					{
					val=(Token)match(input,59,FOLLOW_59_in_literal1941); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_59.add(val);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (EvaluationExpression)adaptor.nil();
					// 263:16: -> ^( EXPRESSION[\"ConstantExpression\"] )
					{
						// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:263:19: ^( EXPRESSION[\"ConstantExpression\"] )
						{
						EvaluationExpression root_1 = (EvaluationExpression)adaptor.nil();
						root_1 = (EvaluationExpression)adaptor.becomeRoot((EvaluationExpression)adaptor.create(EXPRESSION, "ConstantExpression"), root_1);
						adaptor.addChild(root_1,  Boolean.FALSE );
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:264:4: val= DECIMAL
					{
					val=(Token)match(input,DECIMAL,FOLLOW_DECIMAL_in_literal1957); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DECIMAL.add(val);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (EvaluationExpression)adaptor.nil();
					// 264:16: -> ^( EXPRESSION[\"ConstantExpression\"] )
					{
						// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:264:19: ^( EXPRESSION[\"ConstantExpression\"] )
						{
						EvaluationExpression root_1 = (EvaluationExpression)adaptor.nil();
						root_1 = (EvaluationExpression)adaptor.becomeRoot((EvaluationExpression)adaptor.create(EXPRESSION, "ConstantExpression"), root_1);
						adaptor.addChild(root_1,  new BigDecimal((val!=null?val.getText():null)) );
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:265:4: val= STRING
					{
					val=(Token)match(input,STRING,FOLLOW_STRING_in_literal1973); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_STRING.add(val);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (EvaluationExpression)adaptor.nil();
					// 265:15: -> ^( EXPRESSION[\"ConstantExpression\"] )
					{
						// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:265:18: ^( EXPRESSION[\"ConstantExpression\"] )
						{
						EvaluationExpression root_1 = (EvaluationExpression)adaptor.nil();
						root_1 = (EvaluationExpression)adaptor.becomeRoot((EvaluationExpression)adaptor.create(EXPRESSION, "ConstantExpression"), root_1);
						adaptor.addChild(root_1,  val.getText() );
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 5 :
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:266:5: (val= UINT |val= INTEGER )
					{
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:266:5: (val= UINT |val= INTEGER )
					int alt48=2;
					int LA48_0 = input.LA(1);
					if ( (LA48_0==UINT) ) {
						alt48=1;
					}
					else if ( (LA48_0==INTEGER) ) {
						alt48=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 48, 0, input);
						throw nvae;
					}

					switch (alt48) {
						case 1 :
							// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:266:6: val= UINT
							{
							val=(Token)match(input,UINT,FOLLOW_UINT_in_literal1991); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_UINT.add(val);

							}
							break;
						case 2 :
							// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:266:17: val= INTEGER
							{
							val=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_literal1997); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_INTEGER.add(val);

							}
							break;

					}

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (EvaluationExpression)adaptor.nil();
					// 266:30: -> ^( EXPRESSION[\"ConstantExpression\"] )
					{
						// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:266:33: ^( EXPRESSION[\"ConstantExpression\"] )
						{
						EvaluationExpression root_1 = (EvaluationExpression)adaptor.nil();
						root_1 = (EvaluationExpression)adaptor.becomeRoot((EvaluationExpression)adaptor.create(EXPRESSION, "ConstantExpression"), root_1);
						adaptor.addChild(root_1,  parseInt((val!=null?val.getText():null)) );
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 6 :
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:267:5: 'null'
					{
					string_literal89=(Token)match(input,60,FOLLOW_60_in_literal2013); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_60.add(string_literal89);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (EvaluationExpression)adaptor.nil();
					// 267:12: ->
					{
						adaptor.addChild(root_0,  ConstantExpression.NULL );
					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (EvaluationExpression)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { paraphrase.pop(); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "literal"


	public static class arrayCreation_return extends ParserRuleReturnScope {
		EvaluationExpression tree;
		@Override
		public EvaluationExpression getTree() { return tree; }
	};


	// $ANTLR start "arrayCreation"
	// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:269:1: arrayCreation : '[' (elems+= expression ( ',' elems+= expression )* ( ',' )? )? ']' -> ^( EXPRESSION[\"ArrayCreation\"] ) ;
	public final MeteorParser.arrayCreation_return arrayCreation() throws RecognitionException {
		MeteorParser.arrayCreation_return retval = new MeteorParser.arrayCreation_return();
		retval.start = input.LT(1);

		EvaluationExpression root_0 = null;

		Token char_literal90=null;
		Token char_literal91=null;
		Token char_literal92=null;
		Token char_literal93=null;
		List<Object> list_elems=null;
		RuleReturnScope elems = null;
		EvaluationExpression char_literal90_tree=null;
		EvaluationExpression char_literal91_tree=null;
		EvaluationExpression char_literal92_tree=null;
		EvaluationExpression char_literal93_tree=null;
		RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		 paraphrase.push("a json array"); 
		try {
			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:272:2: ( '[' (elems+= expression ( ',' elems+= expression )* ( ',' )? )? ']' -> ^( EXPRESSION[\"ArrayCreation\"] ) )
			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:272:5: '[' (elems+= expression ( ',' elems+= expression )* ( ',' )? )? ']'
			{
			char_literal90=(Token)match(input,57,FOLLOW_57_in_arrayCreation2037); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_57.add(char_literal90);

			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:272:9: (elems+= expression ( ',' elems+= expression )* ( ',' )? )?
			int alt52=2;
			int LA52_0 = input.LA(1);
			if ( (LA52_0==DECIMAL||LA52_0==FN||LA52_0==ID||LA52_0==INTEGER||(LA52_0 >= STRING && LA52_0 <= UINT)||LA52_0==VAR||LA52_0==35||(LA52_0 >= 38 && LA52_0 <= 39)||LA52_0==42||LA52_0==45||LA52_0==57||(LA52_0 >= 59 && LA52_0 <= 62)||(LA52_0 >= 64 && LA52_0 <= 65)||LA52_0==68) ) {
				alt52=1;
			}
			switch (alt52) {
				case 1 :
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:272:10: elems+= expression ( ',' elems+= expression )* ( ',' )?
					{
					pushFollow(FOLLOW_expression_in_arrayCreation2042);
					elems=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(elems.getTree());
					if (list_elems==null) list_elems=new ArrayList<Object>();
					list_elems.add(elems.getTree());
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:272:28: ( ',' elems+= expression )*
					loop50:
					while (true) {
						int alt50=2;
						int LA50_0 = input.LA(1);
						if ( (LA50_0==43) ) {
							int LA50_1 = input.LA(2);
							if ( (LA50_1==DECIMAL||LA50_1==FN||LA50_1==ID||LA50_1==INTEGER||(LA50_1 >= STRING && LA50_1 <= UINT)||LA50_1==VAR||LA50_1==35||(LA50_1 >= 38 && LA50_1 <= 39)||LA50_1==42||LA50_1==45||LA50_1==57||(LA50_1 >= 59 && LA50_1 <= 62)||(LA50_1 >= 64 && LA50_1 <= 65)||LA50_1==68) ) {
								alt50=1;
							}

						}

						switch (alt50) {
						case 1 :
							// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:272:29: ',' elems+= expression
							{
							char_literal91=(Token)match(input,43,FOLLOW_43_in_arrayCreation2045); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_43.add(char_literal91);

							pushFollow(FOLLOW_expression_in_arrayCreation2049);
							elems=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_expression.add(elems.getTree());
							if (list_elems==null) list_elems=new ArrayList<Object>();
							list_elems.add(elems.getTree());
							}
							break;

						default :
							break loop50;
						}
					}

					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:272:53: ( ',' )?
					int alt51=2;
					int LA51_0 = input.LA(1);
					if ( (LA51_0==43) ) {
						alt51=1;
					}
					switch (alt51) {
						case 1 :
							// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:272:53: ','
							{
							char_literal92=(Token)match(input,43,FOLLOW_43_in_arrayCreation2053); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_43.add(char_literal92);

							}
							break;

					}

					}
					break;

			}

			char_literal93=(Token)match(input,58,FOLLOW_58_in_arrayCreation2058); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_58.add(char_literal93);

			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (EvaluationExpression)adaptor.nil();
			// 272:64: -> ^( EXPRESSION[\"ArrayCreation\"] )
			{
				// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:272:67: ^( EXPRESSION[\"ArrayCreation\"] )
				{
				EvaluationExpression root_1 = (EvaluationExpression)adaptor.nil();
				root_1 = (EvaluationExpression)adaptor.becomeRoot((EvaluationExpression)adaptor.create(EXPRESSION, "ArrayCreation"), root_1);
				adaptor.addChild(root_1,  list_elems == null ? new EvaluationExpression[0] : list_elems.toArray(new EvaluationExpression[list_elems.size()]) );
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (EvaluationExpression)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { paraphrase.pop(); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "arrayCreation"


	protected static class operator_scope {
		int numInputs;
		Operator<?> result;
	}
	protected Stack<operator_scope> operator_stack = new Stack<operator_scope>();

	public static class operator_return extends ParserRuleReturnScope {
		public Operator<?> op=null;
		EvaluationExpression tree;
		@Override
		public EvaluationExpression getTree() { return tree; }
	};


	// $ANTLR start "operator"
	// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:278:1: operator returns [Operator<?> op=null] : ( readOperator | writeOperator | genericOperator );
	public final MeteorParser.operator_return operator() throws RecognitionException {
		operator_stack.push(new operator_scope());
		MeteorParser.operator_return retval = new MeteorParser.operator_return();
		retval.start = input.LT(1);

		EvaluationExpression root_0 = null;

		ParserRuleReturnScope readOperator94 =null;
		ParserRuleReturnScope writeOperator95 =null;
		ParserRuleReturnScope genericOperator96 =null;


		try {
			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:282:2: ( readOperator | writeOperator | genericOperator )
			int alt53=3;
			switch ( input.LA(1) ) {
			case VAR:
				{
				int LA53_1 = input.LA(2);
				if ( (LA53_1==51) ) {
					int LA53_5 = input.LA(3);
					if ( (LA53_5==61) ) {
						alt53=1;
					}
					else if ( (LA53_5==ID) ) {
						alt53=3;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 53, 5, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA53_1==43) ) {
					alt53=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 53, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 61:
				{
				alt53=1;
				}
				break;
			case 64:
				{
				alt53=2;
				}
				break;
			case ID:
				{
				alt53=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 53, 0, input);
				throw nvae;
			}
			switch (alt53) {
				case 1 :
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:282:4: readOperator
					{
					root_0 = (EvaluationExpression)adaptor.nil();


					pushFollow(FOLLOW_readOperator_in_operator2084);
					readOperator94=readOperator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, readOperator94.getTree());

					if ( state.backtracking==0 ) { retval.op = (readOperator94!=null?((MeteorParser.readOperator_return)readOperator94).source:null); }
					}
					break;
				case 2 :
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:283:5: writeOperator
					{
					root_0 = (EvaluationExpression)adaptor.nil();


					pushFollow(FOLLOW_writeOperator_in_operator2092);
					writeOperator95=writeOperator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, writeOperator95.getTree());

					if ( state.backtracking==0 ) { retval.op = (writeOperator95!=null?((MeteorParser.writeOperator_return)writeOperator95).sink:null); }
					}
					break;
				case 3 :
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:284:5: genericOperator
					{
					root_0 = (EvaluationExpression)adaptor.nil();


					pushFollow(FOLLOW_genericOperator_in_operator2100);
					genericOperator96=genericOperator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, genericOperator96.getTree());

					if ( state.backtracking==0 ) { retval.op = (genericOperator96!=null?((MeteorParser.genericOperator_return)genericOperator96).op:null); }
					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (EvaluationExpression)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
			operator_stack.pop();
		}
		return retval;
	}
	// $ANTLR end "operator"


	public static class adhocSource_return extends ParserRuleReturnScope {
		EvaluationExpression tree;
		@Override
		public EvaluationExpression getTree() { return tree; }
	};


	// $ANTLR start "adhocSource"
	// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:286:1: adhocSource : output= VAR '=' exp= arrayCreation ->;
	public final MeteorParser.adhocSource_return adhocSource() throws RecognitionException {
		MeteorParser.adhocSource_return retval = new MeteorParser.adhocSource_return();
		retval.start = input.LT(1);

		EvaluationExpression root_0 = null;

		Token output=null;
		Token char_literal97=null;
		ParserRuleReturnScope exp =null;

		EvaluationExpression output_tree=null;
		EvaluationExpression char_literal97_tree=null;
		RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
		RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
		RewriteRuleSubtreeStream stream_arrayCreation=new RewriteRuleSubtreeStream(adaptor,"rule arrayCreation");

		try {
			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:286:12: (output= VAR '=' exp= arrayCreation ->)
			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:287:3: output= VAR '=' exp= arrayCreation
			{
			output=(Token)match(input,VAR,FOLLOW_VAR_in_adhocSource2114); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_VAR.add(output);

			char_literal97=(Token)match(input,51,FOLLOW_51_in_adhocSource2116); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_51.add(char_literal97);

			pushFollow(FOLLOW_arrayCreation_in_adhocSource2120);
			exp=arrayCreation();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_arrayCreation.add(exp.getTree());
			if ( state.backtracking==0 ) { 
			  Source source = new Source((exp!=null?((EvaluationExpression)exp.getTree()):null));
			  putVariable(output, new JsonStreamExpression(source));
			}
			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (EvaluationExpression)adaptor.nil();
			// 291:3: ->
			{
				root_0 = null;
			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (EvaluationExpression)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "adhocSource"


	public static class readOperator_return extends ParserRuleReturnScope {
		public Source source;
		EvaluationExpression tree;
		@Override
		public EvaluationExpression getTree() { return tree; }
	};


	// $ANTLR start "readOperator"
	// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:294:1: readOperator returns [Source source] : (output= VAR '=' )? 'read' ( (packageName= ID ':' )? format= ID )? {...}? ID ( (protocol= ID )? filePath= STRING |protocol= ID '(' filePath= STRING ')' ) ( confOption[getOperatorInfo($source), $source] )* ->;
	public final MeteorParser.readOperator_return readOperator() throws RecognitionException {
		MeteorParser.readOperator_return retval = new MeteorParser.readOperator_return();
		retval.start = input.LT(1);

		EvaluationExpression root_0 = null;

		Token output=null;
		Token packageName=null;
		Token format=null;
		Token protocol=null;
		Token filePath=null;
		Token char_literal98=null;
		Token string_literal99=null;
		Token char_literal100=null;
		Token ID101=null;
		Token char_literal102=null;
		Token char_literal103=null;
		ParserRuleReturnScope confOption104 =null;

		EvaluationExpression output_tree=null;
		EvaluationExpression packageName_tree=null;
		EvaluationExpression format_tree=null;
		EvaluationExpression protocol_tree=null;
		EvaluationExpression filePath_tree=null;
		EvaluationExpression char_literal98_tree=null;
		EvaluationExpression string_literal99_tree=null;
		EvaluationExpression char_literal100_tree=null;
		EvaluationExpression ID101_tree=null;
		EvaluationExpression char_literal102_tree=null;
		EvaluationExpression char_literal103_tree=null;
		RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
		RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
		RewriteRuleSubtreeStream stream_confOption=new RewriteRuleSubtreeStream(adaptor,"rule confOption");

		 
		  ConfObjectInfo<? extends SopremoFormat> formatInfo = null;
		  SopremoFormat fileFormat = null;
		  String path = null;

		try {
			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:300:2: ( (output= VAR '=' )? 'read' ( (packageName= ID ':' )? format= ID )? {...}? ID ( (protocol= ID )? filePath= STRING |protocol= ID '(' filePath= STRING ')' ) ( confOption[getOperatorInfo($source), $source] )* ->)
			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:300:4: (output= VAR '=' )? 'read' ( (packageName= ID ':' )? format= ID )? {...}? ID ( (protocol= ID )? filePath= STRING |protocol= ID '(' filePath= STRING ')' ) ( confOption[getOperatorInfo($source), $source] )*
			{
			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:300:4: (output= VAR '=' )?
			int alt54=2;
			int LA54_0 = input.LA(1);
			if ( (LA54_0==VAR) ) {
				alt54=1;
			}
			switch (alt54) {
				case 1 :
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:300:5: output= VAR '='
					{
					output=(Token)match(input,VAR,FOLLOW_VAR_in_readOperator2148); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_VAR.add(output);

					char_literal98=(Token)match(input,51,FOLLOW_51_in_readOperator2150); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_51.add(char_literal98);

					}
					break;

			}

			string_literal99=(Token)match(input,61,FOLLOW_61_in_readOperator2158); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_61.add(string_literal99);

			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:301:11: ( (packageName= ID ':' )? format= ID )?
			int alt56=2;
			int LA56_0 = input.LA(1);
			if ( (LA56_0==ID) ) {
				int LA56_1 = input.LA(2);
				if ( (LA56_1==47) ) {
					alt56=1;
				}
				else if ( (LA56_1==ID) ) {
					int LA56_3 = input.LA(3);
					if ( (!(((input.LT(1).getText().equals("from"))))) ) {
						alt56=1;
					}
				}
			}
			switch (alt56) {
				case 1 :
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:301:12: (packageName= ID ':' )? format= ID
					{
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:301:12: (packageName= ID ':' )?
					int alt55=2;
					int LA55_0 = input.LA(1);
					if ( (LA55_0==ID) ) {
						int LA55_1 = input.LA(2);
						if ( (LA55_1==47) ) {
							alt55=1;
						}
					}
					switch (alt55) {
						case 1 :
							// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:301:13: packageName= ID ':'
							{
							packageName=(Token)match(input,ID,FOLLOW_ID_in_readOperator2164); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_ID.add(packageName);

							char_literal100=(Token)match(input,47,FOLLOW_47_in_readOperator2166); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_47.add(char_literal100);

							}
							break;

					}

					format=(Token)match(input,ID,FOLLOW_ID_in_readOperator2171); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ID.add(format);

					}
					break;

			}

			if ( !((input.LT(1).getText().equals("from"))) ) {
				if (state.backtracking>0) {state.failed=true; return retval;}
				throw new FailedPredicateException(input, "readOperator", "input.LT(1).getText().equals(\"from\")");
			}
			ID101=(Token)match(input,ID,FOLLOW_ID_in_readOperator2180); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ID.add(ID101);

			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:302:47: ( (protocol= ID )? filePath= STRING |protocol= ID '(' filePath= STRING ')' )
			int alt58=2;
			int LA58_0 = input.LA(1);
			if ( (LA58_0==ID) ) {
				int LA58_1 = input.LA(2);
				if ( (LA58_1==39) ) {
					alt58=2;
				}
				else if ( (LA58_1==STRING) ) {
					alt58=1;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 58, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA58_0==STRING) ) {
				alt58=1;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 58, 0, input);
				throw nvae;
			}

			switch (alt58) {
				case 1 :
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:302:48: (protocol= ID )? filePath= STRING
					{
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:302:56: (protocol= ID )?
					int alt57=2;
					int LA57_0 = input.LA(1);
					if ( (LA57_0==ID) ) {
						alt57=1;
					}
					switch (alt57) {
						case 1 :
							// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:302:56: protocol= ID
							{
							protocol=(Token)match(input,ID,FOLLOW_ID_in_readOperator2185); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_ID.add(protocol);

							}
							break;

					}

					filePath=(Token)match(input,STRING,FOLLOW_STRING_in_readOperator2190); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_STRING.add(filePath);

					}
					break;
				case 2 :
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:302:79: protocol= ID '(' filePath= STRING ')'
					{
					protocol=(Token)match(input,ID,FOLLOW_ID_in_readOperator2196); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ID.add(protocol);

					char_literal102=(Token)match(input,39,FOLLOW_39_in_readOperator2198); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_39.add(char_literal102);

					filePath=(Token)match(input,STRING,FOLLOW_STRING_in_readOperator2202); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_STRING.add(filePath);

					char_literal103=(Token)match(input,40,FOLLOW_40_in_readOperator2204); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_40.add(char_literal103);

					}
					break;

			}

			if ( state.backtracking==0 ) { 
			  path = makeFilePath(protocol, (filePath!=null?filePath.getText():null));
			  formatInfo = findFormat((packageName!=null?packageName.getText():null), format, path);
			  fileFormat = formatInfo.newInstance(); 
			  retval.source = new Source(fileFormat, path); 
			  if(output != null)
			    putVariable(output, new JsonStreamExpression(retval.source));
			}
			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:310:4: ( confOption[getOperatorInfo($source), $source] )*
			loop59:
			while (true) {
				int alt59=2;
				int LA59_0 = input.LA(1);
				if ( (LA59_0==ID) ) {
					alt59=1;
				}

				switch (alt59) {
				case 1 :
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:310:4: confOption[getOperatorInfo($source), $source]
					{
					pushFollow(FOLLOW_confOption_in_readOperator2211);
					confOption104=confOption(getOperatorInfo(retval.source), retval.source);
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_confOption.add(confOption104.getTree());
					}
					break;

				default :
					break loop59;
				}
			}

			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (EvaluationExpression)adaptor.nil();
			// 311:2: ->
			{
				root_0 = null;
			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (EvaluationExpression)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "readOperator"


	public static class writeOperator_return extends ParserRuleReturnScope {
		public Sink sink;
		EvaluationExpression tree;
		@Override
		public EvaluationExpression getTree() { return tree; }
	};


	// $ANTLR start "writeOperator"
	// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:314:1: writeOperator returns [Sink sink] : 'write' ( (packageName= ID ':' )? format= ID )? from= VAR {...}? ID ( (protocol= ID )? filePath= STRING |protocol= ID '(' filePath= STRING ')' ) ( confOption[getOperatorInfo($sink), $sink] )* ->;
	public final MeteorParser.writeOperator_return writeOperator() throws RecognitionException {
		MeteorParser.writeOperator_return retval = new MeteorParser.writeOperator_return();
		retval.start = input.LT(1);

		EvaluationExpression root_0 = null;

		Token packageName=null;
		Token format=null;
		Token from=null;
		Token protocol=null;
		Token filePath=null;
		Token string_literal105=null;
		Token char_literal106=null;
		Token ID107=null;
		Token char_literal108=null;
		Token char_literal109=null;
		ParserRuleReturnScope confOption110 =null;

		EvaluationExpression packageName_tree=null;
		EvaluationExpression format_tree=null;
		EvaluationExpression from_tree=null;
		EvaluationExpression protocol_tree=null;
		EvaluationExpression filePath_tree=null;
		EvaluationExpression string_literal105_tree=null;
		EvaluationExpression char_literal106_tree=null;
		EvaluationExpression ID107_tree=null;
		EvaluationExpression char_literal108_tree=null;
		EvaluationExpression char_literal109_tree=null;
		RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
		RewriteRuleSubtreeStream stream_confOption=new RewriteRuleSubtreeStream(adaptor,"rule confOption");

		 
		  ConfObjectInfo<? extends SopremoFormat> formatInfo = null;
		  SopremoFormat fileFormat = null;
		  String path = null;
		  if(state.backtracking == 0) 
		    addScope();

		try {
			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:324:3: ( 'write' ( (packageName= ID ':' )? format= ID )? from= VAR {...}? ID ( (protocol= ID )? filePath= STRING |protocol= ID '(' filePath= STRING ')' ) ( confOption[getOperatorInfo($sink), $sink] )* ->)
			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:324:5: 'write' ( (packageName= ID ':' )? format= ID )? from= VAR {...}? ID ( (protocol= ID )? filePath= STRING |protocol= ID '(' filePath= STRING ')' ) ( confOption[getOperatorInfo($sink), $sink] )*
			{
			string_literal105=(Token)match(input,64,FOLLOW_64_in_writeOperator2240); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_64.add(string_literal105);

			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:325:5: ( (packageName= ID ':' )? format= ID )?
			int alt61=2;
			int LA61_0 = input.LA(1);
			if ( (LA61_0==ID) ) {
				alt61=1;
			}
			switch (alt61) {
				case 1 :
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:325:6: (packageName= ID ':' )? format= ID
					{
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:325:6: (packageName= ID ':' )?
					int alt60=2;
					int LA60_0 = input.LA(1);
					if ( (LA60_0==ID) ) {
						int LA60_1 = input.LA(2);
						if ( (LA60_1==47) ) {
							alt60=1;
						}
					}
					switch (alt60) {
						case 1 :
							// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:325:7: packageName= ID ':'
							{
							packageName=(Token)match(input,ID,FOLLOW_ID_in_writeOperator2251); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_ID.add(packageName);

							char_literal106=(Token)match(input,47,FOLLOW_47_in_writeOperator2253); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_47.add(char_literal106);

							}
							break;

					}

					format=(Token)match(input,ID,FOLLOW_ID_in_writeOperator2258); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ID.add(format);

					}
					break;

			}

			from=(Token)match(input,VAR,FOLLOW_VAR_in_writeOperator2264); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_VAR.add(from);

			if ( !((input.LT(1).getText().equals("to"))) ) {
				if (state.backtracking>0) {state.failed=true; return retval;}
				throw new FailedPredicateException(input, "writeOperator", "input.LT(1).getText().equals(\"to\")");
			}
			ID107=(Token)match(input,ID,FOLLOW_ID_in_writeOperator2272); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ID.add(ID107);

			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:327:4: ( (protocol= ID )? filePath= STRING |protocol= ID '(' filePath= STRING ')' )
			int alt63=2;
			int LA63_0 = input.LA(1);
			if ( (LA63_0==ID) ) {
				int LA63_1 = input.LA(2);
				if ( (LA63_1==39) ) {
					alt63=2;
				}
				else if ( (LA63_1==STRING) ) {
					alt63=1;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 63, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA63_0==STRING) ) {
				alt63=1;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 63, 0, input);
				throw nvae;
			}

			switch (alt63) {
				case 1 :
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:327:5: (protocol= ID )? filePath= STRING
					{
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:327:13: (protocol= ID )?
					int alt62=2;
					int LA62_0 = input.LA(1);
					if ( (LA62_0==ID) ) {
						alt62=1;
					}
					switch (alt62) {
						case 1 :
							// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:327:13: protocol= ID
							{
							protocol=(Token)match(input,ID,FOLLOW_ID_in_writeOperator2281); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_ID.add(protocol);

							}
							break;

					}

					filePath=(Token)match(input,STRING,FOLLOW_STRING_in_writeOperator2286); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_STRING.add(filePath);

					}
					break;
				case 2 :
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:327:36: protocol= ID '(' filePath= STRING ')'
					{
					protocol=(Token)match(input,ID,FOLLOW_ID_in_writeOperator2292); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ID.add(protocol);

					char_literal108=(Token)match(input,39,FOLLOW_39_in_writeOperator2294); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_39.add(char_literal108);

					filePath=(Token)match(input,STRING,FOLLOW_STRING_in_writeOperator2298); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_STRING.add(filePath);

					char_literal109=(Token)match(input,40,FOLLOW_40_in_writeOperator2300); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_40.add(char_literal109);

					}
					break;

			}

			if ( state.backtracking==0 ) { 
			  path = makeFilePath(protocol, (filePath!=null?filePath.getText():null));
			  formatInfo = findFormat((packageName!=null?packageName.getText():null), format, path);
			  fileFormat = formatInfo.newInstance();
				retval.sink = new Sink(fileFormat, makeFilePath(protocol, path));
			  retval.sink.setInputs(getVariableSafely(from).getStream());
			  this.sinks.add(retval.sink);
			}
			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:335:3: ( confOption[getOperatorInfo($sink), $sink] )*
			loop64:
			while (true) {
				int alt64=2;
				int LA64_0 = input.LA(1);
				if ( (LA64_0==ID) ) {
					alt64=1;
				}

				switch (alt64) {
				case 1 :
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:335:3: confOption[getOperatorInfo($sink), $sink]
					{
					pushFollow(FOLLOW_confOption_in_writeOperator2305);
					confOption110=confOption(getOperatorInfo(retval.sink), retval.sink);
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_confOption.add(confOption110.getTree());
					}
					break;

				default :
					break loop64;
				}
			}

			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (EvaluationExpression)adaptor.nil();
			// 335:46: ->
			{
				root_0 = null;
			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (EvaluationExpression)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {
			  removeScope();
			}
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "writeOperator"


	public static class genericOperator_return extends ParserRuleReturnScope {
		public Operator<?> op;
		EvaluationExpression tree;
		@Override
		public EvaluationExpression getTree() { return tree; }
	};


	// $ANTLR start "genericOperator"
	// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:341:1: genericOperator returns [Operator<?> op] : (targets+= VAR ( ',' targets+= VAR )* '=' )? (packageName= ID ':' )? name= ID {...}? => ( ( VAR )=> input[operatorInfo, $op] ( ( ',' )=> ',' input[operatorInfo, $op] )* )? ( confOption[operatorInfo, $op] )* ->;
	public final MeteorParser.genericOperator_return genericOperator() throws RecognitionException {
		MeteorParser.genericOperator_return retval = new MeteorParser.genericOperator_return();
		retval.start = input.LT(1);

		EvaluationExpression root_0 = null;

		Token packageName=null;
		Token name=null;
		Token char_literal111=null;
		Token char_literal112=null;
		Token char_literal113=null;
		Token char_literal115=null;
		Token targets=null;
		List<Object> list_targets=null;
		ParserRuleReturnScope input114 =null;
		ParserRuleReturnScope input116 =null;
		ParserRuleReturnScope confOption117 =null;

		EvaluationExpression packageName_tree=null;
		EvaluationExpression name_tree=null;
		EvaluationExpression char_literal111_tree=null;
		EvaluationExpression char_literal112_tree=null;
		EvaluationExpression char_literal113_tree=null;
		EvaluationExpression char_literal115_tree=null;
		EvaluationExpression targets_tree=null;
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
		RewriteRuleSubtreeStream stream_input=new RewriteRuleSubtreeStream(adaptor,"rule input");
		RewriteRuleSubtreeStream stream_confOption=new RewriteRuleSubtreeStream(adaptor,"rule confOption");

		 
		  ConfObjectInfo<? extends Operator<?>> operatorInfo;

		try {
			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:347:3: ( (targets+= VAR ( ',' targets+= VAR )* '=' )? (packageName= ID ':' )? name= ID {...}? => ( ( VAR )=> input[operatorInfo, $op] ( ( ',' )=> ',' input[operatorInfo, $op] )* )? ( confOption[operatorInfo, $op] )* ->)
			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:348:2: (targets+= VAR ( ',' targets+= VAR )* '=' )? (packageName= ID ':' )? name= ID {...}? => ( ( VAR )=> input[operatorInfo, $op] ( ( ',' )=> ',' input[operatorInfo, $op] )* )? ( confOption[operatorInfo, $op] )*
			{
			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:348:2: (targets+= VAR ( ',' targets+= VAR )* '=' )?
			int alt66=2;
			int LA66_0 = input.LA(1);
			if ( (LA66_0==VAR) ) {
				alt66=1;
			}
			switch (alt66) {
				case 1 :
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:348:2: targets+= VAR ( ',' targets+= VAR )* '='
					{
					targets=(Token)match(input,VAR,FOLLOW_VAR_in_genericOperator2339); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_VAR.add(targets);

					if (list_targets==null) list_targets=new ArrayList<Object>();
					list_targets.add(targets);
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:348:15: ( ',' targets+= VAR )*
					loop65:
					while (true) {
						int alt65=2;
						int LA65_0 = input.LA(1);
						if ( (LA65_0==43) ) {
							alt65=1;
						}

						switch (alt65) {
						case 1 :
							// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:348:16: ',' targets+= VAR
							{
							char_literal111=(Token)match(input,43,FOLLOW_43_in_genericOperator2342); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_43.add(char_literal111);

							targets=(Token)match(input,VAR,FOLLOW_VAR_in_genericOperator2346); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_VAR.add(targets);

							if (list_targets==null) list_targets=new ArrayList<Object>();
							list_targets.add(targets);
							}
							break;

						default :
							break loop65;
						}
					}

					char_literal112=(Token)match(input,51,FOLLOW_51_in_genericOperator2350); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_51.add(char_literal112);

					}
					break;

			}

			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:349:2: (packageName= ID ':' )?
			int alt67=2;
			int LA67_0 = input.LA(1);
			if ( (LA67_0==ID) ) {
				int LA67_1 = input.LA(2);
				if ( (LA67_1==47) ) {
					alt67=1;
				}
			}
			switch (alt67) {
				case 1 :
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:349:2: packageName= ID ':'
					{
					packageName=(Token)match(input,ID,FOLLOW_ID_in_genericOperator2358); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ID.add(packageName);

					char_literal113=(Token)match(input,47,FOLLOW_47_in_genericOperator2360); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_47.add(char_literal113);

					}
					break;

			}

			name=(Token)match(input,ID,FOLLOW_ID_in_genericOperator2366); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ID.add(name);

			if ( !(( (operatorInfo = findOperatorGreedily((packageName!=null?packageName.getText():null), name)) != null  )) ) {
				if (state.backtracking>0) {state.failed=true; return retval;}
				throw new FailedPredicateException(input, "genericOperator", " (operatorInfo = findOperatorGreedily($packageName.text, $name)) != null  ");
			}
			if ( state.backtracking==0 ) { 
			  operator_stack.peek().result = retval.op = operatorInfo.newInstance(); 
			  // add scope for input variables and recursive definition
			  if(state.backtracking == 0) 
			    addScope();   
			}
			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:357:2: ( ( VAR )=> input[operatorInfo, $op] ( ( ',' )=> ',' input[operatorInfo, $op] )* )?
			int alt69=2;
			int LA69_0 = input.LA(1);
			if ( (LA69_0==VAR) && (synpred20_Meteor())) {
				alt69=1;
			}
			switch (alt69) {
				case 1 :
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:357:2: ( VAR )=> input[operatorInfo, $op] ( ( ',' )=> ',' input[operatorInfo, $op] )*
					{
					pushFollow(FOLLOW_input_in_genericOperator2382);
					input114=input(operatorInfo, retval.op);
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_input.add(input114.getTree());
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:357:35: ( ( ',' )=> ',' input[operatorInfo, $op] )*
					loop68:
					while (true) {
						int alt68=2;
						int LA68_0 = input.LA(1);
						if ( (LA68_0==43) ) {
							int LA68_2 = input.LA(2);
							if ( (LA68_2==VAR) ) {
								int LA68_3 = input.LA(3);
								if ( (synpred21_Meteor()) ) {
									alt68=1;
								}

							}

						}

						switch (alt68) {
						case 1 :
							// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:357:36: ( ',' )=> ',' input[operatorInfo, $op]
							{
							char_literal115=(Token)match(input,43,FOLLOW_43_in_genericOperator2391); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_43.add(char_literal115);

							pushFollow(FOLLOW_input_in_genericOperator2393);
							input116=input(operatorInfo, retval.op);
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_input.add(input116.getTree());
							}
							break;

						default :
							break loop68;
						}
					}

					}
					break;

			}

			if ( state.backtracking==0 ) { // register output names for explicit references to output 
			  if(list_targets != null)
			    for(int index = 0; index < list_targets.size(); index++)
			      putVariable((Token) list_targets.get(index), new JsonStreamExpression(retval.op.getOutput(index)), 1);   
			}
			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:363:11: ( confOption[operatorInfo, $op] )*
			loop70:
			while (true) {
				int alt70=2;
				int LA70_0 = input.LA(1);
				if ( (LA70_0==ID) ) {
					alt70=1;
				}

				switch (alt70) {
				case 1 :
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:363:11: confOption[operatorInfo, $op]
					{
					pushFollow(FOLLOW_confOption_in_genericOperator2403);
					confOption117=confOption(operatorInfo, retval.op);
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_confOption.add(confOption117.getTree());
					}
					break;

				default :
					break loop70;
				}
			}

			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (EvaluationExpression)adaptor.nil();
			// 364:3: ->
			{
				root_0 = null;
			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (EvaluationExpression)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {
			  removeScope();
			}
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "genericOperator"


	public static class confOption_return extends ParserRuleReturnScope {
		EvaluationExpression tree;
		@Override
		public EvaluationExpression getTree() { return tree; }
	};


	// $ANTLR start "confOption"
	// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:366:1: confOption[ConfObjectInfo<?> info, ConfigurableSopremoType object] : name= ID {...}? =>expr= ternaryExpression ->;
	public final MeteorParser.confOption_return confOption(ConfObjectInfo<?> info, ConfigurableSopremoType object) throws RecognitionException {
		MeteorParser.confOption_return retval = new MeteorParser.confOption_return();
		retval.start = input.LT(1);

		EvaluationExpression root_0 = null;

		Token name=null;
		ParserRuleReturnScope expr =null;

		EvaluationExpression name_tree=null;
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_ternaryExpression=new RewriteRuleSubtreeStream(adaptor,"rule ternaryExpression");


		 ConfObjectInfo.ConfObjectPropertyInfo property = null;

		try {
			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:369:3: (name= ID {...}? =>expr= ternaryExpression ->)
			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:370:3: name= ID {...}? =>expr= ternaryExpression
			{
			name=(Token)match(input,ID,FOLLOW_ID_in_confOption2430); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ID.add(name);

			if ( !(( (property = findPropertyGreedily(object, info, name)) != null )) ) {
				if (state.backtracking>0) {state.failed=true; return retval;}
				throw new FailedPredicateException(input, "confOption", " (property = findPropertyGreedily(object, info, name)) != null ");
			}
			pushFollow(FOLLOW_ternaryExpression_in_confOption2440);
			expr=ternaryExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_ternaryExpression.add(expr.getTree());
			if ( state.backtracking==0 ) { property.setValue(object, (expr!=null?((EvaluationExpression)expr.getTree()):null)); }
			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (EvaluationExpression)adaptor.nil();
			// 372:69: ->
			{
				root_0 = null;
			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (EvaluationExpression)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "confOption"


	public static class input_return extends ParserRuleReturnScope {
		EvaluationExpression tree;
		@Override
		public EvaluationExpression getTree() { return tree; }
	};


	// $ANTLR start "input"
	// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:374:1: input[ConfObjectInfo<?> info, Operator<?> object] : (name= VAR IN )? from= VAR ({...}? =>expr= ternaryExpression )? ->;
	public final MeteorParser.input_return input(ConfObjectInfo<?> info, Operator<?> object) throws RecognitionException {
		MeteorParser.input_return retval = new MeteorParser.input_return();
		retval.start = input.LT(1);

		EvaluationExpression root_0 = null;

		Token name=null;
		Token from=null;
		Token IN118=null;
		ParserRuleReturnScope expr =null;

		EvaluationExpression name_tree=null;
		EvaluationExpression from_tree=null;
		EvaluationExpression IN118_tree=null;
		RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
		RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
		RewriteRuleSubtreeStream stream_ternaryExpression=new RewriteRuleSubtreeStream(adaptor,"rule ternaryExpression");


		 ConfObjectInfo.ConfObjectIndexedPropertyInfo inputProperty = null;

		try {
			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:377:3: ( (name= VAR IN )? from= VAR ({...}? =>expr= ternaryExpression )? ->)
			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:377:5: (name= VAR IN )? from= VAR ({...}? =>expr= ternaryExpression )?
			{
			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:377:5: (name= VAR IN )?
			int alt71=2;
			int LA71_0 = input.LA(1);
			if ( (LA71_0==VAR) ) {
				int LA71_1 = input.LA(2);
				if ( (LA71_1==IN) ) {
					alt71=1;
				}
			}
			switch (alt71) {
				case 1 :
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:377:6: name= VAR IN
					{
					name=(Token)match(input,VAR,FOLLOW_VAR_in_input2462); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_VAR.add(name);

					IN118=(Token)match(input,IN,FOLLOW_IN_in_input2464); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_IN.add(IN118);

					}
					break;

			}

			from=(Token)match(input,VAR,FOLLOW_VAR_in_input2470); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_VAR.add(from);

			if ( state.backtracking==0 ) { 
			  int inputIndex = operator_stack.peek().numInputs++;
			  JsonStreamExpression input = getVariableSafely(from);
			  object.setInput(inputIndex, input.getStream());
			  
			  if(operator_stack.size() == 1) {
				  JsonStreamExpression inputExpression = new JsonStreamExpression(input.getStream(), inputIndex);
				  putVariable(name != null ? name : from, inputExpression);
			  }
			}
			// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:388:2: ({...}? =>expr= ternaryExpression )?
			int alt72=2;
			int LA72_0 = input.LA(1);
			if ( (LA72_0==DECIMAL||LA72_0==FN||LA72_0==INTEGER||(LA72_0 >= STRING && LA72_0 <= UINT)||LA72_0==VAR||LA72_0==35||(LA72_0 >= 38 && LA72_0 <= 39)||LA72_0==42||LA72_0==45||LA72_0==57||(LA72_0 >= 59 && LA72_0 <= 60)||LA72_0==62||LA72_0==65||LA72_0==68) && (( (findInputPropertyRelunctantly(object, info, input.LT(1), false) != null) ))) {
				alt72=1;
			}
			else if ( (LA72_0==ID) ) {
				int LA72_5 = input.LA(2);
				if ( (( (findInputPropertyRelunctantly(object, info, input.LT(1), false) != null) )) ) {
					alt72=1;
				}
			}
			switch (alt72) {
				case 1 :
					// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:388:2: {...}? =>expr= ternaryExpression
					{
					if ( !(( (findInputPropertyRelunctantly(object, info, input.LT(1), false) != null) )) ) {
						if (state.backtracking>0) {state.failed=true; return retval;}
						throw new FailedPredicateException(input, "input", " (findInputPropertyRelunctantly(object, info, input.LT(1), false) != null) ");
					}
					if ( state.backtracking==0 ) { inputProperty = findInputPropertyRelunctantly(object, info, input.LT(1), true); }
					pushFollow(FOLLOW_ternaryExpression_in_input2487);
					expr=ternaryExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_ternaryExpression.add(expr.getTree());
					if ( state.backtracking==0 ) { inputProperty.setValue(object, operator_stack.peek().numInputs-1, (expr!=null?((EvaluationExpression)expr.getTree()):null)); }
					}
					break;

			}

			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (EvaluationExpression)adaptor.nil();
			// 391:4: ->
			{
				root_0 = null;
			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (EvaluationExpression)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "input"

	// $ANTLR start synpred1_Meteor
	public final void synpred1_Meteor_fragment() throws RecognitionException {
		// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:102:5: ( ID ( ID | VAR ) )
		// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:102:6: ID ( ID | VAR )
		{
		match(input,ID,FOLLOW_ID_in_synpred1_Meteor367); if (state.failed) return;

		if ( input.LA(1)==ID||input.LA(1)==VAR ) {
			input.consume();
			state.errorRecovery=false;
			state.failed=false;
		}
		else {
			if (state.backtracking>0) {state.failed=true; return;}
			MismatchedSetException mse = new MismatchedSetException(null,input);
			throw mse;
		}
		}

	}
	// $ANTLR end synpred1_Meteor

	// $ANTLR start synpred2_Meteor
	public final void synpred2_Meteor_fragment() throws RecognitionException {
		// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:106:4: ( orExpression '?' )
		// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:106:5: orExpression '?'
		{
		pushFollow(FOLLOW_orExpression_in_synpred2_Meteor395);
		orExpression();
		state._fsp--;
		if (state.failed) return;

		match(input,55,FOLLOW_55_in_synpred2_Meteor397); if (state.failed) return;

		}

	}
	// $ANTLR end synpred2_Meteor

	// $ANTLR start synpred3_Meteor
	public final void synpred3_Meteor_fragment() throws RecognitionException {
		// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:108:4: ( orExpression IF )
		// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:108:5: orExpression IF
		{
		pushFollow(FOLLOW_orExpression_in_synpred3_Meteor437);
		orExpression();
		state._fsp--;
		if (state.failed) return;

		match(input,IF,FOLLOW_IF_in_synpred3_Meteor439); if (state.failed) return;

		}

	}
	// $ANTLR end synpred3_Meteor

	// $ANTLR start synpred4_Meteor
	public final void synpred4_Meteor_fragment() throws RecognitionException {
		// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:160:4: ( '(' ID ')' )
		// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:160:5: '(' ID ')'
		{
		match(input,39,FOLLOW_39_in_synpred4_Meteor908); if (state.failed) return;

		match(input,ID,FOLLOW_ID_in_synpred4_Meteor910); if (state.failed) return;

		match(input,40,FOLLOW_40_in_synpred4_Meteor912); if (state.failed) return;

		}

	}
	// $ANTLR end synpred4_Meteor

	// $ANTLR start synpred5_Meteor
	public final void synpred5_Meteor_fragment() throws RecognitionException {
		// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:167:5: ( pathExpression[EvaluationExpression.VALUE] )
		// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:167:6: pathExpression[EvaluationExpression.VALUE]
		{
		pushFollow(FOLLOW_pathExpression_in_synpred5_Meteor975);
		pathExpression(EvaluationExpression.VALUE);
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred5_Meteor

	// $ANTLR start synpred6_Meteor
	public final void synpred6_Meteor_fragment() throws RecognitionException {
		// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:175:5: ( '?.' ID '(' )
		// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:175:6: '?.' ID '('
		{
		match(input,56,FOLLOW_56_in_synpred6_Meteor1031); if (state.failed) return;

		match(input,ID,FOLLOW_ID_in_synpred6_Meteor1033); if (state.failed) return;

		match(input,39,FOLLOW_39_in_synpred6_Meteor1035); if (state.failed) return;

		}

	}
	// $ANTLR end synpred6_Meteor

	// $ANTLR start synpred7_Meteor
	public final void synpred7_Meteor_fragment() throws RecognitionException {
		// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:176:8: ( pathSegment )
		// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:176:9: pathSegment
		{
		pushFollow(FOLLOW_pathSegment_in_synpred7_Meteor1054);
		pathSegment();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred7_Meteor

	// $ANTLR start synpred8_Meteor
	public final void synpred8_Meteor_fragment() throws RecognitionException {
		// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:179:5: ( '.' ID '(' )
		// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:179:6: '.' ID '('
		{
		match(input,46,FOLLOW_46_in_synpred8_Meteor1102); if (state.failed) return;

		match(input,ID,FOLLOW_ID_in_synpred8_Meteor1104); if (state.failed) return;

		match(input,39,FOLLOW_39_in_synpred8_Meteor1106); if (state.failed) return;

		}

	}
	// $ANTLR end synpred8_Meteor

	// $ANTLR start synpred9_Meteor
	public final void synpred9_Meteor_fragment() throws RecognitionException {
		// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:180:8: ( pathSegment )
		// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:180:9: pathSegment
		{
		pushFollow(FOLLOW_pathSegment_in_synpred9_Meteor1125);
		pathSegment();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred9_Meteor

	// $ANTLR start synpred10_Meteor
	public final void synpred10_Meteor_fragment() throws RecognitionException {
		// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:183:6: ( pathSegment )
		// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:183:7: pathSegment
		{
		pushFollow(FOLLOW_pathSegment_in_synpred10_Meteor1167);
		pathSegment();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred10_Meteor

	// $ANTLR start synpred11_Meteor
	public final void synpred11_Meteor_fragment() throws RecognitionException {
		// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:190:5: ( '?.' )
		// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:190:6: '?.'
		{
		match(input,56,FOLLOW_56_in_synpred11_Meteor1221); if (state.failed) return;

		}

	}
	// $ANTLR end synpred11_Meteor

	// $ANTLR start synpred12_Meteor
	public final void synpred12_Meteor_fragment() throws RecognitionException {
		// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:191:5: ( '.' )
		// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:191:6: '.'
		{
		match(input,46,FOLLOW_46_in_synpred12_Meteor1252); if (state.failed) return;

		}

	}
	// $ANTLR end synpred12_Meteor

	// $ANTLR start synpred13_Meteor
	public final void synpred13_Meteor_fragment() throws RecognitionException {
		// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:192:5: ( '[' )
		// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:192:6: '['
		{
		match(input,57,FOLLOW_57_in_synpred13_Meteor1281); if (state.failed) return;

		}

	}
	// $ANTLR end synpred13_Meteor

	// $ANTLR start synpred14_Meteor
	public final void synpred14_Meteor_fragment() throws RecognitionException {
		// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:195:19: ( '.' methodCall[null] )
		// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:195:20: '.' methodCall[null]
		{
		match(input,46,FOLLOW_46_in_synpred14_Meteor1304); if (state.failed) return;

		pushFollow(FOLLOW_methodCall_in_synpred14_Meteor1306);
		methodCall(null);
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred14_Meteor

	// $ANTLR start synpred15_Meteor
	public final void synpred15_Meteor_fragment() throws RecognitionException {
		// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:205:4: ( ID '(' )
		// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:205:5: ID '('
		{
		match(input,ID,FOLLOW_ID_in_synpred15_Meteor1445); if (state.failed) return;

		match(input,39,FOLLOW_39_in_synpred15_Meteor1447); if (state.failed) return;

		}

	}
	// $ANTLR end synpred15_Meteor

	// $ANTLR start synpred16_Meteor
	public final void synpred16_Meteor_fragment() throws RecognitionException {
		// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:207:5: ( FN )
		// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:207:6: FN
		{
		match(input,FN,FOLLOW_FN_in_synpred16_Meteor1463); if (state.failed) return;

		}

	}
	// $ANTLR end synpred16_Meteor

	// $ANTLR start synpred17_Meteor
	public final void synpred17_Meteor_fragment() throws RecognitionException {
		// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:211:6: ( ID ':' )
		// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:211:7: ID ':'
		{
		match(input,ID,FOLLOW_ID_in_synpred17_Meteor1507); if (state.failed) return;

		match(input,47,FOLLOW_47_in_synpred17_Meteor1509); if (state.failed) return;

		}

	}
	// $ANTLR end synpred17_Meteor

	// $ANTLR start synpred18_Meteor
	public final void synpred18_Meteor_fragment() throws RecognitionException {
		// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:235:10: ( ID ':' )
		// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:235:11: ID ':'
		{
		match(input,ID,FOLLOW_ID_in_synpred18_Meteor1689); if (state.failed) return;

		match(input,47,FOLLOW_47_in_synpred18_Meteor1691); if (state.failed) return;

		}

	}
	// $ANTLR end synpred18_Meteor

	// $ANTLR start synpred19_Meteor
	public final void synpred19_Meteor_fragment() throws RecognitionException {
		// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:239:5: ( ID ':' )
		// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:239:6: ID ':'
		{
		match(input,ID,FOLLOW_ID_in_synpred19_Meteor1735); if (state.failed) return;

		match(input,47,FOLLOW_47_in_synpred19_Meteor1737); if (state.failed) return;

		}

	}
	// $ANTLR end synpred19_Meteor

	// $ANTLR start synpred20_Meteor
	public final void synpred20_Meteor_fragment() throws RecognitionException {
		// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:357:2: ( VAR )
		// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:357:3: VAR
		{
		match(input,VAR,FOLLOW_VAR_in_synpred20_Meteor2378); if (state.failed) return;

		}

	}
	// $ANTLR end synpred20_Meteor

	// $ANTLR start synpred21_Meteor
	public final void synpred21_Meteor_fragment() throws RecognitionException {
		// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:357:36: ( ',' )
		// /home/arv/workspace/stratosphere-sopremo/meteor/meteor-meteor/src/main/java/eu/stratosphere/meteor/Meteor.g:357:37: ','
		{
		match(input,43,FOLLOW_43_in_synpred21_Meteor2387); if (state.failed) return;

		}

	}
	// $ANTLR end synpred21_Meteor

	// Delegated rules

	public final boolean synpred14_Meteor() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred14_Meteor_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred19_Meteor() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred19_Meteor_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred17_Meteor() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred17_Meteor_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred2_Meteor() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred2_Meteor_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred13_Meteor() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred13_Meteor_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred8_Meteor() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred8_Meteor_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred6_Meteor() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred6_Meteor_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred18_Meteor() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred18_Meteor_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred15_Meteor() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred15_Meteor_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred1_Meteor() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred1_Meteor_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred3_Meteor() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred3_Meteor_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred5_Meteor() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred5_Meteor_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred10_Meteor() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred10_Meteor_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred12_Meteor() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred12_Meteor_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred11_Meteor() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred11_Meteor_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred20_Meteor() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred20_Meteor_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred21_Meteor() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred21_Meteor_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred4_Meteor() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred4_Meteor_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred7_Meteor() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred7_Meteor_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred9_Meteor() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred9_Meteor_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred16_Meteor() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred16_Meteor_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}



	public static final BitSet FOLLOW_statement_in_script121 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_script123 = new BitSet(new long[]{0xA000000200008002L,0x0000000000000001L});
	public static final BitSet FOLLOW_operator_in_statement137 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_packageImport_in_statement141 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionDefinition_in_statement145 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_javaudf_in_statement149 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_adhocSource_in_statement153 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_statement161 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_63_in_packageImport178 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_ID_in_packageImport182 = new BitSet(new long[]{0x0000080000000002L});
	public static final BitSet FOLLOW_43_in_packageImport193 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_ID_in_packageImport197 = new BitSet(new long[]{0x0000080000000002L});
	public static final BitSet FOLLOW_ID_in_functionDefinition215 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_51_in_functionDefinition217 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_inlineFunction_in_functionDefinition221 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FN_in_inlineFunction247 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_inlineFunction249 = new BitSet(new long[]{0x0000010000008000L});
	public static final BitSet FOLLOW_ID_in_inlineFunction258 = new BitSet(new long[]{0x0000090000000000L});
	public static final BitSet FOLLOW_43_in_inlineFunction265 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_ID_in_inlineFunction269 = new BitSet(new long[]{0x0000090000000000L});
	public static final BitSet FOLLOW_40_in_inlineFunction280 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_inlineFunction290 = new BitSet(new long[]{0x7A0024CA6004A080L,0x0000000000000013L});
	public static final BitSet FOLLOW_expression_in_inlineFunction294 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_67_in_inlineFunction296 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_javaudf316 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_51_in_javaudf318 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_JAVAUDF_in_javaudf320 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_javaudf322 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_STRING_in_javaudf326 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_javaudf328 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ternaryExpression_in_contextAwareExpression356 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_operatorExpression_in_expression379 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ternaryExpression_in_expression385 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_orExpression_in_ternaryExpression403 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_55_in_ternaryExpression405 = new BitSet(new long[]{0x5A00A4CA6004A080L,0x0000000000000012L});
	public static final BitSet FOLLOW_orExpression_in_ternaryExpression409 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_ternaryExpression412 = new BitSet(new long[]{0x5A0024CA6004A080L,0x0000000000000012L});
	public static final BitSet FOLLOW_orExpression_in_ternaryExpression416 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_orExpression_in_ternaryExpression445 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_IF_in_ternaryExpression447 = new BitSet(new long[]{0x5A0024CA6004A080L,0x0000000000000012L});
	public static final BitSet FOLLOW_orExpression_in_ternaryExpression451 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_orExpression_in_ternaryExpression474 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_andExpression_in_orExpression487 = new BitSet(new long[]{0x0000000001000002L,0x0000000000000004L});
	public static final BitSet FOLLOW_OR_in_orExpression491 = new BitSet(new long[]{0x5A0024CA6004A080L,0x0000000000000012L});
	public static final BitSet FOLLOW_66_in_orExpression495 = new BitSet(new long[]{0x5A0024CA6004A080L,0x0000000000000012L});
	public static final BitSet FOLLOW_andExpression_in_orExpression500 = new BitSet(new long[]{0x0000000001000002L,0x0000000000000004L});
	public static final BitSet FOLLOW_elementExpression_in_andExpression529 = new BitSet(new long[]{0x0000002000000012L});
	public static final BitSet FOLLOW_AND_in_andExpression533 = new BitSet(new long[]{0x5A0024CA6004A080L,0x0000000000000012L});
	public static final BitSet FOLLOW_37_in_andExpression537 = new BitSet(new long[]{0x5A0024CA6004A080L,0x0000000000000012L});
	public static final BitSet FOLLOW_elementExpression_in_andExpression542 = new BitSet(new long[]{0x0000002000000012L});
	public static final BitSet FOLLOW_comparisonExpression_in_elementExpression571 = new BitSet(new long[]{0x0000000000220002L});
	public static final BitSet FOLLOW_NOT_in_elementExpression576 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_IN_in_elementExpression579 = new BitSet(new long[]{0x5A0024CA6004A080L,0x0000000000000012L});
	public static final BitSet FOLLOW_comparisonExpression_in_elementExpression583 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arithmeticExpression_in_comparisonExpression624 = new BitSet(new long[]{0x0076001000000002L});
	public static final BitSet FOLLOW_50_in_comparisonExpression630 = new BitSet(new long[]{0x5A0024CA6004A080L,0x0000000000000012L});
	public static final BitSet FOLLOW_54_in_comparisonExpression636 = new BitSet(new long[]{0x5A0024CA6004A080L,0x0000000000000012L});
	public static final BitSet FOLLOW_49_in_comparisonExpression642 = new BitSet(new long[]{0x5A0024CA6004A080L,0x0000000000000012L});
	public static final BitSet FOLLOW_53_in_comparisonExpression648 = new BitSet(new long[]{0x5A0024CA6004A080L,0x0000000000000012L});
	public static final BitSet FOLLOW_52_in_comparisonExpression654 = new BitSet(new long[]{0x5A0024CA6004A080L,0x0000000000000012L});
	public static final BitSet FOLLOW_36_in_comparisonExpression660 = new BitSet(new long[]{0x5A0024CA6004A080L,0x0000000000000012L});
	public static final BitSet FOLLOW_arithmeticExpression_in_comparisonExpression665 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multiplicationExpression_in_arithmeticExpression745 = new BitSet(new long[]{0x0000120000000002L});
	public static final BitSet FOLLOW_41_in_arithmeticExpression751 = new BitSet(new long[]{0x5A0024CA6004A080L,0x0000000000000012L});
	public static final BitSet FOLLOW_44_in_arithmeticExpression757 = new BitSet(new long[]{0x5A0024CA6004A080L,0x0000000000000012L});
	public static final BitSet FOLLOW_multiplicationExpression_in_arithmeticExpression762 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_preincrementExpression_in_multiplicationExpression805 = new BitSet(new long[]{0x0000000018000002L});
	public static final BitSet FOLLOW_STAR_in_multiplicationExpression811 = new BitSet(new long[]{0x5A0024CA6004A080L,0x0000000000000012L});
	public static final BitSet FOLLOW_SLASH_in_multiplicationExpression817 = new BitSet(new long[]{0x5A0024CA6004A080L,0x0000000000000012L});
	public static final BitSet FOLLOW_preincrementExpression_in_multiplicationExpression822 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_preincrementExpression863 = new BitSet(new long[]{0x5A0024CA6004A080L,0x0000000000000012L});
	public static final BitSet FOLLOW_preincrementExpression_in_preincrementExpression865 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_45_in_preincrementExpression870 = new BitSet(new long[]{0x5A0024CA6004A080L,0x0000000000000012L});
	public static final BitSet FOLLOW_preincrementExpression_in_preincrementExpression872 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unaryExpression_in_preincrementExpression877 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_castExpression_in_unaryExpression896 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_39_in_castExpression916 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_ID_in_castExpression920 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_castExpression922 = new BitSet(new long[]{0x5A0000C26004A080L,0x0000000000000002L});
	public static final BitSet FOLLOW_generalPathExpression_in_castExpression926 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_generalPathExpression_in_castExpression939 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_ID_in_castExpression944 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_ID_in_castExpression948 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_valueExpression_in_generalPathExpression967 = new BitSet(new long[]{0x0300400000000002L});
	public static final BitSet FOLLOW_pathExpression_in_generalPathExpression982 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_pathExpression_in_contextAwarePathExpression1011 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_56_in_pathExpression1039 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_methodCall_in_pathExpression1043 = new BitSet(new long[]{0x0300400000000002L});
	public static final BitSet FOLLOW_pathExpression_in_pathExpression1060 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_46_in_pathExpression1110 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_methodCall_in_pathExpression1114 = new BitSet(new long[]{0x0300400000000002L});
	public static final BitSet FOLLOW_pathExpression_in_pathExpression1131 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_pathSegment_in_pathExpression1157 = new BitSet(new long[]{0x0300400000000002L});
	public static final BitSet FOLLOW_pathExpression_in_pathExpression1173 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_56_in_pathSegment1225 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_ID_in_pathSegment1229 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_46_in_pathSegment1257 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_ID_in_pathSegment1261 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayAccess_in_pathSegment1286 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_57_in_arrayAccess1296 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_STAR_in_arrayAccess1298 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_58_in_arrayAccess1300 = new BitSet(new long[]{0x0300400000000000L});
	public static final BitSet FOLLOW_46_in_arrayAccess1311 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_methodCall_in_arrayAccess1315 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_pathSegment_in_arrayAccess1338 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_57_in_arrayAccess1359 = new BitSet(new long[]{0x0000000040040000L});
	public static final BitSet FOLLOW_INTEGER_in_arrayAccess1364 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_UINT_in_arrayAccess1370 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_58_in_arrayAccess1373 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_57_in_arrayAccess1391 = new BitSet(new long[]{0x0000000040040000L});
	public static final BitSet FOLLOW_INTEGER_in_arrayAccess1396 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_UINT_in_arrayAccess1402 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_arrayAccess1405 = new BitSet(new long[]{0x0000000040040000L});
	public static final BitSet FOLLOW_INTEGER_in_arrayAccess1410 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_UINT_in_arrayAccess1416 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_58_in_arrayAccess1419 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_valueExpression1451 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionReference_in_valueExpression1456 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inlineFunction_in_valueExpression1469 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_parenthesesExpression_in_valueExpression1483 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_literal_in_valueExpression1489 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_valueExpression1495 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_valueExpression1515 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_valueExpression1517 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_ID_in_valueExpression1523 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayCreation_in_valueExpression1543 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_objectCreation_in_valueExpression1549 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_operator_in_operatorExpression1561 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_39_in_parenthesesExpression1580 = new BitSet(new long[]{0x7A0024CA6004A080L,0x0000000000000013L});
	public static final BitSet FOLLOW_expression_in_parenthesesExpression1582 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_parenthesesExpression1584 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_methodCall1614 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_methodCall1616 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_ID_in_methodCall1622 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_methodCall1624 = new BitSet(new long[]{0x7A0025CA6004A080L,0x0000000000000013L});
	public static final BitSet FOLLOW_expression_in_methodCall1633 = new BitSet(new long[]{0x0000090000000000L});
	public static final BitSet FOLLOW_43_in_methodCall1642 = new BitSet(new long[]{0x7A0024CA6004A080L,0x0000000000000013L});
	public static final BitSet FOLLOW_expression_in_methodCall1647 = new BitSet(new long[]{0x0000090000000000L});
	public static final BitSet FOLLOW_40_in_methodCall1659 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodCall_in_functionCall1674 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_functionReference1685 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_ID_in_functionReference1697 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_functionReference1699 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_ID_in_functionReference1705 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_fieldAssignment1741 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_fieldAssignment1743 = new BitSet(new long[]{0x7A0024CA6004A080L,0x0000000000000013L});
	public static final BitSet FOLLOW_expression_in_fieldAssignment1745 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_fieldAssignment1762 = new BitSet(new long[]{0x0300400000000000L});
	public static final BitSet FOLLOW_46_in_fieldAssignment1771 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_STAR_in_fieldAssignment1773 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_contextAwarePathExpression_in_fieldAssignment1790 = new BitSet(new long[]{0x0000800000000002L});
	public static final BitSet FOLLOW_47_in_fieldAssignment1801 = new BitSet(new long[]{0x7A0024CA6004A080L,0x0000000000000013L});
	public static final BitSet FOLLOW_expression_in_fieldAssignment1805 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_objectCreation1870 = new BitSet(new long[]{0x0000000200008000L,0x0000000000000008L});
	public static final BitSet FOLLOW_fieldAssignment_in_objectCreation1873 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_43_in_objectCreation1876 = new BitSet(new long[]{0x0000000200008000L});
	public static final BitSet FOLLOW_fieldAssignment_in_objectCreation1878 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_43_in_objectCreation1882 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_67_in_objectCreation1887 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_62_in_literal1925 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_59_in_literal1941 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DECIMAL_in_literal1957 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_literal1973 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UINT_in_literal1991 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_literal1997 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_60_in_literal2013 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_57_in_arrayCreation2037 = new BitSet(new long[]{0x7E0024CA6004A080L,0x0000000000000013L});
	public static final BitSet FOLLOW_expression_in_arrayCreation2042 = new BitSet(new long[]{0x0400080000000000L});
	public static final BitSet FOLLOW_43_in_arrayCreation2045 = new BitSet(new long[]{0x7A0024CA6004A080L,0x0000000000000013L});
	public static final BitSet FOLLOW_expression_in_arrayCreation2049 = new BitSet(new long[]{0x0400080000000000L});
	public static final BitSet FOLLOW_43_in_arrayCreation2053 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_58_in_arrayCreation2058 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_readOperator_in_operator2084 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_writeOperator_in_operator2092 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_genericOperator_in_operator2100 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_adhocSource2114 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_51_in_adhocSource2116 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_arrayCreation_in_adhocSource2120 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_readOperator2148 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_51_in_readOperator2150 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_61_in_readOperator2158 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_ID_in_readOperator2164 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_readOperator2166 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_ID_in_readOperator2171 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_ID_in_readOperator2180 = new BitSet(new long[]{0x0000000020008000L});
	public static final BitSet FOLLOW_ID_in_readOperator2185 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_STRING_in_readOperator2190 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_ID_in_readOperator2196 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_readOperator2198 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_STRING_in_readOperator2202 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_readOperator2204 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_confOption_in_readOperator2211 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_64_in_writeOperator2240 = new BitSet(new long[]{0x0000000200008000L});
	public static final BitSet FOLLOW_ID_in_writeOperator2251 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_writeOperator2253 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_ID_in_writeOperator2258 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_VAR_in_writeOperator2264 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_ID_in_writeOperator2272 = new BitSet(new long[]{0x0000000020008000L});
	public static final BitSet FOLLOW_ID_in_writeOperator2281 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_STRING_in_writeOperator2286 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_ID_in_writeOperator2292 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_writeOperator2294 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_STRING_in_writeOperator2298 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_writeOperator2300 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_confOption_in_writeOperator2305 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_VAR_in_genericOperator2339 = new BitSet(new long[]{0x0008080000000000L});
	public static final BitSet FOLLOW_43_in_genericOperator2342 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_VAR_in_genericOperator2346 = new BitSet(new long[]{0x0008080000000000L});
	public static final BitSet FOLLOW_51_in_genericOperator2350 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_ID_in_genericOperator2358 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_genericOperator2360 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_ID_in_genericOperator2366 = new BitSet(new long[]{0x0000000200008002L});
	public static final BitSet FOLLOW_input_in_genericOperator2382 = new BitSet(new long[]{0x0000080000008002L});
	public static final BitSet FOLLOW_43_in_genericOperator2391 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_input_in_genericOperator2393 = new BitSet(new long[]{0x0000080000008002L});
	public static final BitSet FOLLOW_confOption_in_genericOperator2403 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_ID_in_confOption2430 = new BitSet(new long[]{0x5A0024CA6004A080L,0x0000000000000012L});
	public static final BitSet FOLLOW_ternaryExpression_in_confOption2440 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_input2462 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_IN_in_input2464 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_VAR_in_input2470 = new BitSet(new long[]{0x5A0024CA6004A082L,0x0000000000000012L});
	public static final BitSet FOLLOW_ternaryExpression_in_input2487 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_synpred1_Meteor367 = new BitSet(new long[]{0x0000000200008000L});
	public static final BitSet FOLLOW_set_in_synpred1_Meteor369 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_orExpression_in_synpred2_Meteor395 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_55_in_synpred2_Meteor397 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_orExpression_in_synpred3_Meteor437 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_IF_in_synpred3_Meteor439 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_39_in_synpred4_Meteor908 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_ID_in_synpred4_Meteor910 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_synpred4_Meteor912 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_pathExpression_in_synpred5_Meteor975 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_56_in_synpred6_Meteor1031 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_ID_in_synpred6_Meteor1033 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_synpred6_Meteor1035 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_pathSegment_in_synpred7_Meteor1054 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_46_in_synpred8_Meteor1102 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_ID_in_synpred8_Meteor1104 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_synpred8_Meteor1106 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_pathSegment_in_synpred9_Meteor1125 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_pathSegment_in_synpred10_Meteor1167 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_56_in_synpred11_Meteor1221 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_46_in_synpred12_Meteor1252 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_57_in_synpred13_Meteor1281 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_46_in_synpred14_Meteor1304 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_methodCall_in_synpred14_Meteor1306 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_synpred15_Meteor1445 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_synpred15_Meteor1447 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FN_in_synpred16_Meteor1463 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_synpred17_Meteor1507 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_synpred17_Meteor1509 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_synpred18_Meteor1689 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_synpred18_Meteor1691 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_synpred19_Meteor1735 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_synpred19_Meteor1737 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_synpred20_Meteor2378 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_synpred21_Meteor2387 = new BitSet(new long[]{0x0000000000000002L});
}
