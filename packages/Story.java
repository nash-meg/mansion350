package packages;
import javax.swing.*;
import java.io.File;

public class Story {
    // Handle all the dialogues
    // Uses calling from the UI class, map class, Game class,
    Game game;
    UI ui;
    map m;
    boolean shoes;
    boolean coat;
    boolean purpPotion;
    boolean vodka;
    boolean water;
    boolean  matches;
    boolean letteropener;
    boolean littleBook;
    boolean kick;
    boolean pet;
    boolean ignore;

    // Constructor instantiate
    public Story(Game g,UI userInterface, map mDisplay){
        game = g;
        ui = userInterface;
        m = mDisplay;
        shoes = false;
        purpPotion = false;
        vodka = false;
        water = false;
        matches = false;
        littleBook = false;
        kick = false;
        pet = false;
        ignore = false;
        letteropener = false;
        coat = false;
    }

    ImageIcon Bedroom1 = new ImageIcon(".//mansion Game//Bedroom(1).jpg");
    ImageIcon CatFightRoom9 = new ImageIcon(".//mansion Game//Cat Fight(9).jpg");
    ImageIcon Cellar1 = new ImageIcon(".//mansion Game//Cellar(1).jpg");
    ImageIcon Cellar2= new ImageIcon(".//mansion Game//Cellar(2).png");
    ImageIcon Cellar3 = new ImageIcon(".//mansion Game//Cellar(3).png");
    ImageIcon Cellar4 = new ImageIcon(".//mansion Game//Cellar(4).png");
    ImageIcon Cellar5= new ImageIcon(".//mansion Game//Cellar(2).png");
    ImageIcon HallBeforeBathroom8 = new ImageIcon(".//mansion Game//Hallway before bathroom(8).jpg");
    ImageIcon Hallway5a = new ImageIcon(".//mansion Game//Hallway(5a).jpg");
    ImageIcon Hallway5b = new ImageIcon(".//mansion Game//Hallway(5b).jpg");
    ImageIcon Kitchen11 = new ImageIcon(".//mansion Game//Kitchen(11).jpg");
    ImageIcon MalloryRoom4= new ImageIcon(".//mansion Game//Mallory's Bedroom(4).jpg");
    ImageIcon PotionRoom10= new ImageIcon(".//mansion Game//Potion Room(10).jpg");
    ImageIcon cannibalPlantRoom7 = new ImageIcon(".//mansion Game//cannibal plant room(7).jpg");

    // choosePosition is receiving the parameter(position)
    // eg. if the choosePosition was towardsMansion then it will call towardsMansion() method
    public void choosePosition(String position){
        switch(position){
            case "theMansion": theMansion(); break;
            case "towardsMansion": towardsMansion(); break;
            case "ExitGame": ExitGame(); break;
            case "GoInsideMansion": GoInsideMansion(); break;
            case "leaveMansion":leaveMansion(); break;
            case "painting": painting(); break;
            case "askMallory": askMallory(); break;
            case "askMalCont": askMalloryCont();break;
            case "shakeHand": shakeHand(); break;
            case "contShakeHand": contShakeHand(); break;
            case "sitNxtToOldman": sitNxtToOldman(); break;
            case "oldManCont": besideOldManCont();break;
            case "sitNxtMallory": sitNxtMallory(); break;
            case "malloryCont": besideMalloryCont();break;
            case "goToSleep": goToSleep(); break;
            case "WillMissYouToo": WillMissYouToo(); break;
            case "StaySilent": StaySilent(); break;
            case "readBook": readBook(); break;
            case "goRightToSleep":goRightToSleep(); break;
            case "noShakeHand": noShakeHand(); break;
            case "stairs": stairs(); break;
            case "Murder": Murder(); break;
            case "backToBed": backToBed(); break;
            case "AttackOldMan": AttackOldMan(); break;
            case "standStill": standStill();break;
            case "offerToHelp": offerToHelp(); break;
            case "awkMoment": awkMoment(); break;
            case "room1": room1(); break;
            case "room1Map": room1Map(); break;
            case "backSleep": backSleep(); break;
            case "searchFloor": searchFloor(); break;
            case "tryDoor": tryDoor(); break;
            case "tryBedroomOnLeft": tryBedroomOnLeft(); break;
            case "downstairs": downstairs(); break;
            //case "TryDoorAhead": TryDoorAhead(); break;
            case "MalloryRoom":MalloryRoom(); break;
            case "SearchBed": SearchBed(); break;
            case "SearchCloset": SearchCloset(); break;
            case "Shoes": Shoes();break;
            //case "PutOnShoes": PutOnShoes(); break;
            //case "NotPutOnShoes": NotPutOnShoes();break;
            case "Coat": Coat(); break;
            //case "PutOnCoat": PutOnCoat(); break;
            //case "NotPutOnCoat": NotPutOnCoat();break;
            case "LeaveCloset": LeaveCloset();break;
            case "SearchDesk": SearchDesk();break;
            case "ExamineBook": ExamineBook(); break;
            case "ExamineBookCont": ExamineBookCont(); break;
            case "LeaveDesk": LeaveDesk(); break;
            case "LeaveRoom": LeaveRoom();break;
            case "room5": room5(); break;
            case "Run": Run();break;
            case "DuckDown": DuckDown();break;
            case "KickCat": KickCat(); break;
            case "IgnoreCat": IgnoreCat();break;
            case "PetCat": PetCat(); break;
            case "ExamineBookcase": ExamineBookcase();break;
            case "PocketBook":PocketBook();break;
            case "LeaveBook":LeaveBook();break;
            case "ExaminePicture": ExaminePicture();break;
            case "ExamineCoffeeTable": ExamineCoffeeTable();break;
            case "letterOpener": letterOpener();break;
            case "leaveLetterOpener": leaveLetterOpener();break;
            case "ExamineFireplace": ExamineFireplace();break;
            case "TakeMatches": TakeMatches();break;
            case "LeaveThere": LeaveThere();break;
            case "FightScene": FightScene();break;
            case "RunThruHall": RunThruHall(); break;
            case "DuckingDown": DuckingDown();break;
            case "continue9": room9Cont();break;
            case "JumpOutWay": JumpOutWay();break;
            case "room10": room10();break;
            case "purplePotion":purplePotion();break;
            case "LeaveRoom10":LeaveRoom10();break;
            case "goToBathroom":goToBathroom();break;
            case "withShoes":withShoes();break;
            case "withNoShoes":withNoShoes();break;
            case "knifeDrawer":knifeDrawer();break;
            case "CheckCabinets":CheckCabinets();break;
            case "CheckFridge":CheckFridge();break;
            case "withoutPotion": withoutPotion();break;
            case "noPotionCont": noPotionCont();break;
            case "PunchOldMan": PunchOldMan();break;
            case "dontPunch": dontPunch();break;
            case "UseSpellBook": UseSpellBook(); break;
            case "withPotion":withPotion();break;
            case "HideInCupboard": HideInCupboard();break;
            case "HideInPantry": HideInPantry(); break;
            case "pantryCont": hideInPantryCont();break;
            case "TheCellar": TheCellar();break;
            case "RunForTheDoor": RunForTheDoor();break;
            case "HideAmongTheBodies": HideAmongTheBodies(); break;
            case "yellowPotion": yellowPotion();break;
            case "labeledClearPotion":labeledClearPotion();break;
            case "unlabeledClearPotion":unlabeledClearPotion();break;
            case "ThrowBooks": ThrowBooks();break;
            case "GrabABook": GrabABook(); break;
            case "ClimbBookshelf": ClimbBookshelf();break;
            case "UseLetterOpener":UseLetterOpener(); break;
            case "noMatchesOrPets": noMatchesOrPets();break;
            case "Fight1": Fight1();break;
            case "Fight2": Fight2();break;
            case "Fight3": Fight3();break;
            case "matches": ifMatches();break;
            case "petCat1": petCatEnding1();break;
        }
    }

    public void theMansion() {
        ui.mainTextArea.setText("______________ Welcome to Sinister Happenings at Huxley Manor " +
                "______________\n\n" +
                "Warning: This game contains themes of gore, violence, and manipulation/mind control.\n" +
                "Enter at your own risk... \n" +
                "_______________________________________________________________________\n\n" +
                "Before goosebumps plague your arms and your eyes cannot be ripped away from the screen, " +
                "here are some things to know about our spooky little game.\n\nThis is a text-based game, so there " +
                "are very little graphics. If you don’t like reading, sorry bud, this isn't the game for you. " +
                "We want to let our words guide your imagination, and we figure you know how to scare " +
                "yourself better than we ever could.\n\nThis is also a choose-your-own-adventure game, " +
                "so you will read the story and then choose from a handful of actions at specific moments " +
                "to determine what happens next. Some of these options will allow you to continue through " +
                "the escape, but some may result in death. Choose wisely and you might make it out alive.\n\n" +
                "To select an option, press one of the buttons in the bottom right of your screen. " +
                "Also, some sections of the story are longer than others, so you may need to press the \">\" " +
                "button to continue reading.\n\nThe one graphic you do get to reap the benefits of is a map. " +
                "You can pull up this map during given opportunities by pressing the \"map\" button.\n\n" +
                "We hope you enjoy, good luck, and don’t kick the cat.");
        ui.choice1.setVisible(false);
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(true);
        ui.choice5.setVisible(true);

        ui.choice4.setText("Begin");
        ui.choice5.setText("Exit");

        game.position4 = "towardsMansion"; //Continue to game
        game.position5 = "ExitGame";
    }

    public void ExitGame(){
       // m.showTitleScreen();
        ui.mainTextArea.setText("You may now close this window.");
        ui.choice1.setVisible(false);
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(false);
        ui.choice5.setVisible(false);
    }

    public void towardsMansion(){
        ui.mainTextArea.setText("The man's hand feels heavy on your back as you are guided up the driveway " +
                "against your better judgement.\n\n" +
                "A large mansion --which you're quite sure is the only dwelling for miles-- looms before you, " +
                "decorated impeccably for Halloween. Cornstalks lean up against the pillars supporting the " +
                "upper balconies, pumpkins and hay bales are scattered tastefully over the front porch, " +
                "and a black cat sits somewhat ominously in the window by the door --though you're sure that " +
                "the cat is more of a year-round affair.\n\n" +
                "You stop a moment, simply staring and struggling to take in the fact that this is all " +
                "real. Less than an hour ago, you had been on the streets, trying to scrounge whatever " +
                "money you could to save up for a proper coat for the coming winter. Less than an hour " +
                "ago, an old man whose name you still don't know had offered you a job with the only " +
                "condition being that you came to live with him in his \"humble manor,\" as he had called " +
                "it. Less than an hour ago, against your better judgement and with nothing but your life to " +
                "lose, you had said yes. \n\n" +
                "You're not sure why you'd said yes. You know that you're what they call \"high risk\". " +
                "You know that a man like this has the money to cover up your disappearance if it gets " +
                "noticed. Hell, when you'd asked his name, the man had simply stated, \"Names are " +
                "unimportant,\" before ushering you into his car. But something deep within you, a gut " +
                "feeling , told you that this was the right move, and that going with him wouldn't be so bad.\n\n" +
                "\"It's beautiful, isn't it?\" The old man's question snaps you back to the present. \n\n" +
                "\"Yes,\" you mutter quietly, too awestruck to properly compliment the place.\n\n" +
                "The old man smiles, \"Welcome to Huxley Manor,\" he says with a sweeping gesture before " +
                "guiding you to the thick oaken front door.\n\n");
        ui.choice1.setVisible(false);
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(true);
        ui.choice5.setVisible(true);

        ui.choice4.setText("Go inside");
        ui.choice5.setText("Leave");

        game.position4 = "GoInsideMansion";
        game.position5= "leaveMansion";
    }

    public void leaveMansion(){
        ui.mainTextArea.setText("The thought crosses your mind to turn back, but you decide against it.");

        ui.choice1.setVisible(false);
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(false);
        ui.choice5.setVisible(true);

        ui.choice5.setText(">");

        game.position5 = "GoInsideMansion";
    }

    public void GoInsideMansion(){
        ui.mainTextArea.setText("The old man claps twice and the doors slowly creak open to reveal an ornate " +
                "hallway with beautiful vintage-looking wallpaper and dark wooden floors. \n\n" +
                "As he guides you through, you notice dozens of oil paintings, all of which look to be " +
                "extremely old. A painting of a man in what looks to be renaissance garb, staring intensely " +
                "outward with long black hair catches your eye.\n\n" +
                "The cat brushes past you, pulling your attention away from the painting, and you look down to " +
                "see that you’re walking past a staircase to what you assume is the basement. The stairs, though " +
                "still beautiful, are clearly not as well-kept as the rest of the house, and the walls seem to " +
                "get dustier the further down they go. There's a part of you that wonders what's down there,  " +
                "what secrets this mansion might hide.\n");
        ui.choice1.setVisible(false);
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(true);
        ui.choice5.setVisible(true);

        ui.choice4.setText("Ask about the painting");
        ui.choice5.setText("Ask about the stairs");

        game.position4 = "painting";
        game.position5= "stairs";
    }

    public void painting(){
        ui.mainTextArea.setText("The old man smiles as he turns to the portrait, an odd sentimentality washing " +
                "over him.\n\n" +
                "\"He was a very good friend of mine.\" he sighs, clearly beginning to reminisce, " +
                "\"He had this commissioned shortly before he- The old man stops, taking a moment to " +
                "collect himself before continuing, \"He passed shortly after this was painted,\" he huffs " +
                "distantly. \"If it weren't for him, none of this would have been possible,\" the man gestures " +
                "to the mansion around him.\n\n" +
                "You nod solemnly. There’s a part of you that wonders how he died so young --he couldn't " +
                "have been more than 30 in the picture-- and what he did to help the old man. Even so, " +
                "you know better than to ask. If he had wanted to say, he would have. The old man lingers " +
                "on the painting a moment more, his smile widening, before seeming to snap back to the present and " +
                "guiding you into the dining room.\n\n" +
                "You enter to see a boy who couldn't be more than 19 or 20 setting the table. \n\n" +
                "The old man snaps his fingers and the boy is suddenly at attention, nearly dropping the plates\n\n" +
                "\"This is Mallory,\" the old man says, \"I found him in much the same situation I found you, " +
                "and he's been living and working here until he finds his feet, isn't that right Mallory?\"\n\n" +
                "Mallory nods nervously, \"Yes, sir.\"\n\n" +
                "The old man laughs and jovially clasps a hand on Mallory’s shoulder, \"He's a bit shy, but " +
                "he'll warm up to you in no time,\" he remarks.\n\n" +
                "Mallory smiles at you, nodding more genuinely this time, before the old man says something " +
                "about allowing you to get acquainted before going into the kitchen and leaving the " +
                "two of you alone.\n\n" +
                "Mallory's gaze seems to linger on you a moment before going back to his task, and though " +
                "on the surface he seems genuinely happy to meet you, there is also an almost mournful " +
                "disposition underneath it all.\n\n");
        ui.choice1.setVisible(false);
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(true);
        ui.choice4.setVisible(true);
        ui.choice5.setVisible(true);

        ui.choice3.setText("Ask how he likes working here");
        ui.choice4.setText("Offer to help set the table");
        ui.choice5.setText("Stand there awkwardly");

        game.position3 = "askMallory";
        game.position4 = "offerToHelp";
        game.position5 = "awkMoment";
    }

    public void stairs(){
        ui.mainTextArea.setText("The old man chuckles a little, \"The only things of interest that I keep down " +
                "there are my old typewriters.\"\n\n" +
                "A pause \n\n" +
                "\"And the bodies, of course.\" He stops a moment, staring at you rather intensely.\n\n" +
                "Shit. Was that a joke or a threat?\n\n" +
                "The silence is broken with a hearty laugh from the old man, which you hesitantly join.\n\n" +
                "\"I apologize,\" the old man says, still laughing, \"My humor is sometimes...A bit crass.\"\n\n" +
                "He continues to chuckle to himself as you hazard a glance down the stairs. There appears to be a" +
                "shiny puddle of something at the bottom, but the base of the steps is too dark to see what it " +
                "is. It's probably just water, you tell yourself; an old place like this is bound to have leaks.\n\n" +
                "The sudden crash of china on wood jolts your attention to what you assume is the dining room. " +
                "The old man quickly moves to see what happened, gesturing for you to follow.\n\n" +
                "As you enter the room, the cat bolts past you into an entrance that likely leads to the kitchen, " +
                "clearly startled by the crash. A moment later, a finely-dressed man with white gloves emerges " +
                "from the same entrance with a broom and dustpan, immediately crouching down and beginning to " +
                "clean up the shards.\n\n" +
                "Near the dining table, apologizing profusely with the broken glass at his feet stands a boy " +
                "who couldn't be more than 19 or 20. An odd relief seems to momentarily wash over him when he " +
                "sees you enter, though it’s quickly replaced by his original apprehension as the old man " +
                "approaches him.\n\n" +
                "Neither one speaks, though, through eye-contact alone, it seems an entire conversation takes " +
                "place in seconds. The boy's posture shifts fearfully as the old man's brow furrows, then " +
                "after a quick, wide-eyed shake of the head from the boy, both relax as if the situation is " +
                "resolved.\n\n" +
                "The man with white gloves wordlessly stands when he has finished sweeping up the glass and " +
                "goes back into the kitchen.\n\n" +
                "A moment later, the cat cautiously slinks back out into the dining room, keeping low as if " +
                "ready to bolt in case any more plates decide to come crashing down.\n\n" +
                "A smile returns to the old man’s face as he introduces you to the boy, who is apparently " +
                "named Mallory.\n\n \"He can be a bit clumsy sometimes, but he's a good worker,\" the old man " +
                "says, jovially clasping a hand onto the shoulders of a very uncomfortable Mallory. Even so, " +
                "the boy seems to try to keep up a smile.\n\n" +
                "\"I'll let you two get acquainted,\" says the old man, picking up the cat and heading into " +
                "the kitchen, leaving the two of you alone.\n\n" +
                "Mallory's gaze seems to linger on you a moment before going back to his task, and though " +
                "on the surface he seems genuinely happy to meet you, there is also an almost mournful " +
                "disposition underneath. He goes back to setting the table before you can dwell on it " +
                "too long.\n\n");
        ui.choice1.setVisible(false);
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(true);
        ui.choice4.setVisible(true);
        ui.choice5.setVisible(true);

        ui.choice3.setText("Ask how he likes working here");
        ui.choice4.setText("Offer to help set the table");
        ui.choice5.setText("Stand there awkwardly");

        game.position3 = "askMallory";
        game.position4 = "offerToHelp";
        game.position5 = "awkMoment";
    }

