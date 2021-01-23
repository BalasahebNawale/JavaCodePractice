import java.util.Scanner;

public class revNo {

	public static void main(String[] args) {
		int revnum = 0;
		System.out.println("Hello Aliens!!! Welcome to java program to reverse the No.");
		System.out.println("**************************************************");
		Scanner inr = new Scanner(System.in);
		System.out.println("Enter the No: ");
		int numr = inr.nextInt();
		inr.close();
		while(numr>0) {
			revnum = revnum*10 + numr%10;
			numr = numr/10;
		}
		System.out.println("Reverse No is: "+revnum);

	}

}
