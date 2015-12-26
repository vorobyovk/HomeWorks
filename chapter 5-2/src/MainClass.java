import java.util.Scanner;

public class MainClass {

    public static void main(String[] args){
     final Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter integer number");
        double num = scanner.nextDouble();

        if (num % 2 == 0) {
            System.out.println("Num = "+num+" is even");
        } else {
            System.out.println("Num = "+num+" is odd");
        }

        final Scanner scanner2 = new Scanner(System.in);
        System.out.println("Please enter a command:");
        final String command = scanner2.nextLine();

        switch (command){
            case "start":
                System.out.println("The server is run.");
                break;
            case  "stop":
                System.out.println("The server is stopped.");
                break;
            case "restart":
                System.out.println("The server is restarting.");
                break;
            default:
                System.out.println("Unknown command ' "+command+" '");
        }
    }

}
