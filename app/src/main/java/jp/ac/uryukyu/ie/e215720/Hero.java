package jp.ac.uryukyu.ie.e215720;


public class Hero extends LivingThing{
    public Hero(String name, int maximumHP, int attack){
        super(name, maximumHP, attack);
    }
    public void enemyAttack(LivingThing opponent){
        super.attack(opponent);
    }
    @Override
    public void wounded(int damage) {
        // TODO Auto-generated method stub
        System.out.printf("モンスター%sは倒れた\n",getName());
       }
   
}