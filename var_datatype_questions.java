import java.util.*;
public class var_datatype_questions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //avg of three num
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c =  sc.nextInt();
        float avg =  (a+b+c)/3; //avg formula
        System.out.println("avg is:" + avg);

        //side of square
        int side = sc.nextInt();
        System.out.println(side);
        int area_of_square = (side*side);
        System.out.println("area of square :"+ area_of_square);

        //Entercostof3itemsfromtheuser(usingfloatdatatype)-apencil,apenandan eraser. You have to output the total cost of the items back to the user as their bill.
        float cost_of_pencil = sc.nextFloat();
        float cost_of_pen = sc.nextFloat();
        float cost_of_eraser = sc.nextFloat();

        float total_cost = ((cost_of_pencil)+(cost_of_pen)+(cost_of_eraser));
        System.out.println("Bill :"+ total_cost);

        // bill with gst
        float total_cost_gst = (total_cost + (0.18f * total_cost));
        System.out.println("Bill with gst:"+total_cost_gst);

        //note- Name of variables called identifiers in java alpahbet _ and $ is allowed to 
    }
    
}
