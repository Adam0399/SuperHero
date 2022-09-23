import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Userinterface {

    Database database = new Database();
    Scanner scan = new Scanner(System.in);
    private void getMenu(){
        System.out.println("press 1 for making a superhero");
        System.out.println("press 4 for list");
        System.out.println("press 6 to search for a hero");
        System.out.println("press 7 to edit a hero");
        System.out.println("press 8 to remove a hero from the database");
        System.out.println("press 9 exiting this menu");

    }
    private void getOprethero(){
        System.out.println("What is your super hero called?");
        String supername = scan.nextLine();
        System.out.println("what is the real name of your super hero?");
        String realname = scan.nextLine();
        System.out.println("what is your heros superpower");
        String superpower = scan.nextLine();
        System.out.println("when was your super hero created?");
        int creation = scan.nextInt();
        System.out.println("how Strong is your hero");
        int strength = scan.nextInt();
        System.out.println("is your hero human?(y or n)");
        Boolean ishuman = null;
        String answer;
        do {
            answer = scan.next();
            if (answer.equals("y")) {
                ishuman = true;
                break;
            } else if (answer.equals("n")) {
                ishuman = false;
                break;
            } else {
                System.out.println("Invalid input");
            }
        } while (answer != "y" && answer != "n");

        database.createsuperhero(supername, realname, superpower, creation, strength, ishuman);
}
    private void getList() {
        System.out.println("list of superheroes");
        for (Superhero superhero : database.getSuperheroes()) {
            System.out.println(" ");
            System.out.println("----------------------");
            System.out.println("Super hero name: " + superhero.getSupername());
            System.out.println("Realname: " + superhero.getRealname());
            System.out.println("Superpowers: " + superhero.getSuperpower());
            System.out.println("Created: " + superhero.getCreation());
            System.out.println("Strength: " + superhero.getStrength());
            System.out.println("Is human?: " + superhero.ishuman);
            System.out.println("----------------------");
        }
    }
    private void getSearch(){
        System.out.println("which hero do you want");
        String searchTerm = scan.nextLine();


        if (database.searchfor(searchTerm)!=null){

            System.out.println(database.searchfor(searchTerm));
        }else {
            System.out.println("no match found");
        }


    }

    private void getSearchAndEdit(){
        System.out.println("indtast det du vil søge efter");
        String searchAndEditTerm = scan.next();
        scan.nextLine();
        ArrayList<Superhero> søgeResultat = database.SearchAndEdit(searchAndEditTerm);
        database.SearchAndEdit(searchAndEditTerm);
        try{

        if (database.SearchAndEdit(searchAndEditTerm)!=null){
            for(int i = 0; i < søgeResultat.size();i++){
                System.out.println(i+1+":"+søgeResultat.get(i));
            }
            System.out.println("indtast nr på den du vil redigere");
            int nr = scan.nextInt();
            scan.nextLine();
            Superhero editHero = søgeResultat.get(nr - 1);
            System.out.println("Editsuperhelt: "+editHero.getSupername());
            System.out.println("rediger og tryk enter hvis du ikke vil rediger");
            System.out.println("Superheltenavn: "+editHero.getSupername());
            String newSuperHeroName = scan.nextLine();
            if (!newSuperHeroName.isEmpty()){
                editHero.setSupername(newSuperHeroName);
            }
            System.out.println("realname: "+editHero.getRealname());
            String newrealname = scan.nextLine();
            if (!newrealname.isEmpty()){
                editHero.setRealname(newrealname);
            }
            System.out.println("superpower: "+editHero.getSuperpower());
            String newSuperPower = scan.nextLine();
            if (!newSuperPower.isEmpty()){
                editHero.setSuperpower(newSuperPower);
            }
            System.out.println("creation: "+editHero.getCreation());
            String newCreation = scan.nextLine();
            if(!newCreation.isEmpty()){
                editHero.setCreation(newCreation);
            }
            System.out.println("Strength: "+editHero.getStrength());
            String newStrength = scan.nextLine();
            if(!newStrength.isEmpty()){
                editHero.setStrength(newStrength);
            }
            System.out.println("human or not (y or n)"+editHero.ishuman());
            String newIshuman = scan.nextLine();
            if(!newIshuman.isEmpty()){
                editHero.setIshuman(newIshuman);
            }
        } else{
            System.out.println("der findes ingen superhelt som hedder "+searchAndEditTerm);
        }
        }catch(IndexOutOfBoundsException e){
            System.out.println("warning input invalid");
        }
    }
    private void getremoveHero(){
        System.out.println("søg efter den du vil slette");
        String removeTerm = scan.nextLine();

    }
    public void startup(){
    Userinterface program = new Userinterface();
    int menuvalg = 0;
    do {
        try{

        program.getMenu();
        menuvalg = scan.nextInt();
        scan.nextLine();
        if (menuvalg == 1) {
            program.getOprethero();


        } else if (menuvalg == 9) {
            System.out.println("ses");
        } else if (menuvalg ==4){
            program.getList();

        } else if (menuvalg ==6){
            program.getSearch();
        }
        else if (menuvalg ==7){
            program.getSearchAndEdit();
        }
        else if (menuvalg ==8){
            program.getremoveHero();
        }
        }catch (InputMismatchException e){
            System.out.println("Warning wrong input");
            scan.nextLine();
        }
    }while (menuvalg!=9);

}
}
