import java.util.ArrayList;

public class Database {

    private ArrayList<Superhero> superheroes = new ArrayList<>();
    private int index = 0;
    String searchTerm;

    public void createsuperhero(String supername,String realname,String superpower
            ,int creation,int strength,boolean ishuman){
        Superhero hero1 = new Superhero(supername, realname,superpower,creation, strength, ishuman);
        superheroes.add(hero1);

    }
    public ArrayList<Superhero> getSuperheroes(){
        return superheroes;
    }
    public Superhero searchfor(String searchTerm) {
        for (Superhero superhero:getSuperheroes()) {
            if (superhero.getSupername().toLowerCase().contains(searchTerm.toLowerCase())){
            return superhero;
            }
        }
        return null;
    }
    public ArrayList<Superhero> SearchAndEdit(String searchAndEditTerm){
        ArrayList<Superhero> søgeResultat = new ArrayList<>();
        for (Superhero hero : superheroes){
            if (hero.getSupername().contains(searchAndEditTerm))
            søgeResultat.add(hero);
            return superheroes;
        }return null;
    }
    public void removeHero(String removeTerm){
        for (Superhero hero : getSuperheroes()){
            if (removeHero(removeTerm).getSupername().toLowerCase().contains(searchTerm.toLowerCase())){

                    removeTerm.remove(hero);

            }
        }
    }


    /*public ArrayList<Superhero> remove(String removeTerm) {
        ArrayList<Superhero> søgeResultat = new ArrayList<>();
        for (Superhero hero : superheroes) {
            if (hero.getSupername().contains(removeTerm))
                søgeResultat.remove(hero);
            return superheroes;
        }
        return null;*/
}



