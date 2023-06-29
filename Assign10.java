import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Assign10 {
	public static void main(String[] args) {
		List s=new ArrayList();
		
		s.add("Red");
		s.add("Green");
		s.add("Orange");
		s.add("White");
		s.add("Black");
		

		System.out.println("List before shuffling:"+ s);
		
		Collections.shuffle(s);
		
		System.out.println("List after shuffling:"+ s);
	}
}
