import java.util.Scanner;

public class TicTacToeState {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] board = new char[3][3];

        for (int i = 0; i < 3; i++) {
            String line = sc.next();
            for (int j = 0; j < 3; j++) {
                board[i][j] = line.charAt(j);
            }
        }

        String state = getGameState(board);
        System.out.println(state);
    }

    public static String getGameState(char[][] b) {
        for (int i = 0; i < 3; i++) {
            if (b[i][0] != '.' && b[i][0] == b[i][1] && b[i][1] == b[i][2]) {
                return b[i][0] == 'X' ? "Player X has won!" : "Player O has won!";
            }
            if (b[0][i] != '.' && b[0][i] == b[1][i] && b[1][i] == b[2][i]) {
                return b[0][i] == 'X' ? "Player X has won!" : "Player O has won!";
            }
        }

        if (b[0][0] != '.' && b[0][0] == b[1][1] && b[1][1] == b[2][2]) {
            return b[0][0] == 'X' ? "Player X has won!" : "Player O has won!";
        }
        if (b[0][2] != '.' && b[0][2] == b[1][1] && b[1][1] == b[2][0]) {
            return b[0][2] == 'X' ? "Player X has won!" : "Player O has won!";
        }

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (b[i][j] == '.')
                    return "Game is still in progress";

        return "Draw";
    }
}
