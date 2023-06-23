import java.util.ArrayList;
import java.util.List;

public class Assign4 {
	public static void main(String[] args) {
		List<String> s=new ArrayList<String>();
		
		s.add("Red");
		s.add("Green");
		s.add("Orange");
		s.add("White");
		s.add("Black");
		
		System.out.println(s);
		System.out.println("First element: "+s.get(0));
		System.out.println("Third element: "+s.get(2));
}
}