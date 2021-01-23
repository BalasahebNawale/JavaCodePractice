import java.util.Scanner;

public class revString {

	public static void main(String[] args) {
		
		System.out.println("*************************************************************");
		System.out.println("Hello Aliens!!! Welcome to java program to reverse the String");
		System.out.println("*************************************************************");
		Scanner instr = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = instr.next();
		instr.close();
		int lsp = str.length();
		for(int i =0;i<lsp;i++) {
			//str.charAt(i) = str.charAt(lsp);
			lsp--;
		}
		

	}

}
