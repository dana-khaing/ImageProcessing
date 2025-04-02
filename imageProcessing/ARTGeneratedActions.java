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
   
  public String name() { return "2025-04-02 19:17:59"; }

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
      case 257: ID.v = lexeme();  break;
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
      case 261: INTEGER.v = Integer.parseInt(lexeme());  break;
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
      case 265: REAL.v = Double.parseDouble(lexeme());  break;
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
      case 269: STRING_SQ.v = lexemeCore().translateEscapes();  break;
      }
    }
  }

  public class ART_C_cases extends AbstractAttributeBlock {
    ART_C_cases cases = this; ART_C_cases cases1; ART_C_statements statements1; ART_C_e0 e01;

    public void initRHSAttributeBlock(int nodeNumber, int term) {
      switch(nodeNumber){
      case 275: statements1 = new ART_C_statements(); statements1.term = term; break;
      case 282: statements1 = new ART_C_statements(); statements1.term = term; break;
      case 287: statements1 = new ART_C_statements(); statements1.term = term; break;
      case 293: e01 = new ART_C_e0(); e01.term = term; break;
      case 295: statements1 = new ART_C_statements(); statements1.term = term; break;
      case 298: cases1 = new ART_C_cases(); cases1.term = term; break;
      case 302: e01 = new ART_C_e0(); e01.term = term; break;
      case 304: statements1 = new ART_C_statements(); statements1.term = term; break;
      case 305: cases1 = new ART_C_cases(); cases1.term = term; break;
      case 309: e01 = new ART_C_e0(); e01.term = term; break;
      case 311: statements1 = new ART_C_statements(); statements1.term = term; break;
      case 314: cases1 = new ART_C_cases(); cases1.term = term; break;
      case 318: e01 = new ART_C_e0(); e01.term = term; break;
      case 320: statements1 = new ART_C_statements(); statements1.term = term; break;
      case 326: e01 = new ART_C_e0(); e01.term = term; break;
      case 328: statements1 = new ART_C_statements(); statements1.term = term; break;
      case 332: e01 = new ART_C_e0(); e01.term = term; break;
      case 334: statements1 = new ART_C_statements(); statements1.term = term; break;
      }
    }

    public AbstractAttributeBlock getAttributes(int nodeNumber) {
      switch(nodeNumber){
      case 275: return statements1;
      case 282: return statements1;
      case 287: return statements1;
      case 293: return e01;
      case 295: return statements1;
      case 298: return cases1;
      case 302: return e01;
      case 304: return statements1;
      case 305: return cases1;
      case 309: return e01;
      case 311: return statements1;
      case 314: return cases1;
      case 318: return e01;
      case 320: return statements1;
      case 326: return e01;
      case 328: return statements1;
      case 332: return e01;
      case 334: return statements1;
      default: Util.fatal("getAttributes: unknown node " + nodeNumber + ". Probable out-of-date ARTGeneratedActions - regenerate and recompile"); return null;
      }
    }

    public void action(int nodeNumber) {
      switch(nodeNumber){
      case 277: interpret(statements1); break;
      case 282: interpret(statements1); break;
      case 289: interpret(statements1); break;
      case 298: if (switchVal == e01.v && CheckContinues == false){interpret(statements1);} else if (switchVal == e01.v && CheckContinues == true) {interpret(statements1);CheckContinues=false;} else {interpret(cases1);} break;
      case 305: if (switchVal == e01.v) {interpret(statements1);  CheckContinues= true; interpret(cases1);} else {interpret(cases1);} break;
      case 314: if (switchVal == e01.v) {interpret(statements1);  CheckContinues= true; interpret(cases1);} else {interpret(cases1);} break;
      case 322: if (switchVal == e01.v || CheckContinues == true) {interpret(statements1);} break;
      case 328: if (switchVal == e01.v || CheckContinues == true) {interpret(statements1);} break;
      case 336: if (switchVal == e01.v || CheckContinues == true) {interpret(statements1);} break;
      }
    }
  }

  public class ART_C_e0 extends AbstractAttributeBlock {
    ART_C_e0 e0 = this; int v; ART_C_e0 e01; ART_C_e0 e02; ART_C_e1 e11; ART_C_e1 e12;

    public void initRHSAttributeBlock(int nodeNumber, int term) {
      switch(nodeNumber){
      case 340: e11 = new ART_C_e1(); e11.term = term; break;
      case 343: e11 = new ART_C_e1(); e11.term = term; break;
      case 345: e12 = new ART_C_e1(); e12.term = term; break;
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
      case 373: e01 = new ART_C_e0(); e01.term = term; break;
      case 375: e02 = new ART_C_e0(); e02.term = term; break;
      case 378: e01 = new ART_C_e0(); e01.term = term; break;
      case 380: e02 = new ART_C_e0(); e02.term = term; break;
      case 383: e01 = new ART_C_e0(); e01.term = term; break;
      case 385: e02 = new ART_C_e0(); e02.term = term; break;
      case 388: e01 = new ART_C_e0(); e01.term = term; break;
      case 390: e02 = new ART_C_e0(); e02.term = term; break;
      case 393: e01 = new ART_C_e0(); e01.term = term; break;
      case 395: e02 = new ART_C_e0(); e02.term = term; break;
      }
    }

    public AbstractAttributeBlock getAttributes(int nodeNumber) {
      switch(nodeNumber){
      case 340: return e11;
      case 343: return e11;
      case 345: return e12;
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
      case 373: return e01;
      case 375: return e02;
      case 378: return e01;
      case 380: return e02;
      case 383: return e01;
      case 385: return e02;
      case 388: return e01;
      case 390: return e02;
      case 393: return e01;
      case 395: return e02;
      default: Util.fatal("getAttributes: unknown node " + nodeNumber + ". Probable out-of-date ARTGeneratedActions - regenerate and recompile"); return null;
      }
    }

    public void action(int nodeNumber) {
      switch(nodeNumber){
      case 340: e0.v = e11.v;  break;
      case 345: e0.v = e11.v >  e12.v ? 1 : 0;  break;
      case 350: e0.v = e11.v <  e12.v ? 1 : 0;  break;
      case 355: e0.v = e11.v >= e12.v ? 1 : 0;  break;
      case 360: e0.v = e11.v <= e12.v ? 1 : 0;  break;
      case 365: e0.v = e11.v == e12.v ? 1 : 0;  break;
      case 370: e0.v = e11.v != e12.v ? 1 : 0;  break;
      case 375: e0.v = (e01.v != 0) && (e02.v != 0) ? 1 : 0;  break;
      case 380: e0.v = (e01.v != 0) || (e02.v != 0) ? 1 : 0;  break;
      case 385: e0.v = (e01.v != 0) && (e02.v != 0) ? 1 : 0;  break;
      case 390: e0.v = (e01.v != 0) || (e02.v != 0) ? 1 : 0;  break;
      case 395: e0.v = (e01.v != 0) ^ (e02.v != 0) ? 1 : 0;  break;
      }
    }
  }

  public class ART_C_e1 extends AbstractAttributeBlock {
    ART_C_e1 e1 = this; int v; ART_C_e1 e11; ART_C_e2 e21;

    public void initRHSAttributeBlock(int nodeNumber, int term) {
      switch(nodeNumber){
      case 399: e21 = new ART_C_e2(); e21.term = term; break;
      case 402: e11 = new ART_C_e1(); e11.term = term; break;
      case 404: e21 = new ART_C_e2(); e21.term = term; break;
      case 407: e11 = new ART_C_e1(); e11.term = term; break;
      case 409: e21 = new ART_C_e2(); e21.term = term; break;
      }
    }

    public AbstractAttributeBlock getAttributes(int nodeNumber) {
      switch(nodeNumber){
      case 399: return e21;
      case 402: return e11;
      case 404: return e21;
      case 407: return e11;
      case 409: return e21;
      default: Util.fatal("getAttributes: unknown node " + nodeNumber + ". Probable out-of-date ARTGeneratedActions - regenerate and recompile"); return null;
      }
    }

    public void action(int nodeNumber) {
      switch(nodeNumber){
      case 399: e1.v = e21.v;  break;
      case 404: e1.v = e11.v + e21.v;  break;
      case 409: e1.v = e11.v - e21.v;  break;
      }
    }
  }

  public class ART_C_e2 extends AbstractAttributeBlock {
    ART_C_e2 e2 = this; int v; ART_C_e2 e21; ART_C_e3 e31;

    public void initRHSAttributeBlock(int nodeNumber, int term) {
      switch(nodeNumber){
      case 413: e31 = new ART_C_e3(); e31.term = term; break;
      case 416: e21 = new ART_C_e2(); e21.term = term; break;
      case 418: e31 = new ART_C_e3(); e31.term = term; break;
      case 421: e21 = new ART_C_e2(); e21.term = term; break;
      case 423: e31 = new ART_C_e3(); e31.term = term; break;
      case 426: e21 = new ART_C_e2(); e21.term = term; break;
      case 428: e31 = new ART_C_e3(); e31.term = term; break;
      }
    }

    public AbstractAttributeBlock getAttributes(int nodeNumber) {
      switch(nodeNumber){
      case 413: return e31;
      case 416: return e21;
      case 418: return e31;
      case 421: return e21;
      case 423: return e31;
      case 426: return e21;
      case 428: return e31;
      default: Util.fatal("getAttributes: unknown node " + nodeNumber + ". Probable out-of-date ARTGeneratedActions - regenerate and recompile"); return null;
      }
    }

    public void action(int nodeNumber) {
      switch(nodeNumber){
      case 413: e2.v = e31.v;  break;
      case 418: e2.v = e21.v * e31.v;  break;
      case 423: e2.v = e21.v / e31.v;  break;
      case 428: e2.v = e21.v % e31.v;  break;
      }
    }
  }

  public class ART_C_e3 extends AbstractAttributeBlock {
    ART_C_e3 e3 = this; int v; ART_C_e3 e31; ART_C_e4 e41;

    public void initRHSAttributeBlock(int nodeNumber, int term) {
      switch(nodeNumber){
      case 432: e41 = new ART_C_e4(); e41.term = term; break;
      case 436: e31 = new ART_C_e3(); e31.term = term; break;
      case 440: e31 = new ART_C_e3(); e31.term = term; break;
      case 444: e31 = new ART_C_e3(); e31.term = term; break;
      }
    }

    public AbstractAttributeBlock getAttributes(int nodeNumber) {
      switch(nodeNumber){
      case 432: return e41;
      case 436: return e31;
      case 440: return e31;
      case 444: return e31;
      default: Util.fatal("getAttributes: unknown node " + nodeNumber + ". Probable out-of-date ARTGeneratedActions - regenerate and recompile"); return null;
      }
    }

    public void action(int nodeNumber) {
      switch(nodeNumber){
      case 432: e3.v = e41.v;  break;
      case 436: e3.v = e31.v;  break;
      case 440: e3.v = -e31.v;  break;
      case 444: e3.v = e31.v == 0 ? 1 : 0;  break;
      }
    }
  }

  public class ART_C_e4 extends AbstractAttributeBlock {
    ART_C_e4 e4 = this; int v; ART_C_e5 e51; ART_C_e4 e41;

    public void initRHSAttributeBlock(int nodeNumber, int term) {
      switch(nodeNumber){
      case 448: e51 = new ART_C_e5(); e51.term = term; break;
      case 451: e51 = new ART_C_e5(); e51.term = term; break;
      case 453: e41 = new ART_C_e4(); e41.term = term; break;
      }
    }

    public AbstractAttributeBlock getAttributes(int nodeNumber) {
      switch(nodeNumber){
      case 448: return e51;
      case 451: return e51;
      case 453: return e41;
      default: Util.fatal("getAttributes: unknown node " + nodeNumber + ". Probable out-of-date ARTGeneratedActions - regenerate and recompile"); return null;
      }
    }

    public void action(int nodeNumber) {
      switch(nodeNumber){
      case 448: e4.v = e51.v;  break;
      case 453: e4.v = (int) Math.pow(e51.v, e41.v);  break;
      }
    }
  }

  public class ART_C_e5 extends AbstractAttributeBlock {
    ART_C_e5 e5 = this; int v; ART_C_e6 e61; ART_C_ID ID1;

    public void initRHSAttributeBlock(int nodeNumber, int term) {
      switch(nodeNumber){
      case 457: e61 = new ART_C_e6(); e61.term = term; break;
      case 460: ID1 = new ART_C_ID(); ID1.term = term; break;
      case 464: ID1 = new ART_C_ID(); ID1.term = term; break;
      }
    }

    public AbstractAttributeBlock getAttributes(int nodeNumber) {
      switch(nodeNumber){
      case 457: return e61;
      case 460: return ID1;
      case 464: return ID1;
      default: Util.fatal("getAttributes: unknown node " + nodeNumber + ". Probable out-of-date ARTGeneratedActions - regenerate and recompile"); return null;
      }
    }

    public void action(int nodeNumber) {
      switch(nodeNumber){
      case 457: e5.v = e61.v;  break;
      case 461: e5.v = variables.get(ID1.v); variables.put(ID1.v, e5.v + 1);  break;
      case 465: e5.v = variables.get(ID1.v); variables.put(ID1.v, e5.v - 1);  break;
      }
    }
  }

  public class ART_C_e6 extends AbstractAttributeBlock {
    ART_C_e6 e6 = this; int v; ART_C_e7 e71; ART_C_ID ID1;

    public void initRHSAttributeBlock(int nodeNumber, int term) {
      switch(nodeNumber){
      case 469: e71 = new ART_C_e7(); e71.term = term; break;
      case 473: ID1 = new ART_C_ID(); ID1.term = term; break;
      case 477: ID1 = new ART_C_ID(); ID1.term = term; break;
      }
    }

    public AbstractAttributeBlock getAttributes(int nodeNumber) {
      switch(nodeNumber){
      case 469: return e71;
      case 473: return ID1;
      case 477: return ID1;
      default: Util.fatal("getAttributes: unknown node " + nodeNumber + ". Probable out-of-date ARTGeneratedActions - regenerate and recompile"); return null;
      }
    }

    public void action(int nodeNumber) {
      switch(nodeNumber){
      case 469: e6.v = e71.v;  break;
      case 473: e6.v = variables.get(ID1.v); variables.put(ID1.v, e6.v + 1);  break;
      case 477: e6.v = variables.get(ID1.v); variables.put(ID1.v, e6.v - 1);  break;
      }
    }
  }

  public class ART_C_e7 extends AbstractAttributeBlock {
    ART_C_e7 e7 = this; int v; ART_C_ID ID1; ART_C_e0 e01; ART_C_e1 e11; ART_C_STRING_SQ STRING_SQ1; ART_C_INTEGER INTEGER1;

    public void initRHSAttributeBlock(int nodeNumber, int term) {
      switch(nodeNumber){
      case 481: INTEGER1 = new ART_C_INTEGER(); INTEGER1.term = term; break;
      case 484: ID1 = new ART_C_ID(); ID1.term = term; break;
      case 488: e11 = new ART_C_e1(); e11.term = term; break;
      case 494: e01 = new ART_C_e0(); e01.term = term; break;
      case 500: e01 = new ART_C_e0(); e01.term = term; break;
      case 506: e01 = new ART_C_e0(); e01.term = term; break;
      case 512: e01 = new ART_C_e0(); e01.term = term; break;
      case 523: STRING_SQ1 = new ART_C_STRING_SQ(); STRING_SQ1.term = term; break;
      case 525: e01 = new ART_C_e0(); e01.term = term; break;
      }
    }

    public AbstractAttributeBlock getAttributes(int nodeNumber) {
      switch(nodeNumber){
      case 481: return INTEGER1;
      case 484: return ID1;
      case 488: return e11;
      case 494: return e01;
      case 500: return e01;
      case 506: return e01;
      case 512: return e01;
      case 523: return STRING_SQ1;
      case 525: return e01;
      default: Util.fatal("getAttributes: unknown node " + nodeNumber + ". Probable out-of-date ARTGeneratedActions - regenerate and recompile"); return null;
      }
    }

    public void action(int nodeNumber) {
      switch(nodeNumber){
      case 481: e7.v = INTEGER1.v;  break;
      case 484: e7.v = variables.getOrDefault(ID1.v, 0);  break;
      case 489: e7.v = e11.v;  break;
      case 495: e7.v = (int) Math.sqrt(e01.v);  break;
      case 501: e7.v = (int) (Math.sin(e01.v) * 1000);  break;
      case 507: e7.v = (int) (Math.cos(e01.v) * 1000);  break;
      case 513: e7.v = Math.abs(e01.v);  break;
      case 518: System.out.print("Input: "); e7.v = Integer.parseInt(System.console().readLine());  break;
      case 526: e7.v = (int) plugin(STRING_SQ1.v, e01.v);  break;
      }
    }
  }

  public class ART_C_elseOpt extends AbstractAttributeBlock {
    ART_C_elseOpt elseOpt = this; ART_C_statement statement1; ART_C_statements statements1; ART_C_e0 e01; ART_C_elseOpt elseOpt1;

    public void initRHSAttributeBlock(int nodeNumber, int term) {
      switch(nodeNumber){
      case 531: e01 = new ART_C_e0(); e01.term = term; break;
      case 533: statements1 = new ART_C_statements(); statements1.term = term; break;
      case 534: elseOpt1 = new ART_C_elseOpt(); elseOpt1.term = term; break;
      case 538: statement1 = new ART_C_statement(); statement1.term = term; break;
      }
    }

    public AbstractAttributeBlock getAttributes(int nodeNumber) {
      switch(nodeNumber){
      case 531: return e01;
      case 533: return statements1;
      case 534: return elseOpt1;
      case 538: return statement1;
      default: Util.fatal("getAttributes: unknown node " + nodeNumber + ". Probable out-of-date ARTGeneratedActions - regenerate and recompile"); return null;
      }
    }

    public void action(int nodeNumber) {
      switch(nodeNumber){
      case 534: if (e01.v != 0) {interpret(statements1);} else{ interpret(elseOpt1);}  break;
      }
    }
  }

  public class ART_C_initAndTest extends AbstractAttributeBlock {
    ART_C_initAndTest initAndTest = this; ART_C_statements statements1;

    public void initRHSAttributeBlock(int nodeNumber, int term) {
      switch(nodeNumber){
      case 545: statements1 = new ART_C_statements(); statements1.term = term; break;
      }
    }

    public AbstractAttributeBlock getAttributes(int nodeNumber) {
      switch(nodeNumber){
      case 545: return statements1;
      default: Util.fatal("getAttributes: unknown node " + nodeNumber + ". Probable out-of-date ARTGeneratedActions - regenerate and recompile"); return null;
      }
    }

    public void action(int nodeNumber) {
      switch(nodeNumber){
      case 544:variables.clear();  break;
      case 545: System.out.println("Tests completed: " + successCount + " successes, " + failCount + " failures");  break;
      }
    }
  }

  public class ART_C_printElements extends AbstractAttributeBlock {
    ART_C_printElements printElements = this; ART_C_printElements printElements1; ART_C_e0 e01; ART_C_STRING_SQ STRING_SQ1;

    public void initRHSAttributeBlock(int nodeNumber, int term) {
      switch(nodeNumber){
      case 549: STRING_SQ1 = new ART_C_STRING_SQ(); STRING_SQ1.term = term; break;
      case 552: STRING_SQ1 = new ART_C_STRING_SQ(); STRING_SQ1.term = term; break;
      case 554: printElements1 = new ART_C_printElements(); printElements1.term = term; break;
      case 557: e01 = new ART_C_e0(); e01.term = term; break;
      case 560: e01 = new ART_C_e0(); e01.term = term; break;
      case 562: printElements1 = new ART_C_printElements(); printElements1.term = term; break;
      }
    }

    public AbstractAttributeBlock getAttributes(int nodeNumber) {
      switch(nodeNumber){
      case 549: return STRING_SQ1;
      case 552: return STRING_SQ1;
      case 554: return printElements1;
      case 557: return e01;
      case 560: return e01;
      case 562: return printElements1;
      default: Util.fatal("getAttributes: unknown node " + nodeNumber + ". Probable out-of-date ARTGeneratedActions - regenerate and recompile"); return null;
      }
    }

    public void action(int nodeNumber) {
      switch(nodeNumber){
      case 549: System.out.print(STRING_SQ1.v);  break;
      case 552: System.out.print(STRING_SQ1.v);  break;
      case 557: System.out.print(e01.v);  break;
      case 560: System.out.print(e01.v);  break;
      }
    }
  }

  public class ART_C_statement extends AbstractAttributeBlock {
    ART_C_statement statement = this; ART_C_cases cases1; ART_C_printElements printElements1; ART_C_statement statement1; ART_C_statements statements1; ART_C_ID ID1; ART_C_e0 e01; ART_C_e0 e02; ART_C_e0 e03; ART_C_STRING_SQ STRING_SQ1; ART_C_elseOpt elseOpt1;

    public void initRHSAttributeBlock(int nodeNumber, int term) {
      switch(nodeNumber){
      case 566: ID1 = new ART_C_ID(); ID1.term = term; break;
      case 568: e01 = new ART_C_e0(); e01.term = term; break;
      case 572: ID1 = new ART_C_ID(); ID1.term = term; break;
      case 574: e01 = new ART_C_e0(); e01.term = term; break;
      case 578: ID1 = new ART_C_ID(); ID1.term = term; break;
      case 580: e01 = new ART_C_e0(); e01.term = term; break;
      case 584: ID1 = new ART_C_ID(); ID1.term = term; break;
      case 586: e01 = new ART_C_e0(); e01.term = term; break;
      case 590: ID1 = new ART_C_ID(); ID1.term = term; break;
      case 592: e01 = new ART_C_e0(); e01.term = term; break;
      case 596: ID1 = new ART_C_ID(); ID1.term = term; break;
      case 598: e01 = new ART_C_e0(); e01.term = term; break;
      case 603: e01 = new ART_C_e0(); e01.term = term; break;
      case 605: statements1 = new ART_C_statements(); statements1.term = term; break;
      case 606: elseOpt1 = new ART_C_elseOpt(); elseOpt1.term = term; break;
      case 610: e01 = new ART_C_e0(); e01.term = term; break;
      case 612: statements1 = new ART_C_statements(); statements1.term = term; break;
      case 618: ID1 = new ART_C_ID(); ID1.term = term; break;
      case 620: e01 = new ART_C_e0(); e01.term = term; break;
      case 622: e02 = new ART_C_e0(); e02.term = term; break;
      case 624: statement1 = new ART_C_statement(); statement1.term = term; break;
      case 626: statements1 = new ART_C_statements(); statements1.term = term; break;
      case 633: e01 = new ART_C_e0(); e01.term = term; break;
      case 636: cases1 = new ART_C_cases(); cases1.term = term; break;
      case 643: printElements1 = new ART_C_printElements(); printElements1.term = term; break;
      case 649: ID1 = new ART_C_ID(); ID1.term = term; break;
      case 650: statement1 = new ART_C_statement(); statement1.term = term; break;
      case 654: ID1 = new ART_C_ID(); ID1.term = term; break;
      case 659: statement1 = new ART_C_statement(); statement1.term = term; break;
      case 665: STRING_SQ1 = new ART_C_STRING_SQ(); STRING_SQ1.term = term; break;
      case 672: STRING_SQ1 = new ART_C_STRING_SQ(); STRING_SQ1.term = term; break;
      case 674: e01 = new ART_C_e0(); e01.term = term; break;
      case 681: STRING_SQ1 = new ART_C_STRING_SQ(); STRING_SQ1.term = term; break;
      case 683: e01 = new ART_C_e0(); e01.term = term; break;
      case 685: e02 = new ART_C_e0(); e02.term = term; break;
      case 692: STRING_SQ1 = new ART_C_STRING_SQ(); STRING_SQ1.term = term; break;
      case 694: e01 = new ART_C_e0(); e01.term = term; break;
      case 696: e02 = new ART_C_e0(); e02.term = term; break;
      case 698: e03 = new ART_C_e0(); e03.term = term; break;
      case 708: STRING_SQ1 = new ART_C_STRING_SQ(); STRING_SQ1.term = term; break;
      case 717: e01 = new ART_C_e0(); e01.term = term; break;
      case 722: e01 = new ART_C_e0(); e01.term = term; break;
      case 727: e01 = new ART_C_e0(); e01.term = term; break;
      case 740: e01 = new ART_C_e0(); e01.term = term; break;
      case 750: e01 = new ART_C_e0(); e01.term = term; break;
      case 752: e02 = new ART_C_e0(); e02.term = term; break;
      }
    }

    public AbstractAttributeBlock getAttributes(int nodeNumber) {
      switch(nodeNumber){
      case 566: return ID1;
      case 568: return e01;
      case 572: return ID1;
      case 574: return e01;
      case 578: return ID1;
      case 580: return e01;
      case 584: return ID1;
      case 586: return e01;
      case 590: return ID1;
      case 592: return e01;
      case 596: return ID1;
      case 598: return e01;
      case 603: return e01;
      case 605: return statements1;
      case 606: return elseOpt1;
      case 610: return e01;
      case 612: return statements1;
      case 618: return ID1;
      case 620: return e01;
      case 622: return e02;
      case 624: return statement1;
      case 626: return statements1;
      case 633: return e01;
      case 636: return cases1;
      case 643: return printElements1;
      case 649: return ID1;
      case 650: return statement1;
      case 654: return ID1;
      case 659: return statement1;
      case 665: return STRING_SQ1;
      case 672: return STRING_SQ1;
      case 674: return e01;
      case 681: return STRING_SQ1;
      case 683: return e01;
      case 685: return e02;
      case 692: return STRING_SQ1;
      case 694: return e01;
      case 696: return e02;
      case 698: return e03;
      case 708: return STRING_SQ1;
      case 717: return e01;
      case 722: return e01;
      case 727: return e01;
      case 740: return e01;
      case 750: return e01;
      case 752: return e02;
      default: Util.fatal("getAttributes: unknown node " + nodeNumber + ". Probable out-of-date ARTGeneratedActions - regenerate and recompile"); return null;
      }
    }

    public void action(int nodeNumber) {
      switch(nodeNumber){
      case 569: variables.put(ID1.v, e01.v);  break;
      case 575: variables.put(ID1.v, variables.get(ID1.v) + e01.v);  break;
      case 581: variables.put(ID1.v, variables.get(ID1.v) - e01.v);  break;
      case 587: variables.put(ID1.v, variables.get(ID1.v) * e01.v);  break;
      case 593: variables.put(ID1.v, variables.get(ID1.v) / e01.v);  break;
      case 599: variables.put(ID1.v, variables.get(ID1.v) % e01.v);  break;
      case 606: if (e01.v != 0) {interpret(statements1);} else{ interpret(elseOpt1);}  break;
      case 614: interpret(e01); 
  while (e01.v != 0) { 
    interpret(statements1); 
    interpret(e01); 
  }  break;
      case 628: for (variables.put(ID1.v, e01.v), interpret(e02); e02.v != 0; interpret(statement1)) { interpret(statements1); interpret(statement1); interpret(e02);}  break;
      case 638: switchVal = e01.v; interpret(cases1);  switchVal=0; CheckContinues=false; break;
      case 650: procedures.put(ID1.v, statement1);  break;
      case 655: interpret(procedures.get(ID1.v));  break;
      case 667: plugin(STRING_SQ1.v);  break;
      case 676: plugin(STRING_SQ1.v, e01.v);  break;
      case 687: plugin(STRING_SQ1.v, e01.v, e02.v);  break;
      case 700: plugin(STRING_SQ1.v, e01.v, e02.v, e03.v);  break;
      case 704: plugin("init");  break;
      case 709: plugin("load", STRING_SQ1.v);  break;
      case 713: plugin("invert");  break;
      case 718: plugin("brightness", e01.v);  break;
      case 723: plugin("contrast", e01.v);  break;
      case 728: plugin("rotate", e01.v);  break;
      case 732: plugin("grayscale");  break;
      case 736: plugin("sobel");  break;
      case 741: plugin("blur", e01.v);  break;
      case 745: plugin("summerVibe");  break;
      case 754: if (e01.v == e02.v) { 
       System.out.println("** Successful Test **");
       successCount++; 
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
      case 758: statement1 = new ART_C_statement(); statement1.term = term; break;
      case 759: statements1 = new ART_C_statements(); statements1.term = term; break;
      case 762: statement1 = new ART_C_statement(); statement1.term = term; break;
      }
    }

    public AbstractAttributeBlock getAttributes(int nodeNumber) {
      switch(nodeNumber){
      case 758: return statement1;
      case 759: return statements1;
      case 762: return statement1;
      default: Util.fatal("getAttributes: unknown node " + nodeNumber + ". Probable out-of-date ARTGeneratedActions - regenerate and recompile"); return null;
      }
    }

    public void action(int nodeNumber) {
      switch(nodeNumber){
      case 762: System.out.println("Final variable map " + variables);  break;
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
