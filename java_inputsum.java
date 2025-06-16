import java.util.*;
public class java_inputsum {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int num1 = sc.nextInt();
      int num2 =sc.nextInt();
      int sum = num1 + num2;// for sum
      System.out.println(sum); 
      // for product
      int product = (num1)*(num2);
      System.out.println(product);
      // area of circle
      float rad = sc.nextFloat();
      float area = 3.14f*rad*rad;
      System.out.println(area);
    }
}
