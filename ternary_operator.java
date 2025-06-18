import java.util.*;
public class ternary_operator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //num is even or odd
        int num = sc.nextInt();
        String type = (num % 2==0)?"even":"odd";
        System.out.println(type);

        //student pass or not
        int marks = sc.nextInt();
        String result = (marks>=33)? "pass": "Fail";
        System.out.println(result);
    }
}
