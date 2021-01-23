import java.util.Scanner;

public class fiboSeries {

	public static void main(String[] args) {
		int temp=0;
		System.out.println("Hello Aliens!!! Welcome to java program to display Fibonaci series.");
		System.out.println("**************************************************");
		Scanner infb = new Scanner(System.in);
		System.out.println("Enter the No: ");

		int fbs = infb.nextInt();
		infb.close();
		System.out.println("febunaci series is:");
		int a=0,b=1;
		System.out.print(a+" "+b+" ");
		for(int i=0;i<fbs;i++) {
			temp = a + b;
			System.out.print( temp+" ");
			a =b;
			b =temp;
		}

	}

}
