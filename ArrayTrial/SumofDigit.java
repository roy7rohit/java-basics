package ArrayTrial;

public class SumofDigit {
  
  public static void main(String[] args) {
    
    int num = 12345;
    int sum = 0;
    while(num != 0){

      int rem = num%10;
      sum = (sum*10) + rem;
      num = num/10;
    }
    System.out.println(sum);
  }
}