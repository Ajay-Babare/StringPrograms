package programs.string;

public class PalindromeNumber {

	public static void main(String[] args) {

		int userInput = 2552; //take number from user to check whether palindrome or not
		
		int originalNumber = userInput; // store user input in temporary variable to compare with reverse number
		int reverseNumber = 0; // to store digits in reverse order
		int lastDigit; // to store remainder
		
		while(userInput > 0) // loop execution till last digit
		{
			lastDigit = userInput%10; //getting remainder/last digit
			reverseNumber = reverseNumber*10 + lastDigit ; //collect in reverse order
			userInput = userInput/10; //after getting last digit remove it
		}
		
		if(originalNumber == reverseNumber) //check user input number is equals to reverse number
			System.out.println(originalNumber+" is a Palindrome Number");
		else
			System.out.println(originalNumber+" is not a Palindrome Number");

	}

}
