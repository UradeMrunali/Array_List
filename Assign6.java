import java.util.ArrayList;
import java.util.List;

public class Assign6 {
  
	public static void main(String[] args) {
		List<String> s=new ArrayList<String>();
		
		s.add("Red");
		s.add("Green");
		s.add("Orange");
		s.add("White");
		s.add("Black");
		
		System.out.println(s);
		System.out.println("After removing third element from the list:");
		s.remove(2);
		System.out.println(s);
}
}
