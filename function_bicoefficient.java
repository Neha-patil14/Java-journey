public class function_bicoefficient {

    public static int factorial(int n) {
        int f = 1;
        for(int i =1; i<=n ; i++){
            f = f*i;
        }
        return f;
    }

    public static int bicoeff(int n , int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_n_min_r = factorial(n-r);
        int bicoeff = fact_n / (fact_r * fact_n_min_r);
        return bicoeff;
    }
    public static void main(String[] args) {
        System.out.println(bicoeff(8, 4));
    }
}
