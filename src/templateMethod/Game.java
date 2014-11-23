package templateMethod;


/**
 * An abstract class that is common to several games in
 * which players play against the others, but only one is
 * playing at a given time.
 */
 
public abstract class Game {
 
    protected abstract void initializeGame();
    protected abstract void makePlay(int player);
    protected abstract boolean endOfGame();
    protected abstract void printWinner();
 
    /* A template method : */
    public final void playOneGame(int playersCount) {
        initializeGame();
        int j = 0;
        while (!endOfGame()) {
            makePlay(j);
            j = (j + 1) % playersCount;
        }
        printWinner();
    }

}