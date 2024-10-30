package io.codefroall.UDP;

import java.io.IOException;

public class SandBox {
    public static void main(String[] args) throws IOException {
        String messageReceived;
        boolean running;
        UDP_Messaging myMessageServer = new UDP_Messaging();

        running=true;

        while (running) {
            messageReceived = myMessageServer.Receiving();
            System.out.println(messageReceived);

            myMessageServer.Sending(messageReceived);
            running = messageReceived.equals("Desliga");
            System.out.println(running);
        }

        myMessageServer.CloseUDPSocket();

    }
}
