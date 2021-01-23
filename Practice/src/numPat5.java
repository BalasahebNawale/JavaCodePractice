import java.util.Scanner;

public class numPat5 {
	public static void main(String[] args){
		System.out.println("*******************************************************************");
		System.out.println("Hello Aliens!!! Welcome to java program to display star pattrn ");
		System.out.println("*******************************************************************");
		System.out.print("Enter the No of rows: ");

		Scanner inpp = new Scanner(System.in);
		int row = inpp.nextInt();
		inpp.close();
		
		for(int i=1;i<=row;i++) {
			int p=1;
			for(int j = 1;j<=2*row;j++) {
				if(j<=2*i-1) {
					System.out.print(p+" ");
					if(j<i)
						p++;
					else
						p--;
					
				}			
				else 
					System.out.print("  ");
					
			}
			System.out.println();
		}
	}
}


