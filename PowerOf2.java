public class PowerOf2 {
    public static void main(String[] args) {
        int i = 2, j = 1;
        for (j = 1; j <= 31; j++) {
            double pow = Math.pow(i ,j);
            System.out.println("result untill 2^31:--->" + pow);
        }
    }
}