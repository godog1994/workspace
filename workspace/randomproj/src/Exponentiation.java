/**
 * 
 * @author Alex Love
 * This is a Java program that can raise a base to an exponent. If the exponent is negative, the program will terminate and return 1. This program contains a power method that takes the parameters base and exponent.
 *
 */
public class Exponentiation
{
	
	 /**
	  * 
	  * @param base the number you want to raise to an exponent
	  * @param exponent the exponent you want to raise the base to
	  * @return result returns the end result of base to the power of exponent
	  */
	 public static int power(int base, int exponent)
		{
			
		 	int result = 1;
			
			for (; exponent > 0; exponent /= 2)
				
			{
				
				if (exponent % 2 != 0)
					result = (result * base);
				base = (base * base);
				
			}
			return result;
		}
	
}