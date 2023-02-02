package Weiss.projectile;

public class Projectile {
    private final double angle;
    private final double velocity;
    public double time;


    public Projectile(double angle, double velocity, double time)
    {
        this.angle = angle;
        this.velocity = velocity;
        this.time = time;
    }
    public void incTime(double delta){
        time += delta;
    }
    public double getTime(){
        return time;
    }
    public double getAngle()
    {
        return angle;
    }
    public double getVelocity()
    {
        return velocity;
    }
    public double getY(double delta)
    {
        return Math.sin(Math.toRadians(angle)) * velocity * delta - .5 * 9.8 * Math.pow(delta, 2);
    }
    public double getX(double delta)
    {
        return Math.cos(Math.toRadians(angle)) * velocity * delta;
    }
}








