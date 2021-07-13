package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;

public class Controller {

    @FXML
    private Circle myCircle;
    private double x;
    private double y;

    public void up(ActionEvent event) {
        // System.out.println("UP");
        myCircle.setCenterY(y -= 10);
    }

    public void down(ActionEvent event) {
        // System.out.println("DOWN");
        myCircle.setCenterY(y += 10);
    }

    public void right(ActionEvent event) {
        // System.out.println("RIGHT");
        myCircle.setCenterX(x += 10);
    }

    public void left(ActionEvent event) {
        // System.out.println("LEFT");
        myCircle.setCenterX(x -= 10);
    }

}
