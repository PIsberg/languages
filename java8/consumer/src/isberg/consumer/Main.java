package isberg.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

class Main {
	public static void main(String[] args) {
		
		// Consumer for Collection
		List<String> strings = new ArrayList<String>();
		
		Consumer<String> consolePrinter = System.out::println;
		
		strings.forEach(consolePrinter);
		
		
		// Biconsumer for Map
	
	}
	
}