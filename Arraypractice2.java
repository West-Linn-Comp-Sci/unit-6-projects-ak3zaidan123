
/**
 * Write a description of class Arraypractice2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Arraypractice2
{
    static int max1(int[][] score) {
    int max = score[0][0]; // set initial value to the first index in array
    for (int i = 0; i < score.length; i++) { // cycle through row
        for (int j = 0; j < score[i].length; j++) { // cycle through colmn
            if (score[i][j] > max) { // if the index value is greater than largest number
                max = score[i][j]; // make it the new index value
            }
        }
    } return max;
  }
}

