package junit;

public class Palin {
	public boolean palindromeCheck(String str) {
		StringBuilder sb = new StringBuilder(str);
		if(str.equals(sb.reverse().toString())) {
			return true;
		}
		return false;
	}
}
