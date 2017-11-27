public class Human
{
	//fields
	private String name;
	//private Location location;
	private String gender;
	
	public Human(String n, String g)
	{
		name = n;
		gender = g;
	}
	/*
	public Location walk(int speed)
	{
		for()
		{
			step();
		}
		Locatoin location = new Location();
		return location;
	}
	
	private void step()
	{
		
	}
	*/
	
	public String getName()
	{
		mystaticMethod(this);
		return this.name;
	}
	
	public void setName(String n)
	{
		name = n;
	}
	
	/*public Location getLocation()
	{
		return location;
	}
	
	public void setLocation(Location l)
	{
		location = l;
	}
	*/
}