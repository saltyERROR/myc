import java.util.ArrayList;

public class VM {
    static ArrayList<Member> members;
    static ArrayList<Func> funcs;
    static VM init(){
        return new VM();
    }
    private VM(){
        members = new ArrayList<>();
        funcs = new ArrayList<>();
    }
    void loop(/* final Node n*/){
        while(true){
            //execute(n.operation);
            //n = next();
        }
    }
    void execute(final Operation o) {
        switch (o.code) {
            case MEMBER_DEFINE:
                //Member.define();
                break;
            case MEMBER_CALL:
                //Member.call();
                break;
            case FUNC_DEFINE:
                //Func.define();
                break;
            case FUNC_CALL:
                //Func.call();
                break;
            default:
                System.out.println("ERROR: VM can't interpret");
                System.exit(1);
        }
    }
}