    public void askMallory(){
        ui.mainTextArea.setText("Mallory smiles dryly, and you suddenly notice exactly how tired he is, the bags " +
                "under his eyes being heavy and thick. Too heavy for someone his age.\n\n" +
                "He locks eye contact with you, his gaze requesting that you hold it as he speaks, \"I wouldn't " +
                "trade working here for the world! I love the work I do, and he’s been extremely generous " +
                "to let me stay here while I save up to get a place of my own.\"\n\n" +
                "Despite the cheery tone, you feel a shiver of unease run down your spine as he talks. The " +
                "words he's saying are loud and enthusiastic, and if the only thing in this interaction had " +
                "been his voice, you may have actually believed him. But his eyes, which have not faltered since " +
                "locking with yours... God, his eyes... They tell a different story entirely. As he speaks, his " +
                "brows knit together in a look of pain, despair, and exhaustion. Regret drips from every " +
                "movement he makes as he shakes his head while discussing the old man's \"generosity.\"\n\n" +
                "When he's finished speaking, Mallory's expression quickly switches to a smile, and he goes back " +
                "to his work as if nothing happened. You simply stand there, watching him in bewilderment, " +
                "completely unsure of how to respond. Either Mallory always talks with his facial expressions " +
                "wildly mismatching his words, or he was trying to warn you of something. Or perhaps, you've " +
                "misinterpreted the interaction entirely. \n\n" +
                "You glance around the dining room, with its chandelier hanging from the ceiling and its ornate " +
                "wallpaper smoothly covering the walls. As Mallory sets the antique wooden table you notice " +
                "its intricately-carved embellishments curling over each corner as if it were being held up " +
                "by many human hands. Why would a man like him help a person like you? What motivation could " +
                "someone of this caliber have for altruism? \n\n" +
                "You shake your head. This man was willing to help you when no one else would, and if he plans " +
                "to exploit you, at the very least you'll have a roof over your head. At worst, you figure you " +
                "could live here until things get bad. Besides, it's not like an old man like the one in the " +
                "kitchen could beat you in a fight.\n\n" +
                "You hear the old man's deep laughter echo from the other room, accompanied by another. He " +
                "doesn't sound evil. You sigh to yourself. You've always been paranoid, and at this point, " +
                "you decide it's best not to look gift-horse in the mouth.\n\n");
        ui.choice1.setVisible(false);
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(false);
        ui.choice5.setVisible(true);

        ui.choice5.setText(">");

        game.position5 = "askMalCont";
    }

    public void askMalloryCont(){
        ui.mainTextArea.setText("You watch as Mallory finishes setting the table, and a man with white gloves " +
                "walks out from the kitchen, seemingly to check that things are going smoothly. \n\n" +
                "He glances at you in surprise as if not expecting to see anyone other than Mallory in the " +
                "dining room. His eyes flash for a moment with an emotion that is covered up too quickly to read, " +
                "and instead he flashes you a smile, \"I'm sorry, I didn't realize we had company or I would " +
                "have greeted you sooner! I'm the butler here at the Manor.\" He smiles, extending a hand for " +
                "you to shake.\n\n" +
                "Do you shake his hand? \n\n");
        ui.choice1.setVisible(false);
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(true);
        ui.choice5.setVisible(true);

        ui.choice4.setText("Shake his hand");
        ui.choice5.setText("Don't shake his hand");

        game.position4 = "shakeHand";
        game.position5 = "noShakeHand";
    }

    public void offerToHelp(){
        ui.mainTextArea.setText("Mallory glances at you with what appears to be genuine fear in his eyes, " +
                "quickly shaking his head, \"I've got it!\" he says quickly, seemingly loud enough for those " +
                "in the kitchen to hear.\n\n" +
                "Then he flashes you a small smile, nearly whispering, \"Thank you, though,\" before returning " +
                "to his work.\n\n" +
                "You watch as Mallory finishes setting the table, and a man with white gloves walks out from " +
                "the kitchen, seemingly to check that things are going smoothly.\n\n" +
                "He glances at you in surprise as if not expecting to see anyone other than Mallory in the " +
                "dining room. His eyes flash for a moment with an emotion that is covered up too quickly to " +
                "read, and instead he flashes you a smile, \"I'm sorry, I didn't realize we had company or " +
                "I would have greeted you sooner! I'm the butler here at the Manor.\"\n\n" +
                "He smiles, extending a hand for you to shake.\n\n" +
                "Do you shake his hand?\n\n");
        ui.choice1.setVisible(false);
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(true);
        ui.choice5.setVisible(true);

        ui.choice4.setText("Shake his hand");
        ui.choice5.setText("Don't shake his hand");

        game.position4 = "shakeHand";
        game.position5 = "noShakeHand";
    }

    public void awkMoment() {
        ui.mainTextArea.setText("You stand there in a thick silence, neither of you moving to speak. " +
                "After a moment, you watch as Mallory goes back to setting the table. He doesn't move the " +
                "way you expect him to.\n\n" +
                "Every gesture he makes is stiff, and even jerky at times. The look on his face is hollow, even " +
                "for doing so mundane a task as setting the table. You feel bad for thinking it, but his actions " +
                "almost remind you of a deftly-controlled marionette without the strings.\n\n" +
                "You chide yourself for the comparison. He’s probably just tired.\n\n" +
                "You watch as Mallory finishes setting the table, and a man with white gloves walks out from " +
                "the kitchen, seemingly to check that things are going smoothly.\n\n" +
                "He glances at you in surprise as if not expecting to see anyone other than Mallory in the " +
                "dining room. His eyes flash for a moment with an emotion that is covered up too quickly to " +
                "read, and instead he flashes you a smile, \"I'm sorry, I didn't realize we had company or I would " +
                "have greeted you sooner! I'm the butler here at the Manor.\"\n\n" +
                "He smiles, extending a hand for you to shake.\n\n" +
                "Do you shake his hand?\n\n");
        ui.choice1.setVisible(false);
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(true);
        ui.choice5.setVisible(true);

        ui.choice4.setText("Shake his hand");
        ui.choice5.setText("Don't shake his hand");

        game.position4 = "shakeHand";
        game.position5 = "noShakeHand";
    }

    public void shakeHand(){
        ui.mainTextArea.setText("You accept the handshake to find that the butler's grasp is much firmer than " +
                "you expected. He didn't strike you as the type to hold onto a handshake for dear life.\n\n" +
                "But...no...\n\n" +
                "You realize that he's actually holding your hand rather gently, yet his hand is much more..." +
                "solid than it should be. Like the muscles in his hand are packed just a little too " +
                "densely beneath his skin. \n\n" +
                "You decide it's nothing to worry about as you release each others' hands.\n\n" +
                "\"So I take it you're coming to work here?\" he asks jovially.\n\n" +
                "You nod, \"That's the plan, at least!\"\n\n" +
                "The butler smiles, though the smile takes a moment to reach his eyes as he glances at " +
                "Mallory before seeming to return to the conversation, \"It's a pleasure to have you here. " +
                "I can’t wait to show you the ropes.\" \n\n " +
                "Suddenly, the butler snaps to attention, dutifully walking into the kitchen as if called, " +
                "though neither you nor Mallory seem to have heard anything of the sort.\n\n" +
                "You're about to let him walk into the other room when you realize something, calling after him, " +
                "\"Wait-\"\n\n" +
                "The butler stops and turns to you.\n\n" +
                "\"I didn't catch your name,\" you say, somewhat nervously. Usually, you wouldn't ask, but you " +
                "feel bad just referring to him as \"butler\".\n\n" +
                "He gives a small huff of amusement before responding, \"Names are unimportant,\" he shrugs, " +
                "smiling solemnly, \"I'm just the butler.\"\n\n" +
                "With that, he turns and walks back into the kitchen.\n\n");
        ui.choice1.setVisible(false);
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(false);
        ui.choice5.setVisible(true);

        ui.choice5.setText(">");

        game.position5 = "contShakeHand";
    }

    public void contShakeHand(){
        ui.mainTextArea.setText("After a moment, he and the old man emerge with various steaming plates " +
                "making up an extravagant meal, all of which are arranged on the table. The butler " +
                "pulls out a chair for the old man, and Mallory sits across from him. Then, the butler " +
                "gestures for you to sit, seemingly allowing you to choose your spot.\n\n" +
                "Where would you like to sit?\n\n");
        ui.choice1.setVisible(false);
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(true);
        ui.choice5.setVisible(true);

        ui.choice4.setText("Sit next to the old man");
        ui.choice5.setText("Sit next to Mallory");

        game.position4 = "sitNxtToOldman";
        game.position5 = "sitNxtMallory";

    }

    public void noShakeHand(){
        ui.mainTextArea.setText("You glance apologetically at the butler's hand, not entirely willing to shake " +
                "it. He holds his hand out for a moment longer, but after a tight-lipped nod from you, he " +
                "realizes that you're not going to shake it and instead withdraws his hand and nods back.\n\n" +
                "Suddenly, the butler snaps to attention, dutifully walking into the kitchen as if called, though " +
                "neither you nor Mallory seem to have heard anything of the sort.\n\n" +
                "You're about to let him walk into the other room when you realize something, calling after him, " +
                "\"Wait-\"\n\n" +
                "The butler stops and turns to you.\n\n" +
                "\"I didn't catch your name,\" you say, somewhat nervously. Usually, you wouldn't ask, but you " +
                "feel bad just referring to him as \"butler\".\n\n" +
                "He gives a small huff of amusement before responding, \"Names are unimportant,\" he shrugs, " +
                "smiling solemnly, \"I'm just the butler.\"\n\n" +
                "With that, he turns and walks back into the kitchen.\n\n" +
                "After a moment, he and the old man emerge with various steaming plates making up an " +
                "extravagant meal, all of which are arranged on the table. After a moment, the butler pulls out " +
                "a chair for the old man, and Mallory sits across from him. Then, the butler gestures for you to " +
                "sit, seemingly allowing you to choose your spot.\n\n");
        ui.choice1.setVisible(false);
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(true);
        ui.choice5.setVisible(true);

        ui.choice4.setText("Sit next to the old man");
        ui.choice5.setText("Sit next to Mallory");

        game.position4 = "sitNxtToOldman";
        game.position5 = "sitNxtMallory";
    }

    public void sitNxtToOldman(){
        ui.mainTextArea.setText("The butler stays off to the side as you take up a seat next to the old man, " +
                "who flashes you a toothy grin as you sit down beside him. If you didn't know any better, you " +
                "would have thought you saw a glimmer of pride in his eyes. \n\n" +
                "\"Eat as much as you like,\" he says warmly, passing you a piece of the main dish.\n\n" +
                "You smile thankfully, filling your plate as the others begin to eat. Surprisingly, the only " +
                "people at dinner are you, Mallory, and the old man, with the butler standing attentively off " +
                "to the side.\n\n" +
                "You realize with a little unease that these might be the only people in the mansion. Not that " +
                "you have much experience with the habits of the wealthy, but you expected him to have at least " +
                "a few more staff to help things get done around the place. Then again, perhaps that's why he " +
                "hired you. If it really is his goal to help people get back on their feet, it would make sense " +
                "that if a few of them left at once, he would be short-staffed.\n\n" +
                "You push the issue out of your mind as the old man turns to you, \"If you're going to be " +
                "staying here,\" he says, gesturing lazily with his fork, \"there are a few rules you're going " +
                "to have to follow.\"\n\n" +
                "Here, he pauses, looking at you expectantly as if to make sure you’re still on board.\n\n" +
                "Not entirely sure what kind of response he's looking for, you nod.\n\n" +
                "Apparently, that was the right response, because the old man grins as he continues, \"Things " +
                "here run on a tight shift during work hours, but when you're not working, your time is your " +
                "own to do as you please. You'll be paid by the hour for every task you complete around the " +
                "Manor. You're allowed to take days off whenever you need, no questions asked-\"\n\n" +
                "At this, Mallory scoffs quietly. The old man doesn't seem to notice, but you catch the butler " +
                "throwing a warning glance towards the boy. \n\n" +
                "\"-Any locked or boarded up doors are to stay that way. Above all, you are never allowed to go " +
                "down into the cellar, no matter the reason, lest you wish for your time here to end. Do you " +
                "understand?\"\n\n");
        ui.choice1.setVisible(false);
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(false);
        ui.choice5.setVisible(true);

        ui.choice5.setText("Say \"Yes\"");

        game.position5 = "oldManCont";
    }

    public void besideOldManCont(){
        ui.mainTextArea.setText("\"Yes,\" is all you can manage. There's a heaviness to the air that you didn't " +
                "expect to feel over dinner, and instinct dictates that you respond as succinctly as possible. \n\n" +
                "The old man's grin widens, \"Then welcome to Huxley Manor!\" he exclaims, the heaviness " +
                "suddenly dissipating.\n\n" +
                "\"It's a wonderful place to be,\" the butler adds, \"and if you have any questions at all, feel " +
                "free to ask me.\"\n\n" +
                "The old man nods approvingly, and dinner continues rather normally.\n\n" +
                "Once everyone has finished eating and the table is cleared, the old man takes you upstairs " +
                "and shows you to your bedroom on the top floor, \"This is where you'll be sleeping for the " +
                "rest of your time here. Mallory's room is across the hall, and mine is the one next to yours, " +
                "so if you need anything, you know where to go.\"\n\n" +
                "You nod, and the old man turns to leave before stopping himself, \"Oh, and just as a heads up, " +
                "the cat tends to be a little loud at night, so I suggest you keep your door closed,\" he chuckles, " +
                "\"You know how cats are.\"\n\n" +
                "After that, he says goodnight, and you open the door to your room. It's small, but comfortable, " +
                "with a desk on one wall, a bed on the other, and beside that, a closet. A few tears come to your " +
                "eyes as you realize you'll be sleeping in a proper bed tonight. You change into a set of pajamas " +
                "folded neatly atop the bed and crawl beneath the covers.\n\n" +
                "What would you like to do?\n");
        ui.choice1.setVisible(false);
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(false);
        ui.choice5.setVisible(true);

        ui.choice5.setText("Go to sleep");

        game.position5 = "goToSleep";
    }

    public void sitNxtMallory(){
        ui.mainTextArea.setText("Mallory pulls out the chair beside him, flashing you a small smile as you move " +
                "to sit next to him. You see the butler smile as well as you sit down and Mallory passes you " +
                "the tray of mashed potatoes, \"Eat,\" he says cheerily, \"you'll need it.\" \n\n" +
                "Surprisingly, the only people at dinner are you, Mallory, and the old man, with the butler " +
                "standing attentively off to the side.\n\n" +
                "You realize with a little unease that these might be the only people in the mansion. Not that " +
                "you have much experience with the habits of the wealthy, but you expected him to have at least " +
                "a few more staff to help things get done around the place. Then again, perhaps that’s why he " +
                "hired you. If it really is his goal to help people get back on their feet, it would make sense " +
                "that if a few of them left at once, he would be short-staffed.\n\n" +
                "You push the issue out of your mind as the old man turns to you, \"If you're going to be staying " +
                "here,\" he says, gesturing lazily with his fork, \"there are a few rules you're going to have " +
                "to follow.\"\n\n" +
                "Here, he pauses, looking at you expectantly as if to make sure you're still on board.\n\n" +
                "Not entirely sure what kind of response he's looking for, you just nod.\n\n" +
                "Apparently, that was the right response, because the old man grins as he continues, \"Things " +
                "here run on a tight shift during work hours, but when you're not working, your time is your " +
                "own to do as you please. You'll be paid by the hour for every task you complete around the Manor. " +
                "You're allowed to take days off whenever you need, no questions asked-\"\n\n" +
                "At this, Mallory scoffs quietly. The old man doesn't seem to notice, but you catch the butler " +
                "throwing a warning glance towards the boy. \n\n" +
                "\"-Any locked or boarded up doors are to stay that way. Above all, you are never allowed to " +
                "go down into the cellar, no matter the reason, lest you wish for your time here to end. Do you " +
                "understand?\"\n\n" +
                "\"Yes,\" is all you can manage. There's a heaviness to the air that you didn't expect to feel " +
                "over dinner, and instinct dictates that you respond as succinctly as possible.\n\n");
        ui.choice1.setVisible(false);
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(false);
        ui.choice5.setVisible(true);

        ui.choice5.setText(">");

        game.position5 = "malloryCont";
    }

    public void besideMalloryCont(){
        ui.mainTextArea.setText("The old man's grin widens, \"Then welcome to Huxley Manor!\" he exclaims, the " +
                "heaviness dissipating.\n\n" +
                "\"It’s a wonderful place to be,\" the butler adds, \"and if you have any questions at all, " +
                "feel free to ask me.\"\n\n" +
                "The old man nods approvingly, and dinner continues rather normally.\n\n" +
                "Once everyone has finished eating and the table is cleared, the old man takes you upstairs " +
                "and shows you to your bedroom on the top floor.\n\n" +
                "\"This is where you'll be sleeping for the rest of your time here. Mallory's room is across " +
                "the hall, and mine is the one next to yours, so if you need anything, you know where to go.\"\n\n" +
                "You nod, and the old man turns to leave before stopping himself, \"Oh, and just as a heads up, " +
                "the cat tends to be a little loud at night, so I suggest you keep your door closed,\" he " +
                "chuckles, \"You know how cats are.\"\n\n" +
                "After that, he says goodnight, and you open the door to your room. It's small, but comfortable, " +
                "with a desk on one wall, a bed on the other, and beside that, a closet. A few tears come to " +
                "your eyes as you realize you'll be sleeping in a proper bed tonight. You change into a set of " +
                "pajamas folded neatly atop the bed and crawl beneath the covers.\n\n");
        ui.choice1.setVisible(false);
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(false);
        ui.choice5.setVisible(true);

        ui.choice5.setText("Go to sleep");

        game.position5 = "goToSleep";
    }

    public void goToSleep(){
        ui.mainTextArea.setText("Over the next few days, you begin to get your bearings at Huxley Manor, " +
                "and you manage to fall into a bit of a routine. The work isn't too hard, and Mallory and the " +
                "butler are kind enough. The cat also seems to like you, though you'd be lying if you said its " +
                "tendency to sit and stare from the corner of the room doesn't freak you out a little. Of course, " +
                "you've never been much of a cat person. \n\n" +
                "You notice that Mallory seems to be getting more and more gaunt by the day, and though it " +
                "worries you a little, he insists that it's nothing to be concerned about, so you keep your " +
                "mouth shut. Besides, no one else in the manor seems to be worried. Overall, you and Mallory " +
                "have become fast friends.\n\n" +
                "Your fifth night there, however, as the two of you are about to part ways and go to bed, he " +
                "stops you, gently grabbing you by the arm. There are tears in his eyes, and he seems to take " +
                "a moment to gather himself before speaking.\n\n" +
                "\"I'll miss you when we’re finally on our feet.\" is all he says. \n\n" +
                "How do you respond?");
        ui.choice1.setVisible(false);
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(true);
        ui.choice5.setVisible(true);

        ui.choice4.setText("Tell him you'll miss him too");
        ui.choice5.setText("Stay silent");

        game.position4 = "WillMissYouToo";
        game.position5 = "StaySilent";
    }

    public void WillMissYouToo(){
        ui.mainTextArea.setText("You nod, taking hold of his hand, \"I'll miss you too.\" \n\n" +
                "It's a short response, but you mean every word of it. \n\n" +
                "Mallory smiles, tightening his grip on your hand, \"We'll have to keep in touch.\"\n\n" +
                "You nod. Though his eyes are watery with unshed tears, he seems content.\n\n" +
                "His gaze lingers on you for a moment longer before he lets go and, giving one final nod, turns " +
                "to go to his room, clearly wiping tears from his eyes as he walks. For some reason, that " +
                "felt like goodbye.\n\n" +
                "Does he plan on-\n\n" +
                "You shake your head. You're sure he's fine.\n\n" +
                "Too tired to think about it now, you go into your room and prepare to go to sleep.\n\n");
        ui.choice1.setVisible(false);
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(true);
        ui.choice5.setVisible(true);

        ui.choice4.setText("Go right to sleep");
        ui.choice5.setText("Read a book to distract yourself");

        game.position4 = "goRightToSleep";
        game.position5 = "readBook";
    }

    public void StaySilent(){
        ui.mainTextArea.setText("He waits a moment, seemingly expecting you to say something, but when " +
                "you don't respond, he nods and seems to give you an understanding smile. \n\n" +
                "Mallory draws in a breath, looking you over and looking around as if savoring the moment " +
                "as he clearly fights back tears.\n\n" +
                "His gaze lingers on you for a moment longer before he lets go and, giving one final nod, " +
                "turns to go to his room, clearly wiping tears from his eyes as he walks.\n\n" +
                "For some reason, that felt like goodbye.\n\n" +
                "Does he plan on-\n\n" +
                "You shake your head. You’re sure he’s fine. \n\n" +
                "Too tired to think about it now, you go into your room and prepare to go to sleep.\n\n");
        ui.choice1.setVisible(false);
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(true);
        ui.choice5.setVisible(true);

        ui.choice4.setText("Go right to sleep");
        ui.choice5.setText("Read a book to distract yourself");

        game.position4 = "goRightToSleep";
        game.position5 = "readBook";
    }

