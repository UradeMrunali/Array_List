import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Assign12 {
	public static void main(String[] args) {
		List s=new ArrayList();
		s.add("Red");
		s.add("Green");
		s.add("Orange");
		s.add("White");
		s.add("Black");
		System.out.println("List:"+ s);
		
		s.subList(0, 3);
		
		System.out.println("List of first three elements:"+ s.subList(0, 3));
	}
}
