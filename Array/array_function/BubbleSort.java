package array.array_function;

public class BubbleSort {
  public static void main(String[] args) {

    int []array = {10,12,55,65,89};
    bubbleSort(array);
    display(array);
    
  }
  public static void bubbleSort(int []arr) {

    for(int counter=0; counter<arr.length-1; counter++){
      for(int j=0; j<arr.length-1-counter; j++){

        if(arr[j] > arr[j+1]){

          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
    }
    
  }
  public static void display(int arr[]) {

    for(int i=0; i<arr.length; i++){
      System.out.println(arr[i]);
    }
  }
  
}
