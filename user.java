public class user extends character{
    sword weapon;
    public user(){
        super();
        name="Him";
    }

    public user(String n, int mh, int d, double cd, int cc){
        super(n, mh, d, cd, cc);
    }

    public void setWeapon(sword w){
        weapon =w;
    }

    public sword getWeapon(){
        return weapon;
    }
}