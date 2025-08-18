public class StringQue2 {
    public static void main(String[] args) {
        String path = "WNEENESENNN";

        System.out.println(getShortestPath(path));
    }
    public static float getShortestPath(String path) {
        int x = 0;
        int y = 0;
        for(int i=0; i<path.length(); i++){

            //north
            if(path.charAt(i) == 'N'){
                y++;
            }

            //south
            else if(path.charAt(i) == 'S'){
                y--;
            }

            //east
            else if(path.charAt(i) == 'E'){
                x++;
            }

            //west
            else{
                x--;
            }
        }
        int xSquare = x*x;
        int ySquare = y*y;
        return (float)Math.sqrt(xSquare+ ySquare);
    }
}
