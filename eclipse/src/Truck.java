
public class Truck extends Vehicle {// A Truck is a kind of Vehicle
	// A Truck IS_A Vehicle
	private int speed;
	private double weight;
	
	public Truck(int s, double w) {
		super(s);
		weight = w;
	}
	public double payToll() {
		return 15*4;
	}

	public String toString() {
		return "I'm a truck" + super.toString()+ " my weight=" + weight;
	}
}
