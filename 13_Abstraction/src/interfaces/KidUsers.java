package interfaces;

public class KidUsers implements LibraryUser{
	int age;
	String bookType;
	public void registerAccount() {
		if(age<12) {
			System.out.println("You have successfully registered under a Kids Account");
		}
		else if(age>12) {
			System.out.println("Sorry, Age must be less than 12 to register as a kid");
		}
		else {
			System.out.println("Oops, you are allowed to take only kids books.");
		}
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setBookType(String bookType) {
		this.bookType = bookType;
	}
	public void requestBook() {
		if(bookType.equals("Kids")) {
			System.out.println("Book issued successfully, please return within 10 days");
		}else {
			System.out.println("Oops, you are allowed to take only kids books");
		}
	}
}
