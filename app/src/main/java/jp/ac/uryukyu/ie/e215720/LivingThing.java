package jp.ac.uryukyu.ie.e215720;
/**
 * スーパークラス
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 
 *  String getname; //指定されたモブの名前を返す
 *  int gethitPoint; //指定されたモブのHPを返す
 *  int getattack; //指定されたモブの攻撃力を返す
 *  boolean getdead; //指定されたモブの生死状態を返す。true=死亡。
 */
public class LivingThing {
    String name;
    int hitPoint;
    int attack;
    boolean dead;
    public  LivingThing(String name, int maximumHP, int attack){
        this.name = name;
        this.hitPoint = maximumHP;
        this.attack = attack;
        this.dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }

   
    public String getName(){
        return this.name;
    }
    public boolean isDead(){
        return  this.dead ;
    }
  
    public void attack(LivingThing opponent){
        if (!(this.isDead())){
            int damage = (int)(Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);

        }
    }
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            this.dead = true;
            System.out.printf("%sは倒れた。\n", name);    
        }
    }

}
