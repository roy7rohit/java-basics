package Recursion;

import java.util.Scanner;

import JAVA_trial.NumberFrequency;

public class RecursionIncreasingDecreasing {
  
  public static void main(String[] args) {
    
    Scanner sn = new Scanner(System.in);
    int num = sn.nextInt();

    recurIandD(num);
  }

  public static void recurIandD(int num) {
   
    if(num == 0){

      return;
    }

    System.out.println(num);
    recurIandD(num - 1);
    System.out.println(num);
  }
}