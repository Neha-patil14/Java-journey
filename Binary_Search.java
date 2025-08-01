public class Binary_Search {
    public static void main(String[] args) {
        int numbers[] = {1,2,3,4,5,6,7,8};
        int key = 1;
        System.out.println("Number is at index : "+binarySearch(numbers,key));
    }

    public static int binarySearch(int numbers[], int key) {
        int start = 0;
        int end = numbers.length-1;

        while(start<=end){
            int mid = (start + end) / 2;

                if(numbers[mid]==key){ //found
                    return mid;
                }
                if(numbers[mid] < key){ //right
                    start = mid + 1;
                }
                else{ //left
                     end = mid - 1;
                }
    
        }
        return -1;
    }

}
