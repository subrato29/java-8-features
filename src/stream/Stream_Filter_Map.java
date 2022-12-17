package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_Filter_Map {

    public static void main(String[] args) {

        //list of customer objects
        List < Customer > customerList = Arrays.asList(
            new Customer("Tom", 20),
            new Customer("David", 45),
            new Customer("Harry", 35),
            new Customer("Hero", 60)
        );

        String name = customerList
            .stream()
            .filter(x -> "Harry".equals(x.getName()))
            .map(Customer::getName)
            .findAny()
            .orElse(null);

        System.out.println(name);
        System.out.println("------------------");

        //Print all name as list
        List < String > custList = customerList
            .stream()
            .map(Customer::getName)
            .collect(Collectors.toList());

        custList.forEach(System.out::println);
    }

}