import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class ScreenSaver extends JPanel {
    private static int count = 1;
    private float r,gr,b;
    private int x1,y1,x2,y2;
    private int width,height;

    @Override
    public void paintComponent(Graphics g) {
        if(count==100) {
            count = 1;
        }
        count++;
        r = (float)Math.random(); //For int vals use (int) (Math.random()*256)
        gr = (float)Math.random();
        b = (float)Math.random();
        g.setColor(new Color(r,gr,b));
        width = getWidth();
        height = getHeight();
        x1 = (int) (Math.random()*width);
        x2 = (int) (Math.random()*width);
        y1 = (int) (Math.random()*height);
        y2 = (int) (Math.random()*height);
        g.drawLine(x1, y1, x2, y2);
        repaint();
    }
}