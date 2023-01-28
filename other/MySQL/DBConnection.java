
import java.sql.*;

public class DBConnection {

	private Connection con;
	private Statement st;
	private ResultSet rs;

	public DBConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Tutorial", "root", "Dksxodud123~");
			st = con.createStatement();
		}
		catch (Exception e) {
			System.out.println("데이터베이스 연결 오류1: " + e.getMessage());
		}
	}

	public boolean isAdmin(String adminID, String adminPassword) {
		try {
			String SQL = "SELECT * FROM admin WHERE adminID = '" + adminID + "' and adminPassword = '" + adminPassword + "'";
			rs = st.executeQuery(SQL);
			if(rs.next()) {
				String ID = rs.getString("adminID");
				String PW = rs.getString(2);
				System.out.printf("ID: %s / PW: %s\n", ID, PW);
				return true;
			}
		}
		catch (Exception e) {
			System.out.println("데이터베이스 연결 오류2: " + e.getMessage());
		}
		return false;

	}

	/** 레코드 값 추가  */
	public void addTableValue(String table, String id, String pw) {
		try {
			String SQL = "INSERT INTO "+table+" VALUES('"+id+"','"+pw+"'"+")";
			// rs = st.executeQuery(SQL);
			st.executeUpdate(SQL);
			System.out.printf("<table: '%s'>\nID: %s, PW: %s 추가 성공!\n", table, id, pw);
		}
		catch (Exception e) {
			System.out.println("데이터베이스 연결 오류2: " + e.getMessage());
			System.out.println("실패했습니다!");
		}
		return;
	}

	/** 레코드 값 삭제 */
	public void dropTableValue(String table, String id, String val) {
		try {
			String SQL = "DELETE FROM "+table+" WHERE "+id+" = '"+val+"'";
			// rs = st.executeQuery(SQL);
			st.executeUpdate(SQL);
			System.out.printf("value: %s 삭제 성공!\n", val);
		}
		catch (Exception e) {
			System.out.println("데이터베이스 연결 오류2: " + e.getMessage());
			System.out.println("실패했습니다!");
		}
		return;

	}

	public void showTable(String tableName) {
		try {
			String SQL = "SELECT * FROM " + tableName;
			rs = st.executeQuery(SQL);
			while(rs.next()) {
				String fir = rs.getString(1);
				String sec = rs.getString(2);
				System.out.printf("%s / %s\n", fir, sec);
			}
		}
		catch (Exception e) {
			System.out.println("데이터베이스 연결 오류2: " + e.getMessage());
		}

	}
}
