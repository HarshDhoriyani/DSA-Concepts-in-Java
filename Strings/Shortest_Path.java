public class Shortest_Path {
    public static float GetshortestPath(String path) {
        int x = 0, y = 0 ;
        for (int i = 0 ; i<path.length() ; i++) {
            char dir = path.charAt(i) ;
            //South
            switch (dir) {
                case 'S' -> y-- ;
                case 'N' -> y++ ;
                case 'W' -> x-- ;
                default -> x++ ;
            }
        }
        int X2 = x*x ;
        int Y2 = y*y ;
        return (float)(Math.sqrt(X2 + Y2)) ;

    }
    public static void main(String args[]) {
        String path = "WNEENESENNN" ;
        System.out.println(GetshortestPath(path)) ;
    }
}
// Time Complexity = O(n) - linear