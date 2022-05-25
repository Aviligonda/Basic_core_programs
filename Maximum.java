public class Maximum {
    public static void main(String[] args) {
        int x=22, y=31, z=4;
        if(x>y&& x>z){
            System.out.println(x+ " is the maximum number");
        } else if (y>z && y>x) {
            System.out.println(y+  " is the maximum number");
         }else  {
            System.out.println(z+ "z is the maximum number");
        }
    }
}
