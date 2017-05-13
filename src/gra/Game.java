package gra;

/**
 * Created by jpokr on 2017-04-28.
 */
public class Game {

    private String winner;
    private String[][] board = new String[3][3];
    private final String CROSS = "Krzyzyk";
    private final String CIRCLE = "Kolko";

    public void play() {
        while (true) {
            //todo logic for a game
        }
    }
    public String getWinner(){
        return winner;
    }

    public void makeAMove(String symbol, int i, int j) throws IllegalArgumentException {
        if (isCorrectSymbol(symbol) && isCorrectIndex(i, j)) {

            board[i][j] = symbol;
            verticalSearch(symbol);
            horizontalSearch(symbol);
            diagonalLeftSearch(symbol);
            diagonalRightSearch(symbol);
        } else {
            throw new IllegalArgumentException();
        }
    }
    public String[][] getBoard(){
        return board;
    }

    private void initBoard() {
        board[0][0] = CIRCLE;
        board[0][1] = CIRCLE;
        board[0][2] = CROSS;
        board[1][0] = CIRCLE;
        board[1][1] = CROSS;
        board[1][2] = CIRCLE;
        board[2][0] = CROSS;
        board[2][1] = CROSS;
        board[2][2] = CIRCLE;
    }

    private void verticalSearch(String symbol) {
        int counter = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == symbol) {
                    counter++;
                    winner(counter, symbol);
                }
            }
            counter = 0;
        }
    }

    private void horizontalSearch(String symbol) {
        int counter = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[j][i] == symbol) {
                    counter++;
                    winner(counter, symbol);
                }
            }
            counter = 0;
        }
    }

    private void diagonalLeftSearch(String symbol) {
        int counter = 0;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == symbol) {
                counter++;
                winner(counter, symbol);
            }
        }
    }

    private void diagonalRightSearch(String symbol) {
        int counter = 0;
        for (int i = 0, j = 2; i < board.length; i++, j--) {
            if (board[i][j] == symbol) {
                counter++;
                winner(counter, symbol);
            }
        }
    }

    private void winner(int counter, String winner) {
        if (counter == 3) {
    this.winner=winner;
        }
    }

    private boolean isCorrectSymbol(String symbol) {
        return CIRCLE.equals(symbol) || CROSS.equals(symbol);
    }

    private boolean isCorrectIndex(int i, int j) {
        return i < board.length && j < board[i].length;
    }
}

