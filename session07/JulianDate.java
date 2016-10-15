public class JulianDate {
	private static int Y2k = 2000;
	//	J2000  January 1, 2000 = 0
	//	private int year, month, day;

	/*

		in a leap year, Feb has 29 days
		days per year = 365   leap year
		every 4th year is a leap year  if year MOD 4 == 0  LEAP 365.25
		every 100th year is NOT a leap year.  if year MOD 100 = 0 NOT LEAP  (1900 1800 1700)
		every 400th year IS a leap year  if year mod 400 = 0  LEAP
    // year = 365.2425		




		Jan meeus, astronomical algorithms


	 */
	private double jday;

	public JulianDate(int year, int mon, int day, int hh, int mm, int sec) {
		int dy = year - Y2k;
		
		jday = 

	}
	public sub(JulianDate r) {

	}

	public int getYear() {

	}

	public int getMonth() {

	}


	

	public static void main(String[] args) {
		JulianDate d1 = new JulianDate(2016, 1, 1); // Jan 1. 2016  00:00:00 (midnight)
		JulianDate d2 = new JulianDate(2016, 1, 2); // Jan 2, 2016

    double d = d1.sub(d2); // should be -1

		JulianDate d3 = new JulianDate(2016, 3, 20, 12, 30, 00); //
		// hh/24 + min / (24*60) + sec / (24*60*60)
		// 12 / 24.0 + 30 / (24*60.0) + 00 / (24*60*60.0);

		d1 = JulianDate.now();
    JulianDate d4 =	d1.add(100);

		System.out.println(d1);
		System.out.println(d1.getYear() + ": " + d1.getMonth() + ":" + d1.getDay() + "\t" +
											 d1.getHour() + ":" + d1.getMinute() + ":" + d1.getSecond());


		// 5 points bonus for getting this right
		JulianDate d5 = new JulianDate(2016, 2, 29);
		System.out.println(d5.getYear() + ":" + d5.getMonth() + ":" + d5.getDay());
	}

}
