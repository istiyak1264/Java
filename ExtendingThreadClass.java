import java.lang.Thread;
class MyThread extends Thread
{
    public void run()
    {
        System.out.println("The thread is running......");
    }
}

public class ExtendingThreadClass
{
    public static void main(String[] args)
    {
        MyThread thr1 = new MyThread();
        thr1.start();
    }
}