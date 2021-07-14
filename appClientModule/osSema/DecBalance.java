package osSema;
import java.util.concurrent.*; 
public class DecBalance extends Thread{
    Semaphore sem;
    String threadName;
    int threadNum;
    float dec;
    public DecBalance(Semaphore sem, String threadName, int threadNum){
    	super(threadName);
        this.sem=sem;
        this.threadName=threadName;
        this.threadNum=threadNum;
    }
    public void setDec(float dec){
        this.dec=dec;
    }
    public void run(){
        System.out.println("Starting to decrease "+ dec+ "to balance in "+ threadName);
        try
        {
            System.out.println(threadName+" is waiting for permit");
            sem.acquire();
            Shared.myframe.repain(threadNum);
            System.out.println("\n---"+threadName +" got permission to decrease "+ dec+"---");
            
            Shared.balance-=dec;
            
            System.out.println("---"+threadName+" decreased "+ dec+" to balance--\n");
            System.out.println("Current Balance: "+Shared.balance+"\n");
            Thread.sleep(2000);
            
        }
        catch(InterruptedException exc){
            System.out.println(exc);
        }
        System.out.println(threadName+" releases the control");
        sem.release();
    }
}