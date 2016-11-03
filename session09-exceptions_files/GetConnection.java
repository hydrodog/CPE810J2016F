import java.net.*;
import java.io.*;

public class GetConnection {
	public static void main(String[] args ) {
		try {
      //URL url = new URL("https://canvas.instructure.com/api/v1/courses/175/");
			URL url = new URL("https://google.com");

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
