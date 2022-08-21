package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterCollect {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("A", "B", "C", "D");
		//list.forEach(alpha -> System.out.println(alpha));
		
		List<String> result = list
								.stream()
								.filter(ele -> !ele.equals("B"))
								.collect(Collectors.toList());
		
		result.forEach(alpha -> System.out.println(alpha));
		
		
	}

}
