package functions;

public class Player 
{
	private static int m_lives;
	
	public Player()
	{
		m_lives = constants.GameConstants.INITIAL_LIVES;
	}
	
	public static void playerDied()
	{
		m_lives--;
	}
	
	public static boolean gameOver()
	{
		//if m_lives is 0, return true
		return (m_lives == 0) ? true: false;
	}
}

//Medium weight ball, suitable for beginning players
class BasketBall extends Player
{
	
}

//Heaviest ball
class BowlingBall extends Player
{
	
}

//Lightest ball
class VolleyBall extends Player
{
	
}
