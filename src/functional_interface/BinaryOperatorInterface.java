package functional_interface;

import java.util.function.BinaryOperator;

public class BinaryOperatorInterface {

	
	public static void main(String[] args) {
		
		BinaryOperator<Integer> func = (x1, x2) -> x1 + x2;
		int t = func.apply(10, 20);
		System.out.println(t);
		
	}

}
