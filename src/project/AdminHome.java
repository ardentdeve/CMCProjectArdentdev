package project;

public class AdminHome {
	

	/** A hashmap of a username for a key, and an Admin object as the value */
	private HashMap<String, Admin> admins;
	
	/** An array containing the usernames of all existing Students*/
	private String[] usernames;

	public AdminHome() {
		admins = new HashMap<String, Admin>();
	}

	/**
	 * searches the hashmap in this class for an admin of the specified 
	 * username and returns it if found. If not found it returns null
	 * 
	 * @param username the username of the admin to search for
	 * @return the admin corresponding to the username specified
	 */
	public Admin findAdmin(String username){
		return admins.get(username);
	}
	
	public void addUser(Admin user) {
		if(!admins.contains(user)) {
			admins.put(user.getUsername, user);
			usernames[usernames.length+1] = user.getUsername;
		}
	}
	
	public HashMap<String, Admin> getMap() {
		return admins;
	}

	public void getAdmins(){
		for(int i=0;i<usernames.length;i++) {
			System.out.println(admins.get(usernames[i]));
		}
	}

	public boolean isUserAdmin(User u){
		if(u.getType == 'a')
			return true;
		else
			return false;
	}

}
}