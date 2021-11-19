import javax.swing.*;
import java.awt.*;

public class Board extends JPanel {

    private final int BOARD_HEIGHT = 320;
    private final int BOARD_WIDTH = 320;
    private final int SIZEX = 8;
    private final int SIZEY = 8;


    private void display(Graphics g) {
        Graphics2D g2d =  (Graphics2D) g;

        int height = BOARD_HEIGHT / SIZEY; //40
        int width = BOARD_WIDTH / SIZEX; // 40

        for(int row = 0; row < SIZEX; row++) {
            int x, y;
            for(int col = 0; col < SIZEY; col++) {

                x = row * BOARD_WIDTH / SIZEX;
                y = col * BOARD_HEIGHT / SIZEY;

                if((row % 2 == 0) == (col % 2 == 0)) {
                    g2d.setColor(Color.BLACK);
                } else {
                    g2d.setColor(Color.WHITE);
                }

                g2d.fillRect(x, y, height, width);

            }
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        display(g);
    }

}
