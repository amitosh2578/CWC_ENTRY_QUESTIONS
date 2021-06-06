import java.util.Scanner;
public class q3 {
	static void printseries(int n) {
		  int a = 0, b = 1, c = 1, d = 2, i;
		  int e=0;
		  System.out.print(a + " " + b + " " + c+" "+d);
		  for (i = 4; i <= n; i++) {
		   e =  b +c+d;
		   System.out.print(" " + e);
		   b = c;
		   c = d;
		   d = e;
		  }
		  }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n=sc.nextInt();
		System.out.println("the series is:-");
  printseries(6);
	}

}
