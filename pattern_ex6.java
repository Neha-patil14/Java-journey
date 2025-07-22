public class pattern_ex6 {
    public static void main(String[] args) {
    
        int rows = 5;  // You can change this value

        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println(); // Move to next line
        }
    }
}

