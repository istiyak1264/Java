class arrayExample
{
    void OneDimensionalArray()
    {
        int ages[] = new int[3];
        float weights[] = new float[3];
        String names[] = new String[3];
        ages[0] = 23;
        ages[1] = 19;
        ages[2] = 25;

        weights[0] = 56.5f;
        weights[1] = 75.8f;
        weights[2] = 61.3f;

        names[0] = "Keramot Ali";
        names[1] = "Koushik Ghosh";
        names[2] = "Hekmot Ali";
        System.out.println("Name: " + names[0] + "   Age: " + ages[0] + "   Weight: " + weights[0]);
        System.out.println("Name: " + names[1] + "   Age: " + ages[1] + "   Weight: " + weights[1]);
        System.out.println("Name: " + names[2] + "   Age: " + ages[2] + "   Weight: " + weights[2]);
    }

    void MultiDimensionalArray()
    {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("\n");
        }
    }
}
public class array1
{
    public static void main(String[] args)
    {
        arrayExample obj1 = new arrayExample();
        obj1.OneDimensionalArray();
        obj1.MultiDimensionalArray();
    }
}
