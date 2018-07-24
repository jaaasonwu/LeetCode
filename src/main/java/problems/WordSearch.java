package problems;

public class WordSearch {
    public boolean exist(char[][] board, String word) {
        boolean[][] visited = new boolean[board.length][board[0].length];

        char first = word.charAt(0);
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == first) {
                    if (word.length() == 1) {
                        return true;
                    }
                    visited[i][j] = true;
                    if (search(board, visited, word.toCharArray(),1, i, j)) {
                        return true;
                    }
                    visited[i][j] = false;
                }
            }
        }
        return false;
    }

    private boolean search(char[][] board, boolean[][] visited, char[] word, int index, int i, int j) {
        if (index == word.length - 1) {
            if ((i > 0 && !visited[i - 1][j] && word[index] == board[i - 1][j])
                    || (i < board.length - 1 && !visited[i + 1][j] && word[index] == board[i + 1][j])
                    || (j > 0 && !visited[i][j - 1] && word[index] == board[i][j - 1])
                    || (j < board[0].length - 1 && !visited[i][j + 1] && word[index] == board[i][j + 1])) {
                return true;
            } else {
                return false;
            }
        }

        int newI, newJ;
        if (i > 0 && !visited[i - 1][j] && word[index] == board[i - 1][j]) {
            newI = i - 1;
            newJ = j;
            if (search2(board, visited, word, index, newI, newJ)) {
                return true;
            }
        }

        if (i < board.length - 1 && !visited[i + 1][j] && word[index] == board[i + 1][j]) {
            newI = i + 1;
            newJ = j;
            if (search2(board, visited, word, index, newI, newJ)) {
                return true;
            }
        }

        if (j > 0 && !visited[i][j - 1] && word[index] == board[i][j - 1]) {
            newI = i;
            newJ = j - 1;
            if (search2(board, visited, word, index, newI, newJ)) {
                return true;
            }
        }

        if (j < board[0].length - 1 && !visited[i][j + 1] && word[index] == board[i][j + 1]) {
            newI = i;
            newJ = j + 1;
            if (search2(board, visited, word, index, newI, newJ)) {
                return true;
            }
        }

        return false;
    }

    private boolean search2(char[][] board, boolean[][] visited, char[] word, int index, int i, int j) {
        visited[i][j] = true;
        if (search(board, visited, word, index + 1, i, j)) {
            return true;
        } else {
            visited[i][j] = false;
        }
        return false;
    }
}
