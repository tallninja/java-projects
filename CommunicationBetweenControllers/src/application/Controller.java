package application;


import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {

    @FXML
    Label nameLabel;

    public void displayName(String userName) {
        nameLabel.setText("Hello: " + userName);
    }

}
