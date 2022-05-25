public class Harmonic {
    public static void main(String[] args) {
        int n=8;
        double result=0;
        System.out.println("the harmonic series is :");
        for(int i=n;i>0;i--){
            result=result+(double)1/i;
            System.out.println(result+",");
        }
    }
}
