package jp.ac.uryukyu.ie.e215720;

public class Warrior extends Hero {
    public Warrior(String name, int maximumHP, int attack){
        super(name, maximumHP, attack);
    }
    
    public void atteakWithWeponSkill(LivingThing opponent){
        if (!(this.isDead())){
            int damage = (int)(1.5* getAttack());
            System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n", getName(), opponent.getName(), damage);
            opponent.wounded(damage);

        }
    }
    public void wounded(int damage){
       super.wounded(damage);
       }
   

}
