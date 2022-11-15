package programs.string;

public class DuplicateCharacters 
{
	public static void main(String[] args) 
	{
		String s = "print only duplicate characters";

		int count; 
		char[] str=s.toCharArray(); //convert character array

		System.out.print("Duplicare characters are:");
		//count character
		for(int i=0; i<str.length-1;i++)
		{
			  count = 1;  
			//with characters
			for(int j=i+1;j<str.length;j++)
			{
				//if duplicate increase count and assign 'O'
				if(str[i]==str[j]&& str[i]!=' ')
				{
					count++; 
					str[j]='0';
				}
			}
			//if count greater than one then they are duplicates
			if(count > 1 && str[i]!='0')
				System.out.print(" "+str[i]);
		}

	}

}
