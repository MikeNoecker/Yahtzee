//**********yahtzee driver class**********
/*
public class YahtzeeGame
{
	public static void main(String[] args)
	{
		Yahtzee yahtzee = new Yahtzee();


		yahtzee.rollAllDice();
		System.out.println(yahtzee.showDice());

		System.out.println("Get value of die number 3 is " + yahtzee.getADie(3));
		yahtzee.rollADie(3);
		System.out.println(yahtzee.showDice());
		System.out.println("After re-roll the die number 3: " + yahtzee.getADie(3));
	}
}
*/


public class YahtzeeGame
{
	public static void main(String[] args)
	{
		Yahtzee yahtzee = new Yahtzee();
		System.out.println(yahtzee.showDice());
	}
}



/*
public class YahtzeeGame
{
	public static void main(String[] args)
	{
		Yahtzee yahtzee = new Yahtzee();

		System.out.println(yahtzee.showDice());

		System.out.println("           Ones: " + yahtzee.getScoreOnes());
		System.out.println("           Twos: " + yahtzee.getScoreTwos());
		System.out.println("         Threes: " + yahtzee.getScoreThrees());
		System.out.println("          Fours: " + yahtzee.getScoreFours());
		System.out.println("          Fives: " + yahtzee.getScoreFives());
		System.out.println("          Sixes: " + yahtzee.getScoreSixes());
	}
}
*/



/*
public class YahtzeeGame
{
	public static void main(String[] args)
	{
		Yahtzee yahtzee = new Yahtzee();

		System.out.println(yahtzee.showDice());

		System.out.println("Three of a Kind: " + yahtzee.getScoreThreeOfAKind());
		System.out.println(" Four of a Kind: " + yahtzee.getScoreFourOfAKind());
		System.out.println("     Full House: " + yahtzee.getScoreFullHouse());
		System.out.println(" Small Straight: " + yahtzee.getScoreSmallStraight());
		System.out.println(" Large Straight: " + yahtzee.getScoreLargeStraight());
		System.out.println("         Chance: " + yahtzee.getScoreChance());
		System.out.println("        Yahtzee: " + yahtzee.getScoreYahtzee());
	}
}
*/