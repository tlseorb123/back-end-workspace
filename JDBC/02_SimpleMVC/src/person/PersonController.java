package person;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PersonController {

	public PersonController() {
		// 1. 드라이버 로딩
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

	}

	// 고정적인 반복 -- DB 연결, 자원 반납 -> 공통적인 메서드 정의.. 메서드마다 호출해서 사용!
	// 2. DB 연결
	public Connection getConnect() throws SQLException {
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kh", "root", "1234");
		return conn;
	}

	// 5. 자원 반납
	public void closeAll(PreparedStatement pt, Connection conn) throws SQLException {
		pt.close();
		conn.close();
	}

	public void closeAll(ResultSet rs, PreparedStatement pt, Connection conn) throws SQLException {
		rs.close();
		closeAll(pt, conn);
	}

	public int addPerson(int id, String name, String address) throws SQLException {

		Connection conn = getConnect();

		// 3. 쿼리문 -> PreparedStatement
		String query = "INSERT INTO person VALUES (?, ?, ?)";
		PreparedStatement pt = conn.prepareStatement(query);

		// 4. 쿼리문 실행
		pt.setInt(1, id);
		pt.setString(2, name);
		pt.setString(3, address);

		int result = pt.executeUpdate(); //성공하면 1  

		// 5. 자원 반납
		closeAll(pt, conn);

		return result;

	}

	public int updatePerson(int id, String address) throws SQLException {

		Connection conn = getConnect();

		// 3. 쿼리문 -> PreparedStatement
		String query = "UPDATE person SET address=? WHERE id = ?";
		PreparedStatement pt = conn.prepareStatement(query);

		pt.setInt(2, id);
		pt.setString(1, address);

		int result = pt.executeUpdate();
	
		closeAll(pt, conn);
		return result;
	}

	public int removePerson(int id) throws SQLException {

		Connection conn = getConnect();

		// 3. 쿼리문 -> PreparedStatement
		String query = "DELETE FROM person WHERE id = ?";
		PreparedStatement pt = conn.prepareStatement(query);

		pt.setInt(1, id);

		int result = pt.executeUpdate();
		
		closeAll(pt, conn);
		return result;

	}

	public ArrayList<Person> searchAllPerson() throws SQLException {

		Connection conn = getConnect();

		// 3. 쿼리문 -> PreparedStatement
		String query = "SELECT * FROM person";
		PreparedStatement pt = conn.prepareStatement(query);

		ResultSet rs = pt.executeQuery();
		ArrayList<Person> list = new ArrayList<>();
		
		while(rs.next()) {
			// 생성자 방식
		//	list.add(new Person(rs.getInt("id"), rs.getString("name"), rs.getString("address"));
		
			// 생성자 방식  == setter 방식  둘다 사용 가능
		// setter 방식 
			Person person = new Person();
			person.setId(rs.getInt("id"));
			person.setName(rs.getString("name"));
			person.setAddress(rs.getString("address"));
			list.add(person);
		}

		closeAll(rs, pt, conn);
		return list;
	}

	public Person searchPerson(int id) throws SQLException {

		Connection conn = getConnect();

		// 3. 쿼리문 -> PreparedStatement
		String query = "SELECT * FROM person WHERE id = ?";
		PreparedStatement pt = conn.prepareStatement(query);

		pt.setInt(1, id);
		ResultSet rs = pt.executeQuery();

		Person person = null;
		
		if(rs.next()) {
			 person = new Person(rs.getInt("id"),
					                  rs.getString("nanme"),
					                   rs.getString("address"));
		}
	
		closeAll(rs, pt, conn);
		return person;
	}
	
}
