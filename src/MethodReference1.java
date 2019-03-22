import java.util.ArrayList;
import java.util.List;

public class MethodReference1 {

    public static void main(String args[]) {
        List<String> names = new ArrayList<>();

        names.add("Cat");
        names.add("Cog");
        names.add("Unicord");
        names.add("Trex");
        names.add("Shark");

        names.forEach(System.out::println);
    }

}
