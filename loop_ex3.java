import java.util.*;
public class loop_ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter a num :");
            int n = sc.nextInt();
            if(n % 10 ==0){
                break;
            }
            System.out.println(n);
        }while(true);
        }
    }
