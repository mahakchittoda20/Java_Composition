package composition_codes;

public class Main {

	public static void main(String[] args) {
		Laptop lap = new Laptop();
		System.out.println(lap);
		System.out.println(lap.getGraphicsCard().getBrand());
	}

}