    public void goRightToSleep() {
        ui.mainTextArea.setText("You curl up in bed and put the issue out of your mind. Mallory is fine. He's " +
                "been fine since the day you got there, and you tell yourself there's nothing to worry about. " +
                "Besides, if there is anything happening with Mallory, it's nothing that can't wait til morning. " +
                "With that, you close your eyes and attempt to get some rest.\n\n");
        ui.choice1.setVisible(false);
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(false);
        ui.choice5.setVisible(true);

        ui.choice5.setText(">");

        game.position5 = "Murder";
    }

    public void readBook() {
        ui.mainTextArea.setText("You sigh, picking up a match --the last one in the pack-- and lighting a " +
                "candle on your bedside table. You shimmy under the covers and grab the book you started " +
                "reading the night before: Dracula by Bram Stoker. You've always loved horror, and though " +
                "it's not your first time reading it, you still can't help but love the thrill of the buildup " +
                "of the first four chapters of that book. You're on chapter 3 now, when Jonathan gets his " +
                "first proper glimpse of what's actually going on in the castle. It's a fun one to read, " +
                "especially the second half. \n\n" +
                "You're still worried about Mallory, but Stoker's writing allows you to get sucked into " +
                "the novel enough to shift your focus for a while, for which you’re rather grateful. " +
                "Eventually, as you finish chapter 4, you feel your eyes begin to droop, and blowing out the " +
                "candle, you allow yourself to begin to drift off to sleep.\n\n");
        ui.choice1.setVisible(false);
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(false);
        ui.choice5.setVisible(true);

        ui.choice5.setText(">");

        game.position5 = "Murder";
    }

    public void Murder() {
        ui.mainTextArea.setText("A hysterically panicked scream from across the hall lurches you awake, and " +
                "before you know it, you're sitting straight up in bed, trying to listen for any other noises. " +
                "That sounded like Mallory. It sounds like it came from Mallory's room. The scream cuts off " +
                "abruptly and you hear a sudden thump onto the floor in the hallway, followed by footsteps " +
                "and the sound of something heavy being dragged over the polished wood.\n\n" +
                "What's happening? Has someone broken in?\n\n" +
                "That must be it.\n\n" +
                "Someone must have attempted to break in by climbing up through Mallory's window.\n\n" +
                "As the dragging sound comes closer and closer to your door, you're forced to make a snap " +
                "decision, and unfortunately, in terms of fight or flight, your first instinct is generally fight. " +
                "You pick up a heavy object from your nightstand and fling open your door, ready to confront " +
                "whoever has decided to break into Huxley Manor.\n\n" +
                "As the door opens, however, you feel your knees go weak and the object falls from your hand " +
                "at the sight before you.\n\n" +
                "In the hallway, his robe absolutely drenched in blood and with the same slick red substance " +
                "dripping from mouth and covering his smiling teeth stands the old man, grinning wildly. Behind " +
                "him, being dragged by his sweat-soaked hair, is Mallory, lying there limply. He's still " +
                "managing gargled breaths, but judging by the amount of blood...\n\n" +
                "...God, there's so much blood.\n\n" +
                "It's everywhere. Even in the darkness, it seems to soak and smatter every visible fabric. \n\n" +  //idk man it errors out if i delete this comment                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                dripping from every surface it can’t absorb into. What’s worse, the old man seems completely unscathed. Judging by how he’s standing and the wild look in his eye, you’re sure that none of the blood you see is his. \\n\\n\n" +
                "The old man locks eyes with you, the animalistic thrill within them fading for a moment back " +
                "to his usual passively pleasant demeanor, \"Go back to bed,\" he says sweetly, \"It’s late.\"\n\n" +
                "What do you do?");
        ui.choice1.setVisible(false);
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(true);
        ui.choice4.setVisible(true);
        ui.choice5.setVisible(true);

        ui.choice3.setText("Go back to bed");
        ui.choice4.setText("Charge at the old man");
        ui.choice5.setText("Stand there and do nothing");

        game.position3 = "backToBed";
        game.position4 = "AttackOldMan";
        game.position5 = "standStill";
    }

    public void backToBed() {
        ui.mainTextArea.setText("You stand there a moment, looking from the old man, to Mallory, then back again.\n\n" +
                "Eventually, you nod reluctantly and turn to go back into your room.\n\n" +
                "You can't fight this man.\n\n " +
                "He may look frail, but if he had the ability to do...that to Mallory, he's clearly stronger than " +
                "he looks.\n\n" +
                "\"Good,\" the old man says through a smile.\n\n" +
                "Out of the corner of your eye, you see him abruptly extend his free hand, and though he's " +
                "several feet away, you are thrown violently forward into your room, and the door slams shut " +
                "behind you.\n\n");
        ui.choice1.setVisible(false);
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(false);
        ui.choice5.setVisible(true);

        ui.choice5.setText(">");

        game.position5 = "room1";
    }

    public void AttackOldMan() {
        ui.mainTextArea.setText("You stare at the old man in disbelief, rage and disgust bubbling up through your " +
                "veins as you process what he's just said. He may well have just murdered someone and he wants " +
                "you to \"go back to bed\" as if nothing happened?\n\n" +
                "No. You can’t do that.\n\n" +
                "In one swift motion, you reach down and pick up the heavy object once more, charging the " +
                "old man with all your might.\n\n" +
                "You don't care if you'll win. If you don't try, you'll never forgive yourself.\n\n" +
                "The old man simply chuckles, lazily extending his free hand. You're barely able to take a " +
                "step when an invisible force suddenly pushes you backwards.\n\n" +
                "It feels as though a battering ram has been shoved into your chest as your feet leave the ground " +
                "and you're hurled back into your bedroom, the door slamming shut behind you.\n\n" );
        ui.choice1.setVisible(false);
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(false);
        ui.choice5.setVisible(true);

        ui.choice5.setText(">");

        game.position5 = "room1";
    }

    public void standStill() {
        ui.mainTextArea.setText("You simply stand there, frozen in shock as you try and process the scene " +
                "before you. This is the old man who asked you to help him up the stairs earlier this week. " +
                "He took you in. He took you both in, and now- \n\n" +
                "Where is the butler? Does he know? Or did he simply not hear Mallory’s screams?\n\n " +
                "\"Go. To. Bed.\" The old man's voice is lower now, and clearly holds a threat. You know you " +
                "should follow his instructions, or if not that, at least try to stop him, but you just... can't.\n\n" +
                "Your feet are frozen in place and you can't seem to take your eyes off of poor Mallory's " +
                "bloody body as he gasps for what may be his final breaths.\n\n" +
                "The old man scoffs, extending his free arm. Suddenly, an invisible force rams into you, " +
                "sending you crashing backwards into your room as the door slams violently shut.\n\n");
        ui.choice1.setVisible(false);
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(false);
        ui.choice5.setVisible(true);

        ui.choice5.setText(">");

        game.position5 = "room1";
    }

    /*********** FLOOR ONE *************/
    public void room1() {
        ui.mainTextArea.setText("You sit there on the floor of your room, still processing what’s just happened." +
                " There’s a sickening series of thumps and thuds as you assume the old man drags Mallory’s body " +
                "down the stairs. Part of you wants to sob, the other part wants to throw up, and a third prays " +
                "that you’re dreaming. But this is not a dream, and you don’t have the energy right now to do " +
                "either of those things. Instead, you glance at the door. It doesn’t lock, but after what just " +
                "happened, you wouldn’t be surprised if you were somehow locked in. Mallory might be dead. And " +
                "you might be next. After a moment you resolve that you have to get out of here. You’d rather " +
                "be homeless than stuck with a murderer.\n\n" +
                "Shakily, you get to your feet and glance around the room.\n\n" +
                "What do you want to do?");
        ui.choice1.setVisible(false);
        ui.choice2.setVisible(true);
        ui.choice3.setVisible(true);
        ui.choice4.setVisible(true);
        ui.choice5.setVisible(true);

        ui.choice2.setText("Search floor ");
        ui.choice3.setText("Try to go back to sleep");
        ui.choice4.setText("Try the door");
        ui.choice5.setText("See map");

        game.position2 = "searchFloor";
        game.position3 = "backSleep";
        game.position4 = "tryDoor";
        game.position5 = "room1Map";
    }
    public void room1Map() {
        ui.ImageLabel.setIcon(Bedroom1);
    }

    //Try the door (leave)
    public void tryDoor() {
        ui.ImageLabel.setVisible(false);
        ui.mainTextArea.setText("You walk to the door and test the knob. You half expect it to somehow explode " +
                "on contact or light your hand on fire as you go to grab it, but it simply turns harmlessly. No " +
                "pain, no terror, just a quiet ‘click’ as the door unlatches itself. When you release the " +
                "handle, the door creaks gently open, revealing the hallway ahead of you, now empty save " +
                "for a trail of blood so thick that you almost can’t believe that that much could come from " +
                "one person.\n\n" +
                "With little other choice, you swallow your fear, stepping out into the dark hallway. There " +
                "is a closed door to your left that you know to be the old man’s chambers, and on the other " +
                "side of the hall, the trail of blood leads to Mallory’s bedroom. Between you and Mallory’s " +
                "room is the staircase leading to the second floor, in the darkness looking more like a " +
                "gaping void in the wall going downwards.\n\n" +
                "Where do you go?\n\n");
        ui.choice1.setVisible(false);
        ui.choice2.setVisible(true);
        ui.choice3.setVisible(true);
        ui.choice4.setVisible(true);
        ui.choice5.setVisible(true);

        ui.choice2.setText("The Old Man's chambers"); //TODO: BUTTON DOESN'T WORK AND IDK WHY...Fixed!!
        ui.choice3.setText("Mallory's room");
        ui.choice4.setText("Down the stairs");
        ui.choice5.setText("See map"); //Bedroom1

        game.position2 = "tryBedroomOnLeft";
        game.position3 = "MalloryRoom";
        game.position4 = "downstairs";
        game.position5 = "room1Map";
    }

    public void searchFloor() {
        ui.ImageLabel.setVisible(false);
        ui.mainTextArea.setText("You glance down at the floor. A few items fell from your desk when you were " +
                "flung into the room, but other than that, it’s rather clean, save for a stray shirt you have " +
                "yet to fold. Looking at it now, it feels almost foreign despite the fact that you’ve been " +
                "living here for almost a week. You shake your head, turning back to the door. \n\n");
        ui.choice1.setVisible(false);
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(true);
        ui.choice5.setVisible(true);

        ui.choice4.setText("Try to go back to sleep");
        ui.choice5.setText("Try the door");

        game.position4 = "backSleep";
        game.position5 = "tryDoor"; //map?? Bedroom1
    }

    public void backSleep() {
        ui.ImageLabel.setVisible(false);
        ui.mainTextArea.setText("Perhaps it’s best if you go back to sleep, you decide. You go and lie " +
                "down on the bed and pull the covers over you, but it no longer feels as soft as it " +
                "did earlier. You feel every lump and spring of the mattress, and every time you close " +
                "your eyes, all you see is Mallory’s bloody body, wheezing weakly with his head only " +
                "held up by his hair intertwined in the old man’s crimson fingers. The old man’s bloodstained " +
                "teeth as he grins and politely asks you to \"go back to bed.\" You shake yourself and get " +
                "to your feet. Maybe sleep isn’t the best idea.\n\n");
        ui.choice1.setVisible(false);
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(true);
        ui.choice4.setVisible(true);
        ui.choice5.setVisible(true);

        ui.choice3.setText("Search the floor");
        ui.choice4.setText("Try the door");
        ui.choice5.setText("See map");

        game.position3 = "searchFloor";
        game.position4 = "tryDoor";
        game.position5 = "room1Map";
    }

    //Downstairs
    public void downstairs() {
        ui.mainTextArea.setText("You decide that it isn’t worth checking the other rooms, instead opting " +
                "to go downstairs. \n\n" +
                "As you stand looking down the descending corridor, you feel a shiver of fear run up your " +
                "spine, and for a moment, you hesitate. You’re certain that the old man dragged Mallory " +
                "down these stairs, and at this point, he could be anywhere in the mansion. If he finds you…\n\n" +
                "No. You can’t think like that, you decide.\n\n" +
                "You have to get out of here. This is the only way down to the door on the main floor, " +
                "and you’re not about to jump out of a third story window to try and escape. \n\n" +
                "Though the fear of being caught still weighs heavily on your mind, you steel yourself, " +
                "stepping down into the darkness. \n\n");
        ui.choice1.setVisible(false);
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(false);
        ui.choice5.setVisible(true);

        ui.choice5.setText(">");

        game.position5 = "room5";
    }

    //The bedroom on your left (2)
    public void tryBedroomOnLeft() {
        ui.mainTextArea.setText("You try the door to your left, only to find that, predictably, it’s locked. " +
                "He always locks his room anyway, and it would only follow that he would most definitely " +
                "lock it when committing a murder. \n\n" +
                "You sigh, turning back to the hallway.\n\n" +
                "Where do you go? \n\n");
        ui.choice1.setVisible(false);
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(true);
        ui.choice4.setVisible(true);
        ui.choice5.setVisible(true);

        ui.choice3.setText("Go to Mallory's room");
        ui.choice4.setText("Go downstairs");
        ui.choice5.setText("See map"); //Hallway(5a)

        game.position1 = "MalloryRoom";
        game.position2= "downstairs";
        game.position3 = ""; //TODO add map
    }

    // Mallory's room
    public void MalloryRoom() {
        ui.mainTextArea.setText("Cautiously, you walk through the hall down to Mallory’s room, trying to " +
                "ignore the squish of the bloodsoaked carpet as wetness of it seeps into your socks. The " +
                "door to his room is already open, and, out of a combination of concern and morbid curiosity, " +
                "you enter. \n\n" +
                "The room is strangely orderly for one in which someone was just killed. The only signs of " +
                "a struggle, save for the obvious bloodstain in the middle of the carpet, seem to be around " +
                "the bed, with the blankets and pillows clearly having been kicked around. Did the old man " +
                "sneak up on him? Or perhaps Mallory simply hadn’t expected it when the old man had entered " +
                "his room in the middle of the night. \n\n" +
                "Suddenly you remember your last conversation with Mallory, and how it had felt like goodbye. " +
                "He couldn’t have known that this was going to happen, right? How could one predict a murder " +
                "like that?\n\n" +
                "You shake your head. As horrible as it is, there are more pressing matters at hand. You can " +
                "grieve for your friend once you’re out of here. \n\n" +
                "His room is set up similarly to your own, with a bed to one wall and a desk to the other. At " +
                "the foot of the bed sits a closet door.\n\n");
        ui.choice1.setVisible(true);
        ui.choice2.setVisible(true);
        ui.choice3.setVisible(true);
        ui.choice4.setVisible(true);
        ui.choice5.setVisible(true);

        ui.choice1.setText("Search his bed");
        ui.choice2.setText("Search his closet");
        ui.choice3.setText("Search his desk");
        ui.choice4.setText("Leave the room");
        ui.choice5.setText("See map"); //Mallory's Bedroom (4)

        game.position1 = "SearchBed";
        game.position2= "SearchCloset";
        game.position3 = "SearchDesk";
        game.position4 = "LeaveRoom";
        game.position5 = ""; //TODO add map
    }

    //Search bed
    public void SearchBed() {
        ui.mainTextArea.setText("You apprehensively approach the bed, a wave of grief washing over you as it " +
                "sinks in that this is likely where Mallory’s fate was sealed. Blood is everywhere, and there’s " +
                "a smattering of it up and across the wall as if his throat had been slit. \n\n" +
                "You look down, taking a moment to center yourself as you feel the bile rising up in your throat. " +
                "Nothing could have prepared you for the events of tonight. \n\n" +
                "It’s then that something poking out from beneath the bedskirt catches your eye. Something solid " +
                "and shiny. You crouch down to look under the bed. \n\n" +
                "At first you’re not entirely sure what you’re looking at, but as your eyes adjust, you " +
                "recoil a little at the sight.\n\n" +
                "They’re...chains. Shackles, bolted to the floor and long enough to reach up to the bed. \n\n" +
                "Did-\n\n" +
                "Did the old man chain Mallory up??\n\n" +
                "You think back to one first days you were there. Mallory had made a mistake, and after that " +
                "you hadn't seen him for an entire day - not even at dinner. The next time you’d seen him, " +
                "you’d noticed the bruises on his wrists, but had assumed that they were from some accident " +
                "while working. Not...this.\n\n" +
                "You scramble to your feet, shaking yourself and looking around the rest of the room.\n\n" );
        ui.choice1.setVisible(false);
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(true);
        ui.choice4.setVisible(true);
        ui.choice5.setVisible(true);

        ui.choice3.setText("Search his closet");
        ui.choice4.setText("Search his desk");
        ui.choice5.setText("Leave the room");

        game.position3 = "SearchCloset";
        game.position4 = "SearchDesk";
        game.position5 = "LeaveRoom";
    }

    //Search closet
    public void SearchCloset() {
        if (shoes && !coat){
            ui.mainTextArea.setText("You walk over to the closet and slowly open the door. It’s surprisingly " +
                    "bare, even for Mallory. There are three shirts, two pairs of pants, and a yellow raincoat " +
                    "hanging there.");
            ui.choice1.setVisible(false);
            ui.choice2.setVisible(false);
            ui.choice3.setVisible(false);
            ui.choice4.setVisible(true);
            ui.choice5.setVisible(true);

            ui.choice4.setText("Put on the coat");
            ui.choice5.setText("Leave Closet");

            game.position4 = "Coat";
            game.position5 = "LeaveCloset";
        }
        else if (coat && !shoes){
            ui.mainTextArea.setText("You walk over to the closet and slowly open the door. It’s surprisingly " +
                    "bare, even for Mallory. There are three shirts, two pairs of pants, and a single pair " +
                    "of shoes sitting on the floor. It’s odd, considering that the old man insisted that all " +
                    "shoes be kept in the hall closet near the front door. \n\n");
            ui.choice1.setVisible(false);
            ui.choice2.setVisible(false);
            ui.choice3.setVisible(false);
            ui.choice4.setVisible(true);
            ui.choice5.setVisible(true);

            ui.choice4.setText("Put on the shoes");
            ui.choice5.setText("Leave Closet");

            game.position4 = "Shoes";
            game.position5 = "LeaveCloset";
        }
        else if (coat && shoes){
            ui.mainTextArea.setText("You walk over to the closet and slowly open the door. It’s surprisingly " +
                    "bare, even for Mallory. There are three shirts and two pairs of pants. You didn't " +
                    "realize exactly how bear it could look until you realize how empty it is now that " +
                    "you've taken the shoes and the coat.\n\n");
            ui.choice1.setVisible(false);
            ui.choice2.setVisible(false);
            ui.choice3.setVisible(false);
            ui.choice4.setVisible(false);
            ui.choice5.setVisible(true);

            ui.choice5.setText("Leave Closet");

            game.position5 = "LeaveCloset";//TODO: this button also doesn't work for some reason????
        }
        else{
            ui.mainTextArea.setText("You walk over to the closet and slowly open the door. It’s surprisingly " +
                    "bare, even for Mallory. There are three shirts, two pairs of pants, and a yellow " +
                    "raincoat hanging there, with a single pair of shoes sitting on the floor. It’s odd, " +
                    "considering that the old man insisted that all shoes be kept in the hall closet near " +
                    "the front door.\n\n");
            ui.choice1.setVisible(false);
            ui.choice2.setVisible(false);
            ui.choice3.setVisible(true);
            ui.choice4.setVisible(true);
            ui.choice5.setVisible(true);

            ui.choice3.setText("Put on the shoes");
            ui.choice4.setText("Put on the coat");
            ui.choice5.setText("Leave Closet");

            game.position3 = "Shoes";
            game.position4 = "Coat";
            game.position5 = "Leave Closet";
        }
    }

