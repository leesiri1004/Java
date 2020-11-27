package sub1;

import java.util.Scanner;

/*
 * 날짜 : 2020/11/24
 * 이름 : 이슬이
 * 내용 : 입출력 스트림 실습하기 교재 p494
 */

public class IOTest {
	public static void main(String[] args) {
		
		// 시스템 기본 입력스트림
		Scanner scan = new Scanner(System.in); // 'in'put stream
		
		// 시스템 기본 출력스트림
		System.out.println("이름 입력 : "); // 'out'put stream
		
		String name = scan.nextLine();
		System.out.println("이름 : "+name);
		
	}
}
