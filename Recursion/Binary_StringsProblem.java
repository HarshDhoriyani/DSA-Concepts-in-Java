// Question : Print all binary strings of size N without consecutive ones. 

public class Binary_StringsProblem {
    public static void binString(int n , int lastplace , String str) {
        //base case 
        if (n == 0) {
            System.out.println(str);
            return;
        }

        //Kaam
        if (lastplace == 0) {
            //sit 0 on nth position
            binString(n-1, 0, str+"0");

            //sit 1 on nth position
            binString(n-1, 1, str+"1");

        } else {
            //sit 0 on nth position
            binString(n-1, 0, str+"0");
        }
    }
    public static void main(String[] args) {
        binString(3, 0, "");
    }    
}

// .. asked in Paytm 

