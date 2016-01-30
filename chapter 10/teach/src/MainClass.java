import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainClass {
    public static void main(String[] args) throws IOException{
        String wordToEncript="world";
        String encriptedWord="";
        String decriptedWord="";
        Caesar caesar = new Caesar();

        int key = 1;

        for(int i=0;i<wordToEncript.length();i++){
            char c=wordToEncript.charAt(i);
            caesar.Caesar(c,key);
            c=caesar.encriptedChar;
            encriptedWord=encriptedWord+c;
        }

        System.out.println("Encripted word = "+encriptedWord);

        for(int i=0;i<encriptedWord.length();i++){
            char c=encriptedWord.charAt(i);
            caesar.Caesar(c,-key);
            c=caesar.encriptedChar;
            decriptedWord=decriptedWord+c;
        }
        System.out.println("Decripted word = "+decriptedWord);

            try(final FileInputStream in = new FileInputStream("test.txt");
                FileOutputStream out = new FileOutputStream("encriptedTest.txt");){
                int c;

                while((c=in.read()) != -1){
                  out.write(c);
                }
            }



    }


}