    //Put on shoes
    public void Shoes() {
        ui.mainTextArea.setText("You glance down at your sock-covered feet. If you’re going to be running " +
                "away tonight, you decide, it’s probably best that you have some shoes. Luckily you and " +
                "Mallory are nearly the same shoe-size, so they slip on easily. \n\n");
        shoes = true;

        ui.choice1.setVisible(false);
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
        if (coat){
            ui.choice4.setVisible(false);
        }
        else{
            ui.choice4.setVisible(true);
        }
        ui.choice5.setVisible(true);

        ui.choice4.setText("Put on the coat");
        ui.choice5.setText("Leave Closet");

        game.position4 = "Coat";
        game.position5 = "LeaveCloset";
    }

     public void Coat() {
        coat = true;
        ui.mainTextArea.setText("You reach for the coat, pulling it off the hanger. It’s a cold autumn night, " +
                "and considering how far this mansion is from any people, you’re sure that it’s going to be " +
                "a long walk in the fridged air before you can find help, so you figure it’s best if you " +
                "put it on. It’s a little tight in the shoulders, but on the whole it doesn’t fit too badly.\n\n");
        ui.choice1.setVisible(false);
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
        if(shoes){
            ui.choice4.setVisible(false);
        }
        else{
            ui.choice4.setVisible(true);
        }

        ui.choice5.setVisible(true);

        ui.choice4.setText("Put on the shoes");
        ui.choice5.setText("Leave Closet");

        game.position4 = "Shoes";
        game.position5 = "LeaveCloset";
    }

   //Leave Closet
    public void LeaveCloset() {
        ui.mainTextArea.setText("You take one last glance at the nearly empty closet before turning back " +
                "to the room. \n\n");
        ui.choice1.setVisible(false);
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(true);
        ui.choice4.setVisible(true);
        ui.choice5.setVisible(true);

        ui.choice3.setText("Search his desk");
        ui.choice4.setText("Search his bed");
        ui.choice5.setText("Leave the room");

        game.position3 = "SearchDesk";
        game.position4 = "SearchBed";
        game.position5 = "LeaveRoom";//map??? Mallory's Bedroom (4)
    }

    //Search desk
    public void SearchDesk() {
        ui.mainTextArea.setText("You walk to the desk and glance over its surface. It’s one of the only " +
                "parts of the room that’s relatively blood-free, save for a drop or two scattered at one " +
                "corner.There’s a pen holder and a lamp, and a few un-marked scraps of paper. In the " +
                "center is a book: a copy of  Shakespeare’s Much Ado about Nothing. However, you’ve read " +
                "Much Ado About Nothing, and this copy is much thicker than it should be.\n\n" +
                "Beside it sits a polaroid picture with a date written on the bottom.\n\n");
        ui.choice1.setVisible(false);
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(true);
        ui.choice4.setVisible(true);
        ui.choice5.setVisible(true);

        ui.choice3.setText("Examine the book");
        ui.choice4.setText("Examine the picture");
        ui.choice5.setText("Leave desk");

        game.position3 = "ExamineBook";
        game.position4 = "ExaminePicture";
        game.position5 = "LeaveDesk";
    }

    //Examine the book (room4)
    public void ExamineBook() {
        ui.mainTextArea.setText("You pick up the book, glancing over the dust jacket before gently opening it. You " +
                "expect to see a title page for Much Ado About Nothing, but as you open to the first page, " +
                "instead you find something completely different. \n\n" +
                "\"Incantations and Unbinding: How to Undo What’s Been Done\" is scrawled across the page in a " +
                "decorative font, and as you hold it, the dust jacket slips from the front cover, revealing the " +
                "same title in gilded lettering on the cover of the book.\n\n" +
                "Your curiosity piqued, you begin to flip through the pages. Some of them have corners folded over, " +
                "or bits underlined as if to mark the things that Mallory must have thought to be important. " +
                "All of them seem to pertain to reversing immortality. Little notes written in the margins ask " +
                "questions and make statements:\n\n" +
                " “Does he have to participate??”\n\n" +
                "“Blood needed”\n\n" +
                "“Bad idea - last resort”\n\n" +
                "“House bound to him?????”\n\n" +
                "And so on.\n\n" +
                "The book seems to take itself rather seriously and is almost written in the style of a textbook " +
                "in some places, dealing with a different spell or ritual every few pages. On its own, you might " +
                "have simply taken it as a piece of fan material for a series or tabletop game, but the fact " +
                "that Mallory took it so seriously concerns you. Though you’ve only been here a few days, you " +
                "know that he didn’t have time for hobbies or fandoms. \n\n" +
                "Did the old man really harm him that much? Was he that far gone to have to start believing in " +
                "spells and immortality to cope with his situation? He’d never struck you as someone losing his " +
                "grip on reality, but you figure a lot can happen behind closed doors. \n\n");
        ui.choice1.setVisible(false);
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(false);
        ui.choice5.setVisible(true);

        ui.choice5.setText(">");

        game.position5 = "ExamineBookCont";
    }

    public void ExamineBookCont() {
        ui.mainTextArea.setText("There seems to be a great deal in the book about removing one’s soul and " +
                "tricking the body into thinking it’s still there, whatever that means. \n\n" +
                "One passage underlined rather intensely in pen reads, \"There is no way to reverse soullessness " +
                "once it has been done. The soulless will live on as long as the individual can find " +
                "sustenance in the mortal realm. The only way that one who has begun to draw life from below " +
                "the metaphysical plane can perish while still well-nourished is if the immortal body is " +
                "killed within a day after it has fed. It is weakest as it draws lifeforce from its meals, " +
                "and only then can the body be jolted into 'realizing' there is no soul sustaining it.\" \n\n" +
                "Written beside this passage are simply the words, \"Next time?\"\n\n" +
                "Shaking your head, you close the book, fold the dust jacket back over the cover, and place it " +
                "back on the desk.\n\n");
        ui.choice1.setVisible(false);
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(true);
        ui.choice5.setVisible(true);

        ui.choice4.setText("Examine the picture");
        ui.choice5.setText("Leave desk");

        game.position4 = "ExaminePicture";
        game.position5 = "LeaveDesk";
    }

    //Examine the picture
    public void ExaminePicture() {
        ui.mainTextArea.setText("You pick up the polaroid and glance at the date. July 24, 2017. It’s a picture of " +
                "Mallory standing with a group of people who you assume to be relatives at a beach somewhere. " +
                "But he looks...different. His hair is shorter, and his frame is filled out more healthfully " +
                "than it ever had been in the time you’d known him. The deep, chasmous dark circles beneath his " +
                "eyes are lighter here - almost nonexistent on his semi-sunburnt face. He’s smiling in a way that " +
                "you’ve never seen before, almost as if he’s laughing at something behind the camera.\n\n" +
                "You realize you’d never seen him genuinely laugh.\n\n" +
                "A middle-aged woman stands grinning beside him with an arm placed playfully around his shoulders, " +
                "and sitting in the sand at his feet is a little blonde girl who couldn’t be older than 10 or 11. " +
                "She’s also clearly laughing, her hands packed with fistfulls of sand.\n\n" +
                "You feel tears begin to well up in your eyes as you stare at the polaroid. He had a family once. " +
                "People who loved him. At least that’s what it looks like in the picture. What happened to him " +
                "that made him land here, of all places? That made him die here? Would his family even know that " +
                "he was gone?\n\n" +
                "Would they care?\n\n" +
                "You draw in a shaky breath as your vision blurs with tears that threaten to spill over. You " +
                "quickly put down the polaroid and wipe your eyes. You don’t have time to be getting emotional " +
                "right now.\n\n" +
                "Still, you can’t help but hazard one last lingering glance at the photo. You wish he could have " +
                "seen them again.\n\n");
        ui.choice1.setVisible(false);
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(true);
        ui.choice5.setVisible(true);

        ui.choice4.setText("Examine the book");
        ui.choice5.setText("Leave desk");

        game.position4 = "ExamineBook";
        game.position5 = "LeaveDesk";
    }

    //Leave desk
    public void LeaveDesk() {
        ui.mainTextArea.setText("You decide you’ve had your fill of snooping around Mallory’s desk, and chuckle " +
                "a little to yourself as you realize how he’s going to be pissed when he--\n\n" +
                "The blood smeared across the room jolts you back to where you are, and the small smile drops " +
                "from your face. There is no “when”. Not anymore.\n\n" +
                "Clenching your jaw and, attempting to swallow back the rock in your throat, you turn your " +
                "attention back to the room. \n\n");
        ui.choice1.setVisible(false);
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(true);
        ui.choice4.setVisible(true);
        ui.choice5.setVisible(true);

        ui.choice3.setText("Search closet");
        ui.choice4.setText("Search bed");
        ui.choice5.setText("Leave room");

        game.position3 = "SearchCloset";
        game.position4 = "SearchBed";
        game.position5 = "LeaveRoom";//map??? Mallory's Bedroom (4)
    }

    //Leave room
    public void LeaveRoom() {
        ui.mainTextArea.setText("You give one last sweeping glance to the room before stepping back out into the " +
                "hallway and making your way over to the staircase.\n\n" +
                "As you stand looking down the descending corridor, you feel a shiver of fear run up your spine, " +
                "and for a moment, you hesitate. You’re certain that the old man dragged Mallory down these stairs, " +
                "and at this point, he could be anywhere in the mansion. If he finds you...\n\n" +
                "No. You can’t think like that, you decide.\n\n" +
                "You have to get out of here. This is the only way down to the door on the main floor, and you’re " +
                "not about to jump out of a third story window to try and escape.\n\n" +
                "Though the fear of being caught still weighs heavily on your mind, you steel yourself, stepping " +
                "down into the darkness. \n\n");
        ui.choice1.setVisible(false);
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(false);
        ui.choice5.setVisible(true);

        ui.choice5.setText(">");

        game.position5 = "room5";
    }

    //Down in third over section, room 5:
    public void room5() {
        ui.mainTextArea.setText("You step cautiously as you descend the stairs, praying that no one will catch " +
                "you once you reach the bottom. It’s dark; with every step a part of you fears that your foot will " +
                "miss, and you’ll be sent tumbling down the stairway. Still, these stairs don’t creak as much as " +
                "the ones on the lower levels, and for that, you’re grateful.\n\n" +
                "You nearly hit your head on the ceiling as you finally reach the bottom of the stairs. It’s " +
                "always been much lower on this level than the others. As you step out into the hallway, you see " +
                "something move out of the corner of your eye. Something brushes against your ankle, and as you " +
                "try to step away, it seems to follow your every move. Nearly tripping, you look down to see a " +
                "pair of yellow eyes staring back at you from the darkness, and there’s a quiet meow from the " +
                "little creature at your feet. A wave of relief washes over you. It’s just the cat. You watch " +
                "as it slinks away from you, trying to steady your beating heart. It pauses at a pair of doors " +
                "on the opposite wall, seeming to test each one before one of them yields to its paws and it " +
                "goes in.\n\n" +
                "In another world, you might have laughed at the fact that the most harmless creature in the mansion" +
                "managed to scare you so badly. After a moment, you begin to make your way towards the other " +
                "stairs. As you take a step, a floorboard creaks loudly. Something feels wrong.\n\n" +
                "You glance back to where you came from to find that the staircase you just walked down is...gone. " +
                "Where there was once an opening is simply a wall, with no trace that there was ever a stairway " +
                "there to begin with. You force yourself to continue onward. Perhaps it’s just the darkness " +
                "playing tricks on you.\n\n" +
                "All of a sudden, a great cracking sound echoes through the hallway, and the ceiling opens. " +
                "From it descends countless blades, swinging violently on ropes and glinting in the darkness. " +
                "You watch in horror as one swings directly at you.\n\n" +
                "What do you do?! \n\n");
        ui.choice1.setVisible(false);
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(true);
        ui.choice4.setVisible(true);
        ui.choice5.setVisible(true);

        ui.choice3.setText("Run!");
        ui.choice4.setText("Duck down!");
        ui.choice5.setText("See map!"); //still gotta make that

        game.position3 = "Run";
        game.position4 = "DuckDown";
        game.position5 = ""; //TODO add cant see map
    }

    //Run
    public void Run() {
        ui.mainTextArea.setText("You try to sprint away from the blade swinging towards you, but as you turn to " +
                "run, you feel something ram into your side. Turning, pain erupts from your abdomen as you find " +
                "that a different blade has lodged itself just above your hip, hooking you in place.\n\n" +
                "As you struggle, another comes swinging at you head on, and you feel a painful popping in your " +
                "chest as it buries itself in your sternum. \n\n" +
                "Then another swings into you. And then another. \n\n" +
                "You can hardly bear the agony as you hang there, suspended by the blades that have hooked " +
                "themselves deep into your flesh. You’re not sure how long you’ve hung there, but you open your " +
                "eyes as you hear a door creak open, and the butler emerges from one of the rooms near where " +
                "the stairs used to be. A foolish spark of hope ignites within you as he approaches, genuine " +
                "concern seeming to color his movements. He looks you over, shaking his head sadly as he reaches " +
                "up to gently cup your cheek. \"I’m so sorry,\" he mutters quietly. \n\n" +
                "He reaches his other hand and runs it through your hair, lingering on the back of your head.\n\n" +
                "You watch as he draws in breath, still holding your head, before your neck is violently twisted " +
                "and everything goes black. \n\n" +
                "\n" +
                "You’ve discovered one of many ways to die in this game! Good for you! But, it IS possible to win, " +
                "so I suggest you restart the game and play again.\n\n");
        ui.choice1.setVisible(false);
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(false);
        ui.choice5.setVisible(true);

        ui.choice5.setText(">");

        game.position5 = "theMansion"; //death
    }

    //Go to room 9 section
    public void DuckDown() {
        ui.mainTextArea.setText("You duck down onto the floor as the blades swing past overhead. They seem to hang " +
                "about three feet above the ground, and everything below that appears to be safe to crawl through. " +
                "You glance around and notice that the door the cat opened earlier is still ajar, so, too " +
                "terrified to attempt to make it all the way to the stairs, you drag yourself into the room and " +
                "close the door behind you.\n\n" +
                "The room is even darker than the hallway, and you can’t make out anything inside it as you sit " +
                "huddled against the wall, catching your breath. The room is uncomfortably silent, and you can hear " +
                "your heart pounding in your chest and blood rushing in your ears.\n\n" +
                "The darkness seems to close in on you as you sit there, and if you squint, you can almost convince " +
                "yourself that you see shapes moving in the darkness. Of course, it’s probably just your eyes " +
                "playing tricks on you. At this point, you’re convinced that it’s simply your imagination. After " +
                "everything that’s happened to you tonight, you’ve decided it’s best not to overthink things.\n\n" +
                "You close your eyes for a moment, just trying to steady yourself, and feel a comforting hand " +
                "press itself onto your shoulder.\n\n" +
                "Then you remember that you’re alone in the room.\n\n" +
                "Your eyes fly open and you spring terrified to your feet, your gaze frantically darting over the " +
                "pitch-dark room.\n\n" +
                "That was a hand. A real hand.\n\n" +
                "You can credit your imagination for a lot of things, but that’s certainly not one of them. \n\n" +
                "As you pin yourself to the wall, your shoulder hits the lightswitch and the overhead lights of " +
                "the room flick on.\n\n" +
                "You watch once your eyes adjust to the light as the cat darts away from you, stopping and staring " +
                "at you from the center of the room.\n\n" +
                "There’s no one else there.\n\n");
        ui.choice1.setVisible(false);
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(false);
        ui.choice5.setVisible(true);

        ui.choice5.setText(">");

        game.position5 = "continue9";
    }

    public void room9Cont(){
        ui.mainTextArea.setText("You stand there a moment, panting. Perhaps it really was your imagination. You " +
                "stare at the cat as it sits and stares back at you, its shadow extending towards you a great " +
                "deal further than you feel it should. You feel like you’re going insane. \n\n" +
                "The cat approaches you cautiously. \n\n" +
                "How do you treat the cat?");
        ui.choice1.setVisible(false);
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(true);
        ui.choice4.setVisible(true);
        ui.choice5.setVisible(true);

        ui.choice3.setText("Kick the cat away");
        ui.choice4.setText("Ignore the cat");
        ui.choice5.setText("Try to pet the cat"); //map?? Cat Fight (9)

        game.position3 = "KickCat";
        game.position4 = "IgnoreCat";
        game.position5 = "PetCat";
    }

    //Kick the cat away
    public void KickCat() {
        kick = true;
        ui.mainTextArea.setText("You stare at the cat in disgust as it walks towards you. It slowly approaches " +
                "your leg, and as it goes to sniff, you thrash out your foot, nailing it in the chin and sending " +
                "it stumbling backwards and hissing. Its hair stands on end as it stares at you in shock for a " +
                "moment before quickly limping into a corner of the room and painfully laying down, curling " +
                "itself into as tight a ball as possible. You notice a bit of blood on its tongue as if it bit " +
                "itself when you kicked it. It crouches there for a moment, shaking and staring at you with " +
                "wide, terrified eyes. You scoff and move to examine the room.\n\n" +
                "There’s a large bookcase to one wall, and an unlit fireplace to an adjacent one. In the " +
                "middle of the room, surrounded by couches, is a coffee table with a handful of writing materials " +
                "and paper on it.\n\n" +
                "What do you do?\n\n");
        ui.choice1.setVisible(false);
        ui.choice2.setVisible(true);
        ui.choice3.setVisible(true);
        ui.choice4.setVisible(true);
        ui.choice5.setVisible(true);

        ui.choice2.setText("Examine the bookcase");
        ui.choice3.setText("Examine the coffee table");
        ui.choice4.setText("Examine the fireplace");
        ui.choice5.setText("See map"); //Cat Fight (9)

        game.position2 = "ExamineBookcase";
        game.position3 = "ExamineCoffeeTable";
        game.position4 = "ExamineFireplace";
        game.position5 = ""; //TODO add map
    }

    //Ignore the cat
    public void IgnoreCat() {
        ignore = true;
        ui.mainTextArea.setText("You don’t pay the cat any mind as it approaches you, sniffing you a little and " +
                "then wandering off to do its own thing. You instead move to examine the room. \n\n" +
                "To one wall is a bookcase, laden with various titles that appear to be rather esoteric.\n\n" +
                "To an adjacent wall is an unlit fireplace that looks recently used. It seems to have a few " +
                "small items on its mantel, but it’s too far away for you to properly see what’s on it. \n\n" +
                "In the middle of the room, surrounded by couches, sits a coffee table. It’s peppered with pens " +
                "and paper and various other writing materials, including what looks like a feather pen.\n\n" +
                "What do you do? \n\n");
        ui.choice1.setVisible(false);
        ui.choice2.setVisible(true);
        ui.choice3.setVisible(true);
        ui.choice4.setVisible(true);
        ui.choice5.setVisible(true);

        ui.choice2.setText("Examine the bookcase");
        ui.choice3.setText("Examine the coffee table");
        ui.choice4.setText("Examine the fireplace");
        ui.choice5.setText("See map"); //Cat Fight (9)

        game.position2 = "ExamineBookcase";
        game.position3 = "ExamineCoffeeTable";
        game.position4 = "ExamineFireplace";
        game.position5 = ""; //TODO add map
    }

