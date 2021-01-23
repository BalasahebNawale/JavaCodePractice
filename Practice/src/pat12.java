
public class pat12 {
	public static void main(String []args) {
		int cnt=1;
		for(int i=1;i<5;i++) {
			for(int j=1;j<=7;j++) {
				if((j>=5-i)&& (j<=3+i ) ) {
					System.out.print(cnt+++" ");
					System.out.print("  ");
					j++;
				}
				else 
					System.out.print("  ");
			}
			System.out.println();
		}
		
	}

}
