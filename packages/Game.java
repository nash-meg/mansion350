package packages;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game {

    /******** Instantiate the UI  and map class across *********
     * Sent this to the constructor in the story class method
     *
     * */

    UI ui = new UI();
    map m = new map(ui);
    Story st = new Story(this,ui, m); //this mean this Game class
    String position1, position2, position3, position4, position5;

    /******** Instantiate handler for button choices **********/

    TitleScreenHandler handler = new TitleScreenHandler();//
    public static void main(String[] arg) {
        new Game();
    }

    public Game() {

        /** Call method inside this UI across ***/
        ui.createUI(handler);
        m.showTitleScreen();
    }

    public class TitleScreenHandler implements ActionListener {

        public void actionPerformed(ActionEvent event) {

            // if you click on choice 1 then the setActionCommand will be called on put into makeChoice.
            String makeChoice = event.getActionCommand();


            /** 'eg.' when the click on a choice 1
             * it will send this st.choosePosition(position1)
             * to  choosePosition method in the Story class */

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





