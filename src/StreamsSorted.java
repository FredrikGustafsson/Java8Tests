import java.util.Arrays;
import java.util.List;

public class StreamsSorted {

        public static void main(String[] args) {
            List<String> strings = Arrays.asList("a", "c", "d", "b", "e","g", "f");
            System.out.print("Not sorted: ");
            strings.stream().forEach(e -> System.out.print(e));
            System.out.println("");
            System.out.print("Sorted: ");
            strings.stream().sorted().forEach(e -> System.out.print(e));
        }
}
