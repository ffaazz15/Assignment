package HomeWork1;

public class ComputerPeripherals {
public static void main(String[] args) {

		
		System.out.println("Opertaion Begins..");
		computer c1 = new Computer();
		c1.setBrand("HP");
		c1.setModel("HP007");
		c1.setColor("White");
		c1.setCost(10000);
		c1.setStatus("WORKING");

		System.out.println("BEFORE Setup " + c1);
		

		Component p1 = new Component();
		System.out.println("After Paint Color Changed "  +p1.paint("White", 3));
		
		c1.setStatus("White");

		System.out.println("After paint : " + c1); // will invoke toString()

	}

}

class Computer {
	private String brand;
	private String model;
	private String color;
	private int cost;
	private String status;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	

	@Override
	public String toString() {
		return "Computer [brand=" + brand + ", model=" + model + ", color=" + color + ", cost=" + cost + ", status=" + status
				+ "]";
	}

}

class Shop {

}

class Component extends Shop {
	private Part part1 = new Part();
	

//void paint()
	// System.out.println("Paint work undefined");
// }
	String part(String ColorChan, int Layer) {
		System.out.println("pc color Selected is " + ColorChan + " And the  " + Layer + " Layers. ");
		part1.reset();
		paint1.reboot();
		paint1.restart();
		return ColorChan;
	}

	String part(String ColorChan, int layer, String design) {
		System.out.println("Color Change to" + ColorChan + "and Design selected" + design + " with " + layer + "layers");
		paint1.reset();
		paint1.reboot();
		paint1.restart();
		return ColorChan;

	}

	class Worker {

	}

	class technician extends Worker {

		  void reset() {
			System.out.println("Reseting....");
		                  }

		  void reboot() {
			System.out.println("Rebooting..");
		                }

		  void restart() {
			System.out.println("Restarting..");
		                 }

	}
}

}
