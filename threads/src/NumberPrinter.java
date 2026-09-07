class NumberPrinter implements Runnable {

    private boolean printEven;

    public NumberPrinter(boolean printEven) {
        this.printEven = printEven;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {

            if (printEven && i % 2 == 0) {
                System.out.println(Thread.currentThread().getName()
                        + ": " + i);
            }

            if (!printEven && i % 2 != 0) {
                System.out.println(Thread.currentThread().getName()
                        + ": " + i);
            }
        }
    }

    public static void main(String[] args) {

        NumberPrinter evenPrinter = new NumberPrinter(true);
        NumberPrinter oddPrinter = new NumberPrinter(false);

        Thread evenThread = new Thread(evenPrinter, "Even Thread");
        Thread oddThread = new Thread(oddPrinter, "Odd Thread");

        evenThread.start();
        oddThread.start();
    }
}