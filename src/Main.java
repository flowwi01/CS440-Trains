import java.net.*;
import java.util.Iterator;
import java.util.Scanner;
import java.io.*;

// get output stream, send info to wifi modual. 
// PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
// get input stream from train track
// BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

public class Main extends Controls{


	public static int numSTTrackSecs, numSensSecs, NumJuncTrackSecs, numTrains, trainSize, trainLocation;
	public static String trainDirec;

	public final static String IP = "192.168.99.1";
	public final static int port = 5001;


	private static Socket clientSocket;
	private static PrintWriter out;
	private static BufferedReader in;

	public static initConnection client = new initConnection();


	public static void main(String[] args) throws UnknownHostException, IOException {

		//textInterface(); // used for testing purposes


		startConnection(IP, port); //replace string with "IP" and the second space with port number

		String response = client.sendMessage("_____________"); // here is where we can test commands

		translateResp(response);
		trainPtr train1 = new trainPtr ("Thomas", 10, "1", "L");
	}

	public static void instructions(trainPtr t) throws IOException, InterruptedException {
		//translateResp(client.sendMessage( ____()));;
		//translateResp(client.sendMessage(switchTrack(1))); // for when we are navigating the y track
		//translateResp(client.sendMessage(checkSensors()));

		//__________________________________________________________________
		// go, stop, reverse, stop
		
		translateResp(client.sendMessage( Go(t)));
		timeDelay(0,5);
		translateResp(client.sendMessage(Stop(t)));
		timeDelay(0,2);
		translateResp(client.sendMessage(Reverse(t)));
		timeDelay(0,5);
		//__________________________________________________________________

		//__________________________________________________________________
		// go, stop, switch track, reverse, stop. AKA handling y track.
		
		translateResp(client.sendMessage( Go(t)));
		timeDelay(0,5);
		translateResp(client.sendMessage(Stop(t)));
		timeDelay(0,2);
		translateResp(client.sendMessage(Reverse(t)));
		timeDelay(0,5);
		translateResp(client.sendMessage(Stop(t)));
		timeDelay(0,2);
		translateResp(client.sendMessage(switchTrack(1))); // for when we are navigating the y track
		timeDelay(0,2);
		translateResp(client.sendMessage(Reverse(t)));
		timeDelay(0,5);
		translateResp(client.sendMessage(Stop(t)));
		//__________________________________________________________________

	}


	public static void textInterface() {

		Scanner input = new Scanner(System.in);


		System.out.println("how many straight track sections?");
		numSTTrackSecs = input.nextInt();

		System.out.println("how many sensor sections?");
		numSensSecs  = input.nextInt();

		//this refers to y intersections currently will there need to be an L and R y intersection?
		System.out.println("how many junction sections?");
		NumJuncTrackSecs  = input.nextInt();

		System.out.println("how many trains?");
		numTrains  = input.nextInt();

		//aka the number of train cars
		System.out.println("how big is the train?");
		trainSize  = input.nextInt();

		//what sensor is the train being placed on?
		System.out.println("Where is this train located?");
		trainLocation  = input.nextInt();

		//either l or r 
		System.out.println("Which direction is the train going?");
		trainDirec   = input.next();

	}

	public static void startConnection(String ip, int port) throws UnknownHostException, IOException {
		clientSocket = new Socket(ip, port);
		out = new PrintWriter(clientSocket.getOutputStream(), true);
		in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

	}

	//iterator to decipher the responses, prints each character until it finds "DF" and then prints char and then new line. 
	public static void translateResp(String response) {

		char tmp1 = ' '; 
		char tmp2 = ' ';

		for (int i = 0; i < response.length(); i++) {
			if (response.charAt(i) <= ' ') {

				if(i == 0) {
					tmp1 = response.charAt(i);
				}
				else {
					tmp1 = response.charAt(i);
					tmp2 = response.charAt(i-1);
				}
			}
			if (tmp1 == 'D' && tmp2 == 'F') {
				System.out.println(tmp1);
			}
			else {
				System.out.print(tmp1);
			}
		}
	}

	static class initConnection {

		private ServerSocket serverSocket;
		private Socket clientSocket;
		private PrintWriter out;
		private BufferedReader in;
		private InetAddress addr;
		private int port;

		public void start(int port) throws IOException {

			serverSocket = new ServerSocket(333);
			clientSocket = serverSocket.accept();
			addr = clientSocket.getInetAddress();
			port = clientSocket.getLocalPort();

			System.out.println(addr);
			System.out.println(port);

			out = new PrintWriter(clientSocket.getOutputStream(), true);
			in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

			String greeting = in.readLine();

			if ("hello server".equals(greeting)) {
				out.println("hello client");
			}

			else {
				out.println("unrecognised greeting");
			}
		}

		public String sendMessage(String msg) throws IOException {
			out.println(msg);
			String resp = in.readLine();
			return resp;
		}

		public void stopConnection() throws IOException {
			in.close();
			out.close();
			clientSocket.close();
		}

	}

}


