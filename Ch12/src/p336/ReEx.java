package p336;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReEx {
	
	public static void main(String[] args) {
		
		// �ҹ��� b�� �����ϴ� ���ĺ� �ҹ��� 0�� �̻� ��Ģ
		Pattern p = Pattern.compile("b[a-z]*");
		Matcher m;
		
		// ���ڿ� bat Ȯ��
		m = p.matcher("bat");
		System.out.println("bat = "+m.matches());
		
		// ���ڿ� cat Ȯ��
		m = p.matcher("cat");
		System.out.println("cat = "+m.matches());
		
		// ���ڿ� bed Ȯ��
		m = p.matcher("bed");
		System.out.println("bed = "+m.matches());
		
	}

}
