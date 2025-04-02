import uk.ac.rhul.cs.csle.art.interpret.AbstractInterpreter;
import uk.ac.rhul.cs.csle.art.interpret.AbstractActions;
import uk.ac.rhul.cs.csle.art.interpret.AbstractAttributeBlock;
import uk.ac.rhul.cs.csle.art.util.Util;
 import java.util.Map; import java.util.HashMap; 
public class ARTGeneratedActions extends AbstractActions {
 Map<String, Integer> variables = new HashMap<>(); 
   Map<String, AbstractAttributeBlock> procedures = new HashMap<>(); 
   int successCount = 0; 
   int failCount = 0;
   int switchVal;
   boolean CheckContinues= false;
   
  public String name() { return "2025-04-02 20:48:58"; }

  public class ART_C_ID extends AbstractAttributeBlock {
    ART_C_ID ID = this; String v;

    public void initRHSAttributeBlock(int nodeNumber, int term) {
      switch(nodeNumber){
      }
    }

    public AbstractAttributeBlock getAttributes(int nodeNumber) {
      switch(nodeNumber){
      default: Util.fatal("getAttributes: unknown node " + nodeNumber + ". Probable out-of-date ARTGeneratedActions - regenerate and recompile"); return null;
      }
    }

    public void action(int nodeNumber) {
      switch(nodeNumber){
      case 262: ID.v = lexeme();  break;
      }
    }
  }

  public class ART_C_INTEGER extends AbstractAttributeBlock {
    ART_C_INTEGER INTEGER = this; int v;

    public void initRHSAttributeBlock(int nodeNumber, int term) {
      switch(nodeNumber){
      }
    }

    public AbstractAttributeBlock getAttributes(int nodeNumber) {
      switch(nodeNumber){
      default: Util.fatal("getAttributes: unknown node " + nodeNumber + ". Probable out-of-date ARTGeneratedActions - regenerate and recompile"); return null;
      }
    }

    public void action(int nodeNumber) {
      switch(nodeNumber){
      case 266: INTEGER.v = Integer.parseInt(lexeme());  break;
      }
    }
  }

  public class ART_C_REAL extends AbstractAttributeBlock {
    ART_C_REAL REAL = this; double v;

    public void initRHSAttributeBlock(int nodeNumber, int term) {
      switch(nodeNumber){
      }
    }

    public AbstractAttributeBlock getAttributes(int nodeNumber) {
      switch(nodeNumber){
      default: Util.fatal("getAttributes: unknown node " + nodeNumber + ". Probable out-of-date ARTGeneratedActions - regenerate and recompile"); return null;
      }
    }

    public void action(int nodeNumber) {
      switch(nodeNumber){
      case 270: REAL.v = Double.parseDouble(lexeme());  break;
      }
    }
  }

  public class ART_C_STRING_SQ extends AbstractAttributeBlock {
    ART_C_STRING_SQ STRING_SQ = this; String v;

    public void initRHSAttributeBlock(int nodeNumber, int term) {
      switch(nodeNumber){
      }
    }

    public AbstractAttributeBlock getAttributes(int nodeNumber) {
      switch(nodeNumber){
      default: Util.fatal("getAttributes: unknown node " + nodeNumber + ". Probable out-of-date ARTGeneratedActions - regenerate and recompile"); return null;
      }
    }

    public void action(int nodeNumber) {
      switch(nodeNumber){
      case 274: STRING_SQ.v = lexemeCore().translateEscapes();  break;
      }
    }
  }

  public class ART_C_cases extends AbstractAttributeBlock {
    ART_C_cases cases = this; ART_C_cases cases1; ART_C_statements statements1; ART_C_e0 e01;

