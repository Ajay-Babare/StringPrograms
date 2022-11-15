package programs.string;

public class UniqueCharacters {

	public static void main(String[] args) 
	{
		boolean flag = false; //flag variable taken false
		
		String str = "algorithms"; //input string 
		char[] ch = str.toCharArray(); //convert to character array
		
		//sorting of array
	     for (int i = 0; i < ch.length - 1; i++)
	         for (int j = 0; j < ch.length - i - 1; j++)
	             if (ch[j] > ch[j + 1]) 
	             {
	                 char temp = ch[j];
	                 ch[j] = ch[j + 1];
	                 ch[j + 1] = temp;
	             }
	             
		//traverse array to check unique elements 
		for(int i=0; i<ch.length-1; i++)
			for(int j=i+1; j<ch.length; j++)
				if(ch[i]==ch[j])
					flag=true;
		
		//if string unique then flag variable remains false	
		if(flag==false)
			System.out.println("String is unique");
		else
			System.out.println("String is not Unique");
	}
}
