
public class MaxMin {

	public static void main(String[] args) {
		int arr[] = {1,3,9,4,6,5,7};
		int i=0;
		int max= arr[i],min = arr[i];
		
		for( i=1;i<arr.length;i++) {
			if(max<arr[i])
				max=arr[i];
			if(min>arr[i])
				min = arr[i];
		}
		System.out.println("Max value is : "+ max);
		System.out.println("Min value is : "+ min);

	}

}
