public class mansion {

    /*********** NOTES *************/
    //outer methods are floors, inner methods are rooms
    //put all the room methods in their respective floor method

    //start of each room method:
    //call getters from player.class for inventory

    //main part of each room method:
    //println() the story
    //println() the quesitons
    //println() the options
    //println() tell user to type in their option
    //scan the keyboard input + store in history
    //call playerChoice method from player.class
    //if statements to generate where to go next

    //set any inventory
    //call setters from player.class

    /*********** DIRECTIONS *************/
    public void directions() {
        System.out.println("Sinister Happenings at Huxley Manor\n" +
                "This game contains themes gore, violence, and manipulation/mind control.\n" +
                "Enter at your own risk...\n" +
                "Before goosebumps plague your arms and your eyes cannot be ripped away from the screen, " +
                "here are some things to know about our spooky little game:\n" +
                "This is a text-based game, so there are very little graphics. If you don’t like reading, " +
                "sorry bud, this isn’t the game for you. We want to let our words guide your imagination, " +
                "and we figure you know how to scare yourself better than we ever could.\n" +
                "This is also a choose-your-own-adventure game, so you will read the story and choose from " +
                "a handful of actions at specific moments to determine what happens next. Some of these " +
                "options will allow you to continue through the escape, but some may result in death. Choose " +
                "wisely and you might make it out alive.\n" +
                "To select an option, type the number on your keyboard and hit enter. Also, some sections of " +
                "the story are longer than others, so you may need to hit enter to continue reading.\n" +
                "The one graphic you do get to reap the benefits of is a map. You can pull up this map during " +
                "given opportunities by typing 0 and hitting enter.\n" +
                "We hope you enjoy, good luck, and don’t kick the cat.\n" +
                "- The devious minds behind the code");
        System.out.println("Please choose an option below:");
        System.out.println("1 - Continue to game.\n" +
                "2 - Exit.");
        player.playerChoice();
        if (playerChoice() == 1) { //continue
            prologue();
        } else if (playerChoice() == 2) { //exit
            //leave game
        }
    }

    /*********** PROLOGUE *************/
    //prologue method - mostly text, there are options but they don't affect anything
    //show choices in history if time?
    public void prologue() {
        System.out.println("story goes here" +
                "and here");
        System.out.println("Please choose an option below:");
        System.out.println("1 - choice.\n" +
                "2 - choice.");
        player.playerChoice();
    }

    /*********** FLOOR ONE *************/
    //room 1 - your bedroom
    public void room1() {
        System.out.println("You start in your room.\n" +
                "What do you want to do? (Type a number below, or type 0 for the map).");
        System.out.println("1 - Leave through the door.\n" +
                "2 - Search the floor.\n" +
                "3 - Go back to sleep");
        player.playerChoice();
        if (playerChoice() == 1) { //leave
            room5a();
        } else if (playerChoice() == 2) { //search floor
            System.out.println("It’s a floor.");
            //redisplay options - idk how?
        } else if (playerChoice() == 3) { //back to sleep
            System.out.println("You can’t sleep. This is a horror game.");
            //redisplay options
        } else if (playerChoice() == 0) { //map
            //display map
        }
    }


    //room 5a - hallway (a bc floor 1)
    public void room5a() {
        System.out.println("You now walk out into the hallway.\n" +
                "What do you want to do? (Type a number below, or type 0 for the map).");
        System.out.println("1 - Go down the stairs.\n" +
                "2 - Try opening the door on your left.\n" +
                "3 - Try opening the door straight ahead.\n" +
                "4 - Try opening the boarded up door.");
        player.playerChoice();
        if (playerChoice() == 1) { //down stairs
            room5b();
        } else if (playerChoice() == 2) { //left door
            System.out.println("This door is locked, you can't get in.");
            //redisplay options
        } else if (playerChoice() == 3) { //door ahead
            room4();
        } else if (playerChoice() == 4) { //boared door
            System.out.println("You can’t bust through this door.");
            //redisplay options
        } else if (playerChoice() == 0) { //map
            //display map
        }
    }

