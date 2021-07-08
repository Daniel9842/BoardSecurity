package co.edu.escuelaing.interactivebalckboardlife.cacheMemory;

import java.util.HashMap;

public class cacheUser {
	
	public HashMap<String, String> users = new HashMap<String, String>();
	private static cacheUser _instance = new cacheUser();
	/**
	 * Class constructor cacheUser.
	 */
	private cacheUser() {}
	/**
	 * this method returns the instance
	 * @return the class instance
	 */
	public static cacheUser getInstance() {
		return _instance;
	}

	
	/**
	 * users 
	 * @return the users hashmap
	 */
	public HashMap<String, String> getUsers() {
		return users;
	}
	
	public void setUsers(String user,String password) {
		users.put(user, password);
	}
	
}
