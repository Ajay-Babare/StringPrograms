package programs.string;

import java.util.Arrays;

public class RemoveDuplicates 
{
	public static void main(String[] args) 
	{
		String s = "remove duplicate from the string"; //input string

		char[] str = s.toCharArray(); //convert to character array
		
		int index=0;
		
		//traverse array
		for(int i=0; i<str.length; i++)
		{
			int j;
			
			//check duplicates
			for( j=0; j<i; j++)
				if(str[i]==str[j])
				break;
			
			//complete execution match not found store value in char array
			if(j==i)
				str[index++]=str[i];
		}	
		System.out.println(String.valueOf(Arrays.copyOf(str, index)));
	}
}
