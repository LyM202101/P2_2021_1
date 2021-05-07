// DO NOT EDIT THIS FILE! IT IS AUTOMATICALLY GENERATED FROM FILE "src/P2_codeDecode.gold"
import gold.*;
import gold.structures.*;
import gold.structures.automaton.*;
import gold.structures.bag.*;
import gold.structures.collection.*;
import gold.structures.deque.*;
import gold.structures.disjointset.*;
import gold.structures.graph.*;
import gold.structures.heap.*;
import gold.structures.list.*;
import gold.structures.map.*;
import gold.structures.multimap.*;
import gold.structures.point.*;
import gold.structures.queue.*;
import gold.structures.set.*;
import gold.structures.stack.*;
import gold.structures.tree.*;
import gold.structures.tree.binary.*;
import gold.structures.tree.nary.*;
import gold.structures.tuple.*;
import gold.structures.turingMachine.*;
import gold.swing.*;
import gold.swing.icon.*;
import gold.swing.icon.ajaxload.*;
import gold.swing.icon.famfamfam.*;
import gold.swing.icon.gold.*;
import gold.swing.icon.jlfgr.*;
import gold.swing.icon.wikimedia.*;
import gold.swing.icon.windows.*;
import gold.swing.look.*;
import gold.swing.util.*;
import gold.test.*;
import gold.test.automaton.*;
import gold.test.general.*;
import gold.test.graph.*;
import gold.util.*;
import gold.visualization.*;
import gold.visualization.automaton.*;
import gold.visualization.graph.*;
import gold.visualization.quadtree.*;
import gold.visualization.turingMachine.*;
import gold.visualization.util.*;
import java.lang.*;
import org.apfloat.*;
import static gold.util.GReflection.*;
@SuppressWarnings("all")
public final class P2_codeDecode {
  static {
    gold.swing.util.GUtilities.installGoldLookAndFeel();
  }
  public static Object Alphabet=null;
  public static String alph_str=null;
  static {
    int $line=0;
    $line=27;
    $try:try {
      alph_str=$defaultValue(String.class);
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,P2_codeDecode.class,null,$line);
    }
  }
  public static char[] alph=null;
  static {
    int $line=0;
    $line=28;
    $try:try {
      alph=$defaultValue(char[].class);
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,P2_codeDecode.class,null,$line);
    }
  }
  public static Integer lastPos=null;
  static {
    int $line=0;
    $line=29;
    $try:try {
      lastPos=$defaultValue(Integer.class);
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,P2_codeDecode.class,null,$line);
    }
  }
  public static void main(String[] args) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=35;
      java.util.Scanner sc=null;
      sc=$invokeConstructor(java.util.Scanner.class,new Object[]{$invokeField(System.class,"in",true,null)});
      $line=37;
      alph_str=$cast(String.class,$fix("abcdefghijklmnopqrstuvwxyz"));
      $line=38;
      alph=$cast(char[].class,$fix(((java.lang.String)alph_str).toCharArray()));
      $line=39;
      lastPos=$cast(Integer.class,$fix($opSubtrY($invokeField("length",alph),1)));
      $line=42;
      Alphabet=$fix($opIntvlY('a','z'));
      $line=45;
      Object coder=$fix(P2_codeDecode.createCoder());
      $line=46;
      Object deCoder=$fix(P2_codeDecode.createDecoder());
      $line=53;
      P2_codeDecode.consoleCodeDecode($cast(gold.structures.automaton.ITransducer.class,coder),$cast(gold.structures.automaton.ITransducer.class,deCoder));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,P2_codeDecode.class,"main",$line);
    }
  }
  public static Object consoleCodeDecode(ITransducer C, ITransducer D) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=62;
      java.util.Scanner sc=null;
      sc=$invokeConstructor(java.util.Scanner.class,new Object[]{$invokeField(System.class,"in",true,null)});
      $line=63;
      String currentInput=$cast(String.class,$fix(" "));
      $line=65;
      System.out.println($message(new Object[]{"------------------------------------------------------------- "}));
      $line=66;
      System.out.println($message(new Object[]{"Welcome to Proyect 2: Coder-Decoder! \n"}));
      $line=68;
      while (true) {
        if (!(!$opEqualY(currentInput,""))) break;
        $line=70;
        System.out.println($message(new Object[]{"------------------------------------------------------------- "}));
        $line=71;
        System.out.println($message(new Object[]{"Enter the string you want to use (empty stringto exit):"}));
        $line=73;
        if (!$opEqualY(currentInput,"")) {
          $line=75;
          currentInput=$cast(String.class,$fix(((java.util.Scanner)sc).nextLine()));
          $line=78;
          if (!$opEqualY(currentInput,"")) {
            $line=79;
            Object valid=$fix(false);
            $line=80;
            String option=$cast(String.class,$fix(""));
            $line=83;
            while (true) {
              if (!(!$bool(valid))) break;
              $line=84;
              System.out.println($message(new Object[]{""}));
              $line=85;
              System.out.println($message(new Object[]{"What do you want to do with this string?"}));
              $line=86;
              System.out.println($message(new Object[]{"1. code"}));
              $line=87;
              System.out.println($message(new Object[]{"2. decode"}));
              $line=88;
              System.out.println($message(new Object[]{"3. code and decode"}));
              $line=91;
              option=$cast(String.class,$fix(((java.util.Scanner)sc).nextLine()));
              $line=94;
              if ($opMembrY(option,GCollections.asSet("1","2","3"))) {
                $line=95;
                valid=$fix(true);
              }
              else {
                $line=97;
                System.out.println($message(new Object[]{"You didnt select a valid Option, try again. \n"}));
              }
            }
            $line=104;
            String codedString=$cast(String.class,$fix(""));
            $line=105;
            String deCodedString=$cast(String.class,$fix(""));
            $line=106;
            Boolean isAccepted=null;
            isAccepted=$defaultValue(Boolean.class);
            $line=108;
            String codedStrScript=$cast(String.class,$fix("The Coded string was: "));
            $line=109;
            String deCodedStrScript=$cast(String.class,$fix("The DeCoded string was: "));
            $line=112;
            if ($bool(((java.lang.String)option).equals("1"))) {
              $line=113;
              isAccepted=$cast(Boolean.class,$fix(((gold.structures.automaton.ITransducer)C).acceptsString($cast(java.lang.String.class,currentInput))));
              $line=114;
              codedString=$cast(String.class,$fix(((gold.structures.automaton.ITransducer)C).getOutputString()));
              $line=115;
              System.out.println($message(new Object[]{((java.lang.String)codedStrScript).concat($cast(java.lang.String.class,codedString))}));
            }
            else {
              $line=118;
              if ($bool(((java.lang.String)option).equals("2"))) {
                $line=119;
                isAccepted=$cast(Boolean.class,$fix(((gold.structures.automaton.ITransducer)D).acceptsString($cast(java.lang.String.class,currentInput))));
                $line=120;
                deCodedString=$cast(String.class,$fix(((gold.structures.automaton.ITransducer)D).getOutputString()));
                $line=121;
                System.out.println($message(new Object[]{((java.lang.String)deCodedStrScript).concat($cast(java.lang.String.class,deCodedString))}));
              }
              else {
                $line=126;
                isAccepted=$cast(Boolean.class,$fix(((gold.structures.automaton.ITransducer)C).acceptsString($cast(java.lang.String.class,currentInput))));
                $line=127;
                codedString=$cast(String.class,$fix(((gold.structures.automaton.ITransducer)C).getOutputString()));
                $line=128;
                System.out.println($message(new Object[]{((java.lang.String)codedStrScript).concat($cast(java.lang.String.class,codedString))}));
                $line=130;
                isAccepted=$cast(Boolean.class,$fix(((gold.structures.automaton.ITransducer)D).acceptsString($cast(java.lang.String.class,codedString))));
                $line=131;
                deCodedString=$cast(String.class,$fix(((gold.structures.automaton.ITransducer)D).getOutputString()));
                $line=132;
                System.out.println($message(new Object[]{((java.lang.String)deCodedStrScript).concat($cast(java.lang.String.class,deCodedString))}));
                $line=134;
                String isEqual=$cast(String.class,$fix($opAdditY($opAdditY("The input string is ",(($bool(((java.lang.String)currentInput).equals(deCodedString)))?(""):("not "))),"equal to the decoded string")));
                $line=135;
                System.out.println($message(new Object[]{$opAdditY("\n",isEqual)}));
              }
            }
          }
        }
      }
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,P2_codeDecode.class,"consoleCodeDecode",$line);
    }
    return $result;
  }
  public static ITransducer createCoder() {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=157;
      Object q4_estados=$fix(GCollections.asSet("q4_a","q4_b","q4_c","q4_d","q4_e","q4_f","q4_g","q4_h","q4_i","q4_j","q4_k","q4_l","q4_m","q4_n","q4_o","q4_p","q4_q","q4_r","q4_s","q4_t","q4_u","q4_v","q4_w","q4_x","q4_y","q4_z"));
      $line=160;
      Object Q=$fix($opUnionY(GCollections.asSet("q0","q1","q2","q3"),q4_estados));
      $line=161;
      Object \u03A3=$fix(Alphabet);
      $line=162;
      Object \u0393=$fix(Alphabet);
      $line=163;
      Object q=$fix("q0");
      $line=164;
      Object F=$fix(Q);
      $line=167;
      $result=$invokeConstructor(GDeterministicTransducer.class,new Object[]{Q,\u03A3,\u0393,q,F,new GMethod(P2_codeDecode.class,"\u03B4Code"),new GMethod(P2_codeDecode.class,"g"),new GMethod(P2_codeDecode.class,"hCode")});
      if (true) break $try;
      $line=168;
      $rethrow(new RuntimeException("The function \"createCoder()\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,P2_codeDecode.class,"createCoder",$line);
    }
    return $cast(ITransducer.class,$result);
  }
  public static Object \u03B4Code(String q, Object s) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=179;
      if ($opEqualY(q,"q0")) {
        $line=180;
        $result="q1";
        if (true) break $try;
      }
      else {
        $line=183;
        if ($opEqualY(q,"q1")) {
          $line=184;
          $result="q2";
          if (true) break $try;
        }
        else {
          $line=187;
          if ($opEqualY(q,"q2")) {
            $line=188;
            $result="q3";
            if (true) break $try;
          }
          else {
            $line=191;
            if ($opEqualY(q,"q3")) {
              $line=192;
              String q4_nextLetterState=$cast(String.class,$fix($opAdditY("q4_",s)));
              $line=193;
              $result=q4_nextLetterState;
              if (true) break $try;
            }
            else {
              $line=196;
              if ($bool(((java.lang.String)q).startsWith($cast(java.lang.String.class,"q4_")))) {
                $line=197;
                $result="q0";
                if (true) break $try;
              }
            }
          }
        }
      }
      $line=199;
      $rethrow(new RuntimeException("The function \"\u03B4Code(q:String,s:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,P2_codeDecode.class,"\u03B4Code",$line);
    }
    return $result;
  }
  public static Object hCode(String q, Object s) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=207;
      String currCharAsString=$cast(String.class,$fix(Character.toString($cast(char.class,s))));
      $line=208;
      String duplicateChar=$cast(String.class,$fix(((java.lang.String)currCharAsString).concat($cast(java.lang.String.class,Character.toString($cast(char.class,s))))));
      $line=209;
      Character prevChar=$cast(Character.class,$fix(P2_codeDecode.getPrevChar($cast(java.lang.Character.class,s))));
      $line=210;
      Character nextChar=$cast(Character.class,$fix(P2_codeDecode.getNextChar($cast(java.lang.Character.class,s))));
      $line=213;
      if ($bool($opEqualY(q,"q0"))) {
        $line=214;
        $result=nextChar;
        if (true) break $try;
      }
      else {
        $line=217;
        if ($bool($opEqualY(q,"q1"))) {
          $line=218;
          $result=duplicateChar;
          if (true) break $try;
        }
        else {
          $line=221;
          if ($bool($opEqualY(q,"q2"))) {
            $line=222;
            $result=prevChar;
            if (true) break $try;
          }
          else {
            $line=225;
            if ($bool($opEqualY(q,"q3"))) {
              $line=226;
              $result=s;
              if (true) break $try;
            }
            else {
              $line=229;
              if ($bool(((java.lang.String)q).startsWith($cast(java.lang.String.class,"q4_")))) {
                $line=231;
                for (Object $v1:GCollections.unmodifiableCollection(Alphabet)) {
                  Object letter=$v1;
                  $line=232;
                  if ($bool(((java.lang.String)q).endsWith($cast(java.lang.String.class,letter)))) {
                    $line=233;
                    $result=((java.lang.String)currCharAsString).concat($cast(java.lang.String.class,Character.toString($cast(char.class,letter))));
                    if (true) break $try;
                  }
                }
              }
              else {
                $line=239;
                $result="";
                if (true) break $try;
              }
            }
          }
        }
      }
      $line=241;
      $rethrow(new RuntimeException("The function \"hCode(q:String,s:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,P2_codeDecode.class,"hCode",$line);
    }
    return $result;
  }
  public static ITransducer createDecoder() {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=255;
      Object Q=$fix(GCollections.asSet("d0","d1","d2","d3","d4","d5","d6"));
      $line=256;
      Object \u03A3=$fix(Alphabet);
      $line=257;
      Object \u0393=$fix(Alphabet);
      $line=258;
      Object q=$fix("d0");
      $line=259;
      Object F=$fix(Q);
      $line=261;
      $result=$invokeConstructor(GDeterministicTransducer.class,new Object[]{Q,\u03A3,\u0393,q,F,new GMethod(P2_codeDecode.class,"\u03B4Decode"),new GMethod(P2_codeDecode.class,"g"),new GMethod(P2_codeDecode.class,"hDecode")});
      if (true) break $try;
      $line=262;
      $rethrow(new RuntimeException("The function \"createDecoder()\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,P2_codeDecode.class,"createDecoder",$line);
    }
    return $cast(ITransducer.class,$result);
  }
  public static Object \u03B4Decode(String q, Object s) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=270;
      String stateId=$cast(String.class,$fix("d"));
      $line=273;
      if ($bool((!$bool(((java.lang.String)q).endsWith($cast(java.lang.String.class,6)))&&!$bool(((java.lang.String)q).endsWith($cast(java.lang.String.class,"r")))))) {
        $line=274;
        Integer nextStateNumber=$cast(Integer.class,$fix($opAdditY(Integer.parseInt($cast(java.lang.String.class,$getArrayValue(q,new Object[]{1}))),1)));
        $line=275;
        $result=((java.lang.String)stateId).concat($cast(java.lang.String.class,Integer.toString($int(nextStateNumber))));
        if (true) break $try;
      }
      else {
        $line=278;
        if ($bool(((java.lang.String)q).endsWith($cast(java.lang.String.class,6)))) {
          $line=279;
          $result=((java.lang.String)stateId).concat($cast(java.lang.String.class,"0"));
          if (true) break $try;
        }
      }
      $line=281;
      $rethrow(new RuntimeException("The function \"\u03B4Decode(q:String,s:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,P2_codeDecode.class,"\u03B4Decode",$line);
    }
    return $result;
  }
  public static Object hDecode(Object q, Object s) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=290;
      Character prevChar=$cast(Character.class,$fix(P2_codeDecode.getPrevChar($cast(java.lang.Character.class,s))));
      $line=291;
      Character nextChar=$cast(Character.class,$fix(P2_codeDecode.getNextChar($cast(java.lang.Character.class,s))));
      $line=294;
      if ($opEqualY(q,"d0")) {
        $line=295;
        $result=prevChar;
        if (true) break $try;
      }
      else {
        $line=296;
        if ($bool((($opEqualY(q,"d1")||$opEqualY(q,"d4"))||$opEqualY(q,"d5")))) {
          $line=297;
          $result=s;
          if (true) break $try;
        }
        else {
          $line=298;
          if ($opEqualY(q,"d3")) {
            $line=299;
            $result=nextChar;
            if (true) break $try;
          }
          else {
            $line=301;
            $result="";
            if (true) break $try;
          }
        }
      }
      $line=303;
      $rethrow(new RuntimeException("The function \"hDecode(q:Object,s:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,P2_codeDecode.class,"hDecode",$line);
    }
    return $result;
  }
  public static Object getPrevChar(Character currentChar) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=314;
      Integer index=$cast(Integer.class,$fix($invokeMethod("indexOf",alph_str,new Object[]{currentChar})));
      $line=315;
      $result=(($bool($opEqualY(index,0)))?(((char[])alph)[$int(lastPos)]):(((char[])alph)[$int($opSubtrY(index,1))]));
      if (true) break $try;
      $line=316;
      $rethrow(new RuntimeException("The function \"getPrevChar(currentChar:Character)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,P2_codeDecode.class,"getPrevChar",$line);
    }
    return $result;
  }
  public static Object getNextChar(Character currentChar) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=323;
      Integer index=$cast(Integer.class,$fix($invokeMethod("indexOf",alph_str,new Object[]{currentChar})));
      $line=324;
      $result=(($bool($opEqualY(index,lastPos)))?(((char[])alph)[$int(0)]):(((char[])alph)[$int($opAdditY(index,1))]));
      if (true) break $try;
      $line=325;
      $rethrow(new RuntimeException("The function \"getNextChar(currentChar:Character)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,P2_codeDecode.class,"getNextChar",$line);
    }
    return $result;
  }
  public static Object g(Object q) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=332;
      $result="";
      if (true) break $try;
      $line=333;
      $rethrow(new RuntimeException("The function \"g(q:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,P2_codeDecode.class,"g",$line);
    }
    return $result;
  }
}
