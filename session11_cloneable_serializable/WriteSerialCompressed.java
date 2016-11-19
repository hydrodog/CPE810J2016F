import java.io.*;
import java.util.zip.*;

public class WriteSerialCompressed {
	public static void main(String[] args) throws IOException {
		Vector3D v1 = new Vector3D(1,2,3);
		FileOutputStream fos = new FileOutputStream("vector.ser.gz");
		GZIPOutputStream gos = new GZIPOutputStream(fos);
		ObjectOutputStream oos = new ObjectOutputStream(gos);
		for (int i = 0; i < 1000; i++)
			oos.writeObject(v1);
		oos.close();
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