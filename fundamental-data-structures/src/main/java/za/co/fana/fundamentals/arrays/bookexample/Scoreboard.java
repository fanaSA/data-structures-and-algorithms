package za.co.fana.fundamentals.arrays.bookexample;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author Fana Sithole
 *         Written on 2017/03/25
 */
public class Scoreboard {

    private GameEntry[] board;
    private int numEntries = 0;

    public Scoreboard(int capacity) {
        board = new GameEntry[capacity];
    }

    public void addEntry(GameEntry entry) {
        if (board[0] == null) {
            board[0] = entry;
            numEntries++;
            return;
        }

        int newScore = entry.getScore();
        if (numEntries < board.length ||newScore > board[numEntries-1].getScore()){
            if (numEntries < board.length) // no score drops from the board
                numEntries++; // so overall number increases

            // shift any lower scores rightward to make room for the new entry
            int j = numEntries-1;
            while (j > 0 && board[j-1].getScore() < newScore){
                board[j] = board[j-1]; // shift entry from j-1 to j
                j--; // and decrement j
        }
        board[j] = entry; // when done, add new entry
        }
    }

    public void print(){
        Stream<GameEntry> entryStream = Arrays.stream(board);
        System.out.println("Scoreboard Entries");
        entryStream.forEach(System.out::println);
    }
}
