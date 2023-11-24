package package1;
import package2.Thesari;
import package2.Thesari_Monedha;
import package2.Thesari_Ari;

public class Story 
{
//Te gjithe tekstin dhe informacionet gjate lojes
	
   Loja game;
   UserInterface ui;
   VisibilityManager vm;
   Lojtari player = new Lojtari();
   Thesari treasure;
	
	
   public Story(Loja g, UserInterface userInterface, VisibilityManager vManager ) 
   {
      game = g;
      ui = userInterface;
      vm = vManager;
   }
   
   public void defaultSetup() //vlerat e paracaktuar per lojtarin,thesarin
   {   	
      player.hp = 10; 
      ui.hpNumberLabel.setText(" " + player.hp); // shfaqe numrin energjise te lojtarit ne ekran
   	
      player.currentTreasure =  new Thesari_Monedha();
      ui.treasureNameLabel.setText(player.currentTreasure.name); //shfaqe emrin e thesarit ne ekrant te lojes
   }
   
   public void selectPosition(String nextPosition) 
   {
   	
      switch(nextPosition) 
      {
         case "houseGate" : portaShtepise(); 
            break; 
         case "informacione" : informacione(); 
            break; 
         case "hyrDhomat" : hyrDhomat(); 
            break; 
         case "zgjedhDhomat" : zgjedhDhomat(); 
            break; 
         case "sallon" : sallon(); 
            break;
         case "kuzhine" : kuzhine(); 
            break;
         case "dhomagjumit" : dhomagjumit(); 
            break;
         case "fitorja" : fitorja(); 
            break;
         case "humbja" : humbja(); 
            break;
      
         case "toTitle" : toTitle(); 
            break;
         case "toTitle1" : toTitle1(); 
            break;
      }
   }
	
	//Metodat per zgjedhjen e opcioneve ne butona  
   public void portaShtepise() 
   {
      ui.mainTextArea.setText("Ju jeni ne hyrje te shtepise, cfare doni te beni?");
   	
      ui.choice1.setText("Informacione");
      ui.choice2.setText("Hyr ne njeren dhome");
      ui.choice3.setText("Zgjedhi dhomat");
      ui.choice4.setText("");
   	
      game.nextPosition1 = "informacione" ;
      game.nextPosition2 = "hyrDhomat";
      game.nextPosition3 = "zgjedhDhomat";
      game.nextPosition4 = "";
   
   }
   
   public void informacione()
   {
      ui.mainTextArea.setText("Ne kete loje gjenden disa dhoma, disa prej dhomave kane ushqim (rritet numri energjise), thesare ose asgje (humbet numri energjise). Fitoni nese i gjeni gjithe thesaret, humbeni nese ju humbet krejt energjia!");
      ui.choice1.setText(">");
      ui.choice2.setText("");
      ui.choice3.setText("");
      ui.choice4.setText("");
   	
      game.nextPosition1 = "houseGate" ;
      game.nextPosition2 = "";
      game.nextPosition3 = "";
      game.nextPosition4 = "";
   }
	
   public void hyrDhomat() 
   {
      ui.mainTextArea.setText("Ne kete dhome nuk gjendet asgje, humbet 1 pike! ");
      player.hp = player.hp-1;
      ui.hpNumberLabel.setText("" +player.hp);
      ui.choice1.setText(">");
      ui.choice2.setText("");
      ui.choice3.setText("");
      ui.choice4.setText("");
   	
      game.nextPosition1 = "houseGate";
      game.nextPosition2 = "";
      game.nextPosition3 = "";
      game.nextPosition4 = "";
      if(player.hp == 0) {
         ui.mainTextArea.setText("Energjia juaj u hargjua, ju humbet lojen! ");
         game.nextPosition1 = "humbja";
         game.nextPosition2 = "";
         game.nextPosition3  = "";
         game.nextPosition4 = "";
      }
   }
   
