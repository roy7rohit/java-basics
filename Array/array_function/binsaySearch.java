package array.array_function;

public class binsaySearch {

  public static void main(String[] args) {

    int []array = {1,2,5,6,12,15,21,28,33,37,49,55,66,89,102};
    int item = 89;
    System.out.println(BinarySearch(array, item)); 
  }

  public static int BinarySearch(int[] arr, int item) {

    int lower_indx = 0;
    int higher_indx = arr.length - 1;
    

    while(lower_indx <= higher_indx){

      int mid = (lower_indx + higher_indx)/2;

      if(arr[mid] < item){
        lower_indx = mid + 1;
      }
      else if(arr[mid] > item){

        higher_indx = mid - 1;
      }
      else{
        return mid;
      }
      
    }
    return -1;
  }

}