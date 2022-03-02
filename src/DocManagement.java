import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;

@SuppressWarnings("DanglingJavadoc")
public class DocManagement {
    //handling documents
        //did applicant apply for camp before 60 days prior but no more than 240 days prior AND
        //no more than 72 kids (36 boys and 36 girls) - **should put at the end**
        //if no - do not accept, send rejection letter
        //if yes - did the check clear?
        //if no - do not accept, send rejection letter
        //if yes - verify age (9-18 inclusive)
        //if no - send rej letter
        //if yes -  send acceptance letter, arrival packet

    int maleCount = 0;
    int femaleCount = 0;
    String name, gender;
    int age;

//    public DocManagement()
//    {
//
//        this.name = name;
//        this.gender = gender;
//        this.age = age;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getGender() {
//        return gender;
//    }


    public void startMenu() throws ParseException {
        int exitFlag = 0;
        int i = 0;
        DocManagement[] doc = new DocManagement[71];
        while (exitFlag == 0) {
            //ask menu
            System.out.println("****************************\n" +
                    "* 1. Start new application \n" +
                    "* 2. View all applications Entered\n" +
                    "* 3. Remove an application in the System\n" +
                    "* 4. Show bunkhouse menu                  \n" +
                    "* 5. Exit\n" +
                    "****************************\n");
            System.out.print("What would you like to do?: ");
            Scanner menuOption = new Scanner(System.in);
            int mOption = menuOption.nextInt();
            Bunkhouse bunkhouse = new Bunkhouse();

            switch (mOption) {
                case 1:
                    System.out.println("\n");
                    System.out.println("Starting new application...\n" +
                            "*************************\n");
                    doc[i] = new DocManagement();

                    //enter name
                    System.out.print("Enter name of applicant:");
                    Scanner inputName = new Scanner(System.in);
                    doc[i].name = inputName.nextLine();

                    //enter gender
                    System.out.print("Male/Female: ");
                    Scanner inputGender = new Scanner(System.in);
                    doc[i].gender = inputGender.nextLine();
                    int rightInput = 1;
                    while (rightInput == 1) {
                        if (doc[i].gender.toLowerCase().equals("male")) {
                            maleCount++;
                            rightInput = 0;
                        } else if (doc[i].gender.toLowerCase().equals("female")) {
                            femaleCount++;
                            rightInput = 0;
                        } else {
                            System.out.print("Unknown Input: Please enter either male or female");
                        }

                    }
                    if (maleCount > 35) {
                        System.out.print("At Max capacity for Boys");
                        maleCount--;
                        break;
                    }
                    if (femaleCount > 35) {
                        System.out.print("At max capacity for Girls");
                        maleCount--;
                        break;
                    }


                    //enter bday
                    System.out.print("Enter birthday (in YYYY-MM-DD format): ");
                    Scanner bday = new Scanner(System.in);
                    String birthday = bday.nextLine();
                    LocalDate dob = LocalDate.parse(birthday);
                    doc[i].age = checkAge(dob);

                    /**
                     * move bunkhouse stuff to separate function
                     **/
                    //assign bunk and tribe
//                    bunkhouse.bunkMenu();
//                    Scanner scanner = new Scanner(System.in);
//                    int bunkOption = scanner.nextInt();
//
//
//                    //bunk menu stuff
//                    switch (bunkOption){
//                        case 1:
//                            bunkhouse.bunkMembers();
//                            break;
//                        case 2:
//                            bunkhouse.bunkhouseCount();
//                            break;
//                        case 3:
//                            System.out.print("Which bunkhouse?: ");
//                            int choice = scanner.nextInt();
//                            switch (choice){
//                                case 1:
//                                    bunkhouse.addToBunkhouse(doc[i].name, choice);
//                                    bunkhouse.bunkhouseCount();
//                                    break;
//                                case 2:
//                                    break;
//                                case 3:
//                                    break;
//                                case 4:
//                                    break;
//                                case 5:
//                                    break;
//                                case 6:
//                                    break;
//                            }
//
//                            break;
//                        case 4:
//                            break;
//                        case 5:
//                            break;
//                        default:
//                    }
                    /**
                     * end of bunkhouse stuff
                     **/

                    i++;
                    break;
                case 2:
                    System.out.println("2 Viewing Applications");
                    for (i = 0; i < 71; i++) {
                        int num = i + 1;
                        if (doc[i] == null) {
                            System.out.println("\n\n\nNo more Applications have been summited.");
                            break;
                        }

                        System.out.println("\n\n\nApplication " + num);

                        System.out.println("Name: " + doc[i].name);
                        System.out.println("Age: " + doc[i].age);
                        System.out.println("Gender: " + doc[i].gender);
                    }

                    break;
                case 3:
                    System.out.println("3 Removing an application from the system");

                    break;
                case 4:
                    bunkhouse.bunkMenu();
                    break;
                case 5:
                    System.out.println("exiting...");
                    exitFlag = -1;
                    break;
            }
        }
    }


