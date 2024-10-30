package io.codeforall.fanstatics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    // STEP1: Get parameters from command line arguments
    int portNumber;

    public Server() throws IOException {
        this.portNumber = 53;
    }

    // STEP2: Bind to local port and block while waiting for client connections
    ServerSocket serverSocket = new ServerSocket(portNumber);
    Socket clientSocket = serverSocket.accept();

    // STEP3: Setup input and output streams
    PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
    BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));


// STEP4: Read from/write to the stream
// STEP5: Close the streams
// STEP6: Close the sockets

}
