package flatMap;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamOfIntegerArrayWithFlatMap {

    public static void main (String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};
        Stream<int[]> streamArray = Stream.of(arr);

        streamArray.flatMapToInt(x -> Arrays.stream(x))
                .forEach(x -> System.out.println(x));

    }

}
