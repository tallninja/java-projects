public class Triangle {

    // a, b, c => these are the three sides of the triangle

    private int a;
    private int b;
    private int c;


    public Triangle(int a, int b, int c) {
        this.setA(a);
        this.setB(b);
        this.setC(c);
    }


    public int getPerimeter() {
        return this.getA() + this.getB() + this.getC();
    }

    public double getArea() {
        double s = (double) (this.getA() + this.getB() + this.getC()) / 2;
        return Math.sqrt(s * (s - this.getA()) * (s - this.getB()) * (s - this.getC()));
    }


    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getA() {
        return this.a;
    }

    public int getB() {
        return this.b;
    }

    public int getC() {
        return this.c;
    }

}
