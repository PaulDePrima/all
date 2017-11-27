public class UnitConverter
{
	public static void main(String[] args)
	{
		for( int i = 0; i <3; i++)
		{
		condense(Double.parseDouble(args[i]));
		}
	}
	
	public static void condense(double distance)
	{
		double f;
		System.out.println("feet:" + distance);
		f = distance * 0.3048;
		System.out.println("meters:"+ f);
	}
}