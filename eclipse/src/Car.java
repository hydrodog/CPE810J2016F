// concrete class
public class Car extends Vehicle {
	private String color;
	
	public Car(int s, String c) {
		super(s);
		color = c;
	}
	public double payToll() {
		return 15;
	}

	public String toString() {
		return "I'm a car " + super.toString() + " my color=" + color;
	}
}
