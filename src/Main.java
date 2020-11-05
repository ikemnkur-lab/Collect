import java.util.HashMap;
import java.util.Scanner;

public class Main {
	
	private static boolean run = true;
	private static Scanner scan = new Scanner(System.in);
	private static HashMap hm = new HashMap(); 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cube cube = new Cube(1, 6, 0, 0);
		int count = 0;
		System.out.println("Type 'exit' to quit.");
		while(run) {
			if (scan.next() == "quit") {
				run = false;
			}
			System.out.println("Adding Float #" + count);
			System.out.println("Type a Volume:");
			System.out.println("Type a Volume:");
			System.out.println("Input Air Density:");
			System.out.println("Type  :");
		}
	}

}
