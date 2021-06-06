
public class q9 {
	static String reverse_string(String s) {
		String a="";
		for (int i =s.length()-1; i>=0; i--) {
			a+=s.charAt(i);
		}
		return a;
	}
	public static void main(String[] args) {
		System.out.println(reverse_string("AMITOSH"));
	}

}
