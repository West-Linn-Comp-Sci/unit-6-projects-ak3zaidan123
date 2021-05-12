
/**
 * Write a description of class Arraypractice5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

    public class Arraypractice5{
   public static void main(String args[]){
      int temp, size;
      int array[] = {10, 20, 25, 63, 96, 57};
      size = array.length;

      for(int i = 0; i<size; i++ ){
         for(int j = i+1; j<size; j++){
            if(array[i]>array[j]){
               temp = array[i];
               array[i] = array[j];
               array[j] = temp;
            }
         }
      }
      int x;
      x = array[0] %2;
      if(x==0){
      System.out.println("Smallest element of the array is:: "+array[0]);
    }
  } 
}

