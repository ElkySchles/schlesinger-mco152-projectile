package weiss.projectile;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProjectileTest {

    @Test
    public void getX() {
        //given
        Projectile projectile = new Projectile(39, 77);
        //when
        double actual = projectile.incTime(5);
        //then
        assertEquals(299.2011951609338, projectile.getX(), actual);
    }

    @Test
    public void getY() {
        //given
        Projectile projectile = new Projectile(39, 77);
        //when
        double actual = projectile.incTime(5);
        //then
        assertEquals(119.78835055418737, projectile.getY(), actual);
    }


}