@FunctionalInterface
public interface Use<T,X extends Throwable>{
	void accept(T t) throws X;
}