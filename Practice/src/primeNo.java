import java.util.Scanner;

public class primeNo {

	public static void main(String[] args) {
		System.out.println("*************************************************************");
		System.out.println("Hello Aliens!!! Welcome to java program to find prime numbers: ");
		System.out.println("*************************************************************");
		Scanner inrange = new Scanner(System.in);
		System.out.println("Enter the Range : ");
		int rang = inrange.nextInt();
		inrange.close();
		
		System.out.println("Prime Nos are : ");

		for(int i =2;i<=rang;i++) {
			int count =0;
			for(int j=1;j<=i/2;j++) {
				if(i%j == 0) {
					count++;
				}
				
			}
			if(count ==1)
				System.out.print(" "+i);

		}

	}

}
