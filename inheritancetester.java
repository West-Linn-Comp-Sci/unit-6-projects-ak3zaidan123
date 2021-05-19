
/**
 * Write a description of class inheritancetester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class inheritancetester extends engine
{
    private void main(String[] args) {
     inheritancetester myCar = new inheritancetester();
     myCar.pulledover();
     myCar.getColor();
     System.out.println("The car has" + super.horsepower + "horsepower");
    }
    public static void inheritancetester(String[] args){    //polymorphism
        Car b = new Car();
        b.honk();
    }
}
