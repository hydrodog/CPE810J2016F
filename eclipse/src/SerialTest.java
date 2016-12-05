import java.io.*;

public class SerialTest {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("test.dat"));
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("test.dat"));
		Account4 a = (Account4)ois.readObject();
	}
}

class Account4 implements Serializable {
	private double balance;
	public void test() {}
}