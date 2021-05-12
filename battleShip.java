
/**
 * Write a description of class b here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Arrays;
public class battleShip
        {
             private int multi;
            private String[] battleField;  
            public battleShip(){
    battleField = new String[7];
      for(int i = 0; i<battleField.length; i++){
          battleField [i] = "[ ]";
    }
   }
        public String placement(int x){
            multi = x;
            return battleField[multi]= "[O]";
            
        }
        public String hit(int x){
            multi = x;
            if(battleField[x].contains("[O]")){
                return battleField[multi]= "[H]";
            }
            else{
              return battleField[multi]="[X]";
             
            }
        }
        public int score(int x){
            multi = x;
            if(battleField[x].contains("[@]")){
                return 1;
            }
            return 0;
        }
        public void getbattleShip(){
            System.out.println(Arrays.toString(battleField));
        }
}

