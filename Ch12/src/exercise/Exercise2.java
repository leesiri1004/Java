package exercise;

public class Exercise2 {
	
	public static void main(String[] args) {
		
		Car car = new Car();
		car.name = "�׷���";
		car.company = "�����ڵ���";
		
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
