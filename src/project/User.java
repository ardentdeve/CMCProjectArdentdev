package project;

public abstract class User {

	private String password;
	private String username;
	private String firstName;
	private String lastName;
	private boolean loginStatus;
	private char type;
	private char status;
	
	public User()
	{
		
	}
	
	public User(String firstName, String lastName, String username, String password, char type, char status) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
		this.type = type;
		this.status = status;
		this.loginStatus = false;
	}
	
	
	public User(String firstName, String lastName, String username, String password, char type) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
		this.type = type;
		this.loginStatus = false;
	}
	public boolean getlogInStatus()
	{
		return loginStatus;
	}
	
	public void setLoginStatus(boolean status)
	{
		 this.loginStatus = status;
	}
	
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}


	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
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
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}


	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}


	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
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
	
	

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	
	public abstract String toString();
	
	
}