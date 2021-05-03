package ExampleThree;

public class UserManager {
	
	public void createAccount(User user) {
		System.out.println(user.fullName + " kullanýcý kayýt oldu");
	}

	public void delete(User user) {
		System.out.println(user.fullName + " kullanýcýsýnýn kaydý silindi");
	}

	public void signIn(User user) {
		System.out.println(user.fullName + " kullanýcý giriþ yaptý");
	}

	public void logOut(User user) {
		System.out.println(user.fullName + " kullanýcý çýkýþ yaptý");
	}

	public void profileEdit(User user) {
		System.out.println(user.fullName + " kullanýsýnýn bilgileri güncellendi");
	}

}
