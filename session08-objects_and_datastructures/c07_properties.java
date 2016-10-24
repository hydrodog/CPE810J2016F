import java.util.*;
import java.io.*;

public class c07_properties {
	public static void main(String[] args) throws Exception {
		Properties p = new Properties();
		FileReader r = new FileReader("dict.dat");
		p.load(r);
		String chinese = p.getProperty("big");
		System.out.println(chinese);
		r.close();
	}
}
