import java.util.*;
public class bitque1 {
    public static void main(String[] args) {
        oddOrEven(3);
        oddOrEven(4);
    }
    public static void oddOrEven(int n){
            int bitMask = 1;
            if((n & bitMask) == 0){
                System.out.println(n + " is Even");
            }
            else{
                System.out.println(n + " is Odd");
            }
        }
}
