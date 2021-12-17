package packages;

public class map {

    UI ui;

    public map(UI uInterFace) {
        ui = uInterFace;
    }

    public void showTitleScreen() {

        /** Use this to access the title name panel in the UI class
        * shows the title screen */
        ui.titleName.setVisible(true);
        ui.startingButton.setVisible(true);

        /** To hide game screen stop */
        ui.mainText.setVisible(false);
        ui.chooseButton.setVisible(false);

    }

    public void toTheMansion() {
        /**This is to access the title name panel in the UI class
         * and hide the title screen*/
        ui.titleName.setVisible(false);
        ui.startingButton.setVisible(false);

        /**This is to show game screen */
        ui.mainText.setVisible(true);
        ui.chooseButton.setVisible(true);

    }
}
