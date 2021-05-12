
/**
 * Write a description of class bb here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class battleshipClient
{
    public static void main(String[] args){
        
      boolean gameTime = true;  
        int Fplacement;
        int fireGuess;
   Scanner input1 = new Scanner(System.in);
   Scanner input2 = new Scanner(System.in);
   battleShip game = new battleShip();
   game.getbattleShip();
   
   System.out.println("Would you like to play a game of battleship?(Y/N)");
   String anwser = input1.nextLine();
   int quit = 0;
   while (quit == 0){
       if(anwser.equals("N")){
       quit +=1;
       System.out.println("You quit! Hope you're more fun another day;(");
    }
       else if(anwser.equals("Y")){
         System.out.println("Let play, Game on!!");  
        }
      
   for(int i =0;  i< 2; i++){
       if(anwser.equals("Y")){
            System.out.println("Place your ships anywhere you would like!(0-6) ");
            Fplacement=input1.nextInt();
            game.placement(Fplacement);
            i++;
        }
   }
   game.getbattleShip();
   for(int i =0; i<3; i++){
       if(anwser.equals("Y")){
       System.out.println("Place your guesses to sink my ships! You get THREE trys!");
       fireGuess = input2.nextInt();
       game.hit(fireGuess);
       game.getbattleShip();
    }
    }
      int result = 0;
      for (int i =0; i<7; i++){
          
          result = result + game.score(i);
        
        }
        
    
  if(result ==2){
      System.out.println("Good game!! You won and destroyed my ship");
     
    }
    else if(result != 2 && anwser.equals("Y")){
        System.out.println("You did not sink my ships! Try again next time!");
    }
    quit +=1;
}
}
}


