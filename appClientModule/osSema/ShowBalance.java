package osSema;
import java.util.concurrent.Semaphore;
public class ShowBalance extends Thread{
    Semaphore sem;
    public ShowBalance(Semaphore sem, String threadName){
        super(threadName);
        this.sem=sem;
    }
    public void run(){
        try
        {
        	
            System.out.println("Balance is waiting for permit");
            
            sem.acquire();
            Shared.myframe.repain(0);
            System.out.println("Balance is: "+Shared.balance);
            Thread.sleep(2000);
        }catch(InterruptedException exc)
        {
            System.out.println(exc);
        }
        System.out.println("Exiting control from Balance\n");
        sem.release();
    }
    
}