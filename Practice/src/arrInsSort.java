
public class arrInsSort {

	public static void main(String[] args) {
		int arr[] = new int[]{7,8,9,10,11,1,2,3,4};
		int n = arr.length;
		
		for(int i=1;i<n;i++) {
			int temp=arr[i];
			int j=i-1;
			while(j>=0&&arr[j]>temp) {
					arr[j+1]= arr[j];
					j--;
			}
			arr[j+1]=temp;
	
		}
		for(int m:arr) {
			System.out.print(m+" ");
		}
	}

}
