// DO NOT EDIT THIS FILE! IT IS AUTOMATICALLY GENERATED FROM FILE "src/P2.gold"
import gold.structures.automaton.*;
import gold.util.*;
import gold.visualization.automaton.*;
import java.lang.*;
import org.apfloat.*;
import static gold.util.GReflection.*;
@SuppressWarnings("all")
public final class P2 {
  static {
    gold.swing.util.GUtilities.installGoldLookAndFeel();
  }
  public static void main(String[] args) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=19;
      Object q4_estados=$fix(GCollections.asSet("q4_a","q4_b","q4_c","q4_d","q4_e","q4_f","q4_g","q4_h","q4_i","q4_j","q4_k","q4_l","q4_m","q4_n","q4_o","q4_p","q4_q","q4_r","q4_s","q4_t","q4_u","q4_v","q4_w","q4_x","q4_y","q4_z"));
      $line=22;
      Object Q=$fix($opUnionY(GCollections.asSet("q0","q1","q2","q3"),q4_estados));
      $line=23;
      Object \u03A3=$fix($opIntvlY('a','z'));
      $line=24;
      Object \u0393=$fix($opIntvlY('a','z'));
      $line=25;
      Object q=$fix("q0");
      $line=26;
      Object F=$fix(Q);
      $line=29;
      Object M=$fix($invokeConstructor(GDeterministicTransducer.class,new Object[]{Q,\u03A3,\u0393,q,F,new GMethod(P2.class,"\u03B4"),new GMethod(P2.class,"g"),new GMethod(P2.class,"h")}));
      $line=32;
      GAutomataFrame.show($cast(gold.structures.automaton.IAutomaton.class,M));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,P2.class,"main",$line);
    }
  }
  public static Object \u03B4(Object q, Object s) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=41;
      Object alphabet=$fix(($opLesstY($invokeConstructor(Array.class,new Object[0]),$invokeConstructor(String.class,new Object[]{}))&&$opGreatY($invokeConstructor(String.class,new Object[]{}),null)));
      $line=68;
      $rethrow(new RuntimeException("The function \"\u03B4(q:Object,s:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,P2.class,"\u03B4",$line);
    }
    return $result;
  }
  public static Object h(Object q, Object s) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=99;
      $rethrow(new RuntimeException("The function \"h(q:Object,s:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,P2.class,"h",$line);
    }
    return $result;
  }
  public static Object g(Object q) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=106;
      $result="";
      if (true) break $try;
      $line=107;
      $rethrow(new RuntimeException("The function \"g(q:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,P2.class,"g",$line);
    }
    return $result;
  }
}
