
public class countOddEvenNo {

	public static void main(String[] args) {
		int []arr = new int[] {1,2,3,9,6,3,1,2,6,9,7};
		int oddCount = 0,evenCount = 0;
		
		for(int i=0;i<arr.length;i++) {
			if((arr[i]%2)==0) {
				evenCount++;
			}
			else if((arr[i]%2)!=0) {
				oddCount++;
			}
		}
		
		System.out.println("Odd count is: "+oddCount);
		System.out.println("Even count is: "+ evenCount);


	}

}
