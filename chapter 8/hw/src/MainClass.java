import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass {

    public static void main(String[] args){

        System.out.println("Please select action.");
        System.out.println("To adding a musical instrument - press 1.");
        System.out.println("To print a array of musical instrument - press 2.");
        System.out.println("To sorting of collection musical instrument - press 3.");
        System.out.println("End program - press 4.");

        for(int i=0;i<4;i++){
            final Scanner scaner = new Scanner(System.in);
            int command = scaner.nextInt();

            if(command==1){
              System.out.println("Please enter a name of musical instrument.");
              String nameInstrument = scaner.nextLine();
              System.out.println("Please enter a color of musical instrument.");
              String colorInstrument = scaner.nextLine();
              System.out.println("Please enter a stringed or not of musical instrument.1/0");
              Boolean strunniy = scaner.nextBoolean();
              final List<MusicalInstrument> instrumentList = new ArrayList<>();
              instrumentList.add(new MusicalInstrument (nameInstrument,strunniy,colorInstrument));
            } else if(command==2){

            }else if(command==3){

            } else if(command==4){
              break;
            } else {
              i=5;
            };
            i--;
        };

    }
}
