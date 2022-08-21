package stream;

import java.util.Arrays;
import java.util.List;

public class StramFilter_FindAny_OrElse {

	public static void main(String[] args) {

		//list of customer objects
		List<Customer> customerList = Arrays.asList(
				new Customer ("Tom", 20),
				new Customer ("David", 45),
				new Customer ("Harry", 35),
				new Customer ("Hero", 60)
			);
		
		//Single condition
		Customer customer = customerList.stream()
			.filter(x -> "Harry".equals(x.getName()))
			.findAny()
			.orElse(null);
		
		System.out.println(customer.getName() + " " + customer.getAge());
		
		//Filter with multiple conditions
		customer = customerList.stream()
				.filter(x -> "David".equals(x.getName()) && 45 == x.getAge())
				.findAny()
				.orElse(null);
		
		System.out.println(customer.getName() + " " + customer.getAge());
	}

}
