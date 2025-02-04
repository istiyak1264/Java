import java.util.Scanner;
class arrar2
{
    public static void main(String[] args)
    {
        int arr[][] = new int[3][3];
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[i].length; j++)
            {
                arr[i][j] = input.nextInt();
            }
        }
        input.close();
        System.out.print("\n");

        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[i].length; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
