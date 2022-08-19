package functional_interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateInterface {

	public static void main(String[] args) {
		
		Predicate<Integer> func = x -> x > 5;
		
		List <Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<Integer> result = list.stream().filter(func).collect(Collectors.toList());
		
		System.out.println(result);
		
		//predicate with &&:
		List<Integer> result1 = list.stream().filter(x -> x > 5 && x < 9).collect(Collectors.toList());
		System.out.println(result1);
		
		//predicate with negate():
		Predicate<String> names = x -> x.startsWith("Subr");
		
		List<String> listOfNames = Arrays.asList("Subrato", "Subrat", "Sub", "Jav", "Ja", "Java", "J");
		List<String> newNames = listOfNames.stream().filter(names.negate()).collect(Collectors.toList());
		
		System.out.println(newNames);
	}

}
