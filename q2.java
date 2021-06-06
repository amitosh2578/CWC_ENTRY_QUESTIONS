import java.util.Scanner;
public class q2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of rows and columns");
		int row = sc.nextInt();
		int col = sc.nextInt();
		System.out.println("Enter array elements");
		int[][] arr = new int[row][col];
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				arr[i][j] = sc.nextInt();
			}	
		}
		System.out.println("Select sort\n 1.Increasing order\n 2.Decreasing order");
		int num = sc.nextInt();
		switch(num) {
		case 1: 
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				for(int m=0; m<row; m++) {
					for(int n=0; n<col; n++) {
						if(arr[i][j]<arr[m][n]) {
							int temp = arr[i][j];
							arr[i][j] = arr[m][n];
							arr[m][n] = temp;
						}
					}
				}
			}
		}
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				System.out.println(arr[i][j]);
			}
		}
		break;
		
		case 2:
			for(int i=0; i<row; i++) {
				for(int j=0; j<col; j++) {
					for(int m=0; m<row; m++) {
						for(int n=0; n<col; n++) {
							if(arr[i][j]>arr[m][n]) {
								int temp = arr[i][j];
								arr[i][j] = arr[m][n];
								arr[m][n] = temp;
							}
						}
					}
				}
			}
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				System.out.println(arr[i][j]);
			}
		}
		break;
		default: System.out.println("Not available");
		}
		
	}

}
