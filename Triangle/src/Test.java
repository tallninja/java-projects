import javax.swing.*;

public class Test {

    public static void main(String[] args) {

        Triangle triangle = new Triangle(3, 4, 5);
        Prism prism = new Prism(3, 4, 5, 6);

        String message = String.format("Triangle: a = %d, b = %d, c = %d %nTriangle Perimeter: %d %nTriangle Area: %.4f" +
                                       "%n%nPrism: a = %d, b = %d, c = %d, h = %d %nPrism Surface Area: %.4f %nPrism Volume: %.4f",
                                        triangle.getA(), triangle.getB(), triangle.getC(), triangle.getPerimeter(), triangle.getArea(),
                                        prism.getA(), prism.getB(), prism.getC(), prism.getH(), prism.getSurfaceArea(), prism.getVolume());

        JOptionPane.showMessageDialog(null, message);

    }

}
