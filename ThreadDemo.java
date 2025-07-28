class ThreadExtension extends Thread {
    public ThreadExtension() {
        setName("ThreadExtension");
        setPriority(7);
    }

    public void run() {
        System.out.println("Started: " + getName() + " | Priority: " + getPriority());

        try {
            sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Completed " + getName() + " | Alive? " + isAlive());
    }
}

class RunnableThread implements Runnable {
    public void run() {
        Thread current = Thread.currentThread();
        current.setName("RunnableThread");
        current.setPriority(4);

        System.out.println("Started: " + current.getName() + " | Priority: " + current.getPriority());

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Completed " + current.getName() + " | Alive? " + current.isAlive());
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        ThreadExtension threadExtension = new ThreadExtension();
        threadExtension.start();

        RunnableThread runnableThread = new RunnableThread();
        Thread thread = new Thread(runnableThread);
        thread.start();

        Thread mainThread = Thread.currentThread();
        System.out.println("Main Thread: " + mainThread.getName());
    }
}
