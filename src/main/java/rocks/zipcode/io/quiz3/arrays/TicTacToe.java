package rocks.zipcode.io.quiz3.arrays;

/**
 * @author yang shu
 */
public class TicTacToe {


    String[][] board;

    public TicTacToe(String[][] board) {
        this.board=board;
    }

    public TicTacToe() {
    }

    public String[] getRow(Integer value) {
        return new String[]{board[value][0],board[value][1],board[value][2]};
    }

    public String[] getColumn(Integer value) {
        return new String[]{board[0][value],board[1][value],board[2][value]};
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        return board[rowIndex][0].equals(board[rowIndex][1])&&board[rowIndex][1].equals(board[rowIndex][2]);
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        return board[0][columnIndex].equals(board[1][columnIndex])&&board[1][columnIndex].equals(board[2][columnIndex]);
    }

    public Boolean isDiagonal(){
        return board[0][0].equals(board[1][1])&&board[1][1].equals(board[2][2]) || board[2][0].equals(board[1][1])&&board[1][1].equals(board[0][2]);
    }

    public String getWinner() {
        String winner = "";
        for (int i = 0; i < 3; i++) {

            if (isRowHomogenous(i)) {
               winner= board[i][0];
            } else if (isColumnHomogeneous(i)) {
                winner= board[0][i];
            } else if(isDiagonal()){
                winner = board[1][1];
            }

        }
       return winner;
    }

    public String[][] getBoard(){
        return board;
    }
}
