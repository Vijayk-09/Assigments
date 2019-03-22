
public class reverseString {
	public static void main(String[] args) {

		String str = "vijay kumar patil";
		String revstring = "";
		str = str.replaceAll("\\s+", "");

		for (int i = str.length() - 1; i >= 0; --i) {
			revstring = revstring + str.charAt(i);
		}

		System.out.println(revstring);
	}
}