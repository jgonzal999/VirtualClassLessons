package exercise3;



class ThreadedSend extends Thread {

	private String msg; 
    private Sender sender; 
    ThreadedSend(String msg,  Sender sender) { 
        this.msg = msg; 
        this.sender = sender; 
    } 
    @Override
    public void run() {  
        synchronized(sender) { 
            sender.send(msg); 
        } 
    } 
}

public class SyncDemo {

	public static void main(String[] args) {
        Sender snd = new Sender(); 
        ThreadedSend S1 = new ThreadedSend( "Hi" , snd ); 
        ThreadedSend S2 = new ThreadedSend( "Bye" , snd ); 
        
        
        try{ 
        	System.out.println("Entramos aqui...."); 
        	S1.start(); 
            S1.join(); //Se utiliza para que se bloquee hasta que se termine
            S2.start(); 
            S2.join(); 
        } catch(Exception e) { 
            System.out.println("Interrupted"); 
        } 
	}

}
