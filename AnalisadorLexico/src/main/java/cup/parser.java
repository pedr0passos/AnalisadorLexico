package cup;

import java.util.*;

@SuppressWarnings({"rawtypes"})
public class parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  @Deprecated
  public parser() {super();}

  @Deprecated
  public parser(java_cup.runtime.Scanner s) {super(s);}

  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\144\000\002\002\004\000\002\032\005\000\002\032" +
    "\003\000\002\026\006\000\002\026\003\000\002\002\004" +
    "\000\002\002\004\000\002\002\004\000\002\002\004\000" +
    "\002\002\002\000\002\034\010\000\002\035\010\000\002" +
    "\036\003\000\002\036\005\000\002\036\005\000\002\036" +
    "\007\000\002\003\005\000\002\003\007\000\002\003\010" +
    "\000\002\003\006\000\002\003\006\000\002\033\003\000" +
    "\002\033\005\000\002\023\003\000\002\023\003\000\002" +
    "\023\003\000\002\023\003\000\002\004\003\000\002\004" +
    "\003\000\002\004\003\000\002\004\003\000\002\004\004" +
    "\000\002\004\004\000\002\004\003\000\002\024\003\000" +
    "\002\024\003\000\002\024\003\000\002\027\004\000\002" +
    "\027\003\000\002\025\003\000\002\025\003\000\002\025" +
    "\003\000\002\025\003\000\002\025\003\000\002\025\003" +
    "\000\002\005\006\000\002\006\004\000\002\006\005\000" +
    "\002\007\003\000\002\007\005\000\002\010\004\000\002" +
    "\011\006\000\002\012\004\000\002\012\002\000\002\013" +
    "\004\000\002\013\002\000\002\014\007\000\002\014\007" +
    "\000\002\014\006\000\002\014\004\000\002\014\006\000" +
    "\002\014\007\000\002\014\011\000\002\014\013\000\002" +
    "\014\007\000\002\014\004\000\002\014\005\000\002\014" +
    "\004\000\002\014\004\000\002\030\006\000\002\030\002" +
    "\000\002\031\005\000\002\031\002\000\002\015\005\000" +
    "\002\015\005\000\002\015\005\000\002\015\005\000\002" +
    "\015\005\000\002\015\005\000\002\015\005\000\002\015" +
    "\005\000\002\015\005\000\002\015\005\000\002\015\005" +
    "\000\002\015\005\000\002\015\004\000\002\015\004\000" +
    "\002\015\003\000\002\016\003\000\002\016\003\000\002" +
    "\016\005\000\002\016\003\000\002\016\003\000\002\016" +
    "\003\000\002\017\005\000\002\017\006\000\002\020\003" +
    "\000\002\020\005\000\002\021\006\000\002\022\003" });

  public short[][] production_table() {return _production_table;}

  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\314\000\046\002\ufff8\033\ufff8\034\ufff8\035\ufff8\036" +
    "\ufff8\037\ufff8\040\ufff8\041\ufff8\042\ufff8\043\ufff8\044\ufff8" +
    "\045\ufff8\046\ufff8\047\ufff8\050\ufff8\051\ufff8\070\010\071" +
    "\007\001\002\000\042\002\ufffd\033\035\034\027\035\017" +
    "\036\036\037\043\040\024\041\032\042\045\043\041\044" +
    "\025\045\040\046\023\047\020\050\037\051\022\001\002" +
    "\000\004\002\016\001\002\000\004\002\uffff\001\002\000" +
    "\004\073\013\001\002\000\004\075\011\001\002\000\046" +
    "\002\ufff8\033\ufff8\034\ufff8\035\ufff8\036\ufff8\037\ufff8\040" +
    "\ufff8\041\ufff8\042\ufff8\043\ufff8\044\ufff8\045\ufff8\046\ufff8" +
    "\047\ufff8\050\ufff8\051\ufff8\070\010\071\007\001\002\000" +
    "\004\002\000\001\002\000\004\074\014\001\002\000\044" +
    "\002\ufff8\033\ufff8\034\ufff8\035\ufff8\036\ufff8\037\ufff8\040" +
    "\ufff8\041\ufff8\042\ufff8\043\ufff8\044\ufff8\045\ufff8\046\ufff8" +
    "\047\ufff8\050\ufff8\051\ufff8\071\007\001\002\000\004\002" +
    "\ufffe\001\002\000\004\002\001\001\002\000\024\037\uffe8" +
    "\040\uffe8\041\uffe8\042\uffe8\043\uffe8\044\uffe8\045\uffe8\046" +
    "\uffe8\047\uffe8\001\002\000\004\073\uffdd\001\002\000\004" +
    "\073\uffdb\001\002\000\004\073\047\001\002\000\004\073" +
    "\uffde\001\002\000\004\073\uffe5\001\002\000\010\045\040" +
    "\046\023\047\020\001\002\000\004\073\uffe0\001\002\000" +
    "\024\037\uffe9\040\uffe9\041\uffe9\042\uffe9\043\uffe9\044\uffe9" +
    "\045\uffe9\046\uffe9\047\uffe9\001\002\000\024\037\043\040" +
    "\024\041\032\042\045\043\041\044\025\045\040\046\023" +
    "\047\020\001\002\000\042\002\ufffa\033\ufffa\034\ufffa\035" +
    "\ufffa\036\ufffa\037\ufffa\040\ufffa\041\ufffa\042\ufffa\043\ufffa" +
    "\044\ufffa\045\ufffa\046\ufffa\047\ufffa\050\ufffa\051\ufffa\001" +
    "\002\000\004\073\uffe4\001\002\000\004\073\047\001\002" +
    "\000\042\002\ufffc\033\ufffc\034\ufffc\035\ufffc\036\ufffc\037" +
    "\ufffc\040\ufffc\041\ufffc\042\ufffc\043\ufffc\044\ufffc\045\ufffc" +
    "\046\ufffc\047\ufffc\050\ufffc\051\ufffc\001\002\000\024\037" +
    "\uffea\040\uffea\041\uffea\042\uffea\043\uffea\044\uffea\045\uffea" +
    "\046\uffea\047\uffea\001\002\000\024\037\uffe7\040\uffe7\041" +
    "\uffe7\042\uffe7\043\uffe7\044\uffe7\045\uffe7\046\uffe7\047\uffe7" +
    "\001\002\000\004\073\047\001\002\000\004\073\uffdf\001" +
    "\002\000\010\045\040\046\023\047\020\001\002\000\042" +
    "\002\ufffb\033\ufffb\034\ufffb\035\ufffb\036\ufffb\037\ufffb\040" +
    "\ufffb\041\ufffb\042\ufffb\043\ufffb\044\ufffb\045\ufffb\046\ufffb" +
    "\047\ufffb\050\ufffb\051\ufffb\001\002\000\004\073\uffe6\001" +
    "\002\000\042\002\ufff9\033\ufff9\034\ufff9\035\ufff9\036\ufff9" +
    "\037\ufff9\040\ufff9\041\ufff9\042\ufff9\043\ufff9\044\ufff9\045" +
    "\ufff9\046\ufff9\047\ufff9\050\ufff9\051\ufff9\001\002\000\004" +
    "\073\uffe3\001\002\000\004\073\uffe2\001\002\000\070\004" +
    "\uff9e\005\uff9e\006\uff9e\007\uff9e\010\uff9e\011\uff9e\012\uff9e" +
    "\013\uff9e\014\uff9e\015\uff9e\016\uff9e\017\uff9e\020\uff9e\021" +
    "\uff9e\022\uff9e\023\uff9e\024\uff9e\025\uff9e\026\uff9e\027\uff9e" +
    "\062\uff9e\063\uff9e\064\uff9e\065\uff9e\066\uff9e\067\uff9e\073" +
    "\uff9e\001\002\000\006\066\051\073\047\001\002\000\004" +
    "\073\047\001\002\000\004\026\053\001\002\000\064\002" +
    "\uffed\033\uffed\034\uffed\035\uffed\036\uffed\037\uffed\040\uffed" +
    "\041\uffed\042\uffed\043\uffed\044\uffed\045\uffed\046\uffed\047" +
    "\uffed\050\uffed\051\uffed\052\uffed\054\uffed\055\uffed\056\uffed" +
    "\057\uffed\060\uffed\061\uffed\067\uffed\073\uffed\001\002\000" +
    "\004\067\064\001\002\000\010\020\056\027\057\067\ufff5" +
    "\001\002\000\004\046\061\001\002\000\004\073\047\001" +
    "\002\000\004\067\ufff3\001\002\000\006\027\062\067\ufff4" +
    "\001\002\000\004\073\047\001\002\000\004\067\ufff2\001" +
    "\002\000\004\026\065\001\002\000\042\002\ufff6\033\ufff6" +
    "\034\ufff6\035\ufff6\036\ufff6\037\ufff6\040\ufff6\041\ufff6\042" +
    "\ufff6\043\ufff6\044\ufff6\045\ufff6\046\ufff6\047\ufff6\050\ufff6" +
    "\051\ufff6\001\002\000\020\020\230\021\231\022\233\023" +
    "\227\024\232\025\234\026\304\001\002\000\026\020\uffec" +
    "\021\uffec\022\uffec\023\uffec\024\uffec\025\uffec\026\uffec\027" +
    "\072\062\073\064\071\001\002\000\004\066\112\001\002" +
    "\000\004\074\106\001\002\000\004\073\047\001\002\000" +
    "\026\037\043\040\024\041\032\042\045\043\041\044\025" +
    "\045\040\046\023\047\020\063\075\001\002\000\006\027" +
    "\102\063\101\001\002\000\004\066\uffd3\001\002\000\006" +
    "\027\uffd1\063\uffd1\001\002\000\004\073\047\001\002\000" +
    "\006\027\uffcf\063\uffcf\001\002\000\004\066\uffd2\001\002" +
    "\000\024\037\043\040\024\041\032\042\045\043\041\044" +
    "\025\045\040\046\023\047\020\001\002\000\006\027\uffd0" +
    "\063\uffd0\001\002\000\020\020\uffeb\021\uffeb\022\uffeb\023" +
    "\uffeb\024\uffeb\025\uffeb\026\uffeb\001\002\000\022\020\uffec" +
    "\021\uffec\022\uffec\023\uffec\024\uffec\025\uffec\026\uffec\027" +
    "\072\001\002\000\004\065\107\001\002\000\004\026\110" +
    "\001\002\000\064\002\uffef\033\uffef\034\uffef\035\uffef\036" +
    "\uffef\037\uffef\040\uffef\041\uffef\042\uffef\043\uffef\044\uffef" +
    "\045\uffef\046\uffef\047\uffef\050\uffef\051\uffef\052\uffef\054" +
    "\uffef\055\uffef\056\uffef\057\uffef\060\uffef\061\uffef\067\uffef" +
    "\073\uffef\001\002\000\042\002\uffd4\033\uffd4\034\uffd4\035" +
    "\uffd4\036\uffd4\037\uffd4\040\uffd4\041\uffd4\042\uffd4\043\uffd4" +
    "\044\uffd4\045\uffd4\046\uffd4\047\uffd4\050\uffd4\051\uffd4\001" +
    "\002\000\062\033\uffcc\034\uffcc\035\uffcc\036\uffcc\037\uffcc" +
    "\040\uffcc\041\uffcc\042\uffcc\043\uffcc\044\uffcc\045\uffcc\046" +
    "\uffcc\047\uffcc\050\uffcc\051\uffcc\052\uffcc\054\uffcc\055\uffcc" +
    "\056\uffcc\057\uffcc\060\uffcc\061\uffcc\067\uffcc\073\uffcc\001" +
    "\002\000\062\033\035\034\027\035\017\036\036\037\043" +
    "\040\024\041\032\042\045\043\041\044\025\045\040\046" +
    "\023\047\020\050\117\051\114\052\uffca\054\uffca\055\uffca" +
    "\056\uffca\057\uffca\060\uffca\061\uffca\067\uffca\073\uffca\001" +
    "\002\000\004\073\047\001\002\000\004\073\047\001\002" +
    "\000\062\033\uffcd\034\uffcd\035\uffcd\036\uffcd\037\uffcd\040" +
    "\uffcd\041\uffcd\042\uffcd\043\uffcd\044\uffcd\045\uffcd\046\uffcd" +
    "\047\uffcd\050\uffcd\051\uffcd\052\uffcd\054\uffcd\055\uffcd\056" +
    "\uffcd\057\uffcd\060\uffcd\061\uffcd\067\uffcd\073\uffcd\001\002" +
    "\000\004\073\047\001\002\000\024\052\132\054\124\055" +
    "\121\056\134\057\133\060\123\061\125\067\126\073\047" +
    "\001\002\000\004\062\273\001\002\000\024\020\230\021" +
    "\231\022\233\023\227\024\232\025\234\026\270\062\206" +
    "\064\205\001\002\000\004\062\263\001\002\000\004\062" +
    "\244\001\002\000\004\062\240\001\002\000\066\002\uffce" +
    "\033\uffce\034\uffce\035\uffce\036\uffce\037\uffce\040\uffce\041" +
    "\uffce\042\uffce\043\uffce\044\uffce\045\uffce\046\uffce\047\uffce" +
    "\050\uffce\051\uffce\052\uffce\053\uffce\054\uffce\055\uffce\056" +
    "\uffce\057\uffce\060\uffce\061\uffce\067\uffce\073\uffce\001\002" +
    "\000\024\052\uffcb\054\uffcb\055\uffcb\056\uffcb\057\uffcb\060" +
    "\uffcb\061\uffcb\067\uffcb\073\uffcb\001\002\000\016\020\230" +
    "\021\231\022\233\023\227\024\232\025\234\001\002\000" +
    "\004\026\226\001\002\000\004\062\220\001\002\000\020" +
    "\004\137\005\141\026\150\062\143\073\047\074\136\075" +
    "\142\001\002\000\004\026\135\001\002\000\024\052\uffc0" +
    "\054\uffc0\055\uffc0\056\uffc0\057\uffc0\060\uffc0\061\uffc0\067" +
    "\uffc0\073\uffc0\001\002\000\042\004\uffa9\005\uffa9\006\uffa9" +
    "\007\uffa9\010\uffa9\011\uffa9\012\uffa9\013\uffa9\014\uffa9\015" +
    "\uffa9\016\uffa9\017\uffa9\026\uffa9\027\uffa9\063\uffa9\065\uffa9" +
    "\001\002\000\012\062\143\073\047\074\136\075\142\001" +
    "\002\000\046\004\uffa4\005\uffa4\006\uffa4\007\uffa4\010\uffa4" +
    "\011\uffa4\012\uffa4\013\uffa4\014\uffa4\015\uffa4\016\uffa4\017" +
    "\uffa4\026\uffa4\027\uffa4\062\206\063\uffa4\064\205\065\uffa4" +
    "\001\002\000\012\062\143\073\047\074\136\075\142\001" +
    "\002\000\042\004\uffa8\005\uffa8\006\uffa8\007\uffa8\010\uffa8" +
    "\011\uffa8\012\uffa8\013\uffa8\014\uffa8\015\uffa8\016\uffa8\017" +
    "\uffa8\026\uffa8\027\uffa8\063\uffa8\065\uffa8\001\002\000\016" +
    "\004\137\005\141\062\143\073\047\074\136\075\142\001" +
    "\002\000\042\004\uffa5\005\uffa5\006\uffa5\007\uffa5\010\uffa5" +
    "\011\uffa5\012\uffa5\013\uffa5\014\uffa5\015\uffa5\016\uffa5\017" +
    "\uffa5\026\uffa5\027\uffa5\063\uffa5\065\uffa5\001\002\000\042" +
    "\004\uffa6\005\uffa6\006\uffa6\007\uffa6\010\uffa6\011\uffa6\012" +
    "\uffa6\013\uffa6\014\uffa6\015\uffa6\016\uffa6\017\uffa6\026\uffa6" +
    "\027\uffa6\063\uffa6\065\uffa6\001\002\000\042\004\uffaa\005" +
    "\uffaa\006\uffaa\007\uffaa\010\uffaa\011\uffaa\012\uffaa\013\uffaa" +
    "\014\uffaa\015\uffaa\016\uffaa\017\uffaa\026\uffaa\027\uffaa\063" +
    "\uffaa\065\uffaa\001\002\000\034\004\153\005\154\006\161" +
    "\007\162\010\151\011\165\012\160\013\164\014\156\015" +
    "\155\016\157\017\152\026\163\001\002\000\024\052\uffbe" +
    "\054\uffbe\055\uffbe\056\uffbe\057\uffbe\060\uffbe\061\uffbe\067" +
    "\uffbe\073\uffbe\001\002\000\016\004\137\005\141\062\143" +
    "\073\047\074\136\075\142\001\002\000\016\004\137\005" +
    "\141\062\143\073\047\074\136\075\142\001\002\000\016" +
    "\004\137\005\141\062\143\073\047\074\136\075\142\001" +
    "\002\000\016\004\137\005\141\062\143\073\047\074\136" +
    "\075\142\001\002\000\016\004\137\005\141\062\143\073" +
    "\047\074\136\075\142\001\002\000\016\004\137\005\141" +
    "\062\143\073\047\074\136\075\142\001\002\000\016\004" +
    "\137\005\141\062\143\073\047\074\136\075\142\001\002" +
    "\000\016\004\137\005\141\062\143\073\047\074\136\075" +
    "\142\001\002\000\016\004\137\005\141\062\143\073\047" +
    "\074\136\075\142\001\002\000\016\004\137\005\141\062" +
    "\143\073\047\074\136\075\142\001\002\000\024\052\uffbf" +
    "\054\uffbf\055\uffbf\056\uffbf\057\uffbf\060\uffbf\061\uffbf\067" +
    "\uffbf\073\uffbf\001\002\000\016\004\137\005\141\062\143" +
    "\073\047\074\136\075\142\001\002\000\016\004\137\005" +
    "\141\062\143\073\047\074\136\075\142\001\002\000\042" +
    "\004\uffb3\005\uffb3\006\uffb3\007\uffb3\010\uffb3\011\uffb3\012" +
    "\uffb3\013\uffb3\014\uffb3\015\uffb3\016\uffb3\017\uffb3\026\uffb3" +
    "\027\uffb3\063\uffb3\065\uffb3\001\002\000\042\004\uffb1\005" +
    "\uffb1\006\uffb1\007\uffb1\010\151\011\165\012\uffb1\013\uffb1" +
    "\014\uffb1\015\uffb1\016\uffb1\017\uffb1\026\uffb1\027\uffb1\063" +
    "\uffb1\065\uffb1\001\002\000\042\004\153\005\154\006\uffb5" +
    "\007\uffb5\010\151\011\165\012\160\013\164\014\156\015" +
    "\155\016\157\017\152\026\uffb5\027\uffb5\063\uffb5\065\uffb5" +
    "\001\002\000\042\004\153\005\154\006\uffb6\007\uffb6\010" +
    "\151\011\165\012\160\013\164\014\156\015\155\016\157" +
    "\017\152\026\uffb6\027\uffb6\063\uffb6\065\uffb6\001\002\000" +
    "\042\004\uffb2\005\uffb2\006\uffb2\007\uffb2\010\151\011\165" +
    "\012\uffb2\013\uffb2\014\uffb2\015\uffb2\016\uffb2\017\uffb2\026" +
    "\uffb2\027\uffb2\063\uffb2\065\uffb2\001\002\000\042\004\uffad" +
    "\005\uffad\006\uffad\007\uffad\010\151\011\165\012\uffad\013" +
    "\uffad\014\uffad\015\uffad\016\uffad\017\uffad\026\uffad\027\uffad" +
    "\063\uffad\065\uffad\001\002\000\042\004\uffb0\005\uffb0\006" +
    "\uffb0\007\uffb0\010\151\011\165\012\uffb0\013\uffb0\014\uffb0" +
    "\015\uffb0\016\uffb0\017\uffb0\026\uffb0\027\uffb0\063\uffb0\065" +
    "\uffb0\001\002\000\042\004\uffaf\005\uffaf\006\uffaf\007\uffaf" +
    "\010\151\011\165\012\uffaf\013\uffaf\014\uffaf\015\uffaf\016" +
    "\uffaf\017\uffaf\026\uffaf\027\uffaf\063\uffaf\065\uffaf\001\002" +
    "\000\042\004\uffb7\005\uffb7\006\uffb7\007\uffb7\010\151\011" +
    "\165\012\160\013\164\014\156\015\155\016\157\017\152" +
    "\026\uffb7\027\uffb7\063\uffb7\065\uffb7\001\002\000\042\004" +
    "\uffb8\005\uffb8\006\uffb8\007\uffb8\010\151\011\165\012\160" +
    "\013\164\014\156\015\155\016\157\017\152\026\uffb8\027" +
    "\uffb8\063\uffb8\065\uffb8\001\002\000\042\004\uffae\005\uffae" +
    "\006\uffae\007\uffae\010\151\011\165\012\uffae\013\uffae\014" +
    "\uffae\015\uffae\016\uffae\017\uffae\026\uffae\027\uffae\063\uffae" +
    "\065\uffae\001\002\000\042\004\uffb4\005\uffb4\006\uffb4\007" +
    "\uffb4\010\uffb4\011\165\012\uffb4\013\uffb4\014\uffb4\015\uffb4" +
    "\016\uffb4\017\uffb4\026\uffb4\027\uffb4\063\uffb4\065\uffb4\001" +
    "\002\000\034\004\153\005\154\006\161\007\162\010\151" +
    "\011\165\012\160\013\164\014\156\015\155\016\157\017" +
    "\152\063\203\001\002\000\042\004\uffa7\005\uffa7\006\uffa7" +
    "\007\uffa7\010\uffa7\011\uffa7\012\uffa7\013\uffa7\014\uffa7\015" +
    "\uffa7\016\uffa7\017\uffa7\026\uffa7\027\uffa7\063\uffa7\065\uffa7" +
    "\001\002\000\042\004\uffab\005\uffab\006\uffab\007\uffab\010" +
    "\uffab\011\uffab\012\uffab\013\uffab\014\uffab\015\uffab\016\uffab" +
    "\017\uffab\026\uffab\027\uffab\063\uffab\065\uffab\001\002\000" +
    "\016\004\137\005\141\062\143\073\047\074\136\075\142" +
    "\001\002\000\020\004\137\005\141\062\143\063\210\073" +
    "\047\074\136\075\142\001\002\000\006\027\213\063\212" +
    "\001\002\000\042\004\uffa3\005\uffa3\006\uffa3\007\uffa3\010" +
    "\uffa3\011\uffa3\012\uffa3\013\uffa3\014\uffa3\015\uffa3\016\uffa3" +
    "\017\uffa3\026\uffa3\027\uffa3\063\uffa3\065\uffa3\001\002\000" +
    "\036\004\153\005\154\006\161\007\162\010\151\011\165" +
    "\012\160\013\164\014\156\015\155\016\157\017\152\027" +
    "\uffa1\063\uffa1\001\002\000\042\004\uffa2\005\uffa2\006\uffa2" +
    "\007\uffa2\010\uffa2\011\uffa2\012\uffa2\013\uffa2\014\uffa2\015" +
    "\uffa2\016\uffa2\017\uffa2\026\uffa2\027\uffa2\063\uffa2\065\uffa2" +
    "\001\002\000\016\004\137\005\141\062\143\073\047\074" +
    "\136\075\142\001\002\000\036\004\153\005\154\006\161" +
    "\007\162\010\151\011\165\012\160\013\164\014\156\015" +
    "\155\016\157\017\152\027\uffa0\063\uffa0\001\002\000\034" +
    "\004\153\005\154\006\161\007\162\010\151\011\165\012" +
    "\160\013\164\014\156\015\155\016\157\017\152\065\216" +
    "\001\002\000\056\004\uff9f\005\uff9f\006\uff9f\007\uff9f\010" +
    "\uff9f\011\uff9f\012\uff9f\013\uff9f\014\uff9f\015\uff9f\016\uff9f" +
    "\017\uff9f\020\uff9f\021\uff9f\022\uff9f\023\uff9f\024\uff9f\025" +
    "\uff9f\026\uff9f\027\uff9f\063\uff9f\065\uff9f\001\002\000\042" +
    "\004\uffac\005\uffac\006\uffac\007\uffac\010\uffac\011\uffac\012" +
    "\uffac\013\uffac\014\uffac\015\uffac\016\uffac\017\uffac\026\uffac" +
    "\027\uffac\063\uffac\065\uffac\001\002\000\016\004\137\005" +
    "\141\062\143\073\047\074\136\075\142\001\002\000\034" +
    "\004\153\005\154\006\161\007\162\010\151\011\165\012" +
    "\160\013\164\014\156\015\155\016\157\017\152\063\222" +
    "\001\002\000\004\066\112\001\002\000\026\052\uffc4\053" +
    "\224\054\uffc4\055\uffc4\056\uffc4\057\uffc4\060\uffc4\061\uffc4" +
    "\067\uffc4\073\uffc4\001\002\000\004\066\112\001\002\000" +
    "\024\052\uffc3\054\uffc3\055\uffc3\056\uffc3\057\uffc3\060\uffc3" +
    "\061\uffc3\067\uffc3\073\uffc3\001\002\000\024\052\uffbd\054" +
    "\uffbd\055\uffbd\056\uffbd\057\uffbd\060\uffbd\061\uffbd\067\uffbd" +
    "\073\uffbd\001\002\000\016\004\uffd7\005\uffd7\062\uffd7\073" +
    "\uffd7\074\uffd7\075\uffd7\001\002\000\016\004\uffda\005\uffda" +
    "\062\uffda\073\uffda\074\uffda\075\uffda\001\002\000\016\004" +
    "\uffd9\005\uffd9\062\uffd9\073\uffd9\074\uffd9\075\uffd9\001\002" +
    "\000\016\004\uffd6\005\uffd6\062\uffd6\073\uffd6\074\uffd6\075" +
    "\uffd6\001\002\000\016\004\uffd8\005\uffd8\062\uffd8\073\uffd8" +
    "\074\uffd8\075\uffd8\001\002\000\016\004\uffd5\005\uffd5\062" +
    "\uffd5\073\uffd5\074\uffd5\075\uffd5\001\002\000\016\004\137" +
    "\005\141\062\143\073\047\074\136\075\142\001\002\000" +
    "\034\004\153\005\154\006\161\007\162\010\151\011\165" +
    "\012\160\013\164\014\156\015\155\016\157\017\152\026" +
    "\237\001\002\000\024\052\uffc7\054\uffc7\055\uffc7\056\uffc7" +
    "\057\uffc7\060\uffc7\061\uffc7\067\uffc7\073\uffc7\001\002\000" +
    "\004\073\047\001\002\000\004\063\242\001\002\000\004" +
    "\026\243\001\002\000\024\052\uffc9\054\uffc9\055\uffc9\056" +
    "\uffc9\057\uffc9\060\uffc9\061\uffc9\067\uffc9\073\uffc9\001\002" +
    "\000\026\026\uffbb\037\043\040\024\041\032\042\045\043" +
    "\041\044\025\045\040\046\023\047\020\001\002\000\004" +
    "\026\252\001\002\000\004\073\047\001\002\000\016\020" +
    "\230\021\231\022\233\023\227\024\232\025\234\001\002" +
    "\000\016\004\137\005\141\062\143\073\047\074\136\075" +
    "\142\001\002\000\034\004\153\005\154\006\161\007\162" +
    "\010\151\011\165\012\160\013\164\014\156\015\155\016" +
    "\157\017\152\026\uffbc\001\002\000\016\004\137\005\141" +
    "\062\143\073\047\074\136\075\142\001\002\000\034\004" +
    "\153\005\154\006\161\007\162\010\151\011\165\012\160" +
    "\013\164\014\156\015\155\016\157\017\152\026\254\001" +
    "\002\000\006\063\uffb9\073\047\001\002\000\004\063\261" +
    "\001\002\000\016\020\230\021\231\022\233\023\227\024" +
    "\232\025\234\001\002\000\016\004\137\005\141\062\143" +
    "\073\047\074\136\075\142\001\002\000\034\004\153\005" +
    "\154\006\161\007\162\010\151\011\165\012\160\013\164" +
    "\014\156\015\155\016\157\017\152\063\uffba\001\002\000" +
    "\004\066\112\001\002\000\024\052\uffc2\054\uffc2\055\uffc2" +
    "\056\uffc2\057\uffc2\060\uffc2\061\uffc2\067\uffc2\073\uffc2\001" +
    "\002\000\016\004\137\005\141\062\143\073\047\074\136" +
    "\075\142\001\002\000\034\004\153\005\154\006\161\007" +
    "\162\010\151\011\165\012\160\013\164\014\156\015\155" +
    "\016\157\017\152\063\265\001\002\000\004\026\266\001" +
    "\002\000\024\052\uffc8\054\uffc8\055\uffc8\056\uffc8\057\uffc8" +
    "\060\uffc8\061\uffc8\067\uffc8\073\uffc8\001\002\000\016\004" +
    "\137\005\141\062\143\073\047\074\136\075\142\001\002" +
    "\000\024\052\uffc6\054\uffc6\055\uffc6\056\uffc6\057\uffc6\060" +
    "\uffc6\061\uffc6\067\uffc6\073\uffc6\001\002\000\034\004\153" +
    "\005\154\006\161\007\162\010\151\011\165\012\160\013" +
    "\164\014\156\015\155\016\157\017\152\026\272\001\002" +
    "\000\024\052\uffc5\054\uffc5\055\uffc5\056\uffc5\057\uffc5\060" +
    "\uffc5\061\uffc5\067\uffc5\073\uffc5\001\002\000\016\004\137" +
    "\005\141\062\143\073\047\074\136\075\142\001\002\000" +
    "\034\004\153\005\154\006\161\007\162\010\151\011\165" +
    "\012\160\013\164\014\156\015\155\016\157\017\152\063" +
    "\275\001\002\000\004\066\112\001\002\000\024\052\uffc1" +
    "\054\uffc1\055\uffc1\056\uffc1\057\uffc1\060\uffc1\061\uffc1\067" +
    "\uffc1\073\uffc1\001\002\000\004\073\047\001\002\000\024" +
    "\020\uffec\021\uffec\022\uffec\023\uffec\024\uffec\025\uffec\026" +
    "\uffec\027\072\064\071\001\002\000\004\073\047\001\002" +
    "\000\004\026\303\001\002\000\064\002\uffee\033\uffee\034" +
    "\uffee\035\uffee\036\uffee\037\uffee\040\uffee\041\uffee\042\uffee" +
    "\043\uffee\044\uffee\045\uffee\046\uffee\047\uffee\050\uffee\051" +
    "\uffee\052\uffee\054\uffee\055\uffee\056\uffee\057\uffee\060\uffee" +
    "\061\uffee\067\uffee\073\uffee\001\002\000\064\002\ufff1\033" +
    "\ufff1\034\ufff1\035\ufff1\036\ufff1\037\ufff1\040\ufff1\041\ufff1" +
    "\042\ufff1\043\ufff1\044\ufff1\045\ufff1\046\ufff1\047\ufff1\050" +
    "\ufff1\051\ufff1\052\ufff1\054\ufff1\055\ufff1\056\ufff1\057\ufff1" +
    "\060\ufff1\061\ufff1\067\ufff1\073\ufff1\001\002\000\016\004" +
    "\137\005\141\062\143\073\047\074\136\075\142\001\002" +
    "\000\034\004\153\005\154\006\161\007\162\010\151\011" +
    "\165\012\160\013\164\014\156\015\155\016\157\017\152" +
    "\026\307\001\002\000\064\002\ufff0\033\ufff0\034\ufff0\035" +
    "\ufff0\036\ufff0\037\ufff0\040\ufff0\041\ufff0\042\ufff0\043\ufff0" +
    "\044\ufff0\045\ufff0\046\ufff0\047\ufff0\050\ufff0\051\ufff0\052" +
    "\ufff0\054\ufff0\055\ufff0\056\ufff0\057\ufff0\060\ufff0\061\ufff0" +
    "\067\ufff0\073\ufff0\001\002\000\004\073\uffdc\001\002\000" +
    "\004\073\uffe1\001\002\000\006\066\313\073\047\001\002" +
    "\000\042\033\uffcc\034\uffcc\035\uffcc\036\uffcc\037\uffcc\040" +
    "\uffcc\041\uffcc\042\uffcc\043\uffcc\044\uffcc\045\uffcc\046\uffcc" +
    "\047\uffcc\050\uffcc\051\uffcc\067\uffcc\001\002\000\042\033" +
    "\035\034\027\035\017\036\036\037\043\040\024\041\032" +
    "\042\045\043\041\044\025\045\040\046\023\047\020\050" +
    "\117\051\114\067\315\001\002\000\004\026\316\001\002" +
    "\000\042\002\ufff7\033\ufff7\034\ufff7\035\ufff7\036\ufff7\037" +
    "\ufff7\040\ufff7\041\ufff7\042\ufff7\043\ufff7\044\ufff7\045\ufff7" +
    "\046\ufff7\047\ufff7\050\ufff7\051\ufff7\001\002" });

  public short[][] action_table() {return _action_table;}

  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\314\000\010\002\003\026\005\032\004\001\001\000" +
    "\022\003\033\004\020\005\041\023\027\024\025\027\032" +
    "\034\030\035\043\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\010\002\003" +
    "\026\005\032\011\001\001\000\002\001\001\000\002\001" +
    "\001\000\006\002\003\026\014\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\022\311\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\024\310\001\001\000\002\001" +
    "\001\000\002\001\001\000\006\004\307\024\025\001\001" +
    "\000\002\001\001\000\002\001\001\000\006\022\066\033" +
    "\065\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\022\047\001\001\000\002\001\001\000" +
    "\004\024\045\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\022\051\001\001\000\006\022\054" +
    "\036\053\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\006" +
    "\022\054\036\057\001\001\000\002\001\001\000\002\001" +
    "\001\000\006\022\054\036\062\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\025\304\001" +
    "\001\000\004\006\067\001\001\000\004\011\110\001\001" +
    "\000\002\001\001\000\006\022\104\033\103\001\001\000" +
    "\012\004\076\007\073\010\075\024\025\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\022" +
    "\077\001\001\000\002\001\001\000\002\001\001\000\010" +
    "\004\076\010\102\024\025\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\012" +
    "\112\001\001\000\016\003\115\004\020\013\117\023\027" +
    "\024\025\027\114\001\001\000\004\022\300\001\001\000" +
    "\006\022\277\033\065\001\001\000\002\001\001\000\004" +
    "\022\276\001\001\000\012\014\126\017\130\021\127\022" +
    "\121\001\001\000\002\001\001\000\004\025\266\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\025\234\001\001" +
    "\000\002\001\001\000\002\001\001\000\014\015\146\016" +
    "\145\017\144\021\143\022\137\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\012\016\216\017" +
    "\144\021\143\022\137\001\001\000\002\001\001\000\012" +
    "\016\203\017\144\021\143\022\137\001\001\000\002\001" +
    "\001\000\014\015\201\016\145\017\144\021\143\022\137" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\014\015\200" +
    "\016\145\017\144\021\143\022\137\001\001\000\014\015" +
    "\177\016\145\017\144\021\143\022\137\001\001\000\014" +
    "\015\176\016\145\017\144\021\143\022\137\001\001\000" +
    "\014\015\175\016\145\017\144\021\143\022\137\001\001" +
    "\000\014\015\174\016\145\017\144\021\143\022\137\001" +
    "\001\000\014\015\173\016\145\017\144\021\143\022\137" +
    "\001\001\000\014\015\172\016\145\017\144\021\143\022" +
    "\137\001\001\000\014\015\171\016\145\017\144\021\143" +
    "\022\137\001\001\000\014\015\170\016\145\017\144\021" +
    "\143\022\137\001\001\000\014\015\167\016\145\017\144" +
    "\021\143\022\137\001\001\000\002\001\001\000\014\015" +
    "\166\016\145\017\144\021\143\022\137\001\001\000\014" +
    "\015\165\016\145\017\144\021\143\022\137\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\014\015\214\016\145" +
    "\017\144\021\143\022\137\001\001\000\016\015\210\016" +
    "\145\017\144\020\206\021\143\022\137\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\014\015\213\016\145\017\144\021\143\022\137" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\014\015\220\016\145\017\144" +
    "\021\143\022\137\001\001\000\002\001\001\000\004\011" +
    "\222\001\001\000\002\001\001\000\004\011\224\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\014\015\235\016\145\017" +
    "\144\021\143\022\137\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\022\240\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\010\004\245\024\025" +
    "\030\244\001\001\000\002\001\001\000\004\022\246\001" +
    "\001\000\004\025\247\001\001\000\014\015\250\016\145" +
    "\017\144\021\143\022\137\001\001\000\002\001\001\000" +
    "\014\015\252\016\145\017\144\021\143\022\137\001\001" +
    "\000\002\001\001\000\006\022\255\031\254\001\001\000" +
    "\002\001\001\000\004\025\256\001\001\000\014\015\257" +
    "\016\145\017\144\021\143\022\137\001\001\000\002\001" +
    "\001\000\004\011\261\001\001\000\002\001\001\000\014" +
    "\015\263\016\145\017\144\021\143\022\137\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\014" +
    "\015\270\016\145\017\144\021\143\022\137\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\014" +
    "\015\273\016\145\017\144\021\143\022\137\001\001\000" +
    "\002\001\001\000\004\011\275\001\001\000\002\001\001" +
    "\000\004\022\051\001\001\000\002\001\001\000\004\022" +
    "\301\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\014\015\305\016\145\017\144\021\143\022" +
    "\137\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\022\301\001\001\000" +
    "\004\012\313\001\001\000\014\003\115\004\020\023\027" +
    "\024\025\027\114\001\001\000\002\001\001\000\002\001" +
    "\001" });

  public short[][] reduce_table() {return _reduce_table;}

  protected CUP$parser$actions action_obj;

  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  public int start_state() {return 0;}
  public int start_production() {return 0;}
  public int EOF_sym() {return 0;}
  public int error_sym() {return 1;}

  private List<String> erros = new ArrayList();

  public void report_error(String message, Object info) {
    StringBuffer m = new StringBuffer("Erro");

    if (info instanceof java_cup.runtime.Symbol) {
      java_cup.runtime.Symbol s = ((java_cup.runtime.Symbol) info);

      if (s.left >= 0) {

        m.append(" na linha "+(s.left+1));

        if (s.right >= 0)

          m.append(", coluna "+(s.right+1));
        }
    }

    List<Integer> ids = this.expected_token_ids();
    LinkedList<String> list = new LinkedList();
    Iterator var3 = ids.iterator();

    while(var3.hasNext()) {
        Integer expected = (Integer)var3.next();
        list.add(converteSimboloParaLexema(this.symbl_name_from_id(expected)));
    }

    m.append(" : " + "Erro de sintaxe! " + "Era esperado encontrar " + list);

    erros.add(m.toString());
  }

  public void report_fatal_error(String message, Object info) {
    report_error(message, info);
  }

  public List<String> getErros() {
    return erros;
  }

  private String converteSimboloParaLexema(String simbolo) {
      switch(simbolo) {
          case "AUTO":
              return "auto";
          case "BREAK":
              return "break";
          case "CHAR":
              return "char";
          case "CONST":
              return "const";
          case "DOUBLE":
              return "double";
          case "ELSE":
              return "else";
          case "ENUM":
              return "enum";
          case "EXTERN":
              return "extern";
          case "FLOAT":
              return "float";
          case "FOR":
              return "for";
          case "IF":
              return "if";
          case "INT":
              return "int";
          case "LONG":
              return "long";
          case "PRINTF":
              return "printf";
          case "RETURN":
              return "return";
          case "SCANF":
              return "scanf";
          case "SHORT":
              return "short";
          case "SIGNED":
              return "signed";
          case "STATIC":
              return "static";
          case "STRUCT":
              return "struct";
          case "UNSIGNED":
              return "unsigned";
          case "VOID":
              return "void";
          case "WHILE":
              return "while";
          case "DEFINE":
              return "define";
          case "INCLUDE":
              return "include";
          case "MAIOR":
              return ">";
          case "MENOR":
              return "<";
          case "IGUALIGUAL":
              return "==";
          case "MENORIGUAL":
              return "<=";
          case "IGUAL":
              return "=";
          case "MAIORIGUAL":
              return ">=";
          case "DIFERENTE":
              return "!=";
          case "AND":
              return "&&";
          case "OR":
              return "||";
          case "MAIS":
              return "+";
          case "MENOS":
              return "-";
          case "MULTIPLICADOR":
              return "*";
          case "DIVISOR":
              return "/";
          case "MAISIGUAL":
              return ">=";
          case "MENOSIGUAL":
              return "<=";
          case "MULTIPLICADORIGUAL":
              return "*=";
          case "DIVISORIGUAL":
              return "/=";
          case "MODIGUAL":
              return "%=";
          case "PARENTESE_E":
              return "(";
          case "PARENTESE_D":
              return ")";
          case "CHAVE_E":
              return "{";
          case "CHAVE_D":
              return "}";
          case "COLCHETE_E":
              return "[";
          case "COLCHETE_D":
              return "]";
          case "PONTOVIRGULA":
              return ";";
          case "VIRGULA":
              return ",";
          case "PONTO":
              return ".";
          case "ASPA_SIMPLES":
              return "'";
          case "ASPA_DUPLA":
              return "\"";
          case "ID":
              return "variavel";
          case "NUM":
              return "número";
          case "CRLF":
              return "quebra de linha";
          case "EOF":
              return "fim do arquivo";
          default:
              return simbolo;
      }
  }


