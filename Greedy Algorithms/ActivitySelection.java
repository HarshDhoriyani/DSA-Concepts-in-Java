
import java.util.*;
// O(n)
public class ActivitySelection {

    public static void main(String[] args) {
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9};

        // // if end time is not sorted
        // int activities[][] = new int[start.length][3];  // 3 columns: index, start time, end time
        // for (int i  = 0 ; i < start.length ; i++) {
        //     activities[i][0] = i;
        //     activities[i][1] = start[i];
        //     activities[i][2] = end[i];
        // }

        // // lambda function -> shortform of a big function
        // // In java, Comparator is an interface for sorting Java objects.
        // Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));
        // int maxAct = 0;
        // ArrayList<Integer> ans = new ArrayList<>();

        // // 1st activity
        // maxAct = 1;
        // ans.add(activities[0][0]);
        // int lastEnd = activities[0][2];
        // for (int i = 1 ; i < end.length ; i++) {
        //     if (activities[i][1] >= lastEnd) {
        //         // select activity
        //         maxAct++;
        //         ans.add(activities[i][0]);
        //         lastEnd = activities[i][2];
        //     }
        // }
        

        // // end time basis sort - Original Problem
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        // 1st activity
        maxAct = 1;
        ans.add(0);
        int lastEnd = end[0];

        for (int i = 1 ; i < end.length ; i++) {
            if (start[i] >= lastEnd) {
                // select activity
                maxAct++;
                ans.add(i);
                lastEnd = end[i];
            }
        }
        System.out.println("Max activities : " + maxAct);
        for (int i = 0 ; i < ans.size() ; i++) {
            System.out.print("A"+ans.get(i) + " ");
        }
        System.out.println();
    }
}