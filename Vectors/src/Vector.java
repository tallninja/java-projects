public class Vector {

    private int x, y, z;

    public Vector(int x, int y, int z) {
        setX(x);
        setY(y);
        setZ(z);
    }

    public Vector add(Vector vector) {
        int x = getX() + vector.x;
        int y = getY() + vector.y;
        int z = getZ() + vector.z;

        return new Vector(x, y, z);
    }

    public Vector subtract(Vector vector) {
        int x = getX() - vector.x;
        int y = getY() - vector.y;
        int z = getZ() - vector.z;

        return new Vector(x, y, z);
    }

    public int dotProduct(Vector vector) {
        int x = getX() * vector.getX();
        int y = getY() * vector.getY();
        int z = getZ() * vector.getZ();

        return x + y + z;
    }

    public Vector crossProduct(Vector vector) {
        int x = (getY() * vector.getZ()) - (getZ() * vector.getY());
        int y = (getX() * vector.getZ()) - (getZ() * vector.getX());
        int z = (getX() * vector.getY()) - (getY() * vector.getX());

        return new Vector(x, y, z);
    }

    public double calculateMagnitude() {
        return Math.sqrt((Math.pow(getX(), 2) + Math.pow(getY(), 2) + Math.pow(getZ(), 2)));
    }

    public void getDirectionAngle() {
        double magnitude = calculateMagnitude();
        double alpha = Math.acos((double) getX() / magnitude);
        double beta = Math.acos((double) getY() / magnitude);
        double gamma = Math.acos((double) getZ() / magnitude);

        new DirectionAngle(alpha, beta, gamma);
    }

    public double getAngle(Vector vector) {
        double a = this.dotProduct(vector);
        double b = this.calculateMagnitude() * vector.calculateMagnitude();
        return Math.toDegrees(Math.acos(a / b));
    }

    public boolean isParallelTo(Vector vector) {
        return !this.isSameAs(vector) && this.getAngle(vector) == (double) 0;
    }

    public String toString() {
        char opx = getX() > 0 ? ' ' : '-';
        char opy = getY() > 0 ? '+' : '-';
        char opz = getZ() > 0 ? '+' : '-';

        int x = getX() > 0 ? getX() : getX() * -1;
        int y = getY() > 0 ? getY() : getY() * -1;
        int z = getZ() > 0 ? getZ() : getZ() * -1;

        return String.format("%s%di %s %dj %s %dk", opx, x, opy, y, opz, z);
    }

    public boolean isSameAs(Vector vector) {
        return getX() == vector.getX() && getY() == vector.getY() && getZ() == vector.getZ();
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
}
