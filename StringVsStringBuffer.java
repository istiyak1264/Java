public class StringVsStringBuffer
{
    public static void main(String[] args)
    {
        int iterations = 10000;

        // Test String concatenation
        long startTime = System.currentTimeMillis();
        @SuppressWarnings("unused")
        String str = "";
        for (int i = 0; i < iterations; i++)
        {
            str += "a"; // String concatenation using '+'
        }
        long endTime = System.currentTimeMillis();
        long stringTime = endTime - startTime;
        System.out.println("String concatenation time: " + stringTime + " ms");

        // Test StringBuffer concatenation
        startTime = System.currentTimeMillis();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < iterations; i++)
        {
            stringBuffer.append("a"); // StringBuffer concatenation using 'append'
        }
        endTime = System.currentTimeMillis();
        long stringBufferTime = endTime - startTime;
        System.out.println("StringBuffer concatenation time: " + stringBufferTime + " ms");
    }
}
