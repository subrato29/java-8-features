package functionalInterface;

import java.util.function.Function;

/**
 * 
 * 	Having only one Abstract method
	@FunctionalInterface
	
	Interface Function<T,R>
	Type Parameters:
	T - the type of the input to the function
	R - the type of the result of the function
	
	@FunctionalInterface
	public interface Function<T,R>
 *
 */

public class Functional_Interface {

	public static void main(String[] args) {

		Function <String, Integer> func = string -> string.length();
		System.out.println(func.apply("This is Java 8"));
		
		//Chaining function
		Function <Integer, Integer> func1 = value -> value * 2;
		System.out.println(func.andThen(func1).apply("hello world"));
	}

}
