public class StringPerformanceTest
{
    public static void main(String[] args)
    {
        int iterations = 100000;

        long startTime = System.nanoTime();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            stringBuffer.append("A");
        }
        long endTime = System.nanoTime();
        System.out.println("StringBuffer Time: " + (endTime - startTime) / 100000 + " ns");

        startTime = System.nanoTime();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            stringBuilder.append("A");
        }
        endTime = System.nanoTime();
        System.out.println("StringBuilder Time: " + (endTime - startTime) / 100000 + " ns");
    }
}
