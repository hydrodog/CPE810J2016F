import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
//import java.io.FileOutputWriter;  // for writing letters

public class SerialTest {
	public static void main(String[] args) throws IOException {
		Vector3D v1 = new Vector3D(1,2,3);
		FileOutputStream fos = new FileOutputStream("vector.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(v1);
//		oos.close();
	}
}
class Vector3D implements Serializable {
	private int x,y;
	private double z;
	public Vector3D(int x, int y, double z) {
		this.x = x; this.y = y; this.z = z;
	}
	public String toString() {
		return x + "," + y + "," + z;
	}
}