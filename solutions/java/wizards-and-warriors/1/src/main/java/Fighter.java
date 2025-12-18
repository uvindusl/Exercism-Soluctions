class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

class Warrior extends Fighter{
    boolean isVulnerable() {
        return false;
    }

    public String toString(){
        return "Fighter is a Warrior";
    }

    int getDamagePoints(Fighter fighter){
        if(fighter.isVulnerable()){
            return 10;
        }else {
            return 6;
        }
    }
}

class Wizard extends Fighter {

    boolean isSpellPrepared = false;

    public String toString(){
        return "Fighter is a Wizard";
    }

    public void prepareSpell(){
        isSpellPrepared = true;
    }

    boolean isVulnerable(){
        return !isSpellPrepared;
    }

    int getDamagePoints(Fighter fighter){
        if(isSpellPrepared){
            return 12;
        }else{
            return 3;
        }
    }
}