package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamAPI {
    public static void main(String[] args) {
        List<String> names = List.of("Ashwin", "Mohan", "Anjali", "Ashwin");
        List<Integer> number = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        // 1.Start with
        // names.stream().filter(name -> name.startsWith("A")).forEach(System.out::println);

        // 2.Change to uppercase
        // names.stream().filter(name -> name.startsWith("A")).map(word -> "*" + word).forEach(System.out::println);

        // 3. Sorted
        // names.stream().distinct().sorted().forEach(System.out::println);

        // Map<Integer, List<String>> groupedByLength = names.stream().collect(Collectors.groupingBy(String::length));
        // Map<Object, List<String>> groupedByLength = names.stream().collect(Collectors.groupingBy(String::length));
        // System.out.println(groupedByLength);

        // 5. Reduce
//        Optional<Integer> num = number.stream().reduce(1,(a,b)->a*b);
//        System.out.println(num.get());

    }
}
