package dummy;

public class patternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for(int i=1; i<5; i++)
		{
			
			for(int j=1; j<=i; j++)
			{
				System.out.print(j);
				System.out.print("\t");
				
			}
			
			System.out.println("");
			
		}
		
		for(int l=4; l>0; l--)
		{
			
			for(int m=l; m>=1; m--)
			{
				System.out.print(m);
				System.out.print("\t");
				
			}
			
			System.out.println("");
			
		}		
	}

}




/*

1
1 2
1 2 3 
1 2 3 4
4 3 2 1
3 2 1 
2 1 
1      

*/