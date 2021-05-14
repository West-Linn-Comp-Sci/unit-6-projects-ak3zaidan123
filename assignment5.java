
/**
 * Write a description of class assignment5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class assignment5
{
    public static String findMin(ArrayList<ArrayListsP> list){
     int min = 100;
     for(int i=0;i<list.size(); i++){
         if(ArrayListsP.get(i).getAge< min){
             min=ArrayListsP.get(i).getAge;
    }
  }
  returm ArrayListsP.getName(indexOf(min));
}
}