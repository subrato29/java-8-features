package arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteration {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		
		//Iteration using java8 with forEach and lambda
		System.out.println("Iteration using java8 with forEach and lambda");
		list.forEach(alphabet -> System.out.println(alphabet));
		
		System.out.println("Iteration using java8 forEachRemaining");
		Iterator <String> itr = list.iterator();
		itr.forEachRemaining(alpha -> System.out.println(alpha));
		
		System.out.println("for each loop");
		for (String alpha : list) {
			System.out.println(alpha);
		}
	}

}
