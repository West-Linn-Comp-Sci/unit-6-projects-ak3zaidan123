
/**
 * Write a description of class assignment4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class assignment4
{
    public static ArrayList<String> parseIntoArrayList(String input){
        ArrayList<String> letters = new ArrayList<String>();
        for(int i=0; i< input.length(); i++){
            letters.add(input.substring(i,i+1));
        }
        return letters;
        
    }
}
