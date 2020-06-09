package Array_demo;
import java.util.Arrays;

public class Array_sorting_and_searching {

  public static void main(String[] args) {
    
    int []arr = {1,1,2,9,7,3,0,-9,-1,6,-1,6};
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));

    int index = Arrays.binarySearch(arr,0);
    // System.out.println(index);

    printArray("sorted array", arr);

    LinearSearch(arr, 0);
  }

  private static void printArray(String message, int array[]) {
    System.out.println(message + ": [length: " + array.length + "]");
    
    for (int i = 0; i < array.length; i++) {
       if(i != 0) {
          System.out.print(", ");
       }
       System.out.print(array[i]);                     
    }
    System.out.println();
 }

 public static int LinearSearch(int []arr, int target) {

  for(int i=0; i<arr.length; i++){

    if(arr[i] == arr[target]){

      return i;
    }
  }
  return -1;
   
}
  
}