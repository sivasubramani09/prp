package interfaces;

public class LibraryInterfaceDemo {
	public static void main(String[] args) {
		KidUsers k1 = new KidUsers();
		System.out.println("KidsUser");
		k1.setAge(10);
		k1.setBookType("Kids");
		k1.registerAccount();
		k1.requestBook();
		k1.setAge(18);
		k1.setBookType("Fiction");
		k1.registerAccount();
		k1.requestBook();
		AdultUser au = new AdultUser();
		System.out.println("AdultUser");
		au.setAge(5);
		au.setBookType("Kids");
		au.registerAccount();
		au.requestBook();
		au.setAge(23);
		au.setBookType("Fiction");
		au.registerAccount();
		au.requestBook();
	}
}
