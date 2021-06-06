import java.util.Scanner;
public class q4 {
public static boolean isAutomorphic(int num) {
		int number = num;
		int number2 = (int)Math.pow((double)num, 2.0);
		int count = 0;
		while(number != 0) {
			number = number / 10;
			count++;
		}
		number = (int)Math.pow(10.0, (double)count);
		int res = number2 % number;
		if(res == num) {
			return true;
		}
		else {	
			return false;
		}
	}
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:-");
		int num = sc.nextInt();
		System.out.println("Is the number automorphic? "+isAutomorphic(num));
	}

}
