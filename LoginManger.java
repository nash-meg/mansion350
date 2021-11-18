import javax.xml.xpath.XPath;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

//login: user, pass, history of previous attempts
    //link history with the choice method
    //make history method last, choice method is just numbers (in same order each time), maybe arrayList,
    //maybe pop up as a text file after the end to see what you did

public class LoginManger {
    String user;
    String pass;
    String email;
    String action;
    Registration loginUser;

    //Initiating the scanner + making ArrayList to receive username and password
    Scanner reader = new Scanner(System.in);


    //Prompting the user login
    public boolean login() {
        boolean userLoggedIn = false;

        while (!userLoggedIn) {
            promptUser();
            userLoggedIn = checkUserInput();
        }
        return true;
    }

    //Either logging in old users or registering new users
    private boolean checkUserInput() {

        if (action.equals("L".toLowerCase(Locale.ROOT))) {
            Registration.Load();
            for (Registration r : Registration.regList) {
                if (r.getUser().equals(user) && r.getPass().equals(pass) && r.getEmail().equals(email)) {
                    System.out.println("You are logged in as " + user + ".");
                    loginUser = r;
                    return true;
                }
            }
            System.out.println("Invalid username and/or password. Please try again.");
            return false;
        } else {
            Registration r = new Registration(user, pass, email);
            loginUser = r;
            r.Save();
            System.out.println("Your registration has been completed and you have been automatically logged in.");
            return true;

        }
    }

    //Print statements for login/register actions
    public void promptUser() {
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