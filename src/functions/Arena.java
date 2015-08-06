package functions;

import java.util.HashMap;

public class Arena 
{
	private functions.Player ball;
	
	public static void displayBall()
	{
		
	}
	
	public static void displayScore()
	{
		System.out.println(functions.Game.getCurrentGameScore());
	}
	
	public static void displayHighScores()
	{
		HashMap<Integer, Integer> display = new HashMap<Integer, Integer>();
		display = functions.Game.getHighScores();
		
		for(int i = 0; i < constants.GameConstants.NUMBER_OF_HIGH_SCORES; i++)
			System.out.println(i + ": " + display.get(i));
	}
}
