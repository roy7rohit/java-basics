package Array.array_function;

public class ArrayMax {

  public static void main(String[] args) {
    
    int []arr = {-1,-2,-3,-4,-5,-6};
    System.out.println(arr_max(arr));
  
    // System.out.println(arr_maxidx(arr));

  }
  public static int arr_max(int []arr) {
    int max = Integer.MIN_VALUE;
    
    for(int i=0; i<arr.length; i++){

      if(arr[i] > max){

        max = arr[i];

      }
    }
    return max;

}
  public static int arr_maxidx(int []arr){

    int max_idx  = 0;

    for(int i=0;i<arr.length;i++){

      if(arr[i] > arr[max_idx]){

         max_idx = i;
      }
      return max_idx;

    }
    return -1;
    
  }
}