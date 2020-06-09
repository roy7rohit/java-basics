package array;

import java.util.Arrays;

public class array {
  public static void reverse(int arr[]){
    //start = 0, end = length-1
    //arr[] = {12,23,45,95}
     //arr[] = {}
    int start = 0;
    int end = arr.length - 1;
    while(start <= end){
      int temp;
      temp = arr[start];//12=temp 
      arr[start] = arr[end];//arr[0] = arr[3] = 95 = arr[0]
      start++;
      end--;
    }

  }
  
  public static void main(String[] args) {
    int a[] = {12,23,45,95};
    // System.out.println(a);
    reverse(a);
    System.out.println(Arrays.toString(a));
  }
}