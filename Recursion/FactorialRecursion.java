package Recursion;

import java.util.Scanner;

public class FactorialRecursion {
 
  public static void main(String[] args) {
     Scanner sn = new Scanner(System.in);
     int num = sn.nextInt();

     System.out.println(fact(num));
  }

  public static int fact(int num) {
    
    if(num == 1){

      return 1;
    }
    int res = fact(num - 1) * num;
    return res;
  }
}