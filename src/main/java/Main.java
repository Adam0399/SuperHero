import java.util.Scanner;

public class Main {




    public static void main(String[] args) {
        Database database = new Database();

        Scanner scan = new Scanner(System.in);
        int menuvalg;
    do {


        System.out.println("press 1 for making a superhero");
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
            System.out.println("is your hero human?");
            boolean ishuman = scan.nextBoolean();



            database.createsuperhero(supername, realname, superpower, creation, strength, ishuman);
        } else if (menuvalg == 9) {
            System.out.println("ses");
        }


        }while (menuvalg!=9);
    }
}
