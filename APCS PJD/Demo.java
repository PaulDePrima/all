public class Demo
{
	private static int y;
	
	public static void main(String[] args)
	{
		int x = 7;
		System.out.println(x);
		myMethod(x);
		System.out.println(x);
		
		y = 8;
		System.out.println(y);
		myMethod2();
		System.out.println(y);
	}
	
	public static void myMethod(int number)
	{
		number = 0;
	}
	
	public static void myMethod2()
	{
		y = 2;
	}
}