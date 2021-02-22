package sub3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.OutputStream;

/*
 * ��¥ : 2020/11/24
 * �̸� : �̽���
 * ���� : ���� ����� ��Ʈ�� �ǽ��ϱ� ���� p501
 */

public class ReaderTest {

	public static void main(String[] args) {

		String filePath = "C:\\Users\\bigdata\\Desktop\\sample.txt";
		String targetPath = "C:\\Users\\bigdata\\Desktop\\sample2.txt";

		try {
			// ���ϰ� �Է½�Ʈ�� ����
			FileInputStream fis = new FileInputStream(filePath);
			InputStreamReader isr = new InputStreamReader(fis, "UTF-8");

			int value = 0;

			while (true) {
				value = isr.read();

				if (value == -1) {
					// �� �̻� ���� �����Ͱ� ���� ���
					break;
				}

				char ch = (char) value;
				System.out.print(ch);
			}

			// ��Ʈ�� ����
			isr.close();

		} catch (Exception e) { // FileNotFoundException and IOException �� ����Ŭ������ Exception = ������ ����
			e.printStackTrace();
		}

		System.out.println("���α׷� ����...");

	}
}