@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$parser$actions {
  private final parser parser;

  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  public final java_cup.runtime.Symbol CUP$parser$do_action_part00000000(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      java_cup.runtime.Symbol CUP$parser$result;

      switch (CUP$parser$act_num)
        {
          case 0: 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          case 1: // includes ::= INCLUDE LITERAL includes 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("includes",24, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          case 2: // includes ::= defines 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("includes",24, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          case 3: // defines ::= DEFINE ID NUM defines 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("defines",20, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          case 4: // defines ::= programa 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("defines",20, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          case 5: // programa ::= programa declaracaoVariavel 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("programa",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          case 6: // programa ::= programa declaracaoFuncao 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("programa",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          case 7: // programa ::= programa declaracaoStruct 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("programa",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          case 8: // programa ::= programa declaracaoEnum 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("programa",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          case 9: // programa ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("programa",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          case 10: // declaracaoStruct ::= STRUCT id CHAVE_E listaDeclaracao CHAVE_D PONTOVIRGULA 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("declaracaoStruct",26, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          case 11: // declaracaoEnum ::= ENUM id CHAVE_E listaIdDeclaracaoEnum CHAVE_D PONTOVIRGULA 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("declaracaoEnum",27, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          case 12: // listaIdDeclaracaoEnum ::= id 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("listaIdDeclaracaoEnum",28, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          case 13: // listaIdDeclaracaoEnum ::= id IGUAL INT 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("listaIdDeclaracaoEnum",28, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          case 14: // listaIdDeclaracaoEnum ::= id VIRGULA listaIdDeclaracaoEnum 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("listaIdDeclaracaoEnum",28, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          case 15: // listaIdDeclaracaoEnum ::= id IGUAL INT VIRGULA listaIdDeclaracaoEnum 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("listaIdDeclaracaoEnum",28, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          case 16: // declaracaoVariavel ::= especificadortipo listaId PONTOVIRGULA 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("declaracaoVariavel",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          case 17: // declaracaoVariavel ::= especificadortipo listaId operadorAtribuicao expr PONTOVIRGULA 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("declaracaoVariavel",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          case 18: // declaracaoVariavel ::= especificadortipo id COLCHETE_E NUM COLCHETE_D PONTOVIRGULA 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("declaracaoVariavel",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          case 19: // declaracaoVariavel ::= STRUCT id id PONTOVIRGULA 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("declaracaoVariavel",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          case 20: // declaracaoVariavel ::= ENUM id id PONTOVIRGULA 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("declaracaoVariavel",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          case 21: // listaId ::= id 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("listaId",25, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          case 22: // listaId ::= id VIRGULA listaId 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("listaId",25, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          case 23: // especificador ::= AUTO 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("especificador",17, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          case 24: // especificador ::= STATIC 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("especificador",17, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          case 25: // especificador ::= EXTERN 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("especificador",17, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          case 26: // especificador ::= CONST 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("especificador",17, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          case 27: // tipo ::= VOID 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("tipo",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          case 28: // tipo ::= CHAR 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("tipo",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          case 29: // tipo ::= FLOAT 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("tipo",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          case 30: // tipo ::= DOUBLE 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("tipo",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          case 31: // tipo ::= SIGNED inteiro 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("tipo",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          case 32: // tipo ::= UNSIGNED inteiro 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("tipo",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // tipo ::= inteiro 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("tipo",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // inteiro ::= SHORT 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("inteiro",18, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // inteiro ::= INT 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("inteiro",18, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // inteiro ::= LONG 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("inteiro",18, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // especificadortipo ::= especificador tipo 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("especificadortipo",21, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 38: // especificadortipo ::= tipo 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("especificadortipo",21, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 39: // operadorAtribuicao ::= IGUAL 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("operadorAtribuicao",19, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 40: // operadorAtribuicao ::= MULTIPLICADORIGUAL 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("operadorAtribuicao",19, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 41: // operadorAtribuicao ::= DIVISORIGUAL 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("operadorAtribuicao",19, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 42: // operadorAtribuicao ::= MODIGUAL 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("operadorAtribuicao",19, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 43: // operadorAtribuicao ::= MAISIGUAL 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("operadorAtribuicao",19, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 44: // operadorAtribuicao ::= MENOSIGUAL 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("operadorAtribuicao",19, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 45: // declaracaoFuncao ::= especificadortipo id parametros bloco 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("declaracaoFuncao",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 46: // parametros ::= PARENTESE_E PARENTESE_D 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("parametros",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 47: // parametros ::= PARENTESE_E listaParametros PARENTESE_D 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("parametros",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 48: // listaParametros ::= declaracaoParametro 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("listaParametros",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 49: // listaParametros ::= listaParametros VIRGULA declaracaoParametro 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("listaParametros",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 50: // declaracaoParametro ::= tipo id 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("declaracaoParametro",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 51: // bloco ::= CHAVE_E listaDeclaracao listaInstrucao CHAVE_D 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("bloco",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 52: // listaDeclaracao ::= listaDeclaracao declaracaoVariavel 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("listaDeclaracao",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 53: // listaDeclaracao ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("listaDeclaracao",8, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 54: // listaInstrucao ::= listaInstrucao instrucao 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("listaInstrucao",9, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 55: // listaInstrucao ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("listaInstrucao",9, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 56: // instrucao ::= SCANF PARENTESE_E id PARENTESE_D PONTOVIRGULA 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("instrucao",10, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 57: // instrucao ::= PRINTF PARENTESE_E expr PARENTESE_D PONTOVIRGULA 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("instrucao",10, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 58: // instrucao ::= posicaoVariavel operadorAtribuicao expr PONTOVIRGULA 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("instrucao",10, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 59: // instrucao ::= id PONTOVIRGULA 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("instrucao",10, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 60: // instrucao ::= id operadorAtribuicao expr PONTOVIRGULA 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("instrucao",10, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 61: // instrucao ::= IF PARENTESE_E expr PARENTESE_D bloco 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("instrucao",10, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 62: // instrucao ::= IF PARENTESE_E expr PARENTESE_D bloco ELSE bloco 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("instrucao",10, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 63: // instrucao ::= FOR PARENTESE_E forInicializacao PONTOVIRGULA expr PONTOVIRGULA forAtualizacao PARENTESE_D bloco 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("instrucao",10, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-8)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 64: // instrucao ::= WHILE PARENTESE_E expr PARENTESE_D bloco 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("instrucao",10, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 65: // instrucao ::= BREAK PONTOVIRGULA 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("instrucao",10, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 66: // instrucao ::= RETURN expr PONTOVIRGULA 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("instrucao",10, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 67: // instrucao ::= RETURN PONTOVIRGULA 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("instrucao",10, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 68: // instrucao ::= chamadaFuncao PONTOVIRGULA 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("instrucao",10, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 69: // forInicializacao ::= tipo id operadorAtribuicao expr 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("forInicializacao",22, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 70: // forInicializacao ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("forInicializacao",22, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 71: // forAtualizacao ::= id operadorAtribuicao expr 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("forAtualizacao",23, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 72: // forAtualizacao ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("forAtualizacao",23, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 73: // expr ::= expr MAIS expr 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",11, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 74: // expr ::= expr MENOS expr 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",11, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 75: // expr ::= expr MULTIPLICADOR expr 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",11, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 76: // expr ::= expr DIVISOR expr 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",11, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 77: // expr ::= expr AND expr 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",11, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 78: // expr ::= expr OR expr 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",11, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 79: // expr ::= expr IGUALIGUAL expr 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",11, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 80: // expr ::= expr DIFERENTE expr 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",11, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 81: // expr ::= expr MENOR expr 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",11, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 82: // expr ::= expr MAIOR expr 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",11, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 83: // expr ::= expr MENORIGUAL expr 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",11, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 84: // expr ::= expr MAIORIGUAL expr 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",11, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 85: // expr ::= MAIS primario 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",11, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 86: // expr ::= MENOS primario 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",11, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          case 87: // expr ::= primario 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",11, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          case 88: // primario ::= NUM 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("primario",12, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          case 89: // primario ::= LITERAL 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("primario",12, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          case 90: // primario ::= PARENTESE_E expr PARENTESE_D 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("primario",12, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          case 91: // primario ::= chamadaFuncao 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("primario",12, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          case 92: // primario ::= posicaoVariavel 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("primario",12, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          case 93: // primario ::= id 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("primario",12, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          case 94: // chamadaFuncao ::= id PARENTESE_E PARENTESE_D 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("chamadaFuncao",13, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          case 95: // chamadaFuncao ::= id PARENTESE_E listaParametroChamadaFuncao PARENTESE_D 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("chamadaFuncao",13, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          case 96: // listaParametroChamadaFuncao ::= expr 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("listaParametroChamadaFuncao",14, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          case 97: // listaParametroChamadaFuncao ::= listaParametroChamadaFuncao VIRGULA expr 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("listaParametroChamadaFuncao",14, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          case 98: // posicaoVariavel ::= id COLCHETE_E expr COLCHETE_D 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("posicaoVariavel",15, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          case 99: // id ::= ID 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("id",16, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          default:
            throw new Exception(
               "Invalid action number "+CUP$parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
              return CUP$parser$do_action_part00000000(
                               CUP$parser$act_num,
                               CUP$parser$parser,
                               CUP$parser$stack,
                               CUP$parser$top);
    }
    }

}
