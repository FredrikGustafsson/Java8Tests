import java.util.Arrays;
import java.util.List;

public class ParallelStream1 {

    public static void main(String[] args) {

        // docs.oracle.com/javase/tutorial/collections/streams/parallelism.html

        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");

        //get count of empty string
        long count = strings.parallelStream().filter(string -> string.isEmpty()).count();
        System.out.println("------------------------");
        strings.forEach(e -> System.out.println("'" + e + "'"));
        System.out.println("------------------------");

        System.out.println("count of empty string:" + count );

    }



}
