import java.io.*;

class MyEx extends Exception {

}
public class FileIO {
	public static  void f() throws IOException {
		BufferedReader br = null;		
		try {
			br = new BufferedReader(new FileReader("test.txt"));
			String line;
			int a = 5;
			if (a == 5)
				throw new MyEx();
      if (a == 5)
				throw new RuntimeException("This is stupid");
			while (  (line = br.readLine()) != null) {
				System.out.println(line);
			}

		} catch (IOException e) {
			System.out.println(e);

		} catch (MyEx e2) {
			System.out.println(e2);

		}finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException e) {
				e.printStackTrace();
				throw e;
			}
		}
	}
	
	public static void main(String[] args)  throws IOException {
		f();
		


	}
}
