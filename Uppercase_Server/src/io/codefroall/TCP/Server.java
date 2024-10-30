package io.codefroall.TCP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    int portNumber;
    ServerSocket serverSocket;
    Socket clientSocket ;

    // STEP3: Setup input and output streams
    BufferedReader input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
    //PrintWriter output = new PrintWriter(clientSocket.getOutputStream(), true);


    public Server() throws IOException {
        // STEP1: Get parameters from command line arguments
        this.portNumber = 60000;
        // STEP2: Bind to local port and block while waiting for client connections
        this.serverSocket = new ServerSocket(portNumber);
        this.clientSocket = serverSocket.accept();
    }

    public void Receiving() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
    }



// STEP4: Read from/write to the stream
// STEP5: Close the streams
// STEP6: Close the sockets
}
