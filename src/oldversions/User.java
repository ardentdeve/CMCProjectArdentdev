package oldversions;

public class User {

	private String password;
	private String username;
	private String firstName;
	private String lastName;
	private char type;
	private char status;
	
	public User(String pw, String un, String firstName, String lastName, char type, char status) {
		this.password = pw;
		this.username = un;
		this.firstName = firstName;
		this.lastName = lastName;
		this.type = type;
		this.status = status;
	}
	
	public void logOn() {
		logOn(username, password); //???????????????????/
	}
	
	public void logOff() {
		//????????????????????????????????????????????????????????
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
