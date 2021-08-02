package dummy;

import java.util.ArrayList;
import java.util.List;

public class Arraylistexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<String> s =new ArrayList<String>();
		
		
		s.add("akshit");
		s.add("akshit1");
		s.add("akshit2");
		s.add("akshit3");
		
		for(String s1:s)
		{
			System.out.print(s1);
			System.out.print("\t");
			StringBuilder sb=new StringBuilder(s1);
			System.out.print(sb.reverse());
			System.out.println("");
			
		}
		
	}
	

}
