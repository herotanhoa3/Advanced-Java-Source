package Exercise5_3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Huynh Tan Hoa
 * @version 1.0
 * @since 13/9/2016
 */
public class MaxOfArrayThread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Input n: ");
        int n = input.nextInt();
        int arr[] = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(100);
        }
        System.out.println("Input num of Threads: ");
        int numThreads = input.nextInt();

        int max = max(arr, numThreads);
        String strArr = "";
        for (int value : arr) {
            strArr += value + " ";
        }
        System.out.println("Array: " + strArr);
        System.out.println("Max: " + max);
    }

    //Sum of arr
    public static int max(int[] arr, int numThreads) throws InterruptedException {
        int len = arr.length;
        int max = 0;
        //create and start numThreads
        MaxThread[] ts = new MaxThread[numThreads];
        for (int i = 0; i < numThreads; i++) {
            ts[i] = new MaxThread((i * len) / numThreads, ((i + 1) * len / numThreads), arr);
            ts[i].start();
        }
        //Wait for the threads to finish and sum their result
        for (int i = 0; i < numThreads; i++) {
            ts[i].join();
            max = ts[i].getMax();
        }
        return max;
    }
}