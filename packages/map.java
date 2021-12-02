package packages;

public class map {

    UI ui;

    public map(UI userInterFace) {
        ui = userInterFace;

    }

    public void showTiltleScreen() {
        //you this to access the title name panel in the UI class
        // this show the title screen
        ui.titleName.setVisible(true);
        ui.startingButton.setVisible(true);

        //At the same time it is to hide game screen stop
        // this mean
        ui.mainText.setVisible(false);
        ui.chooseButton.setVisible(false);
        ui.playerPanel.setVisible(false);

    }

    public void theMansion() {
        //you this to access the title name panel in the UI class
        // this hide the title screen
        ui.titleName.setVisible(false);
        ui.startingButton.setVisible(false);

        //At the same time it is to show game screen
        // this mean
        ui.mainText.setVisible(true);
        ui.chooseButton.setVisible(true);
        ui.playerPanel.setVisible(true);
    }
}
