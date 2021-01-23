public class arr2dPrint {

	public static void main(String[] args) {
		int arr1[][] = new int[][]{{7,8,9},{10,11},{1,2,3,4}};
		//int[] arr2[] = new int[][]{{4,5,6},{7,8,9}};
		//int[] []arr3 = {{7,8,9},{10,11}};
		/*
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++)
			System.out.print(arr1[i][j]+" ");
			System.out.println();
		}
		*/
		for(int i[]:arr1) {           // 
			for(int j:i)
			System.out.print(j+" ");
			System.out.println();
		}
		
		//System.out.println();
		//for(int i=0;i<3;i++) {
		//	System.out.print(arr2[i]);
		//}
		
		//System.out.println();
		//for(int i=0;i<3;i++) {
		//	System.out.print(arr3[i]);
		//}
	}

}
