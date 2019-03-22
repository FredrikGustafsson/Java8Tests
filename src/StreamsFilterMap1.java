import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterMap1 {

    public static void main(String[] args) {
        StreamsFilterMap1 test = new StreamsFilterMap1();
        test.run();
    }

    public void run ()
    {
        List<Person> persons = Arrays.asList(
                new Person("fredrik", 10),
                new Person("camilla", 20),
                new Person("sandra", 30)
        );

        String searchFor = "fredrik";

        String name = persons.stream()
                .filter(x -> searchFor.equals(x.getName()))
                .map(Person::getName)
                .findAny() //findFirst() also works in this case
                .orElse("");

        System.out.println("name : " + name);

        List<String> collect = persons.stream()
                .map(Person::getName)
                .collect(Collectors.toList());

        collect.forEach(System.out::println);
    }

    public class Person {

        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

}
