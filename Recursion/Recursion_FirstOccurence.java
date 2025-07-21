public class Recursion_FirstOccurence {
    public static int FirstOccurence(int arr[] , int i, int key) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i ;
        }
        return FirstOccurence(arr, i+1, key);
    }
    public static void main(String args[]) {
        int arr[] = {8, 3, 6, 9, 8, 10, 2, 8, 3} ;
        System.out.println(FirstOccurence(arr, 0, 3));
    }
}
