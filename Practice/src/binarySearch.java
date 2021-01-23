	import java.util.Scanner;
	
public class binarySearch {
		public static void main(String[] args) {
			int arr[] = {1,3,9,4,6,5,7};
			int fg=0;
			Scanner inp =new Scanner(System.in);
			System.out.println("Enter the no to Search");
			int num = inp.nextInt();
			int lb=0;
			int ub = arr.length-1;
			inp.close();
			int mid=0;
			while(lb<=ub) {
				 mid = (lb+ub)/2;
				if(num == arr[mid]) {
					fg=1;
					break;
				}
				else if(num<arr[mid]) {
					ub = mid;
				}
				else if(num>arr[mid]) {
					lb = mid+1;
				}
				
			}
			if(fg==1) 
				System.out.println("No found at :"+mid);
			else 
				System.out.println("No not Found");
			

		}

	}

