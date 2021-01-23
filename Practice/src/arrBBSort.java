
public class arrBBSort {

	public static void main(String[] args) {
		int arr[] = new int[]{7,8,9,10,11,1,2,3,4};
		int n = arr.length;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr[j+1]<arr[j]) {
					int temp =arr[j];
					arr[j]=arr[j+1];
					arr[j+1] = temp;
				}
				
			}
		}
		
		for(int i:arr) {
			System.out.print(i);
			System.out.println();
		}
		
		
	}

}
