public class MainClass {

    public static void main(String[] args){
      int[] intArray = {1,4,-2,5,2,7};
      for(int element: intArray){
        System.out.println(element);
      }

//    Find a minimum and maximum element in our array.
      int minArrayElement = intArray[0];
      int maxArrayElement = intArray[0];
      for (int i=0;i<6;i++){
       if(minArrayElement>intArray[i]){
         minArrayElement=intArray[i];
       } else if(maxArrayElement<intArray[i]){
         maxArrayElement=intArray[i];
       }
      }
      System.out.println("__________________________________________");
      System.out.println("Minimum element of our array: "+minArrayElement);
      System.out.println("Maximum element of our array: "+maxArrayElement);

//    Sort our array as Margesort algorithm.
      System.out.println("__________________________________________");
      MergeSortClass sorter = new MergeSortClass();
      sorter.mergeSort(intArray,0,5);
      for(int element: intArray){
           System.out.println(element);
      }

    }
}
