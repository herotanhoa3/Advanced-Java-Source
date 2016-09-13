package Exercise5_4;


/**
 *
 * @author Huynh Tan Hoa
 * @version 1.0
 * @since 13/9/2016
 */
//to run program
public class RunCounterThread {

    //
    public static void main(String[] args) throws InterruptedException {
        
        //create 10 thread
        ThreadCounter[] listCounterThread = new ThreadCounter[10];
		for (int i = 0; i < 10; i++) {
			listCounterThread[i] = new ThreadCounter();
			String s = (i + 1) + "";
			listCounterThread[i].setName(s);
		}
		
        //set start and join for 10 thread
		for (int i = 0; i < 10; i++) {
			
            runThread(listCounterThread[i]);
		}
        
        
    }
    
    //to set start and join thread
    static void runThread(Thread thread) throws InterruptedException{
        thread.start();
        thread.join();
    }
}