    //room 4 - mallory's bedroom
    public void room4() {
        System.out.println("The door was unlocked. You enter what appears to be the other boy's room.\n" +
                "What do you do? (Type a number below, or type 0 for the map)");
        System.out.println("1 - Search the bed.\n" +
                "2 - Search the closet.\n" +
                "3 - Search the desk");
        player.playerChoice();
        if (playerChoice() == 1) { //bed
            System.out.println("Where specifically would you like to search?");
            System.out.println("1 - Under the pillow.\n" +
                    "2 - Under the mattress.");
            player.playerChoice();
            if (playerChoice() == 1) { //pillow
                System.out.println("There is nothing under here.");
                //redisplay options (idk if do bed options or room4 options)
            } else if (playerChoice() == 2) { //mattress
                System.out.println("You find some iron shackles with what looks like blood on " +
                        "the wrists. They are bolted to the floor underneath the bed.");
                //redisplay options (idk if do bed options or room4 options)
            }
        } else if (playerChoice() == 2) { //closet
            System.out.println("You see two items, which would you like to examine?");
            System.out.println("1 - A pair of shoes.\n" +
                    "2 - A worn coat.");
            player.playerChoice();
            if (playerChoice() == 1) { //shoes
                System.out.println("Description about the shoes.");
                System.out.println("Would you like to put them on?");
                System.out.println("1 - Yes.\n" +
                        "2 - No.");
                player.playerChoice();
                if (playerChoice() == 1) { //yes
                    System.out.println("You are now wearing shoes.");
                    player.setShoes();
                    //redisplay options (idk if do closet options or room4 options)
                } else if (playerChoice() == 2) { //no
                    System.out.println("You did not put on the shoes.");
                    //redisplay options (idk if do closet options or room4 options)
                }
            } else if (playerChoice() == 2) { //coat
                System.out.println("Description about the coat.");
                System.out.println("Would you like to put it on?");
                System.out.println("1 - Yes.\n" +
                        "2 - No.");
                player.playerChoice();
                if (playerChoice() == 1) { //yes
                    System.out.println("You are now wearing the coat.");
                    player.setCoat();
                    //redisplay options (idk if do closet options or room4 options)
                } else if (playerChoice() == 2) { //no
                    System.out.println("You did not put on the coat.");
                    //redisplay options (idk if do closet options or room4 options)
                }
            }
        } else if (playerChoice() == 3) { //desk
            System.out.println("You see two items, which would you like to examine?");
            System.out.println("1 - A picture.\n" +
                    "2 - A book.");
            player.playerChoice();
            if (playerChoice() == 1) { //picture
                System.out.println("Description about the picture: health and date.");
                //redisplay options (idk if do desk options or room4 options)
            } else if (playerChoice() == 2) { //book
                System.out.println("Description about the book: spells, trying to reverse.");
                //redisplay options (idk if do desk options or room4 options)
            }
        }
    }

    /*********** FLOOR TWO *************/
    //room void 5b - hallway (b bc floor 2)
    public void room5b() {
        System.out.println("You're now on a new level of the house. The board squeaks, " +
                "you feel as though you're being watched, and blades swing from ceiling");
        System.out.println("QUICK! DO SOMETHING! (Type a number below, or type 0 for the map)");
        System.out.println("1 - DUCK!\n" +
                "2 - TRY DOORS!\n" +
                "3 - RUN THROUGH HALL!");
        player.playerChoice();
        if (playerChoice() == 1) { //duck
            System.out.println("Oh my god you ducked just in time! What now???");
            System.out.println("1 - Crawl to open door!\n" +
                    "2 - Crawl to closed door!");
            player.playerChoice();
            if (playerChoice() == 1) { //open door
                System.out.println("pitch black, recovery moment to breath, hand reaches " +
                        "out in front of you in hallway light, you rocket upright, hitting the " +
                        "lightswitch, see only a cat in the room with hUGEEE shadow (kinda butler-like?)");
                System.out.println("How do you react to the cat?");
                System.out.println("1 - Kick the cat away.\n" +
                        "2 - Reach out to pet the cat.\n" +
                        "3 - Ignore the cat.");
                player.playerChoice();
                if (playerChoice() == 1) { //kick
                    player.setKickCat();
                    room9();
                } else if (playerChoice() == 2) { //pet
                    player.setPetCat();
                    room9();
                } else if (playerChoice() == 3) { //ignore
                    player.setIgnoreCat();
                    room9();
                }
            } else if (playerChoice() == 2) { //closed door
                System.out.println("Why would you crawl here?? The door doesn't open!" +
                        " Crawl back to the open door.");
            }
        } else if (playerChoice() == 2) { //doors
            System.out.println("Death by blades");
            //death screen, exit
        } else if (playerChoice() == 3) { //run
            System.out.println("Death by blades");
            //death screen, exit
        } else if (playerChoice() == 0) { //map
            System.out.println("Blades are swinging from the ceiling!! This is no time to look at the map!");
            //redisplay options
        }
    }

