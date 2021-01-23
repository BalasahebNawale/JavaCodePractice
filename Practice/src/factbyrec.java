import java.util.Scanner;

public class factbyrec {
	static int fact=1;
	public static void main(String[] args) {
		int nu;
		System.out.println("Hello Aliens!!! Welcome to java program to calcute factorial of No.");
		System.out.println("**************************************************");
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter the No: ");

		nu = inp.nextInt();
		inp.close();
		//System.out.println(nu);
		factbyrec obj = new factbyrec();
		obj.calfact(nu);
		System.out.printf("The factorial of %d is %d ",nu,fact);
		
	}
	
	public  void calfact(int nu) {
		while(nu>=1) {
			fact = fact*nu;
			nu--;
		}
		return;
	}

}