    //Try to pet the cat
       public void PetCat() {
        pet = true;
        ui.mainTextArea.setText("You crouch down and extend a hand as the cat approaches you, allowing it to sniff. " +
                "It takes a moment, thoroughly smelling your hand and up your arm before deciding that you’re a " +
                "friend, beginning to purr as it pushes its face through your fingers. You can’t help but smile a " +
                "bit as it flops down in front of you, showing you its belly and staring at you expectantly. " +
                "You chuckle a little, scratching it as it purrs. You’ve never been too much of a cat person, " +
                "but you’d be lying if you didn’t admit that this one was rather cute. \n\n" +
                "After a while, the cat reaches down and nips your hand to tell you that it has finished being pet " +
                "for the time being, thank you very much, then stands, rubbing against your hand one more time " +
                "before walking off. \n\n" +
                "You smile as you, too, get to your feet, glancing around the room. \n\n" +
                "To one wall is a bookcase so laden with various esoteric titles that some are stacked on the " +
                "edges of the shelves for lack of space. A tiny book sits haphazardly on one of the shelves as if " +
                "it was recently put back without much care. \n\n" +
                "To an adjacent wall is an unlit fireplace that looks recently used. It seems to have a few small " +
                "items on its mantel, but it’s too far away for you to properly see what’s on it. Still, a tiny " +
                "box beside a decorative statue catches your eye.\n\n" +
                "In the middle of the room, surrounded by couches, sits a coffee table. It’s peppered with pens " +
                "and paper and various other writing materials, including what looks like a feather pen. It looks " +
                "as though there’s something beneath the papers strewn across it, but you’d have to check to be " +
                "sure.\n\n" +
                "What do you do?\n\n");
           ui.choice1.setVisible(false);
           ui.choice2.setVisible(true);
           ui.choice3.setVisible(true);
           ui.choice4.setVisible(true);
           ui.choice5.setVisible(true);

           ui.choice2.setText("Examine the bookcase");
           ui.choice3.setText("Examine the coffee table");
           ui.choice4.setText("Examine the fireplace");
           ui.choice5.setText("See map");//Cat Fight (9)

           game.position2 = "ExamineBookcase";
           game.position3 = "ExamineCoffeeTable";
           game.position4 = "ExamineFireplace";
           game.position5 = ""; //TODO add map
    }

    // In room 9
    //Examine the bookcase
    public void ExamineBookcase() {
        ui.mainTextArea.setText("You make your way over to the bookcase and begin to look it over. Various " +
                "titles that sound more like fantasy than nonfiction scatter the shelves, such as:\n\n" +
                "The Ins and Outs of Human Transmutation\n\n" +
                "Binding the Bound: Ensuring Loyalty\n\n" +
                "From Puppet to Puppeteer: Mind Control for Dummies\n\n" +
                "And so on. \n\n" +
                "An empty spot on the shelf catches your eye. It’s arranged in alphabetical order, and in the " +
                "\"I\" section is a gap that, if you’ve interpreted this right, shouldn’t be there. There are " +
                "plenty of books piled on the sides of the shelves and even on the floor that would fit well " +
                "into the spot left open, but for some reason it’s empty. It’s as if a book had been taken out " +
                "and never replaced.\n\n" +
                "Your attention turns to another book not too far from the empty spot, thrown haphazardly onto " +
                "the edge of the shelf as if it was put back in a rush. It’s tiny - barely bigger than your " +
                "hand - and titled Invisibility on the Go: A Pocket Guide. You gingerly pick up the book and " +
                "open it, finding that it seems to be exactly what the title implies: a guide on various methods " +
                "to turn invisible on short notice.\n\n" +
                "You sigh. An hour ago, you would have thought that for a man who focuses so much on the practical, " +
                "the old man sure had a lot of impractical books. But now, after everything you’ve seen, there’s " +
                "a part of you that wants to believe it. You can’t believe you’re thinking this, but perhaps " +
                "the book could be helpful.\n\n" +
                "Or perhaps you’re starting to lose it and the book is just that - a book.\n\n" +
                "Do you decide to take it with you?\n\n");
        ui.choice1.setVisible(false);
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(true);
        ui.choice5.setVisible(true);

        ui.choice4.setText("Pocket the book");
        ui.choice5.setText("Leave it there");//map?? Cat Fight (9)

        game.position4 = "PocketBook";
        game.position5 = "LeaveBook";
    }

    // need to be fit
    public void PocketBook(){
        littleBook = true;
        ui.mainTextArea.setText("You take the book from the shelf and place it in the pocket of your pajama pants. " +
                "You know you're most likely being paranoid at best, but it gives you some comfort comfort to " +
                "have the little book, even if it is most likely fictional. At the very least, you figure, it'll " +
                "make a good souvenir to remind you that you made it through this hellish night in one piece.\n\n");

        ui.choice1.setVisible(false);
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(false);
        ui.choice5.setVisible(true);

        ui.choice5.setText(">");

        game.position5 = "FightScene";
    }

    public void LeaveBook(){
        ui.mainTextArea.setText("You shake your head, somewhat disappointed in yourself that you would genuinely " +
                "think a book would save you. What is this, Harry Potter?\n\n");

        ui.choice1.setVisible(false);
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(false);
        ui.choice5.setVisible(true);

        ui.choice5.setText(">");

        game.position5 = "FightScene";
    }

    //Examine the coffee table
    public void ExamineCoffeeTable() {
        ui.mainTextArea.setText("You walk over to the coffee table and give it a once-over. The papers appear " +
                "to be the beginnings of fancily-written letters, though the cursive is too messy and scrawling " +
                "for you to sit down and try to decipher right now. There doesn't appear to be much out of the " +
                "ordinary alongside the stationary and writing utensils, but as you look closer you discover " +
                "that there seems to be something beneath the three or four unfinished letters strewn across " +
                "the table.\n\n" +
                "Hesitantly, you push the papers aside to reveal a small ornate letter opener. It’s clearly " +
                "very old, and its design sits happily on the border between letter opener and plain old tiny " +
                "knife, but it seems to have found its purpose opening letters for the old man.\n\n" +
                "As you look at it, you can’t help but wonder whether you should take it with you. It definitely " +
                "could be used as a weapon if push came to shove, but a part of you wonders if you would be more " +
                "effective just sticking to your fists.\n\n" +
                "Do you take the letter opener?\n\n");
        ui.choice1.setVisible(false);
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(true);
        ui.choice5.setVisible(true);

        ui.choice4.setText("Take the letter opener");
        ui.choice5.setText("Leave it there");//map?? Cat Fight (9)

        game.position4 = "letterOpener";
        game.position5 = "leaveLetterOpener";
    }

    public void letterOpener() {
        letteropener = true;
        ui.mainTextArea.setText("You grab the letter opener and put it in your pocket. You figure that with " +
                "everything going on in this place, it can't hurt to have something stronger than your fists.\n\n");

        ui.choice1.setVisible(false);
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(false);
        ui.choice5.setVisible(true);

        ui.choice5.setText(">");

        game.position5 = "FightScene";
    }

    public void leaveLetterOpener() {
        ui.mainTextArea.setText("You decide to leave it. You never properly learned how to fight with a knife, " +
                "and you're not sure that the letter opener wouldn't ultimately do more harm than good.\n\n");

        ui.choice1.setVisible(false);
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(false);
        ui.choice5.setVisible(true);

        ui.choice5.setText(">");

        game.position5 = "FightScene";
    }

    //Examine the fireplace
    public void ExamineFireplace() {
        ui.mainTextArea.setText("You walk to the fireplace and survey the ornate black marble surrounding it. " +
                "Intricate carvings of vines and flowers wrap around the pillars on the outside in patterns " +
                "closely resembling that of lightning. Closer to center there is a small arch carved with " +
                "breathtaking precision into what seems to be vines covered in thousands of tiny thorns, many of " +
                "them nearly looking as though you might actually be cut if you touched them. \n\n" +
                "You notice various scraps of burnt paper in the fireplace, though you find that they’re all too " +
                "small and seared to properly glean what they might have been. \n\n" +
                "Finally, you turn your attention to the mantel. On either side are rather hefty-looking statues. " +
                "Each depicts a gargoyle, one crouching and the other standing on its hind legs, both snarling out " +
                "at the room. A small matchbox sits beside one of them. It’s open slightly, and you can see that " +
                "there are still a few left in the pack. There’s a part of you that wants to snag them, just in " +
                "case, but you’re not entirely sure what you’d use them for. There’s another part that doesn't " +
                "want to leave any more trace that you were here than you absolutely have to, in case the old " +
                "man notices. You sigh, staring at the matches.\n\n" +
                "Do you take them?\n\n");
        ui.choice1.setVisible(false);
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(true);
        ui.choice5.setVisible(true);

        ui.choice4.setText("Take matches");
        ui.choice5.setText("Leave them there"); //map?? Cat Fight (9)

        game.position4 = "TakeMatches";
        game.position5 = "LeaveThere";
    }

    public void TakeMatches() {
        matches = true;
        ui.mainTextArea.setText("You grab the matches from the mantel and put them in your pocket. You figure " +
                "it can't hurt to take them, and hey, they might come in handy. What's the worst that could " +
                "happen?\n\n");

        ui.choice1.setVisible(false);
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(false);
        ui.choice5.setVisible(true);

        ui.choice5.setText(">");

        game.position5 = "FightScene";
    }

    public void LeaveThere() {
        ui.mainTextArea.setText("You decide to leave them there. It's not like you're going to need to light any " +
                "candles while cheating death.");

        ui.choice1.setVisible(false);
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(false);
        ui.choice5.setVisible(true);

        ui.choice5.setText(">");

        game.position5 = "FightScene";
    }

    //Fight scene in Room 9 before room 10:
    //Beginning of fight scene
    public void FightScene() {
        ui.mainTextArea.setText("Satisfied, you turn back to the rest of the room and notice a door slightly ajar " +
                "on the other side that’s different from the one you entered through. Before you can think too much " +
                "about it, a noise from the cat draws your attention, and you turn to see it staring at you, " +
                "twitching as though it’s in pain. It holds eye contact with you as it gradually begins to wail " +
                "and writhe in agony. You watch as it seems that something begins to move beneath its skin. In an " +
                "almost wave-like motion, its pelt rises and falls in places that it shouldn't.\n\n" +
                "You stare, your body frozen in place, as the cat’s bones begin to grow and its very body begins " +
                "to stretch. Its wails deepen and become almost human-like as its hide disappears into pale, " +
                "humanoid flesh. It unfolds itself, and for a moment, before you stands the butler, suit and all, " +
                "staring at you in agony.\n\n" +
                "He stumbles towards you, gripping your shoulder with fingers that feel more like claws as his " +
                "muscles beneath continue to morph and contort. He pleads with you in a voice that’s only half his " +
                "own, somehow mixed with a low, animalistic growl, “Run!”\n\n" +
                "Just that single word seems to take a world of effort as he releases you and flails backwards, " +
                "growing several feet taller, his hands turning to massive talons as his fur begins to regrow.\n\n" +
                "When he suddenly turns back to you, a ravenousness has taken over his expression, and he lunges.\n\n" +
                "What do you do?\n\n");
        ui.choice1.setVisible(false);
        if(letteropener){
            ui.choice2.setVisible(true);
        }
        else{
            ui.choice2.setVisible(false);
        }
        ui.choice3.setVisible(true);
        ui.choice4.setVisible(true);
        ui.choice5.setVisible(true);

        ui.choice2.setText("Use letter opener");//if true
        ui.choice3.setText("Jump out of the way");
        ui.choice4.setText("Duck down");
        ui.choice5.setText("See map"); //gotta make that

        game.position2 = "UseLetterOpener";
        game.position3 = "JumpOutWay";
        game.position4 = "DuckingDown";
        game.position5 = ""; //TODO add cant see map rn
    }

    //Duck down (pet cat)
    public void DuckingDown() {
        if(pet){
            ui.mainTextArea.setText("You dive down to the ground to avoid the attack, scrambling backwards until you " +
                    "feel the cold wall bump against your back. The monster continues to charge at you, but you " +
                    "notice a jerkiness in its movements, as if he’s trying to hold himself back. He’s almost upon " +
                    "you now. You watch helplessly as he draws back an enormous claw, winding up to strike, and " +
                    "you squeeze your eyes shut as you prepare for the talons to come slicing down on you.\n\n" +
                    "You hear an agonized roar from the creature as the wall behind you shakes.\n\n " +
                    "Your eyes fly open and you find that you’re unscathed. The creature’s claw is lodged in the " +
                    "wall just centimeters above your head, flexing and twitching as if it’s an effort for him " +
                    "to keep it there. \n\n" +
                    "He locks eyes with you, once more managing a tortured yell:\n\n" +
                    " “RUN!”\n\n" +
                    "You nod quickly as you scramble from beneath the hulking creature and bolt towards the open " +
                    "door.\n\n" +
                    "You leap over one of the couches as you hear the wall behind you being torn from itself and " +
                    "the monster manages to dislodge his claws. There’s a thumping as he once more begins to pursue. " +
                    "You’re just a couple feet away from the door now, but he’s right on your heels. You dive into " +
                    "the room and foolishly look behind you to see how close he is.\n\n" +
                    "Then, you stop.\n\n" +
                    "He charges at the room, but is suddenly blown backwards as if he's just run into something. " +
                    "He stands there, panting a minute, before nodding. If you didn’t know any better, you would " +
                    "have thought that he was smiling. You watch as he slowly begins to shrink back into what you " +
                    "assume to be his human form, this time without any of the pain that the transformation " +
                    "caused earlier. Before he’s finished, he turns his head as if he’s just heard something " +
                    "and lumbers away, leaving you alone. Slowly, you walk over and close the door before " +
                    "turning to examine the room you’ve just entered.\n\n");
            ui.choice1.setVisible(false);
            ui.choice2.setVisible(false);
            ui.choice3.setVisible(false);
            ui.choice4.setVisible(false);
            ui.choice5.setVisible(true);

            ui.choice5.setText(">");

            game.position5 = "room10";
        }
        else if(kick){
            ui.mainTextArea.setText("You dive down to the ground to avoid the attack, scrambling backwards until " +
                    "you feel the cold wall bump against your back. The monster, seemingly unshaken by your " +
                    "attempts to run, charges at you with fluid, precise movements. You curl into a ball as he " +
                    "draws back an enormous claw, then your eyes fly open as you feel his sharpened talons dig " +
                    "deep into your body, some going so deep to protrude out through your back. This time, when " +
                    "he draws back his claws, you’re drawn back with them. The pain is blinding as you writhe in " +
                    "vain to try and free yourself. There’s a loud ‘whoosh’ from behind you and the sound of " +
                    "crackling flames before you’re plunged deep into the now-lit fireplace.\n\n" +
                    "He holds his claw in the fire with you as the flames lick at your skin. You scream out, " +
                    "thrashing in agony, the creature curling his claws inwards. You feel as though your flesh " +
                    "is being melted from bone in the flame. Your vision blurs as you feel your consciousness " +
                    "begin to slip. One final burst of agony jolts through you as the beast withdraws its " +
                    "claws from your body, allowing the flames to lap greedily at your now-open wounds. The " +
                    "pain mutes your tortured cries as you lie there, everything slowly fading to an inky " +
                    "black numbness.\n\n\n" +
                    "Would you look at that! You’ve discovered one of the many ways to die in this game! " +
                    "It IS possible to win this game, so feel free to restart and play again, but I suggest next " +
                    "time you refrain from kicking the cat :).\n\n");
            ui.choice1.setVisible(false);
            ui.choice2.setVisible(false);
            ui.choice3.setVisible(false);
            ui.choice4.setVisible(false);
            ui.choice5.setVisible(true);

            ui.choice5.setText(">");

            game.position5 = "theMansion";
        }
        else if (ignore){
            ui.mainTextArea.setText("You dive down to the ground to avoid the attack, scrambling backwards " +
                    "until you feel the cold wall bump against your back. The monster, seemingly unshaken by " +
                    "your attempts to run, charges at you with fluid, precise movements. You curl into a ball " +
                    "as he draws back an enormous claw, then your eyes fly open as you feel his sharpened talons " +
                    "dig deep into your body, some going so deep to protrude out through your back. This time, " +
                    "when he draws back his claws, you’re drawn back with them.\n\n" +
                    "As you’re lifted up to his face, you see immense pain and sadness in his eyes. He growls " +
                    "out something that sounds like an apology before you feel his claws within you tighten into " +
                    "a fist. You manage a single cry of agony, tears flowing down your face as you flail wildly " +
                    "before he slams you down onto the ground and everything goes black. \n\n\n" +
                    "Bummer, man. You’ve found one of the many ways to die in this game! " +
                    "It IS possible to beat this game, though, so if you want, you can restart the game and " +
                    "play again!\n\n");
            ui.choice1.setVisible(false);
            ui.choice2.setVisible(false);
            ui.choice3.setVisible(false);
            ui.choice4.setVisible(false);
            ui.choice5.setVisible(true);

            ui.choice5.setText(">");

            game.position5 = "theMansion";
        }

    }

    //Jump out of the way
    public void JumpOutWay() {
        ui.mainTextArea.setText("You leap to the side, narrowly dodging the blow, and find yourself crashing " +
                "into the bookshelf. The creature pauses a moment, clearly disoriented by the fact that he missed. " +
                "He’s too close for you to run, but perhaps...\n\n" +
                "...Your eyes dart to the shelf covered in books.\n\n" +
                "What do you do?\n\n");
        ui.choice1.setVisible(false);
        ui.choice2.setVisible(true);
        ui.choice3.setVisible(true);
        ui.choice4.setVisible(true);
        ui.choice5.setVisible(false);

        ui.choice2.setText("Try climbing the bookshelf");
        ui.choice3.setText("Throw books at the monster");
        ui.choice4.setText("Start reading spells and pray");

        game.position2 = "ClimbBookshelf";
        game.position3 = "ThrowBooks";
        game.position4 = "GrabABook";
    }

    public void ClimbBookshelf() {
        ui.mainTextArea.setText("You grab hold of the shelf and start attempting to climb it, using each " +
                "level as a rung to step up. You feel your grip beginning to fail as the beast turns to you, " +
                "no longer seeming to rush almost as if he’s watching to see what will happen. By some miracle " +
                "you make it to the top of the bookshelf and crouch there. For a moment, you feel safe atop the " +
                "the tower of books.\n\n" +
                "Then that moment fade.\n\n" +
                "Panic overwhelms you as you realize the monster can still reach you in your crouched position, " +
                "but now you’ve nowhere to go.\n\n" +
                "He reaches up with one claw and easily grabs you, throwing you down onto the ground. You feel " +
                "a shooting pain in the back of your head as it slams against the corner of the coffee table and " +
                "everything goes black. \n\n" +
                "\n" +
                "Oof, my dude. You’ve discovered one of the many ways to die in this game! It IS beatable, so " +
                "if you want, you can restart and try again! Or not, if you’re feeling bad about ultimately " +
                "getting killed by a coffee table.\n\n");
        ui.choice1.setVisible(false);
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(false);
        ui.choice5.setVisible(true);

        ui.choice5.setText(">"); // change transition

        game.position5 = "theMansion"; // DEATH GAME OVER
    }

