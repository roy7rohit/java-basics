package Recursion;

import java.util.Scanner;

public class RecursionOddEven {
  
  public static void main(String[] args) {
    
    Scanner sn = new Scanner(System.in);
    int num = sn.nextInt();

    recursion(num);

  }
  public static void recursion(int num) {
   
    if(num == 0){
      return;
    }
    if(num % 2 != 0){
      System.out.println(num);

    }
    recursion(num - 1);
    if(num % 2 == 0){

      System.out.println(num);
    }
  }
}