    public void initRHSAttributeBlock(int nodeNumber, int term) {
      switch(nodeNumber){
      case 280: statements1 = new ART_C_statements(); statements1.term = term; break;
      case 287: statements1 = new ART_C_statements(); statements1.term = term; break;
      case 292: statements1 = new ART_C_statements(); statements1.term = term; break;
      case 298: e01 = new ART_C_e0(); e01.term = term; break;
      case 300: statements1 = new ART_C_statements(); statements1.term = term; break;
      case 303: cases1 = new ART_C_cases(); cases1.term = term; break;
      case 307: e01 = new ART_C_e0(); e01.term = term; break;
      case 309: statements1 = new ART_C_statements(); statements1.term = term; break;
      case 310: cases1 = new ART_C_cases(); cases1.term = term; break;
      case 314: e01 = new ART_C_e0(); e01.term = term; break;
      case 316: statements1 = new ART_C_statements(); statements1.term = term; break;
      case 319: cases1 = new ART_C_cases(); cases1.term = term; break;
      case 323: e01 = new ART_C_e0(); e01.term = term; break;
      case 325: statements1 = new ART_C_statements(); statements1.term = term; break;
      case 331: e01 = new ART_C_e0(); e01.term = term; break;
      case 333: statements1 = new ART_C_statements(); statements1.term = term; break;
      case 337: e01 = new ART_C_e0(); e01.term = term; break;
      case 339: statements1 = new ART_C_statements(); statements1.term = term; break;
      }
    }

    public AbstractAttributeBlock getAttributes(int nodeNumber) {
      switch(nodeNumber){
      case 280: return statements1;
      case 287: return statements1;
      case 292: return statements1;
      case 298: return e01;
      case 300: return statements1;
      case 303: return cases1;
      case 307: return e01;
      case 309: return statements1;
      case 310: return cases1;
      case 314: return e01;
      case 316: return statements1;
      case 319: return cases1;
      case 323: return e01;
      case 325: return statements1;
      case 331: return e01;
      case 333: return statements1;
      case 337: return e01;
      case 339: return statements1;
      default: Util.fatal("getAttributes: unknown node " + nodeNumber + ". Probable out-of-date ARTGeneratedActions - regenerate and recompile"); return null;
      }
    }

    public void action(int nodeNumber) {
      switch(nodeNumber){
      case 282: interpret(statements1); break;
      case 287: interpret(statements1); break;
      case 294: interpret(statements1); break;
      case 303: if (switchVal == e01.v && CheckContinues == false){interpret(statements1);} else if (switchVal == e01.v && CheckContinues == true) {interpret(statements1);CheckContinues=false;} else {interpret(cases1);} break;
      case 310: if (switchVal == e01.v) {interpret(statements1);  CheckContinues= true; interpret(cases1);} else {interpret(cases1);} break;
      case 319: if (switchVal == e01.v) {interpret(statements1);  CheckContinues= true; interpret(cases1);} else {interpret(cases1);} break;
      case 327: if (switchVal == e01.v || CheckContinues == true) {interpret(statements1);} break;
      case 333: if (switchVal == e01.v || CheckContinues == true) {interpret(statements1);} break;
      case 341: if (switchVal == e01.v || CheckContinues == true) {interpret(statements1);} break;
      }
    }
  }

  public class ART_C_e0 extends AbstractAttributeBlock {
    ART_C_e0 e0 = this; int v; ART_C_e0 e01; ART_C_e0 e02; ART_C_e1 e11; ART_C_e1 e12;

    public void initRHSAttributeBlock(int nodeNumber, int term) {
      switch(nodeNumber){
      case 345: e11 = new ART_C_e1(); e11.term = term; break;
      case 348: e11 = new ART_C_e1(); e11.term = term; break;
      case 350: e12 = new ART_C_e1(); e12.term = term; break;
      case 353: e11 = new ART_C_e1(); e11.term = term; break;
      case 355: e12 = new ART_C_e1(); e12.term = term; break;
      case 358: e11 = new ART_C_e1(); e11.term = term; break;
      case 360: e12 = new ART_C_e1(); e12.term = term; break;
      case 363: e11 = new ART_C_e1(); e11.term = term; break;
      case 365: e12 = new ART_C_e1(); e12.term = term; break;
      case 368: e11 = new ART_C_e1(); e11.term = term; break;
      case 370: e12 = new ART_C_e1(); e12.term = term; break;
      case 373: e11 = new ART_C_e1(); e11.term = term; break;
      case 375: e12 = new ART_C_e1(); e12.term = term; break;
      case 378: e01 = new ART_C_e0(); e01.term = term; break;
      case 380: e02 = new ART_C_e0(); e02.term = term; break;
      case 383: e01 = new ART_C_e0(); e01.term = term; break;
      case 385: e02 = new ART_C_e0(); e02.term = term; break;
      case 388: e01 = new ART_C_e0(); e01.term = term; break;
      case 390: e02 = new ART_C_e0(); e02.term = term; break;
      case 393: e01 = new ART_C_e0(); e01.term = term; break;
      case 395: e02 = new ART_C_e0(); e02.term = term; break;
      case 398: e01 = new ART_C_e0(); e01.term = term; break;
      case 400: e02 = new ART_C_e0(); e02.term = term; break;
      }
    }

