import java.net.*;
import java.io.*;
import java.util.Scanner;

public class UDPServer
{
    public static void main(String args[])
    {
        DatagramSocket aSocket = null;
        Scanner scanner = new Scanner(System.in);
        try
        {
            int serverPort = 1484;
            aSocket = new DatagramSocket(serverPort);
            byte[] buffer = new byte[1000];

            System.out.println("Server is running... Waiting for client messages.");

            while (true)
            {
                DatagramPacket request = new DatagramPacket(buffer, buffer.length);
                aSocket.receive(request);
                String clientMessage = new String(request.getData(), 0, request.getLength());
                System.out.println("Message from client: " + clientMessage);

                if (clientMessage.equalsIgnoreCase("exit"))
                {
                    System.out.println("Exiting chat...");
                    break;
                }

                System.out.print("Enter your reply to send to client: ");
                String serverReply = scanner.nextLine();

                InetAddress clientAddress = request.getAddress();
                int clientPort = request.getPort();
                byte[] replyBuffer = serverReply.getBytes();
                DatagramPacket reply = new DatagramPacket(replyBuffer, replyBuffer.length, clientAddress, clientPort);
                aSocket.send(reply);
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
