package completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

class Main {
	public static void main(String[] args) {
	
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		
		FutureComplete fc = new FutureComplete();
	    while(true) {
	    	CompletableFuture<String> cf = fc.testSupplyAsync(executorService);
	    	String cfInfo = "";
	    	try {
	    		cfInfo = cf.get(100, TimeUnit.MILLISECONDS); // wait timeout
	    		//cf.get(); // wait forever?
	    		//cf.getNow("123");
	    		//cf.join();
	    		
	    		//System.out.println("Number of dependants " +  cf.getNumberOfDependents());
	
			} catch (InterruptedException | ExecutionException e) {
				//e.printStackTrace();
				cfInfo+=" =>[INTERRUPTED]";
			} catch (TimeoutException e) {
				//e.printStackTrace();
				cfInfo+=" =>[TIMEOUT]";
			}
	    	finally {
	    		if(cf.isDone() && !cf.isCompletedExceptionally()) {
	    			cfInfo+= " =>[OK2]";
	    		}
	    		System.out.print(" " + cfInfo + "\n");
	    	}
	    }
	    

	}
	

}