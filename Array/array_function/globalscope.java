package array.array_function;

public class globalscope {

  public static int val = 90;//global var in global scope.

  public static void main(String[] args) {
    int num1 = 10;
    int num2 = 20;
    System.out.println(num1);
    // num = num + val;
    
    // System.out.println(num);
    System.out.println(val);//variable contain global scope.

    int val = 50;//variable in local scope declared with the same name as global. 
    System.out.println(val);//local var wins
    System.out.println(globalscope.val);//if the var of local and global are same then we can access the global var by its class_name.global_var

    int sum = globalfun(num2);
    System.out.println(sum);

    if(num1 < num2){

      int num3 = 60;
      System.out.println(num3);
    }
  
  }

  public static int globalfun(int n){

    int sum = n + val;
    return sum;
  }
  
}