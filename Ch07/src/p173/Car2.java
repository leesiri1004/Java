package p173;

public class Car2 {
	
	// �ʵ�
	String color;
	String company;
	String type;
	
	public Car2() {
		this("white", "���", "����");
	}
	
	public Car2(String color, String company, String type) {
		this.color = color;
		this.company = company;
		this.type = type;
	}
	
	public Car2(String com, String t) {
		this("white", com, t);
	}
	
	public Car2(String t) {
		this("white", "���", t);
	}
	
	public String toString() {
		return color + "-" + company + "-" + type;
	}
	

}
