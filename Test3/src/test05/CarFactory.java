package test05;

public class CarFactory {
	private static CarFactory instance = new CarFactory();
	
	public CarFactory() {}
	
	public static CarFactory getInstance() {
		return instance;
	}
	
	public Car createCar(String name, int price) {
		return new Car(name, price);
	}
}
