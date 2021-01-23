	
import java.util.Scanner;
public class numPat9 {
		public static void main(String[] args) {
			System.out.println("*******************************************************************");
			System.out.println("Hello Aliens!!! Welcome to java program to display star pattrn1");
			System.out.println("*******************************************************************");
			System.out.print("Enter the No of rows: ");
			int j=0;
			Scanner inpp = new Scanner(System.in);
			int row = inpp.nextInt();
			inpp.close();
			for(int i=1;i<=row;i++) {
				int ch = 'A';
				
				for(j = 1;j<=2*row-1;j++) {
					
					if(j==row+1) {
						if(i==1)
							ch = 'A';
						else
						ch = 65+i-2;
					}
					
					if(j<=row-i+1 || j>=row-1+i) {
						System.out.printf("%c ",ch++);
					}
					else
						System.out.print("  ");
				}
				System.out.println("");

			}
		}

	}

