public class MainClass {

 public static void main(String[] args){
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
 }
}
