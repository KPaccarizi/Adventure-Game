package package1;
import java.awt.event.ActionEvent;


import java.awt.event.ActionListener;


 // Klasa kryesore main

public class Loja 
{
	//Thirrja e klasave
   ChoiceHandler cHandler = new ChoiceHandler();
   UserInterface ui = new UserInterface();
   VisibilityManager vm = new VisibilityManager(ui);
   Story story = new Story(this, ui,vm); // this dmth klasa Story 
	
	//4 buttonat
   String nextPosition1, nextPosition2, nextPosition3 ,nextPosition4;
	
   public static void main(String[] args) 
   {
      new Loja();
   }
   
   public Loja() 
   {   
   //Thirrim metodat 
      ui.createUserInterface(cHandler); 
      story.defaultSetup();
      vm.showTitleScreen();
   }
   
   public class ChoiceHandler implements ActionListener
   {
   	
      public void actionPerformed(ActionEvent event) 
      {
         String yourChoice = event.getActionCommand();
      	
         switch(yourChoice) 
         {
         
            case "start": vm.titleToHouse(); story.portaShtepise();  //thirrja metodave
               break;
            case "c1" : story.selectPosition(nextPosition1);
               break;
            case "c2" : story.selectPosition(nextPosition2); 
               break;
            case "c3" : story.selectPosition(nextPosition3);
               break;
            case "c4" : story.selectPosition(nextPosition4);
               break;
         }
      }
   }
}