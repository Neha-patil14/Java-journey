import java.util.*;
public class java_Switch {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //Making calculator using switch -----
//     System.out.println("enter a number:");
//     int a = sc.nextInt();

//     System.out.println("enter 2nd number:");
//     int b = sc.nextInt();

//     System.out.println("enetr a operator: ");
//     char operator = sc.next().charAt(0);

//     switch(operator){
//         case '+' :
//         System.out.println(a+b);
//         break;
//         case '-' :
//         System.out.println(a-b);
//         break;
//         case '*' :
//         System.out.println(a*b);
//         break;
//         case '/' :
//         System.out.println(a/b);
//         break;
//         case '%' :
//         System.out.println(a%b);
//         break;
//         default:
//         System.out.println("please change the operator");
//     }
    System.out.println("Enter a number of day(1-7): ");
    int day = sc.nextInt();
    switch(day){
        case 1:
            System.out.println("monday");
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("Wednsday");
            break;
        case 4:
            System.out.println("Thursday");
            break;
        case 5:
            System.out.println("Friday");
            break;
        case 6:
            System.out.println("Saturday");
            break;
        case 7:
            System.out.println("sunday");
            break;

        default:
            System.out.println("please enter right day");
    }
   }  
}
