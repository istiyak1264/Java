import java.net.*;
import java.io.*;
import java.util.Scanner;

public class UDPClient
{
    public static void main(String args[])
    {
        DatagramSocket aSocket = null;
        Scanner scanner = new Scanner(System.in);
        try
        {
            String serverAddress = "localhost";
            int serverPort = 1484;
            aSocket = new DatagramSocket();
            byte[] buffer;

            while (true)
            {
                System.out.print("Enter message to send to server: ");
                String message = scanner.nextLine();

                buffer = message.getBytes();
                InetAddress serverHost = InetAddress.getByName(serverAddress);
                DatagramPacket request = new DatagramPacket(buffer, buffer.length, serverHost, serverPort);
                aSocket.send(request);

                if (message.equalsIgnoreCase("exit"))
                {
                    System.out.println("Exiting chat...");
                    break;
                }

                DatagramPacket reply = new DatagramPacket(new byte[1000], 1000);
                aSocket.receive(reply);

                String replyMessage = new String(reply.getData(), 0, reply.getLength());
                System.out.println("Reply from Server: " + replyMessage);
            }
        }
        catch (SocketException e)
        {
            System.out.println("Socket: " + e.getMessage());
        }
        catch (IOException e)
        {
            System.out.println("IO: " + e.getMessage());
        }
        finally
        {
            if (aSocket != null)
                aSocket.close();
            scanner.close();
        }
    }
}
