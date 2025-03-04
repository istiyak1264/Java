import java.net.*;
import java.io.*;

class Simpleserver
{
    public static void main(String args[])throws IOException
    {
        try
        {
            ServerSocket s = new ServerSocket(1254);
            System.out.println("Server is waiting for a client...");
            
            Socket s1 = s.accept(); 
            System.out.println("Client connected!");
            
            OutputStream s1out = s1.getOutputStream();
            DataOutputStream dos = new DataOutputStream(s1out);
            
            dos.writeUTF("Hi there");
            
            dos.close();
            s1out.close();
            s1.close();
            s.close();
            
            System.out.println("Message sent to client. Server closed.");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}