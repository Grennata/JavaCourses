import java.net.*;
import java.io.*;

public class ChatServer {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket (4242);
		} catch (IOException e) {
			System.err.println("Could not listen on port: 4242");
			System.exit(1);
		}

		Socket clientSocket = null;
		try{
			clientSocket = serverSocket.accept();
		} catch (IOException e) {
			System.err.println("Accept failed");
			System.exit(1);
		}
		
		PrintWriter out = new PrintWriter (clientSocket.getOutputStream(), true);
		BufferedReader in = new BufferedReader (new InputStreamReader(
				                                     clientSocket.getInputStream()));
		String inputLine, outputLine;
		
	}

}
