package ClientAndServerCommunication.CommunicationOne;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class EchoClient {
    public static void main(String[] args) throws Exception {

        System.out.println("client Started");

        Socket soc = new Socket("localhost", 3000);

        /*1️⃣ Taking input from keyboard.
            Converting bytes to char by using "InputStreamReader()"
            and then converting individual char into whole string by using "BufferedReader()" */
        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter your msg: ");
        String str = userInput.readLine();      //🔸 "readLine()"method will read line of text from input stream and storing in String reference

        //2️⃣ Creating an object of PrintWriter to send string to the server
        PrintWriter out = new PrintWriter(soc.getOutputStream(), true);     //🔸"true" is for Auto flush
        out.println(str);

        //3️⃣ Now in last reading the data sent by the server and displaying on screen
        BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
        System.out.println(in.readLine());


    }
}
