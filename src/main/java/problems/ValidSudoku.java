package problems;

import java.util.HashSet;

/**
 * Created by Jason Wu on 2017/8/30.
 */
public class ValidSudoku {
    /*
    * @param board: the board
    * @return: whether the Sudoku is valid
    */
    private int SIZE = 9;
    public boolean isValidSudoku(char[][] board) {
        // write your code here
        HashSet<Character> set1;
        HashSet<Character> set2;
        HashSet<Character> set3;
        for (int i = 0; i < SIZE; i++) {
            set1 = new HashSet<>();
            set2 = new HashSet<>();
            set3 = new HashSet<>();
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j] != '.' && !set1.add(board[i][j])) {
                    return false;
                }

                if (board[j][i] != '.' && !set2.add(board[j][i])) {
                    return false;
                }

                int block_row = i / 3;
                int block_col = i % 3;
                if (board[block_row * 3 + j / 3][block_col * 3 + j % 3] != '.' &&
                        !set3.add(board[block_row * 3 + j / 3][block_col * 3 + j % 3])) {
                    return false;
                }
            }
        }
        return true;
    }

}