    //Throw the books (kick cat)
    public void ThrowBooks() {
        if (pet || ignore){
            ui.mainTextArea.setText("You quickly reach back and grab an armful of books from the shelf then " +
                    "begin pelting them at the monster, aiming for his head. This only seems to anger him. " +
                    "He turns to you, eyes flashing with an intense rage as he lunges for you. Unable to run " +
                    "anywhere without risking getting grabbed, you desperately reach for more books from the " +
                    "shelf, feeling for hardcovers. As the monster advances, your hand finds a particularly " +
                    "heavy copy of the complete works of William Shakespeare, and desperately you chuck the " +
                    "book at the creature, praying it hits its mark.\n\n" +
                    "The book flies through the air before nailing the monster on the side of the face and " +
                    "sending him stumbling back. \n\n" +
                    "Relief floods you as you bolt towards the open door on the other side of the room. Without " +
                    "looking back, you run faster than you feel you ever have as you hear an angry growl from " +
                    "behind you.\n\n" +
                    "You’re almost to the door now, but you can feel him on your heels. Desperately, " +
                    "you dive into the other room, falling forward, and try to scramble away.\n\n" +
                    "This is it, you realize. You can’t escape this. \n\n" +
                    "You turn, expecting to see the creature about to seal your fate, but instead, you watch as " +
                    "he comes running at the entrance only to be blown backwards as if by some kind of barrier. " +
                    "He simply stands there a moment, seeming to reorient himself before looking at you from the " +
                    "other side of the doorframe. Is he...nodding? \n\n" +
                    "If you hadn't known any better, you would’ve thought you saw a glimmer of pride in his eyes.\n\n" +
                    "His gaze lingers on you a moment longer before he turns his head as if he’s heard something, " +
                    "then lumbers off. Cautiously, you walk over and close the door before turning to examine " +
                    "the room you’ve just entered.\n\n");
            ui.choice1.setVisible(false);
            ui.choice2.setVisible(false);
            ui.choice3.setVisible(false);
            ui.choice4.setVisible(false);
            ui.choice5.setVisible(true);

            ui.choice5.setText(">");

            game.position5 = "room10";
        }
        else if (kick){
            ui.mainTextArea.setText("You quickly reach back and grab an armful of books from the shelf then " +
                    "begin pelting them at the monster, aiming for his head. This only seems to anger him. He " +
                    "turns to you, eyes flashing with an intense rage as he lunges at you. Unable to run anywhere " +
                    "without risking getting grabbed, you desperately reach for more books from the shelf, " +
                    "feeling for hardcovers.\n\n" +
                    "However, he moves too quickly for you to find another book to throw, and before you know " +
                    "it you’re pinned to the bookshelf with one large claw placed over your abdomen. He reaches " +
                    "up his other paw and gently caresses your face before firmly grabbing it and twisting. " +
                    "You feel your neck crunch, then everything goes black. \n\n\n" +
                    "Ayyyyye you discovered one of the many ways to die in this game! But! It IS beatable, " +
                    "so if you want, you can definitely restart the game and try again! A word of advice though: " +
                    "next time, don’t kick the cat. \n\n");
            ui.choice1.setVisible(false);
            ui.choice2.setVisible(false);
            ui.choice3.setVisible(false);
            ui.choice4.setVisible(false);
            ui.choice5.setVisible(true);

            ui.choice5.setText(">");

            game.position5 = "theMansion";
        }
    }

    public void GrabABook() {
        if(pet){
            ui.mainTextArea.setText("Thinking quickly, you pull a random book off the shelf and flip until you " +
                    "find what looks to be a spell. You’ve always called yourself a skeptic, but considering " +
                    "there’s an 8-foot-tall cat monster attempting to kill you, you decide you can suspend your " +
                    "disbelief for the time being. \n\n" +
                    "Many of the words look like they’re in latin, and you’re not even sure if you’re pronouncing " +
                    "them correctly, but you keep reading in the hopes that something will happen.\n\n" +
                    "You resist the urge to stop as you hear a scream from the creature, focusing solely on " +
                    "getting to the end of the spell. After a moment, you hear a thump onto the ground and a " +
                    "human cough. When you’ve finished, you look up to find the butler crouched over on the ground, " +
                    "panting and coughing as if in pain. \n\n" +
                    "Every logical bone in your body tells you to run, but for some reason you can’t bring " +
                    "yourself to leave him. So instead, you gently approach, crouching down to make sure he’s " +
                    "alright.\n\n" +
                    "He places a hand on your shoulder, still breathing heavily as he almost seems to swallow " +
                    "back tears, \"Thank you,\" he says quietly.\n\n" +
                    "You help him to his feet and he begins shaking his head, \"No,\" he mutters firmly, " +
                    "\"Get out of here. Before I have to change back.\" He points to the door on the other " +
                    "side of the room, \"That room is enchanted with a barrier that I can’t cross. Go in, " +
                    "and you’ll be safe from me,\" he pauses, softening a little, \"I don’t want to hurt you, " +
                    "kid.\"\n\n" +
                    "You nod, turning and running towards the door. \n\n" +
                    "As you turn, you hear his parting words, \"Good luck. Get out of this place if you can.\"\n\n" +
                    "From behind you, you hear the butler begin to transform once more, crying out in pain as " +
                    "his wails turn to growls. Once you’re in the room, you hazard one last glance at his " +
                    "distorted, half-changed form before shutting the door and praying he was right.\n\n");
            ui.choice1.setVisible(false);
            ui.choice2.setVisible(false);
            ui.choice3.setVisible(false);
            ui.choice4.setVisible(false);
            ui.choice5.setVisible(true);

            ui.choice5.setText(">");

            game.position5 = "room10";
        }
        else if (ignore){
            ui.mainTextArea.setText("Thinking quickly, you pull a random book off the shelf and flip until you " +
                    "find what looks to be a spell. You’ve always called yourself a skeptic, but considering there’s " +
                    "an 8-foot-tall cat monster attempting to kill you, you decide you can suspend your disbelief " +
                    "for the time being. \n\n" +
                    "Many of the words look like they’re in latin, and you’re not even sure if you’re pronouncing " +
                    "them correctly, but you keep reading in the hopes that something will happen.\n\n" +
                    "You resist the urge to stop as you hear a scream from the creature, focusing solely on getting " +
                    "to the end of the spell. When you’ve finished, you look up to find the creature frozen " +
                    "mid-lunge, clearly trying to move but completely unable. \n\n" +
                    "Not sure how long the spell lasts, you waste no time bolting into the door on the other side " +
                    "of the room and slamming the door shut. You listen as the spell wears off, expecting the " +
                    "creature to run into the room, but instead you hear him simply lumber out into the hallway. " +
                    "A little confused but ultimately relieved, you turn to examine the room you’ve " +
                    "just entered.\n\n");
            ui.choice1.setVisible(false);
            ui.choice2.setVisible(false);
            ui.choice3.setVisible(false);
            ui.choice4.setVisible(false);
            ui.choice5.setVisible(true);

            ui.choice5.setText(">");

            game.position5 = "room10";
        }
        else if (kick){
            ui.mainTextArea.setText("Thinking quickly, you pull a random book off the shelf and flip until you " +
                    "find what looks to be a spell. You’ve always called yourself a skeptic, but considering " +
                    "there’s an 8-foot-tall cat monster attempting to kill you, you decide you can suspend " +
                    "your disbelief for the time being.\n\n" +
                    "Many of the words look like they’re in latin, and you’re not even sure if you’re " +
                    "pronouncing them correctly, but you keep reading in the hopes that something will happen.\n\n" +
                    "You resist the urge to stop as you hear a scream from the creature, focusing solely on " +
                    "getting to the end of the spell.\n\n" +
                    "When you’re finished reading, however, you look up to find that you have made a grave mistake. " +
                    "Before you stands the beast, but something’s different. It’s taller now, and has to " +
                    "hunch to avoid hitting the ceiling. Its claws are larger, and as it looms over you, it " +
                    "seems to prepare for something. \n\n" +
                    "You watch, frozen with fear, as it draws in a deep breath and slowly spreads its arms. " +
                    "As it does so, you notice its chest beginning to move as well. To stretch. To rip. It " +
                    "only winces as white bone breaks through the fur: ribs, spreading and tearing its sternum " +
                    "until it bursts open, causing the creature to throw its head back in what is either pain " +
                    "or ecstasy. Inside there aren't guts or entrails. It’s just...empty. A void that seems to " +
                    "continue on past the bounds of the monster’s body.\n\n" +
                    "Its head snaps forward and it lets out a loud, bellowing roar. Adrenaline rushes through " +
                    "your veins as your terror is sent into overdrive. Not sure what else you can do, you try " +
                    "to sprint for the door. Perhaps its size has slowed it.\n\n" +
                    "As you try to run, however, you feel something pulling you back. You try to fight against it, " +
                    "but the faster you run the harder it pulls, until suddenly your feet lift from the ground " +
                    "and you fly towards the gaping void. You reach desperately for something - anything - " +
                    "that you can grab onto, but your hands are sweaty from stress and slip from everything you " +
                    "try to grasp onto.\n\n" +
                    "You pass helplessly into the belly of the beast, and watch as its chest closes, blocking out " +
                    "all light as you’re swallowed whole by the void. \n\n" +
                    "\n" +
                    "Yikes! You discovered one of the many ways to die in this game! It IS beatable, so if you want, " +
                    "you can restart and try again. A word of advice before you go though: maybe don’t kick the cat " +
                    "next time. \n\n");
            ui.choice1.setVisible(false);
            ui.choice2.setVisible(false);
            ui.choice3.setVisible(false);
            ui.choice4.setVisible(false);
            ui.choice5.setVisible(true);

            ui.choice5.setText(">");

            game.position5 = "theMansion";
        }
    }

    //Use letter opener (if have)
    public void UseLetterOpener() {
        ui.mainTextArea.setText("Running on instinct, you pull the letter-opener from your pocket and hold it out," +
                " aiming to stab him in the throat when he bends down to claw you. You don't back away as he swings " +
                "his talons at you, instead lunging right back at him and burying the letter opener deep in his " +
                "jugular.\n\n" +
                "You stand there unscathed, panting as you watch him slowly come to the realization that he’s " +
                "been stabbed. You begin to laugh a little as blood spews from his throat. \n\n" +
                "It actually worked! \n\n" +
                "At least...you thought it did. \n\n" +
                "You watch in terror as the creature steadies itself and the letter opener is pulled into its neck " +
                "as the wound closes over. The beast lets out a roar as something travels up its arm and through " +
                "its hand until a sixth claw forms, the letter opener as its nail.\n\n" +
                "Shit.\n\n" +
                "You try to dart beneath the creature and run to safety, but it’s faster than you are, and " +
                "grabs you with its newly six-fingered claw, pulling you back and slicing you through the throat " +
                "with the same letter opener you just used to stab it. You stare in horror, clutching at your " +
                "neck as blood spews from it. He seems to just stand there, watching sadly as you slowly bleed " +
                "until everything goes black.\n\n\n" +
                "Yeah... Maybe the letter opener wasn't the best idea. Nice try though! You’ve discovered one of " +
                "the many ways to die in this game! It IS beatable though, so if you want to get to the end, " +
                "feel free to restart and try again!\n\n" +
                "\n");
        ui.choice1.setVisible(false);
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(false);
        ui.choice5.setVisible(true);

        ui.choice5.setText(">");

        game.position5 = "theMansion"; // death
    }

    //room 10 - chamber (potion room)
    public void room10() {
        ui.mainTextArea.setText("You hear footsteps above you as if the butler has now somehow made his way " +
                "upstairs.\n\n" +
                "Before you is a room filled with shelves of boxes and bottles and potted plants. On the far side of " +
                "the room is a door that seems to go back out to the hallway.\n\n" +
                "In the center is a table, on it a small electric cooktop with an empty cauldron sitting atop it and " +
                "some mini shelving units, also containing a few small bottles. Unlike those on the other shelves, " +
                "however, these are small vials of liquid. \n\n" +
                "One, a purple substance with a faded label, seems to have a slight glow to it. \n\n" +
                "Another, sitting solidly on the table, is a yellow liquid that also seems to glow, but less so. " +
                "Its label is a little easier to read and clearly says in large letters, “PLAN B”.\n\n" +
                "There are two other vials, both filled with clear liquid. \n\n" +
                "One is labeled “Sanitatem” and the other has no label at all.\n\n" +
                "You begin to realize where in the house you are.\n\n" +
                "Usually both this room and the one you were just in are locked tight, and Mallory used to joke " +
                "that this one was the old man’s potion room. Now that you stand here, you’re starting to think " +
                "it wasn’t much of a joke. \n\n" +
                "You glance down at the vials.\n\n" +
                "Part of you can’t help but wonder what would happen if you just...drank one. Or two. " +
                "Or all of them. \n\n" +
                "Do you take a sip?\n\n");
        ui.choice1.setVisible(false);
        ui.choice2.setVisible(true);
        ui.choice3.setVisible(true);
        ui.choice4.setVisible(true);
        ui.choice5.setVisible(true);

        ui.choice2.setText("Drink the purple potion");
        ui.choice3.setText("Drink the yellow potion");
        ui.choice4.setText("Drink the labeled clear potion");
        ui.choice5.setText("Drink the unlabeled clear potion");  //map?? Potion Room (10)

        game.position2 = "purplePotion";
        game.position3 = " yellowPotion";
        game.position4 = "labeledClearPotion";
        game.position5 = "unlabeledClearPotion";

    }

    public void purplePotion() {
        purpPotion = true;
        ui.mainTextArea.setText("You cautiously pick up the glowing vial and look it over, noticing that the " +
                "faded label says \"Aspectum.\" You’re not well-versed in latin by any stretch, but you remember " +
                "a middle school teacher once telling you that that word meant “Sight”. You shrug. Maybe " +
                "it does.\n\n" +
                "Either way, you pop the cork off the vial and drink it down in one swig.\n\n" +
                "It tastes sweet, almost like a plum, and is rather smooth on the way down.\n\n" +
                "You pause.\n\n" +
                "Nothing feels different.\n\n" +
                "Sighing, you turn your attention back to the table and hope that this isn’t some kind of slow " +
                "death potion that you stupidly just drank.\n\n" +
                "It’s when you glance back at the potion table that you notice it. \n\n" +
                "At first, you just see a little movement out of the corner of your eye. But when you look closer, " +
                "you find that in the liquid of the other vials, you can see...something.\n\n" +
                "The old man.\n\n" +
                "You can see the old man walking up a set of stairs. Not any that you’ve ever been on, but the " +
                "wallpaper seems to match that of the stairs going down into the cellar. You attempt to look " +
                "behind and around the vials, but find that the only place you can see this is in the two vials " +
                "of clear liquid. You watch as the old man nearly reaches the top of the stairs then stops " +
                "suddenly. As if he’s forgotten something, he sighs and goes back down. You blink, turning away " +
                "as you stop watching, then begin to laugh a little. Even in as terrifying of a situation as " +
                "you’re in, you have to admit this is pretty cool.\n\n" +
                "You guess aspectum really did mean sight after all.\n\n");
        ui.choice1.setVisible(false);
        if (water){
            ui.choice2.setVisible(false);
        }
        else{
            ui.choice2.setVisible(true);
        }
        if(vodka){
            ui.choice3.setVisible(false);
        }
        else{
            ui.choice3.setVisible(true);
        }
                ui.choice4.setVisible(true);
        ui.choice5.setVisible(true);

        ui.choice2.setText("Drink the unlabeled clear potion");
        ui.choice3.setText("Drink the labeled clear potion");
        ui.choice4.setText("Drink the yellow potion");
        ui.choice5.setText("Leave room"); //map?? Potion Room (10)

        game.position2 = "unlabeledClearPotion";
        game.position3 = "labeledClearPotion";
        game.position4 = "yellowPotion";
        game.position5 = "LeaveRoom10";
    }

    public void yellowPotion() {
        ui.mainTextArea.setText("You pick up the yellow vial, pondering for a moment why it’s labeled the " +
                "way it is before drinking it. \n\n" +
                "Instantly, your insides begin to burn as if someone’s lit a match in your stomach. Your throat " +
                "begins to swell as your knees buckle under you and you fall to the ground, bringing one of " +
                "the small shelves down with you as you grasp at it in a vain attempt to stay standing. \n\n" +
                "Spots form in your vision as it begins to blur.\n\n" +
                "You’re not sure how long you lie there, unable to move or breathe, jerking violently as your " +
                "lungs try to suck in air that isn’t there.\n\n" +
                " You close your eyes as an odd bliss settles over you and your body stops spasming.\n\n" +
                " Sleep.\n\n" +
                " Yes, that’s it. You just need some rest.\n\n" +
                "You allow yourself to drift off into a sleep of inky black, not entirely comprehending " +
                "that it’s one you’ll never wake up from. \n\n" +
                "\n" +
                "You really just drank a random potion in a murderer’s house labeled “PLAN B”, huh? Well, we " +
                "can’t all be the brightest bulbs in the bunch. You, for instance, have discovered one of " +
                "the many ways to die in this game! But, it IS beatable, we promise, so if you want you can " +
                "always restart the game and try again!\n");
        ui.choice1.setVisible(false);
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(false);
        ui.choice5.setVisible(true);

        ui.choice5.setText(">");

        game.position5 = "theMansion"; // DEATH GAME OVER
    }

    public void labeledClearPotion() {
        vodka = true;
        ui.mainTextArea.setText("You pick it up, contemplating the latin labeling before taking a swig. You cringe " +
                "at the taste and it burns as it goes down.\n\n" +
                "Even so, it tastes strangely familiar.\n\n" +
                "Was that...vodka?\n\n" +
                "You sniff the vial. \n\n" +
                "Yup, that was definitely vodka.\n\n" +
                "You stand there a moment, a little dumbfounded that you just took a shot in the middle of a potion" +
                " room before turning back to the other vials. \n\n");
        ui.choice1.setVisible(false);
        if (water){
            ui.choice3.setVisible(false);
        }
        else{
            ui.choice3.setVisible(true);
        }
        if(purpPotion){
            ui.choice2.setVisible(false);
        }
        else{
            ui.choice2.setVisible(true);
        }
        ui.choice4.setVisible(true);
        ui.choice5.setVisible(true);

        ui.choice3.setText("Drink the unlabeled clear potion");
        ui.choice2.setText("Drink the purple potion");
        ui.choice4.setText("Drink the yellow potion");
        ui.choice5.setText("Leave room"); //map?? Potion Room (10)

        game.position3 = "unlabeledClearPotion";
        game.position2 = "purplePotion";
        game.position4 = "yellowPotion";
        game.position5 = "LeaveRoom10";
    }

    public void unlabeledClearPotion() {
        water = true;
        ui.mainTextArea.setText("You pick up the unlabeled vial and glance over it. The fact that it’s unlabeled " +
                "scares you a bit, but after what you just experienced in the other room, you figure it can’t be " +
                "that bad. Shrugging, you uncork it and take a swig.\n\n" +
                "It doesn’t taste like anything, nor does it feel strange at all.\n\n" +
                "If you hadn’t known any better, you would have thought it was water.\n\n" +
                "Shit.\n\n" +
                "Was it poison?\n\n" +
                "You've seen too many spy movies where someone is slipped a tasteless, odorless poison, and in a room " +
                "like this one...\n\n" +
                "Your heartbeat quickens as you pick up the vial and the cork, examining both in a frantic attempt " +
                "to find any hint of what it might be. \n\n" +
                "It’s then that you see it.\n\n" +
                "On the top of the cork is a small label that reads “Water” in plain english. \n\n" +
                "You put the vial down and lean against the table in a combination of relief and embarrassment.\n\n" +
                "It really was just water. \n\n");
        ui.choice1.setVisible(false);
        if (purpPotion){
            ui.choice2.setVisible(false);
        }
        else{
            ui.choice2.setVisible(true);
        }
        if(vodka){
            ui.choice3.setVisible(false);
        }
        else{
            ui.choice3.setVisible(true);
        }
        ui.choice4.setVisible(true);
        ui.choice5.setVisible(true);

        ui.choice2.setText("Drink the purple potion");
        ui.choice3.setText("Drink the labeled clear potion");
        ui.choice4.setText("Drink the yellow potion");
        ui.choice5.setText("Leave room");//map?? Potion Room (10)

        game.position2 = "purplePotion";
        game.position3 = "labeledClearPotion";
        game.position4 = "yellowPotion";
        game.position5 = "LeaveRoom10";
    }

