import java.io.*; 
import java.util.*; 

class GFG { 
	
	
	public static void printStrongNess(String input) 
	{ 
		
		int n = input.length(); 
		boolean hasLower = false, hasUpper = false, 
				hasDigit = false, specialChar = false; 
		Set<Character> set = new HashSet<Character>( 
			Arrays.asList('!', '@', '#', '$', '%', '^', '&', 
						'*', '(', ')', '-', '+')); 
		for (char i : input.toCharArray()) 
		{ 
			if (Character.isLowerCase(i)) 
				hasLower = true; 
			if (Character.isUpperCase(i)) 
				hasUpper = true; 
			if (Character.isDigit(i)) 
				hasDigit = true; 
			if (set.contains(i)) 
				specialChar = true; 
		} 
		
 
		System.out.print("Strength of password:- "); 
		if (hasDigit && hasLower && hasUpper && specialChar 
			&& (n >= 8)) 
			System.out.print(" Strong"); 
		else if ((hasLower || hasUpper || specialChar) 
				&& (n >= 6)) 
			System.out.print(" Moderate"); 
		else
			System.out.print(" Weak"); 
	} 


	public static void main(String[] args) 
	{ 
		String input = "GeeksforGeeks!@12"; 
		printStrongNess(input); 
	} 

	
} 