    public AbstractAttributeBlock getAttributes(int nodeNumber) {
      switch(nodeNumber){
      case 345: return e11;
      case 348: return e11;
      case 350: return e12;
      case 353: return e11;
      case 355: return e12;
      case 358: return e11;
      case 360: return e12;
      case 363: return e11;
      case 365: return e12;
      case 368: return e11;
      case 370: return e12;
      case 373: return e11;
      case 375: return e12;
      case 378: return e01;
      case 380: return e02;
      case 383: return e01;
      case 385: return e02;
      case 388: return e01;
      case 390: return e02;
      case 393: return e01;
      case 395: return e02;
      case 398: return e01;
      case 400: return e02;
      default: Util.fatal("getAttributes: unknown node " + nodeNumber + ". Probable out-of-date ARTGeneratedActions - regenerate and recompile"); return null;
      }
    }

    public void action(int nodeNumber) {
      switch(nodeNumber){
      case 345: e0.v = e11.v;  break;
      case 350: e0.v = e11.v >  e12.v ? 1 : 0;  break;
      case 355: e0.v = e11.v <  e12.v ? 1 : 0;  break;
      case 360: e0.v = e11.v >= e12.v ? 1 : 0;  break;
      case 365: e0.v = e11.v <= e12.v ? 1 : 0;  break;
      case 370: e0.v = e11.v == e12.v ? 1 : 0;  break;
      case 375: e0.v = e11.v != e12.v ? 1 : 0;  break;
      case 380: e0.v = (e01.v != 0) && (e02.v != 0) ? 1 : 0;  break;
      case 385: e0.v = (e01.v != 0) || (e02.v != 0) ? 1 : 0;  break;
      case 390: e0.v = (e01.v != 0) && (e02.v != 0) ? 1 : 0;  break;
      case 395: e0.v = (e01.v != 0) || (e02.v != 0) ? 1 : 0;  break;
      case 400: e0.v = (e01.v != 0) ^ (e02.v != 0) ? 1 : 0;  break;
      }
    }
  }

  public class ART_C_e1 extends AbstractAttributeBlock {
    ART_C_e1 e1 = this; int v; ART_C_e1 e11; ART_C_e2 e21;

    public void initRHSAttributeBlock(int nodeNumber, int term) {
      switch(nodeNumber){
      case 404: e21 = new ART_C_e2(); e21.term = term; break;
      case 407: e11 = new ART_C_e1(); e11.term = term; break;
      case 409: e21 = new ART_C_e2(); e21.term = term; break;
      case 412: e11 = new ART_C_e1(); e11.term = term; break;
      case 414: e21 = new ART_C_e2(); e21.term = term; break;
      }
    }

    public AbstractAttributeBlock getAttributes(int nodeNumber) {
      switch(nodeNumber){
      case 404: return e21;
      case 407: return e11;
      case 409: return e21;
      case 412: return e11;
      case 414: return e21;
      default: Util.fatal("getAttributes: unknown node " + nodeNumber + ". Probable out-of-date ARTGeneratedActions - regenerate and recompile"); return null;
      }
    }

    public void action(int nodeNumber) {
      switch(nodeNumber){
      case 404: e1.v = e21.v;  break;
      case 409: e1.v = e11.v + e21.v;  break;
      case 414: e1.v = e11.v - e21.v;  break;
      }
    }
  }

  public class ART_C_e2 extends AbstractAttributeBlock {
    ART_C_e2 e2 = this; int v; ART_C_e2 e21; ART_C_e3 e31;

    public void initRHSAttributeBlock(int nodeNumber, int term) {
      switch(nodeNumber){
      case 418: e31 = new ART_C_e3(); e31.term = term; break;
      case 421: e21 = new ART_C_e2(); e21.term = term; break;
      case 423: e31 = new ART_C_e3(); e31.term = term; break;
      case 426: e21 = new ART_C_e2(); e21.term = term; break;
      case 428: e31 = new ART_C_e3(); e31.term = term; break;
      case 431: e21 = new ART_C_e2(); e21.term = term; break;
      case 433: e31 = new ART_C_e3(); e31.term = term; break;
      }
    }

