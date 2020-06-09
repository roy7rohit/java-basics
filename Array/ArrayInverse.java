package Array;

import java.util.Arrays;

public class ArrayInverse {
  public static void main(String[] args) {
    
    int []arr = {0,2,1,4,5,3};
    System.out.println(Arrays.toString(arr));
    int []new_arr = inverse(arr);
    System.out.println(Arrays.toString(inverse(arr)));
  }
  public static int[] inverse(int []arr) {
    int []new_arr = new int[arr.length];
    for(int i=0; i<arr.length; i++){

      int indx  = arr[i];
      int val = i;
      new_arr[i] = val;
    }
    return new_arr;
  }
}