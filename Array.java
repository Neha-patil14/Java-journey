import java.util.*;
public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Creation of array
            // int marks[] = new int[50];
            // int marks1[] = {23,45,67};
            // String sub[] = {"eng", "maths"};

        //input in array
            int marks[] = new int[50];
            marks[0] = sc.nextInt();
            marks[1] = sc.nextInt();
            marks[2] = sc.nextInt();

        //output in array
            System.out.println("phy : "+marks[0]);
            System.out.println("che : "+marks[1]);
            System.out.println("maths : "+marks[2]);

        //update in array
            marks[2] = 100;
            System.out.println("maths : "+marks[2]);

        //lenth of array
            System.out.println("length of array is: "+marks.length);
            
        //percentage
            int per= (marks[0]+marks[1]+marks[2])/3;
            System.out.println("percentage is: "+per+"%");
    }
}