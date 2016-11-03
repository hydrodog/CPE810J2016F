import java.net.*;
import java.io.*;

public class ParseHTML {
	public static void main(String[] args ) {
		try {
			URL url = new URL("http://chart.finance.yahoo.com/table.csv?s=IBM&a=8&b=28&c=2016&d=9&e=28&f=2016&g=d&ignore=.csv");

			BufferedReader reader = new BufferedReader
				( new InputStreamReader(url.openStream(), "UTF-8"));
			String line;
			while ( (line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (Exception e) {
      e.printStackTrace();
		}
	}


}
