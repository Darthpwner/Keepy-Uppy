package functions;
import java.util.HashMap;

public class Game 
{
	private static HashMap<Integer, Integer> m_highScores = new HashMap<Integer, Integer>();
	private static int m_currentGameScore;

	public Game()
	{

	}
	
	public static int getCurrentGameScore()
	{
		return m_currentGameScore;
	}
	
	public static HashMap<Integer, Integer> getHighScores()
	{
		return m_highScores;
	}
	
	public static void setHighScore()
	{
		if(m_currentGameScore > m_highScores.get(constants.GameConstants.FIRST_PLACE))
		{
			m_highScores.put(constants.GameConstants.FIRST_PLACE,  m_currentGameScore);
			return;
		}
		
		else if(m_currentGameScore > m_highScores.get(constants.GameConstants.SECOND_PLACE))
		{
			m_highScores.put(constants.GameConstants.SECOND_PLACE, m_currentGameScore);
			return;
		}
		
		else if(m_currentGameScore > m_highScores.get(constants.GameConstants.THIRD_PLACE))
		{
			m_highScores.put(constants.GameConstants.THIRD_PLACE, m_currentGameScore);
			return;
		}
		
		else if(m_currentGameScore > m_highScores.get(constants.GameConstants.FOURTH_PLACE))
		{
			m_highScores.put(constants.GameConstants.FOURTH_PLACE, m_currentGameScore);
			return;
		}
		
		else if(m_currentGameScore > m_highScores.get(constants.GameConstants.FIFTH_PLACE))
		{
			m_highScores.put(constants.GameConstants.FIFTH_PLACE, m_currentGameScore);
			return;
		}
		
		else if(m_currentGameScore > m_highScores.get(constants.GameConstants.SIXTH_PLACE))
		{
			m_highScores.put(constants.GameConstants.SIXTH_PLACE, m_currentGameScore);
			return;
		}
		
		else if(m_currentGameScore > m_highScores.get(constants.GameConstants.SEVENTH_PLACE))
		{
			m_highScores.put(constants.GameConstants.SEVENTH_PLACE, m_currentGameScore);
			return;
		}
		
		else if(m_currentGameScore > m_highScores.get(constants.GameConstants.EIGHTH_PLACE))
		{
			m_highScores.put(constants.GameConstants.EIGHTH_PLACE, m_currentGameScore);
			return;
		}
		
		else if(m_currentGameScore > m_highScores.get(constants.GameConstants.NINTH_PLACE))
		{
			m_highScores.put(constants.GameConstants.NINTH_PLACE, m_currentGameScore);
			return;
		}
		
		else if(m_currentGameScore > m_highScores.get(constants.GameConstants.NINTH_PLACE))
		{
			m_highScores.put(constants.GameConstants.NINTH_PLACE, m_currentGameScore);
			return;
		}
		
		else if(m_currentGameScore > m_highScores.get(constants.GameConstants.TENTH_PLACE))
		{
			m_highScores.put(constants.GameConstants.TENTH_PLACE, m_currentGameScore);
			return;
		}
	}

	public static void play()
	{
		while(!functions.Player.gameOver())
		{
			
		}
	}

}
