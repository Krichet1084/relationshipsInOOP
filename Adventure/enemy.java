import java.util.Random;

public class enemy extends character {
    public enemy(){
        super();
    }

    public enemy(String n, int mh, int d, double cd, double cc ){
        super(n, mh, d, cd, cc);
    }

    @Override
    public int punch(){
        int totalDamage=damage;
        Random rand = new Random();
        boolean crit = rand.nextDouble() < critChance;
        if(crit){
            totalDamage = (int)critDamage*damage;
        }
        lifesteal(totalDamage);
        return totalDamage;
    }

    public void lifesteal(int td){
        setHealth(getHealth()+(td/2));
    }
}
