package exercise;

public class Exercise4 {
	
	public static void main(String[] args) {
		
		// ���̵�, �̸�, ����
		String[] member = {
				"hong,ȫ�浿,30",
				"lee,�̼���,40",
				"kim,������,50",				
		};
		
		// �̸��� ���
		for (int i = 0; i < member.length; i++) {
			System.out.println(member[i].split(",")[1]);
		}
		
		// ��� ���� ���
		int ageSum = 0;
		
		for (int i = 0; i < member.length; i++) {
			ageSum += Integer.parseInt(member[i].split(",")[2]);
		}
		
		
		System.out.println("��ճ��� : "+(double)ageSum/member.length);
		
	}

}
