public class character{
    private int health;
    private int damage;
    private int maxHealth;
    private int critDamage;
    private int critChance;
    private String name;

    public character(){
        name="Bob";
        health=20
        maxHealth=20;
        critChance=10;
        critDamage=50;
        damage=2;
    }

    public character(String n, int mh, int d, int cd, int cc){
        name=n;
        maxHealth=mh;
        health=mh;
        damage=d;
        critDamage=cd;
        critChange=cc;
    }

    public void setHealth(int h){
        if(h<=maxHealth){
            health=h;
        }
        else{
            System.out.println("Error, health cannot be set above max health.")
        }
    }

    public void setMaxHealth(int h){
        maxHealth=h;
    }

    public void setCritDamage(int c){
        critDamage=c;
    }

    public void setCritChance(int c){
        if(c<=100){
            critChance=c;
        }
        else{
            System.out.println("Error, crit chance cannot be above 100%")
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

    public int getCritDamage(){
        return critDamage;
    }

    public int getCritChance(){
        return critChange;
    }

    public int getDamage(){
        return damage;
    }

    public String getName(){
        return name;
    }
}