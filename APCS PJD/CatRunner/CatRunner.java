import java.awt.Color;

public class CatRunner
{
	public static void main(String[] args)
	{
		Cat blake = new Cat();
		blake.setName("Mr Pickles");
		blake.eat("Chicken Soup");
		
		Cat dead = new Cat("skyler",-5,"it doesnt have a name its dead");
		dead.eat("nothing cuz its dead");
		
		Lion leo = new Lion();
		leo.setName("Leo");
		leo.setManeColor(Color.YELLOW);
		leo.roar();
		
		Lion death = new Lion("Jose",-2,"death");
		death.roar();
	}
}