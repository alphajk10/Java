class CountdownThread extends Thread {

    public CountdownThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 5; i >= 1; i--) {
            System.out.println(getName() + " - Countdown: " + i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(getName() + " was interrupted.");
            }
        }
    }

    public static void main(String[] args) {
        CountdownThread thread1 = new CountdownThread("Thread-A");
        CountdownThread thread2 = new CountdownThread("Thread-B");

        thread1.start();
        thread2.start();
    }
}