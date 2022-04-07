
import java.util.ArrayList;
import java.util.Scanner;

public class Bunkhouse {
    //3 bunk houses for each
    ArrayList<String> bunkhouse_b1 = new ArrayList<String>();
    ArrayList<String> bunkhouse_b2 = new ArrayList<String>();
    ArrayList<String> bunkhouse_b3 = new ArrayList<String>();
    ArrayList<String> bunkhouse_g1 = new ArrayList<String>();
    ArrayList<String> bunkhouse_g2 = new ArrayList<String>();
    ArrayList<String> bunkhouse_g3 = new ArrayList<String>();



//    Bunkhouse[] bunkhouse = new Bunkhouse[5];

    public void getCampers(){

    }


    //menu
    public void bunkMenu(){
        System.out.println("****************************\n" +
                "* Bunkhouse Menu Options: \n" +
                "* 1: show bunk members\n" +
                "* 2: show bunkhouse count\n" +
                "* 3: add to bunkhouse\n" +
                "* 4: move bunks\n" +
                "* 5: exit\n" +
                "****************************\n");

        System.out.print("What would you like to do?: ");
        Scanner menuOption = new Scanner(System.in);
        int mOption = menuOption.nextInt();

        switch (mOption){
            case 1:
                ArrayList<String> bunk;
                int option = 0;
                System.out.println("Which bunkhouse(b1,b2,b3, g1,g2,g3): ");
                option = menuOption.nextInt();
                switch (option){
                    case 1:
                        bunk = bunkhouse_b1;
                        break;
                    case 2:
                        bunk = bunkhouse_b2;
                        break;
                    case 3:
                        bunk = bunkhouse_b3;
                        break;
                    case 4:
                        bunk = bunkhouse_g1;
                        break;
                    case 5:
                        bunk = bunkhouse_g2;
                        break;
                    case 6:
                        bunk = bunkhouse_g3;
                        break;
                }
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
        }
    }

    //show who is in a bunkhouse
    public void bunkMembers(ArrayList<String> bunkhouse){

        for (int i = 0; i < bunkhouse.size(); i++){
            if (bunkhouse_b1.get(i) == null) {
                System.out.println("no more bunk members");
            }

            System.out.println("\nMembers: ");
            System.out.println("Name: " + bunkhouse_b1.get(i));

        }

    }
    //show bunkhouse count
    public void bunkhouseCount(){
        System.out.println("Bunkhouse counts: ");
        System.out.println("bunkhouse b1: " + bunkhouse_b1.size());
        System.out.println("bunkhouse b2: " + bunkhouse_b2.size());
        System.out.println("bunkhouse b3: " + bunkhouse_b3.size());
        System.out.println("bunkhouse g1: " + bunkhouse_g1.size());
        System.out.println("bunkhouse g2: " + bunkhouse_g2.size());
        System.out.println("bunkhouse g3: " + bunkhouse_g3.size());
    }
    //add a member
    public void addToBunkhouse(String member, int house){
        switch (house){
            case 1:
                bunkhouse_b1.add(member);
                break;
            case 2:
                bunkhouse_b2.add(member);
                break;
            case 3:
                bunkhouse_b3.add(member);
                break;
            case 4:
                bunkhouse_g1.add(member);
                break;
            case 5:
                bunkhouse_g2.add(member);
                break;
            case 6:
                bunkhouse_g3.add(member);
                break;
            default:
                break;
        }
    }

}
