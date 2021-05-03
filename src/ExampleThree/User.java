package ExampleThree;

public class User {
	int id;
	String fullName;
	String emailAdress;
	String password;
	
	public User() {
		
		
		
	}

	public User(int id, String fullName, String emailAdress, String password) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.emailAdress = emailAdress;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmailAdress() {
		return emailAdress;
	}

	public void setEmailAdress(String emailAdress) {
		this.emailAdress = emailAdress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
