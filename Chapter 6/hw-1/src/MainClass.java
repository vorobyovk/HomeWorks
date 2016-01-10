import java.util.Scanner;

public class MainClass {

 public static void main(String[] args) throws FlowerException {

  System.out.println("Please enter a name of you flower.(Rose, Chamomile, Aster, Tulip)");
  final Scanner scaner = new Scanner(System.in);
  final String nameFlower = scaner.next();
  if(nameFlower.equalsIgnoreCase("Rose")){
    System.out.println("ok");
  } else if (nameFlower.equalsIgnoreCase("Chamomile")) {
    System.out.println("ok");
  } else if (nameFlower.equalsIgnoreCase("Aster")) {
    System.out.println("ok");
  } else if (nameFlower.equalsIgnoreCase("Tulip")) {
   System.out.println("ok");
  } else {
    throw new FlowerException(nameFlower);
  };

  System.out.println("Please enter a number of petal for you flower.(Please enter integer value!)");
  final String inputNumberPetal = scaner.next();
  try {
   final int numberPetal = Integer.parseInt(inputNumberPetal);
  } catch (IllegalStateException ex){
   System.out.println("The name of you Flower should not be a number!");
  };

 }

}
