package ClientAndServerCommunication.CommunicationTwo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class FactorialClient {
    public static void main(String[] args) throws Exception {

        System.out.println("Client Started");

        //1️⃣ Step
        Socket soc = new Socket("localhost", 5000);

        //2️⃣ Step
        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

        //3️⃣ Step
        System.out.print("Enter the number: ");

        //4️⃣ Converting string into integer
        int number = Integer.parseInt(userInput.readLine());

        //5️⃣ Step
        PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
        out.println(number);

        //6️⃣ Step
        BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
        System.out.println(in.readLine());

        soc.close();


    }
}
