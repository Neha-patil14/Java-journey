public class StringsQuefour {
    //convert given string each of first letter of word in uppercase
    // "hi, i am neha"
    public static void main(String[] args) {
        String str = "hi, i am neha ";
        System.out.println(UpperCase(str));
    }

    public static String UpperCase(String str){
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1; i<str.length(); i++){
            if(str.charAt(i)== ' ' && i<str.length()-1 ){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
}
