import java.io.*;

public class ReadSerial {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("vector.ser.gz");
		GZipInputStream gis = new GZipInputStream(fis);
		ObjectInputStream ois = new ObjectInputStream(gis);		
		Vector3D V = (Vector3D)ois.readObject();

		ois.close();
		System.out.println(V);
	}
}
class Vector3D implements Serializable {
	private static 	long serialVersionUID = 1;
	private int x,y,z;
	public Vector3D(int x, int y, int z) {
		this.x = x; this.y = y; this.z = z;
	}
	public String toString() {
		return x + "," + y + "," + z;
	}
	public void f() {}
}