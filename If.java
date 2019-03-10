public class If {
    static Float call(final boolean b,final String s,final Float f){
        if(b) return Func.call(s,f);
        else return 0F;
    }
}
