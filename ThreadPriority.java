class PriorityThread extends Thread {
    public PriorityThread(String name) {
        super(name);
    }

    public void run() {
        System.out.println(getName() + " started with priority: " + getPriority());
    }
}

public class ThreadPriority {
    public static void main(String[] args) {
        PriorityThread t1 = new PriorityThread("LowPriorityThread");
        PriorityThread t2 = new PriorityThread("NormalPriorityThread");
        PriorityThread t3 = new PriorityThread("HighPriorityThread");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}
