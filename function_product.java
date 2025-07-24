import java.util.*;
public class function_product {

    public static int product(int a , int b){
        int product_of_num = a*b;
        return product_of_num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int prod = product(a,b);
        System.out.println("product of num is:" + prod);
    }
}
