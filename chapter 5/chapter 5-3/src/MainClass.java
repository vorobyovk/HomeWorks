public class MainClass {

 public static void main(String[] args) {
     double[] doubleArray = {1.2, 2.22, -3.22, 4.12};
     for (int i = 0; i < 4; i++) {
         System.out.println(doubleArray[i]);
     }
    boolean swapOccured = true;

     while (swapOccured) {
        swapOccured = false;
         for (int i = 0; i < doubleArray.length - 1; i++) {
             if (doubleArray[i] > doubleArray[i + 1]) {
                 double tempDoubleArray = doubleArray[i];
                 doubleArray[i] = doubleArray[i + 1];
                 doubleArray[i + 1] = tempDoubleArray;
                 swapOccured = true;
             }
         }
     }
     for (double element : doubleArray) {
         System.out.println(element);
     }

 }
}
