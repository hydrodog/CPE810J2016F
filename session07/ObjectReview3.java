public class ObjectReview3 {
	public static void main(String[] a) {
		FighterAirplane f1 = new FighterAirplane();
		PassengerAirplane p1 = new PassengerAirplane();
		f1.fly();
    p1.fly();

		Airplane a = f1;

		a.fly();
		a = p1;
		a.fly();
		Airplane a = new FighterAirplane();
		FighterAirplane f2 = new PassengerPlane();
		f2.fire();
	}

	abstract class Airplane {
		public abstract void fly();
	}

	class PassengerAirplane extends Airplane {
		public void fly() {

		}
		public void serveCoffee() {}
	}

	class FighterAirplane extends Airplane {
	public void fly() {

	}
	public void fire() {}
}
