public class mansion {
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
        System.out.println("You hear an *odd cat noise.* You urn around and see the cat " +
                "growing into an eight-foot tall creature with way too many limbs that " +
                "resembles the butler. As he’s growing, he mutters out some animalistic-like " +
                "noises that you could’ve sworn sound like an “I’m sorry.” You’re backing " +
                "up into the door/shuffling along the room to a door.\n" +
                "The giant butler thing lunges STRAIGHT AT YOU! QUICK REACT! " +
                "(Type a number below, or type 0 for the map).");
        System.out.println("1 - DUCK!\n" +
                "2 - MOVE TO THE SIDE!");
        if (player.getLetterOpen() ==  true) {
            System.out.println("3 - USE LETTER OPENER!\n"
        }
        player.playerChoice();
        if (playerChoice() == 1) { //duck
            System.out.println("You're on the floor! What now??");
            System.out.println("1 - Try to crawl away!\n" +
                    "2 - Be scared!");
            if (player.getLetterOpen() ==  true) {
                System.out.println("3 - Use the letter opener!\n"
            }
            player.playerChoice();
            if (playerChoice() == 1) { //crawl
                if (player.getPetCat() == true) {
                    System.out.println("The butler thing lets you crawl away, you " +
                            "open the door, he makes eye contact with you, then he " +
                            "walks away, you close the door without a sound");
                    room10();
                } else {
                    System.out.println("Get grabbed, thrown in fire???");
                    //death
                }
            } else if (playerChoice() == 2) { //scared
                if (player.getPetCat() == true) {
                    System.out.println("The butler thing hesitates, you hear another " +
                            "sound that clearly sounds like “RUN!” before he goes after you, " +
                            "you scramble towards the door, open it, slam it shut after you go in");
                    room10();
                } else {
                    System.out.println("Neck breaks");
                    //death
                }
            } else if (playerChoice() == 3) { //letter opener
                System.out.println("Stab, absorbed into “butler” arm, comes out as claw");
                //death
            }
        } else if (playerChoice() == 2) { //move to side
            System.out.println("What now??");
            System.out.println("1 - Grab some books and throw!\n" +
                    "2 - Grab some books and read the spells!\n" +
                    "3 - Climb the bookshelf!");
            player.playerChoice();
            if (playerChoice() == 1) { //throw books
                if (player.getPetCat() == true || player.getIgnoreCat() == true) {
                    System.out.println("The butler thing rips up the books, gets " +
                            "disoriented, you run to the other room");
                    room10();
                } else {
                    System.out.println("Butler gets angry, charges you");
                    //death
                }
            } else if (playerChoice() == 2) { //read spells
                if (player.getPetCat() == true) {
                    System.out.println("You read a good spell: changes him back to the " +
                            "normal butler, you run to the next room in case he changes back");
                    room10();
                } else if (player.getIgnoreCat() == true){
                    System.out.println("The spell appears to do nothing, paralyzes butler, " +
                            "you run to the next room before it wears off");
                    room10();
                } else {
                    System.out.println("You read a bad spell: butler grows more limbs + " +
                            "taller, torso opens and eats you");
                    //death
                }
            } else if (playerChoice() == 3) { //climb bookshelf
                System.out.println("You fall, hit your head on the coffee table");
                //death
            }
        } else if (playerChoice() == 3) { //letter opener
            System.out.println("Okay a letter opener is a good weapon!\n" +
                    "Where do you strike him with it???");
            System.out.println("1 - Aim for the throat!\n" +
                    "2 - Aim for the hand!");
            player.playerChoice();
            if (playerChoice() == 1) { //throat
                System.out.println("The butler’s hand grabs you, and slams you into the wall. " +
                        "He crushes you");
                //death
            } else if (playerChoice() == 2) { //hand
                //Same death as duck with letter opener
                System.out.println("Stab, absorbed into “butler” arm, comes out as claw");
                //death
            }
        } else if (playerChoice() == 0) { //map
            System.out.println("The butler thing is coming at you!! Why are you trying to look at the map?!");
            //redisplay options
        }
    }

    //room 10 - chamber (potion room)
    public void room10 (){
        System.out.println("You take a look around and see a room full of potions.\n" +
                "What do you want to do? (Type a number below, or type 0 for the map).");
        System.out.println("1 - Examine the purple potion.\n" +
                "2 - Examine the yellow potion.\n" +
                "3 - Examine a clear, labeled potion.\n" +
                "4 - Examine a clear, unlabeled potion.\n" +
                "5 - Leave, go down the hall.");
        player.playerChoice();
        if (playerChoice() == 1) { //purple
            System.out.println("Label faded and says “Sight” in latin - aspectum");
            System.out.println("Do you drink it?");
            System.out.println("1 - Yes.\n" +
                    "2 - No.");
            player.playerChoice();
            if (playerChoice() == 1) {
                System.out.println("You turn your head towards the other potions and in " +
                        "the reflection of the liquid, you see the old man on a stairway, " +
                        "blood-covered, humming to himself. He stops, turns around, then " +
                        "goes back down the stairs, you look away");
                player.setPurpPotion();
                System.out.println("You hear some thumping in the room over, so you decide " +
                        "to skert down the hall and keep moving.");
                room8();
            } else if (playerChoice() == 2) {
                //redisplay potion options
            }
        } else if (playerChoice() == 2) { //yellow
            System.out.println("Label faded and says “Plan B” in cursive");
            System.out.println("Do you drink it?");
            System.out.println("1 - Yes.\n" +
                    "2 - No.");
            player.playerChoice();
            if (playerChoice() == 1) {
                System.out.println("It’s acid!");
                //death
            } else if (playerChoice() == 2) {
                //redisplay potion options
            }
        } else if (playerChoice() == 3) { //clear labeled
            System.out.println("Label faded and says “healing” in latin - sanitatem");
            System.out.println("Do you drink it?");
            System.out.println("1 - Yes.\n" +
                    "2 - No.");
            player.playerChoice();
            if (playerChoice() == 1) {
                System.out.println("It's alcohol!");
                //redisplay potion options
            } else if (playerChoice() == 2) {
                //redisplay potion options
            }
        } else if (playerChoice() == 4) { //clear unlabeled
            System.out.println("There is no label on this bottle.");
            System.out.println("Do you drink it?");
            System.out.println("1 - Yes.\n" +
                    "2 - No.");
            player.playerChoice();
            if (playerChoice() == 1) {
                System.out.println("Water, nothing happens");
                //redisplay potion options
            } else if (playerChoice() == 2) {
                //redisplay potion options
            }
        } else if (playerChoice() == 5) { //leave
            room8();
        }else if (playerChoice() == 0) { //map
            //display map
        }
    }

    //room 8 - hallway/stairway (no method for bathroom, just display)
    public void room8 () {
        System.out.println("You now walk down the hallway.\n" +
                "What do you want to do? (Type a number below, or type 0 for the map).");
        System.out.println("1 - Try the boarded up door.\n" +
                "2 - Enter the open door.\n" +
                "3 - Go down the stairs.");
        player.playerChoice();
        if (playerChoice() == 1) { //boarded door
            System.out.println("You can't break open this door.");
            //redisplay options
        } else if (playerChoice() == 2) { //open door
            System.out.println("You walk into a bathroom.\n" +
                    "What would you like to do?");
            System.out.println("1 - Take a piss.\n" +
                    "2 - Leave.");
            player.playerChoice();
            if (playerChoice() == 1) { //piss
                System.out.println("You take a much needed piss.");
                //redisplay options
            } else if (playerChoice() == 2) { //leave
                //redisplay options
                //if you pick bathroom again, System.out.println(“It’s literally just a bathroom”); and redisplay
            }
        } else if (playerChoice() == 3) { //go downstairs
            if (player.getShoes() == true) {
                System.out.println("You hear the thump of your shoes and cringe, " +
                        "hoping he doesn’t hear you clomping down.");
                System.out.println("He kills you at the foot of the stairs.");
                //death
            } else {
                room11();
            }
        } else if (playerChoice() == 0) { //map
            //display map
        }
    }

    /*********** FLOOR THREE *************/
    //room 11 - kitchen
    public void room11 (){
        System.out.println("You find yourself in the kitchen. Probably a good place to look " +
                "for a weapon in case you get into another fight...\n" +
                "What will you search? (Type a number below, or type 0 for the map).");
        System.out.println("1 - Search the drawers.\n" +
                "2 - Look in the pantry.\n" +
                "3 - Look in the cabinets.\n" +
                "4 - Look in the fridge.\n" +
                "5 - Try the far door.\n" +
                "6 - Try the close door.\n" +
                "7 - Go into the next room.");
        player.playerChoice();
        if (playerChoice() == 1) { //search drawers
            System.out.println("First drawer is an empty utensil drawer. You open the one next to it " +
                    "to find an empty drawer with note that says \"Nice try\"");
            //redisplay options
        } else if (playerChoice() == 2) { //pantry
            System.out.println("You open the pantry and see normal food - he likes goldfish too hehe.");
            //redisplay options
        } else if (playerChoice() == 3) { //cabinets
            System.out.println("See a skull - have seen the skull before, realize that it was not decorative.");
            //redisplay options
        } else if (playerChoice() == 4) { //fridge
            System.out.println("As you reach for the handle, you see bloody handprint on fridge door." +
                    "Realizes cranberry juice is blood (knocked over and dripping on the " +
                    "shelf, thicker/ congealed)");
            //redisplay options
        } else if (playerChoice() == 5) { //far door
            room7();
        } else if (playerChoice() == 6) { //close door
            System.out.println("This door is very locked, you can't get in.");
            //redisplay options
        } else if (playerChoice() == 7) { //next room
            hideFromMan();
        } else if (playerChoice() == 0) { //map
            //display map
        }
    }

    //room 7 - greenhouse (not labeled on correct floor on pic)
    public void room7 (){
        System.out.println("Going through this door leads you into a herb garden. " +
                "See basil, thyme, oregano, an orchid, normal plants, and a carnivorous " +
                "plant, other spooky plants");
        if(player.getCoat() == true) {
            System.out.println("The carnivorous plants start munching on your coat!! " +
                    "You quickly slide out of your coat and leave the greenhouse.");
            //redisplay options
        } else {
            System.out.println("The carnivorous plants eat you");
            //death
        }
    }

    //hide from old man - crosses rooms, lots of booleans for if potion or spell book
    public void hideFromMan (){
        if (player.getPurpPotion() == true) {
            System.out.println("You see an image of the old man going up the stairs " +
                    "toward the kitchen in the mirror.\n" +
                    "QUICK! Choose an option below!\"");
            System.out.println("1 - Hide in the pantry!\n" +
                    "2 - Hide behind the kitchen door!\n" +
                    "3 - Hide in the cupboard under the sink!");
            player.playerChoice();
            if (playerChoice() == 1) { //pantry
                System.out.println("You hear him rummaging around, see the shadow of " +
                        "his feet just outside the door, hear door knob jiggle, Meow???, " +
                        "he turns and walks upstairs instead\n");
                System.out.println("You run out, try the front door, hear him coming " +
                        "back downstairs, you run down to the basement/cellar.");
                cellar();
            } else if (playerChoice() == 2) { //kitchen door
                System.out.println("Works but needs to be really creepy. Walks very " +
                        "slowly, bends down to get something from drawer, could see you " +
                        "but doesn’t turn head, goes upstairs\n");
                System.out.println("You run out, try the front door, hear him coming " +
                        "back downstairs, you run down to the basement/cellar.");
                cellar();
            } else if (playerChoice() == 3) { //under sink
                System.out.println("Death bc cant fit");
                //death
            } else if (playerChoice() == 0) { //map
                System.out.println("Oh my god the old man is coming!! There's no time for the map!!");
                //redisplay options
            }
        } else {
            System.out.println("The old man comes upstairs from cellar without warning, " +
                    "you dart into the next room");
            System.out.println("What do you do??");
            System.out.println("1 - HIDE!\n");
            if (player.getBook() == true) {
                System.out.println("2 - OMG you have a spell book! Use it!\n");
            }
            player.playerChoice();
            if (playerChoice() == 1) { //hide
                System.out.println("Death bc he’s literally a sorcerer and you’re a normie");
                //death
            } else if (playerChoice() == 2) { //book
                System.out.println("Read the spell in front of him. \"You think I’d have a " +
                        "book with spells that work on me? (or something)\", read spell, " +
                        "turns you invisible, book turns to ash in your hands, " +
                        "you run down to the cellar\n");
                cellar();
            } else if (playerChoice() == 0) { //map
                System.out.println("Oh my god the old man is coming!! There's no time for the map!!");
                //redisplay options
            }
        }
    }

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

/*
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
 */