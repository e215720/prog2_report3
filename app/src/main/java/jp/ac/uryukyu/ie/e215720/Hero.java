package jp.ac.uryukyu.ie.e215720;


public class Hero extends LivingThing{
    public Hero(String name, int maximumHP, int attack){
        super(name, maximumHP, attack);
    }
    public void enemyAttack(LivingThing opponent){
        super.attack(opponent);
    }
    @Override
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            this.dead = true;
            System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", name);    
        }
    }
   
       
   
}