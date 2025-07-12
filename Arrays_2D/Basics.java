import java.util.*;

public class Basics {
    public static boolean search(int matrix[][] , int key) {
        for (int i = 0; i<matrix.length ; i++) {
            for (int j = 0 ; j<matrix[0].length ; j++) {
                if(matrix[i][j] == key) {
                    System.out.println("FOUND AT CELL : " + "(" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("KEY NOT FOUND");
        return false;
    }

    public static int largest(int matrix[][]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i<matrix.length ; i++) {
            for (int j = 0 ; j<matrix[0].length ; j++) {
                if(matrix[i][j] > largest) {
                    largest = matrix[i][j];
                }
            }
        }
        return largest;
    }

    public static int smallest(int matrix[][]) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i<matrix.length ; i++) {
            for (int j = 0 ; j<matrix[0].length ; j++) {
                if(matrix[i][j] < smallest) {
                    smallest = matrix[i][j];
                }
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3] ;
        int n = matrix.length ; // rows
        int m = matrix[0].length ; // columns
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter elements of an matrix (3 x 3)");
        for (int i = 0; i<n ; i++) {
            for (int j = 0 ; j<m ; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        //output
        for (int i = 0; i<n ; i++) {
            for (int j = 0 ; j<m ; j++) {
                System.out.print(matrix[i][j] + " ") ;
            }
            System.out.println();
        }

        System.out.println("Largest Value in matrix is : " + largest(matrix));

        System.out.println("Smallest Value in matrix is : " + smallest(matrix));
        
        System.out.print("ENTER KEY TO SEARCH CELL IN THE MATRIX : ");
        int key = sc.nextInt() ;
        search(matrix, key) ;
        
        sc.close();
    }
}
