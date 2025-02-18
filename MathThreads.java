import java.lang.Math;

class SinThread extends Thread {
    public double deg;
    public double res;

    public SinThread(int degree) {
        deg = degree;
    }

    public void run() {
        System.out.println("Executing sin of " + deg);
        res = Math.sin(Math.toRadians(deg));
        System.out.println("Exit from SinThread. Res = " + res);
    }
}

class CosThread extends Thread {
    public double deg;
    public double res;

    public CosThread(int degree) {
        deg = degree;
    }

    public void run() {
        System.out.println("Executing cos of " + deg);
        res = Math.cos(Math.toRadians(deg));
        System.out.println("Exit from CosThread. Res = " + res);
    }
}

class TanThread extends Thread {
    public double deg;
    public double res;

    public TanThread(int degree) {
        deg = degree;
    }

    public void run() {
        System.out.println("Executing tan of " + deg);
        res = Math.tan(Math.toRadians(deg));
        System.out.println("Exit from TanThread. Res = " + res);
    }
}

public class MathThreads {
    public static void main(String args[]) {
        SinThread st = new SinThread(45);
        CosThread ct = new CosThread(60);
        TanThread tt = new TanThread(30);

        st.start();
        ct.start();
        tt.start();

        try {
            st.join(); // Wait for completion of SinThread
            ct.join(); // Wait for completion of CosThread
            tt.join(); // Wait for completion of TanThread

            double z = st.res + ct.res + tt.res;
            System.out.println("Sum of sin, cos, tan = " + z);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }
    }
}
