public class Test {
    public static void main(String[] args) throws InterruptedException {
        while(true){
            Thread.sleep(5000);
            Thread t1 = new Thread(new TimeTask());
            t1.start();
        }
    }
}
