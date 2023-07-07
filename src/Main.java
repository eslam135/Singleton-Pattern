public class Main {
    public static void main(String[] args) {
        Leaderboard leaderboard1 = Leaderboard.getInstance();
        Leaderboard leaderboard2 = Leaderboard.getInstance();
        leaderboard1.addScore("Player 1", 100);
        leaderboard2.addScore("Player 2", 200);
        System.out.println(leaderboard1);
        System.out.println(leaderboard1 == leaderboard2);
    }
}