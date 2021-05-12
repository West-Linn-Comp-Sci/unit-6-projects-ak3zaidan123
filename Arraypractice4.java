
/**
 * Write a description of class Arraypractice4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;
public class Arraypractice4 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number for rows: ");
        int rows = input.nextInt();
        System.out.print("Enter a number for columns: ");
        int columns = input.nextInt();
        int[][] array = new int[rows][columns];
        System.out.println("Enter the numbers in array: ");
        for(int i=0 ; i<rows ; i++)
        {
            for(int j=0 ; j<columns ; j++)
            {
                array[i][j] = input.nextInt();
            }
        }
        int rowSum = 0;
        int colSumArr[] = new int[columns];
        for(int i=0 ; i<rows ; i++)
        {
            for(int j=0  ; j<columns ; j++)
            {
                rowSum = rowSum + array[i][j];
                colSumArr[j] = colSumArr[j] + array[i][j];
                System.out.print(array[i][j] + " , ");
            }
            System.out.println( " ave=" + (double)rowSum/columns);
            rowSum = 0;
        }
        System.out.printf("aver=");
        for(int i=0;i<columns;i++){
            if(i!=columns -1)
                System.out.print((double)colSumArr[i]/rows + ", ");
            else
                System.out.print((double)colSumArr[i]/rows);
        }
     }
}
