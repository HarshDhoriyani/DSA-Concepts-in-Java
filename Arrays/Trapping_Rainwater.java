public class Trapping_Rainwater {
    public static int trapped_rainwater(int height[]) {
        int n = height.length ;

        // calculate left max boundary - array
        int leftmax[] = new int[n] ;
        leftmax[0] = height[0] ;
        for (int i = 1 ; i<n ; i++) {
            leftmax[i] = Math.max(height[i], leftmax[i-1]) ;
        }

        // calculate right max boundary - array
        int rightmax[] = new int[n] ;
        rightmax[n - 1] = height[n - 1] ;
        for (int i = n-2 ; i>=0 ; i--) {
            rightmax[i] = Math.max(height[i], rightmax[i+1]) ;
        }

        // loop run
        int Trappedwater = 0 ;
        int width = 1 ;
        for (int i = 0 ; i<n ; i++) {

            //waterlevel = min(leftmax bound , rightmax bound)
            int Waterlevel = Math.min(leftmax[i] , rightmax[i]) ;

            // Trapped Water = (Waterlevel - height[i]) * width
            Trappedwater += (Waterlevel-height[i]) * width ;
        }
        return Trappedwater ;
    }
    public static void main(String[] args) {
        int height[] = {4, 2, 0, 6, 3, 2, 5} ;
        System.out.println("TRAPPED WATER IS : " + trapped_rainwater(height)) ;
    }
}
