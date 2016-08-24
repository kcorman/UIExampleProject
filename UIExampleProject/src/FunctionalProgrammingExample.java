import java.util.ArrayList;
import java.util.List;

public class FunctionalProgrammingExample {
	
	public static void main(String[] args) {
		List myList = new ArrayList();
		myList.add(5);
		myList.add("Foo");
		Integer x = (Integer) myList.get(1);
		
	}
	
	public static class ThingPrinter {
		
		public void print(Object s) {
			System.out.println(s);
		}
	}
}
