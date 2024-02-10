import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
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

    @Test
    public void valid1() {
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

    @Test
    public void valid2() {
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

    @Test
    public void valid3() {
        int[][] board = {
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP},

        };

        assertTrue(Board.valid(board,3,3));
    }

    @Test
    public void valid4() {
        int[][] board = {
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},

        };

        assertTrue(Board.valid(board,4,7));
    }

    @Test
    public void valid5() {
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

        assertTrue(Board.valid(board,7,7));
    }

    @Test
    public void winInRow1(){
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
        assertTrue(Board.winInRow(board, 4, Board.BLU, 4));
    }

    @Test
    public void winInRow2(){
        int [][] board = {
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.BLU, Board.EMP, Board.RED, Board.EMP, Board.EMP},
                {Board.EMP, Board.BLU, Board.BLU, Board.BLU, Board.RED, Board.EMP, Board.EMP},
                {Board.RED, Board.RED, Board.RED, Board.RED, Board.RED, Board.RED, Board.BLU}

        };
        assertTrue(Board.winInRow(board, 6, Board.RED, 5));
    }

    @Test
    public void winInRow3(){
        int [][] board = {
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.RED, Board.RED, Board.EMP, Board.EMP, Board.EMP},
                {Board.RED, Board.RED, Board.RED, Board.RED, Board.RED, Board.EMP},
                {Board.RED, Board.BLU, Board.BLU, Board.BLU, Board.BLU, Board.EMP},


        };
        assertTrue(Board.winInRow(board, 3, Board.RED, 4));
    }

    @Test
    public void winInRow4(){
        int [][] board = {
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.BLU, Board.RED, Board.EMP},
                {Board.EMP, Board.BLU, Board.BLU, Board.BLU},
                {Board.EMP, Board.RED, Board.BLU, Board.RED},
                {Board.EMP, Board.RED, Board.BLU, Board.BLU},
                {Board.BLU, Board.RED, Board.RED, Board.RED}

        };
        assertTrue(Board.winInRow(board, 3, Board.BLU, 3));
    }

    @Test
    public void winInRow5(){
        int [][] board = {
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.RED, Board.EMP, Board.BLU, Board.EMP},
                {Board.EMP, Board.BLU, Board.BLU, Board.BLU, Board.BLU, Board.EMP},
                {Board.EMP, Board.RED, Board.BLU, Board.RED, Board.RED, Board.EMP},
                {Board.RED, Board.RED, Board.RED, Board.BLU, Board.BLU, Board.EMP},
                {Board.RED, Board.RED, Board.RED, Board.RED, Board.RED, Board.RED}

        };
        assertTrue(Board.winInRow(board, 7, Board.RED, 5));
    }

    @Test
    public void winInColumn1(){
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
        assertTrue(Board.winInColumn(board, 4, Board.BLU, 4));
    }

    @Test
    public void winInColumn2(){
        int [][] board = {
                {Board.EMP, Board.BLU, Board.BLU, Board.EMP},
                {Board.EMP, Board.RED, Board.BLU, Board.RED},
                {Board.EMP, Board.RED, Board.BLU, Board.BLU},
                {Board.BLU, Board.RED, Board.BLU, Board.RED}

        };
        assertTrue(Board.winInColumn(board, 2, Board.BLU, 4));
    }

    @Test
    public void winInColumn3(){
        int [][] board = {
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.RED, Board.RED, Board.EMP, Board.BLU, Board.EMP, Board.EMP},
                {Board.EMP, Board.RED, Board.BLU, Board.BLU, Board.BLU, Board.EMP, Board.EMP},
                {Board.EMP, Board.RED, Board.BLU, Board.RED, Board.BLU, Board.EMP, Board.EMP},
                {Board.EMP, Board.RED, Board.BLU, Board.BLU, Board.BLU, Board.BLU, Board.EMP},
                {Board.BLU, Board.RED, Board.RED, Board.RED, Board.BLU, Board.RED, Board.EMP}

        };
        assertTrue(Board.winInColumn(board, 1, Board.RED, 5));
    }

    @Test
    public void winInColumn4(){
        int [][] board = {
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.BLU, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.BLU, Board.EMP, Board.EMP},
                {Board.BLU, Board.RED, Board.BLU, Board.EMP, Board.EMP},
                {Board.RED, Board.BLU, Board.BLU, Board.BLU, Board.EMP},
                {Board.RED, Board.RED, Board.BLU, Board.RED, Board.EMP},
                {Board.RED, Board.RED, Board.BLU, Board.BLU, Board.EMP},
                {Board.BLU, Board.RED, Board.RED, Board.RED, Board.EMP}

        };
        assertTrue(Board.winInColumn(board, 2, Board.BLU, 6));
    }

    @Test
    public void winInColumn5(){
        int [][] board = {
                {Board.RED, Board.BLU, Board.BLU, Board.BLU, Board.BLU, Board.EMP, Board.EMP, Board.EMP},
                {Board.BLU, Board.RED, Board.BLU, Board.RED, Board.BLU, Board.EMP, Board.EMP, Board.EMP},
                {Board.BLU, Board.RED, Board.RED, Board.BLU, Board.RED, Board.BLU, Board.EMP, Board.EMP},
                {Board.BLU, Board.BLU, Board.RED, Board.RED, Board.BLU, Board.RED, Board.EMP, Board.EMP}

        };
        assertTrue(Board.winInColumn(board, 0, Board.BLU, 3));
    }

    @Test
    public void winInBackSlash1(){
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
        assertTrue(Board.winInDiagonalBackslash(board, Board.RED, 4));
    }

    @Test
    public void winInBackSlash2(){
        int [][] board = {
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.RED, Board.RED, Board.EMP, Board.BLU},
                {Board.EMP, Board.BLU, Board.RED, Board.BLU, Board.BLU},
                {Board.EMP, Board.RED, Board.BLU, Board.RED, Board.BLU},
                {Board.EMP, Board.RED, Board.BLU, Board.BLU, Board.RED},
                {Board.BLU, Board.RED, Board.RED, Board.RED, Board.BLU}

        };
        assertTrue(Board.winInDiagonalBackslash(board, Board.BLU, 3));
    }

    @Test
    public void winInBackSlash3(){
        int [][] board = {
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.RED, Board.EMP, Board.RED, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.RED, Board.RED, Board.EMP, Board.BLU, Board.EMP, Board.EMP},
                {Board.EMP, Board.BLU, Board.RED, Board.BLU, Board.BLU, Board.EMP, Board.EMP},
                {Board.EMP, Board.RED, Board.BLU, Board.RED, Board.BLU, Board.BLU, Board.EMP},
                {Board.EMP, Board.RED, Board.BLU, Board.BLU, Board.RED, Board.BLU, Board.RED},
                {Board.BLU, Board.RED, Board.RED, Board.BLU, Board.BLU, Board.RED, Board.EMP}

        };
        assertTrue(Board.winInDiagonalBackslash(board, Board.RED, 5));
    }

    @Test
    public void winInBackSlash4(){
        int [][] board = {
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.BLU, Board.EMP, Board.EMP},
                {Board.BLU, Board.RED, Board.RED, Board.EMP},
                {Board.RED, Board.BLU, Board.RED, Board.BLU},
                {Board.RED, Board.RED, Board.BLU, Board.RED},
                {Board.BLU, Board.RED, Board.BLU, Board.BLU},
                {Board.BLU, Board.RED, Board.RED, Board.RED}

        };
        assertTrue(Board.winInDiagonalBackslash(board, Board.BLU, 4));
    }

    @Test
    public void winInBackSlash5(){
        int [][] board = {
                {Board.EMP, Board.RED, Board.RED, Board.EMP, Board.BLU, Board.EMP, Board.EMP},
                {Board.EMP, Board.BLU, Board.RED, Board.BLU, Board.BLU, Board.EMP, Board.EMP},
                {Board.EMP, Board.RED, Board.BLU, Board.RED, Board.BLU, Board.RED, Board.EMP},
                {Board.EMP, Board.RED, Board.BLU, Board.BLU, Board.RED, Board.BLU, Board.RED},
                {Board.BLU, Board.RED, Board.RED, Board.RED, Board.BLU, Board.RED, Board.EMP}

        };
        assertTrue(Board.winInDiagonalBackslash(board, Board.RED, 4));
    }
}





