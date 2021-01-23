
public class missingNOinArray {
	public static void main(String []args) {
		int []arr = new int[] {1,2,3,6,9};
		for(int i=0;i<arr.length-1;i++) {
			int pr = arr[i];
			while(pr < arr[i+1] -1) {
				pr++;
				System.out.print(pr+" ");
			}
		}
	}
}
