package sub1;

public class Banana {
	private String country;
	private int price;

	public Banana(String country, int price) {
		this.country = country;
		this.price = price;
	}

	public void show() {
		System.err.println("원산지 : " + country);
		System.err.println("가격 : " + price);
	}
}
