import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LoginManger {
    String  user;
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
                    System.out.println("You are logged in");
                    loginUser = registration;
                    return true;
                }
            }
            System.out.println("Invalid username and or password, please try again");
            return false;

        }else{

            Registration registration = new Registration(user,pass);
            registrations.add(registration);
            loginUser = registration;
            System.out.println("Your registration has been completed and you have been automatically logged in");
            return true;

        }

    }
    public void promptUser(){
        System.out.println("Please login of register if you have not registered before");
        System.out.println("Please type L for login and R for register");

        action = reader.nextLine();
        System.out.print("Enter username: ");
        user = reader.nextLine();
        System.out.println();
        System.out.print("Enter password: ");
        pass = reader.nextLine();
        System.out.println();


    }
}
