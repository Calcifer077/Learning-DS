public class Main{
    
    public static String substring(String str, int s, int e){
        String substr = "";
        for(int i = s; i < e; i++){
            substr += str.charAt(i);
        }   
        return substr;
    }
    public static void main (String[] args) {
       String str = "something";
       
       // This is a built in function for substrings.
       System.out.println(str.substring(0, 5));
       
       System.out.println(substring(str, 0, 5));
    }
}
