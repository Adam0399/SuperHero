public class Superhero {
    String supername;
    int creation;
    int strength;
    boolean ishuman;
    String realname;
    String superpower;

    public Superhero(String supername, String realname, String superpower, int creation, int strength, boolean ishuman) {
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

    public String getSupername() {
        return supername;
    }

    public String getRealname() {
        return realname;
    }

    public String getSuperpower() {
        return superpower;
    }

    public boolean isIshuman() {
        return ishuman;
    }

    public int getStrength() {
        return strength;
    }
    public String ishuman() {

        if (this.ishuman == true) {
            return "Yes";
        }else return "No";
    }
    public void setRealname(String newRealname){
        realname=newRealname;
    }
    public void setSupername(String newSuperName){
        supername=newSuperName;
    }
    public void setSuperpower(String newSuperPower){
        superpower=newSuperPower;
    }
    public void setStrength(String newStrength){
        strength=Integer.parseInt(newStrength);
    }
    public void setCreation(String newCreation){
        creation=Integer.parseInt(newCreation);
    }
    public void setIshuman(String newishuman){
        ishuman=Boolean.parseBoolean(newishuman);
    }

    public String toString() {
        return "Superhero name: " + supername +
                "\nSuperpowers: " + superpower +
                "\nRealname: " + realname +
                "\nCreated: " + creation +
                "\nstrength: " + strength +
                "\nis human?: " + ishuman();
    }


}
