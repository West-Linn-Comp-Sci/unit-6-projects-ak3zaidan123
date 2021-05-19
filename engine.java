
/**
 * Write a description of class engine here.
 *
 * Ahmed
 * @version (a version number or a date)
 */
public class engine extends Car{
    public String engine(){ // overide
      return "3.5 liter v6 engine";
   }
    int horsepower = 480;
    int z = getinthorsepower();
     public static int compare (int z,int horsepower  ) {        //comparable method
    return (horsepower < z) ? -1 : ((horsepower == z) ? 0 : 1);
   }
   private void main(String[] args) {
   System.out.println("engine type:" +super.enginetype);
   int s = super.torque -45;
   System.out.println("torque:" +super.torque);
   }
}