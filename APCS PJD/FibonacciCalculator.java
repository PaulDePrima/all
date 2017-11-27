public class FibonacciCalculator
{
	public static void main(String[] args)
	{
		int thirdFib = calcFib(7);
		System.out.println(thirdFib);
	}
	
	public static int calcFib(int n)
	{
		if(n == 1 || n == 2)
		{
			return 1;
		}
		else
		{
			return calcFib(n-1) + calcFib(n-2);
		}
	}
}