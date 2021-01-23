import java.util.Scanner;

public class kthLargest {
	public static void main(String []args) {
		int []arr = new int[] {1,4,5,2,8,9,7};
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter the kth value: ");
		int k = inp.nextInt();
		inp.close();
		for(int i=1;i<k;i++) {
			for(int j = 0;j<arr.length-i;j++) {
				if(arr[j+1]<arr[j]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(arr[arr.length-k-1]);
	}

}
