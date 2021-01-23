import java.util.Scanner;

public class calci{
	public static void main(String[] args) {
		System.out.println("***********************************************");
		Scanner ip = new Scanner(System.in);
		System.out.println("Hello Aliens!! Welcome to java programming ");
		System.out.println("***********************************************");
		System.out.println("1:Addition ");
		System.out.println("2:Substraction ");
		System.out.println("3:Multiplication ");
		System.out.println("4: Divission ");
		System.out.println("Enter your choice: ");
		int choice = ip.nextInt();
		System.out.println("***********************************************");
		ip.close();
		switch(choice) {
		case 1:
			System.out.print("Enter num1: ");
			int num1 = ip.nextInt();
			System.out.print("Enter num2: ");
			int num2 = ip.nextInt();
			int sum = num1 +num2;
			System.out.printf("The Addition is: %d",sum);
			break;
		case 2:
			System.out.print("Enter num1: ");
			num1 = ip.nextInt();
			System.out.print("Enter num2: ");
			num2 = ip.nextInt();
			int sub = num1 -num2;
			System.out.printf("The Addition is: %d",sub);
			break;
		case 3:
			System.out.print("Enter num1: ");
			num1 = ip.nextInt();
			System.out.print("Enter num2: ");
			num2 = ip.nextInt();
			int mul  = num1*num2;
			System.out.printf("The Addition is: %d",mul);
			break;
		case 4:
			System.out.print("Enter num1: ");
			num1 = ip.nextInt();
			System.out.print("Enter num2: ");
			num2 = ip.nextInt();
			float div = num1 /num2;
			System.out.printf("The Addition is: %f",div);
			break;

			
			
		}


	}
}