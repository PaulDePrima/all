public class TournamentRunner
{
	public static void main(String[] args)
	{
		
		TournamentOfficial T = new TournamentOfficial();
		SoccerTeam A = new SoccerTeam(T);
		SoccerTeam B = new SoccerTeam(T);
		SoccerTeam C = new SoccerTeam(T);
		SoccerTeam D = new SoccerTeam(T);
		int score1;
		int score2;
		
		A.played(B, 2, 6);
		A.played(C, 3, 1);
		A.played(D, 6, 4);
		B.played(C, 2, 9);
		B.played(D, 3, 12);
		C.played(D, 6, 8);
		
		score1=T.GetGames();
		score2=T.GetGoals();
		System.out.println("Team A scored " + A.points());
		System.out.println("Team B scored " + B.points());
		System.out.println("Team C scored " + C.points());
		System.out.println("Team D scored " + D.points());
		System.out.println("The Total Games that were played is " + score1);
		System.out.println("The Total goals scored is " + score2);
		
	}
}