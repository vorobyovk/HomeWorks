public class MainClass {

    public static void main(String[] args){
// 65 first letter of English alphobet
// 91 last letter
      char[] arrayChar = new char[256];
      for(int i = 0;i<arrayChar.length;i++){
        arrayChar[i]=(char)i;
      }
      char[] alpabeticCharAray = new char[26];
      for(int i=65;i<91;i++){
        alpabeticCharAray[i-65] = arrayChar[i];
      }
      for(char c:alpabeticCharAray){
            System.out.println(c);
      }
        String wordToShifr = "world";


        System.out.println("");


    }
}
