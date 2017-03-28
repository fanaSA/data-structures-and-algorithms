package za.co.fana.fundamentals.arrays.bookexample;

/**
 * @author Fana Sithole
 *         Written on 2017/03/25
 */
public class GameEntry {

    private final String name;
    private final int score;

    public GameEntry(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return name + ": " + score;
    }
}
