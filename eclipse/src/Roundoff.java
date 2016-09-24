
public class Roundoff {
	public static void main(String[] args) {
		// 1/2 = .5  1/5   .2    1/3=.3333333
		
		// 1/2 = B.1   1/4 = B.01  1/8 .001
		// .101010101011100111110
		// 2^-1 2^-2 2^-3 ...
		// 1/10  = .000101010101010101
		
		// 1/2  1/4   1/8 1/16
		
		for (float f = (float)0.0; f < 10; f += 0.1) {
			System.out.print(f + " ");
		}

		System.out.println();
		for (float f = 0.0f; f < 100; f += 1) {
			System.out.print(f*.1 + " ");
		}
		System.out.println();

	
	}
}
