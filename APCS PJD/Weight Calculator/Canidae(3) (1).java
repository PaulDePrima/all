/*
*  This class represents animals of the family Canidae.
*  @author Mrs. Adams.
*/

public class Canidae
{
	private String genus;
	public String species;
	private int age;
	private Range range;
	
	public Canidae(String g, String s)
	{
		genus = g;
		species = s;
	}

	public String getGenus()
	{
		return genus;
	}

	public String getSpecies()
	{
		return species;
	}

	public Range getRange()
	{
		return range;
	}

	public void setGenus(String g)
	{
		genus = g;
	}

	public String setSpecies(String s)
	{
		species = s;
		return Species;
	}

	public void setAge(int a)
	{
		age = a
	}
}