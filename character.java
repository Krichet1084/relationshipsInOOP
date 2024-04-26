public class character{
    
    int health;
    int damage;
    int maxHealth;
    double critDamage;
    double critChance;
    String name;

    public character(){
        name="Bob";
        health=20;
        maxHealth=20;
        critChance=0.1;
        critDamage=0.5;
        damage=2;
    }

    public character(String n, int mh, int d, double cd, double cc){
        name=n;
        maxHealth=mh;
        health=mh;
        damage=d;
        critDamage=cd;
        critChance=cc;
    }

    public void setHealth(int h){
        if(h<=maxHealth){
            health=h;
        }
        else{
            health=maxHealth;
        }
    }

    public void setMaxHealth(int h){
        maxHealth=h;
    }

    public void setCritDamage(double c){
        critDamage=c;
    }

    public void setCritChance(int c){
        if(c<=100){
            critChance=c;
        }
        else{
            critChance=100;
        }
    }

    public void setDamage(int d){
        damage=d;
    }

    public void setName(String n){
        name=n;
    }

    public int getHealth(){
        return health;
    }

    public int getMaxHealth(){
        return maxHealth;
    }

    public double getCritDamage(){
        return critDamage;
    }

    public double getCritChance(){
        return critChance;
    }

    public int getDamage(){
        return damage;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString(){
        return "Name: "+name+"\nMax Health: "+maxHealth+"\nHealth: "+health+"\nDamage: "+damage+"\nCrit Damage: "+critDamage+"\nCrit Chance: "+critChance;
    }

    public int punch(){
        return damage;
    }
}