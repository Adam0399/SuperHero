import java.util.ArrayList;

public class Database {

    private ArrayList<Superhero> superheroes = new ArrayList<>();
    private int index = 0;
    public void createTestData(){
        createsuperhero("batman","bruce wayne","rich",1980,100,true);
        createsuperhero("superman","clark","superstærk",1930,2000,false);

    }
    public void createsuperhero(String supername,String realname,String superpower
            ,int creation,int strength,boolean ishuman){
        Superhero hero1 = new Superhero(supername, realname,superpower,creation, strength, ishuman);
        superheroes.add(hero1);

    }
    public ArrayList<Superhero> getSuperheroes(){
        return superheroes;
    }
    public Superhero searchfor(String searchTerm) {
        return null;
    }
}
