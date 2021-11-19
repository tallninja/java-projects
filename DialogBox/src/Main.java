import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("What is your name ?");
        String message = String.format("Hello %s Welcome to my java program", name);
        JOptionPane.showMessageDialog(null, message, "Info", 2);
    }

}
