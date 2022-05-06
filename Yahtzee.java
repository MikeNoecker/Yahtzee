/*Mike Noecker, period 7, 5-11-21, This is my own code MDN, This program will play a game of Yahtzee*/
public class Yahtzee
{
	private Die[] dice;
	private int[] count;

	//creates die objects and stores them in dice array
	public Yahtzee()
	{
		dice = new Die[5];
		for(int i = 0; i < 5; i++)
		{
			dice[i] = new Die();
		}

		count = new count[6]; //************????????????????**************
		updateCount();
	}

	//rolls all of the dice
	//store every die object inside an array then use the roll random method to roll all
	public void rollAllDice()
	{
		for(int i = 0; i < dice.length; i++)
			dice[i].roll();
	}

	//rolls one die at a time
	public void rollADie(int dieNum)
	{
		dice[dieNum - 1].roll();//***was rolling die 4, fixed now?***
	}

	//gets the value of one die
	public int getADie(int dieNum)
	{
		return dice[dieNum - 1].getValue();
		//************fixed?*****************
	}

	//shows the value of all of the dice
	public String showDice()
	{
		for(int i = 0; i < dice.length; i++)
			System.out.print(dice[i] + " ");

		System.out.println("\n+------+---+---+---+---+---+");
		System.out.println("| Dice | 1 | 2 | 3 | 4 | 5 |");
		System.out.println("+------+---+---+---+---+---+");
		System.out.println("| Face | " + dice[0].getValue() + " | " + dice[1].getValue() + " | " + dice[2].getValue() + " | " + dice[3].getValue() + " | " + dice[4].getValue() + " |");
		System.out.println("+------+---+---+---+---+---+");
		return "";
	}

	//counts the number of occurrences of a number rolled
	private int countUp(int value)
	{
		int occurrences = 0;

		for(int i = 0; i < dice.length;i++)//*****dice.size()?****
		{
			if(dice[i].getValue() == value)//very good chance that an equals method will be needed
				occurrences++;
		}
		return occurrences;
	}

	//updates the value of count
	private void updateCount()
	{
		for(int i = 0; i < 6; i++)
		{
			count[i] = countUp(i + 1);
			System.out.println("Number of " + (i + 1) + "s rolled: " + count[i]);
		}
	}



}



/*die class
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
		return roll;
	}
	*/