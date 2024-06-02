import java.util.Random;


public class sword extends weapon {

    public sword(character o){
        super(o);
        setCritDamageModifier(0.2);
        setCritChanceModifier(0.1);
        setDamageModifier(1);
    }

    public int stab(character c){
        int totalDamage=c.getDamage()+damageModifier;
        Random rand = new Random();
        boolean crit = rand.nextDouble() > (c.getCritChance()+critChanceModifier);
        if(crit){
            totalDamage = (int)((c.getCritDamage()+critDamageModifier+1)*(c.getDamage()+damageModifier));
        }
        lifesteal(c, totalDamage);
        return totalDamage;
    }
    private void lifesteal(character c, int td){
        c.setHealth(c.getHealth()+(td/2));
    }
}
