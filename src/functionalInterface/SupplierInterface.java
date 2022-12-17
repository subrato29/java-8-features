package functionalInterface;

import java.util.function.Supplier;

public class SupplierInterface {

	public static void main(String[] args) {
		
		//Opposite to Consumer. Takes no argument and return a result
		
		getText (() -> "Java");
		getText (() -> "hello world");

	}

	public static void getText (Supplier<String> text) {
		System.out.println(text.get());
	}
	
}
