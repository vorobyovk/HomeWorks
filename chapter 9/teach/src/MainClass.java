import java.util.Arrays;

public class MainClass {

    public static void main(String[] args){
      char[] charArray = new char[256];
      for(int i=0;i<charArray.length;i++){
        charArray[i]=(char)i;
      }
      for(char c:charArray){
        System.out.println(c);
      }

      final char[] charArraytoString = {'a','r','r','a','y'};
      final String stringToDisplay = Arrays.toString(charArraytoString)
              .replace (",","") //remove the commas
              .replace ("[","") //remove the right bracket
              .replace ("]","") //remove the left bracket
              .replace (" ","") //remove the white spaces
              .trim();          //trim empty cells at end
      System.out.println(stringToDisplay);

        String s1 = "first string";
        String s2 = "and second string";

        s1 += s2;
        System.out.println(s1);



        s1="1";
        s2="2";
        s1=s1.concat(s2);
        System.out.println(s1);


        if(s1.equals(s2)){
            System.out.println("s1=s2");
        } else System.out.println("s1 != s2");

    }


}
