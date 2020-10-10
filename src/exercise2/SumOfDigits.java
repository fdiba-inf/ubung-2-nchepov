package exercise2;
import java.util.Scanner;
public class SumOfDigits {
   public static void main(String[] args) {
          
     Scanner input = new Scanner(System.in);
         System.out.println(" Number is: ");
      int number =  input.nextInt();
      int digit1=number%10; //56 6
      int number2=number/10;//5
      int digit2=number2%10;//3
     int digit3=number2/10;//2
      
      System.out.println(digit1+digit2+digit3);

   }
}
