public class Superhero {
    String supername;
    int creation;
    int strength;
    boolean ishuman;
    String realname;
    String superpower;
    public Superhero( String supername,String realname,String superpower, int creation, int strength, boolean ishuman) {
        this.supername = supername;
        this.realname = realname;
        this.superpower = superpower;
        this.creation = creation;
        this.strength = strength;
        this.ishuman = ishuman;
    }

    public int getCreation() {
        return creation;
    }

    public String getSupername(){
        return supername;
    }
    public String getRealname(){
        return realname;
    }
    public String getSuperpower(){
        return superpower;
    }

    public boolean isIshuman() {
        return ishuman;
    }

    public int getStrength() {
        return strength;
    }

    public String toString(){
        return realname +" "+ supername;
    }

}
