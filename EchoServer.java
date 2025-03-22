import java.net.*;
import java.io.*;

public class EchoServer
{
    public static void main(String[] args)
    {
        try
        {
            System.out.println("Waiting for clients....");
            ServerSocket ss = new ServerSocket(1234);
            Socket s = ss.accept();
            System.out.println("Connection Established...");

            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
            PrintWriter out = new PrintWriter(s.getOutputStream(), true);

            String line = in.readLine();
            while (line != null)
            {
                System.out.println("Client: " + line);
                out.println("Echo: " + line);
            }

            in.close();
            out.close();
            s.close();
            ss.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
