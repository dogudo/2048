public class _2048 {

  public static void main (String args[]) {
    int[][] test = {{2,16,128,1024},
                     {2048,4,32,256},
                     {512,1024,8,64},
                     {16,128,2018,2}};
    Board board = new Board();
    board.start();
    board.draw();
  }

}
