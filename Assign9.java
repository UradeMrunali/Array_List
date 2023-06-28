import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Assign9 {
	public static void main(String[] args) {
		List s=new ArrayList();
		
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		
		
		List s1=new ArrayList();
		s1.add('A');
		s1.add("B");
		s1.add("C");
		s1.add("D");
		
		
		Collections.copy(s, s1);
		
		System.out.println("List 1:"+ s);
		System.out.println("List 2:"+ s1);
	}
}
