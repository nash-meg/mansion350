package packages;

import javax.swing.*;
import java.awt.*;

public class UI {
    JFrame gameWindow;
    Container hold;
    JPanel titleName , startingButton, mainText, chooseButton,playerPanel;
    JLabel titleLabel, weapon, weaponName, background ;
    Font titleFont = new Font("Times New Roman", Font.PLAIN,90);
    Font font = new Font("Times New Roman", Font.PLAIN,14);

    JButton startButton, choice1, choice2, choice3, choice4;
    JTextArea mainTextArea;
    int playerHp;

    public void createUI(){
        gameWindow = new JFrame(); //initialize window
        gameWindow.setSize(900, 600);
        gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // terminate game window
        gameWindow.getContentPane().setBackground(Color.black);	//set the color of the window
        gameWindow.setLayout(null);
        gameWindow.setVisible(true);
        //hold = gameWindow.getContentPane();

    }
}
