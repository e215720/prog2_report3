package jp.ac.uryukyu.ie.e215720;


public class Enemy extends LivingThing{
    public Enemy(String name, int maximumHP, int attack){
        super(name, maximumHP, attack);
    }
    public void enemyAttack(LivingThing opponent){
        super.attack(opponent);
    }
    @Override
    public void wounded(int damage) {
        // TODO Auto-generated method stub
        System.out.printf("勇者%sは道半ばで力尽きてしまった。\n",getName());
       }
   

}