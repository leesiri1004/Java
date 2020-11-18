package sub3;

import java.util.HashMap;
import java.util.Map;

import sub1.Apple;

/*
 * 날짜 : 2020/11/18
 * 이름 : 이슬이
 * 내용 : Collection Set 실습하기 교재 p372
 */

public class MapTest {
	
	public static void main(String[] args) {
		
		// Map 생성과 데이터 저장
		Map<Integer, String> map1 = new HashMap<>();
		
		map1.put(101, "김유신");
		map1.put(102, "김춘추");
		map1.put(103, "장보고");
		map1.put(104, "강감찬");
		map1.put(105, "이순신");
		
		// Map 데이터 갯수
		System.out.println("map1 데이터 갯수 : "+map1.size());
		
		// Map 데이터 출력
		System.out.println("map1 101번 데이터 : "+map1.get(101));
		System.out.println("map1 102번 데이터 : "+map1.get(102));
		System.out.println("map1 105번 데이터 : "+map1.get(105));
		
		// 사과 Map 생성과 데이터 저장
		Map<String, Apple> map2 = new HashMap<>();
		
		map2.put("kor", new Apple("한국", 3000));
		map2.put("usa", new Apple("미국", 2500));
		map2.put("jpn", new Apple("일본", 2000));
		
		// 한국 사과 출력
		Apple apple = map2.get("kor");
		apple.show();
		
		// 미극 사과 출력
		map2.get("usa").show();
		
		// 일본 사과 출력
		map2.get("jpn").show();
		
	}

}
