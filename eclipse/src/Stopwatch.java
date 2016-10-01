public class Stopwatch {
	private long startTime;
	private long stopTime;
	//private int elapsedTime;

	public void start() {
		 startTime = java.lang.System.currentTimeMillis();
	}
	
	public void stop() {
		stopTime = java.lang.System.currentTimeMillis();
	}
	
	public long elapsed() {
		return stopTime - startTime;
	}
	
	private static void takeSomeTime(long n) {
		long sum = 0;
		for (long i = 0; i < n; i++)
			sum += i;
		System.out.println(sum);
	}
	
	public static void main(String[] a) {
		Stopwatch s = new Stopwatch ();
		
		s.start();
		takeSomeTime(1000000000L);
		s.stop();
		System.out.println(s.elapsed());
	}
	
	
}
