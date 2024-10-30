package io.codeforall.fanstatics;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class ChatClient {
    private Socket socket;

    private BufferedReader input;

    private BufferedWriter output;

    public ChatClient(String serverAddress, int serverPort){
        System.out.println("Establishing connection, please wait");

        try{
            socket = new Socket(serverAddress, serverPort);
            System.out.println("Connected to " + socket);

            setupSocketStreams();

        } catch(UnknownHostException ex){
            System.out.println("Host unknown" + ex.getMessage());
            System.exit(1);

        } catch(IOException ex){
            System.out.println("Some error: " + ex.getMessage());
            System.exit(1);
        }

        String line = "";

        while(!line.equals("/quit")){
            try{
                line = input.readLine();
                output.write(line);
                output.newLine();
                output.flush();
            } catch (IOException ex) {
                System.out.println("Sending error: " + ex.getMessage());
                break;
            }
        }

        stop();
    }

    public static void main(String[] args) {

        try {
            new ChatClient("localhost", 8080);
            System.out.println("teste main");
        } catch (NumberFormatException ex) {
            System.out.println("Invalid port number " + args[0]);
        }
    }

    public void setupSocketStreams() throws IOException {
        input = new BufferedReader(new InputStreamReader(System.in));
        output = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
    }

    public void stop(){
        try{
            if(socket != null){
                System.out.println("Closing the socket");
                socket.close();
            }
        } catch(IOException ex){
            System.out.println("Error closing the connection " + ex.getMessage());
        }
    }
}
