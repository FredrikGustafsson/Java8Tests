import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterAwayNull1 {

    public static void main(String[] args) {

        Stream<String> numbers = Stream.of("one", "two", "three", null, "four", null, "five");

        List<String> result = numbers.filter(number -> number!=null).collect(Collectors.toList());

        result.forEach(System.out::println);

    }

}
