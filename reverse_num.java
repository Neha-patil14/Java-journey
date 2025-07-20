import javax.sql.rowset.spi.SyncResolver;

public class reverse_num {
    public static void main(String[] args) {
        //print reverse of number 
        // 1. for lastdigit = n%10
        // 2. for removing lastdigit n/10
        int n=10899;
        while(n>0){
            int lastdigit = n % 10;
            System.out.print(lastdigit);
            n = n /10;
        }
        System.out.println();
    }
}