    public void applicationDate() throws ParseException {

        //enter application date
        System.out.print("Enter application date (int MM-dd format): ");
        Scanner inputDate = new Scanner(System.in);
        String appDate = inputDate.nextLine();

        //select month option
        System.out.print(" 1. June\n" +
                " 2. July\n" +
                " 3. August\n" +
                "Select month: ");
        Scanner date = new Scanner(System.in);
        int campDate = date.nextInt();
        getDateDiff(appDate, campDate);

        //enter if check cleared
        System.out.print("Did the check clear?: ");
        Scanner clearedCheck = new Scanner(System.in);
        char clrChk = clearedCheck.next().toLowerCase().charAt(0);
        checkPayment(clrChk);

        //check in
        checkIn();
    }

    public void checkIn(){
        System.out.print("Camper's forms verified? (y/n): ");
        Scanner scanner = new Scanner(System.in);
        String forms = scanner.next();

        if (forms.toLowerCase().equals("y")){
            System.out.println("Camper is good to go...\n");
        }else if (forms.toLowerCase().equals("n")){
            System.out.println("Parent must be notified of incomplete items.");
        }else{
            System.out.println("Something went wrong.");
        }

    }

    //function to check the date is within correct time constraints
    //need to add different dates
    public void getDateDiff(String date, int campDate) throws ParseException {
//        Date today = Calendar.getInstance().getTime();
//        System.out.println("todays date: " + today);

        Date month = null;

        switch (campDate){
            case 1:
                month = new SimpleDateFormat("MM-dd").parse("06-15");
                break;
            case 2:
                month = new SimpleDateFormat("MM-dd").parse("07-15");
                break;
            case 3:
                month = new SimpleDateFormat("MM-dd").parse("08-15");
                break;
            default:
                System.out.println("incorrect option...");
                System.exit(0);
                break;
        }

        Date applicationDate = new SimpleDateFormat("MM-dd").parse(date);

        long dateDiff = month.getTime() - applicationDate.getTime();
        long days = dateDiff/(1000*60*60*24);

        if(!(days >= 60 && days <= 240)){
            sendReject();
        }
    }

    //function to ask if payment has made and cleared
    public void checkPayment(char ans) throws ParseException {
        //did the payment go through
        if(ans == 'n'){
            sendReject();
        }else if(ans == 'y'){
            sendAccept();
        }else{
            System.out.println("something went wrong...");
        }
    }

    //function to ask for age of applicant
    public int checkAge(LocalDate bday) throws ParseException {
        LocalDate today = LocalDate.now();
        Period period = Period.between(bday, today);

        if (period.getYears() < 18 && period.getYears() > 9){
            applicationDate();
        }else {
            sendReject();
        }
        return period.getYears();
    }

    //send acceptance docs
    public void sendAccept() {
        //send acceptance package
        System.out.println("Congrats on acceptance. Arrival packet sent.");
    }

    //send rejection docs
    public void sendReject() throws ParseException {
        //send rejection
        System.out.println("Does not qualify...\n" + "Rejection letter sent.");
        startMenu();
//        System.exit(0);
    }
}
