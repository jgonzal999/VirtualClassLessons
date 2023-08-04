package exercise1;

public class MyThreads extends Thread{
	public void run(){
  		System.out.println("Concurrent thread started running..");
	}


	public static void main(String[] args) {
		MyThreads mt = new  MyThreads();
  		mt.start();

	}

}
