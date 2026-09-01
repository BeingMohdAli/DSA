package Recursion;

import java.util.Arrays;

public class SudokoSolver {

    public static void main(String[] args) {
        int[][] board = {
                {5,3,0, 0,7,0, 0,0,0},
                {6,0,0, 1,9,5, 0,0,0},
                {0,9,8, 0,0,0, 0,6,0},

                {8,0,0, 0,6,0, 0,0,3},
                {4,0,0, 8,0,3, 0,0,1},
                {7,0,0, 0,2,0, 0,0,6},

                {0,6,0, 0,0,0, 2,8,0},
                {0,0,0, 4,1,9, 0,0,5},
                {0,0,0, 0,8,0, 0,7,9}
        };

        if (solve(0, 0, board)) {
            for (int[] r : board) System.out.println(Arrays.toString(r));
        } else {
            System.out.println("No solution exists");
        }
    }

    /**
     * CONTRACT: every cell BEFORE (row, col), in left-to-right top-to-bottom
     * reading order, is already validly filled. This function tries to fill
     * (row, col) and everything after it. Returns true the moment a fully
     * solved board is reached, false if this starting point can never lead
     * to one.
     */
    static boolean solve(int row, int col, int[][] board) {

        // ---- BASE CASE ----
        // row == 9 means we've walked past the last row of the last column,
        // so every cell is filled. MUST return here -- this is the exact
        // bug from the original: skip the return and row=9 falls into the
        // loop below, and board[9][...] doesn't exist.
        if (row == board.length) {
            return true;
        }

        // ---- Compute the NEXT cell in reading order ----
        // This is the piece that's genuinely new versus N-Queens. There,
        // "next" was always just row+1. Here a row has 9 cells, so "next"
        // is usually the next column -- except at the last column, where
        // it wraps around to column 0 of the next row.
        int nextRow = (col == board.length - 1) ? row + 1 : row;
        int nextCol = (col == board.length - 1) ? 0 : col + 1;

        // Already given as a clue in the original puzzle? Nothing to choose
        // here -- just move straight on to the next cell.
        if (board[row][col] != 0) {
            return solve(nextRow, nextCol, board);
        }

        // ---- THE LOOP: try every candidate NUMBER for THIS cell ----
        // col says WHICH cell we're deciding. num is WHAT we try to put in
        // it -- two separate things. The original code advanced them
        // together in one loop header, so it never actually searched
        // candidates for a cell, it just skipped across the row.
        for (int num = 1; num <= 9; num++) {

            if (isValid(row, col, board, num)) {
                board[row][col] = num;              // make the choice

                // ---- THE LEAP OF FAITH ----
                // Trust solve() to correctly complete row/col onward,
                // GIVEN that this placement is valid.
                if (solve(nextRow, nextCol, board)) {
                    return true;
                    // Found a full solution downstream -- stop immediately.
                    // Do NOT undo, do NOT try more numbers here. This is
                    // the "stop as soon as you succeed" case from way back:
                    // we only want ONE solution, not every solution, so we
                    // don't backtrack past a success.
                }

                // ---- BACKTRACK (undo) ----
                // Only reached if the leap above returned false, meaning
                // num led nowhere. Reset the cell before trying the next
                // candidate number -- same reason as N-Queens: this array
                // is one shared, mutated object across every branch.
                board[row][col] = 0;
            }
        }

        // No number 1-9 worked for this cell -- genuine dead end.
        return false;
    }

    /**
     * True if placing x at (row, col) breaks no Sudoku rule against
     * whatever is already on the board.
     */
    private static boolean isValid(int row, int col, int[][] board, int x) {

        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == x) return false;   // same row
            if (board[i][col] == x) return false;   // same column
        }

        // same 3x3 box: round row/col down to that box's top-left corner
        int boxRow = (row / 3) * 3;
        int boxCol = (col / 3) * 3;
        for (int r = boxRow; r < boxRow + 3; r++) {
            for (int c = boxCol; c < boxCol + 3; c++) {
                if (board[r][c] == x) return false;
            }
        }

        return true;
    }
}