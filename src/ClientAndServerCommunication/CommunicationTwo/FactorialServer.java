package ClientAndServerCommunication.CommunicationTwo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class FactorialServer {

    //🔸Function which will calculate factorial
    static int calculateFactorial(int number)
    {
        int fact = 1;
        for (int i = 1; i <= number; i++){
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) throws Exception {

        System.out.println("Waiting for client...");

        //1️⃣ Step
        ServerSocket ss = new ServerSocket(5000);
        Socket soc = ss.accept();

        //2️⃣ Step
        BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
        int number = Integer.parseInt(in.readLine());

        //3️⃣ Step
        PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
        out.println("Factorial of " + number + " is " + calculateFactorial(number));

        soc.close();


    }
}


