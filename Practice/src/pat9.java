
import java.util.Scanner;

public class pat9 {
	public static void main(String[] args){
		System.out.println("*******************************************************************");
		System.out.println("Hello Aliens!!! Welcome to java program to display star pattrn ");
		System.out.println("*******************************************************************");
		System.out.print("Enter the No of rows: ");

		Scanner inpp = new Scanner(System.in);
		int row = inpp.nextInt();
		inpp.close();
		for(int i=1;i<=row;i++) {
			for(int j = 1;j<=row;j++) {
				if(j==i||j== row+1-i )
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
		System.out.println();
		}
	}

}