    public AbstractAttributeBlock getAttributes(int nodeNumber) {
      switch(nodeNumber){
      case 418: return e31;
      case 421: return e21;
      case 423: return e31;
      case 426: return e21;
      case 428: return e31;
      case 431: return e21;
      case 433: return e31;
      default: Util.fatal("getAttributes: unknown node " + nodeNumber + ". Probable out-of-date ARTGeneratedActions - regenerate and recompile"); return null;
      }
    }

    public void action(int nodeNumber) {
      switch(nodeNumber){
      case 418: e2.v = e31.v;  break;
      case 423: e2.v = e21.v * e31.v;  break;
      case 428: e2.v = e21.v / e31.v;  break;
      case 433: e2.v = e21.v % e31.v;  break;
      }
    }
  }

  public class ART_C_e3 extends AbstractAttributeBlock {
    ART_C_e3 e3 = this; int v; ART_C_e3 e31; ART_C_e4 e41;

    public void initRHSAttributeBlock(int nodeNumber, int term) {
      switch(nodeNumber){
      case 437: e41 = new ART_C_e4(); e41.term = term; break;
      case 441: e31 = new ART_C_e3(); e31.term = term; break;
      case 445: e31 = new ART_C_e3(); e31.term = term; break;
      case 449: e31 = new ART_C_e3(); e31.term = term; break;
      }
    }

    public AbstractAttributeBlock getAttributes(int nodeNumber) {
      switch(nodeNumber){
      case 437: return e41;
      case 441: return e31;
      case 445: return e31;
      case 449: return e31;
      default: Util.fatal("getAttributes: unknown node " + nodeNumber + ". Probable out-of-date ARTGeneratedActions - regenerate and recompile"); return null;
      }
    }

    public void action(int nodeNumber) {
      switch(nodeNumber){
      case 437: e3.v = e41.v;  break;
      case 441: e3.v = e31.v;  break;
      case 445: e3.v = -e31.v;  break;
      case 449: e3.v = e31.v == 0 ? 1 : 0;  break;
      }
    }
  }

  public class ART_C_e4 extends AbstractAttributeBlock {
    ART_C_e4 e4 = this; int v; ART_C_e5 e51; ART_C_e4 e41;

    public void initRHSAttributeBlock(int nodeNumber, int term) {
      switch(nodeNumber){
      case 453: e51 = new ART_C_e5(); e51.term = term; break;
      case 456: e51 = new ART_C_e5(); e51.term = term; break;
      case 458: e41 = new ART_C_e4(); e41.term = term; break;
      }
    }

    public AbstractAttributeBlock getAttributes(int nodeNumber) {
      switch(nodeNumber){
      case 453: return e51;
      case 456: return e51;
      case 458: return e41;
      default: Util.fatal("getAttributes: unknown node " + nodeNumber + ". Probable out-of-date ARTGeneratedActions - regenerate and recompile"); return null;
      }
    }

    public void action(int nodeNumber) {
      switch(nodeNumber){
      case 453: e4.v = e51.v;  break;
      case 458: e4.v = (int) Math.pow(e51.v, e41.v);  break;
      }
    }
  }

  public class ART_C_e5 extends AbstractAttributeBlock {
    ART_C_e5 e5 = this; int v; ART_C_e6 e61; ART_C_ID ID1;

    public void initRHSAttributeBlock(int nodeNumber, int term) {
      switch(nodeNumber){
      case 462: e61 = new ART_C_e6(); e61.term = term; break;
      case 465: ID1 = new ART_C_ID(); ID1.term = term; break;
      case 469: ID1 = new ART_C_ID(); ID1.term = term; break;
      }
    }

    public AbstractAttributeBlock getAttributes(int nodeNumber) {
      switch(nodeNumber){
      case 462: return e61;
      case 465: return ID1;
      case 469: return ID1;
      default: Util.fatal("getAttributes: unknown node " + nodeNumber + ". Probable out-of-date ARTGeneratedActions - regenerate and recompile"); return null;
      }
    }

    public void action(int nodeNumber) {
      switch(nodeNumber){
      case 462: e5.v = e61.v;  break;
      case 466: e5.v = variables.get(ID1.v); variables.put(ID1.v, e5.v + 1);  break;
      case 470: e5.v = variables.get(ID1.v); variables.put(ID1.v, e5.v - 1);  break;
      }
    }
  }

