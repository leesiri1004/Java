package sub1;

public class Account {

	// protected 접근권한 선언으로 자식클래
	// 계좌속성 : 멤버변수(field)는 무조건 캡슐화(private 선언 + 생성자 정의)를 적용해야 한다.
	protected String bank;
	protected String id;
	protected String name;
	protected int money;
	
	// 생성자(Constructor) : 클래스의 멤버변수를 초기화
	public Account(String bank, String id, String name, int money) {
		this.bank = bank;
		this.id = id;
		this.name = name;
		this.money = money;
	}
	
	// 계좌기능 : 맴버메서드
	public void deposit(int _money) {
		money += _money;
		
	}
	
	public void withdraw(int _money) {
		money -= _money;
		
	}
	public void show() {
		System.out.println("================");
		System.out.println("은행명  : "+bank);
		System.out.println("계좌번호 : "+id);
		System.out.println("입금주  : "+name);
		System.out.println("현재잔액 : "+money);
	}
	
}
