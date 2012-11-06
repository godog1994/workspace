package snippet;

public class Snippet {
	public static int pow(int base, int exponent, int m)
		{
			int res = 1 % m;
			for (; exponent > 0; exponent /= 2)
			{
				if (exponent % 2 != 0)
					res = (res * base) % m;
				base = (base * base) % m;
			}
			return res;
		}
	public static void main(String []args)
	{
		System.out.println(pow(5,3,130));
	}
}

