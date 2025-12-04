public class countdown {
    public static void main(String[]args) throws InterruptedException {
    
    int start = 10;

    for(int i=start; i>=1; i--) {
        System.out.println(i);
        Thread.sleep(1000);
    }

    System.out.print("HAPPY NEW YEAR!");
   }
} 
