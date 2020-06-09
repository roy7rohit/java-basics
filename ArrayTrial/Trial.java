package ArrayTrial;

import java.util.Scanner;

public class Trial {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();

    int []arr = new int[size];

    for(int i=0; i<arr.length; i++){

      arr[i] = sc.nextInt();
      }
      for(int i=arr.length-1; i>=0; i--){
      System.out.println(arr[i]);
  }
}
}