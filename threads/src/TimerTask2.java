class TimerTask2 implements Runnable {

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {
            System.out.println("Tick");

            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.out.println("TimerTask2 was interrupted. Stopping early.");
                break;
            }
        }
    }

    public static void main(String[] args) {

        TimerTask2 task = new TimerTask2();

        Thread thread = new Thread(task, "Timer Thread");

        thread.start();

        try {
            // Wait briefly before interrupting the thread
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        thread.interrupt();
    }
}