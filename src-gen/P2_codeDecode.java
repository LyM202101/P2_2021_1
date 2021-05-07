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
  public static Object InputAlphabet=null;
  public static Object OutputAlphabet=null;
  public static void main(String[] args) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=9;
      java.util.Scanner sc=null;
      sc=$invokeConstructor(java.util.Scanner.class,new Object[]{$invokeField(System.class,"in",true,null)});
      $line=12;
      InputAlphabet=$fix($opIntvlY('a','z'));
      $line=13;
      OutputAlphabet=$fix($opIntvlY('a','z'));
      $line=17;
      Object coder=$fix(P2_codeDecode.createCoder());
      $line=18;
      Object deCoder=$fix(P2_codeDecode.createDecoder());
      $line=21;
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
      $line=25;
      java.util.Scanner sc=null;
      sc=$invokeConstructor(java.util.Scanner.class,new Object[]{$invokeField(System.class,"in",true,null)});
      $line=26;
      String currentInput=$cast(String.class,$fix(" "));
      $line=28;
      System.out.println($message(new Object[]{"------------------------------------------------------------- "}));
      $line=29;
      System.out.println($message(new Object[]{"Welcome to Proyect 2: Coder-Decoder! \n"}));
      $line=31;
      while (true) {
        if (!(!$opEqualY(currentInput,""))) break;
        $line=33;
        System.out.println($message(new Object[]{"------------------------------------------------------------- "}));
        $line=34;
        System.out.println($message(new Object[]{"Enter the string you want to use (empty stringto exit):"}));
        $line=36;
        if (!$opEqualY(currentInput,"")) {
          $line=38;
          currentInput=$cast(String.class,$fix(((java.util.Scanner)sc).nextLine()));
          $line=40;
          if (!$opEqualY(currentInput,"")) {
            $line=41;
            Object valid=$fix(false);
            $line=42;
            String option=$cast(String.class,$fix(""));
            $line=45;
            while (true) {
              if (!(!$bool(valid))) break;
              $line=46;
              System.out.println($message(new Object[]{"What do you want to do with this string?"}));
              $line=47;
              System.out.println($message(new Object[]{"1. code"}));
              $line=48;
              System.out.println($message(new Object[]{"2. decode"}));
              $line=49;
              System.out.println($message(new Object[]{"3. code and decode"}));
              $line=52;
              option=$cast(String.class,$fix(((java.util.Scanner)sc).nextLine()));
              $line=55;
              if ($opMembrY(option,GCollections.asSet("1","2","3"))) {
                $line=56;
                valid=$fix(true);
              }
              else {
                $line=58;
                System.out.println($message(new Object[]{"You didnt select a valid Option, try again. \n"}));
              }
            }
            $line=65;
            String codedString=$cast(String.class,$fix(""));
            $line=66;
            String deCodedString=$cast(String.class,$fix(""));
            $line=67;
            Boolean isAccepted=null;
            isAccepted=$defaultValue(Boolean.class);
            $line=69;
            String codedStrScript=$cast(String.class,$fix("The Coded string was: "));
            $line=70;
            String deCodedStrScript=$cast(String.class,$fix("The DeCoded string was: "));
            $line=75;
            if ($bool(((java.lang.String)option).equals("1"))) {
              $line=76;
              isAccepted=$cast(Boolean.class,$fix(((gold.structures.automaton.ITransducer)C).acceptsString($cast(java.lang.String.class,currentInput))));
              $line=77;
              codedString=$cast(String.class,$fix(((gold.structures.automaton.ITransducer)C).getOutputString()));
              $line=78;
              System.out.println($message(new Object[]{((java.lang.String)codedStrScript).concat($cast(java.lang.String.class,codedString))}));
            }
            else {
              $line=81;
              if ($bool(((java.lang.String)option).equals("2"))) {
                $line=82;
                isAccepted=$cast(Boolean.class,$fix(((gold.structures.automaton.ITransducer)D).acceptsString($cast(java.lang.String.class,currentInput))));
                $line=83;
                deCodedString=$cast(String.class,$fix(((gold.structures.automaton.ITransducer)D).getOutputString()));
                $line=84;
                System.out.println($message(new Object[]{((java.lang.String)deCodedStrScript).concat($cast(java.lang.String.class,deCodedString))}));
              }
              else {
                $line=89;
                isAccepted=$cast(Boolean.class,$fix(((gold.structures.automaton.ITransducer)C).acceptsString($cast(java.lang.String.class,currentInput))));
                $line=90;
                codedString=$cast(String.class,$fix(((gold.structures.automaton.ITransducer)C).getOutputString()));
                $line=91;
                System.out.println($message(new Object[]{((java.lang.String)codedStrScript).concat($cast(java.lang.String.class,codedString))}));
                $line=93;
                isAccepted=$cast(Boolean.class,$fix(((gold.structures.automaton.ITransducer)D).acceptsString($cast(java.lang.String.class,currentInput))));
                $line=94;
                deCodedString=$cast(String.class,$fix(((gold.structures.automaton.ITransducer)D).getOutputString()));
                $line=95;
                System.out.println($message(new Object[]{((java.lang.String)deCodedStrScript).concat($cast(java.lang.String.class,deCodedString))}));
                $line=97;
                String isEqual=$cast(String.class,$fix($opAdditY($opAdditY("The input string is ",(($bool(((java.lang.String)currentInput).equals(deCodedString)))?(""):("not "))),"equal to the decoded string")));
                $line=98;
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
      $line=115;
      Object q4_estados=$fix(GCollections.asSet("q4_a","q4_b","q4_c","q4_d","q4_e","q4_f","q4_g","q4_h","q4_i","q4_j","q4_k","q4_l","q4_m","q4_n","q4_o","q4_p","q4_q","q4_r","q4_s","q4_t","q4_u","q4_v","q4_w","q4_x","q4_y","q4_z"));
      $line=118;
      Object Q=$fix($opUnionY(GCollections.asSet("q0","q1","q2","q3","err"),q4_estados));
      $line=119;
      Object \u03A3=$fix($opIntvlY('a','z'));
      $line=120;
      Object \u0393=$fix($opIntvlY('a','z'));
      $line=121;
      Object q=$fix("q0");
      $line=122;
      Object F=$fix(Q);
      $line=125;
      $result=$invokeConstructor(GDeterministicTransducer.class,new Object[]{Q,\u03A3,\u0393,q,F,new GMethod(P2_codeDecode.class,"\u03B4Code"),new GMethod(P2_codeDecode.class,"gCode"),new GMethod(P2_codeDecode.class,"hCode")});
      if (true) break $try;
      $line=126;
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
      $line=133;
      Object eAlph=$fix($opIntvlY('a','z'));
      $line=139;
      if ($bool(($bool($opEqualY(q,"q0"))&&$bool($opMembrY(s,eAlph))))) {
        $line=140;
        $result="q1";
        if (true) break $try;
      }
      else {
        $line=146;
        if ($bool(($bool($opEqualY(q,"q1"))&&$bool($opMembrY(s,eAlph))))) {
          $line=147;
          $result="q2";
          if (true) break $try;
        }
        else {
          $line=153;
          if ($bool(($bool($opEqualY(q,"q2"))&&$bool($opMembrY(s,eAlph))))) {
            $line=154;
            $result="q3";
            if (true) break $try;
          }
          else {
            $line=160;
            if ($bool(($bool($opEqualY(q,"q3"))&&$bool($opMembrY(s,eAlph))))) {
              $line=161;
              String q4_nextLetterState=$cast(String.class,$fix($opAdditY("q4_",s)));
              $line=162;
              $result=q4_nextLetterState;
              if (true) break $try;
            }
            else {
              $line=168;
              if ($bool(($bool(((java.lang.String)q).startsWith($cast(java.lang.String.class,"q4_")))&&$opMembrY(s,eAlph)))) {
                $line=169;
                $result="q0";
                if (true) break $try;
              }
              else {
                $line=175;
                $result="err";
                if (true) break $try;
              }
            }
          }
        }
      }
      $line=179;
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
      $line=185;
      Object eAlph=$fix($opIntvlY('a','z'));
      $line=186;
      String alph_str=$cast(String.class,$fix("abcdefghijklmnopqrstuvwxyz"));
      $line=187;
      char[] alph=$cast(char[].class,$fix(((java.lang.String)alph_str).toCharArray()));
      $line=190;
      Character currChar=$cast(Character.class,$fix(s));
      $line=191;
      String currCharAsString=$cast(String.class,$fix(Character.toString($cast(char.class,s))));
      $line=194;
      String duplicateChar=$cast(String.class,$fix(((java.lang.String)currCharAsString).concat($cast(java.lang.String.class,currCharAsString))));
      $line=197;
      Integer index=$cast(Integer.class,$fix($invokeMethod("indexOf",alph_str,new Object[]{currChar})));
      $line=198;
      Character nextChar=$cast(Character.class,$fix(' '));
      $line=199;
      Character prevChar=$cast(Character.class,$fix(' '));
      $line=200;
      Integer lastPos=$cast(Integer.class,$fix($opSubtrY($invokeField("length",alph),1)));
      $line=206;
      if ($bool($opEqualY(index,0))) {
        $line=207;
        prevChar=$cast(Character.class,$fix(((char[])alph)[$int(lastPos)]));
        $line=208;
        nextChar=$cast(Character.class,$fix(((char[])alph)[$int($opAdditY(index,1))]));
      }
      else {
        $line=209;
        if ($bool($opEqualY(index,lastPos))) {
          $line=210;
          prevChar=$cast(Character.class,$fix(((char[])alph)[$int($opSubtrY(index,1))]));
          $line=211;
          nextChar=$cast(Character.class,$fix(((char[])alph)[$int(0)]));
        }
        else {
          $line=212;
          if ($bool(($bool(!$opEqualY(index,0))&&$bool(!$opEqualY(index,lastPos))))) {
            $line=213;
            prevChar=$cast(Character.class,$fix(((char[])alph)[$int($opSubtrY(index,1))]));
            $line=214;
            nextChar=$cast(Character.class,$fix(((char[])alph)[$int($opAdditY(index,1))]));
          }
        }
      }
      $line=223;
      if ($bool(($opEqualY(q,"q0")&&$opMembrY(s,eAlph)))) {
        $line=224;
        $result=nextChar;
        if (true) break $try;
      }
      else {
        $line=230;
        if ($bool(($opEqualY(q,"q1")&&$opMembrY(s,eAlph)))) {
          $line=231;
          $result=duplicateChar;
          if (true) break $try;
        }
        else {
          $line=237;
          if ($bool(($opEqualY(q,"q2")&&$opMembrY(s,eAlph)))) {
            $line=238;
            $result=prevChar;
            if (true) break $try;
          }
          else {
            $line=244;
            if ($bool(($opEqualY(q,"q3")&&$opMembrY(s,eAlph)))) {
              $line=245;
              $result=s;
              if (true) break $try;
            }
            else {
              $line=251;
              if ($bool(($bool(((java.lang.String)q).startsWith($cast(java.lang.String.class,"q4_")))&&$opMembrY(s,eAlph)))) {
                $line=253;
                for (Object $v1:GCollections.unmodifiableCollection(eAlph)) {
                  Object letter=$v1;
                  $line=254;
                  if ($bool(((java.lang.String)q).endsWith($cast(java.lang.String.class,letter)))) {
                    $line=255;
                    $result=((java.lang.String)currCharAsString).concat($cast(java.lang.String.class,Character.toString($cast(char.class,letter))));
                    if (true) break $try;
                  }
                }
              }
              else {
                $line=263;
                $result="";
                if (true) break $try;
              }
            }
          }
        }
      }
      $line=267;
      $rethrow(new RuntimeException("The function \"hCode(q:String,s:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,P2_codeDecode.class,"hCode",$line);
    }
    return $result;
  }
  public static Object gCode(Object q) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=271;
      $result="";
      if (true) break $try;
      $line=272;
      $rethrow(new RuntimeException("The function \"gCode(q:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,P2_codeDecode.class,"gCode",$line);
    }
    return $result;
  }
  public static ITransducer createDecoder() {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=280;
      Object Q=$fix(GCollections.asSet("d0","d1","d2","d3","d4","d5","d6","err"));
      $line=281;
      Object \u03A3=$fix($opIntvlY('a','z'));
      $line=282;
      Object \u0393=$fix($opIntvlY('a','z'));
      $line=283;
      Object q=$fix("d0");
      $line=284;
      Object F=$fix(Q);
      $line=286;
      $result=$invokeConstructor(GDeterministicTransducer.class,new Object[]{Q,\u03A3,\u0393,q,F,new GMethod(P2_codeDecode.class,"\u03B4Decode"),new GMethod(P2_codeDecode.class,"gDecode"),new GMethod(P2_codeDecode.class,"hDecode")});
      if (true) break $try;
      $line=287;
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
      $line=295;
      Object alphabet=$fix($opIntvlY('a','z'));
      $line=296;
      String stateId=$cast(String.class,$fix("d"));
      $line=299;
      if ($bool(($bool((!$bool(((java.lang.String)q).endsWith($cast(java.lang.String.class,6)))&&!$bool(((java.lang.String)q).endsWith($cast(java.lang.String.class,"r")))))&&$opMembrY(s,alphabet)))) {
        $line=300;
        Integer nextStateNumber=$cast(Integer.class,$fix($opAdditY(Integer.parseInt($cast(java.lang.String.class,$getArrayValue(q,new Object[]{1}))),1)));
        $line=301;
        $result=((java.lang.String)stateId).concat($cast(java.lang.String.class,Integer.toString($int(nextStateNumber))));
        if (true) break $try;
      }
      else {
        $line=304;
        if ($bool(($bool(((java.lang.String)q).endsWith($cast(java.lang.String.class,6)))&&$opMembrY(s,alphabet)))) {
          $line=305;
          $result=((java.lang.String)stateId).concat($cast(java.lang.String.class,"0"));
          if (true) break $try;
        }
        else {
          $line=309;
          $result="err";
          if (true) break $try;
        }
      }
      $line=311;
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
      $line=317;
      String alph_str=$cast(String.class,$fix("abcdefghijklmnopqrstuvwxyz"));
      $line=318;
      char[] alph=$cast(char[].class,$fix(((java.lang.String)alph_str).toCharArray()));
      $line=321;
      Integer index=$cast(Integer.class,$fix($invokeMethod("indexOf",alph_str,new Object[]{s})));
      $line=322;
      Character nextChar=$cast(Character.class,$fix(' '));
      $line=323;
      Character prevChar=$cast(Character.class,$fix(' '));
      $line=324;
      Integer lastPos=$cast(Integer.class,$fix($opSubtrY($invokeField("length",alph),1)));
      $line=327;
      if ($opEqualY(index,0)) {
        $line=328;
        prevChar=$cast(Character.class,$fix(((char[])alph)[$int(lastPos)]));
        $line=329;
        nextChar=$cast(Character.class,$fix(((char[])alph)[$int($opAdditY(index,1))]));
      }
      else {
        $line=330;
        if ($opEqualY(index,lastPos)) {
          $line=331;
          prevChar=$cast(Character.class,$fix(((char[])alph)[$int($opSubtrY(index,1))]));
          $line=332;
          nextChar=$cast(Character.class,$fix(((char[])alph)[$int(0)]));
        }
        else {
          $line=333;
          if (!$opEqualY(index,0)) {
            $line=334;
            prevChar=$cast(Character.class,$fix(((char[])alph)[$int($opSubtrY(index,1))]));
            $line=335;
            nextChar=$cast(Character.class,$fix(((char[])alph)[$int($opAdditY(index,1))]));
          }
        }
      }
      $line=340;
      if ($opEqualY(q,"d0")) {
        $line=341;
        $result=prevChar;
        if (true) break $try;
      }
      else {
        $line=342;
        if ($bool((($opEqualY(q,"d1")||$opEqualY(q,"d4"))||$opEqualY(q,"d5")))) {
          $line=343;
          $result=s;
          if (true) break $try;
        }
        else {
          $line=344;
          if ($opEqualY(q,"d3")) {
            $line=345;
            $result=nextChar;
            if (true) break $try;
          }
          else {
            $line=347;
            $result="";
            if (true) break $try;
          }
        }
      }
      $line=349;
      $rethrow(new RuntimeException("The function \"hDecode(q:Object,s:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,P2_codeDecode.class,"hDecode",$line);
    }
    return $result;
  }
  public static Object gDecode(Object q) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=355;
      $result="";
      if (true) break $try;
      $line=356;
      $rethrow(new RuntimeException("The function \"gDecode(q:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,P2_codeDecode.class,"gDecode",$line);
    }
    return $result;
  }
}
