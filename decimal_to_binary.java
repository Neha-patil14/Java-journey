public class decimal_to_binary {

        public static void dec_to_bin(int dec_num) {
        int pow = 0;
        int bi_num = 0;
        while(dec_num>0){
            int rem = dec_num % 2; //return remainder
            bi_num = bi_num + (rem * (int)Math.pow(10,pow));

            pow++;
            dec_num = dec_num / 2; //return quotient
        }
        System.out.println("binary of num is : " + bi_num);
    }

    public static void main(String[] args) {
        dec_to_bin(5);
    }
}
