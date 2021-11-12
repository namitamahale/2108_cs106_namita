package exercise_10;

public class Main extends Scoreboard {
    Main(String player1name, String player2name) {
		super(player1name, player2name);
		// TODO Auto-generated constructor stub
		this.updateScore(player1name);
		this.updateScore(player2name);
		
	}

	public static void main(String[] args) {
        GameLogic gameLogic = new GameLogic("Fred", "Bob");
        Scoreboard score = new Scoreboard("tom", "cruiz");
        //score.currentScore();
        //score.displayScoreboard();
        //score.gameHasEnded();
       // score.isDuce();
       // score.updateScore("playerScored");
        System.out.println(score.currentScore());
        System.out.println(score.displayScoreboard());
        System.out.println( score.gameHasEnded());
        System.out.println(score.isDuce());
        System.out.println(score.updateScore("tom"));
        System.out.println(score.updateScore("sam"));
        System.out.println(gameLogic.setScore());
    }
	
}
 

 

