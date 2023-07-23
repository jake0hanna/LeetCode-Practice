import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Foo 
{//1114
  private final ReentrantLock lock = new ReentrantLock();
  private final Condition condition = lock.newCondition();
  private int order = 1;

  public void first(Runnable printFirst) {
    lock.lock(); //Lock and attempt to resolve
    try {
      while (order != 1) { //If not in the correct order await
        condition.await(); //This releases the lock and awaits a singal from the condition
      }
      printFirst.run();
      order = 2;
      condition.signalAll(); // This signals
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
    } finally {
      lock.unlock(); //Unlocks without awaiting
    }
  }

  public void second(Runnable printSecond) {
    lock.lock();
    try {
      while (order != 2) {
        condition.await();
      }
      printSecond.run();
      order = 3;
      condition.signalAll();
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
    } finally {
      lock.unlock();
    }
  }

  public void third(Runnable printThird) {
    lock.lock();
    try {
      while (order != 3) {
        condition.await();
      }
      printThird.run();
      order = 1;
      condition.signalAll();
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
    } finally {
      lock.unlock();
    }
  }
}
