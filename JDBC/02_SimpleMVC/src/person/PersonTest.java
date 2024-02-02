package person;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PersonTest {

	PersonController pc = new PersonController();
	
	public static void main(String[] args) {

		PersonTest pt = new PersonTest();

		try {
			
			// person 테이블에 추가
			 pt.addPerson(111, "김강우", "서울");
			 pt.addPerson(222, "고아라", "제주도");
			 pt.addPerson(333, "강태주", "경기도");

			// person 테이블에서 데이터 수정
			 pt.updatePerson(111, "제주도");

			// person 테이블에서 데이터 삭제
             pt.removePerson(1);

			// person 테이블에 있는 데이터 전체 보여주기
			 pt.searchAllPerson();

			// person 테이블에서 데이터 한개만 가져오기
			pt.searchPerson(111);

		} catch (Exception e) {
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

	// 변동적인 반복 -- 비즈니스 로직 DAO(Database Access Object)
	// person 테이블에 추가 - INSERT
	public void addPerson(int id, String name, String address) throws SQLException {
        int result = pc.addPerson(id, name, address);
		if (result == 1) {
			System.out.println(result + "님 회원가입 완료!");
		}
	}

	// person 테이블에서 데이터 수정 - UPDATE
	public void updatePerson(int id, String address) throws SQLException {
        int result = pc.updatePerson(id, address);
		if (result == 1) {
			System.out.println(result + "명 수정");
		}

	
	}

	// person 테이블에서 데이터 삭제 - DELETE
	public void removePerson(int id) throws SQLException {
        int result = pc.removePerson(id);
		if (result == 1) {
			System.out.println(result + "명 삭제");
		}

		
	}

	// person 테이블에 있는 데이터 전체 보여주기 - SELECT
	public void searchAllPerson() throws SQLException {
 
		ArrayList<Person>list = pc.searchAllPerson();
		for (Person p : list) {
			System.out.println(p.getName() + ", " + p.getAddress());
		}
		
	}

	// person 테이블에서 데이터 한개만 가져오기 - SELECT
	public void searchPerson(int id) throws SQLException {
	    Person p = pc.searchPerson(id);	
		System.out.println(p);
		}
	}

		
	

