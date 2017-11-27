public class HelloWorld
{
	public static void main(String[] args)
	{
		byte b = -128;
		System.out.println(b);
		b = (byte) (b * -1);
		System.out.println(b);
		
		int a = Integer.MIN_VALUE;
		System.out.println(a);
		a = a * -1;
		System.out.println(a);
		
		b = 127;
		System.out.println(b);
		b = (byte)(b+1);
		System.out.println(b);
		
		a = Integer.MAX_VALUE;
		System.out.println(a);
		a = a +1;
		System.out.println(a);
		
		double c = 1;
		for(int i = 0; i<20; i++)
		{
			c = c/1000;
			System.out.println(c);
		}
	}
}