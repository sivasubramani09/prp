package UserDefinedException;

public class InvalidCountryException extends Exception{
	//@Override
	public String toString() {
		return "User Outside India cannot be registered.";
	}
}
