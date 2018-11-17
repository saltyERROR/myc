import java.io.*;
import java.util.*;

public class CRIPARSER{
    //
    // Reserved words
    //
    public List<String> reserved = new ArrayList<>( Arrays.asList(
        "class", 
        "struct", 
        "void",
        "import",
        "public",
        "private"
    ));

    //
    // Operators
    //
    public List<String> operator = new ArrayList<>( Arrays.asList(
        "+", 
        "-", 
        "*",
        "/",
        "%",
        "&",
        "|",
        "^",
        ">",
        "<",
        "{",
        "}"
    ));

    //
    // Type names
    //
    public List<String> type = new ArrayList<>( Arrays.asList(
        "int", 
        "string", 
        "short",
        "bool",
        "long",
        "char"
    ));

    public List<String> getCommands(String[] str){
        List<String> result = new ArrayList<>();
        
        // pos : The location which this parser is watching.
        for (int pos = 0; pos < str.length; pos++) {
            WordType r = search(value);
            switch(r){
                case NONE:{
                    //If the string means nothing, it would be ignored.
                    System.out.println("[CRI Warning]\"" + value + "\"" + "means nothing.");
                }
                break;
                case RESERVED:{
                    reserveRun(str, pos);
                }
                break;
                case OPERATOR:{
                    operatorRun(str, pos);
                }
                break;
                case TYPE:{
                    typeRun(str, pos);
                }
                break;
                case INSTANCE:{
                    instanceRun(str, pos);
                }
            }
        }

        return result;
    }

    public WordType search(String str){

        for(int i = 0; i < reserved.size(); i++){
            if(reserved.get(i) == str) return WordType.RESERVED;
        }
        for(int i = 0; i < operator.size(); i++){
            if(operator.get(i) == str) return WordType.OPERATOR;
        }
        for(int i = 0; i < type.size(); i++){
            if(type.get(i) == str) return WordType.TYPE;
        }

        return WordType.NONE;
    }

    public void reserveRun(String[] str, int pos)
    {
        // It hasn't been implemented.
    }

    public void operatorRun(String[] str, int pos)
    {
        // It hasn't been implemented.
    }

    public void typeRun(String[] str, int pos)
    {
        // It hasn't been implemented.
    }

    public void instanceRun(String[] str, int pos)
    {
        // It hasn't been implemented.
    }
}

public enum WordType{
    NONE,

    RESERVED,
    OPERATOR,
    TYPE,
    INSTANCE,
}