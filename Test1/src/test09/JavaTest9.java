package test09;

/*
 * 날짜 : 2020/11/05
 * 이름 : 이슬이
 * 내용 : 자바 다이아몬드 연습문제
 */

public class JavaTest9 {
	public static void main(String[] args) {
		int count = 0;
		
		for (int i=1; i<=9 ; i++) {
			if(i<=5) {
				count++;
			}else {
				count--;}
				
			for (int j=1; j<=5-count; j++) {
				System.out.print(" ");
			}
			
			for (int k=1; k<=2*count-1; k++) {
				System.out.print("*");
			}
			
			System.out.print("\n");
		}
	}

}
