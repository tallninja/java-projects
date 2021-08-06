public class Parallelogram extends Shape2D {

    private int a, b, h;
    private double area;

    public Parallelogram(int a, int b, int h) {
        this.setA(a);
        this.setB(b);
        this.setH(h);
        this.setArea();
    }

    @Override
    public String toString() {
        return String.format("Parallelogram{a: %d, b: %d, h: %d, area: %.4f}",
                            this.getA(), this.getB(), this.getH(), this.getArea());
    }

    @Override
    public double getArea() {
        return this.area;
    }

    @Override
    public void setArea() {
        this.area = this.getB() * this.getH();
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

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }
}
