import java.io.*;

public class FileReadExample
{
    public static void main(String[] args)
    {
        BufferedReader reader = null;
        try
        {
            reader = new BufferedReader(new FileReader("data.txt"));
            String line = reader.readLine();
            System.out.println("File content: " + line);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found!");
        }
        catch (IOException e)
        {
            System.out.println("Error reading file!");
        }
        finally
        {
            try
            {
                if (reader != null)
                    reader.close(); // always close file
            }
            catch (IOException e)
            {
                System.out.println("Error closing file!");
            }
        }
    }
}
