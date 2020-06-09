package Recursion;

import java.util.Scanner;

public class IncreasingNumRecursion {
  
  public static void main(String[] args) {

    Scanner sn = new Scanner(System.in);
    int num = sn.nextInt();

    // recursion_increasing(num);
    decreasing_recur(num);
    
  }

  public static void recursion_increasing(int num) {
    
    if(num == 0){

      return;
    }
    recursion_increasing(num - 1);
    System.out.println(num);
  }

  public static void decreasing_recur(int num) {
    
    if(num == 0){

      return;
    }
    System.out.println(num);

    decreasing_recur(num - 1);
  }
}