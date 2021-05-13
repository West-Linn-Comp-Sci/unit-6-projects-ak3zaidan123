
/**
 * Write a description of class assignment2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class assignment2
{
public static int countLetters(ArrayList<String>myList)
{
int count1 = 0;
for(String s : myList)
count1+= s.length();
return count1;
}
}
