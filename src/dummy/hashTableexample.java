package dummy;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashTableexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable<Integer, String> hm= new Hashtable<Integer, String>();

		hm.put(0, "Akshit");
		hm.put(1, "Sahil");
		hm.put(2, "Ankur");
		hm.put(3, "Karan");
		hm.put(4, "Karan");
		
		
		
		//System.out.println(hm.get(4));
		
		
		Set s=hm.entrySet();
		
		Iterator it=s.iterator();
		
		while(it.hasNext())
		{
			Map.Entry mm=(Map.Entry)it.next();
			System.out.print(mm.getKey());
			System.out.print("\t");
			System.out.print(mm.getValue());
			System.out.println("");
		}
		
		
		
		
		
		
	}

}
