package package1;

public class VisibilityManager 
{
	//Menaxhimi per ndryshim te ekranit ose kornizes
   UserInterface ui;
		
		//Konstruktori
   public VisibilityManager(UserInterface userInterface) 
   {
   	
      ui = userInterface;
   	
   }
   public void showTitleScreen() 
   {
   	//p�r t� shfaqur  titullin ne  ekran
      ui.titleNamePanel.setVisible(true);
      ui.startButtonPanel.setVisible(true);
   	//Fsheh titullin e lojes
      ui.mainTextPanel.setVisible(false);
      ui.choiceButtonPanel.setVisible(false);
      ui.playerPanel.setVisible(false);
   }
	
   public void titleToHouse() 
   {
   	//p�r t� fshehur  titullin ne  ekran
      ui.titleNamePanel.setVisible(false);
      ui.startButtonPanel.setVisible(false);
   	//Shfaqe titullin e lojes
      ui.mainTextPanel.setVisible(true);
      ui.choiceButtonPanel.setVisible(true);
      ui.playerPanel.setVisible(true);
   }	
}
