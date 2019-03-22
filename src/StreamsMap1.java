import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsMap1 {

    public static void main(String[] args) {

        List<String> listOfStrings = Arrays.asList("dog", "cat", "car", "girl", "boy");
        List<String> listOfStringsUpperCase = new ArrayList<>();

        //Before Java8
        for (String s : listOfStrings) {
            listOfStringsUpperCase.add(s.toUpperCase());
        }

        System.out.println(listOfStrings);
        System.out.println(listOfStringsUpperCase);

        //With Java 8
        List<String> collect = listOfStrings.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(collect);
    }

}
