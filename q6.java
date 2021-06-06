import java.util.Scanner;
public class q6 {
	public static void main(String[] args) {
		 Scanner sc =new Scanner(System.in);
		 System.out.println("Enter 1st two number");
		 int a=sc.nextInt();
		 int b=sc.nextInt();
		 if (a>b) {
			System.out.println("enter the third number");
			b=sc.nextInt();
			if (a>b) {
				System.out.println("maximum is :"+a);
			}
			else {
				System.out.println("maximum is :"+b);
			}
		}
		 else {
			 System.out.println("enter the third number");
				a=sc.nextInt();
				if (b>a) {
					System.out.println("maximum is :"+b);
				}
				else {
					System.out.println("maximum is :"+a);
				}	
		 }
			}

}