   public void zgjedhDhomat() 
   {
      ui.mainTextArea.setText("Ju jeni ne koridore, ku deshironi te shkoni?");
   	
      ui.choice1.setText("Sallon");
      ui.choice2.setText("Kuzhine");
      ui.choice3.setText("Hyrja e Shtepise");
      ui.choice4.setText("Dhoma e gjumit");
   	
      game.nextPosition1 = "sallon"; 
      game.nextPosition2 = "kuzhine"; 
      game.nextPosition3 = "houseGate"; 
      game.nextPosition4 = "dhomagjumit"; 
   }
	
   public void sallon() 
   { 
      ui.mainTextArea.setText("Ketu gjetet ushqime, Energjia juaj rritet per 2!");
      player.hp = player.hp + 2;
      ui.hpNumberLabel.setText("" +player.hp);
      ui.choice1.setText("Shko ne hyrje te shtepise");
      ui.choice2.setText("");
      ui.choice3.setText("");
      ui.choice4.setText("");
   	
      game.nextPosition1 = "zgjedhDhomat"; 
      game.nextPosition2 = "";
      game.nextPosition3 = "";
      game.nextPosition4 = "";
      if(player.hp >20) {
         ui.mainTextArea.setText("Fituat lojen!");
         game.nextPosition1 = "fitorja";
         game.nextPosition2 = "";
         game.nextPosition3  = "";
         game.nextPosition4 = "";
      }
   }
   
   public void kuzhine() 
   { 
      ui.mainTextArea.setText("Ketu keni gjetur thesar: nje kuti me Ari!");
      player.currentTreasure = new Thesari_Ari();
      ui.treasureNameLabel.setText(player.currentTreasure.name);
   	
      ui.choice1.setText("Dil nga dhoma");
      ui.choice2.setText("");
      ui.choice3.setText("");
      ui.choice4.setText("");
   	
      game.nextPosition1 = "zgjedhDhomat";
      game.nextPosition2 = "";
      game.nextPosition3 = "";
      game.nextPosition4 = "";
   }
   
   public void dhomagjumit() 
   {
      ui.mainTextArea.setText("Ketu keni gjetur ushqim dhe thesar: nje kuti me Monedha, energjia juaj rritet per 1!");
      player.hp = player.hp + 1;
      ui.hpNumberLabel.setText("" +player.hp);
      player.currentTreasure = new Thesari_Monedha();
      ui.treasureNameLabel.setText(player.currentTreasure.name);
   	
      ui.choice1.setText("Dil nga dhoma");
      ui.choice2.setText("");
      ui.choice3.setText("");
      ui.choice4.setText("");
   	
      game.nextPosition1 = "zgjedhDhomat";
      game.nextPosition2 = "";
      game.nextPosition3 = "";
      game.nextPosition4 = "";
   	
      if(player.hp >20) {
         ui.mainTextArea.setText("Fituat lojen!");
         game.nextPosition1 = "fitorja";
         game.nextPosition2 = "";
         game.nextPosition3  = "";
         game.nextPosition4 = "";
      }
   }
	
   public void fitorja() 
   {
      ui.mainTextArea.setText("");
      ui.choice1.setText("Luaj perseri");
      ui.choice2.setText("");
      ui.choice3.setText("");
      ui.choice4.setText("");
   		
      game.nextPosition1 = "toTitle";
      game.nextPosition2 = "";
      game.nextPosition3 = "";
      game.nextPosition4 = "";  	
   }
   
   public void humbja() 
   {
      if(player.hp==0) {
         ui.mainTextArea.setText("FUNDI!");
         ui.choice1.setText("Luaj perseri");
         ui.choice2.setText("");
         ui.choice3.setText("");
         ui.choice4.setText("");
      	
         game.nextPosition1 = "toTitle1";
         game.nextPosition2 = "";
         game.nextPosition3 = "";
         game.nextPosition4 = "";
      }
   }
	
	
	//Titulli kur lojtari e humb apo fiton lojen 
   public void toTitle() 
   {
      defaultSetup (); 
      vm.showTitleScreen(); 
   }
   public void toTitle1() 
   {
      defaultSetup (); 
      vm.showTitleScreen(); 
   }
}
