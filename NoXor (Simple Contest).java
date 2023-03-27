import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        for(int i=1;i<n;i++)
        a[i-1]=XOR(n-i,a[i-1]);
        long sm=0;
        for(int i=0;i<n;i++)
        sm+=a[i];
        System.out.println(sm);
    }
    public static int XOR(int A, int B){
        return ((A|B)&(~A|~B));
    }
}
