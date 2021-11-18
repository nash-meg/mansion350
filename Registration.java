import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Registration {
    private String user;
    private String pass;
    private String email;
    static List<Registration> regList = new ArrayList<>();

    //Constructor and assigned input to variables
    public Registration(String user, String pass, String email) {
        this.user = user;
        this.pass = pass;
        this.email = email;
    }

    //Getters and setters
    /*********** USERNAME ***********/
    public String getUser() {
        return user;
    }
    public void setUser(String user) {
        this.user = user;
    }

    /*********** PASSWORD ***********/
    public String getPass() {
        return pass;
    }
    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String pass) {
        this.email = pass;
    }

    // Save method
    public void Save() {
        try {
            File file = new File("forAccounts.txt");
            file.createNewFile();// create a file
            FileWriter fileWriter = new FileWriter(file); // write to the file
            fileWriter.write(user, 0 ,user.length());// write the username to the file
            fileWriter.write("\n");
            fileWriter.write(pass, 0 ,pass.length());// write the username to the file
            fileWriter.write("\n");
            fileWriter.write(email, 0 ,email.length());// write the username to the file
            fileWriter.write("\n");
            fileWriter.write("\n");
            fileWriter.close();
            System.out.println("You have been registered.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Load method
    public static void Load(){
        try {
            File file = new File("forAccounts.txt");
            Scanner scanner = new Scanner(file); // write to the file
            // if scanner.hasNextlinin == false{ s,o,p; return;}

            String user = scanner.nextLine(); // check each line
            String pass = scanner.nextLine();
            String email = scanner.nextLine();
            Registration registration = new Registration(user, pass, email);
            regList.add(registration);

            while (scanner.hasNextLine()){ // add to the list
                if(scanner.nextLine() ==""){// check to see if the line is empty
                    user = scanner.nextLine();
                    pass = scanner.nextLine();
                    email = scanner.nextLine();
                    registration = new Registration(user, pass, email);
                    regList.add(registration);
                }
            }
            System.out.println("You have been logged in.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

