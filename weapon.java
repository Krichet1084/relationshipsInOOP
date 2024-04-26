public class weapon {
    double critDamageModifier;
    double critChanceModifier;
    int damageModifier;
    character owner;
    
    public double getCritDamageModifier() {
        return critDamageModifier;
    }

    public double getCritChanceModifier() {
        return critChanceModifier;
    }

    public int getDamageModifier() {
        return damageModifier;
    }

    public weapon(character o){
        owner=o;
    }

    public character getOwner() {
        return owner;
    }

    public void setCritDamageModifier(double critDamageModifier) {
        this.critDamageModifier = critDamageModifier;
    }

    public void setCritChanceModifier(double critChanceModifier) {
        this.critChanceModifier = critChanceModifier;
    }

    public void setDamageModifier(int damageModifier) {
        this.damageModifier = damageModifier;
    }

    public void setOwner(character owner) {
        this.owner = owner;
    }

}
