public class Triangle extends Shape2D{

    private int a, b, c;
    private double area;

    public Triangle(int a, int b, int c) {
        this.setA(a);
        this.setB(b);
        this.setC(c);
        this.setArea();

    }

    @Override
    public void setArea() {
        double s = (double) (this.getA() + this.getB() + this.getC()) / 2;
        this.area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double getArea() {
        return this.area;
    }

    @Override
    public String toString() {
        return String.format("Triangle{a: %d, b: %d, c: %d, area: %.4f}",
                this.getA(), this.getB(), this.getC(), this.getArea());
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

}
