import jp.ac.uryukyu.ie.e215720.*;

public class Main {
    public static void main(String[] args){
        Warrior hero = new Warrior("勇者", 10, 2);
        Enemy enemy = new Enemy("スライム", 6, 3);

        System.out.printf("%s vs. %s\n", hero.getName(), enemy.getName());

        int turn = 0;
        while( hero.isDead() == false && enemy.isDead() == false){
            turn++;
            System.out.printf("%dターン目開始！\n", turn);
            hero.atteakWithWeponSkill(enemy);
            enemy.heroAttack(hero);
        }
        System.out.println("戦闘終了");
    }
}