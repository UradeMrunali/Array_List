import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Assign7 {
   
	public static void main(String[] args) {
		List<String> s=new ArrayList<String>();
		
		Scanner sc =new Scanner(System.in);
		
		s.add("Red");
		s.add("Green");
		s.add("Orange");
		s.add("White");
		s.add("Black");
		
		System.out.println("Ënter the element you want to found:");
		String element = sc.nextLine();
		
		
            if (s.contains((element)) ){
              
                System.out.println("Found the element");
                
            }
		
		
		else {
            System.out.println( "Not found");
        }
}

}