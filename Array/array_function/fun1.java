package array.array_function;

public class fun1 {
  public static void main(String[] args) {
    
    System.out.println("calling function");
    // add(45, 89);
    // add(55, 65);
    System.out.println("we are done");

    int  value = add(67, 23);
    System.out.println(value);
    
  }
  
  public static int add(int a, int b){

    int sum = a + b;
    return sum;
  }
}