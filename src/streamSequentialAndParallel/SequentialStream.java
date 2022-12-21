package streamSequentialAndParallel;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SequentialStream {

    public static void main (String[] args) {

        //1.
        Stream stream = Stream.of("A", "B", "C", "D");
        //stream.forEach(System.out::println);
        stream.findFirst()
                        .ifPresent(System.out::println);

        System.out.println("------------------------------------");

        //2.
        Arrays.asList("A", "B", "C", "D")
                .stream()
                .findFirst()
                .ifPresent(System.out::println);

        System.out.println("------------------------------------");

        //3. range
        IntStream.range(1, 5)
                .forEach(System.out::println);

        System.out.println("------------------------------------");

        //4.
        Arrays.stream(new int[]{1, 2, 3, 4})
                .map(n -> 2 * n + 1)
                .average()
                .ifPresent(System.out::println);

        System.out.println("------------------------------------");

        //5. String data objects
        Stream.of("A1", "B2", "C3", "D4")
                .map(s -> s.substring(1))
                .mapToInt(Integer::parseInt)
                .max()
                .ifPresent(System.out::println);

        System.out.println("------------------------------------");

        //5. limit
        Stream.iterate(0, n -> n + 1)
                .limit(10)
                .forEach(System.out::println);

        System.out.println("------------------------------------");

        //6. odd number
        Stream.iterate(0, n -> n + 1)
                .filter(x -> x % 2 != 0)
                .limit(10)
                .forEach(System.out::println);

        //Array to list conversion in Java 1.8
        int[] arr = {2, 4, 5};
        System.out.println(Arrays.stream(arr)
                .boxed()
                .collect(Collectors.toList()));
    }

}
