public class Stack<T>{
	private class Cell{
		T data;
		Cell previous;

		Cell(final T t,final Cell c){
			data = t;
			previous = c;
		}
	}
	private Cell p;	//ƒ|ƒCƒ“ƒ^
	public void push(final T t){
		p = new Cell(t,p);
		//System.out.println(p.data + " was pushed");
	}
	public void pop(){
		//System.out.println(p.data + " was popped");
		p = p.previous;
	}
}