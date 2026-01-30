class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

 class Warrior extends Fighter {
    public String toString(){
        return "Fighter is a Warrior";
    }
    
    boolean isVulnerable() {
        return false;
    }
    
    int getDamagePoints(Fighter fighter) {
        if (fighter.isVulnerable()) {
            return 10;
        } else {
            return 6;
        }
    }
}
 class Wizard extends Fighter{
    private boolean spellPrepared  = false;
    public String toString(){
        return "Fighter is a Wizard";
    }
    void prepareSpell(){
        spellPrepared  = true;
    }
    boolean isVulnerable() {
        if(spellPrepared ){
            return false;
        }else{
            return true;
        }
    }
    int getDamagePoints(Fighter fighter) {
        if(spellPrepared ){
            return 12;
        }else{
            return 3;
        }
    }

    
    
}


// TODO: define the Wizard class
