package weiss.projectile;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProjectileTest {

    @Test
    public void getX() {
        //given
        Projectile projectile = new Projectile(39, 77);
        //when
        projectile.incTime(5);
        //then
        assertEquals(299.2011951609338, projectile.getX(), .0001);
    }

    @Test
    public void getY() {
        //given
        Projectile projectile = new Projectile(39, 77);
        //when
        projectile.incTime(5);
        //then
        assertEquals(119.78835055418737, projectile.getY(), .0001);
    }


}