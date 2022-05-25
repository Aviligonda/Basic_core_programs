import java.util.Scanner;

public class Prime {
    public static void main(String args[]){
        int n=25;
       // Scanner sc = new Scanner(System.in);
       // System.out.println("Enter a number ::");
       // number = sc.nextInt();

        for(int i = 2; i< n; i++) {
            while(n%i == 0) {
                System.out.println(i+" ");
                n = n/i;
            }
        }
        if(n >2) {
            System.out.println(n);
        }
    }
}
