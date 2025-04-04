import uk.ac.rhul.cs.csle.art.interpret.AbstractInterpreter;
import uk.ac.rhul.cs.csle.art.interpret.AbstractActions;
import uk.ac.rhul.cs.csle.art.interpret.AbstractAttributeBlock;
import uk.ac.rhul.cs.csle.art.util.Util;
 import java.util.Map; import java.util.HashMap; 
public class ARTGeneratedActions extends AbstractActions {
 Map<String, Object> variables = new HashMap<>(); 
   Map<String, AbstractAttributeBlock> procedures = new HashMap<>(); 
   int successCount = 0; 
   int failCount = 0;
   int switchVal;
   boolean CheckContinues = false;

Object arithmeticOp(Object a, Object b, String op) {
    if (a instanceof Integer && b instanceof Integer) {
        int ia = (Integer) a;
        int ib = (Integer) b;
        switch (op) {
            case "+": return ia + ib;
            case "-": return ia - ib;
            case "*": return ia * ib;
            case "/": return ia / ib;
            case "%": return ia % ib;
        }
    } else if (a instanceof Double || b instanceof Double) {
        double da = (a instanceof Double) ? (Double) a : (Integer) a;
        double db = (b instanceof Double) ? (Double) b : (Integer) b;
        switch (op) {
            case "+": return da + db;
            case "-": return da - db;
            case "*": return da * db;
            case "/": return da / db;
            case "%": return da % db;
        }
    }
    return 0; // Default for unsupported types
}

boolean toBoolean(Object o) {
    if (o instanceof Boolean) {
        return (Boolean) o;
    } else if (o instanceof Number) {
        return ((Number) o).doubleValue() != 0;
    }
    return false; // Default
}

boolean compare(Object a, Object b, String op) {
    if (a instanceof Integer && b instanceof Integer) {
        int ia = (Integer) a;
        int ib = (Integer) b;
        switch (op) {
            case ">": return ia > ib;
            case "<": return ia < ib;
            case ">=": return ia >= ib;
            case "<=": return ia <= ib;
            case "==": return ia == ib;
            case "!=": return ia != ib;
        }
    } else if (a instanceof Double || b instanceof Double) {
        double da = (a instanceof Double) ? (Double) a : (Integer) a;
        double db = (b instanceof Double) ? (Double) b : (Integer) b;
        switch (op) {
            case ">": return da > db;
            case "<": return da < db;
            case ">=": return da >= db;
            case "<=": return da <= db;
            case "==": return da == db;
            case "!=": return da != db;
        }
    } else if (a instanceof Boolean && b instanceof Boolean) {
        boolean ba = (Boolean) a;
        boolean bb = (Boolean) b;
        switch (op) {
            case "==": return ba == bb;
            case "!=": return ba != bb;
        }
    }
    return false; // Default
}

Object negate(Object o) {
    if (o instanceof Integer) {
        return -(Integer) o;
    } else if (o instanceof Double) {
        return -(Double) o;
    }
    return 0; // Default
}

boolean logicalNot(Object o) {
    if (o instanceof Boolean) {
        return !(Boolean) o;
    } else if (o instanceof Number) {
        return ((Number) o).doubleValue() == 0;
    }
    return true; // Default
}

Object increment(Object o) {
    if (o instanceof Integer) {
        return (Integer) o + 1;
    } else if (o instanceof Double) {
        return (Double) o + 1.0;
    }
    return o; // No change for other types
}

Object decrement(Object o) {
    if (o instanceof Integer) {
        return (Integer) o - 1;
    } else if (o instanceof Double) {
        return (Double) o - 1.0;
    }
    return o; // No change for other types
}

double toDouble(Object o) {
    if (o instanceof Double) {
        return (Double) o;
    } else if (o instanceof Integer) {
        return (Integer) o;
    }
    return 0.0; // Default
}

int toInt(Object o) {
    if (o instanceof Integer) {
        return (Integer) o;
    }
    return 0; // Default
}

  public String name() { return "2025-04-03 03:04:38"; }

