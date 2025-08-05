import java.util.*;
public class kadanesAlgo {
    public static void main(String[] args) {
        int numbers[] = {-2,-3,4,-1,-2,1,5,-3};

        calculate_maxSubarray(numbers);
    }

    public static void calculate_maxSubarray(int numbers[]){
       int maxSum = Integer.MIN_VALUE;
       int  currSum = 0;

        for(int i=0; i<numbers.length; i++){

            currSum = currSum + numbers[i];

            if(currSum < 0){
                currSum = 0;
            }

            maxSum = Math.max(currSum,maxSum);
            
        }
        System.out.println("max sum is : "+ maxSum);
    }
}
