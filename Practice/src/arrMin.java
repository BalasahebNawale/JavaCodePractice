
public class arrMin {

	public static void main(String[] args) {
		
		int arr[] = new int[]{7,8,9,10,11,1,2,3,4};
		int n = arr.length;
		int min = arr[0];
		for(int i=0;i<n;i++) {
			if(min>arr[i]) {
				min = arr[i];
			}
			
		}
		System.out.print(min+" ");
	}

}
