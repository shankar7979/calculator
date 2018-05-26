import java.io.*;

class Series {
    
    // Function to find nth term
    static int term(int n){
        return n * (n + 1) / 2;
    }
    
    // Driver Code
    public static void main (String[] args) {
        int n = 4;
        System.out.println(term(n));
    }
}
