public class coinflip {
    public static void main(String[] args) {
            int Head=0;
            int Tail=0;
            int chances = 10;
        for(int i=0;i<chances;i++) {
            int random = (int) (Math.random() * 2);
             System.out.println(random);
             if (random == 1) {
                 System.out.println("it is Head");
                 Head++;
             } else {
                 System.out.println("it is Tail");
                 Tail++;
             }
         }
        System.out.println("no of chances:"+chances);
        System.out.println("total heads:"+Head);
        System.out.println("total tails:"+Tail);
    }
 }
