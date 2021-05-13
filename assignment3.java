
/**
 * Write a description of class assignment3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class assignment3
{
    public static int findPosition(int keyValue, ArrayList<Integer>myArray)
{
for(int i = 0; i < myArray.size(); i++)
if(myArray.get(i) == keyValue)
return i;
else
return -1;
}
}

