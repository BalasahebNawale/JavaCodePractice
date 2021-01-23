
public class secSmallest {
	public static void main(String[] args) {
		int arr[] = {1,10,9,4,6,5,7};
		int i=0;
		int smaller = Integer.MAX_VALUE;
		int secSmaller = Integer.MAX_VALUE;
		
		for( i=0;i<arr.length;i++) {
			if(arr[i]<smaller) {
				secSmaller = smaller;
				smaller = arr[i];
			}
			else if(arr[i]< secSmaller && arr[i] != smaller) {
				secSmaller = arr[i];
			}
		}
		System.out.println("The second largest No is: "+ secSmaller);	
	}

}
