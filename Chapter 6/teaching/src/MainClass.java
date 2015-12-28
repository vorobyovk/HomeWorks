import java.util.Scanner;

public class MainClass {

 public static void main(String[] args) throws NegativeAgeExcaption {
     System.out.println("Please enter your age: ");
     final Scanner scaner = new Scanner(System.in);
     final String userInput = scaner.next();

     try {
      final int userAge = Integer.parseInt(userInput);
      if (userAge<0){
       throw new NegativeAgeExcaption(userAge);
      }
      System.out.println("You age is: " + userAge);
     } catch (NumberFormatException ex) {
      System.out.printf("Please enter NUMBER.");
     }
 }

}
