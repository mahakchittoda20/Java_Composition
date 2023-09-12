package composition_codes;

public class GraphicsCard {
	private String brand;
	private int series;
	private String memory;
	public GraphicsCard() {
		this.brand = "Nvidia";
		this.series = 940;
		this.memory = "2 GB";
	}
 
	public GraphicsCard(String brand, int series, String memory) {
 
		this.brand = brand;
		this.series = series;
		this.memory = memory;
	}
	@Override
	public String toString() {
		return "GraphicsCard [brand=" + brand + ", series=" + series + ", memory=" + memory + "]";
	}
	public String getBrand() {
		return brand;
	}
	public int getSeries() {
		return series;
	}
	public String getMemory() {
		return memory;
	}
	
}
/*This class represents a graphics card and contains attributes such as brand, series, and memory.

Similar to the Laptop class, it has a default constructor and a parameterized constructor.

There are getter methods for each attribute to retrieve their values.

The toString() method is overridden to provide a string representation of the graphics card's attributes.
*/
