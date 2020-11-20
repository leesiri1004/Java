package test10;

/*
 * 날짜 : 2020/11/19
 * 이름 : 이슬이
 * 내용 : 인터페이스 연습문제
 */

public class JavaTest10 {
	public static void main(String[] args) {
		Buyer buyer = new Customer();
		Seller seller = new Customer();
		
		buyer.buy();
		seller.sell();
	}
}
