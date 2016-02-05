import java.util.Scanner;

public class TestUnitTeach {

    public static void main(String[] args){
        MathOperation math = new MathOperation();
        int addingNum=0;
        int multiNum=1;
        System.out.println("Please input you number:");
        Scanner scanner = new Scanner(System.in);
        int summNumber = 0;
        String userNumber=scanner.nextLine();
        for(int i=0;i<userNumber.length();i++){
         int numberOfUserNum = Integer.parseInt(""+userNumber.charAt(i));
         addingNum = math.add(addingNum,numberOfUserNum);
         multiNum = math.multiply(multiNum,numberOfUserNum);
         summNumber = summNumber + numberOfUserNum;
        }

        System.out.println(summNumber);
        System.out.println(addingNum);
        System.out.println(multiNum);
    }

}
