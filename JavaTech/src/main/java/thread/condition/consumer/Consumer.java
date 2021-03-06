package thread.condition.consumer;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class Consumer extends Thread {
    private Lock lock;
    private int timeToProcessWithSeconds = 1;
    private Queue queue;
    private Condition condition;

    public Consumer(Lock lock, Queue queue) {
        this.lock = lock;
        this.queue = queue;
        this.condition = lock.newCondition();
    }

    @Override
    public void run() {
        while (true) {
            try {
                lock.lock();
                while (queue.blank()) {
                    condition.await();
                }
                System.out.println(Thread.currentThread() + " is consuming " + queue.pop());
                condition.signalAll();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
            sleepInterval();
        }
    }

    private void sleepInterval() {
        try {
            Thread.sleep(TimeUnit.SECONDS.toMillis(timeToProcessWithSeconds));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public Lock getLock() {
        return lock;
    }

    public void setLock(Lock lock) {
        this.lock = lock;
    }
}
