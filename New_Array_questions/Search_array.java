package New_Array_questions;

public class Search_array {

  public static void main(String[] args) {
    
    int []arr = {2,3,5,9,0,4,7,8,1};
    int item = 6;

    System.out.println( SearchArray(arr, item));

  }
  public static int SearchArray(int []arr, int item) {

    for(int element : arr){

      if(arr[element] == arr[item]){

        item = element;
      }
      return item;

    }
    return -1;
   }
}