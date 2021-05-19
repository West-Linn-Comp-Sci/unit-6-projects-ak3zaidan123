
/**
 * Write a description of class car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Car extends vehicle {
  String modelName = "Mustang gt"; 
  int year = 1967;
  int rimsize = 22; 
  int y = getintaveragerimsize();
  public void honk() {                    
    System.out.println("beep, beep");
    }
  
  public static int compare (int rimsize,int y  ) {        //comparable method
    return (rimsize < y) ? -1 : ((rimsize == y) ? 0 : 1);
  }
  public String engine(){
      return "3.8 liter v8 engine";
    }
  public String getColor(){  //overide car color from yellow to white
        return "white";
    }
  private static void main(String[] args) {

    Car myCar = new Car();
    
    myCar.honk();
    
    System.out.println(myCar.color +""+myCar.brand + " " + myCar.modelName);
    
    System.out.println("you were speeding");
    myCar.pulledover();
  }
  int horsepower = 560;
  public int getinthorsepower(){
      return horsepower;
  }
  String enginetype = "supercharged 6 cylinder";
  int torque = 433;
}
