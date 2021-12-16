package packages;

import javax.swing.*;
import java.awt.*;

public class UI {

    JFrame gameWindow;



    JButton startButton, choice1, choice2, choice3, choice4, choice5;
    JTextArea mainTextArea;
    JPanel titleName , startingButton, mainText, chooseButton, ImagePanel;
    JLabel titleLabel, ImageLabel;
    Font titleFont = new Font("MS Gothic", Font.BOLD,50);
    Font subFont = new Font("MS Gothic", Font.PLAIN,30);
    Font buttonFont = new Font("MS Gothic", Font.BOLD,15);
    Font font = new Font("Courier", Font.PLAIN,15);
    ImageIcon image;



    public void createUI(Game.TitleScreenHandler handler){
        gameWindow = new JFrame(); //initialize window
        gameWindow.setSize(1365, 730);
        gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // terminate game window
        gameWindow.getContentPane().setBackground(Color.black);	//set the color of the window
        gameWindow.setLayout(null);


        //title  name panel
        titleName  = new JPanel();
        titleName.setBounds(180, 200, 1000, 400);
        titleName.setBackground(Color.black);
        titleLabel = new JLabel("Sinister Happenings at Huxley Manor");
        titleLabel.setForeground(Color.white);
        titleLabel.setFont(titleFont);
        titleName.add(titleLabel);

        //Panel for the starting button ....backdrop
        startingButton = new JPanel();
        startingButton.setBounds(560, 400, 200, 100);
        startingButton.setBackground(Color.black);
        //Create a JButton for the start button
        startButton = new JButton("START");
        startButton.setBackground(Color.black);
        startButton.setForeground(Color.white);
        startButton.setFont(subFont);
        startButton.addActionListener(handler); // when you click the START button it caller the handler
        startButton.setActionCommand("Start");
        startButton.setFocusPainted(false);
        startingButton.add(startButton);
        gameWindow.add(titleName); //add to panel
        gameWindow.add(startingButton);

        // panel area that holds the main text message
        mainText = new JPanel();
        mainText.setBounds(100, 75, 650, 700);
        mainText.setBackground(Color.black);
        gameWindow.add(mainText);
        // this is for the main text message that display on the panel area
        mainTextArea = new JTextArea("This is the main text area. This game is going to be great. I'm sure of it.");
        mainTextArea.setBounds(25, 200, 650, 450);
        mainTextArea.setBackground(Color.black);
        mainTextArea.setForeground(Color.white);
        mainTextArea.setFont(font);
        mainTextArea.setLineWrap(true);
        mainTextArea.setWrapStyleWord(true);
        mainTextArea.setEditable(false);
        mainText.add(mainTextArea);

        //Panel so that you can choose a button to make a choice
        chooseButton = new JPanel();
        chooseButton.setBounds(850, 500, 400, 150);
        chooseButton.setBackground(Color.black);
        chooseButton.setLayout(new GridLayout(5,1));


        choice1 = new JButton("choice 1");
        choice1.setBackground(Color.black);
        choice1.setForeground(Color.white);
        choice1.setFont(buttonFont);
        choice1.setFocusPainted(false);
        choice1.addActionListener(handler); // when you click the START button it caller the handler
        choice1.setActionCommand("c1");  // the make the difference for each buttons
        chooseButton.add(choice1); // when you click the START button it caller the handler
        choice2 = new JButton("choice 2");
        choice2.setBackground(Color.black);
        choice2.setForeground(Color.white);
        choice2.setFont(buttonFont);
        choice2.setFocusPainted(false);
        choice2.addActionListener(handler); // when you click the START button it caller the handler
        choice2.setActionCommand("c2");
        chooseButton.add(choice2); // when you click the START button it caller the handler
        choice3= new JButton("choice 3");
        choice3.setBackground(Color.black);
        choice3.setForeground(Color.white);
        choice3.setFont(buttonFont);
        choice3.setFocusPainted(false);
        choice3.addActionListener(handler); // when you click the START button it caller the handler
        choice3.setActionCommand("c3");
        chooseButton.add(choice3); // when you click the START button it caller the handler
        choice4= new JButton("choice 4");
        choice4.setBackground(Color.black);
        choice4.setForeground(Color.white);
        choice4.setFont(buttonFont);
        choice4.setFocusPainted(false);
        choice4.addActionListener(handler);// when you click the START button it caller the handler
        choice4.setActionCommand("c4");
        chooseButton.add(choice4);
        choice5 = new JButton("choice 5");
        choice5.setBackground(Color.black);
        choice5.setForeground(Color.white);
        choice5.setFont(buttonFont);
        choice5.setFocusPainted(false);
        choice5.addActionListener(handler);// when you click the START button it caller the handler
        choice5.setActionCommand("c5");
        chooseButton.add(choice5); //
        gameWindow.add(chooseButton);


        ImagePanel = new JPanel();
        ImagePanel.setBounds(950, 40, 189, 400);
        ImagePanel.setBackground(Color.black.brighter());
        gameWindow.add(ImagePanel);

        ImageLabel = new JLabel();

       //image = new ImageIcon(".//mansion Game//Bedroom(1).jpg");


        ImageLabel.setIcon(image);
        ImagePanel.add(ImageLabel);


        gameWindow.setVisible(true); // to see the window created


    }



}

