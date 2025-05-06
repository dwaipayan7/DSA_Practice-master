package DeadLockExample;

public class DeadLockExample {

    public static void main(String[] args) {
        Pen pen = new Pen();
        Paper paper = new Paper();

        Thread thread1 = new Thread(new Task1(pen, paper), "Thread-1");
        Thread thread2 = new Thread(new Task2(pen, paper), "Thread-2");

        thread1.start();
        thread2.start();
    }
}

class Pen {
    public synchronized void writeWithPenAndPaper(Paper paper) {
        System.out.println(Thread.currentThread().getName() + " acquired lock on Pen");
        try {
            Thread.sleep(100); // Let other thread acquire Paper
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " trying to acquire lock on Paper");
        paper.finishWriting();
    }

    public synchronized void finishWriting() {
        System.out.println(Thread.currentThread().getName() + " finished using Pen");
    }
}

class Paper {
    public synchronized void writeOnPaperWithPen(Pen pen) {
        System.out.println(Thread.currentThread().getName() + " acquired lock on Paper");
        try {
            Thread.sleep(100); // Let other thread acquire Pen
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " trying to acquire lock on Pen");
        pen.finishWriting();
    }

    public synchronized void finishWriting() {
        System.out.println(Thread.currentThread().getName() + " finished using Paper");
    }
}

class Task1 implements Runnable {
    private final Pen pen;
    private final Paper paper;

    public Task1(Pen pen, Paper paper) {
        this.pen = pen;
        this.paper = paper;
    }

    @Override
    public void run() {
        pen.writeWithPenAndPaper(paper);
    }
}

class Task2 implements Runnable {
    private final Pen pen;
    private final Paper paper;

    public Task2(Pen pen, Paper paper) {
        this.pen = pen;
        this.paper = paper;
    }

    @Override
    public void run() {
        paper.writeOnPaperWithPen(pen);
    }
}
