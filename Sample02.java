import java.util.*;

public class Sample02{
	public static void main(String[] args){
		final List<Character> c =
			Arrays.asList('h','3',' ','g','+','(','7');
		c.stream()
		 .map(Sample02::getType)
		 .forEach(System.out::println);
	}
	private enum Type{
		alphabets,
		numbers,
		operators,
		brackets,
		others
	}
	static Type getType(final char c){
		System.out.print(c + " : ");
		if(Character.isLetter(c)) return Type.alphabets;
		else if(Character.isDigit(c)) return Type.numbers;
		else if(c=='+') return Type.operators;
		else if(c=='(')	return Type.brackets;
		return Type.others;
	}
}