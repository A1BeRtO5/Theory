package SocketServer;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class MyServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8081);
        Socket input = serverSocket.accept();//сокет який приймає зєднання

        Scanner in = new Scanner(input.getInputStream());
        while (in.hasNext()) {
            System.out.println(in.hasNextLine());
        }
        in.close();
        input.close();
        serverSocket.close();
    }
}
