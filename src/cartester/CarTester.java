/*
 * Sean Luo 05/10/2018
 * CarTester.java
 * This progrem calculates the CarTester.
 */


package cartester;

/**
 *
 * @author toluo7449
 */
public class CarTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Car car1 = new Car("Elantra","Small","blue",2011,5,18000);
       Car car2 = new Car("Hyundai","small","black",5);
       Car car3 = new Car();
       
       System.out.println(car1.toString());
       System.out.println("--------------------------");

       System.out.println(car2.toString());
       System.out.println("--------------------------");

       System.out.println(car3);
       System.out.println("--------------------------");

      car1.honkthehorn();
       
    }
    
}
