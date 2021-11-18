import java.awt.*;

public class mansion {
    player you = new player();
    int choice = -2;
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
        choice = you.playerChoice();
        if (choice == 1) { //continue
            prologue();
        } else if (choice == 2) { //exit
            //leave game
        }
    }

    /*********** PROLOGUE *************/
    //prologue method - mostly text, there are options but they don't affect anything
    //show choices in history if time?
    public void prologue() {
        System.out.println("The man’s hand feels heavy on your back as you are guided up the driveway " +
                "against your better judgement. A large mansion  - which you’re quite sure is the only dwelling" +
                " for miles in this area - looms before you, decorated impeccably for Halloween. Cornstalks lean up " +
                "against the pillars supporting the upper balconies, pumpkins and hay bales are scattered tastefully " +
                "over the front porch, and a black cat sits somewhat ominously in the window by the door - though you’re " +
                "sure that the cat is more of a year-round affair. \n\n" +
                "You stop a moment, simply staring and struggling to take in the fact that this is all real. Less than " +
                "an hour ago, you had been on the streets, trying to scrounge whatever money you could to save up for a " +
                "proper coat for the coming winter. Less than an hour ago, an old man whose name you still don’t know had offered " +
                "you a job and housing with the only condition being that you came to live with him in his 'humble manor,' as he" +
                " had called it. Less than an hour ago, against your better judgement and with nothing but your life to lose, " +
                "you had said yes. \n\n" +
                "You’re not sure why you’d said yes. You know that you’re what they call 'high risk'. You know that a man" +
                " like this has the money to cover up your disappearance if it gets noticed. Hell, when you’d asked his name, " +
                "the man had simply stated, 'Names are unimportant,' before ushering you into his car. But something deep within " +
                "you, which you decided to call a gut feeling, told you that this was the right move, and that going with him would" +
                " help.\n\n" +
                "'It’s beautiful, isn’t it?' The old man’s question snaps you back to the present. \n\n" +
                "'Yes,' you mutter quietly, too awestruck to properly compliment the place.\n\n" +
                "The old man smiles, 'Welcome to Huxley Manor,' he says with a sweeping gesture before" +
                " guiding you to the thick oaken front door.\n\n");
        System.out.println("Please choose an option below:\n");
        System.out.println("1 - Go inside\n");
        if (you.playerChoice() > -1){
            System.out.println("The old man claps twice and the doors slowly creak open to reveal an ornate hallway" +
                    " with beautiful vintage-looking wallpaper and dark wooden floors. As he guides you through, you notice" +
                    " dozens of oil paintings, all of which look to be extremely old. A painting of a man in what looks to be renaissance" +
                    " garb, staring intensely outward with long black hair catches your eye.\n\n" +
                    "The cat brushes past you, pulling your attention away from the painting, and you look down " +
                    "to see that you’re walking past a staircase to what you assume is the basement. The stairs, though still beautiful, " +
                    "are clearly not as well-kept as the rest of the house, and the walls seem to get dustier the further down they go. " +
                    "There’s a part of you that wonders what’s down there - what secrets this mansion might hide.  \n\n" );
            System.out.println("What would you like to do?\n");
            System.out.println("1 - Ask about the painting\n" +
                    "2 - Ask about the stairs\n");
            choice = you.playerChoice();
            if (choice == 1){
                System.out.println("The old man smiles as he turns to the portrait, an odd sentimentality washing over him.\n\n" +
                        "'He was a very good friend of mine.' he sighs, clearly beginning to reminisce, 'He had this commissioned " +
                        "shortly before he-'\n\n" +
                        "The old man stops, taking a moment to collect himself before continuing, 'He passed shortly after this was" +
                        " painted,' he huffs distantly, 'If it weren’t for him, none of this would have been possible,' the man gestures to " +
                        "the mansion around him.\n\n " +
                        "You nod solemnly. There’s a part of you that wonders how he died so young - he couldn’t have been more than 30 in the " +
                        "picture - and what he did to help the old man. Even so, you know better than to ask. If he had wanted to say, he would " +
                        "have. The old man lingers on the painting a moment more, his smile widening, before seeming to snap back to the present and " +
                        "guiding you into the dining room.\n\n" +
                        "You enter to see a boy who couldn’t be more than 19 or 20 setting the table. \n\n" +
                        "The old man snaps his fingers and the boy is suddenly at attention, nearly dropping the plates\n\n" +
                        "'This is Mallory,' the old man says, 'I found him in much the same situation I found you, and he’s " +
                        "been living and working here until he finds his feet, isn’t that right Mallory?'\n\n" +
                        "Mallory nods nervously, 'Yes, sir.'\n\n" +
                        "The old man laughs and jovially clasps a hand on Mallory’s shoulder, 'He’s a bit shy, but he’ll warm up to you in no time,' he remarks.\n\n" +
                        "Mallory smiles at you, nodding more genuinely this time, before the old man says something about allowing you to get acquainted before" +
                        " going into the kitchen and leaving the two of you alone.\n\n" +
                        "Mallory’s gaze seems to linger on you a moment before going back to his task, and though on the surface he " +
                        "seems genuinely happy to meet you, there is also an almost mournful disposition underneath it all. \n\n");
            }
            else if(choice == 2){
                System.out.println("The old man chuckles a little, 'The only things of interest that I keep down there are my old typewriters.'\n\n" +
                        "A pause \n\n" +
                        "'And the bodies, of course.' He stops a moment, staring at you rather intensely. \n\n" +
                        "Shit. Was that a joke or a threat?\n\n" +
                        "The silence is broken with a hearty laugh from the old man, which you hesitantly join.\n\n" +
                        "'I apologize,' the old man says, still laughing, 'My humor is sometimes...A bit crass.' \n\n" +
                        "He continues to chuckle to himself as you hazard a glance down the stairs. There appears to be a" +
                        " shiny puddle of something at the bottom, but the base of the steps is too dark to see what it is. It’s probably " +
                        "just water, you tell yourself; an old place like this is bound to have leaks.\n\n" +
                        "The sudden crash of china on wood jolts your attention to what you assume is the dining room. The old man quickly " +
                        "moves to see what happened, gesturing for you to follow.\n\n" +
                        "As you enter the room, the cat bolts past you into an entrance that likely leads to the kitchen, clearly scared by the crash." +
                        " A moment later, a finely-dressed man with white gloves emerges from the same entrance with a broom and dustpan, immediately crouching " +
                        "down and beginning to clean up the shards. \n\n" +
                        "Near the dining table, apologizing profusely with the broken glass at his feet stands a boy who couldn't be more than 19 or 20. An odd relief" +
                        " seems to momentarily wash over him when he sees you enter, though it’s quickly replaced by his original apprehension as the old man" +
                        " approaches him.\n\n" +
                        "Neither one speaks, though through eye-contact alone, it seems that in seconds an entire conversation takes place. The boy's posture shifts " +
                        "fearfully as the old man’s brow furrows, then after a quick, wide-eyed shake of the head from the boy, both relax as if the situation " +
                        "is resolved.\n\n" +
                        "The man with white gloves wordlessly stands when he has finished sweeping up the glass and goes back into the kitchen.\n\n" +
                        "A moment later, the cat cautiously slinks back out into the dining room, keeping low as if ready to bolt in case any more plates" +
                        " decide to come crashing down.\n\n" +
                        "A smile returns to the old man’s face as he introduces you to the boy, who is apparently named Mallory, 'He can be a bit clumsy " +
                        "sometimes, but he’s a good worker,' the old man says, jovially clasping a hand onto the shoulders of a very uncomfortable Mallory." +
                        " Even so, the boy seems to try to keep up a smile.\n\n" +
                        "'I’ll let you two get acquainted,' says the old man, picking up the cat and heading into the kitchen, leaving the two of you alone.\n\n" +
                        "Mallory’s gaze seems to linger on you a moment before going back to his task, and though on the surface he seems genuinely happy to meet you," +
                        " there is also an almost mournful disposition underneath. He goes back to setting the table before you can dwell on it too long. \n\n");
            }
            System.out.println("What would you like to do?\n");
            System.out.println("1 - Ask Mallory how he likes working at Huxley Manor\n" +
                    "2 - Offer to help set the table" +
                    "3 - Stand there awkwardly");
            choice = you.playerChoice();
            if(choice == 1){
                System.out.println("Mallory smiles dryly, and you suddenly notice exactly how tired he is, the bags under his eyes being heavy and " +
                        "thick. Too heavy for someone his age.\n\n" +
                        "He locks eye contact with you, his gaze requesting that you hold it as he speaks, 'I wouldn’t trade working here for the world!" +
                        " I love the work I do, and he’s been extremely generous to let me stay here while I save up to get a place of my own.'\n\n" +
                        "Despite the cheery tone, you feel a shiver of unease run down your spine as he talks. The words he’s saying are loud and " +
                        "enthusiastic, and if the only thing in this interaction had been his voice, you may have actually believed him. But his eyes, " +
                        "which have not faltered since locking with yours… \n\n" +
                        "God, his eyes...\n\n" +
                        "They tell a different story entirely. As he speaks, his brows knit together in a look of pain, despair, and exhaustion. " +
                        "Regret drips from every movement he makes as he shakes his head while discussing the old man’s 'generosity.'\n\n" +
                        "When he’s finished speaking, Mallory’s expression quickly switches to a smile, and he goes back to his work as if nothing happened.\n\n" +
                        "You simply stand there, watching him in bewilderment, completely unsure of how to respond. Either Mallory always talks with his facial" +
                        " expressions wildly mismatching his words, or he was trying to warn you of something. Or perhaps you’ve misinterpreted the" +
                        " interaction entirely.\n\n" +
                        "You glance around the dining room, with its chandelier hanging from the ceiling and ornate wallpaper smoothly covering its " +
                        "walls. As Mallory sets the antique wooden table you notice its intricately-carved embellishments curling over each corner as " +
                        "if it were being held up by many human hands. Why would a man like him help a person like you? What motivation could someone of this caliber " +
                        "have for altruism? \n\n" +
                        "You shake your head. This man was willing to help you when no one else would, and if he plans to exploit you, at the very least" +
                        " you’ll have a roof over your head. At worst, you figure you could live here until things get bad. Besides, it’s not like an old" +
                        " man like the one in the kitchen could beat you in a fight.\n\n" +
                        "You hear the old man’s deep laughter echo from the other room, accompanied by another. He doesn’t sound evil. You sigh to yourself." +
                        " You’ve always been paranoid, and at this point, you decide it’s best not to look a" +
                        " gift-horse in the mouth. \n\n");

            }
            else if(choice == 2){
                System.out.println("Mallory glances at you with what appears to be genuine fear in his eyes, quickly shaking his head, 'I’ve got it!' he says quickly," +
                        " seemingly loud enough for those in the kitchen to hear.\n\n" +
                        "Then he flashes you a small smile, nearly whispering, 'Thank you, though,' before returning to his work.\n\n");
            }
            else if (choice == 3) {
                System.out.println("You stand there in a thick silence, neither of you moving to speak. After a moment, you watch as Mallory goes back " +
                        "to setting the table. He doesn’t move the way you expect him to. Every gesture he makes is stiff, and even jerky at times. The " +
                        "look on his face is hollow, even for doing so mundane a task as setting the table. You feel bad for thinking it, but his actions" +
                        " almost remind you of a deftly-controlled marionette without the strings. You chide yourself for the comparison. " +
                        "He’s probably just tired. \n\n");
            }
            System.out.println("You watch as Mallory finishes setting the table, and a man with white gloves walks out from the kitchen," +
                    " seemingly to check that things are going smoothly. \n\n" +
                    "He glances at you in surprise as if not expecting to see anyone other than Mallory in the dining room. His eyes flash " +
                    "for a moment with an emotion that is covered up too quickly to read, and instead he flashes you a smile, 'I’m sorry, " +
                    "I didn’t realize we had company or I would have greeted you sooner! I’m the butler here at the Manor.'\n\n" +
                    "He smiles, extending a hand for you to shake. \n\n");
            System.out.println("What do you do?\n");
            System.out.println("1 - Shake his had\n" +
                    "2 - Don't shake his hand\n");
            choice = you.playerChoice();
            if(choice == 1){
                System.out.println("You accept the handshake to find that the butler’s grasp is much firmer than you expected. He didn’t " +
                        "strike you as the type to hold onto a handshake for dear life.\n\n" +
                        "But...no...\n\n" +
                        "You realize that he’s actually holding your hand rather gently, yet his hand is much more...solid than it should be." +
                        " Like the muscles in his hand are packed just a little too densely beneath his skin. \n\n" +
                        "You decide it’s nothing to worry about as you release each others’ hands.\n\n" +
                        "'So I’d take it you’re coming to work here?' he asks jovially.\n\n" +
                        "You nod, 'That’s the plan, at least!'\n\n" +
                        "The butler smiles, though the smile takes a moment to reach his eyes as he glances at Mallory before" +
                        " seeming to return to the conversation, 'It’s a pleasure to have you here. I can’t wait to show you the ropes.'\n\n");
            }
            else if(choice == 2){
                System.out.println("You glance apologetically at the butler’s hand, not entirely willing to shake it. He holds his hand" +
                        " out for a moment longer, but after a tight-lipped nod from you, he realizes that you’re not going to shake it " +
                        "and instead withdraws his hand and nods back.\n\n");
            }
            System.out.println("Suddenly, the butler snaps to attention, dutifully walking into the kitchen as if called, though" +
                    " neither you nor Mallory seem to have heard anything of the sort.\n\n" +
                    "You’re about to let him walk into the other room when you realize something, calling after him, 'Wait-'\n\n" +
                    "The butler stops and turns to you.\n\n" +
                    "'I didn’t catch your name,' you say, somewhat nervously. Usually, you wouldn’t ask, but you feel bad just referring to him as 'butler'. \n\n" +
                    "He gives a small huff of amusement before responding, 'Names are unimportant,' he shrugs, smiling solemnly, 'I’m just the butler.'\n\n" +
                    "With that, he turns and walks back into the kitchen.\n\n" +
                    " After a moment, he and the old man emerge with various steaming plates making up an extravagant meal, all of which are arranged" +
                    " on the table. After a moment, the butler pulls out a chair for the old man, and Mallory sits across from him. Then," +
                    " the butler gestures for you to sit, seemingly allowing you to choose your spot.\n\n");
            System.out.println("Where would you like to sit?\n");
            System.out.println("1 - Sit next to the old man\n" +
                    "2 - sit next to Mallory\n");
            choice = you.playerChoice();
            if(choice == 1){
                System.out.println("The butler stays off to the side as you take up a seat next to the old man, who flashes" +
                        " you a toothy grin as you sit down beside him. If you didn’t know any better, you would have thought you saw a " +
                        "glimmer of pride in his eyes. \n\n" +
                        "'Eat as much as you like,' he says warmly, passing you a piece of the main dish.\n\n" +
                        "You smile thankfully, filling your plate as the others begin to eat.\n\n");
            }
            else if(choice == 2){
                System.out.println("Mallory pulls out the chair beside him, flashing you a small smile as you move to sit next to him. " +
                        "You see the butler smile as well as you sit down and Mallory passes you the tray of mashed potatoes, " +
                        "'Eat,' he says cheerily, 'you’ll need it.' \n\n");
            }
            System.out.println("Surprisingly, the only people at dinner are you, Mallory, and the old man, with the butler standing attentively off to the side.\n" +
                    "\n" +
                    " You realize with a little unease that these might be the only people in the mansion. Not that you have much experience with the habits of " +
                    "the wealthy, but you expected him to have at least a few more staff to help things get done around the place. Then again, perhaps that’s why he " +
                    "hired you. If it really is his goal to help people get back on their feet, it would make sense that if a few of them left at once, he would be " +
                    "short-staffed.\n\n" +
                    "You push the issue out of your mind as the old man turns to you, 'If you’re going to be staying here,' he says, gesturing lazily with his fork," +
                    " 'there are a few rules you’re going to have to follow.'\n\n" +
                    "Here, he pauses, looking at you expectantly as if to make sure you’re still on board.\n\n" +
                    "Not entirely sure what kind of response he’s looking for, you nod.\n\n" +
                    "Apparently, that was the right response, because the old man grins as he continues, 'Things here run on a tight shift during work hours, but " +
                    "when you’re not working, your time is your own to do as you please. You’ll be paid by the hour for every task you complete around the Manor. " +
                    "You’re allowed to take days off whenever you need, no questions asked-'\n\n" +
                    "At this, Mallory scoffs quietly. The old man doesn’t seem to notice, but you catch the butler throwing a warning glance towards the boy. \n\n" +
                    "'-Any locked or boarded up doors are to stay that way and under no circumstances are you to go into the herb garden next to the kitchen. " +
                    "Above all, you are never allowed to go down into the cellar, no matter why, lest you wish for your time here to end. Do you understand?'\n\n" +
                    "'Yes, sir,' is all you can manage. There’s a heaviness to the air that you didn’t expect to feel over dinner, and instinct " +
                    "dictates that you respond as succinctly as possible. \n\n" +
                    "The old man’s grin widens, 'Then welcome to Huxley Manor!' he exclaims, the heaviness of the mood suddenly dissipating.\n\n" +
                    "'It’s a wonderful place to be,' the butler adds, 'and if you have any questions at all, feel free to ask me.'\n\n" +
                    "The old man nods approvingly, and dinner continues rather normally.\n\n" +
                    "Once everyone has finished eating and the table is cleared, the old man takes you upstairs and shows you to your bedroom on the top floor," +
                    " 'This is where you’ll be sleeping for the rest of your time here. Mallory’s room is across the hall, and mine is the one next to yours, " +
                    "so if you need anything, you know where to go.'\n\n" +
                    "You nod, and the old man turns to leave before stopping himself, 'Oh, and just as a heads up, the cat tends to be a little loud at night," +
                    " so I suggest you keep your door closed,' he chuckles, 'You know how cats are.'\n\n" +
                    "After that, he says goodnight, and you open the door to your room. It’s small, but comfortable, with a desk on one wall," +
                    " a bed on the other, and beside that, a closet. A few tears come to your eyes as you realize you’ll be sleeping in a proper bed tonight." +
                    " You change into a set of pajamas folded neatly atop the bed and crawl beneath the covers.\n\n");
            System.out.println("What would you like to do?\n");
            System.out.println("1 - Go to sleep\n");

            choice = you.playerChoice();

            System.out.println("Over the next few days, you begin to get your bearings at Huxley Manor, and you manage to fall into a bit of a routine. " +
                    "The work isn’t too hard, and Mallory and the butler are kind enough. The cat also seems to like you, though you’d be lying " +
                    "if you said its tendency to sit and stare from the corner of the room doesn’t freak you out a little. Of course, you’ve never " +
                    "been much of a cat person. \n\n" +
                    "You notice that Mallory seems to be getting more and more gaunt by the day, and though it worries you a little, he insists that " +
                    "it’s nothing to be concerned about, so you keep your mouth shut. Besides, no one else in the manor seems to be worried. Overall," +
                    " you and Mallory have become fast friends.\n\n" +
                    "Your fifth night there, however, as the two of you are about to part ways and go to bed, he stops you, gently grabbing you by the arm." +
                    " There are tears in his eyes, and he seems to take a moment to gather himself before speaking.\n\n" +
                    "All he says is, 'I’ll miss you when we’re finally on our feet.'\n\n");
            System.out.println("What do you do?\n");
            System.out.println("1 - Tell him you'll miss him too\n" +
                    "2 - Stay silent\n");
            choice = you.playerChoice();
            if(choice ==  1){
                System.out.println("You nod, taking hold of his hand, 'I’ll miss you too.' \n\n" +
                        "It’s a short response, but you mean every word of it. \n\n" +
                        "Mallory smiles, tightening his grip on your hand, 'We’ll have to keep in touch.'\n\n" +
                        "You nod. Though his eyes are watery with unshed tears, he seems content.\n\n");
            }
            if(choice == 2){
                System.out.println("He waits a moment, seemingly expecting you to say something, but when you don’t respond, " +
                        "he nods and seems to give you an understanding smile. Mallory draws in a breath, looking you over and" +
                        " looking around as if savoring the moment as he clearly fights back tears.\n\n");
            }

            System.out.println("His gaze lingers on you for a moment longer before he lets go and, giving one final nod, " +
                    "turns to go to his room, clearly wiping tears from his eyes as he walks.\n\n" +
                    "For some reason, that felt like goodbye. \n\n" +
                    "Does he plan on-\n\n" +
                    "You shake your head. You’re sure he’s fine. Too tired to think about it now, you go " +
                    "into your room and prepare to go to sleep.\n\n");
        }
    }

    /*********** FLOOR ONE *************/
    //room 1 - your bedroom
    public void room1() {
        System.out.println("You start in your room.\n" +
                "What do you want to do? (Type a number below, or type 0 for the map).");
        System.out.println("1 - Leave through the door.\n" +
                "2 - Search the floor.\n" +
                "3 - Go back to sleep");
        choice = you.playerChoice();
        if (choice == 1) { //leave
            room5a();
        } else if (choice == 2) { //search floor
            System.out.println("It’s a floor.");
            //redisplay options - idk how?
        } else if (choice == 3) { //back to sleep
            System.out.println("You can’t sleep. This is a horror game.");
            //redisplay options
        } else if (choice == 0) { //map
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
        choice = you.playerChoice();
        if (choice == 1) { //down stairs
            room5b();
        } else if (choice == 2) { //left door
            System.out.println("This door is locked, you can't get in.");
            //redisplay options
        } else if (choice == 3) { //door ahead
            room4();
        } else if (choice == 4) { //boared door
            System.out.println("You can’t bust through this door.");
            //redisplay options
        } else if (choice == 0) { //map
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
        choice = you.playerChoice();
        if (choice == 1) { //bed
            System.out.println("Where specifically would you like to search?");
            System.out.println("1 - Under the pillow.\n" +
                    "2 - Under the mattress.");
            choice = you.playerChoice();
            if (choice == 1) { //pillow
                System.out.println("There is nothing under here.");
                //redisplay options (idk if do bed options or room4 options)
            } else if (choice == 2) { //mattress
                System.out.println("You find some iron shackles with what looks like blood on " +
                        "the wrists. They are bolted to the floor underneath the bed.");
                //redisplay options (idk if do bed options or room4 options)
            }
        } else if (choice == 2) { //closet
            System.out.println("You see two items, which would you like to examine?");
            System.out.println("1 - A pair of shoes.\n" +
                    "2 - A worn coat.");
            choice = you.playerChoice();
            if (choice == 1) { //shoes
                System.out.println("Description about the shoes.");
                System.out.println("Would you like to put them on?");
                System.out.println("1 - Yes.\n" +
                        "2 - No.");
                choice = you.playerChoice();
                if (choice == 1) { //yes
                    System.out.println("You are now wearing shoes.");
                    player.setShoes();
                    //redisplay options (idk if do closet options or room4 options)
                } else if (choice == 2) { //no
                    System.out.println("You did not put on the shoes.");
                    //redisplay options (idk if do closet options or room4 options)
                }
            } else if (choice == 2) { //coat
                System.out.println("Description about the coat.");
                System.out.println("Would you like to put it on?");
                System.out.println("1 - Yes.\n" +
                        "2 - No.");
                choice = you.playerChoice();
                if (choice == 1) { //yes
                    System.out.println("You are now wearing the coat.");
                    player.setCoat();
                    //redisplay options (idk if do closet options or room4 options)
                } else if (choice == 2) { //no
                    System.out.println("You did not put on the coat.");
                    //redisplay options (idk if do closet options or room4 options)
                }
            }
        } else if (choice == 3) { //desk
            System.out.println("You see two items, which would you like to examine?");
            System.out.println("1 - A picture.\n" +
                    "2 - A book.");
            choice = you.playerChoice();
            if (choice) == 1) { //picture
                System.out.println("Description about the picture: health and date.");
                //redisplay options (idk if do desk options or room4 options)
            } else if (choice == 2) { //book
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
        choice = you.playerChoice();
        if (choice == 1) { //duck
            System.out.println("Oh my god you ducked just in time! What now???");
            System.out.println("1 - Crawl to open door!\n" +
                    "2 - Crawl to closed door!");
            choice = you.playerChoice();
            if (choice == 1) { //open door
                System.out.println("pitch black, recovery moment to breath, hand reaches " +
                        "out in front of you in hallway light, you rocket upright, hitting the " +
                        "lightswitch, see only a cat in the room with hUGEEE shadow (kinda butler-like?)");
                System.out.println("How do you react to the cat?");
                System.out.println("1 - Kick the cat away.\n" +
                        "2 - Reach out to pet the cat.\n" +
                        "3 - Ignore the cat.");
                choice = you.playerChoice();
                if (choice == 1) { //kick
                    player.setKickCat();
                    room9();
                } else if (choice == 2) { //pet
                    player.setPetCat();
                    room9();
                } else if (choice == 3) { //ignore
                    player.setIgnoreCat();
                    room9();
                }
            } else if (choice == 2) { //closed door
                System.out.println("Why would you crawl here?? The door doesn't open!" +
                        " Crawl back to the open door.");
            }
        } else if (choice == 2) { //doors
            System.out.println("Death by blades");
            //death screen, exit
        } else if (choice == 3) { //run
            System.out.println("Death by blades");
            //death screen, exit
        } else if (choice == 0) { //map
            System.out.println("Blades are swinging from the ceiling!! This is no time to look at the map!");
            //redisplay options
        }
    }

    //room 9 - chamber (pre fight scene)
    public void room9() {
        System.out.println("You have made it into some sort of chamber.\n" +
                "What would you like to do? (Type a number below, or type 0 for the map).");
        System.out.println("1 - Explore the bookcase.\n" +
                "2 - Explore the coffee table.\n" +
                "3 - Explore the fireplace.");
        choice = you.playerChoice();
        if (choice == 1) { //bookcase
            System.out.println("You see a book that looks so familiar to the one from Mallory's room.\n" +
                    "What do you do with it?");
            System.out.println("1 - Shove it in your pocket.\n" +
                    "2 - Leave it.");
            choice = you.playerChoice();
            if (choice == 1) { //take
                player.setBook();
                room9Fight();
            } else if (choice == 2) { //leave
                room9Fight();
            }
        } else if (choice == 2) { //coffee table
            System.out.println("You find a lette opener amongst other things.\n" +
                    "What do you do with it?");
            System.out.println("1 - Slide it into your pocket.\n" +
                    "2 - Leave it.");
            choice = you.playerChoice();
            if (choice == 1) { //take
                player.setLetterOpen();
                room9Fight();
            } else if (choice == 2) { //leave
                room9Fight();
            }
        } else if (choice == 3) { //fireplace
            System.out.println("You find a small box of matches atop the fireplace mantle.\n" +
                    "What do you do?");
            System.out.println("1 - Tuck it into your pocket.\n" +
                    "2 - Leave it.");
            choice = you.playerChoice();
            if (choice == 1) { //take
                player.setMatches();
                room9Fight();
            } else if (choice == 2) { //leave
                room9Fight();
            }
        } else if (choice == 0) { //map
            //display map
        }
    }

    //room 9 - chamber (butler fight scene)
    public void room9Fight() {
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
        choice = you.playerChoice();
        if (choice == 1) { //duck
            System.out.println("You're on the floor! What now??");
            System.out.println("1 - Try to crawl away!\n" +
                    "2 - Be scared!");
            if (player.getLetterOpen() ==  true) {
                System.out.println("3 - Use the letter opener!\n"
            }
            choice = you.playerChoice();
            if (choice == 1) { //crawl
                if (player.getPetCat() == true) {
                    System.out.println("The butler thing lets you crawl away, you " +
                            "open the door, he makes eye contact with you, then he " +
                            "walks away, you close the door without a sound");
                    room10();
                } else {
                    System.out.println("Get grabbed, thrown in fire???");
                    //death
                }
            } else if (choice == 2) { //scared
                if (player.getPetCat() == true) {
                    System.out.println("The butler thing hesitates, you hear another " +
                            "sound that clearly sounds like “RUN!” before he goes after you, " +
                            "you scramble towards the door, open it, slam it shut after you go in");
                    room10();
                } else {
                    System.out.println("Neck breaks");
                    //death
                }
            } else if (choice == 3) { //letter opener
                System.out.println("Stab, absorbed into “butler” arm, comes out as claw");
                //death
            }
        } else if (choice) == 2) { //move to side
            System.out.println("What now??");
            System.out.println("1 - Grab some books and throw!\n" +
                    "2 - Grab some books and read the spells!\n" +
                    "3 - Climb the bookshelf!");
            choice = you.playerChoice();
            if (choice == 1) { //throw books
                if (player.getPetCat() == true || player.getIgnoreCat() == true) {
                    System.out.println("The butler thing rips up the books, gets " +
                            "disoriented, you run to the other room");
                    room10();
                } else {
                    System.out.println("Butler gets angry, charges you");
                    //death
                }
            } else if (choice == 2) { //read spells
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
            } else if (choice == 3) { //climb bookshelf
                System.out.println("You fall, hit your head on the coffee table");
                //death
            }
        } else if (choice == 3) { //letter opener
            System.out.println("Okay a letter opener is a good weapon!\n" +
                    "Where do you strike him with it???");
            System.out.println("1 - Aim for the throat!\n" +
                    "2 - Aim for the hand!");
            choice = you.playerChoice();
            if (choice == 1) { //throat
                System.out.println("The butler’s hand grabs you, and slams you into the wall. " +
                        "He crushes you");
                //death
            } else if (choice == 2) { //hand
                //Same death as duck with letter opener
                System.out.println("Stab, absorbed into “butler” arm, comes out as claw");
                //death
            }
        } else if (choice == 0) { //map
            System.out.println("The butler thing is coming at you!! Why are you trying to look at the map?!");
            //redisplay options
        }
    }

    //room 10 - chamber (potion room)
    public void room10() {
        System.out.println("You take a look around and see a room full of potions.\n" +
                "What do you want to do? (Type a number below, or type 0 for the map).");
        System.out.println("1 - Examine the purple potion.\n" +
                "2 - Examine the yellow potion.\n" +
                "3 - Examine a clear, labeled potion.\n" +
                "4 - Examine a clear, unlabeled potion.\n" +
                "5 - Leave, go down the hall.");
        choice = you.playerChoice();
        if (choice == 1) { //purple
            System.out.println("Label faded and says “Sight” in latin - aspectum");
            System.out.println("Do you drink it?");
            System.out.println("1 - Yes.\n" +
                    "2 - No.");
            choice = you.playerChoice();
            if (choice == 1) {
                System.out.println("You turn your head towards the other potions and in " +
                        "the reflection of the liquid, you see the old man on a stairway, " +
                        "blood-covered, humming to himself. He stops, turns around, then " +
                        "goes back down the stairs, you look away");
                player.setPurpPotion();
                System.out.println("You hear some thumping in the room over, so you decide " +
                        "to skert down the hall and keep moving.");
                room8();
            } else if (choice == 2) {
                //redisplay potion options
            }
        } else if (choice == 2) { //yellow
            System.out.println("Label faded and says “Plan B” in cursive");
            System.out.println("Do you drink it?");
            System.out.println("1 - Yes.\n" +
                    "2 - No.");
            choice = you.playerChoice();
            if (choice == 1) {
                System.out.println("It’s acid!");
                //death
            } else if (choice == 2) {
                //redisplay potion options
            }
        } else if (choice == 3) { //clear labeled
            System.out.println("Label faded and says “healing” in latin - sanitatem");
            System.out.println("Do you drink it?");
            System.out.println("1 - Yes.\n" +
                    "2 - No.");
            choice = you.playerChoice();
            if (choice == 1) {
                System.out.println("It's alcohol!");
                //redisplay potion options
            } else if (choice == 2) {
                //redisplay potion options
            }
        } else if (choice == 4) { //clear unlabeled
            System.out.println("There is no label on this bottle.");
            System.out.println("Do you drink it?");
            System.out.println("1 - Yes.\n" +
                    "2 - No.");
            choice = you.playerChoice();
            if (choice == 1) {
                System.out.println("Water, nothing happens");
                //redisplay potion options
            } else if (choice == 2) {
                //redisplay potion options
            }
        } else if (choice == 5) { //leave
            room8();
        }else if (choice == 0) { //map
            //display map
        }
    }

    //room 8 - hallway/stairway (no method for bathroom, just display)
    public void room8() {
        System.out.println("You now walk down the hallway.\n" +
                "What do you want to do? (Type a number below, or type 0 for the map).");
        System.out.println("1 - Try the boarded up door.\n" +
                "2 - Enter the open door.\n" +
                "3 - Go down the stairs.");
        choice = you.playerChoice();
        if (choice == 1) { //boarded door
            System.out.println("You can't break open this door.");
            //redisplay options
        } else if (choice == 2) { //open door
            System.out.println("You walk into a bathroom.\n" +
                    "What would you like to do?");
            System.out.println("1 - Take a piss.\n" +
                    "2 - Leave.");
            choice = you.playerChoice();
            if (choice == 1) { //piss
                System.out.println("You take a much needed piss.");
                //redisplay options
            } else if (choice == 2) { //leave
                //redisplay options
                //if you pick bathroom again, System.out.println(“It’s literally just a bathroom”); and redisplay
            }
        } else if (choice == 3) { //go downstairs
            if (player.getShoes() == true) {
                System.out.println("You hear the thump of your shoes and cringe, " +
                        "hoping he doesn’t hear you clomping down.");
                System.out.println("He kills you at the foot of the stairs.");
                //death
            } else {
                room11();
            }
        } else if (choice == 0) { //map
            //display map
        }
    }

    /*********** FLOOR THREE *************/
    //room 11 - kitchen
    public void room11() {
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
        choice = you.playerChoice();
        if (choice == 1) { //search drawers
            System.out.println("First drawer is an empty utensil drawer. You open the one next to it " +
                    "to find an empty drawer with note that says \"Nice try\"");
            //redisplay options
        } else if (choice == 2) { //pantry
            System.out.println("You open the pantry and see normal food - he likes goldfish too hehe.");
            //redisplay options
        } else if (choice == 3) { //cabinets
            System.out.println("See a skull - have seen the skull before, realize that it was not decorative.");
            //redisplay options
        } else if (choice == 4) { //fridge
            System.out.println("As you reach for the handle, you see bloody handprint on fridge door." +
                    "Realizes cranberry juice is blood (knocked over and dripping on the " +
                    "shelf, thicker/ congealed)");
            //redisplay options
        } else if (choice == 5) { //far door
            room7();
        } else if (choice == 6) { //close door
            System.out.println("This door is very locked, you can't get in.");
            //redisplay options
        } else if (choice == 7) { //next room
            hideFromMan();
        } else if (choice == 0) { //map
            //display map
        }
    }

    //room 7 - greenhouse (not labeled on correct floor on pic)
    public void room7() {
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
    public void hideFromMan() {
        if (player.getPurpPotion() == true) {
            System.out.println("You see an image of the old man going up the stairs " +
                    "toward the kitchen in the mirror.\n" +
                    "QUICK! Choose an option below!\"");
            System.out.println("1 - Hide in the pantry!\n" +
                    "2 - Hide behind the kitchen door!\n" +
                    "3 - Hide in the cupboard under the sink!");
            choice = you.playerChoice();
            if (choice == 1) { //pantry
                System.out.println("You hear him rummaging around, see the shadow of " +
                        "his feet just outside the door, hear door knob jiggle, Meow???, " +
                        "he turns and walks upstairs instead\n");
                System.out.println("You run out, try the front door, hear him coming " +
                        "back downstairs, you run down to the basement/cellar.");
                cellar();
            } else if (choice == 2) { //kitchen door
                System.out.println("Works but needs to be really creepy. Walks very " +
                        "slowly, bends down to get something from drawer, could see you " +
                        "but doesn’t turn head, goes upstairs\n");
                System.out.println("You run out, try the front door, hear him coming " +
                        "back downstairs, you run down to the basement/cellar.");
                cellar();
            } else if (choice == 3) { //under sink
                System.out.println("Death bc cant fit");
                //death
            } else if (choice == 0) { //map
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
            choice = you.playerChoice();
            if (choice == 1) { //hide
                System.out.println("Death bc he’s literally a sorcerer and you’re a normie");
                //death
            } else if (choice == 2) { //book
                System.out.println("Read the spell in front of him. \"You think I’d have a " +
                        "book with spells that work on me? (or something)\", read spell, " +
                        "turns you invisible, book turns to ash in your hands, " +
                        "you run down to the cellar\n");
                cellar();
            } else if (choice == 0) { //map
                System.out.println("Oh my god the old man is coming!! There's no time for the map!!");
                //redisplay options
            }
        }
    }

    /*********** CELLAR *************/
    //need to call player.getMatches() and then player.getPetCat()
    public void cellar() {
        System.out.println("Immediately when you get down off the stairs, you feel your " +
                "socks become soaked with something dark and sticky, and you’re hit with " +
                "a horrible smell that makes your eyes water. As your eyes adjust, you see " +
                "dozens of bodies in various stages of decomposition. At your feet, you see " +
                "the body of the boy from earlier. His eyes are clouded over and his skin is " +
                "so pale it’s almost turned blue. See a light from the boarded up window on " +
                "the door at the other side of the cellar.");
        System.out.println("What would you like to do? Type a number below, or type 0 for the map.");
        System.out.println("1 - Examine body of other boy.\n" +
                "2 - Go towards door.\n" +
                "3 - Hide among the bodies.");
        choice = you.playerChoice();
        if (choice == 1) { //examine the body
            System.out.println("Describe dead body. \"He’s clearly dead, so you decide " +
                    "to stop wasting time\"");
            //redisplay options
        } else if (choice == 2) { //door
            System.out.println("Step over bodies, try door, sorcerer comes down, " +
                    "you hear him come down, your body turns against your will, and " +
                    "you’re looking right at him from across the cellar");
            System.out.println("[villian monologue??]");
            if (player.getMatches() == true) {
                matchesCellar();
            } else if (player.getPetCat() == true) {
                petCatCellar();
            } else {
                generalCellar();
            }
        } else if (choice == 3) { //hide among bodies
            System.out.println("Lay down among the bodies, try not to breath, feel " +
                    "the death, old man makes you stand up magically");
            if (player.getMatches() == true) {
                matchesCellar();
            } else if (player.getPetCat() == true) {
                petCatCellar();
            } else {
                generalCellar();
            }
        } else if (choice == 0) { //map
            //display map
        }
    }

    //general (if not matches or pet cat - catch all)
    public void generalCellar() {
        System.out.println("Old man makes you walk towards him, says something " +
                "about how he almost lost you, and how he had been planning to save " +
                "you for later, but this will do, you feel life get drained out of you, " +
                "vision goes black, death :)");
    }

    //if matches
    public void matchesCellar() {
        System.out.println("Start walking towards him against your will, he’s " +
                "monologuing, vision is fogging up, your hand brushes your pocket " +
                "and you feel the matches\n");
        System.out.println("1 - Use your matches!\n" +
                "2 - Don't use your matches.");
        choice = you.playerChoice();
        if (choice == 1) { //matches
            System.out.println("Struggle to grab them from your pocket, try to light the match, " +
                    "first breaks. Try again?");
            System.out.println("1 - Yes.\n" +
                    "2 - No.");
            choice = you.playerChoice();
            if (choice == 1) { //yes
                System.out.println("Lights, throw it, doesn’t catch. Try again?");
                System.out.println("1 - Yes.\n" +
                        "2 - No.");
                choice = you.playerChoice();
                if (choice == 1) { //yes
                    System.out.println("Lights, throw, flame catches on dead friend’s " +
                            "shirt, quickly spreads to old man’s robe, he bursts into " +
                            "flames eerily fast, the spell breaks and your legs give " +
                            "you, you scramble up, the boards on the door have fallen as " +
                            "the old man screams in agony, the house begins to crumble " +
                            "and you run out the door");
                    if (player.petCat() == true) {
                         System.out.println("see cat.");
                    }
                } else if (choice == 2) { //no
                    System.out.println("Death");
                    //death
                }
            } else if (choice == 2) { //no
                System.out.println("Death");
                //death
            }
        } else if (choice == 2) { //don't matches
            generalCellar();
        } else if (choice == 0) { //map
            System.out.println("Bestie you're time is running out, don't waste it looking at the map.");
            //redisplay options
        }
    }

    //if pet cat
    public void petCatCellar() {
        System.out.println("Turn around and feel yourself being pulled towards the old " +
                "man, struggle against it.\n" +
                "See human butler come quietly down stairs behind him, puts a finger to " +
                "his lips as if to say \"shush\".\n" +
                "Butler snaps old man's neck\n" +
                "Old man crumples to floor, boards on door behind you fall down.\n" +
                "Butler looks at you with a combination of sadness and triumph, weaky " +
                "tells you to go before the whole place collapses, falls to his knees " +
                "then into bodies, dies.\n" +
                "Hear floorboards breaking and start to fall in.\n" +
                "You run out the back door, mansion falls in.\n" +
                "Hear birds chirping, it’s dawn now. You wonder whether it was just a " +
                "few hours or if another whole day has passed.\n" +
                "Run away, and never fully forget this experience.");
    }
}
