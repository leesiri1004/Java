package exercise;

public class Exercise2 {
	
	public static void main(String[] args) {
		
		Car car = new Car();
		car.name = "그랜져";
		car.company = "현대자동차";
		
		System.out.println(car);
		
		
	}

}

class Car {
	
	String name;
	String company;
	
	public String toString() {
		
		return company + ":" + name;
		
	}
	
	
}
