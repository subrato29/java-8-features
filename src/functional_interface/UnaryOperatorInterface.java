package functional_interface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryOperatorInterface {

	public static void main(String[] args) {
		
		UnaryOperator<Integer> func = x -> x * 7;
		int result = func.apply(10);
		System.out.println(result);
		
		List<String> lang = new ArrayList<>();
		lang.add("java");
		lang.add("javascript");
		lang.add("python");
		
		System.out.println(lang);
		
		lang.replaceAll(ele -> ele + "-good");
		
		System.out.println(lang);

	}

}
