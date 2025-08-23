public class bitOperations {
    public static void main(String[] args) {
        // System.out.println(getIthBit(5, 2));
        // System.out.println(setIthBit(8, 2));
        // System.out.println(clearIthBit(5, 2));
        // System.out.println(updateIthBit(5, 2, 0));
        // System.out.println(clearlastIthBit(5,2));
        System.out.println(clearBitsInRange(10, 2, 4));
    }
    //get ith bit
    public static int getIthBit(int n, int i) {
        int bitmask = 1<<i;
        if((n & bitmask)==0){
            return 0;
        }
        else{
            return 1;
        }
    }
    //set ith bit
    public static int setIthBit(int n, int i) {
        int bitmask = 1<<i;
        return n | bitmask;
    }
    //clear ith bit
    public static int clearIthBit(int n, int i) {
        int bitmask = ~(1<<i);
        return n & bitmask;
    }
    //update ith bit
    public static int updateIthBit(int n, int i, int newBit){
        //1st way 
        if((newBit == 0)){
            return clearIthBit(n, i);
        }
        else{
            return setIthBit(n, i);
        }

        //2nd way -- written in notebook so refer that
        // n = clearIthBit(n, i);
        // int bitMask = newBit<<i;
        // return n | bitMask;
    }
    //ya que madhe last che 0 astil te 1 hoil
    public static int clearlastIthBit(int n, int i) {
        int bitmask = (~0)<<i;
        return n & bitmask;
    }
    public static int clearBitsInRange(int n, int i, int j) {
        int a = ((~0)<<(j+1));
        int b = (1<<i)-1;
        int bitMask = a | b;
        return n & bitMask;
    }
}
