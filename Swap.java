public class Swap {
    public static void main(String[] args) {
        int x = 2, y = 3;
        int temp;
        System.out.println("Before swap the number");
        System.out.println("x="+x);
        System.out.println("y="+y);
        temp=x;
        x=y;
        y=temp;
        System.out.println("After swap the numbers:");
        System.out.println("x="+x);
        System.out.println("y="+y);

    }
}
