import java.util.Scanner;

public class pat2 {

	public static void main(String[] args) {
		System.out.println("*******************************************************************");
		System.out.println("Hello Aliens!!! Welcome to java program to display star pattrn2");
		System.out.println("*******************************************************************");
		System.out.print("Enter the No of rows: ");

		Scanner inpp = new Scanner(System.in);
		int row = inpp.nextInt();
		inpp.close();
		for(int i=1;i<=row;i++) {
			for(int j = 1;j<=row/2;j++) {
				if(j<=i&&i<=row/2) {
					System.out.print("* ");
				}
				else if(j<=row-i&&i>row/2)
					System.out.print("* ");
				else
					System.out.print("  ");
				
			}
			System.out.println("");

		}
	}

}
