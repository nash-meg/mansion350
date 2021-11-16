import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Login: user, pass, history of previous attempts
    //Link history with the choice method
    //Make history method last, choice method is just numbers (in same order each time), maybe arrayList,
    //Maybe pop up as a text file after the end to see what you did

public class LoginManger {
    String user;
    String pass;
    String action;
    Registration loginUser;

    //Initiating the scanner + making ArrayList to receive username and password
    Scanner reader = new Scanner(System.in);
    List<Registration> regList = new ArrayList<>();

    //Prompting the user to login if not logged in
    public boolean login(){
        boolean userLoggedIn = false;

        while (!userLoggedIn){
            promptUser();
            userLoggedIn = checkUserInput();
        }
        return true;
    }

    //Either logging in old users or registering new users
    private boolean checkUserInput() {
        if (action.equals("L")) {
            for (Registration r : regList) {r.getPass().equals(pass)) {
                    System.out.println("You are logged in as " + user + ".");
                    loginUser = r;
                    return true;
                }
            }
            System.out.println("Invalid username and/or password. Please try again.");
            return false;
        }else{
            Registration r = new Registration(user, pass);
            regList.add(r);
            loginUser = r;
            System.out.println("Your registration has been completed and you have been automatically logged in.");
            return true;
        }
    }

    //Print statements for login/register actions
    public void promptUser(){
        System.out.println("Please login if you are returning or register for an account if you are new.");
        System.out.println("Type L for login or R for register.");

        action = reader.nextLine();
        System.out.print("Enter username: ");
        user = reader.nextLine();
        System.out.println();
        System.out.print("Enter password: ");
        pass = reader.nextLine();
        System.out.println();
    }
}
