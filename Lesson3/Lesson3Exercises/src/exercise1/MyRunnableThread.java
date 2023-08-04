package exercise1;

public class MyRunnableThread implements Runnable{
	public static int mycount = 0;
	public static int count = 0;
    public MyRunnableThread(){
         
    }
    public void run() {
    	System.out.println("Starting el run");
        while(MyRunnableThread.count <= 10){
            try{
                System.out.println("Expl Thread: "+(MyRunnableThread.count++));
                Thread.sleep(10);
            } catch (InterruptedException iex) {
                System.out.println("Exception in thread: "+iex.getMessage());
            }
        }
    } 


	public static void main(String[] args) {
        System.out.println("Starting Main Thread...");
        MyRunnableThread mrt = new MyRunnableThread();
        Thread t = new Thread(mrt);
        t.start();
        
        while(MyRunnableThread.mycount <= 10){
            try{
            	Thread.sleep(1000);
                System.out.println("Main Thread: "+(mrt.mycount++));
               
                Thread.sleep(1000);
                System.out.println("Main Thread: "+(mrt.mycount));
                Thread.sleep(100);
            } catch (InterruptedException iex){
                System.out.println("Exception in main thread: "+iex.getMessage());
            }
        }
        System.out.println("End of Main Thread...");


	}

}
