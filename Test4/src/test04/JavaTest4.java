package test04;

import java.util.Scanner;

public class JavaTest4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] names = { "김유신", "김춘추", "장보고", "강감찬", "이순신", "정약용" };

		System.out.println("이름 검색 : ");
		String name = sc.next();

		int i = 0;
		while (!name.equals(names[i])) {
			i++;
		}

		System.out.println(name + "은 배열의 " + i + "번에 있습니다."); // i = index 값

	}

}
