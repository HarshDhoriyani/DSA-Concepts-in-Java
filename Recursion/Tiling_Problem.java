/*Question : Given a '2*n' floor and tiles of size '2*1', count the number of ways to tile the 
given board using the 2*1 tiles.
(A tile can either be placed horizontally or vertically)
 */

public class Tiling_Problem {
    public static int tile(int n) { 
        //base case
        if (n == 0 || n == 1) {
            return 1;
        }
        //KAAM
        //vertical choice
        int fnm1 = tile(n-1);
        //horizontal choice
        int fnm2 = tile(n-2);
        //Total no. of ways
        int totWays = fnm1 + fnm2 ;
        return totWays;
    }
    public static void main(String args[]) {
        System.out.println("Total number of ways to fit the tiles is : " + tile(4));
    }
}
// asked in Amazon..
