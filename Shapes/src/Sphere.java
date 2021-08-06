public class Sphere extends Shape3D{

    private int radius;
    private double area, volume;

    public Sphere(int radius) {
        this.setRadius(radius);
        this.setArea();
        this.setVolume();
    }

    @Override
    public String toString() {
        return String.format("Sphere{radius: %d, area: %.4f, volume: %.4f}",
                            this.getRadius(), this.getArea(), this.getVolume());
    }

    @Override
    void setArea() {
        this.area = 4 * Math.PI * Math.pow(this.getRadius(), 2);
    }

    @Override
    double getArea() {
        return this.area;
    }

    @Override
    void setVolume() {
        this.volume = ((double) 4 / 3) * Math.PI * Math.pow(this.getRadius(), 3);
    }

    @Override
    double getVolume() {
        return this.volume;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
