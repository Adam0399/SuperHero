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

}
