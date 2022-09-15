import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {




    public static void main(String[] args) {
        Database database = new Database();

        Scanner scan = new Scanner(System.in);
        int menuvalg;
    do {


        System.out.println("press 1 for making a superhero");
        System.out.println("press 4 for list");
        System.out.println("press 6 to search for a hero");
        System.out.println("press 9 exiting this menu");
        menuvalg = scan.nextInt();
        scan.nextLine();
        if (menuvalg == 1) {


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
        } else if (menuvalg == 9) {
            System.out.println("ses");
            } else if (menuvalg ==4){
                    System.out.println("list of superheroes");
                for(Superhero superhero: database.getSuperheroes()){
                    System.out.println(" ");
                    System.out.println("----------------------");
                    System.out.println("Super hero name: "+superhero.getSupername());
                    System.out.println("Realname: "+superhero.getRealname());
                    System.out.println("Superpowers: "+superhero.getSuperpower());
                    System.out.println("Created: "+superhero.getCreation());
                    System.out.println("Strength: "+superhero.getStrength());
                    System.out.println("Is human?: "+superhero.ishuman);
                    System.out.println("----------------------");

                    //System.out.println(database.getSuperheroes());
                }

        } else if (menuvalg ==6){
            System.out.println("which hero do you want");
            String searchTerm = scan.nextLine();
            if (database.searchfor(searchTerm)!=null){

            System.out.println(database.searchfor(searchTerm));
            }else {
                System.out.println("no match found");
            }


                /*if(searchterm)
                if (searchTerm==superhero.getSupername().toLowerCase()){
                    System.out.println("hej");
                } else {
                    System.out.println("invalid");
                }*/


        }


        }while (menuvalg!=9);

    }
}
