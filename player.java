import java.util.ArrayList;
import java.util.Scanner;

public class player {
    //Boolean variables for inventory getters and setters
    private boolean shoes = false;
    private boolean petCat = false;
    private boolean ignoreCat = false;
    private boolean kickCat = false;
    private boolean matches = false;
    private boolean coat = false;
    private boolean book = false;
    private boolean purpPotion = false;
    private boolean letterOpen = false;
    ArrayList<Integer> choiceList = new ArrayList<Integer>();
    //Int variable + scanner for choice method
    Scanner keyboard = new Scanner(System.in);
    private int choice = -1;

    public player() {
        // idk where to put this
        System.out.println("The game has begun!");
        LoginManger loginManger = new LoginManger();

        boolean userLoggedIn = loginManger.login();
        while (!userLoggedIn) {
            userLoggedIn = loginManger.login();
        }
       // */
    }

    //Getters and setters for inventory:
    //Shoes, three booleans for cat, matches, coat, book, purple potion, letter opener
    /*********** SHOES *************/
    public void setShoes(){ shoes = true; }
    public boolean getShoes() { return shoes; }

    /*********** CAT ***********/
    public void setPetCat () { petCat = true; }
    public void setKickCat () { kickCat = true; }
    public void setIgnoreCat () { ignoreCat = true; }

    public boolean getPetCat () { return petCat; }
    public boolean getKickCat () { return kickCat; }
    public boolean getIgnoreCat () { return ignoreCat; }

    /*********** MATCHES ***********/
    public void setMatches () { matches = true; }
    public boolean getMatches () { return matches; }

    /*********** COAT ***********/
    public void setCoat () { coat = true; }
    public boolean getCoat () { return coat; }

    /*********** BOOK ***********/
    public void setBook () { book = true; }
    public boolean getBook () { return book; }

    /*********** PURPLE POTION ***********/
    public void setPurpPotion () { purpPotion = true; }
    public boolean getPurpPotion () { return purpPotion; }

    /*********** LETTER OPENER ***********/
    public void setLetterOpen () { letterOpen = true; }
    public boolean getLetterOpen () { return letterOpen; }

    //Choice method:
    //Equals next keyboard input, add choice to arrayList then returns
    public int playerChoice() {
        choice = keyboard.nextInt();
        if (choice == 0) {
            return 0;
        } else if (choice > 0 ) {
            choiceList.add(choice);
            return choice;
        } else {
            System.out.println("Invalid choice, please type a letter from the options above or 0 to see the map.");
            return -2;
        }
    }
}



