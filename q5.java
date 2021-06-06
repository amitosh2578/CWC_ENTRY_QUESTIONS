import java.util.Arrays;
public class q5 {
public static int inversion(int arr[]) {
        int count = 0;		
		for(int i = 0; i < arr.length-1 ; i++ ) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					System.out.println("Inversion arrays: "+"("+arr[i]+","+arr[j]+")");
					count++;
					}
			}
		}
		if(count == 0) {	
			System.out.println("There are no inversion arrays.");
		}
		return count;
	}
	public static void main(String[] args) {
		int arr1[] = {5,4,3};
		int arr2[] = {0};
		System.out.println("array:- "+Arrays.toString(arr1));
		System.out.println("Inversion count: "+inversion(arr1));
		System.out.println();
		System.out.println("array:- "+Arrays.toString(arr2));
		System.out.println("Inversion count: "+inversion(arr2));
	}

}
