import java.util.Scanner;

class TT1{
    public static final Scanner KB = new Scanner(System.in);
    
    public static void main(String[] args) {
        int[] a = {1,12,5,4};
        q(a);
        for(int i=a.length-1;i>=0;i--)System.out.printf("%d ",a[i]);
    }

    public static void q(int[] p){
        for(int i=0;i<p.length/2;i++){
            int tmp = p[i];
            p[i] = p[p.length-1-i];
            p[p.length-1-i] = tmp;
        }
    }
}