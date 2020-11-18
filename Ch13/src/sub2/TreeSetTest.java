package sub2;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*
 * 날짜 : 2020/11/18
 * 이름 : 이슬이
 * 내용 : Collection Set 실습하기 교재 p361
 */

public class TreeSetTest {
	
	public static void main(String[] args) {
		
		Set<Integer> tree = new TreeSet<>();
		tree.add(23);
		tree.add(10);
		tree.add(48);
		tree.add(15);
		tree.add(7);
		tree.add(22);
		tree.add(56);
		
		Iterator<Integer> iter = tree.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
			
		}
	}

}
