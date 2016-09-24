
public class Sums {
	
	/*
	 * 1.96
	 *  .00877
	 *  .00989
	 * 
	 * 
	 * 1.96
	 *  .00877
	 * ------- 
	 * 1.96
	 *  .00989
	 *-------- 
	 * 1.96

	 *  
	 *  .00877
	 *  .00989
	 *----------
	 *  .0187   6
	 * 1.96
	 * ------
	 * 1.97
	 *
	 */
	public static void main(String[] a) {
		double sum1 = 0;
		for (double x = 1; x <= 100; x++)
			sum1 += 1/x;
		System.out.println(sum1);
		double sum2 = 0;
		for (double x = 100; x > 0; x--)
			sum2 += 1/x;
		System.out.println(sum2);
	}
}
