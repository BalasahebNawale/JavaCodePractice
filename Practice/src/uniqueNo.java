
public class uniqueNo {
	public static void main(String[] args) {
		int []arr = new int[] {1,2,3,9,6,3,1,2,6,9,7};
		int fg = 0;
		System.out.println("Unique NO is: ");
		for(int i=0;i<arr.length;i++) {
				fg = fg^arr[i];
		}
		System.out.println(fg);
	}
}
