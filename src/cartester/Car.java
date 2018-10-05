/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cartester;

/**
 *
 * @author toluo7449
 */
public class Car {
     private String make, model,color;
     private int year,price,seat;
     public Car() {
            make = "Handa";
            model = "";
            seat = 5;
            color = "white";
            year = 2011;
            price = 25000;
                 }
     public Car(String make1, String model1,String color1,int year1, int price1,
             int seat1) {
        make = make1;
        model = model1;
        color = color1;
        year = year1;
        seat = seat1;
        price = price1;
      }
     public Car(String make1, String model1,String color1,int seat1) {

        make = make1;
        model = model1;
        color = color1;
        seat = seat1;
        year = (int) (2005+Math.random() *13 ) + 1;
        price = (int) (29000+Math.random() * 3000) + 1;
      }
     public void honkthehorn(){
         System.out.println("Dooo~~! Doooo~~!");
     }
      public String toString() {
        String output = "Make: " + make + "\n";
        output += "Model: " + model + "\n";
        output += "Color: " + color + "\n";
        output += "Year: " + year + "\n";
        output += "Seat: " + seat + "\n";
        output += "Price: " + price + "\n";

        return output;
    }
}


