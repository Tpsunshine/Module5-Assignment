package edurekaJavaAssignments;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap_Employee {
	
	public static void main(String[] args) {
		Employee e1 = new Employee (1, "Paul", "R&D");
		Employee e2 = new Employee (2, "Simon", "Admin");
		Employee e3 = new Employee (3, "Mary", "Training");
		Employee e4 = new Employee (4, "Jane", "Learning");
		Employee e5 = new Employee (5, "Mike", "Sales");
		
		HashMap <Integer, Employee> h1 = new HashMap <Integer, Employee>();
		
		//Add records to the hashmap.
		h1.put(1, e1);
		h1.put(2, e2);
		h1.put(3, e3);
		h1.put(4, e4);
		h1.put(5, e5);
		
		//Display the employee records which are stored in hasmap.
		Set<Entry<Integer, Employee>> set = h1.entrySet();
		// Display the set
		for(Entry<Integer, Employee> me : set) {
			System.out.print(me.getKey() + ": ");
			System.out.print(me.getValue().name);
			System.out.print(" " + me.getValue().dept );
			
			
		}
	}
}
