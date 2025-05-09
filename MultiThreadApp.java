import java.util.Random;

class RandomThread extends Thread
{
    public void run()
    {
        Random rand = new Random();
        while (true)
        {
            int num = rand.nextInt(100);
            System.out.println("Generated number: " + num);
            SquareThread st = new SquareThread(num);
            CubeThread ct = new CubeThread(num);
            if (num % 2 == 0) {
                st.start();
            } else {
                ct.start();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class SquareThread extends Thread {
    int num;

    SquareThread(int num) {
        this.num = num;
    }

    public void run() {
        System.out.println("Square: " + (num * num));
    }
}

class CubeThread extends Thread {
    int num;

    CubeThread(int num) {
        this.num = num;
    }

    public void run() {
        System.out.println("Cube: " + (num * num * num));
    }
}

public class MultiThreadApp {
    public static void main(String[] args) {
        RandomThread rt = new RandomThread();
        rt.start();
    }
}
