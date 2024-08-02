public class find_shortest_path{
    
    public static int findShortestPath(String str){
        int x = 0;
        int y = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'N'){
                y++;
            }else if(str.charAt(i) == 'S'){
                y--;
            }else if(str.charAt(i) == 'E'){
                x++;
            }else{
                x--;
            }
        }
        int res = (int)Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
        return res;
    }
    public static void main (String[] args) {
       System.out.println(findShortestPath("WNEENWSWNNN"));
    }
}
