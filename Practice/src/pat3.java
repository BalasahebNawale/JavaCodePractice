import java.util.Scanner;

public class pat3 {

	public static void main(String[] args) {
		System.out.println("*******************************************************************");
		System.out.println("Hello Aliens!!! Welcome to java program to display star pattrn3 ");
		System.out.println("*******************************************************************");
		System.out.print("Enter the No of rows: ");

		Scanner inpp = new Scanner(System.in);
		int row = inpp.nextInt();
		inpp.close();
		for(int i=1;i<=row;i++) {
			for(int j = 1;j<=row;j++) {
				if(j>=row/2-i+1&&j<=row/2+i-1&&i<=row/2) {
					System.out.print("* ");
				}
				
				else if(i>row/2&&j<2*row-(i+row/2)&& j>=i-row/2+1)
					System.out.print("* ");
				else
					System.out.print("  ");				
			}
			System.out.println("");

		}
		
	}

}
