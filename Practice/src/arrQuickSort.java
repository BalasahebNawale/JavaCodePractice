
public class arrQuickSort {
	public static void main(String[] args) {
		int arr[] = new int[] {9,8,7,6,5,4,3,2,1};
		QuckSort(arr,0,arr.length-1);
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
	
	private static void QuckSort(int[] arr,int left,int right) {
		int index = partition(arr,left,right);
		if(left<index-1) {
			QuckSort(arr,left,index-1);
		}
		if(right>index) {
			QuckSort(arr,index,right);
		}
	}
	private static int partition(int []arr,int left,int right) {
		int pivot = arr[(left+right)/2];
		while(left<=right) {
			while(arr[left]<pivot) 
				left++;
			while(arr[right]>pivot) 
				right--;
			if(left<=right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}
		return left;
	}
	

}
