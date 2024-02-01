/**
 * CPSC 233 W24 Assignment 1 Starter to use to make Board.java
 * @author Jonathan Hudson
 * @email jwhudson@ucalgary.ca
 * @version 1.0
 */
public class Board {

    /**
     * No piece in board (empty)
     */
    public static final int EMP = Game.EMP;
    /**
     * Connect-L Red Piece
     */
    public static final int RED = Game.RED;
    /**
     * Connect-L Blue Piece
     */
    public static final int BLU = Game.BLU;

    //Students should enter their functions below here
    public static int[][] createBoard(int rows, int columns){
        int[][] board = new int [rows][columns];
        for(int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++) {
                board[i][j] = 0;
            }
        }

        return board;
    }
    public static int rowCount(int[][] board){
        return board.length;
    }

    public static int columnCount(int[][] board){
        return board[0].length;
    }

    public static boolean valid(int[][] board, int row, int column){
        int rowCount = rowCount(board);
        int columnCount = columnCount(board);

        return row>=0 && row<rowCount && column>=0 && column < columnCount;
    }

    public static boolean canPlay(int[][] board, int column){
        for (int i = 0; i < board.length; i++ ){
            if (board[i][column] == 0){
                return true;
            }
        }
        return false;
    }

    public static int play (int[][] board, int column, int piece){
        int rowCount = rowCount(board);
        for (int row = rowCount - 1; row>= 0 ; row--){
            if (board[row][column]==0){
                board[row][column] = piece;
                return row;
            }
        }
        return -1;
    }

    public static int removeLastPlay (int[][] board, int column){
        int rowCount = rowCount(board);
        for (int row = 0; row < rowCount; row++){
            if (board[row][column] != 0){
                int removedPiece = board[row][column];
                board[row][column] = 0;
                return row;
            }
        }
        return -1;
    }

    public static boolean full (int[][] board){
        for (int i = 0; i<board.length; i++){
            for(int j = 0; j<board[i].length; j++){
                if (board[i][j] == 0);
                return false
            }
        }
        return true;
    }

    public static boolean winInRow (int[][] board, int row, int piece, int length){

    }

    //Students should enter their functions above here
    /**
     * Is there a win in given board in any row of board
     *
     * @param board The 2D array board of size rows (dimension 1) and columns (dimension 2)
     * @param piece The piece to look for length in a row for any row
     * @return True if there is length in any row, False otherwise
     */
    private static boolean winInAnyRow(int[][] board, int piece, int length) {
        for (int row = 0; row < board.length; row++) {
            if (winInRow(board, row, piece, length)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Is there a win in given board in any column of board
     *
     * @param board The 2D array board of size rows (dimension 1) and columns (dimension 2)
     * @param piece The piece to look for length in a row for any column
     * @return True if there is length in any column, False otherwise
     */
    private static boolean winInAnyColumn(int[][] board, int piece, int length) {
        for (int col = 0; col < board[0].length; col++) {
            if (winInColumn(board, col, piece, length)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Is there a win in given board in any diagonal of board
     *
     * @param board The 2D array board of size rows (dimension 1) and columns (dimension 2)
     * @param piece The piece to look for length in a row for any diagonal
     * @return True if there is length in any diagonal /\, False otherwise
     */
    private static boolean winInAnyDiagonal(int[][] board, int piece, int length) {
        return winInDiagonalBackslash(board, piece, length) || winInDiagonalForwardSlash(board, piece, length);
    }

    /**
     * Has the given piece won the board
     *
     * @param board The 2D array board of size rows (dimension 1) and columns (dimension 2)
     * @param piece The piece to check for a win
     * @return True if piece has won
     */
    public static boolean won(int[][] board, int piece, int length) {
        return winInAnyRow(board, piece, length) || winInAnyColumn(board, piece, length) || winInAnyDiagonal(board, piece, length);
    }

    /**
     * This function determines if the game is complete due to a win or tie by either player
     *
     * @param board The 2D array board of size rows (dimension 1) and columns (dimension 2)
     * @return True if game is complete, False otherwise
     */
    public static boolean isGameOver(int[][] board, int length) {
        return full(board) || won(board, RED, length) || won(board, BLU, length);
    }
}
