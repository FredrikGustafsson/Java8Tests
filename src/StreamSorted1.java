import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamSorted1 {

        public static void main(String[] args) {

            Stream<String> letters = Stream.of("a", "c", "b", "d", "e");

            List<String> result = letters.sorted().collect(Collectors.toList());

            result.forEach(System.out::println);

        }

}
