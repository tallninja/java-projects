public class TriangularPrism extends Shape3D {

    private double area;
    private double volume;
    private int a, b, h;

    public TriangularPrism(int a, int b, int h) {
        this.setA(a);
        this.setB(b);
        this.setH(h);
        this.setArea();
        this.setVolume();
    }

    @Override
    public String toString() {
        return String.format("TriangularPrism{a: %d, b: %d, h: %d, area: %.4f, volume: %.4f}",
                this.getA(), this.getB(), this.getH(), this.getArea(), this.getVolume());
    }

    @Override
    void setArea() {
        this.area = (this.getA() * this.getB()) + (3 * this.getB() * this.getH());
    }

    @Override
    void setVolume() {
        this.volume = (double) (1 / 2) * this.getA() * this.getB() * this.getH();
    }

    @Override
    public double getArea() {
        return this.area;
    }

    @Override
    public double getVolume() {
        return this.volume;
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
