package p172;

public class Student {
	
	// �ʵ�
	String name; // �а���
	int grade; // �г�
	String department; // �а�
	
	// 1�� ������
	Student() {
	}
	
	// 2�� ������
	Student(String n) {
		name = n;
	}
	
	// 3�� ������
	Student(String n, int g) {
		name = n;
		grade = g;
	}
	
	// 4�� ������
	Student(String n, int g, String d) {
		name = n;
		grade = g;
		department = d;
	}
	
	// 5�� ������ / �а��� �г��� �Ű������� �޴� ������ (���� �߻�)
	// Student(String d, int g) {
	//	department = d;
	//	grade = g;
}

