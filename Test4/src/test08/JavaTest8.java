package test08;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*
 * 날짜 : 2020/11/26
 * 이름 : 이슬이
 * 내용 : 로또 번호 생성기 연습문제
 */

public class JavaTest8 {
	
	public static void main(String[] args) {
		
		Set<Integer> lottoSet = new HashSet<>();
		
		for (;;) {
			int num = (int) Math.ceil(Math.random()*45);
			lottoSet.add(num);
			if (lottoSet.size() == 6) {
				break;
			}
		}
		
		// 로또번호 정렬
		Set<Integer> treeSet = new TreeSet<>(lottoSet);
		
		Iterator<Integer> iter = treeSet.iterator();
		
		while (iter.hasNext()) {
			System.out.println(iter.next()+" ");
		}
		
	}

}
