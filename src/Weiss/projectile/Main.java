package Weiss.projectile;
public class Main {
    public static void main(String[] args){


        Projectile projectile = new Projectile(39, 77, 2);

        //System.out.println(projectile.getTime());

            System.out.println(projectile.getX(projectile.getTime()) + " " + projectile.getY(projectile.getTime()));
            projectile.incTime(4);
            System.out.println(projectile.getX(projectile.getTime()) + " " + projectile.getY(projectile.getTime()));



    }
}