    public void LeaveRoom10() {
        ui.mainTextArea.setText("Finished with the potion table, you make your way over to the door on the far " +
                "side of the room. You know it goes out to the hallway where you almost died, but you’d rather " +
                "go that way and have some hope of getting out than stay in here for the old man to find you. " +
                "You'd also rather stay away from the room where you were just attacked. \n\n" +
                "You pause, listening. \n\n" +
                "It doesn't SOUND like the blades are still swinging.\n\n" +
                "Cautiously, you crack open the door and peek out at the hallway.\n\n" +
                "You were right. The blades now simply hang there limply from ropes. They don’t look nearly as " +
                "ominous now that they’re standing still. \n\n" +
                "You pull the door open and slowly step out into the hallway, hoping to make sure that they " +
                "won’t start moving if you leave the room. Still, they hang there harmlessly, allowing you " +
                "to push them to the side and weave between them. \n\n" +
                "Finally, you reach the stairs. They lead downward into the darkness that you know to be the kitchen. " +
                "You feel a bit of fear bubbling up inside you as you look down the descending corridor." +
                " You know that these stairs will creak when you step on them. \n\n" +
                "Beside them is an open door leading to a bathroom, and on the opposite side of the hall is a boarded " +
                "up door that, after everything that’s happened, you’d like to keep that way. \n\n" +
                "What do you do?\n\n");
        ui.choice1.setVisible(false);
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(true);
        ui.choice5.setVisible(true);

        ui.choice4.setText("Use the bathroom");
        ui.choice5.setText("Go down the stairs"); //map?? Hallway before bathroom (8)

        game.position4 = "goToBathroom";
        if(shoes){
            game.position5 = "withShoes";
        }
        else if(!shoes){
            game.position5 = "withNoShoes";
        }
    }

    public void goToBathroom() {
        ui.mainTextArea.setText("You go into the bathroom and take a much-needed piss before washing your " +
                "hands and heading back out into the hallway.\n\n");

        ui.choice1.setVisible(false);
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(false);
        ui.choice5.setVisible(true);

        ui.choice5.setText("Go downstairs");  //map?? Hallway before bathroom (8)

        if(shoes){
            game.position4 = "withShoes";
        }
        else if (!shoes){
            game.position4= "withNoShoes";
        }

    }

    public void withShoes() {
        ui.mainTextArea.setText("You cautiously step down the stairs, cringing as it squeaks at every step you " +
                "take. The thick bottoms of your sneakers clunk against the wood, making it even louder than it " +
                "already would be without them. Not to mention how dark it is, and how easily you could fall if " +
                "you missed a step. \n\n" +
                "You pause at the first landing, taking a moment to allow yourself to breathe. \n\n" +
                "As you stand there, eyes closed and leaning against the wall, you hear the quiet footsteps " +
                "of slippers on tile.\n\n" +
                "You feel your blood run cold as the realization hits you.\n\n" +
                "The old man is in the kitchen, and he’s heading towards the stairs.\n\n" +
                "You stand there a moment panicking, unsure of what to do. \n\n" +
                "If you try and walk back up the stairs, he’ll definitely hear you. If you go down the stairs, " +
                "not only will he hear you, but he’ll also see you. \n\n" +
                "You resolve to sit there and hopefully wait him out.\n\n" +
                "The slippers pause for a moment at the base of the stairs, and you see the faint shadow of " +
                "the old man cast by the light of the window.\n\n" +
                "“I know you’re up there,” he coos.\n\n" +
                "You feel a lump form in the pit of your stomach as you hear the old man move onto the first step.\n\n" +
                "“I thought I told you to go back to bed.”\n\n" +
                "At this point, you go to run, but when you try to move, you realize that you can’t. It’s not a " +
                "matter of fear or weakness. You physically can’t move.\n\n" +
                "The old man slowly climbs the stairs until he’s reached your landing. Your heart pounds in your " +
                "chest as every muscle in your body begs you to run but in the same breath refuses to do so. \n\n" +
                "The old man clicks his tongue as he runs a hand down your face, \"I’d hoped you would last longer,\" " +
                "he mutters, then laughs quietly, “And to think you might have actually done it if those shoes " +
                "weren't so loud.”\n\n" +
                "He draws in breath through gritted teeth, then snaps his fingers. In an instant, you feel every " +
                "muscle your body give out, and as you crumple to the ground, everything goes black. \n\n" +
                "\n" +
                "Aw man, you were halfway to victory! Instead, you’ve discovered one of the many ways to die in " +
                "this game! It IS beatable, though, we promise, so if you want, you can restart the game and " +
                "try again!\n\n" +
                "\n");
        ui.choice1.setVisible(false);
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(false);
        ui.choice5.setVisible(true);

        ui.choice5.setText(">");

        game.position5 = "theMansion"; // DEATH GAME OVER
    }

    public void withNoShoes() {
        ui.mainTextArea.setText("You slowly make your way down the stairs, cringing at every creak of the steps. " +
                "Even so, your socks manage to muffle the noise of your footsteps, and if you pause for long " +
                "enough between squeaks, you find you’re able to make it sound almost like the natural creaking " +
                "of the old mansion. Unfortunately, it takes you forever to get down the stairs because of it, " +
                "but you figure it’s better safe than sorry.\n\n" +
                "Finally, you make it to the bottom of the stairs and cautiously step out into the kitchen. It’s " +
                "rather dark, but the light from the moon outside is enough to generally let you see. Your " +
                "eyes have become rather accustomed to the darkness at this point anyway.\n\n" +
                "The kitchen is a room that you’ve gotten to know rather well in your time here. It’s small for " +
                "a kitchen in a mansion, but beautiful nonetheless. The dark wooden cabinets look lovely " +
                "alongside the copper appliances and marble countertops.\n\n" +
                "Your mind immediately goes to the knife drawer. Perhaps there’s something in there you could use.\n\n" +
                "Or perhaps you might find something of use in cabinets where the plates and bowls are kept. " +
                "It isn’t likely, but it’s possible.\n\n" +
                "It’s then that you notice a bloody hand print on the handle of the fridge. Did the old man " +
                "really not clean up the blood before getting a midnight snack?\n\n" +
                "You scoff, trying not to think too much about it. If you think about the reason for all the " +
                "blood, it means you have to think about Mallory, and the fact that he’s gone.\n\n" +
                "What do you do?\n\n");
        ui.choice1.setVisible(false);
        ui.choice2.setVisible(true);
        ui.choice3.setVisible(true);
        ui.choice4.setVisible(true);
        ui.choice5.setVisible(true);

        ui.choice2.setText("Search the knife drawer");
        ui.choice3.setText("Check cabinets");
        ui.choice4.setText("Check the fridge");
        ui.choice5.setText("Leave the kitchen"); //map?? Kitchen (11)

        game.position2 = "knifeDrawer";
        game.position3= "CheckCabinets";
        game.position4 = "CheckFridge";
        if(purpPotion){
            game.position5 = "withPotion";
        }
        else if (!purpPotion){
            game.position5 = "withoutPotion";
        }
    }

    public void knifeDrawer() {
        ui.mainTextArea.setText("You quietly make your way over to the knife drawer and slide it open.\n\n" +
                "You know that a knife likely won’t do much to whatever kind of being the old man really is, but " +
                "you also figure it couldn't hurt, right?\n\n" +
                "As you open the drawer, however, you find that it’s empty, despite that  it wasn't empty last " +
                "time you put something in there before heading to bed. You notice a note at the bottom of the " +
                "drawer that reads in large lettering: \n\n" +
                "\"NICE TRY, MALLORY\"\n\n" +
                "You stare at the note for a moment before drawing in a long, shaky breath and closing the " +
                "drawer.\n\n" +
                "You had no idea how meticulously he must have planned for Mallory’s murder.\n\n" +
                "Shaken, you turn back to the room.\n\n");
        ui.choice1.setVisible(false);
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(true);
        ui.choice4.setVisible(true);
        ui.choice5.setVisible(true);

        ui.choice3.setText("Check cabinets");
        ui.choice4.setText("Check the fridge");
        ui.choice5.setText("Leave the kitchen");//map?? Kitchen (11)

        game.position3= "CheckCabinets";
        game.position4 = "CheckFridge";
        if(purpPotion){
            game.position5 = "withPotion";
        }
        else if (!purpPotion){
            game.position5 = "withoutPotion";
        }
    }

    public void CheckCabinets() {
        ui.mainTextArea.setText("You open the cabinets knowing that there probably won’t be much of use in " +
                "them, but figure it can’t hurt to check.\n\n" +
                "You find the usual: plates, cups, bowls, etc. \n\n" +
                "You also find a skull that, up until that point, you had assumed to be decorative. It had been " +
                "there since you moved in, and seeing as the old man seemed to have a taste for morbid decor, " +
                "you hadn't questioned it. Now, though, after everything you’ve seen, you can’t help but wonder " +
                "whether it’s real.\n\n" +
                "It’s not a pure white - rather a dirty yellow that’s darker in some areas. It’s missing a tooth, " +
                "and some of the ones it does have are chipped.\n\n" +
                "The longer you stare at it, the more real it looks, and the more you feel like you’re going to " +
                "be sick. \n\n" +
                "You shake yourself, turning back to the rest of the room.\n\n" +
                "You don’t have time for thoughts like that.\n\n");
        ui.choice1.setVisible(false);
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(true);
        ui.choice4.setVisible(true);
        ui.choice5.setVisible(true);

        ui.choice3.setText("Search the knife drawer");
        ui.choice4.setText("Check the fridge");
        ui.choice5.setText("Leave the kitchen");//map?? Kitchen (11)

        game.position3= "knifeDrawer";
        game.position4 = "CheckFridge";
        if(purpPotion){
            game.position5 = "withPotion";
        }
        else if (!purpPotion){
            game.position5 = "withoutPotion";
        }

    }

    public void CheckFridge() {
        ui.mainTextArea.setText("You cautiously approach the fridge, staring at the bloody handprint. \n\n" +
                "The old man doesn't strike you as the kind to be so careless.\n\n" +
                "You pause a moment, working up the courage to open the fridge door and look inside, terrified " +
                "of what you might find. \n\n" +
                "Finally, drawing in a breath, you open the door. You flinch as the fridge light jars your " +
                "eyes for a moment. You always forget that there’s a light in there.\n\n" +
                "When your eyes adjust, it at first looks as though there’s nothing out of the ordinary. It’s " +
                "the usual food items and milks and cheeses and such. You likely wouldn't have noticed the " +
                "tiny droplets of red around the jar of beet juice if you hadn't been looking. Nor the " +
                "handprint on the outside of it. Nor the thick, partially-congealed droplets overflowing " +
                "from the top despite the lid.\n\n" +
                "You continue to stare at the large glass jar as realization horrifyingly dawns.\n\n" +
                "That’s not beet juice.\n\n" +
                "The thick red substance that he drank with every meal and claimed ‘kept his mind sharp’ was " +
                "not beet juice.\n\n" +
                "It wasn't full when you left the kitchen before going to bed. In fact, it had been running low.\n\n" +
                "You draw in a breath to try to steady yourself. You feel like you’re going to be sick.\n\n" );
        ui.choice1.setVisible(false);
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(true);
        ui.choice4.setVisible(true);
        ui.choice5.setVisible(true);

        ui.choice3.setText("Search the knife drawer");
        ui.choice4.setText("Check the cabinets");
        ui.choice5.setText("Leave the kitchen");//map?? Kitchen (11)

        game.position3= "knifeDrawer";
        game.position4 = "CheckCabinets";
        if(purpPotion){
            game.position5 = "withPotion";
        }
        else if (!purpPotion){
            game.position5 = "withoutPotion";
        }

    }

    //Leave kitchen (no potion)
    public void withoutPotion() {
        ui.mainTextArea.setText("You decide you’ve spent enough time in the kitchen, and begin to make your " +
                "way towards the front entrance. You’re almost out now. All you need to do is get to the main " +
                "door, open it, then run.\n\n" +
                "Quietly as you can, you slowly sneak through the dining room, and past the cellar stairs. As " +
                "you pass, you smell a faint but pungent scent coming from the bottom of the stairs. \n\n" +
                "You clench your jaw and creep past them, praying that the old man stays down there long enough " +
                "for you to escape. \n\n" +
                "Your heart begins to race as you pass the entrance to the living room. You’re almost there. Just " +
                "a few more steps...\n\n" +
                "You stifle a laugh as your palm lands on the handle of the door. Drawing in a breath, you " +
                "unlock the door and push down on the ornate iron handle, preparing to pull it open--\n\n" +
                "\n");
        ui.choice1.setVisible(false);
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(false);
        ui.choice5.setVisible(true);

        ui.choice5.setText(">");

        game.position5 = "noPotionCont";
    }
    public void noPotionCont(){
        ui.mainTextArea.setText("But it doesn’t open.\n\n" +
                "It doesn’t even budge.\n\n" +
                "You begin to frantically tug at the handle, pulling and pushing with all your might.\n\n" +
                "\"No!\" you shout, your anguish overriding all logic\n\n" +
                "You didn’t make it this far only for it to end like this!\n\n" +
                "You don’t notice the quiet steps behind you of slippers on the cellar stairs, nor their " +
                "pitter-patter on the hardwood floor as the old man approaches you. \n\n" +
                "You do, however, notice the slow clapping as the old man patronizingly applauds you, \"Very " +
                "good,\" he coos, \"They almost never make it to the door.\"\n\n" +
                "Your body turns against your will, and in a moment you’re facing the old man.\n\n" +
                "You can still move your arms, but your legs refuse to run. \n\n" +
                "As the old man slowly approaches you, clearly taking his time, you try to think of something - " +
                "anything - you can do to save yourself.\n\n" +
                "\n");
        ui.choice1.setVisible(false);
        ui.choice2.setVisible(false);
        if (littleBook){
            ui.choice3.setVisible(true);
        }
        else if (!littleBook){
            ui.choice3.setVisible(false);
        }

        ui.choice4.setVisible(true);
        ui.choice5.setVisible(true);

        ui.choice3.setText("Use spellbook");
        ui.choice4.setText("Try to punch the old man");
        ui.choice5.setText("Accept your fate"); //map?? Not allowed to look

        game.position3 = "UseSpellBook";
        game.position4 = "PunchOldMan";
        game.position5 = "dontPunch";
    }

    public void dontPunch(){
        ui.mainTextArea.setText("As you watch him approach, however, you realize that there's nothing you can " +
                "do to save yourself.\n\n" +
                "He is some kind of extremely powerful being and you are a measly human who happened to get caught " +
                "up in his perverted game.\n\n" +
                "Perhaps it's better this way, you decide. At least now it'll likely be quick.\n\n"+
                "You hear the stairs squeak as if someone is descending them, and watch as the butler steps out " +
                "from the kitchen with great urgency.\n\n" +
                "For a moment, a part of you begins to hope that he might-- \n\n" +
                "The old man lets out an annoyed sigh, snapping his fingers, “You stay there, Silas.”\n\n" +
                "The butler freezes as the old man continues, “I won’t have your sympathy getting in my way.”\n\n" +
                "The old man turns his attention back to you and places a hand on your cheek, still grinning " +
                "wildly. You watch as he passes his tongue over his teeth, drawing in a hissing breath before " +
                "he snaps his fingers. In an instant your legs buckle under you and you fall to the ground, " +
                "smashing your head on the wall as everything goes black.\n\n" +
                "\n" +
                "Damn, you really just gave up, huh? Now, you’ve discovered one of the many ways to die in this " +
                "game! It IS beatable, so since you’ve already gotten this far, I suggest you restart the game " +
                "and try again! Don't give up, pal!\n\n" +
                "\n");
        ui.choice1.setVisible(false);
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(false);
        ui.choice5.setVisible(true);

        ui.choice5.setText(">");

        game.position5 = "theMansion"; // DEATH GAME OVER
    }
    public void PunchOldMan() {
        ui.mainTextArea.setText("Unsure of what else to do, you wait for the old man to get close as he continues " +
                "rambling about how he had hoped you would “last longer”, as he puts it. \n\n" +
                "When he’s within arms reach, you waste no time raising your fist and swing it at the old man, " +
                "landing squarely on his left eye.\n\n" +
                "He staggers backwards and for a moment, clutching his face, and in an instant you can move " +
                "again. \n\n" +
                "However, triumph is short-lived.\n\n" +
                "As quickly as you regain mobility, you lose it again, and this time your entire body goes " +
                "stiff.\n\n" +
                "The old man, still facing away from you, begins...laughing.\n\n" +
                "It starts out quiet, but grows until it echoes through the otherwise silent halls of the " +
                "mansion.\n\n" +
                "He turns to you, grinning, “You’re going to be fun.”\n\n" +
                "You hear the stairs squeak as if someone is descending them, and watch as the butler steps out " +
                "from the kitchen with great urgency. \n\n" +
                "For a moment, a part of you begins to hope that he might-- \n\n" +
                "The old man lets out an annoyed sigh, snapping his fingers, “You stay there, Silas.”\n\n" +
                "The butler freezes as the old man continues, “I won’t have your sympathy getting in my way.”\n\n" +
                "The old man places a hand on your cheek, still grinning wildly. You watch as he passes his " +
                "tongue over his teeth, drawing in a hissing breath before he snaps his fingers. In an instant " +
                "your legs buckle under you and you fall to the ground, smashing your head on the wall as " +
                "everything goes black.\n\n" +
                "\n" +
                "Close, but no cigar! You’ve instead discovered one of the many ways to die in this game! It " +
                "IS beatable, so since you’ve already gotten this far, I suggest you restart the game and try " +
                "again! Maybe next time, you’ll be able to make it out!\n\n");
        ui.choice1.setVisible(false);
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(false);
        ui.choice5.setVisible(true);

        ui.choice5.setText(">");

        game.position5 = "theMansion"; // DEATH GAME OVER
    }

    public void UseSpellBook() {
        ui.mainTextArea.setText("Suddenly, you remember the pocket guide you found in the room upstairs. " +
                "In a flurry of frantic motion, you quickly grab it from your pocket and open to a random page.\n\n" +
                "\"Invisibility of Sight And Presence\" the header reads. You begin reading the spell aloud as " +
                "fast as you can, throwing pronunciation to the wind.\n\n" +
                "You hear the old man laugh, “That’s adorable. You really think I’d keep a book of spells in " +
                "this house that could harm me?”\n\n" +
                "Your heart begins to race as you finish the first half of the page.\n\n" +
                "\"Go on,\" the old man taunts,\" finish your little incantation. See what it does.\" You " +
                "hear an amused scoff as he seemingly waits for you to finish reading. \n\n" +
                "You can’t hide the smile that creeps across your face as the old man’s pride buys you time.\n\n" +
                "As you say the last word, you watch your body disappear as the old man’s eyes widen. \n\n" +
                "You feel that your legs are able to move again, and quickly you drop the book, unsure if it " +
                "turned invisible with you, bolting past the old man.\n\n" +
                "You’re running on instinct now, and for a moment you simply stand there in the dining room, " +
                "unsure of where to go.\n\n" +
                "Then the stairs catch your eye. \n\n" +
                "You don’t want to go down into the cellar, but you remember the butler saying something about a " +
                "door down there, and perhaps that one might be your ticket out of here. At the very least, " +
                "there’s the possibility that the old man will check upstairs first.\n\n" +
                "Gathering courage, you sprint down the cellar stairs as the old man angrily rounds the corner, " +
                "making surprisingly little noise as you do so. About halfway down the stairs, " +
                "you watch as the invisibility begins to wear off, and you become corporeal again. \n\n");
        ui.choice1.setVisible(false);
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(false);
        ui.choice5.setVisible(true);

        ui.choice5.setText(">");

        game.position5 = "TheCellar";
    }

