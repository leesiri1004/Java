package sub1;

import java.util.ArrayList;
import java.util.List;

/*
 * 날짜 : 2020/11/18
 * 이름 : 이슬이
 * 내용 : Collection List 실습하기 교재 p348
 */

public class ListTest {
	public static void main(String[] args) {
		
		// List 생성
		List<Integer> list1 = new ArrayList<>();
		
		// List 데이터 저장
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list1.remove(2);
		list1.add(1, 3);
		
		// List 출력
		System.out.println("list1 1번 데이터 : "+list1.get(0));
		System.out.println("list1 2번 데이터 : "+list1.get(1));
		System.out.println("list1 3번 데이터 : "+list1.get(2));
		System.out.println("list1 4번 데이터 : "+list1.get(3));
		System.out.println("list1 5번 데이터 : "+list1.get(4));
		
		// 반복문 가능
		for (int i=0; i<list1.size(); i++) {
			// list1.size -> length가 아님
			System.out.println("list1 데이터 : "+list1.get(i));
		}
		
		// 문자열 List 생성과 데이터 저장
		List<String> list2 = new ArrayList<>();
		list2.add("김유신");
		list2.add("김춘추");
		list2.add("장보고");
		list2.add("강감찬");
		list2.add("이순신");
		
		for (String person : list2) {
			System.out.println("person : "+person);
		}
		
		// 사과 List 생성과 데이터 저장
		Apple a2 = new Apple("일본", 2500);
		Apple a3 = new Apple("중국", 2000);
		
		List<Apple> list3 = new ArrayList<>();
		list3.add(new Apple("한국", 3000));
		list3.add(a2);
		list3.add(a3);
		
		// 한국 사과 출력
		Apple koApple = list3.get(0);
		koApple.show();
		
		// 일본 사과 출력 - 한줄로 가능 get.show
		list3.get(1).show();
		
		// 중국 사과 출력
		list3.get(2).show();
		
	}
}
