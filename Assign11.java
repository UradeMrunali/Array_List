import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Assign11 {
	public static void main(String[] args) {
		List s=new ArrayList();
		
		s.add("Red");
		s.add("Green");
		s.add("Orange");
		s.add("White");
		s.add("Black");
		

		System.out.println("List before reversing:"+ s);
		
		Collections.reverse(s);
		
		System.out.println("List after reversing:"+ s);
	}
}
