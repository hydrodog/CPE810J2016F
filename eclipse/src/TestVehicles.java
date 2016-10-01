
public class TestVehicles {
	public static void main(String[] args) {
		Car c = new Car(55, "RED");
		Truck t = new Truck(90, 18000);
		//Car c2 = new Truck()
		Bus b = new Bus(40, 25);
		System.out.println(b);
		System.out.println(t);
		System.out.println(c);

//		Car c2 = t;
//		Truck t2 = c;
		
		//Vehicle v = new Vehicle(55);
		Vehicle v = c;
		System.out.println(v.payToll());
		v = t;
//		Car c2 = v;
		Vehicle[] vehicles = new Vehicle[3];
		vehicles[0] = c;
		vehicles[1] = t;
		vehicles[2] = b;
		//polymorphism
		for (int i = 0; i < vehicles.length; i++)
			System.out.println(vehicles[i].payToll());
		
		
		
	}
}
