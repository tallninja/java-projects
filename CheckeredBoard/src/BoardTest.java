import javax.swing.*;

public class BoardTest {

    public static void main(String[] args) {
        Board board = new Board();
        JFrame app = new JFrame();
        app.add(board);
        app.setSize(320, 360);
        app.setVisible(true);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
