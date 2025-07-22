public class pattern_ex2 {
    public static void main(String[] args) {
        //inverted star print
        for(int line=1; line<=4; line++){
            for(int star=4; star>=line; star--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
