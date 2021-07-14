package osSema;
import java.util.concurrent.Semaphore;
public class AddBalance extends Thread{
    Semaphore sem;
    String threadName;
    int threadNum;
    float add;
    public AddBalance(Semaphore sem, String threadName, int threadNum){
        super(threadName);
        this.sem=sem;
        this.threadName=threadName;
        this.threadNum=threadNum;
    }
    public void setAdd(float add)
    {
        this.add=add;
    }
    public void run(){
        System.out.println("Starting to add "+ add+ "to balance in "+ threadName);
        try
        {
            System.out.println(threadName+" is waiting for permit");
            
            sem.acquire();
            Shared.myframe.repain(threadNum);
            System.out.println("\n---"+threadName +" got permission to add "+ add+"---");
            
            Shared.balance+=add;
            
            System.out.println("---"+threadName +" added "+ add+" to balance---\n");
            System.out.println("Current Balance: "+Shared.balance+"\n");
            Thread.sleep(2000);
        }
        catch(InterruptedException exc){
            System.out.println(exc);
        }
        System.out.println(threadName+" releases the control\n");
        sem.release();
    }
}