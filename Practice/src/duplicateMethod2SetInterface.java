import java.util.HashSet;
import java.util.Set;

public class duplicateMethod2SetInterface {

	public static void main(String[] args) {
		int []arr = new int[] {1,2,3,9,5,6,3,1,2,6};
		Set<Integer> s =new HashSet<>();
		for(int no:arr) {
			if(s.add(no)==false) {
				System.out.println(no+" ");
			}
		}
	}
}
