class MultiThread {
	public static void main ( String args[]  ){
		NewThread nt1 = new NewThread ( "Uno" );
		NewThread nt2 = new NewThread ("Dos");
		NewThread nt3 = new NewThread ("Tres");

		try {
			Thread.sleep(10000);
		}catch ( InterruptedException interrupted_e ){
			System.out.println("Main Thread Interrupted");
		}
		System.out.println("Acaba el Thread principal");
	}
}
