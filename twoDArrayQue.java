public class twoDArrayQue {
    // Question 1 :Print the number of 7’s that are inthe 2d array.Example :Input - int[][] array = { {4,7,8},{8,8,7} };Output - 2
//     public static void main(String[] args) {
//         int array[][] = {{4,7,8},{8,8,7}};

//         numOfSeven(array);
//     }

//     public static void numOfSeven(int array[][]) {
//         int count = 0;
//         for(int i=0; i<array.length; i++){
//             for(int j=0; j<array[0].length; j++){
//             if(7==array[i][j]){
//                 count++;
//             }
//         }
//     }
//     System.out.println("number of seven is: "+ count);
// }


//Question 2 :Print out the sum of the numbers inthe second row of the “nums” array.Example :Input - int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };Output - 18
// public static void main(String[] args) {
//     int[][] nums = {{1,4,3},{1,4,3},{2,2,3}};
//     int sum = 0;
//     for(int j=0; j<nums[0].length; j++){
//         sum = sum+nums[1][j];
//     }
//     System.out.println("sum of 2nd row is: "+ sum);
// }

// Question 3 :Write a program to FindTransposeofa Matrix.What is Transpose?Transpose of a matrix is the process ofswapping therows to columns. For a 2x3 matrix,Matrixa11    a12    a13a21    a22    a23Transposed Matrixa11    a21a12    a22a13    a23
public static void main(String[] args) {
    int row=2; 
    int col = 3;
    int matrix[][]= {{2,3,4},{5,6,7}};

    //print original matrix
    printMatrix(matrix);

    //transpose of matrix
    int transpose[][] = new int[col][row];
    for(int i=0; i<row; i++){
        for(int j=0; j<col; j++){
            transpose[j][i] = matrix[i][j];
        }
    }
    System.out.println("------------------------------");
    //print transpose of matrix
    printMatrix(transpose);
}

public static void printMatrix(int matrix[][]) {
    for(int i=0; i<matrix.length; i++){
        for(int j=0; j<matrix[0].length; j++){
            System.out.print(matrix[i][j]+ "   ");
        }
            System.out.println();
    }
}
}