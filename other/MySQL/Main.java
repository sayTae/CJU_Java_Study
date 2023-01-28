

public class Main {

	public static void main(String[] args) {

		DBConnection connection = new DBConnection();
		System.out.println("관리자 여부: " + connection.isAdmin("admin", "admin"));

		String tableName = "admin";
		// connection.addTableValue(tableName, "1324", "1324");
		// connection.dropTableValue(tableName, "adminID", "123");
		connection.showTable(tableName);
	}
}
