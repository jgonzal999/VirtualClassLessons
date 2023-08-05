package exercise3;

public class Sender {
	public void send(String msg)    { 
        
        try{ 
            Thread.sleep(3000); 
            System.out.println("Sending\t"  + msg ); 
        } catch (Exception e){ 
            System.out.println("Thread  interrupted."); 
        } 
        System.out.println("Message: " + msg + " sent\n"); 
    } 
}
