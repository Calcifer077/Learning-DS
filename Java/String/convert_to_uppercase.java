import java.util.*;

public class convert_to_uppercase{
    
    public static String convertToUppercase(String str){
        StringBuilder sb = new StringBuilder("");
        
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        
        for(int i = 1; i < str.length(); i++){
            if(str.charAt(i) == ' ' && i < str.length()-1){
                sb.append(str.charAt(i));
                System.out.println(i);
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
                System.out.println(i);
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main (String[] args) {
        String str = "hi, this is a string";
        System.out.println(convertToUppercase(str));
    }
}
