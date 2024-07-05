class Threading extends Thread {
    private int threadNumber;

    public Threading(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    public void run() {
        System.out.println("Thread " + threadNumber + " is running.");
    }

    public static void main(String[] args) {
        Threading thread1 = new Threading(1);
        Threading thread2 = new Threading(2);


        thread1.start();


        thread2.start();
    }
}
