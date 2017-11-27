public class Cat
{

	private String name;
	private int age;
	private String owner;
	
		
	public Cat()
	{
	}
	
	public Cat(String own, int ag)
	{
		owner = own;
		age = ag;
	}
	
	public Cat(String own, int ag, String nm)
	{
		owner = own;
		age = ag;
		name = nm;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String n)
	{
		name = n;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public String getOwner()
	{
		return owner;
	}
	
	public void eat(String food)
	{
		System.out.println(name +" just ate "+ food);
	}
}
