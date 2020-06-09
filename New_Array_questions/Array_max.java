package New_Array_questions;

// import java.util.Arrays;
import java.util.Scanner;

public class Array_max {
  
  public static void main(String[] args) {
    
    // Scanner sn = new Scanner(System.in);
    // int num = sn.nextInt();

    // int []arr = new int[num];

    int []arr = {3,5,8,7,5,1,9};

    System.out.println(ArrayMax(arr));
    System.out.println(Array_max_indx(arr));
    
    
  }
  public static int  ArrayMax(int []arr) {
    int max = Integer.MIN_VALUE;

    for(int i=0; i<arr.length; i++) {
      if(arr[i] > max){

        max = arr[i];
      }
      
    }
    return max;
    
  }

  public static int Array_max_indx(int []arr){
    
    int max_indx = 0;
    for(int i=0; i<arr.length; i++){

      if(arr[i] > arr[max_indx]){

        max_indx = i;
      }
    }
    return max_indx;
  }
}