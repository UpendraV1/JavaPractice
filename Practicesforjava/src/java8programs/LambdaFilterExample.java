package java8programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaFilterExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Alice", "Bob", "Charlie");

        // Filter the list using a lambda expression and streams
        List<String> filteredNames = names.stream()
                                          .filter(name -> name.startsWith("A"))
                                          .collect(Collectors.toList());

        System.out.println("Filtered names: " + filteredNames);
        
        //ggghghghghfhfg
    }
}
