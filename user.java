public class user extends character{
    public user(){
        super(health, maxHealth, critChance, critDamage, damage);
        name="Him";
    }

    public user(String n, int mh, int d, int cd, int cc){
        super(health, maxHealth, name, critChance, critDamage, damage);
    }
    




}