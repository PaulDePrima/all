public class  GCF
{
	public static void main(String[] args)
	{
		int common = gcf(36,12);
		System.out.println(common);
	}
	
	public static int gcf(int n, int b)
	{
		if(n>b)
		{
			return(gcf(n-b,b));
		}
		else if (n<b)
		{
			return(gcf(n,b-n));
			
		}
		else
		{
			return(n);
		}
	}
}