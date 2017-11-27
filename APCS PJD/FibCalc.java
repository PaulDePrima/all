//Program to calculate and print the nth number of the Fibonacci Sequence: 1, 1, 2, 3, etc.
public class FibCalc
{
	public static void main(String[] args)
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
		System.out.println(calcFibonacci(n));
	}
	
	//Returns the nth Fibonacci number.
	//Precondition: n >= 1
	public static long calcFibonacci(int n)
	{
		if(n == 1 || n == 2)
		{
			return 1;
		}
		long prev2=1;
		long prev=1;
		long neww=1;
		for(int i = 0; i<n-2; i++)
		{
			neww = prev2 + prev;
			prev2 = prev;
			prev = neww;
		}
		return neww;
	}
}