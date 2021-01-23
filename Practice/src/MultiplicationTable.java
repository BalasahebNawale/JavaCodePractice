
public class MultiplicationTable {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			for(int j=2;j<10;j++) {
				int tb = i*j;
				System.out.print(tb+"\t");
			}
			System.out.println();	
		}

	}

}
