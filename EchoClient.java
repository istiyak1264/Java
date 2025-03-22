import java.net.*;
import java.io.*;

public class EchoClient
{
    public static void main(String[] args)
    {
        try
        {
            System.out.println("Client started...");
            Socket socket = new Socket("localhost", 1234);
            
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            System.out.print("Enter message: ");
            String str = userInput.readLine();
            output.println(str);
            
            System.out.println(input.readLine());

            socket.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
