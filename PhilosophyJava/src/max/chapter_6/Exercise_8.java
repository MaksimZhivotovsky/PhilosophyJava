package max.chapter_6;

public class Exercise_8 {
	
	private Connection connection = Connection.getConnection();
	
	public Exercise_8() {
//		if(ConnectionManager.getConnect() != null) {
//			 ConnectionManager.getConnect();
//		} else {
//			System.out.println("Connection faind");
//		}
		
		if(connection == null) {
			Connection.getConnection();
			System.out.println("Connect");
		} else {
			System.out.println("Connection FAILL");
		}
	}
}

class ConnectionManager {
	
	public static Connection getConnect() {
		return Connection.getConnection();
	}
}

class Connection {
	private static Connection connection;
	
	private Connection() {
		System.out.println("Connection");
	}
	
	static Connection getConnection() {
		return connection;
	}
}
