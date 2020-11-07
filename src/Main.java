import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Main {
	
	private static boolean run = true;
	private static Scanner scanner = new Scanner(System.in);
	private static HashMap<Float, Integer> hm = new HashMap<Float, Integer>(); 
	private static TreeMap<Person, Integer> tm = new TreeMap<Person, Integer>(); 
	private static double params[] = new double[4];
	private static String paramNames[] = new String[2];
	public static double load;
	static int count = 0;public static String entry;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Float floats = null;
		
		System.out.println("HashMap Test:\n");
		while(run) {
			System.out.println("Enter any key to continue OR 'N' to quit.");

			entry = scanner.next();
			if (entry.equals("N")) {
				run = false; 
				break;
			}
			
			System.out.println("Adding Float #" + count);
			
			System.out.println("Type a Volume:");
			params[0] = scanner.nextDouble();
			System.out.println("Type in a surface area:");
			params[1] = scanner.nextDouble();
			System.out.println("Input Air Density:");
			params[3] = scanner.nextDouble();
			System.out.println("Type in skin(surface) Density:");
			params[2] = scanner.nextDouble();
			floats = new Float(params[0], params[1], params[2], params[3]);
			System.out.println("Enter a mass to load on float #"+ count + ":");
			load = scanner.nextDouble();
			hm.put(floats, count);
			count++;
		}
		
		hm.forEach((k, v) -> {
			System.out.println("Enter any key to continue OR 'N' to quit.");
		});
		
		System.out.println("TreeMap Test:\n");
		count = 1;
		while(true) {
			int age;
			System.out.println("Enter: N to quit.");
			entry = scanner.next();
			if (entry.equals("N")) {
				run = false; 
				break;
			}
			System.out.println("Adding Person #" + count);
			System.out.println("Type a Name:");
			paramNames[0] = scanner.next();
			System.out.println("Type a Age:");
			age = scanner.nextInt();
			Person person = new Person(paramNames[0], age);
			tm.put(person, person.getId());
			count++;
		}
		
		tm.forEach((k, v) -> {
			System.out.println("Person # " + ((Person)k).getId() +":"+ k.toString());
		});
		
		System.out.println("Set Test:\n");
		count = 1;
		System.out.println("Enter redundant numerical data to display as a unique set.");
		Set<String> set = new HashSet<String>();
		while(true) {
			System.out.println("Enter any key to continue OR 'N' to quit.");
			
			entry = scanner.next();
			if (entry.equals("N")) {
				run = false; 
				break;
			}
			String temp = "";
			System.out.println("Type in a binary Codeword (ex. 10101010):");
			temp = scanner.next();
			set.add(temp);
		}
		System.out.println("Unique Set:");
		System.out.println(set);
		System.out.println();
		System.out.println("Set to int:");
		set.forEach((k) -> {
			System.out.println("Binary Codeword:" + "'"+k+"'" + "is equivalent to " + Integer.parseInt(k,2));
		});
		System.out.println("End of Program");
		
	}
	
	

}
