public class Linear_search {
    public static void main(String[] args) {
        int numbers[] = {23,12,34,56,10,67,89,54};
        int key = 90;
        int index = linearSearch(numbers,key);
        if(index==-1){
            System.out.println("key is Not found");
        }
        else{
            System.out.println("key is found at index: "+ index);
        }
    }

    public static int linearSearch(int numbers[], int key) {

        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }
}
//time complexity = O(n)