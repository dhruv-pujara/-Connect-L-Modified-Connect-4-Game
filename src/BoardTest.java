import org.junit.jupiter.api.Test;

import java.awt.print.PrinterIOException;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * CPSC 233 W24 Assignment 1 BoardTest Starter File
 * Holds a helper deep copy and example tests of deep copy
 * @author Jonathan Hudson
 * @email jwhudson@ucalgary.ca
 * @version 1.0
 */
public class BoardTest {

    /**
     * Used to make a copy of board before functions run, so that verify a function was non-destructive on board is easy
     *
     * @param board The board to make deep copy of
     * @return A deep copy of given board
     */
    public int[][] deepCopy(int[][] board) {
        int[][] copy = new int[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            copy[i] = Arrays.copyOf(board[i], board[i].length);
        }
        return copy;
    }

    @Test
    public void deepCopyTestWithoutDeepEquals() {
        int[][] expected = new int[][]{{0, 1}};
        int[][] actual = deepCopy(expected);
        assertEquals(expected[0][0], actual[0][0]);
        assertEquals(expected[0][1], actual[0][1]);
    }


    @Test
    public void deepCopyTestNoChange() {
        int[][] expected = new int[][]{{0, 1}};
        int[][] actual = deepCopy(expected);
        assertTrue(Arrays.deepEquals(expected, actual));
    }

    @Test
    public void deepCopyTestChangeEntryIn2D() {
        int[][] expected = new int[][]{{0, 1}};
        int[][] actual = deepCopy(expected);
        actual[0][0] = 99;
        assertTrue(!Arrays.deepEquals(expected, actual));
    }

    @Test
    public void deepCopyTestSet1DRefToDiffButIdenticalArray() {
        int[][] expected = new int[][]{{0, 1}};
        int[][] actual = deepCopy(expected);
        actual[0] = new int[]{0, 1};
        assertTrue(Arrays.deepEquals(expected, actual));
    }

    @Test
    public void deepCopyTestSet1DRefToDiffArray() {
        int[][] expected = new int[][]{{0, 1}};
        int[][] actual = deepCopy(expected);
        actual[0] = new int[]{0, 99};
        assertTrue(!Arrays.deepEquals(expected, actual));
    }

