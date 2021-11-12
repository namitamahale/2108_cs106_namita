package exercise_10;
public class GameLogic {
    private final static String[] gameScoreChoice = {"Love", "15", "30", "40", "Deuce", "Advantage", "Game", "Set"};
 
    private String playerA;
    private String playerB;
 
    public GameLogic(String playerA, String playerB) {
        this.playerA = playerA;
        this.playerB = playerB;
    }
 
    public String setScore() {
        if (playerA.equalsIgnoreCase("Fred")) {
            this.playerA = gameScoreChoice[0];
        }
        if (playerB.equalsIgnoreCase("Bob")) {
            this.playerB = gameScoreChoice[0];
        }
        return "Fred: " + playerA + ", " + "Bob: " + playerB;
    }
}
 