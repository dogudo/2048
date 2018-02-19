import java.util.Scanner;

public class _2048 {

  public static void main (String args[]) {
    Scanner reader = new Scanner(System.in);
    char c;

    Board board = new Board();

    board.start();
    board.draw();
    while (!board.over()) {
      c = reader.next().charAt(0);
      board.move(c);
      board.draw();
    }
  }

}
