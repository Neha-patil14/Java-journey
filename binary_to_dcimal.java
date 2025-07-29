public class binary_to_dcimal {

    public static void bi_to_dec(int bi_num) {
        int pow = 0;
        int dec = 0;
        while(bi_num>0){
            int last_digit = bi_num % 10;
            dec = dec + (int)(last_digit*Math.pow(2,pow));

            pow++;
            bi_num = bi_num / 10;
        }
        System.out.println("decimal of num is : " + dec);
    }

    public static void main(String[] args) {
        bi_to_dec(101);
    }
}
