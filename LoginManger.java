import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LoginManger {
    String user;
    String pass;
    String action;
    Registration loginUser;

    Scanner reader = new Scanner(System.in);
    List<Registration> registrations = new ArrayList<>();

    public boolean login(){
        boolean userLoggedIn = false;

        while (!userLoggedIn ){
            promptUser();
            userLoggedIn = checkUserInput();
        }
        return true;
    }

    private boolean checkUserInput() {
        if (action.equals("L")) {
            for (Registration registration : registrations) {
                if (registration.getUser().equals(user) && registration.getPass().equals(pass)) {
                    System.out.println("You are logged in as " + user + ".");
                    loginUser = registration;
                    return true;
                }
            }
            System.out.println("Invalid username and/or password. Please try again.");
            return false;
        }else{
            Registration registration = new Registration(user, pass);
            registrations.add(registration);
            loginUser = registration;
            System.out.println("Your registration has been completed and you have been automatically logged in.");
            return true;
        }
    }
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
