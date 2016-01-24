public class MainClass {

    public static void main(String[] args){
      char[] charArray = new char[256];
      for(int i=0;i<charArray.length;i++){
        charArray[i]=(char)i;
      }
      for(char c:charArray){
        System.out.println(c);
      }

    }


}