  public class ART_C_e6 extends AbstractAttributeBlock {
    ART_C_e6 e6 = this; int v; ART_C_e7 e71; ART_C_ID ID1;

    public void initRHSAttributeBlock(int nodeNumber, int term) {
      switch(nodeNumber){
      case 474: e71 = new ART_C_e7(); e71.term = term; break;
      case 478: ID1 = new ART_C_ID(); ID1.term = term; break;
      case 482: ID1 = new ART_C_ID(); ID1.term = term; break;
      }
    }

    public AbstractAttributeBlock getAttributes(int nodeNumber) {
      switch(nodeNumber){
      case 474: return e71;
      case 478: return ID1;
      case 482: return ID1;
      default: Util.fatal("getAttributes: unknown node " + nodeNumber + ". Probable out-of-date ARTGeneratedActions - regenerate and recompile"); return null;
      }
    }

    public void action(int nodeNumber) {
      switch(nodeNumber){
      case 474: e6.v = e71.v;  break;
      case 478: int puppet = variables.get(ID1.v) + 1; variables.put(ID1.v,puppet); e6.v = puppet;   break;
      case 482: puppet = variables.get(ID1.v) - 1; variables.put(ID1.v,puppet); e6.v = puppet ;   break;
      }
    }
  }

  public class ART_C_e7 extends AbstractAttributeBlock {
    ART_C_e7 e7 = this; int v; ART_C_ID ID1; ART_C_e0 e01; ART_C_e1 e11; ART_C_STRING_SQ STRING_SQ1; ART_C_INTEGER INTEGER1;

    public void initRHSAttributeBlock(int nodeNumber, int term) {
      switch(nodeNumber){
      case 486: INTEGER1 = new ART_C_INTEGER(); INTEGER1.term = term; break;
      case 489: ID1 = new ART_C_ID(); ID1.term = term; break;
      case 493: e11 = new ART_C_e1(); e11.term = term; break;
      case 499: e01 = new ART_C_e0(); e01.term = term; break;
      case 505: e01 = new ART_C_e0(); e01.term = term; break;
      case 511: e01 = new ART_C_e0(); e01.term = term; break;
      case 517: e01 = new ART_C_e0(); e01.term = term; break;
      case 528: STRING_SQ1 = new ART_C_STRING_SQ(); STRING_SQ1.term = term; break;
      case 530: e01 = new ART_C_e0(); e01.term = term; break;
      }
    }

    public AbstractAttributeBlock getAttributes(int nodeNumber) {
      switch(nodeNumber){
      case 486: return INTEGER1;
      case 489: return ID1;
      case 493: return e11;
      case 499: return e01;
      case 505: return e01;
      case 511: return e01;
      case 517: return e01;
      case 528: return STRING_SQ1;
      case 530: return e01;
      default: Util.fatal("getAttributes: unknown node " + nodeNumber + ". Probable out-of-date ARTGeneratedActions - regenerate and recompile"); return null;
      }
    }

    public void action(int nodeNumber) {
      switch(nodeNumber){
      case 486: e7.v = INTEGER1.v;  break;
      case 489: e7.v = variables.getOrDefault(ID1.v, 0);  break;
      case 494: e7.v = e11.v;  break;
      case 500: e7.v = (int) Math.sqrt(e01.v);  break;
      case 506: e7.v = (int) (Math.sin(e01.v) * 1000);  break;
      case 512: e7.v = (int) (Math.cos(e01.v) * 1000);  break;
      case 518: e7.v = Math.abs(e01.v);  break;
      case 523: System.out.print("Input: "); e7.v = Integer.parseInt(System.console().readLine());  break;
      case 531: e7.v = (int) plugin(STRING_SQ1.v, e01.v);  break;
      }
    }
  }

  public class ART_C_elseOpt extends AbstractAttributeBlock {
    ART_C_elseOpt elseOpt = this; ART_C_statement statement1; ART_C_statements statements1; ART_C_e0 e01; ART_C_elseOpt elseOpt1;

    public void initRHSAttributeBlock(int nodeNumber, int term) {
      switch(nodeNumber){
      case 536: e01 = new ART_C_e0(); e01.term = term; break;
      case 538: statements1 = new ART_C_statements(); statements1.term = term; break;
      case 539: elseOpt1 = new ART_C_elseOpt(); elseOpt1.term = term; break;
      case 543: statement1 = new ART_C_statement(); statement1.term = term; break;
      }
    }