    //room 9 - chamber (pre fight scene)
    public void room9 () {
        System.out.println("You have made it into some sort of chamber.\n" +
                "What would you like to do? (Type a number below, or type 0 for the map).");
        System.out.println("1 - Explore the bookcase.\n" +
                "2 - Explore the coffee table.\n" +
                "3 - Explore the fireplace.");
        player.playerChoice();
        if (playerChoice() == 1) { //bookcase
            System.out.println("You see a book that looks so familiar to the one from Mallory's room.\n" +
                    "What do you do with it?");
            System.out.println("1 - Shove it in your pocket.\n" +
                    "2 - Leave it.");
            player.playerChoice();
            if (playerChoice() == 1) { //take
                player.setBook();
                room9Fight();
            } else if (playerChoice() == 2) { //leave
                room9Fight();
            }
        } else if (playerChoice() == 2) { //coffee table
            System.out.println("You find a lette opener amongst other things.\n" +
                    "What do you do with it?");
            System.out.println("1 - Slide it into your pocket.\n" +
                    "2 - Leave it.");
            player.playerChoice();
            if (playerChoice() == 1) { //take
                player.setLetterOpen();
                room9Fight();
            } else if (playerChoice() == 2) { //leave
                room9Fight();
            }
        } else if (playerChoice() == 3) { //fireplace
            System.out.println("You find a small box of matches atop the fireplace mantle.\n" +
                    "What do you do?");
            System.out.println("1 - Tuck it into your pocket.\n" +
                    "2 - Leave it.");
            player.playerChoice();
            if (playerChoice() == 1) { //take
                player.setMatches();
                room9Fight();
            } else if (playerChoice() == 2) { //leave
                room9Fight();
            }
        } else if (playerChoice() == 0) { //map
            //display map
        }
    }

    //room 9 - chamber (butler fight scene)
    public void room9Fight (){
        //will need to call player.getPetCat(), player.getKickCat(), and player.getIgnoreCat() in different places later
        //will need to call player.getLetterOpen() in two places later
        System.out.println("story goes here" +
                "and here");
        System.out.println("Please choose an option below, or type 0 for the map:");
        System.out.println("1 - choice.\n" +
                "2 - choice.");
        player.playerChoice();
    }

    //room 10 - chamber (potion room)
    /*
    public void room10 (){
        //remember player.setPurpPotion()
        System.out.println("story goes here" +
             "and here");
        System.out.println("Please choose an option below, or type 0 for the map:");
        System.out.println("1 - choice.\n" +
            "2 - choice.");
        player.playerChoice();
    }
     */

    //room 8 - hallway/stairway (no method for bathroom, just display)
    /*
    public void room8 (){
        //need to call player.getShoes()
        System.out.println("story goes here" +
             "and here");
        System.out.println("Please choose an option below, or type 0 for the map:");
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
        System.out.println("Please choose an option below, or type 0 for the map:");
        System.out.println("1 - choice.\n" +
            "2 - choice.");
        player.playerChoice();
    }
     */

    //room 7 - greenhouse (not labeled on correct floor on pic)
    /*
    public void room7 (){
        //need to call player.getCoat()
        System.out.println("story goes here" +
             "and here");
        System.out.println("Please choose an option below, or type 0 for the map:");
        System.out.println("1 - choice.\n" +
            "2 - choice.");
        player.playerChoice();
    }
     */

    //hide from old man - crosses rooms, lots of booleans for if potion or spell book
    /*
    public void hideFromMan (){
        //need to call player.getPurpPotion() and player.getBook() to determine which plot
        System.out.println("story goes here" +
             "and here");
        System.out.println("Please choose an option below, or type 0 for the map:");
        System.out.println("1 - choice.\n" +
            "2 - choice.");
        player.playerChoice();
    }
     */

    /*********** CELLAR *************/
    //need to call player.getMatches() and then player.getPetCat()

    //general (if not matches or pet cat)
    /*
    public void generalCellar (){
        System.out.println("story goes here" +
             "and here");
        System.out.println("Please choose an option below, or type 0 for the map:");
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
        System.out.println("Please choose an option below, or type 0 for the map:");
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
        System.out.println("Please choose an option below, or type 0 for the map:");
        System.out.println("1 - choice.\n" +
            "2 - choice.");
        player.playerChoice();
    }
     */

}
