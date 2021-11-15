
public class player {


    private boolean shoes = false;
    private boolean petCat = false;
    private boolean ignoreCat = false;
    private boolean kickCat = false;
    private boolean matches = false;
    private boolean coat = false;
    private boolean book = false;
    private boolean purpPotion = false;
    private boolean letterOpen = false;


   //need to add a login: user, pass, and history of previous attempts
        //need to link history with the choice method
        //make history method last, choice method is just numbers (in same order each time), maybe arrayList,
            //maybe pop up as a text file after the end to see what you did

    public player() {

    System.out.println("The game has begun!");
    LoginManger loginManger = new LoginManger();

    boolean userLoggedIn = loginManger.login();
        while (!userLoggedIn ){
        userLoggedIn = loginManger.login();

    }
}

    //getters and setters for inventory:
    //shoes, three booleans for cat, matches, coat, book, purple potion, letter opener
    /*********** SHOES *************/
    public void setShoes() { shoes = true; }
    public boolean getShoes() { return shoes; }

    /*********** CAT ***********/
    public void setPetCat() { petCat = true; }
    public void setKickCat() { kickCat = true; }
    public void setIgnoreCat() { ignoreCat = true; }

    public boolean getPetCat() { return petCat; }
    public boolean getKickCat() { return kickCat; }
    public boolean getIgnoreCat() { return ignoreCat; }

    /*********** MATCHES ***********/
    public void setMatches() { matches = true; }
    public boolean getMatches() { return matches; }

    /*********** COAT ***********/
    public void setCoat() { coat = true; }
    public boolean getCoat() { return coat; }

    /*********** BOOK ***********/
    public void setBook() { book = true; }
    public boolean getBook() { return book; }

    /*********** PURPLE POTION ***********/
    public void setPurpPotion() { purpPotion = true; }
    public boolean getPurpPotion() { return purpPotion; }

    /*********** LETTER OPENER ***********/
    public void setLetterOpen() { letterOpen = true; }
    public boolean getLetterOpen() { return letterOpen; }


      //choice method: equals next keyboard input, var named choice, adds choice to arrayList then returns


}