    public AbstractAttributeBlock getAttributes(int nodeNumber) {
      switch(nodeNumber){
      case 536: return e01;
      case 538: return statements1;
      case 539: return elseOpt1;
      case 543: return statement1;
      default: Util.fatal("getAttributes: unknown node " + nodeNumber + ". Probable out-of-date ARTGeneratedActions - regenerate and recompile"); return null;
      }
    }

    public void action(int nodeNumber) {
      switch(nodeNumber){
      case 539: if (e01.v != 0) {interpret(statements1);} else{ interpret(elseOpt1);}  break;
      }
    }
  }

  public class ART_C_initAndTest extends AbstractAttributeBlock {
    ART_C_initAndTest initAndTest = this; ART_C_statements statements1;

    public void initRHSAttributeBlock(int nodeNumber, int term) {
      switch(nodeNumber){
      case 550: statements1 = new ART_C_statements(); statements1.term = term; break;
      }
    }

    public AbstractAttributeBlock getAttributes(int nodeNumber) {
      switch(nodeNumber){
      case 550: return statements1;
      default: Util.fatal("getAttributes: unknown node " + nodeNumber + ". Probable out-of-date ARTGeneratedActions - regenerate and recompile"); return null;
      }
    }

    public void action(int nodeNumber) {
      switch(nodeNumber){
      case 549:variables.clear();  break;
      case 550: System.out.println("Tests completed: " + successCount + " successes, " + failCount + " failures");  break;
      }
    }
  }

  public class ART_C_printElements extends AbstractAttributeBlock {
    ART_C_printElements printElements = this; ART_C_printElements printElements1; ART_C_e0 e01; ART_C_STRING_SQ STRING_SQ1;

    public void initRHSAttributeBlock(int nodeNumber, int term) {
      switch(nodeNumber){
      case 554: STRING_SQ1 = new ART_C_STRING_SQ(); STRING_SQ1.term = term; break;
      case 557: STRING_SQ1 = new ART_C_STRING_SQ(); STRING_SQ1.term = term; break;
      case 559: printElements1 = new ART_C_printElements(); printElements1.term = term; break;
      case 562: e01 = new ART_C_e0(); e01.term = term; break;
      case 565: e01 = new ART_C_e0(); e01.term = term; break;
      case 567: printElements1 = new ART_C_printElements(); printElements1.term = term; break;
      }
    }

    public AbstractAttributeBlock getAttributes(int nodeNumber) {
      switch(nodeNumber){
      case 554: return STRING_SQ1;
      case 557: return STRING_SQ1;
      case 559: return printElements1;
      case 562: return e01;
      case 565: return e01;
      case 567: return printElements1;
      default: Util.fatal("getAttributes: unknown node " + nodeNumber + ". Probable out-of-date ARTGeneratedActions - regenerate and recompile"); return null;
      }
    }

    public void action(int nodeNumber) {
      switch(nodeNumber){
      case 554: System.out.print(STRING_SQ1.v);  break;
      case 557: System.out.print(STRING_SQ1.v);  break;
      case 562: System.out.print(e01.v);  break;
      case 565: System.out.print(e01.v);  break;
      }
    }
  }

  public class ART_C_statement extends AbstractAttributeBlock {
    ART_C_statement statement = this; ART_C_cases cases1; ART_C_printElements printElements1; ART_C_statement statement1; ART_C_statements statements1; ART_C_statements statements2; ART_C_ID ID1; ART_C_e0 e01; ART_C_e0 e02; ART_C_e0 e03; ART_C_STRING_SQ STRING_SQ1; ART_C_elseOpt elseOpt1;

