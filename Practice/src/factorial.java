import java.util.Scanner;

public class factorial {
	public static void main(String[] args) {
		int i,fact = 1;
		System.out.println("Hello Aliens!!! Welcome to java program to calcute factorial of No.");
		System.out.println("**************************************************");
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter the No: ");

		int num = inp.nextInt();
		inp.close();
		System.out.println(num);

		for(i=1;i<=num;i++) {
			 fact = fact*i;
			 //System.out.println(i);

		}
		System.out.print(fact);

	}

}
