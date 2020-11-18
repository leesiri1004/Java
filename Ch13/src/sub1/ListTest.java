package sub1;

import java.util.ArrayList;
import java.util.List;

/*
 * ��¥ : 2020/11/18
 * �̸� : �̽���
 * ���� : Collection List �ǽ��ϱ� ���� p348
 */

public class ListTest {
	public static void main(String[] args) {
		
		// List ����
		List<Integer> list1 = new ArrayList<>();
		
		// List ������ ����
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list1.remove(2);
		list1.add(1, 3);
		
		// List ���
		System.out.println("list1 1�� ������ : "+list1.get(0));
		System.out.println("list1 2�� ������ : "+list1.get(1));
		System.out.println("list1 3�� ������ : "+list1.get(2));
		System.out.println("list1 4�� ������ : "+list1.get(3));
		System.out.println("list1 5�� ������ : "+list1.get(4));
		
		// �ݺ��� ����
		for (int i=0; i<list1.size(); i++) {
			// list1.size -> length�� �ƴ�
			System.out.println("list1 ������ : "+list1.get(i));
		}
		
		// ���ڿ� List ������ ������ ����
		List<String> list2 = new ArrayList<>();
		list2.add("������");
		list2.add("������");
		list2.add("�庸��");
		list2.add("������");
		list2.add("�̼���");
		
		for (String person : list2) {
			System.out.println("person : "+person);
		}
		
		// ��� List ������ ������ ����
		Apple a2 = new Apple("�Ϻ�", 2500);
		Apple a3 = new Apple("�߱�", 2000);
		
		List<Apple> list3 = new ArrayList<>();
		list3.add(new Apple("�ѱ�", 3000));
		list3.add(a2);
		list3.add(a3);
		
		// �ѱ� ��� ���
		Apple koApple = list3.get(0);
		koApple.show();
		
		// �Ϻ� ��� ��� - ���ٷ� ���� get.show
		list3.get(1).show();
		
		// �߱� ��� ���
		list3.get(2).show();
		
	}
}
