import java.util.Scanner;

public class _2048 {

  public static void main (String args[]) {
    Scanner reader = new Scanner(System.in);
    char c;

    Board board = new Board();

    board.start();

    while (!board.over()) {
      board.draw();
      c = reader.next().charAt(0);
      board.move(c);
    }
  }

}
