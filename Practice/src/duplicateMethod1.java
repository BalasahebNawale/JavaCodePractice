
public class duplicateMethod1 {
	public static void main(String []args) {
		int []arr = new int[] {1,2,3,9,5,6,3,1,2,6};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]+" ");
					continue;
				}
			}
			
		}
	}

}
