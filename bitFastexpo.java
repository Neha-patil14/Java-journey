public class bitFastexpo {
    public static void main(String[] args) {
        System.out.println(fastExpotation(2, 2));
    }
    public static int fastExpotation(int a, int n) {
        int ans = 1;
        while(n>0){
            if((n & 1)!=0){ // chack lsb
                 ans = ans * a;
        }
            a = a*a;
            n = n>>1;
        } 
        return ans;
    }
    
}
