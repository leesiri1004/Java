package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * ��¥ : 2020/11/25
 * �̸� : �̽���
 * ���� : JDBC INSERT �ǽ� ���� p522
 */

public class InsertTest {
	
	public static void main(String[] args) {
		
		// DB����
		String host = "jdbc:mysql://192.168.10.114:3306/lse";
		String user = "lse";
		String pass = "1234";
			
		
		try {
			// 1�ܰ� - JDBC ����̹� �ε�
			Class.forName("com.mysql.jdbc.Driver");
			
			
			// 2�ܰ� - �����ͺ��̽� ����
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			// 3�ܰ� - SQL ���ఴü ����
			Statement stmt = conn.createStatement();
			
			// 4�ܰ� - SQL ����
			String sql = "INSERT INTO `USER3` VALUES ('B102','ȫ�浿','010-1234-1118',17)";
			stmt.execute(sql);
				
			// 5�ܰ� - �����(ResultSet) ó��(SELECT�� ���)

			// 6�ܰ� - �����ͺ��̽� ����
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("INSERT �Ϸ�...");

	}

}
