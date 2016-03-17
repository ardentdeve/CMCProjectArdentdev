package project;

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

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the type
	 */
	public char getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(char type) {
		this.type = type;
	}

	/**
	 * @return the status
	 */
	public char getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(char status) {
		this.status = status;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [password=" + password + ", username=" + username + ", firstName=" + firstName + ", lastName="
				+ lastName + ", type=" + type + ", status=" + status + ", getPassword()=" + getPassword()
				+ ", getUsername()=" + getUsername() + ", getType()=" + getType() + ", getStatus()=" + getStatus()
				+ ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName() + "]";
	}
}
