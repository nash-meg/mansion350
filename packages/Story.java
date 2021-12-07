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
            case "noShakeHand": noShakeHand(); break;
            case "stairs": stairs(); break;
            case "offerToHelp": offerToHelp(); break;
            case "awkMoment": awkMoment(); break;

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

        game.position1 = "theMansion";
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
                "\nshortly after this was painted,\" he huffs distantly. \"If it weren’t for him, none " +
                "of this would have been \npossible,\" the man gestures to the mansion around him.\n\n" +
                "You nod solemnly. There’s a part of you that wonders how he died so young - he couldn’t " +
                "have been more \nthan 30 in the picture - and what he did to help the old man. Even so, " +
                "you know better than to ask. If he had wanted to say, he would have. The old man lingers " +
                "on the painting a moment more, his smile widening, \nbefore seeming to snap back to the present and " +
                "guiding you into the dining room.\n\n" +
                "You enter to see a boy who couldn’t be more than 19 or 20 setting the table. \n\n" +
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
                "He locks eye contact with you, his gaze requesting that you hold it as he speaks, 'I wouldn’t trade working \nhere for the world!" +
                " I love the work I do, and he’s been extremely generous to let me stay here while I save up to get a place of my own.'\n\n" +
                "Despite the cheery tone, you feel a shiver of unease run down your spine as he talks. The words he’s saying \nare loud and " +
                "enthusiastic, and if the only thing in this interaction had been his voice, you may have actually \nbelieved him. But his eyes, " +
                "which have not faltered since locking with yours… " +
                "God, his eyes... " +
                "They tell a \ndifferent story entirely. As he speaks, his brows knit together in a look of pain, despair, and exhaustion. " +
                "\nRegret drips from every movement he makes as he shakes his head while discussing the old \nman’s 'generosity.'\n\n" +
                "When he’s finished speaking, Mallory’s expression quickly switches to a smile, and he goes back to his workas if nothing happened." +
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
                "You hear the old man’s deep laughter echo from the other room, accompanied by another. He doesn’t sound evil. You sigh to yourself." +
                "You’ve always been paranoid, and at this point, you decide it’s best not to look gift-horse in the mouth.You watch as Mallory finishes setting the table, and a man with white gloves walks out from the kitchen, seemingly to check that things are going smoothly. \n" +
                "He glances at you in surprise as if not expecting to see anyone other than Mallory in the dining room. His eyes flash for a moment with an emotion that is covered up too quickly \n" +
                "to read, and instead he flashes you a smile, 'I’m sorry, I didn’t realize we had company or I would have greeted you sooner! I’m the butler here at the Manor.'\n" +
                "He smiles, extending a hand for you to shake.\n" +
                " What do you do? \n\n");
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
        ui.mainTextArea.setText("You accept the handshake to find that the butler’s grasp is much firmer than you expected. He didn’t " +
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
                "'I didn’t catch your name,' you say, somewhat nervously. Usually, you wouldn’t ask, but you feel bad just referring to him as 'butler'. \n" +
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
                " you a toothy grin as you sit down beside him. If you didn’t know any better, you would have \nthought you saw a " +
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
                "your own to do as you please. You’ll be paid by the hour for every task you complete around the Manor. You’re allowed to take days off whenever you need, no questions asked-'\n" +
                "At this, Mallory scoffs quietly. The old man doesn’t seem to notice, but you catch the butler throwing a warning glance towards the boy. \n" +
                "'-Any locked or boarded up doors are to stay that way and under no circumstances are you to go into the herb garden next to the kitchen. Above all, you are never allowed to go down \n" +
                "into the cellar, no matter why, lest you wish for your time here to end. Do you understand?'\n" +
                "'Yes, sir,' is all you can manage. There’s a heaviness to the air that you didn’t expect to feel over dinner, and instinct dictates that you respond as succinctly as possible. \n" +
                "The old man’s grin widens, 'Then welcome to Huxley Manor!' he exclaims, the heaviness of the mood suddenly dissipating.\n" +
                "'It’s a wonderful place to be,' the butler adds, 'and if you have any questions at all, feel free to ask me.'\n" +
                "The old man nods approvingly, and dinner continues rather normally.\n" +
                "Once everyone has finished eating and the table is cleared, the old man takes you upstairs and shows you to your bedroom on the top floor, 'This is where you’ll be sleeping for the \n" +
                "rest of your time here. Mallory’s room is across the hall, and mine is the one next to yours, so if you need anything, you know where to go.'\n" +
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
                        "The work isn’t too hard, and Mallory and the butler are \nkind enough. The cat also seems to like you, though you’d be lying " +
                        "if you said its tendency to sit and stare from the corner of the room doesn’t freak you out a little. Of course, \nyou’ve never " +
                        "been much of a cat person. \n\n" +
                        "You notice that Mallory seems to be getting more and more gaunt by the day, and though it worries you a little, he insists that " +
                        "it’s nothing to be concerned about, so you keep \nyour mouth shut. Besides, no one else in the manor seems to be worried. Overall," +
                        " you and Mallory have become fast friends.\n\n" +
                        "Your fifth night there, however, as the two of you are about to part ways and go to bed, he stops you, gently grabbing you by the arm." +
                        " There are tears in his eyes, and he seems \nto take a moment to gather himself before speaking.\n\n" +
                        "All he says is, 'I’ll miss you when we’re finally on our feet.'\n\nWhat do you do?");
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
        ui.choice1.setText(">");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.position1 = "goToSleep";
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

        ui.choice1.setText(" > ");
        ui.choice2.setText(" ");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.position1 = "goToSleep";
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
                "You push the issue out of your mind as the old man turns to you, 'If you’re going to be staying here,' he says, gesturing lazily with his fork," +
                " 'there are a few rules you’re going \nto have to follow.'\n\n" +
                "Here, he pauses, looking at you expectantly as if to make sure you’re still on board.\n\n" +
                "Not entirely sure what kind of response he’s looking for, you nod.\n\n" +
                "Apparently, that was the right response, because the old man grins as he continues, 'Things here run on a tight shift during work hours, but " +
                "when you’re not working, your time is \nyour own to do as you please. You’ll be paid by the hour for every task you complete around the Manor. " +
                "You’re allowed to take days off whenever you need, no questions asked-'\n\n" +
                "At this, Mallory scoffs quietly. The old man doesn’t seem to notice, but you catch the butler throwing a warning glance towards the boy. \n\n" +
                "'-Any locked or boarded up doors are to stay that way and under no circumstances are you to go into the herb garden next to the kitchen. " +
                "Above all, you are never allowed to go down \ninto the cellar, no matter why, lest you wish for your time here to end. Do you understand?'\n\n" +
                "'Yes, sir,' is all you can manage. There’s a heaviness to the air that you didn’t expect to feel over dinner, and instinct " +
                "dictates that you respond as succinctly as possible. \n\n" +
                "The old man’s grin widens, 'Then welcome to Huxley Manor!' he exclaims, the heaviness of the mood suddenly dissipating.\n\n" +
                "'It’s a wonderful place to be,' the butler adds, 'and if you have any questions at all, feel free to ask me.'\n\n" +
                "The old man nods approvingly, and dinner continues rather normally.\n\n" +
                "Once everyone has finished eating and the table is cleared, the old man takes you upstairs and shows you to your bedroom on the top floor," +
                " 'This is where you’ll be sleeping for the \nrest of your time here. Mallory’s room is across the hall, and mine is the one next to yours, " +
                "so if you need anything, you know where to go.'\n\n" +
                "You nod, and the old man turns to leave before stopping himself, 'Oh, and just as a heads up, the cat tends to be a little loud at night," +
                " so I suggest you keep your door closed,' \nhe chuckles, 'You know how cats are.'\n\n" +
                "After that, he says goodnight, and you open the door to your room. It’s small, but comfortable, with a desk on one wall," +
                " a bed on the other, and beside that, a closet. A few tears \ncome to your eyes as you realize you’ll be sleeping in a proper bed tonight." +
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
                " shiny puddle of something at the bottom, but the base of the steps is too dark to \nsee what it is. It’s probably " +
                "just water, you tell yourself; an old place like this is bound to have leaks.\n\n" +
                "The sudden crash of china on wood jolts your attention to what you assume is the dining room. The old man quickly " +
                "moves to see what happened, gesturing for you to follow.\n\n" +
                "As you enter the room, the cat bolts past you into an entrance that likely leads to the kitchen, clearly scared by the crash." +
                " A moment later, a finely-dressed man with white gloves \nemerges from the same entrance with a broom and dustpan, immediately crouching " +
                "down and beginning to clean up the shards. \n\n" +
                "Near the dining table, apologizing profusely with the broken glass at his feet stands a boy who couldn't be more than 19 or 20. An odd relief" +
                " seems to momentarily wash over him \nwhen he sees you enter, though it’s quickly replaced by his original apprehension as the old man" +
                " approaches him.\n\n" +
                "Neither one speaks, though through eye-contact alone, it seems that in seconds an entire conversation takes place. The boy's posture shifts " +
                "fearfully as the old man’s brow furrows, \nthen after a quick, wide-eyed shake of the head from the boy, both relax as if the situation " +
                "is resolved.\n\n" +
                "The man with white gloves wordlessly stands when he has finished sweeping up the glass and goes back into the kitchen.\n\n" +
                "A moment later, the cat cautiously slinks back out into the dining room, keeping low as if ready to bolt in case any more plates" +
                " decide to come crashing down.\n\n" +
                "A smile returns to the old man’s face as he introduces you to the boy, who is apparently named Mallory, 'He can be a bit clumsy " +
                "sometimes, but he’s a good worker,' the old man \nsays, jovially clasping a hand onto the shoulders of a very uncomfortable Mallory." +
                " Even so, the boy seems to try to keep up a smile.\n\n" +
                "'I’ll let you two get acquainted,' says the old man, picking up the cat and heading into the kitchen, leaving the two of you alone.\n\n" +
                "Mallory’s gaze seems to linger on you a moment before going back to his task, and though on the surface he seems genuinely happy to meet you," +
                " there is also an almost mournful \ndisposition underneath. He goes back to setting the table before you can dwell on it too long. \n\n");

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
    public void room1() {}
    //room 5a - hallway (a bc floor 1)
    public void room5a() {}

    //room 4 - mallory's bedroom
    public void room4() {}

    /*********** FLOOR TWO *************/
    //room void 5b - hallway (b bc floor 2)
    public void room5b() {}

    //room 9 - chamber (pre fight scene)
    public void room9() {}

    //room 9 - chamber (butler fight scene)
    public void room9Fight(){}

    //room 10 - chamber (potion room)
    public void room10() {}

    //room 8 - hallway/stairway (no method for bathroom, just display)
    public void room8() {}

    /*********** FLOOR THREE *************/
    //room 11 - kitchen
    public void room11() {}

    //room 7 - greenhouse (not labeled on correct floor on pic)
    public void room7() {}

    //hide from old man - crosses rooms, lots of booleans for if potion or spell book
    public void hideFromMan() {}

    /*********** CELLAR *************/
    public void cellar() {}

    //general (if not matches or pet cat - catch all)
    public void generalCellar() {}

    //if matches
    public void matchesCellar() {}

    //if pet cat
    public void petCatCellar() {}

}