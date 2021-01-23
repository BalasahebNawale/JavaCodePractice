import java.util.Scanner;

public class pat1 {

	public static void main(String[] args) {
		System.out.println("*******************************************************************");
		System.out.println("Hello Aliens!!! Welcome to java program to display star pattrn1");
		System.out.println("*******************************************************************");
		System.out.print("Enter the No of rows: ");

		Scanner inpp = new Scanner(System.in);
		int row = inpp.nextInt();
		inpp.close();
		for(int i=1;i<=row;i++) {
			for(int j = 1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println("");

		}
	}

}
