import java.util.Scanner;

public class linearSearch {

	public static void main(String[] args) {
		int arr[] = {1,3,9,4,6,5,7};
		int i,fg=0;
		Scanner inp =new Scanner(System.in);
		System.out.println("Enter the no to Search");
		int num = inp.nextInt();
		inp.close();
		for(i=0;i<arr.length;i++) {
			if(arr[i]==num) {
				 fg=1;
				break;
			}
			else
				fg=0;
		}
		if(fg==1)
			System.out.println("Number found at: "+(i+1));
		else
			System.out.println("Not Found");

	}

}
