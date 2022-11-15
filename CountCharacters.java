package programs.string;

public class CountCharacters
{
	static void checkType(String str)
	{
		int vowel = 0, consonant = 0, digit = 0, specialChar = 0;
		
		//traverse string
		for (int i=0; i< str.length();i++)
		{
			char ch = str.charAt(i);
			
			//check vowels and consonant
			if( (ch >= 'A' && ch <= 'Z') || 
					(ch >= 'a' && ch <= 'z'))
			{
				//count vowels
				if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' 
						|| ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
					vowel++;
				
				//count consonant
				else
					consonant++;
			}
			
			//count digit
			else if(ch >= '0' && ch <= '9')
				digit++;
			
			//count special characters 
			else if(ch != ' ')
				specialChar++;
		}
		System.out.println("Vowels:"+vowel);
		System.out.println("Consonants:"+consonant);
		System.out.println("Digits:"+digit);
		System.out.println("Special Characters:"+specialChar);
	}
	public static void main(String[] args) 
	{
		String str = "#1 This is a string";
		checkType(str);
	}
}
