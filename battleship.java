/**
 * Write a description of class battleship here.
 * Ahmed
 * may5
 */
import java.util.ArrayList;
public class battleship
{
  private int randomNumber;
  private int index;
  private String[] ocean;
  public battleship(){
    ocean = new String[7];
      for(int i = 0;i<7;i++){
          ocean [i] = "[]";
    }
   }
    public String shot (int a){
    index = a;
    if(ocean[a].contains("[0]")){
        return ocean[index] = "[0]";
    }
    else {
        return ocean[index] = "[0]";
    }
  }
  public void getbattleship(){
      System.out.println(ocean);
    }
     public String place (int a){
        index =  a;
        return ocean[index]="[0]";
  }
}