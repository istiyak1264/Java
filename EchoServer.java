import java.net.*;
import java.io.*;

public class EchoServer
{
    public static void main(String[] args)
    {
        try (ServerSocket serverSocket = new ServerSocket(1234))
        {
            System.out.println("Server started. Waiting for client...");

            while (true)
            {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Client connected.");
                
                BufferedReader input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                PrintWriter output = new PrintWriter(clientSocket.getOutputStream(), true);
                
                String receivedMessage = input.readLine();
                System.out.println("Received: " + receivedMessage);
                output.println("Echo: " + receivedMessage);
                
                clientSocket.close();
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
