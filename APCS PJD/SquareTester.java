//program to check whether a number is a perfect square
public class SquareTester
{
	public static void main(String [] args)
	{
		if(args.length < 1)
		{
			System.out.println("Please include a number as a runtime parameter.");
			return;
		}
		int n = Integer.parseInt(args[0]);
		if(n < 1)
		{
			System.out.println("The runtime parameter must not be less than 1.");
			return;
		}
		System.out.println(isPerfectSquare(n));
	}
	
	//returns true if n is a perfect square and false otherwise
	public static boolean isPerfectSquare(int n)
	{
		int sum = 0;
		for(int i = 1; i<n; i=i+2)
		{
			sum = i+sum;
			if(n == sum)
			{
				return true;
			}
		}
		return false;
	}
}