    // Checks if board created matches the input of 4 rows and 4 columns
    @Test
    public void createBoard4x4() {
        int[][] expected = new int[][]{
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP}
        };
        int[][] actual = Board.createBoard(4, 4);
        assertEquals(expected.length, actual.length);
        assertEquals(expected[0].length, actual[0].length);
    }

    // Checks if board created matches the input of 5 rows and 5 columns
    @Test
    public void createBoard5x5() {
        int[][] expected = new int[][]{
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP}
        };
        int[][] actual = Board.createBoard(5, 5);
        assertEquals(expected.length, actual.length);
        assertEquals(expected[0].length, actual[0].length);
    }

    // Checks if board created matches the input of 7 rows and 6 columns
    @Test
    public void createBoard7x6() {
        int[][] expected = new int[][]{
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP}
        };
        int[][] actual = Board.createBoard(7, 6);
        assertEquals(expected.length, actual.length);
        assertEquals(expected[0].length, actual[0].length);
    }

    // Checks if board created matches the input of 8 rows and 4 columns
    @Test
    public void createBoard8x4() {
        int[][] expected = new int[][]{
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP}
        };
        int[][] actual = Board.createBoard(8, 4);
        assertEquals(expected.length, actual.length);
        assertEquals(expected[0].length, actual[0].length);
    }

    // Checks if board created matches the input of 4 rows and 6 columns
    @Test
    public void createBoard4x6() {
        int[][] expected = new int[][]{
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
        };
        int[][] actual = Board.createBoard(4, 6);
        assertEquals(expected.length, actual.length);
        assertEquals(expected[0].length, actual[0].length);
    }

    // Checks if the actual row count of 7 matches the expected row count of 7
    @Test
    public void rowCount7() {
        int[][] board = {
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP}
        };

        int expectedRowCount = 7;
        int actualRowCount = Board.rowCount(board);

        assertEquals(expectedRowCount, actualRowCount);
    }

    // Checks if the actual row count of 4 matches the expected row count of 4
    @Test
    public void rowCount4() {
        int[][] board = {
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
        };

        int expectedRowCount = 4;
        int actualRowCount = Board.rowCount(board);

        assertEquals(expectedRowCount, actualRowCount);
    }

    // Checks if the actual row count of 8 matches the expected row count of 8
    @Test
    public void rowCount8() {
        int[][] board = {
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP}
        };

        int expectedRowCount = 8;
        int actualRowCount = Board.rowCount(board);

        assertEquals(expectedRowCount, actualRowCount);
    }

    // Checks if the actual row count of 6 matches the expected row count of 6
    @Test
    public void rowCount6() {
        int[][] board = {
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP}
        };

        int expectedRowCount = 6;
        int actualRowCount = Board.rowCount(board);

        assertEquals(expectedRowCount, actualRowCount);
    }

    // Checks if the actual row count of 5 matches the expected row count of 5
    @Test
    public void rowCount5() {
        int[][] board = {
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP}
        };

        int expectedRowCount = 5;
        int actualRowCount = Board.rowCount(board);

        assertEquals(expectedRowCount, actualRowCount);
    }

    // Checks if the actual column count of 6 matches the expected row count of 6
    @Test
    public void columnCount6() {
        int[][] board = {
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP}
        };

        int expectedColumnCount = 6;
        int actualColumnCount = Board.columnCount(board);

        assertEquals(expectedColumnCount, actualColumnCount);
    }

    // Checks if the actual column count of 5 matches the expected row count of 5
    @Test
    public void columnCount5() {
        int[][] board = {
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
        };

        int expectedColumnCount = 5;
        int actualColumnCount = Board.columnCount(board);

        assertEquals(expectedColumnCount, actualColumnCount);
    }


    // Checks if the actual column count of 4 matches the expected row count of 4
    @Test
    public void columnCount4() {
        int[][] board = {
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP}

        };

        int expectedColumnCount = 4;
        int actualColumnCount = Board.columnCount(board);

        assertEquals(expectedColumnCount, actualColumnCount);
    }

    // Checks if the actual column count of 8 matches the expected row count of 8
    @Test
    public void columnCount8() {
        int[][] board = {
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP}

        };

        int expectedColumnCount = 8;
        int actualColumnCount = Board.columnCount(board);

        assertEquals(expectedColumnCount, actualColumnCount);
    }

    // Checks if the actual column count of 7 matches the expected row count of 7
    @Test
    public void columnCount7() {
        int[][] board = {
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP}

        };

        int expectedColumnCount = 7;
        int actualColumnCount = Board.columnCount(board);

        assertEquals(expectedColumnCount, actualColumnCount);
    }

    // Checks if the created board is valid and in range of maximum dimensions
    @Test
    public void valid6x7() {
        int[][] board = {
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP}

        };

        assertTrue(Board.valid(board,5,6));
    }

    // Checks if the created board is valid and in range of maximum dimensions
    @Test
    public void valid8x5() {
        int[][] board = {
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP}
        };

        assertTrue(Board.valid(board,7,4));
    }

    // Checks if the created board is valid and in range of maximum dimensions
    @Test
    public void valid4x4() {
        int[][] board = {
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP},

        };

        assertTrue(Board.valid(board,3,3));
    }

    // Checks if the created board is valid and in range of maximum dimensions
    @Test
    public void valid5x8() {
        int[][] board = {
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},

        };

        assertTrue(Board.valid(board,4,7));
    }

    // Checks if the created board is valid and in range of maximum dimensions, In this case is not therefore should return false
    @Test
    public void valid9x9() {
        int[][] board = {
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP}

        };

        assertFalse(Board.valid(board,9,9));
    }

    // Check if user can play when column is empty
    @Test
    public void CanPlayEmptyColumn() {
        int[][] board = {
                {Board.RED, Board.EMP, Board.EMP, Board.RED, Board.EMP, Board.EMP},
                {Board.RED, Board.BLU, Board.EMP, Board.BLU, Board.EMP, Board.EMP},
                {Board.BLU, Board.RED, Board.EMP, Board.BLU, Board.EMP, Board.EMP},
                {Board.BLU, Board.RED, Board.EMP, Board.BLU, Board.RED, Board.EMP},
                {Board.BLU, Board.RED, Board.EMP, Board.BLU, Board.RED, Board.EMP},
                {Board.BLU, Board.RED, Board.EMP, Board.BLU, Board.RED, Board.EMP},
                {Board.BLU, Board.RED, Board.EMP, Board.BLU, Board.RED, Board.EMP}
        };
        int column = 5;
        assertTrue(Board.canPlay(board, column));
    }

    // Check if user can play when column is full
    @Test
    public void CanPlayFullColumn() {
        int[][] board = {
                {Board.RED, Board.BLU, Board.RED, Board.RED, Board.RED},
                {Board.RED, Board.BLU, Board.RED, Board.RED, Board.BLU},
                {Board.BLU, Board.RED, Board.BLU, Board.RED, Board.RED},
                {Board.RED, Board.BLU, Board.RED, Board.RED, Board.RED},
                {Board.RED, Board.BLU, Board.RED, Board.RED, Board.BLU}
        };
        int column = 0;
        assertFalse(Board.canPlay(board, column));
    }

    // Check if user can play when column is partially full
    @Test
    public void CanPlayPartiallyFilledColumn() {
        int[][] board = {
                {Board.RED, Board.EMP, Board.EMP, Board.EMP},
                {Board.RED, Board.EMP, Board.EMP, Board.RED},
                {Board.BLU, Board.EMP, Board.EMP, Board.BLU},
                {Board.RED, Board.BLU, Board.EMP, Board.RED},
                {Board.BLU, Board.BLU, Board.EMP, Board.BLU},
                {Board.BLU, Board.BLU, Board.EMP, Board.BLU}
        };
        int column = 1;
        assertTrue(Board.canPlay(board, column));
    }

    // Check if the user can play with an empty board
    @Test
    public void CanPlayEmptyBoard() {
        int[][] board = {
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP}
        };
        int[] columns = {0, 1, 2, 3, 4, 5};
        for (int column: columns) {
            assertTrue(Board.canPlay(board, column));
        }
    }

    // Check when baord is full expect from one column
    @Test
    public void CanPlayFullBoardExceptColumn1(){
        int [][] board = {
                {Board.RED, Board.EMP, Board.BLU, Board.RED},
                {Board.RED, Board.BLU, Board.BLU, Board.RED},
                {Board.RED, Board.RED, Board.BLU, Board.RED},
                {Board.RED, Board.BLU, Board.BLU, Board.RED},
                {Board.RED, Board.BLU, Board.BLU, Board.RED}
        };
        int column = 1;
        assertTrue(Board.canPlay(board, column));
    }

    // Check to see the first piece played in an empty board
    @Test
    public void PlayEmptyBoard() {
        int[][] board = {
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP}
        };
        int column = 1;
        int piece = Board.RED;
        assertEquals(4, Board.play(board, column, piece));
        assertEquals(Board.RED,board[4][1]); //checks if piece was played at the right index
    }

    // Check to see that nothing changes when playing in a full column
    @Test
    public void PlayInFilledColumn() {
        int[][] board = {
                {Board.RED, Board.BLU, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.RED, Board.BLU, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.BLU, Board.RED, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.BLU, Board.RED, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.BLU, Board.RED, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.BLU, Board.RED, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
        };
        int column = 0;
        int piece = Board.RED;
        assertEquals(-1, Board.play(board, column, piece));
    }

    // Check to see piece played in a column has a few empty rows
    @Test
    public void PlayInHalfFilledColumn() {
        int[][] board = {
                {Board.RED, Board.BLU, Board.RED, Board.EMP, Board.EMP, Board.EMP},
                {Board.RED, Board.BLU, Board.RED, Board.EMP, Board.EMP, Board.EMP},
                {Board.BLU, Board.RED, Board.RED, Board.BLU, Board.EMP, Board.EMP},
                {Board.BLU, Board.RED, Board.RED, Board.RED, Board.EMP, Board.EMP}
        };
        int column = 3;
        int piece = Board.RED;
        assertEquals(1, Board.play(board, column, piece));
        assertEquals(Board.RED,board[1][column]); //checks if piece was played at that row and column
    }

    // To check piece played in a column that has only one empty row at the top
    @Test
    public void PlayFullColumnExceptFirstRow() {
        int[][] board = {
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.RED, Board.BLU, Board.RED, Board.BLU, Board.EMP},
                {Board.RED, Board.BLU, Board.RED, Board.BLU, Board.BLU},
                {Board.BLU, Board.RED, Board.BLU, Board.RED, Board.BLU}
        };
        int column = 2;
        int piece = Board.RED;
        assertEquals(0, Board.play(board, column, piece));
        assertEquals(Board.RED, board[0][2]); //checks if piece was played at that row and column
    }

    // Check to piece played in a column when entire board is filled
    @Test
    public void PlayFilledBoard() {
        int[][] board = {
                {Board.RED, Board.BLU, Board.BLU, Board.BLU, Board.BLU, Board.BLU},
                {Board.RED, Board.RED, Board.RED, Board.RED, Board.BLU, Board.BLU},
                {Board.RED, Board.BLU, Board.RED, Board.BLU, Board.BLU, Board.BLU},
                {Board.RED, Board.BLU, Board.RED, Board.BLU, Board.BLU, Board.BLU},
                {Board.RED, Board.BLU, Board.RED, Board.BLU, Board.BLU, Board.BLU},
                {Board.RED, Board.BLU, Board.RED, Board.BLU, Board.BLU, Board.BLU},
                {Board.BLU, Board.RED, Board.BLU, Board.RED, Board.BLU, Board.BLU}
        };
        int column = 1;
        int piece = Board.RED;
        assertEquals(-1, Board.play(board, column, piece));
    }

    // Check when removing a piece from an empty column
    @Test
    public void RemoveLastPlayInEmptyColumn() {
        int[][] board = {
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP}
        };
        int column = 2;
        assertEquals(-1, Board.removeLastPlay(board, column));
    }

    // Check when removing piece from a column with only one piece
    @Test
    public void RemoveLastPlaySinglePieceInColumn() {
        int[][] board = {
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.RED, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP}
        };
        int column = 0;
        assertEquals(5, Board.removeLastPlay(board, column));
        assertEquals(Board.EMP, board[5][0]); // Checking if piece was actually removed
    }

    // Check when removing a piece from a full board
    @Test
    public void RemoveLastPlayFromFullBoard() {
        int[][] board = {
                {Board.BLU, Board.BLU, Board.RED, Board.BLU, Board.BLU},
                {Board.RED, Board.BLU, Board.RED, Board.RED, Board.BLU},
                {Board.RED, Board.RED, Board.BLU, Board.RED, Board.BLU},
                {Board.RED, Board.BLU, Board.RED, Board.BLU, Board.RED},
                {Board.BLU, Board.BLU, Board.RED, Board.BLU, Board.BLU}
        };
        int column = 0;
        assertEquals(0, Board.removeLastPlay(board, column));
        assertEquals(Board.EMP, board[0][column]); // Checking if piece was actually removed
    }

    // Test when removing a piece from the middle of a column
    @Test
    public void RemoveLastFromSemiFilledColumn() {
        int[][] board = {
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.RED, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.RED, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.BLU, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP}
        };
        int column = 0;
        assertEquals(4, Board.removeLastPlay(board, column));
        assertEquals(Board.EMP, board[4][0]); // Confirming that the piece is removed from the correct position
    }

    // Check for removing a piece from an empty column
    @Test
    public void RemoveLastPlayFromEmptyColumn() {
        int[][] board = {
                {Board.RED, Board.EMP, Board.BLU, Board.BLU},
                {Board.RED, Board.EMP, Board.BLU, Board.BLU},
                {Board.RED, Board.EMP, Board.BLU, Board.BLU},
                {Board.BLU, Board.EMP, Board.BLU, Board.BLU},
                {Board.BLU, Board.EMP, Board.BLU, Board.BLU}
        };
        int column = 1;
        assertEquals(-1, Board.removeLastPlay(board, column));
    }

    // Check to see for a 5 x 5 filled board
    @Test
    public void Full5x5FullBoard() {
        int[][] board = {
                {Board.RED, Board.BLU, Board.RED, Board.BLU, Board.BLU},
                {Board.BLU, Board.RED, Board.BLU, Board.RED, Board.BLU},
                {Board.RED, Board.BLU, Board.RED, Board.BLU, Board.BLU},
                {Board.RED, Board.BLU, Board.RED, Board.BLU, Board.BLU},
                {Board.BLU, Board.RED, Board.BLU, Board.RED, Board.BLU}
        };
        assertTrue(Board.full(board));
    }

    // Check to see output for a 4 x 4 board with all empty positions
    @Test
    public void Full4x4EmptyBoard() {
        int[][] board = {
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP}
        };
        assertFalse(Board.full(board));
    }

    // Check to see output for an 8 x 6 board with all filled positions
    @Test
    public void Full8x6Board() {
        int[][] board = {
                {Board.RED, Board.BLU, Board.RED, Board.BLU, Board.BLU, Board.RED},
                {Board.BLU, Board.RED, Board.BLU, Board.RED, Board.RED, Board.BLU},
                {Board.RED, Board.BLU, Board.BLU, Board.BLU, Board.BLU, Board.RED},
                {Board.BLU, Board.RED, Board.BLU, Board.RED, Board.RED, Board.BLU},
                {Board.RED, Board.BLU, Board.BLU, Board.RED, Board.BLU, Board.RED},
                {Board.BLU, Board.RED, Board.BLU, Board.RED, Board.RED, Board.BLU},
                {Board.RED, Board.BLU, Board.RED, Board.BLU, Board.BLU, Board.RED},
                {Board.RED, Board.BLU, Board.RED, Board.BLU, Board.BLU, Board.RED}
        };
        assertTrue(Board.full(board));
    }


    // Check to see output for a 8 x 8 board with all empty positions
    @Test
    public void Full8x8EmptyBoard() {
        int[][] board = {
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP}

        };
        assertFalse(Board.full(board));
    }

    // TO check for a 6x6 partially filled board
    @Test
    public void Full6x6PartiallyFullBoard() {
        int[][] board = {
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.RED, Board.BLU, Board.BLU, Board.BLU, Board.RED, Board.EMP},
                {Board.BLU, Board.RED, Board.RED, Board.RED, Board.BLU, Board.EMP},
                {Board.RED, Board.BLU, Board.RED, Board.BLU, Board.RED, Board.EMP},
                {Board.RED, Board.BLU, Board.RED, Board.BLU, Board.RED, Board.EMP}
        };
        assertFalse(Board.full(board));
    }

    // Check for a horizontal win for length 4
    @Test
    public void winInRowLength4(){
        int [][] board = {
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.RED, Board.EMP, Board.BLU, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.BLU, Board.BLU, Board.BLU, Board.BLU, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.RED, Board.BLU, Board.RED, Board.RED, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.RED, Board.BLU, Board.BLU, Board.BLU, Board.EMP, Board.EMP, Board.EMP},
                {Board.BLU, Board.RED, Board.RED, Board.RED, Board.BLU, Board.EMP, Board.EMP, Board.EMP}

        };
        int piece = Board.BLU;
        assertTrue(Board.winInRow(board, 4, piece, 4));
    }

    // Check for a horizontal win for length 5
    @Test
    public void winInRowLength5(){
        int [][] board = {
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.BLU, Board.EMP, Board.RED, Board.EMP, Board.EMP},
                {Board.EMP, Board.BLU, Board.BLU, Board.BLU, Board.RED, Board.EMP, Board.EMP},
                {Board.RED, Board.RED, Board.RED, Board.RED, Board.RED, Board.RED, Board.BLU}

        };
        int piece = Board.RED;
        assertTrue(Board.winInRow(board, 6, piece, 5));
    }

    // Check for a horizontal win for length 3
    @Test
    public void winInRowLength3(){
        int [][] board = {
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.BLU, Board.BLU, Board.EMP, Board.EMP, Board.EMP},
                {Board.RED, Board.RED, Board.RED, Board.RED, Board.RED, Board.EMP},
                {Board.RED, Board.BLU, Board.BLU, Board.BLU, Board.BLU, Board.EMP},


        };
        int piece = Board.RED;
        assertTrue(Board.winInRow(board, 3, piece, 3));
    }

    // Check output for a win length of 3 without perpendicular L piece
    @Test
    public void winInRowNoWinLength3(){
        int [][] board = {
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.RED, Board.RED, Board.EMP},
                {Board.EMP, Board.BLU, Board.BLU, Board.BLU},
                {Board.EMP, Board.RED, Board.BLU, Board.RED},
                {Board.EMP, Board.BLU, Board.BLU, Board.BLU},
                {Board.BLU, Board.RED, Board.RED, Board.RED}

        };
        int piece = Board.BLU;
        assertFalse(Board.winInRow(board, 3, piece, 3));
    }

    // Check for a horizontal win for length 6
    @Test
    public void winInRowLength6(){
        int [][] board = {
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.RED, Board.EMP, Board.BLU, Board.EMP},
                {Board.BLU, Board.BLU, Board.BLU, Board.BLU, Board.BLU, Board.BLU},
                {Board.BLU, Board.RED, Board.BLU, Board.RED, Board.RED, Board.EMP},
                {Board.RED, Board.RED, Board.RED, Board.BLU, Board.BLU, Board.EMP},
                {Board.RED, Board.BLU, Board.RED, Board.RED, Board.RED, Board.RED}

        };
        int piece = Board.BLU;
        assertTrue(Board.winInRow(board, 4, piece, 6));
    }

    // Check for a vertical win for length 4
    @Test
    public void winInColumnLength4(){
        int [][] board = {
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.RED, Board.EMP, Board.BLU, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.BLU, Board.BLU, Board.BLU, Board.BLU, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.RED, Board.BLU, Board.RED, Board.BLU, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.RED, Board.BLU, Board.BLU, Board.BLU, Board.BLU, Board.EMP, Board.EMP},
                {Board.BLU, Board.RED, Board.RED, Board.RED, Board.BLU, Board.RED, Board.EMP, Board.EMP}

        };
        int piece = Board.BLU;
        assertTrue(Board.winInColumn(board, 4, piece, 4));
    }


    // Check for a vertical win for length 3
    @Test
    public void winInColumnLength3(){
        int [][] board = {
                {Board.EMP, Board.BLU, Board.BLU, Board.EMP},
                {Board.EMP, Board.RED, Board.BLU, Board.RED},
                {Board.EMP, Board.RED, Board.BLU, Board.BLU},
                {Board.BLU, Board.RED, Board.BLU, Board.RED}

        };
        int piece = Board.BLU;
        assertTrue(Board.winInColumn(board, 2, piece, 3));
    }


    // Check for a vertical win for length 5
    @Test
    public void winInColumnLength5(){
        int [][] board = {
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.RED, Board.RED, Board.EMP, Board.BLU, Board.EMP, Board.EMP},
                {Board.EMP, Board.RED, Board.BLU, Board.BLU, Board.BLU, Board.EMP, Board.EMP},
                {Board.EMP, Board.RED, Board.BLU, Board.RED, Board.BLU, Board.EMP, Board.EMP},
                {Board.EMP, Board.RED, Board.BLU, Board.BLU, Board.BLU, Board.BLU, Board.EMP},
                {Board.BLU, Board.RED, Board.RED, Board.RED, Board.BLU, Board.RED, Board.EMP}

        };
        int piece = Board.RED;
        assertTrue(Board.winInColumn(board, 1, piece, 5));
    }

    // Check output for a win length of 6 without perpendicular L piece
    @Test
    public void winInColumnNoWin(){
        int [][] board = {
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.BLU, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.BLU, Board.EMP, Board.EMP},
                {Board.BLU, Board.RED, Board.BLU, Board.EMP, Board.EMP},
                {Board.RED, Board.BLU, Board.BLU, Board.BLU, Board.EMP},
                {Board.RED, Board.RED, Board.BLU, Board.RED, Board.EMP},
                {Board.RED, Board.RED, Board.BLU, Board.RED, Board.EMP},
                {Board.BLU, Board.RED, Board.RED, Board.RED, Board.EMP}

        };
        int piece = Board.BLU;
        assertFalse(Board.winInColumn(board, 2, piece, 6));
    }


    // Check output for a win length of 3 without perpendicular L piece
    @Test
    public void winInColumnNoWin3(){
        int [][] board = {
                {Board.RED, Board.BLU, Board.BLU, Board.BLU, Board.BLU, Board.EMP, Board.EMP, Board.EMP},
                {Board.BLU, Board.RED, Board.BLU, Board.RED, Board.BLU, Board.EMP, Board.EMP, Board.EMP},
                {Board.BLU, Board.RED, Board.RED, Board.BLU, Board.RED, Board.BLU, Board.EMP, Board.EMP},
                {Board.BLU, Board.RED, Board.BLU, Board.RED, Board.BLU, Board.RED, Board.EMP, Board.EMP}

        };
        int piece = Board.BLU;
        assertFalse(Board.winInColumn(board, 0, piece, 3));
    }

    // Check output for backslash win with length 4
    @Test
    public void winInBackSlashLength4(){
        int [][] board = {
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.RED, Board.RED, Board.EMP, Board.BLU, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.BLU, Board.RED, Board.BLU, Board.BLU, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.RED, Board.BLU, Board.RED, Board.BLU, Board.RED, Board.EMP, Board.EMP},
                {Board.EMP, Board.RED, Board.BLU, Board.BLU, Board.RED, Board.BLU, Board.EMP, Board.EMP},
                {Board.BLU, Board.RED, Board.RED, Board.RED, Board.BLU, Board.RED, Board.EMP, Board.EMP}

        };
        int piece = Board.RED;
        assertTrue(Board.winInDiagonalBackslash(board, piece, 4));
    }


    // Check output for backslash win with length 3 and empty board
    @Test
    public void winInBackSlashLength3(){
        int [][] board = {
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP}

        };
        int piece = Board.BLU;
        assertFalse(Board.winInDiagonalBackslash(board, piece, 3));
    }

    // Check output for backslash win with length 5
    @Test
    public void winInBackSlashLength5(){
        int [][] board = {
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.RED, Board.EMP, Board.RED, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.RED, Board.RED, Board.EMP, Board.BLU, Board.EMP, Board.EMP},
                {Board.EMP, Board.BLU, Board.RED, Board.BLU, Board.BLU, Board.EMP, Board.EMP},
                {Board.EMP, Board.RED, Board.BLU, Board.RED, Board.BLU, Board.BLU, Board.EMP},
                {Board.EMP, Board.RED, Board.BLU, Board.BLU, Board.RED, Board.BLU, Board.RED},
                {Board.BLU, Board.RED, Board.RED, Board.BLU, Board.BLU, Board.RED, Board.EMP}

        };
        int piece = Board.RED;
        assertTrue(Board.winInDiagonalBackslash(board, piece, 5));
    }

    //Check output for a win length of 4 without perpendicular L piece
    @Test
    public void winInBackSlashNoWin4(){
        int [][] board = {
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.RED, Board.EMP, Board.EMP},
                {Board.BLU, Board.RED, Board.RED, Board.EMP},
                {Board.RED, Board.BLU, Board.RED, Board.BLU},
                {Board.RED, Board.RED, Board.BLU, Board.RED},
                {Board.BLU, Board.RED, Board.BLU, Board.BLU},
                {Board.BLU, Board.RED, Board.RED, Board.RED}

        };
        int piece = Board.BLU;
        assertFalse(Board.winInDiagonalBackslash(board, piece, 4));
    }

    //Check output for a win length of 3 without perpendicular L piece
    @Test
    public void winInBackSlashNoWin3(){
        int [][] board = {
                {Board.EMP, Board.RED, Board.RED, Board.EMP, Board.BLU, Board.EMP, Board.EMP},
                {Board.EMP, Board.BLU, Board.RED, Board.BLU, Board.BLU, Board.EMP, Board.EMP},
                {Board.EMP, Board.RED, Board.BLU, Board.RED, Board.BLU, Board.RED, Board.EMP},
                {Board.EMP, Board.RED, Board.BLU, Board.BLU, Board.BLU, Board.RED, Board.RED},
                {Board.BLU, Board.RED, Board.RED, Board.RED, Board.BLU, Board.RED, Board.EMP}

        };
        int piece = Board.RED;
        assertFalse(Board.winInDiagonalBackslash(board, piece, 3));
    }

    // Check output for forward slash win with length 3
    @Test
    public void WinInDiagonalForwardSlash3() {
        int[][] board = {
                {Board.RED, Board.EMP, Board.RED, Board.EMP},
                {Board.EMP, Board.RED, Board.EMP, Board.RED},
                {Board.RED, Board.EMP, Board.RED, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.RED},
                {Board.EMP, Board.EMP, Board.EMP, Board.RED},
                {Board.EMP, Board.EMP, Board.EMP, Board.RED}

        };
        assertTrue(Board.winInDiagonalForwardSlash(board, Board.RED, 3));
    }

    // Check output for forward slash win with length 5 in an empty board
    @Test
    public void WinInDiagonalForwardSlashEmptyBoard() {
        int[][] board = {
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP}
        };
        assertFalse(Board.winInDiagonalForwardSlash(board, Board.RED, 5));
    }

    // Check output for a forward slash with a win length of 4 but no perpendicular piece
    @Test
    public void WinInDiagonalForwardSlashNoWin4() {
        int[][] board = {
                {Board.RED, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.RED},
                {Board.EMP, Board.RED, Board.EMP, Board.EMP, Board.EMP, Board.RED, Board.EMP},
                {Board.EMP, Board.EMP, Board.RED, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.RED, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.RED, Board.EMP, Board.EMP},
        };
        assertFalse(Board.winInDiagonalForwardSlash(board, Board.RED, 4));
    }

    // Check to see output for a forward slash with win length 4 at the centre of the board
    @Test
    public void WinInDiagonalForwardSlashCentreWin() {
        int[][] board = {
                {Board.RED, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.RED},
                {Board.EMP, Board.RED, Board.EMP, Board.EMP, Board.EMP, Board.RED, Board.EMP},
                {Board.EMP, Board.EMP, Board.RED, Board.EMP, Board.RED, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.RED, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.RED, Board.EMP, Board.RED, Board.EMP, Board.EMP},
                {Board.EMP, Board.RED, Board.EMP, Board.EMP, Board.EMP, Board.RED, Board.EMP},
                {Board.RED, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.RED}
        };
        assertTrue(Board.winInDiagonalForwardSlash(board, Board.RED, 4));
    }



    // Check to see output for a forward slash with win length 4 at the edge of the board
    @Test
    public void WinInDiagonalForwardSlashWinOnEdge() {
        int[][] board = {
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.RED, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.RED},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.RED, Board.BLU},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.RED, Board.BLU, Board.BLU},
                {Board.EMP, Board.EMP, Board.EMP, Board.RED, Board.BLU, Board.RED, Board.BLU},
                {Board.EMP, Board.BLU, Board.RED, Board.BLU, Board.BLU, Board.BLU, Board.RED}
        };
        assertTrue(Board.winInDiagonalForwardSlash(board, Board.RED, 4));
    }

    // Check Hint for win in diagonal forward slash
    @Test
    public void HintDiagonalFS() {
        int[][] board = {
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.RED},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.RED, Board.BLU},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.RED, Board.BLU, Board.BLU},
                {Board.EMP, Board.EMP, Board.EMP, Board.RED, Board.BLU, Board.RED, Board.BLU},
                {Board.EMP, Board.RED, Board.RED, Board.BLU, Board.BLU, Board.BLU, Board.RED}
        };
        int[] expected = {5, Board.RED};
        assertArrayEquals(Board.hint(board,Board.RED,5),expected);
    }

    // Check output for empty board
    @Test
    public void HintEmptyBoard() {
        int[][] board = {
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP}
        };
        int piece = Board.RED;
        int length = 5;
        int[] expected = {-1, -1};
        assertArrayEquals(expected, Board.hint(board, piece, length));
    }

    // Check output for full board
    @Test
    public void testHintFullBoard() {
        int[][] board = {
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP}
        };
        int piece = Board.RED;
        int length = 4;
        int[] expected = {-1, -1};
        assertArrayEquals(expected, Board.hint(board, piece, length));
    }


    // Check output for a win in the diagonal backslash
    @Test
    public void HintWinDiagonalBackslash() {
        int[][] board = {
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.RED, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.BLU, Board.RED, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.RED},
                {Board.RED, Board.BLU, Board.RED, Board.EMP, Board.EMP, Board.BLU, Board.BLU},
                {Board.BLU, Board.RED, Board.BLU, Board.RED, Board.RED, Board.BLU, Board.BLU},
                {Board.EMP, Board.BLU, Board.BLU, Board.RED, Board.BLU, Board.RED, Board.BLU},
                {Board.EMP, Board.RED, Board.RED, Board.BLU, Board.BLU, Board.BLU, Board.RED}
        };
        int[] expected = {5, 1};
        assertArrayEquals(Board.hint(board,Board.RED,4),expected);
    }

    // Check output for win in column
    @Test
    public void testHintRow() {
        int[][] board = {
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.RED, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.RED, Board.RED, Board.EMP, Board.EMP},
                {Board.BLU, Board.RED, Board.BLU, Board.BLU, Board.BLU}
        };
        int[] expected = {5, 5};
        assertArrayEquals(Board.hint(board,Board.BLU,4),expected);
    }
}





