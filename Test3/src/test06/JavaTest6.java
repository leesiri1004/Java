package test06;

/*
 * 날짜 : 2020/11/19
 * 이름 : 이슬이
 * 내용 : 클래스 상속 연습문제
 */

public class JavaTest6 {

	public static void main(String[] args) {
		Landlord master = new Landlord();
		master.getMoney();
	}

}

class Rent {
	public void payment() {
		System.out.println("임대료를 받습니다.");
	}
}

class Landlord extends Rent {
	public void getMoney() {
		System.out.println("건물주 입니다.");
		payment();
	}
}
