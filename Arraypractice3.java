
/**
 * Write a description of class Arraypractice3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Arraypractice3
{
     public static int[] rowSums(int[][] arr2D){
        int total2 = 0;
        int a[] = new int[arr2D.length];
        for(int x=0; x<arr2D.length; x++){
            for(int n=0; n<arr2D[x].length;n++){
                arr2D[x][n] = total2;
                a[x] = a[x] + total2;
            }
        }
        return a;
    }
}

