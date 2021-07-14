import java.util.Scanner;
import java.util.concurrent.*; 
import osSema.*;
import GraphicPack.*;
class Main {
    public static void main(String[] args) throws InterruptedException {
    	 Shared.myframe.repain(0);
    	 float w, x, y, z;
    	 Scanner myObj = new Scanner(System.in);  
    	 System.out.println("Enter 2 additions and 2 substractions\n");
    	 w=myObj.nextFloat();
    	 x=myObj.nextFloat();
    	 y=myObj.nextFloat();
    	 z=myObj.nextFloat();
    	 Shared.myframe.setVal(w, x, y, z);
         Semaphore sem= new Semaphore(1);
         AddBalance a1= new AddBalance(sem, "Add 1", 1);
         AddBalance a2= new AddBalance(sem, "Add 2", 2);
         DecBalance d1= new DecBalance(sem, "Sub 1", 3);
         DecBalance d2= new DecBalance(sem, "Sub 2", 4);
         a1.setAdd(w);
         a2.setAdd(x);
         d1.setDec(y);
         d2.setDec(z);
         d1.start();
         d2.start();
         a1.start();
         a2.start();
         a1.join();
         a2.join();
         d1.join();
         d2.join();
         ShowBalance bal= new ShowBalance(sem, "balance");
         bal.start();
         bal.join();
     }
}