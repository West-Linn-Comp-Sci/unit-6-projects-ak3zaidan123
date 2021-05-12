/**
 * 
 *
 * Ahmed
 * april 28
 */
import java.util.Scanner;
public class counter
{
   public static void main(String[] args)
   {
       {
            int x = 1 ;
            int[] count = new int[10];
            Scanner first = new Scanner(System.in);
            System.out.println("Enter numbers between 0 and 100 and then type 111 to finish and create the chart");
            while( x < 1000) { 
            
            int response = first.nextInt();
            int num = response;
            if (num >= 1 && num <= 10)
                count[0]++;
            if (num >= 11 && num <= 20)
               count[1]++;
            if (num >= 21 && num <= 30)
               count[2]++;
            if (num >= 31 && num <= 40)
               count[3]++;
            if (num >= 41 && num <= 50)
               count[4]++;
            if (num >= 51 && num <= 60)
               count[5]++;
            if (num >= 61 && num <= 70)
               count[6]++;
            if (num >= 71 && num <= 80)
               count[7]++;
            if (num >= 81 && num <= 90)
               count[8]++;
            if (num >= 91 && num <= 100)
               count[9]++;
            if (num<0 || num>100)
               System.out.println("invalid: enter a number between 0 and 100");
            if (num == 111)
               x+=1000;
            }
            System.out.println("1-10:     "+count[0]);
            System.out.println("11-20:    "+count[1]);
            System.out.println("21-30:    "+count[2]);
            System.out.println("31-40:    "+count[3]);
            System.out.println("41-50:    "+count[4]);
            System.out.println("51-60:    "+count[5]);
            System.out.println("61-70:    "+count[6]);
            System.out.println("71-80:    "+count[7]);
            System.out.println("81-90:    "+count[8]);
            System.out.println("91-100:   "+count[9]);
          
        }
   }
}