package programs.string;

public class Characters 
{
	public static void main(String[] args) 
	{
		int max = 0; //maximum occurrence counts
		String str = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG"; //input string
		
		str = str.replace(" ", "");	//remove space
		char[] ch = str.toCharArray(); //create character array
		int[] ar = new int[26]; //count value store in alphabets position
		
		//to count no. of characters
		for(int i=0; i<ch.length; i++)
			ar[ch[i]-65]++; 
	
		//traverse array to store max value
		for(int i=0; i<ar.length;i++)
			if(max<ar[i])
				max=ar[i];

		//traverse array to check where max value available
		for(int i=0; i<ar.length;i++)
		{
			char c;
			if(max==ar[i])
			{ 
				c=(char) (i+65);
				System.out.println("Maximum occurring character is: "+c);
			}
		}
	}
}
