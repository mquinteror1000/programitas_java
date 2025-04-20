class NewThread extends Thread {
	String name;
	NewThread( String name ){
		super( name );
		this.name = name;
		start();
	}

	public void run(){
		try{
			for( int i=0; i<=5 ; i++ ){
				System.out.println("Thread: " + this.name + ": " + i);
				this.sleep(1000);
			}
		}
		catch ( InterruptedException interrupted_e ){
			System.out.println("Therad: " + this.name + "was interrupted");
		}
		System.out.println("Exiting :" + this.name );
	}
}
