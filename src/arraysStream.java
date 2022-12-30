import java.util.Arrays;
import java.util.stream.Stream;

/**
 * arrays.stream() method in Java
 * The stream(T[] array) method of the Arrays class in Java returns a sequential stream of the array passed as the argument. The parameter array can be of any data type, T, supported by Java. The stream is a sequence of objects represented as a channel of data that​ has a source where the data is situated, and a destination where it is transmitted.
 *
 * The stream method has two overloaded types:
 *
 * stream(T[] array)
 * stream(T[] array, int start, int end)
 */

public class arraysStream {

    public static void main( String args[] ) {
        String[] arr = { "I", "work", "at", "Educative", "Axis" };

        // storing a stream in a string object
        Stream<String> arr_stream = Arrays.stream(arr);

        // displaying each element in the stream object
        arr_stream.forEach((ele) -> System.out.print(ele + " "));

        /**
         * 2 . stream(T[] array, int start, int end)
         */
        System.out.println();
        System.out.println("----------------------------");
        String[] arr1 = { "I", "work", "at", "Educative", "Axis" };

        // storing a stream of index 1, 2 and 3 in a string object
        Stream<String> arr_stream1 = Arrays.stream(arr, 1, 4);

        // displaying each element in the stream object
        arr_stream1.forEach((ele) -> System.out.print(ele + " "));
    }

}
