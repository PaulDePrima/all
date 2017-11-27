public class PasswordChecker
{
	public static void main(String[] args)
	{
		String input = args[0];
		if(input.equals("kitty"))
		{
			System.out.println("Correct");
		}
		else
		{
			System.out.println("Incorrect Password");
		}
	}
}