
public class commonElements {
	public static void main(String []args) {
		int arr1[] = {1,3,2,5,9};
		int arr2[] = {5,2,7,9,11};
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j])
					System.out.print(arr1[i]+" ");
			}
		}
	}

}
