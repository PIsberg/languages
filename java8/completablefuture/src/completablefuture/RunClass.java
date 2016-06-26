package completablefuture;

import java.util.concurrent.ThreadLocalRandom;

public class RunClass implements Runnable {
	
	
	private static final Integer MIN_SLEEP = 1;
	private static final Integer MAX_SLEEP = 3;

	@Override
	public void run() {
		RunClass.runningTask();
	}
	
	public static String runningTask() {
		
		String info = " supplyAsync | " + Thread.currentThread().getName();
	    System.out.print(System.currentTimeMillis() + ":" + "Running" + info);
	    Integer sleepInMs = ThreadLocalRandom.current().nextInt(MIN_SLEEP, MAX_SLEEP + 1) * 1000;
	
	    try {
			Thread.sleep(sleepInMs);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    
	    return System.currentTimeMillis() + ":Finished" + info;
		}

}
