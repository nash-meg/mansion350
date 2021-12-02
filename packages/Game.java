package packages;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game {

    TitleScreenHandler handlder = new TitleScreenHandler();

    UI ui = new UI(); // sent this to the constructor in the story class method
    map st = new map(ui);

    public static void main(String[] arg) {
        new Game();
    }

    public Game() {
        // Game calls this createUI(handlder) method then call st.showTiltleScreen()
        ui.createUI(handlder);
        st.showTiltleScreen();

    }

    public class TitleScreenHandler implements ActionListener {

        public void actionPerformed(ActionEvent event) {

            String makeChoice = event.getActionCommand();// if you click on choice 1 then the setActionCommand will be called on put into makeChoice.

            switch (makeChoice) {
                case "Start": st.theMansion(); break;
                case "c1": break;
                case "c2": break;
                case "c3": break;


            }
        }
    }
}



