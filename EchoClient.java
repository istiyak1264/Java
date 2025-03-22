import java.net.*;
import java.io.*;

public class EchoClient
{
    public static void main(String[] args)
    {
        try
        {
            System.out.println("Client started...");
            Socket s = new Socket("localhost", 1234);

            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
            PrintWriter out = new PrintWriter(s.getOutputStream(), true);
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

            String line;
            while(true)
            {
                System.out.print("Enter message: ");
                line = userInput.readLine();
                if (line.equalsIgnoreCase("exit")) break;
                out.println(line);
                System.out.println("Server: " + in.readLine());
            }

            in.close();
            out.close();
            userInput.close();
            s.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
