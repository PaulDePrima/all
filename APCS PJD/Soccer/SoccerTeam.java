public class SoccerTeam
{
	private int wins;
	private int losses;
	private int ties;
	private TournamentOfficial t;
	
	public SoccerTeam()
	{
		wins = 0;
		losses = 0;
		ties = 0;
	}
	
	public SoccerTeam(TournamentOfficial other)
	{
		t = other;
		wins = 0;
		losses = 0;
		ties = 0;
	}
	
	public void SetWins()
	{
		wins = wins + 1;
	}
	
	public int GetWins()
	{
		return wins;
	}
	
	public void SetLosses()
	{
		losses = losses + 1;
	}
	
	public int GetLosses()
	{
		return losses;
	}
	
	public void SetTies()
	{
		ties = ties + 1;
	}
	
	public int GetTies()
	{
		return ties;
	}
	
	public void played(SoccerTeam other, int MyScore, int otherScore)
	{
		t.SetGames();
		for(int i = 0; i <MyScore + otherScore; i++)
		{
			t.SetGoals();
		}
		if(MyScore > otherScore)
		{
			SetWins();
			other.SetLosses();
		}
		else if(MyScore<otherScore)
		{
			SetLosses();
			other.SetWins();
		}
		else
		{
			SetTies();
			other.SetTies();
		}
	}
	
	public int points()
	{
		int point = (3*GetWins())+GetTies();
		return point;
	}
	
	public void reset()
	{
		wins = 0;
		losses = 0;
		ties = 0;
	}
	
	
	
	
}