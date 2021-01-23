
public class secondLargest {
	public static void main(String[] args) {
		int arr[] = {1,10,9,4,6,5,7};
		int i=0;
		int largest = Integer.MIN_VALUE;
		int secLargest = Integer.MIN_VALUE;
		
		for( i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				secLargest = largest;
				largest = arr[i];
			}
			else if(arr[i]>secLargest && arr[i] != largest) {
				secLargest = arr[i];
			}
		}
		System.out.println("The second largest No is: "+ secLargest);	
	}

}
