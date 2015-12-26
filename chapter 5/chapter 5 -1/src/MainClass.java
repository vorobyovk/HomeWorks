package ua.goit;

import java.util.Scanner;

public class MainClass {

 public static void main(String[] args){
  final Scanner scanner = new Scanner(System.in);
     System.out.println("Please enter a radius of you first circle:");
     double r1 = scanner.nextDouble();

     System.out.println("Please enter a radius of you second circle:");
     double r2 = scanner.nextDouble();

     double area1 = Math.PI*r1*r1;
     double area2 = Math.PI*r2*r2;
     if (area1 > area2){
         System.out.println("Area of you first circle is biggest, and : "+area1);
     } else if (area2 < area1){
         System.out.println("Area of you second circle is biggest, and : "+area2);
     } else {
         System.out.println("Area of you circles is equal, and : "+area1+" , "+ area2);
     }
     System.out.println("Area of you circles: "+area1 +" , "+ area2);
 }
}
