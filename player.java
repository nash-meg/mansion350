public class player {

    //need to add a login: user, pass, and history of previous attempts
        //need to link history with the choice method
        //make history method last, choice method is just numbers (in same order each time), maybe arrayList,
            //maybe pop up as a text file after the end to see what you did

    //getters and setters for inventory
    //shoes, three booleans for cat, matches, coat, book, purple potion, letter opener
    private boolean shoes = false;
    private boolean petCat = false;
    private boolean ignoreCat = false;
    private boolean kickCat = false;
    private boolean matches = false;
    private boolean coat = false;
    private boolean book = false;
    private boolean purpPotion = false;
    private boolean letterOpen = false;

    /*********** SHOES *************/
    public boolean setShoes() {
        if (call room method and see if choice shoes){
            shoes = true;
        }
    }
    public boolean getShoes() {
        return shoes;
    }

    /*********** CAT ***********/
    public boolean setCat() {
        if (call room method and see if choice pet){
            petCat = true;
        } else if (call room and see if choice kick){
            kickCat = true;
        } else {
            ignoreCat = true;
        }
    }
 /** public boolean getCat() {
        return ;
    }
 **/

    /*********** MATCHES ***********/
    public boolean setMatches() {
        if (call room method and see if choice matches){
            matches = true;
        }
    }
    public boolean getMatches() {
        return matches;
    }

    /*********** COAT ***********/
    public boolean setCoat() {
        if (call room method and see if choice coat){
            coat = true;
        }
    }
    public boolean getCoat() {
        return coat;
    }

    /*********** BOOK ***********/
    public boolean setBook() {
        if (call room method and see if choice book){
            book = true;
        }
    }
    public boolean getBook() {
        return book;
    }

    /*********** PURPLE POTION ***********/
    public boolean setPurpPotion() {
        if (call room method and see if choice purpPotion){
            purpPotion = true;
        }
    }
    public boolean getPurpPotion() {
        return purpPotion;
    }

    /*********** LETTER OPENER ***********/
    public boolean setLetterOpen() {
        if (call room method and see if choice letterOpen){
            letterOpen = true;
        }
    }
    public boolean getLetterOpen() {
        return letterOpen;
    }

    //choice method: equals next keyboard input, var named choice, adds choice to arrayList then returns


    public static void main (String[] args){

    }

}

