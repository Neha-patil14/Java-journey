public class loop_ex2 {
    public static void main(String[] args) {
        //reverse of given num
        int n =10899;
        int rev = 0;
        while(n>0){
            int lastdigit = n % 10;
            rev = (rev * 10) + lastdigit;
            n = n/10;
           
        }
         System.out.println(rev);
    }
}
