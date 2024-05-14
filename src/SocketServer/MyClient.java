package SocketServer;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

import static java.lang.Thread.sleep;

public class MyClient {
//    socket - це просто кінцева точка для звязку між машинами.
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 8081);//localhost

        PrintWriter out = new PrintWriter(socket.getOutputStream());
        out.println("Hello ");
        out.println("world ");
        out.close();
        socket.close();
    }
}
