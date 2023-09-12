package composition_codes;

public class Laptop {
	private float screen;
	private Processor processor;
	private String ram;
	private String hardDrive;
	private GraphicsCard graphicsCard;
	private String opticalDrive;
	private String keyboard;

public Laptop() {
	 
	this.screen = 15.6f;
	this.processor = new Processor();
	this.ram = "DDR4";
	this.hardDrive = "2TB";
	this.graphicsCard = new GraphicsCard();
	this.opticalDrive = "MLT layer";
	this.keyboard = "backlit";
	
}
public Laptop(float screen, Processor processor, String ram, String hardDrive, GraphicsCard graphicsCard,
		String opticalDrive, String keyboard) {
	this.screen = screen;
	this.processor = processor;
	this.ram = ram;
	this.hardDrive = hardDrive;
	this.graphicsCard = graphicsCard;
	this.opticalDrive = opticalDrive;
	this.keyboard = keyboard;
}
@Override
public String toString() {
	return "Laptop [screen=" + screen + ", processor=" + processor + ", ram=" + ram + ", hardDrive=" + hardDrive
			+ ", graphicsCard=" + graphicsCard + ", opticalDrive=" + opticalDrive + ", keyboard=" + keyboard + "]";
}
public float getScreen() {
	return screen;
}
public Processor getProcessor() {
	return processor;
}
public String getRam() {
	return ram;
}
public String getHardDrive() {
	return hardDrive;
}
public GraphicsCard getGraphicsCard() {
	return graphicsCard;
}
public String getOpticalDrive() {
	return opticalDrive;
}
public String getKeyboard() {
	return keyboard;
}

}

/*
This class represents a laptop and contains various attributes such as screen, processor, ram, hardDrive, graphicsCard, opticalDrive, and keyboard.

The class has two constructors:

The default constructor (Laptop()) initializes the laptop with default values.
The parameterized constructor allows you to specify values for each attribute when creating a laptop object.
There are getter methods for each attribute to retrieve their values.

The toString() method is overridden to provide a string representation of the laptop's attributes.
*/
