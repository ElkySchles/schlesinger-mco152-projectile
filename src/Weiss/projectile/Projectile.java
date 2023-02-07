package weiss.projectile;

public class Projectile {
    private final double angle;
    private final double velocity;
    public double time;


    public Projectile(double angle, double velocity) {
        this.angle = angle;
        this.velocity = velocity;
        this.time = time;
    }

    public void incTime(double delta) {
        time += delta;
    }

    public double getTime() {
        return time;
    }

    public double getAngle() {
        return angle;
    }

    public double getVelocity() {
        return velocity;
    }

    public double getY() {
        return Math.sin(Math.toRadians(angle)) * velocity * getTime() - .5 * 9.8 * Math.pow(getTime(), 2);
    }

    public double getX() {
        return Math.cos(Math.toRadians(angle)) * velocity * getTime();
    }
}








