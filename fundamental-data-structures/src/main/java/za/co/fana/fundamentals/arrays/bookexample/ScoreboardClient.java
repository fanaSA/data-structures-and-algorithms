package za.co.fana.fundamentals.arrays.bookexample;

/**
 * @author Fana Sithole
 *         Written on 2017/03/25
 */
public class ScoreboardClient {

    public static void main(String[] args) {
        Scoreboard scoreboard = new Scoreboard(10);
        scoreboard.addEntry(new GameEntry("Fana", 1100));
        scoreboard.addEntry(new GameEntry("Zakes", 1200));
        scoreboard.addEntry(new GameEntry("Bheki", 1230));
        scoreboard.print();
    }
}
