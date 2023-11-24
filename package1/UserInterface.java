package package1;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import package1.Loja.ChoiceHandler;

//Ne kete klase kemi bere butonat,dritaren , panelin etj.
public class UserInterface 
{	
   JFrame window;
   JPanel titleNamePanel, startButtonPanel, mainTextPanel, choiceButtonPanel, playerPanel; //paneli  per titullin ,butonat ,tekstin 
   JLabel titleNameLabel, hpLabel, hpNumberLabel, treasureLabel, treasureNameLabel;  //JLabel per me shfaqe tekstin ne panel 
   JButton startButton, choice1, choice2, choice3, choice4;
   JTextArea mainTextArea;
   Font titleFont = new Font("Algerian", Font.PLAIN, 65);
   Font normalFont= new Font("Times New Roman", Font.PLAIN, 26);
 	
   public void createUserInterface(ChoiceHandler cHandler)
   {
   	//Dritarja fillestare e lojes 
      window = new JFrame();
      window.setSize(800, 600);
      window.setTitle("AdventureGame");
      window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      window.getContentPane().setBackground(new Color(58, 95, 120));
      window.setLayout(null);
      window.setVisible(true);
   	
   	//Titulli i ekranit 
      titleNamePanel = new JPanel();
      titleNamePanel.setBounds(100, 100, 600, 500);
      titleNamePanel.setBackground(new Color(58, 95, 120));
      titleNameLabel = new JLabel("Adventure Game");
      titleNameLabel.setForeground(Color.black);
      titleNameLabel.setFont(titleFont);
      titleNamePanel.add(titleNameLabel);
      window.setVisible(true);
      
      startButtonPanel = new JPanel();
      startButtonPanel.setBounds(300, 400, 200, 100);
      startButtonPanel.setBackground(new Color(58, 95, 120));
      startButton = new JButton(" FILLO ");
      window.setVisible(true);
     
      startButton.setBackground(new Color(58, 95, 120));
      startButton.setForeground(Color.white);
      startButton.setFont(normalFont);
      startButton.setFocusPainted(false);
      startButton.addActionListener(cHandler);
      startButton.setActionCommand("start");
      startButtonPanel.add(startButton); //shfaq butonin
      window.setVisible(true);
  
      window.add(titleNamePanel);
      window.add(startButtonPanel);
      window.setVisible(true);
   	
   	//Teksti kryesror i lojes 
      mainTextPanel = new JPanel();
      mainTextPanel.setBounds(100, 100, 600, 250);
      mainTextPanel.setBackground(new Color(58, 95, 120));
   	window.add(mainTextPanel);
   	window.setVisible(true);

      mainTextArea = new JTextArea("Ky eshte teksti kryesor");
      mainTextArea.setBounds(100, 100, 600, 250);
      mainTextArea.setBackground(new Color(58, 95, 120));
      mainTextArea.setForeground(Color.white);
      mainTextArea.setFont(normalFont);
      mainTextArea.setLineWrap(true);
      mainTextArea.setWrapStyleWord(true);
      mainTextArea.setEditable(false);
      mainTextPanel.add(mainTextArea);
   	window.add(mainTextArea);
   	window.setVisible(true);

      // Shfaqja e kater butonave ne loje
      choiceButtonPanel = new JPanel();
      choiceButtonPanel.setBounds(250, 350, 300, 150);
      choiceButtonPanel.setBackground(new Color(58, 95, 120));
      choiceButtonPanel.setLayout(new GridLayout(4, 1));
      window.add(choiceButtonPanel);
   	
      choice1 = new JButton(" choice1 ");
      choice1.setBackground(new Color(58, 95, 120));
      choice1.setForeground(Color.white);
      choice1.setFont(normalFont);
      choice1.setFocusPainted(false);
      choice1.addActionListener(cHandler);
      choice1.setActionCommand("c1");
      choiceButtonPanel.add(choice1); 
   	
      choice2 = new JButton(" choice1 ");
      choice2.setBackground(new Color(58, 95, 120));
      choice2.setForeground(Color.white);
      choice2.setFont(normalFont);
      choice2.setFocusPainted(false);
      choice2.addActionListener(cHandler);
      choice2.setActionCommand("c2");
      choiceButtonPanel.add(choice2);
   	
      choice3 = new JButton(" choice1 ");
      choice3.setBackground(new Color(58, 95, 120));
      choice3.setForeground(Color.white);
      choice3.setFont(normalFont);
      choice3.setFocusPainted(false);
      choice3.addActionListener(cHandler);
      choice3.setActionCommand("c3");
      choiceButtonPanel.add(choice3);
   	
      choice4 = new JButton(" choice1 ");
      choice4.setBackground(new Color(58, 95, 120));
      choice4.setForeground(Color.white);
      choice4.setFont(normalFont);
      choice4.setFocusPainted(false);
      choice4.addActionListener(cHandler);
      choice4.setActionCommand("c4");
      choiceButtonPanel.add(choice4);
    
      // teksti i energjise dhe thesarit ne loje
      playerPanel = new JPanel();
      playerPanel.setBounds(100, 15, 600, 50);
      playerPanel.setBackground(new Color(58, 95, 120));
      playerPanel.setLayout(new GridLayout(1, 4));
      window.add(playerPanel);
   	
      hpLabel = new JLabel("Energjia: ");
      hpLabel.setFont(normalFont);
      hpLabel.setForeground(Color.black);
      playerPanel.add(hpLabel);
      hpNumberLabel = new JLabel();
      hpNumberLabel.setForeground(Color.black);
      hpNumberLabel.setFont(normalFont);
      playerPanel.add(hpNumberLabel);
      
      treasureLabel = new JLabel("Thesari:");
      treasureLabel.setForeground(Color.black);
      treasureLabel.setFont(normalFont);
      playerPanel.add(treasureLabel);
      treasureNameLabel = new JLabel();
      treasureNameLabel.setForeground(Color.black);// Ngjyra e tekstit ,te  Thesari : Monedha ku shkrun
      treasureNameLabel.setFont(normalFont);
      playerPanel.add(treasureNameLabel);
      window.add(mainTextPanel);
      window.setVisible(true);
   }
}