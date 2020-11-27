package p339;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReEx3 {
	
	public static void main(String[] args) {
		
		String source       = "�޴�����ȣ:010-1111-1111,"
						      + "����ȭ��ȣ:02-1234-5678,"
						      + "�̸����ּ�:email@gmail.com ���¹�ȣ:123-12-123456";
		String telpattern   = "(0\\d{1,2})-(\\d{3,4})-(\\d{4})";
		String emailpattern = "(\\w+)@(\\w+).(\\w+)";
		String accountpattern = "(\\d{3})-(\\d{2})-(\\d{6})";
		
		Pattern p = Pattern.compile(telpattern);
		Matcher m = p.matcher(source);
		
		System.out.println("��ȭ��ȣ : ");
		while (m.find()) { // ������ ���� �´� ���ڿ��� �˻�
			System.out.println(m.group() + " : " + m.group(1) + "," + m.group(2) + "," + m.group(3));
		}
		
		p = Pattern.compile(emailpattern);
		m = p.matcher(source);
		System.out.println("�̸��� : ");
		while (m.find()) { // ������ ���� �´� ���ڿ��� �˻�
			System.out.println(m.group() + " : " + m.group(1) + "," + m.group(2) + "," + m.group(3));
		}
		
		p = Pattern.compile(accountpattern);
		m = p.matcher(source);
		System.out.println("���¹�ȣ : ");
		while (m.find()) { // ������ ���� �´� ���ڿ��� �˻�
			System.out.println(m.group() + " : " + m.group(1) + "," + m.group(2) + "," + m.group(3));
		}
		
	}

}
