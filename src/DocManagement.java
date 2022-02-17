import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class DocManagement {
    //handling documents
    //applications to camp
    //payments
    //notice of acceptance
    //arrival instruction packets
    int maleCount = 0;
    int femaleCount = 36;

    public void startMenu() throws ParseException {
        int exitFlag = 0;
        DocManagement doc = new DocManagement();
        while(exitFlag == 0) {
            //ask menu
            System.out.println("****************************\n" +
                    "* 1. start new application *\n" +
                    "* 2. in prog...            *\n" +
                    "* 3. in prog...            *\n" +
                    "* 4. exit                  *\n" +
                    "****************************\n");
            System.out.print("What would you like to do?: ");
            Scanner menuOption = new Scanner(System.in);
            int mOption = menuOption.nextInt();

            switch (mOption) {
                case 1:
                    System.out.println("\n");
                    doc.startApplication();
                    break;
                case 2:
                    System.out.println("2 in prog...");
                    break;
                case 3:
                    System.out.println("3 in prog...");
                    break;
                case 4:
                    System.out.println("exiting...");
                    exitFlag = -1;
                    break;
            }
        }
    }

    public void startApplication() throws ParseException {
        //did applicant apply for camp before 60 days prior but no more than 240 days prior AND
        //no more than 72 kids (36 boys and 36 girls) - **should put at the end**
        //if no - do not accept, send rejection letter
        //if yes - did the check clear?
        //if no - do not accept, send rejection letter
        //if yes - verify age (9-18 inclusive)
        //if no - send rej letter
        //if yes -  send acceptance letter, arrival packet

        //enter gender
        System.out.println("Starting new application...\n" +
                "*************************\n");

        System.out.print("Male/Female: ");
        Scanner inputGender = new Scanner(System.in);
        char gender = inputGender.next().charAt(0);
        getGender(gender);

        //enter application date
        System.out.print("Enter application date: ");
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
        char clrChk = clearedCheck.next().charAt(0);
        checkPayment(clrChk);

        //enter age
        System.out.print("Enter age: ");
        Scanner ageCheck = new Scanner(System.in);
        int age = ageCheck.nextInt();
        checkAge(age);

    }//end startApplication

    //tallies the gender(male or female) and calls checkCount function
    //to check number of kids enrolled
    public void getGender(char gender) throws ParseException {
        char ch = Character.toLowerCase(gender);
        if(ch == 'f'){
            System.out.println("female test...");
            femaleCount++;
        }else if(ch == 'm'){
            System.out.println("male test...");
            maleCount++;
        }else{
            System.out.println("error...");
            System.exit(0);
        }
        checkCount();
    }

    //function to check the count of females/males
    // and rejects if there are too many of either
    public void checkCount() throws ParseException {
        if(femaleCount > 36){
            System.out.println("No more girls...");
            System.exit(0);
        }else if(maleCount > 36){
            System.out.println("No more boys...");
            System.exit(0);
        }
        System.out.println("Female count: " + femaleCount);
        System.out.println("Male count: " + maleCount);
    }

    //function to check the date is within correct time constraints
    //need to add different dates
    public void getDateDiff(String date, int campDate) throws ParseException {
//        Date today = Calendar.getInstance().getTime();
//        System.out.println("todays date: " + today);

        Date month = null;

        switch (campDate){
            case 1:
                month = new SimpleDateFormat("dd/MM/yyyy").parse("15/06/2022");
                break;
            case 2:
                month = new SimpleDateFormat("dd/MM/yyyy").parse("15/07/2022");
                break;
            case 3:
                month = new SimpleDateFormat("dd/MM/yyyy").parse("15/08/2022");
                break;
            default:
                System.out.println("incorrect option...");
                System.exit(0);
                break;
        }

        Date applicationDate = new SimpleDateFormat("dd/MM/yyyy").parse(date);

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
            System.out.println("go to next...");
        }else{
            System.out.println("something went wrong...");
        }
    }

    //function to ask for age of applicant
    public void checkAge(int age) throws ParseException {
        if(age < 9 || age > 18){
            sendReject();
        }else if(age >= 9 && age <= 18){
            //this would neeed to be changed
            sendAccept();
        }else{
            System.out.println("something is wrong...");
            checkAge(age);
        }
    }

    //send acceptance docs
    public void sendAccept(){
        //send acceptance package
        System.out.println("Congrats on acceptance. Arrival packet sent.");
    }

    //send rejection docs
    public void sendReject() throws ParseException {
        //send rejection
        System.out.println("Does not qualify...");
        System.exit(0);
    }
}
