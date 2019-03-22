import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsMap2 {

    public static void main(String[] args) {

        // Streams apply to data type
        List<Integer> num = Arrays.asList(1,2,3,4,5);
        List<Integer> collect1 = num.stream().map(n -> n + n).collect(Collectors.toList());
        System.out.println(collect1);//[2, 4, 6, 8, 10]

    }
}
