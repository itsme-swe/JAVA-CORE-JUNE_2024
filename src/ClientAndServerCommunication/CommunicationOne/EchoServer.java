package ClientAndServerCommunication.CommunicationOne;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
    public static void main(String[] args) {

        System.out.println("Waiting for client...");

        try {
            //1️⃣ Binding ServerSocket with the port number 3000
            ServerSocket ss = new ServerSocket(3000);
            Socket soc = ss.accept();
            System.out.println("Connection Established");

            //2️⃣ Reading the string sent by the client so reading string from client Socket using getInputStream()
            BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));

            String str = in.readLine();

            //3️⃣ Sending string back to the client
            PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
            out.println("Server says " + str);

        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
