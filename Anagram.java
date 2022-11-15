package programs.string;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String s1 = "a gentleman"; //first string
		String s2 = "elegant man"; //second string
	
		s1 = s1.replace(" ", ""); //remove space from 1st string
		s2 = s2.replace(" ", ""); //remove space from 2nd string
		
		char[] ch1 = s1.toCharArray(); //covert 1st string to character array
		char[] ch2 = s2.toCharArray(); //covert 2nd string to character array
		
		//sorting of 1st array(string1)
	     for (int i = 0; i < ch1.length - 1; i++)
	         for (int j = 0; j < ch1.length - i - 1; j++)
	             if (ch1[j] > ch1[j + 1]) 
	             {
	                 char temp = ch1[j];
	                 ch1[j] = ch1[j + 1];
	                 ch1[j + 1] = temp;
	             }
	     
	   //sorting of 2nd array (string2)
	     for (int i = 0; i < ch2.length - 1; i++)
	         for (int j = 0; j < ch2.length - i - 1; j++)
	             if (ch2[j] > ch2[j + 1]) 
	             {
	                 char temp = ch2[j];
	                 ch2[j] = ch2[j + 1];
	                 ch2[j + 1] = temp;
	             }
		//check if both are equals
		if(Arrays.equals(ch1, ch2))
			System.out.println("Strings are anagram");
		else
			System.out.println("Strigs are not anagram");
	}

}
