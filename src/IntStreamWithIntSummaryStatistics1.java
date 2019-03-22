import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class IntStreamWithIntSummaryStatistics1 {

    public static void main(String[] args) {

        IntStream i = IntStream.of(6,5,7,1, 2, 3, 3);
        IntSummaryStatistics s = i.summaryStatistics();
        System.out.println(s);

    }
}
