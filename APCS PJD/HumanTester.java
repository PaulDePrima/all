public class HumanTester
{
	public static void main(String[] args)
	{
		Human h1 = new Human("bob", "male");
		System.out.println(h1.getName());
		
		Human h2 = h1;
		h2.setName("Bill");
		System.out.println(h1.getName());
		//Location l2 = h1.walk(2);
		
	}
}