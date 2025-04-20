class NewThread extends Thread {
	NewThread(){
		super("Demo Thread");
		System.out.println("Child thread :  " + this);
		start();
	}
	public void run(){
		// entry point for a new thread
		try{
			for ( int i=5; i>0; i--  ){
				System.out.println("Child Thread : " + i);
				Thread.sleep(1000);
			}
		}
		catch( InterruptedException interrupted_e ){
			System.out.println("Child Thread interrupted");
		}
		System.out.println("termina ejecucion del child thread");
	}
}

