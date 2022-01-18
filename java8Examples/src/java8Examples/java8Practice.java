package java8Examples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class java8Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> data = Arrays.asList("mayur","sumit","sanket","labhesh","agkjgkjgk","bhkjhkjhk","chkjhkjhk");
		List<String> filter  = data.stream().filter(result ->  (result.startsWith("s"))).collect(Collectors.toList());
		System.out.println(filter);
		List<String> sorted = data.stream().sorted().collect(Collectors.toList());
		 System.out.println("sorted list"+sorted );
		 
		 sorted.forEach(System.out::println);
	}

}
