import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String password;
        String current;
        String strength;
        boolean tf = false;
        boolean done = false;
        int pass;


        do {
            pass = 0;
            System.out.println("Enter a password:");
            password = scan.nextLine();
            //length
            if (password.length() < 12) {
                System.out.println("Your password should be at least 12 characters long.");
            }else{
                pass++;
            }

            //Upper case
            for (int i = 0; i < password.length(); i++) {
                current = password.substring(i, i+1);
                if(current.matches("[QAZWSXEDCRFVTGBYHNUJMIKOLP]")){
                    tf = true;
                }
            }
            if (tf) {
                pass++;
                tf = false;
            }else{
                System.out.println("You need a upper case letter.");
            }

            //lower case
            for (int i = 0; i < password.length(); i++) {
                current = password.substring(i, i+1);
                if(current.matches("[qazwsxedcrfvtgbyhnujmikolp]")){
                    tf = true;
                }
            }
            if (tf) {
                pass++;
                tf = false;
            }else{
                System.out.println("You need a lower case letter.");
            }

            //number
            for (int i = 0; i < password.length(); i++) {
                current = password.substring(i, i+1);
                if(current.matches("[1234567890]")){
                    tf = true;
                }
            }
            if (tf) {
                pass++;
                tf = false;
            }else{
                System.out.println("You need a number.");
            }

            //special character
            for (int i = 0; i < password.length(); i++) {
                current = password.substring(i, i+1);
                if(current.matches("[!#$%]")){
                    tf = true;
                }
            }
            if (tf) {
                pass++;
                tf = false;
            }else{
                System.out.println("You need a special character.");
            }

            //strength
            if (pass > 4) {
                strength = "strong";
            }else if(pass <= 2){
                strength = "weak";
            }else{
                strength = "medium";
            }
            System.out.println("You passed " + pass + "/5 tests. You password is " + strength + ".");

            if (!InputHelper.getYNConfirm(scan, "Would you like to continue? [Y/N]")) {
                done = true;
            }
        } while (!done);




    }
}