public class java_operators {
    public static void main(String[] args) {
     /* operators in java
      *     1. arithmetic operators
                +,-,*,/,%
            2. assignment op
                =,+=,-=,*=,/=
            3. logical op
                &&,||, !
            4. Relational op
                ==,>,<,>=,<=
            5. Bitwise op

        unary - one operand
            ++,--
      */
    int a = 3;
    int b = 4;
    System.out.println(a+b);
    System.out.println(a-b);
    System.out.println(a*b);
    System.out.println(a/b);
    System.out.println(a%b);

    System.out.println(a==b);
    System.out.println(a>b);

    System.out.println(a>4 && b<4);// logical operators only work with boolean exp.
    System.out.println(a>4 || b<4);
}
}