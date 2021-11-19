package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField calcTextfield;

    @FXML
    private Button calcButton;

    @FXML
    private Button buttonClear, buttonEquals, buttonDivide, buttonMultiply, buttonAdd, buttonSubtract;

    private int operation;

    private float num1, num2, result;

    private float calculate(float num1, float num2, int operation) {
        switch (operation) {
            case 1:
                return num1 / num2;
            case 2:
                return num1 * num2;
            case 3:
                return num1 + num2;
            case 4:
                return num1 - num2;
            default:
                return 0;
        }
    }

    public void handleButtonClick(ActionEvent event) {
        if (event.getSource() == buttonClear) {
            calcTextfield.setText("0");
        } else if (event.getSource() == buttonEquals) {
            num2 = Float.parseFloat(calcTextfield.getText());
            result = calculate(num1, num2, operation);
            calcTextfield.setText("" + result);
        } else if (event.getSource() == buttonDivide) {
            operation = 1;
            num1 = Float.parseFloat(calcTextfield.getText());
            calcTextfield.setText("");
        } else if (event.getSource() == buttonMultiply) {
            operation = 2;
            num1 = Float.parseFloat(calcTextfield.getText());
            calcTextfield.setText("");
        } else if (event.getSource() == buttonAdd) {
            operation = 3;
            num1 = Float.parseFloat(calcTextfield.getText());
            calcTextfield.setText("");
        } else if (event.getSource() == buttonSubtract) {
            operation = 4;
            num1 = Float.parseFloat(calcTextfield.getText());
            calcTextfield.setText("0");
        } else {

            if (calcTextfield.getText().equals("0")) {
                calcTextfield.setText("");
            }
            calcButton = (Button) event.getSource();
            calcTextfield.setText("" + calcTextfield.getText() + calcButton.getText());

        }
    }
}
