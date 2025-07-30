import java.util.*;

public class largest_arraynum {
    public static void main(String[] args) {
        int number[] = {1,2,3,4,6,5};
        System.out.println("largest number from array is: "+ getLargest(number));
    }

    public static int getLargest(int number[]) {
        int largest = Integer.MIN_VALUE; //-infinity
        int smallest = Integer.MAX_VALUE; //+infinity

        for(int i =0; i<number.length; i++){
            if(largest<number[i]){
                largest = number[i];
            }

            if(smallest>number[i]){
                smallest = number[i];
            }
        }
        System.out.println("smallest number from array is: "+ smallest);
        return largest;
    }
}
//time complexity = O(n)