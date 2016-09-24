/*
 * Represents a user, contains
 * userid
 * passwd
 * time the user last logged in
 */
//   20160519-14:40:22

//long t0 = System.currentTimeMillis();
public class User {
	private String userid;
	private String passwd;
	private long timestamp;
	
	
	public User( String u, String p ){
		userid = u;
		passwd = p;
		timestamp = System.currentTimeMillis();
	}
	
	public String toString() {
		return "user: " + userid + " passwd: " + passwd + " time: " + timestamp;
	}
	
	public static void main(String[] a) {
		User u = new User("Dov", "test");
		System.out.println(u);
	}
	
}
