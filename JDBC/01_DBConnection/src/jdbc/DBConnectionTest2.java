package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DBConnectionTest2 {

	public static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
	public static final String URL = "jdbc:mysql://localhost:3306/kh\", \"root\", \"1234";
	public static final String USER = "root";
	public static final String PASSWORD = "1234";

	public static void main(String[] args) {

		try {
			// 1. 드라이버 로딩
			Class.forName("com.mysql.cj.jdbc.Driver");

			// 2. 디비 연결
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kh", "root", "1234");

			// 3. 쿼리 준비 -INSERT
			String query = "INSERT INTO employee_copy(emp_id, emp_name, emp_no)\r\n" + "VALUES (?,?,?)";
			PreparedStatement ps = conn.prepareStatement(query);

			// 4. 쿼리문 실행
			ps.setInt(1, 700);
			ps.setString(2, "신대규");
			ps.setString(3, "111111-2222222");

			System.out.println(ps.executeUpdate() + "명 추가");

		} catch (Exception e) {

		}

	}

}
