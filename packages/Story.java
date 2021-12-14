package packages;

import packages2.Book;

public class Story {
    // Handle all the dialogues
    // Uses calling from the UI class, map class, Game class,
    Game game;
    UI ui;
    map m;
    PlayPlayer use = new PlayPlayer();

    // Constructor instantiate
    public Story(Game g,UI userInterface, map mDisplay){
        game = g;
        ui = userInterface;
        m = mDisplay;
    }

    // set default values for the player
    public void defaultSetup(){
        use.currWeapon = new Book();
        ui.weaponName.setText(use.currWeapon.name);
    }

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
            case "shakeHand": shakeHand(); break;
            case "sitNxtToOldman": sitNxtToOldman(); break;
            case "sitNxtMallory": sitNxtMallory(); break;
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
            case "standStill": standStill();
            case "offerToHelp": offerToHelp(); break;
            case "awkMoment": awkMoment(); break;
            case "startPlot": startPlot(); break;
            case "room1": room1(); break;
            case "backSleep": backSleep(); break;
            case "searchFloor": searchFloor(); break;
            case "tryDoor": tryDoor(); break;
            case "tryBedroomOnleft": tryBedroomOnleft(); break;
            case "downstairs": downstairs(); break;
            case "TryDoorAhead": TryDoorAhead(); break;
            case "MalloryRoom":MalloryRoom(); break;
            case "SearchBed": SearchBed(); break;
            case "SearchCloset": SearchCloset(); break;
            case "Shoes": Shoes();break;
            case "PutOnShoes": PutOnShoes(); break;
            case "NotPutOnShoes": NotPutOnShoes();break;
            case "Coat": Coat(); break;
            case "PutOnCoat": PutOnCoat(); break;
            case "NotPutOnCoat": NotPutOnCoat();break;
            case "LeaveCloset": LeaveCloset();break;
            case "SearchDesk": SearchDesk();break;
            case "ExamineBook": ExamineBook(); break;
            case "ExaminePicture": ExaminePicture(); break;
            case "LeaveDesk": LeaveDesk(); break;
            case "LeaveRoom": LeaveRoom();break;
            case "room5": room5(); break;
            case "Run": Run();break;
            case "DuckDown": DuckDown();break;
            case "KickCat": KickCat(); break;
            case "IgnoreCat": IgnoreCat();break;
            case "PetCat": PetCat(); break;
            case "RunThruHall": RunThruHall(); break;
        }

    }
    public void theMansion() {
        ui.mainTextArea.setText("Sinister Happenings at Huxley Manor\n\n" + "This game contains themes gore, violence, and manipulation/mind control.\n\n" +
                "Enter at your own risk...\n\n" +
                "Before goosebumps plague your arms and your eyes cannot be ripped away from the screen, " + "here are some things to know about our spooky little game:\n\n" +
                "This is a text-based game, so there are very little graphics. If you don’t like reading, " + "sorry bud, this isn’t the game for you. We want to let our words guide your " +
                "imagination, and we figure you know how to scare yourself better than we ever " + "could.\n\nThis is also a choose-your-own-adventure game, so you will read the story and " +
                "choose from a handful of actions at specific moments to determine what happens next. Some " + "of these options will allow you to continue through the escape, but some may result " +
                "in death. Choose wisely and you might make it out alive.\n\n" +
                "To select an option, type the number on your keyboard and hit enter. Also, some " + "sections of the story are longer than others, so you may need to hit enter to " +
                "continue reading.\n\n" +
                "The one graphic you do get to reap the benefits of is a map. You can pull up this " + "map during given opportunities by typing 0 and hitting enter.\n\n" +
                "We hope you enjoy, good luck, and don’t kick the cat.\n\n" +
                "The devious minds behind the code.\n\nPlease choose an option:");
        ui.choice1.setText("Begin game");
        ui.choice2.setText("Exit the game");
        ui.choice3.setText("");
        ui.choice4.setText("");

        //after displaying these text... we are going to set a parameter for each bottom
        //declared in Game class
        //access game class
        //Tell the program what is the next position

        game.position1 = "towardsMansion"; //Continue to game
        game.position2= "ExitGame";
        game.position3 = "";
        game.position4 = "";

    }
    public void towardsMansion(){
        ui.mainTextArea.setText("Welcome! The man’s hand feels heavy on your back as you are guided up the driveway " +
                "against your better judgement. A large mansion  - which you’re quite sure is the only " +
                "dwelling for miles in this area - looms before you, decorated impeccably for " +
                "Halloween. Cornstalks lean up against the pillars supporting the upper balconies, " +
                "pumpkins and hay bales are scattered tastefully over the front porch, and a black " +
                "cat sits somewhat ominously in the window by the door - though you’re sure that the " +
                "cat is more of a year-round affair.\n\n" +
                "You stop a moment, simply staring and struggling to take in the fact that this is all " +
                "real. Less than an hour ago, you had been on the streets, trying to scrounge whatever " +
                "money you could to save up for a proper coat for the coming winter. Less than an " +
                "hour ago, an old man whose name you still don’t know had offered you a job and " +
                "housing with the only condition being that you came to live with him in his " +
                "\"humble manor,\" as he had called it. Less than an hour ago, against your better " +
                "judgement and with nothing but your life to lose, you had said yes. \n\n" +
                "You’re not sure why you’d said yes. You know that you’re what they call \"high risk\". " +
                "You know that a man like this has the money to cover up your disappearance if it gets " +
                "noticed. Hell, when you’d asked his name, the man had simply stated, \"Names are " +
                "unimportant,\" before ushering you into his car. But something deep within you," +
                " a gut feeling , told you that this was the right move, and that " +
                "going with him wouldn't be so bad.\n\n" +
                "\"It’s beautiful, isn’t it?\" The old man’s question snaps you back to the present. \n\n" +
                "\"Yes,\" you mutter quietly, too awestruck to properly compliment the place.\n\n" +
                "The old man smiles, \"Welcome to Huxley Manor,\" he says with a sweeping gesture before " +
                "guiding you to the thick oaken front door.\n\n");
        ui.choice1.setText("Go inside");
        ui.choice2.setText("Leave");
        ui.choice3.setText("");
        ui.choice4.setText("");


        game.position1 = "GoInsideMansion";
        game.position2= "leaveMansion";
        game.position3 = "";
        game.position4 = "";

    }

    public void ExitGame(){

        ui.mainTextArea.setText("Bye!");
        ui.choice1.setText(">");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.position1 = "toTheMansion";
        game.position2= "";
        game.position3 = "";
        game.position4 = "";
    }

    public void GoInsideMansion(){
        ui.mainTextArea.setText("The old man claps twice and the doors slowly creak open to reveal an ornate "
                + "hallway with beautiful vintage-looking wallpaper and dark wooden floors. \n\nAs he guides you "
                + "through, you notice dozens of oil paintings, all of which look to be extremely old. A\n"
                + "painting of a man in what looks to be renaissance garb, staring intensely outward with long black hair \ncatches your eye."
                + "\n\nThe cat brushes past you, pulling your attention away from the painting, and you look down \n"
                + "to see that you’re walking past a staircase to what you assume is the basement. The stairs,\n"
                + "though still beautiful, are clearly not as well-kept as the rest of the house, and the walls\n"
                + "seem to get dustier the further down they go. There’s a part of you that wonders what’s down\n"
                + "there - what secrets this mansion might hide.\n");
        ui.choice1.setText("Ask about the painting.");
        ui.choice2.setText("Ask about the stairs");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.position1 = "painting";
        game.position2= "stairs";
        game.position3 = "";
        game.position4 = "";

    }
    public void leaveMansion(){
        ui.mainTextArea.setText("The thought crosses your mind to turn back, but you decide against it.");
        ui.choice1.setText(">");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.position1 = "towardsMansion";
        game.position2= "";
        game.position3 = "";
        game.position4 = "";

    }
    public void painting(){
        ui.mainTextArea.setText("The old man smiles as he turns to the portrait, an odd sentimentality washing " +
                "over him.\n\n" +
                "\"He was a very good friend of mine.\" he sighs, clearly beginning to reminisce, " +
                "\"He had this commissioned shortly before he-"+ " "+ "The old man stops, taking a moment to collect himself before continuing, \"He passed " +
                "\nshortly after this was painted,\" he huffs distantly. \"If it weren't for him, none " +
                "of this would have been \npossible,\" the man gestures to the mansion around him.\n\n" +
                "You nod solemnly. There’s a part of you that wonders how he died so young - he couldn't " +
                "have been more \nthan 30 in the picture - and what he did to help the old man. Even so, " +
                "you know better than to ask. If he had wanted to say, he would have. The old man lingers " +
                "on the painting a moment more, his smile widening, \nbefore seeming to snap back to the present and " +
                "guiding you into the dining room.\n\n" +
                "You enter to see a boy who couldn't be more than 19 or 20 setting the table. \n\n" +
                "The old man snaps his fingers and the boy is suddenly at attention, nearly dropping the plates\n\n" +
                "'This is Mallory,' the old man says, 'I found him in much the same situation I found you, and he’s " +
                "been living and working here until he finds his feet, isn’t that right Mallory?'\n\n" +
                "Mallory nods nervously, 'Yes, sir.'\n\n" +
                "The old man laughs and jovially clasps a hand on Mallory’s shoulder, 'He’s a bit shy, but he’ll \nwarm up to you in no time,' he remarks.\n\n" +
                "Mallory smiles at you, nodding more genuinely this time, before the old man says something about \nallowing you to get acquainted before" +
                " going into the kitchen and leaving the two of you alone.\n\n" +
                "Mallory’s gaze seems to linger on you a moment before going back to his task, and though on the \nsurface he " +
                "seems genuinely happy to meet you, there is also an almost mournful disposition \nunderneath it all. \n\n");

        ui.choice1.setText("Ask how he likes working here");
        ui.choice2.setText("Offer to help set the table");
        ui.choice3.setText("Stand there awkwardly");
        ui.choice4.setText("");

        game.position1 = "askMallory";
        game.position2= "offerToHelp";
        game.position3 = "awkMoment";
        game.position4 = "";
    }
    public void askMallory(){
        ui.mainTextArea.setText("Mallory smiles dryly, and you suddenly notice exactly how tired he is, the bags under his eyes being heavy \nand " +
                "thick. Too heavy for someone his age.\n\n" +
                "He locks eye contact with you, his gaze requesting that you hold it as he speaks, 'I wouldn't trade working \nhere for the world!" +
                " I love the work I do, and he’s been extremely generous to let me stay here while I save up to get a place of my own.'\n\n" +
                "Despite the cheery tone, you feel a shiver of unease run down your spine as he talks. The words he’s saying \nare loud and " +
                "enthusiastic, and if the only thing in this interaction had been his voice, you may have actually \nbelieved him. But his eyes, " +
                "which have not faltered since locking with yours… " +
                "God, his eyes... " +
                "They tell a \ndifferent story entirely. As he speaks, his brows knit together in a look of pain, despair, and exhaustion. " +
                "\nRegret drips from every movement he makes as he shakes his head while discussing the old \nman’s 'generosity.'\n\n" +
                "When he’s finished speaking, Mallory’s expression quickly switches to a smile, and he goes back to his work as if nothing happened." +
                "You simply stand there, watching him in bewilderment, completely unsure of how to respond. Either Mallory always talks with his facial" +
                "expressions wildly mismatching his words, or he was \ntrying to warn you of something. Or perhaps, you’ve misinterpreted the" +
                "interaction entirely. " +
                "You glance \naround the dining room, with its chandelier hanging from the ceiling and ornate wallpaper smoothly \ncovering its " +
                "walls. As Mallory sets the antique wooden table you notice its intricately-carved embellishments curling over each corner as " +
                "if it were being held up by many human hands. Why would a man like him help a person like you? What motivation could someone of this caliber " +
                "have for altruism? \n\n" +
                "You shake your head. This man was willing to help you when no one else would, and if he plans to exploit \nyou, at the very least" +
                "you’ll have a roof over your head. At worst, you figure you could live here until things get bad. Besides, it’s not like an old" +
                "man like the one in the kitchen could beat you in a fight.\n\n" +
                "You hear the old man’s deep laughter echo from the other room, accompanied by another. He doesn't sound evil. You sigh to yourself." +
                "You’ve always been paranoid, and at this point, you decide it’s best not to look gift-horse in the mouth.\n\n" +
                "What do you do? \n\n");
        ui.choice1.setText("Shake his hand");
        ui.choice2.setText("Don't shake his hand");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.position1 = "shakeHand";
        game.position2= "noShakeHand";
        game.position3 = "";
        game.position4 = "";
    }
    public void shakeHand(){
        ui.mainTextArea.setText("You accept the handshake to find that the butler’s grasp is much firmer than you expected. He didn't " +
                "strike you as the type to hold onto a handshake for dear life.\n\n" +
                "But...no...\n\n" +
                "You realize that he’s actually holding your hand rather gently, yet his hand is much more...solid than it should be." +
                " Like the muscles in his hand are packed just a little too \ndensely beneath his skin. \n\n" +
                "You decide it’s nothing to worry about as you release each others’ hands.\n\n" +
                "'So I’d take it you’re coming to work here?' he asks jovially.\n\n" +
                "You nod, 'That’s the plan, at least!'\n\n" +
                "The butler smiles, though the smile takes a moment to reach his eyes as he glances at Mallory before" +
                " seeming to return to the conversation, 'It’s a pleasure to have you here. \nI can’t wait to show you the ropes.Suddenly, the butler snaps to attention, dutifully walking into the kitchen as if called, though neither you nor Mallory seem to have heard anything of the sort.\n" +
                "You’re about to let him walk into the other room when you realize something, calling after him, 'Wait-'\n" +
                "The butler stops and turns to you.\n" +
                "'I didn't catch your name,' you say, somewhat nervously. Usually, you wouldn't ask, but you feel bad just referring to him as 'butler'. \n" +
                "He gives a small huff of amusement before responding, 'Names are unimportant,' he shrugs, smiling solemnly, 'I’m just the butler.'\n" +
                "With that, he turns and walks back into the kitchen.\n" +
                "After a moment, he and the old man emerge with various steaming plates making up an extravagant meal, all of which are arranged on the table. After a moment, the butler pulls out \n" +
                "a chair for the old man, and Mallory sits across from him. Then, the butler gestures for you to sit, seemingly allowing you to choose your spot.\n" +
                "\n\nWhere would you like to sit?\n");
        ui.choice1.setText("Sit next to the old man");
        ui.choice2.setText("Sit next to Mallory");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.position1 = "sitNxtToOldman";
        game.position2= "sitNxtMallory";
        game.position3 = "";
        game.position4 = "";
    }
    public void sitNxtToOldman(){
        ui.mainTextArea.setText("The butler stays off to the side as you take up a seat next to the old man, who flashes" +
                " you a toothy grin as you sit down beside him. If you didn't know any better, you would have \nthought you saw a " +
                "glimmer of pride in his eyes. \n\n" +
                "'Eat as much as you like,' he says warmly, passing you a piece of the packages.main dish.\n\n" +
                "You smile thankfully, filling your plate as the others begin to eat.Surprisingly, the only people at dinner are you, Mallory, and the old man, with the butler standing attentively off to the side.\n" +
                "\n\n" +
                "You realize with a little unease that these might be the only people in the packages.mansion. Not that you have much experience with the habits of the wealthy, but you expected him to have \n" +
                "at least a few more staff to help things get done around the place. Then again, perhaps that’s why he hired you. If it really is his goal to help people get back on their feet, it \n" +
                "would make sense that if a few of them left at once, he would be short-staffed.\n" +
                "You push the issue out of your mind as the old man turns to you, 'If you’re going to be staying here,' he says, gesturing lazily with his fork, 'there are a few rules you’re going \n" +
                "to have to follow.'\n" +
                "Here, he pauses, looking at you expectantly as if to make sure you’re still on board.\n" +
                "Not entirely sure what kind of response he’s looking for, you nod.\n" +
                "Apparently, that was the right response, because the old man grins as he continues, 'Things here run on a tight shift during work hours, but when you’re not working, your time is \n" +
                "your own to do as you please. You'll be paid by the hour for every task you complete around the Manor. You’re allowed to take days off whenever you need, no questions asked-'\n" +
                "At this, Mallory scoffs quietly. The old man doesn't seem to notice, but you catch the butler throwing a warning glance towards the boy. \n" +
                "'-Any locked or boarded up doors are to stay that way and under no circumstances are you to go into the herb garden next to the kitchen. Above all, you are never allowed to go down \n" +
                "into the cellar, no matter why, lest you wish for your time here to end. Do you understand?'\n" +
                "'Yes, sir,' is all you can manage. There's a heaviness to the air that you didn't expect to feel over dinner, and instinct dictates that you respond as succinctly as possible. \n" +
                "The old man’s grin widens, 'Then welcome to Huxley Manor!' he exclaims, the heaviness of the mood suddenly dissipating.\n" +
                "'It's a wonderful place to be,' the butler adds, 'and if you have any questions at all, feel free to ask me.'\n" +
                "The old man nods approvingly, and dinner continues rather normally.\n" +
                "Once everyone has finished eating and the table is cleared, the old man takes you upstairs and shows you to your bedroom on the top floor, 'This is where you’ll be sleeping for the \n" +
                "rest of your time here. Mallory's room is across the hall, and mine is the one next to yours, so if you need anything, you know where to go.'\n" +
                "You nod, and the old man turns to leave before stopping himself, 'Oh, and just as a heads up, the cat tends to be a little loud at night, so I suggest you keep your door closed,' \n" +
                "he chuckles, 'You know how cats are.'\n" +
                "After that, he says goodnight, and you open the door to your room. It’s small, but comfortable, with a desk on one wall, a bed on the other, and beside that, a closet. A few tears \n" +
                "come to your eyes as you realize you’ll be sleeping in a proper bed tonight. You change into a set of pajamas folded neatly atop the bed and crawl beneath the covers.\n" +
                "What would you like to do?\n");
        ui.choice1.setText("Go to sleep");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.position1 = "goToSleep";
        game.position2 = "";
        game.position3 = "";
        game.position4 = "";
    }

    public void goToSleep(){
        ui.mainTextArea.setText("Over the next few days, you begin to get your bearings at Huxley Manor, and you manage to fall into a bit of a routine. " +
                        "The work isn't too hard, and Mallory and the butler are \nkind enough. The cat also seems to like you, though you’d be lying " +
                        "if you said its tendency to sit and stare from the corner of the room doesn't freak you out a little. Of course, \nyou’ve never " +
                        "been much of a cat person. \n\n" +
                        "You notice that Mallory seems to be getting more and more gaunt by the day, and though it worries you a little, he insists that " +
                        "it's nothing to be concerned about, so you keep \nyour mouth shut. Besides, no one else in the manor seems to be worried. Overall," +
                        " you and Mallory have become fast friends.\n\n" +
                        "Your fifth night there, however, as the two of you are about to part ways and go to bed, he stops you, gently grabbing you by the arm." +
                        " There are tears in his eyes, and he seems \nto take a moment to gather himself before speaking.\n\n" +
                        "All he says is, 'I'll miss you when we’re finally on our feet.'\n\nWhat do you do?");
        ui.choice1.setText("Tell him you'll miss him too");
        ui.choice2.setText("Stay silent");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.position1 = "WillMissYouToo";
        game.position2= "StaySilent";
        game.position3 = "";
        game.position4 = "";
    }
    public void WillMissYouToo(){
        ui.mainTextArea.setText("You nod, taking hold of his hand, 'I’ll miss you too.' \n\n" +
                "It’s a short response, but you mean every word of it. \n\n" +
                "Mallory smiles, tightening his grip on your hand, 'We’ll have to keep in touch.'\n\n" +
                "You nod. Though his eyes are watery with unshed tears, he seems content.\n\nHis gaze lingers on you for a moment longer before he lets go and, giving one final nod," +
                "turns to go to his room, clearly wiping tears from his eyes as he walks." + "For some reason, that felt like goodbye.\n\n" + "Does he plan on-\n\n You shake your head. You’re sure he’s fine. Too tired to think about it now, you go" +
                "into your room and prepare to go to sleep.\n\n");
        ui.choice1.setText("Hmph ->");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.position1 = "StaySilent";
        game.position2= "";
        game.position3 = "";
        game.position4 = "";
    }
    public void StaySilent(){
        ui.mainTextArea.setText("He waits a moment, seemingly expecting you to say something, but when you don’t respond, he nods and seems to give you an understanding smile. Mallory draws in a breath, looking \n" +
                "you over and looking around as if savoring the moment as he clearly fights back tears.\nHis gaze lingers on you for a moment longer before he lets go and, giving one final nod, turns to go to his room, clearly wiping tears from his eyes as he walks.\n" +
                "For some reason, that felt like goodbye.\n" +
                "Does he plan on-\n" +
                "You shake your head. You’re sure he’s fine. Too tired to think about it now, you go into your room and prepare to go to sleep.\n");

        ui.choice1.setText("Go right to sleep ");
        ui.choice2.setText("Read a book  ");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.position1 = "goRightToSleep";
        game.position2= "readBook";
        game.position3 = "";
        game.position4 = "";
    }

    public void goRightToSleep() {
        ui.mainTextArea.setText("You curl up in bed and put the issue out of your mind. Mallory is fine. " +
                "He’s been fine since the day you got there, and you tell yourself there’s nothing to worry about." +
                " Besides, if there is anything happening with Mallory, it’s nothing that can’t wait til morning. " +
                "With that, you close your eyes and attempt to get some rest.\n\n");

        ui.choice1.setText("Lay in bed");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.position1 = "Murder";
        game.position2 = "";
        game.position3 = "";
        game.position4 = "";
    }
    public void readBook() {
        ui.mainTextArea.setText("You light a candle on your bedside table and grab the book you started reading on your second night in the mansion. " +
                "Dracula by Bram Stoker. You’ve always loved horror.  [insert part abt the first 10 chapters being your favorite here]." +
                " You still worry about Mallory, but Stoker’s writing is enough to shift your focus enough to try to sleep. \n");

        ui.choice1.setText("Hmm");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.position1 = "Murder";
        game.position2 = "";
        game.position3 = "";
        game.position4 = "";
    }
    public void Murder() {
        ui.mainTextArea.setText("A hysterically panicked scream from across the hall lurches you awake, and before you know it, " +
                "you’re sitting straight up in bed, trying to listen for any other noises. That sounded like Mallory. It came from Mallory’s room." +
                " The scream cuts off abruptly and you hear a sudden thump onto the floor in the hallway, followed by footsteps and the sound of something heavy dragging over the polished wood.\n\n" +
                "What’s happening?\n\n" + "Has someone broken in?\n\n" + "Yes. That must be it.\n\n" + "Someone must have attempted to break in by climbing up through Mallory’s window.\n\n" +
                "As the dragging sound comes closer and closer to your door, you’re forced to make a snap decision, and unfortunately, in terms of fight or flight, your first instinct has always been fight. " +
                "You pick up a heavy object from your nightstand and fling open your door, ready to confront whatever monster has decided to break into Huxley Manor. \\n\\n\n" +
                "As the door opens, however, you feel your knees go weak and the object falls from your hand at the sight before you. \n\n" +
                "In the hallway, his suit absolutely drenched in blood and with the same slick red substance dripping from mouth and covering his smiling teeth stands the old man, grinning wildly. Behind him, being dragged by his sweat-soaked hair, is Mallory, lying there limply. " +
                "He’s still managing gargled breaths, but judging by the amount of blood…\n\n" + "...God, there’s so much blood.\n\n" +
                "It’s everywhere. Even in the darkness, it seems to soak and smatter every visible fabric,                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     dripping from every surface it can’t absorb into. What’s worse, the old man seems completely unscathed. Judging by how he’s standing and the wild look in his eye, you’re sure that none of the blood you see is his. \\n\\n\n" +
                "The old man locks eyes with you, the animalistic thrill within them fading for a moment back to his usual passively pleasant demeanor, " +
                "'Go back to bed,' he says sweetly, 'It’s late.'\n\nWhat do you want to do?");
        ui.choice1.setText("Go back to bed");
        ui.choice2.setText("Charge at the old man");
        ui.choice3.setText("Start plotting your escape");
        ui.choice4.setText("");

        game.position1 = "backToBed";
        game.position2= "AttackOldMan";
        game.position3 = "startPlot";
        game.position4 = "";
    }
    public void backToBed() {
        ui.mainTextArea.setText("You stand there a moment, looking from the old man, to Mallory, then back again. " +
                "Eventually, you nod reluctantly and turn to go back into your room. You can’t fight this man. " +
                "He may look frail, but if he had the ability to do...that to Mallory, he’s clearly stronger than he looks. \n\n" + "" +
                "Good,' the old man says through a smile.\n Out of the corner of your eye, " +
                "you see him abruptly extend his free hand, and though he’s several feet away, you are thrown violently forward into your room, " +
                "and the door slams shut behind you.\n\n");
        ui.choice1.setText(" > ");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.position1 = "startPlot";
        game.position2 = "";
        game.position3 = "";
        game.position4 = "";
    }

    public void AttackOldMan() {
        ui.mainTextArea.setText("You stare at the old man in disbelief, rage and disgust bubbling up through your veins as you process what he’s just said. He may well have just murdered someone and he wants to 'go back to bed' as if nothing happened? No. You can’t do that.\\n\\n\n" +
                "In one swift motion, you reach down and pick up the heavy object once more, charging the old man with all your might. You don’t care if you’ll win. If you don’t try, you’ll never forgive yourself. \\n\\n\n" +
                "The old man simply chuckles, lazily extending his free hand. You’re barely able to take a step when an invisible force suddenly pushes you backwards. It feels as though a battering ram has been shoved into your chest as your feet leave the ground and" +
                "you’re hurled back into your bedroom, the door slamming shut behind you.\n\nWhat do you want to do?");
        ui.choice1.setText(" > ");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.position1 = "startPlot";
        game.position2= "";
        game.position3 = "";
        game.position4 = "";
    }
    public void standStill() {
        ui.mainTextArea.setText("You simply stand there, frozen in shock as you try and process the scene before you. " +
                "This is the old man who asked you to help him up the stairs earlier this week. He took you in. He took you both in, and now- \n\n" +
                "Where is the butler? Did he know? Or did he simply not hear Mallory’s screams?\n\n " +
                "'Go to bed.' The old man’s voice is lower now, and clearly holds a threat." +
                " You know you should follow his instructions, or if not that, at least try to stop him, but you just… can’t. \n\n" +
                "Your feet are frozen in place and you can’t seem to take your eyes off of poor Mallory’s blood-soaked body as he gasps for what may be his final breaths.\n\n" +
                "The old man scoffs, extending his free arm. Suddenly, an invisible force slams into you, " +
                "sending you crashing backwards into your room as the door slams violently shut.\n\nStart plot");
        ui.choice1.setText("I got to leave this place at once");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.position1 = "startPlot";
        game.position2= "";
        game.position3 = "";
        game.position4 = "";
    }

    public void startPlot() {
        ui.mainTextArea.setText("You sit there on the floor of your room, still processing what's just happened." +
                " There's a sickening series of thumps and thuds as you assume the old man drags Mallory’s body down the stairs." +
                " Part of you wants to sob, the other part wants to throw up, and a third prays that you’re dreaming." +
                " But this is not a dream, and you don’t have the energy right now to do either of those things." +
                " Instead, you glance at the door. It doesn't lock, but after what just happened, you wouldn't be surprised if you were somehow locked in." +
                " Mallory might be dead. And you might be next.After a moment you resolve that you have to get out of here. You’d rather be homeless than stuck with a murderer.\n\n" +
                "Shakily, you get to your feet and glance around the room.\n\n");
        ui.choice1.setText(" I have to get out of here!");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.position1 = "room1";
        game.position2= "";
        game.position3 = "";
        game.position4 = "";
    }
    public void sitNxtMallory(){
        ui.mainTextArea.setText("Mallory pulls out the chair beside him, flashing you a small smile as you move to sit next to him. " +
                "You see the butler smile as well as you sit down and Mallory passes you the tray \nof mashed potatoes, " +
                "'Eat,' he says cheerily, 'you’ll need it.' \n\n" + "Surprisingly, the only people at dinner are you, Mallory, and the old man, with the butler standing attentively off to the side.\n" +
                "\n" +
                "You realize with a little unease that these might be the only people in the packages.mansion. Not that you have much experience with the habits of " +
                "the wealthy, but you expected him to have \nat least a few more staff to help things get done around the place. Then again, perhaps that’s why he " +
                "hired you. If it really is his goal to help people get back on their feet, it \nwould make sense that if a few of them left at once, he would be " +
                "short-staffed.\n\n" +
                "You push the issue out of your mind as the old man turns to you, 'If you're going to be staying here,' he says, gesturing lazily with his fork," +
                " 'there are a few rules you're going \nto have to follow.'\n\n" +
                "Here, he pauses, looking at you expectantly as if to make sure you’re still on board.\n\n" +
                "Not entirely sure what kind of response he’s looking for, you nod.\n\n" +
                "Apparently, that was the right response, because the old man grins as he continues, 'Things here run on a tight shift during work hours, but " +
                "when you're not working, your time is \nyour own to do as you please. You’ll be paid by the hour for every task you complete around the Manor. " +
                "You're allowed to take days off whenever you need, no questions asked-'\n\n" +
                "At this, Mallory scoffs quietly. The old man doesn't seem to notice, but you catch the butler throwing a warning glance towards the boy. \n\n" +
                "'-Any locked or boarded up doors are to stay that way and under no circumstances are you to go into the herb garden next to the kitchen. " +
                "Above all, you are never allowed to go down \ninto the cellar, no matter why, lest you wish for your time here to end. Do you understand?'\n\n" +
                "'Yes, sir,' is all you can manage. There’s a heaviness to the air that you didn't expect to feel over dinner, and instinct " +
                "dictates that you respond as succinctly as possible. \n\n" +
                "The old man’s grin widens, 'Then welcome to Huxley Manor!' he exclaims, the heaviness of the mood suddenly dissipating.\n\n" +
                "'It’s a wonderful place to be,' the butler adds, 'and if you have any questions at all, feel free to ask me.'\n\n" +
                "The old man nods approvingly, and dinner continues rather normally.\n\n" +
                "Once everyone has finished eating and the table is cleared, the old man takes you upstairs and shows you to your bedroom on the top floor," +
                "'This is where you'll be sleeping for the \nrest of your time here. Mallory’s room is across the hall, and mine is the one next to yours, " +
                "so if you need anything, you know where to go.'\n\n" +
                "You nod, and the old man turns to leave before stopping himself, 'Oh, and just as a heads up, the cat tends to be a little loud at night," +
                " so I suggest you keep your door closed,' \nhe chuckles, 'You know how cats are.'\n\n" +
                "After that, he says goodnight, and you open the door to your room. It's small, but comfortable, with a desk on one wall," +
                " a bed on the other, and beside that, a closet. A few tears \ncome to your eyes as you realize you'll be sleeping in a proper bed tonight." +
                " You change into a set of pajamas folded neatly atop the bed and crawl beneath the covers.\n\n" + "What would you like to do?");

        ui.choice1.setText(">");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.position1 = "goToSleep";
        game.position2= "";
        game.position3 = "";
        game.position4 = "";

    }

    public void noShakeHand(){
        ui.mainTextArea.setText("You glance apologetically at the butler’s hand, not entirely willing to shake it. He holds his hand" +
                " out for a moment longer, but after a tight-lipped nod from you, he realizes that \nyou’re not going to shake it " +
                "and instead withdraws his hand and nods back.\n\n" + "Suddenly, the butler snaps to attention, dutifully walking into the kitchen as if called, though" +
                " neither you nor Mallory seem to have heard anything of the sort.\n\n" +
                "You’re about to let him walk into the other room when you realize something, calling after him, 'Wait-'\n\n" +
                "The butler stops and turns to you.\n\n" +
                "'I didn’t catch your name,' you say, somewhat nervously. Usually, you wouldn’t ask, but you feel bad just referring to him as 'butler'. \n\n" +
                "He gives a small huff of amusement before responding, 'Names are unimportant,' he shrugs, smiling solemnly, 'I’m just the butler.'\n\n" +
                "With that, he turns and walks back into the kitchen.\n\n" +
                "After a moment, he and the old man emerge with various steaming plates making up an extravagant meal, all of which are arranged" +
                " on the table. After a moment, the butler pulls out \na chair for the old man, and Mallory sits across from him. Then," +
                " the butler gestures for you to sit, seemingly allowing you to choose your spot.\n\n");

        ui.choice1.setText(">");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.position1 = "shakeHand";
        game.position2= "";
        game.position3 = "";
        game.position4 = "";
    }
    public void offerToHelp(){
        ui.mainTextArea.setText("Mallory glances at you with what appears to be genuine fear in his eyes, quickly shaking his head, 'I’ve got it!' he says quickly," +
                " seemingly loud enough for those in the kitchen to hear\n\n. Then he flashes you a small smile, nearly whispering, 'Thank you, though,' before returning to his work.\n\n" +
                "You watch as Mallory finishes setting the table," + " and a man with white gloves walks out from the kitchen," +
                "seemingly to check that things are going smoothly. \n\n" +
                "He glances at you in surprise as if not expecting to see anyone other than Mallory in the dining room. His eyes flash " +
                "for a moment with an emotion that is covered up too quickly \nto read, and instead he flashes you a smile, 'I’m sorry, " +
                "I didn’t realize we had company or I would have greeted you sooner! I’m the butler here at the Manor.'\n\n" +
                "He smiles, extending a hand for you to shake.\n\nWhat do you do?");

        ui.choice1.setText(">");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.position1 = "shakeHand";
        game.position2= "";
        game.position3 = "";
        game.position4 = "";
    }
    public void awkMoment() {
        ui.mainTextArea.setText("You stand there in a thick silence, neither of you moving to speak. After a moment, you watch as Mallory goes back " +
                "to setting the table. He doesn’t move the way you expect him to. \nEvery gesture he makes is stiff, and even jerky at times. The " +
                "look on his face is hollow, even for doing so mundane a task as setting the table. You feel bad for thinking it, but \nhis actions" +
                " almost remind you of a deftly-controlled marionette without the strings. You chide yourself for the comparison. " +
                "He’s probably just tired. \n\nYou watch as Mallory finishes setting the table, and a man with white gloves walks out from the kitchen, seemingly to check that things are going smoothly. \n" +
                "He glances at you in surprise as if not expecting to see anyone other than Mallory in the dining room. His eyes flash for a moment with an emotion that is covered up too quickly \n" +
                "to read, and instead he flashes you a smile, 'I’m sorry, I didn’t realize we had company or I would have greeted you sooner! I’m the butler here at the Manor.'\n" +
                "He smiles, extending a hand for you to shake.\n" +
                " What do you do?");
        ui.choice1.setText(">");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.position1 = "shakeHand";
        game.position2= "";
        game.position3 = "";
        game.position4 = "";
    }
    public void stairs(){
        ui.mainTextArea.setText("The old man chuckles a little, 'The only things of interest that I keep down there are my old typewriters.'\n\n" +
                "A pause \n\n" +
                "'And the bodies, of course.' He stops a moment, staring at you rather intensely. \n\n" +
                "Shit. Was that a joke or a threat?\n\n" +
                "The silence is broken with a hearty laugh from the old man, which you hesitantly join.\n\n" +
                "'I apologize,' the old man says, still laughing, 'My humor is sometimes...A bit crass.' \n\n" +
                "He continues to chuckle to himself as you hazard a glance down the stairs. There appears to be a" +
                "shiny puddle of something at the bottom, but the base of the steps is too dark to \nsee what it is. It’s probably " +
                "just water, you tell yourself; an old place like this is bound to have leaks.\n\n" +
                "The sudden crash of china on wood jolts your attention to what you assume is the dining room. The old man quickly " +
                "moves to see what happened, gesturing for you to follow.\n\n" +
                "As you enter the room, the cat bolts past you into an entrance that likely leads to the kitchen, clearly scared by the crash." +
                "A moment later, a finely-dressed man with white gloves \nemerges from the same entrance with a broom and dustpan, immediately crouching " +
                "down and beginning to clean up the shards. \n\n" +
                "Near the dining table, apologizing profusely with the broken glass at his feet stands a boy who couldn't be more than 19 or 20. An odd relief" +
                "seems to momentarily wash over him \nwhen he sees you enter, though it’s quickly replaced by his original apprehension as the old man" +
                "approaches him.\n\n" +
                "Neither one speaks, though through eye-contact alone, it seems that in seconds an entire conversation takes place. The boy's posture shifts " +
                "fearfully as the old man’s brow furrows, \nthen after a quick, wide-eyed shake of the head from the boy, both relax as if the situation " +
                "is resolved.\n\n" +
                "The man with white gloves wordlessly stands when he has finished sweeping up the glass and goes back into the kitchen.\n\n" +
                "A moment later, the cat cautiously slinks back out into the dining room, keeping low as if ready to bolt in case any more plates" +
                " decide to come crashing down.\n\n" +
                "A smile returns to the old man’s face as he introduces you to the boy, who is apparently named Mallory, 'He can be a bit clumsy " +
                "sometimes, but he’s a good worker,' the old man \nsays, jovially clasping a hand onto the shoulders of a very uncomfortable Mallory." +
                "Even so, the boy seems to try to keep up a smile.\n\n" +
                "I’ll let you two get acquainted,' says the old man, picking up the cat and heading into the kitchen, leaving the two of you alone.\n\n" +
                "Mallory’s gaze seems to linger on you a moment before going back to his task, and though on the surface he seems genuinely happy to meet you," +
                "there is also an almost mournful \ndisposition underneath. He goes back to setting the table before you can dwell on it too long. \n\n");

        ui.choice1.setText(">");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.position1 = "painting";
        game.position2= "";
        game.position3 = "";
        game.position4 = "";
    }


    /*********** FLOOR ONE *************/
    public void room1() {
        ui.mainTextArea.setText("You sit there on the floor of your room, still processing what’s just happened." +
                " There’s a sickening series of thumps and thuds as you assume the old man drags Mallory’s body down the stairs." +
                " Part of you wants to sob, the other part wants to throw up, and a third prays that you’re dreaming. " +
                "But this is not a dream, and you don’t have the energy right now to do either of those things. Instead, you glance at the door. " +
                "It doesn’t lock, but after what just happened, you wouldn’t be surprised if you were somehow locked in. Mallory might be dead." +
                "And you might be next. After a moment you resolve that you have to get out of here. You’d rather be homeless than stuck with a murderer." +
                "\n\nShakily, you get to your feet and glance around the room.\n\nWhat do you want to do?");
        ui.choice1.setText("Try the door (leave) ");
        ui.choice2.setText("Search floor.");
        ui.choice3.setText("Go back to sleep");
        ui.choice4.setText("");

        game.position1 = "tryDoor";
        game.position2= "searchFloor";
        game.position3 = "backSleep";
        game.position4 = "";
    }
    //Try the door (leave)
    public void tryDoor() {
        ui.mainTextArea.setText("You walk to the door and test the knob. You half expect it to somehow explode on contact or light your hand on fire as you go to grab it, but it simply turns harmlessly. No pain, no terror, just a quiet ‘click’ as the door unlatches itself. When you release the handle, the door creaks gently open, revealing the hallway ahead of you, now empty save for a trail of blood so thick that you almost can’t believe that that much could come from one person.\\n\\n\n" +
                "With little other choice, you swallow your fear, stepping out into the dark hallway.There is a closed door to your left that you know to be the old man’s chambers, and on the other side of the hall, the trail of blood leads to Mallroy’s bedroom. Between you and Mallory’s room is the staircase leading to the second floor, in the darkness looking more like a gaping void in the wall going downwards.\\n\\n\n" +
                "(where do you go?)\n");
        ui.choice1.setText(">");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.position1 = "room1";
        game.position2= "";
        game.position3 = "";
        game.position4 = "";
    }

    public void searchFloor() {
        ui.mainTextArea.setText("You glance down at the floor. A few items fell from your desk when you were flung into the room, but other than that, it’s rather clean, save for a stray shirt you have yet to fold. Looking at it now, it feels almost foreign despite the fact that you’ve been living here for almost a week." +
                " You shake your head, turning back to the door. \\n\\n\n");
        ui.choice1.setText("It’s a floor");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.position1 = "room1";
        game.position2= "";
        game.position3 = "";
        game.position4 = "";
    }

    public void backSleep() {
        ui.mainTextArea.setText("Perhaps it’s best if you go back to sleep, you decide. You go and lie down on the bed and pull the covers over you, but it no longer feels as soft as it did earlier. You feel every lump and spring of the mattress, and every time you close your eyes, all you see is Mallory’s bloody body, wheezing weakly with his head only held up by his hair intertwined in the old man’s crimson fingers. The old man’s bloodstained teeth as he girns and politely asks you to 'go back to bed.' You shake yourself and get to your feet. " +
                "Maybe sleep isn’t the best idea.\\n\\n");
        ui.choice1.setText("Go downstairs");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.position1 = "downstairs";
        game.position2= "";
        game.position3 = "";
        game.position4 = "";
    }
    //Downstairs
    public void downstairs() {
        ui.mainTextArea.setText("You decide that it isn’t worth checking the other rooms, instead opting to go downstairs. \\n\\n\n" +
                "As you stand looking down the descending corridor, you feel a shiver of fear run up your spine, and for a moment, you hesitate. You’re certain that the old man dragged Mallory down these stairs, and at this point, he could be anywhere in the mansion. If he finds you…\\n\\n\n" +
                "No. You can’t think like that, you decide.\\n\\n\n" +
                "You have to get out of here. This is the only way down to the door on the main floor, and you’re not about to jump out of a third story window to try and escape. \\n\\n\n" +
                "Though the fear of being caught still weighs heavily on your mind, you steel yourself, stepping down into the darkness. \\n\\n\n" +
                "  \n");
        ui.choice1.setText("Try bedroom on your left");
        ui.choice2.setText("Try door straight ahead");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.position1 = "tryBedroomOnleft";
        game.position2= "TryDoorAhead";
        game.position3 = "";
        game.position4 = "";
    }

    //The bedroom on your left (2)
    public void tryBedroomOnleft() {
        ui.mainTextArea.setText("You try the door to your left, only to find that, predictably, it’s locked. He always locks his room anyway, and it would only follow that he would most definitely lock it when committing a murder. \\n\\n\n");
        ui.choice1.setText("Locked can't get in");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.position1 = "downstairs";
        game.position2= "";
        game.position3 = "";
        game.position4 = "";
    }
    //Downstairs
    public void TryDoorAhead() {
        ui.mainTextArea.setText("You realize this is Mallory's room door\n");
        ui.choice1.setText("Enter Mallory’s room");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.position1 = "MalloryRoom";
        game.position2= "";
        game.position3 = "";
        game.position4 = "";
    }

    // Mallory's room
    public void MalloryRoom() {
        ui.mainTextArea.setText("Cautiously, you walk through the hall down to Mallory’s room, trying to ignore the squish of the bloodsoaked carpet as wetness of it seeps into your socks. The door to his room is already open, and, out of a combination of concern and morbid curiosity, you enter. \\n\\n\n" +
                "The room is strangely orderly for one in which someone was just killed. The only signs of a struggle, save for the obvious bloodstain in the middle of the carpet, seem to be around the bed, with the blankets and pillows clearly having been kicked around. Did the old man sneak up on him? Or perhaps Mallory simply hadn’t expected it when the old man had entered his room in the middle of the night. \\n\\n\n" +
                "Suddenly you remember your last conversation with Mallory, and how it had felt like goodbye. He couldn’t have known that this was going to happen, right? How could one predict a murder like that?\\n\\n\n" +
                "You shake your head. As horrible as it is, there are more pressing matters at hand. You can grieve for your friend once you’re out of here. \\n\\n\n" +
                "His room is set up similarly to your own, with a bed to one wall and a desk to the other. At the foot of the bed sits a closet door.\\n\\n\n");
        ui.choice1.setText("Search bed");
        ui.choice2.setText("Search closet");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.position1 = "SearchBed";
        game.position2= "SearchCloset";
        game.position3 = "";
        game.position4 = "";
    }
    //Search bed
    public void SearchBed() {
        ui.mainTextArea.setText("You apprehensively approach the bed, a wave of grief washing over you as it sinks in that this is likely where Mallory’s fate was sealed. Blood is everywhere, and there’s a smattering of it up and across the wall as if his throat had been slit. \\n\\n\n" +
                "You look down, taking a moment to center yourself as you feel the bile rising up in your throat. Nothing could have prepared you for the events of tonight. \\n\\n\n" +
                "It’s then that something poking out from beneath the bedskirt catches your eye. Something solid and shiny. You crouch down to look under the bed. \\n\\n\n" +
                "At first you’re not entirely sure what you’re looking at, but as your eyes adjust, you recoil a little at the sight.\\n\\n\n" +
                "They’re...chains. Shackles, bolted to the floor and long enough to reach up to the bed. \\n\\n\n" +
                "Did-\\n\\n\n" +
                "Did the old man chain Mallory?\\n\\n\n" +
                "You think back to one first days you were there. Mallory had made a mistake, and after that you hadn’t seen him for an entire day - not even at dinner. The next time you’d seen him, you’d noticed the bruises on his wrists, but had assumed that they were from some accident while working. Not...this.\\n\\n\n" +
                "You scramble to your feet, shaking yourself and looking around the rest of the room.\\n\\n\n" +
                "\n");
        ui.choice1.setText(">");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.position1 = "MalloryRoom";
        game.position2= "";
        game.position3 = "";
        game.position4 = "";
    }
    //Search closet
    public void SearchCloset() {
        ui.mainTextArea.setText("You walk over to the closet and slowly open the door. It’s surprisingly bare, even for Mallory. There are three shirts, two pairs of pants, and a yellow coat hanging there, with a single pair of shoes sitting on the floor. It’s odd, considering that the old man insisted that all shoes be kept in the hall closet near the front door. \\n\\n");
        ui.choice1.setText("Shoes");
        ui.choice2.setText("A coat");
        ui.choice3.setText("Leave Closet");
        ui.choice4.setText("Search desk");

        game.position1 = "Shoes";
        game.position2= "Coat";
        game.position3 = "LeaveCloset";
        game.position4 = "SearchDesk";
    }

    //Put on shoes
    public void Shoes() {
        ui.mainTextArea.setText("You glance down at your sock-covered feet. If you’re going to be running away tonight, you decide, it’s probably best that you have some shoes. Luckily you and Mallory are nearly the same shoe-size, so they slip on easily. \\n\\n\n");
        ui.choice1.setText("Put on ");
        ui.choice2.setText("No put on");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.position1 = "PutOnShoes";
        game.position2= "NoPutOnShoes";
        game.position3 = "";
        game.position4 = "";
    }
    public void PutOnShoes() {
        ui.mainTextArea.setText("remember make more noise");
        ui.choice1.setText(">");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.position1 = "SearchCloset";
        game.position2= "";
        game.position3 = "";
        game.position4 = "";
    }
    public void NotPutOnShoes() {
        ui.mainTextArea.setText(" Quieter.\\n\\n\n");
        ui.choice1.setText(">");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.position1 = "SearchCloset";
        game.position2= "";
        game.position3 = "";
        game.position4 = "";
    }

    public void Coat() {
        ui.mainTextArea.setText("You reach for the coat, pulling it off the hanger. It’s a cold autumn night, and considering how far this mansion is from any people, you’re sure that it’s going to be a long walk in the fridged air before you can find help, so you figure it’s best if you put it on. It’s a little tight in the shoulders, but on the whole it doesn’t fit too badly. \\n\\n\n");
        ui.choice1.setText("Put on ");
        ui.choice2.setText("No put on ");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.position1 = "PutOnCoat";
        game.position2= "NotPutOnCoat";
        game.position3 = "";
        game.position4 = "";
    }

    //Put on coat
    public void PutOnCoat() {
        ui.mainTextArea.setText("Get stuck on something/butler grabs)");
        ui.choice1.setText(">>>");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.position1 = "Coat";
        game.position2= "";
        game.position3 = "";
        game.position4 = "";
    }
    public void NotPutOnCoat() {
        ui.mainTextArea.setText(" Take with you");
        ui.choice1.setText(">>>");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.position1 = "SearchCloset";
        game.position2= "";
        game.position3 = "";
        game.position4 = "";
    }
    //Leave Closet
    public void LeaveCloset() {
        ui.mainTextArea.setText("You take one last glance at the nearly empty closet before turning back to the room. \\n\\n");
        ui.choice1.setText(">>>");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.position1 = "SearchCloset";
        game.position2= "";
        game.position3 = "";
        game.position4 = "";
    }

    //Search desk
    public void SearchDesk() {
        ui.mainTextArea.setText("You walk to the desk and glance over its surface. It’s one of the only parts of the room that’s relatively blood-free, save for a drop or two scattered at one corner.There’s a pen holder and a lamp, and a few un-marked scraps of paper. In the center is a book: a copy of  Shakespeare’s Much Ado about Nothing. However, you’ve read Much Ado About Nothing, and this copy is much thicker than it should be. \\n\\n\n" +
                "Beside it sits a polaroid picture with a date written on the bottom.\\n\\n\n");
        ui.choice1.setText("Examine the book");
        ui.choice2.setText("Examine the picture");
        ui.choice3.setText("Leave desk");
        ui.choice4.setText("Leave room");

        game.position1 = "ExamineBook";
        game.position2= "ExaminePicture";
        game.position3 = "LeaveDesk";
        game.position4 = "LeaveRoom";
    }
    //Examine the book (room4)
    public void ExamineBook() {
        ui.mainTextArea.setText("You pick up the book, glancing over the dust jacket before gently opening it. You expect to see a title page for Much Ado About Nothing, but as you open to the first page, instead you find something completely different. \\n\\n\n" +
                "Incantations and Unbinding: How to Undo What’s Been Done is scrawled across the page in a decorative font, and as you hold it, the dust jacket slips from the front cover, revealing the same title in gilded lettering on the cover of the book.\\n\\n\n" +
                "Your curiosity piqued, you begin to flip through the pages. Some of them have corners folded over, or bits underlined as if to mark the things that Mallory must have thought to be important. All of them seem to pertain to reversing immortality. Little notes written in the margins ask questions and make statements:\\n\\n\n" +
                " “Does he have to participate??”\\n\\n\n" +
                "“Blood needed”\\n\\n\n" +
                "“Bad idea - last resort”\\n\\n\n" +
                "“House bound to him?????”\\n\\n\n" +
                "And so on.\\n\\n\n" +
                "The book seems to take itself rather seriously and is almost written in the style of a textbook in some places, dealing with a different spell or ritual every few pages. On its own, you might have simply taken it as a piece of fan material for a series or tabletop game, but the fact that Mallory took it so seriously concerns you. Though you’ve only been here a few days, you know that he didn’t have time for hobbies or fandoms. \\n\\n\n" +
                "Did the old man really harm him that much? Was he that far gone to have to start believing in spells and immortality to cope with his situation? He’d never struck you as someone losing his grip on reality, but you figure a lot can happen behind closed doors. \\n\\n\n" +
                "There seems to be a great deal in the book about removing one’s soul and tricking the body into thinking it’s still there, whatever that means. \\n\\n\n" +
                "One passage underlined rather intensely in pen reads, “There is no way to reverse soullessness once it has been done. The soulless will live on as long as the individual can find sustenance in the mortal realm. The only way that one who has begun to draw life from below the metaphysical plane can perish while still well-nourished is if the immortal body is killed within a day after it has fed. It is weakest as it draws lifeforce from its meals, and only then can the body be jolted into ‘realizing’ there is no soul sustaining it.” \\n\\n\n" +
                "Written beside this passage are simply the words, “Next time?”\\n\\n\n" +
                "Shaking your head, you close the book, fold the dust jacket back over the cover, and place it back on the desk.\\n\\n\n");
        ui.choice1.setText("Magic spells");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.position1 = "MagicSpells";
        game.position2= "";
        game.position3 = "";
        game.position4 = "";
    }
    public void MagicSpells() {
        ui.mainTextArea.setText("Trying to figure out how to reverse curse/understand it\n\\n\\n\n");
        ui.choice1.setText(">");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.position1 = "SearchDesk";
        game.position2= "";
        game.position3 = "";
        game.position4 = "";
    }
    //Examine the picture
    public void ExaminePicture() {
        ui.mainTextArea.setText("You pick up the polaroid and glance at the date. July 24, 2017. It’s a picture of Mallory standing with a group of people who you assume to be relatives at a beach somewhere. But he looks...different. His hair is shorter, and his frame is filled out more healthfully than it ever had been in the time you’d known him. The deep, chasmous dark circles beneath his eyes are lighter here - almost nonexistent on his semi-sunburnt face. He’s smiling in a way that you’ve never seen before, almost as if he’s laughing at something behind the camera.\\n\\n\n" +
                "You realize you’d never seen him genuinely laugh.\\n\\n\n" +
                "\n" +
                "A middle-aged woman stands grinning beside him with an arm placed playfully around his shoulders, and sitting in the sand at his feet is a little blonde girl who couldn’t be older than 10 or 11. She’s also clearly laughing, her hands packed with fistfulls of sand.\\n\\n\n" +
                "You feel tears begin to well up in your eyes as you stare at the polaroid. He had a family once. People who loved him. At least that’s what it looks like in the picture. What happened to him that made him land here, of all places? That made him die here? Would his family even know that he was gone?\\n\\n \n" +
                "\n" +
                "Would they care?\\n\\n\n" +
                "\n" +
                "You draw in a shaky breath as your vision blurs with tears that threaten to spill over. You quickly put down the polaroid and wipe your eyes. You don’t have time to be getting emotional right now. \\n\\n\n" +
                "\n" +
                "Still, you can’t help but hazard one last lingering glance at the photo. You wish he could have seen them again. \\n\\n\n" +
                "\n" +
                " \n");
        ui.choice1.setText(">");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.position1 = "SearchDesk";
        game.position2= "";
        game.position3 = "";
        game.position4 = "";
    }

    //Leave desk
    public void LeaveDesk() {
        ui.mainTextArea.setText("You decide you’ve had your fill of snooping around Mallory’s desk, and chuckle a little to yourself as you realize how he’s going to be pissed when he--\\n\\n\n" +
                "The blood smeared across the room jolts you back to where you are, and the small smile drops from your face. There is no “when”. Not anymore. \\n\\n\n" +
                "Clenching your jaw and, attempting to swallow back the rock in your throat, you turn your attention back to the room. \\n\\n\n");
        ui.choice1.setText(">");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.position1 = "SearchDesk";
        game.position2= "";
        game.position3 = "";
        game.position4 = "";
    }
    //Leave room
    public void LeaveRoom() {
        ui.mainTextArea.setText("You give one last sweeping glance to the room before stepping back out into the hallway and making your way over to the staircase.\\n\\n\n" +
                "As you stand looking down the descending corridor, you feel a shiver of fear run up your spine, and for a moment, you hesitate. You’re certain that the old man dragged Mallory down these stairs, and at this point, he could be anywhere in the mansion. If he finds you…\\n\\n\n" +
                "No. You can’t think like that, you decide.\\n\\n\n" +
                "You have to get out of here. This is the only way down to the door on the main floor, and you’re not about to jump out of a third story window to try and escape. \\n\\n\n" +
                "Though the fear of being caught still weighs heavily on your mind, you steel yourself, stepping down into the darkness. \\n\\n\n" +
                "\n");
        ui.choice1.setText(">");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.position1 = "room5";
        game.position2= "";
        game.position3 = "";
        game.position4 = "";
    }
    //Down in third over section, room 5:
    public void room5() {
        ui.mainTextArea.setText("You step cautiously as you descend the stairs, praying that no one will catch you once you reach the bottom. It’s dark; with every step a part of you fears that your foot will miss, and you’ll be sent tumbling down the stairway. Still, these stairs don’t creak as much as the ones on the lower levels, and for that, you’re grateful.\\n\\n\n" +
                "You nearly hit your head on the ceiling as you finally reach the bottom of the stairs. It’s always been much lower on this level than the others. \\n\\n\n" +
                "As you step out into the hallway, you see something move out of the corner of your eye. Something brushes against your ankle, and as you try to step away, it seems to follow your every move. Nearly tripping, you look down to see a pair of yellow eyes staring back at you from the darkness, and there’s a quiet meow from the little creature at your feet. \\n\\n\n" +
                "A wave of relief washes over you. It’s just the cat. You watch as it slinks away from you, trying to steady your beating heart. It pauses at a pair of doors on the opposite wall, seeming to test each one before one of them yields to its paws and it goes in. In another world, you might have laughed at the fact that the most harmless creature in the mansion managed to scare you so badly. After a moment, you begin to make your way towards the other stairs.\\n\\n\n" +
                "As you take a step, a floorboard creaks loudly. \\n\\n\n" +
                "Something feels wrong. \\n\\n\n" +
                "You glance back to where you came from to find that the staircase you just walked down is...gone. Where there was once an opening is simply a wall, with no trace that there was ever a stairway there to begin with. You force yourself to continue onward. Perhaps it’s just the darkness playing tricks on you.\\n\\n\n" +
                "All of a sudden, a great cracking sound echoes through the hallway, and the ceiling opens. From it descends countless blades, swinging violently on ropes and glinting in the darkness. You watch in horror as one swings directly at you.\\n\\n\n" +
                "What do you do? \\n\\n\n");
        ui.choice1.setText("Run!");
        ui.choice2.setText("Duck down");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.position1 = "Run";
        game.position2= "DuckDown";
        game.position3 = "";
        game.position4 = "";
    }
    //Run
    public void Run() {
        ui.mainTextArea.setText("You try to sprint away from the blade swinging towards you, but as you turn to run, you feel something ram into your side. Turning, pain erupts from your abdomen as you find that a different blade has lodged itself just above your hip, hooking you in place.\\n\\n\n" +
                "As you struggle, another comes swinging at you head on, and you feel a painful popping in your chest as it buries itself in your sternum. \\n\\n\n" +
                "Then another swings into you. \\n\\n\n" +
                "And then another. \\n\\n\n" +
                "You can hardly bear the agony as you hang there, suspended by the blades that have hooked themselves deep into your flesh.\\n\\n\n" +
                "You’re not sure how long you’ve hung there, but you open your eyes as you hear a door creak open, and the butler emerges from one of the rooms near where the stairs used to be. \\n\\n\n" +
                "A foolish spark of hope ignites within you as he approaches, genuine concern seeming to color his movements. He looks you over, shaking his head sadly as he reaches up to gently cup your cheek. \\n\\n\n" +
                "“I’m so sorry,” he mutters quietly. \\n\\n\n" +
                "He reaches his other hand and runs it through your hair, lingering on the back of your head.\\n\\n\n" +
                "You watch as he draws in breath, still holding your head, before your neck is violently twisted and everything goes black. \\n\\n\n" +
                "\n" +
                "You’ve discovered one of many ways to die in this game! Good for you! But, it IS possible to win, so I suggest you restart the game and play again.\\n\\n\n");
        ui.choice1.setText(">");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.position1 = "room5";
        game.position2= "";
        game.position3 = "";
        game.position4 = "";
    }


    /**
     * Automatic - board squeak, feel as though being watch, swinging blades from ceiling
     * Duck down
     *
     **/
    public void DuckDown() {
        ui.mainTextArea.setText("You duck down onto the floor as the blades swing past overhead. They seem to hang about three feet above the ground, and everything below that appears to be safe to crawl through. You glance around and notice that the door the cat opened earlier is still ajar, so, too terrified to attempt to make it all the way to the stairs, you drag yourself into the room and close the door behind you.\\n\\n\n" +
                "The room is even darker than the hallway, and you can’t make out anything inside it as you sit huddled against the wall, catching your breath. The room is uncomfortably silent, and you can hear your heart pounding in your chest and blood rushing in your ears.\\n\\n\n" +
                "The darkness seems to close in on you as you sit there, and if you squint, you can almost convince yourself that you see shapes moving in the darkness. Of course, it’s probably just your eyes playing tricks on you. At this point, you’re convinced that it’s simply your imagination. After everything that’s happened to you tonight, you’ve decided it’s best not to overthink things.\\n\\n\n" +
                "You close your eyes for a moment, just trying to steady yourself, and feel a comforting hand press itself onto your shoulder.\\n\\n\n" +
                "Then you remember that you’re alone in the room.\\n\\n\n" +
                "Your eyes fly open and you spring terrified to your feet, your gaze frantically darting over the pitch-dark room. That was a hand. A real hand. You can credit your imagination for a lot of things, but that’s certainly not one of them. \\n\\n\n" +
                "As you pin yourself to the wall, your shoulder hits the lightswitch and the overhead lights of the room flick on.\\n\\n\n" +
                "You watch once your eyes adjust to the light as the cat darts away from you, stopping and staring at you from the center of the room.\\n\\n\n" +
                "There’s no one else there.\\n\\n\n" +
                "You stand there a moment, panting. Perhaps it really was your imagination. You stare at the cat as it sits and stares back at you, its shadow extending towards you a great deal further than you feel it should. You feel like you’re going insane. \\n\\n\n" +
                "The cat approaches you cautiously. \\n\\n\n" +
                "\n");
        ui.choice1.setText("Kick the cat away");
        ui.choice2.setText("Ignore the cat");
        ui.choice3.setText("Try to pet the cat");
        ui.choice4.setText("Run through hall");

        game.position1 = "KickCat";
        game.position2= "IgnoreCat";
        game.position3 = "PetCat";
        game.position4 = "RunThruHall";
    }
    //Kick the cat away
    public void KickCat() {
        ui.mainTextArea.setText("You stare at the cat in disgust as it walks towards you. It slowly approaches your leg, and as it goes to sniff, you thrash out your foot, nailing it in the chin and sending it stumbling backwards and hissing. Its hair stands on end as it stares at you in shock for a moment before quickly limping into a corner of the room and painfully laying down, curling itself into as tight a ball as possible. You notice a bit of blood on its tongue as if it bit itself when you kicked it. It crouches there for a moment, shaking and staring at you with wide, terrified eyes. You scoff and move to examine the room. \\n\\n\n" +
                "There’s a large bookcase to one wall, and an unlit fireplace to an adjacent one. In the middle of the room, surrounded by couches, is a coffee table with a handful of writing materials and paper on it. \\n\\n\n" +
                "What do you do?\\n\\n\n");
        ui.choice1.setText("Remember mad cat");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.position1 = "PetCat";
        game.position2= "";
        game.position3 = "";
        game.position4 = "";
    }

    //Ignore the cat
    public void IgnoreCat() {
        ui.mainTextArea.setText("You don’t pay the cat any mind as it approaches you, sniffing you a little and then wandering off to do its own thing. You instead move to examine the room. \\n\\n\n" +
                "To one wall is a bookcase, laden with various titles that appear to be rather esoteric. \\n\\n\n" +
                "To an adjacent wall is an unlit fireplace that looks recently used. It seems to have a few small items on its mantel, but it’s too far away for you to properly see what’s on it. \\n\\n\n" +
                "In the middle of the room, surrounded by couches, sits a coffee table. It’s peppered with pens and paper and various other writing materials, including what looks like a feather pen.\\n\\n\n" +
                "What do you do? \\n\\n\n");
        ui.choice1.setText(">");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.position1 = "PetCat";
        game.position2= "";
        game.position3 = "";
        game.position4 = "";
    }
    //Try to pet the cat
    public void PetCat() {
        ui.mainTextArea.setText("You crouch down and extend a hand as the cat approaches you, allowing it to sniff. It takes a moment, thoroughly smelling your hand and up your arm before deciding that you’re a friend, beginning to purr as it pushes its face through your fingers. You can’t help but smile a bit as it flops down in front of you, showing you its belly and staring at you expectantly. You chuckle a little, scratching it as it purrs. You’ve never been too much of a cat person, but you’d be lying if you didn’t admit that this one was rather cute. \\n\\n\n" +
                "After a while, the cat reaches down and nips your hand to tell you that it has finished being pet for the time being, thank you very much, then stands, rubbing against your hand one more time before walking off. \\n\\n\n" +
                "You smile as you, too, get to your feet, glancing around the room. \\n\\n\n" +
                "To one wall is a bookcase so laden with various esoteric titles that some are stacked on the edges of the shelves for lack of space. A tiny book sits haphazardly on one of the shelves as if it was recently put back without much care. \\n\\n\n" +
                "To an adjacent wall is an unlit fireplace that looks recently used. It seems to have a few small items on its mantel, but it’s too far away for you to properly see what’s on it. Still, a tiny box beside a decorative statue catches your eye.\n" +
                "In the middle of the room, surrounded by couches, sits a coffee table. It’s peppered with pens and paper and various other writing materials, including what looks like a feather pen. It looks as though there’s something beneath the papers strewn across it, but you’d have to check to be sure.\\n\\n\n" +
                "What do you do?\\n\\n\n" +
                "\n");
        ui.choice1.setText("Examine the bookcase ");
        ui.choice2.setText("Examine the coffee table");
        ui.choice3.setText("Examine the fireplace");
        ui.choice4.setText("");

        game.position1 = "ExamineBookcase";
        game.position2= "ExamineCoffeeTable";
        game.position3 = "ExamineFireplace";
        game.position4 = "";
    }
    // In room 9
    //Examine the bookcase
    public void ExamineBookcase() {
        ui.mainTextArea.setText("You make your way over to the bookcase and begin to look it over. Various titles that sound more like fantasy than nonfiction scatter the shelves, such as:\\n\\n\n" +
                "The Ins and Outs of Human Transmutation\\n\\n\n" +
                "Binding the Bound: Ensuring Loyalty\\n\\n\n" +
                "From Puppet to Puppeteer: Mind Control for Dummies\\n\\n \n" +
                "And so on. \\n\\n\n" +
                "An empty spot on the shelf catches your eye. It’s arranged in alphabetical order, and in the “I” section is a gap that, if you’ve interpreted this right, shouldn’t be there. There are plenty of books piled on the sides of the shelves and even on the floor that would fit well into the spot left open, but for some reason it’s empty. It’s as if a book had been taken out and never replaced. \\n\\n\n" +
                "Your attention turns to another book not too far from the empty spot, thrown haphazardly onto the edge of the shelf as if it was put back in a rush. It’s tiny - barely bigger than your hand - and titled Invisibility on the Go: A Pocket Guide. You gingerly pick up the book and open it, finding that it seems to be exactly what the title implies: a guide on various methods to turn invisible on short notice.\\n\\n\n" +
                "You sigh. An hour ago, you would have thought that for a man who focuses so much on the practical, the old man sure had a lot of impractical books. But now, after everything you’ve seen, there’s a part of you that wants to believe it. You can’t believe you’re thinking this, but perhaps the book could be helpful.\\n\\n\n" +
                "Or perhaps you’re starting to lose it and the book is just that - a book. \\n\\n\n" +
                "Do you decide to take it with you?\\n\\n\n");
        ui.choice1.setText("spell book");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.position1 = "PocketBook";
        game.position2= "LeaveBook";
        game.position3 = "";
        game.position4 = "";
    }
    public void PocketBook(){
        ui.mainTextArea.setText("Bye!");
        ui.choice1.setText(">");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.position1 = "theMansion";
        game.position2= "";
        game.position3 = "";
        game.position4 = "";
    }
    public void LeaveBook(){
        ui.mainTextArea.setText("Bye!");
        ui.choice1.setText(">");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.position1 = "theMansion";
        game.position2= "";
        game.position3 = "";
        game.position4 = "";
    }
    //Examine the coffee table
    public void ExamineCoffeeTable() {
        ui.mainTextArea.setText("You walk over to the coffee table and give it a once-over. The papers appear to be the beginnings of fancily-written letters, though the cursive is too messy and scrawling for you to sit down and try to decipher right now. There doesn’t appear to be much out of the ordinary alongside the stationary and writing utensils, but as you look closer you discover that there seems to be something beneath the three or four unfinished letters strewn across the table.\\n\\n\n" +
                "Hesitantly, you push the papers aside to reveal a small ornate letter opener. It’s clearly very old, and its design sits happily on the border between letter opener and plain old tiny knife, but it seems to have found its purpose opening letters for the old man. \\n\\n\n" +
                "As you look at it, you can’t help but wonder whether you should take it with you. It definitely could be used as a weapon if push came to shove, but a part of you wonders if you would be more effective just sticking to your fists. \\n\\n\n" +
                "Do you take the letter opener?\\n\\n\n");
        ui.choice1.setText(">");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.position1 = "PetCat";
        game.position2= "";
        game.position3 = "";
        game.position4 = "";
    }
    //Examine the fireplace
    public void ExamineFireplace() {
        ui.mainTextArea.setText("You walk to the fireplace and survey the ornate black marble surrounding it. Intricate carvings of vines and flowers wrap around the pillars on the outside in patterns closely resembling that of lightning. Closer to center there is a small arch carved with breathtaking precision into what seems to be vines covered in thousands of tiny thorns, many of them nearly looking as though you might actually be cut if you touched them. \\n\\n\n" +
                "You notice various scraps of burnt paper in the fireplace, though you find that they’re all too small and seared to properly glean what they might have been. \\n\\n\n" +
                "Finally, you turn your attention to the mantel. On either side are rather hefty-looking statues. Each depicts a gargoyle, one crouching and the other standing on its hind legs, both snarling out at the room. A small matchbox sits beside one of them. It’s open slightly, and you can see that there are still a few left in the pack. There’s a part of you that wants to snag them, just in case, but you’re not entirely sure what you’d use them for. There’s another part that doesn’t want to leave any more trace that you were here than you absolutely have to, in case the old man notices. You sigh, staring at the matches.\\n\\n\n" +
                "Do you take them?\\n\\n\n");
        ui.choice1.setText(">");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.position1 = "PetCat";
        game.position2= "";
        game.position3 = "";
        game.position4 = "";
    }

   //Run through hall
    public void RunThruHall() {
        ui.mainTextArea.setText("Death by blade");
        ui.choice1.setText(">");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.position1 = "theMansion";
        game.position2= "";
        game.position3 = "";
        game.position4 = "";
    }

    //room 9 - chamber (pre fight scene)
    public void room9() {
        ui.mainTextArea.setText("Bye!");
        ui.choice1.setText(">");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.position1 = "theMansion";
        game.position2= "";
        game.position3 = "";
        game.position4 = "";
    }

    //room 9 - chamber (butler fight scene)
    public void room9Fight(){
        ui.mainTextArea.setText("Bye!");
        ui.choice1.setText(">");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.position1 = "theMansion";
        game.position2= "";
        game.position3 = "";
        game.position4 = "";
    }

    //room 10 - chamber (potion room)
    public void room10() {
        ui.mainTextArea.setText("Bye!");
        ui.choice1.setText(">");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.position1 = "theMansion";
        game.position2= "";
        game.position3 = "";
        game.position4 = "";
    }

    //room 8 - hallway/stairway (no method for bathroom, just display)
    public void room8() {
        ui.mainTextArea.setText("Bye!");
        ui.choice1.setText(">");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.position1 = "theMansion";
        game.position2= "";
        game.position3 = "";
        game.position4 = "";
    }

    /*********** FLOOR THREE *************/
    //room 11 - kitchen
    public void room11() {
        ui.mainTextArea.setText("Bye!");
        ui.choice1.setText(">");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.position1 = "theMansion";
        game.position2= "";
        game.position3 = "";
        game.position4 = "";
    }

    //room 7 - greenhouse (not labeled on correct floor on pic)
    public void room7() {
        ui.mainTextArea.setText("Bye!");
        ui.choice1.setText(">");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.position1 = "theMansion";
        game.position2= "";
        game.position3 = "";
        game.position4 = "";
    }

    //hide from old man - crosses rooms, lots of booleans for if potion or spell book
    public void hideFromMan() {
        ui.mainTextArea.setText("Bye!");
        ui.choice1.setText(">");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.position1 = "theMansion";
        game.position2= "";
        game.position3 = "";
        game.position4 = "";
    }

    /*********** CELLAR *************/
    public void cellar() {
        ui.mainTextArea.setText("Bye!");
        ui.choice1.setText(">");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.position1 = "theMansion";
        game.position2= "";
        game.position3 = "";
        game.position4 = "";
    }

    //general (if not matches or pet cat - catch all)
    public void generalCellar() {
        ui.mainTextArea.setText("Bye!");
        ui.choice1.setText(">");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.position1 = "theMansion";
        game.position2= "";
        game.position3 = "";
        game.position4 = "";
    }

    //if matches
    public void matchesCellar() {
        ui.mainTextArea.setText("Bye!");
        ui.choice1.setText(">");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.position1 = "theMansion";
        game.position2= "";
        game.position3 = "";
        game.position4 = "";
    }

    //if pet cat
    public void petCatCellar() {
        ui.mainTextArea.setText("Bye!");
        ui.choice1.setText(">");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.position1 = "theMansion";
        game.position2= "";
        game.position3 = "";
        game.position4 = "";
    }

}