package isberg.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

class Main {
	public static void main(String[] args) {
	
		Predicate<Integer> greaterThanTen = (i) -> i > 10;

		// Will print true
		greaterThanTen.test(14);
		
		
		Function<String, Integer> stringLength = (s) -> s.length();

		// Will print 11
		stringLength.apply("Hello world");
		
		
		// Will print true
		List<String> users = new ArrayList<>();
		users.add(new String("a1"));
		users.add(new String("a2"));
		List<String> a1s = process(users, (u) -> u.equals("a1"));

		System.out.println(a1s.get(0));
	
	}
	
	static List<String> process(List<String> as, Predicate<String> predicate) {
		  List<String> result = new ArrayList<>();
		  for (String a : as) {
		    if (predicate.test(a)) {
		      result.add(a);
		    }
		  }
		  return result;
		}
}