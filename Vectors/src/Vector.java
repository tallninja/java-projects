public class Vector {

    private int x, y, z;

    // Constructor that takes in the x , y and z components respectively
    public Vector(int x, int y, int z) {
        setX(x);
        setY(y);
        setZ(z);
    }

    //vector1.add(vector2) -> adds two vectors and returns the sum
    public Vector add(Vector vector) {
        int x = getX() + vector.getX();
        int y = getY() + vector.getY();
        int z = getZ() + vector.getZ();

        return new Vector(x, y, z);
    }

    // subtracts two vectors
    public Vector subtract(Vector vector) {
        int x = getX() - vector.getX();
        int y = getY() - vector.getY();
        int z = getZ() - vector.getZ();

        return new Vector(x, y, z);
    }

    public int dotProduct(Vector vector) {
        int x = getX() * vector.getX();
        int y = getY() * vector.getY();
        int z = getZ() * vector.getZ();

        return x + y + z;
    }

    // calculates the cross product
    public Vector crossProduct(Vector vector) {
        int x = (getY() * vector.getZ()) - (getZ() * vector.getY());
        int y = (getX() * vector.getZ()) - (getZ() * vector.getX());
        int z = (getX() * vector.getY()) - (getY() * vector.getX());

        return new Vector(x, y, z);
    }

    // calculates the magnitude of the vector
    public double calculateMagnitude() {
        return Math.sqrt((Math.pow(getX(), 2) + Math.pow(getY(), 2) + Math.pow(getZ(), 2)));
    }

    /*
    * Gets the direction angle of the vector from:
    *   x plane = alpha
    *   y plane = beta
    *   z plane = gamma
    * */
    public void getDirectionAngle() {
        double magnitude = calculateMagnitude();
        double alpha = Math.acos((double) getX() / magnitude);
        double beta = Math.acos((double) getY() / magnitude);
        double gamma = Math.acos((double) getZ() / magnitude);

        new DirectionAngle(alpha, beta, gamma);
    }

    // gets the angle between two vectors (cosine difference)
    public double getAngle(Vector vector) {
        double a = this.dotProduct(vector);
        double b = this.calculateMagnitude() * vector.calculateMagnitude();
        return Math.toDegrees(Math.acos(a / b));
    }

    /*
    * Two vectors are parallel to each other if:
    *   1. The two vectors are not the same vector.
    *   2. The angle between the vectors is 0 degrees.
    *   3. They are scalar multiples of each other.
    * */
    public boolean isParallelTo(Vector vector) {
        return !this.isSameAs(vector) && this.getAngle(vector) == (double) 0 && this.isMultipleOf(vector);
    }

    // checks if two vectors are the same
    public boolean isSameAs(Vector vector) {
        return getX() == vector.getX() && getY() == vector.getY() && getZ() == vector.getZ();
    }

    // checks if a vector is a multiple of the other
    public boolean isMultipleOf(Vector vector) {
        if(this.getX() % vector.getX() == 0 || vector.getX() % this.getX() == 0) {
            if(this.getY() % vector.getY() == 0 || vector.getY() % this.getY() == 0) {
                return (this.getZ() % vector.getZ() == 0 || vector.getZ() % this.getZ() == 0);
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    // string representation of a vector: xi + yj + zk
    public String toString() {
        char opx = getX() > 0 ? ' ' : '-';
        char opy = getY() > 0 ? '+' : '-';
        char opz = getZ() > 0 ? '+' : '-';

        int x = getX() > 0 ? getX() : getX() * -1;
        int y = getY() > 0 ? getY() : getY() * -1;
        int z = getZ() > 0 ? getZ() : getZ() * -1;

        return String.format("%s%di %s %dj %s %dk", opx, x, opy, y, opz, z);
    }

    // below are the getters and setters
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
