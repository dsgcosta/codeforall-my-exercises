package io.codeforall.fanstatics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;


public class ChatServer {
    private Socket clientSocket;
    private ServerSocket serverSocket;
    private BufferedReader inputBufferedReader;


    public ChatServer(int port) throws IOException {

       try {

            System.out.println("Binding to port: " + port);
            serverSocket = new ServerSocket(port);

            System.out.println("Server started " + serverSocket);

            System.out.println("Waiting for a client connection");

            clientSocket = serverSocket.accept();

             System.out.println("Client accepted: " + clientSocket);

            setupSocketStream();

            while(true){
                 try{
                    String line = inputBufferedReader.readLine();
                    // quit
                    if(line == null || line.equals("/quit")){
                        System.out.println("Exiting");
                    break;
                    }

                    System.out.println(line);
                // help

                // change name
                } catch (IOException e) {
                System.out.println("Receiving error" + e.getMessage());
                }
            }

          } catch(IOException ioe){
           System.out.println(ioe.getMessage());
          } finally{
           close();
       }
    }

    public static void main(String[] args){
/*         if(args.length == 0){*/
/*             System.out.println("java ChatServer");*/
/*             System.exit(1);*/
/*         }*/

         int portNumber = 8080;

         try{
             new ChatServer(portNumber);
             System.out.println(portNumber);

         } catch (IOException e) {
             System.out.println("Error creating chat "+ e.getMessage());;
         }
    }


    public void setupSocketStream() throws IOException{
        inputBufferedReader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
    }

    public void close(){
        try{
            if(clientSocket != null){
                System.out.println("Closing client connection");
                clientSocket.close();
            }
            if(serverSocket != null){
                System.out.println("Closing server socket");
                serverSocket.close();
            }
        } catch(IOException ex){
            System.out.println("Error closing connection" + ex.getMessage());
        }
    }
}



