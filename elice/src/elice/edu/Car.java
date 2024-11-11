package elice.edu;

public class Car {
	private String name;
	private int year;
	public String getName() {
		return name;
	}
	public int getYear() {
		return year;
	}
	public Car(String name, int year) {
		super();
		this.name = name;
		this.year = year;
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", year=" + year + "]";
	}
}
