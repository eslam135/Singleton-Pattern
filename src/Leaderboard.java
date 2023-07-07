import java.util.ArrayList;
import java.util.List;

public class Leaderboard {
    private static Leaderboard instance;
    private static int score =0;
    private static List<String> playerNames = new ArrayList<>();
    private Leaderboard() {}

    public static Leaderboard getInstance() {
        if (instance == null) {
            instance = new Leaderboard();
        }
        return instance;
    }

    public void addScore(String playerName, int score) {
        System.out.println("Added score " + score + " for player " + playerName);
        Leaderboard.score += score;
        playerNames.add(playerName);
    }

    @Override
    public String toString() {
        return "Leaderboard{" +
                "score=" + score +
                ", playerNames=" + playerNames.get(0) +
                '}';
    }
}