package dummy;

import java.lang.reflect.Array;

public class SringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="MADAM";
		int size=s.length()-1;
		int k=0;

		while (k<size)
		{
		if(s.charAt(k)!=s.charAt(size))
		{
		System.out.println("String is not palindrome");
		}

		k++;
		size--;

		}
		System.out.println("String is palindrome");

		
	}

}
