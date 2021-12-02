package packages;

import javax.swing.*;
import java.awt.*;

public class UI {
    JFrame gameWindow;
    //Container hold;
    JButton startButton, choice1, choice2, choice3, choice4;
    JTextArea mainTextArea;
    JPanel titleName , startingButton, mainText, chooseButton,playerPanel;
    JLabel titleLabel, weapon, weaponName, background ;
    Font titleFont = new Font("Times New Roman", Font.PLAIN,90);
    Font font = new Font("Times New Roman", Font.PLAIN,14);

    //String weaponLabel, position;


    public void createUI(Game.TitleScreenHandler handlder){
        gameWindow = new JFrame(); //initialize window
        gameWindow.setSize(900, 600);
        gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // terminate game window
        gameWindow.getContentPane().setBackground(Color.black);	//set the color of the window
        gameWindow.setLayout(null);
      //  hold = gameWindow.getContentPane();

        //title  name panel
        titleName  = new JPanel();
        titleName.setBounds(100, 100, 600, 150);
        titleName.setBackground(Color.black);
        titleLabel = new JLabel("sPooky Mansion");
        titleLabel.setForeground(Color.white);
        titleLabel.setFont(titleFont);
        titleName.add(titleLabel);
        //Panel for the starting button ....backdrop
        startingButton = new JPanel();
        startingButton.setBounds(300, 400, 200, 100);
        startingButton.setBackground(Color.black);
        //Create a JButton for the start button
        startButton = new JButton("START");
        startButton.setBackground(Color.black);
        startButton.setForeground(Color.white);
        startButton.setFont(font);
        startButton.addActionListener(handlder); // when you click the START button it caller the handler
        startButton.setActionCommand("Start");
        startButton.setFocusPainted(false);
        startingButton.add(startButton);
        gameWindow.add(titleName); //add to panel
        gameWindow.add(startingButton);

        // panel area that holds the main text message
        mainText = new JPanel();
        mainText.setBounds(100, 100, 600, 550);
        mainText.setBackground(Color.black);
        gameWindow.add(mainText);
        // this is for the main text message that display on the panel area
        mainTextArea = new JTextArea("This is the main text area. This game is going to be great. I'm sure of it.");
        mainTextArea.setBounds(100, 500, 600, 250);
        mainTextArea.setBackground(Color.black);
        mainTextArea.setForeground(Color.white);
        mainTextArea.setFont(font);
        mainTextArea.setLineWrap(true);
        mainTextArea.setWrapStyleWord(true);
        mainTextArea.setEditable(false);
        mainText.add(mainTextArea);

        //Panel so that you can choose a button to make a choice
        chooseButton = new JPanel();
        chooseButton.setBounds(800, 410, 250, 150);
        chooseButton.setBackground(Color.black);
        chooseButton.setLayout(new GridLayout(4,1));
        gameWindow.add(chooseButton);

        choice1 = new JButton("choice 1");
        choice1.setBackground(Color.black);
        choice1.setForeground(Color.white);
        choice1.setFont(font);
        choice1.setFocusPainted(false);
        startButton.addActionListener(handlder);; // when you click the START button it caller the handler
        choice1.setActionCommand("c1"); // the make the difference for each buttons
        chooseButton.add(choice1); // when you click the START button it caller the handler
        choice2 = new JButton("choice 2");
        choice2.setBackground(Color.black);
        choice2.setForeground(Color.white);
        choice2.setFont(font);
        choice2.setFocusPainted(false);
        startButton.addActionListener(handlder); // when you click the START button it caller the handler
        choice2.setActionCommand("c2");
        chooseButton.add(choice2);; // when you click the START button it caller the handler
        choice3= new JButton("choice 3");
        choice3.setBackground(Color.black);
        choice3.setForeground(Color.white);
        choice3.setFont(font);
        choice3.setFocusPainted(false);
        startButton.addActionListener(handlder); // when you click the START button it caller the handler
        choice3.setActionCommand("c3");
        chooseButton.add(choice3); // when you click the START button it caller the handler
        choice4= new JButton("choice 4");
        choice4.setBackground(Color.black);
        choice4.setForeground(Color.white);
        choice4.setFont(font);
        choice4.setFocusPainted(false);
        startButton.addActionListener(handlder);// when you click the START button it caller the handler
        choice4.setActionCommand("c4");
        chooseButton.add(choice4); //

        playerPanel = new JPanel();
        playerPanel.setBounds(100, 25, 600, 70);
        playerPanel.setBackground(Color.black);
        playerPanel.setLayout(new GridLayout(1,4));
        gameWindow.add(playerPanel);
        weapon = new JLabel("Weapon:");
        weapon.setForeground(Color.white);
        weapon.setFont(font);
        playerPanel.add(weapon);
        weaponName = new JLabel();
        weaponName.setForeground(Color.white);
        weaponName.setFont(font);
        playerPanel.add(weaponName);

        gameWindow.setVisible(true); // to see the window created


    }



}

