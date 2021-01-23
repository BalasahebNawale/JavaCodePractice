
public class arrSelSort {

	public static void main(String[] args) {
			int temp=0;
			int arr[] = new int[]{7,8,9,10,11,1,2,3,4};
			int n = arr.length;
			int min = arr[0];
			for(int i=0;i<n;i++) {
				min = i;
				for(int j=i+1;j<n;j++) {
					if(arr[min]>arr[j]) {
						min=j;
					}
				}
				temp=arr[min];
				arr[min]=arr[i];
				arr[i]=temp;
			}
			for(int m:arr) {
				System.out.print(m+" ");
				
			}
		}
}
