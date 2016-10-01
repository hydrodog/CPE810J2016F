
public abstract class Vehicle {
	private int speed;
	
	public Vehicle(int s) {
		speed = s;
	}
	
	public abstract double payToll();
	
	
	public String toString() {
		return "my speed=" + speed;
	}
}
