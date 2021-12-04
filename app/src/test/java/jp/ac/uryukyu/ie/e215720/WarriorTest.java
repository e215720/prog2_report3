package jp.ac.uryukyu.ie.e215720;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class WarriorTest {
    @Test
    void attackTest() {
        int defaultHeroHp = 100;
        Warrior demoHero1 = new Warrior("デモ勇者", defaultHeroHp, 2);
        Enemy slime = new Enemy("スライムもどき", 10, 100);
        demoHero1.atteakWithWeponSkill(slime);
        demoHero1.atteakWithWeponSkill(slime);
        demoHero1.atteakWithWeponSkill(slime);
        assertEquals(1,slime.hitPoint);
    }
}
   
    
    

