package flatMap;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamOfStringArrayWithFlatMap {

    public static void main (String[] args) {

        String[][] data = new String[][]{
                {"a", "b"},
                {"c", "d"},
                {"e", "f"}
        };
        Stream<String[]> dataStream = Arrays.stream(data);

        //apply flatMap then apply filter
        Stream<String> finalStream = dataStream
                .flatMap(x -> Arrays.stream(x))
                .filter(x -> "a".equals(x.toString()));

        finalStream.forEach(System.out::println);
    }

}
