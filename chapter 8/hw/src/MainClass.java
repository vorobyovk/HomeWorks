import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) throws IOException {
        List<MusicalInstrument> instrumentList = new ArrayList<>();
        for(int i=0;i<4;i++){
            System.out.println("Please select action.");
            System.out.println("To adding a musical instrument - press 1.");
            System.out.println("To print a array of musical instrument - press 2.");
            System.out.println("To sorting of collection musical instrument - press 3.");
            System.out.println("End program - press 4.");

            final Scanner scaner2 = new Scanner(System.in);
            int command = scaner2.nextInt();
            for ( int j = 0; j < 25; ++j )
                System.out.println();

            if(command==1){
              final Scanner scaner = new Scanner(System.in);
              System.out.println("Please enter a name of musical instrument.");
              String nameInstrument = scaner.nextLine();
              System.out.println("Please enter a color of musical instrument.");
              String colorInstrument = scaner.nextLine();
              System.out.println("Please enter a stringed or not of musical instrument.1/0");
              boolean strunniy = scaner.nextBoolean();
              instrumentList.add(new MusicalInstrument (nameInstrument,strunniy,colorInstrument));
              for ( int j = 0; j < 25; ++j )
                    System.out.println();
            } else if(command==2){
                instrumentList.stream().forEach(instrument -> System.out.println(instrument));
            }else {
                if (command == 3) {
                    int size = instrumentList.size();
                    int checkStatus = size;
                    System.out.println("Size of instrument array is: " + size);
                    for (int j = 0; j < size; j++) {
                        if (instrumentList.get(j).strunniy == false)
                            if (instrumentList.get(checkStatus).strunniy == true) {
                                String nameInstrument2 = instrumentList.get(checkStatus).nameInstrument;
                                String colorInstrument2 = instrumentList.get(checkStatus).colorInstrument;
                                boolean strunniy2 = instrumentList.get(checkStatus).strunniy;
                                instrumentList.set(checkStatus, instrumentList.get(j).nameInstrument, instrumentList.get(j).strunniy, instrumentList.get(j).colorInstrument);
                                instrumentList.set(j, nameInstrument2, strunniy2, colorInstrument2);
                                checkStatus = checkStatus - 1;
                                if (checkStatus == j) j = size;
                            }
                    }

                } else if (command == 4) {
                    break;
                } else {
                    break;
                }
            }
            ;
            i--;
        };

    }
}
