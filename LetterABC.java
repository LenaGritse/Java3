public class LetterABC {

    private final Object mon = new Object();
    private volatile char letter = 'A';

    public static void main(String[] args) {
        LetterABC abc = new LetterABC();
        Thread t1 = new Thread(() -> {
            abc.printA();
        });
        Thread t2 = new Thread(() -> {
            abc.printB();
        });
        Thread t3 = new Thread(() -> {
            abc.printC();
        });
        t1.start();
        t2.start();
        t3.start();
    }

    public void printA() {
        synchronized (mon) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (letter != 'A') {
                        mon.wait();
                    }
                    System.out.print("A");
                    letter = 'B';
                    mon.notify();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void printB() {
        synchronized (mon) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (letter != 'B') {
                        mon.wait();
                    }
                    System.out.print("B");
                    letter = 'C';
                    mon.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void printC() {
        synchronized (mon) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (letter != 'C') {
                        mon.wait();
                    }
                    System.out.print("C");
                    letter = 'A';
                    mon.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
}
