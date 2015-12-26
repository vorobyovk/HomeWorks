import java.util.Scanner;

public class MainClass {
  public int numArray;
   public static void main(String[] args){
   System.out.println("Please enter number of element you array.");
   final Scanner scanner = new Scanner(System.in);
   final int numArray = scanner.nextInt();
   int[] intArray = new int[numArray];
   System.out.println("Please enter element of array. Element is INTEGER");
    for (int i=0;i<numArray;i++){
      intArray [i] = scanner.nextInt();
    }
   System.out.println("Number of element array: "+numArray);
   System.out.println("Our array: ");
   for (double element:intArray){
       System.out.println(element);
   };

      System.out.println("If you want find MINIMAL and MAXIMAL of element our array, press '1'.");
      System.out.println("If you want sort our array, press '2'.");
      String command = scanner.nextLine();
   switch (command){
       case "1":
//         MaxMinArray Calcute = new MaxMinArray(numArray);
//         System.out.println("Minimum of array"+Calcute.minArray);
//         System.out.println("Maximum of array"+Calcute.maxArray);
         break;
       case "2":

         break;
   }

  }
  public static class ClassArray{
      public int numArray;
      public int[] intArray = new int[numArray];
      public int minArray;
      public int maxArray;

      for(int i = 0;i<this.numArray;i++) {
          minArray=MainClass.ClassArray.intArray[0];
          maxArray=MainClass.ClassArray.intArray[0];
          if(MainClass.ClassArray.intArray[i]<minArray){
              minArray=MainClass.ClassArray.intArray[i];
          } else if(MainClass.ClassArray.intArray[i]>maxArray){
              maxArray=MainClass.ClassArray.intArray[i];
          }
      }
  }

}
