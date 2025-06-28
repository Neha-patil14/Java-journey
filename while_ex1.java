import java.util.*;
public class while_ex1 {
    public static void main(String[] args) {
        // sum of n natural number--
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum =0;
        int i = 1;
        while(i<=num){
            sum = sum + i;
            i++;    
        }
        System.out.println(sum);
    }
}
