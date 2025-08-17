import java.util.*;

public class twoArray {
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        //input
        Scanner sc = new Scanner(System.in);
        for(int i =0; i<matrix.length; i++)//row
        {
            for(int j=0; j<matrix[0].length;j++)//column
            {
                matrix[i][j] = sc.nextInt();
            }
        }

        //output
        for(int i =0; i<matrix.length; i++)//row
        {
            for(int j=0; j<matrix[0].length;j++)//column
            {
               System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
