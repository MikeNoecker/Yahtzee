//use math class to gen rand not random class
import java.util.Random;
public class Die
{
	//public vars
	private int roll = 0;

	//constructor used to create dice
	public void die()
	{
		this.roll();
	}

	//method to roll dice
	public int roll()
	{
		Random rand = new Random();
		roll = rand.nextInt(6) + 1;
		return roll;
	}

	//method used to get the value of die
	public int getValue()
	{
		//return roll;
		return roll;
	}
}
