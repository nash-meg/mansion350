public class mansion {

    //little thing for prologue
    boolean plate = false;
    /*********** NOTES *************/
    //outer methods are floors, inner methods are rooms
        //put all the room methods in their respective floor method

    //start of each room method:
        //call the GUI for each floor to show where you have been
        //call getters from player.class for inventory

    //main part of each room method:
        //println() the story
            //println("asdfghjkl. qwertyuiop zxcvbnm.");
        //println() the quesitons
            //println("What do you want to do:");
        //println() the options **USE LETTERS SO MAP INPUT EASIER**
                                //or should we use numbers so we can do check if input == int, if not check if input == m?
            //println("A - pqfnqpfn");
            //println("B - somfoefn");
            //println("C - wqfnmefn");
        //println() tell user to type in their option
            //println("Type the letter of the option you choose or press m for map");
        //scan the keyboard input + store in history
            //call playerChoice method from player.class

    //set any inventory
        //call setters from player.class
    //if statements to generate where to go next

    /*********** DIRECTIONS *************/
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
            "given opportunities by typing “m” and hitting enter.\n" +
            "We hope you enjoy, good luck, and don’t kick the cat.\n" +
            "- The devious minds behind the code");

    /*********** PROLOGUE *************/
    //prologue method - mostly text, there are options but they don't affect anything
        //show choices in history if time?

    /*********** FLOOR ONE *************/
    //room 1 - your bedroom
    /*
    public room1 (){

    }
     */

    //room 5a - hallway (a bc floor 1)
    /*
    public room5a (){

    }
     */

    //room 4 - mallory's bedroom
    /*
    public room4 (){

    }
     */

    /*********** FLOOR TWO *************/
    //room 5b - hallway (b bc floor 1)
    /*
    public room5b (){

    }
     */

    //room 9 - chamber (butler fight scene)
    /*
    public room9 (){

    }
     */

    //room 10 - chamber (potion room)
    /*
    public room10 (){

    }
     */

    //room 8 - hallway/stairway (no method for bathroom, just display)
    /*
    public room8 (){

    }
     */

    /*********** FLOOR THREE *************/
    //room 11 - kitchen
    /*
    public room11 (){

    }
     */

    //room 7 - greenhouse (not labeled on correct floor on pic)
    /*
    public room7 (){

    }
     */

    //hide from old man - crosses rooms, lots of booleans for if potion or spell book
    /*
    public hideFromMan (){

    }
     */

    /*********** CELLAR *************/
    //general (if not matches or pet cat)
    /*
    public generalCellar (){

    }
     */

    //if matches
    /*
    public matchCellar (){

    }
     */

    //if pet cat
    /*
    public petCatCellar (){

    }
     */

}
