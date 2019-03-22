import java.util.Arrays;
import java.util.List;

public class Streamsfilter2 {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("dsfs", "", "sada", "sdfsf", "","", "sfsdf");

        //get count of empty string
        Long count = strings.stream().filter(string -> string.isEmpty()).count();
        System.out.println("------------------------");
        strings.forEach(e -> System.out.println("'" + e + "'"));
        System.out.println("------------------------");

        System.out.println("count of empty string:" + count );
    }
}
