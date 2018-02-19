public class Board {

  private int[][] board;

  public Board() {
    board = new int[4][4];
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        board[i][j] = 0;
      }
    }
  }

  public Board(int[][] board) {
    this.board = board;
  }

  public void draw() {
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

  public void start() {
    for (int i = 0; i < 2; i++) {
      spawn();
    }
  }

  public void spawn() {
    boolean spawn = false;
    int i, j;
    while (!spawn) {
      i = (int)(Math.random() * 4);
      j = (int)(Math.random() * 4);
      if (board[i][j] == 0) {
        board[i][j] = Math.random() < 0.9 ? 2 : 4;
        spawn = true;
      }
    }
  }

}
