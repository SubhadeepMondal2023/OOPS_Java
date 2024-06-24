//There are two ways to create a thread:
// By extending Thread class
// By implementing Runnable interface.

// Thread class provide constructors and methods to create and perform operations on a thread.Thread class extends Object class and implements Runnable interface.

//  Commonly used Constructors of Thread class:
// Thread()
// Thread(String name)
// Thread(Runnable r)
// Thread(Runnable r,String name)

// The Runnable interface should be implemented by any class whose instances are intended to be executed by a thread. Runnable interface have only one method named run().

// public void run(): is used to perform action for a thread.

// Q. Write two threads A and B which will run parallely using thread and runnable.

package q21;

class MultiThreading implements Runnable{
    private Thread t;
    private String threadName;

    public MultiThreading(String name){
        threadName = name;
        System.out.println("Creating Thread..." + threadName);
    }

    public void run(){
        System.out.println("running thread..." + threadName);
        try{
            for(int i=4; i>0; i--){
                System.out.println(threadName + i);
                Thread.sleep(50);
            }
        }
        catch(InterruptedException e){
            System.out.println("Thread" + threadName + "interrupted");
        }
        finally{
            System.out.println("Exiting thread " + threadName);
        }
    }

    public void start(){
        System.out.println("Starting thread " + threadName);
        t = new Thread(this, threadName);
        t.start();
    }
}
public class Main {
    public static void main(String[] args) {
        MultiThreading t1 = new MultiThreading("A");
        t1.start();
        MultiThreading t2 = new MultiThreading("B");
        t2.start();
    }
}
