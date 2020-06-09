package Recursion;

import java.util.Scanner;

public class FibonacciRecursion {
  
  public static void main(String[] args) {
    
    Scanner sn = new Scanner(System.in);
    int num = sn.nextInt();

    System.out.println(fibo(num));
  }

  public static int fib(int num1) {
    
    if(num == 0 && num == 1){

      return 1;
    }

    int res = fib(num - 2) + fib(num - 1);
    return res;
  }

  public static int  fibo(int num) {
    
    int n1 = fib(num - 1);
    int n2 = fib(num - 2);

    int res = n1 + n2;

    return res;
  }
}