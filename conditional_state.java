import java.util.*;
public class conditional_state{
    public static void main(String[] args) {
        /* conditional statements-
         * 1.if-else- check every statement
         * 2. else-if- it check and if it true then it not go for nxt state, more compatible
         * 3. switch
         * 4. ternary
         */
        //largest of 2  no.
        int a = 1;
        int b = 2;
        if(a>b){
            System.out.println(a+" : a is greater");
        }
        else{
            System.out.println(b+" : b is greater");
        }

        // no. even or odd
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        if(A%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("odd");
        }

        //income tax calculator
        int tax;
        int income = sc.nextInt();
        System.out.println(income);
        if(income<=500000){
            tax = 0;
        }
        else if(income>=500000 && income<=1000000){
             tax= (int)(income*0.20);   
        }
        else{
            tax=(int)(income*0.30); 
        }
        System.out.println("your tax is: "+ tax);

    }
}