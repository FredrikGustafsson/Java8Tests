import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streamsfilter1 {

    public static void main(String[] args) {

        List<String> lines = Arrays.asList("dog", "cat", "horse", "unicorn");
        String searchFor = "unicorn";

        // convert list to stream
        // collect the output and convert streams to a List
        List<String> result = lines.stream()
                .filter(line -> searchFor.equals(line))
                .collect(Collectors.toList());

        //Print result of search
        result.forEach(System.out::println);

    }

}
