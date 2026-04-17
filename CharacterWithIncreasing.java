public class CharacterWithIncreasing {
    public static void main(String[] args)
    {
        	for(int i=1, ch='A';i<=5;i++)
		    {
			for(int j=1;j<=i;j++) {
				System.out.print((char)ch++);   // if ch-- then it will print in reverse order
				
			}
			System.out.println();
		}
    }
    
}
