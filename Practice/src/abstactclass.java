
 abstract class vehicle {
	abstract void start();

}
 
 class car extends vehicle{
	 void start() {
		 System.out.println("start with key");
	 }
 }
 
 class scooter extends vehicle{
	 void start() {
		 System.out.println("Start with kick.");
	 }
 }
 public class abstactclass{
	 public static void main(String []args) {
		 car c = new car();
		 c.start();
	 }
 }