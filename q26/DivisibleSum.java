// Write a program to do sum of all numbers from 1 to 50 divisible by 3 using multithreading.

package q26;

public class DivisibleSum extends Thread{
    private boolean isDivisible, flag;
    private int range, divisor;
    public long sum;
    
    public DivisibleSum(int range, int divisor){
        this.range = range;
        this.divisor = divisor;
    }
    public synchronized void checkDivisibility(int num){
        if(flag){
            try{
                wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        isDivisible = (num % divisor == 0);
        flag = true;
        notify();
    }
    public synchronized void doSummation(int num){
        if(!flag){
            try{
                wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        if(isDivisible){
            sum += num;
        }
        flag = false;
        notify();
    }

    @Override
    public void run(){
        Thread t1 = new Thread(this, "Divisibility Checker"){
        @Override
        public void run(){
            for(int i=1; i<=range; i++){
                checkDivisibility(i);
                //System.out.println(i+ " : ", isDivisible);
            }
        }
        };
        Thread t2 = new Thread(this, "if-divisible Adder"){
            @Override
            public void run(){
                for(int i=1; i<=range; i++){
                    doSummation(i);
                    //System.out.println(i + ":" + sum);
                }
                System.out.println("Required sum: " + sum);
            }
        };
        t1.start();
        t2.start();
    }

    public static void main(String args[]){
        DivisibleSum obj = new DivisibleSum(50, 3);
        obj.start();
    }
}
