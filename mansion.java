public class mansion {
    //little thing for prologue
    boolean plate = false;

    /*********** NOTES *************/
    //outer methods are floors, inner methods are rooms
        //put all the room methods in their respective floor method

    //start of each room method:
        //call getters from player.class for inventory

    //main part of each room method:
        //println() the story
            //println("asdfghjkl. qwertyuiop zxcvbnm.");
        //println() the quesitons
            //println("What do you want to do:");
        //println() the options
            //println("1 - pqfnqpfn");
            //println("2 - somfoefn");
            //println("3 - wqfnmefn");
        //println() tell user to type in their option
            //println("Type the letter of the option you choose or press m for map");
        //scan the keyboard input + store in history
            //call playerChoice method from player.class
            //**check if input == int, if not check if input == m
        //if statements to generate where to go next

    //set any inventory
        //call setters from player.class

    /*********** DIRECTIONS *************/
    public void directions() {
        System.out.println("Sinister Happenings at Huxley Manor\n" +
                "This game contains themes gore, violence, and manipulation/mind control.\n" +
                "Enter at your own risk...\n" +
                "Before goosebumps plague your arms and your eyes cannot be ripped away from the screen," +
                "here are some things to know about our spooky little game:\n" +
                "This is a text-based game, so there are very little graphics. If you don’t like reading," +
                "sorry bud, this isn’t the game for you. We want to let our words guide your imagination," +
                "and we figure you know how to scare yourself better than we ever could.\n" +
                "This is also a choose-your-own-adventure game, so you will read the story and choose from" +
                "a handful of actions at specific moments to determine what happens next. Some of these" +
                "options will allow you to continue through the escape, but some may result in death. Choose" +
                "wisely and you might make it out alive.\n" +
                "To select an option, type the number on your keyboard and hit enter. Also, some sections of" +
                "the story are longer than others, so you may need to hit enter to continue reading.\n" +
                "The one graphic you do get to reap the benefits of is a map. You can pull up this map during" +
                "given opportunities by typing “0” and hitting enter.\n" +
                "We hope you enjoy, good luck, and don’t kick the cat.\n" +
                "- The devious minds behind the code");
        System.out.println("Please choose an option below:");
        System.out.println("1 - Continue to game.\n" +
                "2 - Exit.");
        player.playerChoice();
    }

    /*********** PROLOGUE *************/
    //prologue method - mostly text, there are options but they don't affect anything
        //show choices in history if time?
    public void prologue() {
        System.out.println("story goes here" +
                "and here");
        System.out.println("Please choose an option below, or type \"0\" for the map:");
        System.out.println("1 - choice.\n" +
                "2 - choice.");
        player.playerChoice();
    }

    /*********** FLOOR ONE *************/
    //room 1 - your bedroom
    /*
    public void room1 (){
        System.out.println("story goes here" +
             "and here");
        System.out.println("Please choose an option below, or type "0" for the map:");
        System.out.println("1 - choice.\n" +
            "2 - choice.");
        player.playerChoice();
    }
     */

    //room 5a - hallway (a bc floor 1)
    /*
    public void room5a (){
        System.out.println("story goes here" +
             "and here");
        System.out.println("Please choose an option below, or type "0" for the map:");
        System.out.println("1 - choice.\n" +
            "2 - choice.");
        player.playerChoice();
    }
     */

    //room 4 - mallory's bedroom
    /*
    public void room4 (){
        System.out.println("story goes here" +
             "and here");
        System.out.println("Please choose an option below, or type "0" for the map:");
        System.out.println("1 - choice.\n" +
            "2 - choice.");
        player.playerChoice();
    }
     */

    /*********** FLOOR TWO *************/
    //room void 5b - hallway (b bc floor 1)
    /*
    public room5b (){
        System.out.println("story goes here" +
             "and here");
        System.out.println("Please choose an option below, or type "0" for the map:");
        System.out.println("1 - choice.\n" +
            "2 - choice.");
        player.playerChoice();
    }
     */

    //room 9 - chamber (butler fight scene)
    /*
    public void room9 (){
        System.out.println("story goes here" +
             "and here");
        System.out.println("Please choose an option below, or type "0" for the map:");
        System.out.println("1 - choice.\n" +
            "2 - choice.");
        player.playerChoice();
    }
     */

    //room 10 - chamber (potion room)
    /*
    public void room10 (){
        System.out.println("story goes here" +
             "and here");
        System.out.println("Please choose an option below, or type "0" for the map:");
        System.out.println("1 - choice.\n" +
            "2 - choice.");
        player.playerChoice();
    }
     */

    //room 8 - hallway/stairway (no method for bathroom, just display)
    /*
    public void room8 (){
        System.out.println("story goes here" +
             "and here");
        System.out.println("Please choose an option below, or type "0" for the map:");
        System.out.println("1 - choice.\n" +
            "2 - choice.");
        player.playerChoice();
    }
     */

    /*********** FLOOR THREE *************/
    //room 11 - kitchen
    /*
    public void room11 (){
        System.out.println("story goes here" +
             "and here");
        System.out.println("Please choose an option below, or type "0" for the map:");
        System.out.println("1 - choice.\n" +
            "2 - choice.");
        player.playerChoice();
    }
     */

    //room 7 - greenhouse (not labeled on correct floor on pic)
    /*
    public void room7 (){
        System.out.println("story goes here" +
             "and here");
        System.out.println("Please choose an option below, or type "0" for the map:");
        System.out.println("1 - choice.\n" +
            "2 - choice.");
        player.playerChoice();
    }
     */

    //hide from old man - crosses rooms, lots of booleans for if potion or spell book
    /*
    public void hideFromMan (){
        System.out.println("story goes here" +
             "and here");
        System.out.println("Please choose an option below, or type "0" for the map:");
        System.out.println("1 - choice.\n" +
            "2 - choice.");
        player.playerChoice();
    }
     */

    /*********** CELLAR *************/
    //general (if not matches or pet cat)
    /*
    public void generalCellar (){
        System.out.println("story goes here" +
             "and here");
        System.out.println("Please choose an option below, or type "0" for the map:");
        System.out.println("1 - choice.\n" +
            "2 - choice.");
        player.playerChoice();
    }
     */

    //if matches
    /*
    public void matchCellar (){
        System.out.println("story goes here" +
             "and here");
        System.out.println("Please choose an option below, or type "0" for the map:");
        System.out.println("1 - choice.\n" +
            "2 - choice.");
        player.playerChoice();
    }
     */

    //if pet cat
    /*
    public void petCatCellar (){
        System.out.println("story goes here" +
             "and here");
        System.out.println("Please choose an option below, or type "0" for the map:");
        System.out.println("1 - choice.\n" +
            "2 - choice.");
        player.playerChoice();
    }
     */

}
