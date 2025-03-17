public class StringVsStringBuffer
{
    public static void main(String[] args)
    {
        int iterations = 10000;

        // Test String concatenation
        long startTime = System.nanoTime();
        @SuppressWarnings("unused")
        String str = "";
        for (int i = 0; i < iterations; i++) {
            str += "a"; // String concatenation using '+'
        }
        long endTime = System.nanoTime();
        long stringTime = endTime - startTime;
        System.out.println("String concatenation time: " + stringTime + " ns");

        // Test StringBuffer concatenation
        startTime = System.nanoTime();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            stringBuffer.append("a"); // StringBuffer concatenation using 'append'
        }
        endTime = System.nanoTime();
        long stringBufferTime = endTime - startTime;
        System.out.println("StringBuffer concatenation time: " + stringBufferTime + " ns");
    }
}
