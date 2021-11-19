public class Prism extends Triangle{

    private int h;

    public Prism(int a, int b, int c, int h) {
        super(a, b, c);
        this.setH(h);
    }

    public double getSurfaceArea() {
        return 4 * this.getArea();
    }

    public double getVolume() {
        return  ((double) 1 / 3) * this.getArea() * this.getH();
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getH() {
        return this.h;
    }

}
