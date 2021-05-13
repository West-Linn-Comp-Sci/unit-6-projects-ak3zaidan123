
/**
 * Write a description of class assignment1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class assignment1
{
    public static void main(String[] args) {
   int[] array = {0, 5, 6, 0, 0, 2, 5};
   int len = 0;
   for (int i=0; i<array.length; i++){
       if (array[i] != 0)
                len++;
   }
   int [] newArray = new int[len];
   for (int i=0, j=0; i<array.length; i++){
       if (array[i] != 0) {
                newArray[j] = array[i];
                j++;
       }
   }
  }
}
