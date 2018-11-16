import java.io.*;
import java.util.*;

//EAM:Execute Around Method
public class EAM{
	private FileWriter fw;
	private FileReader fr;
	private String name = "test.txt";

	private char[] c = new char[100];
	//need updating
	private EAM(final String s) throws IOException{
		if(s != "R"){ fw = new FileWriter(name); }
		if(s != "W"){ fr = new FileReader(name); }
	}
	public static void using(final String s,final Use<EAM,IOException> u) throws IOException{
		final EAM eam = new EAM(s);
		try{
			u.accept(eam);
		}finally{
			eam.closing(s);
		}
	}
	private void closing(final String s) throws IOException{
		System.out.println("close() called automatically...");
		if(s != "R"){ fw.close(); }
		if(s != "W"){ fr.close(); }
	}
	public void writing(final String s) throws IOException{
		fw.write(s);
	}
	//not doing well
	public void reading() throws IOException{
		fr.read(c);
		Arrays.asList(c).forEach(System.out::print);
	}
	/*
	enum Mode{
		R,	//reading
		W,	//writing
		B	//both of them
	}
	*/
}

/*
--Use.java
@FunctionalInterface
public interface Use<T,X extends Throwable>{
	void accept(T t) throws X;
}
*/