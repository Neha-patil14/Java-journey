public class array_as_argument {
    public static void main(String[] args) {
        int marks[] = {90,99,98};
        update(marks);
        //check call by reference
        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
    }

    public static void update(int marks[]){
        for(int i =0; i<marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }
}