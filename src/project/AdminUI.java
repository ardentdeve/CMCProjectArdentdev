
package project;
public interface AdminUI {

	
	public void manageUsers(User m);
	
	public void addUser();
	
	
	public void deactivateUser();
	
	public void editUser(User m);

	public void manageUniversities();
	public boolean addSchool();
	
	public boolean saveAddedUniversities();
	
	public void editUniversities(University u);
	
	public void applyChanges();
	public void resetUniversity();
	
	public void resetUser();
	
}
	
