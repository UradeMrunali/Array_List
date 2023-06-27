import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Assign8 {
	public static void main(String[] args) {
		List<String> s=new ArrayList<String>();
		
		Scanner sc =new Scanner(System.in);
		
		s.add("Red");
		s.add("Green");
		s.add("Orange");
		s.add("White");
		s.add("Black");
		
		
		System.out.println("List before sort:"+ s);
		
		Collections.sort(s);
		
		System.out.println("List after sort:"+ s);
	}
}
