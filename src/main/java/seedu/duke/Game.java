package seedu.duke;
import seedu.duke.exceptions.InvalidTTMoveException;

/**
 * Game class with 2 subclasses TicTacToe and HangMan
 * Contains methods for handling running of game and showing of game guide
 */
public class Game {
    protected static final Render render = new Render();
    private static final TimerTutorial tutorial = new TimerTutorial();
    protected static final Ui ui = new Ui(render, tutorial);
    protected boolean isExit; // true to exit
    protected String gameName;
    protected int gameOutcome; //0 for lose, 1 for win, 2 for draw (TTT only), 3 for quit.
    /**
     * creates a game
     *
     * @param line is used to set the gameName of the game
     */
    public Game(String line) {
        gameName = line;
        isExit = false; //not used for nw
        gameOutcome = 0;
        assert (gameOutcome == 0);
    }

    /**
     * runs game for respective class.
     * overridden in TicTacToe and HangMan
     * @throws InvalidTTMoveException if input for TTT game is not 1-9
     */
    public int runGame() throws InvalidTTMoveException {
        return 0;
    }

    /**
     * displays game guide when 'guide' is inputted
     * overridden in TicTacToe and Hangman
     */
    public void howToPlay() {
        ui.println(Ui.LINE);
        ui.println("Let me explain the rules of this game:");
    }

    public void gameWon() {
        this.gameOutcome = 1;
    }

    public void gameQuit() {
        this.gameOutcome = 3;
    }

    public void gameDraw() {
        this.gameOutcome = 2;
    }
}

