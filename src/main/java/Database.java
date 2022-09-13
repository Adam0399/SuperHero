public class Database {
    public void createsuperhero(String supername,String realname,String superpower,int creation,int strength,boolean ishuman){
        Superhero hero1 = new Superhero(supername, realname,superpower,creation, strength, ishuman);
        System.out.println(hero1);
    }

}
