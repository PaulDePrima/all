public class PopGrowth
{
	public static void main(String[] args)
	{
		double pop = 127500000;
		int year = 2016;
		double growth = 1.013;
		while(pop < 140000000)
		{
			pop = pop * growth;
			year++;
		}
		System.out.println("The year when the population is 140 million or higher is " + year);
	}
}