    public void initRHSAttributeBlock(int nodeNumber, int term) {
      switch(nodeNumber){
      case 571: ID1 = new ART_C_ID(); ID1.term = term; break;
      case 573: e01 = new ART_C_e0(); e01.term = term; break;
      case 577: ID1 = new ART_C_ID(); ID1.term = term; break;
      case 579: e01 = new ART_C_e0(); e01.term = term; break;
      case 583: ID1 = new ART_C_ID(); ID1.term = term; break;
      case 585: e01 = new ART_C_e0(); e01.term = term; break;
      case 589: ID1 = new ART_C_ID(); ID1.term = term; break;
      case 591: e01 = new ART_C_e0(); e01.term = term; break;
      case 595: ID1 = new ART_C_ID(); ID1.term = term; break;
      case 597: e01 = new ART_C_e0(); e01.term = term; break;
      case 601: ID1 = new ART_C_ID(); ID1.term = term; break;
      case 603: e01 = new ART_C_e0(); e01.term = term; break;
      case 609: statements1 = new ART_C_statements(); statements1.term = term; break;
      case 612: ID1 = new ART_C_ID(); ID1.term = term; break;
      case 614: statements2 = new ART_C_statements(); statements2.term = term; break;
      case 620: e01 = new ART_C_e0(); e01.term = term; break;
      case 622: statements1 = new ART_C_statements(); statements1.term = term; break;
      case 623: elseOpt1 = new ART_C_elseOpt(); elseOpt1.term = term; break;
      case 627: e01 = new ART_C_e0(); e01.term = term; break;
      case 629: statements1 = new ART_C_statements(); statements1.term = term; break;
      case 635: ID1 = new ART_C_ID(); ID1.term = term; break;
      case 637: e01 = new ART_C_e0(); e01.term = term; break;
      case 639: e02 = new ART_C_e0(); e02.term = term; break;
      case 641: statement1 = new ART_C_statement(); statement1.term = term; break;
      case 643: statements1 = new ART_C_statements(); statements1.term = term; break;
      case 650: e01 = new ART_C_e0(); e01.term = term; break;
      case 653: cases1 = new ART_C_cases(); cases1.term = term; break;
      case 660: printElements1 = new ART_C_printElements(); printElements1.term = term; break;
      case 666: ID1 = new ART_C_ID(); ID1.term = term; break;
      case 667: statement1 = new ART_C_statement(); statement1.term = term; break;
      case 671: ID1 = new ART_C_ID(); ID1.term = term; break;
      case 676: statement1 = new ART_C_statement(); statement1.term = term; break;
      case 682: STRING_SQ1 = new ART_C_STRING_SQ(); STRING_SQ1.term = term; break;
      case 689: STRING_SQ1 = new ART_C_STRING_SQ(); STRING_SQ1.term = term; break;
      case 691: e01 = new ART_C_e0(); e01.term = term; break;
      case 698: STRING_SQ1 = new ART_C_STRING_SQ(); STRING_SQ1.term = term; break;
      case 700: e01 = new ART_C_e0(); e01.term = term; break;
      case 702: e02 = new ART_C_e0(); e02.term = term; break;
      case 709: STRING_SQ1 = new ART_C_STRING_SQ(); STRING_SQ1.term = term; break;
      case 711: e01 = new ART_C_e0(); e01.term = term; break;
      case 713: e02 = new ART_C_e0(); e02.term = term; break;
      case 715: e03 = new ART_C_e0(); e03.term = term; break;
      case 725: STRING_SQ1 = new ART_C_STRING_SQ(); STRING_SQ1.term = term; break;
      case 734: e01 = new ART_C_e0(); e01.term = term; break;
      case 739: e01 = new ART_C_e0(); e01.term = term; break;
      case 744: e01 = new ART_C_e0(); e01.term = term; break;
      case 757: e01 = new ART_C_e0(); e01.term = term; break;
      case 767: e01 = new ART_C_e0(); e01.term = term; break;
      case 769: e02 = new ART_C_e0(); e02.term = term; break;
      }
    }

    public AbstractAttributeBlock getAttributes(int nodeNumber) {
      switch(nodeNumber){
      case 571: return ID1;
      case 573: return e01;
      case 577: return ID1;
      case 579: return e01;
      case 583: return ID1;
      case 585: return e01;
      case 589: return ID1;
      case 591: return e01;
      case 595: return ID1;
      case 597: return e01;
      case 601: return ID1;
      case 603: return e01;
      case 609: return statements1;
      case 612: return ID1;
      case 614: return statements2;
      case 620: return e01;
      case 622: return statements1;
      case 623: return elseOpt1;
      case 627: return e01;
      case 629: return statements1;
      case 635: return ID1;
      case 637: return e01;
      case 639: return e02;
      case 641: return statement1;
      case 643: return statements1;
      case 650: return e01;
      case 653: return cases1;
      case 660: return printElements1;
      case 666: return ID1;
      case 667: return statement1;
      case 671: return ID1;
      case 676: return statement1;
      case 682: return STRING_SQ1;
      case 689: return STRING_SQ1;
      case 691: return e01;
      case 698: return STRING_SQ1;
      case 700: return e01;
      case 702: return e02;
      case 709: return STRING_SQ1;
      case 711: return e01;
      case 713: return e02;
      case 715: return e03;
      case 725: return STRING_SQ1;
      case 734: return e01;
      case 739: return e01;
      case 744: return e01;
      case 757: return e01;
      case 767: return e01;
      case 769: return e02;
      default: Util.fatal("getAttributes: unknown node " + nodeNumber + ". Probable out-of-date ARTGeneratedActions - regenerate and recompile"); return null;
      }
    }

