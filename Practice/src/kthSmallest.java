import java.util.Scanner;
public class kthSmallest {
		public static void main(String []args) {
			int []arr = new int[] {1,11,4,5,2,8,9,7};
			Scanner inp = new Scanner(System.in);
			System.out.println("Enter the kth value: ");
			int k = inp.nextInt();
			inp.close();
			for(int i=0;i<k;i++) {
				for(int j = arr.length-1;j>i;j--) {
					if(arr[j-1]>arr[j]) {
						int temp = arr[j-1];
						arr[j-1] = arr[j];
						arr[j] = temp;
					}
				}
			}
			System.out.println(arr[k-1]);
		}

	


}
