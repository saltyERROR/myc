public class Main {
    public static void main(String[] args) {
        VM.init();
        //test
        Member.define("hoge", 2F);
        Func.define("fuga",x -> x + Member.call("hoge"));
        Func.define("piyo",x -> x + If.call(false,"fuga",7F));
        System.out.println(Func.call("piyo",7F));
    }
}
