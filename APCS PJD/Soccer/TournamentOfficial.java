public class TournamentOfficial
{
	private int games;
	private int goals;
	public TournamentOfficial()
	{
		games = 0;
		goals = 0;
	}
	
	public void SetGames()
	{
		games = games + 1;
	}
	
	public int GetGames()
	{
		return games;
	}
	
	public void SetGoals()
	{
		goals = goals + 1;
	}
	
	public int GetGoals()
	{
		return goals;
	}
}