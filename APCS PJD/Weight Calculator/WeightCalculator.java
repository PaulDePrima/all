public class WeightCalculator
{
	/**
	this class creates the input for the calculator and the converter numbers between
	each planet and weight
	**/
	public static void main (String[] args)
	{
		
		double wght = Double.parseDouble(args[0]);
		printPlanet(wght, 0.38, "Mars");
		printPlanet(wght, 2.36, "Jupiter");
		printPlanet(wght, 0.91, "Venus");
		printPlanet(wght, 1.06, "Saturn");
	}
	/**
	this method takes input via doubles and strings letting us change what is printed
	out with only 2 lines
	@param earth is weight on earth
	@param factor is the number we muiltiply earth by to get a new planet weight
	@param planet is a string that says the name of the planet with the new weight
	**/
	public static void printPlanet(double earth, double factor, String planet)
	{
		double wght = earth * factor;
		System.out.println(planet + ": " + wght);
	}
}