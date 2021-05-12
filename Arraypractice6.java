
/**
 * Write a description of class Arraypractice6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Arraypractice6
{
    public static void main(String args[]){
    int[][] arr = {{1,2},{3,5}};
    int[] total = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {

    for (int k = 0; k < arr[i].length; k++) {
           total[i] += arr[i][k];
    }
    }
    System.out.println(Arrays.toString(total));
   }
}