    public void action(int nodeNumber) {
      switch(nodeNumber){
      case 574: variables.put(ID1.v, e01.v);  break;
      case 580: variables.put(ID1.v, variables.getOrDefault(ID1.v, 0) + e01.v);  break;
      case 586: variables.put(ID1.v, variables.getOrDefault(ID1.v, 0) - e01.v);  break;
      case 592: variables.put(ID1.v, variables.getOrDefault(ID1.v, 0) * e01.v);  break;
      case 598: variables.put(ID1.v, variables.getOrDefault(ID1.v, 0) / e01.v);  break;
      case 604: variables.put(ID1.v, variables.getOrDefault(ID1.v, 0) % e01.v);  break;
      case 616: try { interpret(statements1); } catch (Exception e) { System.out.print("Caught error successfully. \n"); variables.put(ID1.v, 1); interpret(statements2); }  break;
      case 623: if (e01.v != 0) {interpret(statements1);} else{ interpret(elseOpt1);}  break;
      case 631: interpret(e01); 
  while (e01.v != 0) { 
    interpret(statements1); 
    interpret(e01); 
  }  break;
      case 645: for (variables.put(ID1.v, e01.v), interpret(e02); e02.v != 0; interpret(statement1)) { interpret(statements1); interpret(statement1); interpret(e02);}  break;
      case 655: switchVal = e01.v; interpret(cases1);  switchVal=0; CheckContinues=false; break;
      case 667: procedures.put(ID1.v, statement1);  break;
      case 672: interpret(procedures.get(ID1.v));  break;
      case 684: plugin(STRING_SQ1.v);  break;
      case 693: plugin(STRING_SQ1.v, e01.v);  break;
      case 704: plugin(STRING_SQ1.v, e01.v, e02.v);  break;
      case 717: plugin(STRING_SQ1.v, e01.v, e02.v, e03.v);  break;
      case 721: plugin("init");  break;
      case 726: plugin("load", STRING_SQ1.v);  break;
      case 730: plugin("invert");  break;
      case 735: plugin("brightness", e01.v);  break;
      case 740: plugin("contrast", e01.v);  break;
      case 745: plugin("rotate", e01.v);  break;
      case 749: plugin("grayscale");  break;
      case 753: plugin("sobel");  break;
      case 758: plugin("blur", e01.v);  break;
      case 762: plugin("summerVibe");  break;
      case 771: if (e01.v == e02.v) { 
      successCount++; 
      System.out.println("** Successful Test **");
     } else { 
        System.out.println("** Failed Test **");
       failCount++; 
     }  break;
      }
    }
  }

  public class ART_C_statements extends AbstractAttributeBlock {
    ART_C_statements statements = this; ART_C_statement statement1; ART_C_statements statements1;

    public void initRHSAttributeBlock(int nodeNumber, int term) {
      switch(nodeNumber){
      case 775: statement1 = new ART_C_statement(); statement1.term = term; break;
      case 776: statements1 = new ART_C_statements(); statements1.term = term; break;
      case 779: statement1 = new ART_C_statement(); statement1.term = term; break;
      }
    }

    public AbstractAttributeBlock getAttributes(int nodeNumber) {
      switch(nodeNumber){
      case 775: return statement1;
      case 776: return statements1;
      case 779: return statement1;
      default: Util.fatal("getAttributes: unknown node " + nodeNumber + ". Probable out-of-date ARTGeneratedActions - regenerate and recompile"); return null;
      }
    }

    public void action(int nodeNumber) {
      switch(nodeNumber){
      case 779: System.out.println("Final variable map " + variables);  break;
      }
    }
  }

  public AbstractAttributeBlock init(AbstractInterpreter interpreter, int term) {
    this.interpreter = interpreter;
    var ret = new ART_C_initAndTest();
    ret.term = term;
    return ret;
  }
}
