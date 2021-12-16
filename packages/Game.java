package packages;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game {

    TitleScreenHandler handler = new TitleScreenHandler();// instantiate
    UI ui = new UI(); // sent this to the constructor in the story class method
    map m = new map(ui);
    Story st = new Story(this,ui, m); //this mean this Game class
    String position1, position2, position3, position4, position5;

    public static void main(String[] arg) {
        new Game();
    }

    public Game() {
        // Game calls this createUI(handler) method then call st.showTitleScreen()
        ui.createUI(handler);
        m.showTitleScreen();
    }

    public class TitleScreenHandler implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            String makeChoice = event.getActionCommand();// if you click on choice 1 then the setActionCommand will be called on put into makeChoice.
            // eg. when the click on a choice 1 it will send this st.choosePosition(position1) to  choosePosition method in the Story class
            switch(makeChoice) {
                case "Start":
                    m.toTheMansion();
                    st.theMansion();
                    break;
                case "c1":
                    st.choosePosition(position1);
                    break;
                case "c2":
                    st.choosePosition(position2);
                    break;
                case "c3":
                    st.choosePosition(position3);
                    break;
                case "c4":
                    st.choosePosition(position4);
                    break;
                case "c5":
                    st.choosePosition(position5);
                    break;
            }
        }
    }
}