    //Leave kitchen (potion)
    public void withPotion() {
        ui.mainTextArea.setText("You move to leave the kitchen and head towards the front entrance - to freedom - " +
                "when your eye catches something in the decorative mirror on the wall. It’s an image of the old " +
                "man, stepping up from the cellar stairs in the dining room and turning towards the kitchen.\n\n" +
                "You hear your heart begin to pound in your chest as you see his shadow advancing down the hallway. " +
                "Desperately, you glance around the room for a place to hide.\n\n" +
                "The pantry is definitely big enough for you to fit and closes rather silently, but it’s also a " +
                "pretty obvious hiding spot. \n\n" +
                "You could also try hiding in the cupboard under the sink, but you’re honestly not sure if " +
                "you’ll be able to fit.\n\n" +
                "You hear him approaching and realize you need to make a decision - now. \n\n" +
                "What do you do?");
        ui.choice1.setVisible(false);
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(true);
        ui.choice5.setVisible(true);

        ui.choice4.setText("Hide in the cupboard");
        ui.choice5.setText("Hide in the pantry"); //map?? Not allowed to look

        game.position4 = "HideInCupboard"; // DEATH GAME OVER
        game.position5 = "HideInPantry";
    }

    //Hide in the cupboard
    public void HideInCupboard() {
        ui.mainTextArea.setText("You crouch down and try to squeeze yourself into the cupboard, but it’s a " +
                "much tighter fit than you expected. You can get the left half of your body in, but you " +
                "can’t seem to scrunch down enough to get your head inside, which is a problem.\n\n" +
                "You watch fearfully as the old man enters the room as you sit there, only half inside your " +
                "hiding spot. \n\n" +
                "He stops, looking directly at you and laughing, “I see you're not one for hide and seek.”\n\n" +
                "You feel your muscles tighten against your will, and your body begins to stand.\n\n" +
                "Once you’re on your feet, the old man smiles. With a flick of his hand, your neck dislodges " +
                "from your spine and everything goes black.\n\n" +
                "\n" +
                "Yeah, maybe next time try hiding somewhere you know you can fit. But on the bright side, you’ve " +
                "discovered one of the many ways to die in this game! It IS possible to beat it, though, so if " +
                "you want you can restart the game and try again!\n\n");
        ui.choice1.setVisible(false);
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(false);
        ui.choice5.setVisible(true);

        ui.choice5.setText(">");

        game.position5 = "theMansion"; // DEATH GAME OVER
    }

    //Hide in the pantry
    public void HideInPantry() {
        ui.mainTextArea.setText("You tiptoe into the pantry and close it as silently as possible. There’s a knob " +
                "on both sides of the door, so doing so is rather easy. You sit there, breathing heavily among " +
                "the snacks and dry goods, praying that he doesn't find you.\n\n" +
                "Light begins to flood under the crack between the door and the tile as the old man flicks " +
                "on the kitchen light.\n\n" +
                "His shadow passes under the door as well, and at first you think he’s going to the fridge, " +
                "seeing as it’s right in front of the pantry.\n\n " +
                "But there is no sound of the fridge opening.\n\n" +
                "Instead, the shadow simply stops in front of the pantry.\n\n" +
                "You can hear him breathing on the other side of the door, and you do your best to muffle your " +
                "own panicked breaths. Your heart pounds so loudly in your chest that part of you is scared " +
                "he’ll hear. \n\n" +
                "You hear the jingle of knob, and watch as it slowly starts to turn.\n\n" +
                "You close your eyes, trying to hold back tears as you will the knob to stop turning.\n\n" +
                "And then suddenly there’s the sound of the knob snapping back into place as your eyes fly back " +
                "open. The door is still closed. \n\n" +
                "There’s a thump from upstairs, and you watch as the old man’s shadow quickly turns, then the " +
                "stairs begin to creak as he presumably climbs them, flicking off the light as he leaves.\n\n" +
                "You wait a moment to be sure he’s gone before opening the pantry door ever so slightly and " +
                "peeking out, still somewhat in disbelief that you weren't found.  \n\n" +
                "Slowly you make your way out of the kitchen and start heading towards the door to the front " +
                "entrance.");
        ui.choice1.setVisible(false);
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(false);
        ui.choice5.setVisible(true);

        ui.choice5.setText(">");

        game.position5 = "pantryCont";
    }

    public void hideInPantryCont(){
        ui.mainTextArea.setText("Just as you begin to creep through the dining room, however, you hear a squeak " +
                "from the stairs and realize that the old man is coming back down. \n\n" +
                "For a moment, you freeze. \n\n" +
                "You know you won’t be able to make it all the way down the hallway to the door without him " +
                "catching you. Not when you’re still this close to the kitchen. What’s more, you’re not about " +
                "to test your luck hiding a second time. Not that there’s really anywhere you could hide in the " +
                "dining room anyway.\n\n" +
                "Desperate, your attention turns to the cellar stairs. You know that there’s also a door at the " +
                "back of the cellar, and those stairs don’t creak.\n\n" +
                "Drawing in a breath, you hazard one last glance towards the kitchen.\n\n" +
                "Here goes nothing.\n\n" +
                "With that, you descend the darkened stairs down to the cellar.");
        ui.choice1.setVisible(false);
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(false);
        ui.choice5.setVisible(true);

        ui.choice5.setText(">");

        game.position5 = "TheCellar";
    }

    //TheCellar
    public void TheCellar() {
        ui.mainTextArea.setText("You’re immediately hit with the pungent smell of rotting flesh as you make your way down into the cellar," +
                " and deeper you go, the stronger it gets.  " +
                "By the time you’re finally at the base of the stairs, " +
                "your eyes have begun to water and your stomach has begun to churn from the smell. \n\n" +
                "As you step onto the floor from the bottom stair, you feel something thick begin to soak into your socks, " +
                "and when you look down you find yourself standing in a dark, sticky puddle that smells of iron and rot. \n\n" +
                "When you turn your head, you have to force back a scream of terror as you realize you’re standing " +
                "beside a row of corpses hung upidedown along the wall. " +
                "In various stages of decay, they hang there, their throats slit like pigs hung to bleed. \n\n" +
                "Trying not to comprehend the sight before you, you instead try to keep walking." +
                " On the other side of the cellar, you can see a door with a window filtering in the pre-dawn light from outside. " +
                "If you can just make it across...\n\n" +
                "Suddenly, your feet hit something on the floor. " +
                "It feels somehow solid and squishy at the same time. Without thinking, you look down. \n\n" +
                "Your breath catches in your chest. A pair of dead, cold eyes look back at you from Mallory’s pale corpse. " +
                "You begin to shake as you stare at the body of the boy at your feet." +
                " He doesn't look like himself. His skin looks almost blue and leathery. " +
                "At least, the bits of skin you can see." +
                " Most of him is covered in what you assume to be his own blood," +
                " so drenched that it still seems to drip from him onto the ground despite having been bled hours ago. " +
                "He stares up at you with wide, horrified eyes, his final expression of pure fear and pain forever frozen on his death-bloated face.\n\n" +
                "It takes everything in your power to not fall to your knees and sob over the boy, " +
                "but you know you have to keep moving. " +
                "Reluctantly, you step over his body and continue on over dozens of other corpses who you don’t" +
                " recognize as you make your way towards the door.\n\n" +
                "It’s then that you hear the old man coming down the stairs.\n\n " +
                "You glance at the door. " +
                "You’re not sure if you could make it, but you sure could try.\n\n" +
                "\n");
        ui.choice1.setVisible(false);
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(true);
        ui.choice5.setVisible(true);

        ui.choice4.setText("Hide among the bodies");
        ui.choice5.setText("Run for the door"); //map?? Cellar (1)

        game.position4 = "HideAmongTheBodies";
        game.position5 = "RunForTheDoor";
    }

    public void RunForTheDoor() {
        ui.mainTextArea.setText("You decide that you’re willing to take your chances as you bolt for the door. " +
                "You’ve still got nearly half the cellar to traverse, but you don’t care." +
                " You sprint over the bodies, which squish and crunch beneath your feet. " +
                "The door is just a few feet away now, and you just need to--\n\n" +
                "Suddenly, your body just...stops. " +
                "Your limbs freeze, then draw themselves back until you’re standing there with your legs together. " +
                "Then, your legs begin to move against your will, turning you around until you’re facing back towards where you came from.\n\n" +
                "There stands the old man, a single hand extended with his fingers moving delicately as he puppeteers your body.\n\n" +
                "You hear him begin to laugh as your legs start to move and slowly carry you towards him.\n\n" +
                "\n");
        ui.choice1.setVisible(false);
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(false);
        ui.choice5.setVisible(true);

        ui.choice5.setText(">");
        //TODO: make this a big if-statement for the possible endings
        if(!matches && !pet){
            game.position5 = "noMatchesOrPets";//death
        }
        else if (matches){
            game.position5 = "matches";
        }
        else if (pet){
            game.position5 = "petCat1";
        }

    }

    public void HideAmongTheBodies() {
        ui.mainTextArea.setText("You shake your head. " +
                "You couldn't make it that far that quickly. " +
                "So, instead, despite every natural instinct screaming for you to do the opposite," +
                " you take a few more steps then lay down among the corpses. \n\n" +
                "The smell is overwhelming, but it’s the texture that makes your hair raise. " +
                "The bodies closer to the door where you are have clearly been here longer, " +
                "and have begun to be much more...gelatinous than the ones near the front. \n\n" +
                "You nearly puke as you lay your head down among the filth and close your eyes, praying that he won’t notice you.\n\n" +
                "You listen as he steps down into the cellar onto the sticky puddle at the base of the stairs," +
                " and you hear him calling for you, \"Come out, come out,\" he coos, \"I know you’re down here.\"\n\n" +
                "You stay completely still as your heart pounds in your chest. \n\n" +
                "\"I can hear you breathing,\" he calls.\n\n" +
                "Suddenly, against your will, your limbs start...moving. " +
                "You try to stop them but your arms begin to prop you up and your legs begin to stand until " +
                "you’re fully on your feet, staring at the old man from across the room.\n\n" +
                "\"There you are,\" he says with sickening sweetness, \"I was beginning to think I’d lost you.\"\n\n" +
                "You regain control of your arms, but still your legs insist on moving forwards, and slowly you begin to walk towards the old man.\n\n");
        ui.choice1.setVisible(false);
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(false);
        ui.choice5.setVisible(true);

        ui.choice5.setText(">"); //map?? Cellar (2)
        //TODO: make this a big if-statement for the possible endings
        if(!matches && !pet){
            game.position5 = "noMatchesOrPets";//death
        }
        else if (matches){
            game.position5 = "matches";
        }
        else if (pet){
            game.position5 = "petCat1";
        }
    }

    public void noMatchesOrPets() {
        ui.mainTextArea.setText("\"You know,\" the old man begins, \"In all my 300 years, I’ve never had one escape. Not one!\"\n\n" +
                "Your legs continue to walk towards the old man, stepping on and over the corpses of " +
                "the old man’s past victims. You watch helplessly as his extended fingers move" +
                " rhythmically with every step you take, pulling you ever-closer.\n\n");
        ui.choice1.setVisible(false);
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(true);
        ui.choice4.setVisible(true);
        ui.choice5.setVisible(true);

        ui.choice5.setText("Try to fight against it");

        game.position5 = "Fight1";
    }

    public void Fight1() {
        ui.mainTextArea.setText("You struggle to regain control of your limbs, " +
                "but they continue to move despite your every attempt to make them stop.\n\n" +
                "“To think, someone as insignificant you might have actually broken my streak,” he laughs.\n\n" +
                "As he does, he begins to move his fingers less methodically, " +
                "jerking your legs painfully as you continue to walk.\n\n" +
                "“I have to give you credit: you were by far the most exhilarating kill I’ve had in quite a long time.”\n" +
                "\n");
        ui.choice1.setVisible(false);
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(false);
        ui.choice5.setVisible(true);

        ui.choice5.setText("Keep trying to fight");

        game.position1 = "Fight2";
    }

    public void Fight2() {
        ui.mainTextArea.setText("You begin to grab and claw at your legs, hoping that your own " +
                "physical force might be enough to make it stop, but still they continue.\n\n" +
                "\"You know, I don’t usually remember the people I use to feed. " +
                "Not very well, anyway. But you,\" he grins, \"I don’t see myself forgetting you for the next century at least.\"\n\n" +
                "You’re getting closer to the old man, and no matter what you do, you can’t seem to break the spell.\n\n" +
                " \n");
        ui.choice1.setVisible(false);
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(false);
        ui.choice5.setVisible(true);

        ui.choice5.setText("Keep fighting");

        game.position5 = "Fight3"; // DEATH GAME OVER
    }

    public void Fight3() {
        ui.mainTextArea.setText("You’re just a few feet away from him now, and as you struggle," +
                " you begin to cry out both in frustration and in some vain attempt to beg for your life.\n\n" +
                "The old man simply chuckles, continuing to pull you towards him, \"Do you know how I came to be like this?\"" +
                " he asks, reaching up his free hand to caress your face, " +
                "\"I killed my best friend, and drank his blood on the floor of a church; I still have his portrait hanging in my house,\"" +
                " he grins, holding your chin so you have no choice but to look into his eyes, \"Your pleas mean nothing to me.\"\n\n" +
                "With that, he withdraws his hand from your face and reaches into his robe." +
                " Before you can even process what he’s grabbed, he slices something over your throat and blood begins spewing outward. " +
                "You simply stare at him in horror before you fall to your knees, then everything goes black. \n\n\n" +
                "Arrrggg you almost made it! So close! This game IS beatable, so since you made it this far you might as well restart and try again! " +
                "Perhaps if you make some different choices, things will turn out better?\n\n");
        ui.choice1.setVisible(false);
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(false);
        ui.choice5.setVisible(true);

        ui.choice5.setText(">");

        game.position5 = "theMansion"; // DEATH GAME OVER
    }

    //Matches ending
    public void ifMatches() {
        ui.mainTextArea.setText("“You know,” the old man begins, “In all my 300 years, I’ve never had one escape. Not one. Of all of them, though, you’ve gotten the closest.”\\n\\n\n" +
                "Your legs continue to walk towards the old man, stepping on and over the corpses of the old man’s past victims. You watch helplessly as his extended fingers move rhythmically with every step you take, pulling you ever closer.\\n\\n\n" +
                "As you struggle, your hand brushes your pocket and you feel a small box.\\n\\n\n" +
                "The matches.\\n\\n\n" +
                "You’d nearly forgotten that you’d taken them with you, but now, as you’re pulled inevitably towards your death, you wonder whether they might be of some use. \\n\\n\n" +
                "What do you do?\\n\\n\n");
        ui.choice1.setVisible(false);
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(false);
        ui.choice5.setVisible(true);

        ui.choice5.setText("Try to use the matches");

        game.position5 = "theMansion"; // DEATH GAME OVER
    }

    //Try to use the matches
    public void tryMatches() {
        ui.mainTextArea.setText("As you struggle to regain control of your limbs, you reach into your pocket and pull out the matchbox.\\n\\n\n" +
                "There aren’t very many inside, but if you do this right, you’ll only need one.\\n\\n\n" +
                "Fumbling, you take one out of the box and attempt to strike it. It breaks.\\n\\n\n" +
                "“To think, someone as insignificant you might have actually broken my streak,” he laughs.\\n\\n\n" +
                "As he does, he begins to move his fingers less methodically, jerking your legs painfully as you continue to walk.\\n\\n\n" +
                "“I have to give you credit: you were by far the most exhilarating kill I’ve had in quite a long time,” he continues to chuckle, “I’d almost forgotten the thrill of the hunt.”\\n\\n\n" +
                "\n");
        ui.choice1.setVisible(false);
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(true);
        ui.choice5.setVisible(true);

        ui.choice4.setText("lit matches"); //Give in (1)
        ui.choice5.setText("Try again (1)");

        game.position4 = "litMatches"; // DEATH GAME OVER
        game.position5 = ""; //???
    }

    //pet cat ending
    public void petCatEnding1(){

    }

    public void petCatEnding2(){

    }

    public void petCatEnding3(){

    }

    public void petCatEnding4(){

    }


    //Run through hall
    public void RunThruHall() {
        ui.mainTextArea.setText("Death by blade");

        ui.choice1.setVisible(false);
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(false);
        ui.choice5.setVisible(true);

        ui.choice5.setText(">");

        game.position5 = "theMansion"; // DEATH GAME OVER
    }

    //room 9 - chamber (butler fight scene)
    public void room9Fight(){
        ui.mainTextArea.setText("Bye!");

        ui.choice1.setVisible(false);
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(false);
        ui.choice5.setVisible(true);

        ui.choice5.setText(">");

        game.position5 = "theMansion";
    }

    //room 8 - hallway/stairway (no method for bathroom, just display)
    public void room8() {
        ui.mainTextArea.setText("Bye!");

        ui.choice1.setVisible(false);
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(false);
        ui.choice5.setVisible(true);

        ui.choice5.setText(">");

        game.position5 = "theMansion";
    }

    /*********** FLOOR THREE *************/
    //room 11 - kitchen
    public void room11() {
        ui.mainTextArea.setText("Bye!");
        ui.choice1.setText(">");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");
        ui.choice5.setText("");

        game.position1 = "theMansion";
        game.position2= "";
        game.position3 = "";
        game.position4 = "";
        game.position5 = "";
    }
    

    //hide from old man - crosses rooms, lots of booleans for if potion or spell book
    public void hideFromMan() {
        ui.mainTextArea.setText("Bye!");
        ui.choice1.setText(">");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");
        ui.choice5.setText("");

        game.position1 = "theMansion";
        game.position2= "";
        game.position3 = "";
        game.position4 = "";
        game.position5 = "";
    }

    /*********** CELLAR *************/
    public void cellar() {
        ui.mainTextArea.setText("Bye!");
        ui.choice1.setText(">");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");
        ui.choice5.setText("");

        game.position1 = "theMansion";
        game.position2= "";
        game.position3 = "";
        game.position4 = "";
        game.position5 = "";
    }

    //general (if not matches or pet cat - catch all)
    public void generalCellar() {
        ui.mainTextArea.setText("Bye!");
        ui.choice1.setText(">");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");
        ui.choice5.setText("");

        game.position1 = "theMansion";
        game.position2= "";
        game.position3 = "";
        game.position4 = "";
        game.position5 = "";
    }

    //if matches
    public void matchesCellar() {
        ui.mainTextArea.setText("Bye!");
        ui.choice1.setText(">");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");
        ui.choice5.setText("");

        game.position1 = "theMansion";
        game.position2= "";
        game.position3 = "";
        game.position4 = "";
        game.position5 = "";
    }

    //if pet cat
    public void petCatCellar() {
        ui.mainTextArea.setText("Bye!");
        ui.choice1.setText(">");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");
        ui.choice5.setText("");

        game.position1 = "theMansion";
        game.position2= "";
        game.position3 = "";
        game.position4 = "";
        game.position5 = "";
    }

    public void Ending() {
        ui.mainTextArea.setText("Bye!");
        ui.choice1.setVisible(false);
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(false);
        ui.choice5.setVisible(false);

        game.position1 = "theMansion";
        game.position2 = "";
        game.position3 = "";
        game.position4 = "";
        game.position5 = "";
    }

    public void toTitle() {

        m.showTitleScreen();

        ui.mainTextArea.setText("Bye!");
        ui.choice1.setVisible(false);
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(false);
        ui.choice5.setVisible(false);

        game.position1 = "theMansion";
        game.position2= "";
        game.position3 = "";
        game.position4 = "";
        game.position5 = "";
    }
}