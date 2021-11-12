package jp.ac.uryukyu.ie.e215720;

/**
 * 敵クラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 
 *  String name; //指定されたモブの名前を返す
 *  int hitPoint; //指定されたモブのHPを返す
 *  int attack; //指定されたモブの攻撃力を返す
 *  boolean dead; //指定されたモブの生死状態を返す。true=死亡。
 */
public class Enemy {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;
    public String getname(){
        return this.name;
    }
    public  int gethitPoint(){
        return this.hitPoint;
    }
    public  int getattack(){
        return this.attack;
    }
    public boolean getdead(){
        return this.dead;
    }

    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name モンスター名
     * @param maximumHP モンスターのHP
     * @param attack モンスターの攻撃力
     */
    public Enemy (String name, int maximumHP, int attack) {
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }

    /**
     * Heroへ攻撃するメソッド。
     * モンスターのhpに応じて攻撃できるかを判断する.hpが0の時は相手にダメージはない
     * attackに応じて乱数でダメージを算出し、hero.wounded()によりダメージ処理を実行。
     * @param hero 攻撃対象
     */
    public void attack(Hero hero){
        if ( hitPoint >0){
            int damage = (int)(Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, hero.getname(), damage);
            hero.wounded(damage);
        }
        
        if( hitPoint < 0){
            int damage1 = (0* attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, hero.getname(), damage1);
            hero.wounded(damage1);
        }
    }    

    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * @param damage 受けたダメージ
     */
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("モンスター%sは倒れた。\n", name);
        }
    



    }

}