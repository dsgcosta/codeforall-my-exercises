package io.codefroall.UDP;

import java.io.IOException;
import java.net.*;

public class UDP_Messaging {
    // STEP1: Get your host and port
    String hostName; // args[0];
    int foreignPort; //Integer.parseInt(args[1]);
    int localPort = 60000;

    // STEP2: Create send and receive buffers
    byte[] sendBuffer = new byte[1024];
    byte[] recvBuffer = new byte[1024];

    private DatagramSocket socket;
    private DatagramPacket receivePacket;
    private DatagramPacket sendPacket;

    public UDP_Messaging() throws SocketException, UnknownHostException {
        // STEP3: Open a UDP (datagram) socket
        this.socket = new DatagramSocket(localPort);
       }


    public String Receiving() throws IOException {
        // STEP4.1: Create and receive UDP datagram packet from the socket
        this.receivePacket = new DatagramPacket(recvBuffer, recvBuffer.length);

        socket.receive(receivePacket); // blocks while packet not received

        this.foreignPort = receivePacket.getPort();
        this.hostName = receivePacket.getAddress().getHostAddress(); //is wrong , should be use in sending the instruction InetAddress.getByName(hostName)
        return new String(receivePacket.getData()).toUpperCase().substring(0, receivePacket.getLength());
    }


    public void Sending(String messageReceived) throws IOException {
        // STEP4.2: Create and send UDP datagram packet from the socket
        //this.sendPacket = new DatagramPacket(sendBuffer, sendBuffer.length, receivePacket.getAddress(), foreignPort);
        this.sendPacket = new DatagramPacket(sendBuffer, sendBuffer.length, InetAddress.getByName(hostName), foreignPort);

        socket.send(sendPacket);

        sendBuffer = messageReceived.getBytes();

        sendPacket.setData(sendBuffer, 0, sendBuffer.length); //messageReceived.length()
        socket.send(sendPacket); //send UDP datagram packet from the socket
    }

    public void CloseUDPSocket() {
        socket.close(); // STEP5: Close the socket
    }
}
