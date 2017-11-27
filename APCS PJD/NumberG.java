public class NumberG
{
	public static void main(String[] args)
	{
		int x = Integer.parseInt(args[0]);
		int y=0;
		if(x<=10&&x>=1)
		{
			int z = 0;
			while(y != x)
			{
				y = (int)(Math.random() *10+1);
				z++;
			}
			System.out.println(z);
		}
	}
}