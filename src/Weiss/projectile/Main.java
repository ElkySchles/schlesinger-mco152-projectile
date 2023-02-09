package weiss.projectile;

public class Main {
    public static void main(String[] args) {


        Projectile projectile = new Projectile(39, 77);

        //System.out.println(projectile.getTime());

        //System.out.println(projectile.getX() + " " + projectile.getY());
        projectile.incTime(5);
        System.out.println(projectile.getX() + " " + projectile.getY());


    }
}
