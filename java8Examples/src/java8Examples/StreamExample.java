package java8Examples;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamExample {

	public static void main(String[] args) {
		
		List<Integer> datalist = Arrays.asList(11,15,46,84,59,1,2,3,4,5,648,848,564,45,4);
		
		List<Integer> evenNo = datalist.stream().filter(x -> ((x%2)==0)).collect(Collectors.toList());
		
		System.out.println(evenNo);
		
		List<Integer> oddNo = datalist.stream().filter(x -> ((x%2)  != 0 )).collect(Collectors.toList());
		
		System.out.println(oddNo);
		
		Set<Integer> evenSet = datalist.stream().filter(x -> ((x%2)==0)).collect(Collectors.toSet());
		
		System.out.println(evenSet);
		
		Predicate<Integer> oddNumber = x -> ((x%2)!=0);
		List<Integer> odd = datalist.stream().filter(oddNumber).collect(Collectors.toList());
		
		System.out.println("Odd Numbers using predicates" +odd);
		
		
	}

}
