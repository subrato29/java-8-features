package lambdaConcept;

import java.util.Arrays;
import java.util.List;

public class LambdaExpressionsAndMethodReferences {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("A", "B", "C", "D");
		
		//for loop
		for (String alpha : list) {
			System.out.println(alpha);
		}
		
		//Lambda expression:
		list.forEach(str -> System.out.println(str));
		
		//Method references:
		list.forEach(System.out::println);

	}

}
