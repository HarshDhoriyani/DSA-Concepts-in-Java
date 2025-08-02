
import java.util.ArrayList;

public class Container_Water {
    public static int storeWater(ArrayList<Integer> height) {
        int maxWater = 0;

        // bruteforce - O(n^2)
        // for (int i = 0; i < height.size(); i++) {
        //     for (int j = i+1; j < height.size(); j++) {
        //         int ht = Math.min(height.get(i), height.get(j));
        //         int width = j-i;
        //         int currWater = ht * width;
        //         maxWater = Math.max(maxWater, currWater);
        //     }
        // }
        // return maxWater;

        // 2-pointer approach - O(n)
        int lp = 0;
        int rp = height.size()-1;

        while(lp < rp) {
            int ht = Math.min(height.get(lp), height.get(rp));
            int width = rp-lp;
            int currWater = ht * width;
            maxWater = Math.max(maxWater, currWater);

            if (height.get(lp) < height.get(rp)) {
                lp++;
            }
            else {
                rp--;
            }
        }
        return maxWater;
    }


    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        //1, 8, 6, 2, 5, 4, 8, 3, 7
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3); 
        height.add(7);
        
        System.out.println(storeWater(height));
    }
    
}