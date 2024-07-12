package java8programs;

import java.util.Arrays;
import java.util.List;

public class Lambda {

	public static void main(String[] args) {
		  List<String> names = Arrays.asList("John", "Alice", "Bob", "Charlie");

	        // Sort the list using a lambda expression
	        names.sort((a, b) -> a.compareTo(b));

	        System.out.println("Sorted names: " + names);
	}

}