  public class ART_C_BOOLEAN extends AbstractAttributeBlock {
    ART_C_BOOLEAN BOOLEAN = this; Object v;

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
      case 271: { BOOLEAN.v = true; }  break;
      case 274: { BOOLEAN.v = false; }  break;
      }
    }
  }

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
      case 278: { ID.v = lexeme(); }  break;
      }
    }
  }

  public class ART_C_INTEGER extends AbstractAttributeBlock {
    ART_C_INTEGER INTEGER = this; Object v;

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
      case 282: { INTEGER.v = Integer.parseInt(lexeme()); }  break;
      }
    }
  }

  public class ART_C_REAL extends AbstractAttributeBlock {
    ART_C_REAL REAL = this; Object v;

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
      case 286: { REAL.v = Double.parseDouble(lexeme()); }  break;
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
      case 290: { STRING_SQ.v = lexemeCore().translateEscapes(); }  break;
      }
    }
  }

  public class ART_C_cases extends AbstractAttributeBlock {
    ART_C_cases cases = this; ART_C_cases cases1; ART_C_statements statements1; ART_C_e0 e01;

    public void initRHSAttributeBlock(int nodeNumber, int term) {
      switch(nodeNumber){
      case 296: statements1 = new ART_C_statements(); statements1.term = term; break;
      case 304: statements1 = new ART_C_statements(); statements1.term = term; break;
      case 309: statements1 = new ART_C_statements(); statements1.term = term; break;
      case 313: e01 = new ART_C_e0(); e01.term = term; break;
      case 315: statements1 = new ART_C_statements(); statements1.term = term; break;
      case 318: cases1 = new ART_C_cases(); cases1.term = term; break;
      case 322: e01 = new ART_C_e0(); e01.term = term; break;
      case 325: statements1 = new ART_C_statements(); statements1.term = term; break;
      case 326: cases1 = new ART_C_cases(); cases1.term = term; break;
      case 330: e01 = new ART_C_e0(); e01.term = term; break;
      case 332: statements1 = new ART_C_statements(); statements1.term = term; break;
      case 333: cases1 = new ART_C_cases(); cases1.term = term; break;
      case 337: e01 = new ART_C_e0(); e01.term = term; break;
      case 339: statements1 = new ART_C_statements(); statements1.term = term; break;
      case 345: e01 = new ART_C_e0(); e01.term = term; break;
      case 348: statements1 = new ART_C_statements(); statements1.term = term; break;
      case 352: e01 = new ART_C_e0(); e01.term = term; break;
      case 354: statements1 = new ART_C_statements(); statements1.term = term; break;
      }
    }

    public AbstractAttributeBlock getAttributes(int nodeNumber) {
      switch(nodeNumber){
      case 296: return statements1;
      case 304: return statements1;
      case 309: return statements1;
      case 313: return e01;
      case 315: return statements1;
      case 318: return cases1;
      case 322: return e01;
      case 325: return statements1;
      case 326: return cases1;
      case 330: return e01;
      case 332: return statements1;
      case 333: return cases1;
      case 337: return e01;
      case 339: return statements1;
      case 345: return e01;
      case 348: return statements1;
      case 352: return e01;
      case 354: return statements1;
      default: Util.fatal("getAttributes: unknown node " + nodeNumber + ". Probable out-of-date ARTGeneratedActions - regenerate and recompile"); return null;
      }
    }

    public void action(int nodeNumber) {
      switch(nodeNumber){
      case 298: { interpret(statements1); }  break;
      case 304: { interpret(statements1); }  break;
      case 309: { interpret(statements1); }  break;
      case 318: { int caseVal = toInt(e01.v);
       if (switchVal == caseVal && !CheckContinues) { 
         interpret(statements1); 
       } else if (switchVal == caseVal && CheckContinues) { 
         interpret(statements1); 
         CheckContinues = false; 
       } else { 
         interpret(cases1); 
       }
     }  break;
      case 326: { int caseVal = toInt(e01.v);
       if (switchVal == caseVal && !CheckContinues) { 
         interpret(statements1); 
       } else if (switchVal == caseVal && CheckContinues) { 
         interpret(statements1); 
         CheckContinues = false; 
       } else { 
         interpret(cases1); 
       }
     }  break;
      case 333: { int caseVal = toInt(e01.v);
       if (switchVal == caseVal) { 
         interpret(statements1); 
         CheckContinues = true; 
         interpret(cases1); 
       } else { 
         interpret(cases1); 
       }
     }  break;
      case 341: { int caseVal = toInt(e01.v);
       if (switchVal == caseVal || CheckContinues) { 
         interpret(statements1); 
       }
     }  break;
      case 348: { int caseVal = toInt(e01.v);
       if (switchVal == caseVal || CheckContinues) { 
         interpret(statements1); 
       }
     }  break;
      case 354: { int caseVal = toInt(e01.v);
       if (switchVal == caseVal || CheckContinues) { 
         interpret(statements1); 
       }
     }  break;
      }
    }
  }

  public class ART_C_e0 extends AbstractAttributeBlock {
    ART_C_e0 e0 = this; Object v; ART_C_e0 e01; ART_C_e0 e02; ART_C_e1 e11; ART_C_e1 e12;

    public void initRHSAttributeBlock(int nodeNumber, int term) {
      switch(nodeNumber){
      case 358: e11 = new ART_C_e1(); e11.term = term; break;
      case 361: e11 = new ART_C_e1(); e11.term = term; break;
      case 363: e12 = new ART_C_e1(); e12.term = term; break;
      case 366: e11 = new ART_C_e1(); e11.term = term; break;
      case 368: e12 = new ART_C_e1(); e12.term = term; break;
      case 371: e11 = new ART_C_e1(); e11.term = term; break;
      case 373: e12 = new ART_C_e1(); e12.term = term; break;
      case 376: e11 = new ART_C_e1(); e11.term = term; break;
      case 378: e12 = new ART_C_e1(); e12.term = term; break;
      case 381: e11 = new ART_C_e1(); e11.term = term; break;
      case 383: e12 = new ART_C_e1(); e12.term = term; break;
      case 386: e11 = new ART_C_e1(); e11.term = term; break;
      case 388: e12 = new ART_C_e1(); e12.term = term; break;
      case 391: e01 = new ART_C_e0(); e01.term = term; break;
      case 393: e02 = new ART_C_e0(); e02.term = term; break;
      case 396: e01 = new ART_C_e0(); e01.term = term; break;
      case 398: e02 = new ART_C_e0(); e02.term = term; break;
      case 401: e01 = new ART_C_e0(); e01.term = term; break;
      case 403: e02 = new ART_C_e0(); e02.term = term; break;
      case 406: e01 = new ART_C_e0(); e01.term = term; break;
      case 408: e02 = new ART_C_e0(); e02.term = term; break;
      case 411: e01 = new ART_C_e0(); e01.term = term; break;
      case 413: e02 = new ART_C_e0(); e02.term = term; break;
      }
    }

    public AbstractAttributeBlock getAttributes(int nodeNumber) {
      switch(nodeNumber){
      case 358: return e11;
      case 361: return e11;
      case 363: return e12;
      case 366: return e11;
      case 368: return e12;
      case 371: return e11;
      case 373: return e12;
      case 376: return e11;
      case 378: return e12;
      case 381: return e11;
      case 383: return e12;
      case 386: return e11;
      case 388: return e12;
      case 391: return e01;
      case 393: return e02;
      case 396: return e01;
      case 398: return e02;
      case 401: return e01;
      case 403: return e02;
      case 406: return e01;
      case 408: return e02;
      case 411: return e01;
      case 413: return e02;
      default: Util.fatal("getAttributes: unknown node " + nodeNumber + ". Probable out-of-date ARTGeneratedActions - regenerate and recompile"); return null;
      }
    }

    public void action(int nodeNumber) {
      switch(nodeNumber){
      case 358: { e0.v = e11.v; }  break;
      case 363: { e0.v = compare(e11.v, e12.v, ">"); }  break;
      case 368: { e0.v = compare(e11.v, e12.v, "<"); }  break;
      case 373: { e0.v = compare(e11.v, e12.v, ">="); }  break;
      case 378: { e0.v = compare(e11.v, e12.v, "<="); }  break;
      case 383: { e0.v = compare(e11.v, e12.v, "=="); }  break;
      case 388: { e0.v = compare(e11.v, e12.v, "!="); }  break;
      case 393: { e0.v = toBoolean(e01.v) && toBoolean(e02.v); }  break;
      case 398: { e0.v = toBoolean(e01.v) || toBoolean(e02.v); }  break;
      case 403: { e0.v = toBoolean(e01.v) && toBoolean(e02.v); }  break;
      case 408: { e0.v = toBoolean(e01.v) || toBoolean(e02.v); }  break;
      case 413: { e0.v = toBoolean(e01.v) ^ toBoolean(e02.v); }  break;
      }
    }
  }

  public class ART_C_e1 extends AbstractAttributeBlock {
    ART_C_e1 e1 = this; Object v; ART_C_e1 e11; ART_C_e2 e21;

    public void initRHSAttributeBlock(int nodeNumber, int term) {
      switch(nodeNumber){
      case 417: e21 = new ART_C_e2(); e21.term = term; break;
      case 420: e11 = new ART_C_e1(); e11.term = term; break;
      case 422: e21 = new ART_C_e2(); e21.term = term; break;
      case 425: e11 = new ART_C_e1(); e11.term = term; break;
      case 427: e21 = new ART_C_e2(); e21.term = term; break;
      }
    }

    public AbstractAttributeBlock getAttributes(int nodeNumber) {
      switch(nodeNumber){
      case 417: return e21;
      case 420: return e11;
      case 422: return e21;
      case 425: return e11;
      case 427: return e21;
      default: Util.fatal("getAttributes: unknown node " + nodeNumber + ". Probable out-of-date ARTGeneratedActions - regenerate and recompile"); return null;
      }
    }

    public void action(int nodeNumber) {
      switch(nodeNumber){
      case 417: { e1.v = e21.v; }  break;
      case 422: { e1.v = arithmeticOp(e11.v, e21.v, "+"); }  break;
      case 427: { e1.v = arithmeticOp(e11.v, e21.v, "-"); }  break;
      }
    }
  }

  public class ART_C_e2 extends AbstractAttributeBlock {
    ART_C_e2 e2 = this; Object v; ART_C_e2 e21; ART_C_e3 e31;

    public void initRHSAttributeBlock(int nodeNumber, int term) {
      switch(nodeNumber){
      case 431: e31 = new ART_C_e3(); e31.term = term; break;
      case 434: e21 = new ART_C_e2(); e21.term = term; break;
      case 436: e31 = new ART_C_e3(); e31.term = term; break;
      case 439: e21 = new ART_C_e2(); e21.term = term; break;
      case 441: e31 = new ART_C_e3(); e31.term = term; break;
      case 444: e21 = new ART_C_e2(); e21.term = term; break;
      case 446: e31 = new ART_C_e3(); e31.term = term; break;
      }
    }

    public AbstractAttributeBlock getAttributes(int nodeNumber) {
      switch(nodeNumber){
      case 431: return e31;
      case 434: return e21;
      case 436: return e31;
      case 439: return e21;
      case 441: return e31;
      case 444: return e21;
      case 446: return e31;
      default: Util.fatal("getAttributes: unknown node " + nodeNumber + ". Probable out-of-date ARTGeneratedActions - regenerate and recompile"); return null;
      }
    }

    public void action(int nodeNumber) {
      switch(nodeNumber){
      case 431: { e2.v = e31.v; }  break;
      case 436: { e2.v = arithmeticOp(e21.v, e31.v, "*"); }  break;
      case 441: { e2.v = arithmeticOp(e21.v, e31.v, "/"); }  break;
      case 446: { e2.v = arithmeticOp(e21.v, e31.v, "%"); }  break;
      }
    }
  }

  public class ART_C_e3 extends AbstractAttributeBlock {
    ART_C_e3 e3 = this; Object v; ART_C_e3 e31; ART_C_e4 e41;

    public void initRHSAttributeBlock(int nodeNumber, int term) {
      switch(nodeNumber){
      case 450: e41 = new ART_C_e4(); e41.term = term; break;
      case 454: e31 = new ART_C_e3(); e31.term = term; break;
      case 458: e31 = new ART_C_e3(); e31.term = term; break;
      case 462: e31 = new ART_C_e3(); e31.term = term; break;
      }
    }

    public AbstractAttributeBlock getAttributes(int nodeNumber) {
      switch(nodeNumber){
      case 450: return e41;
      case 454: return e31;
      case 458: return e31;
      case 462: return e31;
      default: Util.fatal("getAttributes: unknown node " + nodeNumber + ". Probable out-of-date ARTGeneratedActions - regenerate and recompile"); return null;
      }
    }

    public void action(int nodeNumber) {
      switch(nodeNumber){
      case 450: { e3.v = e41.v; }  break;
      case 454: { e3.v = e31.v; }  break;
      case 458: { e3.v = negate(e31.v); }  break;
      case 462: { e3.v = logicalNot(e31.v); }  break;
      }
    }
  }

  public class ART_C_e4 extends AbstractAttributeBlock {
    ART_C_e4 e4 = this; Object v; ART_C_e5 e51; ART_C_e4 e41;

    public void initRHSAttributeBlock(int nodeNumber, int term) {
      switch(nodeNumber){
      case 466: e51 = new ART_C_e5(); e51.term = term; break;
      case 469: e51 = new ART_C_e5(); e51.term = term; break;
      case 471: e41 = new ART_C_e4(); e41.term = term; break;
      }
    }

    public AbstractAttributeBlock getAttributes(int nodeNumber) {
      switch(nodeNumber){
      case 466: return e51;
      case 469: return e51;
      case 471: return e41;
      default: Util.fatal("getAttributes: unknown node " + nodeNumber + ". Probable out-of-date ARTGeneratedActions - regenerate and recompile"); return null;
      }
    }

    public void action(int nodeNumber) {
      switch(nodeNumber){
      case 466: { e4.v = e51.v; }  break;
      case 471: { 
    double v1 = toDouble(e51.v);
    double v2 = toDouble(e41.v);
    e4.v = Math.pow(v1, v2);
  }  break;
      }
    }
  }

  public class ART_C_e5 extends AbstractAttributeBlock {
    ART_C_e5 e5 = this; Object v; ART_C_e6 e61; ART_C_ID ID1;

    public void initRHSAttributeBlock(int nodeNumber, int term) {
      switch(nodeNumber){
      case 475: e61 = new ART_C_e6(); e61.term = term; break;
      case 478: ID1 = new ART_C_ID(); ID1.term = term; break;
      case 482: ID1 = new ART_C_ID(); ID1.term = term; break;
      }
    }

    public AbstractAttributeBlock getAttributes(int nodeNumber) {
      switch(nodeNumber){
      case 475: return e61;
      case 478: return ID1;
      case 482: return ID1;
      default: Util.fatal("getAttributes: unknown node " + nodeNumber + ". Probable out-of-date ARTGeneratedActions - regenerate and recompile"); return null;
      }
    }

    public void action(int nodeNumber) {
      switch(nodeNumber){
      case 475: { e5.v = e61.v; }  break;
      case 479: { 
    Object v = variables.getOrDefault(ID1.v, 0);
    e5.v = v;
    variables.put(ID1.v, increment(v));
  }  break;
      case 483: { 
    Object v = variables.getOrDefault(ID1.v, 0);
    e5.v = v;
    variables.put(ID1.v, decrement(v));
  }  break;
      }
    }
  }

  public class ART_C_e6 extends AbstractAttributeBlock {
    ART_C_e6 e6 = this; Object v; ART_C_e7 e71; ART_C_ID ID1;

    public void initRHSAttributeBlock(int nodeNumber, int term) {
      switch(nodeNumber){
      case 487: e71 = new ART_C_e7(); e71.term = term; break;
      case 491: ID1 = new ART_C_ID(); ID1.term = term; break;
      case 495: ID1 = new ART_C_ID(); ID1.term = term; break;
      }
    }

    public AbstractAttributeBlock getAttributes(int nodeNumber) {
      switch(nodeNumber){
      case 487: return e71;
      case 491: return ID1;
      case 495: return ID1;
      default: Util.fatal("getAttributes: unknown node " + nodeNumber + ". Probable out-of-date ARTGeneratedActions - regenerate and recompile"); return null;
      }
    }

    public void action(int nodeNumber) {
      switch(nodeNumber){
      case 487: { e6.v = e71.v; }  break;
      case 491: { 
    Object v = variables.getOrDefault(ID1.v, 0);
    Object newV = increment(v);
    variables.put(ID1.v, newV);
    e6.v = newV;
  }  break;
      case 495: { 
    Object v = variables.getOrDefault(ID1.v, 0);
    Object newV = decrement(v);
    variables.put(ID1.v, newV);
    e6.v = newV;
  }  break;
      }
    }
  }

  public class ART_C_e7 extends AbstractAttributeBlock {
    ART_C_e7 e7 = this; Object v; ART_C_REAL REAL1; ART_C_ID ID1; ART_C_e0 e01; ART_C_e1 e11; ART_C_STRING_SQ STRING_SQ1; ART_C_BOOLEAN BOOLEAN1; ART_C_INTEGER INTEGER1;

    public void initRHSAttributeBlock(int nodeNumber, int term) {
      switch(nodeNumber){
      case 499: INTEGER1 = new ART_C_INTEGER(); INTEGER1.term = term; break;
      case 502: REAL1 = new ART_C_REAL(); REAL1.term = term; break;
      case 505: BOOLEAN1 = new ART_C_BOOLEAN(); BOOLEAN1.term = term; break;
      case 508: ID1 = new ART_C_ID(); ID1.term = term; break;
      case 512: e11 = new ART_C_e1(); e11.term = term; break;
      case 518: e01 = new ART_C_e0(); e01.term = term; break;
      case 524: e01 = new ART_C_e0(); e01.term = term; break;
      case 530: e01 = new ART_C_e0(); e01.term = term; break;
      case 536: e01 = new ART_C_e0(); e01.term = term; break;
      case 547: STRING_SQ1 = new ART_C_STRING_SQ(); STRING_SQ1.term = term; break;
      case 549: e01 = new ART_C_e0(); e01.term = term; break;
      }
    }

    public AbstractAttributeBlock getAttributes(int nodeNumber) {
      switch(nodeNumber){
      case 499: return INTEGER1;
      case 502: return REAL1;
      case 505: return BOOLEAN1;
      case 508: return ID1;
      case 512: return e11;
      case 518: return e01;
      case 524: return e01;
      case 530: return e01;
      case 536: return e01;
      case 547: return STRING_SQ1;
      case 549: return e01;
      default: Util.fatal("getAttributes: unknown node " + nodeNumber + ". Probable out-of-date ARTGeneratedActions - regenerate and recompile"); return null;
      }
    }

    public void action(int nodeNumber) {
      switch(nodeNumber){
      case 499: { e7.v = INTEGER1.v; }  break;
      case 502: { e7.v = REAL1.v; }  break;
      case 505: { e7.v = BOOLEAN1.v; }  break;
      case 508: { e7.v = variables.getOrDefault(ID1.v, 0); }  break;
      case 513: { e7.v = e11.v; }  break;
      case 519: { e7.v = Math.sqrt(toDouble(e01.v)); }  break;
      case 525: { e7.v = Math.sin(toDouble(e01.v)); }  break;
      case 531: { e7.v = Math.cos(toDouble(e01.v)); }  break;
      case 537: { 
    if (e01.v instanceof Integer) {
      e7.v = Math.abs((Integer)e01.v);
    } else if (e01.v instanceof Double) {
      e7.v = Math.abs((Double)e01.v);
    }
  }  break;
      case 542: { 
    System.out.print("Input: "); 
    String input = System.console().readLine();
    try {
      e7.v = Integer.parseInt(input);
    } catch (NumberFormatException e) {
      try {
        e7.v = Double.parseDouble(input);
      } catch (NumberFormatException ex) {
        e7.v = input.equals("true") ? true : (input.equals("false") ? false : 0);
      }
    }
  }  break;
      case 550: { e7.v = plugin(STRING_SQ1.v, e01.v); }  break;
      }
    }
  }

  public class ART_C_elseOpt extends AbstractAttributeBlock {
    ART_C_elseOpt elseOpt = this; ART_C_statement statement1; ART_C_statements statements1; ART_C_e0 e01; ART_C_elseOpt elseOpt1;

    public void initRHSAttributeBlock(int nodeNumber, int term) {
      switch(nodeNumber){
      case 555: e01 = new ART_C_e0(); e01.term = term; break;
      case 557: statements1 = new ART_C_statements(); statements1.term = term; break;
      case 558: elseOpt1 = new ART_C_elseOpt(); elseOpt1.term = term; break;
      case 562: statement1 = new ART_C_statement(); statement1.term = term; break;
      }
    }

    public AbstractAttributeBlock getAttributes(int nodeNumber) {
      switch(nodeNumber){
      case 555: return e01;
      case 557: return statements1;
      case 558: return elseOpt1;
      case 562: return statement1;
      default: Util.fatal("getAttributes: unknown node " + nodeNumber + ". Probable out-of-date ARTGeneratedActions - regenerate and recompile"); return null;
      }
    }

    public void action(int nodeNumber) {
      switch(nodeNumber){
      case 558: { if (toBoolean(e01.v)) { 
         interpret(statements1); 
       } else { 
         interpret(elseOpt1); 
       }
     }  break;
      }
    }
  }

  public class ART_C_initAndTest extends AbstractAttributeBlock {
    ART_C_initAndTest initAndTest = this; ART_C_statements statements1;

    public void initRHSAttributeBlock(int nodeNumber, int term) {
      switch(nodeNumber){
      case 569: statements1 = new ART_C_statements(); statements1.term = term; break;
      }
    }

    public AbstractAttributeBlock getAttributes(int nodeNumber) {
      switch(nodeNumber){
      case 569: return statements1;
      default: Util.fatal("getAttributes: unknown node " + nodeNumber + ". Probable out-of-date ARTGeneratedActions - regenerate and recompile"); return null;
      }
    }

    public void action(int nodeNumber) {
      switch(nodeNumber){
      case 568: { variables.clear(); }  break;
      case 569: { System.out.println("Tests completed: " + successCount + " successes, " + failCount + " failures"); }  break;
      }
    }
  }

  public class ART_C_printElements extends AbstractAttributeBlock {
    ART_C_printElements printElements = this; ART_C_printElements printElements1; ART_C_e0 e01; ART_C_STRING_SQ STRING_SQ1;

    public void initRHSAttributeBlock(int nodeNumber, int term) {
      switch(nodeNumber){
      case 573: STRING_SQ1 = new ART_C_STRING_SQ(); STRING_SQ1.term = term; break;
      case 576: STRING_SQ1 = new ART_C_STRING_SQ(); STRING_SQ1.term = term; break;
      case 578: printElements1 = new ART_C_printElements(); printElements1.term = term; break;
      case 581: e01 = new ART_C_e0(); e01.term = term; break;
      case 584: e01 = new ART_C_e0(); e01.term = term; break;
      case 586: printElements1 = new ART_C_printElements(); printElements1.term = term; break;
      }
    }

    public AbstractAttributeBlock getAttributes(int nodeNumber) {
      switch(nodeNumber){
      case 573: return STRING_SQ1;
      case 576: return STRING_SQ1;
      case 578: return printElements1;
      case 581: return e01;
      case 584: return e01;
      case 586: return printElements1;
      default: Util.fatal("getAttributes: unknown node " + nodeNumber + ". Probable out-of-date ARTGeneratedActions - regenerate and recompile"); return null;
      }
    }

    public void action(int nodeNumber) {
      switch(nodeNumber){
      case 573: { System.out.print(STRING_SQ1.v); }  break;
      case 576: { System.out.print(STRING_SQ1.v); }  break;
      case 581: { System.out.print(e01.v); }  break;
      case 584: { System.out.print(e01.v); }  break;
      }
    }
  }

  public class ART_C_statement extends AbstractAttributeBlock {
    ART_C_statement statement = this; ART_C_cases cases1; ART_C_printElements printElements1; ART_C_statement statement1; ART_C_statements statements1; ART_C_statements statements2; ART_C_ID ID1; ART_C_e0 e01; ART_C_e0 e02; ART_C_e0 e03; ART_C_STRING_SQ STRING_SQ1; ART_C_elseOpt elseOpt1;

    public void initRHSAttributeBlock(int nodeNumber, int term) {
      switch(nodeNumber){
      case 590: ID1 = new ART_C_ID(); ID1.term = term; break;
      case 592: e01 = new ART_C_e0(); e01.term = term; break;
      case 596: ID1 = new ART_C_ID(); ID1.term = term; break;
      case 598: e01 = new ART_C_e0(); e01.term = term; break;
      case 602: ID1 = new ART_C_ID(); ID1.term = term; break;
      case 604: e01 = new ART_C_e0(); e01.term = term; break;
      case 608: ID1 = new ART_C_ID(); ID1.term = term; break;
      case 610: e01 = new ART_C_e0(); e01.term = term; break;
      case 614: ID1 = new ART_C_ID(); ID1.term = term; break;
      case 616: e01 = new ART_C_e0(); e01.term = term; break;
      case 620: ID1 = new ART_C_ID(); ID1.term = term; break;
      case 622: e01 = new ART_C_e0(); e01.term = term; break;
      case 628: statements1 = new ART_C_statements(); statements1.term = term; break;
      case 631: ID1 = new ART_C_ID(); ID1.term = term; break;
      case 633: statements2 = new ART_C_statements(); statements2.term = term; break;
      case 639: e01 = new ART_C_e0(); e01.term = term; break;
      case 641: statements1 = new ART_C_statements(); statements1.term = term; break;
      case 642: elseOpt1 = new ART_C_elseOpt(); elseOpt1.term = term; break;
      case 646: e01 = new ART_C_e0(); e01.term = term; break;
      case 648: statements1 = new ART_C_statements(); statements1.term = term; break;
      case 654: ID1 = new ART_C_ID(); ID1.term = term; break;
      case 656: e01 = new ART_C_e0(); e01.term = term; break;
      case 658: e02 = new ART_C_e0(); e02.term = term; break;
      case 660: statement1 = new ART_C_statement(); statement1.term = term; break;
      case 662: statements1 = new ART_C_statements(); statements1.term = term; break;
      case 669: e01 = new ART_C_e0(); e01.term = term; break;
      case 672: cases1 = new ART_C_cases(); cases1.term = term; break;
      case 678: statements1 = new ART_C_statements(); statements1.term = term; break;
      case 684: printElements1 = new ART_C_printElements(); printElements1.term = term; break;
      case 690: ID1 = new ART_C_ID(); ID1.term = term; break;
      case 691: statement1 = new ART_C_statement(); statement1.term = term; break;
      case 695: ID1 = new ART_C_ID(); ID1.term = term; break;
      case 701: STRING_SQ1 = new ART_C_STRING_SQ(); STRING_SQ1.term = term; break;
      case 708: STRING_SQ1 = new ART_C_STRING_SQ(); STRING_SQ1.term = term; break;
      case 710: e01 = new ART_C_e0(); e01.term = term; break;
      case 717: STRING_SQ1 = new ART_C_STRING_SQ(); STRING_SQ1.term = term; break;
      case 719: e01 = new ART_C_e0(); e01.term = term; break;
      case 721: e02 = new ART_C_e0(); e02.term = term; break;
      case 728: STRING_SQ1 = new ART_C_STRING_SQ(); STRING_SQ1.term = term; break;
      case 730: e01 = new ART_C_e0(); e01.term = term; break;
      case 732: e02 = new ART_C_e0(); e02.term = term; break;
      case 734: e03 = new ART_C_e0(); e03.term = term; break;
      case 744: STRING_SQ1 = new ART_C_STRING_SQ(); STRING_SQ1.term = term; break;
      case 753: e01 = new ART_C_e0(); e01.term = term; break;
      case 758: e01 = new ART_C_e0(); e01.term = term; break;
      case 763: e01 = new ART_C_e0(); e01.term = term; break;
      case 776: e01 = new ART_C_e0(); e01.term = term; break;
      case 786: e01 = new ART_C_e0(); e01.term = term; break;
      case 788: e02 = new ART_C_e0(); e02.term = term; break;
      }
    }

    public AbstractAttributeBlock getAttributes(int nodeNumber) {
      switch(nodeNumber){
      case 590: return ID1;
      case 592: return e01;
      case 596: return ID1;
      case 598: return e01;
      case 602: return ID1;
      case 604: return e01;
      case 608: return ID1;
      case 610: return e01;
      case 614: return ID1;
      case 616: return e01;
      case 620: return ID1;
      case 622: return e01;
      case 628: return statements1;
      case 631: return ID1;
      case 633: return statements2;
      case 639: return e01;
      case 641: return statements1;
      case 642: return elseOpt1;
      case 646: return e01;
      case 648: return statements1;
      case 654: return ID1;
      case 656: return e01;
      case 658: return e02;
      case 660: return statement1;
      case 662: return statements1;
      case 669: return e01;
      case 672: return cases1;
      case 678: return statements1;
      case 684: return printElements1;
      case 690: return ID1;
      case 691: return statement1;
      case 695: return ID1;
      case 701: return STRING_SQ1;
      case 708: return STRING_SQ1;
      case 710: return e01;
      case 717: return STRING_SQ1;
      case 719: return e01;
      case 721: return e02;
      case 728: return STRING_SQ1;
      case 730: return e01;
      case 732: return e02;
      case 734: return e03;
      case 744: return STRING_SQ1;
      case 753: return e01;
      case 758: return e01;
      case 763: return e01;
      case 776: return e01;
      case 786: return e01;
      case 788: return e02;
      default: Util.fatal("getAttributes: unknown node " + nodeNumber + ". Probable out-of-date ARTGeneratedActions - regenerate and recompile"); return null;
      }
    }

    public void action(int nodeNumber) {
      switch(nodeNumber){
      case 593: { variables.put(ID1.v, e01.v); }  break;
      case 599: { 
    Object v = variables.getOrDefault(ID1.v, 0);
    variables.put(ID1.v, arithmeticOp(v, e01.v, "+"));
  }  break;
      case 605: { 
    Object v = variables.getOrDefault(ID1.v, 0);
    variables.put(ID1.v, arithmeticOp(v, e01.v, "-"));
  }  break;
      case 611: { 
    Object v = variables.getOrDefault(ID1.v, 0);
    variables.put(ID1.v, arithmeticOp(v, e01.v, "*"));
  }  break;
      case 617: { 
    Object v = variables.getOrDefault(ID1.v, 0);
    variables.put(ID1.v, arithmeticOp(v, e01.v, "/"));
  }  break;
      case 623: { 
    Object v = variables.getOrDefault(ID1.v, 0);
    variables.put(ID1.v, arithmeticOp(v, e01.v, "%"));
  }  break;
      case 635: { try { interpret(statements1); } catch (Exception e) { System.out.print("Caught error successfully. \n"); variables.put(ID1.v, 1); interpret(statements2); } }  break;
      case 642: { if (toBoolean(e01.v)) { 
         interpret(statements1); 
       } else { 
         interpret(elseOpt1); 
       }
     }  break;
      case 650: { interpret(e01); 
       while (toBoolean(e01.v)) { 
         interpret(statements1); 
         interpret(e01); 
       }
     }  break;
      case 664: { for (variables.put(ID1.v, e01.v), interpret(e02); 
            toBoolean(e02.v); 
            interpret(statement1)) { 
         interpret(statements1); 
         interpret(statement1); 
         interpret(e02); 
       }
     }  break;
      case 674: { switchVal = toInt(e01.v); 
       interpret(cases1); 
       switchVal = 0; 
       CheckContinues = false; 
     }  break;
      case 691: { procedures.put(ID1.v, statement1); }  break;
      case 696: { interpret(procedures.get(ID1.v)); }  break;
      case 703: { plugin(STRING_SQ1.v); }  break;
      case 712: { plugin(STRING_SQ1.v, e01.v); }  break;
      case 723: { plugin(STRING_SQ1.v, e01.v, e02.v); }  break;
      case 736: { plugin(STRING_SQ1.v, e01.v, e02.v, e03.v); }  break;
      case 740: { plugin("init"); }  break;
      case 745: { plugin("load", STRING_SQ1.v); }  break;
      case 749: { plugin("invert"); }  break;
      case 754: { plugin("brightness", e01.v); }  break;
      case 759: { plugin("contrast", e01.v); }  break;
      case 764: { plugin("rotate", e01.v); }  break;
      case 768: { plugin("grayscale"); }  break;
      case 772: { plugin("sobel"); }  break;
      case 777: { plugin("blur", e01.v); }  break;
      case 781: { plugin("summerVibe"); }  break;
      case 790: { if (compare(e01.v, e02.v, "==")) { 
         successCount++; 
         System.out.println("** Successful Test **");
       } else { 
         System.out.println("** Failed Test **");
         failCount++; 
       }
     }  break;
      }
    }
  }

  public class ART_C_statements extends AbstractAttributeBlock {
    ART_C_statements statements = this; ART_C_statement statement1; ART_C_statements statements1;

    public void initRHSAttributeBlock(int nodeNumber, int term) {
      switch(nodeNumber){
      case 794: statement1 = new ART_C_statement(); statement1.term = term; break;
      case 795: statements1 = new ART_C_statements(); statements1.term = term; break;
      case 798: statement1 = new ART_C_statement(); statement1.term = term; break;
      }
    }

    public AbstractAttributeBlock getAttributes(int nodeNumber) {
      switch(nodeNumber){
      case 794: return statement1;
      case 795: return statements1;
      case 798: return statement1;
      default: Util.fatal("getAttributes: unknown node " + nodeNumber + ". Probable out-of-date ARTGeneratedActions - regenerate and recompile"); return null;
      }
    }

    public void action(int nodeNumber) {
      switch(nodeNumber){
      case 798: { System.out.println("Final variable map " + variables); }  break;
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
