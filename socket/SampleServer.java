import java.net.ServerSocket;
import java.io.IOException;

class SampleServer{
	public static void main ( String args[] ){
		server ServerSocket;
		try {
			server = new  ServerSocket( );
		}catch ( IOException ioe ){
			System.out.println("unable to create socket");
		}
	}
}
