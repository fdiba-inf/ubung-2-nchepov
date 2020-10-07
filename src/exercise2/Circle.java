package exercise2;
import java.util.Scanner;
public class Circle {
   public static void main(String[] args) {
     
     
     Scanner input = new Scanner(System.in);
          System.out.println(" R is: ");
      double r =  input.nextDouble(); 
  
  double PI = 3.14;
 double Circumference = 2*PI*r;
 double Area = PI*r*r;
 System.out.println("Circumference is: " + Circumference);
 System.out.println("Area is: " + Area);
      
    
   }
}
