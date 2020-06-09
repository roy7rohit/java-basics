package HashMapTrial;

import java.util.HashMap;

public class HashMapDemo {
  
  public static void main(String[] args) {
    
  
  HashMap<String,Integer> info = new HashMap<>();
  info.put("rohit", 20);
  info.put("pawan", 19);
  info.put("shubham", 23);
  System.out.println(info.get("shubham"));

  // for(int age : info.values()){

  //   System.out.println(age);
  // }

}
}