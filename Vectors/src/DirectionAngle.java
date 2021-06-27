public class DirectionAngle {

    private double alpha, beta, gamma;

    public DirectionAngle(double alpha, double beta, double gamma) {
        setAlpha(alpha);
        setBeta(beta);
        setGamma(gamma);

        System.out.printf("{ alpha: %.4f, beta: %.4f, gamma: %.4f }%n", getAlpha(), getBeta(), getGamma());
    }

    public double getAlpha() {
        return Math.toDegrees(alpha);
    }

    public void setAlpha(double alpha) {
        this.alpha = alpha;
    }

    public double getBeta() {
        return Math.toDegrees(beta);
    }

    public void setBeta(double beta) {
        this.beta = beta;
    }

    public double getGamma() {
        return Math.toDegrees(gamma);
    }

    public void setGamma(double gamma) {
        this.gamma = gamma;
    }
}
