package composition_codes;

public class Main {

	public static void main(String[] args) {
		Laptop lap = new Laptop();
		System.out.println(lap);
		System.out.println(lap.getGraphicsCard().getBrand());
	}

}


/*In the main method, a Laptop object (lap) is created using the default constructor, which initializes the laptop with default values.

The println statements are used to print the laptop's attributes and the brand of its graphics card.
*/
