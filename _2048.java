public class _2048 {

  public static void drawBoard(int[][] board) {
    System.out.println("┌────┬────┬────┬────┐");
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) {
        System.out.print("│");
        if (board[i][j] < 10) {
          System.out.print("  " + board[i][j] + " ");
        } else if (board[i][j] < 100) {
          System.out.print(" " + board[i][j] + " ");
        } else if (board[i][j] < 1000) {
          System.out.print(" " + board[i][j]);
        } else {
          System.out.print(board[i][j]);
        }
      }
      System.out.println("│");
      if (i != 3) {
        System.out.println("├────┼────┼────┼────┤");
      } else {
        System.out.println("└────┴────┴────┴────┘");
      }
    }
  }

  public static void main (String args[]) {
    int[][] board = {{2,16,128,1024},
                     {2048,4,32,256},
                     {512,1024,8,64},
                     {16,128,2018,2}};
    drawBoard(board);
  }

}
