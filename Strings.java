import java.util.*;

import javax.sql.rowset.spi.SyncResolver;
public class Strings {
    public static void main(String[] args) {
        /*char arr[] = {'a','b','c'}; //character array

        //declaration
        String str = "abcd";
        String str2 = new String("abc");

        //user i/p
        Scanner sc = new Scanner(System.in);
        // String name = sc.next(); //it only gives first word 
        // System.out.println(name);

        String name = sc.nextLine();//gives whole sentence
        System.out.println(name);*/

        //length function
            // String sentence = "Neha is a girl";
            // System.out.println(sentence.length());

        //concatnation
            // String firstName = "Neha";
            // String lastName = "Patil";
            // // String fullName= firstName + " " + lastName; 
            // System.out.println(firstName + " " + lastName);
        
        //index varun character print kartat
            String name = "neha patil";
            printVowels(name);

    }

    public static void printVowels(String name) {
        for(int i=0; i<name.length(); i++){
            if(name.charAt(i)=='a' || name.charAt(i)=='e' || name.charAt(i)=='i' || name.charAt(i)=='o' || name.charAt(i)=='u'){
                System.out.print(name.charAt(i));
            }
        }
    }
}
