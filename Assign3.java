import java.util.ArrayList;
import java.util.List;

public class Assign3 {
	public static void main(String[] args) {
		List<String> s=new ArrayList<String>();
		
		s.add("Red");
		s.add("Green");
		s.add("Orange");
		s.add("White");
		s.add("Black");
		
		System.out.println(s);
		s.add(0, "Pink");
		s.add(5, "Yellow");
		System.out.println(s);
	
}
}
