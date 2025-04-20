import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class ReadCharacters {
	public static void main( String args[] ) throws IOException {
		char c;
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		System.out.println("agrega caracteres, q para salir");
		do{
			c = ( char ) br.read();
			System.out.println(c);
		}while ( c != 'q' );
	}
}

