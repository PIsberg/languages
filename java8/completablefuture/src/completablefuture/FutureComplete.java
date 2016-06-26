package completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;

public class FutureComplete {

	
	/**
	 * Asynchronous execution using Java 8 completableFutures supplyAsync (only by method)
	 * 
	 * @param executorService
	 * @return String //has to not be void?
	 */
	public CompletableFuture<String> testSupplyAsync(ExecutorService executorService) {
		
		CompletableFuture<String> cfSupplyAsync = CompletableFuture.supplyAsync(() -> RunClass.runningTask(), executorService);
		
		// This is printed always?
		cfSupplyAsync.thenAccept(s->System.out.println("OK1"));
// NOTE: This will override the other exception handling
		//timeout/exectionInterrupted => runtimeexcpetion instead
//		cfSupplyAsync.completeExceptionally(new RuntimeException());
//
//		cfSupplyAsync.exceptionally(e -> {
//		            System.out.println(e.getClass());
//		            return null;
//		});
		
		return cfSupplyAsync;
	}
	
	
	/**
	 * Asynchronous execution using Java 8 completableFutures supplyAsync (by class)
	 * 
	 * @param executorService
	 * @return String //has to not be void?
	 */
	public CompletableFuture<Void> testSupplyAsyncClass(ExecutorService executorService) {

		CompletableFuture<Void> cfSupplyAsync = CompletableFuture.runAsync(new RunClass(), executorService);
   
		return cfSupplyAsync;
	}
	
	
	/**
	 * Asynchronous execution using Java 8 completableFutures runAsync (by method)
	 * 
	 * @param executorService
	 * @return void //has to be void?
	 */
	public CompletableFuture<Void> testRunAsync(ExecutorService executorService) {

    	CompletableFuture<Void> cfRunAsync = CompletableFuture.runAsync(() -> RunClass.runningTask(), executorService);
    	
    	return cfRunAsync;
	}
	
	//TODO: anyoff, thenApply -> thenAccept-pattern
}
