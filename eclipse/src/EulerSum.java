public class EulerSum {
	public static void main(String[] a) {
		
		for (float n = 10; n <= 100000; n *= 10) {
			float sum = 0;
			for (float x = n-1; x > 0; x--) {
				sum += 1.0f/(x*x);
			}
			System.out.println(n + "\t" + sum + "\t" + Math.sqrt(6*sum));
		}
	}
	
	
	
	
	
	
}