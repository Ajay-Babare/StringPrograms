package programs.string;

public class Pangram 
{
	public static void main(String[] args) 
	{
		boolean flag = false; //flag variable taken false
		
		String str = "the quick brown fox jumps over the lazy dog"; //input string
		
		str = str.replace(" ", ""); //remove spaces
		char[] ch = str.toCharArray(); //string convert to character array
		int[] ar = new int[26]; //integer array for 26 alphabets
		
		//traverse array increase alphabet location value 
		for(int i=0; i<ch.length; i++)
			ar[ch[i]-97]++;
		
		//traverse array to check alphabet count zero 
		for(int i=0; i<ar.length; i++)
		{
			//then not pangram and change flag value
			if(ar[i]==0)
			{
				System.out.println("String is not a Pangram");
				flag = true;
				break;
			}
		}
		//flag value not change means pangram
		if(flag == false)
			System.out.println("String is a Pangram");
	}
}
