
public class Bus extends Vehicle {
	private int numPassengers;
	
	public Bus(int s, int numPass) {
		super(s); numPassengers = numPass;
	}

	public double payToll() {
		return 3;
	}
	
	public String toString() {
		return "I'm a bus" + super.toString() + " carrying=" + numPassengers;
	}
}
