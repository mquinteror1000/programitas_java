class CurrentThreadDemo {
	public static void main ( String args[] ){
		Thread t = Thread.currentThread();

		System.out.println("Current Thread: " + t);

		t.setName("Hilo de Chaggy");
		System.out.println("Despues de cambiarle el nombre " + t);

		try {
			for ( int n=5; n>0; n-- ){
				System.out.println(n);
				Thread.sleep(1000);
			}
		}
		catch ( InterruptedException interrupted_e ) {
				System.out.println("Main Thread interrupted");
		}
	}
}
