package sub2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

/*
 * ��¥ : 2020/11/24
 * �̸� : �̽���
 * ���� : ���� ����� ��Ʈ�� �ǽ��ϱ� ���� p496
 */

public class BufferedStreamTest {
	public static void main(String[] args) {
		String filePath = "C:\\Users\\bigdata\\Desktop\\sample.jpg";
		String targetPath = "C:\\Users\\bigdata\\Desktop\\sample2.jpg";

		try {
			// ���ϰ� ��Ʈ�� ����
			FileInputStream fis = new FileInputStream(filePath);
			OutputStream fos = new FileOutputStream(targetPath);
			
			// ���۽�Ʈ�� ���� ����
			BufferedInputStream bis = new BufferedInputStream(fis); // intead of fis - new FileInputStream(filePath)
			BufferedOutputStream bos = new BufferedOutputStream(fos); // intead of fos - new FileOutputStream(targetPath)

			int value = 0;

			while (true) {
				// fis�� ������ �б�
				value = bis.read();
				
				if (value == -1) {
					// �� �̻� ���� �����Ͱ� ���� ���
					break;
				}
				
				// fos�� ������ ����
				bos.write(value);

			}
			
			// ��Ʈ�� ����
			bis.close();
			bos.close();
			fis.close();
			fos.close();

		} catch (Exception e) { // FileNotFoundException and IOException �� ����Ŭ������ Exception = ������ ����
			e.printStackTrace();
		}
		
		System.out.println("���α׷� ����...");
	}
}
