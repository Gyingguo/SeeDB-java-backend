package settings;

public class DBSettings {
	public String database;
	public String databaseType;
	public String username;
	public String password;
	
	public static DBSettings getDefault() {
		DBSettings s = new DBSettings();
		s.database = "localhost/seedb_data";
		s.databaseType = "postgresql";
		s.username = "postgres";
		s.password = "123456";
		
		return s;
	}
	
	public static DBSettings getISTCDefault() {
		DBSettings s = new DBSettings();
		s.database = "seedb_data";
		s.databaseType = "postgresql";

		return s;
	}
}
