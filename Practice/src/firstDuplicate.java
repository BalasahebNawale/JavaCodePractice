
public class firstDuplicate {

	public static void main(String[] args) {
		int []arr = new int[] {7,4,3,9,5,6,3,1,2,6};
		int fg = 0;
		System.out.println("First Duplicate No is: ");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					fg = 1;
					System.out.println(arr[i]+" ");
					break;
				}
			}
			if(fg==1)
				break;
		}

	}

}
